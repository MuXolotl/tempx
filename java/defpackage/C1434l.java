package defpackage;

import android.os.Build;

/* JADX INFO: renamed from: lۣؒ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1434l {
    public final long amazon;
    public final int billing;
    public final long crashlytics;
    public final int loadAd;
    public final boolean purchase;
    public final int yandex;

    public C1434l(int i, int i2, long j, long j2, boolean z, int i3) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.yandex = i;
        if (str == null) {
            C6541l.subs("Null model");
            throw null;
        }
        this.loadAd = i2;
        this.crashlytics = j;
        this.amazon = j2;
        this.purchase = z;
        this.billing = i3;
        if (str2 == null) {
            C6541l.subs("Null manufacturer");
            throw null;
        }
        if (str3 != null) {
            return;
        }
        C6541l.subs("Null modelClass");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1434l)) {
            return false;
        }
        C1434l c1434l = (C1434l) obj;
        if (this.yandex != c1434l.yandex) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.loadAd != c1434l.loadAd || this.crashlytics != c1434l.crashlytics || this.amazon != c1434l.amazon || this.purchase != c1434l.purchase || this.billing != c1434l.billing) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int iHashCode = (((((this.yandex ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.loadAd) * 1000003;
        long j = this.crashlytics;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.amazon;
        return ((((this.billing ^ ((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.purchase ? 1231 : 1237)) * 1000003)) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.yandex);
        sb.append(", model=");
        sb.append(Build.MODEL);
        sb.append(", availableProcessors=");
        sb.append(this.loadAd);
        sb.append(", totalRam=");
        sb.append(this.crashlytics);
        sb.append(", diskSpace=");
        sb.append(this.amazon);
        sb.append(", isEmulator=");
        sb.append(this.purchase);
        sb.append(", state=");
        sb.append(this.billing);
        sb.append(", manufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append(", modelClass=");
        return AbstractC0653l.ads(sb, Build.PRODUCT, "}");
    }
}
