package defpackage;

/* JADX INFO: renamed from: lِٛٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11964l {
    public final AbstractC9278l loadAd;
    public final float yandex;

    public C11964l(float f, AbstractC9278l abstractC9278l) {
        this.yandex = f;
        this.loadAd = abstractC9278l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11964l)) {
            return false;
        }
        C11964l c11964l = (C11964l) obj;
        return Float.compare(this.yandex, c11964l.yandex) == 0 && AbstractC8576l.yandex(this.loadAd, c11964l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (Float.floatToIntBits(this.yandex) * 31);
    }

    public final String toString() {
        return "ProgressableFeature(progress=" + this.yandex + ", feature=" + this.loadAd + ')';
    }
}
