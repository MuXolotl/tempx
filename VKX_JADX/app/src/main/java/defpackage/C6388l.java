package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؙُۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C6388l {
    public static final C1987l Companion = new C1987l();
    public static final InterfaceC1220l[] startapp = {null, null, null, null, AbstractC9968l.crashlytics(2, new C7282l(23)), AbstractC9968l.crashlytics(2, new C7282l(24)), null, null, null, AbstractC9968l.crashlytics(2, new C7282l(25)), null, AbstractC9968l.crashlytics(2, new C7282l(26)), AbstractC9968l.crashlytics(2, new C7282l(27)), AbstractC9968l.crashlytics(2, new C7282l(28)), null};
    public final Boolean admob;
    public final Boolean amazon;
    public final List billing;
    public final String crashlytics;
    public final String firebase;
    public final List isPro;
    public final String loadAd;
    public final String metrica;
    public final Boolean mopub;
    public final List purchase;
    public final List remoteconfig;
    public final List smaato;
    public final Boolean subs;
    public final List vip;
    public final String yandex;

    public /* synthetic */ C6388l(int i, String str, String str2, String str3, Boolean bool, List list, List list2, Boolean bool2, Boolean bool3, Boolean bool4, List list3, String str4, List list4, List list5, List list6, String str5) {
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C5816l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = str2;
        }
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = str3;
        }
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = bool;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = list;
        }
        if ((i & 32) == 0) {
            this.billing = null;
        } else {
            this.billing = list2;
        }
        if ((i & 64) == 0) {
            this.mopub = null;
        } else {
            this.mopub = bool2;
        }
        if ((i & 128) == 0) {
            this.admob = null;
        } else {
            this.admob = bool3;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.subs = null;
        } else {
            this.subs = bool4;
        }
        if ((i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.isPro = null;
        } else {
            this.isPro = list3;
        }
        if ((i & 1024) == 0) {
            this.firebase = null;
        } else {
            this.firebase = str4;
        }
        if ((i & 2048) == 0) {
            this.smaato = null;
        } else {
            this.smaato = list4;
        }
        if ((i & 4096) == 0) {
            this.remoteconfig = null;
        } else {
            this.remoteconfig = list5;
        }
        if ((i & 8192) == 0) {
            this.vip = null;
        } else {
            this.vip = list6;
        }
        if ((i & 16384) == 0) {
            this.metrica = null;
        } else {
            this.metrica = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6388l)) {
            return false;
        }
        C6388l c6388l = (C6388l) obj;
        return AbstractC8576l.yandex(this.yandex, c6388l.yandex) && AbstractC8576l.yandex(this.loadAd, c6388l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c6388l.crashlytics) && AbstractC8576l.yandex(this.amazon, c6388l.amazon) && AbstractC8576l.yandex(this.purchase, c6388l.purchase) && AbstractC8576l.yandex(this.billing, c6388l.billing) && AbstractC8576l.yandex(this.mopub, c6388l.mopub) && AbstractC8576l.yandex(this.admob, c6388l.admob) && AbstractC8576l.yandex(this.subs, c6388l.subs) && AbstractC8576l.yandex(this.isPro, c6388l.isPro) && AbstractC8576l.yandex(this.firebase, c6388l.firebase) && AbstractC8576l.yandex(this.smaato, c6388l.smaato) && AbstractC8576l.yandex(this.remoteconfig, c6388l.remoteconfig) && AbstractC8576l.yandex(this.vip, c6388l.vip) && AbstractC8576l.yandex(this.metrica, c6388l.metrica);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        String str = this.loadAd;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.amazon;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.purchase;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.billing;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool2 = this.mopub;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.admob;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.subs;
        int iHashCode9 = (iHashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List list3 = this.isPro;
        int iHashCode10 = (iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.firebase;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list4 = this.smaato;
        int iHashCode12 = (iHashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.remoteconfig;
        int iHashCode13 = (iHashCode12 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.vip;
        int iHashCode14 = (iHashCode13 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str4 = this.metrica;
        return iHashCode14 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioArtistDto(name=");
        sb.append(this.yandex);
        sb.append(", domain=");
        sb.append(this.loadAd);
        sb.append(", id=");
        sb.append(this.crashlytics);
        sb.append(", isAlbumCover=");
        sb.append(this.amazon);
        sb.append(", photo=");
        sb.append(this.purchase);
        sb.append(", photos=");
        sb.append(this.billing);
        sb.append(", isFollowed=");
        sb.append(this.mopub);
        sb.append(", canFollow=");
        sb.append(this.admob);
        sb.append(", canPlay=");
        sb.append(this.subs);
        sb.append(", genres=");
        sb.append(this.isPro);
        sb.append(", bio=");
        sb.append(this.firebase);
        sb.append(", pages=");
        sb.append(this.smaato);
        sb.append(", profiles=");
        sb.append(this.remoteconfig);
        sb.append(", groups=");
        sb.append(this.vip);
        sb.append(", trackCode=");
        return AbstractC2812l.tapsense(sb, this.metrica, ')');
    }
}
