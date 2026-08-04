package defpackage;

/* JADX INFO: renamed from: lّٔٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14855l implements InterfaceC13460l {
    public final float loadAd;
    public final float yandex;

    public C14855l(float f, float f2) {
        this.yandex = f;
        this.loadAd = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14855l)) {
            return false;
        }
        C14855l c14855l = (C14855l) obj;
        return Float.compare(this.yandex, c14855l.yandex) == 0 && Float.compare(this.loadAd, c14855l.loadAd) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.loadAd) + (Float.floatToIntBits(this.yandex) * 31);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.yandex + ", verticalBias=" + this.loadAd + ")";
    }

    @Override // defpackage.InterfaceC13460l
    public final long yandex(long j, long j2, EnumC9931l enumC9931l) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        EnumC9931l enumC9931l2 = EnumC9931l.f20223l;
        float f3 = this.yandex;
        if (enumC9931l != enumC9931l2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.loadAd) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        return (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32);
    }
}
