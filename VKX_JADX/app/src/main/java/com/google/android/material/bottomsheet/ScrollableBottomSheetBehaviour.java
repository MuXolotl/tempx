package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.AbstractC15872l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/material/bottomsheet/ScrollableBottomSheetBehaviour;", "Landroid/view/View;", "V", "Lcom/google/android/material/bottomsheet/CustomBottomSheetBehavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScrollableBottomSheetBehaviour<V extends View> extends CustomBottomSheetBehavior<V> {

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final ArrayList f655public;

    public ScrollableBottomSheetBehaviour(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f655public = new ArrayList();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.AbstractC8012l
    public final boolean admob(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.admob(coordinatorLayout, view, i);
        if (this.f655public.isEmpty()) {
            m182private(view);
        }
        return true;
    }

    @Override // com.google.android.material.bottomsheet.CustomBottomSheetBehavior, com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.AbstractC8012l
    public final boolean mopub(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f655public.iterator();
        while (it.hasNext()) {
            View view2 = (View) ((WeakReference) it.next()).get();
            if (view2 != null) {
                arrayList.add(view2);
            }
        }
        for (Object obj : arrayList) {
            if (coordinatorLayout.metrica((View) obj, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.f641interface = new WeakReference((View) obj);
                return super.mopub(coordinatorLayout, view, motionEvent);
            }
        }
        obj = null;
        this.f641interface = new WeakReference((View) obj);
        return super.mopub(coordinatorLayout, view, motionEvent);
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void m182private(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        if (view.isNestedScrollingEnabled()) {
            this.f655public.add(new WeakReference(view));
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            m182private(childAt);
            i = i2;
        }
    }
}
