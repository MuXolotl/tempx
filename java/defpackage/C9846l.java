package defpackage;

/* JADX INFO: renamed from: lٍ۟ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9846l {
    public final EnumC17389l loadAd;
    public final Object yandex;

    public C9846l(Object obj, EnumC17389l enumC17389l) {
        this.yandex = obj;
        this.loadAd = enumC17389l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9846l)) {
            return false;
        }
        C9846l c9846l = (C9846l) obj;
        return AbstractC8576l.yandex(this.yandex, c9846l.yandex) && this.loadAd == c9846l.loadAd;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "SimpleChildNavState(configuration=" + this.yandex + ", status=" + this.loadAd + ')';
    }
}
