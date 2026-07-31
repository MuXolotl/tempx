package defpackage;

/* JADX INFO: renamed from: lْٔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14966l {
    public static final C14966l mopub = new C14966l(false, 0, true, 1, 1, C10537l.f21447l);
    public final int amazon;
    public final C10537l billing;
    public final boolean crashlytics;
    public final int loadAd;
    public final int purchase;
    public final boolean yandex;

    public C14966l(boolean z, int i, boolean z2, int i2, int i3, C10537l c10537l) {
        this.yandex = z;
        this.loadAd = i;
        this.crashlytics = z2;
        this.amazon = i2;
        this.purchase = i3;
        this.billing = c10537l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14966l)) {
            return false;
        }
        C14966l c14966l = (C14966l) obj;
        return this.yandex == c14966l.yandex && this.loadAd == c14966l.loadAd && this.crashlytics == c14966l.crashlytics && this.amazon == c14966l.amazon && this.purchase == c14966l.purchase && AbstractC8576l.yandex(this.billing, c14966l.billing);
    }

    public final int hashCode() {
        return this.billing.f21449l.hashCode() + ((((((((((this.yandex ? 1231 : 1237) * 31) + this.loadAd) * 31) + (this.crashlytics ? 1231 : 1237)) * 31) + this.amazon) * 31) + this.purchase) * 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.yandex + ", capitalization=" + C1290l.yandex(this.loadAd) + ", autoCorrect=" + this.crashlytics + ", keyboardType=" + C3911l.yandex(this.amazon) + ", imeAction=" + C14694l.yandex(this.purchase) + ", platformImeOptions=null, hintLocales=" + this.billing + ")";
    }
}
