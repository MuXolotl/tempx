package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؒؔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0816l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9714l f2446l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2447l;

    public /* synthetic */ C0816l(C9714l c9714l, int i) {
        this.f2447l = i;
        this.f2446l = c9714l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double dYandex;
        int i = this.f2447l;
        C9714l c9714l = this.f2446l;
        C0187l c0187l = (C0187l) obj;
        switch (i) {
            case 0:
                dYandex = c9714l.isVip().yandex(c0187l);
                break;
            case 1:
                return new C3134l(c9714l.signatures(), c9714l.isVip(), 5.0d, 1, false, 1, 16);
            case 2:
                if (c0187l.isPro == 1) {
                    return c0187l.crashlytics ? c9714l.license() : c9714l.pro();
                }
                return c9714l.inmobi();
            case 3:
                if (c0187l.isPro == 1) {
                    return new C3134l(c9714l.advert(), c9714l.ad(), 5.0d, 4, false, 3, 16);
                }
                return null;
            case 4:
                dYandex = c9714l.tapsense().yandex(c0187l);
                break;
            case 5:
                return new C3134l(c9714l.Signature(), c9714l.tapsense(), 5.0d, 1, false, 1, 16);
            case 6:
                dYandex = c9714l.startapp().yandex(c0187l);
                break;
            case 7:
                return new C3134l(c9714l.adcel(), c9714l.startapp(), 5.0d, 1, false, 1, 16);
            case 8:
                dYandex = c9714l.subscription().yandex(new C0187l(c0187l.yandex, c0187l.loadAd, false, 0.0d, c0187l.purchase, c0187l.billing, c0187l.mopub, c0187l.admob, c0187l.subs, c0187l.isPro, c0187l.smaato, c0187l.firebase));
                break;
            case 9:
                if (c0187l.isPro == 1) {
                    return c0187l.crashlytics ? c9714l.license() : c9714l.pro();
                }
                return null;
            case 10:
                return c9714l.inmobi();
            case 11:
                return new C3134l(c9714l.appmetrica(), c9714l.ads(), 5.0d, 1, false, 3, 16);
            case 12:
                return c9714l.inmobi();
            case 13:
                return new C3134l(c9714l.m2723package(), c9714l.ad(), 5.0d, 1, false, 3, 16);
            case 14:
                return c9714l.inmobi();
            case 15:
                return new C3134l(c9714l.applovin(), c9714l.vip(), 5.0d, 1, false, 3, 16);
            case 16:
                return c9714l.inmobi();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C3134l(c9714l.premium(), c9714l.yandex(), 5.0d, 1, false, 3, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (c0187l.isPro == 1) {
                    return c0187l.crashlytics ? c9714l.license() : c9714l.pro();
                }
                return c9714l.inmobi();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                if (c0187l.isPro == 1) {
                    return new C3134l(c9714l.metrica(), c9714l.vip(), 5.0d, 4, false, 3, 16);
                }
                return null;
            case 20:
                if (c0187l.isPro == 1) {
                    return c0187l.crashlytics ? c9714l.license() : c9714l.pro();
                }
                return c9714l.inmobi();
            case 21:
                if (c0187l.isPro == 1) {
                    return new C3134l(c9714l.loadAd(), c9714l.yandex(), 5.0d, 4, false, 3, 16);
                }
                return null;
            case 22:
                if (c0187l.isPro == 1) {
                    return c0187l.crashlytics ? c9714l.license() : c9714l.pro();
                }
                return null;
            case 23:
                dYandex = c9714l.metrica().yandex(new C0187l(c0187l.yandex, c0187l.loadAd, false, 0.0d, c0187l.purchase, c0187l.billing, c0187l.mopub, c0187l.admob, c0187l.subs, c0187l.isPro, c0187l.smaato, c0187l.firebase));
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                if (c0187l.isPro == 1) {
                    return c0187l.crashlytics ? c9714l.license() : c9714l.pro();
                }
                return null;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                if (c0187l.isPro == 2) {
                    return new C3134l(c9714l.loadAd(), c9714l.premium(), 10.0d, 1, false, 3, 16);
                }
                return null;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                dYandex = c9714l.advert().yandex(new C0187l(c0187l.yandex, c0187l.loadAd, false, 0.0d, c0187l.purchase, c0187l.billing, c0187l.mopub, c0187l.admob, c0187l.subs, c0187l.isPro, c0187l.smaato, c0187l.firebase));
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                if (c0187l.isPro == 1) {
                    return c0187l.crashlytics ? c9714l.license() : c9714l.pro();
                }
                return null;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                if (c0187l.isPro == 1) {
                    return c0187l.crashlytics ? c9714l.license() : c9714l.pro();
                }
                return null;
            default:
                if (c0187l.isPro == 2) {
                    return new C3134l(c9714l.metrica(), c9714l.applovin(), 10.0d, 1, false, 3, 16);
                }
                return null;
        }
        return Double.valueOf(dYandex);
    }
}
