package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: renamed from: lؚٜٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7363l extends WebViewClient {
    public final /* synthetic */ C10299l amazon;
    public boolean crashlytics;
    public C16875l loadAd;
    public C6576l yandex;

    public C7363l(C10299l c10299l) {
        this.amazon = c10299l;
    }

    public final void amazon(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceError != null) {
            C6576l c6576l = this.yandex;
            if (c6576l == null) {
                c6576l = null;
            }
            c6576l.billing.add(new C7142l(webResourceRequest, webResourceError));
        }
    }

    public final void crashlytics(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        C6576l c6576l = this.yandex;
        if (c6576l == null) {
            c6576l = null;
        }
        c6576l.crashlytics.setValue(new C18667l(0.0f));
        C6576l c6576l2 = this.yandex;
        if (c6576l2 == null) {
            c6576l2 = null;
        }
        c6576l2.billing.clear();
        C6576l c6576l3 = this.yandex;
        if (c6576l3 == null) {
            c6576l3 = null;
        }
        c6576l3.amazon.setValue(null);
        C6576l c6576l4 = this.yandex;
        if (c6576l4 == null) {
            c6576l4 = null;
        }
        c6576l4.purchase.setValue(null);
        C6576l c6576l5 = this.yandex;
        (c6576l5 != null ? c6576l5 : null).yandex.setValue(str);
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        C16875l c16875l = this.loadAd;
        if (c16875l == null) {
            c16875l = null;
        }
        c16875l.loadAd.setValue(Boolean.valueOf(webView.canGoBack()));
        C16875l c16875l2 = this.loadAd;
        (c16875l2 != null ? c16875l2 : null).crashlytics.setValue(Boolean.valueOf(webView.canGoForward()));
    }

    public final void loadAd(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C6576l c6576l = this.yandex;
        if (c6576l == null) {
            c6576l = null;
        }
        c6576l.crashlytics.setValue(C3970l.yandex);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        loadAd(webView, str);
        if (this.crashlytics) {
            return;
        }
        this.amazon.f20985l.setValue(Boolean.TRUE);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        crashlytics(webView, str, bitmap);
        yandex(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String string;
        int errorCode;
        amazon(webView, webResourceRequest, webResourceError);
        String strValueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        if (webResourceError != null) {
            string = webResourceError.getDescription().toString();
            errorCode = webResourceError.getErrorCode();
        } else {
            string = "no_description";
            errorCode = -1;
        }
        AbstractC2991l.billing("Captcha3", 5, errorCode + ':' + string + ':' + strValueOf, null);
        if (AbstractC8576l.yandex(webView.getUrl(), strValueOf)) {
            this.crashlytics = true;
            C10299l c10299l = this.amazon;
            c10299l.f20980l = true;
            c10299l.f20983l.invoke();
            c10299l.purchase();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        String url = sslError != null ? sslError.getUrl() : null;
        if (url == null) {
            url = "";
        }
        AbstractC2991l.billing("Captcha3", 5, "-11:ssl_exception:".concat(url), null);
        if (AbstractC8576l.yandex(webView != null ? webView.getUrl() : null, url)) {
            this.crashlytics = true;
            C10299l c10299l = this.amazon;
            c10299l.f20980l = true;
            c10299l.f20983l.invoke();
            c10299l.purchase();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return yandex(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
    }

    public final boolean yandex(String str) {
        if (str != null) {
            Uri uri = Uri.parse(AbstractC16648l.advert(str, "#", "?", false));
            String queryParameter = uri.getQueryParameter("success");
            C10299l c10299l = this.amazon;
            if (queryParameter != null) {
                c10299l.f20980l = true;
                c10299l.f20982l.invoke(null);
                c10299l.purchase();
                return true;
            }
            if (uri.getQueryParameter("cancel") != null) {
                c10299l.f20980l = true;
                c10299l.f20983l.invoke();
                c10299l.purchase();
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return yandex(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        AbstractC2991l.billing("Captcha3", 5, i + ':' + str + ':' + str2, null);
        if (AbstractC8576l.yandex(webView != null ? webView.getUrl() : null, str2)) {
            this.crashlytics = true;
            C10299l c10299l = this.amazon;
            c10299l.f20980l = true;
            c10299l.f20983l.invoke();
            c10299l.purchase();
        }
    }
}
