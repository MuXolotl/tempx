package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: renamed from: lٌۘۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9009l {
    public static final String Signature;
    public static final String adcel;
    public static final String ads;
    public static final C4262l firebase;
    public static final String license;
    public static final String metrica;
    public static final String remoteconfig;
    public static final C9009l smaato;
    public static final String startapp;
    public static final String subscription;
    public static final String tapsense;
    public static final String vip;
    public final long admob;
    public final long amazon;
    public final int billing;
    public final long crashlytics;
    public final long isPro;
    public final boolean loadAd;
    public final long mopub;
    public final long purchase;
    public final long subs;
    public final C4262l yandex;

    static {
        C4262l c4262l = new C4262l(null, 0, null, null, 0, 0L, 0L, -1, -1);
        firebase = c4262l;
        smaato = new C9009l(c4262l, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = AbstractC15323l.yandex;
        remoteconfig = Integer.toString(0, 36);
        vip = Integer.toString(1, 36);
        metrica = Integer.toString(2, 36);
        startapp = Integer.toString(3, 36);
        adcel = Integer.toString(4, 36);
        ads = Integer.toString(5, 36);
        subscription = Integer.toString(6, 36);
        tapsense = Integer.toString(7, 36);
        Signature = Integer.toString(8, 36);
        license = Integer.toString(9, 36);
    }

    public C9009l(C4262l c4262l, boolean z, long j, long j2, long j3, int i, long j4, long j5, long j6, long j7) {
        AbstractC12442l.admob(z == (c4262l.admob != -1));
        this.yandex = c4262l;
        this.loadAd = z;
        this.crashlytics = j;
        this.amazon = j2;
        this.purchase = j3;
        this.billing = i;
        this.mopub = j4;
        this.admob = j5;
        this.subs = j6;
        this.isPro = j7;
    }

    public static C9009l loadAd(int i, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(remoteconfig);
        return new C9009l(bundle2 == null ? firebase : C4262l.crashlytics(i, bundle2), bundle.getBoolean(vip, false), bundle.getLong(metrica, -9223372036854775807L), bundle.getLong(startapp, -9223372036854775807L), bundle.getLong(adcel, 0L), bundle.getInt(ads, 0), bundle.getLong(subscription, 0L), bundle.getLong(tapsense, -9223372036854775807L), bundle.getLong(Signature, -9223372036854775807L), bundle.getLong(license, 0L));
    }

    public final Bundle crashlytics(int i) {
        Bundle bundle = new Bundle();
        C4262l c4262l = this.yandex;
        if (i < 3 || !firebase.yandex(c4262l)) {
            bundle.putBundle(remoteconfig, c4262l.amazon(i));
        }
        boolean z = this.loadAd;
        if (z) {
            bundle.putBoolean(vip, z);
        }
        long j = this.crashlytics;
        if (j != -9223372036854775807L) {
            bundle.putLong(metrica, j);
        }
        long j2 = this.amazon;
        if (j2 != -9223372036854775807L) {
            bundle.putLong(startapp, j2);
        }
        long j3 = this.purchase;
        if (i < 3 || j3 != 0) {
            bundle.putLong(adcel, j3);
        }
        int i2 = this.billing;
        if (i2 != 0) {
            bundle.putInt(ads, i2);
        }
        long j4 = this.mopub;
        if (j4 != 0) {
            bundle.putLong(subscription, j4);
        }
        long j5 = this.admob;
        if (j5 != -9223372036854775807L) {
            bundle.putLong(tapsense, j5);
        }
        long j6 = this.subs;
        if (j6 != -9223372036854775807L) {
            bundle.putLong(Signature, j6);
        }
        long j7 = this.isPro;
        if (i >= 3 && j7 == 0) {
            return bundle;
        }
        bundle.putLong(license, j7);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9009l.class == obj.getClass()) {
            C9009l c9009l = (C9009l) obj;
            if (this.crashlytics == c9009l.crashlytics && this.yandex.equals(c9009l.yandex) && this.loadAd == c9009l.loadAd && this.amazon == c9009l.amazon && this.purchase == c9009l.purchase && this.billing == c9009l.billing && this.mopub == c9009l.mopub && this.admob == c9009l.admob && this.subs == c9009l.subs && this.isPro == c9009l.isPro) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, Boolean.valueOf(this.loadAd));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        C4262l c4262l = this.yandex;
        sb.append(c4262l.loadAd);
        sb.append(", periodIndex=");
        sb.append(c4262l.purchase);
        sb.append(", positionMs=");
        sb.append(c4262l.billing);
        sb.append(", contentPositionMs=");
        sb.append(c4262l.mopub);
        sb.append(", adGroupIndex=");
        sb.append(c4262l.admob);
        sb.append(", adIndexInAdGroup=");
        sb.append(c4262l.subs);
        sb.append("}, isPlayingAd=");
        sb.append(this.loadAd);
        sb.append(", eventTimeMs=");
        sb.append(this.crashlytics);
        sb.append(", durationMs=");
        sb.append(this.amazon);
        sb.append(", bufferedPositionMs=");
        sb.append(this.purchase);
        sb.append(", bufferedPercentage=");
        sb.append(this.billing);
        sb.append(", totalBufferedDurationMs=");
        sb.append(this.mopub);
        sb.append(", currentLiveOffsetMs=");
        sb.append(this.admob);
        sb.append(", contentDurationMs=");
        sb.append(this.subs);
        sb.append(", contentBufferedPositionMs=");
        return AbstractC15560l.ads(this.isPro, "}", sb);
    }

    public final C9009l yandex(boolean z, boolean z2) {
        if (z && z2) {
            return this;
        }
        return new C9009l(this.yandex.loadAd(z, z2), z && this.loadAd, this.crashlytics, z ? this.amazon : -9223372036854775807L, z ? this.purchase : 0L, z ? this.billing : 0, z ? this.mopub : 0L, z ? this.admob : -9223372036854775807L, z ? this.subs : -9223372036854775807L, z ? this.isPro : 0L);
    }
}
