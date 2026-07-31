package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.AbstractC15872l;
import defpackage.AbstractC4614l;
import defpackage.AbstractC5020l;
import defpackage.C8666l;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends AbstractC4614l {
    public AlertDialogLayout(Context context) {
        super(context, null);
    }

    public static int subs(View view) {
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return subs(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    @Override // defpackage.AbstractC4614l, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iRemoteconfig;
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i8 = gravity & 112;
        int i9 = gravity & 8388615;
        int paddingTop = i8 != 16 ? i8 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - measuredHeight : (((i4 - i2) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C8666l c8666l = (C8666l) childAt.getLayoutParams();
                int i11 = ((LinearLayout.LayoutParams) c8666l).gravity;
                if (i11 < 0) {
                    i11 = i9;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i11, getLayoutDirection()) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i6 = ((LinearLayout.LayoutParams) c8666l).leftMargin + paddingLeft;
                    } else {
                        iRemoteconfig = paddingRight - measuredWidth;
                        i5 = ((LinearLayout.LayoutParams) c8666l).rightMargin;
                    }
                    if (admob(i10)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i12 = paddingTop + ((LinearLayout.LayoutParams) c8666l).topMargin;
                    childAt.layout(i6, i12, measuredWidth + i6, i12 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c8666l).bottomMargin + i12;
                } else {
                    iRemoteconfig = AbstractC5020l.remoteconfig(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) c8666l).leftMargin;
                    i5 = ((LinearLayout.LayoutParams) c8666l).rightMargin;
                }
                i6 = iRemoteconfig - i5;
                if (admob(i10)) {
                    paddingTop += intrinsicHeight;
                }
                int i13 = paddingTop + ((LinearLayout.LayoutParams) c8666l).topMargin;
                childAt.layout(i6, i13, measuredWidth + i6, i13 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c8666l).bottomMargin + i13;
            }
        }
    }

    @Override // defpackage.AbstractC4614l, android.view.View
    public final void onMeasure(int i, int i2) {
        int iCombineMeasuredStates;
        int iSubs;
        int measuredHeight;
        int measuredHeight2;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = alertDialogLayout.getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            iSubs = subs(view2);
            measuredHeight = view2.getMeasuredHeight() - iSubs;
            paddingBottom += iSubs;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iSubs = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i4 = size - paddingBottom;
        if (view2 != null) {
            int i5 = paddingBottom - iSubs;
            int iMin = Math.min(i4, measuredHeight);
            if (iMin > 0) {
                i4 -= iMin;
                iSubs += iMin;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(iSubs, 1073741824));
            paddingBottom = i5 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i4 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i4, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = alertDialogLayout.getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        int i7 = i2;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + iMax, i, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i7, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i8 = 0;
            while (i8 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i8);
                if (childAt3.getVisibility() != 8) {
                    C8666l c8666l = (C8666l) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c8666l).width == -1) {
                        int i9 = ((LinearLayout.LayoutParams) c8666l).height;
                        ((LinearLayout.LayoutParams) c8666l).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i7, 0);
                        ((LinearLayout.LayoutParams) c8666l).height = i9;
                    }
                }
                i8++;
                alertDialogLayout = this;
                i7 = i2;
            }
        }
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
