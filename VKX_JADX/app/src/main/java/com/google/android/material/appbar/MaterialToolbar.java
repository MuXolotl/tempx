package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import defpackage.AbstractC11621l;
import defpackage.AbstractC11880l;
import defpackage.AbstractC12953l;
import defpackage.AbstractC15872l;
import defpackage.AbstractC4548l;
import defpackage.AbstractC5088l;
import defpackage.AbstractC8960l;
import defpackage.C15696l;
import defpackage.C5022l;
import defpackage.MenuC4984l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: lؕۗؗ, reason: contains not printable characters */
    public static final ImageView.ScaleType[] f615l = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: lؔؕؖ, reason: contains not printable characters */
    public boolean f616l;

    /* JADX INFO: renamed from: lُؚؓ, reason: contains not printable characters */
    public boolean f617l;

    /* JADX INFO: renamed from: lِِٞ, reason: contains not printable characters */
    public Integer f618l;

    /* JADX INFO: renamed from: lٖ٘ۘ, reason: contains not printable characters */
    public ImageView.ScaleType f619l;

    /* JADX INFO: renamed from: l٘ٚؒ, reason: contains not printable characters */
    public Boolean f620l;

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(AbstractC12953l.adcel(context, attributeSet, i, R.style.Widget_MaterialComponents_Toolbar), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArraySubs = AbstractC8960l.subs(context2, attributeSet, AbstractC4548l.tapsense, i, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArraySubs.hasValue(2)) {
            setNavigationIconTint(typedArraySubs.getColor(2, -1));
        }
        this.f617l = typedArraySubs.getBoolean(4, false);
        this.f616l = typedArraySubs.getBoolean(3, false);
        int i2 = typedArraySubs.getInt(1, -1);
        if (i2 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f615l;
            if (i2 < scaleTypeArr.length) {
                this.f619l = scaleTypeArr[i2];
            }
        }
        if (typedArraySubs.hasValue(0)) {
            this.f620l = Boolean.valueOf(typedArraySubs.getBoolean(0, false));
        }
        typedArraySubs.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : AbstractC11880l.ads(background);
        if (colorStateListValueOf != null) {
            C5022l c5022l = new C5022l();
            c5022l.isPro(colorStateListValueOf);
            c5022l.mopub(context2);
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            c5022l.subs(getElevation());
            setBackground(c5022l);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f619l;
    }

    public Integer getNavigationIconTint() {
        return this.f618l;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C5022l) {
            AbstractC11621l.firebase(this, (C5022l) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        C15696l c15696l = AbstractC5088l.purchase;
        ImageView imageView2 = null;
        if (this.f617l || this.f616l) {
            ArrayList arrayListMopub = AbstractC5088l.mopub(this, getTitle());
            TextView textView = arrayListMopub.isEmpty() ? null : (TextView) Collections.min(arrayListMopub, c15696l);
            ArrayList arrayListMopub2 = AbstractC5088l.mopub(this, getSubtitle());
            TextView textView2 = arrayListMopub2.isEmpty() ? null : (TextView) Collections.max(arrayListMopub2, c15696l);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f617l && textView != null) {
                    pro(textView, pair);
                }
                if (this.f616l && textView2 != null) {
                    pro(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt2 = getChildAt(i7);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f620l;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f619l;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    public final void pro(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void remoteconfig(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof MenuC4984l;
        if (z) {
            ((MenuC4984l) menu).pro();
        }
        super.remoteconfig(i);
        if (z) {
            ((MenuC4984l) menu).license();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C5022l) {
            ((C5022l) background).subs(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f620l;
        if (bool == null || bool.booleanValue() != z) {
            this.f620l = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f619l != scaleType) {
            this.f619l = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f618l != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f618l.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f618l = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f616l != z) {
            this.f616l = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f617l != z) {
            this.f617l = z;
            requestLayout();
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context) {
        this(context, null);
    }
}
