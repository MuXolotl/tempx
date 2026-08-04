package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: lؘۧٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6124l {
    public final AbstractC0593l yandex;

    public C6124l(Window window, View view) {
        C1770l c1770l = new C1770l(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.yandex = new C1492l(window, c1770l);
            return;
        }
        if (i >= 30) {
            this.yandex = new C10196l(window, c1770l);
        } else if (i >= 26) {
            this.yandex = new C6736l(window, c1770l);
        } else {
            this.yandex = new C16280l(window, c1770l);
        }
    }

    public final void loadAd(boolean z) {
        this.yandex.purchase(z);
    }

    public final void yandex(boolean z) {
        this.yandex.amazon(z);
    }
}
