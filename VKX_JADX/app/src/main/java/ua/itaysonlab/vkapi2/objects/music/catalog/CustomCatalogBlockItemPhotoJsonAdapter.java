package ua.itaysonlab.vkapi2.objects.music.catalog;

import defpackage.AbstractC12589l;
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
public final class CustomCatalogBlockItemPhotoJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("height", "url", "width", "id");

    public CustomCatalogBlockItemPhotoJsonAdapter(C12952l c12952l) {
        Class cls = Integer.TYPE;
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(cls, c5746l, "height");
        this.crashlytics = c12952l.loadAd(String.class, c5746l, "url");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        CustomCatalogBlockItemPhoto customCatalogBlockItemPhoto = (CustomCatalogBlockItemPhoto) obj;
        c3631l.mopub();
        c3631l.isVip("height");
        int i = customCatalogBlockItemPhoto.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        AbstractC12589l.inmobi(i, abstractC7188l, c3631l, "url");
        String str = customCatalogBlockItemPhoto.loadAd;
        AbstractC7188l abstractC7188l2 = this.crashlytics;
        abstractC7188l2.billing(c3631l, str);
        c3631l.isVip("width");
        AbstractC12589l.inmobi(customCatalogBlockItemPhoto.crashlytics, abstractC7188l, c3631l, "id");
        abstractC7188l2.billing(c3631l, customCatalogBlockItemPhoto.amazon);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        boolean z = false;
        Integer num = null;
        byte b = -1;
        boolean z2 = false;
        String str = null;
        boolean z3 = false;
        Integer num2 = null;
        Object obj = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l != -1) {
                AbstractC7188l abstractC7188l = this.loadAd;
                if (iM503l != 0) {
                    AbstractC7188l abstractC7188l2 = this.crashlytics;
                    if (iM503l == 1) {
                        Object objLoadAd = abstractC7188l2.loadAd(c0396l);
                        if (objLoadAd == null) {
                            setLicense = AbstractC2812l.isVip("url", "url", c0396l, setLicense);
                            z2 = true;
                        } else {
                            str = (String) objLoadAd;
                        }
                    } else if (iM503l == 2) {
                        Object objLoadAd2 = abstractC7188l.loadAd(c0396l);
                        if (objLoadAd2 == null) {
                            setLicense = AbstractC2812l.isVip("width", "width", c0396l, setLicense);
                            z3 = true;
                        } else {
                            num2 = (Integer) objLoadAd2;
                        }
                    } else if (iM503l == 3) {
                        Object objLoadAd3 = abstractC7188l2.loadAd(c0396l);
                        if (objLoadAd3 == null) {
                            setLicense = AbstractC2812l.isVip("id", "id", c0396l, setLicense);
                        } else {
                            obj = objLoadAd3;
                        }
                        b = -9;
                    }
                } else {
                    Object objLoadAd4 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setLicense = AbstractC2812l.isVip("height", "height", c0396l, setLicense);
                        z = true;
                    } else {
                        num = (Integer) objLoadAd4;
                    }
                }
            } else {
                c0396l.m502l();
                c0396l.m501l();
            }
        }
        c0396l.ads();
        if ((!z) & (num == null)) {
            setLicense = AbstractC2812l.license("height", "height", c0396l, setLicense);
        }
        if ((!z2) & (str == null)) {
            setLicense = AbstractC2812l.license("url", "url", c0396l, setLicense);
        }
        if ((!z3) & (num2 == null)) {
            setLicense = AbstractC2812l.license("width", "width", c0396l, setLicense);
        }
        if (setLicense.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
            return null;
        }
        if (b == -9) {
            return new CustomCatalogBlockItemPhoto(num.intValue(), num2.intValue(), str, (String) obj);
        }
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        String str2 = (String) obj;
        if ((b & 8) != 0) {
            str2 = "";
        }
        return new CustomCatalogBlockItemPhoto(iIntValue, iIntValue2, str, str2);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CustomCatalogBlockItemPhoto)";
    }
}
