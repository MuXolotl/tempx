package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lؚٖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC16378l implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ InterfaceC12833l crashlytics;
    public final /* synthetic */ View loadAd;
    public C1473l yandex = null;

    public ViewOnApplyWindowInsetsListenerC16378l(View view, InterfaceC12833l interfaceC12833l) {
        this.loadAd = view;
        this.crashlytics = interfaceC12833l;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C1473l c1473lAdmob = C1473l.admob(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        InterfaceC12833l interfaceC12833l = this.crashlytics;
        if (i < 30) {
            AbstractC8558l.yandex(windowInsets, this.loadAd);
            if (c1473lAdmob.equals(this.yandex)) {
                return interfaceC12833l.mo404implements(view, c1473lAdmob).mopub();
            }
        }
        this.yandex = c1473lAdmob;
        C1473l c1473lMo404implements = interfaceC12833l.mo404implements(view, c1473lAdmob);
        if (i >= 30) {
            return c1473lMo404implements.mopub();
        }
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        view.requestApplyInsets();
        return c1473lMo404implements.mopub();
    }
}
