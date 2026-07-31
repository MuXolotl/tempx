package ua.itaysonlab.vkapi2.internal.objects;

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
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class VKErrorJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l mopub;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("error_code", "error_msg", "method", "request_params", "captcha_sid", "captcha_img", "captcha_ts", "captcha_ratio", "captcha_attempt", "redirect_uri");

    public VKErrorJsonAdapter(C12952l c12952l) {
        Class cls = Integer.TYPE;
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(cls, c5746l, "error_code");
        this.crashlytics = c12952l.loadAd(String.class, c5746l, "error_msg");
        this.amazon = c12952l.loadAd(String.class, c5746l, "method");
        this.purchase = c12952l.loadAd(AbstractC15639l.mopub(List.class, VKRequestParameter.class), c5746l, "request_params");
        this.billing = c12952l.loadAd(Double.class, c5746l, "captchaTs");
        this.mopub = c12952l.loadAd(Integer.class, c5746l, "captchaAttempt");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        VKError vKError = (VKError) obj;
        c3631l.mopub();
        c3631l.isVip("error_code");
        AbstractC12589l.inmobi(vKError.yandex, this.loadAd, c3631l, "error_msg");
        this.crashlytics.billing(c3631l, vKError.loadAd);
        c3631l.isVip("method");
        String str = vKError.crashlytics;
        AbstractC7188l abstractC7188l = this.amazon;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("request_params");
        this.purchase.billing(c3631l, vKError.amazon);
        c3631l.isVip("captcha_sid");
        abstractC7188l.billing(c3631l, vKError.purchase);
        c3631l.isVip("captcha_img");
        abstractC7188l.billing(c3631l, vKError.billing);
        c3631l.isVip("captcha_ts");
        Double d = vKError.mopub;
        AbstractC7188l abstractC7188l2 = this.billing;
        abstractC7188l2.billing(c3631l, d);
        c3631l.isVip("captcha_ratio");
        abstractC7188l2.billing(c3631l, vKError.admob);
        c3631l.isVip("captcha_attempt");
        this.mopub.billing(c3631l, vKError.subs);
        c3631l.isVip("redirect_uri");
        abstractC7188l.billing(c3631l, vKError.isPro);
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
        List list = null;
        Object objLoadAd = null;
        String str = null;
        String str2 = null;
        Object objLoadAd2 = null;
        Object objLoadAd3 = null;
        Object objLoadAd4 = null;
        Object objLoadAd5 = null;
        Object objLoadAd6 = null;
        while (c0396l.m504package()) {
            boolean z3 = z;
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.billing;
            Integer num2 = num;
            AbstractC7188l abstractC7188l2 = this.amazon;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    z = z3;
                    num = num2;
                    break;
                case 0:
                    Object objLoadAd7 = this.loadAd.loadAd(c0396l);
                    if (objLoadAd7 != null) {
                        num = (Integer) objLoadAd7;
                        z = z3;
                    } else {
                        setLicense = AbstractC2812l.isVip("error_code", "error_code", c0396l, setLicense);
                        z = true;
                        num = num2;
                    }
                    break;
                case 1:
                    Object objLoadAd8 = this.crashlytics.loadAd(c0396l);
                    if (objLoadAd8 == null) {
                        setLicense = AbstractC2812l.isVip("error_msg", "error_msg", c0396l, setLicense);
                        z = z3;
                        z2 = true;
                    } else {
                        str = (String) objLoadAd8;
                        z = z3;
                    }
                    num = num2;
                    break;
                case 2:
                    str2 = (String) abstractC7188l2.loadAd(c0396l);
                    z = z3;
                    num = num2;
                    break;
                case 3:
                    list = (List) this.purchase.loadAd(c0396l);
                    z = z3;
                    num = num2;
                    break;
                case 4:
                    objLoadAd = abstractC7188l2.loadAd(c0396l);
                    i &= -17;
                    z = z3;
                    num = num2;
                    break;
                case 5:
                    objLoadAd2 = abstractC7188l2.loadAd(c0396l);
                    i &= -33;
                    z = z3;
                    num = num2;
                    break;
                case 6:
                    objLoadAd3 = abstractC7188l.loadAd(c0396l);
                    i &= -65;
                    z = z3;
                    num = num2;
                    break;
                case 7:
                    objLoadAd4 = abstractC7188l.loadAd(c0396l);
                    i &= -129;
                    z = z3;
                    num = num2;
                    break;
                case 8:
                    objLoadAd5 = this.mopub.loadAd(c0396l);
                    i &= -257;
                    z = z3;
                    num = num2;
                    break;
                case 9:
                    objLoadAd6 = abstractC7188l2.loadAd(c0396l);
                    i &= -513;
                    z = z3;
                    num = num2;
                    break;
                default:
                    z = z3;
                    num = num2;
                    break;
            }
        }
        Integer num3 = num;
        c0396l.ads();
        if ((!z) & (num3 == null)) {
            setLicense = AbstractC2812l.license("error_code", "error_code", c0396l, setLicense);
        }
        if ((!z2) & (str == null)) {
            setLicense = AbstractC2812l.license("error_msg", "error_msg", c0396l, setLicense);
        }
        if (setLicense.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
            return null;
        }
        if (i == -1009) {
            return new VKError(num3.intValue(), str, str2, list, (String) objLoadAd, (String) objLoadAd2, (Double) objLoadAd3, (Double) objLoadAd4, (Integer) objLoadAd5, (String) objLoadAd6);
        }
        return new VKError(num3.intValue(), str, str2, list, (String) objLoadAd, (String) objLoadAd2, (Double) objLoadAd3, (Double) objLoadAd4, (Integer) objLoadAd5, (String) objLoadAd6, i);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(VKError)";
    }
}
