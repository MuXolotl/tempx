package ua.itaysonlab.vkapi2.objects.music.catalog;

import defpackage.AbstractC12589l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/catalog/CatalogArtist;", "Llُّؔ;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class CatalogArtist implements InterfaceC12360l {
    public final boolean admob;
    public final List amazon;
    public final List billing;
    public final String crashlytics;
    public final String isPro;
    public final String loadAd;
    public final boolean mopub;
    public final List purchase;
    public final boolean subs;
    public final String yandex;

    public CatalogArtist(String str, String str2, String str3, List list, List list2, List list3, boolean z, boolean z2, boolean z3, String str4) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = list;
        this.purchase = list2;
        this.billing = list3;
        this.mopub = z;
        this.admob = z2;
        this.subs = z3;
        this.isPro = str4;
    }

    public static String loadAd(List list) {
        String str = "";
        if (list != null) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                CustomCatalogBlockItemPhoto customCatalogBlockItemPhoto = (CustomCatalogBlockItemPhoto) it.next();
                int i2 = customCatalogBlockItemPhoto.crashlytics;
                if (i2 > i) {
                    str = customCatalogBlockItemPhoto.loadAd;
                    i = i2;
                }
            }
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogArtist)) {
            return false;
        }
        CatalogArtist catalogArtist = (CatalogArtist) obj;
        return AbstractC8576l.yandex(this.yandex, catalogArtist.yandex) && AbstractC8576l.yandex(this.loadAd, catalogArtist.loadAd) && AbstractC8576l.yandex(this.crashlytics, catalogArtist.crashlytics) && AbstractC8576l.yandex(this.amazon, catalogArtist.amazon) && AbstractC8576l.yandex(this.purchase, catalogArtist.purchase) && AbstractC8576l.yandex(this.billing, catalogArtist.billing) && this.mopub == catalogArtist.mopub && this.admob == catalogArtist.admob && this.subs == catalogArtist.subs && AbstractC8576l.yandex(this.isPro, catalogArtist.isPro);
    }

    @Override // defpackage.InterfaceC12360l
    /* JADX INFO: renamed from: getItemId, reason: from getter */
    public final String getLoadAd() {
        return this.loadAd;
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd);
        String str = this.crashlytics;
        int iHashCode = (iAdvert + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.amazon;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.purchase;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.billing;
        return this.isPro.hashCode() + ((((((((iHashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31) + (this.mopub ? 1231 : 1237)) * 31) + (this.admob ? 1231 : 1237)) * 31) + (this.subs ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogArtist(name=");
        sb.append(this.yandex);
        sb.append(", id=");
        sb.append(this.loadAd);
        sb.append(", domain=");
        sb.append(this.crashlytics);
        sb.append(", photo=");
        sb.append(this.amazon);
        sb.append(", photos=");
        sb.append(this.purchase);
        sb.append(", genres=");
        sb.append(this.billing);
        sb.append(", is_album_cover=");
        sb.append(this.mopub);
        sb.append(", is_followed=");
        sb.append(this.admob);
        sb.append(", can_follow=");
        sb.append(this.subs);
        sb.append(", bio=");
        return AbstractC2812l.tapsense(sb, this.isPro, ')');
    }

    public final String yandex() {
        List list = this.purchase;
        if (list == null || list.isEmpty()) {
            return loadAd(this.amazon);
        }
        List list2 = ((CatalogArtistPhotosContainer) list.get(0)).loadAd;
        if (list2 != null) {
            return loadAd(list2);
        }
        return null;
    }
}
