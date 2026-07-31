package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* JADX INFO: renamed from: lٍٓ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9554l {
    public final LinkedHashMap Signature;
    public final LinkedHashMap ad;
    public final LinkedHashMap adcel;
    public final LinkedHashMap admob;
    public final LinkedHashMap ads;
    public final LinkedHashMap advert;
    public final LinkedHashMap amazon;
    public final LinkedHashMap billing;
    public final LinkedHashMap crashlytics;
    public final LinkedHashMap firebase;
    public final LinkedHashMap isPro;
    public final LinkedHashMap license;
    public final LinkedHashMap loadAd;
    public final LinkedHashMap metrica;
    public final LinkedHashMap mopub;
    public final LinkedHashMap pro;
    public final LinkedHashMap purchase;
    public final LinkedHashMap remoteconfig;
    public final LinkedHashMap smaato;
    public final LinkedHashMap startapp;
    public final LinkedHashMap subs;
    public final LinkedHashMap subscription;
    public final LinkedHashMap tapsense;
    public final LinkedHashMap vip;
    public final LinkedHashMap yandex;

    public C9554l(Catalog2Response catalog2Response) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMapYandex = AbstractC12854l.yandex(catalog2Response.isPro);
        LinkedHashMap linkedHashMapYandex2 = AbstractC12854l.yandex(catalog2Response.firebase);
        LinkedHashMap linkedHashMapYandex3 = AbstractC12854l.yandex(catalog2Response.admob);
        LinkedHashMap linkedHashMapYandex4 = AbstractC12854l.yandex(catalog2Response.mopub);
        LinkedHashMap linkedHashMapYandex5 = AbstractC12854l.yandex(catalog2Response.subs);
        LinkedHashMap linkedHashMapYandex6 = AbstractC12854l.yandex(catalog2Response.remoteconfig);
        LinkedHashMap linkedHashMapYandex7 = AbstractC12854l.yandex(catalog2Response.smaato);
        LinkedHashMap linkedHashMapYandex8 = catalog2Response.yandex();
        LinkedHashMap linkedHashMapYandex9 = AbstractC12854l.yandex(AbstractC12854l.loadAd(catalog2Response.vip));
        List list = catalog2Response.metrica;
        if (list != null) {
            int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(list, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iFirebase < 16 ? 16 : iFirebase);
            for (Object obj : list) {
                linkedHashMap2.put(String.valueOf(((VKProfile) obj).yandex), obj);
            }
            linkedHashMap = new LinkedHashMap(linkedHashMap2);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMapYandex10 = AbstractC12854l.yandex(catalog2Response.startapp);
        LinkedHashMap linkedHashMapYandex11 = AbstractC12854l.yandex(catalog2Response.adcel);
        LinkedHashMap linkedHashMapYandex12 = AbstractC12854l.yandex(catalog2Response.ads);
        LinkedHashMap linkedHashMapYandex13 = AbstractC12854l.yandex(catalog2Response.subscription);
        LinkedHashMap linkedHashMapYandex14 = AbstractC12854l.yandex(catalog2Response.tapsense);
        LinkedHashMap linkedHashMapYandex15 = AbstractC12854l.yandex(catalog2Response.Signature);
        LinkedHashMap linkedHashMapYandex16 = AbstractC12854l.yandex(catalog2Response.license);
        LinkedHashMap linkedHashMapYandex17 = AbstractC12854l.yandex(catalog2Response.pro);
        LinkedHashMap linkedHashMapYandex18 = AbstractC12854l.yandex(catalog2Response.ad);
        LinkedHashMap linkedHashMapYandex19 = AbstractC12854l.yandex(catalog2Response.advert);
        LinkedHashMap linkedHashMapYandex20 = AbstractC12854l.yandex(catalog2Response.isVip);
        LinkedHashMap linkedHashMapYandex21 = AbstractC12854l.yandex(catalog2Response.signatures);
        LinkedHashMap linkedHashMapYandex22 = AbstractC12854l.yandex(catalog2Response.premium);
        LinkedHashMap linkedHashMapYandex23 = AbstractC12854l.yandex(catalog2Response.applovin);
        LinkedHashMap linkedHashMapYandex24 = AbstractC12854l.yandex(catalog2Response.appmetrica);
        this.yandex = linkedHashMapYandex;
        this.loadAd = linkedHashMapYandex2;
        this.crashlytics = linkedHashMapYandex3;
        this.amazon = linkedHashMapYandex4;
        this.purchase = linkedHashMapYandex5;
        this.billing = linkedHashMapYandex6;
        this.mopub = linkedHashMapYandex7;
        this.admob = linkedHashMapYandex8;
        this.subs = linkedHashMapYandex9;
        this.isPro = linkedHashMap;
        this.firebase = linkedHashMapYandex10;
        this.smaato = linkedHashMapYandex11;
        this.remoteconfig = linkedHashMapYandex12;
        this.vip = linkedHashMapYandex18;
        this.metrica = linkedHashMapYandex13;
        this.startapp = linkedHashMapYandex14;
        this.adcel = linkedHashMapYandex15;
        this.ads = linkedHashMapYandex16;
        this.subscription = linkedHashMapYandex17;
        this.tapsense = linkedHashMapYandex19;
        this.Signature = linkedHashMapYandex20;
        this.license = linkedHashMapYandex21;
        this.pro = linkedHashMapYandex22;
        this.ad = linkedHashMapYandex23;
        this.advert = linkedHashMapYandex24;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9554l)) {
            return false;
        }
        C9554l c9554l = (C9554l) obj;
        return AbstractC8576l.yandex(this.yandex, c9554l.yandex) && AbstractC8576l.yandex(this.loadAd, c9554l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c9554l.crashlytics) && AbstractC8576l.yandex(this.amazon, c9554l.amazon) && AbstractC8576l.yandex(this.purchase, c9554l.purchase) && AbstractC8576l.yandex(this.billing, c9554l.billing) && AbstractC8576l.yandex(this.mopub, c9554l.mopub) && AbstractC8576l.yandex(this.admob, c9554l.admob) && AbstractC8576l.yandex(this.subs, c9554l.subs) && AbstractC8576l.yandex(this.isPro, c9554l.isPro) && AbstractC8576l.yandex(this.firebase, c9554l.firebase) && AbstractC8576l.yandex(this.smaato, c9554l.smaato) && AbstractC8576l.yandex(this.remoteconfig, c9554l.remoteconfig) && AbstractC8576l.yandex(this.vip, c9554l.vip) && AbstractC8576l.yandex(this.metrica, c9554l.metrica) && AbstractC8576l.yandex(this.startapp, c9554l.startapp) && AbstractC8576l.yandex(this.adcel, c9554l.adcel) && AbstractC8576l.yandex(this.ads, c9554l.ads) && AbstractC8576l.yandex(this.subscription, c9554l.subscription) && AbstractC8576l.yandex(this.tapsense, c9554l.tapsense) && AbstractC8576l.yandex(this.Signature, c9554l.Signature) && AbstractC8576l.yandex(this.license, c9554l.license) && AbstractC8576l.yandex(this.pro, c9554l.pro) && AbstractC8576l.yandex(this.ad, c9554l.ad) && AbstractC8576l.yandex(this.advert, c9554l.advert);
    }

    public final int hashCode() {
        return this.advert.hashCode() + AbstractC15560l.metrica(this.ad, AbstractC15560l.metrica(this.pro, AbstractC15560l.metrica(this.license, AbstractC15560l.metrica(this.Signature, AbstractC15560l.metrica(this.tapsense, AbstractC15560l.metrica(this.subscription, AbstractC15560l.metrica(this.ads, AbstractC15560l.metrica(this.adcel, AbstractC15560l.metrica(this.startapp, AbstractC15560l.metrica(this.metrica, AbstractC15560l.metrica(this.vip, AbstractC15560l.metrica(this.remoteconfig, AbstractC15560l.metrica(this.smaato, AbstractC15560l.metrica(this.firebase, AbstractC15560l.metrica(this.isPro, AbstractC15560l.metrica(this.subs, AbstractC15560l.metrica(this.admob, AbstractC15560l.metrica(this.mopub, AbstractC15560l.metrica(this.billing, AbstractC15560l.metrica(this.purchase, AbstractC15560l.metrica(this.amazon, AbstractC15560l.metrica(this.crashlytics, AbstractC15560l.metrica(this.loadAd, this.yandex.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final void loadAd() {
        this.yandex.clear();
        this.loadAd.clear();
        this.crashlytics.clear();
        this.amazon.clear();
        this.purchase.clear();
        this.billing.clear();
        this.mopub.clear();
        this.admob.clear();
        this.isPro.clear();
        this.subs.clear();
        this.firebase.clear();
        this.smaato.clear();
        this.remoteconfig.clear();
        this.metrica.clear();
        this.startapp.clear();
        this.adcel.clear();
        this.ads.clear();
        this.subscription.clear();
        this.tapsense.clear();
        this.Signature.clear();
        this.license.clear();
        this.pro.clear();
        this.ad.clear();
        this.advert.clear();
    }

    public final String toString() {
        return "CatalogDataHolder(audios=" + this.yandex + ", playlists=" + this.loadAd + ", videos=" + this.crashlytics + ", artist_videos=" + this.amazon + ", links=" + this.purchase + ", suggestions=" + this.billing + ", artists=" + this.mopub + ", profiles=" + this.admob + ", catalog_banners=" + this.subs + ", curators=" + this.isPro + ", texts=" + this.firebase + ", podcast_episodes=" + this.smaato + ", podcast_slider_items=" + this.remoteconfig + ", podcasts=" + this.vip + ", longreads=" + this.metrica + ", placeholders=" + this.startapp + ", recommended_playlists=" + this.adcel + ", music_owners=" + this.ads + ", audio_followings_update_infos=" + this.subscription + ", radio_stations=" + this.tapsense + ", audio_books=" + this.Signature + ", audio_stream_mixes=" + this.license + ", audio_books_persons=" + this.pro + ", audio_content_cards=" + this.ad + ", concerts=" + this.advert + ')';
    }

    public final void yandex(Catalog2Response catalog2Response) {
        LinkedHashMap linkedHashMap;
        this.yandex.putAll(AbstractC12854l.yandex(catalog2Response.isPro));
        this.loadAd.putAll(AbstractC12854l.yandex(catalog2Response.firebase));
        this.crashlytics.putAll(AbstractC12854l.yandex(catalog2Response.admob));
        this.amazon.putAll(AbstractC12854l.yandex(catalog2Response.mopub));
        this.purchase.putAll(AbstractC12854l.yandex(catalog2Response.subs));
        this.billing.putAll(AbstractC12854l.yandex(catalog2Response.remoteconfig));
        this.mopub.putAll(AbstractC12854l.yandex(catalog2Response.smaato));
        this.admob.putAll(catalog2Response.yandex());
        List list = catalog2Response.metrica;
        if (list != null) {
            int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(list, 10));
            if (iFirebase < 16) {
                iFirebase = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iFirebase);
            for (Object obj : list) {
                linkedHashMap2.put(String.valueOf(((VKProfile) obj).yandex), obj);
            }
            linkedHashMap = new LinkedHashMap(linkedHashMap2);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        this.isPro.putAll(linkedHashMap);
        this.subs.putAll(AbstractC12854l.yandex(AbstractC12854l.loadAd(catalog2Response.vip)));
        this.firebase.putAll(AbstractC12854l.yandex(catalog2Response.startapp));
        this.smaato.putAll(AbstractC12854l.yandex(catalog2Response.adcel));
        this.remoteconfig.putAll(AbstractC12854l.yandex(catalog2Response.ads));
        this.vip.putAll(AbstractC12854l.yandex(catalog2Response.ad));
        this.metrica.putAll(AbstractC12854l.yandex(catalog2Response.subscription));
        this.startapp.putAll(AbstractC12854l.yandex(catalog2Response.tapsense));
        this.adcel.putAll(AbstractC12854l.yandex(catalog2Response.Signature));
        this.ads.putAll(AbstractC12854l.yandex(catalog2Response.license));
        this.subscription.putAll(AbstractC12854l.yandex(catalog2Response.pro));
        this.tapsense.putAll(AbstractC12854l.yandex(catalog2Response.advert));
        this.Signature.putAll(AbstractC12854l.yandex(catalog2Response.isVip));
        this.license.putAll(AbstractC12854l.yandex(catalog2Response.signatures));
        this.pro.putAll(AbstractC12854l.yandex(catalog2Response.premium));
        this.ad.putAll(AbstractC12854l.yandex(catalog2Response.applovin));
        this.advert.putAll(AbstractC12854l.yandex(catalog2Response.appmetrica));
    }
}
