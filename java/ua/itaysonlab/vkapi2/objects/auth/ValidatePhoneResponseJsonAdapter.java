package ua.itaysonlab.vkapi2.objects.auth;

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
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class ValidatePhoneResponseJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("next_sid", "validation_type", "validation_resend", "delay", "external_id", "phone", "masked_email", "code_length", "device_name");

    public ValidatePhoneResponseJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "nextSid");
        this.crashlytics = c12952l.loadAd(Integer.TYPE, c5746l, "delayBeforeNextCall");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        ValidatePhoneResponse validatePhoneResponse = (ValidatePhoneResponse) obj;
        c3631l.mopub();
        c3631l.isVip("next_sid");
        String str = validatePhoneResponse.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("validation_type");
        abstractC7188l.billing(c3631l, validatePhoneResponse.loadAd);
        c3631l.isVip("validation_resend");
        abstractC7188l.billing(c3631l, validatePhoneResponse.crashlytics);
        c3631l.isVip("delay");
        int i = validatePhoneResponse.amazon;
        AbstractC7188l abstractC7188l2 = this.crashlytics;
        AbstractC12589l.inmobi(i, abstractC7188l2, c3631l, "external_id");
        abstractC7188l.billing(c3631l, validatePhoneResponse.purchase);
        c3631l.isVip("phone");
        abstractC7188l.billing(c3631l, validatePhoneResponse.billing);
        c3631l.isVip("masked_email");
        abstractC7188l.billing(c3631l, validatePhoneResponse.mopub);
        c3631l.isVip("code_length");
        AbstractC12589l.inmobi(validatePhoneResponse.admob, abstractC7188l2, c3631l, "device_name");
        abstractC7188l.billing(c3631l, validatePhoneResponse.subs);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setIsVip = C5746l.f12138l;
        int i = -1;
        int iIntValue = 0;
        int iIntValue2 = 0;
        Object objLoadAd = null;
        Object objLoadAd2 = null;
        Object objLoadAd3 = null;
        Object objLoadAd4 = null;
        Object objLoadAd5 = null;
        Object objLoadAd6 = null;
        Object objLoadAd7 = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.crashlytics;
            AbstractC7188l abstractC7188l2 = this.loadAd;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    break;
                case 0:
                    objLoadAd = abstractC7188l2.loadAd(c0396l);
                    i &= -2;
                    break;
                case 1:
                    objLoadAd2 = abstractC7188l2.loadAd(c0396l);
                    i &= -3;
                    break;
                case 2:
                    objLoadAd3 = abstractC7188l2.loadAd(c0396l);
                    i &= -5;
                    break;
                case 3:
                    Object objLoadAd8 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd8 == null) {
                        setIsVip = AbstractC2812l.isVip("delayBeforeNextCall", "delay", c0396l, setIsVip);
                    } else {
                        iIntValue = ((Number) objLoadAd8).intValue();
                    }
                    i &= -9;
                    break;
                case 4:
                    objLoadAd4 = abstractC7188l2.loadAd(c0396l);
                    i &= -17;
                    break;
                case 5:
                    objLoadAd5 = abstractC7188l2.loadAd(c0396l);
                    i &= -33;
                    break;
                case 6:
                    objLoadAd6 = abstractC7188l2.loadAd(c0396l);
                    i &= -65;
                    break;
                case 7:
                    Object objLoadAd9 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd9 == null) {
                        setIsVip = AbstractC2812l.isVip("codeLength", "code_length", c0396l, setIsVip);
                    } else {
                        iIntValue2 = ((Number) objLoadAd9).intValue();
                    }
                    i &= -129;
                    break;
                case 8:
                    objLoadAd7 = abstractC7188l2.loadAd(c0396l);
                    i &= -257;
                    break;
            }
        }
        c0396l.ads();
        if (setIsVip.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setIsVip, "\n", null, null, null, 62));
            return null;
        }
        Object obj = objLoadAd4;
        if (i == -512) {
            return new ValidatePhoneResponse((String) objLoadAd, (String) objLoadAd2, (String) objLoadAd3, iIntValue, (String) obj, (String) objLoadAd5, (String) objLoadAd6, iIntValue2, (String) objLoadAd7);
        }
        String str = (String) objLoadAd2;
        String str2 = (String) objLoadAd3;
        String str3 = (String) obj;
        String str4 = (String) objLoadAd5;
        String str5 = (String) objLoadAd6;
        String str6 = (String) objLoadAd7;
        String str7 = (i & 1) != 0 ? null : (String) objLoadAd;
        String str8 = (i & 2) != 0 ? null : str;
        String str9 = (i & 4) != 0 ? null : str2;
        if ((i & 8) != 0) {
            iIntValue = 120;
        }
        return new ValidatePhoneResponse(str7, str8, str9, iIntValue, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? 0 : iIntValue2, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : str6);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ValidatePhoneResponse)";
    }
}
