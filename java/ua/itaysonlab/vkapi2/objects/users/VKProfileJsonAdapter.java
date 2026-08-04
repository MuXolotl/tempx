package ua.itaysonlab.vkapi2.objects.users;

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
public final class VKProfileJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("id", "first_name", "last_name", "photo_base", "name", "is_followed", "can_follow");

    public VKProfileJsonAdapter(C12952l c12952l) {
        Class cls = Long.TYPE;
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(cls, c5746l, "id");
        this.crashlytics = c12952l.loadAd(String.class, c5746l, "first_name");
        this.amazon = c12952l.loadAd(Boolean.class, c5746l, "is_followed");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        VKProfile vKProfile = (VKProfile) obj;
        c3631l.mopub();
        c3631l.isVip("id");
        AbstractC12589l.m3427throws(vKProfile.yandex, this.loadAd, c3631l, "first_name");
        String str = vKProfile.loadAd;
        AbstractC7188l abstractC7188l = this.crashlytics;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("last_name");
        abstractC7188l.billing(c3631l, vKProfile.crashlytics);
        c3631l.isVip("photo_base");
        abstractC7188l.billing(c3631l, vKProfile.amazon);
        c3631l.isVip("name");
        abstractC7188l.billing(c3631l, vKProfile.purchase);
        c3631l.isVip("is_followed");
        Boolean bool = vKProfile.billing;
        AbstractC7188l abstractC7188l2 = this.amazon;
        abstractC7188l2.billing(c3631l, bool);
        c3631l.isVip("can_follow");
        abstractC7188l2.billing(c3631l, vKProfile.mopub);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        int i = -1;
        boolean z = false;
        Long l = null;
        Object objLoadAd = null;
        Object objLoadAd2 = null;
        Object objLoadAd3 = null;
        Object objLoadAd4 = null;
        Object objLoadAd5 = null;
        Object objLoadAd6 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.amazon;
            AbstractC7188l abstractC7188l2 = this.crashlytics;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    break;
                case 0:
                    Object objLoadAd7 = this.loadAd.loadAd(c0396l);
                    if (objLoadAd7 != null) {
                        l = (Long) objLoadAd7;
                    } else {
                        setLicense = AbstractC2812l.isVip("id", "id", c0396l, setLicense);
                        z = true;
                    }
                    break;
                case 1:
                    objLoadAd = abstractC7188l2.loadAd(c0396l);
                    i &= -3;
                    break;
                case 2:
                    objLoadAd2 = abstractC7188l2.loadAd(c0396l);
                    i &= -5;
                    break;
                case 3:
                    objLoadAd3 = abstractC7188l2.loadAd(c0396l);
                    i &= -9;
                    break;
                case 4:
                    objLoadAd4 = abstractC7188l2.loadAd(c0396l);
                    i &= -17;
                    break;
                case 5:
                    objLoadAd5 = abstractC7188l.loadAd(c0396l);
                    i &= -33;
                    break;
                case 6:
                    objLoadAd6 = abstractC7188l.loadAd(c0396l);
                    i &= -65;
                    break;
            }
        }
        c0396l.ads();
        if ((!z) & (l == null)) {
            setLicense = AbstractC2812l.license("id", "id", c0396l, setLicense);
        }
        if (setLicense.size() == 0) {
            return i == -127 ? new VKProfile(l.longValue(), (String) objLoadAd, (String) objLoadAd2, (String) objLoadAd3, (String) objLoadAd4, (Boolean) objLoadAd5, (Boolean) objLoadAd6) : new VKProfile(l.longValue(), (String) objLoadAd, (String) objLoadAd2, (String) objLoadAd3, (String) objLoadAd4, (Boolean) objLoadAd5, (Boolean) objLoadAd6, i);
        }
        C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
        return null;
    }

    public final String toString() {
        return "GeneratedJsonAdapter(VKProfile)";
    }
}
