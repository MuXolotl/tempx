package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import defpackage.AbstractC0545l;
import defpackage.AbstractC11621l;
import defpackage.AbstractC12953l;
import defpackage.AbstractC13273l;
import defpackage.AbstractC14521l;
import defpackage.AbstractC15560l;
import defpackage.AbstractC15872l;
import defpackage.AbstractC4548l;
import defpackage.AbstractC4927l;
import defpackage.AbstractC7720l;
import defpackage.AbstractC8960l;
import defpackage.C12159l;
import defpackage.C12564l;
import defpackage.C15094l;
import defpackage.C16304l;
import defpackage.C4968l;
import defpackage.C8339l;
import defpackage.C8347l;
import defpackage.InterfaceC10159l;
import defpackage.InterfaceC15751l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialButton extends C8347l implements Checkable, InterfaceC15751l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final int[] f656l = {R.attr.state_checkable};

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final int[] f657l = {R.attr.state_checked};

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f658l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public ColorStateList f659l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Drawable f660l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f661l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f662l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public boolean f663l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final LinkedHashSet f664l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C12159l f665l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f666l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public String f667l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public PorterDuff.Mode f668l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f669l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public boolean f670l;

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(AbstractC12953l.adcel(context, attributeSet, i, ua.itaysonlab.vkx.R.style.Widget_MaterialComponents_Button), attributeSet, i);
        this.f664l = new LinkedHashSet();
        this.f670l = false;
        this.f663l = false;
        Context context2 = getContext();
        TypedArray typedArraySubs = AbstractC8960l.subs(context2, attributeSet, AbstractC4548l.remoteconfig, i, ua.itaysonlab.vkx.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f658l = typedArraySubs.getDimensionPixelSize(12, 0);
        int i2 = typedArraySubs.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f668l = AbstractC0545l.amazon(i2, mode);
        this.f659l = AbstractC4927l.subs(getContext(), typedArraySubs, 14);
        this.f660l = AbstractC4927l.firebase(getContext(), typedArraySubs, 10);
        this.f661l = typedArraySubs.getInteger(11, 1);
        this.f662l = typedArraySubs.getDimensionPixelSize(13, 0);
        C12159l c12159l = new C12159l(this, C12564l.loadAd(context2, attributeSet, i, ua.itaysonlab.vkx.R.style.Widget_MaterialComponents_Button).yandex());
        this.f665l = c12159l;
        c12159l.crashlytics = typedArraySubs.getDimensionPixelOffset(1, 0);
        c12159l.amazon = typedArraySubs.getDimensionPixelOffset(2, 0);
        c12159l.purchase = typedArraySubs.getDimensionPixelOffset(3, 0);
        c12159l.billing = typedArraySubs.getDimensionPixelOffset(4, 0);
        if (typedArraySubs.hasValue(8)) {
            int dimensionPixelSize = typedArraySubs.getDimensionPixelSize(8, -1);
            c12159l.mopub = dimensionPixelSize;
            float f = dimensionPixelSize;
            C4968l c4968lPurchase = c12159l.loadAd.purchase();
            c4968lPurchase.purchase = new C16304l(f);
            c4968lPurchase.billing = new C16304l(f);
            c4968lPurchase.mopub = new C16304l(f);
            c4968lPurchase.admob = new C16304l(f);
            c12159l.crashlytics(c4968lPurchase.yandex());
            c12159l.startapp = true;
        }
        c12159l.admob = typedArraySubs.getDimensionPixelSize(20, 0);
        c12159l.subs = AbstractC0545l.amazon(typedArraySubs.getInt(7, -1), mode);
        c12159l.isPro = AbstractC4927l.subs(getContext(), typedArraySubs, 6);
        c12159l.firebase = AbstractC4927l.subs(getContext(), typedArraySubs, 19);
        c12159l.smaato = AbstractC4927l.subs(getContext(), typedArraySubs, 16);
        c12159l.adcel = typedArraySubs.getBoolean(5, false);
        c12159l.tapsense = typedArraySubs.getDimensionPixelSize(9, 0);
        c12159l.ads = typedArraySubs.getBoolean(21, true);
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArraySubs.hasValue(0)) {
            c12159l.metrica = true;
            setSupportBackgroundTintList(c12159l.isPro);
            setSupportBackgroundTintMode(c12159l.subs);
        } else {
            c12159l.purchase();
        }
        setPaddingRelative(paddingStart + c12159l.crashlytics, paddingTop + c12159l.purchase, paddingEnd + c12159l.amazon, paddingBottom + c12159l.billing);
        typedArraySubs.recycle();
        setCompoundDrawablePadding(this.f658l);
        crashlytics(this.f660l != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public final void amazon(int i, int i2) {
        if (this.f660l == null || getLayout() == null) {
            return;
        }
        int i3 = this.f661l;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f669l = 0;
                if (i3 == 16) {
                    this.f666l = 0;
                    crashlytics(false);
                    return;
                }
                int intrinsicHeight = this.f662l;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f660l.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f658l) - getPaddingBottom()) / 2);
                if (this.f666l != iMax) {
                    this.f666l = iMax;
                    crashlytics(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f666l = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.f661l;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f669l = 0;
            crashlytics(false);
            return;
        }
        int intrinsicWidth = this.f662l;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f660l.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f658l) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f661l == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f669l != paddingEnd) {
            this.f669l = paddingEnd;
            crashlytics(false);
        }
    }

    public final void crashlytics(boolean z) {
        Drawable drawable = this.f660l;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f660l = drawableMutate;
            drawableMutate.setTintList(this.f659l);
            PorterDuff.Mode mode = this.f668l;
            if (mode != null) {
                this.f660l.setTintMode(mode);
            }
            int intrinsicWidth = this.f662l;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f660l.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f662l;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f660l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f660l;
            int i = this.f669l;
            int i2 = this.f666l;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f660l.setVisible(true, z);
        }
        if (z) {
            loadAd();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.f661l;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.f660l) || (((i3 == 3 || i3 == 4) && drawable5 != this.f660l) || ((i3 == 16 || i3 == 32) && drawable4 != this.f660l))) {
            loadAd();
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f667l)) {
            return this.f667l;
        }
        C12159l c12159l = this.f665l;
        return ((c12159l == null || !c12159l.adcel) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (yandex()) {
            return this.f665l.mopub;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f660l;
    }

    public int getIconGravity() {
        return this.f661l;
    }

    public int getIconPadding() {
        return this.f658l;
    }

    public int getIconSize() {
        return this.f662l;
    }

    public ColorStateList getIconTint() {
        return this.f659l;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f668l;
    }

    public int getInsetBottom() {
        return this.f665l.billing;
    }

    public int getInsetTop() {
        return this.f665l.purchase;
    }

    public ColorStateList getRippleColor() {
        if (yandex()) {
            return this.f665l.smaato;
        }
        return null;
    }

    public C12564l getShapeAppearanceModel() {
        if (yandex()) {
            return this.f665l.loadAd;
        }
        C8339l.smaato("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (yandex()) {
            return this.f665l.firebase;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (yandex()) {
            return this.f665l.admob;
        }
        return 0;
    }

    @Override // defpackage.C8347l
    public ColorStateList getSupportBackgroundTintList() {
        return yandex() ? this.f665l.isPro : super.getSupportBackgroundTintList();
    }

    @Override // defpackage.C8347l
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return yandex() ? this.f665l.subs : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f670l;
    }

    public final void loadAd() {
        int i = this.f661l;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.f660l, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.f660l, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.f660l, null, null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (yandex()) {
            AbstractC11621l.firebase(this, this.f665l.loadAd(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        C12159l c12159l = this.f665l;
        if (c12159l != null && c12159l.adcel) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f656l);
        }
        if (this.f670l) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f657l);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // defpackage.C8347l, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f670l);
    }

    @Override // defpackage.C8347l, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C12159l c12159l = this.f665l;
        accessibilityNodeInfo.setCheckable(c12159l != null && c12159l.adcel);
        accessibilityNodeInfo.setChecked(this.f670l);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.C8347l, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        amazon(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C15094l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C15094l c15094l = (C15094l) parcelable;
        super.onRestoreInstanceState(c15094l.f5855l);
        setChecked(c15094l.f29625l);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C15094l c15094l = new C15094l(super.onSaveInstanceState());
        c15094l.f29625l = this.f670l;
        return c15094l;
    }

    @Override // defpackage.C8347l, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        amazon(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f665l.ads) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f660l != null) {
            if (this.f660l.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f667l = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!yandex()) {
            super.setBackgroundColor(i);
            return;
        }
        C12159l c12159l = this.f665l;
        if (c12159l.loadAd(false) != null) {
            c12159l.loadAd(false).setTint(i);
        }
    }

    @Override // defpackage.C8347l, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!yandex()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C12159l c12159l = this.f665l;
        c12159l.metrica = true;
        MaterialButton materialButton = c12159l.yandex;
        materialButton.setSupportBackgroundTintList(c12159l.isPro);
        materialButton.setSupportBackgroundTintMode(c12159l.subs);
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.C8347l, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC13273l.loadAd(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (yandex()) {
            this.f665l.adcel = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        C12159l c12159l = this.f665l;
        if (c12159l == null || !c12159l.adcel || !isEnabled() || this.f670l == z) {
            return;
        }
        this.f670l = z;
        refreshDrawableState();
        getParent();
        if (this.f663l) {
            return;
        }
        this.f663l = true;
        Iterator it = this.f664l.iterator();
        if (it.hasNext()) {
            throw AbstractC15560l.adcel(it);
        }
        this.f663l = false;
    }

    public void setCornerRadius(int i) {
        if (yandex()) {
            C12159l c12159l = this.f665l;
            if (c12159l.startapp && c12159l.mopub == i) {
                return;
            }
            c12159l.mopub = i;
            c12159l.startapp = true;
            float f = i;
            C4968l c4968lPurchase = c12159l.loadAd.purchase();
            c4968lPurchase.purchase = new C16304l(f);
            c4968lPurchase.billing = new C16304l(f);
            c4968lPurchase.mopub = new C16304l(f);
            c4968lPurchase.admob = new C16304l(f);
            c12159l.crashlytics(c4968lPurchase.yandex());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (yandex()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (yandex()) {
            this.f665l.loadAd(false).subs(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f660l != drawable) {
            this.f660l = drawable;
            crashlytics(true);
            amazon(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f661l != i) {
            this.f661l = i;
            amazon(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f658l != i) {
            this.f658l = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC13273l.loadAd(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            C8339l.metrica("iconSize cannot be less than 0");
        } else if (this.f662l != i) {
            this.f662l = i;
            crashlytics(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f659l != colorStateList) {
            this.f659l = colorStateList;
            crashlytics(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f668l != mode) {
            this.f668l = mode;
            crashlytics(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC7720l.crashlytics(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C12159l c12159l = this.f665l;
        c12159l.amazon(c12159l.purchase, i);
    }

    public void setInsetTop(int i) {
        C12159l c12159l = this.f665l;
        c12159l.amazon(i, c12159l.billing);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (yandex()) {
            C12159l c12159l = this.f665l;
            MaterialButton materialButton = c12159l.yandex;
            if (c12159l.smaato != colorStateList) {
                c12159l.smaato = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC14521l.loadAd(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (yandex()) {
            setRippleColor(AbstractC7720l.crashlytics(getContext(), i));
        }
    }

    @Override // defpackage.InterfaceC15751l
    public void setShapeAppearanceModel(C12564l c12564l) {
        if (yandex()) {
            this.f665l.crashlytics(c12564l);
        } else {
            C8339l.smaato("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (yandex()) {
            C12159l c12159l = this.f665l;
            c12159l.vip = z;
            c12159l.billing();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (yandex()) {
            C12159l c12159l = this.f665l;
            if (c12159l.firebase != colorStateList) {
                c12159l.firebase = colorStateList;
                c12159l.billing();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (yandex()) {
            setStrokeColor(AbstractC7720l.crashlytics(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (yandex()) {
            C12159l c12159l = this.f665l;
            if (c12159l.admob != i) {
                c12159l.admob = i;
                c12159l.billing();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (yandex()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.C8347l
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!yandex()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C12159l c12159l = this.f665l;
        if (c12159l.isPro != colorStateList) {
            c12159l.isPro = colorStateList;
            if (c12159l.loadAd(false) != null) {
                c12159l.loadAd(false).setTintList(c12159l.isPro);
            }
        }
    }

    @Override // defpackage.C8347l
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!yandex()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C12159l c12159l = this.f665l;
        if (c12159l.subs != mode) {
            c12159l.subs = mode;
            if (c12159l.loadAd(false) == null || c12159l.subs == null) {
                return;
            }
            c12159l.loadAd(false).setTintMode(c12159l.subs);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        amazon(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f665l.ads = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f670l);
    }

    public final boolean yandex() {
        C12159l c12159l = this.f665l;
        return (c12159l == null || c12159l.metrica) ? false : true;
    }

    public void setOnPressedChangeListenerInternal(InterfaceC10159l interfaceC10159l) {
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ua.itaysonlab.vkx.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }
}
