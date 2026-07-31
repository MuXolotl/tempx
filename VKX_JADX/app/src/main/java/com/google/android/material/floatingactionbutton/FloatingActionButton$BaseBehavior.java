package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.AbstractC4548l;
import defpackage.AbstractC8012l;
import defpackage.C0637l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC8012l {
    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4548l.isPro);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.AbstractC8012l
    public final boolean admob(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // defpackage.AbstractC8012l
    public final boolean amazon(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // defpackage.AbstractC8012l
    public final void crashlytics(C0637l c0637l) {
        if (c0637l.admob == 0) {
            c0637l.admob = 80;
        }
    }

    @Override // defpackage.AbstractC8012l
    public final boolean yandex(View view) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior() {
    }
}
