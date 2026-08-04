package ua.itaysonlab.vkapi2.objects.podcasts;

import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lua/itaysonlab/vkapi2/objects/podcasts/PodcastCatalogSliderItem;", "Llُّؔ;", "EpisodeItem", "RandomButtonItem", "Lua/itaysonlab/vkapi2/objects/podcasts/PodcastCatalogSliderItem$EpisodeItem;", "Lua/itaysonlab/vkapi2/objects/podcasts/PodcastCatalogSliderItem$RandomButtonItem;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public abstract class PodcastCatalogSliderItem implements InterfaceC12360l {

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/podcasts/PodcastCatalogSliderItem$EpisodeItem;", "Lua/itaysonlab/vkapi2/objects/podcasts/PodcastCatalogSliderItem;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final class EpisodeItem extends PodcastCatalogSliderItem {
        public final AudioTrack loadAd;
        public final String yandex;

        public EpisodeItem(String str, AudioTrack audioTrack) {
            this.yandex = str;
            this.loadAd = audioTrack;
        }

        @Override // ua.itaysonlab.vkapi2.objects.podcasts.PodcastCatalogSliderItem
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/podcasts/PodcastCatalogSliderItem$RandomButtonItem;", "Lua/itaysonlab/vkapi2/objects/podcasts/PodcastCatalogSliderItem;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final class RandomButtonItem extends PodcastCatalogSliderItem {
        public final String yandex;

        public RandomButtonItem(String str) {
            this.yandex = str;
        }

        @Override // ua.itaysonlab.vkapi2.objects.podcasts.PodcastCatalogSliderItem
        /* JADX INFO: renamed from: yandex, reason: from getter */
        public final String getYandex() {
            return this.yandex;
        }
    }

    @Override // defpackage.InterfaceC12360l
    /* JADX INFO: renamed from: getItemId */
    public final String getYandex() {
        return getYandex();
    }

    /* JADX INFO: renamed from: yandex */
    public abstract String getYandex();
}
