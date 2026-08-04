package defpackage;

/* JADX INFO: renamed from: lؙ۟ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6793l {
    public final boolean crashlytics;
    public final int loadAd;
    public final int yandex;

    public C6793l(int i, int i2, boolean z) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6793l)) {
            return false;
        }
        C6793l c6793l = (C6793l) obj;
        return this.yandex == c6793l.yandex && this.loadAd == c6793l.loadAd && this.crashlytics == c6793l.crashlytics;
    }

    public final int hashCode() {
        return (((this.yandex * 31) + this.loadAd) * 31) + (this.crashlytics ? 1231 : 1237);
    }

    public final String toString() {
        return AbstractC5020l.Signature(AbstractC14814l.subscription(this.yandex, this.loadAd, "BidiRun(start=", ", end=", ", isRtl="), this.crashlytics, ")");
    }
}
