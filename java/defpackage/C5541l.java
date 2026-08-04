package defpackage;

/* JADX INFO: renamed from: lًؘٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5541l extends AbstractC5103l {
    public final Object ads;
    public final long subscription;

    public C5541l(long j, Object obj) {
        this.ads = obj;
        this.subscription = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5541l)) {
            return false;
        }
        C5541l c5541l = (C5541l) obj;
        return this.ads.equals(c5541l.ads) && this.subscription == c5541l.subscription;
    }

    public final int hashCode() {
        int iHashCode = this.ads.hashCode() * 31;
        long j = this.subscription;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PredictiveBackHandlerInfo(owner=");
        sb.append(this.ads);
        sb.append(", compositeKey=");
        return AbstractC12900l.smaato(sb, this.subscription, ')');
    }
}
