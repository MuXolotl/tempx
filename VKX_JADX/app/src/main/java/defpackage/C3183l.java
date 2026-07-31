package defpackage;

/* JADX INFO: renamed from: lؕؖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3183l {
    public static final C3183l amazon = new C3183l(17, C15248l.crashlytics, 0);
    public final int crashlytics;
    public final int loadAd;
    public final float yandex;

    public C3183l(int i, float f, int i2) {
        this.yandex = f;
        this.loadAd = i;
        this.crashlytics = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3183l)) {
            return false;
        }
        C3183l c3183l = (C3183l) obj;
        float f = c3183l.yandex;
        float f2 = C15248l.loadAd;
        return Float.compare(this.yandex, f) == 0 && this.loadAd == c3183l.loadAd && this.crashlytics == c3183l.crashlytics;
    }

    public final int hashCode() {
        float f = C15248l.loadAd;
        return (((Float.floatToIntBits(this.yandex) * 31) + this.loadAd) * 31) + this.crashlytics;
    }

    public final String toString() {
        String str;
        String strLoadAd = C15248l.loadAd(this.yandex);
        String str2 = "Invalid";
        int i = this.loadAd;
        if (i == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else {
            str = i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        int i2 = this.crashlytics;
        if (i2 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        return AbstractC0653l.ads(AbstractC14814l.license("LineHeightStyle(alignment=", strLoadAd, ", trim=", str, ",mode="), str2, ")");
    }
}
