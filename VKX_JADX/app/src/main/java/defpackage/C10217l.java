package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lََۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C10217l {
    public static final C13910l Companion = new C13910l();
    public static final InterfaceC1220l[] Signature = {null, null, null, null, null, null, null, null, null, AbstractC9968l.crashlytics(2, new C0063l(25)), AbstractC9968l.crashlytics(2, new C0063l(26)), AbstractC9968l.crashlytics(2, new C0063l(27)), AbstractC9968l.crashlytics(2, new C0063l(28)), null, null, AbstractC9968l.crashlytics(2, new C0063l(29)), null, null, null, null};
    public final String adcel;
    public final String admob;
    public final String ads;
    public final boolean amazon;
    public final String billing;
    public final int crashlytics;
    public final List firebase;
    public final List isPro;
    public final String loadAd;
    public final String metrica;
    public final String mopub;
    public final boolean purchase;
    public final List remoteconfig;
    public final List smaato;
    public final List startapp;
    public final String subs;
    public final String subscription;
    public final C15375l tapsense;
    public final String vip;
    public final String yandex;

    public /* synthetic */ C10217l(int i, String str, String str2, int i2, boolean z, boolean z2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, String str7, String str8, List list5, String str9, String str10, String str11, C15375l c15375l) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C9400l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = str2;
        if ((i & 4) == 0) {
            this.crashlytics = 0;
        } else {
            this.crashlytics = i2;
        }
        if ((i & 8) == 0) {
            this.amazon = false;
        } else {
            this.amazon = z;
        }
        if ((i & 16) == 0) {
            this.purchase = false;
        } else {
            this.purchase = z2;
        }
        if ((i & 32) == 0) {
            this.billing = "";
        } else {
            this.billing = str3;
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
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.subs = "";
        } else {
            this.subs = str6;
        }
        int i3 = i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
        C2580l c2580l = C2580l.f5619l;
        if (i3 == 0) {
            this.isPro = c2580l;
        } else {
            this.isPro = list;
        }
        if ((i & 1024) == 0) {
            this.firebase = c2580l;
        } else {
            this.firebase = list2;
        }
        if ((i & 2048) == 0) {
            this.smaato = c2580l;
        } else {
            this.smaato = list3;
        }
        if ((i & 4096) == 0) {
            this.remoteconfig = c2580l;
        } else {
            this.remoteconfig = list4;
        }
        if ((i & 8192) == 0) {
            this.vip = "";
        } else {
            this.vip = str7;
        }
        if ((i & 16384) == 0) {
            this.metrica = "";
        } else {
            this.metrica = str8;
        }
        if ((32768 & i) == 0) {
            this.startapp = c2580l;
        } else {
            this.startapp = list5;
        }
        if ((65536 & i) == 0) {
            this.adcel = "";
        } else {
            this.adcel = str9;
        }
        if ((131072 & i) == 0) {
            this.ads = "";
        } else {
            this.ads = str10;
        }
        if ((262144 & i) == 0) {
            this.subscription = "";
        } else {
            this.subscription = str11;
        }
        if ((i & 524288) == 0) {
            this.tapsense = null;
        } else {
            this.tapsense = c15375l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10217l)) {
            return false;
        }
        C10217l c10217l = (C10217l) obj;
        return AbstractC8576l.yandex(this.yandex, c10217l.yandex) && AbstractC8576l.yandex(this.loadAd, c10217l.loadAd) && this.crashlytics == c10217l.crashlytics && this.amazon == c10217l.amazon && this.purchase == c10217l.purchase && AbstractC8576l.yandex(this.billing, c10217l.billing) && AbstractC8576l.yandex(this.mopub, c10217l.mopub) && AbstractC8576l.yandex(this.admob, c10217l.admob) && AbstractC8576l.yandex(this.subs, c10217l.subs) && AbstractC8576l.yandex(this.isPro, c10217l.isPro) && AbstractC8576l.yandex(this.firebase, c10217l.firebase) && AbstractC8576l.yandex(this.smaato, c10217l.smaato) && AbstractC8576l.yandex(this.remoteconfig, c10217l.remoteconfig) && AbstractC8576l.yandex(this.vip, c10217l.vip) && AbstractC8576l.yandex(this.metrica, c10217l.metrica) && AbstractC8576l.yandex(this.startapp, c10217l.startapp) && AbstractC8576l.yandex(this.adcel, c10217l.adcel) && AbstractC8576l.yandex(this.ads, c10217l.ads) && AbstractC8576l.yandex(this.subscription, c10217l.subscription) && AbstractC8576l.yandex(this.tapsense, c10217l.tapsense);
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(AbstractC14814l.admob(AbstractC12589l.advert(AbstractC12589l.advert(AbstractC14814l.admob(AbstractC14814l.admob(AbstractC14814l.admob(AbstractC14814l.admob(AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert((((((AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd) + this.crashlytics) * 31) + (this.amazon ? 1231 : 1237)) * 31) + (this.purchase ? 1231 : 1237)) * 31, 31, this.billing), 31, this.mopub), 31, this.admob), 31, this.subs), 31, this.isPro), 31, this.firebase), 31, this.smaato), 31, this.remoteconfig), 31, this.vip), 31, this.metrica), 31, this.startapp), 31, this.adcel), 31, this.ads), 31, this.subscription);
        C15375l c15375l = this.tapsense;
        return iAdvert + (c15375l == null ? 0 : c15375l.hashCode());
    }

    public final String toString() {
        return "AudioGetAnnualResultBlockDto(name=" + this.yandex + ", type=" + this.loadAd + ", order=" + this.crashlytics + ", isVisible=" + this.amazon + ", isSharingEnabled=" + this.purchase + ", backgroundUrl=" + this.billing + ", storyBg=" + this.mopub + ", fallbackBackgroundUrl=" + this.admob + ", audioPreviewUrl=" + this.subs + ", titles=" + this.isPro + ", subtitles=" + this.firebase + ", metrics=" + this.smaato + ", photoUrls=" + this.remoteconfig + ", playlistPhotoUrl=" + this.vip + ", playlistTitle=" + this.metrica + ", playlistAudioRawIds=" + this.startapp + ", screenCaption=" + this.adcel + ", screenTitle=" + this.ads + ", screenSubtitle=" + this.subscription + ", artist=" + this.tapsense + ')';
    }
}
