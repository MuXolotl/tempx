package defpackage;

/* JADX INFO: renamed from: lؒۡٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1406l implements InterfaceC9750l {
    public final C2982l admob;
    public final C2982l amazon;
    public final C2982l billing;
    public final C2536l crashlytics;
    public final C2982l firebase;
    public final C2982l isPro;
    public final InterfaceC15782l loadAd;
    public final C2982l mopub;
    public final C2536l purchase;
    public boolean remoteconfig;
    public final C2982l smaato;
    public final C2982l subs;
    public final C15659l yandex;

    public C1406l(C15659l c15659l, InterfaceC15782l interfaceC15782l, C2536l c2536l, C2982l c2982l, C2536l c2536l2, C2982l c2982l2, C2982l c2982l3, C2982l c2982l4, C2982l c2982l5, C2982l c2982l6, C2982l c2982l7, C2982l c2982l8) {
        this.remoteconfig = false;
        this.yandex = c15659l;
        this.loadAd = interfaceC15782l;
        this.crashlytics = c2536l;
        this.amazon = c2982l;
        this.purchase = c2536l2;
        this.firebase = c2982l2;
        this.smaato = c2982l3;
        this.billing = c2982l4;
        this.mopub = c2982l5;
        this.admob = c2982l6;
        this.subs = c2982l7;
        this.isPro = c2982l8;
    }

    @Override // defpackage.InterfaceC9750l
    public final InterfaceC3012l yandex(C9950l c9950l, C10712l c10712l, AbstractC10437l abstractC10437l) {
        return null;
    }

    public C1406l() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
