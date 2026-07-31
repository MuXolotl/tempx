package ua.itaysonlab.vkapi2.objects.music.catalog;

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
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class CustomCatalogBlockItemMetaJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("icon", "content_type", "is_explicit");

    public CustomCatalogBlockItemMetaJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "icon");
        this.crashlytics = c12952l.loadAd(Boolean.TYPE, c5746l, "is_explicit");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        CustomCatalogBlockItemMeta customCatalogBlockItemMeta = (CustomCatalogBlockItemMeta) obj;
        c3631l.mopub();
        c3631l.isVip("icon");
        String str = customCatalogBlockItemMeta.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("content_type");
        abstractC7188l.billing(c3631l, customCatalogBlockItemMeta.loadAd);
        c3631l.isVip("is_explicit");
        this.crashlytics.billing(c3631l, Boolean.valueOf(customCatalogBlockItemMeta.crashlytics));
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setIsVip = C5746l.f12138l;
        String str = null;
        String str2 = null;
        boolean zBooleanValue = false;
        byte b = -1;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l != -1) {
                AbstractC7188l abstractC7188l = this.loadAd;
                if (iM503l == 0) {
                    str = (String) abstractC7188l.loadAd(c0396l);
                } else if (iM503l == 1) {
                    str2 = (String) abstractC7188l.loadAd(c0396l);
                } else if (iM503l == 2) {
                    Object objLoadAd = this.crashlytics.loadAd(c0396l);
                    if (objLoadAd == null) {
                        setIsVip = AbstractC2812l.isVip("is_explicit", "is_explicit", c0396l, setIsVip);
                    } else {
                        zBooleanValue = ((Boolean) objLoadAd).booleanValue();
                    }
                    b = -5;
                }
            } else {
                c0396l.m502l();
                c0396l.m501l();
            }
        }
        c0396l.ads();
        if (setIsVip.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setIsVip, "\n", null, null, null, 62));
            return null;
        }
        if (b == -5) {
            return new CustomCatalogBlockItemMeta(str, str2, zBooleanValue);
        }
        return new CustomCatalogBlockItemMeta(str, str2, (b & 4) == 0 ? zBooleanValue : false);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CustomCatalogBlockItemMeta)";
    }
}
