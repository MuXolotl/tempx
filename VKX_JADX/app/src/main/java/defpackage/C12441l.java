package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12441l extends AbstractC13141l {
    public static final PathInterpolator purchase = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final InterpolatorC3577l billing = new InterpolatorC3577l(0);
    public static final DecelerateInterpolator mopub = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator admob = new AccelerateInterpolator(1.5f);

    public static void admob(View view, C12902l c12902l, C13645l c13645l) {
        AbstractC15029l abstractC15029lSubs = subs(view);
        if (abstractC15029lSubs != null) {
            abstractC15029lSubs.metrica(c12902l, c13645l);
            if (abstractC15029lSubs.f29555l == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                admob(viewGroup.getChildAt(i), c12902l, c13645l);
            }
        }
    }

    public static void billing(View view, C12902l c12902l, C1473l c1473l, boolean z) {
        AbstractC15029l abstractC15029lSubs = subs(view);
        if (abstractC15029lSubs != null) {
            abstractC15029lSubs.f29554l = c1473l;
            if (!z) {
                abstractC15029lSubs.remoteconfig(c12902l);
                z = abstractC15029lSubs.f29555l == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                billing(viewGroup.getChildAt(i), c12902l, c1473l, z);
            }
        }
    }

    public static void mopub(View view, C1473l c1473l, List list) {
        AbstractC15029l abstractC15029lSubs = subs(view);
        if (abstractC15029lSubs != null) {
            c1473l = abstractC15029lSubs.vip(c1473l, list);
            if (abstractC15029lSubs.f29555l == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                mopub(viewGroup.getChildAt(i), c1473l, list);
            }
        }
    }

    public static void purchase(C12902l c12902l, View view) {
        AbstractC15029l abstractC15029lSubs = subs(view);
        if (abstractC15029lSubs != null) {
            abstractC15029lSubs.smaato(c12902l);
            if (abstractC15029lSubs.f29555l == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                purchase(c12902l, viewGroup.getChildAt(i));
            }
        }
    }

    public static AbstractC15029l subs(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC16043l) {
            return ((ViewOnApplyWindowInsetsListenerC16043l) tag).yandex;
        }
        return null;
    }
}
