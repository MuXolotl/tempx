package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: renamed from: lٍۣٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9614l extends ToggleButton implements InterfaceC14106l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C16030l f19586l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10899l f19587l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C1080l f19588l;

    public C9614l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        AbstractC1035l.yandex(this, getContext());
        C1080l c1080l = new C1080l(this);
        this.f19588l = c1080l;
        c1080l.isVip(attributeSet, R.attr.buttonStyleToggle);
        C10899l c10899l = new C10899l(this);
        this.f19587l = c10899l;
        c10899l.billing(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().loadAd(attributeSet, R.attr.buttonStyleToggle);
    }

    private C16030l getEmojiTextViewHelper() {
        if (this.f19586l == null) {
            this.f19586l = new C16030l(this);
        }
        return this.f19586l;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1080l c1080l = this.f19588l;
        if (c1080l != null) {
            c1080l.purchase();
        }
        C10899l c10899l = this.f19587l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1080l c1080l = this.f19588l;
        if (c1080l != null) {
            return c1080l.pro();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1080l c1080l = this.f19588l;
        if (c1080l != null) {
            return c1080l.advert();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f19587l.amazon();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f19587l.purchase();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().crashlytics(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1080l c1080l = this.f19588l;
        if (c1080l != null) {
            c1080l.signatures();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1080l c1080l = this.f19588l;
        if (c1080l != null) {
            c1080l.premium(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C10899l c10899l = this.f19587l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C10899l c10899l = this.f19587l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().amazon(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().yandex(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1080l c1080l = this.f19588l;
        if (c1080l != null) {
            c1080l.m791else(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1080l c1080l = this.f19588l;
        if (c1080l != null) {
            c1080l.m786case(mode);
        }
    }

    @Override // defpackage.InterfaceC14106l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C10899l c10899l = this.f19587l;
        c10899l.firebase(colorStateList);
        c10899l.loadAd();
    }

    @Override // defpackage.InterfaceC14106l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C10899l c10899l = this.f19587l;
        c10899l.smaato(mode);
        c10899l.loadAd();
    }
}
