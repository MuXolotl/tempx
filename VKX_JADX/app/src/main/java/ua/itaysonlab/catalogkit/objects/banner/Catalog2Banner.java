package ua.itaysonlab.catalogkit.objects.banner;

import defpackage.AbstractC14814l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/banner/Catalog2Banner;", "Llُّؔ;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class Catalog2Banner implements InterfaceC12360l {
    public final String admob;
    public final List amazon;
    public final String billing;
    public final List crashlytics;
    public final Catalog2BannerClickActionRoot loadAd;
    public final String mopub;
    public final String purchase;
    public final int yandex;

    public Catalog2Banner(int i, Catalog2BannerClickActionRoot catalog2BannerClickActionRoot, List list, List list2, String str, String str2, String str3, String str4) {
        this.yandex = i;
        this.loadAd = catalog2BannerClickActionRoot;
        this.crashlytics = list;
        this.amazon = list2;
        this.purchase = str;
        this.billing = str2;
        this.mopub = str3;
        this.admob = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Catalog2Banner)) {
            return false;
        }
        Catalog2Banner catalog2Banner = (Catalog2Banner) obj;
        return this.yandex == catalog2Banner.yandex && AbstractC8576l.yandex(this.loadAd, catalog2Banner.loadAd) && AbstractC8576l.yandex(this.crashlytics, catalog2Banner.crashlytics) && AbstractC8576l.yandex(this.amazon, catalog2Banner.amazon) && AbstractC8576l.yandex(this.purchase, catalog2Banner.purchase) && AbstractC8576l.yandex(this.billing, catalog2Banner.billing) && AbstractC8576l.yandex(this.mopub, catalog2Banner.mopub) && AbstractC8576l.yandex(this.admob, catalog2Banner.admob);
    }

    @Override // defpackage.InterfaceC12360l
    /* JADX INFO: renamed from: getItemId */
    public final String getYandex() {
        return String.valueOf(this.yandex);
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        Catalog2BannerClickActionRoot catalog2BannerClickActionRoot = this.loadAd;
        int iHashCode = (i + (catalog2BannerClickActionRoot == null ? 0 : catalog2BannerClickActionRoot.yandex.hashCode())) * 31;
        List list = this.crashlytics;
        int iAdmob = AbstractC14814l.admob((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.amazon);
        String str = this.purchase;
        int iHashCode2 = (iAdmob + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.billing;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mopub;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.admob;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Catalog2Banner(id=");
        sb.append(this.yandex);
        sb.append(", click_action=");
        sb.append(this.loadAd);
        sb.append(", buttons=");
        sb.append(this.crashlytics);
        sb.append(", images=");
        sb.append(this.amazon);
        sb.append(", text=");
        sb.append(this.purchase);
        sb.append(", title=");
        sb.append(this.billing);
        sb.append(", subtext=");
        sb.append(this.mopub);
        sb.append(", image_mode=");
        return AbstractC2812l.tapsense(sb, this.admob, ')');
    }
}
