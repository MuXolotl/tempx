package defpackage;

/* JADX INFO: renamed from: lَؙؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10006l {
    public float amazon;
    public float crashlytics;
    public float loadAd;
    public float purchase;
    public final /* synthetic */ int yandex;

    public C10006l(C10006l c10006l) {
        this.yandex = 1;
        this.loadAd = c10006l.loadAd;
        this.crashlytics = c10006l.crashlytics;
        this.amazon = c10006l.amazon;
        this.purchase = c10006l.purchase;
    }

    public float amazon() {
        return this.crashlytics + this.purchase;
    }

    public float crashlytics() {
        return this.loadAd + this.amazon;
    }

    public boolean loadAd() {
        return (this.loadAd >= this.amazon) | (this.crashlytics >= this.purchase);
    }

    public void purchase(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.loadAd += fIntBitsToFloat;
        this.crashlytics += fIntBitsToFloat2;
        this.amazon += fIntBitsToFloat;
        this.purchase += fIntBitsToFloat2;
    }

    public final String toString() {
        switch (this.yandex) {
            case 0:
                return AbstractC9361l.advert(AbstractC14814l.license("MutableRect(", AbstractC4447l.crashlytics(this.loadAd), ", ", AbstractC4447l.crashlytics(this.crashlytics), ", "), AbstractC4447l.crashlytics(this.amazon), ", ", AbstractC4447l.crashlytics(this.purchase), ")");
            default:
                return "[" + this.loadAd + " " + this.crashlytics + " " + this.amazon + " " + this.purchase + "]";
        }
    }

    public void yandex(float f, float f2, float f3, float f4) {
        this.loadAd = Math.max(f, this.loadAd);
        this.crashlytics = Math.max(f2, this.crashlytics);
        this.amazon = Math.min(f3, this.amazon);
        this.purchase = Math.min(f4, this.purchase);
    }

    public C10006l(float f, float f2, float f3, float f4) {
        this.yandex = 1;
        this.loadAd = f;
        this.crashlytics = f2;
        this.amazon = f3;
        this.purchase = f4;
    }

    public C10006l() {
        this.yandex = 0;
        this.loadAd = 0.0f;
        this.crashlytics = 0.0f;
        this.amazon = 0.0f;
        this.purchase = 0.0f;
    }
}
