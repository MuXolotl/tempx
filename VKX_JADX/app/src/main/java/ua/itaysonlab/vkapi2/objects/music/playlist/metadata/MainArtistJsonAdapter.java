package ua.itaysonlab.vkapi2.objects.music.playlist.metadata;

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
public final class MainArtistJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("id", "domain", "name", "photo", "is_cached");

    public MainArtistJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "id");
        this.crashlytics = c12952l.loadAd(String.class, c5746l, "name");
        this.amazon = c12952l.loadAd(AbstractC15639l.mopub(List.class, CustomCatalogBlockItemPhoto.class), c5746l, "photo");
        this.purchase = c12952l.loadAd(Boolean.TYPE, c5746l, "is_cached");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        MainArtist mainArtist = (MainArtist) obj;
        c3631l.mopub();
        c3631l.isVip("id");
        String str = mainArtist.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("domain");
        abstractC7188l.billing(c3631l, mainArtist.loadAd);
        c3631l.isVip("name");
        this.crashlytics.billing(c3631l, mainArtist.crashlytics);
        c3631l.isVip("photo");
        this.amazon.billing(c3631l, mainArtist.amazon);
        c3631l.isVip("is_cached");
        this.purchase.billing(c3631l, Boolean.valueOf(mainArtist.purchase));
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        boolean z = false;
        boolean zBooleanValue = false;
        int i = -1;
        Object objLoadAd = null;
        String str = null;
        Object objLoadAd2 = null;
        String str2 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l != -1) {
                AbstractC7188l abstractC7188l = this.loadAd;
                if (iM503l == 0) {
                    str = (String) abstractC7188l.loadAd(c0396l);
                } else if (iM503l == 1) {
                    objLoadAd = abstractC7188l.loadAd(c0396l);
                    i &= -3;
                } else if (iM503l == 2) {
                    Object objLoadAd3 = this.crashlytics.loadAd(c0396l);
                    if (objLoadAd3 == null) {
                        setLicense = AbstractC2812l.isVip("name", "name", c0396l, setLicense);
                        z = true;
                    } else {
                        str2 = (String) objLoadAd3;
                    }
                } else if (iM503l == 3) {
                    objLoadAd2 = this.amazon.loadAd(c0396l);
                    i &= -9;
                } else if (iM503l == 4) {
                    Object objLoadAd4 = this.purchase.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setLicense = AbstractC2812l.isVip("is_cached", "is_cached", c0396l, setLicense);
                    } else {
                        zBooleanValue = ((Boolean) objLoadAd4).booleanValue();
                    }
                    i &= -17;
                }
            } else {
                c0396l.m502l();
                c0396l.m501l();
            }
        }
        c0396l.ads();
        if ((!z) & (str2 == null)) {
            setLicense = AbstractC2812l.license("name", "name", c0396l, setLicense);
        }
        if (setLicense.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
            return null;
        }
        Object obj = objLoadAd;
        if (i == -27) {
            return new MainArtist(str, (String) obj, str2, (List) objLoadAd2, zBooleanValue);
        }
        return new MainArtist(str, (String) obj, str2, (List) objLoadAd2, zBooleanValue, i);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(MainArtist)";
    }
}
