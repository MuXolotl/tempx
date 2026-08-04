package defpackage;

/* JADX INFO: renamed from: lًًؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4747l extends AbstractC16223l {
    public static final C4747l crashlytics = new C4747l(C18169l.yandex);

    @Override // defpackage.AbstractC11133l, defpackage.AbstractC17645l
    public final void firebase(InterfaceC14988l interfaceC14988l, int i, Object obj) {
        C15167l c15167l = (C15167l) obj;
        short sMetrica = interfaceC14988l.metrica(this.loadAd, i);
        c15167l.loadAd(c15167l.amazon() + 1);
        short[] sArr = c15167l.yandex;
        int i2 = c15167l.loadAd;
        c15167l.loadAd = i2 + 1;
        sArr[i2] = sMetrica;
    }

    @Override // defpackage.AbstractC16223l
    public final Object metrica() {
        return new short[0];
    }

    @Override // defpackage.AbstractC17645l
    public final Object smaato(Object obj) {
        short[] sArr = (short[]) obj;
        C15167l c15167l = new C15167l();
        c15167l.yandex = sArr;
        c15167l.loadAd = sArr.length;
        c15167l.loadAd(10);
        return c15167l;
    }

    @Override // defpackage.AbstractC16223l
    public final void startapp(InterfaceC0039l interfaceC0039l, Object obj, int i) {
        short[] sArr = (short[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            short s = sArr[i2];
            AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039l;
            abstractC4072l.advert(this.loadAd, i2);
            abstractC4072l.mopub(s);
        }
    }

    @Override // defpackage.AbstractC17645l
    public final int subs(Object obj) {
        return ((short[]) obj).length;
    }
}
