package defpackage;

/* JADX INFO: renamed from: lٕٗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17152l implements InterfaceC3284l {
    public final int loadAd;
    public final long yandex;

    public C17152l(long j, int i) {
        this.yandex = j;
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17152l)) {
            return false;
        }
        C17152l c17152l = (C17152l) obj;
        return this.yandex == c17152l.yandex && this.loadAd == c17152l.loadAd;
    }

    public final int hashCode() {
        long j = this.yandex;
        return (((int) (j ^ (j >>> 32))) * 31) + this.loadAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Present(uid=");
        sb.append(this.yandex);
        sb.append(", size=");
        return AbstractC0653l.adcel(sb, this.loadAd, ')');
    }
}
