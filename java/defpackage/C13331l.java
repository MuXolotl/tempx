package defpackage;

/* JADX INFO: renamed from: lْْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13331l {
    public final long loadAd;
    public final int yandex;

    public C13331l(int i, long j) {
        if (i == 0) {
            C6541l.subs("Null status");
            throw null;
        }
        this.yandex = i;
        this.loadAd = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13331l)) {
            return false;
        }
        C13331l c13331l = (C13331l) obj;
        return AbstractC5020l.firebase(this.yandex, c13331l.yandex) && this.loadAd == c13331l.loadAd;
    }

    public final int hashCode() {
        int iInmobi = (AbstractC5020l.inmobi(this.yandex) ^ 1000003) * 1000003;
        long j = this.loadAd;
        return ((int) (j ^ (j >>> 32))) ^ iInmobi;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.yandex;
        if (i == 1) {
            str = "OK";
        } else if (i == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i != 3) {
            str = i != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        return AbstractC15560l.ads(this.loadAd, "}", sb);
    }
}
