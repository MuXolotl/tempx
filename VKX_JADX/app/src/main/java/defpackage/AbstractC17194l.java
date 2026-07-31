package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: lٌٗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17194l {
    public static final int[] yandex = new int[2];
    public static final Rect loadAd = new Rect();

    public static final C3475l amazon(int i) {
        if (i == 1) {
            return new C3475l(2);
        }
        if (i == 2) {
            return new C3475l(1);
        }
        if (i == 17) {
            return new C3475l(3);
        }
        if (i == 33) {
            return new C3475l(5);
        }
        if (i == 66) {
            return new C3475l(4);
        }
        if (i != 130) {
            return null;
        }
        return new C3475l(6);
    }

    public static final Integer crashlytics(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    public static final boolean loadAd(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof ViewTreeObserverOnGlobalLayoutListenerC13840l) {
            return ((ViewTreeObserverOnGlobalLayoutListenerC13840l) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final C8896l yandex(View view, View view2) {
        int[] iArr = yandex;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        Rect rect = loadAd;
        view.getFocusedRect(rect);
        float f2 = (i - i3) + rect.left;
        return new C8896l(f2, rect.top + f, rect.width() + f2, f + rect.top + rect.height());
    }
}
