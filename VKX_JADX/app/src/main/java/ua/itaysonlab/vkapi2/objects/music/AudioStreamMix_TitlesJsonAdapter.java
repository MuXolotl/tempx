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

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class AudioStreamMix_TitlesJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("common_state", "playing_state");

    public AudioStreamMix_TitlesJsonAdapter(C12952l c12952l) {
        this.loadAd = c12952l.loadAd(String.class, C5746l.f12138l, "common_state");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        AudioStreamMix.Titles titles = (AudioStreamMix.Titles) obj;
        c3631l.mopub();
        c3631l.isVip("common_state");
        String str = titles.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("playing_state");
        abstractC7188l.billing(c3631l, titles.loadAd);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setIsVip = C5746l.f12138l;
        Object obj = null;
        Object obj2 = null;
        int i = -1;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l != -1) {
                AbstractC7188l abstractC7188l = this.loadAd;
                if (iM503l == 0) {
                    Object objLoadAd = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd == null) {
                        setIsVip = AbstractC2812l.isVip("common_state", "common_state", c0396l, setIsVip);
                    } else {
                        obj = objLoadAd;
                    }
                    i &= -2;
                } else if (iM503l == 1) {
                    Object objLoadAd2 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd2 == null) {
                        setIsVip = AbstractC2812l.isVip("playing_state", "playing_state", c0396l, setIsVip);
                    } else {
                        obj2 = objLoadAd2;
                    }
                    i &= -3;
                }
            } else {
                c0396l.m502l();
                c0396l.m501l();
            }
        }
        c0396l.ads();
        if (setIsVip.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setIsVip, "\n", null, null, null, 62));
            return null;
        }
        if (i == -4) {
            return new AudioStreamMix.Titles((String) obj, (String) obj2);
        }
        String str = (String) obj;
        String str2 = (String) obj2;
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return new AudioStreamMix.Titles(str, str2);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioStreamMix.Titles)";
    }
}
