package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: renamed from: lؗۡۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C5217l extends EditText implements InterfaceC17353l, InterfaceC14106l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C3797l f11295l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10899l f11296l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C1080l f11297l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C0458l f11298l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C0262l f11299l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C15833l f11300l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5217l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC3542l.yandex(context);
        AbstractC1035l.yandex(this, getContext());
        C1080l c1080l = new C1080l(this);
        this.f11297l = c1080l;
        c1080l.isVip(attributeSet, i);
        C10899l c10899l = new C10899l(this);
        this.f11296l = c10899l;
        c10899l.billing(attributeSet, i);
        c10899l.loadAd();
        C3797l c3797l = new C3797l(5, false);
        c3797l.f7903l = this;
        this.f11295l = c3797l;
        this.f11299l = new C0262l();
        C0458l c0458l = new C0458l(this);
        this.f11298l = c0458l;
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

    private C15833l getSuperCaller() {
        if (this.f11300l == null) {
            this.f11300l = new C15833l(this);
        }
        return this.f11300l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1080l c1080l = this.f11297l;
        if (c1080l != null) {
            c1080l.purchase();
        }
        C10899l c10899l = this.f11296l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC11452l.isPro(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1080l c1080l = this.f11297l;
        if (c1080l != null) {
            return c1080l.pro();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1080l c1080l = this.f11297l;
        if (c1080l != null) {
            return c1080l.advert();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11296l.amazon();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11296l.purchase();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C3797l c3797l;
        if (Build.VERSION.SDK_INT >= 28 || (c3797l = this.f11295l) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c3797l.f7902l;
        return textClassifier == null ? AbstractC10629l.yandex((TextView) c3797l.f7903l) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrMopub;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f11296l.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            AbstractC0170l.billing(editorInfo, getText());
        }
        AbstractC15439l.billing(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrMopub = AbstractC15872l.mopub(this)) != null) {
            AbstractC0170l.purchase(editorInfo, strArrMopub);
            inputConnectionOnCreateInputConnection = AbstractC2749l.loadAd(inputConnectionOnCreateInputConnection, editorInfo, new C6536l(6, this));
        }
        return this.f11298l.m557volatile(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean zYandex = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && AbstractC15872l.mopub(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zYandex = AbstractC6445l.yandex(dragEvent, this, activity);
            }
        }
        if (zYandex) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        C2534l c2534l;
        InterfaceC4326l interfaceC4326l;
        int i2;
        C17240l c17240l;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || AbstractC15872l.mopub(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                c17240l = new C17240l(primaryClip, 1);
            } else {
                c2534l = new C2534l();
                c2534l.loadAd = primaryClip;
                c2534l.crashlytics = 1;
            }
            if (i == 16908322) {
                interfaceC4326l = c2534l;
                interfaceC4326l = c17240l;
                i2 = 0;
            } else {
                interfaceC4326l = c2534l;
                interfaceC4326l = c17240l;
                i2 = 1;
            }
            interfaceC4326l.crashlytics(i2);
            AbstractC15872l.isPro(this, interfaceC4326l.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1080l c1080l = this.f11297l;
        if (c1080l != null) {
            c1080l.signatures();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1080l c1080l = this.f11297l;
        if (c1080l != null) {
            c1080l.premium(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C10899l c10899l = this.f11296l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C10899l c10899l = this.f11296l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC11452l.smaato(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f11298l.m549extends(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f11298l.inmobi(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1080l c1080l = this.f11297l;
        if (c1080l != null) {
            c1080l.m791else(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1080l c1080l = this.f11297l;
        if (c1080l != null) {
            c1080l.m786case(mode);
        }
    }

    @Override // defpackage.InterfaceC14106l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C10899l c10899l = this.f11296l;
        c10899l.firebase(colorStateList);
        c10899l.loadAd();
    }

    @Override // defpackage.InterfaceC14106l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C10899l c10899l = this.f11296l;
        c10899l.smaato(mode);
        c10899l.loadAd();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C10899l c10899l = this.f11296l;
        if (c10899l != null) {
            c10899l.mopub(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C3797l c3797l;
        if (Build.VERSION.SDK_INT >= 28 || (c3797l = this.f11295l) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c3797l.f7902l = textClassifier;
        }
    }

    @Override // defpackage.InterfaceC17353l
    public final C16242l yandex(C16242l c16242l) {
        return this.f11299l.yandex(this, c16242l);
    }
}
