package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* JADX INFO: renamed from: lًًٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7862l {
    public static C7862l crashlytics;
    public static final PorterDuff.Mode loadAd = PorterDuff.Mode.SRC_IN;
    public C7521l yandex;

    public static synchronized void amazon() {
        if (crashlytics == null) {
            C7862l c7862l = new C7862l();
            crashlytics = c7862l;
            c7862l.yandex = C7521l.amazon();
            crashlytics.yandex.remoteconfig(new C1424l(3));
        }
    }

    public static synchronized PorterDuffColorFilter crashlytics(int i, PorterDuff.Mode mode) {
        return C7521l.admob(i, mode);
    }

    public static void purchase(Drawable drawable, C1298l c1298l, int[] iArr) {
        PorterDuff.Mode mode = C7521l.admob;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = c1298l.f3347l;
        if (z || c1298l.f3348l) {
            PorterDuffColorFilter porterDuffColorFilterAdmob = null;
            ColorStateList colorStateList = z ? (ColorStateList) c1298l.f3346l : null;
            PorterDuff.Mode mode2 = c1298l.f3348l ? (PorterDuff.Mode) c1298l.f3349l : C7521l.admob;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterAdmob = C7521l.admob(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterAdmob);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public static synchronized C7862l yandex() {
        try {
            if (crashlytics == null) {
                amazon();
            }
        } catch (Throwable th) {
            throw th;
        }
        return crashlytics;
    }

    public final synchronized Drawable loadAd(Context context, int i) {
        return this.yandex.billing(context, i);
    }
}
