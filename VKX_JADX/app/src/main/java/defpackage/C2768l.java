package defpackage;

/* JADX INFO: renamed from: lٜؔۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2768l {
    public C9117l loadAd;
    public final InterfaceC2702l yandex;
    public final C8152l crashlytics = new C8152l(this, 2);
    public final C8152l amazon = new C8152l(this, 0);
    public final C8152l purchase = new C8152l(this, 1);

    public C2768l(InterfaceC2702l interfaceC2702l) {
        this.yandex = interfaceC2702l;
    }

    public final C9117l yandex() {
        C9117l c9117l = this.loadAd;
        if (c9117l != null) {
            return c9117l;
        }
        C8339l.metrica("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
