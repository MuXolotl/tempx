package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* JADX INFO: renamed from: lٍٓۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14521l {
    public static final int[] yandex = {R.attr.state_pressed};
    public static final int[] loadAd = {R.attr.state_focused};
    public static final int[] crashlytics = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] amazon = {R.attr.state_selected};
    public static final int[] purchase = {R.attr.state_enabled, R.attr.state_pressed};
    public static final String billing = AbstractC14521l.class.getSimpleName();

    public static ColorStateList loadAd(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(purchase, 0)) != 0) {
            Log.w(billing, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static int yandex(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return AbstractC14093l.subs(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }
}
