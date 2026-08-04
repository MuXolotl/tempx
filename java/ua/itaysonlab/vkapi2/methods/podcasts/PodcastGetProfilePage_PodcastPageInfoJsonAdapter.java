package ua.itaysonlab.vkapi2.methods.podcasts;

import defpackage.AbstractC12589l;
import defpackage.AbstractC15639l;
import defpackage.AbstractC16901l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC7188l;
import defpackage.C0396l;
import defpackage.C0458l;
import defpackage.C11467l;
import defpackage.C12952l;
import defpackage.C18262l;
import defpackage.C3631l;
import defpackage.C5746l;
import defpackage.C8413l;
import java.io.EOFException;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCover;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class PodcastGetProfilePage_PodcastPageInfoJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l mopub;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("category", "friends_text", "podcast_description", "name", "owner_id", "podcast_cover", "can_subscribe_podcasts", "is_subscribed_podcasts", "can_subscribe", "friends", "trailer", "url");

    public PodcastGetProfilePage_PodcastPageInfoJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "category");
        this.crashlytics = c12952l.loadAd(Long.TYPE, c5746l, "owner_id");
        this.amazon = c12952l.loadAd(PodcastCover.class, c5746l, "podcast_cover");
        this.purchase = c12952l.loadAd(Boolean.TYPE, c5746l, "can_subscribe_podcasts");
        this.billing = c12952l.loadAd(AbstractC15639l.mopub(List.class, VKProfile.class), c5746l, "friends");
        this.mopub = c12952l.loadAd(AudioTrack.class, c5746l, "trailer");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        PodcastGetProfilePage$PodcastPageInfo podcastGetProfilePage$PodcastPageInfo = (PodcastGetProfilePage$PodcastPageInfo) obj;
        c3631l.mopub();
        c3631l.isVip("category");
        String str = podcastGetProfilePage$PodcastPageInfo.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("friends_text");
        abstractC7188l.billing(c3631l, podcastGetProfilePage$PodcastPageInfo.loadAd);
        c3631l.isVip("podcast_description");
        abstractC7188l.billing(c3631l, podcastGetProfilePage$PodcastPageInfo.crashlytics);
        c3631l.isVip("name");
        abstractC7188l.billing(c3631l, podcastGetProfilePage$PodcastPageInfo.amazon);
        c3631l.isVip("owner_id");
        AbstractC12589l.m3427throws(podcastGetProfilePage$PodcastPageInfo.purchase, this.crashlytics, c3631l, "podcast_cover");
        this.amazon.billing(c3631l, podcastGetProfilePage$PodcastPageInfo.billing);
        c3631l.isVip("can_subscribe_podcasts");
        boolean z = podcastGetProfilePage$PodcastPageInfo.mopub;
        AbstractC7188l abstractC7188l2 = this.purchase;
        AbstractC12589l.m3428volatile(z, abstractC7188l2, c3631l, "is_subscribed_podcasts");
        AbstractC12589l.m3428volatile(podcastGetProfilePage$PodcastPageInfo.admob, abstractC7188l2, c3631l, "can_subscribe");
        AbstractC12589l.m3428volatile(podcastGetProfilePage$PodcastPageInfo.subs, abstractC7188l2, c3631l, "friends");
        this.billing.billing(c3631l, podcastGetProfilePage$PodcastPageInfo.isPro);
        c3631l.isVip("trailer");
        this.mopub.billing(c3631l, podcastGetProfilePage$PodcastPageInfo.firebase);
        c3631l.isVip("url");
        abstractC7188l.billing(c3631l, podcastGetProfilePage$PodcastPageInfo.smaato);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setIsVip = C5746l.f12138l;
        int i = -1;
        long jLongValue = 0;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        boolean zBooleanValue3 = false;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object objLoadAd = null;
        Object obj7 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.purchase;
            Object obj8 = obj;
            AbstractC7188l abstractC7188l2 = this.loadAd;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    break;
                case 0:
                    Object objLoadAd2 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd2 == null) {
                        setIsVip = AbstractC2812l.isVip("category", "category", c0396l, setIsVip);
                        obj = obj8;
                    } else {
                        obj = objLoadAd2;
                    }
                    i &= -2;
                    continue;
                case 1:
                    Object objLoadAd3 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd3 == null) {
                        setIsVip = AbstractC2812l.isVip("friends_text", "friends_text", c0396l, setIsVip);
                    } else {
                        obj2 = objLoadAd3;
                    }
                    i &= -3;
                    break;
                case 2:
                    Object objLoadAd4 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setIsVip = AbstractC2812l.isVip("podcast_description", "podcast_description", c0396l, setIsVip);
                    } else {
                        obj3 = objLoadAd4;
                    }
                    i &= -5;
                    break;
                case 3:
                    Object objLoadAd5 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd5 == null) {
                        setIsVip = AbstractC2812l.isVip("name", "name", c0396l, setIsVip);
                    } else {
                        obj4 = objLoadAd5;
                    }
                    i &= -9;
                    break;
                case 4:
                    Object objLoadAd6 = this.crashlytics.loadAd(c0396l);
                    if (objLoadAd6 == null) {
                        setIsVip = AbstractC2812l.isVip("owner_id", "owner_id", c0396l, setIsVip);
                    } else {
                        jLongValue = ((Number) objLoadAd6).longValue();
                    }
                    i &= -17;
                    break;
                case 5:
                    Object objLoadAd7 = this.amazon.loadAd(c0396l);
                    if (objLoadAd7 == null) {
                        setIsVip = AbstractC2812l.isVip("podcast_cover", "podcast_cover", c0396l, setIsVip);
                    } else {
                        obj5 = objLoadAd7;
                    }
                    i &= -33;
                    break;
                case 6:
                    Object objLoadAd8 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd8 == null) {
                        setIsVip = AbstractC2812l.isVip("can_subscribe_podcasts", "can_subscribe_podcasts", c0396l, setIsVip);
                    } else {
                        zBooleanValue = ((Boolean) objLoadAd8).booleanValue();
                    }
                    i &= -65;
                    break;
                case 7:
                    Object objLoadAd9 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd9 == null) {
                        setIsVip = AbstractC2812l.isVip("is_subscribed_podcasts", "is_subscribed_podcasts", c0396l, setIsVip);
                    } else {
                        zBooleanValue2 = ((Boolean) objLoadAd9).booleanValue();
                    }
                    i &= -129;
                    break;
                case 8:
                    Object objLoadAd10 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd10 == null) {
                        setIsVip = AbstractC2812l.isVip("can_subscribe", "can_subscribe", c0396l, setIsVip);
                    } else {
                        zBooleanValue3 = ((Boolean) objLoadAd10).booleanValue();
                    }
                    i &= -257;
                    break;
                case 9:
                    Object objLoadAd11 = this.billing.loadAd(c0396l);
                    if (objLoadAd11 == null) {
                        setIsVip = AbstractC2812l.isVip("friends", "friends", c0396l, setIsVip);
                    } else {
                        obj6 = objLoadAd11;
                    }
                    i &= -513;
                    break;
                case 10:
                    objLoadAd = this.mopub.loadAd(c0396l);
                    i &= -1025;
                    break;
                case 11:
                    Object objLoadAd12 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd12 == null) {
                        setIsVip = AbstractC2812l.isVip("url", "url", c0396l, setIsVip);
                    } else {
                        obj7 = objLoadAd12;
                    }
                    i &= -2049;
                    break;
            }
            obj = obj8;
        }
        Object obj9 = obj;
        c0396l.ads();
        if (setIsVip.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setIsVip, "\n", null, null, null, 62));
            return null;
        }
        Object obj10 = obj4;
        if (i == -4096) {
            return new PodcastGetProfilePage$PodcastPageInfo((String) obj9, (String) obj2, (String) obj3, (String) obj10, jLongValue, (PodcastCover) obj5, zBooleanValue, zBooleanValue2, zBooleanValue3, (List) obj6, (AudioTrack) objLoadAd, (String) obj7);
        }
        return new PodcastGetProfilePage$PodcastPageInfo((String) obj9, (String) obj2, (String) obj3, (String) obj10, jLongValue, (PodcastCover) obj5, zBooleanValue, zBooleanValue2, zBooleanValue3, (List) obj6, (AudioTrack) objLoadAd, (String) obj7, i);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(PodcastGetProfilePage.PodcastPageInfo)";
    }
}
