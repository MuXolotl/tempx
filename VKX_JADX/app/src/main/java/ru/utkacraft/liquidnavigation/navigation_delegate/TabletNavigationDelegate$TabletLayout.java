package ru.utkacraft.liquidnavigation.navigation_delegate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import defpackage.AbstractC6220l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class TabletNavigationDelegate$TabletLayout extends ViewGroup {
    @Keep
    public TabletNavigationDelegate$TabletLayout(AbstractC6220l abstractC6220l, Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() != 2) {
            return;
        }
        getChildAt(0);
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (getChildCount() != 2) {
            return;
        }
        getChildAt(0);
        throw null;
    }
}
