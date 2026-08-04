package defpackage;

/* JADX INFO: renamed from: lٟؑٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0494l extends AbstractC9956l {
    public final String amazon;
    public final String crashlytics;
    public final long loadAd;
    public final long yandex;

    public C0494l(long j, long j2, String str, String str2) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = str;
        this.amazon = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9956l) {
            C0494l c0494l = (C0494l) ((AbstractC9956l) obj);
            if (this.yandex == c0494l.yandex && this.loadAd == c0494l.loadAd && this.crashlytics.equals(c0494l.crashlytics)) {
                String str = c0494l.amazon;
                String str2 = this.amazon;
                if (str2 != null ? str2.equals(str) : str == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.yandex;
        long j2 = this.loadAd;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.crashlytics.hashCode()) * 1000003;
        String str = this.amazon;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.yandex);
        sb.append(", size=");
        sb.append(this.loadAd);
        sb.append(", name=");
        sb.append(this.crashlytics);
        sb.append(", uuid=");
        return AbstractC0653l.ads(sb, this.amazon, "}");
    }
}
