package defpackage;

/* JADX INFO: renamed from: lؙٖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C16511l {
    public static final C14489l Companion = new C14489l();
    public static final InterfaceC1220l[] admob = {null, null, null, null, AbstractC9968l.crashlytics(2, new C5146l(25)), null, null};
    public final String amazon;
    public final C2106l billing;
    public final boolean crashlytics;
    public final String loadAd;
    public final boolean mopub;
    public final InterfaceC2779l purchase;
    public final int yandex;

    public /* synthetic */ C16511l(int i, int i2, String str, boolean z, String str2, InterfaceC2779l interfaceC2779l, C2106l c2106l, boolean z2) {
        if (59 != (i & 59)) {
            AbstractC11036l.isPro(i, 59, C11394l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = str;
        if ((i & 4) == 0) {
            this.crashlytics = false;
        } else {
            this.crashlytics = z;
        }
        this.amazon = str2;
        this.purchase = interfaceC2779l;
        this.billing = c2106l;
        if ((i & 64) == 0) {
            this.mopub = false;
        } else {
            this.mopub = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16511l)) {
            return false;
        }
        C16511l c16511l = (C16511l) obj;
        return this.yandex == c16511l.yandex && AbstractC8576l.yandex(this.loadAd, c16511l.loadAd) && this.crashlytics == c16511l.crashlytics && AbstractC8576l.yandex(this.amazon, c16511l.amazon) && AbstractC8576l.yandex(this.purchase, c16511l.purchase) && AbstractC8576l.yandex(this.billing, c16511l.billing) && this.mopub == c16511l.mopub;
    }

    public final int hashCode() {
        return ((this.billing.hashCode() + ((this.purchase.hashCode() + AbstractC12589l.advert((AbstractC12589l.advert(this.yandex * 31, 31, this.loadAd) + (this.crashlytics ? 1231 : 1237)) * 31, 31, this.amazon)) * 31)) * 31) + (this.mopub ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SparkAppUpdate(versionCode=");
        sb.append(this.yandex);
        sb.append(", versionName=");
        sb.append(this.loadAd);
        sb.append(", beta=");
        sb.append(this.crashlytics);
        sb.append(", changelog=");
        sb.append(this.amazon);
        sb.append(", downloadSource=");
        sb.append(this.purchase);
        sb.append(", releaseDate=");
        sb.append(this.billing);
        sb.append(", forceUpdate=");
        return AbstractC0653l.tapsense(sb, this.mopub, ')');
    }
}
