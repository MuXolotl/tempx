package defpackage;

import android.transition.Transition;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: lٕٕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15693l {
    public static void loadAd(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }

    public static void yandex(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }
}
