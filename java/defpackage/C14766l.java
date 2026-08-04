package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: renamed from: lٌٔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14766l extends WebChromeClient {
    public C6576l yandex;

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        C6576l c6576l = this.yandex;
        if (c6576l == null) {
            c6576l = null;
        }
        if (((AbstractC14265l) c6576l.crashlytics.getValue()) instanceof C3970l) {
            return;
        }
        C6576l c6576l2 = this.yandex;
        (c6576l2 != null ? c6576l2 : null).crashlytics.setValue(new C18667l(i / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        C6576l c6576l = this.yandex;
        if (c6576l == null) {
            c6576l = null;
        }
        c6576l.purchase.setValue(bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        C6576l c6576l = this.yandex;
        if (c6576l == null) {
            c6576l = null;
        }
        c6576l.amazon.setValue(str);
    }
}
