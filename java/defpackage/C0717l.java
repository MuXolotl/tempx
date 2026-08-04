package defpackage;

/* JADX INFO: renamed from: lؑۦۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0717l {
    public final boolean admob;
    public final long amazon;
    public final int billing;
    public final String crashlytics;
    public final boolean firebase;
    public final String isPro;
    public final String loadAd;
    public final boolean mopub;
    public final int purchase;
    public final String subs;
    public final InterfaceC1835l yandex;

    public C0717l(C11085l c11085l, InterfaceC1835l interfaceC1835l) {
        this.yandex = interfaceC1835l;
        this.loadAd = c11085l.yandex;
        this.crashlytics = c11085l.loadAd;
        this.amazon = c11085l.mopub;
        this.purchase = c11085l.amazon;
        this.billing = c11085l.crashlytics;
        this.mopub = c11085l.subs;
        this.admob = c11085l.isPro;
        this.subs = c11085l.purchase;
        this.isPro = c11085l.billing;
        this.firebase = c11085l.remoteconfig;
    }
}
