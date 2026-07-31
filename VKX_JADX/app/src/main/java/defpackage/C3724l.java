package defpackage;

/* JADX INFO: renamed from: lؕۢۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3724l implements InterfaceC0796l {
    public final C4157l yandex;

    public C3724l(C4157l c4157l) {
        this.yandex = c4157l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3724l) && this.yandex.equals(((C3724l) obj).yandex);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.yandex.yandex);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.yandex + ")";
    }

    @Override // defpackage.InterfaceC0796l
    public final int yandex(C16918l c16918l, long j, int i, EnumC9931l enumC9931l) {
        return this.yandex.yandex(i, (int) (j >> 32), enumC9931l);
    }
}
