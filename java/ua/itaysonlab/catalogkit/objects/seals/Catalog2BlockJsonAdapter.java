package ua.itaysonlab.catalogkit.objects.seals;

import defpackage.AbstractC7188l;
import defpackage.C0396l;
import defpackage.C11307l;
import defpackage.C12952l;
import defpackage.C16394l;
import defpackage.C3631l;
import defpackage.C5746l;
import defpackage.C8339l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class Catalog2BlockJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l yandex;

    public Catalog2BlockJsonAdapter(C12952l c12952l) {
        List list = Collections.EMPTY_LIST;
        if (list.contains("action")) {
            C8339l.metrica("Labels must be unique.");
            throw null;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add("action");
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.add(Catalog2Block.ActionsBlock.class);
        this.yandex = new C16394l(Catalog2Block.class, "data_type", arrayList, arrayList2, null).crashlytics(Catalog2Block.ArtistBannerBlock.class, "artist").crashlytics(Catalog2Block.ArtistVideosBlock.class, "artist_videos").crashlytics(Catalog2Block.AudioBooksBlock.class, "audio_books").crashlytics(Catalog2Block.AudioBooksPersonsBlock.class, "audio_books_persons").crashlytics(Catalog2Block.AudioContentCardsBlock.class, "audio_content_cards").crashlytics(Catalog2Block.AudioFollowingsUpdateInfoBlock.class, "audio_followings_update_info").crashlytics(Catalog2Block.AudioStreamMixesBlock.class, "audio_stream_mixes").crashlytics(Catalog2Block.CatalogBannersBlock.class, "catalog_banners").crashlytics(Catalog2Block.ConcertsBlock.class, "concerts").crashlytics(Catalog2Block.CuratorBannerBlock.class, "curator").crashlytics(Catalog2Block.CuratorGroupBlock.class, "groups").crashlytics(Catalog2Block.EmptyBlock.class, "empty").crashlytics(Catalog2Block.LinksBlock.class, "links").crashlytics(Catalog2Block.LongreadsBlock.class, "longreads").crashlytics(Catalog2Block.MusicAudiosBlock.class, "music_audios").crashlytics(Catalog2Block.MusicOwnersBlock.class, "music_owners").crashlytics(Catalog2Block.MusicPlaylistsBlock.class, "music_playlists").crashlytics(Catalog2Block.NoDataBlock.class, "none").crashlytics(Catalog2Block.PlaceholdersBlock.class, "placeholder").crashlytics(Catalog2Block.PodcastEpisodesBlock.class, "podcast_episodes").crashlytics(Catalog2Block.PodcastSliderItemsBlock.class, "podcast_slider_items").crashlytics(Catalog2Block.PodcastsBlock.class, "podcasts").crashlytics(Catalog2Block.RadioStationsBlock.class, "radiostations").crashlytics(Catalog2Block.RecommendedPlaylistsBlock.class, "music_recommended_playlists").crashlytics(Catalog2Block.SearchSuggestionsBlock.class, "search_suggestions").crashlytics(Catalog2Block.TextsBlock.class, "texts").crashlytics(Catalog2Block.VideosBlock.class, "videos").loadAd(C11307l.yandex).yandex(Catalog2Block.class, C5746l.f12138l, c12952l);
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        this.yandex.billing(c3631l, obj);
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) {
        return this.yandex.loadAd(c0396l);
    }

    public final String toString() {
        return "GeneratedSealedJsonAdapter(Catalog2Block)";
    }
}
