package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* JADX INFO: renamed from: lؘۥؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6079l {
    public AutofillManager loadAd;
    public final Context yandex;

    public C6079l(Context context) {
        this.yandex = context;
    }

    public final void amazon(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, int i, Rect rect) {
        loadAd().notifyViewEntered(viewTreeObserverOnGlobalLayoutListenerC13840l, i, rect);
    }

    public final void billing(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            AbstractC16578l.yandex(view, loadAd(), i, z);
        }
    }

    public final void crashlytics(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, int i, AutofillValue autofillValue) {
        loadAd().notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC13840l, i, autofillValue);
    }

    public final AutofillManager loadAd() {
        AutofillManager autofillManager = this.loadAd;
        if (autofillManager != null) {
            return autofillManager;
        }
        AutofillManager autofillManagerAmazon = C18073l.amazon(this.yandex.getSystemService(C18073l.billing()));
        if (autofillManagerAmazon != null) {
            this.loadAd = autofillManagerAmazon;
            return autofillManagerAmazon;
        }
        C8339l.smaato("Could not locate AutofillManager from context");
        return null;
    }

    public final void mopub(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, int i, Rect rect) {
        loadAd().requestAutofill(viewTreeObserverOnGlobalLayoutListenerC13840l, i, rect);
    }

    public final void purchase(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, int i) {
        loadAd().notifyViewExited(viewTreeObserverOnGlobalLayoutListenerC13840l, i);
    }

    public final void yandex() {
        loadAd().commit();
    }
}
