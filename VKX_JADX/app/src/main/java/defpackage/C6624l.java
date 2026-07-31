package defpackage;

/* JADX INFO: renamed from: lؙُٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6624l {
    public final long amazon;
    public final float crashlytics;
    public final long loadAd;
    public final long purchase;
    public final long yandex;

    public C6624l(long j, long j2, float f, long j3, long j4) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = f;
        this.amazon = j3;
        this.purchase = j4;
    }

    public final String toString() {
        return "HistoricalChange(uptimeMillis=" + this.yandex + ", position=" + C1187l.firebase(this.loadAd) + ", scaleFactor=" + this.crashlytics + ", panOffset=" + C1187l.firebase(this.amazon) + ")";
    }
}
