package defpackage;

/* JADX INFO: renamed from: lٖٟؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4157l implements InterfaceC6947l {
    public final float yandex;

    public C4157l(float f) {
        this.yandex = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4157l) && Float.compare(this.yandex, ((C4157l) obj).yandex) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.yandex);
    }

    public final String toString() {
        return AbstractC4582l.loadAd("Horizontal(bias=", this.yandex, ")");
    }

    @Override // defpackage.InterfaceC6947l
    public final int yandex(int i, int i2, EnumC9931l enumC9931l) {
        return Math.round((1.0f + this.yandex) * ((i2 - i) / 2.0f));
    }
}
