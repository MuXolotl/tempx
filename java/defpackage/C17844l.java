package defpackage;

/* JADX INFO: renamed from: lُٜ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17844l {
    public C14115l yandex = null;
    public C2151l loadAd = null;
    public C13601l crashlytics = null;
    public C9902l amazon = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17844l)) {
            return false;
        }
        C17844l c17844l = (C17844l) obj;
        return AbstractC8576l.yandex(this.yandex, c17844l.yandex) && AbstractC8576l.yandex(this.loadAd, c17844l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c17844l.crashlytics) && AbstractC8576l.yandex(this.amazon, c17844l.amazon);
    }

    public final int hashCode() {
        C14115l c14115l = this.yandex;
        int iHashCode = (c14115l == null ? 0 : c14115l.hashCode()) * 31;
        C2151l c2151l = this.loadAd;
        int iHashCode2 = (iHashCode + (c2151l == null ? 0 : c2151l.hashCode())) * 31;
        C13601l c13601l = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (c13601l == null ? 0 : c13601l.hashCode())) * 31;
        C9902l c9902l = this.amazon;
        return iHashCode3 + (c9902l != null ? c9902l.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.yandex + ", canvas=" + this.loadAd + ", canvasDrawScope=" + this.crashlytics + ", borderPath=" + this.amazon + ")";
    }
}
