package ua.itaysonlab.vkapi2.objects.video;

import defpackage.AbstractC12589l;
import defpackage.AbstractC12994l;
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
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.Genre;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemPhoto;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class VKVideoJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l admob;
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l isPro;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l mopub;
    public final AbstractC7188l purchase;
    public final AbstractC7188l subs;
    public final C0458l yandex = C0458l.m547strictfp("id", "owner_id", "title", "width", "height", "image", "user_id", "files", "main_artists", "genres", "duration", "direct_url");

    public VKVideoJsonAdapter(C12952l c12952l) {
        Class cls = Integer.TYPE;
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(cls, c5746l, "id");
        this.crashlytics = c12952l.loadAd(Long.class, c5746l, "owner_id");
        this.amazon = c12952l.loadAd(String.class, c5746l, "title");
        this.purchase = c12952l.loadAd(Integer.class, c5746l, "width");
        this.billing = c12952l.loadAd(AbstractC15639l.mopub(List.class, CustomCatalogBlockItemPhoto.class), c5746l, "image");
        this.mopub = c12952l.loadAd(VKVideoFiles.class, c5746l, "files");
        this.admob = c12952l.loadAd(AbstractC15639l.mopub(List.class, MainArtist.class), c5746l, "main_artists");
        this.subs = c12952l.loadAd(AbstractC15639l.mopub(List.class, Genre.class), c5746l, "genres");
        this.isPro = c12952l.loadAd(String.class, c5746l, "direct_url");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        VKVideo vKVideo = (VKVideo) obj;
        c3631l.mopub();
        c3631l.isVip("id");
        int i = vKVideo.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        AbstractC12589l.inmobi(i, abstractC7188l, c3631l, "owner_id");
        Long l = vKVideo.loadAd;
        AbstractC7188l abstractC7188l2 = this.crashlytics;
        abstractC7188l2.billing(c3631l, l);
        c3631l.isVip("title");
        this.amazon.billing(c3631l, vKVideo.crashlytics);
        c3631l.isVip("width");
        Integer num = vKVideo.amazon;
        AbstractC7188l abstractC7188l3 = this.purchase;
        abstractC7188l3.billing(c3631l, num);
        c3631l.isVip("height");
        abstractC7188l3.billing(c3631l, vKVideo.purchase);
        c3631l.isVip("image");
        this.billing.billing(c3631l, vKVideo.billing);
        c3631l.isVip("user_id");
        abstractC7188l2.billing(c3631l, vKVideo.mopub);
        c3631l.isVip("files");
        this.mopub.billing(c3631l, vKVideo.admob);
        c3631l.isVip("main_artists");
        this.admob.billing(c3631l, vKVideo.subs);
        c3631l.isVip("genres");
        this.subs.billing(c3631l, vKVideo.isPro);
        c3631l.isVip("duration");
        AbstractC12589l.inmobi(vKVideo.firebase, abstractC7188l, c3631l, "direct_url");
        this.isPro.billing(c3631l, vKVideo.smaato);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        int i = -1;
        boolean z = false;
        Integer num = null;
        boolean z2 = false;
        Object objLoadAd = null;
        Object objLoadAd2 = null;
        Long l = null;
        String str = null;
        Integer num2 = null;
        Integer num3 = null;
        List list = null;
        Long l2 = null;
        VKVideoFiles vKVideoFiles = null;
        Object objLoadAd3 = null;
        int iIntValue = 0;
        while (true) {
            if (!c0396l.m504package()) {
                Integer num4 = num;
                boolean z3 = z2;
                c0396l.ads();
                if ((!z) & (num4 == null)) {
                    setLicense = AbstractC2812l.license("id", "id", c0396l, setLicense);
                }
                if ((!z3) & (str == null)) {
                    setLicense = AbstractC2812l.license("title", "title", c0396l, setLicense);
                }
                if (setLicense.size() != 0) {
                    C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
                    return null;
                }
                Object obj = objLoadAd;
                if (i == -3841) {
                    return new VKVideo(num4.intValue(), l, str, num2, num3, list, l2, vKVideoFiles, (List) obj, (List) objLoadAd2, iIntValue, (String) objLoadAd3);
                }
                Object obj2 = objLoadAd2;
                int iIntValue2 = num4.intValue();
                List list2 = (List) obj;
                List list3 = (List) obj2;
                String str2 = (String) objLoadAd3;
                if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    list2 = null;
                }
                List list4 = (i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? null : list3;
                if ((i & 1024) != 0) {
                    iIntValue = 0;
                }
                return new VKVideo(iIntValue2, l, str, num2, num3, list, l2, vKVideoFiles, list2, list4, iIntValue, (i & 2048) == 0 ? str2 : null);
            }
            boolean z4 = z;
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.purchase;
            Integer num5 = num;
            AbstractC7188l abstractC7188l2 = this.crashlytics;
            boolean z5 = z2;
            AbstractC7188l abstractC7188l3 = this.loadAd;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                case 0:
                    Object objLoadAd4 = abstractC7188l3.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setLicense = AbstractC2812l.isVip("id", "id", c0396l, setLicense);
                        z = true;
                        num = num5;
                    } else {
                        num = (Integer) objLoadAd4;
                        z = z4;
                    }
                    z2 = z5;
                    break;
                case 1:
                    l = (Long) abstractC7188l2.loadAd(c0396l);
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                case 2:
                    Object objLoadAd5 = this.amazon.loadAd(c0396l);
                    if (objLoadAd5 != null) {
                        str = (String) objLoadAd5;
                        z = z4;
                        num = num5;
                        z2 = z5;
                    } else {
                        setLicense = AbstractC2812l.isVip("title", "title", c0396l, setLicense);
                        z = z4;
                        z2 = true;
                        num = num5;
                    }
                    break;
                case 3:
                    num2 = (Integer) abstractC7188l.loadAd(c0396l);
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                case 4:
                    num3 = (Integer) abstractC7188l.loadAd(c0396l);
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                case 5:
                    list = (List) this.billing.loadAd(c0396l);
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                case 6:
                    l2 = (Long) abstractC7188l2.loadAd(c0396l);
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                case 7:
                    vKVideoFiles = (VKVideoFiles) this.mopub.loadAd(c0396l);
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                case 8:
                    objLoadAd = this.admob.loadAd(c0396l);
                    i &= -257;
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                case 9:
                    objLoadAd2 = this.subs.loadAd(c0396l);
                    i &= -513;
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                case 10:
                    Object objLoadAd6 = abstractC7188l3.loadAd(c0396l);
                    if (objLoadAd6 == null) {
                        setLicense = AbstractC2812l.isVip("duration", "duration", c0396l, setLicense);
                    } else {
                        iIntValue = ((Number) objLoadAd6).intValue();
                    }
                    i &= -1025;
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                case 11:
                    objLoadAd3 = this.isPro.loadAd(c0396l);
                    i &= -2049;
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                default:
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
            }
        }
    }

    public final String toString() {
        return "GeneratedJsonAdapter(VKVideo)";
    }
}
