package defpackage;

import java.util.Locale;

/* JADX INFO: renamed from: lؒ۠ؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1372l {
    public static final C1372l amazon = new C1372l(1.0f);
    public static final String billing;
    public static final String purchase;
    public final int crashlytics;
    public final float loadAd;
    public final float yandex;

    static {
        String str = AbstractC15323l.yandex;
        purchase = Integer.toString(0, 36);
        billing = Integer.toString(1, 36);
    }

    public C1372l(float f, float f2) {
        AbstractC12442l.admob(f > 0.0f);
        AbstractC12442l.admob(f2 > 0.0f);
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1372l.class == obj.getClass()) {
            C1372l c1372l = (C1372l) obj;
            if (this.yandex == c1372l.yandex && this.loadAd == c1372l.loadAd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.loadAd) + ((Float.floatToRawIntBits(this.yandex) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.yandex), Float.valueOf(this.loadAd)};
        String str = AbstractC15323l.yandex;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public C1372l(float f) {
        this(f, 1.0f);
    }
}
