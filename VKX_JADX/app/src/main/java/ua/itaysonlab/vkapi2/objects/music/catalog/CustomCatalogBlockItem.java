package ua.itaysonlab.vkapi2.objects.music.catalog;

import defpackage.AbstractC12589l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.C11521l;
import defpackage.EnumC2008l;
import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/catalog/CustomCatalogBlockItem;", "Llُّؔ;", "Background", "lؓٞۡ", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class CustomCatalogBlockItem implements InterfaceC12360l {
    public final String admob;
    public final List amazon;
    public final Background billing;
    public final List crashlytics;
    public final transient EnumC2008l isPro;
    public final String loadAd;
    public final String mopub;
    public final String purchase;
    public final CustomCatalogBlockItemMeta subs;
    public final String yandex;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/catalog/CustomCatalogBlockItem$Background;", "", "BColor", "ua/itaysonlab/vkapi2/objects/music/catalog/yandex", "ua/itaysonlab/vkapi2/objects/music/catalog/loadAd", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class Background {
        public final String amazon;
        public final transient loadAd billing;
        public final List crashlytics;
        public final List loadAd;
        public final transient yandex mopub;
        public final String purchase;
        public final float yandex;

        /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/catalog/CustomCatalogBlockItem$Background$BColor;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @InterfaceC15749l(generateAdapter = true)
        public static final /* data */ class BColor {
            public final String loadAd;
            public final float yandex;

            public BColor(String str, float f) {
                this.yandex = f;
                this.loadAd = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BColor)) {
                    return false;
                }
                BColor bColor = (BColor) obj;
                return Float.compare(this.yandex, bColor.yandex) == 0 && AbstractC8576l.yandex(this.loadAd, bColor.loadAd);
            }

            public final int hashCode() {
                return this.loadAd.hashCode() + (Float.floatToIntBits(this.yandex) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("BColor(alpha=");
                sb.append(this.yandex);
                sb.append(", hex=");
                return AbstractC2812l.tapsense(sb, this.loadAd, ')');
            }
        }

        public Background(float f, List list, List list2, String str, String str2) {
            Object obj;
            Object next;
            this.yandex = f;
            this.loadAd = list;
            this.crashlytics = list2;
            this.amazon = str;
            this.purchase = str2;
            C11521l c11521l = new C11521l(0, loadAd.f36613l);
            do {
                obj = null;
                if (!c11521l.hasNext()) {
                    next = null;
                    break;
                }
                next = c11521l.next();
            } while (!((loadAd) next).f36614l.equals(this.purchase));
            loadAd loadad = (loadAd) next;
            this.billing = loadad == null ? loadAd.Default : loadad;
            C11521l c11521l2 = new C11521l(0, yandex.f36617l);
            while (c11521l2.hasNext()) {
                Object next2 = c11521l2.next();
                if (((yandex) next2).f36618l.equals(this.amazon)) {
                    obj = next2;
                    break;
                }
            }
            yandex yandexVar = (yandex) obj;
            this.mopub = yandexVar == null ? yandex.Solid : yandexVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Background)) {
                return false;
            }
            Background background = (Background) obj;
            return Float.compare(this.yandex, background.yandex) == 0 && AbstractC8576l.yandex(this.loadAd, background.loadAd) && AbstractC8576l.yandex(this.crashlytics, background.crashlytics) && AbstractC8576l.yandex(this.amazon, background.amazon) && AbstractC8576l.yandex(this.purchase, background.purchase);
        }

        public final int hashCode() {
            return this.purchase.hashCode() + AbstractC12589l.advert(AbstractC14814l.admob(AbstractC14814l.admob(Float.floatToIntBits(this.yandex) * 31, 31, this.loadAd), 31, this.crashlytics), 31, this.amazon);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Background(angle=");
            sb.append(this.yandex);
            sb.append(", colors=");
            sb.append(this.loadAd);
            sb.append(", positions=");
            sb.append(this.crashlytics);
            sb.append(", sub_type=");
            sb.append(this.amazon);
            sb.append(", type=");
            return AbstractC2812l.tapsense(sb, this.purchase, ')');
        }
    }

    public CustomCatalogBlockItem(String str, String str2, List list, List list2, String str3, Background background, String str4, String str5, CustomCatalogBlockItemMeta customCatalogBlockItemMeta) {
        Object next;
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = list;
        this.amazon = list2;
        this.purchase = str3;
        this.billing = background;
        this.mopub = str4;
        this.admob = str5;
        this.subs = customCatalogBlockItemMeta;
        C11521l c11521l = new C11521l(0, EnumC2008l.f4530l);
        do {
            if (!c11521l.hasNext()) {
                next = null;
                break;
            }
            next = c11521l.next();
        } while (!((EnumC2008l) next).f4532l.equals(this.purchase));
        EnumC2008l enumC2008l = (EnumC2008l) next;
        this.isPro = enumC2008l == null ? EnumC2008l.Default : enumC2008l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomCatalogBlockItem)) {
            return false;
        }
        CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) obj;
        return AbstractC8576l.yandex(this.yandex, customCatalogBlockItem.yandex) && AbstractC8576l.yandex(this.loadAd, customCatalogBlockItem.loadAd) && AbstractC8576l.yandex(this.crashlytics, customCatalogBlockItem.crashlytics) && AbstractC8576l.yandex(this.amazon, customCatalogBlockItem.amazon) && AbstractC8576l.yandex(this.purchase, customCatalogBlockItem.purchase) && AbstractC8576l.yandex(this.billing, customCatalogBlockItem.billing) && AbstractC8576l.yandex(this.mopub, customCatalogBlockItem.mopub) && AbstractC8576l.yandex(this.admob, customCatalogBlockItem.admob) && AbstractC8576l.yandex(this.subs, customCatalogBlockItem.subs);
    }

    @Override // defpackage.InterfaceC12360l
    /* JADX INFO: renamed from: getItemId, reason: from getter */
    public final String getAdmob() {
        return this.admob;
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd);
        List list = this.crashlytics;
        int iHashCode = (iAdvert + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.amazon;
        int iAdvert2 = AbstractC12589l.advert((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.purchase);
        Background background = this.billing;
        int iAdvert3 = AbstractC12589l.advert(AbstractC12589l.advert((iAdvert2 + (background == null ? 0 : background.hashCode())) * 31, 31, this.mopub), 31, this.admob);
        CustomCatalogBlockItemMeta customCatalogBlockItemMeta = this.subs;
        return iAdvert3 + (customCatalogBlockItemMeta != null ? customCatalogBlockItemMeta.hashCode() : 0);
    }

    public final String toString() {
        return "CustomCatalogBlockItem(title=" + this.yandex + ", subtitle=" + this.loadAd + ", image=" + this.crashlytics + ", images=" + this.amazon + ", image_style=" + this.purchase + ", background=" + this.billing + ", url=" + this.mopub + ", id=" + this.admob + ", meta=" + this.subs + ')';
    }
}
