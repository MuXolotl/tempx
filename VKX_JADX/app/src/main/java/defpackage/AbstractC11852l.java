package defpackage;

import android.graphics.Path;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِٕؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11852l {
    public static final C15578l admob;
    public static final C15578l amazon;
    public static final C15578l billing;
    public static final C15578l firebase;
    public static final C15578l isPro;
    public static final C15578l metrica;
    public static final C15578l mopub;
    public static final C15578l purchase;
    public static final C15578l remoteconfig;
    public static final C15578l smaato;
    public static final C15578l subs;
    public static final C15578l vip;
    public static final C15578l yandex = new C15578l(842569838, false, new C0263l(21));
    public static final C15578l loadAd = new C15578l(-1190004643, false, new C0263l(28));
    public static final C15578l crashlytics = new C15578l(-453272926, false, new C0263l(29));

    static {
        new C15578l(1638406765, false, new C5974l(15));
        new C15578l(-574318339, false, new C5974l(16));
        amazon = new C15578l(606875110, false, new C5974l(17));
        purchase = new C15578l(-1787123867, false, new C0263l(22));
        billing = new C15578l(1614656313, false, new C0263l(23));
        mopub = new C15578l(-1324872998, false, new C5974l(18));
        admob = new C15578l(2111907772, false, new C5974l(19));
        subs = new C15578l(441738374, false, new C0263l(24));
        isPro = new C15578l(2016417336, false, new C5974l(20));
        firebase = new C15578l(-1569384022, false, new C5974l(21));
        smaato = new C15578l(-1805027808, false, new C0263l(25));
        remoteconfig = new C15578l(-234620242, false, new C5974l(22));
        vip = new C15578l(1655815421, false, new C0263l(26));
        metrica = new C15578l(1243518790, false, new C0263l(27));
    }

    public static final boolean admob(int i, C12683l c12683l, C6543l c6543l, C8896l c8896l) {
        if (remoteconfig(i, c12683l, c6543l, c8896l)) {
            return true;
        }
        Boolean bool = (Boolean) AbstractC15235l.purchase(c6543l, i, new C12559l(((C15552l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(c6543l)).getFocusOwner()).billing(), c6543l, c8896l, i, c12683l, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void amazon(C6543l c6543l, C17893l c17893l) {
        if (!c6543l.f29454l.f29462l) {
            AbstractC0081l.crashlytics("visitChildren called on an unattached node");
        }
        C17893l c17893l2 = new C17893l(0, new AbstractC14971l[16]);
        AbstractC14971l abstractC14971l = c6543l.f29454l;
        AbstractC14971l abstractC14971l2 = abstractC14971l.f29460l;
        if (abstractC14971l2 == null) {
            AbstractC5573l.yandex(c17893l2, abstractC14971l);
        } else {
            c17893l2.crashlytics(abstractC14971l2);
        }
        while (true) {
            int i = c17893l2.f34846l;
            if (i == 0) {
                return;
            }
            AbstractC14971l abstractC14971lLoadAd = (AbstractC14971l) c17893l2.vip(i - 1);
            if ((abstractC14971lLoadAd.f29457l & 1024) == 0) {
                AbstractC5573l.yandex(c17893l2, abstractC14971lLoadAd);
            } else {
                while (abstractC14971lLoadAd != null) {
                    if ((abstractC14971lLoadAd.f29450l & 1024) != 0) {
                        C17893l c17893l3 = null;
                        while (abstractC14971lLoadAd != null) {
                            if (abstractC14971lLoadAd instanceof C6543l) {
                                C6543l c6543l2 = (C6543l) abstractC14971lLoadAd;
                                if (c6543l2.f29462l && !AbstractC5573l.metrica(c6543l2).f7684l) {
                                    if (c6543l2.m2024l().yandex) {
                                        c17893l.crashlytics(c6543l2);
                                    } else {
                                        amazon(c6543l2, c17893l);
                                    }
                                }
                            } else if ((abstractC14971lLoadAd.f29450l & 1024) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                int i2 = 0;
                                for (AbstractC14971l abstractC14971l3 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l3 != null; abstractC14971l3 = abstractC14971l3.f29460l) {
                                    if ((abstractC14971l3.f29450l & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            abstractC14971lLoadAd = abstractC14971l3;
                                        } else {
                                            if (c17893l3 == null) {
                                                c17893l3 = new C17893l(0, new AbstractC14971l[16]);
                                            }
                                            if (abstractC14971lLoadAd != null) {
                                                c17893l3.crashlytics(abstractC14971lLoadAd);
                                                abstractC14971lLoadAd = null;
                                            }
                                            c17893l3.crashlytics(abstractC14971l3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l3);
                        }
                        break;
                    }
                    abstractC14971lLoadAd = abstractC14971lLoadAd.f29460l;
                }
            }
        }
    }

    public static final C6543l billing(C17893l c17893l, C8896l c8896l, int i) {
        C8896l c8896lRemoteconfig;
        C6543l c6543l = null;
        if (i == 3) {
            c8896lRemoteconfig = c8896l.remoteconfig((c8896l.crashlytics - c8896l.yandex) + 1.0f, 0.0f);
        } else if (i == 4) {
            c8896lRemoteconfig = c8896l.remoteconfig(-((c8896l.crashlytics - c8896l.yandex) + 1.0f), 0.0f);
        } else if (i == 5) {
            c8896lRemoteconfig = c8896l.remoteconfig(0.0f, (c8896l.amazon - c8896l.loadAd) + 1.0f);
        } else {
            if (i != 6) {
                C8339l.smaato("This function should only be used for 2-D focus search");
                return null;
            }
            c8896lRemoteconfig = c8896l.remoteconfig(0.0f, -((c8896l.amazon - c8896l.loadAd) + 1.0f));
        }
        Object[] objArr = c17893l.f34848l;
        int i2 = c17893l.f34846l;
        for (int i3 = 0; i3 < i2; i3++) {
            C6543l c6543l2 = (C6543l) objArr[i3];
            if (AbstractC11156l.purchase(c6543l2)) {
                C8896l c8896lCrashlytics = AbstractC11156l.crashlytics(c6543l2);
                if (isPro(c8896lCrashlytics, c8896lRemoteconfig, c8896l, i)) {
                    c6543l = c6543l2;
                    c8896lRemoteconfig = c8896lCrashlytics;
                }
            }
        }
        return c6543l;
    }

    public static final Object crashlytics(InterfaceC8605l interfaceC8605l, Function0 function0, AbstractC0283l abstractC0283l) {
        Object obj;
        C18289l c18289l;
        if (!((AbstractC14971l) interfaceC8605l).f29454l.f29462l) {
            return Unit.INSTANCE;
        }
        AbstractC14971l abstractC14971l = (AbstractC14971l) interfaceC8605l;
        if (!abstractC14971l.f29454l.f29462l) {
            AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
        }
        AbstractC14971l abstractC14971l2 = abstractC14971l.f29454l.f29456l;
        C3654l c3654lMetrica = AbstractC5573l.metrica(interfaceC8605l);
        loop0: while (true) {
            obj = null;
            if (c3654lMetrica == null) {
                break;
            }
            if ((((AbstractC14971l) c3654lMetrica.f7703l.mopub).f29457l & 524288) != 0) {
                while (abstractC14971l2 != null) {
                    if ((abstractC14971l2.f29450l & 524288) != 0) {
                        AbstractC14971l abstractC14971lLoadAd = abstractC14971l2;
                        C17893l c17893l = null;
                        while (abstractC14971lLoadAd != null) {
                            if (abstractC14971lLoadAd instanceof InterfaceC16537l) {
                                obj = abstractC14971lLoadAd;
                                break loop0;
                            }
                            if ((abstractC14971lLoadAd.f29450l & 524288) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                int i = 0;
                                for (AbstractC14971l abstractC14971l3 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l3 != null; abstractC14971l3 = abstractC14971l3.f29460l) {
                                    if ((abstractC14971l3.f29450l & 524288) != 0) {
                                        i++;
                                        if (i == 1) {
                                            abstractC14971lLoadAd = abstractC14971l3;
                                        } else {
                                            if (c17893l == null) {
                                                c17893l = new C17893l(0, new AbstractC14971l[16]);
                                            }
                                            if (abstractC14971lLoadAd != null) {
                                                c17893l.crashlytics(abstractC14971lLoadAd);
                                                abstractC14971lLoadAd = null;
                                            }
                                            c17893l.crashlytics(abstractC14971l3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l);
                        }
                    }
                    abstractC14971l2 = abstractC14971l2.f29456l;
                }
            }
            c3654lMetrica = c3654lMetrica.license();
            abstractC14971l2 = (c3654lMetrica == null || (c18289l = c3654lMetrica.f7703l) == null) ? null : (C13924l) c18289l.billing;
        }
        InterfaceC16537l interfaceC16537l = (InterfaceC16537l) obj;
        if (interfaceC16537l == null) {
            return Unit.INSTANCE;
        }
        AbstractC18026l abstractC18026lVip = AbstractC5573l.vip(interfaceC8605l);
        Object objMo857extends = interfaceC16537l.mo857extends(abstractC18026lVip, new C4307l(function0, abstractC18026lVip, 2), abstractC0283l);
        return objMo857extends == EnumC9342l.f19165l ? objMo857extends : Unit.INSTANCE;
    }

    public static final boolean firebase(int i, C8896l c8896l, C8896l c8896l2) {
        if (i == 3) {
            float f = c8896l2.crashlytics;
            float f2 = c8896l2.yandex;
            float f3 = c8896l.crashlytics;
            return (f > f3 || f2 >= f3) && f2 > c8896l.yandex;
        }
        if (i == 4) {
            float f4 = c8896l2.yandex;
            float f5 = c8896l2.crashlytics;
            float f6 = c8896l.yandex;
            return (f4 < f6 || f5 <= f6) && f5 < c8896l.crashlytics;
        }
        if (i == 5) {
            float f7 = c8896l2.amazon;
            float f8 = c8896l2.loadAd;
            float f9 = c8896l.amazon;
            return (f7 > f9 || f8 >= f9) && f8 > c8896l.loadAd;
        }
        if (i != 6) {
            C8339l.smaato("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = c8896l2.loadAd;
        float f11 = c8896l2.amazon;
        float f12 = c8896l.loadAd;
        return (f10 < f12 || f11 <= f12) && f11 < c8896l.amazon;
    }

    public static final boolean isPro(C8896l c8896l, C8896l c8896l2, C8896l c8896l3, int i) {
        if (!firebase(i, c8896l, c8896l3)) {
            return false;
        }
        if (firebase(i, c8896l2, c8896l3) && !yandex(c8896l3, c8896l, c8896l2, i)) {
            return !yandex(c8896l3, c8896l2, c8896l, i) && smaato(i, c8896l3, c8896l) < smaato(i, c8896l3, c8896l2);
        }
        return true;
    }

    public static final boolean loadAd(int i, C8896l c8896l, C8896l c8896l2) {
        if (i == 3 || i == 4) {
            return c8896l.amazon > c8896l2.loadAd && c8896l.loadAd < c8896l2.amazon;
        }
        if (i == 5 || i == 6) {
            return c8896l.crashlytics > c8896l2.yandex && c8896l.yandex < c8896l2.crashlytics;
        }
        C8339l.smaato("This function should only be used for 2-D focus search");
        return false;
    }

    public static final Boolean metrica(int i, C12683l c12683l, C6543l c6543l, C8896l c8896l) {
        int iOrdinal = c6543l.m2028l().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C6543l c6543lAmazon = AbstractC11156l.amazon(c6543l);
                if (c6543lAmazon == null) {
                    C8339l.smaato("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = c6543lAmazon.m2028l().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolMetrica = metrica(i, c12683l, c6543lAmazon, c8896l);
                        if (!AbstractC8576l.yandex(boolMetrica, Boolean.FALSE)) {
                            return boolMetrica;
                        }
                        if (c8896l == null) {
                            if (c6543lAmazon.m2028l() != EnumC11822l.f23650l) {
                                C8339l.smaato("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            C6543l c6543lLoadAd = AbstractC11156l.loadAd(c6543lAmazon);
                            if (c6543lLoadAd == null) {
                                C8339l.smaato("ActiveParent must have a focusedChild");
                                return null;
                            }
                            c8896l = AbstractC11156l.crashlytics(c6543lLoadAd);
                        }
                        return Boolean.valueOf(admob(i, c12683l, c6543l, c8896l));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            C18725l.billing();
                            return null;
                        }
                        C8339l.smaato("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (c8896l == null) {
                    c8896l = AbstractC11156l.crashlytics(c6543lAmazon);
                }
                return Boolean.valueOf(admob(i, c12683l, c6543l, c8896l));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C18725l.billing();
                    return null;
                }
                if (c6543l.m2024l().yandex) {
                    return (Boolean) c12683l.invoke(c6543l);
                }
                return c8896l == null ? Boolean.valueOf(mopub(c6543l, i, c12683l)) : Boolean.valueOf(remoteconfig(i, c12683l, c6543l, c8896l));
            }
        }
        return Boolean.valueOf(mopub(c6543l, i, c12683l));
    }

    public static final boolean mopub(C6543l c6543l, int i, Function1 function1) {
        C8896l c8896l;
        C17893l c17893l = new C17893l(0, new C6543l[16]);
        amazon(c6543l, c17893l);
        int i2 = c17893l.f34846l;
        if (i2 <= 1) {
            C6543l c6543l2 = (C6543l) (i2 == 0 ? null : c17893l.f34848l[0]);
            if (c6543l2 != null) {
                return ((Boolean) function1.invoke(c6543l2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                C8896l c8896lCrashlytics = AbstractC11156l.crashlytics(c6543l);
                float f = c8896lCrashlytics.yandex;
                float f2 = c8896lCrashlytics.loadAd;
                c8896l = new C8896l(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    C8339l.smaato("This function should only be used for 2-D focus search");
                    return false;
                }
                C8896l c8896lCrashlytics2 = AbstractC11156l.crashlytics(c6543l);
                float f3 = c8896lCrashlytics2.crashlytics;
                float f4 = c8896lCrashlytics2.amazon;
                c8896l = new C8896l(f3, f4, f3, f4);
            }
            C6543l c6543lBilling = billing(c17893l, c8896l, i);
            if (c6543lBilling != null) {
                return ((Boolean) function1.invoke(c6543lBilling)).booleanValue();
            }
        }
        return false;
    }

    public static final void purchase(C9902l c9902l, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dSin) + (d * dCos)) / d10;
        double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
        double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            purchase(c9902l, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d21);
        double d22 = d16 * dSqrt2;
        double d23 = dSqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
        double dAtan3 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * dCos) - (d25 * dSin);
        double d27 = (d25 * dCos) + (d24 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d28 = -d10;
        double d29 = d28 * dCos2;
        double d30 = d6 * dSin2;
        double d31 = (d29 * dSin3) - (d30 * dCos3);
        double d32 = d28 * dSin2;
        double d33 = d6 * dCos2;
        double d34 = (dCos3 * d33) + (dSin3 * d32);
        double d35 = dAtan3 / ((double) iCeil);
        double d36 = dAtan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < iCeil) {
            double d40 = d36 + d35;
            double dSin4 = Math.sin(d40);
            double dCos4 = Math.cos(d40);
            int i2 = iCeil;
            double d41 = (((d10 * dCos2) * dCos4) + d26) - (d30 * dSin4);
            double d42 = (d33 * dSin4) + (d10 * dSin2 * dCos4) + d27;
            double d43 = (d29 * dSin4) - (d30 * dCos4);
            double d44 = (dCos4 * d33) + (dSin4 * d32);
            double d45 = d40 - d36;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            c9902l.crashlytics((float) ((d37 * dSqrt3) + d), (float) ((d38 * dSqrt3) + d39), (float) (d41 - (dSqrt3 * d43)), (float) (d42 - (dSqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            d = d41;
            i++;
            d32 = d32;
            dSin2 = dSin2;
            d26 = d26;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            iCeil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    public static final boolean remoteconfig(int i, C12683l c12683l, C6543l c6543l, C8896l c8896l) {
        C6543l c6543lBilling;
        C17893l c17893l = new C17893l(0, new C6543l[16]);
        if (!c6543l.f29454l.f29462l) {
            AbstractC0081l.crashlytics("visitChildren called on an unattached node");
        }
        C17893l c17893l2 = new C17893l(0, new AbstractC14971l[16]);
        AbstractC14971l abstractC14971l = c6543l.f29454l;
        AbstractC14971l abstractC14971l2 = abstractC14971l.f29460l;
        if (abstractC14971l2 == null) {
            AbstractC5573l.yandex(c17893l2, abstractC14971l);
        } else {
            c17893l2.crashlytics(abstractC14971l2);
        }
        while (true) {
            int i2 = c17893l2.f34846l;
            if (i2 == 0) {
                break;
            }
            AbstractC14971l abstractC14971lLoadAd = (AbstractC14971l) c17893l2.vip(i2 - 1);
            if ((abstractC14971lLoadAd.f29457l & 1024) == 0) {
                AbstractC5573l.yandex(c17893l2, abstractC14971lLoadAd);
            } else {
                while (abstractC14971lLoadAd != null) {
                    if ((abstractC14971lLoadAd.f29450l & 1024) != 0) {
                        C17893l c17893l3 = null;
                        while (abstractC14971lLoadAd != null) {
                            if (abstractC14971lLoadAd instanceof C6543l) {
                                C6543l c6543l2 = (C6543l) abstractC14971lLoadAd;
                                if (c6543l2.f29462l) {
                                    c17893l.crashlytics(c6543l2);
                                }
                            } else if ((abstractC14971lLoadAd.f29450l & 1024) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                int i3 = 0;
                                for (AbstractC14971l abstractC14971l3 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l3 != null; abstractC14971l3 = abstractC14971l3.f29460l) {
                                    if ((abstractC14971l3.f29450l & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            abstractC14971lLoadAd = abstractC14971l3;
                                        } else {
                                            if (c17893l3 == null) {
                                                c17893l3 = new C17893l(0, new AbstractC14971l[16]);
                                            }
                                            if (abstractC14971lLoadAd != null) {
                                                c17893l3.crashlytics(abstractC14971lLoadAd);
                                                abstractC14971lLoadAd = null;
                                            }
                                            c17893l3.crashlytics(abstractC14971l3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l3);
                        }
                        break;
                    }
                    abstractC14971lLoadAd = abstractC14971lLoadAd.f29460l;
                }
            }
        }
        while (c17893l.f34846l != 0 && (c6543lBilling = billing(c17893l, c8896l, i)) != null) {
            if (c6543lBilling.m2024l().yandex) {
                return ((Boolean) c12683l.invoke(c6543lBilling)).booleanValue();
            }
            if (admob(i, c12683l, c6543lBilling, c8896l)) {
                return true;
            }
            c17893l.remoteconfig(c6543lBilling);
        }
        return false;
    }

    public static final long smaato(int i, C8896l c8896l, C8896l c8896l2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = c8896l.yandex;
            f2 = c8896l2.crashlytics;
        } else if (i == 4) {
            f = c8896l2.yandex;
            f2 = c8896l.crashlytics;
        } else if (i == 5) {
            f = c8896l.loadAd;
            f2 = c8896l2.amazon;
        } else {
            if (i != 6) {
                C8339l.smaato("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = c8896l2.loadAd;
            f2 = c8896l.amazon;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = c8896l.loadAd;
            f3 = ((c8896l.amazon - f7) / 2.0f) + f7;
            f4 = c8896l2.loadAd;
            f5 = c8896l2.amazon;
        } else {
            if (i != 5 && i != 6) {
                C8339l.smaato("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = c8896l.yandex;
            f3 = ((c8896l.crashlytics - f8) / 2.0f) + f8;
            f4 = c8896l2.yandex;
            f5 = c8896l2.crashlytics;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    public static C13478l subs(SSLSession sSLSession) throws IOException {
        List listFirebase;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            C8339l.smaato("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            C18262l.metrica("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        C5628l c5628lM4315l = C5628l.loadAd.m4315l(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            C8339l.smaato("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            C18262l.metrica("tlsVersion == NONE");
            return null;
        }
        EnumC18016l enumC18016lYandex = AbstractC14905l.yandex(protocol);
        try {
            listFirebase = AbstractC11432l.firebase(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            listFirebase = C2580l.f5619l;
        }
        return new C13478l(enumC18016lYandex, c5628lM4315l, AbstractC11432l.firebase(sSLSession.getLocalCertificates()), new C13627l(1, listFirebase));
    }

    public static final void vip(List list, C9902l c9902l) {
        Path path;
        AbstractC1392l abstractC1392l;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        List list2 = list;
        C9902l c9902l2 = c9902l;
        Path path2 = c9902l2.yandex;
        Path path3 = c9902l2.yandex;
        int i = path2.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
        c9902l2.subs();
        c9902l2.isPro(i);
        AbstractC1392l abstractC1392l2 = list2.isEmpty() ? C10766l.crashlytics : (AbstractC1392l) list2.get(0);
        int size = list2.size();
        float f10 = 0.0f;
        int i2 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (i2 < size) {
            AbstractC1392l abstractC1392l3 = (AbstractC1392l) list2.get(i2);
            if (abstractC1392l3 instanceof C10766l) {
                c9902l2.loadAd();
                path = path3;
                size = size;
                f10 = f10;
                i2 = i2;
                abstractC1392l = abstractC1392l3;
                f11 = f15;
                f13 = f11;
                f12 = f16;
                f14 = f12;
            } else {
                if (abstractC1392l3 instanceof C3828l) {
                    C3828l c3828l = (C3828l) abstractC1392l3;
                    float f17 = c3828l.crashlytics;
                    f13 += f17;
                    float f18 = c3828l.amazon;
                    f14 += f18;
                    path3.rMoveTo(f17, f18);
                    path = path3;
                    f15 = f13;
                    f16 = f14;
                } else if (abstractC1392l3 instanceof C16574l) {
                    C16574l c16574l = (C16574l) abstractC1392l3;
                    float f19 = c16574l.crashlytics;
                    float f20 = c16574l.amazon;
                    c9902l2.billing(f19, f20);
                    f14 = f20;
                    f16 = f14;
                    path = path3;
                    f13 = f19;
                    f15 = f13;
                } else {
                    if (abstractC1392l3 instanceof C0550l) {
                        C0550l c0550l = (C0550l) abstractC1392l3;
                        float f21 = c0550l.amazon;
                        float f22 = c0550l.crashlytics;
                        path3.rLineTo(f22, f21);
                        f13 += f22;
                        f14 += f21;
                    } else if (abstractC1392l3 instanceof C2789l) {
                        C2789l c2789l = (C2789l) abstractC1392l3;
                        float f23 = c2789l.amazon;
                        float f24 = c2789l.crashlytics;
                        c9902l2.purchase(f24, f23);
                        f13 = f24;
                        path = path3;
                        f14 = f23;
                    } else if (abstractC1392l3 instanceof C0040l) {
                        float f25 = ((C0040l) abstractC1392l3).crashlytics;
                        path3.rLineTo(f25, f10);
                        f13 += f25;
                    } else if (abstractC1392l3 instanceof C3705l) {
                        float f26 = ((C3705l) abstractC1392l3).crashlytics;
                        c9902l2.purchase(f26, f14);
                        f13 = f26;
                    } else if (abstractC1392l3 instanceof C12363l) {
                        float f27 = ((C12363l) abstractC1392l3).crashlytics;
                        path3.rLineTo(f10, f27);
                        f14 += f27;
                    } else if (abstractC1392l3 instanceof C4250l) {
                        float f28 = ((C4250l) abstractC1392l3).crashlytics;
                        c9902l2.purchase(f13, f28);
                        f14 = f28;
                    } else if (abstractC1392l3 instanceof C3033l) {
                        C3033l c3033l = (C3033l) abstractC1392l3;
                        path3.rCubicTo(c3033l.crashlytics, c3033l.amazon, c3033l.purchase, c3033l.billing, c3033l.mopub, c3033l.admob);
                        Path path4 = path3;
                        float f29 = c3033l.purchase + f13;
                        float f30 = c3033l.billing + f14;
                        f13 += c3033l.mopub;
                        f14 += c3033l.admob;
                        f12 = f30;
                        path = path4;
                        size = size;
                        f10 = f10;
                        i2 = i2;
                        abstractC1392l = abstractC1392l3;
                        f11 = f29;
                    } else {
                        Path path5 = path3;
                        if (abstractC1392l3 instanceof C1881l) {
                            C1881l c1881l = (C1881l) abstractC1392l3;
                            c9902l2.crashlytics(c1881l.crashlytics, c1881l.amazon, c1881l.purchase, c1881l.billing, c1881l.mopub, c1881l.admob);
                            f4 = c1881l.purchase;
                            f5 = c1881l.billing;
                            f6 = c1881l.mopub;
                            f7 = c1881l.admob;
                        } else {
                            if (abstractC1392l3 instanceof C18688l) {
                                if (abstractC1392l2.yandex) {
                                    f8 = f13 - f11;
                                    f9 = f14 - f12;
                                } else {
                                    f8 = f10;
                                    f9 = f8;
                                }
                                C18688l c18688l = (C18688l) abstractC1392l3;
                                path5.rCubicTo(f8, f9, c18688l.crashlytics, c18688l.amazon, c18688l.purchase, c18688l.billing);
                                path5 = path5;
                                float f31 = c18688l.crashlytics + f13;
                                float f32 = c18688l.amazon + f14;
                                f13 += c18688l.purchase;
                                f14 += c18688l.billing;
                                f11 = f31;
                                f12 = f32;
                            } else if (abstractC1392l3 instanceof C1902l) {
                                if (abstractC1392l2.yandex) {
                                    f13 = (f13 * 2.0f) - f11;
                                    f14 = (2.0f * f14) - f12;
                                }
                                C1902l c1902l = (C1902l) abstractC1392l3;
                                c9902l.crashlytics(f13, f14, c1902l.crashlytics, c1902l.amazon, c1902l.purchase, c1902l.billing);
                                f4 = c1902l.crashlytics;
                                f5 = c1902l.amazon;
                                f6 = c1902l.purchase;
                                f7 = c1902l.billing;
                            } else {
                                if (abstractC1392l3 instanceof C17108l) {
                                    C17108l c17108l = (C17108l) abstractC1392l3;
                                    float f33 = c17108l.billing;
                                    float f34 = c17108l.purchase;
                                    float f35 = c17108l.amazon;
                                    float f36 = c17108l.crashlytics;
                                    path5.rQuadTo(f36, f35, f34, f33);
                                    f4 = f36 + f13;
                                    f3 = f35 + f14;
                                    f13 += f34;
                                    f14 += f33;
                                } else if (abstractC1392l3 instanceof C18701l) {
                                    C18701l c18701l = (C18701l) abstractC1392l3;
                                    float f37 = c18701l.billing;
                                    float f38 = c18701l.purchase;
                                    f3 = c18701l.amazon;
                                    f4 = c18701l.crashlytics;
                                    path5.quadTo(f4, f3, f38, f37);
                                    f14 = f37;
                                    f13 = f38;
                                } else if (abstractC1392l3 instanceof C2251l) {
                                    if (abstractC1392l2.loadAd) {
                                        f = f13 - f11;
                                        f2 = f14 - f12;
                                    } else {
                                        f = f10;
                                        f2 = f;
                                    }
                                    C2251l c2251l = (C2251l) abstractC1392l3;
                                    float f39 = c2251l.amazon;
                                    float f40 = c2251l.crashlytics;
                                    path5.rQuadTo(f, f2, f40, f39);
                                    float f41 = f + f13;
                                    float f42 = f2 + f14;
                                    f13 += f40;
                                    f14 += f39;
                                    f11 = f41;
                                    f12 = f42;
                                } else if (abstractC1392l3 instanceof C14838l) {
                                    if (abstractC1392l2.loadAd) {
                                        f13 = (f13 * 2.0f) - f11;
                                        f14 = (2.0f * f14) - f12;
                                    }
                                    C14838l c14838l = (C14838l) abstractC1392l3;
                                    float f43 = c14838l.amazon;
                                    float f44 = c14838l.crashlytics;
                                    path5.quadTo(f13, f14, f44, f43);
                                    path = path5;
                                    size = size;
                                    f10 = f10;
                                    i2 = i2;
                                    f11 = f13;
                                    f12 = f14;
                                    abstractC1392l = abstractC1392l3;
                                    f13 = f44;
                                    f14 = f43;
                                } else if (abstractC1392l3 instanceof C15137l) {
                                    C15137l c15137l = (C15137l) abstractC1392l3;
                                    float f45 = c15137l.admob + f13;
                                    float f46 = c15137l.subs + f14;
                                    size = size;
                                    i2 = i2;
                                    path = path5;
                                    f10 = 0.0f;
                                    purchase(c9902l, f13, f14, f45, f46, c15137l.crashlytics, c15137l.amazon, c15137l.purchase, c15137l.billing, c15137l.mopub);
                                    f11 = f45;
                                    f13 = f11;
                                    f12 = f46;
                                    f14 = f12;
                                    abstractC1392l = abstractC1392l3;
                                } else {
                                    path = path5;
                                    size = size;
                                    f10 = f10;
                                    i2 = i2;
                                    if (!(abstractC1392l3 instanceof C14695l)) {
                                        C18725l.billing();
                                        return;
                                    }
                                    C14695l c14695l = (C14695l) abstractC1392l3;
                                    float f47 = c14695l.subs;
                                    float f48 = c14695l.admob;
                                    abstractC1392l = abstractC1392l3;
                                    purchase(c9902l, f13, f14, f48, f47, c14695l.crashlytics, c14695l.amazon, c14695l.purchase, c14695l.billing, c14695l.mopub);
                                    f12 = f47;
                                    f14 = f12;
                                    f11 = f48;
                                    f13 = f11;
                                }
                                f12 = f3;
                                path = path5;
                                size = size;
                                f10 = f10;
                                i2 = i2;
                                abstractC1392l = abstractC1392l3;
                                f11 = f4;
                            }
                            path = path5;
                        }
                        f12 = f5;
                        f13 = f6;
                        f14 = f7;
                        path = path5;
                        size = size;
                        f10 = f10;
                        i2 = i2;
                        abstractC1392l = abstractC1392l3;
                        f11 = f4;
                    }
                    path = path3;
                }
                abstractC1392l = abstractC1392l3;
            }
            i2++;
            list2 = list;
            c9902l2 = c9902l;
            path3 = path;
            size = size;
            abstractC1392l2 = abstractC1392l;
            f10 = f10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.crashlytics;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.yandex - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.amazon;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.loadAd - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        defpackage.C8339l.smaato("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        defpackage.C8339l.smaato("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean yandex(defpackage.C8896l r18, defpackage.C8896l r19, defpackage.C8896l r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = loadAd(r3, r2, r0)
            float r5 = r2.loadAd
            float r6 = r2.amazon
            float r7 = r2.yandex
            float r2 = r2.crashlytics
            float r8 = r0.amazon
            float r9 = r0.loadAd
            float r10 = r0.crashlytics
            float r11 = r0.yandex
            r12 = 0
            if (r4 != 0) goto L9c
            boolean r0 = loadAd(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9c
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L98
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L44:
            if (r3 != r13) goto L99
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L98
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.crashlytics
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.yandex
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.amazon
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L94
            float r1 = r1.loadAd
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            defpackage.C8339l.smaato(r4)
            return r12
        L94:
            defpackage.C8339l.smaato(r4)
            return r12
        L98:
            return r18
        L99:
            defpackage.C8339l.smaato(r4)
        L9c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11852l.yandex(lٌٚۙ, lٌٚۙ, lٌٚۙ, int):boolean");
    }
}
