package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.catalogkit.objects.banner.Catalog2Banner;
import ua.itaysonlab.catalogkit.objects.banner.Catalog2BannerClickActionRoot;

/* JADX INFO: renamed from: lّْۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12854l {
    /* JADX WARN: Code duplicated, block: B:101:0x011f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    public static final List loadAd(List list) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        if (list != 0 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Catalog2Banner catalog2Banner = (Catalog2Banner) next;
                String str5 = catalog2Banner.billing;
                if (!(str5 != null ? AbstractC12024l.appmetrica(str5, "vk combo", true) : false)) {
                    String str6 = catalog2Banner.purchase;
                    if (!(str6 != null ? AbstractC12024l.appmetrica(str6, "vk combo", true) : false)) {
                        Catalog2BannerClickActionRoot catalog2BannerClickActionRoot = catalog2Banner.loadAd;
                        Catalog2ButtonAction catalog2ButtonAction = catalog2BannerClickActionRoot != null ? catalog2BannerClickActionRoot.yandex : null;
                        Catalog2ButtonAction.OpenUrl openUrl = catalog2ButtonAction instanceof Catalog2ButtonAction.OpenUrl ? (Catalog2ButtonAction.OpenUrl) catalog2ButtonAction : null;
                        if (!((openUrl == null || (str4 = openUrl.yandex) == null) ? false : AbstractC12024l.appmetrica(str4, "buy_music_subscription", false))) {
                            z2 = false;
                        }
                    }
                }
                if (!z2) {
                    arrayList.add(next);
                }
            }
            list = new ArrayList();
            for (Object obj : arrayList) {
                Catalog2BannerClickActionRoot catalog2BannerClickActionRoot2 = ((Catalog2Banner) obj).loadAd;
                Catalog2ButtonAction catalog2ButtonAction2 = catalog2BannerClickActionRoot2 != null ? catalog2BannerClickActionRoot2.yandex : null;
                Catalog2ButtonAction.OpenUrl openUrl2 = catalog2ButtonAction2 instanceof Catalog2ButtonAction.OpenUrl ? (Catalog2ButtonAction.OpenUrl) catalog2ButtonAction2 : null;
                if ((openUrl2 == null || (str3 = openUrl2.yandex) == null || (!AbstractC16648l.isVip(str3, "https://vk.com/music/", false) && !AbstractC16648l.isVip(str3, "https://vk.com/podcast", false) && !AbstractC16648l.isVip(str3, "https://vk.com/audiobook", false) && !AbstractC16648l.isVip(str3, "https://vk.com/audio?section=", false) && !AbstractC16648l.isVip(str3, "https://vk.com/audio?screen=", false))) ? false : true) {
                    z = true;
                } else {
                    Catalog2ButtonAction catalog2ButtonAction3 = catalog2BannerClickActionRoot2 != null ? catalog2BannerClickActionRoot2.yandex : null;
                    Catalog2ButtonAction.OpenUrl openUrl3 = catalog2ButtonAction3 instanceof Catalog2ButtonAction.OpenUrl ? (Catalog2ButtonAction.OpenUrl) catalog2ButtonAction3 : null;
                    if ((openUrl3 == null || (str2 = openUrl3.yandex) == null || (!AbstractC16648l.isVip(str2, "https://vk.ru/music/", false) && !AbstractC16648l.isVip(str2, "https://vk.ru/podcast", false) && !AbstractC16648l.isVip(str2, "https://vk.ru/audiobook", false) && !AbstractC16648l.isVip(str2, "https://vk.ru/audio?section=", false) && !AbstractC16648l.isVip(str2, "https://vk.ru/audio?screen=", false))) ? false : true) {
                        z = true;
                    } else {
                        Catalog2ButtonAction catalog2ButtonAction4 = catalog2BannerClickActionRoot2 != null ? catalog2BannerClickActionRoot2.yandex : null;
                        Catalog2ButtonAction.OpenUrl openUrl4 = catalog2ButtonAction4 instanceof Catalog2ButtonAction.OpenUrl ? (Catalog2ButtonAction.OpenUrl) catalog2ButtonAction4 : null;
                        if ((openUrl4 == null || (str = openUrl4.yandex) == null) ? false : AbstractC12024l.appmetrica(str, "app54108054", false)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                }
                if (z) {
                    list.add(obj);
                }
            }
        }
        return list;
    }

    public static final LinkedHashMap yandex(List list) {
        if (list == null) {
            return new LinkedHashMap();
        }
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(list, 10));
        if (iFirebase < 16) {
            iFirebase = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
        for (Object obj : list) {
            linkedHashMap.put(((InterfaceC12360l) obj).getYandex(), obj);
        }
        return new LinkedHashMap(linkedHashMap);
    }
}
