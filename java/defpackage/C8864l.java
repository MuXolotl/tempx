package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌٙؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8864l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18223l;

    public /* synthetic */ C8864l(int i) {
        this.f18223l = i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c A[PHI: r10
  0x003c: PHI (r10v6 double) = (r10v0 double), (r10v7 double) binds: [B:32:0x0064, B:17:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double d;
        double d2;
        double d3;
        double d4;
        int i = this.f18223l;
        double d5 = 0.0d;
        C9714l c9714l = AbstractC18296l.yandex;
        switch (i) {
            case 0:
                ((C6148l) obj).crashlytics(0.6f);
                return Unit.INSTANCE;
            case 1:
                throw new IllegalStateException("Not intended to be parsed.");
            case 2:
                C12847l c12847l = (C12847l) obj;
                c12847l.yandex = false;
                c12847l.loadAd = true;
                c12847l.crashlytics = true;
                c12847l.amazon = true;
                c12847l.purchase = true;
                c12847l.billing = true;
                c12847l.mopub = true;
                c12847l.admob = true;
                c12847l.subs = true;
                c12847l.isPro = AbstractC10651l.yandex;
                return Unit.INSTANCE;
            case 3:
                ((C12847l) obj).yandex = true;
                return Unit.INSTANCE;
            case 4:
                return Boolean.valueOf(((C18402l) ((C8195l) obj).f17097l).yandex);
            case 5:
                return Integer.valueOf(((C17721l) obj).yandex.length());
            case 6:
                int i2 = ((C8119l) obj).yandex.loadAd;
                return null;
            case 7:
                return Unit.INSTANCE;
            case 8:
                C2507l c2507l = (C2507l) ((InterfaceC11189l) obj);
                c2507l.f5306l = false;
                AbstractC18037l.purchase(c2507l);
                return Boolean.FALSE;
            case 9:
                AbstractC3668l.remoteconfig((InterfaceC17593l) obj, 1);
                return Unit.INSTANCE;
            case 10:
                AbstractC3668l.remoteconfig((InterfaceC17593l) obj, 0);
                return Unit.INSTANCE;
            case 11:
                return ((C0187l) obj).admob;
            case 12:
                return c9714l.tapsense();
            case 13:
                return new C9193l(3.0d, 4.5d, 7.0d, 11.0d);
            case 14:
                return ((C0187l) obj).purchase;
            case 15:
                return Double.valueOf(((C0187l) obj).loadAd != 1 ? 30.0d : 90.0d);
            case 16:
                return c9714l.adcel();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return c9714l.startapp();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C9193l(3.0d, 4.5d, 7.0d, 11.0d);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C0187l) obj).mopub;
            case 20:
                return Double.valueOf(((C0187l) obj).loadAd == 1 ? 40.0d : 90.0d);
            case 21:
                return new C9193l(1.0d, 1.0d, 3.0d, 4.5d);
            case 22:
                return new C9193l(1.0d, 1.0d, 3.0d, 4.5d);
            case 23:
                return ((C0187l) obj).purchase;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C0187l c0187l = (C0187l) obj;
                boolean z = c0187l.loadAd == 1;
                boolean z2 = c0187l.crashlytics;
                if (!z) {
                    d5 = z2 ? 80.0d : 40.0d;
                } else if (z2) {
                    d5 = 100.0d;
                }
                return Double.valueOf(d5);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C9193l(3.0d, 4.5d, 7.0d, 7.0d);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C0187l) obj).admob;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C0187l c0187l2 = (C0187l) obj;
                double d6 = c0187l2.amazon;
                if (c0187l2.crashlytics) {
                    d = 10.0d;
                    if (d6 > -1.0d) {
                        if (d6 < 0.0d) {
                            d4 = (d6 - (-1.0d)) / 1.0d;
                            d2 = (1.0d - d4) * d;
                            d3 = d4 * d;
                            d = d3 + d2;
                        } else if (d6 < 0.5d) {
                            double d7 = (d6 - 0.0d) / 0.5d;
                            d2 = (1.0d - d7) * 10.0d;
                            d3 = d7 * 11.0d;
                            d = d3 + d2;
                        } else {
                            d = 12.0d;
                            if (d6 < 1.0d) {
                                d4 = (d6 - 0.5d) / 0.5d;
                                d2 = (1.0d - d4) * 11.0d;
                                d3 = d4 * d;
                                d = d3 + d2;
                            }
                        }
                    }
                } else {
                    d = 96.0d;
                    if (d6 > -1.0d) {
                        if (d6 < 0.0d) {
                            d4 = (d6 - (-1.0d)) / 1.0d;
                        } else if (d6 < 0.5d) {
                            d4 = (d6 - 0.0d) / 0.5d;
                        } else if (d6 < 1.0d) {
                            double d8 = (d6 - 0.5d) / 0.5d;
                            d2 = (1.0d - d8) * 96.0d;
                            d3 = d8 * 95.0d;
                            d = d3 + d2;
                        } else {
                            d = 95.0d;
                        }
                        d2 = (1.0d - d4) * d;
                        d3 = d4 * d;
                        d = d3 + d2;
                    }
                }
                return Double.valueOf(d);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C0187l) obj).purchase;
            default:
                return Double.valueOf(((C0187l) obj).loadAd == 1 ? 40.0d : 90.0d);
        }
    }
}
