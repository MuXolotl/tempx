package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import bruhcollective.itaysonlab.libvkmusic.objects.UserInfo;
import bruhcollective.itaysonlab.libvkmusic.objects.auth.VkConnectResponse;
import java.nio.charset.Charset;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؘُ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5993l {
    public final AbstractC7188l amazon;
    public UserInfo crashlytics;
    public VkConnectResponse loadAd;
    public final AbstractC7188l purchase;
    public final SharedPreferences yandex;

    public C5993l() {
        VkConnectResponse vkConnectResponse;
        Object objCrashlytics;
        VKXApplication vKXApplication = VKXApplication.f36631l;
        UserInfo userInfo = null;
        Object objCrashlytics2 = null;
        SharedPreferences sharedPreferences = (vKXApplication == null ? null : vKXApplication).getSharedPreferences("LVMAccount", 0);
        this.yandex = sharedPreferences;
        C12952l c12952l = VKXApplication.f36629l;
        AbstractC7188l abstractC7188lYandex = AbstractC9968l.yandex(c12952l, AbstractC18202l.yandex(VkConnectResponse.class));
        this.amazon = abstractC7188lYandex;
        this.purchase = AbstractC9968l.yandex(c12952l, AbstractC18202l.yandex(UserInfo.class));
        if (yandex()) {
            try {
                objCrashlytics = abstractC7188lYandex.crashlytics(new String(Base64.decode(sharedPreferences.getString("data0", ""), 0), AbstractC9050l.yandex));
            } catch (Exception unused) {
                objCrashlytics = null;
            }
            vkConnectResponse = (VkConnectResponse) objCrashlytics;
        } else {
            vkConnectResponse = null;
        }
        this.loadAd = vkConnectResponse == null ? new VkConnectResponse(7, 0L, null, null) : vkConnectResponse;
        if (yandex()) {
            try {
                objCrashlytics2 = this.purchase.crashlytics(new String(Base64.decode(this.yandex.getString("data1", ""), 0), AbstractC9050l.yandex));
            } catch (Exception unused2) {
            }
            userInfo = (UserInfo) objCrashlytics2;
        }
        this.crashlytics = userInfo == null ? new UserInfo(0L, null, null, null, null, 31) : userInfo;
    }

    public final void crashlytics(VkConnectResponse vkConnectResponse) {
        this.loadAd = vkConnectResponse;
        String strPurchase = this.amazon.purchase(vkConnectResponse);
        SharedPreferences sharedPreferences = this.yandex;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Charset charset = AbstractC9050l.yandex;
        editorEdit.putString("data0", new String(Base64.encode(strPurchase.getBytes(charset), 0), charset)).apply();
        sharedPreferences.edit().putBoolean("auth", true).putLong("authTime", System.currentTimeMillis()).apply();
    }

    public final void loadAd() {
        this.loadAd = new VkConnectResponse(7, 0L, null, null);
        this.crashlytics = new UserInfo(0L, null, null, null, null, 31);
        this.yandex.edit().clear().apply();
    }

    public final boolean yandex() {
        return this.yandex.getBoolean("auth", false);
    }
}
