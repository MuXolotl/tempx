package defpackage;

/* JADX INFO: renamed from: lۣؗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5253l implements InterfaceC0796l {
    public final C15089l loadAd;
    public final C15089l yandex;

    public C5253l(C15089l c15089l, C15089l c15089l2) {
        this.yandex = c15089l;
        this.loadAd = c15089l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5253l)) {
            return false;
        }
        C5253l c5253l = (C5253l) obj;
        return this.yandex.equals(c5253l.yandex) && this.loadAd.equals(c5253l.loadAd);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.loadAd.yandex) + (Float.floatToIntBits(this.yandex.yandex) * 31);
    }

    public final String toString() {
        return "Horizontal(menuAlignment=" + this.yandex + ", anchorAlignment=" + this.loadAd + ")";
    }

    @Override // defpackage.InterfaceC0796l
    public final int yandex(C16918l c16918l, long j, int i, EnumC9931l enumC9931l) {
        int iYandex = this.loadAd.yandex(0, c16918l.amazon(), enumC9931l);
        return c16918l.yandex + iYandex + (-this.yandex.yandex(0, i, enumC9931l));
    }
}
