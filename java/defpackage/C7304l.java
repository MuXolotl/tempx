package defpackage;

/* JADX INFO: renamed from: lؚٟٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7304l implements InterfaceC12830l {
    public final boolean loadAd;
    public final EnumC4244l yandex;

    public C7304l(EnumC4244l enumC4244l, boolean z) {
        this.yandex = enumC4244l;
        this.loadAd = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7304l)) {
            return false;
        }
        C7304l c7304l = (C7304l) obj;
        return this.yandex == c7304l.yandex && this.loadAd == c7304l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + (this.loadAd ? 1231 : 1237);
    }

    public final String toString() {
        return "MapPropertyType(storageType=" + this.yandex + ", isNullable=" + this.loadAd + ")";
    }
}
