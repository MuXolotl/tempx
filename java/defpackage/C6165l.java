package defpackage;

/* JADX INFO: renamed from: lؙؐٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6165l implements InterfaceC11509l {
    public final C1791l amazon;
    public final boolean billing;
    public final int crashlytics;
    public final C7819l loadAd;
    public final boolean mopub;
    public final String purchase;
    public final InterfaceC1286l yandex;

    public C6165l(InterfaceC1286l interfaceC1286l, C7819l c7819l, int i, C1791l c1791l, String str, boolean z, boolean z2) {
        this.yandex = interfaceC1286l;
        this.loadAd = c7819l;
        this.crashlytics = i;
        this.amazon = c1791l;
        this.purchase = str;
        this.billing = z;
        this.mopub = z2;
    }

    @Override // defpackage.InterfaceC11509l
    public final C7819l billing() {
        return this.loadAd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6165l)) {
            return false;
        }
        C6165l c6165l = (C6165l) obj;
        return AbstractC8576l.yandex(this.yandex, c6165l.yandex) && AbstractC8576l.yandex(this.loadAd, c6165l.loadAd) && this.crashlytics == c6165l.crashlytics && AbstractC8576l.yandex(this.amazon, c6165l.amazon) && AbstractC8576l.yandex(this.purchase, c6165l.purchase) && this.billing == c6165l.billing && this.mopub == c6165l.mopub;
    }

    public final int hashCode() {
        int iFirebase = AbstractC0653l.firebase(this.crashlytics, (this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31, 31);
        C1791l c1791l = this.amazon;
        int iHashCode = (iFirebase + (c1791l == null ? 0 : c1791l.hashCode())) * 31;
        String str = this.purchase;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + (this.billing ? 1231 : 1237)) * 31) + (this.mopub ? 1231 : 1237);
    }

    @Override // defpackage.InterfaceC11509l
    public final InterfaceC1286l startapp() {
        return this.yandex;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.yandex);
        sb.append(", request=");
        sb.append(this.loadAd);
        sb.append(", dataSource=");
        sb.append(AbstractC11043l.ad(this.crashlytics));
        sb.append(", memoryCacheKey=");
        sb.append(this.amazon);
        sb.append(", diskCacheKey=");
        sb.append(this.purchase);
        sb.append(", isSampled=");
        sb.append(this.billing);
        sb.append(", isPlaceholderCached=");
        return AbstractC5020l.Signature(sb, this.mopub, ")");
    }
}
