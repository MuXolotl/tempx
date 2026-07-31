package defpackage;

/* JADX INFO: renamed from: lٔۗؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15089l implements InterfaceC6947l {
    public final float yandex;

    public C15089l(float f) {
        this.yandex = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15089l) && Float.compare(this.yandex, ((C15089l) obj).yandex) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.yandex);
    }

    public final String toString() {
        return AbstractC4582l.loadAd("Horizontal(bias=", this.yandex, ")");
    }

    @Override // defpackage.InterfaceC6947l
    public final int yandex(int i, int i2, EnumC9931l enumC9931l) {
        float f = (i2 - i) / 2.0f;
        EnumC9931l enumC9931l2 = EnumC9931l.f20223l;
        float f2 = this.yandex;
        if (enumC9931l != enumC9931l2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }
}
