package defpackage;

/* JADX INFO: renamed from: lَٟۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10513l {
    public final float amazon;
    public final float crashlytics;
    public final float loadAd;
    public final float purchase;
    public final float yandex;

    public C10513l(float f, float f2, float f3, float f4, float f5) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = f4;
        this.purchase = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10513l.class == obj.getClass()) {
            C10513l c10513l = (C10513l) obj;
            if (this.yandex == c10513l.yandex && this.loadAd == c10513l.loadAd && this.crashlytics == c10513l.crashlytics && this.amazon == c10513l.amazon && this.purchase == c10513l.purchase) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.purchase) + AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31), this.amazon, 31);
    }

    public final String toString() {
        return "ClickableSurfaceScale(scale=" + this.yandex + ", focusedScale=" + this.loadAd + ",pressedScale=" + this.crashlytics + ", disabledScale=" + this.amazon + ", focusedDisabledScale=" + this.purchase + ')';
    }
}
