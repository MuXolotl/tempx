package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.AbstractC12994l;
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
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class SilentCredsJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("token", "first_name", "last_name", "ttl", "photo_50", "photo_100", "photo_200", "phone", "weight", "user_hash", "app_service_id");

    public SilentCredsJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "token");
        this.crashlytics = c12952l.loadAd(Integer.class, c5746l, "ttl");
        this.amazon = c12952l.loadAd(String.class, c5746l, "photo_50");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        SilentCreds silentCreds = (SilentCreds) obj;
        c3631l.mopub();
        c3631l.isVip("token");
        String str = silentCreds.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("first_name");
        abstractC7188l.billing(c3631l, silentCreds.loadAd);
        c3631l.isVip("last_name");
        abstractC7188l.billing(c3631l, silentCreds.crashlytics);
        c3631l.isVip("ttl");
        Integer num = silentCreds.amazon;
        AbstractC7188l abstractC7188l2 = this.crashlytics;
        abstractC7188l2.billing(c3631l, num);
        c3631l.isVip("photo_50");
        String str2 = silentCreds.purchase;
        AbstractC7188l abstractC7188l3 = this.amazon;
        abstractC7188l3.billing(c3631l, str2);
        c3631l.isVip("photo_100");
        abstractC7188l3.billing(c3631l, silentCreds.billing);
        c3631l.isVip("photo_200");
        abstractC7188l3.billing(c3631l, silentCreds.mopub);
        c3631l.isVip("phone");
        abstractC7188l3.billing(c3631l, silentCreds.admob);
        c3631l.isVip("weight");
        abstractC7188l2.billing(c3631l, silentCreds.subs);
        c3631l.isVip("user_hash");
        abstractC7188l3.billing(c3631l, silentCreds.isPro);
        c3631l.isVip("app_service_id");
        abstractC7188l2.billing(c3631l, silentCreds.firebase);
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
        String str2 = null;
        boolean z3 = false;
        String str3 = null;
        Object objLoadAd = null;
        Object objLoadAd2 = null;
        Object objLoadAd3 = null;
        Object objLoadAd4 = null;
        Object objLoadAd5 = null;
        Object objLoadAd6 = null;
        Object objLoadAd7 = null;
        Object objLoadAd8 = null;
        while (true) {
            boolean z4 = z;
            if (!c0396l.m504package()) {
                boolean z5 = z2;
                String str4 = str;
                String str5 = str2;
                c0396l.ads();
                if ((!z4) & (str4 == null)) {
                    setLicense = AbstractC2812l.license("token", "token", c0396l, setLicense);
                }
                if ((!z5) & (str5 == null)) {
                    setLicense = AbstractC2812l.license("first_name", "first_name", c0396l, setLicense);
                }
                if ((!z3) & (str3 == null)) {
                    setLicense = AbstractC2812l.license("last_name", "last_name", c0396l, setLicense);
                }
                if (setLicense.size() != 0) {
                    C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
                    return null;
                }
                if (i == -2041) {
                    return new SilentCreds(str4, str5, str3, (Integer) objLoadAd, (String) objLoadAd2, (String) objLoadAd3, (String) objLoadAd4, (String) objLoadAd5, (Integer) objLoadAd6, (String) objLoadAd7, (Integer) objLoadAd8);
                }
                return new SilentCreds(str4, str5, str3, (i & 8) != 0 ? 0 : (Integer) objLoadAd, (i & 16) != 0 ? null : (String) objLoadAd2, (i & 32) != 0 ? null : (String) objLoadAd3, (i & 64) != 0 ? null : (String) objLoadAd4, (i & 128) != 0 ? null : (String) objLoadAd5, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : (Integer) objLoadAd6, (i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? null : (String) objLoadAd7, (i & 1024) != 0 ? 0 : (Integer) objLoadAd8);
            }
            boolean z6 = z2;
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.loadAd;
            String str6 = str;
            AbstractC7188l abstractC7188l2 = this.crashlytics;
            String str7 = str2;
            AbstractC7188l abstractC7188l3 = this.amazon;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    z2 = z6;
                    z = z4;
                    str = str6;
                    str2 = str7;
                    break;
                case 0:
                    Object objLoadAd9 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd9 == null) {
                        setLicense = AbstractC2812l.isVip("token", "token", c0396l, setLicense);
                        z2 = z6;
                        z = true;
                        str = str6;
                    } else {
                        str = (String) objLoadAd9;
                        z2 = z6;
                        z = z4;
                    }
                    str2 = str7;
                    break;
                case 1:
                    Object objLoadAd10 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd10 != null) {
                        str2 = (String) objLoadAd10;
                        z2 = z6;
                        z = z4;
                        str = str6;
                    } else {
                        setLicense = AbstractC2812l.isVip("first_name", "first_name", c0396l, setLicense);
                        z = z4;
                        z2 = true;
                        str = str6;
                        str2 = str7;
                    }
                    break;
                case 2:
                    Object objLoadAd11 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd11 == null) {
                        setLicense = AbstractC2812l.isVip("last_name", "last_name", c0396l, setLicense);
                        z2 = z6;
                        z = z4;
                        z3 = true;
                    } else {
                        str3 = (String) objLoadAd11;
                        z2 = z6;
                        z = z4;
                    }
                    str = str6;
                    str2 = str7;
                    break;
                case 3:
                    objLoadAd = abstractC7188l2.loadAd(c0396l);
                    i &= -9;
                    z2 = z6;
                    z = z4;
                    str = str6;
                    str2 = str7;
                    break;
                case 4:
                    objLoadAd2 = abstractC7188l3.loadAd(c0396l);
                    i &= -17;
                    z2 = z6;
                    z = z4;
                    str = str6;
                    str2 = str7;
                    break;
                case 5:
                    objLoadAd3 = abstractC7188l3.loadAd(c0396l);
                    i &= -33;
                    z2 = z6;
                    z = z4;
                    str = str6;
                    str2 = str7;
                    break;
                case 6:
                    objLoadAd4 = abstractC7188l3.loadAd(c0396l);
                    i &= -65;
                    z2 = z6;
                    z = z4;
                    str = str6;
                    str2 = str7;
                    break;
                case 7:
                    objLoadAd5 = abstractC7188l3.loadAd(c0396l);
                    i &= -129;
                    z2 = z6;
                    z = z4;
                    str = str6;
                    str2 = str7;
                    break;
                case 8:
                    objLoadAd6 = abstractC7188l2.loadAd(c0396l);
                    i &= -257;
                    z2 = z6;
                    z = z4;
                    str = str6;
                    str2 = str7;
                    break;
                case 9:
                    objLoadAd7 = abstractC7188l3.loadAd(c0396l);
                    i &= -513;
                    z2 = z6;
                    z = z4;
                    str = str6;
                    str2 = str7;
                    break;
                case 10:
                    objLoadAd8 = abstractC7188l2.loadAd(c0396l);
                    i &= -1025;
                    z2 = z6;
                    z = z4;
                    str = str6;
                    str2 = str7;
                    break;
                default:
                    z2 = z6;
                    z = z4;
                    str = str6;
                    str2 = str7;
                    break;
            }
        }
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SilentCreds)";
    }
}
