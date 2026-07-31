package defpackage;

/* JADX INFO: renamed from: lُٜۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11181l implements InterfaceC9708l {
    public InterfaceC12001l yandex = C9885l.yandex;

    @Override // defpackage.InterfaceC9708l
    public final void crashlytics(InterfaceC12001l interfaceC12001l) {
        this.yandex = interfaceC12001l;
    }

    @Override // defpackage.InterfaceC9708l
    public final InterfaceC12001l loadAd() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC9708l
    public final InterfaceC9708l yandex() {
        C11181l c11181l = new C11181l();
        c11181l.yandex = this.yandex;
        return c11181l;
    }
}
