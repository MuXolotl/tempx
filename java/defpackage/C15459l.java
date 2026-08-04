package defpackage;

/* JADX INFO: renamed from: lٕؖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15459l extends AbstractC16223l {
    public static final C15459l crashlytics = new C15459l(C0654l.yandex);

    @Override // defpackage.AbstractC11133l, defpackage.AbstractC17645l
    public final void firebase(InterfaceC14988l interfaceC14988l, int i, Object obj) {
        C15572l c15572l = (C15572l) obj;
        float fIsPro = interfaceC14988l.isPro(this.loadAd, i);
        c15572l.loadAd(c15572l.amazon() + 1);
        float[] fArr = c15572l.yandex;
        int i2 = c15572l.loadAd;
        c15572l.loadAd = i2 + 1;
        fArr[i2] = fIsPro;
    }

    @Override // defpackage.AbstractC16223l
    public final Object metrica() {
        return new float[0];
    }

    @Override // defpackage.AbstractC17645l
    public final Object smaato(Object obj) {
        float[] fArr = (float[]) obj;
        C15572l c15572l = new C15572l();
        c15572l.yandex = fArr;
        c15572l.loadAd = fArr.length;
        c15572l.loadAd(10);
        return c15572l;
    }

    @Override // defpackage.AbstractC16223l
    public final void startapp(InterfaceC0039l interfaceC0039l, Object obj, int i) {
        float[] fArr = (float[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039l;
            abstractC4072l.advert(this.loadAd, i2);
            abstractC4072l.firebase(f);
        }
    }

    @Override // defpackage.AbstractC17645l
    public final int subs(Object obj) {
        return ((float[]) obj).length;
    }
}
