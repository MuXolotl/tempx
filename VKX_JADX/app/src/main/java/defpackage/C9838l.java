package defpackage;

import androidx.recyclerview.widget.subs;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;

/* JADX INFO: renamed from: lٍۜ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9838l {
    public static boolean amazon(Catalog2Layout catalog2Layout) {
        return (catalog2Layout instanceof C8560l) || (catalog2Layout instanceof C4396l) || (catalog2Layout instanceof C15246l);
    }

    public static AbstractC14630l crashlytics(InterfaceC1982l interfaceC1982l, Catalog2Block catalog2Block, Catalog2Layout catalog2Layout, C9554l c9554l) {
        byte b = 0;
        if (catalog2Block instanceof Catalog2Block.PodcastEpisodesBlock) {
            return new C7625l(amazon(catalog2Layout), false);
        }
        if (catalog2Block instanceof Catalog2Block.PodcastSliderItemsBlock) {
            return new C0258l();
        }
        int i = 4;
        if (catalog2Block instanceof Catalog2Block.LongreadsBlock) {
            return new C4559l(i);
        }
        int i2 = 3;
        int i3 = 1;
        if (catalog2Block instanceof Catalog2Block.LinksBlock) {
            if (AbstractC8576l.yandex(catalog2Layout, C7861l.yandex)) {
                return new C4559l(i3);
            }
            return (AbstractC8576l.yandex(catalog2Layout, C0984l.yandex) || AbstractC8576l.yandex(catalog2Layout, C2267l.yandex) || AbstractC8576l.yandex(catalog2Layout, C5445l.yandex)) ? new C4559l(i2) : new C4559l(7);
        }
        if ((catalog2Block instanceof Catalog2Block.VideosBlock) || (catalog2Block instanceof Catalog2Block.ArtistVideosBlock)) {
            return new C4559l(9);
        }
        if (catalog2Block instanceof Catalog2Block.CatalogBannersBlock) {
            if ((catalog2Layout instanceof C14002l) || (catalog2Layout instanceof C1089l)) {
                return new C13732l();
            }
            return AbstractC8576l.yandex(catalog2Layout, C17023l.yandex) ? new C4559l(6) : new C4559l(b == true ? 1 : 0);
        }
        int i4 = 5;
        Object obj = null;
        if (catalog2Block instanceof Catalog2Block.MusicAudiosBlock) {
            boolean zAmazon = amazon(catalog2Layout);
            Catalog2Block.MusicAudiosBlock musicAudiosBlock = (Catalog2Block.MusicAudiosBlock) catalog2Block;
            List list = musicAudiosBlock.crashlytics;
            if (list != null) {
                for (Object obj2 : list) {
                    if (((Catalog2Button) obj2).yandex instanceof C14402l) {
                        obj = obj2;
                        break;
                    }
                }
                obj = (Catalog2Button) obj;
            }
            return new C14451l(false, zAmazon, obj != null ? 5 : 4, new C7108l(musicAudiosBlock.yandex, interfaceC1982l.smaato()), null, interfaceC1982l, 48);
        }
        if (catalog2Block instanceof Catalog2Block.MusicPlaylistsBlock) {
            i = amazon(catalog2Layout) ? 4 : 3;
            List list2 = ((Catalog2Block.MusicPlaylistsBlock) catalog2Block).crashlytics;
            if (list2 != null) {
                for (Object obj3 : list2) {
                    if (((Catalog2Button) obj3).yandex instanceof C15069l) {
                        obj = obj3;
                        break;
                    }
                }
                obj = (Catalog2Button) obj;
            }
            return new C17022l(i, obj != null, c9554l);
        }
        if (catalog2Block instanceof Catalog2Block.SearchSuggestionsBlock) {
            return new C3815l(interfaceC1982l);
        }
        if (catalog2Block instanceof Catalog2Block.RecommendedPlaylistsBlock) {
            return new C9575l(i3, c9554l);
        }
        if (catalog2Block instanceof Catalog2Block.AudioFollowingsUpdateInfoBlock) {
            return new C4599l(interfaceC1982l, catalog2Block);
        }
        if (catalog2Block instanceof Catalog2Block.PodcastsBlock) {
            return new C5983l(1);
        }
        if (catalog2Block instanceof Catalog2Block.RadioStationsBlock) {
            return new C15624l();
        }
        if (catalog2Block instanceof Catalog2Block.AudioBooksBlock) {
            return catalog2Layout instanceof C3553l ? new C9575l(2, catalog2Block) : new C9086l();
        }
        if (catalog2Block instanceof Catalog2Block.AudioContentCardsBlock) {
            return new C8452l(new C15578l(2139735540, true, new C0541l(c9554l, interfaceC1982l, i4)));
        }
        if (catalog2Block instanceof Catalog2Block.ConcertsBlock) {
            return new C8452l(AbstractC9033l.yandex);
        }
        C8339l.smaato("<list:bind> unknown block");
        return null;
    }

    public static AbstractC14630l loadAd(InterfaceC1982l interfaceC1982l, Catalog2Block catalog2Block, Catalog2Layout catalog2Layout, C9554l c9554l) {
        int i = 1;
        if (catalog2Block instanceof Catalog2Block.PodcastEpisodesBlock) {
            return new C7625l(amazon(catalog2Layout), true);
        }
        if (catalog2Block instanceof Catalog2Block.PodcastSliderItemsBlock) {
            return new C0258l();
        }
        if (catalog2Block instanceof Catalog2Block.LongreadsBlock) {
            return new C4559l(4);
        }
        if (catalog2Block instanceof Catalog2Block.LinksBlock) {
            return catalog2Layout instanceof C10431l ? new C4559l(7) : new C17814l(catalog2Layout instanceof C9203l);
        }
        int i2 = 10;
        if (catalog2Block instanceof Catalog2Block.ArtistVideosBlock) {
            return new C4559l(i2);
        }
        int i3 = 0;
        if (catalog2Block instanceof Catalog2Block.CatalogBannersBlock) {
            return ((catalog2Layout instanceof C14002l) || (catalog2Layout instanceof C1089l)) ? new C13732l() : new C4559l(i3);
        }
        if (catalog2Block instanceof Catalog2Block.MusicAudiosBlock) {
            return new C14451l(true, amazon(catalog2Layout), 4, new C7108l(((Catalog2Block.MusicAudiosBlock) catalog2Block).yandex, interfaceC1982l.smaato()), null, interfaceC1982l, 48);
        }
        if (catalog2Block instanceof Catalog2Block.MusicPlaylistsBlock) {
            if (amazon(catalog2Layout)) {
                i = 5;
            } else if (catalog2Layout instanceof C14149l) {
                i = 6;
            }
            return new C17022l(i, false, c9554l);
        }
        if (catalog2Block instanceof Catalog2Block.SearchSuggestionsBlock) {
            return new C8914l();
        }
        if (catalog2Block instanceof Catalog2Block.VideosBlock) {
            return new C4559l(i2);
        }
        if (catalog2Block instanceof Catalog2Block.RecommendedPlaylistsBlock) {
            return new C9575l(i3, c9554l);
        }
        if (catalog2Block instanceof Catalog2Block.AudioFollowingsUpdateInfoBlock) {
            return new C4599l(interfaceC1982l, catalog2Block);
        }
        if (catalog2Block instanceof Catalog2Block.PodcastsBlock) {
            return new C17809l(catalog2Layout instanceof C14149l);
        }
        if (catalog2Block instanceof Catalog2Block.RadioStationsBlock) {
            return new C3452l();
        }
        if (catalog2Block instanceof Catalog2Block.AudioBooksBlock) {
            return new C12302l();
        }
        if (catalog2Block instanceof Catalog2Block.ConcertsBlock) {
            return new C8452l(AbstractC9033l.loadAd);
        }
        C8339l.smaato("<slider:bind> unknown block");
        return null;
    }

    public static subs yandex(InterfaceC1982l interfaceC1982l, Catalog2Block catalog2Block, Catalog2Layout catalog2Layout, C9554l c9554l) {
        Object c18435l;
        Object c12931l;
        try {
            if ((catalog2Layout instanceof C1188l) || (catalog2Layout instanceof C13200l) || (catalog2Layout instanceof C4680l) || (catalog2Layout instanceof C17023l) || (catalog2Layout instanceof C10004l) || (catalog2Layout instanceof C15246l) || (catalog2Layout instanceof C7861l) || (catalog2Layout instanceof C3553l)) {
                c18435l = crashlytics(interfaceC1982l, catalog2Block, catalog2Layout, c9554l);
            } else {
                if ((catalog2Layout instanceof C0984l) || (catalog2Layout instanceof C2267l) || (catalog2Layout instanceof C5445l)) {
                    interfaceC1982l.purchase();
                    c12931l = new C12931l(crashlytics(interfaceC1982l, catalog2Block, catalog2Layout, c9554l));
                } else {
                    int i = 1;
                    if (catalog2Block instanceof Catalog2Block.ActionsBlock) {
                        c18435l = new C5080l(new C15578l(-1025654049, true, new C14601l(catalog2Block, interfaceC1982l, 23)));
                    } else {
                        if (catalog2Block instanceof Catalog2Block.CatalogBannersBlock) {
                            i = 3;
                        } else if ((catalog2Layout instanceof C8560l) || (catalog2Layout instanceof C10431l)) {
                            i = 2;
                        }
                        c12931l = new C0663l(i, loadAd(interfaceC1982l, catalog2Block, catalog2Layout, c9554l));
                    }
                }
                c18435l = c12931l;
            }
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        Throwable thYandex = C1171l.yandex(c18435l);
        if (thYandex != null) {
            thYandex.printStackTrace();
        }
        if (c18435l instanceof C18435l) {
            c18435l = null;
        }
        subs subsVar = (subs) c18435l;
        return subsVar == null ? new C0006l() : subsVar;
    }
}
