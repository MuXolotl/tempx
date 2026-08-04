package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّؑٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0276l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1274l;

    public /* synthetic */ C0276l(int i) {
        this.f1274l = i;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0142  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        double d;
        double d2;
        double d3;
        double d4;
        int i = this.f1274l;
        double dYandex = 0.0d;
        double d5 = 100.0d;
        double d6 = 10.0d;
        C9714l c9714l = AbstractC18296l.yandex;
        switch (i) {
            case 0:
                return new C9193l(1.0d, 1.0d, 3.0d, 4.5d);
            case 1:
                return ((C0187l) obj).mopub;
            case 2:
                return Double.valueOf(((C0187l) obj).loadAd != 1 ? 30.0d : 90.0d);
            case 3:
                return c9714l.signatures();
            case 4:
                return c9714l.isVip();
            case 5:
                return new C9193l(3.0d, 4.5d, 7.0d, 11.0d);
            case 6:
                return ((C0187l) obj).mopub;
            case 7:
                C0187l c0187l = (C0187l) obj;
                boolean z2 = c0187l.crashlytics;
                if (c0187l.loadAd == 1) {
                    if (!z2) {
                        dYandex = 100.0d;
                    }
                } else if (C6167l.remoteconfig(c0187l)) {
                    dYandex = AbstractC11784l.yandex(((Number) c9714l.advert().crashlytics.invoke(c0187l)).doubleValue(), 4.5d);
                } else {
                    dYandex = z2 ? 90.0d : 30.0d;
                }
                return Double.valueOf(dYandex);
            case 8:
                return c9714l.advert();
            case 9:
                return new C9193l(3.0d, 4.5d, 7.0d, 11.0d);
            case 10:
                return ((C0187l) obj).billing;
            case 11:
                return ((C0187l) obj).firebase;
            case 12:
                C0187l c0187l2 = (C0187l) obj;
                z = c0187l2.loadAd == 1;
                boolean z3 = c0187l2.crashlytics;
                if (z) {
                    if (z3) {
                        d6 = 90.0d;
                    }
                } else if (z3) {
                    d6 = 90.0d;
                } else {
                    d6 = 30.0d;
                }
                return Double.valueOf(d6);
            case 13:
                return c9714l.loadAd();
            case 14:
                return new C9193l(3.0d, 4.5d, 7.0d, 11.0d);
            case 15:
                return ((C0187l) obj).admob;
            case 16:
                C0187l c0187l3 = (C0187l) obj;
                if (c0187l3.crashlytics) {
                    double d7 = c0187l3.amazon;
                    d = 24.0d;
                    if (d7 > -1.0d) {
                        if (d7 < 0.0d) {
                            d2 = (d7 - (-1.0d)) / 1.0d;
                            d3 = (1.0d - d2) * 24.0d;
                        } else if (d7 < 0.5d) {
                            double d8 = (d7 - 0.0d) / 0.5d;
                            d3 = (1.0d - d8) * 24.0d;
                            d4 = d8 * 29.0d;
                            d = d4 + d3;
                        } else {
                            d = 34.0d;
                            if (d7 < 1.0d) {
                                d2 = (d7 - 0.5d) / 0.5d;
                                d3 = (1.0d - d2) * 29.0d;
                            }
                        }
                        d4 = d2 * d;
                        d = d4 + d3;
                    }
                } else {
                    d = 98.0d;
                }
                return Double.valueOf(d);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C0187l) obj).mopub;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return Double.valueOf(((C0187l) obj).loadAd != 1 ? 10.0d : 100.0d);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return c9714l.signatures();
            case 20:
                return c9714l.isVip();
            case 21:
                return Double.valueOf(((C0187l) obj).crashlytics ? 80.0d : 40.0d);
            case 22:
                return new C9193l(4.5d, 7.0d, 11.0d, 21.0d);
            case 23:
                return ((C0187l) obj).mopub;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C0187l c0187l4 = (C0187l) obj;
                z = c0187l4.loadAd == 1;
                boolean z4 = c0187l4.crashlytics;
                if (z) {
                    d5 = z4 ? 10.0d : 90.0d;
                } else if (z4) {
                    d5 = 20.0d;
                }
                return Double.valueOf(d5);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return c9714l.ad();
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C9193l(4.5d, 7.0d, 11.0d, 21.0d);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C0187l) obj).subs;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return Double.valueOf(((C0187l) obj).crashlytics ? 80.0d : 30.0d);
            default:
                return new C9193l(3.0d, 4.5d, 7.0d, 11.0d);
        }
    }
}
