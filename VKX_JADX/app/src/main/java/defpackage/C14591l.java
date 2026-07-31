package defpackage;

import android.util.Range;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lَٔؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14591l {
    public final boolean admob;
    public final int amazon;
    public final boolean billing;
    public final boolean crashlytics;
    public final boolean isPro;
    public final int loadAd;
    public final boolean mopub;
    public final boolean purchase;
    public final Range subs;
    public final int yandex;

    public C14591l(int i, int i2, boolean z, int i3, boolean z2, boolean z3, boolean z4, boolean z5, Range range, boolean z6) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = z;
        this.amazon = i3;
        this.purchase = z2;
        this.billing = z3;
        this.mopub = z4;
        this.admob = z5;
        this.subs = range;
        this.isPro = z6;
    }

    public static C14591l yandex(C14591l c14591l, boolean z, Range range, int i) {
        int i2 = c14591l.yandex;
        int i3 = c14591l.loadAd;
        boolean z2 = c14591l.crashlytics;
        int i4 = c14591l.amazon;
        boolean z3 = c14591l.purchase;
        boolean z4 = c14591l.billing;
        boolean z5 = c14591l.mopub;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            range = c14591l.subs;
        }
        return new C14591l(i2, i3, z2, i4, z3, z4, z5, z, range, c14591l.isPro);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14591l)) {
            return false;
        }
        C14591l c14591l = (C14591l) obj;
        return this.yandex == c14591l.yandex && this.loadAd == c14591l.loadAd && this.crashlytics == c14591l.crashlytics && this.amazon == c14591l.amazon && this.purchase == c14591l.purchase && this.billing == c14591l.billing && this.mopub == c14591l.mopub && this.admob == c14591l.admob && AbstractC8576l.yandex(this.subs, c14591l.subs) && this.isPro == c14591l.isPro;
    }

    public final int hashCode() {
        return ((this.subs.hashCode() + ((((((((AbstractC0653l.firebase(this.amazon, ((((this.yandex * 31) + this.loadAd) * 31) + (this.crashlytics ? 1231 : 1237)) * 31, 31) + (this.purchase ? 1231 : 1237)) * 31) + (this.billing ? 1231 : 1237)) * 31) + (this.mopub ? 1231 : 1237)) * 31) + (this.admob ? 1231 : 1237)) * 31)) * 31) + (this.isPro ? 1231 : 1237);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("FeatureSettings(cameraMode=");
        sb.append(this.yandex);
        sb.append(", requiredMaxBitDepth=");
        sb.append(this.loadAd);
        sb.append(", hasVideoCapture=");
        sb.append(this.crashlytics);
        sb.append(", videoStabilization=");
        int i = this.amazon;
        if (i == 1) {
            str = "UNSPECIFIED";
        } else if (i == 2) {
            str = "OFF";
        } else if (i != 3) {
            str = i != 4 ? "null" : "PREVIEW";
        } else {
            str = "ON";
        }
        sb.append(str);
        sb.append(", isUltraHdrOn=");
        sb.append(this.purchase);
        sb.append(", isHighSpeedOn=");
        sb.append(this.billing);
        sb.append(", isFeatureComboInvocation=");
        sb.append(this.mopub);
        sb.append(", requiresFeatureComboQuery=");
        sb.append(this.admob);
        sb.append(", targetFpsRange=");
        sb.append(this.subs);
        sb.append(", isStrictFpsRequired=");
        return AbstractC0653l.tapsense(sb, this.isPro, ')');
    }
}
