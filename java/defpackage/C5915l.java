package defpackage;

/* JADX INFO: renamed from: lؘِۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5915l implements InterfaceC16588l {
    public static final C5915l yandex = new C5915l();
    public static final C11474l loadAd = AbstractC12155l.loadAd(C4162l.yandex, "kotlin.UByte");

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        interfaceC17739l.isPro(loadAd).admob(((C15962l) obj).f31334l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        return new C15962l(interfaceC10726l.adcel(loadAd).signatures());
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}
