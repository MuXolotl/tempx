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
public final class AudioPlaylistSnippetEntry_StreamUrlJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("url", "clip_from", "clip_to");

    public AudioPlaylistSnippetEntry_StreamUrlJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "url");
        this.crashlytics = c12952l.loadAd(Integer.TYPE, c5746l, "clip_from");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        AudioPlaylistSnippetEntry.StreamUrl streamUrl = (AudioPlaylistSnippetEntry.StreamUrl) obj;
        c3631l.mopub();
        c3631l.isVip("url");
        this.loadAd.billing(c3631l, streamUrl.yandex);
        c3631l.isVip("clip_from");
        int i = streamUrl.loadAd;
        AbstractC7188l abstractC7188l = this.crashlytics;
        AbstractC12589l.inmobi(i, abstractC7188l, c3631l, "clip_to");
        abstractC7188l.billing(c3631l, Integer.valueOf(streamUrl.crashlytics));
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l == -1) {
                c0396l.m502l();
                c0396l.m501l();
            } else if (iM503l != 0) {
                AbstractC7188l abstractC7188l = this.crashlytics;
                if (iM503l == 1) {
                    Object objLoadAd = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd == null) {
                        setLicense = AbstractC2812l.isVip("clip_from", "clip_from", c0396l, setLicense);
                        z2 = true;
                    } else {
                        num = (Integer) objLoadAd;
                    }
                } else if (iM503l == 2) {
                    Object objLoadAd2 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd2 == null) {
                        setLicense = AbstractC2812l.isVip("clip_to", "clip_to", c0396l, setLicense);
                        z3 = true;
                    } else {
                        num2 = (Integer) objLoadAd2;
                    }
                }
            } else {
                Object objLoadAd3 = this.loadAd.loadAd(c0396l);
                if (objLoadAd3 == null) {
                    setLicense = AbstractC2812l.isVip("url", "url", c0396l, setLicense);
                    z = true;
                } else {
                    str = (String) objLoadAd3;
                }
            }
        }
        c0396l.ads();
        if ((!z) & (str == null)) {
            setLicense = AbstractC2812l.license("url", "url", c0396l, setLicense);
        }
        if ((!z2) & (num == null)) {
            setLicense = AbstractC2812l.license("clip_from", "clip_from", c0396l, setLicense);
        }
        if ((!z3) & (num2 == null)) {
            setLicense = AbstractC2812l.license("clip_to", "clip_to", c0396l, setLicense);
        }
        if (setLicense.size() == 0) {
            return new AudioPlaylistSnippetEntry.StreamUrl(str, num.intValue(), num2.intValue());
        }
        C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
        return null;
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioPlaylistSnippetEntry.StreamUrl)";
    }
}
