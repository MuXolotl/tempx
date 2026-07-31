package defpackage;

/* JADX INFO: renamed from: lِۨۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12282l implements InterfaceC0038l {
    public final String loadAd;
    public final C9806l yandex;

    public C12282l(C9806l c9806l, String str) {
        this.yandex = c9806l;
        this.loadAd = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12282l)) {
            return false;
        }
        C12282l c12282l = (C12282l) obj;
        return AbstractC8576l.yandex(this.yandex, c12282l.yandex) && AbstractC8576l.yandex(this.loadAd, c12282l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemoteAuthQrCodeScanned(authInfo=");
        sb.append(this.yandex);
        sb.append(", authCode=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
