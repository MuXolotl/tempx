package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: lٖٝۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16525l {
    public static void crashlytics(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    public static void loadAd(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void yandex(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }
}
