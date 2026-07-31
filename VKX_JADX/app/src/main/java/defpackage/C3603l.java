package defpackage;

/* JADX INFO: renamed from: lؕۙۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3603l {
    public final C2369l amazon;
    public final InterfaceC12932l billing;
    public final C5918l crashlytics;
    public final C8485l loadAd;
    public final C8485l mopub = AbstractC7973l.loadAd(null);
    public final Object purchase;
    public final C2759l yandex;

    public C3603l(C2759l c2759l, C8485l c8485l, C5918l c5918l, C2369l c2369l, Object obj, InterfaceC12932l interfaceC12932l) {
        this.yandex = c2759l;
        this.loadAd = c8485l;
        this.crashlytics = c5918l;
        this.amazon = c2369l;
        this.purchase = obj;
        this.billing = interfaceC12932l;
    }

    public final String toString() {
        return "HttpResponseData=(statusCode=" + this.yandex + ')';
    }
}
