package defpackage;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: lٌۦؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C9189l extends TextView implements InterfaceC14106l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C3797l f18894l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Future f18895l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10899l f18896l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C1080l f18897l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f18898l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C16030l f18899l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C15053l f18900l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9189l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC3542l.yandex(context);
        this.f18898l = false;
        this.f18900l = null;
        AbstractC1035l.yandex(this, getContext());
        C1080l c1080l = new C1080l(this);
        this.f18897l = c1080l;
        c1080l.isVip(attributeSet, i);
        C10899l c10899l = new C10899l(this);
        this.f18896l = c10899l;
        c10899l.billing(attributeSet, i);
        c10899l.loadAd();
        C3797l c3797l = new C3797l(5, false);
        c3797l.f7903l = this;
        this.f18894l = c3797l;
        getEmojiTextViewHelper().loadAd(attributeSet, i);
    }

    private C16030l getEmojiTextViewHelper() {
        if (this.f18899l == null) {
            this.f18899l = new C16030l(this);
        }
        return this.f18899l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1080l c1080l = this.f18897l;
        if (c1080l != null) {
            c1080l.purchase();
        }
        C10899l c10899l = this.f18896l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC15958l.crashlytics) {
            return super.getAutoSizeMaxTextSize();
        }
        C10899l c10899l = this.f18896l;
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
        C10899l c10899l = this.f18896l;
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
        C10899l c10899l = this.f18896l;
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
        C10899l c10899l = this.f18896l;
        return c10899l != null ? c10899l.subs.billing : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC15958l.crashlytics) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C10899l c10899l = this.f18896l;
        if (c10899l != null) {
            return c10899l.subs.yandex;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC11452l.isPro(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC18084l getSuperCaller() {
        if (this.f18900l == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f18900l = new C7202l(this);
            } else if (i >= 28) {
                this.f18900l = new C16040l(this);
            } else if (i >= 26) {
                this.f18900l = new C15053l(this);
            }
        }
        return this.f18900l;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1080l c1080l = this.f18897l;
        if (c1080l != null) {
            return c1080l.pro();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1080l c1080l = this.f18897l;
        if (c1080l != null) {
            return c1080l.advert();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f18896l.amazon();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f18896l.purchase();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f18895l;
        if (future != null) {
            try {
                this.f18895l = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC11452l.loadAd(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C3797l c3797l;
        if (Build.VERSION.SDK_INT >= 28 || (c3797l = this.f18894l) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c3797l.f7902l;
        return textClassifier == null ? AbstractC10629l.yandex((TextView) c3797l.f7903l) : textClassifier;
    }

    public C10796l getTextMetricsParamsCompat() {
        return AbstractC11452l.loadAd(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f18896l.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            AbstractC0170l.billing(editorInfo, getText());
        }
        AbstractC15439l.billing(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C10899l c10899l = this.f18896l;
        if (c10899l == null || AbstractC15958l.crashlytics) {
            return;
        }
        c10899l.subs.yandex();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.f18895l;
        if (future != null) {
            try {
                this.f18895l = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC11452l.loadAd(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C10899l c10899l = this.f18896l;
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
        C10899l c10899l = this.f18896l;
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
        C10899l c10899l = this.f18896l;
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
        C10899l c10899l = this.f18896l;
        if (c10899l != null) {
            c10899l.isPro(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1080l c1080l = this.f18897l;
        if (c1080l != null) {
            c1080l.signatures();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1080l c1080l = this.f18897l;
        if (c1080l != null) {
            c1080l.premium(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C10899l c10899l = this.f18896l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C10899l c10899l = this.f18896l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC13273l.loadAd(context, i) : null, i2 != 0 ? AbstractC13273l.loadAd(context, i2) : null, i3 != 0 ? AbstractC13273l.loadAd(context, i3) : null, i4 != 0 ? AbstractC13273l.loadAd(context, i4) : null);
        C10899l c10899l = this.f18896l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC13273l.loadAd(context, i) : null, i2 != 0 ? AbstractC13273l.loadAd(context, i2) : null, i3 != 0 ? AbstractC13273l.loadAd(context, i3) : null, i4 != 0 ? AbstractC13273l.loadAd(context, i4) : null);
        C10899l c10899l = this.f18896l;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().yandex(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().admob(i);
        } else {
            AbstractC11452l.purchase(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().loadAd(i);
        } else {
            AbstractC11452l.billing(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().subs(i, f);
        } else if (i2 >= 34) {
            AbstractC5917l.m1868native(this, i, f);
        } else {
            AbstractC11452l.mopub(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(AbstractC6584l abstractC6584l) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC11452l.loadAd(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1080l c1080l = this.f18897l;
        if (c1080l != null) {
            c1080l.m791else(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1080l c1080l = this.f18897l;
        if (c1080l != null) {
            c1080l.m786case(mode);
        }
    }

    @Override // defpackage.InterfaceC14106l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C10899l c10899l = this.f18896l;
        c10899l.firebase(colorStateList);
        c10899l.loadAd();
    }

    @Override // defpackage.InterfaceC14106l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C10899l c10899l = this.f18896l;
        c10899l.smaato(mode);
        c10899l.loadAd();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C10899l c10899l = this.f18896l;
        if (c10899l != null) {
            c10899l.mopub(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C3797l c3797l;
        if (Build.VERSION.SDK_INT >= 28 || (c3797l = this.f18894l) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c3797l.f7902l = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC6584l> future) {
        this.f18895l = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C10796l c10796l) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c10796l.loadAd;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(c10796l.yandex);
        setBreakStrategy(c10796l.crashlytics);
        setHyphenationFrequency(c10796l.amazon);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = AbstractC15958l.crashlytics;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C10899l c10899l = this.f18896l;
        if (c10899l != null) {
            C2970l c2970l = c10899l.subs;
            if (z || c2970l.billing()) {
                return;
            }
            c2970l.mopub(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f18898l) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC2133l abstractC2133l = AbstractC7618l.yandex;
            if (context == null) {
                C8339l.metrica("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f18898l = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f18898l = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        AbstractC11452l.mopub(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C10899l c10899l = this.f18896l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C10899l c10899l = this.f18896l;
        if (c10899l != null) {
            c10899l.loadAd();
        }
    }

    public C9189l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
