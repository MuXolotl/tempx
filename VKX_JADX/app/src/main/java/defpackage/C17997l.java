package defpackage;

/* JADX INFO: renamed from: lٍ٘ٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17997l extends AbstractC16223l {
    public static final C17997l crashlytics = new C17997l(C15023l.yandex);

    @Override // defpackage.AbstractC11133l, defpackage.AbstractC17645l
    public final void firebase(InterfaceC14988l interfaceC14988l, int i, Object obj) {
        C12374l c12374l = (C12374l) obj;
        short sApplovin = interfaceC14988l.amazon(this.loadAd, i).applovin();
        c12374l.loadAd(c12374l.amazon() + 1);
        short[] sArr = c12374l.yandex;
        int i2 = c12374l.loadAd;
        c12374l.loadAd = i2 + 1;
        sArr[i2] = sApplovin;
    }

    @Override // defpackage.AbstractC16223l
    public final Object metrica() {
        return new C15868l(new short[0]);
    }

    @Override // defpackage.AbstractC17645l
    public final Object smaato(Object obj) {
        short[] sArr = ((C15868l) obj).f31138l;
        C12374l c12374l = new C12374l();
        c12374l.yandex = sArr;
        c12374l.loadAd = sArr.length;
        c12374l.loadAd(10);
        return c12374l;
    }

    @Override // defpackage.AbstractC16223l
    public final void startapp(InterfaceC0039l interfaceC0039l, Object obj, int i) {
        short[] sArr = ((C15868l) obj).f31138l;
        for (int i2 = 0; i2 < i; i2++) {
            ((AbstractC4072l) interfaceC0039l).isVip(this.loadAd, i2).mopub(sArr[i2]);
        }
    }

    @Override // defpackage.AbstractC17645l
    public final int subs(Object obj) {
        return ((C15868l) obj).f31138l.length;
    }
}
