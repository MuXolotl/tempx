package bruhcollective.itaysonlab.libvkmusic.objects;

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
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class UmaAlbumJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("name", "apiId", "cover", "artists", "tags");

    public UmaAlbumJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "name");
        this.crashlytics = c12952l.loadAd(Long.TYPE, c5746l, "apiId");
        this.amazon = c12952l.loadAd(UmaCover.class, c5746l, "cover");
        this.purchase = c12952l.loadAd(AbstractC15639l.mopub(List.class, UmaArtist.class), c5746l, "artists");
        this.billing = c12952l.loadAd(AbstractC15639l.mopub(List.class, UmaTag.class), c5746l, "tags");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        UmaAlbum umaAlbum = (UmaAlbum) obj;
        c3631l.mopub();
        c3631l.isVip("name");
        this.loadAd.billing(c3631l, umaAlbum.yandex);
        c3631l.isVip("apiId");
        AbstractC12589l.m3427throws(umaAlbum.loadAd, this.crashlytics, c3631l, "cover");
        this.amazon.billing(c3631l, umaAlbum.crashlytics);
        c3631l.isVip("artists");
        this.purchase.billing(c3631l, umaAlbum.amazon);
        c3631l.isVip("tags");
        this.billing.billing(c3631l, umaAlbum.purchase);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        boolean z;
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        boolean z2 = false;
        int i = -1;
        boolean z3 = false;
        String str = null;
        Long l = null;
        boolean z4 = false;
        UmaCover umaCover = null;
        Object objLoadAd = null;
        Object objLoadAd2 = null;
        while (true) {
            z = z2;
            if (!c0396l.m504package()) {
                break;
            }
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l == -1) {
                c0396l.m502l();
                c0396l.m501l();
            } else if (iM503l == 0) {
                Object objLoadAd3 = this.loadAd.loadAd(c0396l);
                if (objLoadAd3 == null) {
                    setLicense = AbstractC2812l.isVip("name", "name", c0396l, setLicense);
                    z2 = true;
                } else {
                    str = (String) objLoadAd3;
                }
            } else if (iM503l == 1) {
                Object objLoadAd4 = this.crashlytics.loadAd(c0396l);
                if (objLoadAd4 == null) {
                    setLicense = AbstractC2812l.isVip("apiId", "apiId", c0396l, setLicense);
                    z2 = z;
                    z3 = true;
                } else {
                    l = (Long) objLoadAd4;
                }
            } else if (iM503l == 2) {
                Object objLoadAd5 = this.amazon.loadAd(c0396l);
                if (objLoadAd5 == null) {
                    setLicense = AbstractC2812l.isVip("cover", "cover", c0396l, setLicense);
                    z2 = z;
                    z4 = true;
                } else {
                    umaCover = (UmaCover) objLoadAd5;
                }
            } else if (iM503l == 3) {
                objLoadAd = this.purchase.loadAd(c0396l);
                i &= -9;
            } else if (iM503l == 4) {
                objLoadAd2 = this.billing.loadAd(c0396l);
                i &= -17;
            }
            z2 = z;
        }
        c0396l.ads();
        if ((!z) & (str == null)) {
            setLicense = AbstractC2812l.license("name", "name", c0396l, setLicense);
        }
        if ((!z3) & (l == null)) {
            setLicense = AbstractC2812l.license("apiId", "apiId", c0396l, setLicense);
        }
        if ((!z4) & (umaCover == null)) {
            setLicense = AbstractC2812l.license("cover", "cover", c0396l, setLicense);
        }
        if (setLicense.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
            return null;
        }
        long jLongValue = l.longValue();
        List list = (List) objLoadAd;
        List list2 = (List) objLoadAd2;
        if (i == -25) {
            return new UmaAlbum(str, jLongValue, umaCover, list, list2);
        }
        int i2 = i & 8;
        C2580l c2580l = C2580l.f5619l;
        if (i2 != 0) {
            list = c2580l;
        }
        if ((i & 16) != 0) {
            list2 = c2580l;
        }
        return new UmaAlbum(str, jLongValue, umaCover, list, list2);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UmaAlbum)";
    }
}
