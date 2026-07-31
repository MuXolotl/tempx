package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؔۜۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2928l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6381l;

    public /* synthetic */ C2928l(C6167l c6167l) {
        this.f6381l = 25;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x020d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:59:0x010e A[PHI: r10
  0x010e: PHI (r10v5 double) = (r10v0 double), (r10v6 double) binds: [B:72:0x0139, B:58:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x011e A[PHI: r7 r10
  0x011e: PHI (r7v2 double) = (r7v1 double), (r7v3 double) binds: [B:75:0x0140, B:62:0x011c] A[DONT_GENERATE, DONT_INLINE]
  0x011e: PHI (r10v3 double) = (r10v0 double), (r10v6 double) binds: [B:75:0x0140, B:62:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x018d  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        int i = this.f6381l;
        double dYandex = 10.0d;
        C9714l c9714l = AbstractC18296l.yandex;
        double d6 = 90.0d;
        double d7 = 30.0d;
        switch (i) {
            case 0:
                return new C9193l(1.5d, 3.0d, 4.5d, 7.0d);
            case 1:
                return ((C0187l) obj).purchase;
            case 2:
                return Double.valueOf(((C0187l) obj).loadAd == 1 ? 30.0d : 80.0d);
            case 3:
                return new C9193l(1.0d, 1.0d, 3.0d, 4.5d);
            case 4:
                return ((C0187l) obj).admob;
            case 5:
                return ((C0187l) obj).billing;
            case 6:
                return Double.valueOf(((C0187l) obj).loadAd == 1 ? 70.0d : 80.0d);
            case 7:
                return new C9193l(1.0d, 1.0d, 3.0d, 4.5d);
            case 8:
                return ((C0187l) obj).billing;
            case 9:
                C0187l c0187l = (C0187l) obj;
                boolean z = c0187l.crashlytics;
                if (c0187l.loadAd == 1) {
                    if (z) {
                        dYandex = 90.0d;
                    }
                } else if (C6167l.remoteconfig(c0187l)) {
                    dYandex = AbstractC11784l.yandex(((Number) c9714l.subscription().crashlytics.invoke(c0187l)).doubleValue(), 4.5d);
                } else if (z) {
                    dYandex = 90.0d;
                } else {
                    dYandex = 30.0d;
                }
                return Double.valueOf(dYandex);
            case 10:
                return c9714l.subscription();
            case 11:
                return new C9193l(3.0d, 4.5d, 7.0d, 11.0d);
            case 12:
                return ((C0187l) obj).purchase;
            case 13:
                return Double.valueOf(((C0187l) obj).crashlytics ? 90.0d : 20.0d);
            case 14:
                return Double.valueOf(((C0187l) obj).crashlytics ? 40.0d : 80.0d);
            case 15:
                return c9714l.smaato();
            case 16:
                return new C9193l(3.0d, 4.5d, 7.0d, 7.0d);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C0187l) obj).billing;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C0187l c0187l2 = (C0187l) obj;
                boolean z2 = c0187l2.loadAd == 1;
                boolean z3 = c0187l2.crashlytics;
                if (z2) {
                    if (z3) {
                        d = 10.0d;
                    } else {
                        d = 100.0d;
                    }
                } else if (z3) {
                    d = 20.0d;
                } else {
                    d = 100.0d;
                }
                return Double.valueOf(d);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return c9714l.ads();
            case 20:
                return new C9193l(4.5d, 7.0d, 11.0d, 21.0d);
            case 21:
                return ((C0187l) obj).admob;
            case 22:
                C0187l c0187l3 = (C0187l) obj;
                double d8 = c0187l3.amazon;
                if (c0187l3.crashlytics) {
                    d6 = 22.0d;
                    if (d8 > -1.0d) {
                        if (d8 < 0.0d) {
                            double d9 = (d8 - (-1.0d)) / 1.0d;
                            d3 = (1.0d - d9) * d6;
                            d4 = d9 * d6;
                        } else {
                            d2 = 26.0d;
                            if (d8 < 0.5d) {
                                double d10 = (d8 - 0.0d) / 0.5d;
                                d3 = (1.0d - d10) * d6;
                                d4 = d10 * d2;
                            } else if (d8 < 1.0d) {
                                double d11 = (d8 - 0.5d) / 0.5d;
                                d3 = (1.0d - d11) * 26.0d;
                                d4 = d11 * 30.0d;
                            } else {
                                d6 = 30.0d;
                            }
                        }
                        d6 = d4 + d3;
                    }
                } else if (d8 > -1.0d) {
                    if (d8 < 0.0d) {
                        double d12 = (d8 - (-1.0d)) / 1.0d;
                        d3 = (1.0d - d12) * d6;
                        d4 = d12 * d6;
                    } else {
                        d2 = 84.0d;
                        if (d8 < 0.5d) {
                            double d13 = (d8 - 0.0d) / 0.5d;
                            d3 = (1.0d - d13) * d6;
                            d4 = d13 * d2;
                        } else if (d8 < 1.0d) {
                            double d14 = (d8 - 0.5d) / 0.5d;
                            d3 = (1.0d - d14) * 84.0d;
                            d4 = d14 * 80.0d;
                        } else {
                            d6 = 80.0d;
                        }
                    }
                    d6 = d4 + d3;
                }
                return Double.valueOf(d6);
            case 23:
                return ((C0187l) obj).billing;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C0187l) obj).purchase;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C0187l c0187l4 = (C0187l) obj;
                boolean z4 = c0187l4.crashlytics;
                double d15 = z4 ? 30.0d : 90.0d;
                if (c0187l4.loadAd == 1) {
                    if (!z4) {
                        d7 = 85.0d;
                    }
                } else if (C6167l.remoteconfig(c0187l4)) {
                    C8723l c8723l = c0187l4.billing;
                    double d16 = c8723l.yandex;
                    double d17 = c8723l.loadAd;
                    C14997l c14997l = new C14997l(AbstractC6889l.firebase(d16, d17, d15));
                    double dMax = c14997l.crashlytics;
                    if (dMax < d17) {
                        d7 = d15;
                        while (true) {
                            double d18 = c14997l.crashlytics;
                            if (d18 < d17) {
                                d5 = d7 + (!z4 ? -1.0d : 1.0d);
                                double d19 = d16;
                                double d20 = d17;
                                C14997l c14997l2 = new C14997l(AbstractC6889l.firebase(d19, d20, d5));
                                double d21 = c14997l2.crashlytics;
                                if (dMax <= d21) {
                                    double d22 = d21 - d20;
                                    if (Math.abs(d22) >= 0.4d) {
                                        if (Math.abs(d22) < Math.abs(d18 - d20)) {
                                            c14997l = c14997l2;
                                        }
                                        dMax = Math.max(dMax, d21);
                                        d16 = d19;
                                        d17 = d20;
                                        d7 = d5;
                                    }
                                }
                            }
                        }
                        d7 = d5;
                    } else {
                        d7 = d15;
                    }
                } else {
                    d7 = d15;
                }
                return Double.valueOf(d7);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C9193l(1.0d, 1.0d, 3.0d, 4.5d);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C0187l) obj).mopub;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return Double.valueOf(((C0187l) obj).loadAd == 1 ? 30.0d : 80.0d);
            default:
                return new C9193l(1.0d, 1.0d, 3.0d, 4.5d);
        }
    }

    public /* synthetic */ C2928l(int i) {
        this.f6381l = i;
    }
}
