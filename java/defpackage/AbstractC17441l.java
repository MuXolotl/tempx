package defpackage;

import android.view.View;

/* JADX INFO: renamed from: lٗ۟ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17441l {
    public static void amazon(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void billing(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    public static boolean crashlytics(View view) {
        return view.isScreenReaderFocusable();
    }

    public static boolean loadAd(View view) {
        return view.isAccessibilityHeading();
    }

    public static void purchase(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static CharSequence yandex(View view) {
        return view.getAccessibilityPaneTitle();
    }
}
