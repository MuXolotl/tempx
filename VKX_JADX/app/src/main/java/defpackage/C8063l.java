package defpackage;

/* JADX INFO: renamed from: lً٘ۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8063l {
    public C12645l yandex;

    public C8063l(C12645l c12645l) {
        this.yandex = c12645l;
    }

    public final boolean equals(Object obj) {
        boolean z = obj == this;
        if (!(obj instanceof C8063l) || z) {
            return z;
        }
        boolean zEquals = this.yandex.f24877l.equals(((C8063l) obj).yandex.f24877l);
        this.yandex.getClass();
        return zEquals;
    }

    public final int hashCode() {
        int iHashCode = this.yandex.f24877l.hashCode();
        this.yandex.getClass();
        return iHashCode * 961;
    }
}
