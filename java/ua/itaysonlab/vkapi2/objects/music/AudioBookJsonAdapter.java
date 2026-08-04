package ua.itaysonlab.vkapi2.objects.music;

import androidx.car.app.navigation.model.Maneuver;
import defpackage.AbstractC12589l;
import defpackage.AbstractC12994l;
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
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemPhoto;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class AudioBookJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l admob;
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l mopub;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("id", "publisher", "narrators", "translators", "genres", "authors", "code", "title", "duration", "minimum_age", "is_explicit", "in_favorites", "progress_percentage", "release_date", "copyright", "access_status", "cover", "chapters", "track_code");

    public AudioBookJsonAdapter(C12952l c12952l) {
        Class cls = Integer.TYPE;
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(cls, c5746l, "id");
        this.crashlytics = c12952l.loadAd(AudioBook.Link.class, c5746l, "publisher");
        this.amazon = c12952l.loadAd(AbstractC15639l.mopub(List.class, AudioBook.Link.class), c5746l, "narrators");
        this.purchase = c12952l.loadAd(String.class, c5746l, "code");
        this.billing = c12952l.loadAd(Boolean.TYPE, c5746l, "is_explicit");
        this.mopub = c12952l.loadAd(AbstractC15639l.mopub(List.class, CustomCatalogBlockItemPhoto.class), c5746l, "cover");
        this.admob = c12952l.loadAd(AbstractC15639l.mopub(List.class, AudioBook.Chapter.class), c5746l, "chapters");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        AudioBook audioBook = (AudioBook) obj;
        c3631l.mopub();
        c3631l.isVip("id");
        int i = audioBook.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        AbstractC12589l.inmobi(i, abstractC7188l, c3631l, "publisher");
        this.crashlytics.billing(c3631l, audioBook.loadAd);
        c3631l.isVip("narrators");
        List list = audioBook.crashlytics;
        AbstractC7188l abstractC7188l2 = this.amazon;
        abstractC7188l2.billing(c3631l, list);
        c3631l.isVip("translators");
        abstractC7188l2.billing(c3631l, audioBook.amazon);
        c3631l.isVip("genres");
        abstractC7188l2.billing(c3631l, audioBook.purchase);
        c3631l.isVip("authors");
        abstractC7188l2.billing(c3631l, audioBook.billing);
        c3631l.isVip("code");
        String str = audioBook.mopub;
        AbstractC7188l abstractC7188l3 = this.purchase;
        abstractC7188l3.billing(c3631l, str);
        c3631l.isVip("title");
        abstractC7188l3.billing(c3631l, audioBook.admob);
        c3631l.isVip("duration");
        AbstractC12589l.inmobi(audioBook.subs, abstractC7188l, c3631l, "minimum_age");
        AbstractC12589l.inmobi(audioBook.isPro, abstractC7188l, c3631l, "is_explicit");
        boolean z = audioBook.firebase;
        AbstractC7188l abstractC7188l4 = this.billing;
        AbstractC12589l.m3428volatile(z, abstractC7188l4, c3631l, "in_favorites");
        AbstractC12589l.m3428volatile(audioBook.smaato, abstractC7188l4, c3631l, "progress_percentage");
        AbstractC12589l.inmobi(audioBook.remoteconfig, abstractC7188l, c3631l, "release_date");
        AbstractC12589l.inmobi(audioBook.vip, abstractC7188l, c3631l, "copyright");
        abstractC7188l3.billing(c3631l, audioBook.metrica);
        c3631l.isVip("access_status");
        abstractC7188l3.billing(c3631l, audioBook.startapp);
        c3631l.isVip("cover");
        this.mopub.billing(c3631l, audioBook.adcel);
        c3631l.isVip("chapters");
        this.admob.billing(c3631l, audioBook.ads);
        c3631l.isVip("track_code");
        abstractC7188l3.billing(c3631l, audioBook.subscription);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        int i;
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        int i2 = -1;
        boolean z = false;
        Integer num = null;
        boolean z2 = false;
        boolean z3 = false;
        Object obj = null;
        AudioBook.Link link = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        int iIntValue = 0;
        int iIntValue2 = 0;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        int iIntValue3 = 0;
        int iIntValue4 = 0;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        String str = null;
        while (true) {
            boolean z4 = z;
            if (!c0396l.m504package()) {
                Integer num2 = num;
                boolean z5 = z2;
                boolean z6 = z3;
                Object obj11 = obj;
                c0396l.ads();
                if ((!z4) & (num2 == null)) {
                    setLicense = AbstractC2812l.license("id", "id", c0396l, setLicense);
                }
                if ((!z5) & (link == null)) {
                    setLicense = AbstractC2812l.license("publisher", "publisher", c0396l, setLicense);
                }
                if ((!z6) & (str == null)) {
                    setLicense = AbstractC2812l.license("track_code", "track_code", c0396l, setLicense);
                }
                if (setLicense.size() != 0) {
                    C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
                    return null;
                }
                if (i2 == -262141) {
                    return new AudioBook(num2.intValue(), link, (List) obj11, (List) obj2, (List) obj3, (List) obj4, (String) obj5, (String) obj6, iIntValue, iIntValue2, zBooleanValue, zBooleanValue2, iIntValue3, iIntValue4, (String) obj7, (String) obj8, (List) obj9, (List) obj10, str);
                }
                Object obj12 = obj2;
                int iIntValue5 = num2.intValue();
                List list = (List) obj11;
                List list2 = (List) obj12;
                List list3 = (List) obj3;
                List list4 = (List) obj4;
                String str2 = (String) obj5;
                String str3 = (String) obj6;
                String str4 = (String) obj7;
                String str5 = (String) obj8;
                List list5 = (List) obj9;
                List list6 = (List) obj10;
                int i3 = i2 & 4;
                C2580l c2580l = C2580l.f5619l;
                if (i3 != 0) {
                    list = c2580l;
                }
                if ((i2 & 8) != 0) {
                    list2 = c2580l;
                }
                if ((i2 & 16) != 0) {
                    list3 = c2580l;
                }
                if ((i2 & 32) != 0) {
                    list4 = c2580l;
                }
                if ((i2 & 64) != 0) {
                    str2 = "";
                }
                if ((i2 & 128) != 0) {
                    str3 = "";
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    iIntValue = 0;
                }
                if ((i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    iIntValue2 = 0;
                }
                if ((i2 & 1024) != 0) {
                    zBooleanValue = false;
                }
                if ((i2 & 2048) != 0) {
                    zBooleanValue2 = false;
                }
                if ((i2 & 4096) != 0) {
                    iIntValue3 = 0;
                }
                if ((i2 & 8192) != 0) {
                    iIntValue4 = 0;
                }
                if ((i2 & 16384) != 0) {
                    str4 = "";
                }
                if ((32768 & i2) != 0) {
                    str5 = "";
                }
                if ((65536 & i2) != 0) {
                    list5 = c2580l;
                }
                List list7 = (131072 & i2) != 0 ? c2580l : list6;
                List list8 = list5;
                String str6 = str5;
                String str7 = str4;
                return new AudioBook(iIntValue5, link, list, list2, list3, list4, str2, str3, iIntValue, iIntValue2, zBooleanValue, zBooleanValue2, iIntValue3, iIntValue4, str7, str6, list8, list7, str);
            }
            Integer num3 = num;
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.billing;
            boolean z7 = z2;
            AbstractC7188l abstractC7188l2 = this.amazon;
            boolean z8 = z3;
            AbstractC7188l abstractC7188l3 = this.loadAd;
            Object obj13 = obj;
            AbstractC7188l abstractC7188l4 = this.purchase;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    num = num3;
                    z = z4;
                    z2 = z7;
                    z3 = z8;
                    obj = obj13;
                    break;
                case 0:
                    Object objLoadAd = abstractC7188l3.loadAd(c0396l);
                    if (objLoadAd == null) {
                        setLicense = AbstractC2812l.isVip("id", "id", c0396l, setLicense);
                        num = num3;
                        z = true;
                    } else {
                        num = (Integer) objLoadAd;
                        z = z4;
                    }
                    z2 = z7;
                    z3 = z8;
                    obj = obj13;
                    break;
                case 1:
                    Object objLoadAd2 = this.crashlytics.loadAd(c0396l);
                    if (objLoadAd2 == null) {
                        setLicense = AbstractC2812l.isVip("publisher", "publisher", c0396l, setLicense);
                        num = num3;
                        z = z4;
                        z2 = true;
                    } else {
                        link = (AudioBook.Link) objLoadAd2;
                        num = num3;
                        z = z4;
                        z2 = z7;
                    }
                    z3 = z8;
                    obj = obj13;
                    break;
                case 2:
                    Object objLoadAd3 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd3 == null) {
                        setLicense = AbstractC2812l.isVip("narrators", "narrators", c0396l, setLicense);
                        obj = obj13;
                    } else {
                        obj = objLoadAd3;
                    }
                    i2 &= -5;
                    num = num3;
                    z = z4;
                    z2 = z7;
                    z3 = z8;
                    break;
                case 3:
                    Object objLoadAd4 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setLicense = AbstractC2812l.isVip("translators", "translators", c0396l, setLicense);
                    } else {
                        obj2 = objLoadAd4;
                    }
                    i2 &= -9;
                    num = num3;
                    z = z4;
                    z2 = z7;
                    z3 = z8;
                    obj = obj13;
                    break;
                case 4:
                    Object objLoadAd5 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd5 == null) {
                        setLicense = AbstractC2812l.isVip("genres", "genres", c0396l, setLicense);
                    } else {
                        obj3 = objLoadAd5;
                    }
                    i2 &= -17;
                    num = num3;
                    z = z4;
                    z2 = z7;
                    z3 = z8;
                    obj = obj13;
                    break;
                case 5:
                    Object objLoadAd6 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd6 == null) {
                        setLicense = AbstractC2812l.isVip("authors", "authors", c0396l, setLicense);
                    } else {
                        obj4 = objLoadAd6;
                    }
                    i2 &= -33;
                    num = num3;
                    z = z4;
                    z2 = z7;
                    z3 = z8;
                    obj = obj13;
                    break;
                case 6:
                    Object objLoadAd7 = abstractC7188l4.loadAd(c0396l);
                    if (objLoadAd7 == null) {
                        setLicense = AbstractC2812l.isVip("code", "code", c0396l, setLicense);
                    } else {
                        obj5 = objLoadAd7;
                    }
                    i2 &= -65;
                    num = num3;
                    z = z4;
                    z2 = z7;
                    z3 = z8;
                    obj = obj13;
                    break;
                case 7:
                    Object objLoadAd8 = abstractC7188l4.loadAd(c0396l);
                    if (objLoadAd8 == null) {
                        setLicense = AbstractC2812l.isVip("title", "title", c0396l, setLicense);
                    } else {
                        obj6 = objLoadAd8;
                    }
                    i2 &= -129;
                    num = num3;
                    z = z4;
                    z2 = z7;
                    z3 = z8;
                    obj = obj13;
                    break;
                case 8:
                    Object objLoadAd9 = abstractC7188l3.loadAd(c0396l);
                    if (objLoadAd9 == null) {
                        setLicense = AbstractC2812l.isVip("duration", "duration", c0396l, setLicense);
                    } else {
                        iIntValue = ((Number) objLoadAd9).intValue();
                    }
                    i2 &= -257;
                    num = num3;
                    z = z4;
                    z2 = z7;
                    z3 = z8;
                    obj = obj13;
                    break;
                case 9:
                    Object objLoadAd10 = abstractC7188l3.loadAd(c0396l);
                    if (objLoadAd10 == null) {
                        setLicense = AbstractC2812l.isVip("minimum_age", "minimum_age", c0396l, setLicense);
                    } else {
                        iIntValue2 = ((Number) objLoadAd10).intValue();
                    }
                    i2 &= -513;
                    num = num3;
                    z = z4;
                    z2 = z7;
                    z3 = z8;
                    obj = obj13;
                    break;
                case 10:
                    Object objLoadAd11 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd11 == null) {
                        setLicense = AbstractC2812l.isVip("is_explicit", "is_explicit", c0396l, setLicense);
                    } else {
                        zBooleanValue = ((Boolean) objLoadAd11).booleanValue();
                    }
                    i2 &= -1025;
                    num = num3;
                    z = z4;
                    z2 = z7;
                    z3 = z8;
                    obj = obj13;
                    break;
                case 11:
                    Object objLoadAd12 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd12 == null) {
                        setLicense = AbstractC2812l.isVip("in_favorites", "in_favorites", c0396l, setLicense);
                    } else {
                        zBooleanValue2 = ((Boolean) objLoadAd12).booleanValue();
                    }
                    i2 &= -2049;
                    num = num3;
                    z = z4;
                    z2 = z7;
                    z3 = z8;
                    obj = obj13;
                    break;
                case 12:
                    Object objLoadAd13 = abstractC7188l3.loadAd(c0396l);
                    if (objLoadAd13 == null) {
                        setLicense = AbstractC2812l.isVip("progress_percentage", "progress_percentage", c0396l, setLicense);
                    } else {
                        iIntValue3 = ((Number) objLoadAd13).intValue();
                    }
                    i2 &= -4097;
                    num = num3;
                    z = z4;
                    z2 = z7;
                    z3 = z8;
                    obj = obj13;
                    break;
                case 13:
                    Object objLoadAd14 = abstractC7188l3.loadAd(c0396l);
                    if (objLoadAd14 == null) {
                        setLicense = AbstractC2812l.isVip("release_date", "release_date", c0396l, setLicense);
                    } else {
                        iIntValue4 = ((Number) objLoadAd14).intValue();
                    }
                    i2 &= -8193;
                    num = num3;
                    z = z4;
                    z2 = z7;
                    z3 = z8;
                    obj = obj13;
                    break;
                case 14:
                    Object objLoadAd15 = abstractC7188l4.loadAd(c0396l);
                    if (objLoadAd15 == null) {
                        setLicense = AbstractC2812l.isVip("copyright", "copyright", c0396l, setLicense);
                    } else {
                        obj7 = objLoadAd15;
                    }
                    i2 &= -16385;
                    num = num3;
                    z = z4;
                    z2 = z7;
                    z3 = z8;
                    obj = obj13;
                    break;
                case 15:
                    Object objLoadAd16 = abstractC7188l4.loadAd(c0396l);
                    if (objLoadAd16 == null) {
                        setLicense = AbstractC2812l.isVip("access_status", "access_status", c0396l, setLicense);
                    } else {
                        obj8 = objLoadAd16;
                    }
                    i = -32769;
                    i2 &= i;
                    num = num3;
                    z = z4;
                    z2 = z7;
                    z3 = z8;
                    obj = obj13;
                    break;
                case 16:
                    Object objLoadAd17 = this.mopub.loadAd(c0396l);
                    if (objLoadAd17 == null) {
                        setLicense = AbstractC2812l.isVip("cover", "cover", c0396l, setLicense);
                    } else {
                        obj9 = objLoadAd17;
                    }
                    i = -65537;
                    i2 &= i;
                    num = num3;
                    z = z4;
                    z2 = z7;
                    z3 = z8;
                    obj = obj13;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    Object objLoadAd18 = this.admob.loadAd(c0396l);
                    if (objLoadAd18 == null) {
                        setLicense = AbstractC2812l.isVip("chapters", "chapters", c0396l, setLicense);
                    } else {
                        obj10 = objLoadAd18;
                    }
                    i = -131073;
                    i2 &= i;
                    num = num3;
                    z = z4;
                    z2 = z7;
                    z3 = z8;
                    obj = obj13;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    Object objLoadAd19 = abstractC7188l4.loadAd(c0396l);
                    if (objLoadAd19 == null) {
                        setLicense = AbstractC2812l.isVip("track_code", "track_code", c0396l, setLicense);
                        num = num3;
                        z = z4;
                        z3 = true;
                        z2 = z7;
                    } else {
                        str = (String) objLoadAd19;
                        num = num3;
                        z = z4;
                        z2 = z7;
                        z3 = z8;
                    }
                    obj = obj13;
                    break;
                default:
                    num = num3;
                    z = z4;
                    z2 = z7;
                    z3 = z8;
                    obj = obj13;
                    break;
            }
        }
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioBook)";
    }
}
