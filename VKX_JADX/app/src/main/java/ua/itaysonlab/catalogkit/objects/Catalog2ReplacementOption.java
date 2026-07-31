package ua.itaysonlab.catalogkit.objects;

import defpackage.AbstractC12589l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2ReplacementOption;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class Catalog2ReplacementOption {
    public final Integer amazon;
    public final String crashlytics;
    public final String loadAd;
    public final String yandex;

    public Catalog2ReplacementOption(String str, String str2, String str3, Integer num) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Catalog2ReplacementOption)) {
            return false;
        }
        Catalog2ReplacementOption catalog2ReplacementOption = (Catalog2ReplacementOption) obj;
        return AbstractC8576l.yandex(this.yandex, catalog2ReplacementOption.yandex) && AbstractC8576l.yandex(this.loadAd, catalog2ReplacementOption.loadAd) && AbstractC8576l.yandex(this.crashlytics, catalog2ReplacementOption.crashlytics) && AbstractC8576l.yandex(this.amazon, catalog2ReplacementOption.amazon);
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd);
        String str = this.crashlytics;
        int iHashCode = (iAdvert + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.amazon;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Catalog2ReplacementOption(replacement_id=" + this.yandex + ", text=" + this.loadAd + ", icon=" + this.crashlytics + ", selected=" + this.amazon + ')';
    }
}
