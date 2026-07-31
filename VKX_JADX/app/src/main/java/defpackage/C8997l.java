package defpackage;

/* JADX INFO: renamed from: lٌۘؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8997l extends AbstractC8314l {
    public final String admob;
    public final long amazon;
    public final boolean billing;
    public final int crashlytics;
    public final String loadAd;
    public final int mopub;
    public final long purchase;
    public final String subs;
    public final int yandex;

    public C8997l(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = i2;
        this.amazon = j;
        this.purchase = j2;
        this.billing = z;
        this.mopub = i3;
        this.admob = str2;
        this.subs = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8314l) {
            C8997l c8997l = (C8997l) ((AbstractC8314l) obj);
            if (this.yandex == c8997l.yandex && this.loadAd.equals(c8997l.loadAd) && this.crashlytics == c8997l.crashlytics && this.amazon == c8997l.amazon && this.purchase == c8997l.purchase && this.billing == c8997l.billing && this.mopub == c8997l.mopub && this.admob.equals(c8997l.admob) && this.subs.equals(c8997l.subs)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.yandex ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003) ^ this.crashlytics) * 1000003;
        long j = this.amazon;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.purchase;
        return this.subs.hashCode() ^ ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.billing ? 1231 : 1237)) * 1000003) ^ this.mopub) * 1000003) ^ this.admob.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.yandex);
        sb.append(", model=");
        sb.append(this.loadAd);
        sb.append(", cores=");
        sb.append(this.crashlytics);
        sb.append(", ram=");
        sb.append(this.amazon);
        sb.append(", diskSpace=");
        sb.append(this.purchase);
        sb.append(", simulator=");
        sb.append(this.billing);
        sb.append(", state=");
        sb.append(this.mopub);
        sb.append(", manufacturer=");
        sb.append(this.admob);
        sb.append(", modelClass=");
        return AbstractC0653l.ads(sb, this.subs, "}");
    }
}
