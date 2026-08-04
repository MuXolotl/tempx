package defpackage;

/* JADX INFO: renamed from: lٌَۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10186l {
    public final String amazon;
    public final String crashlytics;
    public final boolean loadAd;
    public final EnumC9763l yandex;

    public C10186l(EnumC9763l enumC9763l, boolean z, String str, String str2) {
        this.yandex = enumC9763l;
        this.loadAd = z;
        this.crashlytics = str;
        this.amazon = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10186l)) {
            return false;
        }
        C10186l c10186l = (C10186l) obj;
        return this.yandex == c10186l.yandex && this.loadAd == c10186l.loadAd && AbstractC8576l.yandex(this.crashlytics, c10186l.crashlytics) && AbstractC8576l.yandex(this.amazon, c10186l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + AbstractC12589l.advert(((this.yandex.hashCode() * 31) + (this.loadAd ? 1231 : 1237)) * 31, 31, this.crashlytics);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OauthState(method=");
        sb.append(this.yandex);
        sb.append(", hasNextMethods=");
        sb.append(this.loadAd);
        sb.append(", supportingData=");
        sb.append(this.crashlytics);
        sb.append(", phoneMask=");
        return AbstractC2812l.tapsense(sb, this.amazon, ')');
    }
}
