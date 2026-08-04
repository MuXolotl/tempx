package defpackage;

/* JADX INFO: renamed from: lًؚٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7849l {
    public final float amazon;
    public final float crashlytics;
    public final float loadAd;
    public final float yandex;

    public C7849l(float f, float f2, float f3, float f4) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7849l)) {
            return false;
        }
        C7849l c7849l = (C7849l) obj;
        return C14467l.loadAd(this.yandex, c7849l.yandex) && C14467l.loadAd(this.loadAd, c7849l.loadAd) && C14467l.loadAd(this.crashlytics, c7849l.crashlytics) && C14467l.loadAd(this.amazon, c7849l.amazon);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.amazon) + AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31);
    }

    public final String toString() {
        String strCrashlytics = C14467l.crashlytics(this.yandex);
        String strCrashlytics2 = C14467l.crashlytics(this.loadAd);
        return AbstractC9361l.advert(AbstractC14814l.license("DpRect(left=", strCrashlytics, ", top=", strCrashlytics2, ", right="), C14467l.crashlytics(this.crashlytics), ", bottom=", C14467l.crashlytics(this.amazon), ")");
    }
}
