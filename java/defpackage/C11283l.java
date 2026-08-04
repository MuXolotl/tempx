package defpackage;

/* JADX INFO: renamed from: lُۙؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11283l implements InterfaceC9750l {
    public final C2982l amazon;
    public final C2982l crashlytics;
    public final C2982l loadAd;
    public final boolean purchase;
    public final int yandex;

    public C11283l(String str, int i, C2982l c2982l, C2982l c2982l2, C2982l c2982l3, boolean z) {
        this.yandex = i;
        this.loadAd = c2982l;
        this.crashlytics = c2982l2;
        this.amazon = c2982l3;
        this.purchase = z;
    }

    public final String toString() {
        return "Trim Path: {start: " + this.loadAd + ", end: " + this.crashlytics + ", offset: " + this.amazon + "}";
    }

    @Override // defpackage.InterfaceC9750l
    public final InterfaceC3012l yandex(C9950l c9950l, C10712l c10712l, AbstractC10437l abstractC10437l) {
        return new C18251l(abstractC10437l, this);
    }
}
