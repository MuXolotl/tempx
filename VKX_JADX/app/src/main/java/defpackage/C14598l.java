package defpackage;

/* JADX INFO: renamed from: lۣٔؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14598l implements InterfaceC13779l {
    public final long crashlytics;
    public final long loadAd;
    public final long yandex;

    public C14598l(long j, long j2, long j3) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14598l)) {
            return false;
        }
        C14598l c14598l = (C14598l) obj;
        return this.yandex == c14598l.yandex && this.loadAd == c14598l.loadAd && this.crashlytics == c14598l.crashlytics;
    }

    public final int hashCode() {
        long j = this.yandex;
        long j2 = this.loadAd;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.crashlytics;
        return i + ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferCancelledByStorageSpace(free=");
        sb.append(this.yandex);
        sb.append(", total=");
        sb.append(this.loadAd);
        sb.append(", required=");
        return AbstractC12900l.smaato(sb, this.crashlytics, ')');
    }
}
