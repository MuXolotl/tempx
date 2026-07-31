package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: renamed from: lٜؖۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4262l {
    public static final String firebase;
    public static final String isPro;
    public static final String metrica;
    public static final String remoteconfig;
    public static final String smaato;
    public static final String startapp;
    public static final String vip;
    public final int admob;
    public final Object amazon;
    public final long billing;
    public final C2427l crashlytics;
    public final int loadAd;
    public final long mopub;
    public final int purchase;
    public final int subs;
    public final Object yandex;

    static {
        String str = AbstractC15323l.yandex;
        isPro = Integer.toString(0, 36);
        firebase = Integer.toString(1, 36);
        smaato = Integer.toString(2, 36);
        remoteconfig = Integer.toString(3, 36);
        vip = Integer.toString(4, 36);
        metrica = Integer.toString(5, 36);
        startapp = Integer.toString(6, 36);
    }

    public C4262l(Object obj, int i, C2427l c2427l, Object obj2, int i2, long j, long j2, int i3, int i4) {
        AbstractC12442l.admob(i >= 0);
        AbstractC12442l.admob(i2 >= 0);
        this.yandex = obj;
        this.loadAd = i;
        this.crashlytics = c2427l;
        this.amazon = obj2;
        this.purchase = i2;
        this.billing = j;
        this.mopub = j2;
        this.admob = i3;
        this.subs = i4;
    }

    public static C4262l crashlytics(int i, Bundle bundle) {
        int iMax = Math.max(0, bundle.getInt(isPro, 0));
        Bundle bundle2 = bundle.getBundle(firebase);
        return new C4262l(null, iMax, bundle2 == null ? null : C2427l.yandex(i, bundle2), null, Math.max(0, bundle.getInt(smaato, 0)), bundle.getLong(remoteconfig, 0L), bundle.getLong(vip, 0L), bundle.getInt(metrica, -1), bundle.getInt(startapp, -1));
    }

    public final Bundle amazon(int i) {
        Bundle bundle = new Bundle();
        int i2 = this.loadAd;
        if (i < 3 || i2 != 0) {
            bundle.putInt(isPro, i2);
        }
        C2427l c2427l = this.crashlytics;
        if (c2427l != null) {
            bundle.putBundle(firebase, c2427l.crashlytics(i, false));
        }
        int i3 = this.purchase;
        if (i < 3 || i3 != 0) {
            bundle.putInt(smaato, i3);
        }
        long j = this.billing;
        if (i < 3 || j != 0) {
            bundle.putLong(remoteconfig, j);
        }
        long j2 = this.mopub;
        if (i < 3 || j2 != 0) {
            bundle.putLong(vip, j2);
        }
        int i4 = this.admob;
        if (i4 != -1) {
            bundle.putInt(metrica, i4);
        }
        int i5 = this.subs;
        if (i5 != -1) {
            bundle.putInt(startapp, i5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4262l.class == obj.getClass()) {
            C4262l c4262l = (C4262l) obj;
            if (yandex(c4262l) && Objects.equals(this.yandex, c4262l.yandex) && Objects.equals(this.amazon, c4262l.amazon)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, Integer.valueOf(this.loadAd), this.crashlytics, this.amazon, Integer.valueOf(this.purchase), Long.valueOf(this.billing), Long.valueOf(this.mopub), Integer.valueOf(this.admob), Integer.valueOf(this.subs));
    }

    public final C4262l loadAd(boolean z, boolean z2) {
        if (z && z2) {
            return this;
        }
        return new C4262l(this.yandex, z2 ? this.loadAd : 0, z ? this.crashlytics : null, this.amazon, z2 ? this.purchase : 0, z ? this.billing : 0L, z ? this.mopub : 0L, z ? this.admob : -1, z ? this.subs : -1);
    }

    public final String toString() {
        String str = "mediaItem=" + this.loadAd + ", period=" + this.purchase + ", pos=" + this.billing;
        int i = this.admob;
        if (i == -1) {
            return str;
        }
        StringBuilder sbAdvert = AbstractC5020l.advert(str, ", contentPos=");
        sbAdvert.append(this.mopub);
        sbAdvert.append(", adGroup=");
        sbAdvert.append(i);
        sbAdvert.append(", ad=");
        sbAdvert.append(this.subs);
        return sbAdvert.toString();
    }

    public final boolean yandex(C4262l c4262l) {
        return this.loadAd == c4262l.loadAd && this.purchase == c4262l.purchase && this.billing == c4262l.billing && this.mopub == c4262l.mopub && this.admob == c4262l.admob && this.subs == c4262l.subs && Objects.equals(this.crashlytics, c4262l.crashlytics);
    }
}
