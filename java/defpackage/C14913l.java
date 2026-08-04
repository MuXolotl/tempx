package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٕٔۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C14913l {
    public static final C12090l Companion = new C12090l();
    public static final InterfaceC1220l[] metrica = {null, null, null, null, null, null, null, null, null, AbstractC9968l.crashlytics(2, new C3342l(10)), null, null, null, null};
    public final String admob;
    public final Integer amazon;
    public final String billing;
    public final Boolean crashlytics;
    public final Boolean firebase;
    public final List isPro;
    public final String loadAd;
    public final String mopub;
    public final Integer purchase;
    public final Boolean remoteconfig;
    public final String smaato;
    public final C13748l subs;
    public final Integer vip;
    public final C12905l yandex;

    public /* synthetic */ C14913l(int i, C12905l c12905l, String str, Boolean bool, Integer num, Integer num2, String str2, String str3, String str4, C13748l c13748l, List list, Boolean bool2, String str5, Boolean bool3, Integer num3) {
        if ((i & 1) == 0) {
            this.yandex = null;
        } else {
            this.yandex = c12905l;
        }
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = str;
        }
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = bool;
        }
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = num;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = num2;
        }
        if ((i & 32) == 0) {
            this.billing = null;
        } else {
            this.billing = str2;
        }
        if ((i & 64) == 0) {
            this.mopub = null;
        } else {
            this.mopub = str3;
        }
        if ((i & 128) == 0) {
            this.admob = null;
        } else {
            this.admob = str4;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.subs = null;
        } else {
            this.subs = c13748l;
        }
        if ((i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.isPro = null;
        } else {
            this.isPro = list;
        }
        if ((i & 1024) == 0) {
            this.firebase = null;
        } else {
            this.firebase = bool2;
        }
        if ((i & 2048) == 0) {
            this.smaato = null;
        } else {
            this.smaato = str5;
        }
        if ((i & 4096) == 0) {
            this.remoteconfig = null;
        } else {
            this.remoteconfig = bool3;
        }
        if ((i & 8192) == 0) {
            this.vip = null;
        } else {
            this.vip = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14913l)) {
            return false;
        }
        C14913l c14913l = (C14913l) obj;
        return AbstractC8576l.yandex(this.yandex, c14913l.yandex) && AbstractC8576l.yandex(this.loadAd, c14913l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c14913l.crashlytics) && AbstractC8576l.yandex(this.amazon, c14913l.amazon) && AbstractC8576l.yandex(this.purchase, c14913l.purchase) && AbstractC8576l.yandex(this.billing, c14913l.billing) && AbstractC8576l.yandex(this.mopub, c14913l.mopub) && AbstractC8576l.yandex(this.admob, c14913l.admob) && AbstractC8576l.yandex(this.subs, c14913l.subs) && AbstractC8576l.yandex(this.isPro, c14913l.isPro) && AbstractC8576l.yandex(this.firebase, c14913l.firebase) && AbstractC8576l.yandex(this.smaato, c14913l.smaato) && AbstractC8576l.yandex(this.remoteconfig, c14913l.remoteconfig) && AbstractC8576l.yandex(this.vip, c14913l.vip);
    }

    public final int hashCode() {
        C12905l c12905l = this.yandex;
        int iHashCode = (c12905l == null ? 0 : c12905l.hashCode()) * 31;
        String str = this.loadAd;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.amazon;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.purchase;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.billing;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mopub;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.admob;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C13748l c13748l = this.subs;
        int iHashCode9 = (iHashCode8 + (c13748l == null ? 0 : c13748l.hashCode())) * 31;
        List list = this.isPro;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.firebase;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.smaato;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool3 = this.remoteconfig;
        int iHashCode13 = (iHashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num3 = this.vip;
        return iHashCode13 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "PodcastInfoDto(cover=" + this.yandex + ", description=" + this.loadAd + ", isFavorite=" + this.crashlytics + ", plays=" + this.amazon + ", position=" + this.purchase + ", rssGuid=" + this.billing + ", restrictionDescription=" + this.mopub + ", restrictionText=" + this.admob + ", restrictionButton=" + this.subs + ", friendsLiked=" + this.isPro + ", isRandom=" + this.firebase + ", post=" + this.smaato + ", isDonut=" + this.remoteconfig + ", podcastId=" + this.vip + ')';
    }
}
