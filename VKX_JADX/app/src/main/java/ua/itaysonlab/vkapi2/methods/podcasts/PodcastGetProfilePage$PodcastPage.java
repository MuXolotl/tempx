package ua.itaysonlab.vkapi2.methods.podcasts;

import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ua/itaysonlab/vkapi2/methods/podcasts/PodcastGetProfilePage$PodcastPage", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class PodcastGetProfilePage$PodcastPage {
    public final VKResponseWithItems crashlytics;
    public final VKResponseWithItems loadAd;
    public final PodcastGetProfilePage$PodcastPageInfo yandex;

    public /* synthetic */ PodcastGetProfilePage$PodcastPage(PodcastGetProfilePage$PodcastPageInfo podcastGetProfilePage$PodcastPageInfo, VKResponseWithItems vKResponseWithItems, VKResponseWithItems vKResponseWithItems2, int i) {
        PodcastGetProfilePage$PodcastPageInfo podcastGetProfilePage$PodcastPageInfo2;
        VKResponseWithItems vKResponseWithItems3;
        VKResponseWithItems vKResponseWithItems4;
        if ((i & 1) != 0) {
            podcastGetProfilePage$PodcastPageInfo2 = new PodcastGetProfilePage$PodcastPageInfo(null, null, null, null, 0L, null, false, false, false, null, null, null, 4095);
        } else {
            podcastGetProfilePage$PodcastPageInfo2 = podcastGetProfilePage$PodcastPageInfo;
        }
        if ((i & 2) != 0) {
            vKResponseWithItems3 = new VKResponseWithItems(null, null, null, null, null, 31);
        } else {
            vKResponseWithItems3 = vKResponseWithItems;
        }
        if ((i & 4) != 0) {
            vKResponseWithItems4 = new VKResponseWithItems(null, null, null, null, null, 31);
        } else {
            vKResponseWithItems4 = vKResponseWithItems2;
        }
        this(podcastGetProfilePage$PodcastPageInfo2, vKResponseWithItems3, vKResponseWithItems4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastGetProfilePage$PodcastPage)) {
            return false;
        }
        PodcastGetProfilePage$PodcastPage podcastGetProfilePage$PodcastPage = (PodcastGetProfilePage$PodcastPage) obj;
        return AbstractC8576l.yandex(this.yandex, podcastGetProfilePage$PodcastPage.yandex) && AbstractC8576l.yandex(this.loadAd, podcastGetProfilePage$PodcastPage.loadAd) && AbstractC8576l.yandex(this.crashlytics, podcastGetProfilePage$PodcastPage.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PodcastPage(info=" + this.yandex + ", popular=" + this.loadAd + ", recent=" + this.crashlytics + ')';
    }

    public PodcastGetProfilePage$PodcastPage(PodcastGetProfilePage$PodcastPageInfo podcastGetProfilePage$PodcastPageInfo, VKResponseWithItems vKResponseWithItems, VKResponseWithItems vKResponseWithItems2) {
        this.yandex = podcastGetProfilePage$PodcastPageInfo;
        this.loadAd = vKResponseWithItems;
        this.crashlytics = vKResponseWithItems2;
    }
}
