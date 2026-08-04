package defpackage;

/* JADX INFO: renamed from: lؙۖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6669l implements InterfaceC3610l {
    public final int crashlytics;
    public final String loadAd;
    public final InterfaceC7204l yandex;

    public C6669l(InterfaceC7204l interfaceC7204l, String str, int i) {
        this.yandex = interfaceC7204l;
        this.loadAd = str;
        this.crashlytics = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6669l)) {
            return false;
        }
        C6669l c6669l = (C6669l) obj;
        return AbstractC8576l.yandex(this.yandex, c6669l.yandex) && AbstractC8576l.yandex(this.loadAd, c6669l.loadAd) && this.crashlytics == c6669l.crashlytics;
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        String str = this.loadAd;
        return AbstractC5020l.inmobi(this.crashlytics) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.yandex + ", mimeType=" + this.loadAd + ", dataSource=" + AbstractC11043l.ad(this.crashlytics) + ")";
    }
}
