package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙؐۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C6167l {
    public static boolean remoteconfig(C0187l c0187l) {
        int i = c0187l.loadAd;
        return i == 6 || i == 7;
    }

    public C4608l Signature() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "secondary_fixed_dim";
        c15855l.f31105l = new C2928l(5);
        c15855l.f31112l = new C2928l(6);
        c15855l.f31109l = true;
        c15855l.f31114l = new C17847l(1, this, C6167l.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 6);
        c15855l.f31107l = new C2928l(7);
        c15855l.f31113l = new C12495l(this, 11);
        return c15855l.yandex();
    }

    public C4608l ad() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "tertiary";
        c15855l.f31105l = new C1373l(0);
        c15855l.f31112l = new C1373l(1);
        c15855l.f31109l = true;
        c15855l.f31114l = new C17847l(1, this, C6167l.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 7);
        c15855l.f31107l = new C1373l(2);
        c15855l.f31113l = new C12495l(this, 7);
        return c15855l.yandex();
    }

    public C4608l adcel() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "primary_fixed_dim";
        c15855l.f31105l = new C2928l(1);
        c15855l.f31112l = new C2928l(2);
        c15855l.f31109l = true;
        c15855l.f31114l = new C17847l(1, this, C6167l.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 2);
        c15855l.f31107l = new C2928l(3);
        c15855l.f31113l = new C12495l(this, 10);
        return c15855l.yandex();
    }

    public C8723l admob(int i, C14997l c14997l, boolean z, int i2, double d) {
        double d2 = c14997l.loadAd;
        switch (AbstractC5020l.inmobi(i)) {
            case 0:
                return AbstractC7837l.crashlytics(d2, 0.0d);
            case 1:
                return AbstractC7837l.crashlytics(d2, 8.0d);
            case 2:
                return AbstractC7837l.crashlytics(d2, 16.0d);
            case 3:
                return AbstractC7837l.crashlytics(AbstractC18219l.tapsense(c14997l, new double[]{0.0d, 41.0d, 61.0d, 101.0d, 131.0d, 181.0d, 251.0d, 301.0d, 360.0d}, new double[]{18.0d, 15.0d, 10.0d, 12.0d, 15.0d, 18.0d, 15.0d, 12.0d, 12.0d}), 24.0d);
            case 4:
                return AbstractC7837l.crashlytics(AbstractC18219l.tapsense(c14997l, new double[]{0.0d, 21.0d, 51.0d, 121.0d, 151.0d, 191.0d, 271.0d, 321.0d, 360.0d}, new double[]{45.0d, 95.0d, 45.0d, 20.0d, 45.0d, 90.0d, 45.0d, 45.0d, 45.0d}), 24.0d);
            case 5:
            case 6:
                double d3 = c14997l.crashlytics;
                return AbstractC7837l.crashlytics(d2, Math.max(d3 - 32.0d, d3 * 0.5d));
            case 7:
                return AbstractC7837l.crashlytics(d2, 16.0d);
            case 8:
                double d4 = (d2 - 50.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return AbstractC7837l.crashlytics(d4, 36.0d);
            default:
                C18725l.billing();
                return null;
        }
    }

    public C4608l ads() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "secondary";
        c15855l.f31105l = new C0276l(10);
        c15855l.f31112l = new C0276l(21);
        c15855l.f31109l = true;
        c15855l.f31114l = new C17847l(1, this, C6167l.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 3);
        c15855l.f31107l = new C9156l(2);
        c15855l.f31113l = new C12495l(this, 5);
        return c15855l.yandex();
    }

    public C4608l advert() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "tertiary_container";
        c15855l.f31105l = new C9156l(6);
        c15855l.f31112l = new C9156l(this);
        c15855l.f31109l = true;
        c15855l.f31114l = new C17847l(1, this, C6167l.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 8);
        c15855l.f31107l = new C9156l(8);
        c15855l.f31113l = new C12495l(this, 4);
        return c15855l.yandex();
    }

    public C14997l amazon(C4608l c4608l, C0187l c0187l) {
        double dIsPro = isPro(c4608l, c0187l);
        C8723l c8723l = (C8723l) c4608l.loadAd.invoke(c0187l);
        return new C14997l(AbstractC6889l.firebase(c8723l.yandex, c8723l.loadAd, dIsPro));
    }

    public C8723l billing(int i, C14997l c14997l, boolean z, int i2, double d) {
        double d2 = c14997l.crashlytics;
        double d3 = c14997l.loadAd;
        switch (AbstractC5020l.inmobi(i)) {
            case 0:
                return AbstractC7837l.crashlytics(d3, 0.0d);
            case 1:
                return AbstractC7837l.crashlytics(d3, 2.0d);
            case 2:
                return AbstractC7837l.crashlytics(d3, 8.0d);
            case 3:
                return AbstractC7837l.crashlytics(d3, 12.0d);
            case 4:
                double d4 = (d3 + 15.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return AbstractC7837l.crashlytics(d4, 12.0d);
            case 5:
                return AbstractC7837l.crashlytics(d3, (d2 / 8.0d) + 4.0d);
            case 6:
                return AbstractC7837l.crashlytics(d3, (d2 / 8.0d) + 4.0d);
            case 7:
                return AbstractC7837l.crashlytics(d3, 0.0d);
            case 8:
                return AbstractC7837l.crashlytics(d3, 16.0d);
            default:
                C18725l.billing();
                return null;
        }
    }

    public C8723l crashlytics(int i, C14997l c14997l, boolean z, int i2, double d) {
        switch (AbstractC5020l.inmobi(i)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                C18725l.billing();
                break;
        }
        return null;
    }

    public final C4608l firebase(C0187l c0187l) {
        return c0187l.crashlytics ? license() : pro();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    public double isPro(C4608l c4608l, C0187l c0187l) {
        C4608l c4608l2;
        boolean z;
        boolean z2 = c0187l.crashlytics;
        Function1 function1 = c4608l.admob;
        Function1 function2 = c4608l.billing;
        double d = c0187l.amazon;
        boolean z3 = d < 0.0d;
        Function1 function3 = c4608l.subs;
        Double dValueOf = null;
        C3134l c3134l = function3 == null ? null : (C3134l) function3.invoke(c0187l);
        if (c3134l == null) {
            boolean z4 = z3;
            double dDoubleValue = ((Number) c4608l.crashlytics.invoke(c0187l)).doubleValue();
            if (function2 == null || function1 == null) {
                return dDoubleValue;
            }
            C4608l c4608l3 = (C4608l) function2.invoke(c0187l);
            double dYandex = c4608l3 != null ? c4608l3.yandex(c0187l) : 0.0d;
            C9193l c9193l = (C9193l) function1.invoke(c0187l);
            double dYandex2 = c9193l != null ? c9193l.yandex(d) : 0.0d;
            if (AbstractC15497l.subs(dYandex, dDoubleValue) < dYandex2) {
                dDoubleValue = AbstractC11784l.yandex(dYandex, dYandex2);
            }
            if (z4) {
                dDoubleValue = AbstractC11784l.yandex(dYandex, dYandex2);
            }
            if (c4608l.amazon && 50.0d <= dDoubleValue && dDoubleValue < 60.0d) {
                dDoubleValue = AbstractC15497l.subs(49.0d, dYandex) >= dYandex2 ? 49.0d : 60.0d;
            }
            Function1 function4 = c4608l.mopub;
            if (function4 != null && (c4608l2 = (C4608l) function4.invoke(c0187l)) != null) {
                dValueOf = Double.valueOf(c4608l2.yandex(c0187l));
            }
            if (dValueOf != null) {
                C4608l c4608l4 = (C4608l) function2.invoke(c0187l);
                double dYandex3 = c4608l4 != null ? c4608l4.yandex(c0187l) : 0.0d;
                double dMax = Math.max(dYandex3, dValueOf.doubleValue());
                double dMin = Math.min(dYandex3, dValueOf.doubleValue());
                if (AbstractC15497l.subs(dMax, dDoubleValue) < dYandex2 || AbstractC15497l.subs(dMin, dDoubleValue) < dYandex2) {
                    double dMopub = AbstractC15497l.mopub(dMax, dYandex2);
                    double dBilling = AbstractC15497l.billing(dMin, dYandex2);
                    ArrayList arrayList = new ArrayList();
                    if (dMopub != -1.0d) {
                        arrayList.add(Double.valueOf(dMopub));
                    }
                    if (dBilling != -1.0d) {
                        arrayList.add(Double.valueOf(dBilling));
                    }
                    if (Math.rint(dYandex3) < 60.0d || Math.rint(dValueOf.doubleValue()) < 60.0d) {
                        if (dMopub == -1.0d) {
                            return 100.0d;
                        }
                        return dMopub;
                    }
                    if (arrayList.size() == 1) {
                        return ((Number) AbstractC16901l.m4231native(arrayList)).doubleValue();
                    }
                    if (dBilling == -1.0d) {
                        return 0.0d;
                    }
                    return dBilling;
                }
            }
            return dDoubleValue;
        }
        C4608l c4608l5 = c3134l.yandex;
        C4608l c4608l6 = c3134l.loadAd;
        double d2 = c3134l.crashlytics;
        int i = c3134l.amazon;
        boolean z5 = c3134l.purchase;
        boolean z6 = i == 5 || (i == 2 && !z2) || (i == 1 && !z2);
        C4608l c4608l7 = z6 ? c4608l5 : c4608l6;
        if (z6) {
            c4608l5 = c4608l6;
        }
        String str = c4608l.yandex;
        String str2 = c4608l7.yandex;
        Function1 function5 = c4608l7.admob;
        boolean zYandex = AbstractC8576l.yandex(str, str2);
        boolean z7 = z3;
        double d3 = z2 ? 1 : -1;
        double dDoubleValue2 = ((Number) c4608l7.crashlytics.invoke(c0187l)).doubleValue();
        Function1 function6 = c4608l5.crashlytics;
        Function1 function7 = c4608l5.admob;
        double dDoubleValue3 = ((Number) function6.invoke(c0187l)).doubleValue();
        if (function2 == null || function5 == null || function7 == null) {
            z = z5;
        } else {
            C4608l c4608l8 = (C4608l) function2.invoke(c0187l);
            C9193l c9193l2 = (C9193l) function5.invoke(c0187l);
            C9193l c9193l3 = (C9193l) function7.invoke(c0187l);
            if (c4608l8 == null || c9193l2 == null || c9193l3 == null) {
                z = z5;
            } else {
                z = z5;
                double dYandex4 = c9193l2.yandex(d);
                double dYandex5 = c9193l3.yandex(d);
                double dYandex6 = c4608l8.yandex(c0187l);
                if (AbstractC15497l.subs(dYandex6, dDoubleValue2) < dYandex4) {
                    dDoubleValue2 = AbstractC11784l.yandex(dYandex6, dYandex4);
                }
                if (AbstractC15497l.subs(dYandex6, dDoubleValue3) < dYandex5) {
                    dDoubleValue3 = AbstractC11784l.yandex(dYandex6, dYandex5);
                }
                if (z7) {
                    dDoubleValue2 = AbstractC11784l.yandex(dYandex6, dYandex4);
                    dDoubleValue3 = AbstractC11784l.yandex(dYandex6, dYandex5);
                }
            }
        }
        if ((dDoubleValue3 - dDoubleValue2) * d3 < d2) {
            double d4 = d2 * d3;
            dDoubleValue3 = AbstractC8576l.crashlytics(dDoubleValue2 + d4, 0.0d, 100.0d);
            if ((dDoubleValue3 - dDoubleValue2) * d3 < d2) {
                dDoubleValue2 = AbstractC8576l.crashlytics(dDoubleValue3 - d4, 0.0d, 100.0d);
            }
        }
        if (50.0d > dDoubleValue2 || dDoubleValue2 >= 60.0d) {
            if (50.0d <= dDoubleValue3 && dDoubleValue3 < 60.0d) {
                if (!z) {
                    dDoubleValue3 = d3 <= 0.0d ? 49.0d : 60.0d;
                } else if (d3 > 0.0d) {
                    dDoubleValue3 = Math.max(dDoubleValue3, (d2 * d3) + 60.0d);
                    dDoubleValue2 = 60.0d;
                } else {
                    dDoubleValue3 = Math.min(dDoubleValue3, (d2 * d3) + 49.0d);
                    dDoubleValue2 = 49.0d;
                }
            }
        } else if (d3 > 0.0d) {
            dDoubleValue3 = Math.max(dDoubleValue3, (d2 * d3) + 60.0d);
            dDoubleValue2 = 60.0d;
        } else {
            dDoubleValue3 = Math.min(dDoubleValue3, (d2 * d3) + 49.0d);
            dDoubleValue2 = 49.0d;
        }
        return zYandex ? dDoubleValue2 : dDoubleValue3;
    }

    public C4608l isVip() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "tertiary_fixed";
        c15855l.f31105l = new C8864l(19);
        c15855l.f31112l = new C8864l(20);
        c15855l.f31109l = true;
        c15855l.f31114l = new C17847l(1, this, C6167l.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 9);
        c15855l.f31107l = new C8864l(21);
        c15855l.f31113l = new C12495l(this, 0);
        return c15855l.yandex();
    }

    public C4608l license() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "surface_bright";
        c15855l.f31105l = new C0276l(15);
        c15855l.f31112l = new C0276l(16);
        c15855l.f31109l = true;
        return c15855l.yandex();
    }

    public C4608l loadAd() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "error_container";
        c15855l.f31105l = new C1373l(4);
        c15855l.f31112l = new C1373l(5);
        c15855l.f31109l = true;
        c15855l.f31114l = new C2176l(1, this, C6167l.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 25);
        c15855l.f31107l = new C1373l(6);
        c15855l.f31113l = new C12495l(this, 8);
        return c15855l.yandex();
    }

    public C4608l metrica() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "primary_container";
        c15855l.f31105l = new C2928l(24);
        c15855l.f31112l = new C6860l(this);
        c15855l.f31109l = true;
        c15855l.f31114l = new C17847l(1, this, C6167l.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 0);
        c15855l.f31107l = new C8864l(22);
        c15855l.f31113l = new C12495l(this, 2);
        return c15855l.yandex();
    }

    public C8723l mopub(int i, C14997l c14997l, boolean z, int i2, double d) {
        double d2 = c14997l.loadAd;
        switch (AbstractC5020l.inmobi(i)) {
            case 0:
                return AbstractC7837l.crashlytics(d2, 0.0d);
            case 1:
                return AbstractC7837l.crashlytics(d2, 12.0d);
            case 2:
                return AbstractC7837l.crashlytics(d2, 36.0d);
            case 3:
                return AbstractC7837l.crashlytics(d2, 200.0d);
            case 4:
                double d3 = (d2 + 240.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return AbstractC7837l.crashlytics(d3, 40.0d);
            case 5:
            case 6:
                return AbstractC7837l.crashlytics(d2, c14997l.crashlytics);
            case 7:
                return AbstractC7837l.crashlytics(d2, 48.0d);
            case 8:
                double d4 = (d2 - 50.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return AbstractC7837l.crashlytics(d4, 48.0d);
            default:
                C18725l.billing();
                return null;
        }
    }

    public C4608l pro() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "surface_dim";
        c15855l.f31105l = new C9156l(15);
        c15855l.f31112l = new C9156l(16);
        c15855l.f31109l = true;
        return c15855l.yandex();
    }

    public C8723l purchase(int i, C14997l c14997l, boolean z, int i2, double d) {
        double d2 = c14997l.loadAd;
        switch (AbstractC5020l.inmobi(i)) {
            case 0:
                return AbstractC7837l.crashlytics(d2, 0.0d);
            case 1:
                return AbstractC7837l.crashlytics(d2, 2.0d);
            case 2:
                return AbstractC7837l.crashlytics(d2, 6.0d);
            case 3:
                return AbstractC7837l.crashlytics(d2, 10.0d);
            case 4:
                double d3 = (d2 + 15.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return AbstractC7837l.crashlytics(d3, 8.0d);
            case 5:
            case 6:
                return AbstractC7837l.crashlytics(d2, c14997l.crashlytics / 8.0d);
            case 7:
                return AbstractC7837l.crashlytics(d2, 0.0d);
            case 8:
                return AbstractC7837l.crashlytics(d2, 10.0d);
            default:
                C18725l.billing();
                return null;
        }
    }

    public C4608l signatures() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "tertiary_fixed_dim";
        c15855l.f31105l = new C2928l(27);
        c15855l.f31112l = new C2928l(28);
        c15855l.f31109l = true;
        c15855l.f31114l = new C17847l(1, this, C6167l.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 10);
        c15855l.f31107l = new C2928l(29);
        c15855l.f31113l = new C12495l(this, 13);
        return c15855l.yandex();
    }

    public C4608l smaato() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "inverse_surface";
        c15855l.f31105l = new C2928l(4);
        c15855l.f31112l = new C2928l(13);
        c15855l.f31109l = true;
        return c15855l.yandex();
    }

    public C4608l startapp() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "primary_fixed";
        c15855l.f31105l = new C8864l(28);
        c15855l.f31112l = new C8864l(29);
        c15855l.f31109l = true;
        c15855l.f31114l = new C17847l(1, this, C6167l.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 1);
        c15855l.f31107l = new C0276l(0);
        c15855l.f31113l = new C12495l(this, 3);
        return c15855l.yandex();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0239  */
    /* JADX WARN: Code duplicated, block: B:132:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2 A[LOOP:5: B:43:0x00f0->B:44:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Code duplicated, block: B:53:0x0115 A[LOOP:7: B:52:0x0113->B:53:0x0115, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0121  */
    public C8723l subs(int i, C14997l c14997l, boolean z, int i2, double d) {
        C14997l c14997l2;
        double dAbs;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        int i6;
        int size;
        int size2;
        double d2 = c14997l.loadAd;
        boolean z2 = false;
        double d3 = 0.0d;
        switch (AbstractC5020l.inmobi(i)) {
            case 0:
                return AbstractC7837l.crashlytics(d2, 0.0d);
            case 1:
                return AbstractC7837l.crashlytics(d2, 16.0d);
            case 2:
            case 7:
                double d4 = (d2 + 60.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return AbstractC7837l.crashlytics(d4, 24.0d);
            case 3:
                return AbstractC7837l.crashlytics(AbstractC18219l.tapsense(c14997l, new double[]{0.0d, 41.0d, 61.0d, 101.0d, 131.0d, 181.0d, 251.0d, 301.0d, 360.0d}, new double[]{35.0d, 30.0d, 20.0d, 25.0d, 30.0d, 35.0d, 30.0d, 25.0d, 25.0d}), 32.0d);
            case 4:
                return AbstractC7837l.crashlytics(AbstractC18219l.tapsense(c14997l, new double[]{0.0d, 21.0d, 51.0d, 121.0d, 151.0d, 191.0d, 271.0d, 321.0d, 360.0d}, new double[]{120.0d, 120.0d, 20.0d, 45.0d, 20.0d, 15.0d, 20.0d, 120.0d, 120.0d}), 32.0d);
            case 5:
                C17914l c17914l = new C17914l(c14997l);
                C14997l c14997l3 = c17914l.loadAd;
                if (c14997l3 == null) {
                    double d5 = ((C14997l) c17914l.loadAd().get(0)).loadAd;
                    double dDoubleValue = ((Number) ((HashMap) c17914l.amazon()).get((C14997l) c17914l.loadAd().get(0))).doubleValue();
                    double d6 = c17914l.purchase().loadAd;
                    double dDoubleValue2 = ((Number) ((HashMap) c17914l.amazon()).get(c17914l.purchase())).doubleValue() - dDoubleValue;
                    if (d5 >= d6 ? d5 <= d2 || d2 <= d6 : d5 <= d2 && d2 <= d6) {
                        z2 = true;
                    }
                    double d7 = z2 ? d6 : d5;
                    if (!z2) {
                        d5 = d6;
                    }
                    C14997l c14997l4 = (C14997l) ((ArrayList) c17914l.yandex()).get((int) Math.rint(d2));
                    double dCrashlytics = 1.0d - c17914l.crashlytics(c14997l);
                    double d8 = 1000.0d;
                    double d9 = 0.0d;
                    while (d9 <= 360.0d) {
                        double d10 = ((1.0d * d9) + d7) % 360.0d;
                        if (d10 < d3) {
                            d10 += 360.0d;
                        }
                        if (d7 < d5) {
                            if (d7 > d10 || d10 > d5) {
                                d9 += 1.0d;
                            } else {
                                double d11 = d3;
                                c14997l2 = (C14997l) ((ArrayList) c17914l.yandex()).get((int) Math.rint(d10));
                                dAbs = Math.abs(dCrashlytics - ((((Number) ((HashMap) c17914l.amazon()).get(c14997l2)).doubleValue() - dDoubleValue) / dDoubleValue2));
                                if (dAbs < d8) {
                                    c14997l4 = c14997l2;
                                    d8 = dAbs;
                                }
                                d9 += 1.0d;
                                d3 = d11;
                            }
                        } else if (d7 <= d10 || d10 <= d5) {
                            double d12 = d3;
                            c14997l2 = (C14997l) ((ArrayList) c17914l.yandex()).get((int) Math.rint(d10));
                            dAbs = Math.abs(dCrashlytics - ((((Number) ((HashMap) c17914l.amazon()).get(c14997l2)).doubleValue() - dDoubleValue) / dDoubleValue2));
                            if (dAbs < d8) {
                                c14997l4 = c14997l2;
                                d8 = dAbs;
                            }
                            d9 += 1.0d;
                            d3 = d12;
                        } else {
                            d9 += 1.0d;
                        }
                    }
                    c17914l.loadAd = c14997l4;
                    c14997l3 = c14997l4;
                }
                C14997l c14997lLoadAd = AbstractC18648l.loadAd(c14997l3);
                return new C8723l(c14997lLoadAd.loadAd, c14997lLoadAd.crashlytics, c14997lLoadAd);
            case 6:
                C17914l c17914l2 = new C17914l(c14997l);
                int iRint = (int) Math.rint(d2);
                C14997l c14997l5 = (C14997l) ((ArrayList) c17914l2.yandex()).get(iRint);
                double dCrashlytics2 = c17914l2.crashlytics(c14997l5);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(c14997l5);
                int i7 = 0;
                double dAbs2 = 0.0d;
                while (i7 < 360) {
                    int i8 = (iRint + i7) % 360;
                    if (i8 < 0) {
                        i8 += 360;
                    }
                    double dCrashlytics3 = c17914l2.crashlytics((C14997l) ((ArrayList) c17914l2.yandex()).get(i8));
                    dAbs2 += Math.abs(dCrashlytics3 - dCrashlytics2);
                    i7++;
                    dCrashlytics2 = dCrashlytics3;
                }
                double d13 = dAbs2 / 6.0d;
                double dCrashlytics4 = c17914l2.crashlytics(c14997l5);
                int i9 = 1;
                while (arrayList2.size() < 6) {
                    int i10 = (iRint + i9) % 360;
                    if (i10 < 0) {
                        i10 += 360;
                    }
                    C14997l c14997l6 = (C14997l) ((ArrayList) c17914l2.yandex()).get(i10);
                    double dCrashlytics5 = c17914l2.crashlytics(c14997l6);
                    double dAbs3 = d3 + Math.abs(dCrashlytics5 - dCrashlytics4);
                    boolean z3 = dAbs3 >= ((double) arrayList2.size()) * d13;
                    int i11 = 1;
                    while (z3 && arrayList2.size() < 6) {
                        arrayList2.add(c14997l6);
                        double d14 = dAbs3;
                        z3 = d14 >= ((double) (arrayList2.size() + i11)) * d13;
                        i11++;
                        dAbs3 = d14;
                    }
                    double d15 = dAbs3;
                    i9++;
                    if (i9 > 360) {
                        while (arrayList2.size() < 6) {
                            arrayList2.add(c14997l6);
                        }
                        arrayList = new ArrayList();
                        arrayList.add(c14997l);
                        int iFloor = (int) Math.floor(1.0d);
                        i3 = iFloor + 1;
                        for (i4 = 1; i4 < i3; i4++) {
                            size2 = 0 - i4;
                            while (size2 < 0) {
                                size2 += arrayList2.size();
                            }
                            if (size2 >= arrayList2.size()) {
                                size2 %= arrayList2.size();
                            }
                            arrayList.add(0, arrayList2.get(size2));
                        }
                        i5 = 3 - iFloor;
                        for (i6 = 1; i6 < i5; i6++) {
                            size = i6;
                            while (size < 0) {
                                size += arrayList2.size();
                            }
                            if (size >= arrayList2.size()) {
                                size %= arrayList2.size();
                            }
                            arrayList.add(arrayList2.get(size));
                        }
                        C14997l c14997lLoadAd2 = AbstractC18648l.loadAd((C14997l) arrayList.get(2));
                        return new C8723l(c14997lLoadAd2.loadAd, c14997lLoadAd2.crashlytics, c14997lLoadAd2);
                    }
                    d3 = d15;
                    dCrashlytics4 = dCrashlytics5;
                }
                arrayList = new ArrayList();
                arrayList.add(c14997l);
                int iFloor2 = (int) Math.floor(1.0d);
                i3 = iFloor2 + 1;
                while (i4 < i3) {
                    size2 = 0 - i4;
                    while (size2 < 0) {
                        size2 += arrayList2.size();
                    }
                    if (size2 >= arrayList2.size()) {
                        size2 %= arrayList2.size();
                    }
                    arrayList.add(0, arrayList2.get(size2));
                }
                i5 = 3 - iFloor2;
                while (i6 < i5) {
                    size = i6;
                    while (size < 0) {
                        size += arrayList2.size();
                    }
                    if (size >= arrayList2.size()) {
                        size %= arrayList2.size();
                    }
                    arrayList.add(arrayList2.get(size));
                }
                C14997l c14997lLoadAd3 = AbstractC18648l.loadAd((C14997l) arrayList.get(2));
                return new C8723l(c14997lLoadAd3.loadAd, c14997lLoadAd3.crashlytics, c14997lLoadAd3);
            case 8:
                return AbstractC7837l.crashlytics(d2, 36.0d);
            default:
                C18725l.billing();
                return null;
        }
    }

    public C4608l subscription() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "secondary_container";
        c15855l.f31105l = new C2928l(23);
        c15855l.f31112l = new C2928l(this);
        c15855l.f31109l = true;
        c15855l.f31114l = new C17847l(1, this, C6167l.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 4);
        c15855l.f31107l = new C2928l(26);
        c15855l.f31113l = new C12495l(this, 12);
        return c15855l.yandex();
    }

    public C4608l tapsense() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "secondary_fixed";
        c15855l.f31105l = new C1373l(18);
        c15855l.f31112l = new C1373l(19);
        c15855l.f31109l = true;
        c15855l.f31114l = new C17847l(1, this, C6167l.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 5);
        c15855l.f31107l = new C1373l(20);
        c15855l.f31113l = new C12495l(this, 9);
        return c15855l.yandex();
    }

    public C4608l vip() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "primary";
        c15855l.f31105l = new C8864l(23);
        c15855l.f31112l = new C8864l(24);
        c15855l.f31109l = true;
        c15855l.f31114l = new C2176l(1, this, C6167l.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 29);
        c15855l.f31107l = new C8864l(25);
        c15855l.f31113l = new C12495l(this, 1);
        return c15855l.yandex();
    }

    public C4608l yandex() {
        C15855l c15855l = new C15855l();
        c15855l.f31108l = "error";
        c15855l.f31105l = new C9156l(17);
        c15855l.f31112l = new C9156l(18);
        c15855l.f31109l = true;
        c15855l.f31114l = new C2176l(1, this, C6167l.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 0, 24);
        c15855l.f31107l = new C9156l(19);
        c15855l.f31113l = new C12495l(this, 6);
        return c15855l.yandex();
    }
}
