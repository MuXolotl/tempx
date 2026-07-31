package defpackage;

/* JADX INFO: renamed from: lٔؐۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14595l extends AbstractC13151l {
    public static final C14595l yandex = new C14595l();
    public static final InterfaceC1220l loadAd = AbstractC9968l.crashlytics(2, new C3321l(3));

    @Override // defpackage.AbstractC13151l
    public final InterfaceC1388l admob() {
        return AbstractC18202l.yandex.loadAd(AbstractC5543l.class);
    }

    @Override // defpackage.AbstractC13151l
    public final InterfaceC16588l billing(InterfaceC14988l interfaceC14988l, String str) {
        return ((C14691l) loadAd.getValue()).billing(interfaceC14988l, str);
    }

    @Override // defpackage.AbstractC13151l
    public final InterfaceC16588l mopub(InterfaceC17739l interfaceC17739l, Object obj) {
        return ((C14691l) loadAd.getValue()).mopub(interfaceC17739l, (AbstractC5543l) obj);
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return ((C14691l) loadAd.getValue()).purchase();
    }
}
