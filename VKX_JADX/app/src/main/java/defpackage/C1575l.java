package defpackage;

/* JADX INFO: renamed from: lؓؓۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1575l implements InterfaceC2652l {
    public final float amazon;
    public final float crashlytics;
    public final float loadAd;
    public final float yandex;

    static {
        C11485l c11485l = AbstractC11553l.yandex;
        C10227l c10227lAdmob = AbstractC14055l.admob();
        for (int i = 0; i < 3; i++) {
            char cCharAt = "HSV".charAt(i);
            String.valueOf(cCharAt);
            c10227lAdmob.add(new C11485l(cCharAt == 'H' ? 360.0f : 1.0f));
        }
        c10227lAdmob.add(AbstractC11553l.yandex);
        AbstractC14055l.purchase(c10227lAdmob);
    }

    public C1575l(float f, float f2, float f3, float f4) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = f4;
    }

    public static final float crashlytics(double d, double d2, double d3, int i) {
        double d4 = (((double) i) + d) % 6.0d;
        double d5 = d3 * d2;
        double dMin = Math.min(d4, Math.min(4.0d - d4, 1.0d));
        if (dMin < 0.0d) {
            dMin = 0.0d;
        }
        return (float) (d2 - (d5 * dMin));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1575l)) {
            return false;
        }
        C1575l c1575l = (C1575l) obj;
        return Float.compare(this.yandex, c1575l.yandex) == 0 && Float.compare(this.loadAd, c1575l.loadAd) == 0 && Float.compare(this.crashlytics, c1575l.crashlytics) == 0 && Float.compare(this.amazon, c1575l.amazon) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.amazon) + AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31);
    }

    @Override // defpackage.InterfaceC2652l
    public final C18411l loadAd() {
        float f = this.yandex;
        boolean zIsNaN = Float.isNaN(f);
        float f2 = this.amazon;
        float f3 = this.crashlytics;
        if (!zIsNaN) {
            float f4 = this.loadAd;
            if (!Float.isNaN(f4)) {
                double d = f4;
                if (d >= 1.0E-7d) {
                    double d2 = f3;
                    double d3 = ((double) (((f % 360.0f) + 360.0f) % 360.0f)) / 60.0d;
                    return C14661l.loadAd.crashlytics(crashlytics(d3, d2, d, 5), crashlytics(d3, d2, d, 3), crashlytics(d3, d2, d, 1), f2);
                }
            }
        }
        return C18411l.billing.crashlytics(f3, f3, f3, f2);
    }

    public final String toString() {
        return "HSV(h=" + this.yandex + ", s=" + this.loadAd + ", v=" + this.crashlytics + ", alpha=" + this.amazon + ')';
    }

    @Override // defpackage.InterfaceC2652l
    public final C1033l yandex() {
        return loadAd().yandex();
    }
}
