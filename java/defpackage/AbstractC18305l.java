package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: lۣ٘ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18305l {
    public static void crashlytics(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    public static CharSequence loadAd(View view) {
        return view.getStateDescription();
    }

    public static WindowInsets yandex(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }
}
