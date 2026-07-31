package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: lْۨۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13833l extends AbstractC14771l {
    public final int amazon;
    public boolean billing;
    public final OnBackInvokedDispatcher crashlytics;
    public final OnBackInvokedCallback purchase;

    public AbstractC13833l(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.crashlytics = onBackInvokedDispatcher;
        this.amazon = i;
        this.purchase = Build.VERSION.SDK_INT == 33 ? new C10037l(1, this) : new C9822l(this);
    }

    public final void amazon(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.purchase;
        if (z && !this.billing) {
            this.crashlytics.registerOnBackInvokedCallback(this.amazon, onBackInvokedCallback);
            this.billing = true;
        } else {
            if (z || !this.billing) {
                return;
            }
            this.crashlytics.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.billing = false;
        }
    }

    @Override // defpackage.AbstractC14771l
    public final void crashlytics() {
        amazon(false);
    }

    @Override // defpackage.AbstractC14771l
    public final void loadAd(boolean z) {
        amazon(z);
    }
}
