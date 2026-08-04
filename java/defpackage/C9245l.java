package defpackage;

/* JADX INFO: renamed from: lٍؐۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9245l implements InterfaceC3610l {
    public final int crashlytics;
    public final boolean loadAd;
    public final InterfaceC1286l yandex;

    public C9245l(InterfaceC1286l interfaceC1286l, boolean z, int i) {
        this.yandex = interfaceC1286l;
        this.loadAd = z;
        this.crashlytics = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9245l)) {
            return false;
        }
        C9245l c9245l = (C9245l) obj;
        return this.yandex.equals(c9245l.yandex) && this.loadAd == c9245l.loadAd && this.crashlytics == c9245l.crashlytics;
    }

    public final int hashCode() {
        return AbstractC5020l.inmobi(this.crashlytics) + (((this.yandex.hashCode() * 31) + (this.loadAd ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.yandex + ", isSampled=" + this.loadAd + ", dataSource=" + AbstractC11043l.ad(this.crashlytics) + ")";
    }
}
