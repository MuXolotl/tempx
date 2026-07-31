package defpackage;

/* JADX INFO: renamed from: lؚْۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7235l extends AbstractC16223l {
    public static final C7235l crashlytics = new C7235l(C4162l.yandex);

    @Override // defpackage.AbstractC11133l, defpackage.AbstractC17645l
    public final void firebase(InterfaceC14988l interfaceC14988l, int i, Object obj) {
        C16247l c16247l = (C16247l) obj;
        byte bSmaato = interfaceC14988l.smaato(this.loadAd, i);
        c16247l.loadAd(c16247l.amazon() + 1);
        byte[] bArr = c16247l.yandex;
        int i2 = c16247l.loadAd;
        c16247l.loadAd = i2 + 1;
        bArr[i2] = bSmaato;
    }

    @Override // defpackage.AbstractC16223l
    public final Object metrica() {
        return new byte[0];
    }

    @Override // defpackage.AbstractC17645l
    public final Object smaato(Object obj) {
        byte[] bArr = (byte[]) obj;
        C16247l c16247l = new C16247l();
        c16247l.yandex = bArr;
        c16247l.loadAd = bArr.length;
        c16247l.loadAd(10);
        return c16247l;
    }

    @Override // defpackage.AbstractC16223l
    public final void startapp(InterfaceC0039l interfaceC0039l, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039l;
            abstractC4072l.advert(this.loadAd, i2);
            abstractC4072l.admob(b);
        }
    }

    @Override // defpackage.AbstractC17645l
    public final int subs(Object obj) {
        return ((byte[]) obj).length;
    }
}
