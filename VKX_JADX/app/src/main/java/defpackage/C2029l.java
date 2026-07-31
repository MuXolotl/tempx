package defpackage;

/* JADX INFO: renamed from: lُؓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2029l {
    public final float amazon;
    public final float crashlytics;
    public final float loadAd;
    public final float yandex;

    public C2029l(float f, float f2, float f3, float f4) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2029l)) {
            return false;
        }
        C2029l c2029l = (C2029l) obj;
        return this.yandex == c2029l.yandex && this.loadAd == c2029l.loadAd && this.crashlytics == c2029l.crashlytics && this.amazon == c2029l.amazon;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.amazon) + AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31);
    }

    public final String toString() {
        StringBuilder sbTapsense = AbstractC14814l.tapsense("RippleAlpha(draggedAlpha=", this.yandex, ", focusedAlpha=", this.loadAd, ", hoveredAlpha=");
        sbTapsense.append(this.crashlytics);
        sbTapsense.append(", pressedAlpha=");
        sbTapsense.append(this.amazon);
        sbTapsense.append(")");
        return sbTapsense.toString();
    }
}
