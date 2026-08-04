package defpackage;

/* JADX INFO: renamed from: lؘّٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C12419l implements InterfaceC7493l {
    public static final C15890l Companion = new C15890l();
    public final String crashlytics;
    public final String loadAd;
    public final String yandex;

    public /* synthetic */ C12419l(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.yandex = "";
        } else {
            this.yandex = str;
        }
        if ((i & 2) == 0) {
            this.loadAd = "";
        } else {
            this.loadAd = str2;
        }
        if ((i & 4) == 0) {
            this.crashlytics = "";
        } else {
            this.crashlytics = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12419l)) {
            return false;
        }
        C12419l c12419l = (C12419l) obj;
        return AbstractC8576l.yandex(this.yandex, c12419l.yandex) && AbstractC8576l.yandex(this.loadAd, c12419l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c12419l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientError(error=");
        sb.append(this.yandex);
        sb.append(", errorDescription=");
        sb.append(this.loadAd);
        sb.append(", errorType=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
