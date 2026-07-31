package defpackage;

/* JADX INFO: renamed from: lٟؕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3395l extends AbstractC16223l {
    public static final C3395l crashlytics = new C3395l(C18279l.yandex);

    @Override // defpackage.AbstractC11133l, defpackage.AbstractC17645l
    public final void firebase(InterfaceC14988l interfaceC14988l, int i, Object obj) {
        C17521l c17521l = (C17521l) obj;
        char cSubs = interfaceC14988l.subs(this.loadAd, i);
        c17521l.loadAd(c17521l.amazon() + 1);
        char[] cArr = c17521l.yandex;
        int i2 = c17521l.loadAd;
        c17521l.loadAd = i2 + 1;
        cArr[i2] = cSubs;
    }

    @Override // defpackage.AbstractC16223l
    public final Object metrica() {
        return new char[0];
    }

    @Override // defpackage.AbstractC17645l
    public final Object smaato(Object obj) {
        char[] cArr = (char[]) obj;
        C17521l c17521l = new C17521l();
        c17521l.yandex = cArr;
        c17521l.loadAd = cArr.length;
        c17521l.loadAd(10);
        return c17521l;
    }

    @Override // defpackage.AbstractC16223l
    public final void startapp(InterfaceC0039l interfaceC0039l, Object obj, int i) {
        char[] cArr = (char[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            char c = cArr[i2];
            AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039l;
            abstractC4072l.advert(this.loadAd, i2);
            abstractC4072l.smaato(c);
        }
    }

    @Override // defpackage.AbstractC17645l
    public final int subs(Object obj) {
        return ((char[]) obj).length;
    }
}
