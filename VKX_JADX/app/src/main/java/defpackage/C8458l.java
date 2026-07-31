package defpackage;

/* JADX INFO: renamed from: lٌؐؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8458l implements InterfaceC16588l {
    public static final C8458l yandex = new C8458l();
    public static final C17606l loadAd = new C17606l("kotlin.time.Instant", C15358l.smaato);

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        interfaceC17739l.subscription(((C2106l) obj).toString());
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        C2106l c2106l = C2106l.f4733l;
        return C16367l.advert(interfaceC10726l.tapsense());
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}
