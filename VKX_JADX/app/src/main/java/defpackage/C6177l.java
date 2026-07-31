package defpackage;

/* JADX INFO: renamed from: lؙؑؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6177l extends AbstractC16223l {
    public static final C6177l crashlytics = new C6177l(C5915l.yandex);

    @Override // defpackage.AbstractC11133l, defpackage.AbstractC17645l
    public final void firebase(InterfaceC14988l interfaceC14988l, int i, Object obj) {
        C15236l c15236l = (C15236l) obj;
        byte bSignatures = interfaceC14988l.amazon(this.loadAd, i).signatures();
        c15236l.loadAd(c15236l.amazon() + 1);
        byte[] bArr = c15236l.yandex;
        int i2 = c15236l.loadAd;
        c15236l.loadAd = i2 + 1;
        bArr[i2] = bSignatures;
    }

    @Override // defpackage.AbstractC16223l
    public final Object metrica() {
        return new C2189l(new byte[0]);
    }

    @Override // defpackage.AbstractC17645l
    public final Object smaato(Object obj) {
        byte[] bArr = ((C2189l) obj).f4838l;
        C15236l c15236l = new C15236l();
        c15236l.yandex = bArr;
        c15236l.loadAd = bArr.length;
        c15236l.loadAd(10);
        return c15236l;
    }

    @Override // defpackage.AbstractC16223l
    public final void startapp(InterfaceC0039l interfaceC0039l, Object obj, int i) {
        byte[] bArr = ((C2189l) obj).f4838l;
        for (int i2 = 0; i2 < i; i2++) {
            ((AbstractC4072l) interfaceC0039l).isVip(this.loadAd, i2).admob(bArr[i2]);
        }
    }

    @Override // defpackage.AbstractC17645l
    public final int subs(Object obj) {
        return ((C2189l) obj).f4838l.length;
    }
}
