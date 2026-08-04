package ua.itaysonlab.vkapi2.objects.music;

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
public final class AudioChartInfoJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("position", "state");

    public AudioChartInfoJsonAdapter(C12952l c12952l) {
        this.loadAd = c12952l.loadAd(Integer.TYPE, C5746l.f12138l, "position");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        AudioChartInfo audioChartInfo = (AudioChartInfo) obj;
        c3631l.mopub();
        c3631l.isVip("position");
        int i = audioChartInfo.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        AbstractC12589l.inmobi(i, abstractC7188l, c3631l, "state");
        abstractC7188l.billing(c3631l, Integer.valueOf(audioChartInfo.loadAd));
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        Integer num = null;
        boolean z = false;
        int iIntValue = 0;
        byte b = -1;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l != -1) {
                AbstractC7188l abstractC7188l = this.loadAd;
                if (iM503l == 0) {
                    Object objLoadAd = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd == null) {
                        setLicense = AbstractC2812l.isVip("position", "position", c0396l, setLicense);
                        z = true;
                    } else {
                        num = (Integer) objLoadAd;
                    }
                } else if (iM503l == 1) {
                    Object objLoadAd2 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd2 == null) {
                        setLicense = AbstractC2812l.isVip("state", "state", c0396l, setLicense);
                    } else {
                        iIntValue = ((Number) objLoadAd2).intValue();
                    }
                    b = -3;
                }
            } else {
                c0396l.m502l();
                c0396l.m501l();
            }
        }
        c0396l.ads();
        if ((!z) & (num == null)) {
            setLicense = AbstractC2812l.license("position", "position", c0396l, setLicense);
        }
        if (setLicense.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
            return null;
        }
        int iIntValue2 = num.intValue();
        if (b == -3) {
            return new AudioChartInfo(iIntValue2, iIntValue);
        }
        return new AudioChartInfo(iIntValue2, (b & 2) == 0 ? iIntValue : -1);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioChartInfo)";
    }
}
