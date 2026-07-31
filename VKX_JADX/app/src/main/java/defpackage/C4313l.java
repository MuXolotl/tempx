package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: renamed from: lَؖۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4313l extends Spinner {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final int[] f8845l = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C2997l f8846l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f8847l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final Rect f8848l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Context f8849l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C1080l f8850l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f8851l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public SpinnerAdapter f8852l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final InterfaceC17192l f8853l;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public C4313l(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, ua.itaysonlab.vkx.R.attr.spinnerStyle);
        this.f8848l = new Rect();
        AbstractC1035l.yandex(this, getContext());
        int[] iArr = AbstractC14657l.Signature;
        C12418l c12418lPro = C12418l.pro(context, attributeSet, iArr, ua.itaysonlab.vkx.R.attr.spinnerStyle);
        TypedArray typedArray = (TypedArray) c12418lPro.f24518l;
        this.f8850l = new C1080l(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f8849l = new C8288l(context, resourceId);
        } else {
            this.f8849l = context;
        }
        int i = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8845l, ua.itaysonlab.vkx.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Throwable th) {
                    th = th;
                    typedArray2 = typedArrayObtainStyledAttributes;
                    if (typedArray2 != null) {
                        typedArray2.recycle();
                    }
                    throw th;
                }
            } catch (Exception e) {
                e = e;
                Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                if (typedArrayObtainStyledAttributes != null) {
                }
                if (i != 0) {
                    DialogInterfaceOnClickListenerC4713l dialogInterfaceOnClickListenerC4713l = new DialogInterfaceOnClickListenerC4713l(this);
                    this.f8853l = dialogInterfaceOnClickListenerC4713l;
                    dialogInterfaceOnClickListenerC4713l.f9571l = typedArray.getString(2);
                } else if (i == 1) {
                    C11122l c11122l = new C11122l(this, this.f8849l, attributeSet);
                    C12418l c12418lPro2 = C12418l.pro(this.f8849l, attributeSet, iArr, ua.itaysonlab.vkx.R.attr.spinnerStyle);
                    this.f8847l = ((TypedArray) c12418lPro2.f24518l).getLayoutDimension(3, -2);
                    c11122l.firebase(c12418lPro2.ads(1));
                    c11122l.f22336l = typedArray.getString(2);
                    c12418lPro2.advert();
                    this.f8853l = c11122l;
                    this.f8846l = new C2997l(this, this, c11122l);
                }
                textArray = typedArray.getTextArray(0);
                if (textArray != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                    arrayAdapter.setDropDownViewResource(ua.itaysonlab.vkx.R.layout.support_simple_spinner_dropdown_item);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                c12418lPro.advert();
                this.f8851l = true;
                spinnerAdapter = this.f8852l;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.f8852l = null;
                }
                this.f8850l.isVip(attributeSet, ua.itaysonlab.vkx.R.attr.spinnerStyle);
            }
        } catch (Exception e2) {
            e = e2;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            DialogInterfaceOnClickListenerC4713l dialogInterfaceOnClickListenerC4713l2 = new DialogInterfaceOnClickListenerC4713l(this);
            this.f8853l = dialogInterfaceOnClickListenerC4713l2;
            dialogInterfaceOnClickListenerC4713l2.f9571l = typedArray.getString(2);
        } else if (i == 1) {
            C11122l c11122l2 = new C11122l(this, this.f8849l, attributeSet);
            C12418l c12418lPro3 = C12418l.pro(this.f8849l, attributeSet, iArr, ua.itaysonlab.vkx.R.attr.spinnerStyle);
            this.f8847l = ((TypedArray) c12418lPro3.f24518l).getLayoutDimension(3, -2);
            c11122l2.firebase(c12418lPro3.ads(1));
            c11122l2.f22336l = typedArray.getString(2);
            c12418lPro3.advert();
            this.f8853l = c11122l2;
            this.f8846l = new C2997l(this, this, c11122l2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(ua.itaysonlab.vkx.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        c12418lPro.advert();
        this.f8851l = true;
        spinnerAdapter = this.f8852l;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f8852l = null;
        }
        this.f8850l.isVip(attributeSet, ua.itaysonlab.vkx.R.attr.spinnerStyle);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1080l c1080l = this.f8850l;
        if (c1080l != null) {
            c1080l.purchase();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC17192l interfaceC17192l = this.f8853l;
        return interfaceC17192l != null ? interfaceC17192l.crashlytics() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC17192l interfaceC17192l = this.f8853l;
        return interfaceC17192l != null ? interfaceC17192l.startapp() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f8853l != null ? this.f8847l : super.getDropDownWidth();
    }

    public final InterfaceC17192l getInternalPopup() {
        return this.f8853l;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC17192l interfaceC17192l = this.f8853l;
        return interfaceC17192l != null ? interfaceC17192l.admob() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f8849l;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC17192l interfaceC17192l = this.f8853l;
        return interfaceC17192l != null ? interfaceC17192l.purchase() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1080l c1080l = this.f8850l;
        if (c1080l != null) {
            return c1080l.pro();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1080l c1080l = this.f8850l;
        if (c1080l != null) {
            return c1080l.advert();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC17192l interfaceC17192l = this.f8853l;
        if (interfaceC17192l == null || !interfaceC17192l.loadAd()) {
            return;
        }
        interfaceC17192l.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f8853l == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), yandex(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C3204l c3204l = (C3204l) parcelable;
        super.onRestoreInstanceState(c3204l.getSuperState());
        if (!c3204l.f6863l || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1294l(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C3204l c3204l = new C3204l(super.onSaveInstanceState());
        InterfaceC17192l interfaceC17192l = this.f8853l;
        c3204l.f6863l = interfaceC17192l != null && interfaceC17192l.loadAd();
        return c3204l;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C2997l c2997l = this.f8846l;
        if (c2997l == null || !c2997l.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC17192l interfaceC17192l = this.f8853l;
        if (interfaceC17192l == null) {
            return super.performClick();
        }
        if (interfaceC17192l.loadAd()) {
            return true;
        }
        interfaceC17192l.metrica(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f8851l) {
            this.f8852l = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC17192l interfaceC17192l = this.f8853l;
        if (interfaceC17192l != null) {
            Context context = this.f8849l;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C4379l c4379l = new C4379l();
            c4379l.yandex = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c4379l.loadAd = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC7205l.yandex((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC17192l.adcel(c4379l);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1080l c1080l = this.f8850l;
        if (c1080l != null) {
            c1080l.signatures();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1080l c1080l = this.f8850l;
        if (c1080l != null) {
            c1080l.premium(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC17192l interfaceC17192l = this.f8853l;
        if (interfaceC17192l == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC17192l.remoteconfig(i);
            interfaceC17192l.amazon(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC17192l interfaceC17192l = this.f8853l;
        if (interfaceC17192l != null) {
            interfaceC17192l.smaato(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f8853l != null) {
            this.f8847l = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC17192l interfaceC17192l = this.f8853l;
        if (interfaceC17192l != null) {
            interfaceC17192l.firebase(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AbstractC13273l.loadAd(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC17192l interfaceC17192l = this.f8853l;
        if (interfaceC17192l != null) {
            interfaceC17192l.subs(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1080l c1080l = this.f8850l;
        if (c1080l != null) {
            c1080l.m791else(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1080l c1080l = this.f8850l;
        if (c1080l != null) {
            c1080l.m786case(mode);
        }
    }

    public final int yandex(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f8848l;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }
}
