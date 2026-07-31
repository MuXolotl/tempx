package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.AbstractC15872l;
import defpackage.AbstractC17623l;
import defpackage.AbstractC6217l;
import defpackage.AbstractC8012l;
import defpackage.AbstractC8558l;
import defpackage.C0637l;
import defpackage.C10038l;
import defpackage.C13161l;
import defpackage.C13617l;
import defpackage.C1473l;
import defpackage.C4518l;
import defpackage.C5128l;
import defpackage.C8339l;
import defpackage.C8653l;
import defpackage.C8936l;
import defpackage.C9754l;
import defpackage.InterfaceC14324l;
import defpackage.InterfaceC3112l;
import defpackage.InterfaceC4482l;
import defpackage.InterfaceC9683l;
import defpackage.ViewGroupOnHierarchyChangeListenerC5136l;
import defpackage.ViewTreeObserverOnPreDrawListenerC8361l;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC14324l, InterfaceC3112l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final ThreadLocal f356l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final Class[] f357l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final String f358l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final C8653l f359l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C13617l f360l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public boolean f361l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ArrayList f362l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f363l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f364l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public Drawable f365l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10038l f366l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ArrayList f367l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C9754l f368l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public ViewGroup.OnHierarchyChangeListener f369l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public View f370l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public boolean f371l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int[] f372l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ArrayList f373l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public ViewTreeObserverOnPreDrawListenerC8361l f374l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int[] f375l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int[] f376l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public View f377l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public C1473l f378l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public C13161l f379l;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f358l = r0 != null ? r0.getName() : null;
        f360l = new C13617l(15);
        f357l = new Class[]{Context.class, AttributeSet.class};
        f356l = new ThreadLocal();
        f359l = new C8653l(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i);
        this.f367l = new ArrayList();
        this.f366l = new C10038l(11);
        this.f362l = new ArrayList();
        this.f373l = new ArrayList();
        this.f372l = new int[2];
        this.f376l = new int[2];
        this.f368l = new C9754l((byte) 0, 7);
        int[] iArr = AbstractC6217l.yandex;
        TypedArray typedArrayObtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, R.style.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.f375l = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr2 = coordinatorLayout.f375l;
                iArr2[i2] = (int) (iArr2[i2] * f);
            }
        }
        coordinatorLayout.f365l = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        coordinatorLayout.advert();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC5136l(coordinatorLayout));
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        if (coordinatorLayout.getImportantForAccessibility() == 0) {
            coordinatorLayout.setImportantForAccessibility(1);
        }
    }

    public static void Signature(Rect rect) {
        rect.setEmpty();
        f359l.crashlytics(rect);
    }

    public static void ad(View view, int i) {
        C0637l c0637l = (C0637l) view.getLayoutParams();
        int i2 = c0637l.isPro;
        if (i2 != i) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            view.offsetTopAndBottom(i - i2);
            c0637l.isPro = i;
        }
    }

    public static void pro(View view, int i) {
        C0637l c0637l = (C0637l) view.getLayoutParams();
        int i2 = c0637l.subs;
        if (i2 != i) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            view.offsetLeftAndRight(i - i2);
            c0637l.subs = i;
        }
    }

    public static void smaato(int i, Rect rect, Rect rect2, C0637l c0637l, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = c0637l.crashlytics;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c0637l.amazon;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0637l vip(View view) {
        C0637l c0637l = (C0637l) view.getLayoutParams();
        if (!c0637l.loadAd) {
            if (view instanceof InterfaceC9683l) {
                AbstractC8012l behavior = ((InterfaceC9683l) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c0637l.loadAd(behavior);
                c0637l.loadAd = true;
                return c0637l;
            }
            InterfaceC4482l interfaceC4482l = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC4482l = (InterfaceC4482l) superclass.getAnnotation(InterfaceC4482l.class);
                if (interfaceC4482l != null) {
                    break;
                }
            }
            if (interfaceC4482l != null) {
                try {
                    c0637l.loadAd((AbstractC8012l) interfaceC4482l.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC4482l.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            c0637l.loadAd = true;
        }
        return c0637l;
    }

    public static Rect yandex() {
        Rect rect = (Rect) f359l.yandex();
        return rect == null ? new Rect() : rect;
    }

    public final void adcel(View view, int i) {
        int i2;
        C0637l c0637l = (C0637l) view.getLayoutParams();
        View view2 = c0637l.firebase;
        if (view2 == null && c0637l.billing != -1) {
            C8339l.smaato("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        C8653l c8653l = f359l;
        if (view2 != null) {
            Rect rectYandex = yandex();
            Rect rectYandex2 = yandex();
            try {
                firebase(view2, rectYandex);
                C0637l c0637l2 = (C0637l) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                smaato(i, rectYandex, rectYandex2, c0637l2, measuredWidth, measuredHeight);
                loadAd(c0637l2, rectYandex2, measuredWidth, measuredHeight);
                view.layout(rectYandex2.left, rectYandex2.top, rectYandex2.right, rectYandex2.bottom);
                return;
            } finally {
                rectYandex.setEmpty();
                c8653l.crashlytics(rectYandex);
                rectYandex2.setEmpty();
                c8653l.crashlytics(rectYandex2);
            }
        }
        int i3 = c0637l.purchase;
        if (i3 < 0) {
            C0637l c0637l3 = (C0637l) view.getLayoutParams();
            Rect rectYandex3 = yandex();
            rectYandex3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0637l3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0637l3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0637l3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0637l3).bottomMargin);
            if (this.f378l != null) {
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectYandex3.left = this.f378l.loadAd() + rectYandex3.left;
                    rectYandex3.top = this.f378l.amazon() + rectYandex3.top;
                    rectYandex3.right -= this.f378l.crashlytics();
                    rectYandex3.bottom -= this.f378l.yandex();
                }
            }
            Rect rectYandex4 = yandex();
            int i4 = c0637l3.crashlytics;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectYandex3, rectYandex4, i);
            view.layout(rectYandex4.left, rectYandex4.top, rectYandex4.right, rectYandex4.bottom);
            rectYandex3.setEmpty();
            c8653l.crashlytics(rectYandex3);
            rectYandex4.setEmpty();
            c8653l.crashlytics(rectYandex4);
            return;
        }
        C0637l c0637l4 = (C0637l) view.getLayoutParams();
        int i5 = c0637l4.crashlytics;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int iRemoteconfig = remoteconfig(i3) - measuredWidth2;
        if (i6 == 1) {
            iRemoteconfig += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iRemoteconfig += measuredWidth2;
        }
        if (i7 != 16) {
            i2 = i7 != 80 ? 0 : measuredHeight2;
        } else {
            i2 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0637l4).leftMargin, Math.min(iRemoteconfig, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0637l4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0637l4).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0637l4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // defpackage.InterfaceC14324l
    public final void admob(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC8012l abstractC8012l;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0637l c0637l = (C0637l) childAt.getLayoutParams();
                if (c0637l.yandex(i3) && (abstractC8012l = c0637l.yandex) != null) {
                    int[] iArr2 = this.f372l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC8012l.firebase(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            startapp(1);
        }
    }

    public final void ads(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    public final void advert() {
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        if (!getFitsSystemWindows()) {
            AbstractC8558l.crashlytics(this, null);
            return;
        }
        if (this.f379l == null) {
            this.f379l = new C13161l(this);
        }
        AbstractC8558l.crashlytics(this, this.f379l);
        setSystemUiVisibility(1280);
    }

    @Override // defpackage.InterfaceC14324l
    public final void amazon(View view, int i, int i2, int i3, int i4, int i5) {
        crashlytics(view, i, i2, i3, i4, 0, this.f376l);
    }

    @Override // defpackage.InterfaceC14324l
    public final void billing(View view, View view2, int i, int i2) {
        C9754l c9754l = this.f368l;
        if (i2 == 1) {
            c9754l.f19892l = i;
        } else {
            c9754l.f19893l = i;
        }
        this.f377l = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C0637l) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0637l) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.InterfaceC3112l
    public final void crashlytics(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC8012l abstractC8012l;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0637l c0637l = (C0637l) childAt.getLayoutParams();
                if (c0637l.yandex(i5) && (abstractC8012l = c0637l.yandex) != null) {
                    int[] iArr2 = this.f372l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC8012l.smaato(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            startapp(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC8012l abstractC8012l = ((C0637l) view.getLayoutParams()).yandex;
        if (abstractC8012l != null) {
            abstractC8012l.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f365l;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final void firebase(View view, Rect rect) {
        ThreadLocal threadLocal = AbstractC17623l.yandex;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC17623l.yandex;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC17623l.yandex(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC17623l.loadAd;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0637l(-2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0637l) {
            return new C0637l((C0637l) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0637l((ViewGroup.MarginLayoutParams) layoutParams) : new C0637l(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        tapsense();
        return DesugarCollections.unmodifiableList(this.f367l);
    }

    public final C1473l getLastWindowInsets() {
        return this.f378l;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C9754l c9754l = this.f368l;
        return c9754l.f19892l | c9754l.f19893l;
    }

    public Drawable getStatusBarBackground() {
        return this.f365l;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final ArrayList isPro(View view) {
        C5128l c5128l = (C5128l) this.f366l.f20462l;
        int i = c5128l.f11161l;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) c5128l.subs(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c5128l.billing(i2));
            }
        }
        ArrayList arrayList3 = this.f373l;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void license(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC8012l abstractC8012l = ((C0637l) childAt.getLayoutParams()).yandex;
            if (abstractC8012l != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC8012l.mopub(this, childAt, motionEventObtain);
                } else {
                    abstractC8012l.ads(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0637l) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.f370l = null;
        this.f363l = false;
    }

    public final void loadAd(C0637l c0637l, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0637l).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0637l).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0637l).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0637l).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public final boolean metrica(View view, int i, int i2) {
        Rect rectYandex = yandex();
        firebase(view, rectYandex);
        try {
            return rectYandex.contains(i, i2);
        } finally {
            Signature(rectYandex);
        }
    }

    @Override // defpackage.InterfaceC14324l
    public final void mopub(View view, int i) {
        C9754l c9754l = this.f368l;
        if (i == 1) {
            c9754l.f19892l = 0;
        } else {
            c9754l.f19893l = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0637l c0637l = (C0637l) childAt.getLayoutParams();
            if (c0637l.yandex(i)) {
                AbstractC8012l abstractC8012l = c0637l.yandex;
                if (abstractC8012l != null) {
                    abstractC8012l.adcel(this, childAt, view, i);
                }
                if (i == 0) {
                    c0637l.remoteconfig = false;
                } else if (i == 1) {
                    c0637l.vip = false;
                }
                c0637l.metrica = false;
            }
        }
        this.f377l = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        license(false);
        if (this.f361l) {
            if (this.f374l == null) {
                this.f374l = new ViewTreeObserverOnPreDrawListenerC8361l(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f374l);
        }
        if (this.f378l == null) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.f364l = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        license(false);
        if (this.f361l && this.f374l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f374l);
        }
        View view = this.f377l;
        if (view != null) {
            mopub(view, 0);
        }
        this.f364l = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f371l || this.f365l == null) {
            return;
        }
        C1473l c1473l = this.f378l;
        int iAmazon = c1473l != null ? c1473l.amazon() : 0;
        if (iAmazon > 0) {
            this.f365l.setBounds(0, 0, getWidth(), iAmazon);
            this.f365l.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            license(true);
        }
        boolean zSubscription = subscription(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zSubscription;
        }
        license(true);
        return zSubscription;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC8012l abstractC8012l;
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f367l;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC8012l = ((C0637l) view.getLayoutParams()).yandex) == null || !abstractC8012l.admob(this, view, layoutDirection))) {
                adcel(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    /* JADX WARN: Code duplicated, block: B:72:0x015d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0167  */
    /* JADX WARN: Code duplicated, block: B:78:0x0186  */
    /* JADX WARN: Code duplicated, block: B:79:0x0189  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        AbstractC8012l abstractC8012l;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        ArrayList arrayList;
        int i10;
        View view;
        int i11;
        boolean zSubs;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.tapsense();
        int childCount = coordinatorLayout.getChildCount();
        int i12 = 0;
        loop0: while (true) {
            if (i12 >= childCount) {
                z = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i12);
            C5128l c5128l = (C5128l) coordinatorLayout.f366l.f20462l;
            int i13 = c5128l.f11161l;
            for (int i14 = 0; i14 < i13; i14++) {
                ArrayList arrayList2 = (ArrayList) c5128l.subs(i14);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i12++;
        }
        if (z != coordinatorLayout.f361l) {
            boolean z3 = coordinatorLayout.f364l;
            if (z) {
                if (z3) {
                    if (coordinatorLayout.f374l == null) {
                        coordinatorLayout.f374l = new ViewTreeObserverOnPreDrawListenerC8361l(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f374l);
                }
                coordinatorLayout.f361l = true;
            } else {
                if (z3 && coordinatorLayout.f374l != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f374l);
                }
                coordinatorLayout.f361l = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z4 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i15 = paddingLeft + paddingRight;
        int i16 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z5 = coordinatorLayout.f378l != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f367l;
        int size3 = arrayList3.size();
        int i17 = 0;
        int iCombineMeasuredStates = 0;
        while (i17 < size3) {
            View view2 = (View) arrayList3.get(i17);
            int i18 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i4 = size3;
                i11 = i17;
                i6 = paddingLeft;
                suggestedMinimumWidth = i18;
                z2 = false;
                i8 = paddingRight;
            } else {
                C0637l c0637l = (C0637l) view2.getLayoutParams();
                int i19 = c0637l.purchase;
                if (i19 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int iRemoteconfig = coordinatorLayout.remoteconfig(i19);
                    int i20 = c0637l.crashlytics;
                    if (i20 == 0) {
                        i20 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i20, layoutDirection) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z4) && !(absoluteGravity == 5 && z4)) {
                        if ((absoluteGravity == 5 && !z4) || (absoluteGravity == 3 && z4)) {
                            iMax = Math.max(0, iRemoteconfig - paddingLeft);
                        }
                        if (z5 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i2;
                        } else {
                            int iCrashlytics = coordinatorLayout.f378l.crashlytics() + coordinatorLayout.f378l.loadAd();
                            int iYandex = coordinatorLayout.f378l.yandex() + coordinatorLayout.f378l.amazon();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iCrashlytics, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iYandex, mode2);
                        }
                        abstractC8012l = c0637l.yandex;
                        if (abstractC8012l != null) {
                            z2 = false;
                            i6 = paddingLeft;
                            i7 = i18;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            int i21 = iMakeMeasureSpec;
                            i11 = i17;
                            int i22 = iMakeMeasureSpec2;
                            zSubs = abstractC8012l.subs(this, view2, i21, i5, i22);
                            view = view2;
                            iMakeMeasureSpec = i21;
                            i10 = i22;
                            if (zSubs) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c0637l).leftMargin + ((ViewGroup.MarginLayoutParams) c0637l).rightMargin);
                            int iMax3 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c0637l).topMargin + ((ViewGroup.MarginLayoutParams) c0637l).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            i6 = paddingLeft;
                            i7 = i18;
                            z2 = false;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            i10 = iMakeMeasureSpec2;
                            view = view2;
                            i11 = i17;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                        int iMax4 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c0637l).leftMargin + ((ViewGroup.MarginLayoutParams) c0637l).rightMargin);
                        int iMax5 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c0637l).topMargin + ((ViewGroup.MarginLayoutParams) c0637l).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iRemoteconfig);
                    }
                    int i23 = size3;
                    i5 = iMax;
                    i4 = i23;
                    if (z5) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    }
                    abstractC8012l = c0637l.yandex;
                    if (abstractC8012l != null) {
                        z2 = false;
                        i6 = paddingLeft;
                        i7 = i18;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        int i24 = iMakeMeasureSpec;
                        i11 = i17;
                        int i25 = iMakeMeasureSpec2;
                        zSubs = abstractC8012l.subs(this, view2, i24, i5, i25);
                        view = view2;
                        iMakeMeasureSpec = i24;
                        i10 = i25;
                        if (zSubs) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c0637l).leftMargin + ((ViewGroup.MarginLayoutParams) c0637l).rightMargin);
                        int iMax7 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c0637l).topMargin + ((ViewGroup.MarginLayoutParams) c0637l).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        i6 = paddingLeft;
                        i7 = i18;
                        z2 = false;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        i10 = iMakeMeasureSpec2;
                        view = view2;
                        i11 = i17;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                    int iMax8 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c0637l).leftMargin + ((ViewGroup.MarginLayoutParams) c0637l).rightMargin);
                    int iMax9 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c0637l).topMargin + ((ViewGroup.MarginLayoutParams) c0637l).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i4 = size3;
                i5 = 0;
                if (z5) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                abstractC8012l = c0637l.yandex;
                if (abstractC8012l != null) {
                    z2 = false;
                    i6 = paddingLeft;
                    i7 = i18;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    int i26 = iMakeMeasureSpec;
                    i11 = i17;
                    int i27 = iMakeMeasureSpec2;
                    zSubs = abstractC8012l.subs(this, view2, i26, i5, i27);
                    view = view2;
                    iMakeMeasureSpec = i26;
                    i10 = i27;
                    if (zSubs) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c0637l).leftMargin + ((ViewGroup.MarginLayoutParams) c0637l).rightMargin);
                    int iMax11 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c0637l).topMargin + ((ViewGroup.MarginLayoutParams) c0637l).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    i6 = paddingLeft;
                    i7 = i18;
                    z2 = false;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    i10 = iMakeMeasureSpec2;
                    view = view2;
                    i11 = i17;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                int iMax12 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c0637l).leftMargin + ((ViewGroup.MarginLayoutParams) c0637l).rightMargin);
                int iMax13 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c0637l).topMargin + ((ViewGroup.MarginLayoutParams) c0637l).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i17 = i11 + 1;
            paddingLeft = i6;
            paddingRight = i8;
            size3 = i4;
            arrayList3 = arrayList;
        }
        int i28 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i28), View.resolveSizeAndState(suggestedMinimumHeight, i2, i28 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0637l c0637l = (C0637l) childAt.getLayoutParams();
                if (c0637l.yandex(0)) {
                    AbstractC8012l abstractC8012l = c0637l.yandex;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC8012l abstractC8012l;
        int childCount = getChildCount();
        boolean zIsPro = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0637l c0637l = (C0637l) childAt.getLayoutParams();
                if (c0637l.yandex(0) && (abstractC8012l = c0637l.yandex) != null) {
                    zIsPro |= abstractC8012l.isPro(view);
                }
            }
        }
        return zIsPro;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        admob(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        amazon(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        billing(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C4518l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4518l c4518l = (C4518l) parcelable;
        super.onRestoreInstanceState(c4518l.f5855l);
        SparseArray sparseArray = c4518l.f9158l;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC8012l abstractC8012l = vip(childAt).yandex;
            if (id != -1 && abstractC8012l != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC8012l.vip(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMetrica;
        C4518l c4518l = new C4518l(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC8012l abstractC8012l = ((C0637l) childAt.getLayoutParams()).yandex;
            if (id != -1 && abstractC8012l != null && (parcelableMetrica = abstractC8012l.metrica(childAt)) != null) {
                sparseArray.append(id, parcelableMetrica);
            }
        }
        c4518l.f9158l = sparseArray;
        return c4518l;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return purchase(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mopub(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zSubscription;
        boolean zAds;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f370l == null) {
            zSubscription = subscription(motionEvent, 1);
            if (!zSubscription) {
                zAds = false;
            }
            motionEventObtain = null;
            if (this.f370l == null) {
                zAds |= super.onTouchEvent(motionEvent);
            } else if (zSubscription) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zAds;
            }
            license(false);
            return zAds;
        }
        zSubscription = false;
        AbstractC8012l abstractC8012l = ((C0637l) this.f370l.getLayoutParams()).yandex;
        if (abstractC8012l != null) {
            zAds = abstractC8012l.ads(this, this.f370l, motionEvent);
        } else {
            zAds = false;
        }
        motionEventObtain = null;
        if (this.f370l == null) {
            zAds |= super.onTouchEvent(motionEvent);
        } else if (zSubscription) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        license(false);
        return zAds;
    }

    @Override // defpackage.InterfaceC14324l
    public final boolean purchase(View view, View view2, int i, int i2) {
        CoordinatorLayout coordinatorLayout;
        View view3;
        int i3;
        int i4;
        int childCount = getChildCount();
        int i5 = 0;
        boolean z = false;
        while (i5 < childCount) {
            View childAt = this.getChildAt(i5);
            if (childAt.getVisibility() == 8) {
                coordinatorLayout = this;
                view3 = view;
                i3 = i;
                i4 = i2;
            } else {
                C0637l c0637l = (C0637l) childAt.getLayoutParams();
                AbstractC8012l abstractC8012l = c0637l.yandex;
                if (abstractC8012l != null) {
                    coordinatorLayout = this;
                    view3 = view;
                    i3 = i;
                    i4 = i2;
                    boolean zStartapp = abstractC8012l.startapp(coordinatorLayout, childAt, view3, i3, i4);
                    z |= zStartapp;
                    if (i4 == 0) {
                        c0637l.remoteconfig = zStartapp;
                    } else if (i4 == 1) {
                        c0637l.vip = zStartapp;
                    }
                } else {
                    coordinatorLayout = this;
                    view3 = view;
                    i3 = i;
                    i4 = i2;
                    if (i4 == 0) {
                        c0637l.remoteconfig = false;
                    } else if (i4 == 1) {
                        c0637l.vip = false;
                    }
                }
            }
            i5++;
            this = coordinatorLayout;
            view = view3;
            i = i3;
            i2 = i4;
        }
        return z;
    }

    public final int remoteconfig(int i) {
        int[] iArr = this.f375l;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC8012l abstractC8012l = ((C0637l) view.getLayoutParams()).yandex;
        if (abstractC8012l == null || !abstractC8012l.remoteconfig(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f363l) {
            return;
        }
        license(false);
        this.f363l = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        advert();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f369l = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f365l;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f365l = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f365l.setState(getDrawableState());
                }
                Drawable drawable3 = this.f365l;
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f365l.setVisible(getVisibility() == 0, false);
                this.f365l.setCallback(this);
            }
            WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f365l;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f365l.setVisible(z, false);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    public final void startapp(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean zAmazon;
        boolean z;
        boolean z2;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        C0637l c0637l;
        int i10;
        View view;
        AbstractC8012l abstractC8012l;
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f367l;
        int size = arrayList2.size();
        Rect rectYandex = yandex();
        Rect rectYandex2 = yandex();
        Rect rectYandex3 = yandex();
        int i11 = 0;
        while (true) {
            C8653l c8653l = f359l;
            if (i11 >= size) {
                Rect rect2 = rectYandex3;
                rectYandex.setEmpty();
                c8653l.crashlytics(rectYandex);
                rectYandex2.setEmpty();
                c8653l.crashlytics(rectYandex2);
                rect2.setEmpty();
                c8653l.crashlytics(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i11);
            C0637l c0637l2 = (C0637l) view2.getLayoutParams();
            if (i != 0 || view2.getVisibility() != 8) {
                int i12 = 0;
                while (i12 < i11) {
                    if (c0637l2.smaato == ((View) arrayList2.get(i12))) {
                        C0637l c0637l3 = (C0637l) view2.getLayoutParams();
                        if (c0637l3.firebase != null) {
                            Rect rectYandex4 = yandex();
                            Rect rectYandex5 = yandex();
                            C0637l c0637l4 = c0637l2;
                            Rect rectYandex6 = yandex();
                            firebase(c0637l3.firebase, rectYandex4);
                            subs(view2, rectYandex5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            c0637l = c0637l4;
                            i10 = i12;
                            layoutDirection = layoutDirection;
                            view = view3;
                            smaato(layoutDirection, rectYandex4, rectYandex6, c0637l3, measuredWidth, measuredHeight);
                            boolean z3 = (rectYandex6.left == rectYandex5.left && rectYandex6.top == rectYandex5.top) ? false : true;
                            loadAd(c0637l3, rectYandex6, measuredWidth, measuredHeight);
                            int i13 = rectYandex6.left - rectYandex5.left;
                            int i14 = rectYandex6.top - rectYandex5.top;
                            if (i13 != 0) {
                                WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
                                view.offsetLeftAndRight(i13);
                            }
                            if (i14 != 0) {
                                WeakHashMap weakHashMap3 = AbstractC15872l.yandex;
                                view.offsetTopAndBottom(i14);
                            }
                            if (z3 && (abstractC8012l = c0637l3.yandex) != null) {
                                abstractC8012l.amazon(this, view, c0637l3.firebase);
                            }
                            rectYandex4.setEmpty();
                            c8653l.crashlytics(rectYandex4);
                            rectYandex5.setEmpty();
                            c8653l.crashlytics(rectYandex5);
                            rectYandex6.setEmpty();
                            c8653l.crashlytics(rectYandex6);
                        } else {
                            c0637l = c0637l2;
                            i10 = i12;
                            view = view2;
                        }
                    } else {
                        c0637l = c0637l2;
                        i10 = i12;
                        view = view2;
                    }
                    i12 = i10 + 1;
                    c0637l2 = c0637l;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i11 = i11;
                    rectYandex3 = rectYandex3;
                }
                ArrayList arrayList3 = arrayList2;
                C0637l c0637l5 = c0637l2;
                int i15 = size;
                Rect rect3 = rectYandex3;
                i2 = i11;
                View view4 = view2;
                subs(view4, rectYandex2, true);
                if (c0637l5.mopub != 0 && !rectYandex2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c0637l5.mopub, layoutDirection);
                    int i16 = absoluteGravity & 112;
                    if (i16 == 48) {
                        rectYandex.top = Math.max(rectYandex.top, rectYandex2.bottom);
                    } else if (i16 == 80) {
                        rectYandex.bottom = Math.max(rectYandex.bottom, getHeight() - rectYandex2.top);
                    }
                    int i17 = absoluteGravity & 7;
                    if (i17 == 3) {
                        rectYandex.left = Math.max(rectYandex.left, rectYandex2.right);
                    } else if (i17 == 5) {
                        rectYandex.right = Math.max(rectYandex.right, getWidth() - rectYandex2.left);
                    }
                }
                if (c0637l5.admob != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = AbstractC15872l.yandex;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        C0637l c0637l6 = (C0637l) view4.getLayoutParams();
                        AbstractC8012l abstractC8012l2 = c0637l6.yandex;
                        Rect rectYandex7 = yandex();
                        Rect rectYandex8 = yandex();
                        rectYandex8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (abstractC8012l2 == null || !abstractC8012l2.yandex(view4)) {
                            rectYandex7.set(rectYandex8);
                        } else if (!rectYandex8.contains(rectYandex7)) {
                            C8936l.remoteconfig("Rect should be within the child's bounds. Rect:", rectYandex7.toShortString(), " | Bounds:", rectYandex8.toShortString());
                            return;
                        }
                        rectYandex8.setEmpty();
                        c8653l.crashlytics(rectYandex8);
                        if (rectYandex7.isEmpty()) {
                            rectYandex7.setEmpty();
                            c8653l.crashlytics(rectYandex7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c0637l6.admob, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (rectYandex7.top - ((ViewGroup.MarginLayoutParams) c0637l6).topMargin) - c0637l6.isPro) >= (i9 = rectYandex.top)) {
                                z = false;
                            } else {
                                ad(view4, i9 - i8);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectYandex7.bottom) - ((ViewGroup.MarginLayoutParams) c0637l6).bottomMargin) + c0637l6.isPro) < (i7 = rectYandex.bottom)) {
                                ad(view4, height - i7);
                                z = true;
                            }
                            if (!z) {
                                ad(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (rectYandex7.left - ((ViewGroup.MarginLayoutParams) c0637l6).leftMargin) - c0637l6.subs) >= (i6 = rectYandex.left)) {
                                z2 = false;
                            } else {
                                pro(view4, i6 - i5);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectYandex7.right) - ((ViewGroup.MarginLayoutParams) c0637l6).rightMargin) + c0637l6.subs) < (i4 = rectYandex.right)) {
                                pro(view4, width - i4);
                                z2 = true;
                            }
                            if (!z2) {
                                pro(view4, 0);
                            }
                            rectYandex7.setEmpty();
                            c8653l.crashlytics(rectYandex7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((C0637l) view4.getLayoutParams()).startapp);
                    if (rect.equals(rectYandex2)) {
                        arrayList = arrayList3;
                        i3 = i15;
                    } else {
                        ((C0637l) view4.getLayoutParams()).startapp.set(rectYandex2);
                    }
                } else {
                    rect = rect3;
                }
                int i18 = i2 + 1;
                i3 = i15;
                while (true) {
                    arrayList = arrayList3;
                    if (i18 >= i3) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i18);
                    C0637l c0637l7 = (C0637l) view5.getLayoutParams();
                    AbstractC8012l abstractC8012l3 = c0637l7.yandex;
                    if (abstractC8012l3 != null && abstractC8012l3.loadAd(view5, view4)) {
                        if (i == 0 && c0637l7.metrica) {
                            c0637l7.metrica = false;
                        } else {
                            if (i != 2) {
                                zAmazon = abstractC8012l3.amazon(this, view5, view4);
                            } else {
                                abstractC8012l3.purchase(this, view4);
                                zAmazon = true;
                            }
                            if (i == 1) {
                                c0637l7.metrica = zAmazon;
                            }
                        }
                    }
                    i18++;
                    arrayList3 = arrayList;
                }
            } else {
                arrayList = arrayList2;
                i3 = size;
                rect = rectYandex3;
                i2 = i11;
            }
            i11 = i2 + 1;
            rectYandex3 = rect;
            size = i3;
            arrayList2 = arrayList;
        }
    }

    public final void subs(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            firebase(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final boolean subscription(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f362l;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        C13617l c13617l = f360l;
        if (c13617l != null) {
            Collections.sort(arrayList, c13617l);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMopub = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            AbstractC8012l abstractC8012l = ((C0637l) view.getLayoutParams()).yandex;
            if (zMopub && actionMasked != 0) {
                if (abstractC8012l != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        abstractC8012l.mopub(this, view, motionEventObtain);
                    } else if (i == 1) {
                        abstractC8012l.ads(this, view, motionEventObtain);
                    }
                }
            } else if (!zMopub && abstractC8012l != null) {
                if (i == 0) {
                    zMopub = abstractC8012l.mopub(this, view, motionEvent);
                } else if (i == 1) {
                    zMopub = abstractC8012l.ads(this, view, motionEvent);
                }
                if (zMopub) {
                    this.f370l = view;
                }
            }
        }
        arrayList.clear();
        return zMopub;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0093
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void tapsense() {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.tapsense():void");
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f365l;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0637l(getContext(), attributeSet);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }
}
