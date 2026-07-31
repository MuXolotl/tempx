package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٗۥؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C17526l {
    public static final C13912l Companion = new C13912l();
    public final String admob;
    public final String amazon;
    public final long billing;
    public final long crashlytics;
    public final String loadAd;
    public final String mopub;
    public final String purchase;
    public final boolean subs;
    public final long yandex;

    public /* synthetic */ C17526l(int i, long j, String str, long j2, String str2, String str3, long j3, String str4, String str5, boolean z) {
        if ((i & 1) == 0) {
            this.yandex = 0L;
        } else {
            this.yandex = j;
        }
        if ((i & 2) == 0) {
            this.loadAd = "";
        } else {
            this.loadAd = str;
        }
        if ((i & 4) == 0) {
            this.crashlytics = 0L;
        } else {
            this.crashlytics = j2;
        }
        if ((i & 8) == 0) {
            this.amazon = "";
        } else {
            this.amazon = str2;
        }
        if ((i & 16) == 0) {
            this.purchase = "";
        } else {
            this.purchase = str3;
        }
        if ((i & 32) == 0) {
            this.billing = 0L;
        } else {
            this.billing = j3;
        }
        if ((i & 64) == 0) {
            this.mopub = "";
        } else {
            this.mopub = str4;
        }
        if ((i & 128) == 0) {
            this.admob = "";
        } else {
            this.admob = str5;
        }
        this.subs = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 ? false : z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17526l)) {
            return false;
        }
        C17526l c17526l = (C17526l) obj;
        return this.yandex == c17526l.yandex && AbstractC8576l.yandex(this.loadAd, c17526l.loadAd) && this.crashlytics == c17526l.crashlytics && AbstractC8576l.yandex(this.amazon, c17526l.amazon) && AbstractC8576l.yandex(this.purchase, c17526l.purchase) && this.billing == c17526l.billing && AbstractC8576l.yandex(this.mopub, c17526l.mopub) && AbstractC8576l.yandex(this.admob, c17526l.admob) && this.subs == c17526l.subs;
    }

    public final int hashCode() {
        long j = this.yandex;
        int iAdvert = AbstractC12589l.advert(((int) (j ^ (j >>> 32))) * 31, 31, this.loadAd);
        long j2 = this.crashlytics;
        int iAdvert2 = AbstractC12589l.advert(AbstractC12589l.advert((iAdvert + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.amazon), 31, this.purchase);
        long j3 = this.billing;
        return AbstractC12589l.advert(AbstractC12589l.advert((iAdvert2 + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31, this.mopub), 31, this.admob) + (this.subs ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegacyVkAccount(id=");
        sb.append(this.yandex);
        sb.append(", accessToken=");
        sb.append(this.loadAd);
        sb.append(", accessTokenExpiresAt=");
        sb.append(this.crashlytics);
        sb.append(", trustedHash=");
        sb.append(this.amazon);
        sb.append(", exchangeToken=");
        sb.append(this.purchase);
        sb.append(", metadataExpiresAt=");
        sb.append(this.billing);
        sb.append(", username=");
        sb.append(this.mopub);
        sb.append(", avatar=");
        sb.append(this.admob);
        sb.append(", canUseModernVkApi=");
        return AbstractC0653l.tapsense(sb, this.subs, ')');
    }
}
