package defpackage;

/* JADX INFO: renamed from: lؚ۠ؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7549l implements InterfaceC2478l, InterfaceC6942l, InterfaceC5305l {
    private final InterfaceC7042l job;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2478l f15551l;

    public C7549l(C1008l c1008l, C7504l c7504l) {
        this.f15551l = c1008l;
        this.job = c7504l;
    }

    @Override // defpackage.InterfaceC2478l
    public final Object getValue() {
        return this.f15551l.getValue();
    }

    @Override // defpackage.InterfaceC5305l
    public final InterfaceC6942l loadAd(InterfaceC12932l interfaceC12932l, int i, int i2) {
        return (((i < 0 || i >= 2) && i != -2) || i2 != 2) ? AbstractC3861l.purchase(this, interfaceC12932l, i, i2) : this;
    }

    @Override // defpackage.InterfaceC6942l
    public final Object yandex(InterfaceC9427l interfaceC9427l, InterfaceC14029l interfaceC14029l) {
        return this.f15551l.yandex(interfaceC9427l, interfaceC14029l);
    }
}
