package bruhcollective.itaysonlab.libvkmusic.objects.auth;

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
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class VkConnectResponseJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("expires_in", "access_token", "refresh_token");

    public VkConnectResponseJsonAdapter(C12952l c12952l) {
        Class cls = Long.TYPE;
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(cls, c5746l, "expires_in");
        this.crashlytics = c12952l.loadAd(String.class, c5746l, "access_token");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        VkConnectResponse vkConnectResponse = (VkConnectResponse) obj;
        c3631l.mopub();
        c3631l.isVip("expires_in");
        AbstractC12589l.m3427throws(vkConnectResponse.yandex, this.loadAd, c3631l, "access_token");
        String str = vkConnectResponse.loadAd;
        AbstractC7188l abstractC7188l = this.crashlytics;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("refresh_token");
        abstractC7188l.billing(c3631l, vkConnectResponse.crashlytics);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setIsVip = C5746l.f12138l;
        long jLongValue = 0;
        Object obj = null;
        Object obj2 = null;
        int i = -1;
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
                        setIsVip = AbstractC2812l.isVip("access_token", "access_token", c0396l, setIsVip);
                    } else {
                        obj = objLoadAd;
                    }
                    i &= -3;
                } else if (iM503l == 2) {
                    Object objLoadAd2 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd2 == null) {
                        setIsVip = AbstractC2812l.isVip("refresh_token", "refresh_token", c0396l, setIsVip);
                    } else {
                        obj2 = objLoadAd2;
                    }
                    i &= -5;
                }
            } else {
                Object objLoadAd3 = this.loadAd.loadAd(c0396l);
                if (objLoadAd3 == null) {
                    setIsVip = AbstractC2812l.isVip("expires_in", "expires_in", c0396l, setIsVip);
                } else {
                    jLongValue = ((Number) objLoadAd3).longValue();
                }
                i &= -2;
            }
        }
        c0396l.ads();
        if (setIsVip.size() == 0) {
            return i == -8 ? new VkConnectResponse(jLongValue, (String) obj, (String) obj2) : new VkConnectResponse(i, jLongValue, (String) obj, (String) obj2);
        }
        C11467l.subscription(AbstractC16901l.m4210case(setIsVip, "\n", null, null, null, 62));
        return null;
    }

    public final String toString() {
        return "GeneratedJsonAdapter(VkConnectResponse)";
    }
}
