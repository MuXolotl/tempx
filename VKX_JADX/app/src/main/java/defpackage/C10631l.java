package defpackage;

/* JADX INFO: renamed from: lَٕۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10631l {
    public final int loadAd;
    public final Object yandex;

    public C10631l(AbstractC1251l abstractC1251l, int i) {
        this.yandex = abstractC1251l;
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10631l)) {
            return false;
        }
        C10631l c10631l = (C10631l) obj;
        return this.yandex == c10631l.yandex && this.loadAd == c10631l.loadAd;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.yandex) * 65535) + this.loadAd;
    }
}
