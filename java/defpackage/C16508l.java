package defpackage;

/* JADX INFO: renamed from: lٖٝؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16508l implements InterfaceC4141l {
    public final C6165l loadAd;
    public final AbstractC14165l yandex;

    public C16508l(AbstractC14165l abstractC14165l, C6165l c6165l) {
        this.yandex = abstractC14165l;
        this.loadAd = c6165l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16508l)) {
            return false;
        }
        C16508l c16508l = (C16508l) obj;
        return this.yandex.equals(c16508l.yandex) && this.loadAd.equals(c16508l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.yandex + ", result=" + this.loadAd + ")";
    }

    @Override // defpackage.InterfaceC4141l
    public final AbstractC14165l yandex() {
        return this.yandex;
    }
}
