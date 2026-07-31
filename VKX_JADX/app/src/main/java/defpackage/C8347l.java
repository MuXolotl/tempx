package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: renamed from: lًۢۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C8347l extends Button implements InterfaceC14106l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C16030l f17272l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10899l f17273l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C1080l f17274l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8347l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC3542l.yandex(context);
        AbstractC1035l.yandex(this, getContext());
        C1080l c1080l = new C1080l(this);
        this.f17274l = c1080l;
        c1080l.isVip(attributeSet, i);
        C10899l c10899l = new C10899l(this);
        this.f17273l = c10899l;
        c10899l.billing(attributeSet, i);
        c10899l.loadAd();
        getEmojiTextViewHelper().loadAd(attributeSet, i);
    }

    private C16030l getEmojiTextViewHelper() {
        if (this.f17272l == null) {
            this.f17272l = new C16030l(this);
        }
        return this.f17272l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1080l c1080l = this.f17274l;
        if (c1080l != null) {
            c1080l.purchase();
        }
        C10899l c10899l = this.f17273l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC15958l.crashlytics) {
            return super.getAutoSizeMaxTextSize();
        }
        C10899l c10899l = this.f17273l;
        if (c10899l != null) {
            return Math.round(c10899l.subs.purchase);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC15958l.crashlytics) {
            return super.getAutoSizeMinTextSize();
        }
        C10899l c10899l = this.f17273l;
        if (c10899l != null) {
            return Math.round(c10899l.subs.amazon);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC15958l.crashlytics) {
            return super.getAutoSizeStepGranularity();
        }
        C10899l c10899l = this.f17273l;
        if (c10899l != null) {
            return Math.round(c10899l.subs.crashlytics);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC15958l.crashlytics) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C10899l c10899l = this.f17273l;
        return c10899l != null ? c10899l.subs.billing : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC15958l.crashlytics) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C10899l c10899l = this.f17273l;
        if (c10899l != null) {
            return c10899l.subs.yandex;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC11452l.isPro(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1080l c1080l = this.f17274l;
        if (c1080l != null) {
            return c1080l.pro();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1080l c1080l = this.f17274l;
        if (c1080l != null) {
            return c1080l.advert();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f17273l.amazon();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f17273l.purchase();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C10899l c10899l = this.f17273l;
        if (c10899l == null || AbstractC15958l.crashlytics) {
            return;
        }
        c10899l.subs.yandex();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C10899l c10899l = this.f17273l;
        if (c10899l != null) {
            C2970l c2970l = c10899l.subs;
            if (AbstractC15958l.crashlytics || !c2970l.billing()) {
                return;
            }
            c2970l.yandex();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().crashlytics(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC15958l.crashlytics) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C10899l c10899l = this.f17273l;
        if (c10899l != null) {
            c10899l.admob(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC15958l.crashlytics) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C10899l c10899l = this.f17273l;
        if (c10899l != null) {
            c10899l.subs(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC15958l.crashlytics) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C10899l c10899l = this.f17273l;
        if (c10899l != null) {
            c10899l.isPro(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1080l c1080l = this.f17274l;
        if (c1080l != null) {
            c1080l.signatures();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1080l c1080l = this.f17274l;
        if (c1080l != null) {
            c1080l.premium(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC11452l.smaato(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().amazon(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().yandex(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C10899l c10899l = this.f17273l;
        if (c10899l != null) {
            c10899l.yandex.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1080l c1080l = this.f17274l;
        if (c1080l != null) {
            c1080l.m791else(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1080l c1080l = this.f17274l;
        if (c1080l != null) {
            c1080l.m786case(mode);
        }
    }

    @Override // defpackage.InterfaceC14106l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C10899l c10899l = this.f17273l;
        c10899l.firebase(colorStateList);
        c10899l.loadAd();
    }

    @Override // defpackage.InterfaceC14106l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C10899l c10899l = this.f17273l;
        c10899l.smaato(mode);
        c10899l.loadAd();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C10899l c10899l = this.f17273l;
        if (c10899l != null) {
            c10899l.mopub(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = AbstractC15958l.crashlytics;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C10899l c10899l = this.f17273l;
        if (c10899l != null) {
            C2970l c2970l = c10899l.subs;
            if (z || c2970l.billing()) {
                return;
            }
            c2970l.mopub(i, f);
        }
    }
}
