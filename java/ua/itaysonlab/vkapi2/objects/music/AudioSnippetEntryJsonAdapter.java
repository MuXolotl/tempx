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
public final class AudioSnippetEntryJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("type", "title", "text", "nav_url", "image", "track_code", "audios", "audio_ids");

    public AudioSnippetEntryJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "type");
        this.crashlytics = c12952l.loadAd(AbstractC15639l.mopub(List.class, AudioTrack.class), c5746l, "audios");
        this.amazon = c12952l.loadAd(AbstractC15639l.mopub(List.class, String.class), c5746l, "audio_ids");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        AudioSnippetEntry audioSnippetEntry = (AudioSnippetEntry) obj;
        c3631l.mopub();
        c3631l.isVip("type");
        String str = audioSnippetEntry.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("title");
        abstractC7188l.billing(c3631l, audioSnippetEntry.loadAd);
        c3631l.isVip("text");
        abstractC7188l.billing(c3631l, audioSnippetEntry.crashlytics);
        c3631l.isVip("nav_url");
        abstractC7188l.billing(c3631l, audioSnippetEntry.amazon);
        c3631l.isVip("image");
        abstractC7188l.billing(c3631l, audioSnippetEntry.purchase);
        c3631l.isVip("track_code");
        abstractC7188l.billing(c3631l, audioSnippetEntry.billing);
        c3631l.isVip("audios");
        this.crashlytics.billing(c3631l, audioSnippetEntry.mopub);
        c3631l.isVip("audio_ids");
        this.amazon.billing(c3631l, audioSnippetEntry.admob);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        int i = -1;
        boolean z = false;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        String str = null;
        while (c0396l.m504package()) {
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
                        setLicense = AbstractC2812l.isVip("type", "type", c0396l, setLicense);
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
                    if (objLoadAd3 == null) {
                        setLicense = AbstractC2812l.isVip("text", "text", c0396l, setLicense);
                    } else {
                        obj2 = objLoadAd3;
                    }
                    i &= -5;
                    break;
                case 3:
                    Object objLoadAd4 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setLicense = AbstractC2812l.isVip("nav_url", "nav_url", c0396l, setLicense);
                    } else {
                        obj3 = objLoadAd4;
                    }
                    i &= -9;
                    break;
                case 4:
                    Object objLoadAd5 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd5 == null) {
                        setLicense = AbstractC2812l.isVip("image", "image", c0396l, setLicense);
                    } else {
                        obj4 = objLoadAd5;
                    }
                    i &= -17;
                    break;
                case 5:
                    Object objLoadAd6 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd6 == null) {
                        setLicense = AbstractC2812l.isVip("track_code", "track_code", c0396l, setLicense);
                    } else {
                        obj5 = objLoadAd6;
                    }
                    i &= -33;
                    break;
                case 6:
                    Object objLoadAd7 = this.crashlytics.loadAd(c0396l);
                    if (objLoadAd7 == null) {
                        setLicense = AbstractC2812l.isVip("audios", "audios", c0396l, setLicense);
                    } else {
                        obj6 = objLoadAd7;
                    }
                    i &= -65;
                    break;
                case 7:
                    Object objLoadAd8 = this.amazon.loadAd(c0396l);
                    if (objLoadAd8 == null) {
                        setLicense = AbstractC2812l.isVip("audio_ids", "audio_ids", c0396l, setLicense);
                    } else {
                        obj7 = objLoadAd8;
                    }
                    i &= -129;
                    break;
            }
        }
        c0396l.ads();
        if ((!z) & (str == null)) {
            setLicense = AbstractC2812l.license("type", "type", c0396l, setLicense);
        }
        if (setLicense.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
            return null;
        }
        if (i == -255) {
            return new AudioSnippetEntry(str, (String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (List) obj6, (List) obj7);
        }
        return new AudioSnippetEntry(str, (String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (List) obj6, (List) obj7, i);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioSnippetEntry)";
    }
}
