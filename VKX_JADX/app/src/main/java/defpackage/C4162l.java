package defpackage;

/* JADX INFO: renamed from: lٖؖۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4162l implements InterfaceC16588l {
    public static final C4162l yandex = new C4162l();
    public static final C17606l loadAd = new C17606l("kotlin.Byte", C15358l.purchase);

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        interfaceC17739l.admob(((Number) obj).byteValue());
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        return Byte.valueOf(interfaceC10726l.signatures());
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}
