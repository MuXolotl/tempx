package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌْۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9156l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18804l;

    public /* synthetic */ C9156l(C6167l c6167l) {
        this.f18804l = 7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        int i = this.f18804l;
        double d6 = 30.0d;
        double d7 = 0.0d;
        C9714l c9714l = AbstractC18296l.yandex;
        switch (i) {
            case 0:
                return ((C0187l) obj).purchase;
            case 1:
                return Double.valueOf(((C0187l) obj).loadAd == 1 ? 100.0d : 10.0d);
            case 2:
                return new C9193l(3.0d, 4.5d, 7.0d, 7.0d);
            case 3:
                return c9714l.adcel();
            case 4:
                return c9714l.startapp();
            case 5:
                return new C9193l(4.5d, 7.0d, 11.0d, 21.0d);
            case 6:
                return ((C0187l) obj).mopub;
            case 7:
                C0187l c0187l = (C0187l) obj;
                boolean z = c0187l.crashlytics;
                if (c0187l.loadAd == 1) {
                    d6 = z ? 60.0d : 49.0d;
                } else if (C6167l.remoteconfig(c0187l)) {
                    C8723l c8723l = c0187l.mopub;
                    d6 = AbstractC18648l.loadAd(new C14997l(AbstractC6889l.firebase(c8723l.yandex, c8723l.loadAd, c0187l.yandex.amazon))).amazon;
                } else if (!z) {
                    d6 = 90.0d;
                }
                return Double.valueOf(d6);
            case 8:
                return new C9193l(1.0d, 1.0d, 3.0d, 4.5d);
            case 9:
                return ((C0187l) obj).subs;
            case 10:
                return Double.valueOf(((C0187l) obj).crashlytics ? 30.0d : 80.0d);
            case 11:
                return new C9193l(1.0d, 1.0d, 3.0d, 4.5d);
            case 12:
                return ((C0187l) obj).admob;
            case 13:
                return Double.valueOf(0.0d);
            case 14:
                C0187l c0187l2 = (C0187l) obj;
                if (c0187l2.crashlytics) {
                    double d8 = c0187l2.amazon;
                    if (d8 <= -1.0d) {
                        d7 = 4.0d;
                    } else {
                        if (d8 < 0.0d) {
                            double d9 = (d8 - (-1.0d)) / 1.0d;
                            d = (1.0d - d9) * 4.0d;
                            d2 = d9 * 4.0d;
                        } else if (d8 < 0.5d) {
                            double d10 = (d8 - 0.0d) / 0.5d;
                            d = (1.0d - d10) * 4.0d;
                            d2 = d10 * 2.0d;
                        } else if (d8 < 1.0d) {
                            double d11 = (d8 - 0.5d) / 0.5d;
                            d = (1.0d - d11) * 2.0d;
                            d2 = d11 * 0.0d;
                        }
                        d7 = d2 + d;
                    }
                } else {
                    d7 = 100.0d;
                }
                return Double.valueOf(d7);
            case 15:
                return ((C0187l) obj).admob;
            case 16:
                C0187l c0187l3 = (C0187l) obj;
                if (c0187l3.crashlytics) {
                    d3 = 6.0d;
                } else {
                    double d12 = c0187l3.amazon;
                    if (d12 <= -1.0d) {
                        d3 = 87.0d;
                    } else {
                        if (d12 < 0.0d) {
                            double d13 = (d12 - (-1.0d)) / 1.0d;
                            d4 = (1.0d - d13) * 87.0d;
                            d5 = d13 * 87.0d;
                        } else if (d12 < 0.5d) {
                            double d14 = (d12 - 0.0d) / 0.5d;
                            d4 = (1.0d - d14) * 87.0d;
                            d5 = d14 * 80.0d;
                        } else if (d12 < 1.0d) {
                            double d15 = (d12 - 0.5d) / 0.5d;
                            d4 = (1.0d - d15) * 80.0d;
                            d5 = d15 * 75.0d;
                        } else {
                            d3 = 75.0d;
                        }
                        d3 = d5 + d4;
                    }
                }
                return Double.valueOf(d3);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C0187l) obj).firebase;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return Double.valueOf(((C0187l) obj).crashlytics ? 80.0d : 40.0d);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C9193l(3.0d, 4.5d, 7.0d, 7.0d);
            case 20:
                return ((C0187l) obj).billing;
            case 21:
                return Double.valueOf(10.0d);
            case 22:
                return c9714l.Signature();
            case 23:
                return ((C0187l) obj).subs;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return c9714l.tapsense();
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C9193l(4.5d, 7.0d, 11.0d, 21.0d);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C0187l) obj).firebase;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Double.valueOf(((C0187l) obj).crashlytics ? 20.0d : 100.0d);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return c9714l.yandex();
            default:
                return new C9193l(4.5d, 7.0d, 11.0d, 21.0d);
        }
    }

    public /* synthetic */ C9156l(int i) {
        this.f18804l = i;
    }
}
