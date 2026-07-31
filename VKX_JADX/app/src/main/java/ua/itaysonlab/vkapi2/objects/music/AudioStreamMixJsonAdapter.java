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
public final class AudioStreamMixJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("id", "title", "description", "stream_mix", "is_tunable", "titles");

    public AudioStreamMixJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "id");
        this.crashlytics = c12952l.loadAd(AudioStreamMix.Link.class, c5746l, "stream_mix");
        this.amazon = c12952l.loadAd(Boolean.class, c5746l, "is_tunable");
        this.purchase = c12952l.loadAd(AudioStreamMix.Titles.class, c5746l, "titles");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        AudioStreamMix audioStreamMix = (AudioStreamMix) obj;
        c3631l.mopub();
        c3631l.isVip("id");
        String str = audioStreamMix.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("title");
        abstractC7188l.billing(c3631l, audioStreamMix.loadAd);
        c3631l.isVip("description");
        abstractC7188l.billing(c3631l, audioStreamMix.crashlytics);
        c3631l.isVip("stream_mix");
        this.crashlytics.billing(c3631l, audioStreamMix.amazon);
        c3631l.isVip("is_tunable");
        this.amazon.billing(c3631l, audioStreamMix.purchase);
        c3631l.isVip("titles");
        this.purchase.billing(c3631l, audioStreamMix.billing);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        int i = -1;
        boolean z = false;
        Object obj = null;
        String str = null;
        Object obj2 = null;
        Object objLoadAd = null;
        Object objLoadAd2 = null;
        Object objLoadAd3 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.loadAd;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    break;
                case 0:
                    Object objLoadAd4 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd4 != null) {
                        str = (String) objLoadAd4;
                    } else {
                        setLicense = AbstractC2812l.isVip("id", "id", c0396l, setLicense);
                        z = true;
                    }
                    break;
                case 1:
                    Object objLoadAd5 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd5 == null) {
                        setLicense = AbstractC2812l.isVip("title", "title", c0396l, setLicense);
                    } else {
                        obj = objLoadAd5;
                    }
                    i &= -3;
                    break;
                case 2:
                    Object objLoadAd6 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd6 == null) {
                        setLicense = AbstractC2812l.isVip("description", "description", c0396l, setLicense);
                    } else {
                        obj2 = objLoadAd6;
                    }
                    i &= -5;
                    break;
                case 3:
                    objLoadAd = this.crashlytics.loadAd(c0396l);
                    i &= -9;
                    break;
                case 4:
                    objLoadAd2 = this.amazon.loadAd(c0396l);
                    i &= -17;
                    break;
                case 5:
                    objLoadAd3 = this.purchase.loadAd(c0396l);
                    i &= -33;
                    break;
            }
        }
        c0396l.ads();
        if ((!z) & (str == null)) {
            setLicense = AbstractC2812l.license("id", "id", c0396l, setLicense);
        }
        if (setLicense.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
            return null;
        }
        Object obj3 = obj;
        if (i == -63) {
            return new AudioStreamMix(str, (String) obj3, (String) obj2, (AudioStreamMix.Link) objLoadAd, (Boolean) objLoadAd2, (AudioStreamMix.Titles) objLoadAd3);
        }
        String str2 = (String) obj3;
        String str3 = (String) obj2;
        AudioStreamMix.Link link = (AudioStreamMix.Link) objLoadAd;
        Boolean bool = (Boolean) objLoadAd2;
        AudioStreamMix.Titles titles = (AudioStreamMix.Titles) objLoadAd3;
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            link = null;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        return new AudioStreamMix(str, str2, str3, link, bool, (i & 32) != 0 ? null : titles);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioStreamMix)";
    }
}
