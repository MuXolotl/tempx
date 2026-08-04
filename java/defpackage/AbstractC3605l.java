package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؕۙ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3605l {
    public static final boolean Signature(Throwable th, Function0 function0) {
        List listAsList;
        Object objInvoke;
        Integer num = AbstractC4804l.yandex;
        C7343l c7343l = null;
        if (num == null || num.intValue() >= 19) {
            listAsList = Arrays.asList(th.getSuppressed());
        } else {
            Method method = AbstractC4208l.loadAd;
            listAsList = (method == null || (objInvoke = method.invoke(th, null)) == null) ? C2580l.f5619l : Arrays.asList((Throwable[]) objInvoke);
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listAsList.get(i)) instanceof C7343l) {
                return false;
            }
        }
        try {
            C10097l c10097l = (C10097l) function0.invoke();
            if (c10097l != null) {
                boolean z2 = c10097l.loadAd;
                List list = c10097l.yandex;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C15253l) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                c7343l = new C7343l(c10097l);
            }
        } catch (Throwable th2) {
            c7343l = th2;
        }
        if (c7343l != null) {
            AbstractC11718l.yandex(th, c7343l);
        }
        return z;
    }

    public static final AbstractC15211l adcel(C16017l c16017l, InterfaceC17477l interfaceC17477l, List list) {
        return ads(c16017l, interfaceC17477l.metrica(), list, false);
    }

    public static final AbstractC7444l admob(String str, boolean z) {
        if (!z) {
            return AbstractC7444l.yandex;
        }
        if (str == null) {
            return AbstractC7444l.crashlytics;
        }
        if (str.length() != 0) {
            return AbstractC7444l.crashlytics;
        }
        return new C0950l(0.2d, 1, 2);
    }

    public static AbstractC15211l ads(C16017l c16017l, InterfaceC1925l interfaceC1925l, List list, boolean z) {
        InterfaceC7637l interfaceC7637lLoadAd;
        AbstractC11832l abstractC11832l;
        InterfaceC7637l interfaceC7637lMopub;
        InterfaceC7637l interfaceC7637l;
        InterfaceC7637l interfaceC7637lPro;
        if (c16017l.isEmpty() && list.isEmpty() && !z && interfaceC1925l.pro() != null) {
            return interfaceC1925l.pro().ad();
        }
        InterfaceC15234l interfaceC15234lPro = interfaceC1925l.pro();
        if (interfaceC15234lPro instanceof InterfaceC16902l) {
            interfaceC7637lLoadAd = ((InterfaceC16902l) interfaceC15234lPro).ad().mo1341public();
        } else {
            if (interfaceC15234lPro instanceof InterfaceC17477l) {
                int i = AbstractC3759l.yandex;
                AbstractC3759l.admob(AbstractC11125l.crashlytics(interfaceC15234lPro));
                boolean zIsEmpty = list.isEmpty();
                C14945l c14945l = C14945l.amazon;
                if (zIsEmpty) {
                    InterfaceC17477l interfaceC17477l = (InterfaceC17477l) interfaceC15234lPro;
                    abstractC11832l = interfaceC17477l instanceof AbstractC11832l ? (AbstractC11832l) interfaceC17477l : null;
                    if (abstractC11832l == null || (interfaceC7637lPro = abstractC11832l.pro(c14945l)) == null) {
                        interfaceC7637lLoadAd = interfaceC17477l.mo2890l();
                    } else {
                        interfaceC7637l = interfaceC7637lPro;
                    }
                } else {
                    InterfaceC17477l interfaceC17477l2 = (InterfaceC17477l) interfaceC15234lPro;
                    AbstractC10794l abstractC10794lVip = AbstractC1124l.loadAd.vip(interfaceC1925l, list);
                    abstractC11832l = interfaceC17477l2 instanceof AbstractC11832l ? (AbstractC11832l) interfaceC17477l2 : null;
                    if (abstractC11832l == null || (interfaceC7637lMopub = abstractC11832l.mopub(abstractC10794lVip, c14945l)) == null) {
                        interfaceC7637lLoadAd = interfaceC17477l2.mo2889instanceof(abstractC10794lVip);
                    } else {
                        interfaceC7637l = interfaceC7637lMopub;
                    }
                }
                return tapsense(c16017l, interfaceC1925l, list, z, interfaceC7637l, new C10030l(c16017l, interfaceC1925l, list, z));
            }
            if (interfaceC15234lPro instanceof C9522l) {
                interfaceC7637lLoadAd = C8741l.yandex(4, true, ((C9522l) interfaceC15234lPro).getName().f7384l);
            } else {
                if (!(interfaceC1925l instanceof C11794l)) {
                    C18073l.metrica("Unsupported classifier: ", interfaceC15234lPro, " for constructor: ", interfaceC1925l);
                    return null;
                }
                interfaceC7637lLoadAd = AbstractC7303l.loadAd("member scope for intersection type", ((C11794l) interfaceC1925l).f23607l);
            }
        }
        interfaceC7637l = interfaceC7637lLoadAd;
        return tapsense(c16017l, interfaceC1925l, list, z, interfaceC7637l, new C10030l(c16017l, interfaceC1925l, list, z));
    }

    public static C17253l amazon(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return new C17253l(f, f2, f3, f4);
    }

    public static final float billing(InterfaceC11780l interfaceC11780l, EnumC9931l enumC9931l) {
        return enumC9931l == EnumC9931l.f20223l ? interfaceC11780l.loadAd(enumC9931l) : interfaceC11780l.crashlytics(enumC9931l);
    }

    public static final C17253l crashlytics(float f, float f2, float f3, float f4) {
        return new C17253l(f, f2, f3, f4);
    }

    public static final InterfaceC17242l firebase(InterfaceC17242l interfaceC17242l, InterfaceC11780l interfaceC11780l) {
        return interfaceC17242l.premium(new C0520l(interfaceC11780l, new C1306l(26)));
    }

    public static final C0350l isPro(C7718l c7718l) {
        return new C0350l(c7718l.yandex, c7718l.tapsense);
    }

    public static C17253l loadAd(float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new C17253l(f, f2, f, f2);
    }

    public static final InterfaceC17242l metrica(InterfaceC17242l interfaceC17242l, float f, float f2, float f3, float f4) {
        return interfaceC17242l.premium(new C7082l(f, f2, f3, f4, new C1306l(23)));
    }

    public static final AbstractC7444l mopub(int i, String str, String str2, String str3, List list, boolean z) {
        String strM3347throws;
        if (i >= list.size()) {
            return admob(null, z);
        }
        String str4 = (String) list.get(i);
        if (str4.length() == 0) {
            return admob(str4, z);
        }
        if (str2 == null) {
            strM3347throws = str4;
        } else {
            if (!AbstractC16648l.isVip(str4, str2, false)) {
                return admob(str4, z);
            }
            strM3347throws = AbstractC12024l.m3347throws(str2.length(), str4);
        }
        if (str3 != null) {
            if (!AbstractC16648l.Signature(strM3347throws, str3, false)) {
                return admob(str4, z);
            }
            strM3347throws = AbstractC12024l.m3335package(str3.length(), strM3347throws);
        }
        return new C0950l(((str2 == null || str2.length() == 0) && (str3 == null || str3.length() == 0)) ? 0.8d : 0.9d, new C9139l(str, Collections.singletonList(strM3347throws)), 1);
    }

    public static final float purchase(InterfaceC11780l interfaceC11780l, EnumC9931l enumC9931l) {
        return enumC9931l == EnumC9931l.f20223l ? interfaceC11780l.crashlytics(enumC9931l) : interfaceC11780l.loadAd(enumC9931l);
    }

    public static final InterfaceC17242l remoteconfig(InterfaceC17242l interfaceC17242l, float f, float f2) {
        return interfaceC17242l.premium(new C7082l(f, f2, f, f2, new C1306l(24)));
    }

    public static final InterfaceC17242l smaato(InterfaceC17242l interfaceC17242l, float f) {
        return interfaceC17242l.premium(new C7082l(f, f, f, f, new C1306l(25)));
    }

    public static InterfaceC17242l startapp(InterfaceC17242l interfaceC17242l, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return metrica(interfaceC17242l, f, f2, f3, f4);
    }

    public static final AbstractC14318l subs(AbstractC15211l abstractC15211l, AbstractC15211l abstractC15211l2) {
        return abstractC15211l.equals(abstractC15211l2) ? abstractC15211l : new C0821l(abstractC15211l, abstractC15211l2);
    }

    public static final AbstractC15211l subscription(InterfaceC7637l interfaceC7637l, C16017l c16017l, InterfaceC1925l interfaceC1925l, List list, boolean z) {
        C18076l c18076l = new C18076l(interfaceC1925l, list, z, interfaceC7637l, new C10030l(interfaceC7637l, c16017l, interfaceC1925l, list, z));
        return c16017l.isEmpty() ? c18076l : new C13764l(c18076l, c16017l);
    }

    public static final AbstractC15211l tapsense(C16017l c16017l, InterfaceC1925l interfaceC1925l, List list, boolean z, InterfaceC7637l interfaceC7637l, Function1 function1) {
        C18076l c18076l = new C18076l(interfaceC1925l, list, z, interfaceC7637l, function1);
        return c16017l.isEmpty() ? c18076l : new C13764l(c18076l, c16017l);
    }

    public static InterfaceC17242l vip(InterfaceC17242l interfaceC17242l, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return remoteconfig(interfaceC17242l, f, f2);
    }

    public static final C17253l yandex(float f, float f2) {
        return new C17253l(f, f2, f, f2);
    }
}
