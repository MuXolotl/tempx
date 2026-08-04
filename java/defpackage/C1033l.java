package defpackage;

/* JADX INFO: renamed from: lؒٓؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1033l implements InterfaceC2652l {
    public final float amazon;
    public final float crashlytics;
    public final float loadAd;
    public final C3835l purchase;
    public final float yandex;

    static {
        C3835l c3835l = AbstractC10192l.yandex;
    }

    public C1033l(float f, float f2, float f3, float f4, C3835l c3835l) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = f4;
        this.purchase = c3835l;
    }

    public final C18411l crashlytics(InterfaceC0379l interfaceC0379l) {
        char c;
        char c2;
        C1033l c1033l;
        char c3;
        C3835l c3835lYandex = AbstractC13082l.yandex(interfaceC0379l.amazon());
        float[] fArr = AbstractC16074l.yandex;
        float[] fArr2 = AbstractC16074l.loadAd;
        C17296l c17296l = c3835lYandex.yandex;
        C17296l c17296l2 = this.purchase.yandex;
        if (AbstractC8576l.yandex(c17296l, c17296l2)) {
            c1033l = this;
            c3 = 0;
            c = '\b';
            c2 = 7;
        } else {
            C13317l c13317l = c17296l2.loadAd;
            C13317l c13317l2 = c17296l.loadAd;
            float f = c13317l.yandex;
            c = '\b';
            float f2 = c13317l.crashlytics;
            c2 = 7;
            float[] fArrLoadAd = AbstractC12446l.loadAd((f * f2) / c13317l.loadAd, f2, c13317l.yandex(), fArr);
            float f3 = c13317l2.yandex;
            float f4 = c13317l2.crashlytics;
            float[] fArrLoadAd2 = AbstractC12446l.loadAd((f3 * f4) / c13317l2.loadAd, f4, c13317l2.yandex(), fArr);
            float[] fArrCrashlytics = AbstractC12446l.crashlytics(fArrLoadAd2[0] / fArrLoadAd[0], fArrLoadAd2[1] / fArrLoadAd[1], fArrLoadAd2[2] / fArrLoadAd[2], fArr2);
            float[] fArr3 = {AbstractC12446l.amazon(0, 0, fArrCrashlytics, fArr), AbstractC12446l.amazon(1, 0, fArrCrashlytics, fArr), AbstractC12446l.amazon(2, 0, fArrCrashlytics, fArr), AbstractC12446l.amazon(0, 1, fArrCrashlytics, fArr), AbstractC12446l.amazon(1, 1, fArrCrashlytics, fArr), AbstractC12446l.amazon(2, 1, fArrCrashlytics, fArr), AbstractC12446l.amazon(0, 2, fArrCrashlytics, fArr), AbstractC12446l.amazon(1, 2, fArrCrashlytics, fArr), AbstractC12446l.amazon(2, 2, fArrCrashlytics, fArr)};
            float f5 = fArr3[0];
            float f6 = this.yandex;
            float f7 = fArr3[1];
            float f8 = this.loadAd;
            float f9 = (f7 * f8) + (f5 * f6);
            float f10 = fArr3[2];
            float f11 = this.crashlytics;
            c3 = 0;
            c1033l = new C1033l((f10 * f11) + f9, (fArr3[5] * f11) + (fArr3[4] * f8) + (fArr3[3] * f6), (fArr3[8] * f11) + (fArr3[7] * f8) + (fArr3[6] * f6), this.amazon, c3835lYandex);
        }
        InterfaceC18565l interfaceC18565lPurchase = interfaceC0379l.purchase();
        float[] fArrLoadAd3 = interfaceC0379l.loadAd();
        float f12 = fArrLoadAd3[c3];
        float f13 = c1033l.yandex;
        float f14 = fArrLoadAd3[1];
        float f15 = c1033l.loadAd;
        float f16 = (f14 * f15) + (f12 * f13);
        float f17 = fArrLoadAd3[2];
        float f18 = c1033l.crashlytics;
        return interfaceC0379l.crashlytics(interfaceC18565lPurchase.vip((f17 * f18) + f16), interfaceC18565lPurchase.vip((fArrLoadAd3[5] * f18) + (fArrLoadAd3[4] * f15) + (fArrLoadAd3[3] * f13)), interfaceC18565lPurchase.vip((fArrLoadAd3[c] * f18) + (fArrLoadAd3[c2] * f15) + (fArrLoadAd3[6] * f13)), this.amazon);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1033l)) {
            return false;
        }
        C1033l c1033l = (C1033l) obj;
        return Float.compare(this.yandex, c1033l.yandex) == 0 && Float.compare(this.loadAd, c1033l.loadAd) == 0 && Float.compare(this.crashlytics, c1033l.crashlytics) == 0 && Float.compare(this.amazon, c1033l.amazon) == 0 && this.purchase.equals(c1033l.purchase);
    }

    public final int hashCode() {
        return this.purchase.yandex.hashCode() + AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31), this.amazon, 31);
    }

    @Override // defpackage.InterfaceC2652l
    public final C18411l loadAd() {
        return crashlytics(AbstractC6969l.yandex);
    }

    public final String toString() {
        return "XYZ(x=" + this.yandex + ", y=" + this.loadAd + ", z=" + this.crashlytics + ", alpha=" + this.amazon + ", space=" + this.purchase + ')';
    }

    @Override // defpackage.InterfaceC2652l
    public final C1033l yandex() {
        return this;
    }
}
