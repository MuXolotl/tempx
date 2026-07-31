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
public final class AudioBook_ChapterJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("id", "title", "progress_status", "progress_time", "track_code", "audio_file");

    public AudioBook_ChapterJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "id");
        this.crashlytics = c12952l.loadAd(Integer.TYPE, c5746l, "progress_time");
        this.amazon = c12952l.loadAd(AudioBook.Chapter.AudioFile.class, c5746l, "audio_file");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        AudioBook.Chapter chapter = (AudioBook.Chapter) obj;
        c3631l.mopub();
        c3631l.isVip("id");
        String str = chapter.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("title");
        abstractC7188l.billing(c3631l, chapter.loadAd);
        c3631l.isVip("progress_status");
        abstractC7188l.billing(c3631l, chapter.crashlytics);
        c3631l.isVip("progress_time");
        AbstractC12589l.inmobi(chapter.amazon, this.crashlytics, c3631l, "track_code");
        abstractC7188l.billing(c3631l, chapter.purchase);
        c3631l.isVip("audio_file");
        this.amazon.billing(c3631l, chapter.billing);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        int i = -1;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        Object obj = null;
        String str2 = null;
        int iIntValue = 0;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            if (!c0396l.m504package()) {
                c0396l.ads();
                if ((!z) & (str == null)) {
                    setLicense = AbstractC2812l.license("id", "id", c0396l, setLicense);
                }
                if ((!z2) & (str2 == null)) {
                    setLicense = AbstractC2812l.license("progress_status", "progress_status", c0396l, setLicense);
                }
                if (setLicense.size() != 0) {
                    C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
                    return null;
                }
                String str3 = (String) obj;
                String str4 = (String) obj2;
                AudioBook.Chapter.AudioFile audioFile = (AudioBook.Chapter.AudioFile) obj3;
                if (i == -59) {
                    return new AudioBook.Chapter(str, str3, str2, iIntValue, str4, audioFile);
                }
                if ((i & 2) != 0) {
                    str3 = "";
                }
                if ((i & 8) != 0) {
                    iIntValue = 0;
                }
                if ((i & 16) != 0) {
                    str4 = "";
                }
                if ((i & 32) != 0) {
                    audioFile = new AudioBook.Chapter.AudioFile(0, 7, 0L, null);
                }
                return new AudioBook.Chapter(str, str3, str2, iIntValue, str4, audioFile);
            }
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.loadAd;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    break;
                case 0:
                    Object objLoadAd = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd != null) {
                        str = (String) objLoadAd;
                    } else {
                        setLicense = AbstractC2812l.isVip("id", "id", c0396l, setLicense);
                        z = true;
                    }
                    break;
                case 1:
                    Object objLoadAd2 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd2 == null) {
                        setLicense = AbstractC2812l.isVip("title", "title", c0396l, setLicense);
                    } else {
                        obj = objLoadAd2;
                    }
                    i &= -3;
                    break;
                case 2:
                    Object objLoadAd3 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd3 != null) {
                        str2 = (String) objLoadAd3;
                    } else {
                        setLicense = AbstractC2812l.isVip("progress_status", "progress_status", c0396l, setLicense);
                        z2 = true;
                    }
                    break;
                case 3:
                    Object objLoadAd4 = this.crashlytics.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setLicense = AbstractC2812l.isVip("progress_time", "progress_time", c0396l, setLicense);
                    } else {
                        iIntValue = ((Number) objLoadAd4).intValue();
                    }
                    i &= -9;
                    break;
                case 4:
                    Object objLoadAd5 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd5 == null) {
                        setLicense = AbstractC2812l.isVip("track_code", "track_code", c0396l, setLicense);
                    } else {
                        obj2 = objLoadAd5;
                    }
                    i &= -17;
                    break;
                case 5:
                    Object objLoadAd6 = this.amazon.loadAd(c0396l);
                    if (objLoadAd6 == null) {
                        setLicense = AbstractC2812l.isVip("audio_file", "audio_file", c0396l, setLicense);
                    } else {
                        obj3 = objLoadAd6;
                    }
                    i &= -33;
                    break;
            }
        }
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioBook.Chapter)";
    }
}
