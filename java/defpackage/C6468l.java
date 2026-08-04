package defpackage;

/* JADX INFO: renamed from: lؙٔۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6468l {
    public final C10555l crashlytics;
    public final C4330l loadAd;
    public final long yandex;

    public C6468l(long j, C4330l c4330l, C10555l c10555l) {
        this.yandex = j;
        this.loadAd = c4330l;
        this.crashlytics = c10555l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6468l)) {
            return false;
        }
        C6468l c6468l = (C6468l) obj;
        return this.yandex == c6468l.yandex && this.loadAd.equals(c6468l.loadAd) && this.crashlytics.equals(c6468l.crashlytics);
    }

    public final int hashCode() {
        long j = this.yandex;
        return this.crashlytics.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.yandex + ", transportContext=" + this.loadAd + ", event=" + this.crashlytics + "}";
    }
}
