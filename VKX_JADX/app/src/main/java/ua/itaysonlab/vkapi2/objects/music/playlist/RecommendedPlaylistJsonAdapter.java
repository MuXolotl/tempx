package ua.itaysonlab.vkapi2.objects.music.playlist;

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
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class RecommendedPlaylistJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("id", "owner_id", "percentage", "percentage_title", "audios", "cover");

    public RecommendedPlaylistJsonAdapter(C12952l c12952l) {
        Class cls = Integer.TYPE;
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(cls, c5746l, "id");
        this.crashlytics = c12952l.loadAd(Long.TYPE, c5746l, "owner_id");
        this.amazon = c12952l.loadAd(Float.class, c5746l, "percentage");
        this.purchase = c12952l.loadAd(String.class, c5746l, "percentage_title");
        this.billing = c12952l.loadAd(AbstractC15639l.mopub(List.class, String.class), c5746l, "audios");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        RecommendedPlaylist recommendedPlaylist = (RecommendedPlaylist) obj;
        c3631l.mopub();
        c3631l.isVip("id");
        AbstractC12589l.inmobi(recommendedPlaylist.yandex, this.loadAd, c3631l, "owner_id");
        AbstractC12589l.m3427throws(recommendedPlaylist.loadAd, this.crashlytics, c3631l, "percentage");
        this.amazon.billing(c3631l, recommendedPlaylist.crashlytics);
        c3631l.isVip("percentage_title");
        String str = recommendedPlaylist.amazon;
        AbstractC7188l abstractC7188l = this.purchase;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("audios");
        this.billing.billing(c3631l, recommendedPlaylist.purchase);
        c3631l.isVip("cover");
        abstractC7188l.billing(c3631l, recommendedPlaylist.billing);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Integer num = null;
        Long l = null;
        Float f = null;
        String str = null;
        List list = null;
        String str2 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.purchase;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    break;
                case 0:
                    Object objLoadAd = this.loadAd.loadAd(c0396l);
                    if (objLoadAd != null) {
                        num = (Integer) objLoadAd;
                    } else {
                        setLicense = AbstractC2812l.isVip("id", "id", c0396l, setLicense);
                        z = true;
                    }
                    break;
                case 1:
                    Object objLoadAd2 = this.crashlytics.loadAd(c0396l);
                    if (objLoadAd2 != null) {
                        l = (Long) objLoadAd2;
                    } else {
                        setLicense = AbstractC2812l.isVip("owner_id", "owner_id", c0396l, setLicense);
                        z2 = true;
                    }
                    break;
                case 2:
                    f = (Float) this.amazon.loadAd(c0396l);
                    break;
                case 3:
                    str = (String) abstractC7188l.loadAd(c0396l);
                    break;
                case 4:
                    Object objLoadAd3 = this.billing.loadAd(c0396l);
                    if (objLoadAd3 != null) {
                        list = (List) objLoadAd3;
                    } else {
                        setLicense = AbstractC2812l.isVip("audios", "audios", c0396l, setLicense);
                        z3 = true;
                    }
                    break;
                case 5:
                    str2 = (String) abstractC7188l.loadAd(c0396l);
                    break;
            }
        }
        c0396l.ads();
        if ((!z) & (num == null)) {
            setLicense = AbstractC2812l.license("id", "id", c0396l, setLicense);
        }
        if ((!z2) & (l == null)) {
            setLicense = AbstractC2812l.license("owner_id", "owner_id", c0396l, setLicense);
        }
        if ((!z3) & (list == null)) {
            setLicense = AbstractC2812l.license("audios", "audios", c0396l, setLicense);
        }
        if (setLicense.size() == 0) {
            return new RecommendedPlaylist(num.intValue(), l.longValue(), f, str, list, str2);
        }
        C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
        return null;
    }

    public final String toString() {
        return "GeneratedJsonAdapter(RecommendedPlaylist)";
    }
}
