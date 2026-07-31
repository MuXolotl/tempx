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
import defpackage.C2580l;
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
public final class CustomCatalogBlockItem_BackgroundJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("angle", "colors", "positions", "sub_type", "type");

    public CustomCatalogBlockItem_BackgroundJsonAdapter(C12952l c12952l) {
        Class cls = Float.TYPE;
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(cls, c5746l, "angle");
        this.crashlytics = c12952l.loadAd(AbstractC15639l.mopub(List.class, CustomCatalogBlockItem.Background.BColor.class), c5746l, "colors");
        this.amazon = c12952l.loadAd(AbstractC15639l.mopub(List.class, Float.class), c5746l, "positions");
        this.purchase = c12952l.loadAd(String.class, c5746l, "sub_type");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        CustomCatalogBlockItem.Background background = (CustomCatalogBlockItem.Background) obj;
        c3631l.mopub();
        c3631l.isVip("angle");
        this.loadAd.billing(c3631l, Float.valueOf(background.yandex));
        c3631l.isVip("colors");
        this.crashlytics.billing(c3631l, background.loadAd);
        c3631l.isVip("positions");
        this.amazon.billing(c3631l, background.crashlytics);
        c3631l.isVip("sub_type");
        String str = background.amazon;
        AbstractC7188l abstractC7188l = this.purchase;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("type");
        abstractC7188l.billing(c3631l, background.purchase);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setIsVip = C5746l.f12138l;
        float fFloatValue = 0.0f;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        int i = -1;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l == -1) {
                c0396l.m502l();
                c0396l.m501l();
            } else if (iM503l == 0) {
                Object objLoadAd = this.loadAd.loadAd(c0396l);
                if (objLoadAd == null) {
                    setIsVip = AbstractC2812l.isVip("angle", "angle", c0396l, setIsVip);
                } else {
                    fFloatValue = ((Number) objLoadAd).floatValue();
                }
                i &= -2;
            } else if (iM503l == 1) {
                Object objLoadAd2 = this.crashlytics.loadAd(c0396l);
                if (objLoadAd2 == null) {
                    setIsVip = AbstractC2812l.isVip("colors", "colors", c0396l, setIsVip);
                } else {
                    obj = objLoadAd2;
                }
                i &= -3;
            } else if (iM503l != 2) {
                AbstractC7188l abstractC7188l = this.purchase;
                if (iM503l == 3) {
                    Object objLoadAd3 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd3 == null) {
                        setIsVip = AbstractC2812l.isVip("sub_type", "sub_type", c0396l, setIsVip);
                    } else {
                        obj3 = objLoadAd3;
                    }
                    i &= -9;
                } else if (iM503l == 4) {
                    Object objLoadAd4 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setIsVip = AbstractC2812l.isVip("type", "type", c0396l, setIsVip);
                    } else {
                        obj4 = objLoadAd4;
                    }
                    i &= -17;
                }
            } else {
                Object objLoadAd5 = this.amazon.loadAd(c0396l);
                if (objLoadAd5 == null) {
                    setIsVip = AbstractC2812l.isVip("positions", "positions", c0396l, setIsVip);
                } else {
                    obj2 = objLoadAd5;
                }
                i &= -5;
            }
        }
        c0396l.ads();
        if (setIsVip.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setIsVip, "\n", null, null, null, 62));
            return null;
        }
        Object obj5 = obj;
        if (i == -32) {
            return new CustomCatalogBlockItem.Background(fFloatValue, (List) obj5, (List) obj2, (String) obj3, (String) obj4);
        }
        List list = (List) obj5;
        List list2 = (List) obj2;
        String str = (String) obj3;
        String str2 = (String) obj4;
        float f = (i & 1) == 0 ? fFloatValue : 0.0f;
        int i2 = i & 2;
        C2580l c2580l = C2580l.f5619l;
        if (i2 != 0) {
            list = c2580l;
        }
        List list3 = (i & 4) != 0 ? c2580l : list2;
        if ((i & 8) != 0) {
            str = "solid";
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = "default";
        }
        return new CustomCatalogBlockItem.Background(f, list, list3, str3, str2);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CustomCatalogBlockItem.Background)";
    }
}
