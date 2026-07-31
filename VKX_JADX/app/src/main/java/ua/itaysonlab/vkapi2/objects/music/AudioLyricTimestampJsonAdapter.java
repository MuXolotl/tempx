package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC12589l;
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
public final class AudioLyricTimestampJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("begin", "end", "line", "interlude");

    public AudioLyricTimestampJsonAdapter(C12952l c12952l) {
        Class cls = Long.TYPE;
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(cls, c5746l, "begin");
        this.crashlytics = c12952l.loadAd(String.class, c5746l, "line");
        this.amazon = c12952l.loadAd(Boolean.TYPE, c5746l, "interlude");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        AudioLyricTimestamp audioLyricTimestamp = (AudioLyricTimestamp) obj;
        c3631l.mopub();
        c3631l.isVip("begin");
        long j = audioLyricTimestamp.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        AbstractC12589l.m3427throws(j, abstractC7188l, c3631l, "end");
        AbstractC12589l.m3427throws(audioLyricTimestamp.loadAd, abstractC7188l, c3631l, "line");
        this.crashlytics.billing(c3631l, audioLyricTimestamp.crashlytics);
        c3631l.isVip("interlude");
        this.amazon.billing(c3631l, Boolean.valueOf(audioLyricTimestamp.amazon));
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        boolean z = false;
        boolean z2 = false;
        boolean zBooleanValue = false;
        int i = -1;
        Long l = null;
        Long l2 = null;
        Object obj = null;
        while (true) {
            if (!c0396l.m504package()) {
                break;
            }
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l != -1) {
                AbstractC7188l abstractC7188l = this.loadAd;
                if (iM503l == 0) {
                    Object objLoadAd = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd == null) {
                        setLicense = AbstractC2812l.isVip("begin", "begin", c0396l, setLicense);
                        z = true;
                    } else {
                        l = (Long) objLoadAd;
                    }
                } else if (iM503l == 1) {
                    Object objLoadAd2 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd2 == null) {
                        setLicense = AbstractC2812l.isVip("end", "end", c0396l, setLicense);
                        z2 = true;
                    } else {
                        l2 = (Long) objLoadAd2;
                    }
                } else if (iM503l == 2) {
                    Object objLoadAd3 = this.crashlytics.loadAd(c0396l);
                    if (objLoadAd3 == null) {
                        setLicense = AbstractC2812l.isVip("line", "line", c0396l, setLicense);
                    } else {
                        obj = objLoadAd3;
                    }
                    i &= -5;
                } else if (iM503l == 3) {
                    Object objLoadAd4 = this.amazon.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setLicense = AbstractC2812l.isVip("interlude", "interlude", c0396l, setLicense);
                    } else {
                        zBooleanValue = ((Boolean) objLoadAd4).booleanValue();
                    }
                    i &= -9;
                }
            } else {
                c0396l.m502l();
                c0396l.m501l();
            }
        }
        c0396l.ads();
        if ((!z) & (l == null)) {
            setLicense = AbstractC2812l.license("begin", "begin", c0396l, setLicense);
        }
        if ((!z2) & (l2 == null)) {
            setLicense = AbstractC2812l.license("end", "end", c0396l, setLicense);
        }
        if (setLicense.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
            return null;
        }
        if (i == -13) {
            return new AudioLyricTimestamp(l.longValue(), l2.longValue(), (String) obj, zBooleanValue);
        }
        long jLongValue = l.longValue();
        long jLongValue2 = l2.longValue();
        String str = (String) obj;
        if ((i & 4) != 0) {
            str = "";
        }
        return new AudioLyricTimestamp(jLongValue, jLongValue2, str, (i & 8) != 0 ? false : zBooleanValue);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioLyricTimestamp)";
    }
}
