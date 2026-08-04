package defpackage;

/* JADX INFO: renamed from: lٜۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18738l {
    public final int loadAd;
    public final int yandex;

    public C18738l(int i, int i2) {
        this.yandex = i;
        this.loadAd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18738l)) {
            return false;
        }
        C18738l c18738l = (C18738l) obj;
        return this.yandex == c18738l.yandex && this.loadAd == c18738l.loadAd;
    }

    public final int hashCode() {
        return AbstractC5020l.inmobi(this.loadAd) + (AbstractC5020l.inmobi(this.yandex) * 31);
    }

    public final String toString() {
        return "SizeSelector(width=" + AbstractC1757l.m1039switch(this.yandex) + ", height=" + AbstractC1757l.m1039switch(this.loadAd) + ')';
    }
}
