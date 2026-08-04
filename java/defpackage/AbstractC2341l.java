package defpackage;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: lؔؒۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2341l {
    public static final int[] yandex = {R.attr.state_checked};
    public static final int[] loadAd = new int[0];
    public static final Rect crashlytics = new Rect();

    public static PorterDuff.Mode crashlytics(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static Rect loadAd(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets insetsYandex = AbstractC10711l.yandex(drawable);
            return new Rect(insetsYandex.left, insetsYandex.top, insetsYandex.right, insetsYandex.bottom);
        }
        if (i >= 29) {
            boolean z = AbstractC17021l.yandex;
        } else if (AbstractC17021l.yandex) {
            try {
                Object objInvoke = AbstractC17021l.loadAd.invoke(drawable, null);
                if (objInvoke != null) {
                    return new Rect(AbstractC17021l.crashlytics.getInt(objInvoke), AbstractC17021l.amazon.getInt(objInvoke), AbstractC17021l.purchase.getInt(objInvoke), AbstractC17021l.billing.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return crashlytics;
    }

    public static void yandex(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(yandex);
        } else {
            drawable.setState(loadAd);
        }
        drawable.setState(state);
    }
}
