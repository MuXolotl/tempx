package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: lٖٛ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C16489l extends C14571l {
    @Override // defpackage.C2654l, defpackage.AbstractC0559l
    public void loadAd(C11404l c11404l, C11404l c11404l2, Window window, View view, boolean z, boolean z2) {
        AbstractC0593l c6736l;
        AbstractC2829l.yandex(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        C1770l c1770l = new C1770l(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            c6736l = new C1492l(window, c1770l);
        } else if (i >= 30) {
            c6736l = new C10196l(window, c1770l);
        } else {
            c6736l = i >= 26 ? new C6736l(window, c1770l) : new C16280l(window, c1770l);
        }
        c6736l.purchase(!z);
        c6736l.amazon(true ^ z2);
    }
}
