package defpackage;

/* JADX INFO: renamed from: lؚؕۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3566l implements InterfaceC13514l {
    public final C17726l loadAd;
    public final C12151l yandex;

    public C3566l(C12151l c12151l, C17726l c17726l) {
        this.yandex = c12151l;
        this.loadAd = c17726l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3566l)) {
            return false;
        }
        C3566l c3566l = (C3566l) obj;
        return this.yandex == c3566l.yandex && this.loadAd == c3566l.loadAd;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "Success(activeCamera=" + this.yandex + ", token=" + this.loadAd + ')';
    }
}
