package defpackage;

/* JADX INFO: renamed from: lؓۖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2041l implements InterfaceC5965l {
    public final AbstractC5295l loadAd;
    public final String yandex;

    public C2041l(String str, AbstractC5295l abstractC5295l) {
        this.yandex = str;
        this.loadAd = abstractC5295l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2041l)) {
            return false;
        }
        C2041l c2041l = (C2041l) obj;
        return this.yandex.equals(c2041l.yandex) && AbstractC8576l.yandex(this.loadAd, c2041l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "UseCaseMissing(requiredUseCases=" + this.yandex + ", featureRequiring=" + this.loadAd + ')';
    }
}
