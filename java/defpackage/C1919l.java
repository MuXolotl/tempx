package defpackage;

/* JADX INFO: renamed from: lؓٙؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1919l {
    public final C6839l admob;
    public final C6839l amazon;
    public final C6839l billing;
    public final C6839l crashlytics;
    public C11607l firebase;
    public C12804l isPro;
    public final C6839l loadAd;
    public final C6839l mopub;
    public final C6839l purchase;
    public C15521l subs;
    public final C6839l yandex;

    public C1919l(C6839l c6839l, int i) {
        c6839l = (i & 1) != 0 ? AbstractC0174l.yandex : c6839l;
        C6839l c6839l2 = AbstractC0174l.loadAd;
        C6839l c6839l3 = AbstractC0174l.crashlytics;
        C6839l c6839l4 = AbstractC0174l.amazon;
        C6839l c6839l5 = AbstractC0174l.billing;
        C6839l c6839l6 = AbstractC0174l.purchase;
        C6839l c6839l7 = AbstractC0174l.mopub;
        C6839l c6839l8 = AbstractC0174l.admob;
        this.yandex = c6839l;
        this.loadAd = c6839l2;
        this.crashlytics = c6839l3;
        this.amazon = c6839l4;
        this.purchase = c6839l5;
        this.billing = c6839l6;
        this.mopub = c6839l7;
        this.admob = c6839l8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1919l)) {
            return false;
        }
        C1919l c1919l = (C1919l) obj;
        return AbstractC8576l.yandex(this.yandex, c1919l.yandex) && AbstractC8576l.yandex(this.loadAd, c1919l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c1919l.crashlytics) && AbstractC8576l.yandex(this.amazon, c1919l.amazon) && AbstractC8576l.yandex(this.purchase, c1919l.purchase) && AbstractC8576l.yandex(this.billing, c1919l.billing) && AbstractC8576l.yandex(this.mopub, c1919l.mopub) && AbstractC8576l.yandex(this.admob, c1919l.admob);
    }

    public final int hashCode() {
        return this.admob.hashCode() + ((this.mopub.hashCode() + ((this.billing.hashCode() + ((this.purchase.hashCode() + ((this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.yandex + ", small=" + this.loadAd + ", medium=" + this.crashlytics + ", large=" + this.amazon + ", largeIncreased=" + this.billing + ", extraLarge=" + this.purchase + ", extralargeIncreased=" + this.mopub + ", extraExtraLarge=" + this.admob + ")";
    }
}
