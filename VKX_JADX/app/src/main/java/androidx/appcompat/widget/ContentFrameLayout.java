package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.C0791l;
import defpackage.C14858l;
import defpackage.C18434l;
import defpackage.C2932l;
import defpackage.C3316l;
import defpackage.InterfaceC12198l;
import defpackage.LayoutInflaterFactory2C14405l;
import defpackage.MenuC4984l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public TypedValue f172l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Rect f173l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public InterfaceC12198l f174l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public TypedValue f175l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public TypedValue f176l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public TypedValue f177l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public TypedValue f178l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public TypedValue f179l;

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f173l = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f177l == null) {
            this.f177l = new TypedValue();
        }
        return this.f177l;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f179l == null) {
            this.f179l = new TypedValue();
        }
        return this.f179l;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f172l == null) {
            this.f172l = new TypedValue();
        }
        return this.f172l;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f178l == null) {
            this.f178l = new TypedValue();
        }
        return this.f178l;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f176l == null) {
            this.f176l = new TypedValue();
        }
        return this.f176l;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f175l == null) {
            this.f175l = new TypedValue();
        }
        return this.f175l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC12198l interfaceC12198l = this.f174l;
        if (interfaceC12198l != null) {
            interfaceC12198l.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0791l c0791l;
        super.onDetachedFromWindow();
        InterfaceC12198l interfaceC12198l = this.f174l;
        if (interfaceC12198l != null) {
            LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = (LayoutInflaterFactory2C14405l) ((C3316l) interfaceC12198l).f7072l;
            ActionBarOverlayLayout actionBarOverlayLayout = layoutInflaterFactory2C14405l.f28187l;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.firebase();
                ActionMenuView actionMenuView = ((C18434l) actionBarOverlayLayout.f145l).yandex.f247l;
                if (actionMenuView != null && (c0791l = actionMenuView.f157l) != null) {
                    c0791l.mopub();
                    C14858l c14858l = c0791l.f2389l;
                    if (c14858l != null && c14858l.loadAd()) {
                        c14858l.subs.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C14405l.f28170l != null) {
                layoutInflaterFactory2C14405l.f28203l.getDecorView().removeCallbacks(layoutInflaterFactory2C14405l.f28214l);
                if (layoutInflaterFactory2C14405l.f28170l.isShowing()) {
                    try {
                        layoutInflaterFactory2C14405l.f28170l.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C14405l.f28170l = null;
            }
            C2932l c2932l = layoutInflaterFactory2C14405l.f28183l;
            if (c2932l != null) {
                c2932l.loadAd();
            }
            MenuC4984l menuC4984l = layoutInflaterFactory2C14405l.applovin(0).admob;
            if (menuC4984l != null) {
                menuC4984l.crashlytics(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int iMakeMeasureSpec2;
        int i3;
        int i4;
        float fraction;
        int i5;
        int i6;
        float fraction2;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Rect rect = this.f173l;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f178l : this.f172l;
            if (typedValue == null || (i7 = typedValue.type) == 0) {
                iMakeMeasureSpec = i;
                z = false;
            } else {
                if (i7 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i7 == 6) {
                        int i9 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i9, i9);
                    } else {
                        i8 = 0;
                    }
                    if (i8 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                    } else {
                        iMakeMeasureSpec = i;
                        z = false;
                    }
                }
                i8 = (int) fraction3;
                if (i8 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                    z = true;
                } else {
                    iMakeMeasureSpec = i;
                    z = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i2;
        } else {
            TypedValue typedValue2 = z3 ? this.f177l : this.f179l;
            if (typedValue2 == null || (i5 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i2;
            } else {
                if (i5 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i5 == 6) {
                        int i10 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i10, i10);
                    } else {
                        i6 = 0;
                    }
                    if (i6 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i2;
                    }
                }
                i6 = (int) fraction2;
                if (i6 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i2;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = z3 ? this.f175l : this.f176l;
            if (typedValue3 == null || (i3 = typedValue3.type) == 0) {
                z2 = false;
            } else {
                if (i3 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i3 == 6) {
                        int i11 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i11, i11);
                    } else {
                        i4 = 0;
                    }
                    if (i4 > 0) {
                        i4 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i4) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    } else {
                        z2 = false;
                    }
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                    i4 -= rect.left + rect.right;
                }
                if (measuredWidth < i4) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                } else {
                    z2 = false;
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(InterfaceC12198l interfaceC12198l) {
        this.f174l = interfaceC12198l;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }
}
