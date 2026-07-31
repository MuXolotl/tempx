package defpackage;

/* JADX INFO: renamed from: lْۥّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C13785l {
    public static final C3325l Companion = new C3325l();
    public final C4803l crashlytics;
    public final int loadAd;
    public final String yandex;

    public /* synthetic */ C13785l(int i, String str, int i2, C4803l c4803l) {
        this.yandex = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.loadAd = 1;
        } else {
            this.loadAd = i2;
        }
        if ((i & 4) == 0) {
            this.crashlytics = new C4803l();
        } else {
            this.crashlytics = c4803l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13785l)) {
            return false;
        }
        C13785l c13785l = (C13785l) obj;
        return AbstractC8576l.yandex(this.yandex, c13785l.yandex) && this.loadAd == c13785l.loadAd && AbstractC8576l.yandex(this.crashlytics, c13785l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + (((this.yandex.hashCode() * 31) + this.loadAd) * 31);
    }

    public final String toString() {
        return "VkConfigNetworkProxyProduct(product=" + this.yandex + ", version=" + this.loadAd + ", data=" + this.crashlytics + ')';
    }
}
