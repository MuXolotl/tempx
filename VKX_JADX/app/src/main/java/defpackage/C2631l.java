package defpackage;

/* JADX INFO: renamed from: lْٕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2631l {
    public C7747l loadAd = null;
    public final C4910l yandex;

    public C2631l(C4910l c4910l) {
        this.yandex = c4910l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2631l) {
            C2631l c2631l = (C2631l) obj;
            if (this.yandex == c2631l.yandex && AbstractC8576l.yandex(this.loadAd, c2631l.loadAd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        C7747l c7747l = this.loadAd;
        return iHashCode + (c7747l == null ? 0 : c7747l.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.yandex + ", subscriber=" + this.loadAd + ')';
    }
}
