package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.AbstractC0926l;
import defpackage.AbstractC11621l;
import defpackage.AbstractC11880l;
import defpackage.AbstractC12704l;
import defpackage.AbstractC12953l;
import defpackage.AbstractC13273l;
import defpackage.AbstractC15422l;
import defpackage.AbstractC15872l;
import defpackage.AbstractC17077l;
import defpackage.AbstractC17463l;
import defpackage.AbstractC2704l;
import defpackage.AbstractC4548l;
import defpackage.AbstractC4927l;
import defpackage.AbstractC7347l;
import defpackage.AbstractC8012l;
import defpackage.AbstractC8558l;
import defpackage.AbstractC8960l;
import defpackage.C0637l;
import defpackage.C12448l;
import defpackage.C12676l;
import defpackage.C14427l;
import defpackage.C1473l;
import defpackage.C1770l;
import defpackage.C18595l;
import defpackage.C5022l;
import defpackage.C5128l;
import defpackage.C8339l;
import defpackage.C9552l;
import defpackage.InterfaceC4678l;
import defpackage.InterfaceC9683l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements InterfaceC9683l {

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static final /* synthetic */ int f590l = 0;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public Integer f591l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public WeakReference f592l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f593l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C1473l f594l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public Drawable f595l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public int[] f596l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f597l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final ValueAnimator.AnimatorUpdateListener f598l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public Behavior f599l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f600l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f601l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final TimeInterpolator f602l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final ArrayList f603l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f604l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public ValueAnimator f605l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f606l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f607l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f608l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f609l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f610l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public boolean f611l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final boolean f612l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final long f613l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final float f614l;

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        final AppBarLayout appBarLayout;
        Integer numValueOf;
        super(AbstractC12953l.adcel(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.f600l = -1;
        this.f593l = -1;
        this.f607l = -1;
        int i2 = 0;
        this.f610l = 0;
        this.f603l = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArraySubs = AbstractC8960l.subs(context3, attributeSet, C9552l.billing, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArraySubs.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArraySubs.getResourceId(0, 0)));
            }
            typedArraySubs.recycle();
            TypedArray typedArraySubs2 = AbstractC8960l.subs(context2, attributeSet, AbstractC4548l.yandex, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = typedArraySubs2.getDrawable(0);
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            setBackground(drawable);
            final ColorStateList colorStateListSubs = AbstractC4927l.subs(context2, typedArraySubs2, 6);
            this.f612l = colorStateListSubs != null;
            final ColorStateList colorStateListAds = AbstractC11880l.ads(getBackground());
            if (colorStateListAds != null) {
                final C5022l c5022l = new C5022l();
                c5022l.isPro(colorStateListAds);
                if (colorStateListSubs != null) {
                    Context context4 = getContext();
                    TypedValue typedValueMopub = AbstractC17463l.mopub(context4, R.attr.colorSurface);
                    if (typedValueMopub != null) {
                        int i3 = typedValueMopub.resourceId;
                        numValueOf = Integer.valueOf(i3 != 0 ? context4.getColor(i3) : typedValueMopub.data);
                    } else {
                        numValueOf = null;
                    }
                    final Integer num = numValueOf;
                    appBarLayout = this;
                    appBarLayout.f598l = new ValueAnimator.AnimatorUpdateListener() { // from class: lًْ۟
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num2;
                            AppBarLayout appBarLayout2 = this.yandex;
                            ArrayList arrayList = appBarLayout2.f603l;
                            int iStartapp = AbstractC6689l.startapp(colorStateListAds.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue(), colorStateListSubs.getDefaultColor());
                            ColorStateList colorStateListValueOf = ColorStateList.valueOf(iStartapp);
                            C5022l c5022l2 = c5022l;
                            c5022l2.isPro(colorStateListValueOf);
                            if (appBarLayout2.f595l != null && (num2 = appBarLayout2.f591l) != null && num2.equals(num)) {
                                appBarLayout2.f595l.setTint(iStartapp);
                            }
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (it.next() != null) {
                                    C18725l.loadAd();
                                    return;
                                } else if (c5022l2.f10262l.crashlytics != null) {
                                    throw null;
                                }
                            }
                        }
                    };
                    appBarLayout.setBackground(c5022l);
                } else {
                    appBarLayout = this;
                    c5022l.mopub(context2);
                    appBarLayout.f598l = new C14427l(appBarLayout, c5022l, i2);
                    appBarLayout.setBackground(c5022l);
                }
            } else {
                appBarLayout = this;
            }
            appBarLayout.f613l = AbstractC15422l.mopub(context2, R.attr.motionDurationMedium2, appBarLayout.getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            appBarLayout.f602l = AbstractC15422l.admob(context2, R.attr.motionEasingStandardInterpolator, AbstractC0926l.yandex);
            int i4 = 4;
            if (typedArraySubs2.hasValue(4)) {
                appBarLayout.amazon(typedArraySubs2.getBoolean(4, false), false, false);
            }
            if (typedArraySubs2.hasValue(3)) {
                C9552l.billing(appBarLayout, typedArraySubs2.getDimensionPixelSize(3, 0));
            }
            if (Build.VERSION.SDK_INT >= 26) {
                if (typedArraySubs2.hasValue(2)) {
                    appBarLayout.setKeyboardNavigationCluster(typedArraySubs2.getBoolean(2, false));
                }
                if (typedArraySubs2.hasValue(1)) {
                    appBarLayout.setTouchscreenBlocksFocus(typedArraySubs2.getBoolean(1, false));
                }
            }
            appBarLayout.f614l = appBarLayout.getResources().getDimension(R.dimen.design_appbar_elevation);
            appBarLayout.f611l = typedArraySubs2.getBoolean(5, false);
            appBarLayout.f608l = typedArraySubs2.getResourceId(7, -1);
            appBarLayout.setStatusBarForeground(typedArraySubs2.getDrawable(8));
            typedArraySubs2.recycle();
            AbstractC8558l.crashlytics(appBarLayout, new C1770l(i4, appBarLayout));
        } catch (Throwable th) {
            typedArraySubs.recycle();
            throw th;
        }
    }

    public static C12448l loadAd(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            C12448l c12448l = new C12448l((LinearLayout.LayoutParams) layoutParams);
            c12448l.yandex = 1;
            return c12448l;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C12448l c12448l2 = new C12448l((ViewGroup.MarginLayoutParams) layoutParams);
            c12448l2.yandex = 1;
            return c12448l2;
        }
        C12448l c12448l3 = new C12448l(layoutParams);
        c12448l3.yandex = 1;
        return c12448l3;
    }

    public final void amazon(boolean z, boolean z2, boolean z3) {
        this.f610l = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    public final boolean billing(View view) {
        int i;
        if (this.f592l == null && (i = this.f608l) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f608l);
            }
            if (viewFindViewById != null) {
                this.f592l = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f592l;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C12448l;
    }

    public final void crashlytics() {
        Behavior behavior = this.f599l;
        amazon amazonVarPremium = (behavior == null || this.f600l == -1 || this.f610l != 0) ? null : behavior.premium(AbstractC2704l.f5854l, this);
        this.f600l = -1;
        this.f593l = -1;
        this.f607l = -1;
        if (amazonVarPremium != null) {
            Behavior behavior2 = this.f599l;
            if (behavior2.remoteconfig != null) {
                return;
            }
            behavior2.remoteconfig = amazonVarPremium;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f595l == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f601l);
        this.f595l.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f595l;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C12448l();
    }

    @Override // defpackage.InterfaceC9683l
    public AbstractC8012l getBehavior() {
        Behavior behavior = new Behavior();
        this.f599l = behavior;
        return behavior;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.f593l;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                C12448l c12448l = (C12448l) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = c12448l.yandex;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = ((LinearLayout.LayoutParams) c12448l).topMargin + ((LinearLayout.LayoutParams) c12448l).bottomMargin;
                    if ((i3 & 8) != 0) {
                        WeakHashMap weakHashMap = AbstractC15872l.yandex;
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i3 & 2) != 0) {
                            WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i4 + measuredHeight;
                        }
                        if (childCount == 0) {
                            WeakHashMap weakHashMap3 = AbstractC15872l.yandex;
                            if (childAt.getFitsSystemWindows()) {
                                iMin = Math.min(iMin, measuredHeight - getTopInset());
                            }
                        }
                        i2 += iMin;
                    }
                    iMin = minimumHeight + i4;
                    if (childCount == 0) {
                        WeakHashMap weakHashMap4 = AbstractC15872l.yandex;
                        if (childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.f593l = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.f607l;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C12448l c12448l = (C12448l) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) c12448l).topMargin + ((LinearLayout.LayoutParams) c12448l).bottomMargin + childAt.getMeasuredHeight();
                int i3 = c12448l.yandex;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap = AbstractC15872l.yandex;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f607l = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f608l;
    }

    public C5022l getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof C5022l) {
            return (C5022l) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f610l;
    }

    public Drawable getStatusBarForeground() {
        return this.f595l;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        C1473l c1473l = this.f594l;
        if (c1473l != null) {
            return c1473l.amazon();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f600l;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C12448l c12448l = (C12448l) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = c12448l.yandex;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) c12448l).topMargin + ((LinearLayout.LayoutParams) c12448l).bottomMargin + minimumHeight;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = AbstractC15872l.yandex;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f600l = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final void mopub(float f, float f2) {
        ValueAnimator valueAnimator = this.f605l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.f605l = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f613l);
        this.f605l.setInterpolator(this.f602l);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f598l;
        if (animatorUpdateListener != null) {
            this.f605l.addUpdateListener(animatorUpdateListener);
        }
        this.f605l.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C5022l) {
            AbstractC11621l.firebase(this, (C5022l) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.f596l == null) {
            this.f596l = new int[4];
        }
        int[] iArr = this.f596l;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f609l;
        int i2 = R.attr.state_liftable;
        if (!z) {
            i2 = -R.attr.state_liftable;
        }
        iArr[0] = i2;
        int i3 = R.attr.state_lifted;
        if (!z || !this.f604l) {
            i3 = -R.attr.state_lifted;
        }
        iArr[1] = i3;
        int i4 = R.attr.state_collapsible;
        if (!z) {
            i4 = -R.attr.state_collapsible;
        }
        iArr[2] = i4;
        int i5 = R.attr.state_collapsed;
        if (!z || !this.f604l) {
            i5 = -R.attr.state_collapsed;
        }
        iArr[3] = i5;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f592l;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f592l = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        crashlytics();
        this.f606l = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((C12448l) getChildAt(i5).getLayoutParams()).crashlytics != null) {
                this.f606l = true;
                break;
            }
        }
        Drawable drawable = this.f595l;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f597l) {
            return;
        }
        if (!this.f611l) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((C12448l) getChildAt(i6).getLayoutParams()).yandex;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.f609l != z2) {
            this.f609l = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = AbstractC12704l.crashlytics(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                    } else if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        crashlytics();
    }

    public final boolean purchase(boolean z) {
        if (this.f597l || this.f604l == z) {
            return false;
        }
        this.f604l = z;
        refreshDrawableState();
        if (!(getBackground() instanceof C5022l)) {
            return true;
        }
        if (this.f612l) {
            mopub(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f611l) {
            return true;
        }
        float f = this.f614l;
        mopub(z ? 0.0f : f, z ? f : 0.0f);
        return true;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C5022l) {
            ((C5022l) background).subs(f);
        }
    }

    public void setExpanded(boolean z) {
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        amazon(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.f611l = z;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f608l = -1;
        if (view != null) {
            this.f592l = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.f592l;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f592l = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f608l = i;
        WeakReference weakReference = this.f592l;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f592l = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f597l = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
        } else {
            C8339l.metrica("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f595l;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f595l = drawableMutate;
            if (drawableMutate instanceof C5022l) {
                numValueOf = Integer.valueOf(((C5022l) drawableMutate).f10257l);
            } else {
                ColorStateList colorStateListAds = AbstractC11880l.ads(drawableMutate);
                if (colorStateListAds != null) {
                    numValueOf = Integer.valueOf(colorStateListAds.getDefaultColor());
                }
            }
            this.f591l = numValueOf;
            Drawable drawable3 = this.f595l;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f595l.setState(getDrawableState());
                }
                Drawable drawable4 = this.f595l;
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                drawable4.setLayoutDirection(getLayoutDirection());
                this.f595l.setVisible(getVisibility() == 0, false);
                this.f595l.setCallback(this);
            }
            if (this.f595l != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(AbstractC13273l.loadAd(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        C9552l.billing(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f595l;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f595l;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: yandex, reason: merged with bridge method [inline-methods] */
    public final C12448l generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C12448l c12448l = new C12448l(context, attributeSet);
        c12448l.yandex = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4548l.loadAd);
        c12448l.yandex = typedArrayObtainStyledAttributes.getInt(1, 0);
        c12448l.loadAd = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new C18595l(6);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            c12448l.crashlytics = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return c12448l;
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return loadAd(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C12448l();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return loadAd(layoutParams);
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC7347l {
        public int firebase;
        public int isPro;
        public amazon remoteconfig;
        public ValueAnimator smaato;
        public WeakReference vip;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.billing = -1;
            this.admob = -1;
        }

        public static View ad(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((C0637l) childAt.getLayoutParams()).yandex instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
        public static void appmetrica(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View childAt;
            boolean zBilling;
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                int i4 = ((C12448l) childAt.getLayoutParams()).yandex;
                if ((i4 & 1) != 0) {
                    WeakHashMap weakHashMap = AbstractC15872l.yandex;
                    int minimumHeight = childAt.getMinimumHeight();
                    zBilling = true;
                    if (i2 <= 0 || (i4 & 12) == 0 ? (i4 & 2) == 0 || (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zBilling = false;
                    }
                } else {
                    zBilling = false;
                }
            } else {
                zBilling = false;
            }
            if (appBarLayout.f611l) {
                zBilling = appBarLayout.billing(isVip(coordinatorLayout));
            }
            boolean zPurchase = appBarLayout.purchase(zBilling);
            if (!z) {
                if (zPurchase) {
                    List list = (List) ((C5128l) coordinatorLayout.f366l.f20462l).get(appBarLayout);
                    ArrayList arrayList = coordinatorLayout.f373l;
                    arrayList.clear();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        AbstractC8012l abstractC8012l = ((C0637l) ((View) arrayList.get(i5)).getLayoutParams()).yandex;
                        if (abstractC8012l instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) abstractC8012l).billing == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        public static View isVip(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof InterfaceC4678l) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // defpackage.AbstractC7347l
        public final int Signature() {
            return subscription() + this.isPro;
        }

        @Override // defpackage.AbstractC8012l
        public final void adcel(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.firebase == 0 || i == 1) {
                applovin(coordinatorLayout, appBarLayout);
                if (appBarLayout.f611l) {
                    appBarLayout.purchase(appBarLayout.billing(view2));
                }
            }
            this.vip = new WeakReference(view2);
        }

        @Override // defpackage.AbstractC16748l, defpackage.AbstractC8012l
        public final boolean admob(CoordinatorLayout coordinatorLayout, View view, int i) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.admob(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            amazon amazonVar = this.remoteconfig;
            if (amazonVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            advert(coordinatorLayout, appBarLayout, i2);
                        } else {
                            pro(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            advert(coordinatorLayout, appBarLayout, 0);
                        } else {
                            pro(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (amazonVar.f621l) {
                pro(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (amazonVar.f624l) {
                pro(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(amazonVar.f623l);
                int i3 = -childAt.getBottom();
                if (this.remoteconfig.f622l) {
                    WeakHashMap weakHashMap = AbstractC15872l.yandex;
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.remoteconfig.f625l) + i3;
                }
                pro(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.f610l = 0;
            this.remoteconfig = null;
            int iCrashlytics = AbstractC12704l.crashlytics(subscription(), -appBarLayout.getTotalScrollRange(), 0);
            C12676l c12676l = this.yandex;
            if (c12676l == null) {
                this.loadAd = iCrashlytics;
            } else if (c12676l.amazon != iCrashlytics) {
                c12676l.amazon = iCrashlytics;
                c12676l.amazon();
            }
            appmetrica(coordinatorLayout, appBarLayout, subscription(), 0, true);
            appBarLayout.f601l = subscription();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
                appBarLayout.postInvalidateOnAnimation();
            }
            if (AbstractC15872l.amazon(coordinatorLayout) != null) {
                return true;
            }
            AbstractC15872l.vip(coordinatorLayout, new loadAd(coordinatorLayout, this, appBarLayout));
            return true;
        }

        public final void advert(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(Signature() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iSignature = Signature();
            ValueAnimator valueAnimator = this.smaato;
            if (iSignature == i) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.smaato.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.smaato = valueAnimator2;
                valueAnimator2.setInterpolator(AbstractC0926l.purchase);
                this.smaato.addUpdateListener(new yandex(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator.cancel();
            }
            this.smaato.setDuration(Math.min(iRound, 600));
            this.smaato.setIntValues(iSignature, i);
            this.smaato.start();
        }

        public final void applovin(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iSignature = Signature() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C12448l c12448l = (C12448l) childAt.getLayoutParams();
                if ((c12448l.yandex & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) c12448l).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c12448l).bottomMargin;
                }
                int i2 = -iSignature;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                C12448l c12448l2 = (C12448l) childAt2.getLayoutParams();
                int i3 = c12448l2.yandex;
                if ((i3 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap weakHashMap = AbstractC15872l.yandex;
                        if (appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            topInset -= appBarLayout.getTopInset();
                        }
                    }
                    if ((i3 & 2) == 2) {
                        WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        WeakHashMap weakHashMap3 = AbstractC15872l.yandex;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iSignature < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) c12448l2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) c12448l2).bottomMargin;
                    }
                    if (iSignature < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    advert(coordinatorLayout, appBarLayout, AbstractC12704l.crashlytics(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // defpackage.AbstractC8012l
        public final /* bridge */ /* synthetic */ void firebase(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            signatures(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00af  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:66:0x016a  */
        /* JADX WARN: Code duplicated, block: B:68:0x017a  */
        /* JADX WARN: Code duplicated, block: B:72:0x018c  */
        /* JADX WARN: Code duplicated, block: B:74:0x0193  */
        /* JADX WARN: Code duplicated, block: B:75:0x0195  */
        /* JADX WARN: Code duplicated, block: B:94:0x017d A[SYNTHETIC] */
        @Override // defpackage.AbstractC7347l
        public final int license(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int top;
            boolean z;
            int i4;
            List list;
            int i5;
            View view2;
            AbstractC8012l abstractC8012l;
            int i6;
            C18595l c18595l;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iSignature = Signature();
            int i7 = 0;
            if (i2 == 0 || iSignature < i2 || iSignature > i3) {
                this.isPro = 0;
            } else {
                int iCrashlytics = AbstractC12704l.crashlytics(i, i2, i3);
                if (iSignature != iCrashlytics) {
                    if (!appBarLayout.f606l) {
                        top = iCrashlytics;
                        break;
                    }
                    int iAbs = Math.abs(iCrashlytics);
                    int childCount = appBarLayout.getChildCount();
                    int i8 = 0;
                    while (true) {
                        if (i8 < childCount) {
                            View childAt = appBarLayout.getChildAt(i8);
                            C12448l c12448l = (C12448l) childAt.getLayoutParams();
                            Interpolator interpolator = c12448l.crashlytics;
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i8++;
                            } else if (interpolator != null) {
                                int i9 = c12448l.yandex;
                                if ((i9 & 1) != 0) {
                                    topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) c12448l).topMargin + ((LinearLayout.LayoutParams) c12448l).bottomMargin;
                                    if ((i9 & 2) != 0) {
                                        WeakHashMap weakHashMap = AbstractC15872l.yandex;
                                        topInset -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    topInset = 0;
                                }
                                WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
                                if (childAt.getFitsSystemWindows()) {
                                    topInset -= appBarLayout.getTopInset();
                                }
                                if (topInset > 0) {
                                    float f = topInset;
                                    top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iCrashlytics);
                                    break;
                                }
                            }
                        }
                        top = iCrashlytics;
                        break;
                    }
                    C12676l c12676l = this.yandex;
                    int i10 = 1;
                    if (c12676l != null) {
                        if (c12676l.amazon != top) {
                            c12676l.amazon = top;
                            c12676l.amazon();
                            z = true;
                        }
                        int i11 = iSignature - iCrashlytics;
                        this.isPro = iCrashlytics - top;
                        if (z) {
                            i6 = 0;
                            while (i6 < appBarLayout.getChildCount()) {
                                C12448l c12448l2 = (C12448l) appBarLayout.getChildAt(i6).getLayoutParams();
                                c18595l = c12448l2.loadAd;
                                if (c18595l == null && (c12448l2.yandex & i10) != 0) {
                                    View childAt2 = appBarLayout.getChildAt(i6);
                                    float fSubscription = subscription();
                                    Rect rect = (Rect) c18595l.f36316l;
                                    Rect rect2 = (Rect) c18595l.f36317l;
                                    childAt2.getDrawingRect(rect2);
                                    appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
                                    rect2.offset(0, -appBarLayout.getTopInset());
                                    float fAbs = rect2.top - Math.abs(fSubscription);
                                    if (fAbs <= 0.0f) {
                                        float fLoadAd = 1.0f - AbstractC12704l.loadAd(Math.abs(fAbs / rect2.height()), 0.0f, 1.0f);
                                        float fHeight = (-fAbs) - ((rect2.height() * 0.3f) * (1.0f - (fLoadAd * fLoadAd)));
                                        childAt2.setTranslationY(fHeight);
                                        childAt2.getDrawingRect(rect);
                                        rect.offset(0, (int) (-fHeight));
                                        if (fHeight >= rect.height()) {
                                            childAt2.setVisibility(4);
                                        } else {
                                            childAt2.setVisibility(0);
                                        }
                                        WeakHashMap weakHashMap3 = AbstractC15872l.yandex;
                                        childAt2.setClipBounds(rect);
                                    } else {
                                        WeakHashMap weakHashMap4 = AbstractC15872l.yandex;
                                        childAt2.setClipBounds(null);
                                        childAt2.setTranslationY(0.0f);
                                        childAt2.setVisibility(0);
                                    }
                                }
                                i6++;
                                i10 = 1;
                            }
                        }
                        if (!z && appBarLayout.f606l && (list = (List) ((C5128l) coordinatorLayout.f366l.f20462l).get(appBarLayout)) != null && !list.isEmpty()) {
                            for (i5 = 0; i5 < list.size(); i5++) {
                                view2 = (View) list.get(i5);
                                abstractC8012l = ((C0637l) view2.getLayoutParams()).yandex;
                                if (abstractC8012l != null) {
                                    abstractC8012l.amazon(coordinatorLayout, view2, appBarLayout);
                                }
                            }
                        }
                        appBarLayout.f601l = subscription();
                        if (!appBarLayout.willNotDraw()) {
                            WeakHashMap weakHashMap5 = AbstractC15872l.yandex;
                            appBarLayout.postInvalidateOnAnimation();
                        }
                        if (iCrashlytics < iSignature) {
                            i4 = -1;
                        } else {
                            i4 = 1;
                        }
                        appmetrica(coordinatorLayout, appBarLayout, iCrashlytics, i4, false);
                        i7 = i11;
                    } else {
                        this.loadAd = top;
                    }
                    z = false;
                    int i12 = iSignature - iCrashlytics;
                    this.isPro = iCrashlytics - top;
                    if (z) {
                        i6 = 0;
                        while (i6 < appBarLayout.getChildCount()) {
                            C12448l c12448l3 = (C12448l) appBarLayout.getChildAt(i6).getLayoutParams();
                            c18595l = c12448l3.loadAd;
                            if (c18595l == null) {
                            }
                            i6++;
                            i10 = 1;
                        }
                    }
                    if (!z) {
                        while (i5 < list.size()) {
                            view2 = (View) list.get(i5);
                            abstractC8012l = ((C0637l) view2.getLayoutParams()).yandex;
                            if (abstractC8012l != null) {
                                abstractC8012l.amazon(coordinatorLayout, view2, appBarLayout);
                            }
                        }
                    }
                    appBarLayout.f601l = subscription();
                    if (!appBarLayout.willNotDraw()) {
                        WeakHashMap weakHashMap6 = AbstractC15872l.yandex;
                        appBarLayout.postInvalidateOnAnimation();
                    }
                    if (iCrashlytics < iSignature) {
                        i4 = -1;
                    } else {
                        i4 = 1;
                    }
                    appmetrica(coordinatorLayout, appBarLayout, iCrashlytics, i4, false);
                    i7 = i12;
                }
            }
            if (AbstractC15872l.amazon(coordinatorLayout) != null) {
                return i7;
            }
            AbstractC15872l.vip(coordinatorLayout, new loadAd(coordinatorLayout, this, appBarLayout));
            return i7;
        }

        @Override // defpackage.AbstractC8012l
        public final Parcelable metrica(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            amazon amazonVarPremium = premium(absSavedState, (AppBarLayout) view);
            return amazonVarPremium == null ? absSavedState : amazonVarPremium;
        }

        public final amazon premium(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iSubscription = subscription();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iSubscription;
                if (childAt.getTop() + iSubscription <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbstractC2704l.f5854l;
                    }
                    amazon amazonVar = new amazon(parcelable);
                    boolean z = iSubscription == 0;
                    amazonVar.f624l = z;
                    amazonVar.f621l = !z && (-iSubscription) >= appBarLayout.getTotalScrollRange();
                    amazonVar.f623l = i;
                    WeakHashMap weakHashMap = AbstractC15872l.yandex;
                    amazonVar.f622l = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    amazonVar.f625l = bottom / childAt.getHeight();
                    return amazonVar;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002b  */
        public final void signatures(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i2;
            int downNestedPreScrollRange;
            if (i == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i3 = i2;
                int i4 = downNestedPreScrollRange;
                if (i3 != i4) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = license(coordinatorLayout, appBarLayout2, Signature() - i, i3, i4);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.f611l) {
                appBarLayout2.purchase(appBarLayout2.billing(view));
            }
        }

        @Override // defpackage.AbstractC8012l
        public final void smaato(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            BaseBehavior<T> baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = baseBehavior.license(coordinatorLayout2, appBarLayout, Signature() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i3 == 0 && AbstractC15872l.amazon(coordinatorLayout2) == null) {
                AbstractC15872l.vip(coordinatorLayout2, new loadAd(coordinatorLayout2, baseBehavior, appBarLayout));
            }
        }

        @Override // defpackage.AbstractC8012l
        public final boolean startapp(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = (i & 2) != 0 && (appBarLayout.f611l || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.smaato) != null) {
                valueAnimator.cancel();
            }
            this.vip = null;
            this.firebase = i2;
            return z;
        }

        @Override // defpackage.AbstractC8012l
        public final boolean subs(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((C0637l) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.ads(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // defpackage.AbstractC8012l
        public final void vip(View view, Parcelable parcelable) {
            if (parcelable instanceof amazon) {
                this.remoteconfig = (amazon) parcelable;
            } else {
                this.remoteconfig = null;
            }
        }

        public BaseBehavior() {
            this.billing = -1;
            this.admob = -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public static class ScrollingViewBehavior extends AbstractC17077l {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4548l.Signature);
            this.billing = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public static AppBarLayout license(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.AbstractC8012l
        public boolean amazon(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC8012l abstractC8012l = ((C0637l) view2.getLayoutParams()).yandex;
            if (abstractC8012l instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) abstractC8012l).isPro) + this.purchase) - Signature(view2);
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f611l) {
                return false;
            }
            appBarLayout.purchase(appBarLayout.billing(view));
            return false;
        }

        @Override // defpackage.AbstractC8012l
        public final boolean loadAd(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // defpackage.AbstractC8012l
        public final void purchase(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                AbstractC15872l.vip(coordinatorLayout, null);
            }
        }

        @Override // defpackage.AbstractC8012l
        public final boolean remoteconfig(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutLicense = license(coordinatorLayout.isPro(view));
            if (appBarLayoutLicense != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.crashlytics;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayoutLicense.amazon(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior() {
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }
}
