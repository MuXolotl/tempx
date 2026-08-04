package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍٞؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9714l extends C6167l {
    @Override // defpackage.C6167l
    public final C4608l Signature() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "secondary_fixed_dim";
        c15855l.f31105l = new C6860l(20);
        c15855l.f31112l = new C0816l(this, 4);
        c15855l.f31109l = true;
        c15855l.f31113l = new C0816l(this, 5);
        return super.Signature().loadAd().loadAd(c15855l.yandex()).yandex();
    }

    @Override // defpackage.C6167l
    public final C4608l ad() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "tertiary";
        c15855l.f31105l = new C6860l(17);
        c15855l.f31112l = new C6860l(18);
        c15855l.f31109l = true;
        c15855l.f31114l = new C0816l(this, 2);
        c15855l.f31107l = new C6860l(19);
        c15855l.f31113l = new C0816l(this, 3);
        return super.ad().loadAd().loadAd(c15855l.yandex()).yandex();
    }

    @Override // defpackage.C6167l
    public final C4608l adcel() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "primary_fixed_dim";
        c15855l.f31105l = new C6860l(22);
        c15855l.f31112l = new C0816l(this, 6);
        c15855l.f31109l = true;
        c15855l.f31113l = new C0816l(this, 7);
        return super.adcel().loadAd().loadAd(c15855l.yandex()).yandex();
    }

    @Override // defpackage.C6167l
    public final C8723l admob(int i, C14997l c14997l, boolean z, int i2, double d) {
        double d2 = c14997l.loadAd;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi != 1) {
            if (iInmobi == 2) {
                return AbstractC7837l.crashlytics(d2, 16.0d);
            }
            if (iInmobi == 3) {
                return AbstractC7837l.crashlytics(AbstractC18219l.tapsense(c14997l, new double[]{0.0d, 38.0d, 105.0d, 140.0d, 333.0d, 360.0d}, new double[]{-14.0d, 10.0d, -14.0d, 10.0d, -14.0d}), i2 == 1 ? 56.0d : 36.0d);
            }
            if (iInmobi != 4) {
                return super.admob(i, c14997l, z, i2, d);
            }
            return AbstractC7837l.crashlytics(AbstractC18219l.tapsense(c14997l, new double[]{0.0d, 105.0d, 140.0d, 204.0d, 253.0d, 278.0d, 300.0d, 333.0d, 360.0d}, new double[]{-160.0d, 155.0d, -100.0d, 96.0d, -96.0d, -156.0d, -165.0d, -160.0d}), (i2 == 1 && z) ? 16.0d : 24.0d);
        }
        double d3 = 6.0d;
        if (i2 == 1) {
            if (d2 < 250.0d || d2 >= 270.0d) {
                d3 = 4.0d;
            }
        } else if (d2 >= 250.0d && d2 < 270.0d) {
            d3 = 10.0d;
        }
        return AbstractC7837l.crashlytics(d2, d3);
    }

    @Override // defpackage.C6167l
    public final C4608l ads() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "secondary";
        int i = 3;
        c15855l.f31105l = new C12161l(i);
        c15855l.f31112l = new C12161l(14);
        c15855l.f31109l = true;
        c15855l.f31114l = new C8354l(this, 0);
        c15855l.f31107l = new C4100l(i);
        c15855l.f31113l = new C8354l(this, 5);
        return super.ads().loadAd().loadAd(c15855l.yandex()).yandex();
    }

    @Override // defpackage.C6167l
    public final C4608l advert() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "tertiary_container";
        c15855l.f31105l = new C4100l(2);
        int i = 4;
        c15855l.f31112l = new C4100l(i);
        c15855l.f31109l = true;
        c15855l.f31114l = new C8354l(this, 3);
        c15855l.f31113l = new C8354l(this, i);
        c15855l.f31107l = new C4100l(5);
        return super.advert().loadAd().loadAd(c15855l.yandex()).yandex();
    }

    @Override // defpackage.C6167l
    public final C14997l amazon(C4608l c4608l, C0187l c0187l) {
        Number number;
        C8723l c8723l = (C8723l) c4608l.loadAd.invoke(c0187l);
        double dIsPro = isPro(c4608l, c0187l);
        double d = c8723l.yandex;
        Function1 function1 = c4608l.purchase;
        if (function1 == null || (number = (Double) function1.invoke(c0187l)) == null) {
            number = 1;
        }
        return new C14997l(AbstractC6889l.firebase(d, number.doubleValue() * c8723l.loadAd, dIsPro));
    }

    public final C4608l applovin() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "primary_dim";
        c15855l.f31105l = new C17018l(20);
        c15855l.f31112l = new C17018l(21);
        c15855l.f31109l = true;
        c15855l.f31114l = new C0816l(this, 14);
        c15855l.f31107l = new C17018l(22);
        c15855l.f31113l = new C0816l(this, 15);
        return c15855l.yandex();
    }

    public final C4608l appmetrica() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "secondary_dim";
        c15855l.f31105l = new C17018l(13);
        c15855l.f31112l = new C17018l(14);
        c15855l.f31109l = true;
        c15855l.f31114l = new C0816l(this, 10);
        c15855l.f31107l = new C17018l(15);
        c15855l.f31113l = new C0816l(this, 11);
        return c15855l.yandex();
    }

    @Override // defpackage.C6167l
    public final C8723l billing(int i, C14997l c14997l, boolean z, int i2, double d) {
        double d2 = c14997l.loadAd;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 1) {
            return AbstractC7837l.crashlytics(d2, (i2 == 1 ? 1.4d : 6.0d) * 2.2d);
        }
        if (iInmobi == 2) {
            return AbstractC7837l.crashlytics(d2, (i2 == 1 ? 5.0d : 10.0d) * 1.7d);
        }
        if (iInmobi == 3) {
            return AbstractC7837l.crashlytics(C15718l.ads(c14997l), C15718l.mopub(c14997l, i2) * 1.29d);
        }
        if (iInmobi != 4) {
            return super.billing(i, c14997l, z, i2, d);
        }
        double dStartapp = C15718l.startapp(c14997l);
        return AbstractC7837l.crashlytics(dStartapp, C15718l.purchase(c14997l, z, i2) * ((dStartapp < 105.0d || dStartapp >= 125.0d) ? 2.3d : 1.6d));
    }

    @Override // defpackage.C6167l
    public final C8723l crashlytics(int i, C14997l c14997l, boolean z, int i2, double d) {
        double[] dArr = {0.0d, 3.0d, 13.0d, 23.0d, 33.0d, 43.0d, 153.0d, 273.0d, 360.0d};
        double[] dArr2 = {12.0d, 22.0d, 32.0d, 12.0d, 22.0d, 32.0d, 22.0d, 12.0d};
        int iMin = Math.min(8, 8);
        double d2 = c14997l.loadAd;
        for (int i3 = 0; i3 < iMin; i3++) {
            if (d2 >= dArr[i3] && d2 < dArr[i3 + 1]) {
                double d3 = dArr2[i3] % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                d2 = d3;
                break;
            }
        }
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 1) {
            return AbstractC7837l.crashlytics(d2, i2 == 1 ? 50.0d : 40.0d);
        }
        if (iInmobi == 2) {
            return AbstractC7837l.crashlytics(d2, i2 == 1 ? 60.0d : 48.0d);
        }
        if (iInmobi == 3) {
            return AbstractC7837l.crashlytics(d2, i2 == 1 ? 80.0d : 60.0d);
        }
        if (iInmobi == 4) {
            return AbstractC7837l.crashlytics(d2, i2 == 1 ? 64.0d : 48.0d);
        }
        super.crashlytics(i, c14997l, z, i2, d);
        return null;
    }

    public final C4608l inmobi() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "surface_container_high";
        c15855l.f31105l = new C12161l(16);
        c15855l.f31112l = new C12161l(17);
        c15855l.f31109l = true;
        c15855l.f31111l = new C12161l(18);
        C4608l c4608lYandex = c15855l.yandex();
        C15855l c15855l2 = new C15855l();
        c15855l2.f31108l = "surface_container_high";
        c15855l2.f31105l = new C1373l(11);
        c15855l2.f31112l = new C1373l(12);
        c15855l2.f31109l = true;
        return c15855l2.yandex().loadAd().loadAd(c4608lYandex).yandex();
    }

    @Override // defpackage.C6167l
    public final double isPro(C4608l c4608l, C0187l c0187l) {
        C4608l c4608l2;
        C9193l c9193l;
        C4608l c4608l3;
        double dCrashlytics;
        boolean z = c0187l.crashlytics;
        double d = c0187l.amazon;
        boolean z2 = c4608l.amazon;
        Function1 function1 = c4608l.billing;
        Function1 function2 = c4608l.admob;
        String str = c4608l.yandex;
        Function1 function3 = c4608l.subs;
        Double dValueOf = null;
        C3134l c3134l = function3 != null ? (C3134l) function3.invoke(c0187l) : null;
        if (c3134l == null) {
            double dDoubleValue = ((Number) c4608l.crashlytics.invoke(c0187l)).doubleValue();
            Double dValueOf2 = (function1 == null || (c4608l3 = (C4608l) function1.invoke(c0187l)) == null) ? null : Double.valueOf(c4608l3.yandex(c0187l));
            if (function2 != null && (c9193l = (C9193l) function2.invoke(c0187l)) != null) {
                dValueOf = Double.valueOf(c9193l.yandex(d));
            }
            if (dValueOf2 == null || dValueOf == null) {
                return dDoubleValue;
            }
            if (AbstractC15497l.subs(dValueOf2.doubleValue(), dDoubleValue) < dValueOf.doubleValue() || d < 0.0d) {
                dDoubleValue = AbstractC11784l.yandex(dValueOf2.doubleValue(), dValueOf.doubleValue());
            }
            double dCrashlytics2 = dDoubleValue;
            if (z2 && !AbstractC16648l.Signature(str, "_fixed_dim", false)) {
                dCrashlytics2 = dCrashlytics2 >= 57.0d ? AbstractC8576l.crashlytics(dCrashlytics2, 65.0d, 100.0d) : AbstractC8576l.crashlytics(dCrashlytics2, 0.0d, 49.0d);
            }
            double d2 = dCrashlytics2;
            Function1 function4 = c4608l.mopub;
            if (function4 != null && (c4608l2 = (C4608l) function4.invoke(c0187l)) != null) {
                double dYandex = c4608l2.yandex(c0187l);
                double dMax = Math.max(dValueOf2.doubleValue(), dYandex);
                double dMin = Math.min(dValueOf2.doubleValue(), dYandex);
                if (AbstractC15497l.subs(dMax, d2) < dValueOf.doubleValue() || AbstractC15497l.subs(dMin, d2) < dValueOf.doubleValue()) {
                    double dMopub = AbstractC15497l.mopub(dMax, dValueOf.doubleValue());
                    double dBilling = AbstractC15497l.billing(dMin, dValueOf.doubleValue());
                    ArrayList arrayList = new ArrayList();
                    if (dMopub != -1.0d) {
                        arrayList.add(Double.valueOf(dMopub));
                    }
                    if (dBilling != -1.0d) {
                        arrayList.add(Double.valueOf(dBilling));
                    }
                    if (Math.rint(dValueOf2.doubleValue()) < 60.0d || Math.rint(dYandex) < 60.0d) {
                        if (dMopub < 0.0d) {
                            return 100.0d;
                        }
                        return dMopub;
                    }
                    if (arrayList.size() == 1) {
                        return ((Number) AbstractC16901l.m4231native(arrayList)).doubleValue();
                    }
                    if (dBilling < 0.0d) {
                        return 0.0d;
                    }
                    return dBilling;
                }
            }
            return d2;
        }
        double d3 = c3134l.crashlytics;
        C4608l c4608l4 = c3134l.yandex;
        C4608l c4608l5 = c3134l.loadAd;
        int i = c3134l.amazon;
        int i2 = c3134l.billing;
        if (i == 1 || ((i == 4 && z) || (i == 3 && !z))) {
            d3 = -d3;
        }
        boolean zYandex = AbstractC8576l.yandex(str, c4608l4.yandex);
        C4608l c4608l6 = zYandex ? c4608l4 : c4608l5;
        if (zYandex) {
            c4608l4 = c4608l5;
        }
        double dDoubleValue2 = ((Number) c4608l6.crashlytics.invoke(c0187l)).doubleValue();
        double dYandex2 = c4608l4.yandex(c0187l);
        double d4 = d3 * ((double) (zYandex ? 1 : -1));
        int iInmobi = AbstractC5020l.inmobi(i2);
        if (iInmobi == 0) {
            dCrashlytics = AbstractC8576l.crashlytics(dYandex2 + d4, 0.0d, 100.0d);
        } else if (iInmobi == 1) {
            dCrashlytics = d4 > 0.0d ? AbstractC8576l.crashlytics(AbstractC8576l.crashlytics(dDoubleValue2, dYandex2, dYandex2 + d4), 0.0d, 100.0d) : AbstractC8576l.crashlytics(AbstractC8576l.crashlytics(dDoubleValue2, dYandex2 + d4, dYandex2), 0.0d, 100.0d);
        } else {
            if (iInmobi != 2) {
                C18725l.billing();
                return 0.0d;
            }
            dCrashlytics = d4 > 0.0d ? AbstractC8576l.crashlytics(dDoubleValue2, dYandex2 + d4, 100.0d) : AbstractC8576l.crashlytics(dDoubleValue2, 0.0d, dYandex2 + d4);
        }
        if (function1 != null && function2 != null) {
            C4608l c4608l7 = (C4608l) function1.invoke(c0187l);
            C9193l c9193l2 = (C9193l) function2.invoke(c0187l);
            if (c4608l7 != null && c9193l2 != null) {
                double dYandex3 = c4608l7.yandex(c0187l);
                double dYandex4 = c9193l2.yandex(d);
                if (AbstractC15497l.subs(dYandex3, dCrashlytics) < dYandex4 || d < 0.0d) {
                    dCrashlytics = AbstractC11784l.yandex(dYandex3, dYandex4);
                }
            }
        }
        double d5 = dCrashlytics;
        if (!z2 || AbstractC16648l.Signature(str, "_fixed_dim", false)) {
            return d5;
        }
        return d5 >= 57.0d ? AbstractC8576l.crashlytics(d5, 65.0d, 100.0d) : AbstractC8576l.crashlytics(d5, 0.0d, 49.0d);
    }

    @Override // defpackage.C6167l
    public final C4608l isVip() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "tertiary_fixed";
        c15855l.f31105l = new C15169l(18);
        c15855l.f31112l = new C0816l(this, 26);
        c15855l.f31109l = true;
        c15855l.f31114l = new C0816l(this, 27);
        c15855l.f31107l = new C15169l(19);
        return super.isVip().loadAd().loadAd(c15855l.yandex()).yandex();
    }

    @Override // defpackage.C6167l
    public final C4608l license() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "surface_bright";
        c15855l.f31105l = new C17018l(3);
        c15855l.f31112l = new C17018l(4);
        c15855l.f31109l = true;
        c15855l.f31111l = new C17018l(5);
        return super.license().loadAd().loadAd(c15855l.yandex()).yandex();
    }

    @Override // defpackage.C6167l
    public final C4608l loadAd() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "error_container";
        c15855l.f31105l = new C6860l(4);
        c15855l.f31112l = new C15169l(0);
        c15855l.f31109l = true;
        c15855l.f31114l = new C0816l(this, 22);
        c15855l.f31113l = new C0816l(this, 25);
        c15855l.f31107l = new C15169l(24);
        return super.loadAd().loadAd().loadAd(c15855l.yandex()).yandex();
    }

    @Override // defpackage.C6167l
    public final C4608l metrica() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "primary_container";
        c15855l.f31105l = new C15169l(23);
        c15855l.f31112l = new C15169l(25);
        c15855l.f31109l = true;
        c15855l.f31114l = new C0816l(this, 28);
        c15855l.f31113l = new C0816l(this, 29);
        c15855l.f31107l = new C15169l(26);
        return super.metrica().loadAd().loadAd(c15855l.yandex()).yandex();
    }

    @Override // defpackage.C6167l
    public final C8723l mopub(int i, C14997l c14997l, boolean z, int i2, double d) {
        double d2;
        double d3 = c14997l.loadAd;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 1) {
            double d4 = 12.0d;
            if (i2 == 1) {
                if (d3 < 250.0d || d3 >= 270.0d) {
                    d4 = 8.0d;
                }
            } else if (d3 >= 250.0d && d3 < 270.0d) {
                d4 = 16.0d;
            }
            return AbstractC7837l.crashlytics(d3, d4);
        }
        if (iInmobi == 2) {
            return AbstractC7837l.crashlytics(d3, (i2 == 1 && z) ? 26.0d : 32.0d);
        }
        if (iInmobi == 3) {
            return AbstractC7837l.crashlytics(d3, i2 == 1 ? 74.0d : 56.0d);
        }
        if (iInmobi != 4) {
            return super.mopub(i, c14997l, z, i2, d);
        }
        if (i2 == 1) {
            d2 = z ? 36.0d : 48.0d;
        } else {
            d2 = 40.0d;
        }
        return AbstractC7837l.crashlytics(d3, d2);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final C4608l m2723package() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "tertiary_dim";
        c15855l.f31105l = new C17018l(16);
        c15855l.f31112l = new C17018l(18);
        c15855l.f31109l = true;
        c15855l.f31114l = new C0816l(this, 12);
        c15855l.f31107l = new C17018l(19);
        c15855l.f31113l = new C0816l(this, 13);
        return c15855l.yandex();
    }

    public final C4608l premium() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "error_dim";
        c15855l.f31105l = new C17018l(23);
        c15855l.f31112l = new C17018l(25);
        c15855l.f31109l = true;
        c15855l.f31114l = new C0816l(this, 16);
        c15855l.f31107l = new C17018l(26);
        c15855l.f31113l = new C0816l(this, 17);
        return c15855l.yandex();
    }

    @Override // defpackage.C6167l
    public final C4608l pro() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "surface_dim";
        c15855l.f31105l = new C15169l(27);
        c15855l.f31112l = new C15169l(28);
        c15855l.f31109l = true;
        c15855l.f31111l = new C15169l(29);
        return super.pro().loadAd().loadAd(c15855l.yandex()).yandex();
    }

    @Override // defpackage.C6167l
    public final C8723l purchase(int i, C14997l c14997l, boolean z, int i2, double d) {
        double d2 = c14997l.loadAd;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 1) {
            return AbstractC7837l.crashlytics(d2, i2 == 1 ? 1.4d : 6.0d);
        }
        if (iInmobi == 2) {
            return AbstractC7837l.crashlytics(d2, i2 == 1 ? 5.0d : 10.0d);
        }
        if (iInmobi != 3) {
            return iInmobi != 4 ? super.purchase(i, c14997l, z, i2, d) : AbstractC7837l.crashlytics(C15718l.startapp(c14997l), C15718l.purchase(c14997l, z, i2));
        }
        return AbstractC7837l.crashlytics(C15718l.ads(c14997l), C15718l.mopub(c14997l, i2));
    }

    @Override // defpackage.C6167l
    public final C4608l signatures() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "tertiary_fixed_dim";
        c15855l.f31105l = new C6860l(12);
        c15855l.f31112l = new C0816l(this, 0);
        c15855l.f31109l = true;
        c15855l.f31113l = new C0816l(this, 1);
        return super.signatures().loadAd().loadAd(c15855l.yandex()).yandex();
    }

    @Override // defpackage.C6167l
    public final C4608l smaato() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "inverse_surface";
        c15855l.f31105l = new C12161l(13);
        c15855l.f31112l = new C12161l(15);
        c15855l.f31109l = true;
        return super.smaato().loadAd().loadAd(c15855l.yandex()).yandex();
    }

    @Override // defpackage.C6167l
    public final C4608l startapp() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "primary_fixed";
        c15855l.f31105l = new C15169l(8);
        c15855l.f31112l = new C0816l(this, 23);
        c15855l.f31109l = true;
        c15855l.f31114l = new C0816l(this, 24);
        c15855l.f31107l = new C15169l(9);
        return super.startapp().loadAd().loadAd(c15855l.yandex()).yandex();
    }

    @Override // defpackage.C6167l
    public final C8723l subs(int i, C14997l c14997l, boolean z, int i2, double d) {
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 1) {
            return AbstractC7837l.crashlytics(AbstractC18219l.tapsense(c14997l, new double[]{0.0d, 38.0d, 105.0d, 161.0d, 204.0d, 278.0d, 333.0d, 360.0d}, new double[]{-32.0d, 26.0d, 10.0d, -39.0d, 24.0d, -15.0d, -32.0d}), i2 == 1 ? 20.0d : 36.0d);
        }
        if (iInmobi == 2) {
            return AbstractC7837l.crashlytics(AbstractC18219l.tapsense(c14997l, new double[]{0.0d, 20.0d, 71.0d, 161.0d, 333.0d, 360.0d}, new double[]{-40.0d, 48.0d, -32.0d, 40.0d, -32.0d}), i2 == 1 ? 28.0d : 32.0d);
        }
        if (iInmobi != 3) {
            return iInmobi != 4 ? super.subs(i, c14997l, z, i2, d) : AbstractC7837l.crashlytics(AbstractC18219l.tapsense(c14997l, new double[]{0.0d, 105.0d, 140.0d, 204.0d, 253.0d, 278.0d, 300.0d, 333.0d, 360.0d}, new double[]{-165.0d, 160.0d, -105.0d, 101.0d, -101.0d, -160.0d, -170.0d, -165.0d}), 48.0d);
        }
        return AbstractC7837l.crashlytics(AbstractC18219l.tapsense(c14997l, new double[]{0.0d, 38.0d, 71.0d, 105.0d, 140.0d, 161.0d, 253.0d, 333.0d, 360.0d}, new double[]{-72.0d, 35.0d, 24.0d, -24.0d, 62.0d, 50.0d, 62.0d, -72.0d}), 56.0d);
    }

    @Override // defpackage.C6167l
    public final C4608l subscription() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "secondary_container";
        c15855l.f31105l = new C12161l(25);
        c15855l.f31112l = new C12161l(26);
        c15855l.f31109l = true;
        c15855l.f31114l = new C8354l(this, 1);
        c15855l.f31113l = new C8354l(this, 2);
        c15855l.f31107l = new C12161l(27);
        return super.subscription().loadAd().loadAd(c15855l.yandex()).yandex();
    }

    @Override // defpackage.C6167l
    public final C4608l tapsense() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "secondary_fixed";
        c15855l.f31105l = new C6860l(23);
        c15855l.f31112l = new C0816l(this, 8);
        c15855l.f31109l = true;
        c15855l.f31114l = new C0816l(this, 9);
        c15855l.f31107l = new C6860l(24);
        return super.tapsense().loadAd().loadAd(c15855l.yandex()).yandex();
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final C4608l m2724throws() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "surface_container_highest";
        c15855l.f31105l = new C12161l(4);
        c15855l.f31112l = new C12161l(5);
        c15855l.f31109l = true;
        c15855l.f31111l = new C12161l(6);
        C4608l c4608lYandex = c15855l.yandex();
        C15855l c15855l2 = new C15855l();
        c15855l2.f31108l = "surface_container_highest";
        c15855l2.f31105l = new C2928l(21);
        c15855l2.f31112l = new C2928l(22);
        c15855l2.f31109l = true;
        return c15855l2.yandex().loadAd().loadAd(c4608lYandex).yandex();
    }

    @Override // defpackage.C6167l
    public final C4608l vip() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "primary";
        c15855l.f31105l = new C17018l(27);
        c15855l.f31112l = new C17018l(28);
        c15855l.f31109l = true;
        c15855l.f31114l = new C0816l(this, 18);
        c15855l.f31107l = new C17018l(29);
        c15855l.f31113l = new C0816l(this, 19);
        return super.vip().loadAd().loadAd(c15855l.yandex()).yandex();
    }

    @Override // defpackage.C6167l
    public final C4608l yandex() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "error";
        c15855l.f31105l = new C15169l(1);
        c15855l.f31112l = new C15169l(2);
        c15855l.f31109l = true;
        c15855l.f31114l = new C0816l(this, 20);
        c15855l.f31107l = new C15169l(3);
        c15855l.f31113l = new C0816l(this, 21);
        return super.yandex().loadAd().loadAd(c15855l.yandex()).yandex();
    }
}
