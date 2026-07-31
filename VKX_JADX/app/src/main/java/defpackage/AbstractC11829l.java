package defpackage;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.autofill.AutofillId;

/* JADX INFO: renamed from: lِٓۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11829l {
    public static float amazon(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static void billing(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l) {
        ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC13840l.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC13840l, viewTreeObserverOnGlobalLayoutListenerC13840l);
        }
    }

    public static float crashlytics(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float loadAd(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float purchase(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static AutofillId yandex(View view) {
        return view.getAutofillId();
    }
}
