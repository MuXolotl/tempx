package defpackage;

/* JADX INFO: renamed from: lٌؚٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15565l {
    public float amazon;
    public float crashlytics;
    public final float loadAd;
    public final /* synthetic */ C7893l purchase;
    public final C17841l yandex;

    public C15565l(C7893l c7893l, C17841l c17841l, float f, float f2) {
        this.purchase = c7893l;
        this.yandex = c17841l;
        if (f2 < f) {
            C8339l.metrica("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            throw null;
        }
        c7893l.f16466l.getClass();
        this.loadAd = Float.intBitsToFloat((int) (C16936l.amazon(c17841l, Float.POSITIVE_INFINITY) & 4294967295L));
        this.crashlytics = f;
        this.amazon = f2;
    }

    public final String toString() {
        return "MeasuredCubic(outlineProgress=[" + this.crashlytics + " .. " + this.amazon + "], size=" + this.loadAd + ", cubic=" + this.yandex + ')';
    }

    public final C8195l yandex(float f) {
        float fAmazon = AbstractC8576l.amazon(f, this.crashlytics, this.amazon);
        float f2 = this.amazon;
        float f3 = this.crashlytics;
        float f4 = (fAmazon - f3) / (f2 - f3);
        C7893l c7893l = this.purchase;
        C16936l c16936l = c7893l.f16466l;
        float f5 = f4 * this.loadAd;
        c16936l.getClass();
        C17841l c17841l = this.yandex;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (C16936l.amazon(c17841l, f5) >> 32));
        if (0.0f > fIntBitsToFloat || fIntBitsToFloat > 1.0f) {
            C8339l.metrica("Cubic cut point is expected to be between 0 and 1");
            return null;
        }
        C8195l c8195lAmazon = c17841l.amazon(fIntBitsToFloat);
        return new C8195l(new C15565l(c7893l, (C17841l) c8195lAmazon.f17098l, this.crashlytics, fAmazon), new C15565l(c7893l, (C17841l) c8195lAmazon.f17097l, fAmazon, this.amazon));
    }
}
