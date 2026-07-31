package defpackage;

/* JADX INFO: renamed from: lٟٔۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15074l {
    public static final C15074l amazon = new C15074l(0, 0);
    public static final String billing;
    public static final String mopub;
    public static final String purchase;
    public final float crashlytics;
    public final int loadAd;
    public final int yandex;

    static {
        String str = AbstractC15323l.yandex;
        purchase = Integer.toString(0, 36);
        billing = Integer.toString(1, 36);
        mopub = Integer.toString(3, 36);
    }

    public C15074l(int i, float f, int i2) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15074l) {
            C15074l c15074l = (C15074l) obj;
            if (this.yandex == c15074l.yandex && this.loadAd == c15074l.loadAd && this.crashlytics == c15074l.crashlytics) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.crashlytics) + ((((217 + this.yandex) * 31) + this.loadAd) * 31);
    }

    public C15074l(int i, int i2) {
        this(i, 1.0f, i2);
    }
}
