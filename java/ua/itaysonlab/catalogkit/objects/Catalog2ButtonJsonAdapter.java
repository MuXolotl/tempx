package ua.itaysonlab.catalogkit.objects;

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
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemPhoto;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class Catalog2ButtonJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l admob;
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l mopub;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("action", "section_id", "owner_id", "block_id", "mix_id", "mix_options", "id", "entity_id", "options", "title", "description", "is_following", "ref_layout_name", "ref_items_count", "ref_data_type", "images", "foreground_images");

    public Catalog2ButtonJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(Catalog2ButtonAction.class, c5746l, "action");
        this.crashlytics = c12952l.loadAd(String.class, c5746l, "section_id");
        this.amazon = c12952l.loadAd(Long.class, c5746l, "owner_id");
        this.purchase = c12952l.loadAd(AbstractC15639l.mopub(List.class, Catalog2ReplacementOption.class), c5746l, "options");
        this.billing = c12952l.loadAd(Boolean.class, c5746l, "is_following");
        this.mopub = c12952l.loadAd(Integer.class, c5746l, "ref_items_count");
        this.admob = c12952l.loadAd(AbstractC15639l.mopub(List.class, CustomCatalogBlockItemPhoto.class), c5746l, "images");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        Catalog2Button catalog2Button = (Catalog2Button) obj;
        c3631l.mopub();
        c3631l.isVip("action");
        this.loadAd.billing(c3631l, catalog2Button.yandex);
        c3631l.isVip("section_id");
        String str = catalog2Button.loadAd;
        AbstractC7188l abstractC7188l = this.crashlytics;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("owner_id");
        this.amazon.billing(c3631l, catalog2Button.crashlytics);
        c3631l.isVip("block_id");
        abstractC7188l.billing(c3631l, catalog2Button.amazon);
        c3631l.isVip("mix_id");
        abstractC7188l.billing(c3631l, catalog2Button.purchase);
        c3631l.isVip("mix_options");
        abstractC7188l.billing(c3631l, catalog2Button.billing);
        c3631l.isVip("id");
        abstractC7188l.billing(c3631l, catalog2Button.mopub);
        c3631l.isVip("entity_id");
        abstractC7188l.billing(c3631l, catalog2Button.admob);
        c3631l.isVip("options");
        this.purchase.billing(c3631l, catalog2Button.subs);
        c3631l.isVip("title");
        abstractC7188l.billing(c3631l, catalog2Button.isPro);
        c3631l.isVip("description");
        abstractC7188l.billing(c3631l, catalog2Button.firebase);
        c3631l.isVip("is_following");
        this.billing.billing(c3631l, catalog2Button.smaato);
        c3631l.isVip("ref_layout_name");
        abstractC7188l.billing(c3631l, catalog2Button.remoteconfig);
        c3631l.isVip("ref_items_count");
        this.mopub.billing(c3631l, catalog2Button.vip);
        c3631l.isVip("ref_data_type");
        abstractC7188l.billing(c3631l, catalog2Button.metrica);
        c3631l.isVip("images");
        List list = catalog2Button.startapp;
        AbstractC7188l abstractC7188l2 = this.admob;
        abstractC7188l2.billing(c3631l, list);
        c3631l.isVip("foreground_images");
        abstractC7188l2.billing(c3631l, catalog2Button.adcel);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        int i;
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        int i2 = -1;
        boolean z = false;
        Object objLoadAd = null;
        Catalog2ButtonAction catalog2ButtonAction = null;
        Object objLoadAd2 = null;
        Object objLoadAd3 = null;
        Object objLoadAd4 = null;
        Object objLoadAd5 = null;
        Object objLoadAd6 = null;
        Object objLoadAd7 = null;
        Object objLoadAd8 = null;
        Object objLoadAd9 = null;
        Object objLoadAd10 = null;
        Object objLoadAd11 = null;
        Object objLoadAd12 = null;
        Object objLoadAd13 = null;
        Object objLoadAd14 = null;
        Object obj = null;
        Object obj2 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.admob;
            boolean z2 = z;
            AbstractC7188l abstractC7188l2 = this.crashlytics;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    z = z2;
                    break;
                case 0:
                    Object objLoadAd15 = this.loadAd.loadAd(c0396l);
                    if (objLoadAd15 != null) {
                        catalog2ButtonAction = (Catalog2ButtonAction) objLoadAd15;
                        z = z2;
                    } else {
                        setLicense = AbstractC2812l.isVip("action", "action", c0396l, setLicense);
                        z = true;
                    }
                    break;
                case 1:
                    objLoadAd = abstractC7188l2.loadAd(c0396l);
                    i2 &= -3;
                    z = z2;
                    break;
                case 2:
                    objLoadAd2 = this.amazon.loadAd(c0396l);
                    i2 &= -5;
                    z = z2;
                    break;
                case 3:
                    objLoadAd3 = abstractC7188l2.loadAd(c0396l);
                    i2 &= -9;
                    z = z2;
                    break;
                case 4:
                    objLoadAd4 = abstractC7188l2.loadAd(c0396l);
                    i2 &= -17;
                    z = z2;
                    break;
                case 5:
                    objLoadAd5 = abstractC7188l2.loadAd(c0396l);
                    i2 &= -33;
                    z = z2;
                    break;
                case 6:
                    objLoadAd6 = abstractC7188l2.loadAd(c0396l);
                    i2 &= -65;
                    z = z2;
                    break;
                case 7:
                    objLoadAd7 = abstractC7188l2.loadAd(c0396l);
                    i2 &= -129;
                    z = z2;
                    break;
                case 8:
                    objLoadAd8 = this.purchase.loadAd(c0396l);
                    i2 &= -257;
                    z = z2;
                    break;
                case 9:
                    objLoadAd9 = abstractC7188l2.loadAd(c0396l);
                    i2 &= -513;
                    z = z2;
                    break;
                case 10:
                    objLoadAd10 = abstractC7188l2.loadAd(c0396l);
                    i2 &= -1025;
                    z = z2;
                    break;
                case 11:
                    objLoadAd11 = this.billing.loadAd(c0396l);
                    i2 &= -2049;
                    z = z2;
                    break;
                case 12:
                    objLoadAd12 = abstractC7188l2.loadAd(c0396l);
                    i2 &= -4097;
                    z = z2;
                    break;
                case 13:
                    objLoadAd13 = this.mopub.loadAd(c0396l);
                    i2 &= -8193;
                    z = z2;
                    break;
                case 14:
                    objLoadAd14 = abstractC7188l2.loadAd(c0396l);
                    i2 &= -16385;
                    z = z2;
                    break;
                case 15:
                    Object objLoadAd16 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd16 == null) {
                        setLicense = AbstractC2812l.isVip("images", "images", c0396l, setLicense);
                    } else {
                        obj = objLoadAd16;
                    }
                    i = -32769;
                    i2 &= i;
                    z = z2;
                    break;
                case 16:
                    Object objLoadAd17 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd17 == null) {
                        setLicense = AbstractC2812l.isVip("foreground_images", "foreground_images", c0396l, setLicense);
                    } else {
                        obj2 = objLoadAd17;
                    }
                    i = -65537;
                    i2 &= i;
                    z = z2;
                    break;
                default:
                    z = z2;
                    break;
            }
        }
        c0396l.ads();
        if ((!z) & (catalog2ButtonAction == null)) {
            setLicense = AbstractC2812l.license("action", "action", c0396l, setLicense);
        }
        if (setLicense.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
            return null;
        }
        Object obj3 = objLoadAd;
        if (i2 == -131071) {
            return new Catalog2Button(catalog2ButtonAction, (String) obj3, (Long) objLoadAd2, (String) objLoadAd3, (String) objLoadAd4, (String) objLoadAd5, (String) objLoadAd6, (String) objLoadAd7, (List) objLoadAd8, (String) objLoadAd9, (String) objLoadAd10, (Boolean) objLoadAd11, (String) objLoadAd12, (Integer) objLoadAd13, (String) objLoadAd14, (List) obj, (List) obj2);
        }
        return new Catalog2Button(catalog2ButtonAction, (String) obj3, (Long) objLoadAd2, (String) objLoadAd3, (String) objLoadAd4, (String) objLoadAd5, (String) objLoadAd6, (String) objLoadAd7, (List) objLoadAd8, (String) objLoadAd9, (String) objLoadAd10, (Boolean) objLoadAd11, (String) objLoadAd12, (Integer) objLoadAd13, (String) objLoadAd14, (List) obj, (List) obj2, i2);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Catalog2Button)";
    }
}
