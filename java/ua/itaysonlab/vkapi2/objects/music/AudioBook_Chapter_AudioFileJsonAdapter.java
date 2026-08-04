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
public final class AudioBook_Chapter_AudioFileJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("url", "duration", "file_size");

    public AudioBook_Chapter_AudioFileJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "url");
        this.crashlytics = c12952l.loadAd(Integer.TYPE, c5746l, "duration");
        this.amazon = c12952l.loadAd(Long.TYPE, c5746l, "file_size");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        AudioBook.Chapter.AudioFile audioFile = (AudioBook.Chapter.AudioFile) obj;
        c3631l.mopub();
        c3631l.isVip("url");
        this.loadAd.billing(c3631l, audioFile.yandex);
        c3631l.isVip("duration");
        AbstractC12589l.inmobi(audioFile.loadAd, this.crashlytics, c3631l, "file_size");
        this.amazon.billing(c3631l, Long.valueOf(audioFile.crashlytics));
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setIsVip = C5746l.f12138l;
        int iIntValue = 0;
        long jLongValue = 0;
        int i = -1;
        Object obj = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l == -1) {
                c0396l.m502l();
                c0396l.m501l();
            } else if (iM503l == 0) {
                Object objLoadAd = this.loadAd.loadAd(c0396l);
                if (objLoadAd == null) {
                    setIsVip = AbstractC2812l.isVip("url", "url", c0396l, setIsVip);
                } else {
                    obj = objLoadAd;
                }
                i &= -2;
            } else if (iM503l == 1) {
                Object objLoadAd2 = this.crashlytics.loadAd(c0396l);
                if (objLoadAd2 == null) {
                    setIsVip = AbstractC2812l.isVip("duration", "duration", c0396l, setIsVip);
                } else {
                    iIntValue = ((Number) objLoadAd2).intValue();
                }
                i &= -3;
            } else if (iM503l == 2) {
                Object objLoadAd3 = this.amazon.loadAd(c0396l);
                if (objLoadAd3 == null) {
                    setIsVip = AbstractC2812l.isVip("file_size", "file_size", c0396l, setIsVip);
                } else {
                    jLongValue = ((Number) objLoadAd3).longValue();
                }
                i &= -5;
            }
        }
        c0396l.ads();
        if (setIsVip.size() == 0) {
            return i == -8 ? new AudioBook.Chapter.AudioFile(jLongValue, iIntValue, (String) obj) : new AudioBook.Chapter.AudioFile(iIntValue, i, jLongValue, (String) obj);
        }
        C11467l.subscription(AbstractC16901l.m4210case(setIsVip, "\n", null, null, null, 62));
        return null;
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioBook.Chapter.AudioFile)";
    }
}
