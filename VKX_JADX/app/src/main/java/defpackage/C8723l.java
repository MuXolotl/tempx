package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lٌِۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8723l {
    public final C14997l crashlytics;
    public final double loadAd;
    public final double yandex;

    public C8723l(double d, double d2, C14997l c14997l) {
        this.yandex = d;
        this.loadAd = d2;
        this.crashlytics = c14997l;
        new HashMap();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8723l)) {
            return false;
        }
        C8723l c8723l = (C8723l) obj;
        return Double.compare(this.yandex, c8723l.yandex) == 0 && Double.compare(this.loadAd, c8723l.loadAd) == 0 && this.crashlytics.equals(c8723l.crashlytics);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.yandex);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.loadAd);
        return ((i + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2))) * 31) + this.crashlytics.yandex;
    }

    public final String toString() {
        return "TonalPalette(hue=" + this.yandex + ", chroma=" + this.loadAd + ", keyColor=" + this.crashlytics + ")";
    }
}
