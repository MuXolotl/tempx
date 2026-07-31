package defpackage;

/* JADX INFO: renamed from: lِٓؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13848l {
    public final C15667l amazon;
    public final C12347l crashlytics;
    public final int loadAd;
    public final EnumC18024l yandex;

    public /* synthetic */ C13848l(EnumC18024l enumC18024l, int i, C12347l c12347l, C15667l c15667l, int i2) {
        this(enumC18024l, i, (i2 & 4) != 0 ? null : c12347l, (i2 & 8) != 0 ? null : c15667l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13848l)) {
            return false;
        }
        C13848l c13848l = (C13848l) obj;
        return this.yandex == c13848l.yandex && this.loadAd == c13848l.loadAd && AbstractC8576l.yandex(this.crashlytics, c13848l.crashlytics) && AbstractC8576l.yandex(this.amazon, c13848l.amazon);
    }

    public final int hashCode() {
        int iHashCode = ((this.yandex.hashCode() * 31) + this.loadAd) * 31;
        C12347l c12347l = this.crashlytics;
        int i = (iHashCode + (c12347l == null ? 0 : c12347l.yandex)) * 31;
        C15667l c15667l = this.amazon;
        return i + (c15667l != null ? c15667l.yandex : 0);
    }

    public final String toString() {
        return "ContainerSelector(type=" + this.yandex + ", numChildren=" + this.loadAd + ", horizontalAlignment=" + this.crashlytics + ", verticalAlignment=" + this.amazon + ')';
    }

    public C13848l(EnumC18024l enumC18024l, int i, C12347l c12347l, C15667l c15667l) {
        this.yandex = enumC18024l;
        this.loadAd = i;
        this.crashlytics = c12347l;
        this.amazon = c15667l;
    }
}
