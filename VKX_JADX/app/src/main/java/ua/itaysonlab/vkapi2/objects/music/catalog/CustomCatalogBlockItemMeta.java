package ua.itaysonlab.vkapi2.objects.music.catalog;

import defpackage.AbstractC0653l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/catalog/CustomCatalogBlockItemMeta;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class CustomCatalogBlockItemMeta {
    public final boolean crashlytics;
    public final String loadAd;
    public final String yandex;

    public CustomCatalogBlockItemMeta(String str, String str2, boolean z) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomCatalogBlockItemMeta)) {
            return false;
        }
        CustomCatalogBlockItemMeta customCatalogBlockItemMeta = (CustomCatalogBlockItemMeta) obj;
        return AbstractC8576l.yandex(this.yandex, customCatalogBlockItemMeta.yandex) && AbstractC8576l.yandex(this.loadAd, customCatalogBlockItemMeta.loadAd) && this.crashlytics == customCatalogBlockItemMeta.crashlytics;
    }

    public final int hashCode() {
        String str = this.yandex;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.loadAd;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.crashlytics ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomCatalogBlockItemMeta(icon=");
        sb.append(this.yandex);
        sb.append(", content_type=");
        sb.append(this.loadAd);
        sb.append(", is_explicit=");
        return AbstractC0653l.tapsense(sb, this.crashlytics, ')');
    }
}
