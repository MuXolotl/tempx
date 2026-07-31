package defpackage;

import android.widget.TextView;

/* JADX INFO: renamed from: lٖۚٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16618l {
    public static boolean amazon(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }

    public static void crashlytics(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public static void loadAd(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public static int yandex(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }
}
