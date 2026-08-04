package ua.itaysonlab.vkapi2.objects.podcasts;

import defpackage.AbstractC12589l;
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
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class PodcastCatalogLongreadJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("id", "owner_id", "owner_name", "photo", "published_date", "subtitle", "title", "url", "view_url", "views", "shares");

    public PodcastCatalogLongreadJsonAdapter(C12952l c12952l) {
        Class cls = Integer.TYPE;
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(cls, c5746l, "id");
        this.crashlytics = c12952l.loadAd(Long.TYPE, c5746l, "owner_id");
        this.amazon = c12952l.loadAd(String.class, c5746l, "owner_name");
        this.purchase = c12952l.loadAd(PodcastCover.class, c5746l, "photo");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        PodcastCatalogLongread podcastCatalogLongread = (PodcastCatalogLongread) obj;
        c3631l.mopub();
        c3631l.isVip("id");
        int i = podcastCatalogLongread.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        AbstractC12589l.inmobi(i, abstractC7188l, c3631l, "owner_id");
        AbstractC12589l.m3427throws(podcastCatalogLongread.loadAd, this.crashlytics, c3631l, "owner_name");
        String str = podcastCatalogLongread.crashlytics;
        AbstractC7188l abstractC7188l2 = this.amazon;
        abstractC7188l2.billing(c3631l, str);
        c3631l.isVip("photo");
        this.purchase.billing(c3631l, podcastCatalogLongread.amazon);
        c3631l.isVip("published_date");
        AbstractC12589l.inmobi(podcastCatalogLongread.purchase, abstractC7188l, c3631l, "subtitle");
        abstractC7188l2.billing(c3631l, podcastCatalogLongread.billing);
        c3631l.isVip("title");
        abstractC7188l2.billing(c3631l, podcastCatalogLongread.mopub);
        c3631l.isVip("url");
        abstractC7188l2.billing(c3631l, podcastCatalogLongread.admob);
        c3631l.isVip("view_url");
        abstractC7188l2.billing(c3631l, podcastCatalogLongread.subs);
        c3631l.isVip("views");
        AbstractC12589l.inmobi(podcastCatalogLongread.isPro, abstractC7188l, c3631l, "shares");
        abstractC7188l.billing(c3631l, Integer.valueOf(podcastCatalogLongread.firebase));
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        boolean z = false;
        Integer num = null;
        boolean z2 = false;
        Long l = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        Integer num2 = null;
        boolean z6 = false;
        String str = null;
        PodcastCover podcastCover = null;
        boolean z7 = false;
        String str2 = null;
        String str3 = null;
        boolean z8 = false;
        String str4 = null;
        boolean z9 = false;
        String str5 = null;
        boolean z10 = false;
        Integer num3 = null;
        boolean z11 = false;
        Integer num4 = null;
        while (true) {
            z = z;
            Integer num5 = num;
            z2 = z2;
            Long l2 = l;
            z3 = z3;
            z4 = z4;
            z5 = z5;
            Integer num6 = num2;
            boolean z12 = z6;
            if (!c0396l.m504package()) {
                String str6 = str;
                PodcastCover podcastCover2 = podcastCover;
                c0396l.ads();
                if ((!z) & (num5 == null)) {
                    setLicense = AbstractC2812l.license("id", "id", c0396l, setLicense);
                }
                if ((!z2) & (l2 == null)) {
                    setLicense = AbstractC2812l.license("owner_id", "owner_id", c0396l, setLicense);
                }
                if ((!z3) & (str6 == null)) {
                    setLicense = AbstractC2812l.license("owner_name", "owner_name", c0396l, setLicense);
                }
                if ((!z4) & (podcastCover2 == null)) {
                    setLicense = AbstractC2812l.license("photo", "photo", c0396l, setLicense);
                }
                if ((!z5) & (num6 == null)) {
                    setLicense = AbstractC2812l.license("published_date", "published_date", c0396l, setLicense);
                }
                if ((!z12) & (str2 == null)) {
                    setLicense = AbstractC2812l.license("subtitle", "subtitle", c0396l, setLicense);
                }
                if ((!z7) & (str3 == null)) {
                    setLicense = AbstractC2812l.license("title", "title", c0396l, setLicense);
                }
                if ((!z8) & (str4 == null)) {
                    setLicense = AbstractC2812l.license("url", "url", c0396l, setLicense);
                }
                if ((!z9) & (str5 == null)) {
                    setLicense = AbstractC2812l.license("view_url", "view_url", c0396l, setLicense);
                }
                if ((!z10) & (num3 == null)) {
                    setLicense = AbstractC2812l.license("views", "views", c0396l, setLicense);
                }
                if ((!z11) & (num4 == null)) {
                    setLicense = AbstractC2812l.license("shares", "shares", c0396l, setLicense);
                }
                if (setLicense.size() == 0) {
                    return new PodcastCatalogLongread(num5.intValue(), l2.longValue(), str6, podcastCover2, num6.intValue(), str2, str3, str4, str5, num3.intValue(), num4.intValue());
                }
                C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
                return null;
            }
            String str7 = str;
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.loadAd;
            PodcastCover podcastCover3 = podcastCover;
            AbstractC7188l abstractC7188l2 = this.amazon;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    str = str7;
                    num = num5;
                    l = l2;
                    num2 = num6;
                    z6 = z12;
                    podcastCover = podcastCover3;
                    break;
                case 0:
                    Object objLoadAd = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd == null) {
                        setLicense = AbstractC2812l.isVip("id", "id", c0396l, setLicense);
                        str = str7;
                        num = num5;
                        z2 = z2;
                        l = l2;
                        z3 = z3;
                        z4 = z4;
                        z5 = z5;
                        num2 = num6;
                        z6 = z12;
                        z = true;
                    } else {
                        num = (Integer) objLoadAd;
                        str = str7;
                        l = l2;
                        num2 = num6;
                        z6 = z12;
                    }
                    podcastCover = podcastCover3;
                    break;
                case 1:
                    Object objLoadAd2 = this.crashlytics.loadAd(c0396l);
                    if (objLoadAd2 == null) {
                        setLicense = AbstractC2812l.isVip("owner_id", "owner_id", c0396l, setLicense);
                        str = str7;
                        z = z;
                        num = num5;
                        l = l2;
                        z3 = z3;
                        z4 = z4;
                        z5 = z5;
                        num2 = num6;
                        z6 = z12;
                        z2 = true;
                    } else {
                        l = (Long) objLoadAd2;
                        str = str7;
                        z = z;
                        num = num5;
                        num2 = num6;
                        z6 = z12;
                    }
                    podcastCover = podcastCover3;
                    break;
                case 2:
                    Object objLoadAd3 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd3 == null) {
                        setLicense = AbstractC2812l.isVip("owner_name", "owner_name", c0396l, setLicense);
                        str = str7;
                        z = z;
                        num = num5;
                        z2 = z2;
                        l = l2;
                        z4 = z4;
                        z5 = z5;
                        num2 = num6;
                        z6 = z12;
                        z3 = true;
                    } else {
                        str = (String) objLoadAd3;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        z6 = z12;
                    }
                    podcastCover = podcastCover3;
                    break;
                case 3:
                    Object objLoadAd4 = this.purchase.loadAd(c0396l);
                    if (objLoadAd4 != null) {
                        podcastCover = (PodcastCover) objLoadAd4;
                        str = str7;
                        z = z;
                        num = num5;
                        z2 = z2;
                        l = l2;
                        z3 = z3;
                        z4 = z4;
                        z5 = z5;
                        num2 = num6;
                        z6 = z12;
                    } else {
                        setLicense = AbstractC2812l.isVip("photo", "photo", c0396l, setLicense);
                        str = str7;
                        z = z;
                        num = num5;
                        z2 = z2;
                        l = l2;
                        z3 = z3;
                        z5 = z5;
                        num2 = num6;
                        z6 = z12;
                        z4 = true;
                        podcastCover = podcastCover3;
                    }
                    break;
                case 4:
                    Object objLoadAd5 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd5 == null) {
                        setLicense = AbstractC2812l.isVip("published_date", "published_date", c0396l, setLicense);
                        str = str7;
                        z = z;
                        num = num5;
                        z2 = z2;
                        l = l2;
                        z3 = z3;
                        z4 = z4;
                        num2 = num6;
                        z6 = z12;
                        z5 = true;
                    } else {
                        num2 = (Integer) objLoadAd5;
                        str = str7;
                        z = z;
                        num = num5;
                        z2 = z2;
                        l = l2;
                        z6 = z12;
                    }
                    podcastCover = podcastCover3;
                    break;
                case 5:
                    Object objLoadAd6 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd6 == null) {
                        setLicense = AbstractC2812l.isVip("subtitle", "subtitle", c0396l, setLicense);
                        str = str7;
                        z = z;
                        num = num5;
                        z2 = z2;
                        l = l2;
                        z3 = z3;
                        z4 = z4;
                        z5 = z5;
                        num2 = num6;
                        z6 = true;
                    } else {
                        str2 = (String) objLoadAd6;
                        str = str7;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        z6 = z12;
                    }
                    podcastCover = podcastCover3;
                    break;
                case 6:
                    Object objLoadAd7 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd7 == null) {
                        setLicense = AbstractC2812l.isVip("title", "title", c0396l, setLicense);
                        str = str7;
                        z = z;
                        num = num5;
                        z2 = z2;
                        l = l2;
                        z3 = z3;
                        z4 = z4;
                        z5 = z5;
                        num2 = num6;
                        z6 = z12;
                        z7 = true;
                    } else {
                        str3 = (String) objLoadAd7;
                        str = str7;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        z6 = z12;
                    }
                    podcastCover = podcastCover3;
                    break;
                case 7:
                    Object objLoadAd8 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd8 == null) {
                        setLicense = AbstractC2812l.isVip("url", "url", c0396l, setLicense);
                        str = str7;
                        z = z;
                        num = num5;
                        z2 = z2;
                        l = l2;
                        z3 = z3;
                        z4 = z4;
                        z5 = z5;
                        num2 = num6;
                        z6 = z12;
                        z8 = true;
                    } else {
                        str4 = (String) objLoadAd8;
                        str = str7;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        z6 = z12;
                    }
                    podcastCover = podcastCover3;
                    break;
                case 8:
                    Object objLoadAd9 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd9 == null) {
                        setLicense = AbstractC2812l.isVip("view_url", "view_url", c0396l, setLicense);
                        str = str7;
                        z = z;
                        num = num5;
                        z2 = z2;
                        l = l2;
                        z3 = z3;
                        z4 = z4;
                        z5 = z5;
                        num2 = num6;
                        z6 = z12;
                        z9 = true;
                    } else {
                        str5 = (String) objLoadAd9;
                        str = str7;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        z6 = z12;
                    }
                    podcastCover = podcastCover3;
                    break;
                case 9:
                    Object objLoadAd10 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd10 == null) {
                        setLicense = AbstractC2812l.isVip("views", "views", c0396l, setLicense);
                        str = str7;
                        z = z;
                        num = num5;
                        z2 = z2;
                        l = l2;
                        z3 = z3;
                        z4 = z4;
                        z5 = z5;
                        num2 = num6;
                        z6 = z12;
                        z10 = true;
                    } else {
                        num3 = (Integer) objLoadAd10;
                        str = str7;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        z6 = z12;
                    }
                    podcastCover = podcastCover3;
                    break;
                case 10:
                    Object objLoadAd11 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd11 == null) {
                        setLicense = AbstractC2812l.isVip("shares", "shares", c0396l, setLicense);
                        str = str7;
                        z = z;
                        num = num5;
                        z2 = z2;
                        l = l2;
                        z3 = z3;
                        z4 = z4;
                        z5 = z5;
                        num2 = num6;
                        z6 = z12;
                        z11 = true;
                    } else {
                        num4 = (Integer) objLoadAd11;
                        str = str7;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        z6 = z12;
                    }
                    podcastCover = podcastCover3;
                    break;
                default:
                    str = str7;
                    num = num5;
                    l = l2;
                    num2 = num6;
                    z6 = z12;
                    podcastCover = podcastCover3;
                    break;
            }
        }
    }

    public final String toString() {
        return "GeneratedJsonAdapter(PodcastCatalogLongread)";
    }
}
