package defpackage;

/* JADX INFO: renamed from: lِۚٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12097l {
    public final float crashlytics;
    public final long loadAd;
    public final long yandex;

    public C12097l(long j, long j2, float f) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12097l)) {
            return false;
        }
        C12097l c12097l = (C12097l) obj;
        return this.yandex == c12097l.yandex && this.loadAd == c12097l.loadAd && Float.compare(this.crashlytics, c12097l.crashlytics) == 0;
    }

    public final int hashCode() {
        long j = this.yandex;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.loadAd;
        return Float.floatToIntBits(this.crashlytics) + ((i + ((int) ((j2 >>> 32) ^ j2))) * 31);
    }

    public final String toString() {
        return "DownloadState(bytesToDownload=" + this.yandex + ", bytesDownloaded=" + this.loadAd + ", progress=" + this.crashlytics + ')';
    }
}
