package defpackage;

/* JADX INFO: renamed from: lؓٗؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1883l {
    public final long loadAd;
    public final C13325l yandex;

    public C1883l(C13325l c13325l, long j) {
        this.yandex = c13325l;
        this.loadAd = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1883l)) {
            return false;
        }
        C1883l c1883l = (C1883l) obj;
        return this.yandex.equals(c1883l.yandex) && this.loadAd == c1883l.loadAd;
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        long j = this.loadAd;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CookieWithTimestamp(cookie=");
        sb.append(this.yandex);
        sb.append(", createdAt=");
        return AbstractC12900l.smaato(sb, this.loadAd, ')');
    }
}
