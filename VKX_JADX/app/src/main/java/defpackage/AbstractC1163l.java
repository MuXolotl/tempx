package defpackage;

import android.view.MotionEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘؒٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1163l {
    public static final C15578l yandex = new C15578l(-1554654270, false, new C10721l(13));

    public static final void admob(C9185l c9185l, long j, Function1 function1, boolean z) {
        MotionEvent motionEventYandex = c9185l.yandex();
        if (motionEventYandex == null) {
            C8339l.metrica("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventYandex.getAction();
        if (z) {
            motionEventYandex.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventYandex.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        function1.invoke(motionEventYandex);
        motionEventYandex.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventYandex.setAction(action);
    }

    public static long amazon(Object obj) {
        if (obj instanceof String) {
            return Long.parseLong((String) obj);
        }
        if (obj instanceof Byte) {
            return ((Byte) obj).byteValue();
        }
        if (obj instanceof Short) {
            return ((Short) obj).shortValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        C8339l.metrica("Unsupported value class: ".concat(obj.getClass().getName()));
        return 0L;
    }

    public static final Object billing(C14274l c14274l, boolean z, C14274l c14274l2, Function2 function2) {
        Object c2175l;
        Object objM3881goto;
        try {
            if (function2 instanceof AbstractC12050l) {
                AbstractC9464l.purchase(2, function2);
                c2175l = function2.invoke(c14274l2, c14274l);
            } else {
                c2175l = AbstractC17082l.subs(function2, c14274l2, c14274l);
            }
        } catch (C1049l e) {
            Throwable th = e.f2913l;
            c14274l.m3885new(new C2175l(th, false));
            throw th;
        } catch (Throwable th2) {
            c2175l = new C2175l(th2, false);
        }
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (c2175l == enumC9342l || (objM3881goto = c14274l.m3881goto(c2175l)) == AbstractC7114l.loadAd) {
            return enumC9342l;
        }
        c14274l.mo3795l();
        if (!(objM3881goto instanceof C2175l)) {
            return AbstractC7114l.yandex(objM3881goto);
        }
        if (!z) {
            Throwable th3 = ((C2175l) objM3881goto).yandex;
            if ((th3 instanceof C14749l) && ((C14749l) th3).f28820l == c14274l) {
                if (c2175l instanceof C2175l) {
                    throw ((C2175l) c2175l).yandex;
                }
                return c2175l;
            }
        }
        throw ((C2175l) objM3881goto).yandex;
    }

    public static String crashlytics(String str) {
        if (str.length() < 4 || !C5566l.admob().mopub(str)) {
            return null;
        }
        if (C6647l.subs().mopub(str)) {
            return str;
        }
        return (String) AbstractC6443l.crashlytics.get(str.substring(0, 4));
    }

    public static String loadAd(String str) {
        String strYandex;
        if (str.length() < 3 || (strYandex = AbstractC6443l.yandex(str.substring(0, 3))) == null) {
            return null;
        }
        String str2 = (String) AbstractC6443l.crashlytics.get(strYandex);
        if (str2 != null) {
            return str2;
        }
        if (C6647l.subs().mopub(strYandex)) {
            return strYandex;
        }
        return null;
    }

    public static String mopub(String str) {
        if (str == null) {
            return null;
        }
        char[] cArr = new char[str.length()];
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) != '-') {
                cArr[i] = str.charAt(i2);
                i++;
            }
        }
        return new String(cArr, 0, i);
    }

    public static boolean purchase(String str) {
        if (str.length() < 3 || str.length() != 3) {
            return false;
        }
        C6647l c6647lAdmob = C6647l.admob();
        if (c6647lAdmob.billing == null) {
            synchronized (c6647lAdmob) {
                try {
                    if (c6647lAdmob.billing == null) {
                        c6647lAdmob.billing = C6647l.smaato();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c6647lAdmob.billing.containsKey(str);
    }

    public static String subs(int i, String str) {
        if (str != null && i >= 0) {
            return str.length() > i ? str.substring(0, i) : str;
        }
        return null;
    }

    public static final void yandex(int i, int i2) {
        if (i2 > i) {
            C18262l.adcel(AbstractC12589l.applovin(i2, i, "startIndex (0) and endIndex (", ") are not within the range [0..size(", "))"));
        } else {
            if (i2 >= 0) {
                return;
            }
            C8339l.metrica(AbstractC12589l.appmetrica("startIndex (0) > endIndex (", i2, ')'));
        }
    }
}
