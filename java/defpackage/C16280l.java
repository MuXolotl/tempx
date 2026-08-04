package defpackage;

import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lٌٖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C16280l extends AbstractC0593l {
    public final C1770l crashlytics;
    public final Window loadAd;

    public C16280l(Window window, C1770l c1770l) {
        this.loadAd = window;
        this.crashlytics = c1770l;
    }

    public final void admob(int i) {
        View decorView = this.loadAd.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.AbstractC0593l
    public final void billing() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((1 & i) != 0) {
                if (i == 1) {
                    admob(4);
                    this.loadAd.clearFlags(1024);
                } else if (i == 2) {
                    admob(2);
                } else if (i == 8) {
                    ((C3585l) this.crashlytics.f4179l).mo1357strictfp();
                }
            }
        }
    }

    @Override // defpackage.AbstractC0593l
    public final void crashlytics() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((1 & i) != 0) {
                if (i == 1) {
                    mopub(4);
                } else if (i == 2) {
                    mopub(2);
                } else if (i == 8) {
                    ((C3585l) this.crashlytics.f4179l).advert();
                }
            }
        }
    }

    public final void mopub(int i) {
        View decorView = this.loadAd.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    @Override // defpackage.AbstractC0593l
    public final void purchase(boolean z) {
        if (!z) {
            admob(8192);
            return;
        }
        Window window = this.loadAd;
        window.clearFlags(67108864);
        window.addFlags(RecyclerView.UNDEFINED_DURATION);
        mopub(8192);
    }
}
