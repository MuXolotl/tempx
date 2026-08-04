package defpackage;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: lَؒۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10037l implements OnBackInvokedCallback {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C10037l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    public final void onBackInvoked() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                ((LayoutInflaterFactory2C14405l) obj).m3849package();
                break;
            case 1:
                ((AbstractC13833l) obj).yandex();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
