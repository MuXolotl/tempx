package ua.itaysonlab.vkapi2.objects.message;

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
public final class ConversationPeerJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("id", "type", "local_id");

    public ConversationPeerJsonAdapter(C12952l c12952l) {
        Class cls = Long.TYPE;
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(cls, c5746l, "id");
        this.crashlytics = c12952l.loadAd(String.class, c5746l, "type");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        ConversationPeer conversationPeer = (ConversationPeer) obj;
        c3631l.mopub();
        c3631l.isVip("id");
        long j = conversationPeer.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        AbstractC12589l.m3427throws(j, abstractC7188l, c3631l, "type");
        this.crashlytics.billing(c3631l, conversationPeer.loadAd);
        c3631l.isVip("local_id");
        abstractC7188l.billing(c3631l, Long.valueOf(conversationPeer.crashlytics));
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Long l = null;
        String str = null;
        Long l2 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l != -1) {
                AbstractC7188l abstractC7188l = this.loadAd;
                if (iM503l == 0) {
                    Object objLoadAd = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd == null) {
                        setLicense = AbstractC2812l.isVip("id", "id", c0396l, setLicense);
                        z = true;
                    } else {
                        l = (Long) objLoadAd;
                    }
                } else if (iM503l == 1) {
                    Object objLoadAd2 = this.crashlytics.loadAd(c0396l);
                    if (objLoadAd2 == null) {
                        setLicense = AbstractC2812l.isVip("type", "type", c0396l, setLicense);
                        z2 = true;
                    } else {
                        str = (String) objLoadAd2;
                    }
                } else if (iM503l == 2) {
                    Object objLoadAd3 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd3 == null) {
                        setLicense = AbstractC2812l.isVip("local_id", "local_id", c0396l, setLicense);
                        z3 = true;
                    } else {
                        l2 = (Long) objLoadAd3;
                    }
                }
            } else {
                c0396l.m502l();
                c0396l.m501l();
            }
        }
        c0396l.ads();
        if ((!z) & (l == null)) {
            setLicense = AbstractC2812l.license("id", "id", c0396l, setLicense);
        }
        if ((!z2) & (str == null)) {
            setLicense = AbstractC2812l.license("type", "type", c0396l, setLicense);
        }
        if ((!z3) & (l2 == null)) {
            setLicense = AbstractC2812l.license("local_id", "local_id", c0396l, setLicense);
        }
        if (setLicense.size() == 0) {
            return new ConversationPeer(str, l.longValue(), l2.longValue());
        }
        C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
        return null;
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ConversationPeer)";
    }
}
