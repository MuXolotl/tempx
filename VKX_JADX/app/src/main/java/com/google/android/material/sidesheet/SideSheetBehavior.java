package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.AbstractC15560l;
import defpackage.AbstractC15872l;
import defpackage.AbstractC2697l;
import defpackage.AbstractC4548l;
import defpackage.AbstractC4927l;
import defpackage.AbstractC8012l;
import defpackage.C0213l;
import defpackage.C0516l;
import defpackage.C0637l;
import defpackage.C11707l;
import defpackage.C12564l;
import defpackage.C16304l;
import defpackage.C18725l;
import defpackage.C3084l;
import defpackage.C4968l;
import defpackage.C5022l;
import defpackage.C6268l;
import defpackage.C6933l;
import defpackage.C8339l;
import defpackage.C8662l;
import defpackage.C8677l;
import defpackage.C8936l;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends AbstractC8012l {
    public final LinkedHashSet Signature;
    public WeakReference adcel;
    public int admob;
    public final int ads;
    public final C12564l amazon;
    public final float billing;
    public final ColorStateList crashlytics;
    public final float firebase;
    public boolean isPro;
    public final C11707l license;
    public final C5022l loadAd;
    public int metrica;
    public final boolean mopub;
    public final C8662l purchase;
    public int remoteconfig;
    public int smaato;
    public WeakReference startapp;
    public C0213l subs;
    public VelocityTracker subscription;
    public int tapsense;
    public int vip;
    public AbstractC2697l yandex;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.purchase = new C8662l(this);
        this.mopub = true;
        this.admob = 5;
        this.firebase = 0.1f;
        this.ads = -1;
        this.Signature = new LinkedHashSet();
        this.license = new C11707l(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4548l.pro);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.crashlytics = AbstractC4927l.subs(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.amazon = C12564l.loadAd(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).yandex();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.ads = resourceId;
            WeakReference weakReference = this.adcel;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.adcel = null;
            WeakReference weakReference2 = this.startapp;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = AbstractC15872l.yandex;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        C12564l c12564l = this.amazon;
        if (c12564l != null) {
            C5022l c5022l = new C5022l(c12564l);
            this.loadAd = c5022l;
            c5022l.mopub(context);
            ColorStateList colorStateList = this.crashlytics;
            if (colorStateList != null) {
                this.loadAd.isPro(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.loadAd.setTint(typedValue.data);
            }
        }
        this.billing = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.mopub = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1.metrica(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        subscription(2);
        r2.purchase.loadAd(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Signature(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L17
            r0 = 5
            if (r4 != r0) goto Ld
            lؔ٘ۛ r0 = r2.yandex
            int r0 = r0.purchase()
            goto L1d
        Ld:
            java.lang.String r2 = "Invalid state to get outer edge offset: "
            java.lang.String r2 = defpackage.AbstractC0653l.vip(r4, r2)
            defpackage.C8339l.metrica(r2)
            return
        L17:
            lؔ٘ۛ r0 = r2.yandex
            int r0 = r0.amazon()
        L1d:
            lٍؑ٘ r1 = r2.subs
            if (r1 == 0) goto L55
            if (r5 == 0) goto L2e
            int r3 = r3.getTop()
            boolean r3 = r1.metrica(r0, r3)
            if (r3 == 0) goto L55
            goto L4b
        L2e:
            int r5 = r3.getTop()
            r1.ads = r3
            r3 = -1
            r1.crashlytics = r3
            r3 = 0
            boolean r3 = r1.admob(r0, r5, r3, r3)
            if (r3 != 0) goto L49
            int r5 = r1.yandex
            if (r5 != 0) goto L49
            android.view.View r5 = r1.ads
            if (r5 == 0) goto L49
            r5 = 0
            r1.ads = r5
        L49:
            if (r3 == 0) goto L55
        L4b:
            r3 = 2
            r2.subscription(r3)
            lٌٌَ r2 = r2.purchase
            r2.loadAd(r4)
            return
        L55:
            r2.subscription(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.Signature(android.view.View, int, boolean):void");
    }

    @Override // defpackage.AbstractC8012l
    public final boolean admob(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int iAdmob;
        int i2;
        View viewFindViewById;
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        int i3 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.startapp;
        C5022l c5022l = this.loadAd;
        int i4 = 0;
        if (weakReference == null) {
            this.startapp = new WeakReference(view);
            new C0516l(view);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (c5022l != null) {
                view.setBackground(c5022l);
                float elevation = this.billing;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c5022l.subs(elevation);
            } else {
                ColorStateList colorStateList = this.crashlytics;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i5 = this.admob == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            license();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AbstractC15872l.purchase(view) == null) {
                AbstractC15872l.metrica(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((C0637l) view.getLayoutParams()).crashlytics, i) == 3 ? 1 : 0;
        AbstractC2697l abstractC2697l = this.yandex;
        if (abstractC2697l == null || abstractC2697l.isPro() != i6) {
            C0637l c0637l = null;
            C12564l c12564l = this.amazon;
            if (i6 == 0) {
                this.yandex = new C6268l(this, i3);
                if (c12564l != null) {
                    WeakReference weakReference2 = this.startapp;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof C0637l)) {
                        c0637l = (C0637l) view3.getLayoutParams();
                    }
                    if (c0637l == null || ((ViewGroup.MarginLayoutParams) c0637l).rightMargin <= 0) {
                        C4968l c4968lPurchase = c12564l.purchase();
                        c4968lPurchase.billing = new C16304l(0.0f);
                        c4968lPurchase.mopub = new C16304l(0.0f);
                        C12564l c12564lYandex = c4968lPurchase.yandex();
                        if (c5022l != null) {
                            c5022l.setShapeAppearanceModel(c12564lYandex);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    C8339l.metrica(AbstractC15560l.tapsense("Invalid sheet edge position value: ", i6, ". Must be 0 or 1."));
                    return false;
                }
                this.yandex = new C6268l(this, i4);
                if (c12564l != null) {
                    WeakReference weakReference3 = this.startapp;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof C0637l)) {
                        c0637l = (C0637l) view2.getLayoutParams();
                    }
                    if (c0637l == null || ((ViewGroup.MarginLayoutParams) c0637l).leftMargin <= 0) {
                        C4968l c4968lPurchase2 = c12564l.purchase();
                        c4968lPurchase2.purchase = new C16304l(0.0f);
                        c4968lPurchase2.admob = new C16304l(0.0f);
                        C12564l c12564lYandex2 = c4968lPurchase2.yandex();
                        if (c5022l != null) {
                            c5022l.setShapeAppearanceModel(c12564lYandex2);
                        }
                    }
                }
            }
        }
        if (this.subs == null) {
            this.subs = new C0213l(coordinatorLayout.getContext(), coordinatorLayout, this.license);
        }
        int iAdmob2 = this.yandex.admob(view);
        coordinatorLayout.adcel(view, i);
        this.remoteconfig = coordinatorLayout.getWidth();
        this.vip = this.yandex.subs(coordinatorLayout);
        this.smaato = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.metrica = marginLayoutParams != null ? this.yandex.loadAd(marginLayoutParams) : 0;
        int i7 = this.admob;
        if (i7 == 1 || i7 == 2) {
            iAdmob = iAdmob2 - this.yandex.admob(view);
        } else if (i7 == 3) {
            iAdmob = 0;
        } else {
            if (i7 != 5) {
                C8936l.admob(this.admob, "Unexpected value: ");
                return false;
            }
            iAdmob = this.yandex.purchase();
        }
        view.offsetLeftAndRight(iAdmob);
        if (this.adcel == null && (i2 = this.ads) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.adcel = new WeakReference(viewFindViewById);
        }
        Iterator it = this.Signature.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                C18725l.loadAd();
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC8012l
    public final boolean ads(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.admob == 1 && actionMasked == 0) {
            return true;
        }
        if (tapsense()) {
            this.subs.isPro(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.subscription) != null) {
            velocityTracker.recycle();
            this.subscription = null;
        }
        if (this.subscription == null) {
            this.subscription = VelocityTracker.obtain();
        }
        this.subscription.addMovement(motionEvent);
        if (tapsense() && actionMasked == 2 && !this.isPro && tapsense()) {
            float fAbs = Math.abs(this.tapsense - motionEvent.getX());
            C0213l c0213l = this.subs;
            if (fAbs > c0213l.loadAd) {
                c0213l.loadAd(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.isPro;
    }

    @Override // defpackage.AbstractC8012l
    public final void billing() {
        this.startapp = null;
        this.subs = null;
    }

    @Override // defpackage.AbstractC8012l
    public final void crashlytics(C0637l c0637l) {
        this.startapp = null;
        this.subs = null;
    }

    public final void license() {
        View view;
        WeakReference weakReference = this.startapp;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC15872l.firebase(view, 262144);
        AbstractC15872l.admob(view, 0);
        AbstractC15872l.firebase(view, 1048576);
        AbstractC15872l.admob(view, 0);
        int i = 6;
        int i2 = 5;
        if (this.admob != 5) {
            AbstractC15872l.smaato(view, C6933l.smaato, new C8677l(this, i2, i));
        }
        int i3 = 3;
        if (this.admob != 3) {
            AbstractC15872l.smaato(view, C6933l.isPro, new C8677l(this, i3, i));
        }
    }

    @Override // defpackage.AbstractC8012l
    public final Parcelable metrica(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C3084l(this);
    }

    @Override // defpackage.AbstractC8012l
    public final boolean mopub(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C0213l c0213l;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && AbstractC15872l.purchase(view) == null) || !this.mopub) {
            this.isPro = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.subscription) != null) {
            velocityTracker.recycle();
            this.subscription = null;
        }
        if (this.subscription == null) {
            this.subscription = VelocityTracker.obtain();
        }
        this.subscription.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.tapsense = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.isPro) {
            this.isPro = false;
            return false;
        }
        return (this.isPro || (c0213l = this.subs) == null || !c0213l.startapp(motionEvent)) ? false : true;
    }

    @Override // defpackage.AbstractC8012l
    public final boolean subs(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    public final void subscription(int i) {
        View view;
        if (this.admob == i) {
            return;
        }
        this.admob = i;
        WeakReference weakReference = this.startapp;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.admob == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.Signature.iterator();
        if (it.hasNext()) {
            throw AbstractC15560l.adcel(it);
        }
        license();
    }

    public final boolean tapsense() {
        if (this.subs != null) {
            return this.mopub || this.admob == 1;
        }
        return false;
    }

    @Override // defpackage.AbstractC8012l
    public final void vip(View view, Parcelable parcelable) {
        int i = ((C3084l) parcelable).f6619l;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.admob = i;
    }

    public SideSheetBehavior() {
        this.purchase = new C8662l(this);
        this.mopub = true;
        this.admob = 5;
        this.firebase = 0.1f;
        this.ads = -1;
        this.Signature = new LinkedHashSet();
        this.license = new C11707l(this, 1);
    }
}
