package ua.itaysonlab.catalogkit.objects;

import defpackage.AbstractC0653l;
import defpackage.AbstractC12589l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2Section;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class Catalog2Section {
    public List amazon;
    public final String crashlytics;
    public final String loadAd;
    public final List purchase;
    public final String yandex;

    public /* synthetic */ Catalog2Section(String str, String str2, String str3, List list, List list2, int i) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2);
    }

    public static Catalog2Section yandex(Catalog2Section catalog2Section, List list) {
        String str = catalog2Section.yandex;
        String str2 = catalog2Section.loadAd;
        String str3 = catalog2Section.crashlytics;
        List list2 = catalog2Section.purchase;
        catalog2Section.getClass();
        return new Catalog2Section(str, str2, str3, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Catalog2Section)) {
            return false;
        }
        Catalog2Section catalog2Section = (Catalog2Section) obj;
        return AbstractC8576l.yandex(this.yandex, catalog2Section.yandex) && AbstractC8576l.yandex(this.loadAd, catalog2Section.loadAd) && AbstractC8576l.yandex(this.crashlytics, catalog2Section.crashlytics) && AbstractC8576l.yandex(this.amazon, catalog2Section.amazon) && AbstractC8576l.yandex(this.purchase, catalog2Section.purchase);
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd);
        String str = this.crashlytics;
        int iHashCode = (iAdvert + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.amazon;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.purchase;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Catalog2Section(id=");
        sb.append(this.yandex);
        sb.append(", title=");
        sb.append(this.loadAd);
        sb.append(", next_from=");
        sb.append(this.crashlytics);
        sb.append(", blocks=");
        sb.append(this.amazon);
        sb.append(", actions=");
        return AbstractC0653l.subscription(sb, this.purchase, ')');
    }

    public Catalog2Section(String str, String str2, String str3, List list, List list2) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = list;
        this.purchase = list2;
    }
}
