package defpackage;

/* JADX INFO: renamed from: lَۖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10487l {
    public final float crashlytics;
    public final int loadAd;
    public final int yandex;

    public C10487l(int i, float f, int i2) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = f;
    }

    public static C10487l yandex(int i) {
        int i2 = (i >> 13) & 7;
        if (i2 == 0) {
            return null;
        }
        return new C10487l(i2, ((i & 511) * ((i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? -1 : 1)) / 10.0f, (i >> 10) & 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10487l)) {
            return false;
        }
        C10487l c10487l = (C10487l) obj;
        return this.yandex == c10487l.yandex && this.loadAd == c10487l.loadAd && Float.compare(this.crashlytics, c10487l.crashlytics) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.crashlytics) + (((this.yandex * 31) + this.loadAd) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.yandex + ", originator=" + this.loadAd + ", gain=" + this.crashlytics + '}';
    }
}
