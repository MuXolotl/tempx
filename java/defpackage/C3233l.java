package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: lؙؕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3233l extends C2512l {
    @Override // defpackage.AbstractC11174l
    public final float admob(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.AbstractC11174l
    public final void firebase(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.C2512l
    public final void metrica(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }

    @Override // defpackage.C2512l
    public final void remoteconfig(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.C2512l
    public final void smaato(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.C2512l
    public final void vip(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
}
