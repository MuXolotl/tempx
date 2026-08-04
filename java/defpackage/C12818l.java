package defpackage;

/* JADX INFO: renamed from: lّٕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12818l {
    public static final C13645l purchase = AbstractC15212l.purchase(C16274l.f31872l, C6415l.f13426l);
    public final float amazon;
    public final float crashlytics;
    public final float loadAd;
    public final float yandex;

    public C12818l(float f, float f2, float f3, float f4) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = f4;
    }

    public static C12818l yandex(C12818l c12818l, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = c12818l.yandex;
        }
        if ((i & 2) != 0) {
            f2 = c12818l.loadAd;
        }
        if ((i & 4) != 0) {
            f3 = c12818l.crashlytics;
        }
        if ((i & 8) != 0) {
            f4 = c12818l.amazon;
        }
        c12818l.getClass();
        return new C12818l(f, f2, f3, f4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12818l)) {
            return false;
        }
        C12818l c12818l = (C12818l) obj;
        return Float.compare(this.yandex, c12818l.yandex) == 0 && Float.compare(this.loadAd, c12818l.loadAd) == 0 && Float.compare(this.crashlytics, c12818l.crashlytics) == 0 && Float.compare(this.amazon, c12818l.amazon) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.amazon) + AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31);
    }

    public final long loadAd() {
        C18411l c18411lLoadAd = new C1575l(this.yandex, this.loadAd, this.crashlytics, this.amazon).loadAd();
        int iAds = AbstractC5573l.ads(c18411lLoadAd.yandex * 255.0f);
        int iAds2 = AbstractC5573l.ads(c18411lLoadAd.loadAd * 255.0f);
        int iAds3 = AbstractC5573l.ads(c18411lLoadAd.crashlytics * 255.0f);
        float f = c18411lLoadAd.amazon;
        if (Float.isNaN(f)) {
            f = 1.0f;
        }
        return AbstractC12953l.crashlytics(iAds, iAds2, iAds3, AbstractC5573l.ads(f * 255.0f));
    }

    public final String toString() {
        StringBuilder sbTapsense = AbstractC14814l.tapsense("HsvColor(hue=", this.yandex, ", saturation=", this.loadAd, ", value=");
        sbTapsense.append(this.crashlytics);
        sbTapsense.append(", alpha=");
        sbTapsense.append(this.amazon);
        sbTapsense.append(")");
        return sbTapsense.toString();
    }
}
