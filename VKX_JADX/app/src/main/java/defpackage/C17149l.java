package defpackage;

/* JADX INFO: renamed from: lٕٗٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17149l {
    public final int loadAd;
    public final int yandex;

    public C17149l(int i, int i2) {
        this.yandex = i;
        this.loadAd = i2;
        if (!(i >= 0)) {
            AbstractC14825l.yandex("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        AbstractC14825l.yandex("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17149l)) {
            return false;
        }
        C17149l c17149l = (C17149l) obj;
        return this.yandex == c17149l.yandex && this.loadAd == c17149l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex * 31) + this.loadAd;
    }

    public final String toString() {
        return AbstractC12589l.applovin(this.yandex, this.loadAd, "Interval(start=", ", end=", ")");
    }
}
