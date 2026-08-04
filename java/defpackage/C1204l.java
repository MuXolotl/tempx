package defpackage;

/* JADX INFO: renamed from: lؒٝٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1204l {
    public final C8934l loadAd;
    public final String yandex;

    public C1204l(String str, C8934l c8934l) {
        this.yandex = str;
        this.loadAd = c8934l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1204l)) {
            return false;
        }
        C1204l c1204l = (C1204l) obj;
        return this.yandex.equals(c1204l.yandex) && this.loadAd.equals(c1204l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.yandex + ", range=" + this.loadAd + ')';
    }
}
