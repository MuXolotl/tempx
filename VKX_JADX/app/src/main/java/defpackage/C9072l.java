package defpackage;

/* JADX INFO: renamed from: lٌ۟ؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9072l {
    public final C6410l loadAd;
    public final String yandex;

    public C9072l(String str, C6410l c6410l) {
        this.yandex = str;
        this.loadAd = c6410l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9072l)) {
            return false;
        }
        C9072l c9072l = (C9072l) obj;
        return this.yandex.equals(c9072l.yandex) && AbstractC8576l.yandex(this.loadAd, c9072l.loadAd);
    }

    public final int hashCode() {
        int iHashCode = ((this.yandex.hashCode() * 31) - 1) * 31;
        C6410l c6410l = this.loadAd;
        return iHashCode + (c6410l == null ? 0 : c6410l.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo(mimeType=" + this.yandex + ", profile=-1, compatibleVideoProfile=" + this.loadAd + ')';
    }
}
