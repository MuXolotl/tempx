package ua.itaysonlab.catalogkit.objects;

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
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class Catalog2SectionJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("id", "title", "next_from", "blocks", "actions");

    public Catalog2SectionJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "id");
        this.crashlytics = c12952l.loadAd(String.class, c5746l, "next_from");
        this.amazon = c12952l.loadAd(AbstractC15639l.mopub(List.class, Catalog2Block.class), c5746l, "blocks");
        this.purchase = c12952l.loadAd(AbstractC15639l.mopub(List.class, Catalog2Button.class), c5746l, "actions");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        Catalog2Section catalog2Section = (Catalog2Section) obj;
        c3631l.mopub();
        c3631l.isVip("id");
        String str = catalog2Section.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("title");
        abstractC7188l.billing(c3631l, catalog2Section.loadAd);
        c3631l.isVip("next_from");
        this.crashlytics.billing(c3631l, catalog2Section.crashlytics);
        c3631l.isVip("blocks");
        this.amazon.billing(c3631l, catalog2Section.amazon);
        c3631l.isVip("actions");
        this.purchase.billing(c3631l, catalog2Section.purchase);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        int i = -1;
        int i2 = -1;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        Object objLoadAd = null;
        Object objLoadAd2 = null;
        Object objLoadAd3 = null;
        while (true) {
            if (!c0396l.m504package()) {
                break;
            }
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l != i) {
                AbstractC7188l abstractC7188l = this.loadAd;
                if (iM503l == 0) {
                    Object objLoadAd4 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setLicense = AbstractC2812l.isVip("id", "id", c0396l, setLicense);
                        z = true;
                    } else {
                        str = (String) objLoadAd4;
                    }
                } else if (iM503l == 1) {
                    Object objLoadAd5 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd5 == null) {
                        setLicense = AbstractC2812l.isVip("title", "title", c0396l, setLicense);
                        z2 = true;
                    } else {
                        str2 = (String) objLoadAd5;
                    }
                } else if (iM503l == 2) {
                    objLoadAd = this.crashlytics.loadAd(c0396l);
                    i2 &= -5;
                } else if (iM503l == 3) {
                    objLoadAd2 = this.amazon.loadAd(c0396l);
                    i2 &= -9;
                } else if (iM503l == 4) {
                    objLoadAd3 = this.purchase.loadAd(c0396l);
                    i2 &= -17;
                }
            } else {
                c0396l.m502l();
                c0396l.m501l();
            }
            i = -1;
        }
        c0396l.ads();
        if ((!z) & (str == null)) {
            setLicense = AbstractC2812l.license("id", "id", c0396l, setLicense);
        }
        if ((!z2) & (str2 == null)) {
            setLicense = AbstractC2812l.license("title", "title", c0396l, setLicense);
        }
        if (setLicense.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
            return null;
        }
        String str3 = (String) objLoadAd;
        List list = (List) objLoadAd2;
        List list2 = (List) objLoadAd3;
        return i2 == -29 ? new Catalog2Section(str, str2, str3, list, list2) : new Catalog2Section(str, str2, str3, list, list2, i2);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Catalog2Section)";
    }
}
