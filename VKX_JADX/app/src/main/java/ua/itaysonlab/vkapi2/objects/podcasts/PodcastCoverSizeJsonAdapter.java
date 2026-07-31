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
public final class PodcastCoverSizeJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("height", "type", "src", "url", "width");

    public PodcastCoverSizeJsonAdapter(C12952l c12952l) {
        Class cls = Integer.TYPE;
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(cls, c5746l, "height");
        this.crashlytics = c12952l.loadAd(String.class, c5746l, "type");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        PodcastCoverSize podcastCoverSize = (PodcastCoverSize) obj;
        c3631l.mopub();
        c3631l.isVip("height");
        int i = podcastCoverSize.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        AbstractC12589l.inmobi(i, abstractC7188l, c3631l, "type");
        String str = podcastCoverSize.loadAd;
        AbstractC7188l abstractC7188l2 = this.crashlytics;
        abstractC7188l2.billing(c3631l, str);
        c3631l.isVip("src");
        abstractC7188l2.billing(c3631l, podcastCoverSize.crashlytics);
        c3631l.isVip("url");
        abstractC7188l2.billing(c3631l, podcastCoverSize.amazon);
        c3631l.isVip("width");
        abstractC7188l.billing(c3631l, Integer.valueOf(podcastCoverSize.purchase));
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setIsVip = C5746l.f12138l;
        int iIntValue = 0;
        int iIntValue2 = 0;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        int i = -1;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l != -1) {
                AbstractC7188l abstractC7188l = this.loadAd;
                if (iM503l != 0) {
                    AbstractC7188l abstractC7188l2 = this.crashlytics;
                    if (iM503l == 1) {
                        Object objLoadAd = abstractC7188l2.loadAd(c0396l);
                        if (objLoadAd == null) {
                            setIsVip = AbstractC2812l.isVip("type", "type", c0396l, setIsVip);
                        } else {
                            obj = objLoadAd;
                        }
                        i &= -3;
                    } else if (iM503l == 2) {
                        Object objLoadAd2 = abstractC7188l2.loadAd(c0396l);
                        if (objLoadAd2 == null) {
                            setIsVip = AbstractC2812l.isVip("src", "src", c0396l, setIsVip);
                        } else {
                            obj2 = objLoadAd2;
                        }
                        i &= -5;
                    } else if (iM503l == 3) {
                        Object objLoadAd3 = abstractC7188l2.loadAd(c0396l);
                        if (objLoadAd3 == null) {
                            setIsVip = AbstractC2812l.isVip("url", "url", c0396l, setIsVip);
                        } else {
                            obj3 = objLoadAd3;
                        }
                        i &= -9;
                    } else if (iM503l == 4) {
                        Object objLoadAd4 = abstractC7188l.loadAd(c0396l);
                        if (objLoadAd4 == null) {
                            setIsVip = AbstractC2812l.isVip("width", "width", c0396l, setIsVip);
                        } else {
                            iIntValue2 = ((Number) objLoadAd4).intValue();
                        }
                        i &= -17;
                    }
                } else {
                    Object objLoadAd5 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd5 == null) {
                        setIsVip = AbstractC2812l.isVip("height", "height", c0396l, setIsVip);
                    } else {
                        iIntValue = ((Number) objLoadAd5).intValue();
                    }
                    i &= -2;
                }
            } else {
                c0396l.m502l();
                c0396l.m501l();
            }
        }
        c0396l.ads();
        if (setIsVip.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setIsVip, "\n", null, null, null, 62));
            return null;
        }
        Object obj4 = obj;
        if (i == -32) {
            return new PodcastCoverSize(iIntValue, iIntValue2, (String) obj4, (String) obj2, (String) obj3);
        }
        return new PodcastCoverSize((i & 1) != 0 ? 0 : iIntValue, (i & 16) != 0 ? 0 : iIntValue2, (i & 2) != 0 ? "" : (String) obj4, (i & 4) != 0 ? "" : (String) obj2, (i & 8) != 0 ? "" : (String) obj3);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(PodcastCoverSize)";
    }
}
