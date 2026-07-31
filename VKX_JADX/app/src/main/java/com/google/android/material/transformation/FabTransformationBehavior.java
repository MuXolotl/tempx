package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.C0637l;
import defpackage.C8339l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // defpackage.AbstractC8012l
    public final void crashlytics(C0637l c0637l) {
        if (c0637l.admob == 0) {
            c0637l.admob = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, defpackage.AbstractC8012l
    public final boolean loadAd(View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        C8339l.smaato("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        return false;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new RectF();
        new RectF();
    }
}
