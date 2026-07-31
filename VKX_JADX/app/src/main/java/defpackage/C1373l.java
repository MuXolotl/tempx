package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؒ۠ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1373l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3498l;

    public /* synthetic */ C1373l(int i) {
        this.f3498l = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        double d11;
        int i = this.f3498l;
        double dYandex = 100.0d;
        double d12 = 20.0d;
        C9714l c9714l = AbstractC18296l.yandex;
        switch (i) {
            case 0:
                return ((C0187l) obj).mopub;
            case 1:
                C0187l c0187l = (C0187l) obj;
                z = c0187l.loadAd == 1;
                boolean z2 = c0187l.crashlytics;
                if (z) {
                    d = z2 ? 90.0d : 25.0d;
                } else {
                    d = z2 ? 80.0d : 40.0d;
                }
                return Double.valueOf(d);
            case 2:
                return new C9193l(3.0d, 4.5d, 7.0d, 7.0d);
            case 3:
                return Double.valueOf(((C0187l) obj).crashlytics ? 30.0d : 90.0d);
            case 4:
                return ((C0187l) obj).firebase;
            case 5:
                return Double.valueOf(((C0187l) obj).crashlytics ? 30.0d : 90.0d);
            case 6:
                return new C9193l(1.0d, 1.0d, 3.0d, 4.5d);
            case 7:
                return ((C0187l) obj).purchase;
            case 8:
                C0187l c0187l2 = (C0187l) obj;
                if (C6167l.remoteconfig(c0187l2)) {
                    dYandex = AbstractC11784l.yandex(((Number) c9714l.metrica().crashlytics.invoke(c0187l2)).doubleValue(), 4.5d);
                } else {
                    z = c0187l2.loadAd == 1;
                    boolean z3 = c0187l2.crashlytics;
                    if (!z) {
                        dYandex = z3 ? 90.0d : 30.0d;
                    } else if (z3) {
                        dYandex = 0.0d;
                    }
                }
                return Double.valueOf(dYandex);
            case 9:
                return c9714l.metrica();
            case 10:
                return new C9193l(3.0d, 4.5d, 7.0d, 11.0d);
            case 11:
                return ((C0187l) obj).admob;
            case 12:
                C0187l c0187l3 = (C0187l) obj;
                double d13 = c0187l3.amazon;
                if (c0187l3.crashlytics) {
                    d2 = 17.0d;
                    if (d13 <= -1.0d) {
                        d4 = 17.0d;
                    } else if (d13 < 0.0d) {
                        d6 = (d13 - (-1.0d)) / 1.0d;
                        d7 = (1.0d - d6) * 17.0d;
                        d8 = d6 * d2;
                        d4 = d8 + d7;
                    } else {
                        d3 = 21.0d;
                        if (d13 < 0.5d) {
                            d5 = d13 - 0.0d;
                            double d14 = d5 / 0.5d;
                            d7 = (1.0d - d14) * d2;
                            d8 = d14 * d3;
                            d4 = d8 + d7;
                        } else if (d13 < 1.0d) {
                            double d15 = (d13 - 0.5d) / 0.5d;
                            d7 = (1.0d - d15) * 21.0d;
                            d8 = d15 * 25.0d;
                            d4 = d8 + d7;
                        } else {
                            d4 = 25.0d;
                        }
                    }
                } else if (d13 <= -1.0d) {
                    d4 = 92.0d;
                } else if (d13 < 0.0d) {
                    double d16 = (d13 - (-1.0d)) / 1.0d;
                    d7 = (1.0d - d16) * 92.0d;
                    d8 = d16 * 92.0d;
                    d4 = d8 + d7;
                } else {
                    d2 = 88.0d;
                    if (d13 < 0.5d) {
                        d6 = (d13 - 0.0d) / 0.5d;
                        d7 = (1.0d - d6) * 92.0d;
                        d8 = d6 * d2;
                        d4 = d8 + d7;
                    } else {
                        d3 = 85.0d;
                        if (d13 < 1.0d) {
                            d5 = d13 - 0.5d;
                            double d17 = d5 / 0.5d;
                            d7 = (1.0d - d17) * d2;
                            d8 = d17 * d3;
                            d4 = d8 + d7;
                        } else {
                            d4 = 85.0d;
                        }
                    }
                }
                return Double.valueOf(d4);
            case 13:
                return ((C0187l) obj).purchase;
            case 14:
                return ((C0187l) obj).admob;
            case 15:
                return Double.valueOf(((C0187l) obj).crashlytics ? 20.0d : 95.0d);
            case 16:
                return c9714l.smaato();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C9193l(4.5d, 7.0d, 11.0d, 21.0d);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C0187l) obj).billing;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return Double.valueOf(((C0187l) obj).loadAd != 1 ? 90.0d : 80.0d);
            case 20:
                return new C9193l(1.0d, 1.0d, 3.0d, 4.5d);
            case 21:
                return ((C0187l) obj).purchase;
            case 22:
                C0187l c0187l4 = (C0187l) obj;
                z = c0187l4.loadAd == 1;
                boolean z4 = c0187l4.crashlytics;
                if (z) {
                    dYandex = z4 ? 10.0d : 90.0d;
                } else if (z4) {
                    dYandex = 20.0d;
                }
                return Double.valueOf(dYandex);
            case 23:
                return Double.valueOf(((C0187l) obj).crashlytics ? 80.0d : 40.0d);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return c9714l.vip();
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C9193l(4.5d, 7.0d, 11.0d, 21.0d);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C0187l) obj).admob;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C0187l c0187l5 = (C0187l) obj;
                double d18 = c0187l5.amazon;
                if (!c0187l5.crashlytics) {
                    d12 = 94.0d;
                    if (d18 > -1.0d) {
                        if (d18 < 0.0d) {
                            d11 = (d18 - (-1.0d)) / 1.0d;
                            d9 = (1.0d - d11) * 94.0d;
                            d10 = d11 * d12;
                            d12 = d10 + d9;
                        } else {
                            if (d18 < 0.5d) {
                                double d19 = (d18 - 0.0d) / 0.5d;
                                d9 = (1.0d - d19) * 94.0d;
                                d10 = d19 * 92.0d;
                            } else if (d18 < 1.0d) {
                                double d20 = (d18 - 0.5d) / 0.5d;
                                d9 = (1.0d - d20) * 92.0d;
                                d10 = d20 * 90.0d;
                            } else {
                                d12 = 90.0d;
                            }
                            d12 = d10 + d9;
                        }
                    }
                } else if (d18 <= -1.0d) {
                    d12 = 12.0d;
                } else {
                    if (d18 < 0.0d) {
                        double d21 = (d18 - (-1.0d)) / 1.0d;
                        d9 = (1.0d - d21) * 12.0d;
                        d10 = d21 * 12.0d;
                    } else if (d18 < 0.5d) {
                        double d22 = (d18 - 0.0d) / 0.5d;
                        d9 = (1.0d - d22) * 12.0d;
                        d10 = d22 * 16.0d;
                    } else if (d18 < 1.0d) {
                        d11 = (d18 - 0.5d) / 0.5d;
                        d9 = (1.0d - d11) * 16.0d;
                        d10 = d11 * d12;
                    }
                    d12 = d10 + d9;
                }
                return Double.valueOf(d12);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C0187l) obj).subs;
            default:
                return Double.valueOf(((C0187l) obj).crashlytics ? 60.0d : 50.0d);
        }
    }
}
