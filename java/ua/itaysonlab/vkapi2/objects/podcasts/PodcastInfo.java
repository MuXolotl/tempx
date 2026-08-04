package ua.itaysonlab.vkapi2.objects.podcasts;

import defpackage.AbstractC11036l;
import defpackage.C0482l;
import defpackage.C11110l;
import defpackage.InterfaceC15749l;
import defpackage.InterfaceC8296l;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkapi2/objects/podcasts/PodcastInfo;", "", "Companion", "lٟؑٞ", "lُ٘ٞ", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC8296l
@InterfaceC15749l(generateAdapter = true)
public final class PodcastInfo {
    public static final C11110l Companion = new C11110l();
    public final String amazon;
    public final transient AlbumThumb billing;
    public final Boolean crashlytics;
    public final int loadAd;
    public final Integer purchase;
    public final PodcastCover yandex;

    public PodcastInfo(int i, PodcastCover podcastCover, int i2, Boolean bool, String str, Integer num, AlbumThumb albumThumb) {
        if (31 != (i & 31)) {
            AbstractC11036l.isPro(i, 31, C0482l.yandex.purchase());
            throw null;
        }
        this.yandex = podcastCover;
        this.loadAd = i2;
        this.crashlytics = bool;
        this.amazon = str;
        this.purchase = num;
        if ((i & 32) == 0) {
            this.billing = new AlbumThumb((String) null, (String) null, podcastCover.yandex("c"), yandex(), loadAd(), 3);
        } else {
            this.billing = albumThumb;
        }
    }

    public final String loadAd() {
        String strYandex = this.yandex.yandex("x");
        return strYandex.length() == 0 ? yandex() : strYandex;
    }

    public final String yandex() {
        PodcastCover podcastCover = this.yandex;
        String strYandex = podcastCover.yandex("a");
        return strYandex.length() == 0 ? podcastCover.yandex("c") : strYandex;
    }

    public PodcastInfo(PodcastCover podcastCover, int i, Boolean bool, String str, Integer num) {
        this.yandex = podcastCover;
        this.loadAd = i;
        this.crashlytics = bool;
        this.amazon = str;
        this.purchase = num;
        this.billing = new AlbumThumb((String) null, (String) null, podcastCover.yandex("c"), yandex(), loadAd(), 3);
    }
}
