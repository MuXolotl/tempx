package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC0653l;
import defpackage.AbstractC11990l;
import defpackage.AbstractC12832l;
import defpackage.AbstractC14412l;
import defpackage.AbstractC15872l;
import defpackage.AbstractC17777l;
import defpackage.AbstractC4548l;
import defpackage.AbstractC4927l;
import defpackage.AbstractC8012l;
import defpackage.AbstractC8558l;
import defpackage.AbstractC9694l;
import defpackage.C0213l;
import defpackage.C0516l;
import defpackage.C0637l;
import defpackage.C10156l;
import defpackage.C11446l;
import defpackage.C11707l;
import defpackage.C12564l;
import defpackage.C12629l;
import defpackage.C13530l;
import defpackage.C14785l;
import defpackage.C14990l;
import defpackage.C15380l;
import defpackage.C18369l;
import defpackage.C2494l;
import defpackage.C2814l;
import defpackage.C4181l;
import defpackage.C5022l;
import defpackage.C5551l;
import defpackage.C6921l;
import defpackage.C6933l;
import defpackage.C7644l;
import defpackage.C8339l;
import defpackage.C8662l;
import defpackage.C9098l;
import defpackage.C9967l;
import defpackage.InterfaceC16867l;
import defpackage.InterfaceC3177l;
import defpackage.RunnableC16824l;
import defpackage.ViewOnAttachStateChangeListenerC10783l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.WeakHashMap;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC8012l {
    public final boolean Signature;

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final C11707l f629abstract;
    public final boolean ad;
    public final boolean adcel;
    public final int admob;
    public final boolean ads;
    public final C12564l advert;
    public final int amazon;
    public final int applovin;
    public int appmetrica;
    public boolean billing;

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public int f630case;

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public boolean f631catch;

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public WeakReference f632class;

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public int f633continue;
    public final float crashlytics;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public VelocityTracker f634default;

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final float f635else;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public C0213l f636extends;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public int f637final;
    public final int firebase;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public boolean f638for;

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public boolean f639goto;

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final SparseIntArray f640import;
    public int inmobi;

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public WeakReference f641interface;
    public final ColorStateList isPro;
    public boolean isVip;
    public int license;
    public boolean loadAd;
    public final boolean metrica;
    public int mopub;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public boolean f642native;

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public int f643new;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public int f644package;
    public final ValueAnimator premium;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public int f645private;
    public int pro;
    public int purchase;
    public int remoteconfig;
    public final C8662l signatures;
    public final int smaato;
    public final boolean startapp;

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final ArrayList f646static;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public boolean f647strictfp;
    public final C5022l subs;
    public final boolean subscription;

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public HashMap f648super;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public int f649switch;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final float f650synchronized;
    public final boolean tapsense;

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public int f651throw;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final float f652throws;
    public final boolean vip;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public boolean f653volatile;
    public final int yandex;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.yandex = 0;
        int i2 = 1;
        this.loadAd = true;
        this.firebase = -1;
        this.smaato = -1;
        this.signatures = new C8662l(this);
        this.f652throws = 0.5f;
        this.f650synchronized = -1.0f;
        this.f642native = true;
        this.f645private = 4;
        this.f635else = 0.1f;
        this.f646static = new ArrayList();
        this.f643new = -1;
        this.f640import = new SparseIntArray();
        this.f629abstract = new C11707l(this, 0);
        this.admob = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4548l.purchase);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.isPro = AbstractC4927l.subs(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.advert = C12564l.loadAd(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).yandex();
        }
        C12564l c12564l = this.advert;
        if (c12564l != null) {
            C5022l c5022l = new C5022l(c12564l);
            this.subs = c5022l;
            c5022l.mopub(context);
            ColorStateList colorStateList = this.isPro;
            if (colorStateList != null) {
                this.subs.isPro(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.subs.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(tapsense(), 1.0f);
        this.premium = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.premium.addUpdateListener(new C5551l(i2, this));
        this.f650synchronized = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.firebase = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.smaato = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            applovin(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            applovin(i);
        }
        premium(typedArrayObtainStyledAttributes.getBoolean(8, false));
        this.vip = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.loadAd != z) {
            this.loadAd = z;
            if (this.f632class != null) {
                subscription();
            }
            inmobi((this.loadAd && this.f645private == 6) ? 3 : this.f645private);
            m178strictfp(this.f645private, true);
            m179synchronized();
        }
        this.f653volatile = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f642native = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.yandex = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            C8339l.metrica("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.f652throws = f;
        if (this.f632class != null) {
            this.inmobi = (int) ((1.0f - f) * this.f633continue);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset < 0) {
                C8339l.metrica("offset must be greater than or equal to 0");
                throw null;
            }
            this.applovin = dimensionPixelOffset;
            m178strictfp(this.f645private, true);
        } else {
            int i3 = typedValuePeekValue2.data;
            if (i3 < 0) {
                C8339l.metrica("offset must be greater than or equal to 0");
                throw null;
            }
            this.applovin = i3;
            m178strictfp(this.f645private, true);
        }
        this.amazon = typedArrayObtainStyledAttributes.getInt(11, 500);
        this.metrica = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.startapp = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.adcel = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.ads = typedArrayObtainStyledAttributes.getBoolean(20, true);
        this.subscription = typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.tapsense = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.Signature = typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.ad = typedArrayObtainStyledAttributes.getBoolean(23, true);
        typedArrayObtainStyledAttributes.recycle();
        this.crashlytics = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static int ad(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, RecyclerView.UNDEFINED_DURATION);
    }

    public static View pro(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewPro = pro(viewGroup.getChildAt(i));
            if (viewPro != null) {
                return viewPro;
            }
        }
        return null;
    }

    public final int Signature() {
        int iMin;
        int i;
        int i2;
        if (this.billing) {
            iMin = Math.min(Math.max(this.mopub, this.f633continue - ((this.f649switch * 9) / 16)), this.f630case);
            i = this.license;
        } else {
            if (!this.vip && !this.metrica && (i2 = this.remoteconfig) > 0) {
                return Math.max(this.purchase, i2 + this.admob);
            }
            iMin = this.purchase;
            i = this.license;
        }
        return iMin + i;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // defpackage.AbstractC8012l
    public final void adcel(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        int top;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == advert()) {
            inmobi(3);
            return;
        }
        WeakReference weakReference = this.f641interface;
        if (weakReference != null && view2 == weakReference.get() && this.f631catch) {
            if (this.f651throw > 0) {
                if (!this.loadAd && view.getTop() > this.inmobi) {
                    i3 = 6;
                }
            } else if (this.f647strictfp) {
                VelocityTracker velocityTracker = this.f634default;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.crashlytics);
                    yVelocity = this.f634default.getYVelocity(this.f637final);
                }
                if (m180throws(view, yVelocity)) {
                    i3 = 5;
                } else if (this.f651throw == 0) {
                    top2 = view.getTop();
                    if (this.loadAd) {
                        i2 = this.inmobi;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.f644package)) {
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f644package)) {
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.appmetrica) >= Math.abs(top2 - this.f644package)) {
                        i3 = 4;
                    }
                } else {
                    if (!this.loadAd) {
                        top = view.getTop();
                        if (Math.abs(top - this.inmobi) < Math.abs(top - this.f644package)) {
                            i3 = 6;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.f651throw == 0) {
                top2 = view.getTop();
                if (this.loadAd) {
                    i2 = this.inmobi;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.f644package)) {
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f644package)) {
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.appmetrica) >= Math.abs(top2 - this.f644package)) {
                    i3 = 4;
                }
            } else {
                if (!this.loadAd) {
                    top = view.getTop();
                    if (Math.abs(top - this.inmobi) < Math.abs(top - this.f644package)) {
                        i3 = 6;
                    }
                }
                i3 = 4;
            }
            m177package(view, i3, false);
            this.f631catch = false;
        }
    }

    @Override // defpackage.AbstractC8012l
    public boolean admob(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.f632class == null) {
            this.mopub = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.vip || this.billing) ? false : true;
            if (this.metrica || this.startapp || this.adcel || this.subscription || this.tapsense || this.Signature || z) {
                C6921l c6921l = new C6921l(this, z, i2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                C15380l c15380l = new C15380l(7);
                c15380l.loadAd = paddingStart;
                c15380l.crashlytics = paddingEnd;
                c15380l.amazon = paddingBottom;
                AbstractC8558l.crashlytics(view, new C2494l(c6921l, c15380l, 28));
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC10783l());
                }
            }
            AbstractC15872l.startapp(view, new C4181l(view));
            this.f632class = new WeakReference(view);
            new C0516l(view);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            C5022l c5022l = this.subs;
            if (c5022l != null) {
                view.setBackground(c5022l);
                float elevation = this.f650synchronized;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c5022l.subs(elevation);
            } else {
                ColorStateList colorStateList = this.isPro;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            m179synchronized();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f636extends == null) {
            this.f636extends = new C0213l(coordinatorLayout.getContext(), coordinatorLayout, this.f629abstract);
        }
        int top = view.getTop();
        coordinatorLayout.adcel(view, i);
        this.f649switch = coordinatorLayout.getWidth();
        this.f633continue = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f630case = height;
        int iMin = this.f633continue;
        int i3 = iMin - height;
        int i4 = this.pro;
        if (i3 < i4) {
            boolean z2 = this.ads;
            int i5 = this.smaato;
            if (z2) {
                if (i5 != -1) {
                    iMin = Math.min(iMin, i5);
                }
                this.f630case = iMin;
            } else {
                int iMin2 = iMin - i4;
                if (i5 != -1) {
                    iMin2 = Math.min(iMin2, i5);
                }
                this.f630case = iMin2;
            }
        }
        this.appmetrica = Math.max(0, this.f633continue - this.f630case);
        this.inmobi = (int) ((1.0f - this.f652throws) * this.f633continue);
        subscription();
        int i6 = this.f645private;
        if (i6 == 3) {
            view.offsetTopAndBottom(advert());
        } else if (i6 == 6) {
            view.offsetTopAndBottom(this.inmobi);
        } else if (this.f647strictfp && i6 == 5) {
            view.offsetTopAndBottom(this.f633continue);
        } else if (i6 == 4) {
            view.offsetTopAndBottom(this.f644package);
        } else if (i6 == 1 || i6 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        m178strictfp(this.f645private, false);
        this.f641interface = new WeakReference(pro(view));
        while (true) {
            ArrayList arrayList = this.f646static;
            if (i2 >= arrayList.size()) {
                return true;
            }
            ((C18369l) arrayList.get(i2)).getClass();
            i2++;
        }
    }

    @Override // defpackage.AbstractC8012l
    public final boolean ads(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f645private;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C0213l c0213l = this.f636extends;
        if (c0213l != null && (this.f642native || i == 1)) {
            c0213l.isPro(motionEvent);
        }
        if (actionMasked == 0) {
            this.f637final = -1;
            this.f643new = -1;
            VelocityTracker velocityTracker = this.f634default;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f634default = null;
            }
        }
        if (this.f634default == null) {
            this.f634default = VelocityTracker.obtain();
        }
        this.f634default.addMovement(motionEvent);
        if (this.f636extends != null && ((this.f642native || this.f645private == 1) && actionMasked == 2 && !this.f638for)) {
            float fAbs = Math.abs(this.f643new - motionEvent.getY());
            C0213l c0213l2 = this.f636extends;
            if (fAbs > c0213l2.loadAd) {
                c0213l2.loadAd(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f638for;
    }

    public final int advert() {
        if (this.loadAd) {
            return this.appmetrica;
        }
        return Math.max(this.applovin, this.ads ? 0 : this.pro);
    }

    public final void applovin(int i) {
        boolean z = this.billing;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.billing = true;
            }
        } else {
            if (!z && this.purchase == i) {
                return;
            }
            this.billing = false;
            this.purchase = Math.max(0, i);
        }
        m176native();
    }

    public void appmetrica(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC0653l.ads(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f647strictfp && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.loadAd && isVip(i) <= this.appmetrica) ? 3 : i;
        WeakReference weakReference = this.f632class;
        if (weakReference == null || weakReference.get() == null) {
            inmobi(i);
            return;
        }
        View view = (View) this.f632class.get();
        RunnableC16824l runnableC16824l = new RunnableC16824l(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            if (view.isAttachedToWindow()) {
                view.post(runnableC16824l);
                return;
            }
        }
        runnableC16824l.run();
    }

    @Override // defpackage.AbstractC8012l
    public final void billing() {
        this.f632class = null;
        this.f636extends = null;
    }

    @Override // defpackage.AbstractC8012l
    public final void crashlytics(C0637l c0637l) {
        this.f632class = null;
        this.f636extends = null;
    }

    @Override // defpackage.AbstractC8012l
    public final void firebase(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f641interface;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < advert()) {
                int iAdvert = top - advert();
                iArr[1] = iAdvert;
                int i5 = -iAdvert;
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                view.offsetTopAndBottom(i5);
                inmobi(3);
            } else {
                if (!this.f642native) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
                view.offsetTopAndBottom(-i2);
                inmobi(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.f644package;
            if (i4 > i6 && !this.f647strictfp) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap weakHashMap3 = AbstractC15872l.yandex;
                view.offsetTopAndBottom(i8);
                inmobi(4);
            } else {
                if (!this.f642native) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = AbstractC15872l.yandex;
                view.offsetTopAndBottom(-i2);
                inmobi(1);
            }
        }
        license(view.getTop());
        this.f651throw = i2;
        this.f631catch = true;
    }

    public final void inmobi(int i) {
        if (this.f645private == i) {
            return;
        }
        this.f645private = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.f647strictfp;
        }
        WeakReference weakReference = this.f632class;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m181volatile(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m181volatile(false);
        }
        m178strictfp(i, true);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f646static;
            if (i2 >= arrayList.size()) {
                m179synchronized();
                return;
            }
            C13530l c13530l = ((C18369l) arrayList.get(i2)).yandex;
            if (i != 5) {
                CustomBottomSheetBehavior customBottomSheetBehavior = c13530l.amazon;
                if (customBottomSheetBehavior == null) {
                    customBottomSheetBehavior = null;
                }
                customBottomSheetBehavior.premium(false);
            }
            if (i == 3) {
                c13530l.loadAd.purchase(true);
            } else if (i == 4 || i == 5) {
                C7644l c7644l = c13530l.yandex.f36640l;
                if (c7644l != null) {
                    View view = (View) c7644l.f15735l;
                    view.setClickable(false);
                    view.setFocusable(false);
                    view.setVisibility(8);
                }
                c13530l.loadAd.purchase(false);
            }
            if (i == 1 || i == 2) {
                C2814l c2814l = c13530l.yandex.f36637l;
                c2814l.getClass();
                try {
                    FrameLayout frameLayout = c2814l.purchase[c2814l.subs];
                    View childAt = frameLayout != null ? frameLayout.getChildAt(0) : null;
                    C9967l c9967l = childAt instanceof C9967l ? (C9967l) childAt : null;
                    if (c9967l != null) {
                        Stack<AbstractC17777l> fragmentStack = c9967l.getFragmentStack();
                        if (fragmentStack.isEmpty()) {
                            fragmentStack = null;
                        }
                        InterfaceC3177l interfaceC3177l = fragmentStack != null ? (AbstractC17777l) fragmentStack.lastElement() : null;
                        InterfaceC16867l interfaceC16867l = interfaceC3177l instanceof InterfaceC16867l ? (InterfaceC16867l) interfaceC3177l : null;
                        if (interfaceC16867l != null) {
                            AbstractC14412l abstractC14412l = ((AbstractC9694l) interfaceC16867l).f5279l;
                            if (abstractC14412l == null) {
                                abstractC14412l = null;
                            }
                            C11446l c11446l = abstractC14412l instanceof C11446l ? (C11446l) abstractC14412l : null;
                            if (c11446l != null) {
                                c11446l.remoteconfig(true);
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            if (i == 3) {
                AbstractC12832l.mopub(C9098l.yandex, AbstractC11990l.firebase(c13530l.yandex));
            }
            i2++;
        }
    }

    @Override // defpackage.AbstractC8012l
    public final boolean isPro(View view) {
        WeakReference weakReference = this.f641interface;
        return (weakReference == null || view != weakReference.get() || this.f645private == 3) ? false : true;
    }

    public final int isVip(int i) {
        if (i == 3) {
            return advert();
        }
        if (i == 4) {
            return this.f644package;
        }
        if (i == 5) {
            return this.f633continue;
        }
        if (i == 6) {
            return this.inmobi;
        }
        C8339l.metrica(AbstractC0653l.vip(i, "Invalid state to get top offset: "));
        return 0;
    }

    public final void license(int i) {
        float f;
        float fAdvert;
        if (((View) this.f632class.get()) != null) {
            ArrayList arrayList = this.f646static;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f644package;
            if (i > i2 || i2 == advert()) {
                int i3 = this.f644package;
                f = i3 - i;
                fAdvert = this.f633continue - i3;
            } else {
                int i4 = this.f644package;
                f = i4 - i;
                fAdvert = i4 - advert();
            }
            float f2 = f / fAdvert;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((C18369l) arrayList.get(i5)).yandex.purchase(f2);
            }
        }
    }

    @Override // defpackage.AbstractC8012l
    public final Parcelable metrica(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C12629l(this);
    }

    @Override // defpackage.AbstractC8012l
    public boolean mopub(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        C0213l c0213l;
        if (!view.isShown() || !this.f642native) {
            this.f638for = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f637final = -1;
            this.f643new = -1;
            VelocityTracker velocityTracker = this.f634default;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f634default = null;
            }
        }
        if (this.f634default == null) {
            this.f634default = VelocityTracker.obtain();
        }
        this.f634default.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f643new = (int) motionEvent.getY();
            if (this.f645private != 2) {
                WeakReference weakReference = this.f641interface;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.metrica(view2, x, this.f643new)) {
                    this.f637final = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f639goto = true;
                }
            }
            this.f638for = this.f637final == -1 && !coordinatorLayout.metrica(view, x, this.f643new);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f639goto = false;
            this.f637final = -1;
            if (this.f638for) {
                this.f638for = false;
                return false;
            }
        }
        if (this.f638for || (c0213l = this.f636extends) == null || !c0213l.startapp(motionEvent)) {
            WeakReference weakReference2 = this.f641interface;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f638for || this.f645private == 1 || coordinatorLayout.metrica(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f636extends == null || (i = this.f643new) == -1 || Math.abs(i - motionEvent.getY()) <= this.f636extends.loadAd) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void m176native() {
        View view;
        if (this.f632class != null) {
            subscription();
            if (this.f645private != 4 || (view = (View) this.f632class.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        inmobi(2);
        m178strictfp(r4, true);
        r2.signatures.loadAd(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.metrica(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX INFO: renamed from: package, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m177package(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.isVip(r4)
            lٍؑ٘ r1 = r2.f636extends
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.metrica(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.ads = r3
            r3 = -1
            r1.crashlytics = r3
            r3 = 0
            boolean r3 = r1.admob(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.yandex
            if (r5 != 0) goto L30
            android.view.View r5 = r1.ads
            if (r5 == 0) goto L30
            r5 = 0
            r1.ads = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.inmobi(r3)
            r3 = 1
            r2.m178strictfp(r4, r3)
            lٌٌَ r2 = r2.signatures
            r2.loadAd(r4)
            return
        L40:
            r2.inmobi(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m177package(android.view.View, int, boolean):void");
    }

    public final void premium(boolean z) {
        if (this.f647strictfp != z) {
            this.f647strictfp = z;
            if (!z && this.f645private == 5) {
                appmetrica(4);
            }
            m179synchronized();
        }
    }

    public final boolean signatures() {
        WeakReference weakReference = this.f632class;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f632class.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC8012l
    public final boolean startapp(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.f651throw = 0;
        this.f631catch = false;
        return (i & 2) != 0;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final void m178strictfp(int i, boolean z) {
        C5022l c5022l;
        if (i == 2) {
            return;
        }
        boolean z2 = this.f645private == 3 && (this.ad || signatures());
        if (this.isVip == z2 || (c5022l = this.subs) == null) {
            return;
        }
        this.isVip = z2;
        ValueAnimator valueAnimator = this.premium;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            c5022l.firebase(this.isVip ? tapsense() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(c5022l.f10262l.subs, z2 ? tapsense() : 1.0f);
            valueAnimator.start();
        }
    }

    @Override // defpackage.AbstractC8012l
    public final boolean subs(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ad(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.firebase, marginLayoutParams.width), ad(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.smaato, marginLayoutParams.height));
        return true;
    }

    public final void subscription() {
        int iSignature = Signature();
        boolean z = this.loadAd;
        int i = this.f633continue;
        if (z) {
            this.f644package = Math.max(i - iSignature, this.appmetrica);
        } else {
            this.f644package = i - iSignature;
        }
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m179synchronized() {
        View view;
        int iYandex;
        WeakReference weakReference = this.f632class;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC15872l.firebase(view, 524288);
        AbstractC15872l.admob(view, 0);
        AbstractC15872l.firebase(view, 262144);
        AbstractC15872l.admob(view, 0);
        AbstractC15872l.firebase(view, 1048576);
        AbstractC15872l.admob(view, 0);
        SparseIntArray sparseIntArray = this.f640import;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            AbstractC15872l.firebase(view, i);
            AbstractC15872l.admob(view, 0);
            sparseIntArray.delete(0);
        }
        int i2 = 1;
        int i3 = 6;
        if (!this.loadAd && this.f645private != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C14785l c14785l = new C14785l(this, i3, i2);
            ArrayList arrayListBilling = AbstractC15872l.billing(view);
            int i4 = 0;
            while (true) {
                if (i4 >= arrayListBilling.size()) {
                    int i5 = 0;
                    int i6 = -1;
                    while (true) {
                        int[] iArr = AbstractC15872l.amazon;
                        if (i5 >= 32 || i6 != -1) {
                            break;
                        }
                        int i7 = iArr[i5];
                        boolean z = true;
                        for (int i8 = 0; i8 < arrayListBilling.size(); i8++) {
                            z &= ((C6933l) arrayListBilling.get(i8)).yandex() != i7;
                        }
                        if (z) {
                            i6 = i7;
                        }
                        i5++;
                    }
                    iYandex = i6;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C6933l) arrayListBilling.get(i4)).yandex).getLabel())) {
                    iYandex = ((C6933l) arrayListBilling.get(i4)).yandex();
                    break;
                }
                i4++;
            }
            if (iYandex != -1) {
                C6933l c6933l = new C6933l(null, iYandex, string, c14785l, null);
                View.AccessibilityDelegate accessibilityDelegateAmazon = AbstractC15872l.amazon(view);
                C10156l c10156l = accessibilityDelegateAmazon == null ? null : accessibilityDelegateAmazon instanceof C14990l ? ((C14990l) accessibilityDelegateAmazon).yandex : new C10156l(accessibilityDelegateAmazon);
                if (c10156l == null) {
                    c10156l = new C10156l();
                }
                AbstractC15872l.vip(view, c10156l);
                AbstractC15872l.firebase(view, c6933l.yandex());
                AbstractC15872l.billing(view).add(c6933l);
                AbstractC15872l.admob(view, 0);
            }
            sparseIntArray.put(0, iYandex);
        }
        if (this.f647strictfp) {
            int i9 = 5;
            if (this.f645private != 5) {
                AbstractC15872l.smaato(view, C6933l.smaato, new C14785l(this, i9, i2));
            }
        }
        int i10 = this.f645private;
        int i11 = 4;
        int i12 = 3;
        if (i10 == 3) {
            AbstractC15872l.smaato(view, C6933l.firebase, new C14785l(this, this.loadAd ? 4 : 6, i2));
            return;
        }
        if (i10 == 4) {
            AbstractC15872l.smaato(view, C6933l.isPro, new C14785l(this, this.loadAd ? 3 : 6, i2));
        } else {
            if (i10 != 6) {
                return;
            }
            AbstractC15872l.smaato(view, C6933l.firebase, new C14785l(this, i11, i2));
            AbstractC15872l.smaato(view, C6933l.isPro, new C14785l(this, i12, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    public final float tapsense() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = 0.0f;
        C5022l c5022l = this.subs;
        if (c5022l != null && (weakReference = this.f632class) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f632class.get();
            if (signatures() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float fPurchase = c5022l.purchase();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fPurchase <= 0.0f) {
                        f = 0.0f;
                    } else {
                        f = radius / fPurchase;
                    }
                } else {
                    f = 0.0f;
                }
                float fYandex = c5022l.f10262l.yandex.billing.yandex(c5022l.amazon());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fYandex > 0.0f) {
                        f2 = radius2 / fYandex;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final boolean m180throws(View view, float f) {
        if (this.f653volatile) {
            return true;
        }
        if (view.getTop() < this.f644package) {
            return false;
        }
        return Math.abs(((f * this.f635else) + ((float) view.getTop())) - ((float) this.f644package)) / ((float) Signature()) > 0.5f;
    }

    @Override // defpackage.AbstractC8012l
    public final void vip(View view, Parcelable parcelable) {
        C12629l c12629l = (C12629l) parcelable;
        int i = this.yandex;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.purchase = c12629l.f24855l;
            }
            if (i == -1 || (i & 2) == 2) {
                this.loadAd = c12629l.f24854l;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f647strictfp = c12629l.f24856l;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f653volatile = c12629l.f24853l;
            }
        }
        int i2 = c12629l.f24852l;
        if (i2 == 1 || i2 == 2) {
            this.f645private = 4;
        } else {
            this.f645private = i2;
        }
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final void m181volatile(boolean z) {
        WeakReference weakReference = this.f632class;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f648super != null) {
                    return;
                } else {
                    this.f648super = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f632class.get() && z) {
                    this.f648super.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f648super = null;
        }
    }

    public BottomSheetBehavior() {
        this.yandex = 0;
        this.loadAd = true;
        this.firebase = -1;
        this.smaato = -1;
        this.signatures = new C8662l(this);
        this.f652throws = 0.5f;
        this.f650synchronized = -1.0f;
        this.f642native = true;
        this.f645private = 4;
        this.f635else = 0.1f;
        this.f646static = new ArrayList();
        this.f643new = -1;
        this.f640import = new SparseIntArray();
        this.f629abstract = new C11707l(this, 0);
    }

    @Override // defpackage.AbstractC8012l
    public final void smaato(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
