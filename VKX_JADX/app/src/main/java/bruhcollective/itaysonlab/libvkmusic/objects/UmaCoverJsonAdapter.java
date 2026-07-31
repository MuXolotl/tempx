package bruhcollective.itaysonlab.libvkmusic.objects;

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

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class UmaCoverJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("avgColor", "accentColor", "url");

    public UmaCoverJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "avgColor");
        this.crashlytics = c12952l.loadAd(String.class, c5746l, "url");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        UmaCover umaCover = (UmaCover) obj;
        c3631l.mopub();
        c3631l.isVip("avgColor");
        String str = umaCover.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("accentColor");
        abstractC7188l.billing(c3631l, umaCover.loadAd);
        c3631l.isVip("url");
        this.crashlytics.billing(c3631l, umaCover.crashlytics);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l != -1) {
                AbstractC7188l abstractC7188l = this.loadAd;
                if (iM503l == 0) {
                    str2 = (String) abstractC7188l.loadAd(c0396l);
                } else if (iM503l == 1) {
                    str3 = (String) abstractC7188l.loadAd(c0396l);
                } else if (iM503l == 2) {
                    Object objLoadAd = this.crashlytics.loadAd(c0396l);
                    if (objLoadAd == null) {
                        setLicense = AbstractC2812l.isVip("url", "url", c0396l, setLicense);
                        z = true;
                    } else {
                        str = (String) objLoadAd;
                    }
                }
            } else {
                c0396l.m502l();
                c0396l.m501l();
            }
        }
        c0396l.ads();
        if ((!z) & (str == null)) {
            setLicense = AbstractC2812l.license("url", "url", c0396l, setLicense);
        }
        if (setLicense.size() == 0) {
            return new UmaCover(str2, str3, str);
        }
        C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
        return null;
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UmaCover)";
    }
}
