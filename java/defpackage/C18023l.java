package defpackage;

/* JADX INFO: renamed from: lۣ٘ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C18023l {
    public static final C16101l Companion = new C16101l();
    public final String amazon;
    public final String crashlytics;
    public final String loadAd;
    public final C0415l purchase;
    public final String yandex;

    public /* synthetic */ C18023l(int i, String str, String str2, String str3, String str4, C0415l c0415l) {
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
        if ((i & 8) == 0) {
            this.amazon = "";
        } else {
            this.amazon = str4;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = c0415l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18023l)) {
            return false;
        }
        C18023l c18023l = (C18023l) obj;
        return AbstractC8576l.yandex(this.yandex, c18023l.yandex) && AbstractC8576l.yandex(this.loadAd, c18023l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c18023l.crashlytics) && AbstractC8576l.yandex(this.amazon, c18023l.amazon) && AbstractC8576l.yandex(this.purchase, c18023l.purchase);
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics), 31, this.amazon);
        C0415l c0415l = this.purchase;
        return iAdvert + (c0415l == null ? 0 : c0415l.hashCode());
    }

    public final String toString() {
        return "Y25Title(title=" + this.yandex + ", value=" + this.loadAd + ", caption=" + this.crashlytics + ", resource=" + this.amazon + ", content=" + this.purchase + ')';
    }

    public C18023l(String str, String str2, String str3, C0415l c0415l, int i) {
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        String str4 = (i & 8) == 0 ? "artist" : "";
        c0415l = (i & 16) != 0 ? null : c0415l;
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = str4;
        this.purchase = c0415l;
    }
}
