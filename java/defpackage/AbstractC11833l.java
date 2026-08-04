package defpackage;

/* JADX INFO: renamed from: lِٓۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11833l {
    public final int crashlytics;
    public final long loadAd;
    public final String yandex;

    public AbstractC11833l(long j, int i, String str) {
        this.yandex = str;
        this.loadAd = j;
        this.crashlytics = i;
        if (str.length() == 0) {
            C8339l.metrica("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            C8339l.metrica("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract long amazon(float f, float f2, float f3);

    public abstract long billing(float f, float f2, float f3, float f4, AbstractC11833l abstractC11833l);

    public boolean crashlytics() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC11833l abstractC11833l = (AbstractC11833l) obj;
        if (this.crashlytics == abstractC11833l.crashlytics && this.yandex.equals(abstractC11833l.yandex)) {
            return AbstractC9843l.mopub(this.loadAd, abstractC11833l.loadAd);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        long j = this.loadAd;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.crashlytics;
    }

    public abstract float loadAd(int i);

    public abstract float purchase(float f, float f2, float f3);

    public final String toString() {
        return this.yandex + " (id=" + this.crashlytics + ", model=" + AbstractC9843l.firebase(this.loadAd) + ")";
    }

    public abstract float yandex(int i);
}
