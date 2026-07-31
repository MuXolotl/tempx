package defpackage;

import android.os.Bundle;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٜٗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17251l implements Function2 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33479l;

    public /* synthetic */ C17251l(int i) {
        this.f33479l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f33479l) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC18296l.loadAd((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC18296l.purchase((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC9843l.amazon((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC0136l.yandex((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC7370l.amazon((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC7370l.crashlytics((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            default:
                C6576l c6576l = (C6576l) obj2;
                Bundle bundle = new Bundle();
                WebView webView = (WebView) c6576l.admob.getValue();
                if (webView != null) {
                    webView.saveState(bundle);
                }
                return AbstractC8676l.remoteconfig(new C8195l("pagetitle", (String) c6576l.amazon.getValue()), new C8195l("lastloaded", (String) c6576l.yandex.getValue()), new C8195l("bundle", bundle));
        }
    }

    public /* synthetic */ C17251l(int i, int i2) {
        this.f33479l = i2;
    }
}
