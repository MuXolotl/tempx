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

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class AudioStreamMix_LinkJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("id", "title");

    public AudioStreamMix_LinkJsonAdapter(C12952l c12952l) {
        this.loadAd = c12952l.loadAd(String.class, C5746l.f12138l, "id");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        AudioStreamMix.Link link = (AudioStreamMix.Link) obj;
        c3631l.mopub();
        c3631l.isVip("id");
        String str = link.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("title");
        abstractC7188l.billing(c3631l, link.loadAd);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        String str = null;
        Object obj = null;
        boolean z = false;
        byte b = -1;
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
                        str = (String) objLoadAd;
                    }
                } else if (iM503l == 1) {
                    Object objLoadAd2 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd2 == null) {
                        setLicense = AbstractC2812l.isVip("title", "title", c0396l, setLicense);
                    } else {
                        obj = objLoadAd2;
                    }
                    b = -3;
                }
            } else {
                c0396l.m502l();
                c0396l.m501l();
            }
        }
        c0396l.ads();
        if ((!z) & (str == null)) {
            setLicense = AbstractC2812l.license("id", "id", c0396l, setLicense);
        }
        if (setLicense.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
            return null;
        }
        String str2 = (String) obj;
        if (b == -3) {
            return new AudioStreamMix.Link(str, str2);
        }
        if ((b & 2) != 0) {
            str2 = "";
        }
        return new AudioStreamMix.Link(str, str2);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioStreamMix.Link)";
    }
}
