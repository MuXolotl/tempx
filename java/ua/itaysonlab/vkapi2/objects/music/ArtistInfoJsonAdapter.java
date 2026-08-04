package ua.itaysonlab.vkapi2.objects.music;

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
public final class ArtistInfoJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("chips", "is_foreign_agent", "play_track_code", "subscription_track_code", "play_action_ref");

    public ArtistInfoJsonAdapter(C12952l c12952l) {
        C5693l c5693lMopub = AbstractC15639l.mopub(List.class, ArtistInfo.Chip.class);
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(c5693lMopub, c5746l, "chips");
        this.crashlytics = c12952l.loadAd(Boolean.TYPE, c5746l, "is_foreign_agent");
        this.amazon = c12952l.loadAd(String.class, c5746l, "play_track_code");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        ArtistInfo artistInfo = (ArtistInfo) obj;
        c3631l.mopub();
        c3631l.isVip("chips");
        this.loadAd.billing(c3631l, artistInfo.yandex);
        c3631l.isVip("is_foreign_agent");
        AbstractC12589l.m3428volatile(artistInfo.loadAd, this.crashlytics, c3631l, "play_track_code");
        String str = artistInfo.crashlytics;
        AbstractC7188l abstractC7188l = this.amazon;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("subscription_track_code");
        abstractC7188l.billing(c3631l, artistInfo.amazon);
        c3631l.isVip("play_action_ref");
        abstractC7188l.billing(c3631l, artistInfo.purchase);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setIsVip = C5746l.f12138l;
        Object obj = null;
        Object objLoadAd = null;
        Object objLoadAd2 = null;
        Object objLoadAd3 = null;
        boolean zBooleanValue = false;
        int i = -1;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l == -1) {
                c0396l.m502l();
                c0396l.m501l();
            } else if (iM503l == 0) {
                Object objLoadAd4 = this.loadAd.loadAd(c0396l);
                if (objLoadAd4 == null) {
                    setIsVip = AbstractC2812l.isVip("chips", "chips", c0396l, setIsVip);
                } else {
                    obj = objLoadAd4;
                }
                i &= -2;
            } else if (iM503l != 1) {
                AbstractC7188l abstractC7188l = this.amazon;
                if (iM503l == 2) {
                    objLoadAd = abstractC7188l.loadAd(c0396l);
                    i &= -5;
                } else if (iM503l == 3) {
                    objLoadAd2 = abstractC7188l.loadAd(c0396l);
                    i &= -9;
                } else if (iM503l == 4) {
                    objLoadAd3 = abstractC7188l.loadAd(c0396l);
                    i &= -17;
                }
            } else {
                Object objLoadAd5 = this.crashlytics.loadAd(c0396l);
                if (objLoadAd5 == null) {
                    setIsVip = AbstractC2812l.isVip("is_foreign_agent", "is_foreign_agent", c0396l, setIsVip);
                } else {
                    zBooleanValue = ((Boolean) objLoadAd5).booleanValue();
                }
                i &= -3;
            }
        }
        c0396l.ads();
        if (setIsVip.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setIsVip, "\n", null, null, null, 62));
            return null;
        }
        if (i == -32) {
            return new ArtistInfo((String) objLoadAd, (String) objLoadAd2, (String) objLoadAd3, (List) obj, zBooleanValue);
        }
        List list = (List) obj;
        String str = (String) objLoadAd;
        String str2 = (String) objLoadAd2;
        String str3 = (String) objLoadAd3;
        if ((i & 1) != 0) {
            list = C2580l.f5619l;
        }
        return new ArtistInfo((i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, list, (i & 2) != 0 ? false : zBooleanValue);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ArtistInfo)";
    }
}
