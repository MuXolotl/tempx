package defpackage;

import java.util.Set;

/* JADX INFO: renamed from: lَؗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4807l {
    public final Set crashlytics;
    public final long loadAd;
    public final long yandex;

    public C4807l(long j, long j2, Set set) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4807l) {
            C4807l c4807l = (C4807l) obj;
            if (this.yandex == c4807l.yandex && this.loadAd == c4807l.loadAd && this.crashlytics.equals(c4807l.crashlytics)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.yandex;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.loadAd;
        return this.crashlytics.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.yandex + ", maxAllowedDelay=" + this.loadAd + ", flags=" + this.crashlytics + "}";
    }
}
