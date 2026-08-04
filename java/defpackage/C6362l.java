package defpackage;

/* JADX INFO: renamed from: lٍؙۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6362l implements InterfaceC4436l {
    public final C0086l loadAd;
    public final C0086l yandex;

    public C6362l(C0086l c0086l, C0086l c0086l2) {
        this.yandex = c0086l;
        this.loadAd = c0086l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6362l)) {
            return false;
        }
        C6362l c6362l = (C6362l) obj;
        return this.yandex.equals(c6362l.yandex) && this.loadAd.equals(c6362l.loadAd);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.loadAd.yandex) + (Float.floatToIntBits(this.yandex.yandex) * 31);
    }

    public final String toString() {
        return "Vertical(menuAlignment=" + this.yandex + ", anchorAlignment=" + this.loadAd + ")";
    }

    @Override // defpackage.InterfaceC4436l
    public final int yandex(C16918l c16918l, long j, int i) {
        int iYandex = this.loadAd.yandex(0, c16918l.loadAd());
        return c16918l.loadAd + iYandex + (-this.yandex.yandex(0, i));
    }
}
