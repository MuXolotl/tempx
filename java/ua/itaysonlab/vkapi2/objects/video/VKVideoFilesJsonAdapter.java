package ua.itaysonlab.vkapi2.objects.video;

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
public final class VKVideoFilesJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("mp4_240", "mp4_360", "mp4_480", "mp4_720", "mp4_1080", "mp4_1440", "mp4_2160", "hls");

    public VKVideoFilesJsonAdapter(C12952l c12952l) {
        this.loadAd = c12952l.loadAd(String.class, C5746l.f12138l, "mp4_240");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        VKVideoFiles vKVideoFiles = (VKVideoFiles) obj;
        c3631l.mopub();
        c3631l.isVip("mp4_240");
        String str = vKVideoFiles.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("mp4_360");
        abstractC7188l.billing(c3631l, vKVideoFiles.loadAd);
        c3631l.isVip("mp4_480");
        abstractC7188l.billing(c3631l, vKVideoFiles.crashlytics);
        c3631l.isVip("mp4_720");
        abstractC7188l.billing(c3631l, vKVideoFiles.amazon);
        c3631l.isVip("mp4_1080");
        abstractC7188l.billing(c3631l, vKVideoFiles.purchase);
        c3631l.isVip("mp4_1440");
        abstractC7188l.billing(c3631l, vKVideoFiles.billing);
        c3631l.isVip("mp4_2160");
        abstractC7188l.billing(c3631l, vKVideoFiles.mopub);
        c3631l.isVip("hls");
        abstractC7188l.billing(c3631l, vKVideoFiles.admob);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.loadAd;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    break;
                case 0:
                    str = (String) abstractC7188l.loadAd(c0396l);
                    break;
                case 1:
                    str2 = (String) abstractC7188l.loadAd(c0396l);
                    break;
                case 2:
                    str3 = (String) abstractC7188l.loadAd(c0396l);
                    break;
                case 3:
                    str4 = (String) abstractC7188l.loadAd(c0396l);
                    break;
                case 4:
                    str5 = (String) abstractC7188l.loadAd(c0396l);
                    break;
                case 5:
                    str6 = (String) abstractC7188l.loadAd(c0396l);
                    break;
                case 6:
                    str7 = (String) abstractC7188l.loadAd(c0396l);
                    break;
                case 7:
                    str8 = (String) abstractC7188l.loadAd(c0396l);
                    break;
            }
        }
        c0396l.ads();
        return new VKVideoFiles(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(VKVideoFiles)";
    }
}
