package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: renamed from: lؘؑۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C5367l extends AutoCompleteTextView implements InterfaceC14106l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final int[] f11501l = {R.attr.popupBackground};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C0458l f11502l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10899l f11503l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C1080l f11504l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5367l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC3542l.yandex(context);
        AbstractC1035l.yandex(this, getContext());
        C12418l c12418lPro = C12418l.pro(getContext(), attributeSet, f11501l, i);
        if (((TypedArray) c12418lPro.f24518l).hasValue(0)) {
            setDropDownBackgroundDrawable(c12418lPro.ads(0));
        }
        c12418lPro.advert();
        C1080l c1080l = new C1080l(this);
        this.f11504l = c1080l;
        c1080l.isVip(attributeSet, i);
        C10899l c10899l = new C10899l(this);
        this.f11503l = c10899l;
        c10899l.billing(attributeSet, i);
        c10899l.loadAd();
        C0458l c0458l = new C0458l(this);
        this.f11502l = c0458l;
        c0458l.m554synchronized(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerInmobi = c0458l.inmobi(keyListener);
        if (keyListenerInmobi == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerInmobi);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1080l c1080l = this.f11504l;
        if (c1080l != null) {
            c1080l.purchase();
        }
        C10899l c10899l = this.f11503l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC11452l.isPro(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1080l c1080l = this.f11504l;
        if (c1080l != null) {
            return c1080l.pro();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1080l c1080l = this.f11504l;
        if (c1080l != null) {
            return c1080l.advert();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11503l.amazon();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11503l.purchase();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC15439l.billing(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f11502l.m557volatile(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1080l c1080l = this.f11504l;
        if (c1080l != null) {
            c1080l.signatures();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1080l c1080l = this.f11504l;
        if (c1080l != null) {
            c1080l.premium(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C10899l c10899l = this.f11503l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C10899l c10899l = this.f11503l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC11452l.smaato(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC13273l.loadAd(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f11502l.m549extends(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f11502l.inmobi(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1080l c1080l = this.f11504l;
        if (c1080l != null) {
            c1080l.m791else(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1080l c1080l = this.f11504l;
        if (c1080l != null) {
            c1080l.m786case(mode);
        }
    }

    @Override // defpackage.InterfaceC14106l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C10899l c10899l = this.f11503l;
        c10899l.firebase(colorStateList);
        c10899l.loadAd();
    }

    @Override // defpackage.InterfaceC14106l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C10899l c10899l = this.f11503l;
        c10899l.smaato(mode);
        c10899l.loadAd();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C10899l c10899l = this.f11503l;
        if (c10899l != null) {
            c10899l.mopub(context, i);
        }
    }
}
