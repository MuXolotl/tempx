package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lَۡۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C10637l extends RadioButton implements InterfaceC11745l, InterfaceC14106l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10899l f21582l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C1080l f21583l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C3558l f21584l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C16030l f21585l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10637l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        AbstractC3542l.yandex(context);
        AbstractC1035l.yandex(this, getContext());
        C3558l c3558l = new C3558l(this);
        this.f21584l = c3558l;
        c3558l.crashlytics(attributeSet, R.attr.radioButtonStyle);
        C1080l c1080l = new C1080l(this);
        this.f21583l = c1080l;
        c1080l.isVip(attributeSet, R.attr.radioButtonStyle);
        C10899l c10899l = new C10899l(this);
        this.f21582l = c10899l;
        c10899l.billing(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().loadAd(attributeSet, R.attr.radioButtonStyle);
    }

    private C16030l getEmojiTextViewHelper() {
        if (this.f21585l == null) {
            this.f21585l = new C16030l(this);
        }
        return this.f21585l;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1080l c1080l = this.f21583l;
        if (c1080l != null) {
            c1080l.purchase();
        }
        C10899l c10899l = this.f21582l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1080l c1080l = this.f21583l;
        if (c1080l != null) {
            return c1080l.pro();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1080l c1080l = this.f21583l;
        if (c1080l != null) {
            return c1080l.advert();
        }
        return null;
    }

    @Override // defpackage.InterfaceC11745l
    public ColorStateList getSupportButtonTintList() {
        C3558l c3558l = this.f21584l;
        if (c3558l != null) {
            return (ColorStateList) c3558l.f7485l;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C3558l c3558l = this.f21584l;
        if (c3558l != null) {
            return (PorterDuff.Mode) c3558l.f7484l;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f21582l.amazon();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f21582l.purchase();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().crashlytics(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1080l c1080l = this.f21583l;
        if (c1080l != null) {
            c1080l.signatures();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1080l c1080l = this.f21583l;
        if (c1080l != null) {
            c1080l.premium(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C3558l c3558l = this.f21584l;
        if (c3558l != null) {
            if (c3558l.f7486l) {
                c3558l.f7486l = false;
            } else {
                c3558l.f7486l = true;
                c3558l.yandex();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C10899l c10899l = this.f21582l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C10899l c10899l = this.f21582l;
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
        C1080l c1080l = this.f21583l;
        if (c1080l != null) {
            c1080l.m791else(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1080l c1080l = this.f21583l;
        if (c1080l != null) {
            c1080l.m786case(mode);
        }
    }

    @Override // defpackage.InterfaceC11745l
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C3558l c3558l = this.f21584l;
        if (c3558l != null) {
            c3558l.f7485l = colorStateList;
            c3558l.f7483l = true;
            c3558l.yandex();
        }
    }

    @Override // defpackage.InterfaceC11745l
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C3558l c3558l = this.f21584l;
        if (c3558l != null) {
            c3558l.f7484l = mode;
            c3558l.f7487l = true;
            c3558l.yandex();
        }
    }

    @Override // defpackage.InterfaceC14106l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C10899l c10899l = this.f21582l;
        c10899l.firebase(colorStateList);
        c10899l.loadAd();
    }

    @Override // defpackage.InterfaceC14106l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C10899l c10899l = this.f21582l;
        c10899l.smaato(mode);
        c10899l.loadAd();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC13273l.loadAd(getContext(), i));
    }
}
