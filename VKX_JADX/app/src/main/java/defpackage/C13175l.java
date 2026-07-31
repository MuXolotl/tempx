package defpackage;

/* JADX INFO: renamed from: lؘْۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13175l implements InterfaceC16588l {
    public static final C13175l yandex = new C13175l();
    public static final C0075l loadAd = C0075l.yandex;

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        throw new C14747l("'kotlin.Nothing' cannot be serialized");
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        throw new C14747l("'kotlin.Nothing' does not have instances");
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}
