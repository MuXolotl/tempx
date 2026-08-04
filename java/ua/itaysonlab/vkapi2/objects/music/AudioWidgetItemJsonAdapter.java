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
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class AudioWidgetItemJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("photo", "title", "type", "subtitle", "url");

    public AudioWidgetItemJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(AlbumThumb.class, c5746l, "photo");
        this.crashlytics = c12952l.loadAd(String.class, c5746l, "title");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        AudioWidgetItem audioWidgetItem = (AudioWidgetItem) obj;
        c3631l.mopub();
        c3631l.isVip("photo");
        this.loadAd.billing(c3631l, audioWidgetItem.yandex);
        c3631l.isVip("title");
        String str = audioWidgetItem.loadAd;
        AbstractC7188l abstractC7188l = this.crashlytics;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("type");
        abstractC7188l.billing(c3631l, audioWidgetItem.crashlytics);
        c3631l.isVip("subtitle");
        abstractC7188l.billing(c3631l, audioWidgetItem.amazon);
        c3631l.isVip("url");
        abstractC7188l.billing(c3631l, audioWidgetItem.purchase);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        boolean z;
        boolean z2;
        boolean z3;
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z7 = false;
        String str4 = null;
        AlbumThumb albumThumb = null;
        while (true) {
            z = z4;
            z2 = z5;
            if (!c0396l.m504package()) {
                break;
            }
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l == -1) {
                z3 = z6;
                c0396l.m502l();
                c0396l.m501l();
            } else if (iM503l != 0) {
                AbstractC7188l abstractC7188l = this.crashlytics;
                z3 = z6;
                if (iM503l == 1) {
                    Object objLoadAd = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd == null) {
                        setLicense = AbstractC2812l.isVip("title", "title", c0396l, setLicense);
                        z5 = z2;
                        z6 = z3;
                        z4 = true;
                    } else {
                        str = (String) objLoadAd;
                    }
                } else if (iM503l == 2) {
                    Object objLoadAd2 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd2 == null) {
                        setLicense = AbstractC2812l.isVip("type", "type", c0396l, setLicense);
                        z4 = z;
                        z6 = z3;
                        z5 = true;
                    } else {
                        str2 = (String) objLoadAd2;
                    }
                } else if (iM503l == 3) {
                    Object objLoadAd3 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd3 == null) {
                        setLicense = AbstractC2812l.isVip("subtitle", "subtitle", c0396l, setLicense);
                        z4 = z;
                        z5 = z2;
                        z6 = true;
                    } else {
                        str3 = (String) objLoadAd3;
                    }
                } else if (iM503l == 4) {
                    Object objLoadAd4 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setLicense = AbstractC2812l.isVip("url", "url", c0396l, setLicense);
                        z4 = z;
                        z5 = z2;
                        z6 = z3;
                        z7 = true;
                    } else {
                        str4 = (String) objLoadAd4;
                    }
                }
            } else {
                albumThumb = (AlbumThumb) this.loadAd.loadAd(c0396l);
                z4 = z;
                z5 = z2;
            }
            z4 = z;
            z5 = z2;
            z6 = z3;
        }
        boolean z8 = z6;
        c0396l.ads();
        if ((!z) & (str == null)) {
            setLicense = AbstractC2812l.license("title", "title", c0396l, setLicense);
        }
        if ((!z2) & (str2 == null)) {
            setLicense = AbstractC2812l.license("type", "type", c0396l, setLicense);
        }
        if ((!z8) & (str3 == null)) {
            setLicense = AbstractC2812l.license("subtitle", "subtitle", c0396l, setLicense);
        }
        if ((!z7) & (str4 == null)) {
            setLicense = AbstractC2812l.license("url", "url", c0396l, setLicense);
        }
        if (setLicense.size() == 0) {
            return new AudioWidgetItem(albumThumb, str, str2, str3, str4);
        }
        C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
        return null;
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioWidgetItem)";
    }
}
