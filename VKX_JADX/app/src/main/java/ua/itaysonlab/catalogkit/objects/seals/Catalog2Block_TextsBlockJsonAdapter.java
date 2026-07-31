package ua.itaysonlab.catalogkit.objects.seals;

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
import ua.itaysonlab.catalogkit.objects.Catalog2Button;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class Catalog2Block_TextsBlockJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("id", "layout", "actions", "next_from", "listen_events", "text_ids");

    public Catalog2Block_TextsBlockJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "id");
        this.crashlytics = c12952l.loadAd(Catalog2Layout.class, c5746l, "layout");
        this.amazon = c12952l.loadAd(AbstractC15639l.mopub(List.class, Catalog2Button.class), c5746l, "actions");
        this.purchase = c12952l.loadAd(String.class, c5746l, "next_from");
        this.billing = c12952l.loadAd(AbstractC15639l.mopub(List.class, String.class), c5746l, "listen_events");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        Catalog2Block.TextsBlock textsBlock = (Catalog2Block.TextsBlock) obj;
        c3631l.mopub();
        c3631l.isVip("id");
        this.loadAd.billing(c3631l, textsBlock.yandex);
        c3631l.isVip("layout");
        this.crashlytics.billing(c3631l, textsBlock.loadAd);
        c3631l.isVip("actions");
        this.amazon.billing(c3631l, textsBlock.crashlytics);
        c3631l.isVip("next_from");
        this.purchase.billing(c3631l, textsBlock.amazon);
        c3631l.isVip("listen_events");
        List list = textsBlock.purchase;
        AbstractC7188l abstractC7188l = this.billing;
        abstractC7188l.billing(c3631l, list);
        c3631l.isVip("text_ids");
        abstractC7188l.billing(c3631l, textsBlock.billing);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        int i = -1;
        boolean z = false;
        String str = null;
        boolean z2 = false;
        Object objLoadAd = null;
        Object objLoadAd2 = null;
        Object objLoadAd3 = null;
        Catalog2Layout catalog2Layout = null;
        Object objLoadAd4 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.billing;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    break;
                case 0:
                    Object objLoadAd5 = this.loadAd.loadAd(c0396l);
                    if (objLoadAd5 != null) {
                        str = (String) objLoadAd5;
                    } else {
                        setLicense = AbstractC2812l.isVip("id", "id", c0396l, setLicense);
                        z = true;
                    }
                    break;
                case 1:
                    Object objLoadAd6 = this.crashlytics.loadAd(c0396l);
                    if (objLoadAd6 != null) {
                        catalog2Layout = (Catalog2Layout) objLoadAd6;
                    } else {
                        setLicense = AbstractC2812l.isVip("layout", "layout", c0396l, setLicense);
                        z2 = true;
                    }
                    break;
                case 2:
                    objLoadAd = this.amazon.loadAd(c0396l);
                    i &= -5;
                    break;
                case 3:
                    objLoadAd2 = this.purchase.loadAd(c0396l);
                    i &= -9;
                    break;
                case 4:
                    objLoadAd3 = abstractC7188l.loadAd(c0396l);
                    i &= -17;
                    break;
                case 5:
                    objLoadAd4 = abstractC7188l.loadAd(c0396l);
                    i &= -33;
                    break;
            }
        }
        c0396l.ads();
        if ((!z) & (str == null)) {
            setLicense = AbstractC2812l.license("id", "id", c0396l, setLicense);
        }
        if ((!z2) & (catalog2Layout == null)) {
            setLicense = AbstractC2812l.license("layout", "layout", c0396l, setLicense);
        }
        if (setLicense.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
            return null;
        }
        String str2 = str;
        if (i == -61) {
            return new Catalog2Block.TextsBlock(str2, (String) objLoadAd2, (List) objLoadAd, (List) objLoadAd3, (List) objLoadAd4, catalog2Layout);
        }
        return new Catalog2Block.TextsBlock(i, str, (String) objLoadAd2, (List) objLoadAd, (List) objLoadAd3, (List) objLoadAd4, catalog2Layout);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Catalog2Block.TextsBlock)";
    }
}
