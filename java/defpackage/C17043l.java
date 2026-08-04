package defpackage;

/* JADX INFO: renamed from: lُٗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17043l implements InterfaceC6442l {
    public final long amazon;
    public final String billing;
    public final int crashlytics;
    public final int loadAd;
    public final String purchase;
    public final String yandex;

    public C17043l(int i, int i2, long j, String str, String str2, String str3) {
        this.yandex = str;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = j;
        this.purchase = str2;
        this.billing = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17043l)) {
            return false;
        }
        C17043l c17043l = (C17043l) obj;
        return this.yandex.equals(c17043l.yandex) && this.loadAd == c17043l.loadAd && this.crashlytics == c17043l.crashlytics && this.amazon == c17043l.amazon && AbstractC8576l.yandex(this.purchase, c17043l.purchase) && AbstractC8576l.yandex(this.billing, c17043l.billing);
    }

    public final int hashCode() {
        int iHashCode = ((((this.yandex.hashCode() * 31) + this.loadAd) * 31) + this.crashlytics) * 31;
        long j = this.amazon;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.purchase;
        int iHashCode2 = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.billing;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenPlaylist(thumbnailUrl=");
        sb.append(this.yandex);
        sb.append(", apiMainColor=");
        sb.append(this.loadAd);
        sb.append(", id=");
        sb.append(this.crashlytics);
        sb.append(", ownerId=");
        sb.append(this.amazon);
        sb.append(", accessKey=");
        sb.append(this.purchase);
        sb.append(", title=");
        return AbstractC2812l.tapsense(sb, this.billing, ')');
    }
}
