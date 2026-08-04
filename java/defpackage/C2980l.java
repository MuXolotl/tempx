package defpackage;

import android.os.Handler;
import android.util.Log;
import android.webkit.JavascriptInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lّؔۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2980l implements InterfaceC15043l {
    public final C3359l crashlytics;
    public final C3359l loadAd;
    public final Handler yandex;
    public boolean amazon = true;
    public final C10086l purchase = AbstractC8020l.smaato(Boolean.FALSE);

    public C2980l(Handler handler, C3359l c3359l, C3359l c3359l2) {
        this.yandex = handler;
        this.loadAd = c3359l;
        this.crashlytics = c3359l2;
    }

    @Override // defpackage.InterfaceC15043l
    @JavascriptInterface
    public void VKCaptchaCloseCaptcha(String str) {
        this.crashlytics.invoke(Boolean.valueOf(this.amazon));
    }

    @Override // defpackage.InterfaceC15043l
    @JavascriptInterface
    public void VKCaptchaGetResult(String str) {
        try {
            String string = new JSONObject(str).getString("token");
            this.amazon = false;
            this.yandex.post(new RunnableC10311l(this, string, 18));
        } catch (JSONException e) {
            Log.e("VKCaptchaWebView", "Error when parsing json\n Error:" + e);
        }
    }

    @Override // defpackage.InterfaceC15043l
    @JavascriptInterface
    public void VKCaptchaListenSensorsStart(String str) {
        this.purchase.setValue(Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC15043l
    @JavascriptInterface
    public void VKCaptchaListenSensorsStop(String str) {
    }
}
