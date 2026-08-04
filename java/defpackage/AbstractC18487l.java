package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: lّٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18487l {
    public static C1473l yandex(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C1473l c1473lAdmob = C1473l.admob(rootWindowInsets, null);
        C17212l c17212l = c1473lAdmob.yandex;
        c17212l.advert(c1473lAdmob);
        View rootView = view.getRootView();
        c17212l.amazon(rootView);
        c17212l.startapp(rootView);
        c17212l.adcel();
        return c1473lAdmob;
    }
}
