package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: renamed from: lؚؒٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1035l {
    public static final ThreadLocal yandex = new ThreadLocal();
    public static final int[] loadAd = {-16842910};
    public static final int[] crashlytics = {R.attr.state_focused};
    public static final int[] amazon = {R.attr.state_pressed};
    public static final int[] purchase = {R.attr.state_checked};
    public static final int[] billing = new int[0];
    public static final int[] mopub = new int[1];

    public static ColorStateList amazon(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = mopub;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC7720l.crashlytics(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int crashlytics(Context context, int i) {
        int[] iArr = mopub;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int loadAd(Context context, int i) {
        ColorStateList colorStateListAmazon = amazon(context, i);
        if (colorStateListAmazon != null && colorStateListAmazon.isStateful()) {
            return colorStateListAmazon.getColorForState(loadAd, colorStateListAmazon.getDefaultColor());
        }
        ThreadLocal threadLocal = yandex;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        int iCrashlytics = crashlytics(context, i);
        return AbstractC14093l.subs(iCrashlytics, Math.round(Color.alpha(iCrashlytics) * f));
    }

    public static void yandex(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC14657l.isPro);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
