package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًًۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7867l extends LinearLayout {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public CharSequence f16403l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f16404l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public ImageView.ScaleType f16405l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C9189l f16406l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final TextInputLayout f16407l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f16408l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public ColorStateList f16409l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final CheckableImageButton f16410l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public View.OnLongClickListener f16411l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public PorterDuff.Mode f16412l;

    public C7867l(TextInputLayout textInputLayout, C12418l c12418l) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f16407l = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f16410l = checkableImageButton;
        C9189l c9189l = new C9189l(getContext(), null);
        this.f16406l = c9189l;
        if (AbstractC4927l.smaato(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f16411l;
        checkableImageButton.setOnClickListener(null);
        AbstractC11064l.mopub(checkableImageButton, onLongClickListener);
        this.f16411l = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC11064l.mopub(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c12418l.f24518l;
        if (typedArray.hasValue(69)) {
            this.f16409l = AbstractC4927l.admob(getContext(), c12418l, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f16412l = AbstractC0545l.amazon(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            loadAd(c12418l.ads(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            C8339l.metrica("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.f16404l) {
            this.f16404l = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeCrashlytics = AbstractC11064l.crashlytics(typedArray.getInt(68, -1));
            this.f16405l = scaleTypeCrashlytics;
            checkableImageButton.setScaleType(scaleTypeCrashlytics);
        }
        c9189l.setVisibility(8);
        c9189l.setId(R.id.textinput_prefix_text);
        c9189l.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        c9189l.setAccessibilityLiveRegion(1);
        c9189l.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c9189l.setTextColor(c12418l.adcel(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f16403l = TextUtils.isEmpty(text2) ? null : text2;
        c9189l.setText(text2);
        purchase();
        addView(checkableImageButton);
        addView(c9189l);
    }

    public final void amazon() {
        int paddingStart;
        EditText editText = this.f16407l.f731l;
        if (editText == null) {
            return;
        }
        if (this.f16410l.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
        this.f16406l.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void crashlytics(boolean z) {
        CheckableImageButton checkableImageButton = this.f16410l;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            amazon();
            purchase();
        }
    }

    public final void loadAd(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f16410l;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f16409l;
            PorterDuff.Mode mode = this.f16412l;
            TextInputLayout textInputLayout = this.f16407l;
            AbstractC11064l.yandex(textInputLayout, checkableImageButton, colorStateList, mode);
            crashlytics(true);
            AbstractC11064l.billing(textInputLayout, checkableImageButton, this.f16409l);
            return;
        }
        crashlytics(false);
        View.OnLongClickListener onLongClickListener = this.f16411l;
        checkableImageButton.setOnClickListener(null);
        AbstractC11064l.mopub(checkableImageButton, onLongClickListener);
        this.f16411l = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC11064l.mopub(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        amazon();
    }

    public final void purchase() {
        int i = (this.f16403l == null || this.f16408l) ? 8 : 0;
        setVisibility((this.f16410l.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f16406l.setVisibility(i);
        this.f16407l.adcel();
    }

    public final int yandex() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f16410l;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        return this.f16406l.getPaddingStart() + getPaddingStart() + marginEnd;
    }
}
