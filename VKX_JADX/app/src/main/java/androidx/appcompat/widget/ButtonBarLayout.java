package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC14657l;
import defpackage.AbstractC15872l;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f169l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f170l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f171l;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f169l = -1;
        int[] iArr = AbstractC14657l.firebase;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AbstractC15872l.remoteconfig(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f171l = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f171l);
        }
    }

    private void setStacked(boolean z) {
        if (this.f170l != z) {
            if (!z || this.f171l) {
                this.f170l = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = 0;
        if (this.f171l) {
            if (size > this.f169l && this.f170l) {
                setStacked(false);
            }
            this.f169l = size;
        }
        if (this.f170l || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, RecyclerView.UNDEFINED_DURATION);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (this.f171l && !this.f170l && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            i3 = -1;
            if (i4 >= childCount) {
                i4 = -1;
                break;
            } else if (getChildAt(i4).getVisibility() == 0) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            View childAt = getChildAt(i4);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f170l) {
                int childCount2 = getChildCount();
                for (int i5 = i4 + 1; i5 < childCount2; i5++) {
                    if (getChildAt(i5).getVisibility() == 0) {
                        i3 = i5;
                        break;
                    }
                }
                paddingBottom = i3 >= 0 ? getChildAt(i3).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f171l != z) {
            this.f171l = z;
            if (!z && this.f170l) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
