package ua.itaysonlab.vkapi2.methods.podcasts;

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
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class PodcastGetProfilePage_PodcastPageJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("info", "popular", "recent");

    public PodcastGetProfilePage_PodcastPageJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(PodcastGetProfilePage$PodcastPageInfo.class, c5746l, "info");
        this.crashlytics = c12952l.loadAd(AbstractC15639l.mopub(VKResponseWithItems.class, AbstractC15639l.mopub(List.class, AudioTrack.class)), c5746l, "popular");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        PodcastGetProfilePage$PodcastPage podcastGetProfilePage$PodcastPage = (PodcastGetProfilePage$PodcastPage) obj;
        c3631l.mopub();
        c3631l.isVip("info");
        this.loadAd.billing(c3631l, podcastGetProfilePage$PodcastPage.yandex);
        c3631l.isVip("popular");
        VKResponseWithItems vKResponseWithItems = podcastGetProfilePage$PodcastPage.loadAd;
        AbstractC7188l abstractC7188l = this.crashlytics;
        abstractC7188l.billing(c3631l, vKResponseWithItems);
        c3631l.isVip("recent");
        abstractC7188l.billing(c3631l, podcastGetProfilePage$PodcastPage.crashlytics);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setIsVip = C5746l.f12138l;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        int i = -1;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l == -1) {
                c0396l.m502l();
                c0396l.m501l();
            } else if (iM503l != 0) {
                AbstractC7188l abstractC7188l = this.crashlytics;
                if (iM503l == 1) {
                    Object objLoadAd = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd == null) {
                        setIsVip = AbstractC2812l.isVip("popular", "popular", c0396l, setIsVip);
                    } else {
                        obj2 = objLoadAd;
                    }
                    i &= -3;
                } else if (iM503l == 2) {
                    Object objLoadAd2 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd2 == null) {
                        setIsVip = AbstractC2812l.isVip("recent", "recent", c0396l, setIsVip);
                    } else {
                        obj3 = objLoadAd2;
                    }
                    i &= -5;
                }
            } else {
                Object objLoadAd3 = this.loadAd.loadAd(c0396l);
                if (objLoadAd3 == null) {
                    setIsVip = AbstractC2812l.isVip("info", "info", c0396l, setIsVip);
                } else {
                    obj = objLoadAd3;
                }
                i &= -2;
            }
        }
        c0396l.ads();
        if (setIsVip.size() == 0) {
            return i == -8 ? new PodcastGetProfilePage$PodcastPage((PodcastGetProfilePage$PodcastPageInfo) obj, (VKResponseWithItems) obj2, (VKResponseWithItems) obj3) : new PodcastGetProfilePage$PodcastPage((PodcastGetProfilePage$PodcastPageInfo) obj, (VKResponseWithItems) obj2, (VKResponseWithItems) obj3, i);
        }
        C11467l.subscription(AbstractC16901l.m4210case(setIsVip, "\n", null, null, null, 62));
        return null;
    }

    public final String toString() {
        return "GeneratedJsonAdapter(PodcastGetProfilePage.PodcastPage)";
    }
}
