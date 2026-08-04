package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: lْۦۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13808l {
    public final boolean amazon;
    public final boolean billing;
    public final int crashlytics;
    public final int loadAd;
    public final Matrix purchase;
    public final Rect yandex;

    public C13808l(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
        if (rect == null) {
            C6541l.subs("Null getCropRect");
            throw null;
        }
        this.yandex = rect;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = z;
        if (matrix == null) {
            C6541l.subs("Null getSensorToBufferTransform");
            throw null;
        }
        this.purchase = matrix;
        this.billing = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13808l) {
            C13808l c13808l = (C13808l) obj;
            if (this.yandex.equals(c13808l.yandex) && this.loadAd == c13808l.loadAd && this.crashlytics == c13808l.crashlytics && this.amazon == c13808l.amazon && this.purchase.equals(c13808l.purchase) && this.billing == c13808l.billing) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd) * 1000003) ^ this.crashlytics) * 1000003) ^ (this.amazon ? 1231 : 1237)) * 1000003) ^ this.purchase.hashCode()) * 1000003) ^ (this.billing ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationInfo{getCropRect=");
        sb.append(this.yandex);
        sb.append(", getRotationDegrees=");
        sb.append(this.loadAd);
        sb.append(", getTargetRotation=");
        sb.append(this.crashlytics);
        sb.append(", hasCameraTransform=");
        sb.append(this.amazon);
        sb.append(", getSensorToBufferTransform=");
        sb.append(this.purchase);
        sb.append(", isMirroring=");
        return AbstractC5020l.Signature(sb, this.billing, "}");
    }
}
