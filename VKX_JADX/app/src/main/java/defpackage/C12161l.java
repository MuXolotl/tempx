package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِ۟ۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12161l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24170l;

    public /* synthetic */ C12161l(int i) {
        this.f24170l = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double d;
        double d2;
        double dTapsense;
        int i = this.f24170l;
        double d3 = 95.0d;
        double d4 = 2.3d;
        double d5 = 92.0d;
        C9714l c9714l = AbstractC18296l.yandex;
        double dTapsense2 = 90.0d;
        switch (i) {
            case 0:
                return ((C0187l) obj).admob;
            case 1:
                C0187l c0187l = (C0187l) obj;
                if (c0187l.isPro != 1) {
                    d = 20.0d;
                } else if (c0187l.crashlytics) {
                    d = 9.0d;
                } else if (c0187l.admob.crashlytics.loadAd()) {
                    d = 96.0d;
                } else {
                    d = c0187l.loadAd == 4 ? 92.0d : 94.0d;
                }
                return Double.valueOf(d);
            case 2:
                C0187l c0187l2 = (C0187l) obj;
                Double dValueOf = Double.valueOf(1.6d);
                if (c0187l2.isPro == 1) {
                    int i2 = c0187l2.loadAd;
                    if (i2 == 2) {
                        return dValueOf;
                    }
                    if (i2 == 3) {
                        return Double.valueOf(1.4d);
                    }
                    if (i2 == 5) {
                        return c0187l2.admob.crashlytics.loadAd() ? dValueOf : Double.valueOf(1.3d);
                    }
                    if (i2 == 4) {
                        return Double.valueOf(1.15d);
                    }
                }
                return Double.valueOf(1.0d);
            case 3:
                return ((C0187l) obj).billing;
            case 4:
                return ((C0187l) obj).admob;
            case 5:
                C0187l c0187l3 = (C0187l) obj;
                if (c0187l3.crashlytics) {
                    d5 = 15.0d;
                } else if (!c0187l3.admob.crashlytics.loadAd()) {
                    d5 = c0187l3.loadAd == 4 ? 88.0d : 90.0d;
                }
                return Double.valueOf(d5);
            case 6:
                C0187l c0187l4 = (C0187l) obj;
                int i3 = c0187l4.loadAd;
                if (i3 == 2) {
                    return Double.valueOf(2.2d);
                }
                if (i3 == 3) {
                    return Double.valueOf(1.7d);
                }
                if (i3 == 5) {
                    return c0187l4.admob.crashlytics.loadAd() ? Double.valueOf(2.3d) : Double.valueOf(1.6d);
                }
                return i3 == 4 ? Double.valueOf(1.29d) : Double.valueOf(1.0d);
            case 7:
                return ((C0187l) obj).purchase;
            case 8:
                return c9714l.adcel();
            case 9:
                return C15718l.amazon(7.0d);
            case 10:
                return ((C0187l) obj).admob;
            case 11:
                C0187l c0187l5 = (C0187l) obj;
                if (c0187l5.isPro != 1) {
                    d3 = 15.0d;
                } else if (c0187l5.crashlytics) {
                    d3 = 6.0d;
                } else if (c0187l5.admob.crashlytics.loadAd()) {
                    d3 = 98.0d;
                } else if (c0187l5.loadAd != 4) {
                    d3 = 96.0d;
                }
                return Double.valueOf(d3);
            case 12:
                C0187l c0187l6 = (C0187l) obj;
                Double dValueOf2 = Double.valueOf(1.3d);
                if (c0187l6.isPro == 1) {
                    int i4 = c0187l6.loadAd;
                    if (i4 == 2) {
                        return dValueOf2;
                    }
                    if (i4 == 3) {
                        return Double.valueOf(1.25d);
                    }
                    if (i4 == 5) {
                        return c0187l6.admob.crashlytics.loadAd() ? dValueOf2 : Double.valueOf(1.15d);
                    }
                    if (i4 == 4) {
                        return Double.valueOf(1.08d);
                    }
                }
                return Double.valueOf(1.0d);
            case 13:
                return ((C0187l) obj).admob;
            case 14:
                C0187l c0187l7 = (C0187l) obj;
                C8723l c8723l = c0187l7.billing;
                boolean z = c0187l7.crashlytics;
                int i5 = c0187l7.isPro;
                int i6 = c0187l7.loadAd;
                if (i5 == 2) {
                    if (i6 != 2) {
                        dTapsense2 = C15718l.tapsense(c8723l, 0.0d, 90.0d);
                    }
                } else if (i6 == 2) {
                    dTapsense2 = z ? C15718l.Signature(c8723l, 0.0d, 98.0d) : C15718l.tapsense(c8723l, 0.0d, 100.0d);
                } else if (i6 == 4) {
                    dTapsense2 = C15718l.tapsense(c8723l, 0.0d, z ? 90 : 98);
                } else {
                    dTapsense2 = z ? 80.0d : C15718l.tapsense(c8723l, 0.0d, 100.0d);
                }
                return Double.valueOf(dTapsense2);
            case 15:
                return Double.valueOf(((C0187l) obj).crashlytics ? 98.0d : 4.0d);
            case 16:
                return ((C0187l) obj).admob;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C0187l c0187l8 = (C0187l) obj;
                if (c0187l8.isPro != 1) {
                    d2 = 25.0d;
                } else if (c0187l8.crashlytics) {
                    d2 = 12.0d;
                } else if (c0187l8.admob.crashlytics.loadAd()) {
                    d2 = 94.0d;
                } else {
                    d2 = c0187l8.loadAd == 4 ? 90.0d : 92.0d;
                }
                return Double.valueOf(d2);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C0187l c0187l9 = (C0187l) obj;
                if (c0187l9.isPro == 1) {
                    int i7 = c0187l9.loadAd;
                    if (i7 == 2) {
                        return Double.valueOf(1.9d);
                    }
                    if (i7 == 3) {
                        return Double.valueOf(1.5d);
                    }
                    if (i7 == 5) {
                        return c0187l9.admob.crashlytics.loadAd() ? Double.valueOf(1.95d) : Double.valueOf(1.45d);
                    }
                    if (i7 == 4) {
                        return Double.valueOf(1.22d);
                    }
                }
                return Double.valueOf(1.0d);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C0187l) obj).billing;
            case 20:
                return c9714l.Signature();
            case 21:
                return C15718l.amazon(4.5d);
            case 22:
                return ((C0187l) obj).firebase;
            case 23:
                return c9714l.loadAd();
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C0187l) obj).isPro == 1 ? C15718l.amazon(4.5d) : C15718l.amazon(7.0d);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C0187l) obj).billing;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C0187l c0187l10 = (C0187l) obj;
                C8723l c8723l2 = c0187l10.billing;
                boolean z2 = c0187l10.crashlytics;
                if (c0187l10.isPro == 2) {
                    dTapsense = 30.0d;
                } else {
                    int i8 = c0187l10.loadAd;
                    if (i8 == 4) {
                        dTapsense = z2 ? C15718l.Signature(c8723l2, 30.0d, 40.0d) : C15718l.tapsense(c8723l2, 84.0d, 90.0d);
                    } else if (i8 == 5) {
                        dTapsense = z2 ? 15.0d : C15718l.tapsense(c8723l2, 90.0d, 95.0d);
                    } else {
                        dTapsense = z2 ? 25.0d : 90.0d;
                    }
                }
                return Double.valueOf(dTapsense);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C0187l c0187l11 = (C0187l) obj;
                if (c0187l11.isPro != 1 || c0187l11.amazon <= 0.0d) {
                    return null;
                }
                return C15718l.amazon(1.5d);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C0187l) obj).admob;
            default:
                C0187l c0187l12 = (C0187l) obj;
                if (c0187l12.isPro != 1) {
                    return Double.valueOf(1.0d);
                }
                int i9 = c0187l12.loadAd;
                if (i9 == 2) {
                    d4 = 2.2d;
                } else if (i9 == 3) {
                    d4 = 1.7d;
                } else if (i9 != 5) {
                    d4 = 1.0d;
                } else if (!c0187l12.admob.crashlytics.loadAd()) {
                    d4 = 1.6d;
                } else if (c0187l12.crashlytics) {
                    d4 = 3.0d;
                }
                return Double.valueOf(d4);
        }
    }
}
