package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lّٜٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12656l extends ViewGroup implements InterfaceC3112l, InterfaceC14324l, InterfaceC4678l {

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public static final int[] f24886l = {R.attr.enabled};

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public boolean f24887l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public C4907l f24888l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public int f24889l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int f24890l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f24891l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C9754l f24892l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public int f24893l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C18365l f24894l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C10960l f24895l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public float f24896l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public final C4907l f24897l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final int f24898l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public InterfaceC10072l f24899l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public View f24900l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final DecelerateInterpolator f24901l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f24902l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public boolean f24903l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public C4907l f24904l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public int f24905l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final int[] f24906l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public final C4907l f24907l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public float f24908l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public float f24909l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f24910l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public C1745l f24911l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final C12709l f24912l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f24913l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public int f24914l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int[] f24915l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public float f24916l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final int[] f24917l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public final AnimationAnimationListenerC6605l f24918l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public int f24919l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public C1745l f24920l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public int f24921l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final int f24922l;

    public C12656l(Activity activity) {
        super(activity, null);
        this.f24891l = false;
        this.f24909l = -1.0f;
        this.f24915l = new int[2];
        this.f24906l = new int[2];
        this.f24917l = new int[2];
        this.f24921l = -1;
        this.f24893l = -1;
        this.f24918l = new AnimationAnimationListenerC6605l(this, 0);
        this.f24897l = new C4907l(this, 2);
        this.f24907l = new C4907l(this, 3);
        this.f24910l = ViewConfiguration.get(activity).getScaledTouchSlop();
        this.f24890l = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f24901l = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f24914l = (int) (displayMetrics.density * 40.0f);
        C18365l c18365l = new C18365l(getContext());
        float f = c18365l.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = c18365l.getContext().obtainStyledAttributes(AbstractC6184l.yandex);
        c18365l.f35880l = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        c18365l.setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(c18365l.f35880l);
        c18365l.setBackground(shapeDrawable);
        this.f24894l = c18365l;
        C12709l c12709l = new C12709l(getContext());
        this.f24912l = c12709l;
        c12709l.crashlytics(1);
        this.f24894l.setImageDrawable(this.f24912l);
        this.f24894l.setVisibility(8);
        addView(this.f24894l);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f24898l = i;
        this.f24909l = i;
        this.f24892l = new C9754l((byte) 0, 7);
        this.f24895l = new C10960l(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f24914l;
        this.f24919l = i2;
        this.f24922l = i2;
        firebase(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = activity.obtainStyledAttributes((AttributeSet) null, f24886l);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.f24894l.getBackground().setAlpha(i);
        this.f24912l.setAlpha(i);
    }

    @Override // defpackage.InterfaceC14324l
    public final void admob(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // defpackage.InterfaceC14324l
    public final void amazon(View view, int i, int i2, int i3, int i4, int i5) {
        crashlytics(view, i, i2, i3, i4, i5, this.f24917l);
    }

    @Override // defpackage.InterfaceC14324l
    public final void billing(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.InterfaceC3112l
    public final void crashlytics(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.f24895l.amazon(i, i2, i3, i4, this.f24906l, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        int i8 = i7 == 0 ? this.f24906l[1] + i4 : i7;
        if (i8 >= 0 || yandex()) {
            return;
        }
        float fAbs = this.f24916l + Math.abs(i8);
        this.f24916l = fAbs;
        isPro(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        vip(true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f24895l.yandex(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f24895l.loadAd(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f24895l.crashlytics(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f24895l.amazon(i, i2, i3, i4, iArr, 0, null);
    }

    public final void firebase(float f) {
        int i = this.f24889l;
        setTargetOffsetTopAndBottom((i + ((int) ((this.f24922l - i) * f))) - this.f24894l.getTop());
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f24893l;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C9754l c9754l = this.f24892l;
        return c9754l.f19892l | c9754l.f19893l;
    }

    public int getProgressCircleDiameter() {
        return this.f24914l;
    }

    public int getProgressViewEndOffset() {
        return this.f24898l;
    }

    public int getProgressViewStartOffset() {
        return this.f24922l;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f24895l.billing(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f24895l.amazon;
    }

    public final void isPro(float f) {
        C1745l c1745l;
        C1745l c1745l2;
        C12709l c12709l = this.f24912l;
        C4651l c4651l = c12709l.f25047l;
        if (!c4651l.vip) {
            c4651l.vip = true;
        }
        c12709l.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this.f24909l));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.f24909l;
        int i = this.f24905l;
        if (i <= 0) {
            i = this.f24898l;
        }
        float f2 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.f24922l + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        C18365l c18365l = this.f24894l;
        if (c18365l.getVisibility() != 0) {
            c18365l.setVisibility(0);
        }
        c18365l.setScaleX(1.0f);
        c18365l.setScaleY(1.0f);
        if (f < this.f24909l) {
            if (c12709l.f25047l.tapsense > 76 && ((c1745l2 = this.f24911l) == null || !c1745l2.hasStarted() || c1745l2.hasEnded())) {
                C1745l c1745l3 = new C1745l(this, c12709l.f25047l.tapsense, 76);
                c1745l3.setDuration(300L);
                c18365l.f35881l = null;
                c18365l.clearAnimation();
                c18365l.startAnimation(c1745l3);
                this.f24911l = c1745l3;
            }
        } else if (c12709l.f25047l.tapsense < 255 && ((c1745l = this.f24920l) == null || !c1745l.hasStarted() || c1745l.hasEnded())) {
            C1745l c1745l4 = new C1745l(this, c12709l.f25047l.tapsense, 255);
            c1745l4.setDuration(300L);
            c18365l.f35881l = null;
            c18365l.clearAnimation();
            c18365l.startAnimation(c1745l4);
            this.f24920l = c1745l4;
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        C4651l c4651l2 = c12709l.f25047l;
        c4651l2.purchase = 0.0f;
        c4651l2.billing = fMin2;
        c12709l.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        C4651l c4651l3 = c12709l.f25047l;
        if (fMin3 != c4651l3.startapp) {
            c4651l3.startapp = fMin3;
        }
        c12709l.invalidateSelf();
        c12709l.f25047l.mopub = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        c12709l.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.f24919l);
    }

    public final void loadAd() {
        if (this.f24900l == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f24894l)) {
                    this.f24900l = childAt;
                    return;
                }
            }
        }
    }

    public final void metrica(float f) {
        float f2 = this.f24896l;
        float f3 = f - f2;
        float f4 = this.f24910l;
        if (f3 <= f4 || this.f24902l) {
            return;
        }
        this.f24908l = f2 + f4;
        this.f24902l = true;
        this.f24912l.setAlpha(76);
    }

    @Override // defpackage.InterfaceC14324l
    public final void mopub(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        smaato();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        loadAd();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !yandex() && !this.f24891l && !this.f24913l) {
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.f24902l = false;
                    this.f24921l = -1;
                } else if (actionMasked == 2) {
                    int i = this.f24921l;
                    if (i == -1) {
                        Log.e("lّٜٗ", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    if (iFindPointerIndex >= 0) {
                        metrica(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked == 3) {
                    this.f24902l = false;
                    this.f24921l = -1;
                } else if (actionMasked == 6) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.f24921l) {
                        this.f24921l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    }
                }
                return this.f24902l;
            }
            setTargetOffsetTopAndBottom(this.f24922l - this.f24894l.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f24921l = pointerId;
            this.f24902l = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 >= 0) {
                this.f24896l = motionEvent.getY(iFindPointerIndex2);
                return this.f24902l;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f24900l == null) {
            loadAd();
        }
        View view = this.f24900l;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f24894l.getMeasuredWidth();
        int measuredHeight2 = this.f24894l.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f24919l;
        this.f24894l.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f24900l == null) {
            loadAd();
        }
        View view = this.f24900l;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f24894l.measure(View.MeasureSpec.makeMeasureSpec(this.f24914l, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f24914l, 1073741824));
        this.f24893l = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f24894l) {
                this.f24893l = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.f24895l.yandex(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f24895l.loadAd(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f24916l;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f24916l = 0.0f;
                } else {
                    this.f24916l = f - f2;
                    iArr[1] = i2;
                }
                isPro(this.f24916l);
            }
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.f24915l;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        crashlytics(view, i, i2, i3, i4, 0, this.f24917l);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f24892l.f19893l = i;
        startNestedScroll(i & 2);
        this.f24916l = 0.0f;
        this.f24913l = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C9244l c9244l = (C9244l) parcelable;
        super.onRestoreInstanceState(c9244l.getSuperState());
        setRefreshing(c9244l.f19010l);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new C9244l(super.onSaveInstanceState(), this.f24891l);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f24891l || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f24892l.f19893l = 0;
        this.f24913l = false;
        float f = this.f24916l;
        if (f > 0.0f) {
            subs(f);
            this.f24916l = 0.0f;
        } else {
            post(new RunnableC6665l(7, this));
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !yandex() && !this.f24891l && !this.f24913l) {
            if (actionMasked == 0) {
                this.f24921l = motionEvent.getPointerId(0);
                this.f24902l = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f24921l);
                if (iFindPointerIndex < 0) {
                    Log.e("lّٜٗ", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f24902l) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.f24908l) * 0.5f;
                    this.f24902l = false;
                    subs(y);
                }
                this.f24921l = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f24921l);
                if (iFindPointerIndex2 < 0) {
                    Log.e("lّٜٗ", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                metrica(y2);
                if (this.f24902l) {
                    float f = (y2 - this.f24908l) * 0.5f;
                    if (f > 0.0f) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        isPro(f);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f24921l) {
                            this.f24921l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 < 0) {
                    Log.e("lّٜٗ", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f24921l = motionEvent.getPointerId(actionIndex2);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC14324l
    public final boolean purchase(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public final void remoteconfig(boolean z, boolean z2) {
        if (this.f24891l != z) {
            this.f24903l = z2;
            loadAd();
            this.f24891l = z;
            C18365l c18365l = this.f24894l;
            AnimationAnimationListenerC6605l animationAnimationListenerC6605l = this.f24918l;
            if (!z) {
                C4907l c4907l = new C4907l(this, 1);
                this.f24904l = c4907l;
                c4907l.setDuration(150L);
                c18365l.f35881l = animationAnimationListenerC6605l;
                c18365l.clearAnimation();
                c18365l.startAnimation(this.f24904l);
                return;
            }
            this.f24889l = this.f24919l;
            C4907l c4907l2 = this.f24897l;
            c4907l2.reset();
            c4907l2.setDuration(200L);
            c4907l2.setInterpolator(this.f24901l);
            if (animationAnimationListenerC6605l != null) {
                c18365l.f35881l = animationAnimationListenerC6605l;
            }
            c18365l.clearAnimation();
            c18365l.startAnimation(c4907l2);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view;
        if (this.f24887l && (view = this.f24900l) != null) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            if (!view.isNestedScrollingEnabled()) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.f24894l.setScaleX(f);
        this.f24894l.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        loadAd();
        C12709l c12709l = this.f24912l;
        C4651l c4651l = c12709l.f25047l;
        c4651l.subs = iArr;
        c4651l.yandex(0);
        c4651l.yandex(0);
        c12709l.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = context.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f24909l = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        smaato();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.f24887l = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C10960l c10960l = this.f24895l;
        if (c10960l.amazon) {
            ViewGroup viewGroup = c10960l.crashlytics;
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            viewGroup.stopNestedScroll();
        }
        c10960l.amazon = z;
    }

    public void setOnRefreshListener(InterfaceC10072l interfaceC10072l) {
        this.f24899l = interfaceC10072l;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f24894l.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    public void setRefreshing(boolean z) {
        vip(z, false);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f24914l = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f24914l = (int) (displayMetrics.density * 40.0f);
            }
            this.f24894l.setImageDrawable(null);
            this.f24912l.crashlytics(i);
            this.f24894l.setImageDrawable(this.f24912l);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f24905l = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        C18365l c18365l = this.f24894l;
        c18365l.bringToFront();
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        c18365l.offsetTopAndBottom(i);
        this.f24919l = c18365l.getTop();
    }

    public final void smaato() {
        this.f24894l.clearAnimation();
        this.f24912l.stop();
        this.f24894l.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f24922l - this.f24919l);
        this.f24919l = this.f24894l.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f24895l.mopub(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f24895l.admob(0);
    }

    public final void subs(float f) {
        int i = 1;
        if (f > this.f24909l) {
            remoteconfig(true, true);
            return;
        }
        this.f24891l = false;
        C12709l c12709l = this.f24912l;
        C4651l c4651l = c12709l.f25047l;
        c4651l.purchase = 0.0f;
        c4651l.billing = 0.0f;
        c12709l.invalidateSelf();
        AnimationAnimationListenerC6605l animationAnimationListenerC6605l = new AnimationAnimationListenerC6605l(this, i);
        this.f24889l = this.f24919l;
        C4907l c4907l = this.f24907l;
        c4907l.reset();
        c4907l.setDuration(200L);
        c4907l.setInterpolator(this.f24901l);
        C18365l c18365l = this.f24894l;
        c18365l.f35881l = animationAnimationListenerC6605l;
        c18365l.clearAnimation();
        c18365l.startAnimation(c4907l);
        C4651l c4651l2 = c12709l.f25047l;
        if (c4651l2.vip) {
            c4651l2.vip = false;
        }
        c12709l.invalidateSelf();
    }

    public final void vip(boolean z, boolean z2) {
        if (!z || this.f24891l == z) {
            remoteconfig(z, false);
            return;
        }
        this.f24891l = z;
        setTargetOffsetTopAndBottom((this.f24898l + this.f24922l) - this.f24919l);
        this.f24903l = z2;
        C18365l c18365l = this.f24894l;
        c18365l.setVisibility(0);
        this.f24912l.setAlpha(255);
        C4907l c4907l = new C4907l(this, 0);
        this.f24888l = c4907l;
        c4907l.setDuration(this.f24890l);
        AnimationAnimationListenerC6605l animationAnimationListenerC6605l = this.f24918l;
        if (animationAnimationListenerC6605l != null) {
            c18365l.f35881l = animationAnimationListenerC6605l;
        }
        c18365l.clearAnimation();
        c18365l.startAnimation(this.f24888l);
    }

    public final boolean yandex() {
        View view = this.f24900l;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public void setOnChildScrollUpCallback(InterfaceC9177l interfaceC9177l) {
    }
}
