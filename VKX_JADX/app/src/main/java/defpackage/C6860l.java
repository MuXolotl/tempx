package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙۤٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6860l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14348l;

    public /* synthetic */ C6860l(C6167l c6167l) {
        this.f14348l = 3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double d;
        int i;
        double dTapsense;
        int i2 = this.f14348l;
        C9714l c9714l = AbstractC18296l.yandex;
        switch (i2) {
            case 0:
                return ((C0187l) obj).billing;
            case 1:
                return Double.valueOf(((C0187l) obj).loadAd == 1 ? 25.0d : 30.0d);
            case 2:
                return c9714l.Signature();
            case 3:
                C0187l c0187l = (C0187l) obj;
                if (C6167l.remoteconfig(c0187l)) {
                    d = c0187l.yandex.amazon;
                } else {
                    boolean z = c0187l.loadAd == 1;
                    boolean z2 = c0187l.crashlytics;
                    if (z) {
                        d = z2 ? 85.0d : 25.0d;
                    } else {
                        d = z2 ? 30.0d : 90.0d;
                    }
                }
                return Double.valueOf(d);
            case 4:
                return ((C0187l) obj).firebase;
            case 5:
                return ((C0187l) obj).purchase;
            case 6:
                return c9714l.adcel();
            case 7:
                return C15718l.amazon(4.5d);
            case 8:
                return ((C0187l) obj).admob;
            case 9:
                C0187l c0187l2 = (C0187l) obj;
                double d2 = 1.0d;
                if (c0187l2.isPro != 1) {
                    return Double.valueOf(1.0d);
                }
                int i3 = c0187l2.loadAd;
                if (i3 == 2) {
                    d2 = 2.2d;
                } else if (i3 == 3) {
                    d2 = 1.7d;
                } else if (i3 == 5) {
                    if (c0187l2.admob.crashlytics.loadAd()) {
                        d2 = c0187l2.crashlytics ? 3.0d : 2.3d;
                    } else {
                        d2 = 1.6d;
                    }
                }
                return Double.valueOf(d2);
            case 10:
                C0187l c0187l3 = (C0187l) obj;
                if (c0187l3.isPro == 1) {
                    return c0187l3.crashlytics ? c9714l.license() : c9714l.pro();
                }
                return c9714l.inmobi();
            case 11:
                C0187l c0187l4 = (C0187l) obj;
                if (c0187l4.isPro == 1) {
                    return c0187l4.crashlytics ? C15718l.amazon(6.0d) : C15718l.amazon(4.5d);
                }
                return C15718l.amazon(7.0d);
            case 12:
                return ((C0187l) obj).mopub;
            case 13:
                return ((C0187l) obj).mopub;
            case 14:
                return ((C0187l) obj).purchase;
            case 15:
                return ((C0187l) obj).isPro == 1 ? c9714l.vip() : c9714l.applovin();
            case 16:
                return ((C0187l) obj).isPro == 1 ? C15718l.amazon(6.0d) : C15718l.amazon(7.0d);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C0187l) obj).mopub;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C0187l c0187l5 = (C0187l) obj;
                C8723l c8723l = c0187l5.mopub;
                boolean z3 = c0187l5.crashlytics;
                int i4 = c0187l5.isPro;
                int i5 = c0187l5.loadAd;
                if (i4 == 2) {
                    dTapsense = i5 == 3 ? C15718l.tapsense(c8723l, 0.0d, 90.0d) : C15718l.tapsense(c8723l, 0.0d, 100.0d);
                } else if (i5 == 5 || i5 == 4) {
                    if (c8723l.crashlytics.yandex()) {
                        i = 88;
                    } else {
                        i = z3 ? 98 : 100;
                    }
                    dTapsense = C15718l.tapsense(c8723l, 0.0d, i);
                } else {
                    dTapsense = z3 ? C15718l.tapsense(c8723l, 0.0d, 98.0d) : C15718l.tapsense(c8723l, 0.0d, 100.0d);
                }
                return Double.valueOf(dTapsense);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C0187l) obj).isPro == 1 ? C15718l.amazon(4.5d) : C15718l.amazon(7.0d);
            case 20:
                return ((C0187l) obj).billing;
            case 21:
                return c9714l.signatures();
            case 22:
                return ((C0187l) obj).purchase;
            case 23:
                return ((C0187l) obj).billing;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C0187l c0187l6 = (C0187l) obj;
                if (c0187l6.isPro != 1 || c0187l6.amazon <= 0.0d) {
                    return null;
                }
                return C15718l.amazon(1.5d);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C0187l) obj).firebase;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C0187l) obj).isPro == 1 ? c9714l.yandex() : c9714l.premium();
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return C15718l.amazon(7.0d);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C0187l) obj).isPro == 1 ? C15718l.amazon(6.0d) : C15718l.amazon(7.0d);
            default:
                return ((C0187l) obj).admob;
        }
    }

    public /* synthetic */ C6860l(int i) {
        this.f14348l = i;
    }
}
