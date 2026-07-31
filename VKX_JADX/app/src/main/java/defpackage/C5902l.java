package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؘۗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5902l {
    public final int crashlytics;
    public final int loadAd;
    public final String yandex;

    public C5902l(String str, int i, int i2) {
        this.yandex = str;
        this.loadAd = i;
        this.crashlytics = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5902l)) {
            return false;
        }
        C5902l c5902l = (C5902l) obj;
        return this.yandex.equals(c5902l.yandex) && this.loadAd == c5902l.loadAd && this.crashlytics == c5902l.crashlytics;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.loadAd);
        Integer numValueOf2 = Integer.valueOf(this.crashlytics);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.yandex, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        sb.append(Integer.valueOf(this.yandex.hashCode()));
        sb.append(" displayWidth=");
        sb.append(this.loadAd);
        sb.append(" displayHeight=");
        return AbstractC14814l.remoteconfig(this.crashlytics, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}", sb);
    }
}
