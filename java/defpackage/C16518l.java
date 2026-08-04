package defpackage;

/* JADX INFO: renamed from: lٖٜٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16518l {
    public final C8160l loadAd;
    public final C3624l yandex;

    public C16518l(C3624l c3624l, C8160l c8160l) {
        this.yandex = c3624l;
        this.loadAd = c8160l;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16518l) {
            return AbstractC8576l.yandex(this.yandex, ((C16518l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }
}
