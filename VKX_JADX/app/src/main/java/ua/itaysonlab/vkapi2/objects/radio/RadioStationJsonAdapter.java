package ua.itaysonlab.vkapi2.objects.radio;

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
public final class RadioStationJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("id", "name", "logo_url", "logo_png_url", "background_color", "is_followed", "is_enabled", "stream_url", "liked");

    public RadioStationJsonAdapter(C12952l c12952l) {
        Class cls = Integer.TYPE;
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(cls, c5746l, "id");
        this.crashlytics = c12952l.loadAd(String.class, c5746l, "name");
        this.amazon = c12952l.loadAd(Boolean.TYPE, c5746l, "is_followed");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        RadioStation radioStation = (RadioStation) obj;
        c3631l.mopub();
        c3631l.isVip("id");
        AbstractC12589l.inmobi(radioStation.yandex, this.loadAd, c3631l, "name");
        String str = radioStation.loadAd;
        AbstractC7188l abstractC7188l = this.crashlytics;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("logo_url");
        abstractC7188l.billing(c3631l, radioStation.crashlytics);
        c3631l.isVip("logo_png_url");
        abstractC7188l.billing(c3631l, radioStation.amazon);
        c3631l.isVip("background_color");
        abstractC7188l.billing(c3631l, radioStation.purchase);
        c3631l.isVip("is_followed");
        boolean z = radioStation.billing;
        AbstractC7188l abstractC7188l2 = this.amazon;
        AbstractC12589l.m3428volatile(z, abstractC7188l2, c3631l, "is_enabled");
        AbstractC12589l.m3428volatile(radioStation.mopub, abstractC7188l2, c3631l, "stream_url");
        abstractC7188l.billing(c3631l, radioStation.admob);
        c3631l.isVip("liked");
        abstractC7188l2.billing(c3631l, Boolean.valueOf(radioStation.billing));
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        RadioStation radioStation;
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        int i = -1;
        boolean z = false;
        Integer num = null;
        boolean z2 = false;
        boolean z3 = false;
        Object obj = null;
        String str = null;
        Object obj2 = null;
        Object obj3 = null;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        String str2 = null;
        Boolean bool = null;
        while (true) {
            boolean z4 = z;
            if (!c0396l.m504package()) {
                Integer num2 = num;
                boolean z5 = z2;
                c0396l.ads();
                if ((!z4) & (num2 == null)) {
                    setLicense = AbstractC2812l.license("id", "id", c0396l, setLicense);
                }
                if ((!z5) & (str == null)) {
                    setLicense = AbstractC2812l.license("name", "name", c0396l, setLicense);
                }
                if ((!z3) & (str2 == null)) {
                    setLicense = AbstractC2812l.license("stream_url", "stream_url", c0396l, setLicense);
                }
                if (setLicense.size() != 0) {
                    C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
                    return null;
                }
                if (i == -125) {
                    radioStation = new RadioStation(num2.intValue(), str, (String) obj, (String) obj2, (String) obj3, zBooleanValue, zBooleanValue2, str2);
                } else {
                    Object obj4 = obj;
                    int iIntValue = num2.intValue();
                    String str3 = (String) obj4;
                    String str4 = (String) obj2;
                    String str5 = (String) obj3;
                    if ((i & 4) != 0) {
                        str3 = "";
                    }
                    if ((i & 8) != 0) {
                        str4 = "";
                    }
                    String str6 = (i & 16) != 0 ? "" : str5;
                    if ((i & 32) != 0) {
                        zBooleanValue = false;
                    }
                    if ((i & 64) != 0) {
                        zBooleanValue2 = false;
                    }
                    radioStation = new RadioStation(iIntValue, str, str3, str4, str6, zBooleanValue, zBooleanValue2, str2);
                }
                if (bool != null) {
                    radioStation.crashlytics(bool.booleanValue());
                }
                return radioStation;
            }
            int iM503l = c0396l.m503l(this.yandex);
            Integer num3 = num;
            AbstractC7188l abstractC7188l = this.amazon;
            boolean z6 = z2;
            AbstractC7188l abstractC7188l2 = this.crashlytics;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    z = z4;
                    num = num3;
                    z2 = z6;
                    break;
                case 0:
                    Object objLoadAd = this.loadAd.loadAd(c0396l);
                    if (objLoadAd == null) {
                        setLicense = AbstractC2812l.isVip("id", "id", c0396l, setLicense);
                        z = true;
                        num = num3;
                    } else {
                        num = (Integer) objLoadAd;
                        z = z4;
                    }
                    z2 = z6;
                    break;
                case 1:
                    Object objLoadAd2 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd2 != null) {
                        str = (String) objLoadAd2;
                        z = z4;
                        num = num3;
                        z2 = z6;
                    } else {
                        setLicense = AbstractC2812l.isVip("name", "name", c0396l, setLicense);
                        z = z4;
                        z2 = true;
                        num = num3;
                    }
                    break;
                case 2:
                    Object objLoadAd3 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd3 == null) {
                        setLicense = AbstractC2812l.isVip("logo_url", "logo_url", c0396l, setLicense);
                    } else {
                        obj = objLoadAd3;
                    }
                    i &= -5;
                    z = z4;
                    num = num3;
                    z2 = z6;
                    break;
                case 3:
                    Object objLoadAd4 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setLicense = AbstractC2812l.isVip("logo_png_url", "logo_png_url", c0396l, setLicense);
                    } else {
                        obj2 = objLoadAd4;
                    }
                    i &= -9;
                    z = z4;
                    num = num3;
                    z2 = z6;
                    break;
                case 4:
                    Object objLoadAd5 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd5 == null) {
                        setLicense = AbstractC2812l.isVip("background_color", "background_color", c0396l, setLicense);
                    } else {
                        obj3 = objLoadAd5;
                    }
                    i &= -17;
                    z = z4;
                    num = num3;
                    z2 = z6;
                    break;
                case 5:
                    Object objLoadAd6 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd6 == null) {
                        setLicense = AbstractC2812l.isVip("is_followed", "is_followed", c0396l, setLicense);
                    } else {
                        zBooleanValue = ((Boolean) objLoadAd6).booleanValue();
                    }
                    i &= -33;
                    z = z4;
                    num = num3;
                    z2 = z6;
                    break;
                case 6:
                    Object objLoadAd7 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd7 == null) {
                        setLicense = AbstractC2812l.isVip("is_enabled", "is_enabled", c0396l, setLicense);
                    } else {
                        zBooleanValue2 = ((Boolean) objLoadAd7).booleanValue();
                    }
                    i &= -65;
                    z = z4;
                    num = num3;
                    z2 = z6;
                    break;
                case 7:
                    Object objLoadAd8 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd8 == null) {
                        setLicense = AbstractC2812l.isVip("stream_url", "stream_url", c0396l, setLicense);
                        z = z4;
                        z3 = true;
                    } else {
                        str2 = (String) objLoadAd8;
                        z = z4;
                    }
                    num = num3;
                    z2 = z6;
                    break;
                case 8:
                    Object objLoadAd9 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd9 == null) {
                        setLicense = AbstractC2812l.isVip("liked", "liked", c0396l, setLicense);
                    } else {
                        bool = (Boolean) objLoadAd9;
                    }
                    z = z4;
                    num = num3;
                    z2 = z6;
                    break;
                default:
                    z = z4;
                    num = num3;
                    z2 = z6;
                    break;
            }
        }
    }

    public final String toString() {
        return "GeneratedJsonAdapter(RadioStation)";
    }
}
