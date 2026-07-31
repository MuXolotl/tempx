package defpackage;

/* JADX INFO: renamed from: lَُٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10475l {
    public final long crashlytics;
    public final long loadAd;
    public final C2427l yandex;

    public C10475l(C2427l c2427l, long j, long j2) {
        this.yandex = c2427l;
        this.loadAd = j;
        this.crashlytics = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10475l)) {
            return false;
        }
        C10475l c10475l = (C10475l) obj;
        return this.loadAd == c10475l.loadAd && this.yandex.equals(c10475l.yandex) && this.crashlytics == c10475l.crashlytics;
    }

    public final int hashCode() {
        long j = this.loadAd;
        int iHashCode = (this.yandex.hashCode() + ((217 + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        long j2 = this.crashlytics;
        return iHashCode + ((int) ((j2 >>> 32) ^ j2));
    }
}
