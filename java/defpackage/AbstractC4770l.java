package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: lٌؗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4770l {
    public static final C10550l loadAd;
    public static final C2512l yandex;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            yandex = new C3233l();
        } else {
            yandex = new C2512l();
        }
        loadAd = new C10550l(10, Float.class, "translationAlpha");
        new C10550l(11, Rect.class, "clipBounds");
    }

    public static void loadAd(View view, int i) {
        yandex.remoteconfig(view, i);
    }

    public static void yandex(View view, int i, int i2, int i3, int i4) {
        yandex.smaato(view, i, i2, i3, i4);
    }
}
