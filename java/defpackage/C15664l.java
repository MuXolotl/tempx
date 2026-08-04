package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lْٕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15664l extends C5367l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Rect f30614l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f30615l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public ColorStateList f30616l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C2956l f30617l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public ColorStateList f30618l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final float f30619l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final AccessibilityManager f30620l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f30621l;

    public C15664l(Context context, AttributeSet attributeSet) {
        super(AbstractC12953l.adcel(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        this.f30614l = new Rect();
        Context context2 = getContext();
        TypedArray typedArraySubs = AbstractC8960l.subs(context2, attributeSet, AbstractC4548l.smaato, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArraySubs.hasValue(0) && typedArraySubs.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f30615l = typedArraySubs.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f30619l = typedArraySubs.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArraySubs.hasValue(2)) {
            this.f30616l = ColorStateList.valueOf(typedArraySubs.getColor(2, 0));
        }
        this.f30621l = typedArraySubs.getColor(4, 0);
        this.f30618l = AbstractC4927l.subs(context2, typedArraySubs, 5);
        this.f30620l = (AccessibilityManager) context2.getSystemService("accessibility");
        C2956l c2956l = new C2956l(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f30617l = c2956l;
        c2956l.f6430l = true;
        C15863l c15863l = c2956l.f6435l;
        c15863l.setFocusable(true);
        c2956l.f6432l = this;
        c15863l.setInputMethodMode(2);
        c2956l.adcel(getAdapter());
        c2956l.f6424l = new C1785l(1, this);
        if (typedArraySubs.hasValue(6)) {
            setSimpleItems(typedArraySubs.getResourceId(6, 0));
        }
        typedArraySubs.recycle();
    }

    public static void yandex(C15664l c15664l, Object obj) {
        c15664l.setText(c15664l.convertSelectionToString(obj), false);
    }

    public final boolean crashlytics() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f30620l;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (crashlytics()) {
            this.f30617l.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f30616l;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutLoadAd = loadAd();
        return (textInputLayoutLoadAd == null || !textInputLayoutLoadAd.f718l) ? super.getHint() : textInputLayoutLoadAd.getHint();
    }

    public float getPopupElevation() {
        return this.f30619l;
    }

    public int getSimpleItemSelectedColor() {
        return this.f30621l;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f30618l;
    }

    public final TextInputLayout loadAd() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutLoadAd = loadAd();
        if (textInputLayoutLoadAd != null && textInputLayoutLoadAd.f718l && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30617l.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutLoadAd = loadAd();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutLoadAd != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C2956l c2956l = this.f30617l;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c2956l.f6435l.isShowing() ? -1 : c2956l.f6419l.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutLoadAd);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = c2956l.f6435l.getBackground();
                if (background != null) {
                    Rect rect = this.f30614l;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutLoadAd.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (crashlytics()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f30617l.adcel(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C2956l c2956l = this.f30617l;
        if (c2956l != null) {
            c2956l.firebase(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f30616l = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C5022l) {
            ((C5022l) dropDownBackground).isPro(this.f30616l);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f30617l.f6429l = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutLoadAd = loadAd();
        if (textInputLayoutLoadAd != null) {
            textInputLayoutLoadAd.subscription();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f30621l = i;
        if (getAdapter() instanceof C15883l) {
            ((C15883l) getAdapter()).yandex();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f30618l = colorStateList;
        if (getAdapter() instanceof C15883l) {
            ((C15883l) getAdapter()).yandex();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C15883l(this, getContext(), this.f30615l, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (crashlytics()) {
            this.f30617l.mopub();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }
}
