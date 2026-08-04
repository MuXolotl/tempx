package defpackage;

/* JADX INFO: renamed from: lؘّۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12814l {
    public static final /* synthetic */ int crashlytics = 0;
    public static final long loadAd = AbstractC2296l.loadAd(0, 0);
    public final long yandex;

    public /* synthetic */ C12814l(long j) {
        this.yandex = j;
    }

    public static final boolean admob(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public static final boolean amazon(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    public static final int billing(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean crashlytics(long j, long j2) {
        return j == j2;
    }

    public static String isPro(long j) {
        return AbstractC12589l.applovin((int) (j >> 32), (int) (j & 4294967295L), "TextRange(", ", ", ")");
    }

    public static boolean loadAd(long j, Object obj) {
        return (obj instanceof C12814l) && j == ((C12814l) obj).yandex;
    }

    public static final int mopub(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final int purchase(long j) {
        return billing(j) - mopub(j);
    }

    public static int subs(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final boolean yandex(long j, long j2) {
        return (mopub(j) <= mopub(j2)) & (billing(j2) <= billing(j));
    }

    public final boolean equals(Object obj) {
        return loadAd(this.yandex, obj);
    }

    public final int hashCode() {
        return subs(this.yandex);
    }

    public final String toString() {
        return isPro(this.yandex);
    }
}
