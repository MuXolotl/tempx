package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lّٔٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15038l {
    public static final C10707l yandex = new C10707l(new C11200l(10));

    public static final long amazon(C0764l c0764l, int i) {
        switch (AbstractC5020l.inmobi(i)) {
            case 0:
                return c0764l.vip;
            case 1:
                return c0764l.pro;
            case 2:
                return c0764l.advert;
            case 3:
                return c0764l.license;
            case 4:
                return c0764l.purchase;
            case 5:
                return c0764l.Signature;
            case 6:
                return c0764l.metrica;
            case 7:
                return c0764l.ad;
            case 8:
                return c0764l.isVip;
            case 9:
                return c0764l.loadAd;
            case 10:
                return c0764l.amazon;
            case 11:
                return c0764l.f2295extends;
            case 12:
                return c0764l.f2298for;
            case 13:
                return c0764l.mopub;
            case 14:
                return c0764l.subs;
            case 15:
                return c0764l.f2294else;
            case 16:
                return c0764l.f2288case;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return c0764l.adcel;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return c0764l.subscription;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return c0764l.firebase;
            case 20:
                return c0764l.remoteconfig;
            case 21:
                return c0764l.f2290class;
            case 22:
                return c0764l.f2303interface;
            case 23:
                return c0764l.signatures;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return c0764l.premium;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return c0764l.yandex;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return c0764l.crashlytics;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return c0764l.f2306native;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return c0764l.f2309private;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return c0764l.applovin;
            case 30:
                return c0764l.billing;
            case 31:
                return c0764l.admob;
            case 32:
                return c0764l.f2319throw;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                return c0764l.f2289catch;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                return c0764l.startapp;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                return c0764l.appmetrica;
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                return c0764l.f2320throws;
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                return c0764l.f2308package;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                return c0764l.f2317synchronized;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return c0764l.f2314strictfp;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                return c0764l.f2323volatile;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                return c0764l.inmobi;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                return c0764l.tapsense;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                return c0764l.ads;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                return c0764l.isPro;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                return c0764l.smaato;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                return c0764l.f2316switch;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                return c0764l.f2292continue;
            default:
                C18725l.billing();
                return 0L;
        }
    }

    public static C0764l billing(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i, int i2) {
        long j22 = (i & 1) != 0 ? AbstractC5895l.isVip : j;
        return new C0764l(j22, (i & 2) != 0 ? AbstractC5895l.isPro : j2, (i & 4) != 0 ? AbstractC5895l.signatures : j3, (i & 8) != 0 ? AbstractC5895l.firebase : j4, AbstractC5895l.purchase, (i & 32) != 0 ? AbstractC5895l.inmobi : j5, AbstractC5895l.vip, (i & 128) != 0 ? AbstractC5895l.f12432throws : j6, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? AbstractC5895l.metrica : j7, AbstractC5895l.f12418case, AbstractC5895l.tapsense, (i & 2048) != 0 ? AbstractC5895l.f12429switch : j8, AbstractC5895l.Signature, (i & 8192) != 0 ? AbstractC5895l.yandex : j9, AbstractC5895l.mopub, (32768 & i) != 0 ? AbstractC5895l.f12428strictfp : j10, (65536 & i) != 0 ? AbstractC5895l.ads : j11, (131072 & i) != 0 ? AbstractC5895l.f12422else : j12, (262144 & i) != 0 ? AbstractC5895l.subscription : j13, j22, AbstractC5895l.billing, (2097152 & i) != 0 ? AbstractC5895l.amazon : j14, AbstractC5895l.loadAd, AbstractC5895l.admob, AbstractC5895l.crashlytics, AbstractC5895l.subs, (67108864 & i) != 0 ? AbstractC5895l.ad : j15, (134217728 & i) != 0 ? AbstractC5895l.advert : j16, AbstractC5895l.appmetrica, AbstractC5895l.f12433volatile, AbstractC5895l.f12419catch, (1073741824 & i) != 0 ? AbstractC5895l.f12425native : j17, (i & RecyclerView.UNDEFINED_DURATION) != 0 ? AbstractC5895l.f12427private : j18, (i2 & 1) != 0 ? AbstractC5895l.f12423extends : j19, (i2 & 2) != 0 ? AbstractC5895l.f12424for : j20, (i2 & 4) != 0 ? AbstractC5895l.f12431throw : j21, AbstractC5895l.premium, AbstractC5895l.applovin, AbstractC5895l.smaato, AbstractC5895l.remoteconfig, AbstractC5895l.f12426package, AbstractC5895l.f12430synchronized, AbstractC5895l.startapp, AbstractC5895l.adcel, AbstractC5895l.f12421continue, AbstractC5895l.f12420class, AbstractC5895l.license, AbstractC5895l.pro);
    }

    public static C0764l crashlytics(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i, int i2) {
        long j22 = (i & 1) != 0 ? AbstractC14984l.isVip : j;
        return new C0764l(j22, (i & 2) != 0 ? AbstractC14984l.isPro : j2, (i & 4) != 0 ? AbstractC14984l.signatures : j3, (i & 8) != 0 ? AbstractC14984l.firebase : j4, AbstractC14984l.purchase, (i & 32) != 0 ? AbstractC14984l.inmobi : j5, AbstractC14984l.vip, (i & 128) != 0 ? AbstractC14984l.f29496throws : j6, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? AbstractC14984l.metrica : j7, AbstractC14984l.f29482case, AbstractC14984l.tapsense, (i & 2048) != 0 ? AbstractC14984l.f29493switch : j8, AbstractC14984l.Signature, (i & 8192) != 0 ? AbstractC14984l.yandex : j9, AbstractC14984l.mopub, (32768 & i) != 0 ? AbstractC14984l.f29492strictfp : j10, (65536 & i) != 0 ? AbstractC14984l.ads : j11, (131072 & i) != 0 ? AbstractC14984l.f29486else : j12, (262144 & i) != 0 ? AbstractC14984l.subscription : j13, j22, AbstractC14984l.billing, (2097152 & i) != 0 ? AbstractC14984l.amazon : j14, AbstractC14984l.loadAd, AbstractC14984l.admob, AbstractC14984l.crashlytics, AbstractC14984l.subs, (67108864 & i) != 0 ? AbstractC14984l.ad : j15, (134217728 & i) != 0 ? AbstractC14984l.advert : j16, AbstractC14984l.appmetrica, AbstractC14984l.f29497volatile, AbstractC14984l.f29483catch, (1073741824 & i) != 0 ? AbstractC14984l.f29489native : j17, (i & RecyclerView.UNDEFINED_DURATION) != 0 ? AbstractC14984l.f29491private : j18, (i2 & 1) != 0 ? AbstractC14984l.f29487extends : j19, (i2 & 2) != 0 ? AbstractC14984l.f29488for : j20, (i2 & 4) != 0 ? AbstractC14984l.f29495throw : j21, AbstractC14984l.premium, AbstractC14984l.applovin, AbstractC14984l.smaato, AbstractC14984l.remoteconfig, AbstractC14984l.f29490package, AbstractC14984l.f29494synchronized, AbstractC14984l.startapp, AbstractC14984l.adcel, AbstractC14984l.f29485continue, AbstractC14984l.f29484class, AbstractC14984l.license, AbstractC14984l.pro);
    }

    public static final long loadAd(long j, C6956l c6956l) {
        c6956l.m2123default(89373914);
        long jYandex = yandex(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, j);
        if (jYandex == 16) {
            jYandex = ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex;
        }
        c6956l.startapp(false);
        return jYandex;
    }

    public static final long mopub(C0764l c0764l, float f) {
        return C14467l.loadAd(f, 0.0f) ? c0764l.startapp : AbstractC12953l.firebase(C9735l.loadAd(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, c0764l.tapsense), c0764l.startapp);
    }

    public static final long purchase(C6956l c6956l, int i) {
        return amazon(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, i);
    }

    public static final long yandex(C0764l c0764l, long j) {
        long j2 = c0764l.yandex;
        long j3 = c0764l.f2290class;
        long j4 = c0764l.f2294else;
        long j5 = c0764l.f2295extends;
        long j6 = c0764l.adcel;
        if (C9735l.crashlytics(j, j2)) {
            return c0764l.loadAd;
        }
        if (C9735l.crashlytics(j, c0764l.billing)) {
            return c0764l.mopub;
        }
        if (C9735l.crashlytics(j, c0764l.isPro)) {
            return c0764l.firebase;
        }
        if (C9735l.crashlytics(j, c0764l.vip)) {
            return c0764l.metrica;
        }
        if (C9735l.crashlytics(j, c0764l.pro)) {
            return c0764l.ad;
        }
        if (C9735l.crashlytics(j, c0764l.crashlytics)) {
            return c0764l.amazon;
        }
        if (C9735l.crashlytics(j, c0764l.admob)) {
            return c0764l.subs;
        }
        if (C9735l.crashlytics(j, c0764l.smaato)) {
            return c0764l.remoteconfig;
        }
        if (C9735l.crashlytics(j, c0764l.advert)) {
            return c0764l.isVip;
        }
        if (C9735l.crashlytics(j, c0764l.Signature)) {
            return c0764l.license;
        }
        if (C9735l.crashlytics(j, c0764l.startapp)) {
            return j6;
        }
        if (C9735l.crashlytics(j, c0764l.ads)) {
            return c0764l.subscription;
        }
        if (C9735l.crashlytics(j, c0764l.appmetrica) || C9735l.crashlytics(j, c0764l.f2320throws) || C9735l.crashlytics(j, c0764l.f2308package) || C9735l.crashlytics(j, c0764l.f2317synchronized) || C9735l.crashlytics(j, c0764l.f2314strictfp) || C9735l.crashlytics(j, c0764l.f2323volatile) || C9735l.crashlytics(j, c0764l.inmobi)) {
            return j6;
        }
        if (C9735l.crashlytics(j, c0764l.f2306native) || C9735l.crashlytics(j, c0764l.f2309private)) {
            return j5;
        }
        if (C9735l.crashlytics(j, c0764l.f2319throw) || C9735l.crashlytics(j, c0764l.f2289catch)) {
            return j4;
        }
        if (C9735l.crashlytics(j, c0764l.f2316switch) || C9735l.crashlytics(j, c0764l.f2292continue)) {
            return j3;
        }
        int i = C9735l.smaato;
        return C9735l.firebase;
    }
}
