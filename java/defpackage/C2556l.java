package defpackage;

/* JADX INFO: renamed from: lِؔٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2556l {
    public final C4835l amazon;
    public final int crashlytics;
    public final Object loadAd;
    public final String yandex;

    public C2556l(String str, Object obj, int i, C4835l c4835l) {
        this.yandex = str;
        this.loadAd = obj;
        this.crashlytics = i;
        this.amazon = c4835l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2556l)) {
            return false;
        }
        C2556l c2556l = (C2556l) obj;
        return this.yandex.equals(c2556l.yandex) && AbstractC8576l.yandex(this.loadAd, c2556l.loadAd) && this.crashlytics == c2556l.crashlytics && AbstractC8576l.yandex(this.amazon, c2556l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + ((((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31) + this.crashlytics) * 961);
    }

    public final String toString() {
        return "CacheKey(cameraId=" + this.yandex + ", cameraConfig=" + this.loadAd + ", videoRecordingType=" + this.crashlytics + ", videoCapabilitiesSource=0, videoEncoderInfoFinder=" + this.amazon + ')';
    }
}
