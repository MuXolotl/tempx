package ua.itaysonlab.vkapi2.objects.music;

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
public final class AudioLyricsJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("timestamps", "text", "language");

    public AudioLyricsJsonAdapter(C12952l c12952l) {
        C5693l c5693lMopub = AbstractC15639l.mopub(List.class, AudioLyricTimestamp.class);
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(c5693lMopub, c5746l, "timestamps");
        this.crashlytics = c12952l.loadAd(AbstractC15639l.mopub(List.class, String.class), c5746l, "text");
        this.amazon = c12952l.loadAd(String.class, c5746l, "language");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        AudioLyrics audioLyrics = (AudioLyrics) obj;
        c3631l.mopub();
        c3631l.isVip("timestamps");
        this.loadAd.billing(c3631l, audioLyrics.yandex);
        c3631l.isVip("text");
        this.crashlytics.billing(c3631l, audioLyrics.loadAd);
        c3631l.isVip("language");
        this.amazon.billing(c3631l, audioLyrics.crashlytics);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        String str = null;
        Object obj = null;
        Object obj2 = null;
        boolean z = false;
        int i = -1;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l == -1) {
                c0396l.m502l();
                c0396l.m501l();
            } else if (iM503l == 0) {
                Object objLoadAd = this.loadAd.loadAd(c0396l);
                if (objLoadAd == null) {
                    setLicense = AbstractC2812l.isVip("timestamps", "timestamps", c0396l, setLicense);
                } else {
                    obj = objLoadAd;
                }
                i &= -2;
            } else if (iM503l == 1) {
                Object objLoadAd2 = this.crashlytics.loadAd(c0396l);
                if (objLoadAd2 == null) {
                    setLicense = AbstractC2812l.isVip("text", "text", c0396l, setLicense);
                } else {
                    obj2 = objLoadAd2;
                }
                i &= -3;
            } else if (iM503l == 2) {
                Object objLoadAd3 = this.amazon.loadAd(c0396l);
                if (objLoadAd3 == null) {
                    setLicense = AbstractC2812l.isVip("language", "language", c0396l, setLicense);
                    z = true;
                } else {
                    str = (String) objLoadAd3;
                }
            }
        }
        c0396l.ads();
        if ((!z) & (str == null)) {
            setLicense = AbstractC2812l.license("language", "language", c0396l, setLicense);
        }
        if (setLicense.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
            return null;
        }
        if (i == -4) {
            return new AudioLyrics((List) obj, (List) obj2, str);
        }
        List list = (List) obj;
        List list2 = (List) obj2;
        int i2 = i & 1;
        C2580l c2580l = C2580l.f5619l;
        if (i2 != 0) {
            list = c2580l;
        }
        if ((i & 2) != 0) {
            list2 = c2580l;
        }
        return new AudioLyrics(list, list2, str);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioLyrics)";
    }
}
