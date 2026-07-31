package defpackage;

/* JADX INFO: renamed from: lَٜٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15023l implements InterfaceC16588l {
    public static final C15023l yandex = new C15023l();
    public static final C11474l loadAd = AbstractC12155l.loadAd(C18169l.yandex, "kotlin.UShort");

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        interfaceC17739l.isPro(loadAd).mopub(((C15717l) obj).f30858l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        return new C15717l(interfaceC10726l.adcel(loadAd).applovin());
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}
