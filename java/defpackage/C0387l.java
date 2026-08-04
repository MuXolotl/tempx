package defpackage;

/* JADX INFO: renamed from: lؑٙؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0387l {
    public static final C0387l amazon = new C0387l(AbstractC12953l.amazon(4278190080L), 0, 0.0f);
    public final float crashlytics;
    public final long loadAd;
    public final long yandex;

    public C0387l(long j, long j2, float f) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0387l)) {
            return false;
        }
        C0387l c0387l = (C0387l) obj;
        return C9735l.crashlytics(this.yandex, c0387l.yandex) && C1187l.loadAd(this.loadAd, c0387l.loadAd) && this.crashlytics == c0387l.crashlytics;
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return Float.floatToIntBits(this.crashlytics) + ((C1187l.mopub(this.loadAd) + (C10882l.yandex(this.yandex) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbLicense = AbstractC14814l.license("Shadow(color=", C9735l.subs(this.yandex), ", offset=", C1187l.firebase(this.loadAd), ", blurRadius=");
        sbLicense.append(this.crashlytics);
        sbLicense.append(")");
        return sbLicense.toString();
    }
}
