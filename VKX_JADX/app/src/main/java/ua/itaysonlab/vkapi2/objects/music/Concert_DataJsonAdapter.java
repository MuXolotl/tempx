package ua.itaysonlab.vkapi2.objects.music;

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
public final class Concert_DataJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("id", "title", "place_title", "age_category", "min_price", "start_datetime", "page_url", "artists_ids");

    public Concert_DataJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "id");
        this.crashlytics = c12952l.loadAd(Long.TYPE, c5746l, "min_price");
        this.amazon = c12952l.loadAd(AbstractC15639l.mopub(List.class, String.class), c5746l, "artists_ids");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        Concert.Data data = (Concert.Data) obj;
        c3631l.mopub();
        c3631l.isVip("id");
        String str = data.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("title");
        abstractC7188l.billing(c3631l, data.loadAd);
        c3631l.isVip("place_title");
        abstractC7188l.billing(c3631l, data.crashlytics);
        c3631l.isVip("age_category");
        abstractC7188l.billing(c3631l, data.amazon);
        c3631l.isVip("min_price");
        AbstractC12589l.m3427throws(data.purchase, this.crashlytics, c3631l, "start_datetime");
        abstractC7188l.billing(c3631l, data.billing);
        c3631l.isVip("page_url");
        abstractC7188l.billing(c3631l, data.mopub);
        c3631l.isVip("artists_ids");
        this.amazon.billing(c3631l, data.admob);
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
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        long jLongValue = 0;
        Object obj5 = null;
        Object obj6 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.loadAd;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    break;
                case 0:
                    Object objLoadAd = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd != null) {
                        str = (String) objLoadAd;
                    } else {
                        setLicense = AbstractC2812l.isVip("id", "id", c0396l, setLicense);
                        z = true;
                    }
                    break;
                case 1:
                    Object objLoadAd2 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd2 == null) {
                        setLicense = AbstractC2812l.isVip("title", "title", c0396l, setLicense);
                    } else {
                        obj = objLoadAd2;
                    }
                    i &= -3;
                    break;
                case 2:
                    Object objLoadAd3 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd3 == null) {
                        setLicense = AbstractC2812l.isVip("place_title", "place_title", c0396l, setLicense);
                    } else {
                        obj2 = objLoadAd3;
                    }
                    i &= -5;
                    break;
                case 3:
                    Object objLoadAd4 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setLicense = AbstractC2812l.isVip("age_category", "age_category", c0396l, setLicense);
                    } else {
                        obj3 = objLoadAd4;
                    }
                    i &= -9;
                    break;
                case 4:
                    Object objLoadAd5 = this.crashlytics.loadAd(c0396l);
                    if (objLoadAd5 == null) {
                        setLicense = AbstractC2812l.isVip("min_price", "min_price", c0396l, setLicense);
                    } else {
                        jLongValue = ((Number) objLoadAd5).longValue();
                    }
                    i &= -17;
                    break;
                case 5:
                    Object objLoadAd6 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd6 == null) {
                        setLicense = AbstractC2812l.isVip("start_datetime", "start_datetime", c0396l, setLicense);
                    } else {
                        obj4 = objLoadAd6;
                    }
                    i &= -33;
                    break;
                case 6:
                    Object objLoadAd7 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd7 == null) {
                        setLicense = AbstractC2812l.isVip("page_url", "page_url", c0396l, setLicense);
                    } else {
                        obj5 = objLoadAd7;
                    }
                    i &= -65;
                    break;
                case 7:
                    Object objLoadAd8 = this.amazon.loadAd(c0396l);
                    if (objLoadAd8 == null) {
                        setLicense = AbstractC2812l.isVip("artists_ids", "artists_ids", c0396l, setLicense);
                    } else {
                        obj6 = objLoadAd8;
                    }
                    i &= -129;
                    break;
            }
        }
        c0396l.ads();
        if ((!z) & (str == null)) {
            setLicense = AbstractC2812l.license("id", "id", c0396l, setLicense);
        }
        if (setLicense.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
            return null;
        }
        Object obj7 = obj;
        if (i == -255) {
            return new Concert.Data(str, (String) obj7, (String) obj2, (String) obj3, jLongValue, (String) obj4, (String) obj5, (List) obj6);
        }
        String str2 = (String) obj7;
        String str3 = (String) obj2;
        String str4 = (String) obj3;
        String str5 = (String) obj4;
        String str6 = (String) obj5;
        List list = (List) obj6;
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        if ((i & 16) != 0) {
            jLongValue = 0;
        }
        if ((i & 32) != 0) {
            str5 = "";
        }
        if ((i & 64) != 0) {
            str6 = "";
        }
        if ((i & 128) != 0) {
            list = C2580l.f5619l;
        }
        List list2 = list;
        String str7 = str6;
        return new Concert.Data(str, str2, str3, str4, jLongValue, str5, str7, list2);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Concert.Data)";
    }
}
