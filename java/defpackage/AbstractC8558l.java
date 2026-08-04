package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌؕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8558l {
    public static void crashlytics(View view, InterfaceC12833l interfaceC12833l) {
        ViewOnApplyWindowInsetsListenerC16378l viewOnApplyWindowInsetsListenerC16378l = interfaceC12833l != null ? new ViewOnApplyWindowInsetsListenerC16378l(view, interfaceC12833l) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, viewOnApplyWindowInsetsListenerC16378l);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (viewOnApplyWindowInsetsListenerC16378l != null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC16378l);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static C1473l loadAd(View view, C1473l c1473l, Rect rect) {
        WindowInsets windowInsetsMopub = c1473l.mopub();
        if (windowInsetsMopub != null) {
            return C1473l.admob(view.computeSystemWindowInsets(windowInsetsMopub, rect), view);
        }
        rect.setEmpty();
        return c1473l;
    }

    public static void yandex(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }
}
