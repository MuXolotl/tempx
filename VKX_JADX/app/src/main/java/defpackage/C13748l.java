package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lْۢۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C13748l {
    public static final C15747l Companion = new C15747l();
    public static final InterfaceC1220l[] remoteconfig = {null, null, null, null, null, null, null, null, null, AbstractC9968l.crashlytics(2, new C7703l(14)), null, null};
    public final C10877l admob;
    public final String amazon;
    public final Integer billing;
    public final String crashlytics;
    public final Integer firebase;
    public final EnumC9380l isPro;
    public final String loadAd;
    public final Integer mopub;
    public final String purchase;
    public final String smaato;
    public final String subs;
    public final C17346l yandex;

    public /* synthetic */ C13748l(int i, C17346l c17346l, String str, String str2, String str3, String str4, Integer num, Integer num2, C10877l c10877l, String str5, EnumC9380l enumC9380l, Integer num3, String str6) {
        if ((i & 1) == 0) {
            this.yandex = null;
        } else {
            this.yandex = c17346l;
        }
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = str;
        }
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = str2;
        }
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = str3;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str4;
        }
        if ((i & 32) == 0) {
            this.billing = null;
        } else {
            this.billing = num;
        }
        if ((i & 64) == 0) {
            this.mopub = null;
        } else {
            this.mopub = num2;
        }
        if ((i & 128) == 0) {
            this.admob = null;
        } else {
            this.admob = c10877l;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.subs = null;
        } else {
            this.subs = str5;
        }
        if ((i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.isPro = null;
        } else {
            this.isPro = enumC9380l;
        }
        if ((i & 1024) == 0) {
            this.firebase = null;
        } else {
            this.firebase = num3;
        }
        if ((i & 2048) == 0) {
            this.smaato = null;
        } else {
            this.smaato = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13748l)) {
            return false;
        }
        C13748l c13748l = (C13748l) obj;
        return AbstractC8576l.yandex(this.yandex, c13748l.yandex) && AbstractC8576l.yandex(this.loadAd, c13748l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c13748l.crashlytics) && AbstractC8576l.yandex(this.amazon, c13748l.amazon) && AbstractC8576l.yandex(this.purchase, c13748l.purchase) && AbstractC8576l.yandex(this.billing, c13748l.billing) && AbstractC8576l.yandex(this.mopub, c13748l.mopub) && AbstractC8576l.yandex(this.admob, c13748l.admob) && AbstractC8576l.yandex(this.subs, c13748l.subs) && this.isPro == c13748l.isPro && AbstractC8576l.yandex(this.firebase, c13748l.firebase) && AbstractC8576l.yandex(this.smaato, c13748l.smaato);
    }

    public final int hashCode() {
        C17346l c17346l = this.yandex;
        int iHashCode = (c17346l == null ? 0 : c17346l.hashCode()) * 31;
        String str = this.loadAd;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.amazon;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.purchase;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.billing;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.mopub;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        C10877l c10877l = this.admob;
        int iLoadAd = (iHashCode7 + (c10877l == null ? 0 : C10877l.loadAd(c10877l.yandex))) * 31;
        String str5 = this.subs;
        int iHashCode8 = (iLoadAd + (str5 == null ? 0 : str5.hashCode())) * 31;
        EnumC9380l enumC9380l = this.isPro;
        int iHashCode9 = (iHashCode8 + (enumC9380l == null ? 0 : enumC9380l.hashCode())) * 31;
        Integer num3 = this.firebase;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.smaato;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseLinkButtonDto(action=");
        sb.append(this.yandex);
        sb.append(", title=");
        sb.append(this.loadAd);
        sb.append(", blockId=");
        sb.append(this.crashlytics);
        sb.append(", sectionId=");
        sb.append(this.amazon);
        sb.append(", artistId=");
        sb.append(this.purchase);
        sb.append(", curatorId=");
        sb.append(this.billing);
        sb.append(", albumId=");
        sb.append(this.mopub);
        sb.append(", ownerId=");
        sb.append(this.admob);
        sb.append(", icon=");
        sb.append(this.subs);
        sb.append(", style=");
        sb.append(this.isPro);
        sb.append(", audioId=");
        sb.append(this.firebase);
        sb.append(", hashtag=");
        return AbstractC2812l.tapsense(sb, this.smaato, ')');
    }
}
