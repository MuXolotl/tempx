package defpackage;

/* JADX INFO: renamed from: lَٖۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16629l extends AbstractC16223l {
    public static final C16629l crashlytics = new C16629l(C2010l.yandex);

    @Override // defpackage.AbstractC11133l, defpackage.AbstractC17645l
    public final void firebase(InterfaceC14988l interfaceC14988l, int i, Object obj) {
        C7562l c7562l = (C7562l) obj;
        long jInmobi = interfaceC14988l.inmobi(this.loadAd, i);
        c7562l.loadAd(c7562l.amazon() + 1);
        long[] jArr = c7562l.yandex;
        int i2 = c7562l.loadAd;
        c7562l.loadAd = i2 + 1;
        jArr[i2] = jInmobi;
    }

    @Override // defpackage.AbstractC16223l
    public final Object metrica() {
        return new long[0];
    }

    @Override // defpackage.AbstractC17645l
    public final Object smaato(Object obj) {
        long[] jArr = (long[]) obj;
        C7562l c7562l = new C7562l();
        c7562l.yandex = jArr;
        c7562l.loadAd = jArr.length;
        c7562l.loadAd(10);
        return c7562l;
    }

    @Override // defpackage.AbstractC16223l
    public final void startapp(InterfaceC0039l interfaceC0039l, Object obj, int i) {
        long[] jArr = (long[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            ((AbstractC4072l) interfaceC0039l).premium(this.loadAd, i2, jArr[i2]);
        }
    }

    @Override // defpackage.AbstractC17645l
    public final int subs(Object obj) {
        return ((long[]) obj).length;
    }
}
