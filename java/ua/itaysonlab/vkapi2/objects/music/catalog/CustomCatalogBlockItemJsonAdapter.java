package ua.itaysonlab.vkapi2.objects.music.catalog;

import defpackage.AbstractC15639l;
import defpackage.AbstractC16901l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC7188l;
import defpackage.C0396l;
import defpackage.C0458l;
import defpackage.C11467l;
import defpackage.C12952l;
import defpackage.C18262l;
import defpackage.C3631l;
import defpackage.C5746l;
import defpackage.C8413l;
import java.io.EOFException;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class CustomCatalogBlockItemJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("title", "subtitle", "image", "images", "image_style", "background", "url", "id", "meta");

    public CustomCatalogBlockItemJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "title");
        this.crashlytics = c12952l.loadAd(AbstractC15639l.mopub(List.class, CustomCatalogBlockItemPhoto.class), c5746l, "image");
        this.amazon = c12952l.loadAd(AbstractC15639l.mopub(List.class, AbstractC15639l.mopub(List.class, CustomCatalogBlockItemPhoto.class)), c5746l, "images");
        this.purchase = c12952l.loadAd(CustomCatalogBlockItem.Background.class, c5746l, "background");
        this.billing = c12952l.loadAd(CustomCatalogBlockItemMeta.class, c5746l, "meta");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) obj;
        c3631l.mopub();
        c3631l.isVip("title");
        String str = customCatalogBlockItem.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("subtitle");
        abstractC7188l.billing(c3631l, customCatalogBlockItem.loadAd);
        c3631l.isVip("image");
        this.crashlytics.billing(c3631l, customCatalogBlockItem.crashlytics);
        c3631l.isVip("images");
        this.amazon.billing(c3631l, customCatalogBlockItem.amazon);
        c3631l.isVip("image_style");
        abstractC7188l.billing(c3631l, customCatalogBlockItem.purchase);
        c3631l.isVip("background");
        this.purchase.billing(c3631l, customCatalogBlockItem.billing);
        c3631l.isVip("url");
        abstractC7188l.billing(c3631l, customCatalogBlockItem.mopub);
        c3631l.isVip("id");
        abstractC7188l.billing(c3631l, customCatalogBlockItem.admob);
        c3631l.isVip("meta");
        this.billing.billing(c3631l, customCatalogBlockItem.subs);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        int i = -1;
        boolean z = false;
        Object obj = null;
        String str = null;
        Object objLoadAd = null;
        Object objLoadAd2 = null;
        Object obj2 = null;
        Object objLoadAd3 = null;
        Object obj3 = null;
        Object obj4 = null;
        CustomCatalogBlockItemMeta customCatalogBlockItemMeta = null;
        while (true) {
            if (!c0396l.m504package()) {
                c0396l.ads();
                if ((!z) & (str == null)) {
                    setLicense = AbstractC2812l.license("title", "title", c0396l, setLicense);
                }
                if (setLicense.size() != 0) {
                    C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
                    return null;
                }
                Object obj5 = obj;
                if (i == -255) {
                    return new CustomCatalogBlockItem(str, (String) obj5, (List) objLoadAd, (List) objLoadAd2, (String) obj2, (CustomCatalogBlockItem.Background) objLoadAd3, (String) obj3, (String) obj4, customCatalogBlockItemMeta);
                }
                String str2 = (String) obj5;
                List list = (List) objLoadAd;
                List list2 = (List) objLoadAd2;
                String str3 = (String) obj2;
                CustomCatalogBlockItem.Background background = (CustomCatalogBlockItem.Background) objLoadAd3;
                String str4 = (String) obj3;
                String str5 = (String) obj4;
                if ((i & 2) != 0) {
                    str2 = "";
                }
                if ((i & 4) != 0) {
                    list = null;
                }
                if ((i & 8) != 0) {
                    list2 = null;
                }
                if ((i & 16) != 0) {
                    str3 = "";
                }
                CustomCatalogBlockItem.Background background2 = (i & 32) == 0 ? background : null;
                if ((i & 64) != 0) {
                    str4 = "";
                }
                return new CustomCatalogBlockItem(str, str2, list, list2, str3, background2, str4, (i & 128) != 0 ? "" : str5, customCatalogBlockItemMeta);
            }
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.loadAd;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    break;
                case 0:
                    Object objLoadAd4 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd4 != null) {
                        str = (String) objLoadAd4;
                    } else {
                        setLicense = AbstractC2812l.isVip("title", "title", c0396l, setLicense);
                        z = true;
                    }
                    break;
                case 1:
                    Object objLoadAd5 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd5 == null) {
                        setLicense = AbstractC2812l.isVip("subtitle", "subtitle", c0396l, setLicense);
                    } else {
                        obj = objLoadAd5;
                    }
                    i &= -3;
                    break;
                case 2:
                    objLoadAd = this.crashlytics.loadAd(c0396l);
                    i &= -5;
                    break;
                case 3:
                    objLoadAd2 = this.amazon.loadAd(c0396l);
                    i &= -9;
                    break;
                case 4:
                    Object objLoadAd6 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd6 == null) {
                        setLicense = AbstractC2812l.isVip("image_style", "image_style", c0396l, setLicense);
                    } else {
                        obj2 = objLoadAd6;
                    }
                    i &= -17;
                    break;
                case 5:
                    objLoadAd3 = this.purchase.loadAd(c0396l);
                    i &= -33;
                    break;
                case 6:
                    Object objLoadAd7 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd7 == null) {
                        setLicense = AbstractC2812l.isVip("url", "url", c0396l, setLicense);
                    } else {
                        obj3 = objLoadAd7;
                    }
                    i &= -65;
                    break;
                case 7:
                    Object objLoadAd8 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd8 == null) {
                        setLicense = AbstractC2812l.isVip("id", "id", c0396l, setLicense);
                    } else {
                        obj4 = objLoadAd8;
                    }
                    i &= -129;
                    break;
                case 8:
                    customCatalogBlockItemMeta = (CustomCatalogBlockItemMeta) this.billing.loadAd(c0396l);
                    break;
            }
        }
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CustomCatalogBlockItem)";
    }
}
