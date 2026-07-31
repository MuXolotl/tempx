package defpackage;

/* JADX INFO: renamed from: lََۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10682l {
    public final int amazon;
    public final C12015l crashlytics;
    public final C12015l loadAd;
    public final int yandex;

    public C10682l(int i, C12015l c12015l, C12015l c12015l2, int i2) {
        this.yandex = i;
        this.loadAd = c12015l;
        this.crashlytics = c12015l2;
        this.amazon = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10682l)) {
            return false;
        }
        C10682l c10682l = (C10682l) obj;
        return this.yandex == c10682l.yandex && this.loadAd.equals(c10682l.loadAd) && this.crashlytics.equals(c10682l.crashlytics) && this.amazon == c10682l.amazon;
    }

    public final int hashCode() {
        return ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex * 31)) * 31)) * 31) + this.amazon;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WanderConfig(index=");
        sb.append(this.yandex);
        sb.append(", xBounds=");
        sb.append(this.loadAd);
        sb.append(", yBounds=");
        sb.append(this.crashlytics);
        sb.append(", durationMillis=");
        return AbstractC0653l.adcel(sb, this.amazon, ')');
    }
}
