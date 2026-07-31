package defpackage;

/* JADX INFO: renamed from: lؖؑٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3837l extends AbstractC16223l {
    public static final C3837l crashlytics = new C3837l(C7872l.yandex);

    @Override // defpackage.AbstractC11133l, defpackage.AbstractC17645l
    public final void firebase(InterfaceC14988l interfaceC14988l, int i, Object obj) {
        C9650l c9650l = (C9650l) obj;
        double dPremium = interfaceC14988l.premium(this.loadAd, i);
        c9650l.loadAd(c9650l.amazon() + 1);
        double[] dArr = c9650l.yandex;
        int i2 = c9650l.loadAd;
        c9650l.loadAd = i2 + 1;
        dArr[i2] = dPremium;
    }

    @Override // defpackage.AbstractC16223l
    public final Object metrica() {
        return new double[0];
    }

    @Override // defpackage.AbstractC17645l
    public final Object smaato(Object obj) {
        double[] dArr = (double[]) obj;
        C9650l c9650l = new C9650l();
        c9650l.yandex = dArr;
        c9650l.loadAd = dArr.length;
        c9650l.loadAd(10);
        return c9650l;
    }

    @Override // defpackage.AbstractC16223l
    public final void startapp(InterfaceC0039l interfaceC0039l, Object obj, int i) {
        double[] dArr = (double[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            double d = dArr[i2];
            AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039l;
            abstractC4072l.advert(this.loadAd, i2);
            abstractC4072l.billing(d);
        }
    }

    @Override // defpackage.AbstractC17645l
    public final int subs(Object obj) {
        return ((double[]) obj).length;
    }
}
