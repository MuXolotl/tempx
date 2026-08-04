package defpackage;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;

/* JADX INFO: renamed from: lٌؙؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7142l {
    public final WebResourceError loadAd;
    public final WebResourceRequest yandex;

    public C7142l(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.yandex = webResourceRequest;
        this.loadAd = webResourceError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7142l)) {
            return false;
        }
        C7142l c7142l = (C7142l) obj;
        return AbstractC8576l.yandex(this.yandex, c7142l.yandex) && this.loadAd.equals(c7142l.loadAd);
    }

    public final int hashCode() {
        WebResourceRequest webResourceRequest = this.yandex;
        return this.loadAd.hashCode() + ((webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31);
    }

    public final String toString() {
        return "WebViewError(request=" + this.yandex + ", error=" + this.loadAd + ')';
    }
}
