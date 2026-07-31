package defpackage;

import android.graphics.Matrix;

/* JADX INFO: renamed from: lٟؔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2817l implements InterfaceC11699l {
    public final Matrix amazon;
    public final int crashlytics;
    public final long loadAd;
    public final int purchase;
    public final C12920l yandex;

    public C2817l(C12920l c12920l, long j, int i, Matrix matrix, int i2) {
        if (c12920l == null) {
            C6541l.subs("Null tagBundle");
            throw null;
        }
        this.yandex = c12920l;
        this.loadAd = j;
        this.crashlytics = i;
        this.amazon = matrix;
        this.purchase = i2;
    }

    @Override // defpackage.InterfaceC11699l
    public final int amazon() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC11699l
    public final long crashlytics() {
        return this.loadAd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2817l)) {
            return false;
        }
        C2817l c2817l = (C2817l) obj;
        return this.yandex.equals(c2817l.yandex) && this.loadAd == c2817l.loadAd && this.crashlytics == c2817l.crashlytics && this.amazon.equals(c2817l.amazon) && this.purchase == c2817l.purchase;
    }

    public final int hashCode() {
        int iHashCode = (this.yandex.hashCode() ^ 1000003) * 1000003;
        long j = this.loadAd;
        return this.purchase ^ ((((((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.crashlytics) * 1000003) ^ this.amazon.hashCode()) * 1000003);
    }

    @Override // defpackage.InterfaceC11699l
    public final int loadAd() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC11699l
    public final Matrix purchase() {
        return this.amazon;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableImageInfo{tagBundle=");
        sb.append(this.yandex);
        sb.append(", timestamp=");
        sb.append(this.loadAd);
        sb.append(", rotationDegrees=");
        sb.append(this.crashlytics);
        sb.append(", sensorToBufferTransformMatrix=");
        sb.append(this.amazon);
        sb.append(", flashState=");
        return AbstractC14814l.remoteconfig(this.purchase, "}", sb);
    }

    @Override // defpackage.InterfaceC11699l
    public final C12920l yandex() {
        return this.yandex;
    }
}
