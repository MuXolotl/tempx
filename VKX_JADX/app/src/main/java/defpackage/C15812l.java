package defpackage;

/* JADX INFO: renamed from: lٕٜۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15812l {
    public final long crashlytics;
    public final int loadAd;
    public final int yandex;

    public C15812l(int i, long j, int i2) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15812l)) {
            return false;
        }
        C15812l c15812l = (C15812l) obj;
        return this.yandex == c15812l.yandex && this.loadAd == c15812l.loadAd && this.crashlytics == c15812l.crashlytics;
    }

    public final int hashCode() {
        int iInmobi = ((AbstractC5020l.inmobi(this.yandex) * 31) + this.loadAd) * 31;
        long j = this.crashlytics;
        return iInmobi + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
        sb.append(AbstractC4338l.m1536throw(this.yandex));
        sb.append(", offset=");
        sb.append(this.loadAd);
        sb.append(", selectableId=");
        return AbstractC15560l.ads(this.crashlytics, ")", sb);
    }
}
