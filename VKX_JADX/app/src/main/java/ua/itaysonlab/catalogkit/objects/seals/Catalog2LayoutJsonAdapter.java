package ua.itaysonlab.catalogkit.objects.seals;

import defpackage.AbstractC18202l;
import defpackage.AbstractC7188l;
import defpackage.AbstractC8020l;
import defpackage.C0385l;
import defpackage.C0396l;
import defpackage.C0567l;
import defpackage.C0635l;
import defpackage.C0898l;
import defpackage.C0984l;
import defpackage.C10004l;
import defpackage.C10226l;
import defpackage.C10431l;
import defpackage.C10830l;
import defpackage.C1088l;
import defpackage.C1089l;
import defpackage.C1188l;
import defpackage.C12395l;
import defpackage.C12727l;
import defpackage.C12952l;
import defpackage.C13200l;
import defpackage.C13413l;
import defpackage.C13769l;
import defpackage.C14002l;
import defpackage.C14149l;
import defpackage.C14794l;
import defpackage.C15246l;
import defpackage.C16394l;
import defpackage.C16623l;
import defpackage.C16777l;
import defpackage.C17023l;
import defpackage.C17770l;
import defpackage.C18272l;
import defpackage.C2267l;
import defpackage.C3351l;
import defpackage.C3553l;
import defpackage.C3631l;
import defpackage.C4396l;
import defpackage.C4680l;
import defpackage.C4734l;
import defpackage.C5445l;
import defpackage.C5732l;
import defpackage.C5746l;
import defpackage.C6728l;
import defpackage.C7348l;
import defpackage.C7375l;
import defpackage.C7750l;
import defpackage.C7861l;
import defpackage.C8124l;
import defpackage.C8339l;
import defpackage.C8444l;
import defpackage.C8560l;
import defpackage.C9203l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class Catalog2LayoutJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l yandex;

    public Catalog2LayoutJsonAdapter(C12952l c12952l) {
        List list = Collections.EMPTY_LIST;
        if (list.contains("biography_layout")) {
            C8339l.metrica("Labels must be unique.");
            throw null;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add("biography_layout");
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.add(C18272l.class);
        C16394l c16394lLoadAd = new C16394l(Catalog2Layout.class, "name", arrayList, arrayList2, null).crashlytics(C13413l.class, "artist_header").crashlytics(C12395l.class, "artist_merch_slider").crashlytics(C6728l.class, "artists_slider").crashlytics(C5732l.class, "audio_content_card_extended_slider").crashlytics(Catalog2Layout.AudioStreamMix.class, "audio_stream_mix").crashlytics(C17770l.class, "audio_stream_mix_interactive").crashlytics(C1088l.class, "banner").crashlytics(C7750l.class, "placeholder_big").crashlytics(C16777l.class, "categories_grid").crashlytics(C7861l.class, "categories_list").crashlytics(C4396l.class, "music_chart_large_slider").crashlytics(C8560l.class, "music_chart_triple_stacked_slider").crashlytics(Catalog2Layout.CompactHeader.class, "header_compact").crashlytics(C10004l.class, "compact_list").crashlytics(C13769l.class, "crop_slider").crashlytics(C5445l.class, "double_list").crashlytics(C8124l.class, "double_stacked_list").crashlytics(C3351l.class, "").crashlytics(C10830l.class, "entity_double_grid").crashlytics(Catalog2Layout.ExtendedHeader.class, "header_extended").crashlytics(C4734l.class, "featured_list").crashlytics(C8444l.class, "placeholder").crashlytics(Catalog2Layout.Header.class, "header").crashlytics(Catalog2Layout.HorizontalButtons.class, "horizontal_buttons").crashlytics(C0635l.class, "in_block_separator").crashlytics(Catalog2Layout.LargeHeader.class, "header_large").crashlytics(C4680l.class, "large_list").crashlytics(C0567l.class, "large_slider").crashlytics(C0898l.class, "link_snippet").crashlytics(C1188l.class, "list").crashlytics(C13200l.class, "listened_list").crashlytics(C15246l.class, "music_chart_list").crashlytics(C14794l.class, "music_exclusive_slider").crashlytics(Catalog2Layout.MusicNewsfeedTitle.class, "music_newsfeed_title").crashlytics(Catalog2Layout.OwnerCell.class, "owner_cell").crashlytics(C3553l.class, "playable_item_in_progress").crashlytics(C1089l.class, "podcast_banners_slider").crashlytics(C2267l.class, "podcast_category_genre_buttons").crashlytics(C0984l.class, "podcasts_favorites").crashlytics(C14002l.class, "promo_banners_slider").crashlytics(C14149l.class, "recomms_slider").crashlytics(Catalog2Layout.Separator.class, "separator").crashlytics(C9203l.class, "slider").crashlytics(C17023l.class, "small_list").crashlytics(C16623l.class, "placeholder_small").crashlytics(C12727l.class, "snippets_banner").crashlytics(Catalog2Layout.SubsectionTabs.class, "subsection_tabs").crashlytics(Catalog2Layout.SynthOpenCacheSearch.class, "synth_SynthOpenCacheSearch").crashlytics(C0385l.class, "text").crashlytics(C10431l.class, "triple_stacked_slider").loadAd(C7348l.yandex);
        C7375l c7375lCrashlytics = c12952l.crashlytics();
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C18272l.class)), new C10226l(C18272l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C13413l.class)), new C10226l(C13413l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C12395l.class)), new C10226l(C12395l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C6728l.class)), new C10226l(C6728l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C5732l.class)), new C10226l(C5732l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C17770l.class)), new C10226l(C17770l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C1088l.class)), new C10226l(C1088l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C7750l.class)), new C10226l(C7750l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C16777l.class)), new C10226l(C16777l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C7861l.class)), new C10226l(C7861l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C4396l.class)), new C10226l(C4396l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C8560l.class)), new C10226l(C8560l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C10004l.class)), new C10226l(C10004l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C13769l.class)), new C10226l(C13769l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C5445l.class)), new C10226l(C5445l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C8124l.class)), new C10226l(C8124l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C3351l.class)), new C10226l(C3351l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C10830l.class)), new C10226l(C10830l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C4734l.class)), new C10226l(C4734l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C8444l.class)), new C10226l(C8444l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C0635l.class)), new C10226l(C0635l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C4680l.class)), new C10226l(C4680l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C0567l.class)), new C10226l(C0567l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C0898l.class)), new C10226l(C0898l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C1188l.class)), new C10226l(C1188l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C13200l.class)), new C10226l(C13200l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C15246l.class)), new C10226l(C15246l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C14794l.class)), new C10226l(C14794l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C3553l.class)), new C10226l(C3553l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C1089l.class)), new C10226l(C1089l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C2267l.class)), new C10226l(C2267l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C0984l.class)), new C10226l(C0984l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C14002l.class)), new C10226l(C14002l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C14149l.class)), new C10226l(C14149l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C9203l.class)), new C10226l(C9203l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C17023l.class)), new C10226l(C17023l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C16623l.class)), new C10226l(C16623l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C12727l.class)), new C10226l(C12727l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C0385l.class)), new C10226l(C0385l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C10431l.class)), new C10226l(C10431l.yandex));
        this.yandex = c16394lLoadAd.yandex(Catalog2Layout.class, C5746l.f12138l, new C12952l(c7375lCrashlytics));
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
        return "GeneratedSealedJsonAdapter(Catalog2Layout)";
    }
}
