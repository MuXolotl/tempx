package defpackage;

/* JADX INFO: renamed from: lٕؕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3416l implements InterfaceC0038l {
    public final String crashlytics;
    public final int loadAd;
    public final String yandex;

    public C3416l(String str, int i, String str2) {
        this.yandex = str;
        this.loadAd = i;
        this.crashlytics = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3416l)) {
            return false;
        }
        C3416l c3416l = (C3416l) obj;
        return AbstractC8576l.yandex(this.yandex, c3416l.yandex) && this.loadAd == c3416l.loadAd && AbstractC8576l.yandex(this.crashlytics, c3416l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + (((this.yandex.hashCode() * 31) + this.loadAd) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorizationQrCodeScanned(code=");
        sb.append(this.yandex);
        sb.append(", pollingDuration=");
        sb.append(this.loadAd);
        sb.append(", domain=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
