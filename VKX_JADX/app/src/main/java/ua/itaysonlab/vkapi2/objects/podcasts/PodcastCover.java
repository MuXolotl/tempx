package ua.itaysonlab.vkapi2.objects.podcasts;

import defpackage.AbstractC11036l;
import defpackage.AbstractC8576l;
import defpackage.AbstractC9968l;
import defpackage.C10993l;
import defpackage.C3342l;
import defpackage.C6048l;
import defpackage.InterfaceC1220l;
import defpackage.InterfaceC15749l;
import defpackage.InterfaceC8296l;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkapi2/objects/podcasts/PodcastCover;", "", "Companion", "lُّؔ", "lؘۢۛ", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC8296l
@InterfaceC15749l(generateAdapter = true)
public final class PodcastCover {
    public static final C6048l Companion = new C6048l();
    public static final InterfaceC1220l[] loadAd = {AbstractC9968l.crashlytics(2, new C3342l(8))};
    public final List yandex;

    public /* synthetic */ PodcastCover(int i, List list) {
        if (1 == (i & 1)) {
            this.yandex = list;
        } else {
            AbstractC11036l.isPro(i, 1, C10993l.yandex.purchase());
            throw null;
        }
    }

    public final String yandex(String str) {
        String str2;
        Object next;
        Iterator it = this.yandex.iterator();
        do {
            str2 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC8576l.yandex(((PodcastCoverSize) next).loadAd, str));
        PodcastCoverSize podcastCoverSize = (PodcastCoverSize) next;
        if (podcastCoverSize != null) {
            String str3 = podcastCoverSize.crashlytics;
            if (str3.length() == 0) {
                str3 = podcastCoverSize.amazon;
            }
            str2 = str3;
        }
        return str2 == null ? "" : str2;
    }

    public PodcastCover(List list) {
        this.yandex = list;
    }
}
