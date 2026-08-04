package ua.itaysonlab.vkapi2.objects.podcasts;

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

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class PodcastJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("podcast_title", "owner_id", "id", "playlist_id", "subtitle", "thumbs");

    public PodcastJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "podcast_title");
        this.crashlytics = c12952l.loadAd(Long.TYPE, c5746l, "owner_id");
        this.amazon = c12952l.loadAd(Integer.TYPE, c5746l, "id");
        this.purchase = c12952l.loadAd(AbstractC15639l.mopub(List.class, PodcastCover.class), c5746l, "thumbs");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        Podcast podcast = (Podcast) obj;
        c3631l.mopub();
        c3631l.isVip("podcast_title");
        String str = podcast.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("owner_id");
        AbstractC12589l.m3427throws(podcast.loadAd, this.crashlytics, c3631l, "id");
        int i = podcast.crashlytics;
        AbstractC7188l abstractC7188l2 = this.amazon;
        AbstractC12589l.inmobi(i, abstractC7188l2, c3631l, "playlist_id");
        AbstractC12589l.inmobi(podcast.amazon, abstractC7188l2, c3631l, "subtitle");
        abstractC7188l.billing(c3631l, podcast.purchase);
        c3631l.isVip("thumbs");
        this.purchase.billing(c3631l, podcast.billing);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        Long l = null;
        boolean z3 = false;
        Integer num = null;
        boolean z4 = false;
        Integer num2 = null;
        boolean z5 = false;
        String str2 = null;
        boolean z6 = false;
        List list = null;
        while (true) {
            z = z;
            z2 = z2;
            String str3 = str;
            Long l2 = l;
            if (!c0396l.m504package()) {
                boolean z7 = z3;
                Integer num3 = num;
                c0396l.ads();
                if ((!z) & (str3 == null)) {
                    setLicense = AbstractC2812l.license("podcast_title", "podcast_title", c0396l, setLicense);
                }
                if ((!z2) & (l2 == null)) {
                    setLicense = AbstractC2812l.license("owner_id", "owner_id", c0396l, setLicense);
                }
                if ((!z7) & (num3 == null)) {
                    setLicense = AbstractC2812l.license("id", "id", c0396l, setLicense);
                }
                if ((!z4) & (num2 == null)) {
                    setLicense = AbstractC2812l.license("playlist_id", "playlist_id", c0396l, setLicense);
                }
                if ((!z5) & (str2 == null)) {
                    setLicense = AbstractC2812l.license("subtitle", "subtitle", c0396l, setLicense);
                }
                if ((!z6) & (list == null)) {
                    setLicense = AbstractC2812l.license("thumbs", "thumbs", c0396l, setLicense);
                }
                if (setLicense.size() == 0) {
                    return new Podcast(str3, l2.longValue(), num3.intValue(), num2.intValue(), str2, list);
                }
                C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
                return null;
            }
            z3 = z3;
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.amazon;
            Integer num4 = num;
            AbstractC7188l abstractC7188l2 = this.loadAd;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    str = str3;
                    l = l2;
                    num = num4;
                    break;
                case 0:
                    Object objLoadAd = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd == null) {
                        setLicense = AbstractC2812l.isVip("podcast_title", "podcast_title", c0396l, setLicense);
                        z3 = z3;
                        z2 = z2;
                        str = str3;
                        l = l2;
                        z = true;
                    } else {
                        str = (String) objLoadAd;
                        l = l2;
                    }
                    num = num4;
                    break;
                case 1:
                    Object objLoadAd2 = this.crashlytics.loadAd(c0396l);
                    if (objLoadAd2 == null) {
                        setLicense = AbstractC2812l.isVip("owner_id", "owner_id", c0396l, setLicense);
                        z3 = z3;
                        z = z;
                        str = str3;
                        l = l2;
                        z2 = true;
                    } else {
                        l = (Long) objLoadAd2;
                        z3 = z3;
                        z = z;
                        z2 = z2;
                        str = str3;
                    }
                    num = num4;
                    break;
                case 2:
                    Object objLoadAd3 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd3 != null) {
                        num = (Integer) objLoadAd3;
                        z3 = z3;
                        z = z;
                        z2 = z2;
                        str = str3;
                        l = l2;
                    } else {
                        setLicense = AbstractC2812l.isVip("id", "id", c0396l, setLicense);
                        z = z;
                        z2 = z2;
                        str = str3;
                        l = l2;
                        z3 = true;
                        num = num4;
                    }
                    break;
                case 3:
                    Object objLoadAd4 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setLicense = AbstractC2812l.isVip("playlist_id", "playlist_id", c0396l, setLicense);
                        z3 = z3;
                        z = z;
                        z2 = z2;
                        str = str3;
                        l = l2;
                        z4 = true;
                    } else {
                        num2 = (Integer) objLoadAd4;
                        str = str3;
                        l = l2;
                    }
                    num = num4;
                    break;
                case 4:
                    Object objLoadAd5 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd5 == null) {
                        setLicense = AbstractC2812l.isVip("subtitle", "subtitle", c0396l, setLicense);
                        z3 = z3;
                        z = z;
                        z2 = z2;
                        str = str3;
                        l = l2;
                        z5 = true;
                    } else {
                        str2 = (String) objLoadAd5;
                        str = str3;
                        l = l2;
                    }
                    num = num4;
                    break;
                case 5:
                    Object objLoadAd6 = this.purchase.loadAd(c0396l);
                    if (objLoadAd6 == null) {
                        setLicense = AbstractC2812l.isVip("thumbs", "thumbs", c0396l, setLicense);
                        z3 = z3;
                        z = z;
                        z2 = z2;
                        str = str3;
                        l = l2;
                        z6 = true;
                    } else {
                        list = (List) objLoadAd6;
                        str = str3;
                        l = l2;
                    }
                    num = num4;
                    break;
                default:
                    str = str3;
                    l = l2;
                    num = num4;
                    break;
            }
        }
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Podcast)";
    }
}
