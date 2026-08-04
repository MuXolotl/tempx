package defpackage;

/* JADX INFO: renamed from: lٖۗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16581l extends AbstractC5103l {
    public final Object ads;
    public final long subscription;

    public C16581l(long j, Object obj) {
        this.ads = obj;
        this.subscription = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16581l)) {
            return false;
        }
        C16581l c16581l = (C16581l) obj;
        return this.ads.equals(c16581l.ads) && this.subscription == c16581l.subscription;
    }

    public final int hashCode() {
        int iHashCode = this.ads.hashCode() * 31;
        long j = this.subscription;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackHandlerInfo(owner=");
        sb.append(this.ads);
        sb.append(", compositeKey=");
        return AbstractC12900l.smaato(sb, this.subscription, ')');
    }
}
