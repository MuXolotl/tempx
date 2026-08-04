package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.AbstractC12589l;
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
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class UserInfoJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("apiId", "firstName", "lastName", "shareHash", "tags");

    public UserInfoJsonAdapter(C12952l c12952l) {
        Class cls = Long.TYPE;
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(cls, c5746l, "apiId");
        this.crashlytics = c12952l.loadAd(String.class, c5746l, "firstName");
        this.amazon = c12952l.loadAd(AbstractC15639l.mopub(List.class, UmaTag.class), c5746l, "tags");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        UserInfo userInfo = (UserInfo) obj;
        c3631l.mopub();
        c3631l.isVip("apiId");
        AbstractC12589l.m3427throws(userInfo.yandex, this.loadAd, c3631l, "firstName");
        String str = userInfo.loadAd;
        AbstractC7188l abstractC7188l = this.crashlytics;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("lastName");
        abstractC7188l.billing(c3631l, userInfo.crashlytics);
        c3631l.isVip("shareHash");
        abstractC7188l.billing(c3631l, userInfo.amazon);
        c3631l.isVip("tags");
        this.amazon.billing(c3631l, userInfo.purchase);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setIsVip = C5746l.f12138l;
        long jLongValue = 0;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
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
                        setIsVip = AbstractC2812l.isVip("firstName", "firstName", c0396l, setIsVip);
                    } else {
                        obj = objLoadAd;
                    }
                    i &= -3;
                } else if (iM503l == 2) {
                    Object objLoadAd2 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd2 == null) {
                        setIsVip = AbstractC2812l.isVip("lastName", "lastName", c0396l, setIsVip);
                    } else {
                        obj2 = objLoadAd2;
                    }
                    i &= -5;
                } else if (iM503l == 3) {
                    Object objLoadAd3 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd3 == null) {
                        setIsVip = AbstractC2812l.isVip("shareHash", "shareHash", c0396l, setIsVip);
                    } else {
                        obj3 = objLoadAd3;
                    }
                    i &= -9;
                } else if (iM503l == 4) {
                    Object objLoadAd4 = this.amazon.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setIsVip = AbstractC2812l.isVip("tags", "tags", c0396l, setIsVip);
                    } else {
                        obj4 = objLoadAd4;
                    }
                    i &= -17;
                }
            } else {
                Object objLoadAd5 = this.loadAd.loadAd(c0396l);
                if (objLoadAd5 == null) {
                    setIsVip = AbstractC2812l.isVip("apiId", "apiId", c0396l, setIsVip);
                } else {
                    jLongValue = ((Number) objLoadAd5).longValue();
                }
                i &= -2;
            }
        }
        c0396l.ads();
        if (setIsVip.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setIsVip, "\n", null, null, null, 62));
            return null;
        }
        String str = (String) obj;
        String str2 = (String) obj2;
        String str3 = (String) obj3;
        List list = (List) obj4;
        return i == -32 ? new UserInfo(jLongValue, str, str2, str3, list) : new UserInfo(jLongValue, str, str2, str3, list, i);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UserInfo)";
    }
}
