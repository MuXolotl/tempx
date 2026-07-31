package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.AbstractC15872l;
import defpackage.AbstractC8012l;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class ExpandableBehavior extends AbstractC8012l {
    public ExpandableBehavior() {
    }

    @Override // defpackage.AbstractC8012l
    public final boolean admob(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        if (!view.isLaidOut()) {
            ArrayList arrayListIsPro = coordinatorLayout.isPro(view);
            int size = arrayListIsPro.size();
            for (int i2 = 0; i2 < size; i2++) {
                loadAd(view, (View) arrayListIsPro.get(i2));
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC8012l
    public final boolean amazon(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.AbstractC8012l
    public abstract boolean loadAd(View view, View view2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
