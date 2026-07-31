package defpackage;

/* JADX INFO: renamed from: lٍٖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9865l {
    public final int loadAd;
    public final Object yandex;

    public C9865l(int i, Object obj) {
        this.yandex = obj;
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9865l)) {
            return false;
        }
        C9865l c9865l = (C9865l) obj;
        return this.yandex == c9865l.yandex && this.loadAd == c9865l.loadAd;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.yandex) * 65535) + this.loadAd;
    }
}
