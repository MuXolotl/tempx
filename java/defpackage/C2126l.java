package defpackage;

/* JADX INFO: renamed from: lؘؓۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2126l implements InterfaceC12830l {
    public final boolean amazon;
    public final boolean crashlytics;
    public final boolean loadAd;
    public final boolean purchase;
    public final EnumC4244l yandex;

    public C2126l(EnumC4244l enumC4244l, boolean z, boolean z2, boolean z3, boolean z4) {
        this.yandex = enumC4244l;
        this.loadAd = z;
        this.crashlytics = z2;
        this.amazon = z3;
        this.purchase = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2126l)) {
            return false;
        }
        C2126l c2126l = (C2126l) obj;
        return this.yandex == c2126l.yandex && this.loadAd == c2126l.loadAd && this.crashlytics == c2126l.crashlytics && this.amazon == c2126l.amazon && this.purchase == c2126l.purchase;
    }

    public final int hashCode() {
        return (((((((this.yandex.hashCode() * 31) + (this.loadAd ? 1231 : 1237)) * 31) + (this.crashlytics ? 1231 : 1237)) * 31) + (this.amazon ? 1231 : 1237)) * 31) + (this.purchase ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValuePropertyType(storageType=");
        sb.append(this.yandex);
        sb.append(", isNullable=");
        sb.append(this.loadAd);
        sb.append(", isPrimaryKey=");
        sb.append(this.crashlytics);
        sb.append(", isIndexed=");
        sb.append(this.amazon);
        sb.append(", isFullTextIndexed=");
        return AbstractC5020l.Signature(sb, this.purchase, ")");
    }
}
