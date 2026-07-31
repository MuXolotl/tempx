package defpackage;

/* JADX INFO: renamed from: lؘ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5757l extends AbstractC16223l {
    public static final C5757l crashlytics = new C5757l(C15256l.yandex);

    @Override // defpackage.AbstractC11133l, defpackage.AbstractC17645l
    public final void firebase(InterfaceC14988l interfaceC14988l, int i, Object obj) {
        C1899l c1899l = (C1899l) obj;
        long jLicense = interfaceC14988l.amazon(this.loadAd, i).license();
        c1899l.loadAd(c1899l.amazon() + 1);
        long[] jArr = c1899l.yandex;
        int i2 = c1899l.loadAd;
        c1899l.loadAd = i2 + 1;
        jArr[i2] = jLicense;
    }

    @Override // defpackage.AbstractC16223l
    public final Object metrica() {
        return new C12339l(new long[0]);
    }

    @Override // defpackage.AbstractC17645l
    public final Object smaato(Object obj) {
        long[] jArr = ((C12339l) obj).f24434l;
        C1899l c1899l = new C1899l();
        c1899l.yandex = jArr;
        c1899l.loadAd = jArr.length;
        c1899l.loadAd(10);
        return c1899l;
    }

    @Override // defpackage.AbstractC16223l
    public final void startapp(InterfaceC0039l interfaceC0039l, Object obj, int i) {
        long[] jArr = ((C12339l) obj).f24434l;
        for (int i2 = 0; i2 < i; i2++) {
            ((AbstractC4072l) interfaceC0039l).isVip(this.loadAd, i2).adcel(jArr[i2]);
        }
    }

    @Override // defpackage.AbstractC17645l
    public final int subs(Object obj) {
        return ((C12339l) obj).f24434l.length;
    }
}
