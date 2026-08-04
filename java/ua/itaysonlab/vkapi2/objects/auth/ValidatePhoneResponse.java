package ua.itaysonlab.vkapi2.objects.auth;

import defpackage.InterfaceC15749l;
import defpackage.InterfaceC9347l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lua/itaysonlab/vkapi2/objects/auth/ValidatePhoneResponse;", "", "", "nextSid", "newValidationType", "nextValidationType", "", "delayBeforeNextCall", "externalId", "phone", "maskedEmail", "codeLength", "deviceName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final class ValidatePhoneResponse {
    public final int admob;
    public final int amazon;
    public final String billing;
    public final String crashlytics;
    public final String loadAd;
    public final String mopub;
    public final String purchase;
    public final String subs;
    public final String yandex;

    public ValidatePhoneResponse(@InterfaceC9347l(name = "next_sid") String str, @InterfaceC9347l(name = "validation_type") String str2, @InterfaceC9347l(name = "validation_resend") String str3, @InterfaceC9347l(name = "delay") int i, @InterfaceC9347l(name = "external_id") String str4, @InterfaceC9347l(name = "phone") String str5, @InterfaceC9347l(name = "masked_email") String str6, @InterfaceC9347l(name = "code_length") int i2, @InterfaceC9347l(name = "device_name") String str7) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = i;
        this.purchase = str4;
        this.billing = str5;
        this.mopub = str6;
        this.admob = i2;
        this.subs = str7;
    }
}
