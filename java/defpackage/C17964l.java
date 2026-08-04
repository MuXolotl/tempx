package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;

/* JADX INFO: renamed from: lٖ٘۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17964l {
    public static final C17964l billing = new C17964l(10485760, 200, ModuleDescriptor.MODULE_VERSION, 604800000, 81920);
    public final long amazon;
    public final int crashlytics;
    public final int loadAd;
    public final int purchase;
    public final long yandex;

    public C17964l(long j, int i, int i2, long j2, int i3) {
        this.yandex = j;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = j2;
        this.purchase = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17964l) {
            C17964l c17964l = (C17964l) obj;
            if (this.yandex == c17964l.yandex && this.loadAd == c17964l.loadAd && this.crashlytics == c17964l.crashlytics && this.amazon == c17964l.amazon && this.purchase == c17964l.purchase) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.yandex;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.loadAd) * 1000003) ^ this.crashlytics) * 1000003;
        long j2 = this.amazon;
        return this.purchase ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.yandex);
        sb.append(", loadBatchSize=");
        sb.append(this.loadAd);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.crashlytics);
        sb.append(", eventCleanUpAge=");
        sb.append(this.amazon);
        sb.append(", maxBlobByteSizePerRow=");
        return AbstractC14814l.remoteconfig(this.purchase, "}", sb);
    }
}
