package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC15958l;
import defpackage.AbstractC4614l;
import defpackage.AbstractC5020l;
import defpackage.C0791l;
import defpackage.C11353l;
import defpackage.C14858l;
import defpackage.C15053l;
import defpackage.C16543l;
import defpackage.C17334l;
import defpackage.C17858l;
import defpackage.C6186l;
import defpackage.C8666l;
import defpackage.InterfaceC16405l;
import defpackage.InterfaceC6784l;
import defpackage.InterfaceC8072l;
import defpackage.InterfaceC9863l;
import defpackage.MenuC4984l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC4614l implements InterfaceC9863l, InterfaceC16405l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public boolean f155l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C15053l f156l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C0791l f157l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public MenuC4984l f158l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final int f159l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f160l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public Context f161l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final int f162l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public InterfaceC6784l f163l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public int f164l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public int f165l;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f159l = (int) (56.0f * f);
        this.f162l = (int) (f * 4.0f);
        this.f161l = context;
        this.f164l = 0;
    }

    public static C6186l isPro(ViewGroup.LayoutParams layoutParams) {
        C6186l c6186l;
        if (layoutParams == null) {
            return subs();
        }
        if (layoutParams instanceof C6186l) {
            C6186l c6186l2 = (C6186l) layoutParams;
            c6186l = new C6186l(c6186l2);
            c6186l.yandex = c6186l2.yandex;
        } else {
            c6186l = new C6186l(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c6186l).gravity <= 0) {
            ((LinearLayout.LayoutParams) c6186l).gravity = 16;
        }
        return c6186l;
    }

    public static C6186l subs() {
        C6186l c6186l = new C6186l(-2, -2);
        c6186l.yandex = false;
        ((LinearLayout.LayoutParams) c6186l).gravity = 16;
        return c6186l;
    }

    @Override // defpackage.AbstractC4614l
    /* JADX INFO: renamed from: billing */
    public final C8666l generateLayoutParams(AttributeSet attributeSet) {
        return new C6186l(getContext(), attributeSet);
    }

    @Override // defpackage.AbstractC4614l, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C6186l;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final boolean firebase(int i) {
        boolean zLoadAd = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC8072l)) {
            zLoadAd = ((InterfaceC8072l) childAt).loadAd();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC8072l)) ? zLoadAd : ((InterfaceC8072l) childAt2).crashlytics() | zLoadAd;
    }

    @Override // defpackage.AbstractC4614l, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return subs();
    }

    @Override // defpackage.AbstractC4614l, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C6186l(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f158l == null) {
            Context context = getContext();
            MenuC4984l menuC4984l = new MenuC4984l(context);
            this.f158l = menuC4984l;
            menuC4984l.f10202l = new C16543l(2, this);
            C0791l c0791l = new C0791l(context);
            this.f157l = c0791l;
            c0791l.f2400l = true;
            c0791l.f2385l = true;
            c0791l.f2398l = new C17334l(23);
            this.f158l.loadAd(c0791l, this.f161l);
            C0791l c0791l2 = this.f157l;
            c0791l2.f2390l = this;
            this.f158l = c0791l2.f2386l;
        }
        return this.f158l;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0791l c0791l = this.f157l;
        C11353l c11353l = c0791l.f2401l;
        if (c11353l != null) {
            return c11353l.getDrawable();
        }
        if (c0791l.f2403l) {
            return c0791l.f2396l;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f164l;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // defpackage.InterfaceC16405l
    public final void loadAd(MenuC4984l menuC4984l) {
        this.f158l = menuC4984l;
    }

    @Override // defpackage.AbstractC4614l
    /* JADX INFO: renamed from: mopub */
    public final /* bridge */ /* synthetic */ C8666l generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return isPro(layoutParams);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0791l c0791l = this.f157l;
        if (c0791l != null) {
            c0791l.subs();
            if (this.f157l.isPro()) {
                this.f157l.mopub();
                this.f157l.smaato();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0791l c0791l = this.f157l;
        if (c0791l != null) {
            c0791l.mopub();
            C14858l c14858l = c0791l.f2389l;
            if (c14858l == null || !c14858l.loadAd()) {
                return;
            }
            c14858l.subs.dismiss();
        }
    }

    @Override // defpackage.AbstractC4614l, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f155l) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = AbstractC15958l.yandex;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C6186l c6186l = (C6186l) childAt.getLayoutParams();
                if (c6186l.yandex) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (firebase(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c6186l).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c6186l).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c6186l).leftMargin) + ((LinearLayout.LayoutParams) c6186l).rightMargin;
                    firebase(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                C6186l c6186l2 = (C6186l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c6186l2.yandex) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c6186l2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c6186l2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C6186l c6186l3 = (C6186l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c6186l3.yandex) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c6186l3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = AbstractC5020l.applovin(measuredWidth4, ((LinearLayout.LayoutParams) c6186l3).rightMargin, iMax, i18);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.AbstractC4614l, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        MenuC4984l menuC4984l;
        boolean z = this.f155l;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f155l = z2;
        if (z != z2) {
            this.f165l = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f155l && (menuC4984l = this.f158l) != null && size != this.f165l) {
            this.f165l = size;
            menuC4984l.startapp(true);
        }
        int childCount = getChildCount();
        if (!this.f155l || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                C6186l c6186l = (C6186l) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) c6186l).rightMargin = 0;
                ((LinearLayout.LayoutParams) c6186l).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.f159l;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.f162l;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C6186l c6186l2 = (C6186l) childAt.getLayoutParams();
                c6186l2.billing = false;
                c6186l2.crashlytics = 0;
                c6186l2.loadAd = 0;
                c6186l2.amazon = false;
                ((LinearLayout.LayoutParams) c6186l2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c6186l2).rightMargin = 0;
                c6186l2.purchase = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = c6186l2.yandex ? 1 : i10;
                C6186l c6186l3 = (C6186l) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, RecyclerView.UNDEFINED_DURATION), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                c6186l3.amazon = !c6186l3.yandex && z6;
                c6186l3.loadAd = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (c6186l2.amazon) {
                    i15++;
                }
                if (c6186l2.yandex) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (true) {
            if (i15 <= 0 || i23 <= 0) {
                i4 = iMax;
                break;
            }
            int i24 = Alert.DURATION_SHOW_INDEFINITELY;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                C6186l c6186l4 = (C6186l) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (c6186l4.amazon) {
                    int i28 = c6186l4.loadAd;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                C6186l c6186l5 = (C6186l) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && c6186l5.purchase) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c6186l5.loadAd += r11;
                    c6186l5.billing = r11;
                    i23--;
                } else if (c6186l5.loadAd == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((C6186l) getChildAt(0).getLayoutParams()).purchase) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((C6186l) getChildAt(i31).getLayoutParams()).purchase) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    C6186l c6186l6 = (C6186l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c6186l6.crashlytics = i32;
                        c6186l6.billing = true;
                        if (i33 == 0 && !c6186l6.purchase) {
                            ((LinearLayout.LayoutParams) c6186l6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (c6186l6.yandex) {
                        c6186l6.crashlytics = i32;
                        c6186l6.billing = true;
                        ((LinearLayout.LayoutParams) c6186l6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) c6186l6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c6186l6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                C6186l c6186l7 = (C6186l) childAt4.getLayoutParams();
                if (c6186l7.billing) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c6186l7.loadAd * i22) + c6186l7.crashlytics, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    @Override // defpackage.AbstractC4614l
    /* JADX INFO: renamed from: purchase */
    public final /* bridge */ /* synthetic */ C8666l generateDefaultLayoutParams() {
        return subs();
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f157l.f2395l = z;
    }

    public void setOnMenuItemClickListener(InterfaceC6784l interfaceC6784l) {
        this.f163l = interfaceC6784l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0791l c0791l = this.f157l;
        C11353l c11353l = c0791l.f2401l;
        if (c11353l != null) {
            c11353l.setImageDrawable(drawable);
        } else {
            c0791l.f2403l = true;
            c0791l.f2396l = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.f160l = z;
    }

    public void setPopupTheme(int i) {
        if (this.f164l != i) {
            this.f164l = i;
            if (i == 0) {
                this.f161l = getContext();
            } else {
                this.f161l = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0791l c0791l) {
        this.f157l = c0791l;
        c0791l.f2390l = this;
        this.f158l = c0791l.f2386l;
    }

    @Override // defpackage.InterfaceC9863l
    public final boolean yandex(C17858l c17858l) {
        return this.f158l.adcel(c17858l, null, 0);
    }

    @Override // defpackage.AbstractC4614l, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return isPro(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
