package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2PlaylistRelation;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemPhoto;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* JADX INFO: renamed from: lؙِۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6408l extends AbstractC3030l {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [lّؔۜ] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    public final void amazon(Function0 function0, Function0 function1, C6956l c6956l, int i) {
        ?? arrayList;
        c6956l.m2133new(-1339494258);
        int i2 = (c6956l.admob(function0) ? 4 : 2) | i | (c6956l.admob(function1) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                Catalog2Block catalog2Block = (Catalog2Block) function0.invoke();
                C9554l c9554l = (C9554l) function1.invoke();
                if (!(catalog2Block instanceof Catalog2Block.LinksBlock)) {
                    catalog2Block = null;
                }
                Catalog2Block.LinksBlock linksBlock = (Catalog2Block.LinksBlock) catalog2Block;
                if (linksBlock != null) {
                    LinkedHashMap linkedHashMap = c9554l.purchase;
                    List listPurchase = linksBlock.purchase();
                    arrayList = new ArrayList();
                    Iterator it = listPurchase.iterator();
                    while (it.hasNext()) {
                        InterfaceC12360l interfaceC12360l = (InterfaceC12360l) linkedHashMap.get((String) it.next());
                        if (interfaceC12360l != null) {
                            arrayList.add(interfaceC12360l);
                        }
                    }
                } else {
                    arrayList = C2580l.f5619l;
                }
                objM2132native = AbstractC0509l.billing(arrayList);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12959l.loadAd((AbstractC18082l) objM2132native, c6956l, 8);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12755l(this, function0, function1, i, 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [lّؔۜ] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    public final void crashlytics(boolean z, Function0 function0, Function0 function1, C6956l c6956l, int i) {
        ?? arrayList;
        c6956l.m2133new(2099181304);
        int i2 = (c6956l.admob(function0) ? 32 : 16) | i | (c6956l.admob(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                Catalog2Block catalog2Block = (Catalog2Block) function0.invoke();
                C9554l c9554l = (C9554l) function1.invoke();
                if (!(catalog2Block instanceof Catalog2Block.LinksBlock)) {
                    catalog2Block = null;
                }
                Catalog2Block.LinksBlock linksBlock = (Catalog2Block.LinksBlock) catalog2Block;
                if (linksBlock != null) {
                    LinkedHashMap linkedHashMap = c9554l.purchase;
                    List listPurchase = linksBlock.purchase();
                    arrayList = new ArrayList();
                    Iterator it = listPurchase.iterator();
                    while (it.hasNext()) {
                        InterfaceC12360l interfaceC12360l = (InterfaceC12360l) linkedHashMap.get((String) it.next());
                        if (interfaceC12360l != null) {
                            arrayList.add(interfaceC12360l);
                        }
                    }
                } else {
                    arrayList = C2580l.f5619l;
                }
                objM2132native = AbstractC0509l.billing(arrayList);
                c6956l.m2147try(objM2132native);
            }
            AbstractC18082l abstractC18082l = (AbstractC18082l) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C18334l(2);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC18037l.yandex(abstractC18082l, z, (Function1) objM2132native2, c6956l, 440);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C7159l(this, z, function0, function1, i, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [lّؔۜ] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r20v0, types: [lؚِؑ] */
    public final void loadAd(Function0 function0, Function0 function1, Function0 function2, C6956l c6956l, int i) {
        Object obj;
        ArrayList arrayList;
        ?? r10;
        c6956l.m2133new(-195875115);
        int i2 = 4;
        int i3 = i | (c6956l.admob(function0) ? 4 : 2) | (c6956l.admob(function1) ? 32 : 16) | (c6956l.admob(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        int i4 = 1;
        if (c6956l.m2127for(i3 & 1, (i3 & 147) != 146)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                Catalog2Block catalog2Block = (Catalog2Block) function0.invoke();
                boolean z = catalog2Block instanceof Catalog2Block.ActionsBlock;
                ?? arrayList2 = C2580l.f5619l;
                if (z) {
                    Catalog2Block.ActionsBlock actionsBlock = (Catalog2Block.ActionsBlock) catalog2Block;
                    List list = actionsBlock.crashlytics;
                    if (list != null) {
                        obj = objM2132native;
                        r10 = arrayList2;
                        r10 = list;
                    }
                    obj = objM2132native;
                    r10 = arrayList2;
                    boolean zIsEmpty = r10.isEmpty();
                    ?? Billing = r10;
                    if (zIsEmpty) {
                        List<String> listPurchase = actionsBlock.purchase();
                        ArrayList arrayList3 = new ArrayList();
                        for (String str : listPurchase) {
                        }
                        Billing = AbstractC0509l.billing(arrayList3);
                    }
                    arrayList = new ArrayList(AbstractC14055l.billing(Billing, 10));
                    for (Catalog2Button catalog2Button : Billing) {
                        String strYandex = catalog2Button.mopub;
                        if (strYandex == null) {
                            strYandex = AbstractC0441l.admob().yandex();
                        }
                        String str2 = catalog2Button.isPro;
                        if (str2 == null) {
                            str2 = "";
                        }
                        CustomCatalogBlockItemPhoto customCatalogBlockItemPhoto = (CustomCatalogBlockItemPhoto) AbstractC16901l.m4217extends(catalog2Button.startapp);
                        String str3 = customCatalogBlockItemPhoto != null ? customCatalogBlockItemPhoto.loadAd : null;
                        if (str3 == null) {
                            str3 = "";
                        }
                        arrayList.add(new C14593l(strYandex, str2, str3, new C9810l(catalog2Button, function2, i2)));
                    }
                } else {
                    C9554l c9554l = (C9554l) function1.invoke();
                    if (!(catalog2Block instanceof Catalog2Block.MusicPlaylistsBlock)) {
                        obj = objM2132native;
                        catalog2Block = null;
                    }
                    obj = objM2132native;
                    Catalog2Block.MusicPlaylistsBlock musicPlaylistsBlock = (Catalog2Block.MusicPlaylistsBlock) catalog2Block;
                    if (musicPlaylistsBlock != null) {
                        LinkedHashMap linkedHashMap = c9554l.loadAd;
                        List listPurchase2 = musicPlaylistsBlock.purchase();
                        arrayList2 = new ArrayList();
                        Iterator it = listPurchase2.iterator();
                        while (it.hasNext()) {
                            InterfaceC12360l interfaceC12360l = (InterfaceC12360l) linkedHashMap.get((String) it.next());
                            if (interfaceC12360l != null) {
                                arrayList2.add(interfaceC12360l);
                            }
                        }
                    }
                    AbstractC18082l<AudioPlaylist> abstractC18082lBilling = AbstractC0509l.billing(arrayList2);
                    ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(abstractC18082lBilling, 10));
                    for (AudioPlaylist audioPlaylist : abstractC18082lBilling) {
                        String strRemoteconfig = AbstractC14770l.remoteconfig(audioPlaylist);
                        String str4 = audioPlaylist.mopub;
                        AlbumThumb albumThumb = audioPlaylist.Signature;
                        String str5 = albumThumb != null ? albumThumb.crashlytics : null;
                        if (str5 == null) {
                            str5 = "";
                        }
                        arrayList4.add(new C14593l(strRemoteconfig, str4, str5, new C9810l(function2, audioPlaylist, 5)));
                    }
                    arrayList = arrayList4;
                }
                c6956l.m2147try(arrayList);
                obj = arrayList;
            }
            obj = objM2132native;
            List list2 = (List) obj;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C18334l(i4);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC11790l.loadAd(list2, (Function1) objM2132native2, AbstractC0080l.amazon(C4346l.f8873l, 1.0f), c6956l, 432);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C11593l(this, function0, function1, function2, i, 0);
        }
    }

    public final void yandex(Function0 function0, Function0 function1, Function0 function2, C6956l c6956l, int i) {
        c6956l.m2133new(696427300);
        int i2 = i | (c6956l.admob(function0) ? 4 : 2) | (c6956l.admob(function1) ? 32 : 16) | (c6956l.admob(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                Object objInvoke = function0.invoke();
                ArrayList arrayList = null;
                Map linkedHashMap = null;
                Catalog2Block.MusicPlaylistsBlock musicPlaylistsBlock = objInvoke instanceof Catalog2Block.MusicPlaylistsBlock ? (Catalog2Block.MusicPlaylistsBlock) objInvoke : null;
                List list = C2580l.f5619l;
                if (musicPlaylistsBlock != null) {
                    C9554l c9554l = (C9554l) function1.invoke();
                    List<Catalog2PlaylistRelation> list2 = musicPlaylistsBlock.mopub;
                    if (list2 != null) {
                        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(list2, 10));
                        linkedHashMap = new LinkedHashMap(iFirebase >= 16 ? iFirebase : 16);
                        for (Catalog2PlaylistRelation catalog2PlaylistRelation : list2) {
                            linkedHashMap.put(catalog2PlaylistRelation.yandex, catalog2PlaylistRelation.loadAd);
                        }
                    }
                    if (linkedHashMap == null) {
                        linkedHashMap = C14054l.f27396l;
                    }
                    LinkedHashMap linkedHashMap2 = c9554l.loadAd;
                    List listPurchase = musicPlaylistsBlock.purchase();
                    ArrayList<AudioPlaylist> arrayList2 = new ArrayList();
                    Iterator it = listPurchase.iterator();
                    while (it.hasNext()) {
                        AudioPlaylist audioPlaylist = (AudioPlaylist) linkedHashMap2.get((String) it.next());
                        if (audioPlaylist != null) {
                            arrayList2.add(audioPlaylist);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
                    for (AudioPlaylist audioPlaylist2 : arrayList2) {
                        List list3 = (List) linkedHashMap.get(AbstractC14770l.vip(audioPlaylist2));
                        if (list3 == null) {
                            list3 = list;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            CatalogArtist catalogArtist = (CatalogArtist) c9554l.mopub.get((String) it2.next());
                            if (catalogArtist != null) {
                                arrayList4.add(catalogArtist);
                            }
                        }
                        arrayList3.add(new C7946l(audioPlaylist2, arrayList4));
                    }
                    arrayList = arrayList3;
                }
                if (arrayList != null) {
                    list = arrayList;
                }
                objM2132native = AbstractC0509l.billing(list);
                c6956l.m2147try(objM2132native);
            }
            AbstractC18082l abstractC18082l = (AbstractC18082l) objM2132native;
            boolean z = (i2 & 896) == 256;
            Object objM2132native2 = c6956l.m2132native();
            if (z || objM2132native2 == c13863l) {
                objM2132native2 = new C6199l(6, function2);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC7039l.loadAd(abstractC18082l, (Function1) objM2132native2, c6956l, 6);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C11593l(this, function0, function1, function2, i, 1);
        }
    }
}
