package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؗؕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C4645l {
    public static final C5589l Companion = new C5589l();
    public static final C4645l smaato;
    public final String admob;
    public final String amazon;
    public final C2106l billing;
    public final C2106l crashlytics;
    public final boolean firebase;
    public final String isPro;
    public final String loadAd;
    public final String mopub;
    public final String purchase;
    public final String subs;
    public final long yandex;

    static {
        C2106l c2106l = C2106l.f4733l;
        smaato = new C4645l(0L, "", C16367l.license(-3217862419201L, 999999999L), "", "", C16367l.license(-3217862419201L, 999999999L), "", "", "", "", true);
    }

    public /* synthetic */ C4645l(int i, long j, String str, C2106l c2106l, String str2, String str3, C2106l c2106l2, String str4, String str5, String str6, String str7, boolean z) {
        if (2047 != (i & 2047)) {
            AbstractC11036l.isPro(i, 2047, C15385l.yandex.purchase());
            throw null;
        }
        this.yandex = j;
        this.loadAd = str;
        this.crashlytics = c2106l;
        this.amazon = str2;
        this.purchase = str3;
        this.billing = c2106l2;
        this.mopub = str4;
        this.admob = str5;
        this.subs = str6;
        this.isPro = str7;
        this.firebase = z;
    }

    public static C4645l yandex(C4645l c4645l, long j, String str, C2106l c2106l, String str2, String str3, C2106l c2106l2, String str4, String str5, String str6, String str7, boolean z, int i) {
        if ((i & 1) != 0) {
            j = c4645l.yandex;
        }
        long j2 = j;
        String str8 = (i & 2) != 0 ? c4645l.loadAd : str;
        C2106l c2106l3 = (i & 4) != 0 ? c4645l.crashlytics : c2106l;
        String str9 = (i & 8) != 0 ? c4645l.amazon : str2;
        String str10 = (i & 16) != 0 ? c4645l.purchase : str3;
        C2106l c2106l4 = (i & 32) != 0 ? c4645l.billing : c2106l2;
        String str11 = (i & 64) != 0 ? c4645l.mopub : str4;
        String str12 = (i & 128) != 0 ? c4645l.admob : str5;
        String str13 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c4645l.subs : str6;
        String str14 = (i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? c4645l.isPro : str7;
        boolean z2 = (i & 1024) != 0 ? c4645l.firebase : z;
        c4645l.getClass();
        return new C4645l(j2, str8, c2106l3, str9, str10, c2106l4, str11, str12, str13, str14, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4645l)) {
            return false;
        }
        C4645l c4645l = (C4645l) obj;
        return this.yandex == c4645l.yandex && AbstractC8576l.yandex(this.loadAd, c4645l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c4645l.crashlytics) && AbstractC8576l.yandex(this.amazon, c4645l.amazon) && AbstractC8576l.yandex(this.purchase, c4645l.purchase) && AbstractC8576l.yandex(this.billing, c4645l.billing) && AbstractC8576l.yandex(this.mopub, c4645l.mopub) && AbstractC8576l.yandex(this.admob, c4645l.admob) && AbstractC8576l.yandex(this.subs, c4645l.subs) && AbstractC8576l.yandex(this.isPro, c4645l.isPro) && this.firebase == c4645l.firebase;
    }

    public final int hashCode() {
        long j = this.yandex;
        return AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert((this.billing.hashCode() + AbstractC12589l.advert(AbstractC12589l.advert((this.crashlytics.hashCode() + AbstractC12589l.advert(((int) (j ^ (j >>> 32))) * 31, 31, this.loadAd)) * 31, 31, this.amazon), 31, this.purchase)) * 31, 31, this.mopub), 31, this.admob), 31, this.subs), 31, this.isPro) + (this.firebase ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkAccount(id=");
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
        sb.append(", firstName=");
        sb.append(this.admob);
        sb.append(", lastName=");
        sb.append(this.subs);
        sb.append(", avatar=");
        sb.append(this.isPro);
        sb.append(", usesLatestApi=");
        return AbstractC0653l.tapsense(sb, this.firebase, ')');
    }

    public C4645l(long j, String str, C2106l c2106l, String str2, String str3, C2106l c2106l2, String str4, String str5, String str6, String str7, boolean z) {
        this.yandex = j;
        this.loadAd = str;
        this.crashlytics = c2106l;
        this.amazon = str2;
        this.purchase = str3;
        this.billing = c2106l2;
        this.mopub = str4;
        this.admob = str5;
        this.subs = str6;
        this.isPro = str7;
        this.firebase = z;
    }
}
