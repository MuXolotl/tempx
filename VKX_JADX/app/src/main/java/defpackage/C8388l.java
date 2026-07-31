package defpackage;

/* JADX INFO: renamed from: lًۥؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8388l extends AbstractC16223l {
    public static final C8388l crashlytics = new C8388l(C12975l.yandex);

    @Override // defpackage.AbstractC11133l, defpackage.AbstractC17645l
    public final void firebase(InterfaceC14988l interfaceC14988l, int i, Object obj) {
        C9906l c9906l = (C9906l) obj;
        int iVip = interfaceC14988l.amazon(this.loadAd, i).vip();
        c9906l.loadAd(c9906l.amazon() + 1);
        int[] iArr = c9906l.yandex;
        int i2 = c9906l.loadAd;
        c9906l.loadAd = i2 + 1;
        iArr[i2] = iVip;
    }

    @Override // defpackage.AbstractC16223l
    public final Object metrica() {
        return new C4055l(new int[0]);
    }

    @Override // defpackage.AbstractC17645l
    public final Object smaato(Object obj) {
        int[] iArr = ((C4055l) obj).f8351l;
        C9906l c9906l = new C9906l();
        c9906l.yandex = iArr;
        c9906l.loadAd = iArr.length;
        c9906l.loadAd(10);
        return c9906l;
    }

    @Override // defpackage.AbstractC16223l
    public final void startapp(InterfaceC0039l interfaceC0039l, Object obj, int i) {
        int[] iArr = ((C4055l) obj).f8351l;
        for (int i2 = 0; i2 < i; i2++) {
            ((AbstractC4072l) interfaceC0039l).isVip(this.loadAd, i2).metrica(iArr[i2]);
        }
    }

    @Override // defpackage.AbstractC17645l
    public final int subs(Object obj) {
        return ((C4055l) obj).f8351l.length;
    }
}
