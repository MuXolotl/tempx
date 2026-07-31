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
public final class PodcastInfoJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("cover", "plays", "is_favorite", "description", "position");

    public PodcastInfoJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(PodcastCover.class, c5746l, "cover");
        this.crashlytics = c12952l.loadAd(Integer.TYPE, c5746l, "plays");
        this.amazon = c12952l.loadAd(Boolean.class, c5746l, "is_favorite");
        this.purchase = c12952l.loadAd(String.class, c5746l, "description");
        this.billing = c12952l.loadAd(Integer.class, c5746l, "position");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        PodcastInfo podcastInfo = (PodcastInfo) obj;
        c3631l.mopub();
        c3631l.isVip("cover");
        this.loadAd.billing(c3631l, podcastInfo.yandex);
        c3631l.isVip("plays");
        AbstractC12589l.inmobi(podcastInfo.loadAd, this.crashlytics, c3631l, "is_favorite");
        this.amazon.billing(c3631l, podcastInfo.crashlytics);
        c3631l.isVip("description");
        this.purchase.billing(c3631l, podcastInfo.amazon);
        c3631l.isVip("position");
        this.billing.billing(c3631l, podcastInfo.purchase);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        boolean z = false;
        boolean z2 = false;
        PodcastCover podcastCover = null;
        Integer num = null;
        Boolean bool = null;
        String str = null;
        Integer num2 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l == -1) {
                c0396l.m502l();
                c0396l.m501l();
            } else if (iM503l == 0) {
                Object objLoadAd = this.loadAd.loadAd(c0396l);
                if (objLoadAd == null) {
                    setLicense = AbstractC2812l.isVip("cover", "cover", c0396l, setLicense);
                    z = true;
                } else {
                    podcastCover = (PodcastCover) objLoadAd;
                }
            } else if (iM503l == 1) {
                Object objLoadAd2 = this.crashlytics.loadAd(c0396l);
                if (objLoadAd2 == null) {
                    setLicense = AbstractC2812l.isVip("plays", "plays", c0396l, setLicense);
                    z2 = true;
                } else {
                    num = (Integer) objLoadAd2;
                }
            } else if (iM503l == 2) {
                bool = (Boolean) this.amazon.loadAd(c0396l);
            } else if (iM503l == 3) {
                str = (String) this.purchase.loadAd(c0396l);
            } else if (iM503l == 4) {
                num2 = (Integer) this.billing.loadAd(c0396l);
            }
        }
        c0396l.ads();
        if ((!z) & (podcastCover == null)) {
            setLicense = AbstractC2812l.license("cover", "cover", c0396l, setLicense);
        }
        if ((!z2) & (num == null)) {
            setLicense = AbstractC2812l.license("plays", "plays", c0396l, setLicense);
        }
        if (setLicense.size() == 0) {
            return new PodcastInfo(podcastCover, num.intValue(), bool, str, num2);
        }
        C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
        return null;
    }

    public final String toString() {
        return "GeneratedJsonAdapter(PodcastInfo)";
    }
}
