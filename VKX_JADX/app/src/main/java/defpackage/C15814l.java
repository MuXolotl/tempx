package defpackage;

/* JADX INFO: renamed from: lٕٝؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15814l {
    public C12268l amazon;
    public final C11232l billing;
    public final C7424l crashlytics;
    public final C4236l loadAd;
    public C7504l purchase;
    public final C6379l yandex;

    public C15814l(C6379l c6379l, C4236l c4236l, C7424l c7424l) {
        this.yandex = c6379l;
        this.loadAd = c4236l;
        this.crashlytics = c7424l;
        AbstractC0018l.yandex();
        C12014l c12014lLoadAd = C11232l.loadAd();
        c12014lLoadAd.f23943l = C9676l.f19754l;
        c12014lLoadAd.f23941l = C15026l.mopub;
        c12014lLoadAd.f23940l = C6636l.amazon;
        c12014lLoadAd.f23944l = C2204l.purchase;
        this.billing = c12014lLoadAd.firebase();
    }

    public static final void yandex(C15814l c15814l) {
        C7504l c7504l = c15814l.purchase;
        if (c7504l != null) {
            c7504l.ads(null);
        }
        c15814l.purchase = null;
        c15814l.amazon = null;
    }
}
