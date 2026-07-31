package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC0653l;
import defpackage.AbstractC12589l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import ealvatag.tag.datatype.DataTypes;
import java.util.List;
import kotlin.Metadata;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/Concert;", "Llُّؔ;", DataTypes.OBJ_DATA, "PurchaseAction", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class Concert implements InterfaceC12360l {
    public final String crashlytics;
    public final PurchaseAction loadAd;
    public final Data yandex;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/Concert$Data;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class Data {
        public final List admob;
        public final String amazon;
        public final String billing;
        public final String crashlytics;
        public final String loadAd;
        public final String mopub;
        public final long purchase;
        public final String yandex;

        public Data(String str, String str2, String str3, String str4, long j, String str5, String str6, List list) {
            this.yandex = str;
            this.loadAd = str2;
            this.crashlytics = str3;
            this.amazon = str4;
            this.purchase = j;
            this.billing = str5;
            this.mopub = str6;
            this.admob = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return AbstractC8576l.yandex(this.yandex, data.yandex) && AbstractC8576l.yandex(this.loadAd, data.loadAd) && AbstractC8576l.yandex(this.crashlytics, data.crashlytics) && AbstractC8576l.yandex(this.amazon, data.amazon) && this.purchase == data.purchase && AbstractC8576l.yandex(this.billing, data.billing) && AbstractC8576l.yandex(this.mopub, data.mopub) && AbstractC8576l.yandex(this.admob, data.admob);
        }

        public final int hashCode() {
            int iAdvert = AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics), 31, this.amazon);
            long j = this.purchase;
            return this.admob.hashCode() + AbstractC12589l.advert(AbstractC12589l.advert((iAdvert + ((int) (j ^ (j >>> 32)))) * 31, 31, this.billing), 31, this.mopub);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(id=");
            sb.append(this.yandex);
            sb.append(", title=");
            sb.append(this.loadAd);
            sb.append(", place_title=");
            sb.append(this.crashlytics);
            sb.append(", age_category=");
            sb.append(this.amazon);
            sb.append(", min_price=");
            sb.append(this.purchase);
            sb.append(", start_datetime=");
            sb.append(this.billing);
            sb.append(", page_url=");
            sb.append(this.mopub);
            sb.append(", artists_ids=");
            return AbstractC0653l.subscription(sb, this.admob, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/Concert$PurchaseAction;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class PurchaseAction {
        public final String loadAd;
        public final Catalog2ButtonAction yandex;

        public PurchaseAction(Catalog2ButtonAction catalog2ButtonAction, String str) {
            this.yandex = catalog2ButtonAction;
            this.loadAd = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PurchaseAction)) {
                return false;
            }
            PurchaseAction purchaseAction = (PurchaseAction) obj;
            return AbstractC8576l.yandex(this.yandex, purchaseAction.yandex) && AbstractC8576l.yandex(this.loadAd, purchaseAction.loadAd);
        }

        public final int hashCode() {
            return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PurchaseAction(action=");
            sb.append(this.yandex);
            sb.append(", title=");
            return AbstractC2812l.tapsense(sb, this.loadAd, ')');
        }
    }

    public Concert(Data data, PurchaseAction purchaseAction, String str) {
        this.yandex = data;
        this.loadAd = purchaseAction;
        this.crashlytics = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Concert)) {
            return false;
        }
        Concert concert = (Concert) obj;
        return AbstractC8576l.yandex(this.yandex, concert.yandex) && AbstractC8576l.yandex(this.loadAd, concert.loadAd) && AbstractC8576l.yandex(this.crashlytics, concert.crashlytics);
    }

    @Override // defpackage.InterfaceC12360l
    /* JADX INFO: renamed from: getItemId */
    public final String getYandex() {
        return this.yandex.yandex;
    }

    public final int hashCode() {
        int iHashCode = (this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31;
        String str = this.crashlytics;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Concert(concert_data=");
        sb.append(this.yandex);
        sb.append(", purchase_action=");
        sb.append(this.loadAd);
        sb.append(", track_code=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
