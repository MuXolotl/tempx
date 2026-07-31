package defpackage;

/* JADX INFO: renamed from: lؚؗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5028l {
    public final C8990l loadAd;
    public final float yandex;

    public C5028l(float f, C8990l c8990l) {
        this.yandex = f;
        this.loadAd = c8990l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5028l)) {
            return false;
        }
        C5028l c5028l = (C5028l) obj;
        return C14467l.loadAd(this.yandex, c5028l.yandex) && this.loadAd.equals(c5028l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (Float.floatToIntBits(this.yandex) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + C14467l.crashlytics(this.yandex) + ", brush=" + this.loadAd + ")";
    }
}
