package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.catalogkit.objects.Catalog2Root;
import ua.itaysonlab.catalogkit.objects.Catalog2Section;
import ua.itaysonlab.catalogkit.objects.Catalog2Text;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkapi2.objects.music.AudioStreamMix;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* JADX INFO: renamed from: lْٓۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13360l {
    public static C10227l yandex(C9554l c9554l, Catalog2Response catalog2Response) {
        List list;
        List list2;
        Catalog2Section catalog2Section;
        Iterator it;
        LinkedHashMap linkedHashMap;
        AlbumThumb albumThumb;
        String strValueOf;
        LinkedHashMap linkedHashMap2 = c9554l.loadAd;
        Catalog2Root catalog2Root = catalog2Response.yandex;
        c9554l.yandex(catalog2Response);
        Catalog2Section catalog2Section2 = catalog2Response.loadAd;
        String str = null;
        if (catalog2Section2 == null || (list = catalog2Section2.amazon) == null) {
            if (catalog2Root == null || (list2 = catalog2Root.loadAd) == null) {
                list = null;
            } else {
                Iterator it2 = list2.iterator();
                do {
                    if (!it2.hasNext()) {
                        C1759l.firebase("Collection contains no element matching the predicate.");
                        return null;
                    }
                    catalog2Section = (Catalog2Section) it2.next();
                } while (!AbstractC8576l.yandex(catalog2Section.yandex, catalog2Root.yandex));
                list = catalog2Section.amazon;
            }
        }
        if (list == null) {
            list = C2580l.f5619l;
        }
        C10227l c10227lAdmob = AbstractC14055l.admob();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Catalog2Block catalog2Block = (Catalog2Block) it3.next();
            Catalog2Layout loadAd = catalog2Block.getLoadAd();
            if ((loadAd instanceof Catalog2Layout.AudioStreamMix) || (loadAd instanceof C17770l)) {
                it = it3;
                linkedHashMap = linkedHashMap2;
                List listPurchase = catalog2Block.purchase();
                LinkedHashMap linkedHashMap3 = c9554l.license;
                ArrayList arrayList = new ArrayList();
                Iterator it4 = listPurchase.iterator();
                while (it4.hasNext()) {
                    AudioStreamMix audioStreamMix = (AudioStreamMix) linkedHashMap3.get((String) it4.next());
                    if (audioStreamMix != null) {
                        arrayList.add(audioStreamMix);
                    }
                }
                c10227lAdmob.add(new C15545l(catalog2Block.getYandex(), new C1639l(AbstractC0509l.purchase(arrayList))));
            } else {
                String str2 = "";
                if ((loadAd instanceof C16777l) || (loadAd instanceof C10830l)) {
                    it = it3;
                    linkedHashMap = linkedHashMap2;
                    List listPurchase2 = catalog2Block.purchase();
                    LinkedHashMap linkedHashMap4 = c9554l.purchase;
                    ArrayList<CustomCatalogBlockItem> arrayList2 = new ArrayList();
                    Iterator it5 = listPurchase2.iterator();
                    while (it5.hasNext()) {
                        CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) linkedHashMap4.get((String) it5.next());
                        if (customCatalogBlockItem != null) {
                            arrayList2.add(customCatalogBlockItem);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
                    for (CustomCatalogBlockItem customCatalogBlockItem2 : arrayList2) {
                        String str3 = customCatalogBlockItem2.admob;
                        List list3 = customCatalogBlockItem2.crashlytics;
                        String strLoadAd = list3 != null ? AbstractC8320l.loadAd(300, list3) : null;
                        if (strLoadAd == null) {
                            strLoadAd = "";
                        }
                        arrayList3.add(new C1916l(str3, new C10731l(strLoadAd, customCatalogBlockItem2.yandex, customCatalogBlockItem2.loadAd, new C6318l(customCatalogBlockItem2.mopub))));
                    }
                    c10227lAdmob.add(new C15545l(catalog2Block.getYandex(), new C13406l(AbstractC0509l.purchase(arrayList3))));
                } else {
                    if (loadAd instanceof C13769l) {
                        if (catalog2Block instanceof Catalog2Block.MusicPlaylistsBlock) {
                            Catalog2Block.MusicPlaylistsBlock musicPlaylistsBlock = (Catalog2Block.MusicPlaylistsBlock) catalog2Block;
                            List listPurchase3 = musicPlaylistsBlock.purchase();
                            ArrayList<AudioPlaylist> arrayList4 = new ArrayList();
                            Iterator it6 = listPurchase3.iterator();
                            while (it6.hasNext()) {
                                AudioPlaylist audioPlaylist = (AudioPlaylist) linkedHashMap2.get((String) it6.next());
                                if (audioPlaylist != null) {
                                    arrayList4.add(audioPlaylist);
                                }
                            }
                            ArrayList arrayList5 = new ArrayList(AbstractC14055l.billing(arrayList4, 10));
                            for (AudioPlaylist audioPlaylist2 : arrayList4) {
                                String strSmaato = AbstractC14770l.smaato(audioPlaylist2);
                                AlbumThumb albumThumb2 = audioPlaylist2.Signature;
                                String str4 = albumThumb2 != null ? albumThumb2.crashlytics : str;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                arrayList5.add(new C1916l(strSmaato, new C12487l(str4, audioPlaylist2.mopub)));
                            }
                            c10227lAdmob.add(new C15545l(musicPlaylistsBlock.yandex, new C11047l(AbstractC0509l.purchase(arrayList5))));
                        }
                    } else if ((loadAd instanceof C8560l) || (loadAd instanceof C10431l)) {
                        it = it3;
                        linkedHashMap = linkedHashMap2;
                        if (catalog2Block instanceof Catalog2Block.MusicAudiosBlock) {
                            Catalog2Block.MusicAudiosBlock musicAudiosBlock = (Catalog2Block.MusicAudiosBlock) catalog2Block;
                            List listPurchase4 = musicAudiosBlock.purchase();
                            LinkedHashMap linkedHashMap5 = c9554l.yandex;
                            ArrayList<AudioTrack> arrayList6 = new ArrayList();
                            Iterator it7 = listPurchase4.iterator();
                            while (it7.hasNext()) {
                                AudioTrack audioTrack = (AudioTrack) linkedHashMap5.get((String) it7.next());
                                if (audioTrack != null) {
                                    arrayList6.add(audioTrack);
                                }
                            }
                            ArrayList arrayList7 = new ArrayList(AbstractC14055l.billing(arrayList6, 10));
                            for (AudioTrack audioTrack2 : arrayList6) {
                                String strBilling = AbstractC16676l.billing(audioTrack2);
                                AudioAlbum audioAlbum = audioTrack2.vip;
                                String str5 = (audioAlbum == null || (albumThumb = audioAlbum.purchase) == null) ? null : albumThumb.yandex;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                arrayList7.add(new C1916l(strBilling, new C17010l(str5, audioTrack2.amazon, audioTrack2.yandex)));
                            }
                            c10227lAdmob.add(new C15545l(musicAudiosBlock.yandex, new C8856l(AbstractC0509l.purchase(arrayList7))));
                        }
                    } else if ((loadAd instanceof C14149l) || (loadAd instanceof C9203l) || (loadAd instanceof C0567l) || (loadAd instanceof C4396l) || (loadAd instanceof C14794l) || (loadAd instanceof C1089l) || (loadAd instanceof C14002l)) {
                        if (catalog2Block instanceof Catalog2Block.MusicPlaylistsBlock) {
                            Catalog2Block.MusicPlaylistsBlock musicPlaylistsBlock2 = (Catalog2Block.MusicPlaylistsBlock) catalog2Block;
                            List listPurchase5 = musicPlaylistsBlock2.purchase();
                            ArrayList arrayList8 = new ArrayList();
                            Iterator it8 = listPurchase5.iterator();
                            while (it8.hasNext()) {
                                AudioPlaylist audioPlaylist3 = (AudioPlaylist) linkedHashMap2.get((String) it8.next());
                                if (audioPlaylist3 != null) {
                                    arrayList8.add(audioPlaylist3);
                                }
                            }
                            ArrayList arrayList9 = new ArrayList(AbstractC14055l.billing(arrayList8, 10));
                            Iterator it9 = arrayList8.iterator();
                            while (it9.hasNext()) {
                                AudioPlaylist audioPlaylist4 = (AudioPlaylist) it9.next();
                                String strSmaato2 = AbstractC14770l.smaato(audioPlaylist4);
                                AlbumThumb albumThumb3 = audioPlaylist4.Signature;
                                String str6 = albumThumb3 != null ? albumThumb3.crashlytics : str;
                                if (str6 == null) {
                                    str6 = str2;
                                }
                                String str7 = audioPlaylist4.mopub;
                                Iterator it10 = it3;
                                if (AbstractC8576l.yandex(loadAd, C14149l.yandex)) {
                                    strValueOf = str2;
                                } else {
                                    MainArtist mainArtistCrashlytics = AbstractC14770l.crashlytics(audioPlaylist4);
                                    if (mainArtistCrashlytics == null || (strValueOf = mainArtistCrashlytics.crashlytics) == null) {
                                        strValueOf = String.valueOf(audioPlaylist4.amazon);
                                    }
                                }
                                String str8 = albumThumb3 != null ? albumThumb3.crashlytics : null;
                                String str9 = str8 == null ? str2 : str8;
                                String str10 = audioPlaylist4.f36620package;
                                if (str10 == null) {
                                    str10 = str2;
                                }
                                String strM3334new = AbstractC12024l.m3334new(str10, "#");
                                if (strM3334new.length() == 0) {
                                    strM3334new = "000000";
                                }
                                int[] iArr = AbstractC15862l.yandex;
                                C11753l c11753l = C11753l.crashlytics;
                                Catalog2Layout catalog2Layout = loadAd;
                                int length = strM3334new.length();
                                Iterator it11 = it9;
                                String str11 = str2;
                                AbstractC15918l.admob(0, length, strM3334new.length());
                                if (!c11753l.loadAd.yandex && length <= 0) {
                                    throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(strM3334new.substring(0, length)));
                                }
                                AbstractC15862l.loadAd(0, length, strM3334new);
                                int iPurchase = AbstractC15862l.purchase(length, strM3334new);
                                arrayList9.add(new C1916l(strSmaato2, new C13966l(str6, str7, strValueOf, new C17043l(iPurchase, audioPlaylist4.crashlytics, audioPlaylist4.amazon, str9, audioPlaylist4.pro, audioPlaylist4.mopub))));
                                it3 = it10;
                                linkedHashMap2 = linkedHashMap2;
                                loadAd = catalog2Layout;
                                it9 = it11;
                                str2 = str11;
                                str = null;
                            }
                            it = it3;
                            linkedHashMap = linkedHashMap2;
                            c10227lAdmob.add(new C15545l(musicPlaylistsBlock2.yandex, new C11047l(AbstractC0509l.purchase(arrayList9))));
                        }
                    } else if (AbstractC8576l.yandex(loadAd, C0635l.yandex) || (loadAd instanceof Catalog2Layout.Separator)) {
                        c10227lAdmob.add(new C15545l(catalog2Block.getYandex(), C17418l.yandex));
                    } else if (loadAd instanceof Catalog2Layout.ExtendedHeader) {
                        String str12 = ((Catalog2Layout.ExtendedHeader) loadAd).yandex;
                        c10227lAdmob.add(new C15545l(catalog2Block.getYandex(), new C9250l(str12 != null ? str12 : "")));
                    } else if (loadAd instanceof Catalog2Layout.Header) {
                        String str13 = ((Catalog2Layout.Header) loadAd).yandex;
                        c10227lAdmob.add(new C15545l(catalog2Block.getYandex(), new C9250l(str13 != null ? str13 : "")));
                    } else if (loadAd instanceof Catalog2Layout.CompactHeader) {
                        String str14 = ((Catalog2Layout.CompactHeader) loadAd).yandex;
                        c10227lAdmob.add(new C15545l(catalog2Block.getYandex(), new C9250l(str14 != null ? str14 : "")));
                    } else if ((loadAd instanceof Catalog2Layout.HorizontalButtons) || AbstractC8576l.yandex(loadAd, C17023l.yandex) || AbstractC8576l.yandex(loadAd, C10004l.yandex) || AbstractC8576l.yandex(loadAd, C7861l.yandex) || AbstractC8576l.yandex(loadAd, C4680l.yandex) || AbstractC8576l.yandex(loadAd, C1188l.yandex) || AbstractC8576l.yandex(loadAd, C13200l.yandex) || AbstractC8576l.yandex(loadAd, C15246l.yandex) || AbstractC8576l.yandex(loadAd, C5445l.yandex)) {
                        Unit unit = Unit.INSTANCE;
                    } else if (AbstractC8576l.yandex(loadAd, C0385l.yandex)) {
                        List listPurchase6 = catalog2Block.purchase();
                        LinkedHashMap linkedHashMap6 = c9554l.firebase;
                        ArrayList arrayList10 = new ArrayList();
                        Iterator it12 = listPurchase6.iterator();
                        while (it12.hasNext()) {
                            Catalog2Text catalog2Text = (Catalog2Text) linkedHashMap6.get((String) it12.next());
                            if (catalog2Text != null) {
                                arrayList10.add(catalog2Text);
                            }
                        }
                        ArrayList arrayList11 = new ArrayList(AbstractC14055l.billing(arrayList10, 10));
                        Iterator it13 = arrayList10.iterator();
                        while (it13.hasNext()) {
                            c10227lAdmob.add(new C15545l(catalog2Block.getYandex(), new C12845l(((Catalog2Text) it13.next()).loadAd)));
                            arrayList11.add(Boolean.TRUE);
                        }
                    } else if (AbstractC8576l.yandex(loadAd, C1089l.yandex) || AbstractC8576l.yandex(loadAd, C2267l.yandex) || AbstractC8576l.yandex(loadAd, C3553l.yandex) || AbstractC8576l.yandex(loadAd, C0984l.yandex) || AbstractC8576l.yandex(loadAd, C12727l.yandex) || (loadAd instanceof Catalog2Layout.SubsectionTabs) || (loadAd instanceof Catalog2Layout.SynthOpenCacheSearch) || (loadAd instanceof Catalog2Layout.MusicNewsfeedTitle) || AbstractC8576l.yandex(loadAd, C3351l.yandex)) {
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        AbstractC8576l.yandex(loadAd, C7348l.yandex);
                    }
                    it = it3;
                    linkedHashMap = linkedHashMap2;
                }
            }
            it3 = it;
            linkedHashMap2 = linkedHashMap;
            str = null;
        }
        return AbstractC14055l.purchase(c10227lAdmob);
    }
}
