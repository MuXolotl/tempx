package defpackage;

/* JADX INFO: renamed from: lٌّ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12482l implements InterfaceC9750l {
    public final C2982l admob;
    public final C2982l amazon;
    public final C2982l billing;
    public final InterfaceC15782l crashlytics;
    public final boolean isPro;
    public final C2982l loadAd;
    public final C2982l mopub;
    public final C2982l purchase;
    public final boolean subs;
    public final int yandex;

    public C12482l(String str, int i, C2982l c2982l, InterfaceC15782l interfaceC15782l, C2982l c2982l2, C2982l c2982l3, C2982l c2982l4, C2982l c2982l5, C2982l c2982l6, boolean z, boolean z2) {
        this.yandex = i;
        this.loadAd = c2982l;
        this.crashlytics = interfaceC15782l;
        this.amazon = c2982l2;
        this.purchase = c2982l3;
        this.billing = c2982l4;
        this.mopub = c2982l5;
        this.admob = c2982l6;
        this.subs = z;
        this.isPro = z2;
    }

    @Override // defpackage.InterfaceC9750l
    public final InterfaceC3012l yandex(C9950l c9950l, C10712l c10712l, AbstractC10437l abstractC10437l) {
        return new C8591l(c9950l, abstractC10437l, this);
    }
}
