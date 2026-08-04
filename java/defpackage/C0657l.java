package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lٟؑۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0657l {
    public final String amazon;
    public final C1790l billing;
    public final C4273l crashlytics;
    public final C11520l loadAd;
    public final C8379l mopub;
    public final boolean purchase;
    public final String yandex;

    public C0657l(String str, C11520l c11520l, C4273l c4273l, String str2, boolean z, C1790l c1790l, C8379l c8379l) {
        this.yandex = str;
        this.loadAd = c11520l;
        this.crashlytics = c4273l;
        this.amazon = str2;
        this.purchase = z;
        this.billing = c1790l;
        this.mopub = c8379l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0657l.class != obj.getClass()) {
            return false;
        }
        C0657l c0657l = (C0657l) obj;
        return this.purchase == c0657l.purchase && Objects.equals(this.yandex, c0657l.yandex) && Objects.equals(this.loadAd, c0657l.loadAd) && Objects.equals(this.crashlytics, c0657l.crashlytics) && Objects.equals(this.amazon, c0657l.amazon) && Objects.equals(this.billing, c0657l.billing) && Objects.equals(this.mopub, c0657l.mopub);
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, this.loadAd, this.crashlytics, this.amazon, Boolean.valueOf(this.purchase), this.billing, this.mopub);
    }

    public final String toString() {
        return "TrackData{mUri='" + this.yandex + "', mTrackInfo=" + this.loadAd + ", mEncryptionData=" + this.crashlytics + ", mProgramDateTime='" + this.amazon + "', mHasDiscontinuity=" + this.purchase + ", mMapInfo=" + this.billing + ", mByteRange=" + this.mopub + '}';
    }

    public final boolean yandex() {
        EnumC17267l enumC17267l;
        C4273l c4273l = this.crashlytics;
        return (c4273l == null || (enumC17267l = c4273l.yandex) == null || enumC17267l == EnumC17267l.NONE) ? false : true;
    }
}
