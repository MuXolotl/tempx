package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import defpackage.AbstractC11621l;
import defpackage.AbstractC12953l;
import defpackage.AbstractC13273l;
import defpackage.AbstractC14521l;
import defpackage.AbstractC2568l;
import defpackage.AbstractC4548l;
import defpackage.AbstractC4927l;
import defpackage.AbstractC6689l;
import defpackage.AbstractC7720l;
import defpackage.AbstractC8960l;
import defpackage.C12564l;
import defpackage.C16304l;
import defpackage.C18309l;
import defpackage.C2468l;
import defpackage.C4968l;
import defpackage.C5022l;
import defpackage.InterfaceC12089l;
import defpackage.InterfaceC15751l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialCardView extends AbstractC2568l implements Checkable, InterfaceC15751l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C2468l f674l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f675l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final boolean f676l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public boolean f677l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final int[] f672l = {R.attr.state_checkable};

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final int[] f671l = {R.attr.state_checked};

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final int[] f673l = {ua.itaysonlab.vkx.R.attr.state_dragged};

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(AbstractC12953l.adcel(context, attributeSet, i, ua.itaysonlab.vkx.R.style.Widget_MaterialComponents_CardView), attributeSet, i);
        this.f675l = false;
        this.f677l = false;
        this.f676l = true;
        TypedArray typedArraySubs = AbstractC8960l.subs(getContext(), attributeSet, AbstractC4548l.vip, i, ua.itaysonlab.vkx.R.style.Widget_MaterialComponents_CardView, new int[0]);
        C2468l c2468l = new C2468l(this, attributeSet, i);
        this.f674l = c2468l;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        C5022l c5022l = c2468l.crashlytics;
        c5022l.isPro(cardBackgroundColor);
        c2468l.loadAd.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c2468l.smaato();
        MaterialCardView materialCardView = c2468l.yandex;
        ColorStateList colorStateListSubs = AbstractC4927l.subs(materialCardView.getContext(), typedArraySubs, 11);
        c2468l.vip = colorStateListSubs;
        if (colorStateListSubs == null) {
            c2468l.vip = ColorStateList.valueOf(-1);
        }
        c2468l.admob = typedArraySubs.getDimensionPixelSize(12, 0);
        boolean z = typedArraySubs.getBoolean(0, false);
        c2468l.subscription = z;
        materialCardView.setLongClickable(z);
        c2468l.smaato = AbstractC4927l.subs(materialCardView.getContext(), typedArraySubs, 6);
        c2468l.mopub(AbstractC4927l.firebase(materialCardView.getContext(), typedArraySubs, 2));
        c2468l.billing = typedArraySubs.getDimensionPixelSize(5, 0);
        c2468l.purchase = typedArraySubs.getDimensionPixelSize(4, 0);
        c2468l.mopub = typedArraySubs.getInteger(3, 8388661);
        ColorStateList colorStateListSubs2 = AbstractC4927l.subs(materialCardView.getContext(), typedArraySubs, 7);
        c2468l.firebase = colorStateListSubs2;
        if (colorStateListSubs2 == null) {
            c2468l.firebase = ColorStateList.valueOf(AbstractC6689l.metrica(materialCardView, ua.itaysonlab.vkx.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListSubs3 = AbstractC4927l.subs(materialCardView.getContext(), typedArraySubs, 1);
        colorStateListSubs3 = colorStateListSubs3 == null ? ColorStateList.valueOf(0) : colorStateListSubs3;
        C5022l c5022l2 = c2468l.amazon;
        c5022l2.isPro(colorStateListSubs3);
        int[] iArr = AbstractC14521l.yandex;
        RippleDrawable rippleDrawable = c2468l.metrica;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(c2468l.firebase);
        }
        c5022l.subs(materialCardView.getCardElevation());
        float f = c2468l.admob;
        ColorStateList colorStateList = c2468l.vip;
        c5022l2.f10262l.isPro = f;
        c5022l2.invalidateSelf();
        C18309l c18309l = c5022l2.f10262l;
        if (c18309l.amazon != colorStateList) {
            c18309l.amazon = colorStateList;
            c5022l2.onStateChange(c5022l2.getState());
        }
        materialCardView.setBackgroundInternal(c2468l.amazon(c5022l));
        Drawable drawableCrashlytics = c2468l.isPro() ? c2468l.crashlytics() : c5022l2;
        c2468l.subs = drawableCrashlytics;
        materialCardView.setForeground(c2468l.amazon(drawableCrashlytics));
        typedArraySubs.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f674l.crashlytics.getBounds());
        return rectF;
    }

    @Override // defpackage.AbstractC2568l
    public ColorStateList getCardBackgroundColor() {
        return this.f674l.crashlytics.f10262l.crashlytics;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f674l.amazon.f10262l.crashlytics;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f674l.isPro;
    }

    public int getCheckedIconGravity() {
        return this.f674l.mopub;
    }

    public int getCheckedIconMargin() {
        return this.f674l.purchase;
    }

    public int getCheckedIconSize() {
        return this.f674l.billing;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f674l.smaato;
    }

    @Override // defpackage.AbstractC2568l
    public int getContentPaddingBottom() {
        return this.f674l.loadAd.bottom;
    }

    @Override // defpackage.AbstractC2568l
    public int getContentPaddingLeft() {
        return this.f674l.loadAd.left;
    }

    @Override // defpackage.AbstractC2568l
    public int getContentPaddingRight() {
        return this.f674l.loadAd.right;
    }

    @Override // defpackage.AbstractC2568l
    public int getContentPaddingTop() {
        return this.f674l.loadAd.top;
    }

    public float getProgress() {
        return this.f674l.crashlytics.f10262l.subs;
    }

    @Override // defpackage.AbstractC2568l
    public float getRadius() {
        return this.f674l.crashlytics.purchase();
    }

    public ColorStateList getRippleColor() {
        return this.f674l.firebase;
    }

    public C12564l getShapeAppearanceModel() {
        return this.f674l.remoteconfig;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f674l.vip;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f674l.vip;
    }

    public int getStrokeWidth() {
        return this.f674l.admob;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f675l;
    }

    public final void loadAd() {
        C2468l c2468l;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (c2468l = this.f674l).metrica) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        c2468l.metrica.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        c2468l.metrica.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2468l c2468l = this.f674l;
        c2468l.firebase();
        AbstractC11621l.firebase(this, c2468l.crashlytics);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        C2468l c2468l = this.f674l;
        if (c2468l != null && c2468l.subscription) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f672l);
        }
        if (this.f675l) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f671l);
        }
        if (this.f677l) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f673l);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f675l);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        C2468l c2468l = this.f674l;
        accessibilityNodeInfo.setCheckable(c2468l != null && c2468l.subscription);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f675l);
    }

    @Override // defpackage.AbstractC2568l, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f674l.purchase(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f676l) {
            C2468l c2468l = this.f674l;
            if (!c2468l.ads) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                c2468l.ads = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.AbstractC2568l
    public void setCardBackgroundColor(int i) {
        this.f674l.crashlytics.isPro(ColorStateList.valueOf(i));
    }

    @Override // defpackage.AbstractC2568l
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        C2468l c2468l = this.f674l;
        c2468l.crashlytics.subs(c2468l.yandex.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        C5022l c5022l = this.f674l.amazon;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c5022l.isPro(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f674l.subscription = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f675l != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f674l.mopub(drawable);
    }

    public void setCheckedIconGravity(int i) {
        C2468l c2468l = this.f674l;
        if (c2468l.mopub != i) {
            c2468l.mopub = i;
            MaterialCardView materialCardView = c2468l.yandex;
            c2468l.purchase(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.f674l.purchase = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f674l.purchase = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.f674l.mopub(AbstractC13273l.loadAd(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f674l.billing = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f674l.billing = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C2468l c2468l = this.f674l;
        c2468l.smaato = colorStateList;
        Drawable drawable = c2468l.isPro;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        C2468l c2468l = this.f674l;
        if (c2468l != null) {
            c2468l.firebase();
        }
    }

    public void setDragged(boolean z) {
        if (this.f677l != z) {
            this.f677l = z;
            refreshDrawableState();
            loadAd();
            invalidate();
        }
    }

    @Override // defpackage.AbstractC2568l
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f674l.remoteconfig();
    }

    @Override // defpackage.AbstractC2568l
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        C2468l c2468l = this.f674l;
        c2468l.remoteconfig();
        c2468l.smaato();
    }

    public void setProgress(float f) {
        C2468l c2468l = this.f674l;
        c2468l.crashlytics.firebase(f);
        C5022l c5022l = c2468l.amazon;
        if (c5022l != null) {
            c5022l.firebase(f);
        }
        C5022l c5022l2 = c2468l.adcel;
        if (c5022l2 != null) {
            c5022l2.firebase(f);
        }
    }

    @Override // defpackage.AbstractC2568l
    public void setRadius(float f) {
        super.setRadius(f);
        C2468l c2468l = this.f674l;
        C4968l c4968lPurchase = c2468l.remoteconfig.purchase();
        c4968lPurchase.purchase = new C16304l(f);
        c4968lPurchase.billing = new C16304l(f);
        c4968lPurchase.mopub = new C16304l(f);
        c4968lPurchase.admob = new C16304l(f);
        c2468l.admob(c4968lPurchase.yandex());
        c2468l.subs.invalidateSelf();
        if (c2468l.subs() || (c2468l.yandex.getPreventCornerOverlap() && !c2468l.crashlytics.admob())) {
            c2468l.smaato();
        }
        if (c2468l.subs()) {
            c2468l.remoteconfig();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C2468l c2468l = this.f674l;
        c2468l.firebase = colorStateList;
        int[] iArr = AbstractC14521l.yandex;
        RippleDrawable rippleDrawable = c2468l.metrica;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateListCrashlytics = AbstractC7720l.crashlytics(getContext(), i);
        C2468l c2468l = this.f674l;
        c2468l.firebase = colorStateListCrashlytics;
        int[] iArr = AbstractC14521l.yandex;
        RippleDrawable rippleDrawable = c2468l.metrica;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListCrashlytics);
        }
    }

    @Override // defpackage.InterfaceC15751l
    public void setShapeAppearanceModel(C12564l c12564l) {
        setClipToOutline(c12564l.amazon(getBoundsAsRectF()));
        this.f674l.admob(c12564l);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C2468l c2468l = this.f674l;
        if (c2468l.vip != colorStateList) {
            c2468l.vip = colorStateList;
            C5022l c5022l = c2468l.amazon;
            c5022l.f10262l.isPro = c2468l.admob;
            c5022l.invalidateSelf();
            C18309l c18309l = c5022l.f10262l;
            if (c18309l.amazon != colorStateList) {
                c18309l.amazon = colorStateList;
                c5022l.onStateChange(c5022l.getState());
            }
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        C2468l c2468l = this.f674l;
        if (i != c2468l.admob) {
            c2468l.admob = i;
            C5022l c5022l = c2468l.amazon;
            ColorStateList colorStateList = c2468l.vip;
            c5022l.f10262l.isPro = i;
            c5022l.invalidateSelf();
            C18309l c18309l = c5022l.f10262l;
            if (c18309l.amazon != colorStateList) {
                c18309l.amazon = colorStateList;
                c5022l.onStateChange(c5022l.getState());
            }
        }
        invalidate();
    }

    @Override // defpackage.AbstractC2568l
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        C2468l c2468l = this.f674l;
        c2468l.remoteconfig();
        c2468l.smaato();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        C2468l c2468l = this.f674l;
        if (c2468l != null && c2468l.subscription && isEnabled()) {
            this.f675l = !this.f675l;
            refreshDrawableState();
            loadAd();
            c2468l.billing(this.f675l, true);
        }
    }

    @Override // defpackage.AbstractC2568l
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f674l.crashlytics.isPro(colorStateList);
    }

    public void setOnCheckedChangeListener(InterfaceC12089l interfaceC12089l) {
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ua.itaysonlab.vkx.R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }
}
