package defpackage;

/* JADX INFO: renamed from: lِٟٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11951l extends AbstractC2249l {
    public float yandex;

    public C11951l(float f) {
        this.yandex = f;
    }

    @Override // defpackage.AbstractC2249l
    public final void amazon() {
        this.yandex = 0.0f;
    }

    @Override // defpackage.AbstractC2249l
    public final AbstractC2249l crashlytics() {
        return new C11951l(0.0f);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C11951l) && ((C11951l) obj).yandex == this.yandex;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.yandex);
    }

    @Override // defpackage.AbstractC2249l
    public final int loadAd() {
        return 1;
    }

    @Override // defpackage.AbstractC2249l
    public final void purchase(int i, float f) {
        if (i == 0) {
            this.yandex = f;
        }
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.yandex;
    }

    @Override // defpackage.AbstractC2249l
    public final float yandex(int i) {
        if (i == 0) {
            return this.yandex;
        }
        return 0.0f;
    }
}
