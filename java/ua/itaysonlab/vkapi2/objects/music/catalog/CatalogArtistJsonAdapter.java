package ua.itaysonlab.vkapi2.objects.music.catalog;

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
import defpackage.C3631l;
import defpackage.C5746l;
import defpackage.C8413l;
import java.io.EOFException;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.Genre;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class CatalogArtistJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l mopub;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("name", "id", "domain", "photo", "photos", "genres", "is_album_cover", "is_followed", "can_follow", "bio");

    public CatalogArtistJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "name");
        this.crashlytics = c12952l.loadAd(String.class, c5746l, "domain");
        this.amazon = c12952l.loadAd(AbstractC15639l.mopub(List.class, CustomCatalogBlockItemPhoto.class), c5746l, "photo");
        this.purchase = c12952l.loadAd(AbstractC15639l.mopub(List.class, CatalogArtistPhotosContainer.class), c5746l, "photos");
        this.billing = c12952l.loadAd(AbstractC15639l.mopub(List.class, Genre.class), c5746l, "genres");
        this.mopub = c12952l.loadAd(Boolean.TYPE, c5746l, "is_album_cover");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        CatalogArtist catalogArtist = (CatalogArtist) obj;
        c3631l.mopub();
        c3631l.isVip("name");
        String str = catalogArtist.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("id");
        abstractC7188l.billing(c3631l, catalogArtist.loadAd);
        c3631l.isVip("domain");
        this.crashlytics.billing(c3631l, catalogArtist.crashlytics);
        c3631l.isVip("photo");
        this.amazon.billing(c3631l, catalogArtist.amazon);
        c3631l.isVip("photos");
        this.purchase.billing(c3631l, catalogArtist.purchase);
        c3631l.isVip("genres");
        this.billing.billing(c3631l, catalogArtist.billing);
        c3631l.isVip("is_album_cover");
        boolean z = catalogArtist.mopub;
        AbstractC7188l abstractC7188l2 = this.mopub;
        AbstractC12589l.m3428volatile(z, abstractC7188l2, c3631l, "is_followed");
        AbstractC12589l.m3428volatile(catalogArtist.admob, abstractC7188l2, c3631l, "can_follow");
        AbstractC12589l.m3428volatile(catalogArtist.subs, abstractC7188l2, c3631l, "bio");
        abstractC7188l.billing(c3631l, catalogArtist.isPro);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        int i = -1;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        boolean zBooleanValue3 = false;
        Object obj = null;
        while (true) {
            if (!c0396l.m504package()) {
                boolean z3 = z2;
                c0396l.ads();
                if ((!z) & (str == null)) {
                    setLicense = AbstractC2812l.license("name", "name", c0396l, setLicense);
                }
                if ((!z3) & (str2 == null)) {
                    setLicense = AbstractC2812l.license("id", "id", c0396l, setLicense);
                }
                if (setLicense.size() != 0) {
                    C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
                    return null;
                }
                String str4 = (String) obj;
                if (i == -961) {
                    return new CatalogArtist(str, str2, str3, list, list2, list3, zBooleanValue, zBooleanValue2, zBooleanValue3, str4);
                }
                if ((i & 64) != 0) {
                    zBooleanValue = false;
                }
                if ((i & 128) != 0) {
                    zBooleanValue2 = false;
                }
                if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    zBooleanValue3 = false;
                }
                if ((i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    str4 = "";
                }
                return new CatalogArtist(str, str2, str3, list, list2, list3, zBooleanValue, zBooleanValue2, zBooleanValue3, str4);
            }
            boolean z4 = z;
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.mopub;
            boolean z5 = z2;
            AbstractC7188l abstractC7188l2 = this.loadAd;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    z = z4;
                    z2 = z5;
                    break;
                case 0:
                    Object objLoadAd = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd == null) {
                        setLicense = AbstractC2812l.isVip("name", "name", c0396l, setLicense);
                        z = true;
                    } else {
                        str = (String) objLoadAd;
                        z = z4;
                    }
                    z2 = z5;
                    break;
                case 1:
                    Object objLoadAd2 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd2 != null) {
                        str2 = (String) objLoadAd2;
                        z = z4;
                        z2 = z5;
                    } else {
                        setLicense = AbstractC2812l.isVip("id", "id", c0396l, setLicense);
                        z = z4;
                        z2 = true;
                    }
                    break;
                case 2:
                    str3 = (String) this.crashlytics.loadAd(c0396l);
                    z = z4;
                    z2 = z5;
                    break;
                case 3:
                    list = (List) this.amazon.loadAd(c0396l);
                    z = z4;
                    z2 = z5;
                    break;
                case 4:
                    list2 = (List) this.purchase.loadAd(c0396l);
                    z = z4;
                    z2 = z5;
                    break;
                case 5:
                    list3 = (List) this.billing.loadAd(c0396l);
                    z = z4;
                    z2 = z5;
                    break;
                case 6:
                    Object objLoadAd3 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd3 == null) {
                        setLicense = AbstractC2812l.isVip("is_album_cover", "is_album_cover", c0396l, setLicense);
                    } else {
                        zBooleanValue = ((Boolean) objLoadAd3).booleanValue();
                    }
                    i &= -65;
                    z = z4;
                    z2 = z5;
                    break;
                case 7:
                    Object objLoadAd4 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setLicense = AbstractC2812l.isVip("is_followed", "is_followed", c0396l, setLicense);
                    } else {
                        zBooleanValue2 = ((Boolean) objLoadAd4).booleanValue();
                    }
                    i &= -129;
                    z = z4;
                    z2 = z5;
                    break;
                case 8:
                    Object objLoadAd5 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd5 == null) {
                        setLicense = AbstractC2812l.isVip("can_follow", "can_follow", c0396l, setLicense);
                    } else {
                        zBooleanValue3 = ((Boolean) objLoadAd5).booleanValue();
                    }
                    i &= -257;
                    z = z4;
                    z2 = z5;
                    break;
                case 9:
                    Object objLoadAd6 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd6 == null) {
                        setLicense = AbstractC2812l.isVip("bio", "bio", c0396l, setLicense);
                    } else {
                        obj = objLoadAd6;
                    }
                    i &= -513;
                    z = z4;
                    z2 = z5;
                    break;
                default:
                    z = z4;
                    z2 = z5;
                    break;
            }
        }
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CatalogArtist)";
    }
}
