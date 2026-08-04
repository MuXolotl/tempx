package defpackage;

/* JADX INFO: renamed from: lْؒٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13074l implements InterfaceC9708l {
    public Float amazon;
    public C12922l crashlytics;
    public InterfaceC17045l loadAd;
    public InterfaceC12001l yandex = C9885l.yandex;
    public int purchase = 1;

    @Override // defpackage.InterfaceC9708l
    public final void crashlytics(InterfaceC12001l interfaceC12001l) {
        this.yandex = interfaceC12001l;
    }

    @Override // defpackage.InterfaceC9708l
    public final InterfaceC12001l loadAd() {
        return this.yandex;
    }

    public final String toString() {
        return "EmittableImage(modifier=" + this.yandex + ", provider=" + this.loadAd + ", colorFilterParams=" + this.crashlytics + ", alpha=" + this.amazon + ", contentScale=" + ((Object) C0219l.yandex(this.purchase)) + ')';
    }

    @Override // defpackage.InterfaceC9708l
    public final InterfaceC9708l yandex() {
        C13074l c13074l = new C13074l();
        c13074l.yandex = this.yandex;
        c13074l.loadAd = this.loadAd;
        c13074l.crashlytics = this.crashlytics;
        c13074l.amazon = this.amazon;
        c13074l.purchase = this.purchase;
        return c13074l;
    }
}
