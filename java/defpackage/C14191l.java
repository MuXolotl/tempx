package defpackage;

/* JADX INFO: renamed from: lٓٗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14191l implements InterfaceC9750l {
    public final InterfaceC15782l amazon;
    public final boolean crashlytics;
    public final C2982l loadAd;
    public final Object purchase;
    public final /* synthetic */ int yandex = 1;

    public C14191l(String str, C2982l c2982l, C2982l c2982l2, C1406l c1406l, boolean z) {
        this.loadAd = c2982l;
        this.amazon = c2982l2;
        this.purchase = c1406l;
        this.crashlytics = z;
    }

    public String toString() {
        switch (this.yandex) {
            case 0:
                return "RectangleShape{position=" + this.amazon + ", size=" + ((InterfaceC15782l) this.purchase) + '}';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC9750l
    public final InterfaceC3012l yandex(C9950l c9950l, C10712l c10712l, AbstractC10437l abstractC10437l) {
        switch (this.yandex) {
            case 0:
                return new C14948l(c9950l, abstractC10437l, this);
            default:
                return new C5365l(c9950l, abstractC10437l, this);
        }
    }

    public C14191l(String str, InterfaceC15782l interfaceC15782l, C2536l c2536l, C2982l c2982l, boolean z) {
        this.amazon = interfaceC15782l;
        this.purchase = c2536l;
        this.loadAd = c2982l;
        this.crashlytics = z;
    }
}
