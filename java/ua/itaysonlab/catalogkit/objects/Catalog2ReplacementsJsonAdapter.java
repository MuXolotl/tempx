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
import defpackage.C5693l;
import defpackage.C5746l;
import defpackage.C8413l;
import java.io.EOFException;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class Catalog2ReplacementsJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("replacements", "new_next_from");

    public Catalog2ReplacementsJsonAdapter(C12952l c12952l) {
        C5693l c5693lMopub = AbstractC15639l.mopub(List.class, Catalog2Replacement.class);
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(c5693lMopub, c5746l, "replacements");
        this.crashlytics = c12952l.loadAd(String.class, c5746l, "new_next_from");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        Catalog2Replacements catalog2Replacements = (Catalog2Replacements) obj;
        c3631l.mopub();
        c3631l.isVip("replacements");
        this.loadAd.billing(c3631l, catalog2Replacements.yandex);
        c3631l.isVip("new_next_from");
        this.crashlytics.billing(c3631l, catalog2Replacements.loadAd);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        List list = null;
        String str = null;
        boolean z = false;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l == -1) {
                c0396l.m502l();
                c0396l.m501l();
            } else if (iM503l == 0) {
                Object objLoadAd = this.loadAd.loadAd(c0396l);
                if (objLoadAd == null) {
                    setLicense = AbstractC2812l.isVip("replacements", "replacements", c0396l, setLicense);
                    z = true;
                } else {
                    list = (List) objLoadAd;
                }
            } else if (iM503l == 1) {
                str = (String) this.crashlytics.loadAd(c0396l);
            }
        }
        c0396l.ads();
        if ((!z) & (list == null)) {
            setLicense = AbstractC2812l.license("replacements", "replacements", c0396l, setLicense);
        }
        if (setLicense.size() == 0) {
            return new Catalog2Replacements(list, str);
        }
        C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
        return null;
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Catalog2Replacements)";
    }
}
