package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC11028l;
import defpackage.AbstractC15872l;
import defpackage.AbstractC16190l;
import defpackage.AbstractC7680l;
import defpackage.AbstractC9679l;
import defpackage.C0695l;
import defpackage.C10960l;
import defpackage.C11420l;
import defpackage.C13176l;
import defpackage.C14965l;
import defpackage.C6381l;
import defpackage.C8339l;
import defpackage.C9754l;
import defpackage.InterfaceC3024l;
import defpackage.InterfaceC3112l;
import defpackage.InterfaceC4678l;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC3112l, InterfaceC4678l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public float f390l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public int f391l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public VelocityTracker f392l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Rect f393l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C6381l f394l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final int[] f395l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final int[] f396l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f397l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final int f398l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public C11420l f399l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f400l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f401l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public int f402l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final int f403l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final C13176l f404l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C9754l f405l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f406l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public boolean f407l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final EdgeEffect f408l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final OverScroller f409l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final C10960l f410l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f411l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f412l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final EdgeEffect f413l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public View f414l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public boolean f415l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final int f416l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public int f417l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public static final float f388l = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public static final C0695l f389l = new C0695l();

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public static final int[] f387l = {R.attr.fillViewport};

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f393l = new Rect();
        this.f412l = true;
        this.f406l = false;
        this.f414l = null;
        this.f411l = false;
        this.f407l = true;
        this.f402l = -1;
        this.f396l = new int[2];
        this.f395l = new int[2];
        this.f404l = new C13176l(getContext(), new C14965l(this));
        int i2 = Build.VERSION.SDK_INT;
        this.f408l = i2 >= 31 ? AbstractC16190l.yandex(context, attributeSet) : new EdgeEffect(context);
        this.f413l = i2 >= 31 ? AbstractC16190l.yandex(context, attributeSet) : new EdgeEffect(context);
        this.f401l = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f409l = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f398l = viewConfiguration.getScaledTouchSlop();
        this.f403l = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f416l = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f387l, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f405l = new C9754l((byte) 0, 7);
        this.f410l = new C10960l(this);
        setNestedScrollingEnabled(true);
        AbstractC15872l.vip(this, f389l);
    }

    private C6381l getScrollFeedbackProvider() {
        if (this.f394l == null) {
            this.f394l = new C6381l(this);
        }
        return this.f394l;
    }

    public static boolean remoteconfig(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && remoteconfig((View) parent, nestedScrollView);
    }

    public final boolean Signature(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fCrashlytics = AbstractC9679l.crashlytics(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f401l * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f388l;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fCrashlytics;
    }

    public final boolean ad(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f408l;
        if (AbstractC9679l.crashlytics(edgeEffect) != 0.0f) {
            AbstractC9679l.mopub(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f413l;
        if (AbstractC9679l.crashlytics(edgeEffect2) == 0.0f) {
            return z;
        }
        AbstractC9679l.mopub(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final boolean adcel(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z = false;
        } else {
            i5 = 0;
            z = true;
        }
        if (i7 <= i4) {
            if (i7 < 0) {
                i6 = 0;
            } else {
                i6 = i7;
                z2 = false;
            }
            if (z2 && !this.f410l.billing(1)) {
                this.f409l.springBack(i5, i6, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i5, i6);
            return !z || z2;
        }
        i6 = i4;
        z2 = true;
        if (z2) {
            this.f409l.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            C8339l.smaato("ScrollView can host only one direct child");
        }
    }

    @Override // defpackage.InterfaceC14324l
    public final void admob(View view, int i, int i2, int[] iArr, int i3) {
        subs(i, i2, iArr, null, i3);
    }

    public final void ads(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f393l;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        subscription(i, i2, i3);
    }

    public final void advert(int i) {
        this.f410l.admob(i);
    }

    @Override // defpackage.InterfaceC14324l
    public final void amazon(View view, int i, int i2, int i3, int i4, int i5) {
        metrica(i4, i5, null);
    }

    @Override // defpackage.InterfaceC14324l
    public final void billing(View view, View view2, int i, int i2) {
        C9754l c9754l = this.f405l;
        if (i2 == 1) {
            c9754l.f19892l = i;
        } else {
            c9754l.f19893l = i;
        }
        pro(2, i2);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i;
        int scrollRange;
        int i2;
        int overScrollMode;
        OverScroller overScroller = this.f409l;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller.computeScrollOffset();
        int currY = overScroller.getCurrY();
        int i3 = currY - this.f417l;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f408l;
        EdgeEffect edgeEffect2 = this.f413l;
        if (i3 <= 0 || AbstractC9679l.crashlytics(edgeEffect) == 0.0f) {
            if (i3 < 0 && AbstractC9679l.crashlytics(edgeEffect2) != 0.0f) {
                float f = height;
                iRound = Math.round(AbstractC9679l.mopub(edgeEffect2, (i3 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i3) {
                    edgeEffect2.finish();
                }
            }
            this.f417l = currY;
            iArr = this.f395l;
            iArr[1] = 0;
            subs(0, i3, iArr, null, 1);
            i = i3 - iArr[1];
            scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC7680l.admob(this, Math.abs(overScroller.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                adcel(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                i2 = 1;
                this.f410l.amazon(0, scrollY2, 0, i4, this.f396l, 1, iArr);
                i = i4 - iArr[1];
            } else {
                i2 = 1;
            }
            if (i != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == i2 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
                overScroller.abortAnimation();
                advert(i2);
            }
            if (overScroller.isFinished()) {
                advert(i2);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(AbstractC9679l.mopub(edgeEffect, ((-i3) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i3) {
            edgeEffect.finish();
        }
        i3 -= iRound;
        this.f417l = currY;
        iArr = this.f395l;
        iArr[1] = 0;
        subs(0, i3, iArr, null, 1);
        i = i3 - iArr[1];
        scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            AbstractC7680l.admob(this, Math.abs(overScroller.getCurrVelocity()));
        }
        if (i != 0) {
            int scrollY3 = getScrollY();
            adcel(i, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i5 = i - scrollY4;
            iArr[1] = 0;
            i2 = 1;
            this.f410l.amazon(0, scrollY4, 0, i5, this.f396l, 1, iArr);
            i = i5 - iArr[1];
        } else {
            i2 = 1;
        }
        if (i != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                }
            } else if (i < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
            }
            overScroller.abortAnimation();
            advert(i2);
        }
        if (overScroller.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            advert(i2);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // defpackage.InterfaceC3112l
    public final void crashlytics(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        metrica(i4, i5, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || isPro(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f410l.yandex(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f410l.loadAd(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f410l.crashlytics(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f410l.amazon(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f408l;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            } else {
                paddingLeft = 0;
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f413l;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    public final void firebase(int i) {
        if (getChildCount() > 0) {
            this.f409l.fling(getScrollX(), getScrollY(), 0, i, 0, 0, RecyclerView.UNDEFINED_DURATION, Alert.DURATION_SHOW_INDEFINITELY, 0, 0);
            pro(2, 1);
            this.f417l = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC7680l.admob(this, Math.abs(this.f409l.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C9754l c9754l = this.f405l;
        return c9754l.f19892l | c9754l.f19893l;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f390l == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                C8339l.smaato("Expected theme to define listPreferredItemHeight.");
                return 0.0f;
            }
            this.f390l = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f390l;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f410l.billing(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f410l.amazon;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    public final boolean isPro(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.f393l.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? smaato(33) : yandex(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? smaato(130) : yandex(130);
                    }
                    if (keyCode == 62) {
                        ads(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return smaato(33);
                    }
                    if (keyCode == 93) {
                        return smaato(130);
                    }
                    if (keyCode == 122) {
                        ads(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        ads(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    public final void license(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f400l > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f409l.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z) {
                pro(2, 1);
            } else {
                advert(1);
            }
            this.f417l = getScrollY();
            postInvalidateOnAnimation();
        } else {
            OverScroller overScroller = this.f409l;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                advert(1);
            }
            scrollBy(i, i2);
        }
        this.f400l = AnimationUtils.currentAnimationTimeMillis();
    }

    public final int loadAd(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void metrica(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f410l.amazon(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // defpackage.InterfaceC14324l
    public final void mopub(View view, int i) {
        C9754l c9754l = this.f405l;
        if (i == 1) {
            c9754l.f19892l = 0;
        } else {
            c9754l.f19893l = 0;
        }
        advert(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f406l = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f411l) {
            if (AbstractC11028l.firebase(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                i = 9;
                width = (int) motionEvent.getX();
            } else if (AbstractC11028l.firebase(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i = 26;
                axisValue = axisValue2;
            } else {
                i = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                tapsense(-((int) (getVerticalScrollFactorCompat() * axisValue)), i, motionEvent, width, 1, AbstractC11028l.firebase(motionEvent, 8194));
                if (i == 0) {
                    return true;
                }
                this.f404l.yandex(motionEvent, i);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0115  */
    /* JADX WARN: Code duplicated, block: B:70:0x0129  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f411l) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            int childCount = getChildCount();
            OverScroller overScroller = this.f409l;
            if (childCount > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!ad(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.f411l = z;
                    velocityTracker = this.f392l;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f392l = null;
                    }
                } else {
                    this.f397l = y;
                    this.f402l = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f392l;
                    if (velocityTracker3 == null) {
                        this.f392l = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f392l.addMovement(motionEvent);
                    overScroller.computeScrollOffset();
                    if (!ad(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.f411l = z;
                    pro(2, 0);
                }
            } else {
                if (!ad(motionEvent)) {
                    z = false;
                }
                this.f411l = z;
                velocityTracker = this.f392l;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f392l = null;
                }
            }
        } else if (i == 1) {
            this.f411l = false;
            this.f402l = -1;
            velocityTracker2 = this.f392l;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f392l = null;
            }
            if (this.f409l.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            advert(0);
        } else if (i == 2) {
            int i2 = this.f402l;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.f397l) > this.f398l && (2 & getNestedScrollAxes()) == 0) {
                        this.f411l = true;
                        this.f397l = y2;
                        if (this.f392l == null) {
                            this.f392l = VelocityTracker.obtain();
                        }
                        this.f392l.addMovement(motionEvent);
                        this.f391l = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.f411l = false;
            this.f402l = -1;
            velocityTracker2 = this.f392l;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f392l = null;
            }
            if (this.f409l.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            advert(0);
        } else if (i == 6) {
            startapp(motionEvent);
        }
        return this.f411l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f412l = false;
        View view = this.f414l;
        if (view != null && remoteconfig(view, this)) {
            View view2 = this.f414l;
            Rect rect = this.f393l;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iLoadAd = loadAd(rect);
            if (iLoadAd != 0) {
                scrollBy(0, iLoadAd);
            }
        }
        this.f414l = null;
        if (!this.f406l) {
            if (this.f399l != null) {
                scrollTo(getScrollX(), this.f399l.f22986l);
                this.f399l = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f406l = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f415l && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        firebase((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f410l.loadAd(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        subs(i, i2, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        metrica(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        billing(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && vip(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C11420l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C11420l c11420l = (C11420l) parcelable;
        super.onRestoreInstanceState(c11420l.getSuperState());
        this.f399l = c11420l;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C11420l c11420l = new C11420l(super.onSaveInstanceState());
        c11420l.f22986l = getScrollY();
        return c11420l;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !vip(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f393l;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iLoadAd = loadAd(rect);
        if (iLoadAd != 0) {
            if (this.f407l) {
                license(0, iLoadAd, false);
            } else {
                scrollBy(0, iLoadAd);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return purchase(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mopub(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0125  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0133  */
    /* JADX WARN: Code duplicated, block: B:59:0x013a  */
    /* JADX WARN: Code duplicated, block: B:60:0x013c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0141  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fMopub;
        int iRound;
        int i;
        int iAbs;
        int i2;
        ViewParent parent2;
        if (this.f392l == null) {
            this.f392l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f391l = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f391l);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f408l;
            EdgeEffect edgeEffect2 = this.f413l;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f392l;
                velocityTracker.computeCurrentVelocity(1000, this.f416l);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f402l);
                if (Math.abs(yVelocity) >= this.f403l) {
                    if (AbstractC9679l.crashlytics(edgeEffect) != 0.0f) {
                        if (Signature(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            firebase(-yVelocity);
                        }
                    } else if (AbstractC9679l.crashlytics(edgeEffect2) != 0.0f) {
                        int i3 = -yVelocity;
                        if (Signature(edgeEffect2, i3)) {
                            edgeEffect2.onAbsorb(i3);
                        } else {
                            firebase(i3);
                        }
                    } else {
                        int i4 = -yVelocity;
                        float f2 = i4;
                        if (!this.f410l.loadAd(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            firebase(i4);
                        }
                    }
                } else if (this.f409l.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f402l = -1;
                this.f411l = false;
                VelocityTracker velocityTracker2 = this.f392l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f392l = null;
                }
                advert(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f402l);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f402l + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i5 = this.f397l - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i5 / getHeight();
                    if (AbstractC9679l.crashlytics(edgeEffect) != 0.0f) {
                        fMopub = -AbstractC9679l.mopub(edgeEffect, -height, x);
                        if (AbstractC9679l.crashlytics(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (AbstractC9679l.crashlytics(edgeEffect2) != 0.0f) {
                        fMopub = AbstractC9679l.mopub(edgeEffect2, height, 1.0f - x);
                        if (AbstractC9679l.crashlytics(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i = i5 - iRound;
                        if (!this.f411l) {
                            iAbs = Math.abs(i);
                            i2 = this.f398l;
                            if (iAbs > i2) {
                                parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                                this.f411l = true;
                                if (i > 0) {
                                    i -= i2;
                                } else {
                                    i += i2;
                                }
                            }
                        }
                        if (this.f411l) {
                            int iTapsense = tapsense(i, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f397l = y - iTapsense;
                            this.f391l += iTapsense;
                        }
                    }
                    f = fMopub;
                    iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i = i5 - iRound;
                    if (!this.f411l) {
                        iAbs = Math.abs(i);
                        i2 = this.f398l;
                        if (iAbs > i2) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f411l = true;
                            if (i > 0) {
                                i -= i2;
                            } else {
                                i += i2;
                            }
                        }
                    }
                    if (this.f411l) {
                        int iTapsense2 = tapsense(i, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f397l = y - iTapsense2;
                        this.f391l += iTapsense2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f411l && getChildCount() > 0) {
                    if (this.f409l.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f402l = -1;
                this.f411l = false;
                VelocityTracker velocityTracker3 = this.f392l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f392l = null;
                }
                advert(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f397l = (int) motionEvent.getY(actionIndex);
                this.f402l = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                startapp(motionEvent);
                this.f397l = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f402l));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f411l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            OverScroller overScroller = this.f409l;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                advert(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f397l = y2;
            this.f402l = pointerId;
            pro(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f392l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final boolean pro(int i, int i2) {
        return this.f410l.mopub(2, i2);
    }

    @Override // defpackage.InterfaceC14324l
    public final boolean purchase(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f412l) {
            this.f414l = view2;
        } else {
            Rect rect = this.f393l;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iLoadAd = loadAd(rect);
            if (iLoadAd != 0) {
                scrollBy(0, iLoadAd);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iLoadAd = loadAd(rect);
        boolean z2 = iLoadAd != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iLoadAd);
                return z2;
            }
            license(0, iLoadAd, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f392l) != null) {
            velocityTracker.recycle();
            this.f392l = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f412l = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f415l) {
            this.f415l = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C10960l c10960l = this.f410l;
        if (c10960l.amazon) {
            ViewGroup viewGroup = c10960l.crashlytics;
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            viewGroup.stopNestedScroll();
        }
        c10960l.amazon = z;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f407l = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean smaato(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f393l;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return subscription(i, rect.top, rect.bottom);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f410l.mopub(i, 0);
    }

    public final void startapp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f402l) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f397l = (int) motionEvent.getY(i);
            this.f402l = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f392l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        advert(0);
    }

    public final boolean subs(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f410l.crashlytics(i, i2, iArr, null, i3);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean subscription(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i2 < scrollY || i3 > i4) {
            tapsense(z2 ? i2 - scrollY : i3 - i4, -1, null, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0115  */
    /* JADX WARN: Code duplicated, block: B:59:0x0126  */
    public final int tapsense(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        if (i4 == 1) {
            pro(2, i4);
        }
        boolean zCrashlytics = this.f410l.crashlytics(0, i, this.f395l, this.f396l, i4);
        int[] iArr = this.f396l;
        int[] iArr2 = this.f395l;
        if (zCrashlytics) {
            i5 = i - iArr2[1];
            i6 = iArr[1];
        } else {
            i5 = i;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z5 = adcel(i5, 0, scrollY, scrollRange) && !this.f410l.billing(i4);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().yandex.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
        }
        iArr2[1] = 0;
        this.f410l.amazon(0, scrollY2, 0, i5 - scrollY2, this.f396l, i4, iArr2);
        int i7 = i6 + iArr[1];
        int i8 = i5 - iArr2[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.f413l;
        EdgeEffect edgeEffect2 = this.f408l;
        if (i9 >= 0) {
            if (i9 > scrollRange && z4) {
                AbstractC9679l.mopub(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
                if (motionEvent != null) {
                    z2 = false;
                    getScrollFeedbackProvider().yandex.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, false);
                } else {
                    z2 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z3 = z2;
            } else {
                z3 = z5;
            }
            if (z3 && i4 == 0 && (velocityTracker = this.f392l) != null) {
                velocityTracker.clear();
            }
            if (i4 == 1) {
                advert(i4);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i7;
        }
        if (z4) {
            AbstractC9679l.mopub(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().yandex.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z2 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z3 = z2;
        } else {
            postInvalidateOnAnimation();
            z3 = z2;
        }
        if (z3) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            advert(i4);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i7;
    }

    public final boolean vip(View view, int i, int i2) {
        Rect rect = this.f393l;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    public final boolean yandex(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !vip(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            tapsense(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f393l;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            tapsense(loadAd(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && !vip(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            C8339l.smaato("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            C8339l.smaato("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            C8339l.smaato("ScrollView can host only one direct child");
        }
    }

    public void setOnScrollChangeListener(InterfaceC3024l interfaceC3024l) {
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ua.itaysonlab.vkx.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }
}
