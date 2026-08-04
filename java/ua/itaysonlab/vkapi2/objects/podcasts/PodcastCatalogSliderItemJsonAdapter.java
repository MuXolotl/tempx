package ua.itaysonlab.vkapi2.objects.podcasts;

import defpackage.AbstractC7188l;
import defpackage.C0396l;
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
public final class PodcastCatalogSliderItemJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l yandex;

    public PodcastCatalogSliderItemJsonAdapter(C12952l c12952l) {
        List list = Collections.EMPTY_LIST;
        if (list.contains("episode")) {
            C8339l.metrica("Labels must be unique.");
            throw null;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add("episode");
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.add(PodcastCatalogSliderItem.EpisodeItem.class);
        this.yandex = new C16394l(PodcastCatalogSliderItem.class, "slider_type", arrayList, arrayList2, null).crashlytics(PodcastCatalogSliderItem.RandomButtonItem.class, "random_button").yandex(PodcastCatalogSliderItem.class, C5746l.f12138l, c12952l);
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
        return "GeneratedSealedJsonAdapter(PodcastCatalogSliderItem)";
    }
}
