package ua.itaysonlab.vkapi2.objects.music.playlist.thumb;

import defpackage.AbstractC7188l;
import defpackage.C0396l;
import defpackage.C0458l;
import defpackage.C12952l;
import defpackage.C18262l;
import defpackage.C3631l;
import defpackage.C5746l;
import defpackage.C8413l;
import java.io.EOFException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class AlbumThumbJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("photo_135", "photo_270", "photo_300", "photo_600", "photo_1200");

    public AlbumThumbJsonAdapter(C12952l c12952l) {
        this.loadAd = c12952l.loadAd(String.class, C5746l.f12138l, "photo_135");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        AlbumThumb albumThumb = (AlbumThumb) obj;
        c3631l.mopub();
        c3631l.isVip("photo_135");
        String str = albumThumb.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("photo_270");
        abstractC7188l.billing(c3631l, albumThumb.loadAd);
        c3631l.isVip("photo_300");
        abstractC7188l.billing(c3631l, albumThumb.crashlytics);
        c3631l.isVip("photo_600");
        abstractC7188l.billing(c3631l, albumThumb.amazon);
        c3631l.isVip("photo_1200");
        abstractC7188l.billing(c3631l, albumThumb.purchase);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Object objLoadAd = null;
        Object objLoadAd2 = null;
        Object objLoadAd3 = null;
        Object objLoadAd4 = null;
        Object objLoadAd5 = null;
        int i = -1;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l != -1) {
                AbstractC7188l abstractC7188l = this.loadAd;
                if (iM503l == 0) {
                    objLoadAd = abstractC7188l.loadAd(c0396l);
                    i &= -2;
                } else if (iM503l == 1) {
                    objLoadAd2 = abstractC7188l.loadAd(c0396l);
                    i &= -3;
                } else if (iM503l == 2) {
                    objLoadAd3 = abstractC7188l.loadAd(c0396l);
                    i &= -5;
                } else if (iM503l == 3) {
                    objLoadAd4 = abstractC7188l.loadAd(c0396l);
                    i &= -9;
                } else if (iM503l == 4) {
                    objLoadAd5 = abstractC7188l.loadAd(c0396l);
                    i &= -17;
                }
            } else {
                c0396l.m502l();
                c0396l.m501l();
            }
        }
        c0396l.ads();
        String str = (String) objLoadAd;
        String str2 = (String) objLoadAd2;
        String str3 = (String) objLoadAd3;
        String str4 = (String) objLoadAd4;
        String str5 = (String) objLoadAd5;
        return i == -32 ? new AlbumThumb(str, str2, str3, str4, str5) : new AlbumThumb(str, str2, str3, str4, str5, i);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AlbumThumb)";
    }
}
