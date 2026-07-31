package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/material/bottomsheet/CustomBottomSheetBehavior;", "Landroid/view/View;", "V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CustomBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final boolean f654instanceof;

    public CustomBottomSheetBehavior() {
        this.f654instanceof = true;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.AbstractC8012l
    public boolean mopub(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f654instanceof) {
            return super.mopub(coordinatorLayout, view, motionEvent);
        }
        return false;
    }

    public CustomBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f654instanceof = true;
    }
}
