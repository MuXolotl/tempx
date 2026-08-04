package defpackage;

/* JADX INFO: renamed from: lؘۥۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6089l implements InterfaceC13593l {
    public final /* synthetic */ InterfaceC16588l yandex;

    public C6089l(InterfaceC16588l interfaceC16588l) {
        this.yandex = interfaceC16588l;
    }

    @Override // defpackage.InterfaceC13593l
    public final InterfaceC16588l[] amazon() {
        return new InterfaceC16588l[]{this.yandex};
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.InterfaceC13593l
    public final /* bridge */ InterfaceC16588l[] yandex() {
        return AbstractC3872l.yandex;
    }
}
