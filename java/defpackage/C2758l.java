package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.subs;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkapi2.objects.music.ArtistInfo;

/* JADX INFO: renamed from: lِٜؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2758l implements InterfaceC10654l {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C2758l(int i) {
        this.yandex = i;
    }

    @Override // defpackage.InterfaceC10654l
    public final subs yandex(AbstractC9694l abstractC9694l, Catalog2Block catalog2Block, Catalog2Layout catalog2Layout, C9554l c9554l) {
        ArtistInfo artistInfo;
        int i = this.yandex;
        List list = C2580l.f5619l;
        int i2 = 2;
        List list2 = null;
        switch (i) {
            case 0:
                return C9838l.yandex(abstractC9694l, catalog2Block, catalog2Layout, c9554l);
            case 1:
                return C9838l.yandex(abstractC9694l, catalog2Block, catalog2Layout, c9554l);
            case 2:
                return C9838l.yandex(abstractC9694l, catalog2Block, catalog2Layout, c9554l);
            case 3:
                return C9838l.yandex(abstractC9694l, catalog2Block, catalog2Layout, c9554l);
            case 4:
                return C9838l.yandex(abstractC9694l, catalog2Block, catalog2Layout, c9554l);
            case 5:
                return C9838l.yandex(abstractC9694l, catalog2Block, catalog2Layout, c9554l);
            case 6:
                return C9838l.yandex(abstractC9694l, catalog2Block, catalog2Layout, c9554l);
            case 7:
                return C9838l.yandex(abstractC9694l, catalog2Block, catalog2Layout, c9554l);
            case 8:
                return C9838l.yandex(abstractC9694l, catalog2Block, catalog2Layout, c9554l);
            case 9:
                return C9838l.yandex(abstractC9694l, catalog2Block, catalog2Layout, c9554l);
            case 10:
                return C9838l.yandex(abstractC9694l, catalog2Block, catalog2Layout, c9554l);
            case 11:
                return C9838l.yandex(abstractC9694l, catalog2Block, catalog2Layout, c9554l);
            case 12:
                return C9838l.yandex(abstractC9694l, catalog2Block, catalog2Layout, c9554l);
            case 13:
                return C9838l.yandex(abstractC9694l, catalog2Block, catalog2Layout, c9554l);
            case 14:
                return C9838l.yandex(abstractC9694l, catalog2Block, catalog2Layout, c9554l);
            case 15:
                return C9838l.yandex(abstractC9694l, catalog2Block, catalog2Layout, c9554l);
            case 16:
                return C9838l.yandex(abstractC9694l, catalog2Block, catalog2Layout, c9554l);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return C9838l.yandex(abstractC9694l, catalog2Block, catalog2Layout, c9554l);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return C9838l.yandex(abstractC9694l, catalog2Block, catalog2Layout, c9554l);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return C9838l.yandex(abstractC9694l, catalog2Block, catalog2Layout, c9554l);
            case 20:
                return new C4559l(5);
            case 21:
                return new C18294l();
            case 22:
                if (catalog2Block instanceof Catalog2Block.PlaceholdersBlock) {
                    return new C11105l();
                }
                if (catalog2Block instanceof Catalog2Block.CuratorBannerBlock) {
                    List list3 = ((Catalog2Block.CuratorBannerBlock) catalog2Block).crashlytics;
                    if (list3 != null) {
                        list = list3;
                    }
                    return new C13983l(abstractC9694l, list);
                }
                if (catalog2Block instanceof Catalog2Block.CuratorGroupBlock) {
                    return new C4559l(i2);
                }
                if (catalog2Block instanceof Catalog2Block.AudioBooksPersonsBlock) {
                    return new C5983l(0);
                }
                C8339l.smaato("Non-implemented Banner implementation");
                return null;
            case 23:
                if (!(catalog2Block instanceof Catalog2Block.ArtistBannerBlock)) {
                    C8339l.smaato("Non-implemented ArtistHeader implementation");
                    return null;
                }
                Catalog2Block.ArtistBannerBlock artistBannerBlock = (Catalog2Block.ArtistBannerBlock) catalog2Block;
                List list4 = artistBannerBlock.mopub;
                if (list4 != null && (artistInfo = (ArtistInfo) AbstractC16901l.m4217extends(list4)) != null) {
                    list2 = artistInfo.yandex;
                }
                if (list2 == null) {
                    list2 = list;
                }
                List list5 = artistBannerBlock.crashlytics;
                if (list5 != null) {
                    list = list5;
                }
                return new C8452l(new C15578l(-1353890680, true, new C1556l(abstractC9694l, list, list2)));
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C8452l(AbstractC11173l.yandex);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C9916l(abstractC9694l, catalog2Block.getCrashlytics());
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C0006l();
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C2979l(abstractC9694l, ((Catalog2Layout.ExtendedHeader) catalog2Layout).yandex, catalog2Block);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C2170l();
            default:
                return new C8452l(new C15578l(208345345, true, new C17208l(i2, abstractC9694l)));
        }
    }
}
