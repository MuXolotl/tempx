package defpackage;

/* JADX INFO: renamed from: lِٕ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11867l {
    public final long amazon;
    public final String billing;
    public final int crashlytics;
    public final String loadAd;
    public final String mopub;
    public final C8512l purchase;
    public final String yandex;

    public C11867l(String str, String str2, int i, long j, C8512l c8512l, String str3, String str4) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = i;
        this.amazon = j;
        this.purchase = c8512l;
        this.billing = str3;
        this.mopub = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11867l)) {
            return false;
        }
        C11867l c11867l = (C11867l) obj;
        return AbstractC8576l.yandex(this.yandex, c11867l.yandex) && AbstractC8576l.yandex(this.loadAd, c11867l.loadAd) && this.crashlytics == c11867l.crashlytics && this.amazon == c11867l.amazon && this.purchase.equals(c11867l.purchase) && this.billing.equals(c11867l.billing) && AbstractC8576l.yandex(this.mopub, c11867l.mopub);
    }

    public final int hashCode() {
        int iAdvert = (AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd) + this.crashlytics) * 31;
        long j = this.amazon;
        return this.mopub.hashCode() + AbstractC12589l.advert((this.purchase.hashCode() + ((iAdvert + ((int) (j ^ (j >>> 32)))) * 31)) * 31, 31, this.billing);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.yandex);
        sb.append(", firstSessionId=");
        sb.append(this.loadAd);
        sb.append(", sessionIndex=");
        sb.append(this.crashlytics);
        sb.append(", eventTimestampUs=");
        sb.append(this.amazon);
        sb.append(", dataCollectionStatus=");
        sb.append(this.purchase);
        sb.append(", firebaseInstallationId=");
        sb.append(this.billing);
        sb.append(", firebaseAuthenticationToken=");
        return AbstractC2812l.tapsense(sb, this.mopub, ')');
    }
}
