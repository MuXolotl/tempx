package ua.itaysonlab.vkapi2.objects.music;

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
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class ArtistInfo_ChipJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("action", "track_code", "title", "icon", "mix_id", "entity_id", "block_id");

    public ArtistInfo_ChipJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(Catalog2ButtonAction.class, c5746l, "action");
        this.crashlytics = c12952l.loadAd(String.class, c5746l, "track_code");
        this.amazon = c12952l.loadAd(String.class, c5746l, "title");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        ArtistInfo.Chip chip = (ArtistInfo.Chip) obj;
        c3631l.mopub();
        c3631l.isVip("action");
        this.loadAd.billing(c3631l, chip.yandex);
        c3631l.isVip("track_code");
        this.crashlytics.billing(c3631l, chip.loadAd);
        c3631l.isVip("title");
        String str = chip.crashlytics;
        AbstractC7188l abstractC7188l = this.amazon;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("icon");
        abstractC7188l.billing(c3631l, chip.amazon);
        c3631l.isVip("mix_id");
        abstractC7188l.billing(c3631l, chip.purchase);
        c3631l.isVip("entity_id");
        abstractC7188l.billing(c3631l, chip.billing);
        c3631l.isVip("block_id");
        abstractC7188l.billing(c3631l, chip.mopub);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        int i = -1;
        boolean z = false;
        boolean z2 = false;
        Catalog2ButtonAction catalog2ButtonAction = null;
        Object objLoadAd = null;
        String str = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            boolean z3 = z;
            AbstractC7188l abstractC7188l = this.amazon;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    z = z3;
                    break;
                case 0:
                    Object objLoadAd2 = this.loadAd.loadAd(c0396l);
                    if (objLoadAd2 != null) {
                        catalog2ButtonAction = (Catalog2ButtonAction) objLoadAd2;
                        z = z3;
                    } else {
                        setLicense = AbstractC2812l.isVip("action", "action", c0396l, setLicense);
                        z = true;
                    }
                    break;
                case 1:
                    objLoadAd = this.crashlytics.loadAd(c0396l);
                    i &= -3;
                    z = z3;
                    break;
                case 2:
                    Object objLoadAd3 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd3 == null) {
                        setLicense = AbstractC2812l.isVip("title", "title", c0396l, setLicense);
                        z2 = true;
                    } else {
                        str = (String) objLoadAd3;
                    }
                    z = z3;
                    break;
                case 3:
                    Object objLoadAd4 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setLicense = AbstractC2812l.isVip("icon", "icon", c0396l, setLicense);
                    } else {
                        obj = objLoadAd4;
                    }
                    i &= -9;
                    z = z3;
                    break;
                case 4:
                    Object objLoadAd5 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd5 == null) {
                        setLicense = AbstractC2812l.isVip("mix_id", "mix_id", c0396l, setLicense);
                    } else {
                        obj2 = objLoadAd5;
                    }
                    i &= -17;
                    z = z3;
                    break;
                case 5:
                    Object objLoadAd6 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd6 == null) {
                        setLicense = AbstractC2812l.isVip("entity_id", "entity_id", c0396l, setLicense);
                    } else {
                        obj3 = objLoadAd6;
                    }
                    i &= -33;
                    z = z3;
                    break;
                case 6:
                    Object objLoadAd7 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd7 == null) {
                        setLicense = AbstractC2812l.isVip("block_id", "block_id", c0396l, setLicense);
                    } else {
                        obj4 = objLoadAd7;
                    }
                    i &= -65;
                    z = z3;
                    break;
                default:
                    z = z3;
                    break;
            }
        }
        c0396l.ads();
        if ((!z) & (catalog2ButtonAction == null)) {
            setLicense = AbstractC2812l.license("action", "action", c0396l, setLicense);
        }
        if ((!z2) & (str == null)) {
            setLicense = AbstractC2812l.license("title", "title", c0396l, setLicense);
        }
        if (setLicense.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
            return null;
        }
        String str2 = (String) objLoadAd;
        String str3 = (String) obj;
        String str4 = (String) obj2;
        String str5 = (String) obj3;
        String str6 = (String) obj4;
        if (i == -123) {
            return new ArtistInfo.Chip(catalog2ButtonAction, str2, str, str3, str4, str5, str6);
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 16) != 0) {
            str4 = "";
        }
        if ((i & 32) != 0) {
            str5 = "";
        }
        if ((i & 64) != 0) {
            str6 = "";
        }
        return new ArtistInfo.Chip(catalog2ButtonAction, str2, str, str3, str4, str5, str6);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ArtistInfo.Chip)";
    }
}
