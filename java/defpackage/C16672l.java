package defpackage;

/* JADX INFO: renamed from: lٖ۟ۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16672l {
    public final int loadAd;
    public final int yandex;

    public C16672l(int i, int i2) {
        this.yandex = i;
        this.loadAd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16672l)) {
            return false;
        }
        C16672l c16672l = (C16672l) obj;
        return this.yandex == c16672l.yandex && this.loadAd == c16672l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex * 31) + this.loadAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CaptureEncodeRates(captureRate=");
        sb.append(this.yandex);
        sb.append(", encodeRate=");
        return AbstractC0653l.adcel(sb, this.loadAd, ')');
    }
}
