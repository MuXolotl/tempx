package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٔۛ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15169l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29761l;

    public /* synthetic */ C15169l(int i) {
        this.f29761l = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double dSignature;
        int i = this.f29761l;
        double dSignature2 = 30.0d;
        double d = 90.0d;
        C9714l c9714l = AbstractC18296l.yandex;
        switch (i) {
            case 0:
                C0187l c0187l = (C0187l) obj;
                if (c0187l.isPro != 2) {
                    boolean z = c0187l.crashlytics;
                    C8723l c8723l = c0187l.firebase;
                    dSignature2 = z ? C15718l.Signature(c8723l, 30.0d, 93.0d) : C15718l.tapsense(c8723l, 0.0d, 90.0d);
                }
                return Double.valueOf(dSignature2);
            case 1:
                return ((C0187l) obj).firebase;
            case 2:
                C0187l c0187l2 = (C0187l) obj;
                C8723l c8723l2 = c0187l2.firebase;
                if (c0187l2.isPro == 1) {
                    dSignature = c0187l2.crashlytics ? C15718l.Signature(c8723l2, 0.0d, 98.0d) : C15718l.tapsense(c8723l2, 0.0d, 100.0d);
                } else {
                    dSignature = C15718l.Signature(c8723l2, 0.0d, 100.0d);
                }
                return Double.valueOf(dSignature);
            case 3:
                return ((C0187l) obj).isPro == 1 ? C15718l.amazon(4.5d) : C15718l.amazon(7.0d);
            case 4:
                return ((C0187l) obj).purchase;
            case 5:
                return Double.valueOf(C15718l.tapsense(((C0187l) obj).purchase, 0.0d, 100.0d));
            case 6:
                return c9714l.smaato();
            case 7:
                return ((C0187l) obj).isPro == 1 ? C15718l.amazon(6.0d) : C15718l.amazon(7.0d);
            case 8:
                return ((C0187l) obj).purchase;
            case 9:
                C0187l c0187l3 = (C0187l) obj;
                if (c0187l3.isPro != 1 || c0187l3.amazon <= 0.0d) {
                    return null;
                }
                return C15718l.amazon(1.5d);
            case 10:
                return ((C0187l) obj).admob;
            case 11:
                return Double.valueOf(((C0187l) obj).crashlytics ? 0.0d : 100.0d);
            case 12:
                return ((C0187l) obj).admob;
            case 13:
                return c9714l.smaato();
            case 14:
                return C15718l.amazon(7.0d);
            case 15:
                return ((C0187l) obj).billing;
            case 16:
                return c9714l.subscription();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C0187l) obj).isPro == 1 ? C15718l.amazon(6.0d) : C15718l.amazon(7.0d);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C0187l) obj).mopub;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C0187l c0187l4 = (C0187l) obj;
                if (c0187l4.isPro != 1 || c0187l4.amazon <= 0.0d) {
                    return null;
                }
                return C15718l.amazon(1.5d);
            case 20:
                return ((C0187l) obj).mopub;
            case 21:
                return c9714l.advert();
            case 22:
                return ((C0187l) obj).isPro == 1 ? C15718l.amazon(6.0d) : C15718l.amazon(7.0d);
            case 23:
                return ((C0187l) obj).purchase;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C0187l c0187l5 = (C0187l) obj;
                if (c0187l5.isPro != 1 || c0187l5.amazon <= 0.0d) {
                    return null;
                }
                return C15718l.amazon(1.5d);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C0187l c0187l6 = (C0187l) obj;
                boolean z2 = c0187l6.crashlytics;
                if (c0187l6.isPro != 2) {
                    int i2 = c0187l6.loadAd;
                    if (i2 != 2) {
                        C8723l c8723l3 = c0187l6.purchase;
                        if (i2 == 3) {
                            dSignature2 = z2 ? C15718l.Signature(c8723l3, 35.0d, 93.0d) : C15718l.tapsense(c8723l3, 0.0d, 90.0d);
                        } else {
                            if (i2 == 5) {
                                if (z2) {
                                    dSignature2 = C15718l.tapsense(c8723l3, 30.0d, 93.0d);
                                } else {
                                    dSignature2 = C15718l.tapsense(c8723l3, 78.0d, c8723l3.crashlytics.yandex() ? 88 : 90);
                                }
                            } else if (z2) {
                                dSignature2 = C15718l.Signature(c8723l3, 66.0d, 93.0d);
                            } else {
                                dSignature2 = C15718l.tapsense(c8723l3, 66.0d, c8723l3.crashlytics.yandex() ? 88 : 93);
                            }
                        }
                    } else if (!z2) {
                        dSignature2 = 90.0d;
                    }
                }
                return Double.valueOf(dSignature2);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C0187l c0187l7 = (C0187l) obj;
                if (c0187l7.isPro != 1 || c0187l7.amazon <= 0.0d) {
                    return null;
                }
                return C15718l.amazon(1.5d);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C0187l) obj).admob;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C0187l c0187l8 = (C0187l) obj;
                if (c0187l8.crashlytics) {
                    d = 4.0d;
                } else if (!c0187l8.admob.crashlytics.loadAd()) {
                    d = c0187l8.loadAd == 4 ? 85.0d : 87.0d;
                }
                return Double.valueOf(d);
            default:
                C0187l c0187l9 = (C0187l) obj;
                if (!c0187l9.crashlytics) {
                    int i3 = c0187l9.loadAd;
                    if (i3 == 2) {
                        return Double.valueOf(2.5d);
                    }
                    if (i3 == 3) {
                        return Double.valueOf(1.7d);
                    }
                    if (i3 == 5) {
                        return c0187l9.admob.crashlytics.loadAd() ? Double.valueOf(2.7d) : Double.valueOf(1.75d);
                    }
                    if (i3 == 4) {
                        return Double.valueOf(1.36d);
                    }
                }
                return Double.valueOf(1.0d);
        }
    }
}
