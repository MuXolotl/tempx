package defpackage;

/* JADX INFO: renamed from: lٍٖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9597l {
    public final boolean crashlytics;
    public final long loadAd;
    public final int yandex;

    public C9597l(int i, long j, boolean z) {
        this.yandex = i;
        this.loadAd = j;
        this.crashlytics = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9597l)) {
            return false;
        }
        C9597l c9597l = (C9597l) obj;
        return this.yandex == c9597l.yandex && this.loadAd == c9597l.loadAd && this.crashlytics == c9597l.crashlytics;
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        long j = this.loadAd;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + (this.crashlytics ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioTrackOwnershipContainer(id=");
        sb.append(this.yandex);
        sb.append(", ownerId=");
        sb.append(this.loadAd);
        sb.append(", wasFirstMine=");
        return AbstractC0653l.tapsense(sb, this.crashlytics, ')');
    }
}
