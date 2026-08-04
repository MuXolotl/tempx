package defpackage;

/* JADX INFO: renamed from: lؘ۟ؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5989l {
    public static final C5989l crashlytics = new C5989l(-1, -1);
    public final int loadAd;
    public final int yandex;

    static {
        new C5989l(0, 0);
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C5989l(int i, int i2) {
        AbstractC12442l.admob((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.yandex = i;
        this.loadAd = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5989l) {
            C5989l c5989l = (C5989l) obj;
            if (this.yandex == c5989l.yandex && this.loadAd == c5989l.loadAd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.yandex;
        int i2 = i << 16;
        return this.loadAd ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.yandex + "x" + this.loadAd;
    }
}
