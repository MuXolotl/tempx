package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.auth.VkConnectResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lِْٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11807l extends AbstractC13852l {
    public final boolean amazon;

    public C11807l(String str, String str2) throws UnsupportedEncodingException {
        super(VkConnectResponse.class, "/oauth/vkconnect/vk/token");
        this.amazon = true;
        C6168l c6168l = C6168l.f12991l;
        VKXApplication.Companion companion = VKXApplication.f36628l;
        String strAdcel = c6168l.adcel();
        if (strAdcel != null) {
            this.crashlytics.put("device_id", strAdcel);
        }
        this.crashlytics.put("device_os", "android");
        String strEncode = URLEncoder.encode(str2, "UTF-8");
        if (strEncode != null) {
            this.crashlytics.put("uuid", strEncode);
        }
        String strEncode2 = URLEncoder.encode(str, "UTF-8");
        if (strEncode2 != null) {
            this.crashlytics.put("silent_token", strEncode2);
        }
    }

    @Override // defpackage.AbstractC13852l
    public final boolean admob() {
        return this.amazon;
    }

    @Override // defpackage.AbstractC13852l
    public final boolean billing() {
        return false;
    }
}
