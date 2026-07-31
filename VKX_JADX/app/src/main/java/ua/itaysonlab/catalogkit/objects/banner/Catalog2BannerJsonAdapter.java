package ua.itaysonlab.catalogkit.objects.banner;

import defpackage.AbstractC12589l;
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
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemPhoto;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class Catalog2BannerJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("id", "click_action", "buttons", "images", "text", "title", "subtext", "image_mode");

    public Catalog2BannerJsonAdapter(C12952l c12952l) {
        Class cls = Integer.TYPE;
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(cls, c5746l, "id");
        this.crashlytics = c12952l.loadAd(Catalog2BannerClickActionRoot.class, c5746l, "click_action");
        this.amazon = c12952l.loadAd(AbstractC15639l.mopub(List.class, Catalog2Button.class), c5746l, "buttons");
        this.purchase = c12952l.loadAd(AbstractC15639l.mopub(List.class, CustomCatalogBlockItemPhoto.class), c5746l, "images");
        this.billing = c12952l.loadAd(String.class, c5746l, "text");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        Catalog2Banner catalog2Banner = (Catalog2Banner) obj;
        c3631l.mopub();
        c3631l.isVip("id");
        AbstractC12589l.inmobi(catalog2Banner.yandex, this.loadAd, c3631l, "click_action");
        this.crashlytics.billing(c3631l, catalog2Banner.loadAd);
        c3631l.isVip("buttons");
        this.amazon.billing(c3631l, catalog2Banner.crashlytics);
        c3631l.isVip("images");
        this.purchase.billing(c3631l, catalog2Banner.amazon);
        c3631l.isVip("text");
        String str = catalog2Banner.purchase;
        AbstractC7188l abstractC7188l = this.billing;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("title");
        abstractC7188l.billing(c3631l, catalog2Banner.billing);
        c3631l.isVip("subtext");
        abstractC7188l.billing(c3631l, catalog2Banner.mopub);
        c3631l.isVip("image_mode");
        abstractC7188l.billing(c3631l, catalog2Banner.admob);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        byte b = -1;
        boolean z = false;
        Integer num = null;
        boolean z2 = false;
        Object objLoadAd = null;
        Catalog2BannerClickActionRoot catalog2BannerClickActionRoot = null;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.billing;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    break;
                case 0:
                    Object objLoadAd2 = this.loadAd.loadAd(c0396l);
                    if (objLoadAd2 != null) {
                        num = (Integer) objLoadAd2;
                    } else {
                        setLicense = AbstractC2812l.isVip("id", "id", c0396l, setLicense);
                        z = true;
                    }
                    break;
                case 1:
                    catalog2BannerClickActionRoot = (Catalog2BannerClickActionRoot) this.crashlytics.loadAd(c0396l);
                    break;
                case 2:
                    objLoadAd = this.amazon.loadAd(c0396l);
                    b = -5;
                    break;
                case 3:
                    Object objLoadAd3 = this.purchase.loadAd(c0396l);
                    if (objLoadAd3 != null) {
                        list = (List) objLoadAd3;
                    } else {
                        setLicense = AbstractC2812l.isVip("images", "images", c0396l, setLicense);
                        z2 = true;
                    }
                    break;
                case 4:
                    str = (String) abstractC7188l.loadAd(c0396l);
                    break;
                case 5:
                    str2 = (String) abstractC7188l.loadAd(c0396l);
                    break;
                case 6:
                    str3 = (String) abstractC7188l.loadAd(c0396l);
                    break;
                case 7:
                    str4 = (String) abstractC7188l.loadAd(c0396l);
                    break;
            }
        }
        c0396l.ads();
        if ((!z) & (num == null)) {
            setLicense = AbstractC2812l.license("id", "id", c0396l, setLicense);
        }
        if ((!z2) & (list == null)) {
            setLicense = AbstractC2812l.license("images", "images", c0396l, setLicense);
        }
        if (setLicense.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
            return null;
        }
        Object obj = objLoadAd;
        int iIntValue = num.intValue();
        if (b == -5) {
            return new Catalog2Banner(iIntValue, catalog2BannerClickActionRoot, (List) obj, list, str, str2, str3, str4);
        }
        return new Catalog2Banner(iIntValue, catalog2BannerClickActionRoot, (b & 4) != 0 ? null : (List) obj, list, str, str2, str3, str4);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Catalog2Banner)";
    }
}
