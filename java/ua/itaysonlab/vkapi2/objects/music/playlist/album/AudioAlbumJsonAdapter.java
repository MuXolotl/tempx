package ua.itaysonlab.vkapi2.objects.music.playlist.album;

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
public final class AudioAlbumJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("id", "owner_id", "access_key", "title", "thumb", "main_color");

    public AudioAlbumJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(Integer.class, c5746l, "id");
        this.crashlytics = c12952l.loadAd(Long.class, c5746l, "owner_id");
        this.amazon = c12952l.loadAd(String.class, c5746l, "access_key");
        this.purchase = c12952l.loadAd(String.class, c5746l, "title");
        this.billing = c12952l.loadAd(AlbumThumb.class, c5746l, "thumb");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        AudioAlbum audioAlbum = (AudioAlbum) obj;
        c3631l.mopub();
        c3631l.isVip("id");
        this.loadAd.billing(c3631l, audioAlbum.yandex);
        c3631l.isVip("owner_id");
        this.crashlytics.billing(c3631l, audioAlbum.loadAd);
        c3631l.isVip("access_key");
        String str = audioAlbum.crashlytics;
        AbstractC7188l abstractC7188l = this.amazon;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("title");
        this.purchase.billing(c3631l, audioAlbum.amazon);
        c3631l.isVip("thumb");
        this.billing.billing(c3631l, audioAlbum.purchase);
        c3631l.isVip("main_color");
        abstractC7188l.billing(c3631l, audioAlbum.billing);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        Integer num = null;
        Long l = null;
        String str = null;
        String str2 = null;
        AlbumThumb albumThumb = null;
        String str3 = null;
        boolean z = false;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.amazon;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    break;
                case 0:
                    num = (Integer) this.loadAd.loadAd(c0396l);
                    break;
                case 1:
                    l = (Long) this.crashlytics.loadAd(c0396l);
                    break;
                case 2:
                    str = (String) abstractC7188l.loadAd(c0396l);
                    break;
                case 3:
                    Object objLoadAd = this.purchase.loadAd(c0396l);
                    if (objLoadAd != null) {
                        str2 = (String) objLoadAd;
                    } else {
                        setLicense = AbstractC2812l.isVip("title", "title", c0396l, setLicense);
                        z = true;
                    }
                    break;
                case 4:
                    albumThumb = (AlbumThumb) this.billing.loadAd(c0396l);
                    break;
                case 5:
                    str3 = (String) abstractC7188l.loadAd(c0396l);
                    break;
            }
        }
        c0396l.ads();
        if ((!z) & (str2 == null)) {
            setLicense = AbstractC2812l.license("title", "title", c0396l, setLicense);
        }
        if (setLicense.size() == 0) {
            return new AudioAlbum(num, l, str, str2, albumThumb, str3, false);
        }
        C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
        return null;
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioAlbum)";
    }
}
