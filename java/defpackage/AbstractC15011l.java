package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٔٛٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15011l {
    public static Method ad;
    public static Method advert;
    public static Method isVip;
    public static long pro;
    public static Method signatures;
    public static final C15578l yandex = new C15578l(1454869401, false, new C14678l(25));
    public static final C15578l loadAd = new C15578l(-1816479558, false, new C14678l(26));
    public static final C15578l crashlytics = new C15578l(-1014214301, false, new C14678l(29));
    public static final C15578l amazon = new C15578l(253241804, false, new C7277l(0));
    public static final C15578l purchase = new C15578l(692431354, false, new C5407l(11));
    public static final C15578l billing = new C15578l(2132768427, false, new C7277l(1));
    public static final C15578l mopub = new C15578l(-626565432, false, new C7277l(2));
    public static final C15578l admob = new C15578l(-1555927354, false, new C5407l(12));
    public static final C15578l subs = new C15578l(870331985, false, new C7277l(3));
    public static final C15578l isPro = new C15578l(848191022, false, new C7277l(4));
    public static final C15578l firebase = new C15578l(822518568, false, new C5407l(13));
    public static final C15578l smaato = new C15578l(-1592922105, false, new C5407l(14));
    public static final C15578l remoteconfig = new C15578l(286604518, false, new C5407l(15));
    public static final C15578l vip = new C15578l(-2128836155, false, new C5407l(16));
    public static final C15578l metrica = new C15578l(-249309532, false, new C5407l(17));
    public static final C15578l startapp = new C15578l(1295274695, false, new C5407l(18));
    public static final C15578l adcel = new C15578l(759360645, false, new C5407l(19));
    public static final C15578l ads = new C15578l(-1656080028, false, new C5407l(20));
    public static final C15578l subscription = new C15578l(1640559449, false, new C5407l(21));
    public static final C15578l tapsense = new C15578l(809905815, false, new C5407l(10));
    public static final C15578l Signature = new C15578l(-619214701, false, new C14678l(27));
    public static final C15578l license = new C15578l(-1034541518, false, new C14678l(28));

    public static final boolean admob() throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC11880l.premium();
        }
        try {
            if (ad == null) {
                pro = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                ad = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            Method method = ad;
            if (method != null) {
                return ((Boolean) method.invoke(null, Long.valueOf(pro))).booleanValue();
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Exception e) {
            billing("isTagEnabled", e);
            return false;
        }
    }

    public static final void amazon(int i, String str) throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC11880l.startapp(i, firebase(str));
            return;
        }
        String strFirebase = firebase(str);
        try {
            if (isVip == null) {
                isVip = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            Method method = isVip;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(pro), strFirebase, Integer.valueOf(i));
        } catch (Exception e) {
            billing("asyncTraceEnd", e);
        }
    }

    public static void billing(String str, Exception exc) throws Throwable {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = ((InvocationTargetException) exc).getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            }
            C11467l.metrica(cause);
            return;
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static final void crashlytics(InterfaceC4182l interfaceC4182l, C2312l c2312l, ArrayList arrayList) {
        if (interfaceC4182l instanceof InterfaceC4182l) {
            interfaceC4182l.crashlytics(c2312l, arrayList);
        } else {
            arrayList.addAll(interfaceC4182l.yandex(c2312l));
        }
    }

    public static String firebase(String str) {
        String str2 = str.length() <= 127 ? str : null;
        return str2 == null ? str.substring(0, 127) : str2;
    }

    public static final boolean isPro(InterfaceC9671l interfaceC9671l) {
        C1332l c1332lSignature = ((InterfaceC2851l) interfaceC9671l).getF36671l();
        if (c1332lSignature == null) {
            return true;
        }
        LongPointerWrapper longPointerWrapper = c1332lSignature.f3422l;
        if (longPointerWrapper.isReleased()) {
            return false;
        }
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        return realmcJNI.realm_object_is_valid(ptr$cinterop_release);
    }

    public static final void loadAd(int i, String str) throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC11880l.amazon(i, firebase(str));
            return;
        }
        String strFirebase = firebase(str);
        try {
            if (advert == null) {
                advert = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            Method method = advert;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(pro), strFirebase, Integer.valueOf(i));
        } catch (Exception e) {
            billing("asyncTraceBegin", e);
        }
    }

    public static final boolean mopub(InterfaceC4182l interfaceC4182l, C2312l c2312l) {
        if (interfaceC4182l instanceof InterfaceC4182l) {
            return interfaceC4182l.loadAd(c2312l);
        }
        ArrayList arrayList = new ArrayList();
        crashlytics(interfaceC4182l, c2312l, arrayList);
        return arrayList.isEmpty();
    }

    public static ArrayList purchase(String str, List list, InterfaceC0015l interfaceC0015l) {
        C18170l c18170l = new C18170l(6);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            String strMo2021apply = interfaceC0015l.mo2021apply(obj);
            int iMo232l = c18170l.mo232l(str, strMo2021apply, (C6829l) c18170l.f833l);
            if (iMo232l >= 0) {
                C2372l c2372l = new C2372l();
                c2372l.f5132l = obj;
                c2372l.f5131l = strMo2021apply;
                c2372l.f5130l = iMo232l;
                c2372l.f5133l = i;
                arrayList.add(c2372l);
            }
            i++;
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        return arrayList;
    }

    public static final boolean subs(InterfaceC9671l interfaceC9671l) {
        return ((InterfaceC2851l) interfaceC9671l).getF36671l() != null;
    }

    public static final InterfaceC6942l yandex(InterfaceC9671l interfaceC9671l) {
        C1332l c1332lSignature = ((InterfaceC2851l) interfaceC9671l).getF36671l();
        if (c1332lSignature == null) {
            C8339l.smaato("Changes cannot be observed on unmanaged objects.");
            return null;
        }
        InterfaceC7832l interfaceC7832l = c1332lSignature.f3419l;
        long ptr$cinterop_release = ((LongPointerWrapper) interfaceC7832l.mo1845l()).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        if (realmcJNI.realm_is_closed(ptr$cinterop_release)) {
            C8339l.smaato("Changes cannot be observed when the Realm has been closed.");
            return null;
        }
        if (c1332lSignature.isValid()) {
            return interfaceC7832l.mo1843l().mo1733l(c1332lSignature, null);
        }
        C8339l.smaato("Changes cannot be observed on objects that have been deleted from the Realm.");
        return null;
    }
}
