package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٕ٘ۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18167l extends CheckedTextView implements InterfaceC14106l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10899l f35567l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C1080l f35568l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C3558l f35569l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C16030l f35570l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18167l(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        AbstractC3542l.yandex(context);
        AbstractC1035l.yandex(this, getContext());
        C10899l c10899l = new C10899l(this);
        this.f35567l = c10899l;
        c10899l.billing(attributeSet, R.attr.checkedTextViewStyle);
        c10899l.loadAd();
        C1080l c1080l = new C1080l(this);
        this.f35568l = c1080l;
        c1080l.isVip(attributeSet, R.attr.checkedTextViewStyle);
        this.f35569l = new C3558l(this);
        Context context2 = getContext();
        int[] iArr = AbstractC14657l.smaato;
        C12418l c12418lPro = C12418l.pro(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) c12418lPro.f24518l;
        AbstractC15872l.remoteconfig(this, getContext(), iArr, attributeSet, (TypedArray) c12418lPro.f24518l, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC13273l.loadAd(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(AbstractC13273l.loadAd(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC13273l.loadAd(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c12418lPro.adcel(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC2341l.crashlytics(typedArray.getInt(3, -1), null));
            }
            c12418lPro.advert();
            getEmojiTextViewHelper().loadAd(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            c12418lPro.advert();
            throw th;
        }
    }

    private C16030l getEmojiTextViewHelper() {
        if (this.f35570l == null) {
            this.f35570l = new C16030l(this);
        }
        return this.f35570l;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C10899l c10899l = this.f35567l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
        C1080l c1080l = this.f35568l;
        if (c1080l != null) {
            c1080l.purchase();
        }
        C3558l c3558l = this.f35569l;
        if (c3558l != null) {
            c3558l.loadAd();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC11452l.isPro(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1080l c1080l = this.f35568l;
        if (c1080l != null) {
            return c1080l.pro();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1080l c1080l = this.f35568l;
        if (c1080l != null) {
            return c1080l.advert();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C3558l c3558l = this.f35569l;
        if (c3558l != null) {
            return (ColorStateList) c3558l.f7485l;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C3558l c3558l = this.f35569l;
        if (c3558l != null) {
            return (PorterDuff.Mode) c3558l.f7484l;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f35567l.amazon();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f35567l.purchase();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC15439l.billing(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().crashlytics(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1080l c1080l = this.f35568l;
        if (c1080l != null) {
            c1080l.signatures();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1080l c1080l = this.f35568l;
        if (c1080l != null) {
            c1080l.premium(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C3558l c3558l = this.f35569l;
        if (c3558l != null) {
            if (c3558l.f7486l) {
                c3558l.f7486l = false;
            } else {
                c3558l.f7486l = true;
                c3558l.loadAd();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C10899l c10899l = this.f35567l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C10899l c10899l = this.f35567l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC11452l.smaato(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().amazon(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1080l c1080l = this.f35568l;
        if (c1080l != null) {
            c1080l.m791else(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1080l c1080l = this.f35568l;
        if (c1080l != null) {
            c1080l.m786case(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C3558l c3558l = this.f35569l;
        if (c3558l != null) {
            c3558l.f7485l = colorStateList;
            c3558l.f7483l = true;
            c3558l.loadAd();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C3558l c3558l = this.f35569l;
        if (c3558l != null) {
            c3558l.f7484l = mode;
            c3558l.f7487l = true;
            c3558l.loadAd();
        }
    }

    @Override // defpackage.InterfaceC14106l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C10899l c10899l = this.f35567l;
        c10899l.firebase(colorStateList);
        c10899l.loadAd();
    }

    @Override // defpackage.InterfaceC14106l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C10899l c10899l = this.f35567l;
        c10899l.smaato(mode);
        c10899l.loadAd();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C10899l c10899l = this.f35567l;
        if (c10899l != null) {
            c10899l.mopub(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC13273l.loadAd(getContext(), i));
    }
}
