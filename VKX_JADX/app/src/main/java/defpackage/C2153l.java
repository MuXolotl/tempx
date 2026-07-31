package defpackage;

/* JADX INFO: renamed from: lؓ۠ؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2153l {
    public float admob;
    public float amazon;
    public long billing;
    public float crashlytics;
    public int loadAd;
    public long mopub;
    public long purchase;
    public int subs;
    public int yandex;

    public final float yandex(long j) {
        long j2 = this.purchase;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.mopub;
        if (j3 < 0 || j < j3) {
            return ViewOnTouchListenerC6500l.loadAd((j - j2) / this.yandex, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.admob;
        return (ViewOnTouchListenerC6500l.loadAd((j - j3) / this.subs, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
