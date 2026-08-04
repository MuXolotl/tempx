package defpackage;

/* JADX INFO: renamed from: lؙّٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12618l implements InterfaceC12830l {
    public final boolean loadAd;
    public final EnumC4244l yandex;

    public C12618l(EnumC4244l enumC4244l, boolean z) {
        this.yandex = enumC4244l;
        this.loadAd = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12618l)) {
            return false;
        }
        C12618l c12618l = (C12618l) obj;
        return this.yandex == c12618l.yandex && this.loadAd == c12618l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + (this.loadAd ? 1231 : 1237);
    }

    public final String toString() {
        return "SetPropertyType(storageType=" + this.yandex + ", isNullable=" + this.loadAd + ")";
    }
}
