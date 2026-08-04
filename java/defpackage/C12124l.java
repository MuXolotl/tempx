package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lِۛٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12124l extends LinearLayout {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C9981l f24123l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f24124l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final CheckableImageButton f24125l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final CheckableImageButton f24126l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C2683l f24127l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final AccessibilityManager f24128l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C11522l f24129l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public CharSequence f24130l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final FrameLayout f24131l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final TextInputLayout f24132l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public EditText f24133l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C9189l f24134l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final LinkedHashSet f24135l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public View.OnLongClickListener f24136l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public PorterDuff.Mode f24137l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public ColorStateList f24138l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public PorterDuff.Mode f24139l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f24140l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public View.OnLongClickListener f24141l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public ColorStateList f24142l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public ImageView.ScaleType f24143l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f24144l;

    public C12124l(TextInputLayout textInputLayout, C12418l c12418l) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f24140l = 0;
        this.f24135l = new LinkedHashSet();
        this.f24123l = new C9981l(this);
        C7550l c7550l = new C7550l(this);
        this.f24128l = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f24132l = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f24131l = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(R.layout.design_text_input_end_icon, (ViewGroup) this, false);
        checkableImageButton.setId(R.id.text_input_error_icon);
        if (AbstractC4927l.smaato(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        this.f24125l = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) layoutInflaterFrom.inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout, false);
        checkableImageButton2.setId(R.id.text_input_end_icon);
        if (AbstractC4927l.smaato(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams()).setMarginStart(0);
        }
        this.f24126l = checkableImageButton2;
        this.f24129l = new C11522l(this, c12418l);
        C9189l c9189l = new C9189l(getContext(), null);
        this.f24134l = c9189l;
        TypedArray typedArray = (TypedArray) c12418l.f24518l;
        if (typedArray.hasValue(38)) {
            this.f24138l = AbstractC4927l.admob(getContext(), c12418l, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f24137l = AbstractC0545l.amazon(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            admob(c12418l.ads(37));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        checkableImageButton.setImportantForAccessibility(2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f24142l = AbstractC4927l.admob(getContext(), c12418l, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f24139l = AbstractC0545l.amazon(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            billing(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButton2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButton2.setContentDescription(text);
            }
            checkableImageButton2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f24142l = AbstractC4927l.admob(getContext(), c12418l, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f24139l = AbstractC0545l.amazon(typedArray.getInt(55, -1), null);
            }
            billing(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (checkableImageButton2.getContentDescription() != text2) {
                checkableImageButton2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            C8339l.metrica("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.f24124l) {
            this.f24124l = dimensionPixelSize;
            checkableImageButton2.setMinimumWidth(dimensionPixelSize);
            checkableImageButton2.setMinimumHeight(dimensionPixelSize);
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeCrashlytics = AbstractC11064l.crashlytics(typedArray.getInt(31, -1));
            this.f24143l = scaleTypeCrashlytics;
            checkableImageButton2.setScaleType(scaleTypeCrashlytics);
            checkableImageButton.setScaleType(scaleTypeCrashlytics);
        }
        c9189l.setVisibility(8);
        c9189l.setId(R.id.textinput_suffix_text);
        c9189l.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c9189l.setAccessibilityLiveRegion(1);
        c9189l.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c9189l.setTextColor(c12418l.adcel(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f24130l = TextUtils.isEmpty(text3) ? null : text3;
        c9189l.setText(text3);
        remoteconfig();
        frameLayout.addView(checkableImageButton2);
        addView(c9189l);
        addView(frameLayout);
        addView(checkableImageButton);
        textInputLayout.f736l.add(c7550l);
        if (textInputLayout.f731l != null) {
            c7550l.yandex(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC11783l(2, this));
    }

    public final void admob(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f24125l;
        checkableImageButton.setImageDrawable(drawable);
        firebase();
        AbstractC11064l.yandex(this.f24132l, checkableImageButton, this.f24138l, this.f24137l);
    }

    public final boolean amazon() {
        return this.f24125l.getVisibility() == 0;
    }

    public final void billing(int i) {
        if (this.f24140l == i) {
            return;
        }
        AbstractC13799l abstractC13799lYandex = yandex();
        C2683l c2683l = this.f24127l;
        AccessibilityManager accessibilityManager = this.f24128l;
        if (c2683l != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC4294l(c2683l));
        }
        this.f24127l = null;
        abstractC13799lYandex.ads();
        this.f24140l = i;
        Iterator it = this.f24135l.iterator();
        if (it.hasNext()) {
            throw AbstractC15560l.adcel(it);
        }
        mopub(i != 0);
        AbstractC13799l abstractC13799lYandex2 = yandex();
        int iAmazon = this.f24129l.loadAd;
        if (iAmazon == 0) {
            iAmazon = abstractC13799lYandex2.amazon();
        }
        Drawable drawableLoadAd = iAmazon != 0 ? AbstractC13273l.loadAd(getContext(), iAmazon) : null;
        CheckableImageButton checkableImageButton = this.f24126l;
        checkableImageButton.setImageDrawable(drawableLoadAd);
        TextInputLayout textInputLayout = this.f24132l;
        if (drawableLoadAd != null) {
            AbstractC11064l.yandex(textInputLayout, checkableImageButton, this.f24142l, this.f24139l);
            AbstractC11064l.billing(textInputLayout, checkableImageButton, this.f24142l);
        }
        int iCrashlytics = abstractC13799lYandex2.crashlytics();
        CharSequence text = iCrashlytics != 0 ? getResources().getText(iCrashlytics) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC13799lYandex2.isPro());
        if (!abstractC13799lYandex2.subs(textInputLayout.getBoxBackgroundMode())) {
            C18073l.subs(textInputLayout.getBoxBackgroundMode(), i, " is not supported by the end icon mode ", "The current box background mode ");
            return;
        }
        abstractC13799lYandex2.adcel();
        C2683l c2683lAdmob = abstractC13799lYandex2.admob();
        this.f24127l = c2683lAdmob;
        if (c2683lAdmob != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC4294l(this.f24127l));
            }
        }
        View.OnClickListener onClickListenerBilling = abstractC13799lYandex2.billing();
        View.OnLongClickListener onLongClickListener = this.f24136l;
        checkableImageButton.setOnClickListener(onClickListenerBilling);
        AbstractC11064l.mopub(checkableImageButton, onLongClickListener);
        EditText editText = this.f24133l;
        if (editText != null) {
            abstractC13799lYandex2.smaato(editText);
            subs(abstractC13799lYandex2);
        }
        AbstractC11064l.yandex(textInputLayout, checkableImageButton, this.f24142l, this.f24139l);
        purchase(true);
    }

    public final boolean crashlytics() {
        return this.f24131l.getVisibility() == 0 && this.f24126l.getVisibility() == 0;
    }

    public final void firebase() {
        CheckableImageButton checkableImageButton = this.f24125l;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f24132l;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f726l.adcel && textInputLayout.remoteconfig()) ? 0 : 8);
        isPro();
        smaato();
        if (this.f24140l != 0) {
            return;
        }
        textInputLayout.adcel();
    }

    public final void isPro() {
        this.f24131l.setVisibility((this.f24126l.getVisibility() != 0 || amazon()) ? 8 : 0);
        setVisibility((crashlytics() || amazon() || ((this.f24130l == null || this.f24144l) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final int loadAd() {
        int marginStart;
        if (crashlytics() || amazon()) {
            CheckableImageButton checkableImageButton = this.f24126l;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        return this.f24134l.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final void mopub(boolean z) {
        if (crashlytics() != z) {
            this.f24126l.setVisibility(z ? 0 : 8);
            isPro();
            smaato();
            this.f24132l.adcel();
        }
    }

    public final void purchase(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        AbstractC13799l abstractC13799lYandex = yandex();
        boolean zIsPro = abstractC13799lYandex.isPro();
        CheckableImageButton checkableImageButton = this.f24126l;
        boolean z4 = true;
        if (!zIsPro || (z3 = checkableImageButton.f680l) == abstractC13799lYandex.firebase()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(abstractC13799lYandex instanceof C0602l) || (zIsActivated = checkableImageButton.isActivated()) == ((C0602l) abstractC13799lYandex).smaato) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            AbstractC11064l.billing(this.f24132l, checkableImageButton, this.f24142l);
        }
    }

    public final void remoteconfig() {
        C9189l c9189l = this.f24134l;
        int visibility = c9189l.getVisibility();
        int i = (this.f24130l == null || this.f24144l) ? 8 : 0;
        if (visibility != i) {
            yandex().metrica(i == 0);
        }
        isPro();
        c9189l.setVisibility(i);
        this.f24132l.adcel();
    }

    public final void smaato() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f24132l;
        if (textInputLayout.f731l == null) {
            return;
        }
        if (crashlytics() || amazon()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f731l;
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f731l.getPaddingTop();
        int paddingBottom = textInputLayout.f731l.getPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
        this.f24134l.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void subs(AbstractC13799l abstractC13799l) {
        if (this.f24133l == null) {
            return;
        }
        if (abstractC13799l.purchase() != null) {
            this.f24133l.setOnFocusChangeListener(abstractC13799l.purchase());
        }
        if (abstractC13799l.mopub() != null) {
            this.f24126l.setOnFocusChangeListener(abstractC13799l.mopub());
        }
    }

    public final AbstractC13799l yandex() {
        AbstractC13799l c12277l;
        int i = this.f24140l;
        C11522l c11522l = this.f24129l;
        SparseArray sparseArray = (SparseArray) c11522l.amazon;
        AbstractC13799l abstractC13799l = (AbstractC13799l) sparseArray.get(i);
        if (abstractC13799l != null) {
            return abstractC13799l;
        }
        C12124l c12124l = (C12124l) c11522l.purchase;
        if (i != -1) {
            int i2 = 1;
            if (i == 0) {
                c12277l = new C12277l(c12124l, i2);
            } else if (i == 1) {
                c12277l = new C2145l(c12124l, c11522l.crashlytics);
            } else if (i == 2) {
                c12277l = new C1500l(c12124l);
            } else {
                if (i != 3) {
                    C8339l.metrica(AbstractC0653l.vip(i, "Invalid end icon mode: "));
                    return null;
                }
                c12277l = new C0602l(c12124l);
            }
        } else {
            c12277l = new C12277l(c12124l, 0);
        }
        sparseArray.append(i, c12277l);
        return c12277l;
    }
}
