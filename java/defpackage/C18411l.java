package defpackage;

/* JADX INFO: renamed from: lٚؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18411l implements InterfaceC2652l {
    public static final C6559l billing = new C6559l();
    public final float amazon;
    public final float crashlytics;
    public final float loadAd;
    public final InterfaceC0379l purchase;
    public final float yandex;

    public C18411l(float f, float f2, float f3, float f4, InterfaceC0379l interfaceC0379l) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = f4;
        this.purchase = interfaceC0379l;
    }

    public final C18411l crashlytics(InterfaceC0379l interfaceC0379l) {
        C14661l c14661l = C14661l.loadAd;
        InterfaceC18565l interfaceC18565l = c14661l.yandex.crashlytics;
        InterfaceC0379l interfaceC0379l2 = this.purchase;
        if (AbstractC8576l.yandex(interfaceC0379l2, interfaceC0379l)) {
            return this;
        }
        boolean zYandex = AbstractC8576l.yandex(interfaceC0379l2, c14661l);
        float f = this.amazon;
        float f2 = this.crashlytics;
        float f3 = this.loadAd;
        float f4 = this.yandex;
        if (zYandex && interfaceC0379l.equals(AbstractC6969l.loadAd)) {
            return interfaceC0379l.crashlytics(interfaceC18565l.mopub(f4), interfaceC18565l.mopub(f3), interfaceC18565l.mopub(f2), f);
        }
        return (AbstractC8576l.yandex(interfaceC0379l2, AbstractC6969l.loadAd) && interfaceC0379l.equals(c14661l)) ? interfaceC0379l.crashlytics(interfaceC18565l.vip(f4), interfaceC18565l.vip(f3), interfaceC18565l.vip(f2), f) : yandex().crashlytics(interfaceC0379l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18411l)) {
            return false;
        }
        C18411l c18411l = (C18411l) obj;
        return Float.compare(this.yandex, c18411l.yandex) == 0 && Float.compare(this.loadAd, c18411l.loadAd) == 0 && Float.compare(this.crashlytics, c18411l.crashlytics) == 0 && Float.compare(this.amazon, c18411l.amazon) == 0 && AbstractC8576l.yandex(this.purchase, c18411l.purchase);
    }

    public final int hashCode() {
        return this.purchase.hashCode() + AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31), this.amazon, 31);
    }

    @Override // defpackage.InterfaceC2652l
    public final C18411l loadAd() {
        return crashlytics(AbstractC6969l.yandex);
    }

    public final String toString() {
        return "RGB(r=" + this.yandex + ", g=" + this.loadAd + ", b=" + this.crashlytics + ", alpha=" + this.amazon + ", space=" + this.purchase + ')';
    }

    @Override // defpackage.InterfaceC2652l
    public final C1033l yandex() {
        InterfaceC0379l interfaceC0379l = this.purchase;
        InterfaceC18565l interfaceC18565lPurchase = interfaceC0379l.purchase();
        float[] fArrYandex = interfaceC0379l.yandex();
        float fMopub = interfaceC18565lPurchase.mopub(this.yandex);
        float fMopub2 = interfaceC18565lPurchase.mopub(this.loadAd);
        float fMopub3 = interfaceC18565lPurchase.mopub(this.crashlytics);
        float f = (fArrYandex[2] * fMopub3) + (fArrYandex[1] * fMopub2) + (fArrYandex[0] * fMopub);
        float f2 = (fArrYandex[5] * fMopub3) + (fArrYandex[4] * fMopub2) + (fArrYandex[3] * fMopub);
        float f3 = (fArrYandex[8] * fMopub3) + (fArrYandex[7] * fMopub2) + (fArrYandex[6] * fMopub);
        C3835l c3835lYandex = AbstractC13082l.yandex(interfaceC0379l.amazon());
        c3835lYandex.getClass();
        return new C1033l(f, f2, f3, this.amazon, c3835lYandex);
    }
}
