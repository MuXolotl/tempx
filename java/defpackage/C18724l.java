package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lۧۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18724l {
    public final Map crashlytics;
    public final long loadAd;
    public final String yandex;

    public C18724l(String str, long j, Map map) {
        this.yandex = str;
        this.loadAd = j;
        this.crashlytics = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18724l)) {
            return false;
        }
        C18724l c18724l = (C18724l) obj;
        return this.yandex.equals(c18724l.yandex) && this.loadAd == c18724l.loadAd && AbstractC8576l.yandex(this.crashlytics, c18724l.crashlytics);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        long j = this.loadAd;
        return this.crashlytics.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.yandex + ", timestamp=" + this.loadAd + ", additionalCustomKeys=" + this.crashlytics + ')';
    }
}
