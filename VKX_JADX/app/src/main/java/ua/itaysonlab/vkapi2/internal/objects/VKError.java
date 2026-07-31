package ua.itaysonlab.vkapi2.internal.objects;

import defpackage.AbstractC12589l;
import defpackage.AbstractC12994l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import defpackage.InterfaceC9347l;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u008a\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lua/itaysonlab/vkapi2/internal/objects/VKError;", "", "", "error_code", "", "error_msg", "method", "", "Lua/itaysonlab/vkapi2/internal/objects/VKRequestParameter;", "request_params", "captchaSid", "captchaImg", "", "captchaTs", "captchaRatio", "captchaAttempt", "redirectUri", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;)V", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;)Lua/itaysonlab/vkapi2/internal/objects/VKError;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class VKError {
    public final Double admob;
    public final List amazon;
    public final String billing;
    public final String crashlytics;
    public final String isPro;
    public final String loadAd;
    public final Double mopub;
    public final String purchase;
    public final Integer subs;
    public final int yandex;

    public /* synthetic */ VKError(int i, String str, String str2, List list, String str3, String str4, Double d, Double d2, Integer num, String str5, int i2) {
        this(i, str, str2, list, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : d, (i2 & 128) != 0 ? null : d2, (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : num, (i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? null : str5);
    }

    public final VKError copy(int error_code, String error_msg, String method, List<VKRequestParameter> request_params, @InterfaceC9347l(name = "captcha_sid") String captchaSid, @InterfaceC9347l(name = "captcha_img") String captchaImg, @InterfaceC9347l(name = "captcha_ts") Double captchaTs, @InterfaceC9347l(name = "captcha_ratio") Double captchaRatio, @InterfaceC9347l(name = "captcha_attempt") Integer captchaAttempt, @InterfaceC9347l(name = "redirect_uri") String redirectUri) {
        return new VKError(error_code, error_msg, method, request_params, captchaSid, captchaImg, captchaTs, captchaRatio, captchaAttempt, redirectUri);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKError)) {
            return false;
        }
        VKError vKError = (VKError) obj;
        return this.yandex == vKError.yandex && AbstractC8576l.yandex(this.loadAd, vKError.loadAd) && AbstractC8576l.yandex(this.crashlytics, vKError.crashlytics) && AbstractC8576l.yandex(this.amazon, vKError.amazon) && AbstractC8576l.yandex(this.purchase, vKError.purchase) && AbstractC8576l.yandex(this.billing, vKError.billing) && AbstractC8576l.yandex(this.mopub, vKError.mopub) && AbstractC8576l.yandex(this.admob, vKError.admob) && AbstractC8576l.yandex(this.subs, vKError.subs) && AbstractC8576l.yandex(this.isPro, vKError.isPro);
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(this.yandex * 31, 31, this.loadAd);
        String str = this.crashlytics;
        int iHashCode = (iAdvert + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.amazon;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.purchase;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billing;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.mopub;
        int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.admob;
        int iHashCode6 = (iHashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.subs;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.isPro;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VKError(error_code=");
        sb.append(this.yandex);
        sb.append(", error_msg=");
        sb.append(this.loadAd);
        sb.append(", method=");
        sb.append(this.crashlytics);
        sb.append(", request_params=");
        sb.append(this.amazon);
        sb.append(", captchaSid=");
        sb.append(this.purchase);
        sb.append(", captchaImg=");
        sb.append(this.billing);
        sb.append(", captchaTs=");
        sb.append(this.mopub);
        sb.append(", captchaRatio=");
        sb.append(this.admob);
        sb.append(", captchaAttempt=");
        sb.append(this.subs);
        sb.append(", redirectUri=");
        return AbstractC2812l.tapsense(sb, this.isPro, ')');
    }

    public VKError(int i, String str, String str2, List<VKRequestParameter> list, @InterfaceC9347l(name = "captcha_sid") String str3, @InterfaceC9347l(name = "captcha_img") String str4, @InterfaceC9347l(name = "captcha_ts") Double d, @InterfaceC9347l(name = "captcha_ratio") Double d2, @InterfaceC9347l(name = "captcha_attempt") Integer num, @InterfaceC9347l(name = "redirect_uri") String str5) {
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = list;
        this.purchase = str3;
        this.billing = str4;
        this.mopub = d;
        this.admob = d2;
        this.subs = num;
        this.isPro = str5;
    }
}
