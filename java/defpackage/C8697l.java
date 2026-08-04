package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* JADX INFO: renamed from: lٌَ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8697l extends ViewGroup {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final HashMap f17902l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final HashMap f17903l;

    public C8697l(Context context) {
        super(context);
        setClipChildren(false);
        this.f17903l = new HashMap();
        this.f17902l = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AbstractC0290l, C3654l> getHolderToLayoutNode() {
        return this.f17903l;
    }

    public final HashMap<C3654l, AbstractC0290l> getLayoutNodeToHolder() {
        return this.f17902l;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (AbstractC0290l abstractC0290l : this.f17903l.keySet()) {
            abstractC0290l.layout(abstractC0290l.getLeft(), abstractC0290l.getTop(), abstractC0290l.getRight(), abstractC0290l.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            AbstractC0081l.yandex("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            AbstractC0081l.yandex("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (AbstractC0290l abstractC0290l : this.f17903l.keySet()) {
            int i4 = abstractC0290l.f1309l;
            if (i4 != Integer.MIN_VALUE && (i3 = abstractC0290l.f1334l) != Integer.MIN_VALUE) {
                abstractC0290l.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C3654l c3654l = (C3654l) this.f17903l.get(childAt);
            if (childAt.isLayoutRequested() && c3654l != null) {
                C3654l.m1371goto(c3654l, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
