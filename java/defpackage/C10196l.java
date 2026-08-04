package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: lٍَ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C10196l extends AbstractC0593l {
    public final Window crashlytics;
    public final WindowInsetsController loadAd;

    public C10196l(Window window, C1770l c1770l) {
        this.loadAd = window.getInsetsController();
        this.crashlytics = window;
    }

    @Override // defpackage.AbstractC0593l
    public void amazon(boolean z) {
        mopub(16, 16, z);
    }

    @Override // defpackage.AbstractC0593l
    public final void billing() {
        this.loadAd.show(1);
    }

    @Override // defpackage.AbstractC0593l
    public final void crashlytics() {
        this.loadAd.hide(1);
    }

    public final void mopub(int i, int i2, boolean z) {
        Window window = this.crashlytics;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.loadAd;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }

    @Override // defpackage.AbstractC0593l
    public void purchase(boolean z) {
        mopub(8192, 8, z);
    }
}
