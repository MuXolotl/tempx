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
public final class UmaArtistJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l admob;
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l mopub;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("shareHash", "name", "apiId", "avatar", "isAutoGenCover", "isRadioCapable", "isLiked", "relevantArtistsNames", "vkId", "umaTags");

    public UmaArtistJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "shareHash");
        this.crashlytics = c12952l.loadAd(String.class, c5746l, "name");
        this.amazon = c12952l.loadAd(Long.TYPE, c5746l, "apiId");
        this.purchase = c12952l.loadAd(UmaCover.class, c5746l, "avatar");
        this.billing = c12952l.loadAd(Boolean.TYPE, c5746l, "isAutoGenCover");
        this.mopub = c12952l.loadAd(Boolean.class, c5746l, "isRadioCapable");
        this.admob = c12952l.loadAd(AbstractC15639l.mopub(List.class, String.class), c5746l, "relevantArtistsNames");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        UmaArtist umaArtist = (UmaArtist) obj;
        c3631l.mopub();
        c3631l.isVip("shareHash");
        String str = umaArtist.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("name");
        this.crashlytics.billing(c3631l, umaArtist.loadAd);
        c3631l.isVip("apiId");
        AbstractC12589l.m3427throws(umaArtist.crashlytics, this.amazon, c3631l, "avatar");
        this.purchase.billing(c3631l, umaArtist.amazon);
        c3631l.isVip("isAutoGenCover");
        AbstractC12589l.m3428volatile(umaArtist.purchase, this.billing, c3631l, "isRadioCapable");
        Boolean bool = umaArtist.billing;
        AbstractC7188l abstractC7188l2 = this.mopub;
        abstractC7188l2.billing(c3631l, bool);
        c3631l.isVip("isLiked");
        abstractC7188l2.billing(c3631l, umaArtist.mopub);
        c3631l.isVip("relevantArtistsNames");
        this.admob.billing(c3631l, umaArtist.admob);
        c3631l.isVip("vkId");
        abstractC7188l.billing(c3631l, umaArtist.subs);
        c3631l.isVip("umaTags");
        abstractC7188l.billing(c3631l, umaArtist.isPro);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        boolean z = false;
        boolean z2 = false;
        Long l = null;
        String str = null;
        boolean z3 = false;
        boolean z4 = false;
        UmaCover umaCover = null;
        Boolean bool = null;
        String str2 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            boolean z5 = z;
            boolean z6 = z2;
            if (!c0396l.m504package()) {
                Long l2 = l;
                String str5 = str;
                c0396l.ads();
                if ((!z5) & (str5 == null)) {
                    setLicense = AbstractC2812l.license("name", "name", c0396l, setLicense);
                }
                if ((!z6) & (l2 == null)) {
                    setLicense = AbstractC2812l.license("apiId", "apiId", c0396l, setLicense);
                }
                if ((!z3) & (umaCover == null)) {
                    setLicense = AbstractC2812l.license("avatar", "avatar", c0396l, setLicense);
                }
                if ((!z4) & (bool == null)) {
                    setLicense = AbstractC2812l.license("isAutoGenCover", "isAutoGenCover", c0396l, setLicense);
                }
                if (setLicense.size() == 0) {
                    return new UmaArtist(str2, str5, l2.longValue(), umaCover, bool.booleanValue(), bool2, bool3, list, str3, str4);
                }
                C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
                return null;
            }
            Long l3 = l;
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.mopub;
            String str6 = str;
            AbstractC7188l abstractC7188l2 = this.loadAd;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    l = l3;
                    z = z5;
                    z2 = z6;
                    str = str6;
                    break;
                case 0:
                    str2 = (String) abstractC7188l2.loadAd(c0396l);
                    l = l3;
                    z = z5;
                    z2 = z6;
                    str = str6;
                    break;
                case 1:
                    Object objLoadAd = this.crashlytics.loadAd(c0396l);
                    if (objLoadAd != null) {
                        str = (String) objLoadAd;
                        l = l3;
                        z = z5;
                        z2 = z6;
                    } else {
                        setLicense = AbstractC2812l.isVip("name", "name", c0396l, setLicense);
                        l = l3;
                        z2 = z6;
                        z = true;
                        str = str6;
                    }
                    break;
                case 2:
                    Object objLoadAd2 = this.amazon.loadAd(c0396l);
                    if (objLoadAd2 == null) {
                        setLicense = AbstractC2812l.isVip("apiId", "apiId", c0396l, setLicense);
                        l = l3;
                        z = z5;
                        z2 = true;
                    } else {
                        l = (Long) objLoadAd2;
                        z = z5;
                        z2 = z6;
                    }
                    str = str6;
                    break;
                case 3:
                    Object objLoadAd3 = this.purchase.loadAd(c0396l);
                    if (objLoadAd3 == null) {
                        setLicense = AbstractC2812l.isVip("avatar", "avatar", c0396l, setLicense);
                        l = l3;
                        z = z5;
                        z2 = z6;
                        z3 = true;
                    } else {
                        umaCover = (UmaCover) objLoadAd3;
                        l = l3;
                        z = z5;
                        z2 = z6;
                    }
                    str = str6;
                    break;
                case 4:
                    Object objLoadAd4 = this.billing.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setLicense = AbstractC2812l.isVip("isAutoGenCover", "isAutoGenCover", c0396l, setLicense);
                        l = l3;
                        z = z5;
                        z2 = z6;
                        z4 = true;
                    } else {
                        bool = (Boolean) objLoadAd4;
                        l = l3;
                        z = z5;
                        z2 = z6;
                    }
                    str = str6;
                    break;
                case 5:
                    bool2 = (Boolean) abstractC7188l.loadAd(c0396l);
                    l = l3;
                    z = z5;
                    z2 = z6;
                    str = str6;
                    break;
                case 6:
                    bool3 = (Boolean) abstractC7188l.loadAd(c0396l);
                    l = l3;
                    z = z5;
                    z2 = z6;
                    str = str6;
                    break;
                case 7:
                    list = (List) this.admob.loadAd(c0396l);
                    l = l3;
                    z = z5;
                    z2 = z6;
                    str = str6;
                    break;
                case 8:
                    str3 = (String) abstractC7188l2.loadAd(c0396l);
                    l = l3;
                    z = z5;
                    z2 = z6;
                    str = str6;
                    break;
                case 9:
                    str4 = (String) abstractC7188l2.loadAd(c0396l);
                    l = l3;
                    z = z5;
                    z2 = z6;
                    str = str6;
                    break;
                default:
                    l = l3;
                    z = z5;
                    z2 = z6;
                    str = str6;
                    break;
            }
        }
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UmaArtist)";
    }
}
