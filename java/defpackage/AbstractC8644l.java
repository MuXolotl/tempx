package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* JADX INFO: renamed from: lًٌّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8644l {
    public static final C16222l yandex;

    static {
        AbstractC10478l.subs(new C1712l(24));
        yandex = new C16222l(13);
    }

    public static final C11090l yandex(C6956l c6956l, int i) {
        C13494l c13494l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).loadAd;
        switch (AbstractC5020l.inmobi(i)) {
            case 0:
                return c13494l.isPro;
            case 1:
                return c13494l.firebase;
            case 2:
                return c13494l.smaato;
            case 3:
                return c13494l.yandex;
            case 4:
                return c13494l.loadAd;
            case 5:
                return c13494l.crashlytics;
            case 6:
                return c13494l.amazon;
            case 7:
                return c13494l.purchase;
            case 8:
                return c13494l.billing;
            case 9:
                return c13494l.remoteconfig;
            case 10:
                return c13494l.vip;
            case 11:
                return c13494l.metrica;
            case 12:
                return c13494l.mopub;
            case 13:
                return c13494l.admob;
            case 14:
                return c13494l.subs;
            case 15:
                return c13494l.advert;
            case 16:
                return c13494l.isVip;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return c13494l.signatures;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return c13494l.startapp;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return c13494l.adcel;
            case 20:
                return c13494l.ads;
            case 21:
                return c13494l.subscription;
            case 22:
                return c13494l.tapsense;
            case 23:
                return c13494l.Signature;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return c13494l.premium;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return c13494l.applovin;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return c13494l.appmetrica;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return c13494l.license;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return c13494l.pro;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return c13494l.ad;
            default:
                C18725l.billing();
                return null;
        }
    }
}
