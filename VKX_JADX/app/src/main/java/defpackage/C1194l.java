package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٜؒۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1194l extends HorizontalScrollView implements InterfaceC8959l {

    /* JADX INFO: renamed from: lؔؕؖ, reason: contains not printable characters */
    public static final C8653l f3185l = new C8653l(16);

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public boolean f3186l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final int f3187l;

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public AbstractC2361l f3188l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final int f3189l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int f3190l;

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public C15597l f3191l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final TextPaint f3192l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final ArrayList f3193l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final float f3194l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final float f3195l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C3766l f3196l;

    /* JADX INFO: renamed from: lؕۦؓ, reason: contains not printable characters */
    public AbstractC3362l f3197l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public ValueAnimator f3198l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public ColorStateList f3199l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public C14154l f3200l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public InterfaceC17852l f3201l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final int f3202l;

    /* JADX INFO: renamed from: lؗ۟ۤ, reason: contains not printable characters */
    public C14202l f3203l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final TextPaint f3204l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Paint f3205l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public Drawable f3206l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public ColorStateList f3207l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public int f3208l;

    /* JADX INFO: renamed from: lُؚؓ, reason: contains not printable characters */
    public final C7353l f3209l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public int f3210l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final int f3211l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C10518l f3212l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public final ArrayList f3213l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final int f3214l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f3215l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f3216l;

    /* JADX INFO: renamed from: lِِٞ, reason: contains not printable characters */
    public boolean f3217l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public final int f3218l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final int f3219l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public C12701l f3220l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final int f3221l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public boolean f3222l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final RectF f3223l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Path f3224l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final int f3225l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public boolean f3226l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final int f3227l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public int f3228l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public ColorStateList f3229l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public int f3230l;

    public C1194l(Activity activity) {
        super(AbstractC12953l.adcel(activity, null, R.attr.tabStyle, R.style.Widget_Design_TabLayout), null, R.attr.tabStyle);
        Paint paint = new Paint(1);
        this.f3205l = paint;
        this.f3204l = new TextPaint(1);
        this.f3192l = new TextPaint(1);
        this.f3224l = new Path();
        this.f3193l = new ArrayList();
        this.f3223l = new RectF();
        this.f3230l = Alert.DURATION_SHOW_INDEFINITELY;
        this.f3213l = new ArrayList();
        this.f3209l = new C7353l(12);
        this.f3216l = (int) TypedValue.applyDimension(1, 0.0f, getResources().getDisplayMetrics());
        this.f3215l = (int) TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        setBackgroundColor(0);
        Context context = getContext();
        setHorizontalScrollBarEnabled(false);
        C10518l c10518l = new C10518l(this, context);
        this.f3212l = c10518l;
        super.addView(c10518l, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArraySubs = AbstractC8960l.subs(context, null, AbstractC4548l.advert, R.attr.tabStyle, R.style.Widget_Design_TabLayout, 24);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C5022l c5022l = new C5022l();
            c5022l.isPro(ColorStateList.valueOf(colorDrawable.getColor()));
            c5022l.mopub(context);
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            c5022l.subs(getElevation());
            setBackground(c5022l);
        }
        int dimensionPixelSize = typedArraySubs.getDimensionPixelSize(11, -1);
        if (c10518l.f21404l != dimensionPixelSize) {
            c10518l.f21404l = dimensionPixelSize;
            WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
            c10518l.postInvalidateOnAnimation();
        }
        int color = typedArraySubs.getColor(8, 0);
        Paint paint2 = c10518l.f21403l;
        if (paint2.getColor() != color) {
            paint2.setColor(color);
            WeakHashMap weakHashMap3 = AbstractC15872l.yandex;
            c10518l.postInvalidateOnAnimation();
        }
        setSelectedTabIndicator(AbstractC4927l.firebase(context, typedArraySubs, 5));
        setSelectedTabIndicatorGravity(typedArraySubs.getInt(10, 0));
        setTabIndicatorFullWidth(typedArraySubs.getBoolean(9, true));
        int dimensionPixelSize2 = typedArraySubs.getDimensionPixelSize(16, 0);
        this.f3227l = dimensionPixelSize2;
        this.f3190l = dimensionPixelSize2;
        this.f3221l = dimensionPixelSize2;
        this.f3225l = dimensionPixelSize2;
        this.f3225l = typedArraySubs.getDimensionPixelSize(19, dimensionPixelSize2);
        this.f3221l = typedArraySubs.getDimensionPixelSize(20, dimensionPixelSize2);
        this.f3190l = typedArraySubs.getDimensionPixelSize(18, dimensionPixelSize2);
        this.f3227l = typedArraySubs.getDimensionPixelSize(17, dimensionPixelSize2);
        int resourceId = typedArraySubs.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.f3214l = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId, AbstractC14657l.pro);
        try {
            this.f3195l = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f3199l = AbstractC4927l.subs(context, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArraySubs.hasValue(25)) {
                this.f3199l = AbstractC4927l.subs(context, typedArraySubs, 25);
            }
            if (typedArraySubs.hasValue(23)) {
                this.f3199l = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{typedArraySubs.getColor(23, 0), this.f3199l.getDefaultColor()});
            }
            this.f3207l = AbstractC4927l.subs(context, typedArraySubs, 3);
            AbstractC0545l.amazon(typedArraySubs.getInt(4, -1), null);
            this.f3229l = AbstractC4927l.subs(context, typedArraySubs, 21);
            this.f3218l = typedArraySubs.getInt(6, 300);
            this.f3202l = typedArraySubs.getDimensionPixelSize(14, -1);
            this.f3211l = typedArraySubs.getDimensionPixelSize(13, -1);
            this.f3189l = typedArraySubs.getResourceId(0, 0);
            this.f3187l = typedArraySubs.getDimensionPixelSize(1, 0);
            this.f3208l = typedArraySubs.getInt(15, 1);
            this.f3210l = typedArraySubs.getInt(2, 0);
            this.f3222l = typedArraySubs.getBoolean(12, false);
            this.f3226l = typedArraySubs.getBoolean(26, false);
            typedArraySubs.recycle();
            Resources resources = getResources();
            this.f3194l = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f3219l = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            loadAd();
            setSelectedTabIndicatorColor(0);
            setTabRippleColor(null);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f3193l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.f3202l;
        if (i != -1) {
            return i;
        }
        int i2 = this.f3208l;
        if (i2 == 0 || i2 == 2) {
            return this.f3219l;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f3212l.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        C10518l c10518l = this.f3212l;
        int childCount = c10518l.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = c10518l.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void admob(int i, float f, boolean z, boolean z2) {
        int iRound = Math.round(i + f);
        if (iRound >= 0) {
            C10518l c10518l = this.f3212l;
            if (iRound >= c10518l.getChildCount()) {
                return;
            }
            if (z2) {
                ValueAnimator valueAnimator = c10518l.f21401l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    c10518l.f21401l.cancel();
                }
                c10518l.f21400l = i;
                c10518l.f21407l = f;
                c10518l.crashlytics();
            }
            ValueAnimator valueAnimator2 = this.f3198l;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f3198l.cancel();
            }
            scrollTo(crashlytics(i, f), 0);
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void amazon() {
        if (this.f3198l == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f3198l = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0926l.loadAd);
            this.f3198l.setDuration(this.f3218l);
            this.f3198l.addUpdateListener(new C5551l(0, this));
        }
    }

    public final void billing(C3766l c3766l, boolean z) {
        C3766l c3766l2 = this.f3196l;
        ArrayList arrayList = this.f3213l;
        if (c3766l2 == c3766l) {
            if (c3766l2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((InterfaceC17852l) arrayList.get(size)).getClass();
                }
                yandex(c3766l.loadAd);
                return;
            }
            return;
        }
        int i = c3766l != null ? c3766l.loadAd : -1;
        if (z) {
            if ((c3766l2 == null || c3766l2.loadAd == -1) && i != -1) {
                admob(i, 0.0f, true, true);
            } else {
                yandex(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.f3196l = c3766l;
        if (c3766l2 != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((InterfaceC17852l) arrayList.get(size2)).getClass();
            }
        }
        if (c3766l != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((C12701l) ((InterfaceC17852l) arrayList.get(size3))).yandex.setCurrentItem(c3766l.loadAd);
            }
        }
    }

    public final int crashlytics(int i, float f) {
        int i2 = this.f3208l;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        C10518l c10518l = this.f3212l;
        View childAt = c10518l.getChildAt(i);
        int i3 = i + 1;
        View childAt2 = i3 < c10518l.getChildCount() ? c10518l.getChildAt(i3) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        C3766l c3766l = this.f3196l;
        if (c3766l != null) {
            return c3766l.loadAd;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f3193l.size();
    }

    public int getTabGravity() {
        return this.f3210l;
    }

    public ColorStateList getTabIconTint() {
        return this.f3207l;
    }

    public int getTabIndicatorGravity() {
        return this.f3228l;
    }

    public int getTabMaxWidth() {
        return this.f3230l;
    }

    public int getTabMode() {
        return this.f3208l;
    }

    public ColorStateList getTabRippleColor() {
        return this.f3229l;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f3206l;
    }

    public ColorStateList getTabTextColors() {
        return this.f3199l;
    }

    public final void isPro(boolean z) {
        int i = 0;
        while (true) {
            C10518l c10518l = this.f3212l;
            if (i >= c10518l.getChildCount()) {
                return;
            }
            View childAt = c10518l.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f3208l == 1 && this.f3210l == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    public final void loadAd() {
        int i = this.f3208l;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.f3187l - this.f3225l) : 0;
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        C10518l c10518l = this.f3212l;
        c10518l.setPaddingRelative(iMax, 0, 0, 0);
        int i2 = this.f3208l;
        if (i2 == 0) {
            int i3 = this.f3210l;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                c10518l.setGravity(1);
            } else if (i3 == 2) {
            }
            c10518l.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.f3210l == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            c10518l.setGravity(1);
        }
        isPro(true);
    }

    public final void mopub(AbstractC3362l abstractC3362l, boolean z) {
        C14154l c14154l;
        AbstractC3362l abstractC3362l2 = this.f3197l;
        if (abstractC3362l2 != null && (c14154l = this.f3200l) != null) {
            abstractC3362l2.yandex.unregisterObserver(c14154l);
        }
        this.f3197l = abstractC3362l;
        if (z && abstractC3362l != null) {
            if (this.f3200l == null) {
                this.f3200l = new C14154l(0, this);
            }
            abstractC3362l.yandex.registerObserver(this.f3200l);
        }
        purchase();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C5022l) {
            AbstractC11621l.firebase(this, (C5022l) background);
        }
        if (this.f3188l == null) {
            ViewParent parent = getParent();
            if (parent instanceof AbstractC2361l) {
                subs((AbstractC2361l) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f3217l) {
            setupWithViewPager(null);
            this.f3217l = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C0282l c0282l;
        Drawable drawable;
        int i = 0;
        while (true) {
            C10518l c10518l = this.f3212l;
            if (i >= c10518l.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = c10518l.getChildAt(i);
            if ((childAt instanceof C0282l) && (drawable = (c0282l = (C0282l) childAt).f1291l) != null) {
                drawable.setBounds(c0282l.getLeft(), c0282l.getTop(), c0282l.getRight(), c0282l.getBottom());
                c0282l.f1291l.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getTabCount(), false, 1));
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iRound = Math.round(AbstractC0545l.loadAd(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iLoadAd = this.f3211l;
            if (iLoadAd <= 0) {
                iLoadAd = (int) (size - AbstractC0545l.loadAd(getContext(), 56));
            }
            this.f3230l = iLoadAd;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.f3208l;
            if (i3 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void purchase() {
        C7353l c7353l;
        C3766l c3766l;
        C8653l c8653l;
        int currentItem;
        C10518l c10518l = this.f3212l;
        int childCount = c10518l.getChildCount() - 1;
        while (true) {
            c7353l = this.f3209l;
            c3766l = null;
            if (childCount < 0) {
                break;
            }
            C0282l c0282l = (C0282l) c10518l.getChildAt(childCount);
            c10518l.removeViewAt(childCount);
            if (c0282l != null) {
                c0282l.setTab(null);
                c0282l.setSelected(false);
                c7353l.crashlytics(c0282l);
            }
            requestLayout();
            childCount--;
        }
        ArrayList arrayList = this.f3193l;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c8653l = f3185l;
            if (!zHasNext) {
                break;
            }
            C3766l c3766l2 = (C3766l) it.next();
            it.remove();
            c3766l2.amazon = null;
            c3766l2.purchase = null;
            c3766l2.yandex = null;
            c3766l2.loadAd = -1;
            c3766l2.crashlytics = null;
            c8653l.crashlytics(c3766l2);
        }
        this.f3196l = null;
        AbstractC3362l abstractC3362l = this.f3197l;
        if (abstractC3362l != null) {
            int iLoadAd = abstractC3362l.loadAd();
            for (int i = 0; i < iLoadAd; i++) {
                C3766l c3766l3 = (C3766l) c8653l.yandex();
                if (c3766l3 == null) {
                    c3766l3 = new C3766l();
                    c3766l3.loadAd = -1;
                }
                c3766l3.amazon = this;
                C0282l c0282l2 = c7353l != null ? (C0282l) c7353l.yandex() : null;
                if (c0282l2 == null) {
                    c0282l2 = new C0282l(this, getContext());
                }
                c0282l2.setTab(c3766l3);
                c0282l2.setFocusable(true);
                c0282l2.setMinimumWidth(getTabMinWidth());
                if (TextUtils.isEmpty(null)) {
                    c0282l2.setContentDescription(c3766l3.yandex);
                } else {
                    c0282l2.setContentDescription(null);
                }
                c3766l3.purchase = c0282l2;
                CharSequence charSequenceCrashlytics = this.f3197l.crashlytics(i);
                if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(charSequenceCrashlytics)) {
                    c3766l3.purchase.setContentDescription(charSequenceCrashlytics);
                }
                c3766l3.yandex = charSequenceCrashlytics;
                C0282l c0282l3 = c3766l3.purchase;
                if (c0282l3 != null) {
                    c0282l3.purchase();
                }
                int size = arrayList.size();
                if (c3766l3.amazon != this) {
                    C8339l.metrica("Tab belongs to a different TabLayout.");
                    return;
                }
                c3766l3.loadAd = size;
                arrayList.add(size, c3766l3);
                int size2 = arrayList.size();
                for (int i2 = size + 1; i2 < size2; i2++) {
                    ((C3766l) arrayList.get(i2)).loadAd = i2;
                }
                C0282l c0282l4 = c3766l3.purchase;
                c0282l4.setSelected(false);
                c0282l4.setActivated(false);
                int i3 = c3766l3.loadAd;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                if (this.f3208l == 1 && this.f3210l == 0) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams.width = -2;
                    layoutParams.weight = 0.0f;
                }
                c10518l.addView(c0282l4, i3, layoutParams);
            }
            AbstractC2361l abstractC2361l = this.f3188l;
            if (abstractC2361l == null || iLoadAd <= 0 || (currentItem = abstractC2361l.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            if (currentItem >= 0 && currentItem < getTabCount()) {
                c3766l = (C3766l) arrayList.get(currentItem);
            }
            billing(c3766l, true);
        }
    }

    @Override // defpackage.InterfaceC8959l
    public final void refreshTheme() {
        this.f3205l.setColor(AbstractC13209l.yandex(R.attr.global_accent));
        int iYandex = AbstractC13209l.yandex(R.attr.text_primary);
        TextPaint textPaint = this.f3204l;
        textPaint.setColor(iYandex);
        int iSubs = AbstractC14093l.subs(iYandex, 85);
        TextPaint textPaint2 = this.f3192l;
        textPaint2.setColor(iSubs);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textPaint.setTypeface(typeface);
        textPaint2.setTypeface(typeface);
        textPaint2.setTextSize(TypedValue.applyDimension(2, 14.0f, getResources().getDisplayMetrics()));
        textPaint.setTextSize(TypedValue.applyDimension(2, 14.0f, getResources().getDisplayMetrics()));
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C5022l) {
            ((C5022l) background).subs(f);
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.f3222l == z) {
            return;
        }
        this.f3222l = z;
        int i = 0;
        while (true) {
            C10518l c10518l = this.f3212l;
            if (i >= c10518l.getChildCount()) {
                loadAd();
                return;
            }
            View childAt = c10518l.getChildAt(i);
            if (childAt instanceof C0282l) {
                C0282l c0282l = (C0282l) childAt;
                c0282l.setOrientation(!c0282l.f1293l.f3222l ? 1 : 0);
                TextView textView = c0282l.f1284l;
                if (textView == null && c0282l.f1285l == null) {
                    c0282l.mopub(c0282l.f1286l, c0282l.f1283l);
                } else {
                    c0282l.mopub(textView, c0282l.f1285l);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC17852l interfaceC17852l) {
        InterfaceC17852l interfaceC17852l2 = this.f3201l;
        ArrayList arrayList = this.f3213l;
        if (interfaceC17852l2 != null) {
            arrayList.remove(interfaceC17852l2);
        }
        this.f3201l = interfaceC17852l;
        if (interfaceC17852l == null || arrayList.contains(interfaceC17852l)) {
            return;
        }
        arrayList.add(interfaceC17852l);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        amazon();
        this.f3198l.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(AbstractC13273l.loadAd(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        C10518l c10518l = this.f3212l;
        Paint paint = c10518l.f21403l;
        if (paint.getColor() != i) {
            paint.setColor(i);
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            c10518l.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f3228l != i) {
            this.f3228l = i;
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            this.f3212l.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        C10518l c10518l = this.f3212l;
        if (c10518l.f21404l != i) {
            c10518l.f21404l = i;
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            c10518l.postInvalidateOnAnimation();
        }
    }

    public void setTabGravity(int i) {
        if (this.f3210l != i) {
            this.f3210l = i;
            loadAd();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f3207l != colorStateList) {
            this.f3207l = colorStateList;
            ArrayList arrayList = this.f3193l;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0282l c0282l = ((C3766l) arrayList.get(i)).purchase;
                if (c0282l != null) {
                    c0282l.purchase();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(AbstractC7720l.crashlytics(getContext(), i));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f3186l = z;
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        this.f3212l.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.f3208l) {
            this.f3208l = i;
            loadAd();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f3229l == colorStateList) {
            return;
        }
        this.f3229l = colorStateList;
        int i = 0;
        while (true) {
            C10518l c10518l = this.f3212l;
            if (i >= c10518l.getChildCount()) {
                return;
            }
            View childAt = c10518l.getChildAt(i);
            if (childAt instanceof C0282l) {
                Context context = getContext();
                int i2 = C0282l.f1282l;
                ((C0282l) childAt).billing(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(AbstractC7720l.crashlytics(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f3199l != colorStateList) {
            this.f3199l = colorStateList;
            ArrayList arrayList = this.f3193l;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0282l c0282l = ((C3766l) arrayList.get(i)).purchase;
                if (c0282l != null) {
                    c0282l.purchase();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC3362l abstractC3362l) {
        mopub(abstractC3362l, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f3226l == z) {
            return;
        }
        this.f3226l = z;
        int i = 0;
        while (true) {
            C10518l c10518l = this.f3212l;
            if (i >= c10518l.getChildCount()) {
                return;
            }
            View childAt = c10518l.getChildAt(i);
            if (childAt instanceof C0282l) {
                Context context = getContext();
                int i2 = C0282l.f1282l;
                ((C0282l) childAt).billing(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(AbstractC2361l abstractC2361l) {
        subs(abstractC2361l, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final void subs(AbstractC2361l abstractC2361l, boolean z) {
        AbstractC2361l abstractC2361l2 = this.f3188l;
        if (abstractC2361l2 != null) {
            C15597l c15597l = this.f3191l;
            if (c15597l != null) {
                abstractC2361l2.removeOnPageChangeListener(c15597l);
            }
            C14202l c14202l = this.f3203l;
            if (c14202l != null) {
                this.f3188l.removeOnAdapterChangeListener(c14202l);
            }
        }
        C12701l c12701l = this.f3220l;
        ArrayList arrayList = this.f3213l;
        if (c12701l != null) {
            arrayList.remove(c12701l);
            this.f3220l = null;
        }
        if (abstractC2361l != null) {
            this.f3188l = abstractC2361l;
            if (this.f3191l == null) {
                this.f3191l = new C15597l(this);
            }
            C15597l c15597l2 = this.f3191l;
            c15597l2.crashlytics = 0;
            c15597l2.loadAd = 0;
            abstractC2361l.addOnPageChangeListener(c15597l2);
            C12701l c12701l2 = new C12701l(abstractC2361l);
            this.f3220l = c12701l2;
            if (!arrayList.contains(c12701l2)) {
                arrayList.add(c12701l2);
            }
            AbstractC3362l adapter = abstractC2361l.getAdapter();
            if (adapter != null) {
                mopub(adapter, true);
            }
            if (this.f3203l == null) {
                this.f3203l = new C14202l(this);
            }
            C14202l c14202l2 = this.f3203l;
            c14202l2.yandex = true;
            abstractC2361l.addOnAdapterChangeListener(c14202l2);
            admob(abstractC2361l.getCurrentItem(), 0.0f, true, true);
        } else {
            this.f3188l = null;
            mopub(null, false);
        }
        this.f3217l = z;
    }

    public final void yandex(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            if (isLaidOut()) {
                C10518l c10518l = this.f3212l;
                int childCount = c10518l.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (c10518l.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iCrashlytics = crashlytics(i, 0.0f);
                if (scrollX != iCrashlytics) {
                    amazon();
                    this.f3198l.setIntValues(scrollX, iCrashlytics);
                    this.f3198l.start();
                }
                ValueAnimator valueAnimator = c10518l.f21401l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    c10518l.f21401l.cancel();
                }
                c10518l.amazon(i, this.f3218l, true);
                return;
            }
        }
        admob(i, 0.0f, true, true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f3206l != drawable) {
            this.f3206l = drawable;
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            this.f3212l.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC0630l interfaceC0630l) {
        setOnTabSelectedListener((InterfaceC17852l) interfaceC0630l);
    }
}
