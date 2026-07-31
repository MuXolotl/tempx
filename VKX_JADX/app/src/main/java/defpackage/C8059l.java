package defpackage;

/* JADX INFO: renamed from: lًْ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8059l {
    public final C12875l loadAd;
    public final C3498l yandex;

    public C8059l(C3498l c3498l, C12875l c12875l) {
        this.yandex = c3498l;
        this.loadAd = c12875l;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8059l) {
            return AbstractC8576l.yandex(this.yandex, ((C8059l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }
}
