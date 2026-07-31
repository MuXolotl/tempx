package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* JADX INFO: renamed from: lؙۡۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6822l {
    public final Rect amazon;
    public final int billing;
    public final int crashlytics;
    public final int loadAd;
    public final boolean mopub;
    public final Size purchase;
    public final UUID yandex;

    public C6822l(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
        if (uuid == null) {
            C6541l.subs("Null getUuid");
            throw null;
        }
        this.yandex = uuid;
        this.loadAd = i;
        this.crashlytics = i2;
        if (rect == null) {
            C6541l.subs("Null getCropRect");
            throw null;
        }
        this.amazon = rect;
        if (size == null) {
            C6541l.subs("Null getSize");
            throw null;
        }
        this.purchase = size;
        this.billing = i3;
        this.mopub = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6822l)) {
            return false;
        }
        C6822l c6822l = (C6822l) obj;
        return this.yandex.equals(c6822l.yandex) && this.loadAd == c6822l.loadAd && this.crashlytics == c6822l.crashlytics && this.amazon.equals(c6822l.amazon) && this.purchase.equals(c6822l.purchase) && this.billing == c6822l.billing && this.mopub == c6822l.mopub;
    }

    public final int hashCode() {
        return (((this.mopub ? 1231 : 1237) ^ ((((((((((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd) * 1000003) ^ this.crashlytics) * 1000003) ^ this.amazon.hashCode()) * 1000003) ^ this.purchase.hashCode()) * 1000003) ^ this.billing) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
        sb.append(this.yandex);
        sb.append(", getTargets=");
        sb.append(this.loadAd);
        sb.append(", getFormat=");
        sb.append(this.crashlytics);
        sb.append(", getCropRect=");
        sb.append(this.amazon);
        sb.append(", getSize=");
        sb.append(this.purchase);
        sb.append(", getRotationDegrees=");
        sb.append(this.billing);
        sb.append(", isMirroring=");
        return AbstractC5020l.Signature(sb, this.mopub, ", shouldRespectInputCropRect=false}");
    }
}
