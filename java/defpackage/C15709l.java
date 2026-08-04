package defpackage;

/* JADX INFO: renamed from: lٕٕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15709l extends AbstractC2249l {
    public float loadAd;
    public float yandex;

    public C15709l(float f, float f2) {
        this.yandex = f;
        this.loadAd = f2;
    }

    @Override // defpackage.AbstractC2249l
    public final void amazon() {
        this.yandex = 0.0f;
        this.loadAd = 0.0f;
    }

    @Override // defpackage.AbstractC2249l
    public final AbstractC2249l crashlytics() {
        return new C15709l(0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15709l)) {
            return false;
        }
        C15709l c15709l = (C15709l) obj;
        return c15709l.yandex == this.yandex && c15709l.loadAd == this.loadAd;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.loadAd) + (Float.floatToIntBits(this.yandex) * 31);
    }

    @Override // defpackage.AbstractC2249l
    public final int loadAd() {
        return 2;
    }

    @Override // defpackage.AbstractC2249l
    public final void purchase(int i, float f) {
        if (i == 0) {
            this.yandex = f;
        } else {
            if (i != 1) {
                return;
            }
            this.loadAd = f;
        }
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.yandex + ", v2 = " + this.loadAd;
    }

    @Override // defpackage.AbstractC2249l
    public final float yandex(int i) {
        if (i == 0) {
            return this.yandex;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.loadAd;
    }
}
