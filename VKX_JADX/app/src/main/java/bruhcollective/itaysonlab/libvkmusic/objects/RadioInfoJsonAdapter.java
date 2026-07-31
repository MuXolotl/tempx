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
import defpackage.C5693l;
import defpackage.C5746l;
import defpackage.C8413l;
import java.io.EOFException;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class RadioInfoJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l admob;
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l isPro;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l mopub;
    public final AbstractC7188l purchase;
    public final AbstractC7188l subs;
    public final C0458l yandex = C0458l.m547strictfp("tracks", "apiId", "currentCluster", "clusters", "currentClusterId", "artist", "tag", "album", "track");

    public RadioInfoJsonAdapter(C12952l c12952l) {
        C5693l c5693lMopub = AbstractC15639l.mopub(List.class, UmaTrack.class);
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(c5693lMopub, c5746l, "tracks");
        this.crashlytics = c12952l.loadAd(String.class, c5746l, "apiId");
        this.amazon = c12952l.loadAd(RadioCluster.class, c5746l, "currentCluster");
        this.purchase = c12952l.loadAd(AbstractC15639l.mopub(List.class, RadioCluster.class), c5746l, "clusters");
        this.billing = c12952l.loadAd(String.class, c5746l, "currentClusterId");
        this.mopub = c12952l.loadAd(UmaArtist.class, c5746l, "artist");
        this.admob = c12952l.loadAd(UmaTag.class, c5746l, "tag");
        this.subs = c12952l.loadAd(UmaAlbum.class, c5746l, "album");
        this.isPro = c12952l.loadAd(UmaTrack.class, c5746l, "track");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        RadioInfo radioInfo = (RadioInfo) obj;
        c3631l.mopub();
        c3631l.isVip("tracks");
        this.loadAd.billing(c3631l, radioInfo.yandex);
        c3631l.isVip("apiId");
        this.crashlytics.billing(c3631l, radioInfo.loadAd);
        c3631l.isVip("currentCluster");
        this.amazon.billing(c3631l, radioInfo.crashlytics);
        c3631l.isVip("clusters");
        this.purchase.billing(c3631l, radioInfo.amazon);
        c3631l.isVip("currentClusterId");
        this.billing.billing(c3631l, radioInfo.purchase);
        c3631l.isVip("artist");
        this.mopub.billing(c3631l, radioInfo.billing);
        c3631l.isVip("tag");
        this.admob.billing(c3631l, radioInfo.mopub);
        c3631l.isVip("album");
        this.subs.billing(c3631l, radioInfo.admob);
        c3631l.isVip("track");
        this.isPro.billing(c3631l, radioInfo.subs);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        boolean z = false;
        boolean z2 = false;
        List list = null;
        String str = null;
        RadioCluster radioCluster = null;
        List list2 = null;
        String str2 = null;
        UmaArtist umaArtist = null;
        UmaTag umaTag = null;
        UmaAlbum umaAlbum = null;
        UmaTrack umaTrack = null;
        while (c0396l.m504package()) {
            boolean z3 = z;
            switch (c0396l.m503l(this.yandex)) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    z = z3;
                    break;
                case 0:
                    Object objLoadAd = this.loadAd.loadAd(c0396l);
                    if (objLoadAd != null) {
                        list = (List) objLoadAd;
                        z = z3;
                    } else {
                        setLicense = AbstractC2812l.isVip("tracks", "tracks", c0396l, setLicense);
                        z = true;
                    }
                    break;
                case 1:
                    Object objLoadAd2 = this.crashlytics.loadAd(c0396l);
                    if (objLoadAd2 != null) {
                        str = (String) objLoadAd2;
                        z = z3;
                    } else {
                        setLicense = AbstractC2812l.isVip("apiId", "apiId", c0396l, setLicense);
                        z = z3;
                        z2 = true;
                    }
                    break;
                case 2:
                    radioCluster = (RadioCluster) this.amazon.loadAd(c0396l);
                    z = z3;
                    break;
                case 3:
                    list2 = (List) this.purchase.loadAd(c0396l);
                    z = z3;
                    break;
                case 4:
                    str2 = (String) this.billing.loadAd(c0396l);
                    z = z3;
                    break;
                case 5:
                    umaArtist = (UmaArtist) this.mopub.loadAd(c0396l);
                    z = z3;
                    break;
                case 6:
                    umaTag = (UmaTag) this.admob.loadAd(c0396l);
                    z = z3;
                    break;
                case 7:
                    umaAlbum = (UmaAlbum) this.subs.loadAd(c0396l);
                    z = z3;
                    break;
                case 8:
                    umaTrack = (UmaTrack) this.isPro.loadAd(c0396l);
                    z = z3;
                    break;
                default:
                    z = z3;
                    break;
            }
        }
        c0396l.ads();
        if ((!z) & (list == null)) {
            setLicense = AbstractC2812l.license("tracks", "tracks", c0396l, setLicense);
        }
        if ((!z2) & (str == null)) {
            setLicense = AbstractC2812l.license("apiId", "apiId", c0396l, setLicense);
        }
        if (setLicense.size() == 0) {
            return new RadioInfo(list, str, radioCluster, list2, str2, umaArtist, umaTag, umaAlbum, umaTrack);
        }
        C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
        return null;
    }

    public final String toString() {
        return "GeneratedJsonAdapter(RadioInfo)";
    }
}
