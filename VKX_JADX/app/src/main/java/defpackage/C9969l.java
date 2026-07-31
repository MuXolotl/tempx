package defpackage;

/* JADX INFO: renamed from: lٍٟۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9969l {
    public final boolean loadAd;
    public final InterfaceC1286l yandex;

    public C9969l(InterfaceC1286l interfaceC1286l, boolean z) {
        this.yandex = interfaceC1286l;
        this.loadAd = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9969l)) {
            return false;
        }
        C9969l c9969l = (C9969l) obj;
        return this.yandex.equals(c9969l.yandex) && this.loadAd == c9969l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + (this.loadAd ? 1231 : 1237);
    }

    public final String toString() {
        return "DecodeResult(image=" + this.yandex + ", isSampled=" + this.loadAd + ")";
    }
}
