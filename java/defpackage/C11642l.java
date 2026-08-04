package defpackage;

/* JADX INFO: renamed from: lِؗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11642l extends AbstractC16223l {
    public static final C11642l crashlytics = new C11642l(C2796l.yandex);

    @Override // defpackage.AbstractC11133l, defpackage.AbstractC17645l
    public final void firebase(InterfaceC14988l interfaceC14988l, int i, Object obj) {
        C16602l c16602l = (C16602l) obj;
        boolean zIsVip = interfaceC14988l.isVip(this.loadAd, i);
        c16602l.loadAd(c16602l.amazon() + 1);
        boolean[] zArr = c16602l.yandex;
        int i2 = c16602l.loadAd;
        c16602l.loadAd = i2 + 1;
        zArr[i2] = zIsVip;
    }

    @Override // defpackage.AbstractC16223l
    public final Object metrica() {
        return new boolean[0];
    }

    @Override // defpackage.AbstractC17645l
    public final Object smaato(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        C16602l c16602l = new C16602l();
        c16602l.yandex = zArr;
        c16602l.loadAd = zArr.length;
        c16602l.loadAd(10);
        return c16602l;
    }

    @Override // defpackage.AbstractC16223l
    public final void startapp(InterfaceC0039l interfaceC0039l, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            ((AbstractC4072l) interfaceC0039l).ad(this.loadAd, i2, zArr[i2]);
        }
    }

    @Override // defpackage.AbstractC17645l
    public final int subs(Object obj) {
        return ((boolean[]) obj).length;
    }
}
