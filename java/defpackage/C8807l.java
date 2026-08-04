package defpackage;

/* JADX INFO: renamed from: lٌٖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8807l {
    public static final C8807l crashlytics = new C8807l(-9223372036854775807L, false);
    public long loadAd;
    public boolean yandex;

    public C8807l(long j, boolean z) {
        this.loadAd = j;
        this.yandex = z;
    }

    public long yandex() {
        if (this.yandex) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.loadAd - System.nanoTime());
    }
}
