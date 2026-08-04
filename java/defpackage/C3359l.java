package defpackage;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّؕٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3359l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10299l f7159l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7160l;

    public /* synthetic */ C3359l(C10299l c10299l, int i) {
        this.f7160l = i;
        this.f7159l = c10299l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f7160l;
        C10299l c10299l = this.f7159l;
        switch (i) {
            case 0:
                c10299l.f20980l = true;
                c10299l.f20982l.invoke((String) obj);
                c10299l.purchase();
                break;
            case 1:
                c10299l.f20980l = !((Boolean) obj).booleanValue();
                c10299l.purchase();
                break;
            default:
                WebView webView = (WebView) obj;
                webView.setBackgroundColor(0);
                webView.setVerticalScrollBarEnabled(false);
                webView.setOverScrollMode(2);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.addJavascriptInterface(c10299l.f20981l, "AndroidBridge");
                break;
        }
        return Unit.INSTANCE;
    }
}
