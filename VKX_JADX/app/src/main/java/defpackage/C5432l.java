package defpackage;

/* JADX INFO: renamed from: lؘّؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5432l {
    public final boolean loadAd;
    public final C12638l yandex;

    public C5432l(C12638l c12638l, boolean z) {
        this.yandex = c12638l;
        this.loadAd = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5432l) {
            C5432l c5432l = (C5432l) obj;
            if (c5432l.yandex.equals(this.yandex) && c5432l.loadAd == this.loadAd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.loadAd).hashCode() ^ ((this.yandex.hashCode() ^ 1000003) * 1000003);
    }
}
