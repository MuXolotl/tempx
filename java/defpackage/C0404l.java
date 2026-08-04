package defpackage;

/* JADX INFO: renamed from: lؑٙۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0404l extends AbstractC3239l {
    public final int amazon;
    public final int crashlytics;
    public final float loadAd;
    public final C6853l purchase;
    public final float yandex;

    public C0404l(float f, float f2, int i, int i2, C6853l c6853l, int i3) {
        f = (i3 & 1) != 0 ? 0.0f : f;
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        c6853l = (i3 & 16) != 0 ? null : c6853l;
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = i;
        this.amazon = i2;
        this.purchase = c6853l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0404l)) {
            return false;
        }
        C0404l c0404l = (C0404l) obj;
        return this.yandex == c0404l.yandex && this.loadAd == c0404l.loadAd && this.crashlytics == c0404l.crashlytics && this.amazon == c0404l.amazon && AbstractC8576l.yandex(this.purchase, c0404l.purchase);
    }

    public final int hashCode() {
        int iMopub = (((AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31) + this.crashlytics) * 31) + this.amazon) * 31;
        C6853l c6853l = this.purchase;
        return iMopub + (c6853l != null ? c6853l.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2 = "Unknown";
        int i = this.crashlytics;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else {
            str = i == 2 ? "Square" : "Unknown";
        }
        int i2 = this.amazon;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else if (i2 == 2) {
            str2 = "Bevel";
        }
        StringBuilder sbTapsense = AbstractC14814l.tapsense("Stroke(width=", this.yandex, ", miter=", this.loadAd, ", cap=");
        AbstractC9361l.appmetrica(sbTapsense, str, ", join=", str2, ", pathEffect=");
        sbTapsense.append(this.purchase);
        sbTapsense.append(")");
        return sbTapsense.toString();
    }
}
