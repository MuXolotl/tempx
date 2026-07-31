package defpackage;

/* JADX INFO: renamed from: lُّٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11001l {
    public static final C11001l crashlytics = new C11001l(1.0f, 1.0f);
    public final float loadAd;
    public final float yandex;

    public C11001l(float f, float f2) {
        this.yandex = f;
        this.loadAd = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11001l.class != obj.getClass()) {
            return false;
        }
        C11001l c11001l = (C11001l) obj;
        return this.yandex == c11001l.yandex && this.loadAd == c11001l.loadAd;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f) + AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(1.0f) * 31, this.yandex, 31), 1.0f, 31), 1.0f, 31), 1.0f, 31), this.loadAd, 31), 1.0f, 31), 1.0f, 31), 1.0f, 31);
    }

    public final String toString() {
        return "SelectableSurfaceScale(scale=1.0, focusedScale=" + this.yandex + ",pressedScale=1.0, selectedScale=1.0,disabledScale=1.0, focusedSelectedScale=" + this.loadAd + ", focusedDisabledScale=1.0,pressedSelectedScale=1.0, selectedDisabledScale=1.0, focusedSelectedDisabledScale=1.0)";
    }
}
