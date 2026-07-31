package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍٗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C17018l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33158l;

    public /* synthetic */ C17018l(int i) {
        this.f33158l = i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double d;
        double d2;
        double dTapsense;
        int i = this.f33158l;
        C9714l c9714l = AbstractC18296l.yandex;
        double dTapsense2 = 90.0d;
        switch (i) {
            case 0:
                C0187l c0187l = (C0187l) obj;
                if (c0187l.isPro != 1) {
                    return Double.valueOf(1.0d);
                }
                int i2 = c0187l.loadAd;
                if (i2 == 2) {
                    d = 2.2d;
                } else if (i2 == 3) {
                    d = 1.7d;
                } else if (i2 != 5) {
                    d = i2 == 4 ? 1.29d : 1.0d;
                } else if (c0187l.admob.crashlytics.loadAd()) {
                    d = c0187l.crashlytics ? 3.0d : 2.3d;
                } else {
                    d = 1.6d;
                }
                return Double.valueOf(d);
            case 1:
                C0187l c0187l2 = (C0187l) obj;
                if (c0187l2.isPro == 1) {
                    return c0187l2.crashlytics ? c9714l.license() : c9714l.pro();
                }
                return c9714l.inmobi();
            case 2:
                return ((C0187l) obj).isPro == 1 ? C15718l.amazon(1.5d) : C15718l.amazon(3.0d);
            case 3:
                return ((C0187l) obj).admob;
            case 4:
                C0187l c0187l3 = (C0187l) obj;
                if (c0187l3.crashlytics) {
                    d2 = 18.0d;
                } else if (c0187l3.admob.crashlytics.loadAd()) {
                    d2 = 99.0d;
                } else {
                    d2 = c0187l3.loadAd == 4 ? 97.0d : 98.0d;
                }
                return Double.valueOf(d2);
            case 5:
                C0187l c0187l4 = (C0187l) obj;
                if (c0187l4.crashlytics) {
                    int i3 = c0187l4.loadAd;
                    if (i3 == 2) {
                        return Double.valueOf(2.5d);
                    }
                    if (i3 == 3) {
                        return Double.valueOf(1.7d);
                    }
                    if (i3 == 5) {
                        return c0187l4.admob.crashlytics.loadAd() ? Double.valueOf(2.7d) : Double.valueOf(1.75d);
                    }
                    if (i3 == 4) {
                        return Double.valueOf(1.36d);
                    }
                }
                return Double.valueOf(1.0d);
            case 6:
                return ((C0187l) obj).mopub;
            case 7:
                return c9714l.signatures();
            case 8:
                return ((C0187l) obj).billing;
            case 9:
                return C15718l.amazon(4.5d);
            case 10:
                return ((C0187l) obj).billing;
            case 11:
                return c9714l.Signature();
            case 12:
                return C15718l.amazon(7.0d);
            case 13:
                return ((C0187l) obj).billing;
            case 14:
                C0187l c0187l5 = (C0187l) obj;
                return Double.valueOf(c0187l5.loadAd == 2 ? 85.0d : C15718l.tapsense(c0187l5.billing, 0.0d, 90.0d));
            case 15:
                return C15718l.amazon(4.5d);
            case 16:
                return ((C0187l) obj).mopub;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C0187l) obj).isPro == 1 ? c9714l.ads() : c9714l.appmetrica();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C0187l c0187l6 = (C0187l) obj;
                int i4 = c0187l6.loadAd;
                C8723l c8723l = c0187l6.mopub;
                return Double.valueOf(i4 == 3 ? C15718l.tapsense(c8723l, 0.0d, 90.0d) : C15718l.tapsense(c8723l, 0.0d, 100.0d));
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return C15718l.amazon(4.5d);
            case 20:
                return ((C0187l) obj).purchase;
            case 21:
                C0187l c0187l7 = (C0187l) obj;
                int i5 = c0187l7.loadAd;
                if (i5 == 2) {
                    dTapsense = 85.0d;
                } else {
                    C8723l c8723l2 = c0187l7.purchase;
                    dTapsense = i5 == 3 ? C15718l.tapsense(c8723l2, 0.0d, 90.0d) : C15718l.tapsense(c8723l2, 0.0d, 100.0d);
                }
                return Double.valueOf(dTapsense);
            case 22:
                return C15718l.amazon(4.5d);
            case 23:
                return ((C0187l) obj).firebase;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C0187l) obj).isPro == 1 ? C15718l.amazon(6.0d) : C15718l.amazon(7.0d);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return Double.valueOf(C15718l.Signature(((C0187l) obj).firebase, 0.0d, 100.0d));
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return C15718l.amazon(4.5d);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C0187l) obj).purchase;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C0187l c0187l8 = (C0187l) obj;
                C8723l c8723l3 = c0187l8.purchase;
                boolean z = c0187l8.crashlytics;
                int i6 = c0187l8.isPro;
                int i7 = c0187l8.loadAd;
                if (i7 == 2) {
                    if (i6 == 1) {
                        if (z) {
                            dTapsense2 = 80.0d;
                        } else {
                            dTapsense2 = 40.0d;
                        }
                    }
                } else if (i7 != 3) {
                    int i8 = 98;
                    if (i7 == 5) {
                        if (i6 == 1) {
                            if (c8723l3.crashlytics.loadAd()) {
                                i8 = 25;
                            } else if (c8723l3.crashlytics.yandex()) {
                                i8 = 88;
                            }
                            dTapsense2 = C15718l.tapsense(c8723l3, 0.0d, i8);
                        } else {
                            dTapsense2 = C15718l.tapsense(c8723l3, 0.0d, 100.0d);
                        }
                    } else if (i6 == 1) {
                        dTapsense2 = C15718l.tapsense(c8723l3, 0.0d, c8723l3.crashlytics.yandex() ? 88 : 98);
                    } else {
                        dTapsense2 = C15718l.tapsense(c8723l3, 0.0d, 100.0d);
                    }
                } else if (i6 != 1) {
                    dTapsense2 = C15718l.tapsense(c8723l3, 0.0d, 90.0d);
                } else if (z) {
                    dTapsense2 = 80.0d;
                } else {
                    dTapsense2 = C15718l.tapsense(c8723l3, 0.0d, 100.0d);
                }
                return Double.valueOf(dTapsense2);
            default:
                return ((C0187l) obj).isPro == 1 ? C15718l.amazon(4.5d) : C15718l.amazon(7.0d);
        }
    }
}
