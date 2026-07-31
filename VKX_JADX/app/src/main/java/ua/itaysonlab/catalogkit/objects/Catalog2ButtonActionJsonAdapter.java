package ua.itaysonlab.catalogkit.objects;

import defpackage.AbstractC18202l;
import defpackage.AbstractC7188l;
import defpackage.AbstractC8020l;
import defpackage.C0146l;
import defpackage.C0333l;
import defpackage.C0396l;
import defpackage.C0691l;
import defpackage.C10226l;
import defpackage.C10329l;
import defpackage.C12952l;
import defpackage.C14402l;
import defpackage.C15069l;
import defpackage.C15196l;
import defpackage.C16394l;
import defpackage.C2173l;
import defpackage.C2393l;
import defpackage.C3631l;
import defpackage.C4435l;
import defpackage.C5459l;
import defpackage.C5746l;
import defpackage.C7125l;
import defpackage.C7375l;
import defpackage.C7704l;
import defpackage.C7808l;
import defpackage.C8339l;
import defpackage.C9588l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class Catalog2ButtonActionJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l yandex;

    public Catalog2ButtonActionJsonAdapter(C12952l c12952l) {
        List list = Collections.EMPTY_LIST;
        if (list.contains("create_playlist")) {
            C8339l.metrica("Labels must be unique.");
            throw null;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add("create_playlist");
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.add(C10329l.class);
        C16394l c16394lLoadAd = new C16394l(Catalog2ButtonAction.class, "type", arrayList, arrayList2, null).crashlytics(C15069l.class, "edit_items").crashlytics(C7808l.class, "enter_edit_mode").crashlytics(C2173l.class, "open_section").crashlytics(Catalog2ButtonAction.OpenUrl.class, "open_url").crashlytics(C9588l.class, "play_audios_from_block").crashlytics(C0146l.class, "play_shuffled_audios_from_block").crashlytics(Catalog2ButtonAction.PlayVkMix.class, "play_vk_mix").crashlytics(C14402l.class, "reorder_items").crashlytics(C0691l.class, "playlists_lists").crashlytics(C0333l.class, "select_sorting").crashlytics(Catalog2ButtonAction.Share.class, "share").crashlytics(C7704l.class, "owner_button").crashlytics(C15196l.class, "switch_section").crashlytics(C5459l.class, "synth_clear_search_history").crashlytics(Catalog2ButtonAction.SynthCustomAction.class, "synth_custom_action").crashlytics(C4435l.class, "toggle_artist_subscription").crashlytics(C2393l.class, "toggle_curator_subscription").crashlytics(C7125l.class, "music_follow_owner").loadAd(C7808l.loadAd);
        C7375l c7375lCrashlytics = c12952l.crashlytics();
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C10329l.class)), new C10226l(C10329l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C15069l.class)), new C10226l(C15069l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C7808l.class)), new C10226l(C7808l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C2173l.class)), new C10226l(C2173l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C9588l.class)), new C10226l(C9588l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C0146l.class)), new C10226l(C0146l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C14402l.class)), new C10226l(C14402l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C0691l.class)), new C10226l(C0691l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C0333l.class)), new C10226l(C0333l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C7704l.class)), new C10226l(C7704l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C15196l.class)), new C10226l(C15196l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C5459l.class)), new C10226l(C5459l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C4435l.class)), new C10226l(C4435l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C2393l.class)), new C10226l(C2393l.yandex));
        c7375lCrashlytics.yandex(AbstractC8020l.subs(AbstractC18202l.yandex(C7125l.class)), new C10226l(C7125l.yandex));
        this.yandex = c16394lLoadAd.yandex(Catalog2ButtonAction.class, C5746l.f12138l, new C12952l(c7375lCrashlytics));
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
        return "GeneratedSealedJsonAdapter(Catalog2ButtonAction)";
    }
}
