package bruhcollective.itaysonlab.libvkmusic.objects;

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
public final class RadioClusterJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("clusterId", "cover", "artists", "tags", "name");

    public RadioClusterJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "clusterId");
        this.crashlytics = c12952l.loadAd(UmaCover.class, c5746l, "cover");
        this.amazon = c12952l.loadAd(AbstractC15639l.mopub(List.class, UmaArtist.class), c5746l, "artists");
        this.purchase = c12952l.loadAd(AbstractC15639l.mopub(List.class, UmaTag.class), c5746l, "tags");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        RadioCluster radioCluster = (RadioCluster) obj;
        c3631l.mopub();
        c3631l.isVip("clusterId");
        String str = radioCluster.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("cover");
        this.crashlytics.billing(c3631l, radioCluster.loadAd);
        c3631l.isVip("artists");
        this.amazon.billing(c3631l, radioCluster.crashlytics);
        c3631l.isVip("tags");
        this.purchase.billing(c3631l, radioCluster.amazon);
        c3631l.isVip("name");
        abstractC7188l.billing(c3631l, radioCluster.purchase);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        boolean z;
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        UmaCover umaCover = null;
        boolean z4 = false;
        List list = null;
        String str2 = null;
        List list2 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l != -1) {
                AbstractC7188l abstractC7188l = this.loadAd;
                if (iM503l != 0) {
                    z = z2;
                    if (iM503l == 1) {
                        Object objLoadAd = this.crashlytics.loadAd(c0396l);
                        if (objLoadAd == null) {
                            setLicense = AbstractC2812l.isVip("cover", "cover", c0396l, setLicense);
                            z2 = z;
                            z3 = true;
                        } else {
                            umaCover = (UmaCover) objLoadAd;
                        }
                    } else if (iM503l == 2) {
                        list = (List) this.amazon.loadAd(c0396l);
                    } else if (iM503l == 3) {
                        list2 = (List) this.purchase.loadAd(c0396l);
                    } else if (iM503l == 4) {
                        Object objLoadAd2 = abstractC7188l.loadAd(c0396l);
                        if (objLoadAd2 == null) {
                            setLicense = AbstractC2812l.isVip("name", "name", c0396l, setLicense);
                            z2 = z;
                            z4 = true;
                        } else {
                            str2 = (String) objLoadAd2;
                        }
                    }
                } else {
                    z = z2;
                    Object objLoadAd3 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd3 == null) {
                        setLicense = AbstractC2812l.isVip("clusterId", "clusterId", c0396l, setLicense);
                        z2 = true;
                    } else {
                        str = (String) objLoadAd3;
                    }
                }
            } else {
                z = z2;
                c0396l.m502l();
                c0396l.m501l();
            }
            z2 = z;
        }
        c0396l.ads();
        if ((!z2) & (str == null)) {
            setLicense = AbstractC2812l.license("clusterId", "clusterId", c0396l, setLicense);
        }
        if ((!z3) & (umaCover == null)) {
            setLicense = AbstractC2812l.license("cover", "cover", c0396l, setLicense);
        }
        if ((!z4) & (str2 == null)) {
            setLicense = AbstractC2812l.license("name", "name", c0396l, setLicense);
        }
        if (setLicense.size() == 0) {
            return new RadioCluster(str, umaCover, list, list2, str2);
        }
        C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
        return null;
    }

    public final String toString() {
        return "GeneratedJsonAdapter(RadioCluster)";
    }
}
