package defpackage;

/* JADX INFO: renamed from: lّٕۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12630l implements InterfaceC13460l {
    public final float yandex;

    public C12630l(float f) {
        this.yandex = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12630l) && Float.compare(this.yandex, ((C12630l) obj).yandex) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(this.yandex) * 31);
    }

    public final String toString() {
        return AbstractC4582l.loadAd("BiasAbsoluteAlignment(horizontalBias=", this.yandex, ", verticalBias=-1.0)");
    }

    @Override // defpackage.InterfaceC13460l
    public final long yandex(long j, long j2, EnumC9931l enumC9931l) {
        long j3 = (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        return (((long) Math.round((((int) (j3 & 4294967295L)) / 2.0f) * 0.0f)) & 4294967295L) | (((long) Math.round((1.0f + this.yandex) * (((int) (j3 >> 32)) / 2.0f))) << 32);
    }
}
