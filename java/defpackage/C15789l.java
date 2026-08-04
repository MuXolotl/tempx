package defpackage;

/* JADX INFO: renamed from: lٕٛٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15789l implements InterfaceC12830l {
    public final boolean crashlytics;
    public final boolean loadAd;
    public final EnumC4244l yandex;

    public C15789l(EnumC4244l enumC4244l, boolean z, boolean z2) {
        this.yandex = enumC4244l;
        this.loadAd = z;
        this.crashlytics = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15789l)) {
            return false;
        }
        C15789l c15789l = (C15789l) obj;
        return this.yandex == c15789l.yandex && this.loadAd == c15789l.loadAd && this.crashlytics == c15789l.crashlytics;
    }

    public final int hashCode() {
        return (((this.yandex.hashCode() * 31) + (this.loadAd ? 1231 : 1237)) * 31) + (this.crashlytics ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListPropertyType(storageType=");
        sb.append(this.yandex);
        sb.append(", isNullable=");
        sb.append(this.loadAd);
        sb.append(", isComputed=");
        return AbstractC5020l.Signature(sb, this.crashlytics, ")");
    }
}
