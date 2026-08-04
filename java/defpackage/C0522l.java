package defpackage;

/* JADX INFO: renamed from: lٖؑۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0522l {
    public final Object loadAd;
    public final C11310l yandex;

    public C0522l(C11310l c11310l, Object obj) {
        this.yandex = c11310l;
        this.loadAd = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0522l)) {
            return false;
        }
        C0522l c0522l = (C0522l) obj;
        return AbstractC8576l.yandex(this.yandex, c0522l.yandex) && AbstractC8576l.yandex(this.loadAd, c0522l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "HttpResponseContainer(expectedType=" + this.yandex + ", response=" + this.loadAd + ')';
    }
}
