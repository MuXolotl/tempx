package defpackage;

/* JADX INFO: renamed from: lٌٖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8806l implements InterfaceC4436l {
    public final C0086l yandex;

    public C8806l(C0086l c0086l) {
        this.yandex = c0086l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8806l) && this.yandex.equals(((C8806l) obj).yandex);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.yandex.yandex);
    }

    public final String toString() {
        return "Vertical(alignment=" + this.yandex + ")";
    }

    @Override // defpackage.InterfaceC4436l
    public final int yandex(C16918l c16918l, long j, int i) {
        return this.yandex.yandex(i, (int) (j & 4294967295L));
    }
}
