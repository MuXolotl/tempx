package defpackage;

/* JADX INFO: renamed from: lَۦٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10710l implements InterfaceC4141l {
    public final C14542l loadAd;
    public final AbstractC14165l yandex;

    public C10710l(AbstractC14165l abstractC14165l, C14542l c14542l) {
        this.yandex = abstractC14165l;
        this.loadAd = c14542l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10710l)) {
            return false;
        }
        C10710l c10710l = (C10710l) obj;
        return AbstractC8576l.yandex(this.yandex, c10710l.yandex) && this.loadAd.equals(c10710l.loadAd);
    }

    public final int hashCode() {
        AbstractC14165l abstractC14165l = this.yandex;
        return this.loadAd.hashCode() + ((abstractC14165l == null ? 0 : abstractC14165l.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.yandex + ", result=" + this.loadAd + ")";
    }

    @Override // defpackage.InterfaceC4141l
    public final AbstractC14165l yandex() {
        return this.yandex;
    }
}
