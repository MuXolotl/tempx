package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.AbstractC0545l;
import defpackage.AbstractC0926l;
import defpackage.AbstractC11064l;
import defpackage.AbstractC11407l;
import defpackage.AbstractC11621l;
import defpackage.AbstractC12848l;
import defpackage.AbstractC12953l;
import defpackage.AbstractC13273l;
import defpackage.AbstractC14093l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC15422l;
import defpackage.AbstractC15872l;
import defpackage.AbstractC16431l;
import defpackage.AbstractC17057l;
import defpackage.AbstractC17463l;
import defpackage.AbstractC1757l;
import defpackage.AbstractC1758l;
import defpackage.AbstractC2341l;
import defpackage.AbstractC4548l;
import defpackage.AbstractC4927l;
import defpackage.AbstractC5294l;
import defpackage.AbstractC6689l;
import defpackage.AbstractC7720l;
import defpackage.AbstractC8960l;
import defpackage.C0602l;
import defpackage.C1085l;
import defpackage.C10975l;
import defpackage.C10978l;
import defpackage.C11140l;
import defpackage.C11354l;
import defpackage.C12124l;
import defpackage.C12418l;
import defpackage.C12564l;
import defpackage.C14245l;
import defpackage.C14925l;
import defpackage.C15664l;
import defpackage.C16304l;
import defpackage.C17125l;
import defpackage.C17156l;
import defpackage.C17357l;
import defpackage.C1759l;
import defpackage.C18073l;
import defpackage.C18309l;
import defpackage.C4968l;
import defpackage.C5022l;
import defpackage.C5551l;
import defpackage.C5671l;
import defpackage.C5844l;
import defpackage.C6921l;
import defpackage.C7183l;
import defpackage.C7550l;
import defpackage.C7862l;
import defpackage.C7867l;
import defpackage.C8105l;
import defpackage.C8339l;
import defpackage.C9107l;
import defpackage.C9189l;
import defpackage.InterfaceC13600l;
import defpackage.InterfaceC18070l;
import defpackage.RunnableC5360l;
import defpackage.RunnableC6665l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: lًَؘ, reason: contains not printable characters */
    public static final int[][] f684l = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public C5022l f685l;

    /* JADX INFO: renamed from: lؑٔۦ, reason: contains not printable characters */
    public int f686l;

    /* JADX INFO: renamed from: lؑۚؓ, reason: contains not printable characters */
    public int f687l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public ColorStateList f688l;

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public boolean f689l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public int f690l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public boolean f691l;

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public int f692l;

    /* JADX INFO: renamed from: lؓٗؗ, reason: contains not printable characters */
    public int f693l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C12124l f694l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f695l;

    /* JADX INFO: renamed from: lؔؕؖ, reason: contains not printable characters */
    public int f696l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public ColorStateList f697l;

    /* JADX INFO: renamed from: lّؔ۟, reason: contains not printable characters */
    public int f698l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C9189l f699l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f700l;

    /* JADX INFO: renamed from: lؚؕؒ, reason: contains not printable characters */
    public final RectF f701l;

    /* JADX INFO: renamed from: lۣؕ٘, reason: contains not printable characters */
    public int f702l;

    /* JADX INFO: renamed from: lؕۗؗ, reason: contains not printable characters */
    public final Rect f703l;

    /* JADX INFO: renamed from: lؕۦؓ, reason: contains not printable characters */
    public final int f704l;

    /* JADX INFO: renamed from: lؖٙؓ, reason: contains not printable characters */
    public int f705l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public C12564l f706l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f707l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public int f708l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public boolean f709l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public C5671l f710l;

    /* JADX INFO: renamed from: lؗ۟ۤ, reason: contains not printable characters */
    public int f711l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C7867l f712l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final FrameLayout f713l;

    /* JADX INFO: renamed from: lؘٝؕ, reason: contains not printable characters */
    public ValueAnimator f714l;

    /* JADX INFO: renamed from: lؘٟۛ, reason: contains not printable characters */
    public int f715l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f716l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public int f717l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public boolean f718l;

    /* JADX INFO: renamed from: lُؚؓ, reason: contains not printable characters */
    public int f719l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public ColorStateList f720l;

    /* JADX INFO: renamed from: lؚٕۤ, reason: contains not printable characters */
    public int f721l;

    /* JADX INFO: renamed from: lؚۤ۟, reason: contains not printable characters */
    public boolean f722l;

    /* JADX INFO: renamed from: lؚۦؑ, reason: contains not printable characters */
    public Typeface f723l;

    /* JADX INFO: renamed from: lًؙؗ, reason: contains not printable characters */
    public boolean f724l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public ColorStateList f725l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C17156l f726l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public C5022l f727l;

    /* JADX INFO: renamed from: lٍٜٛ, reason: contains not printable characters */
    public int f728l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C9189l f729l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public CharSequence f730l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public EditText f731l;

    /* JADX INFO: renamed from: lٍۥ۟, reason: contains not printable characters */
    public Drawable f732l;

    /* JADX INFO: renamed from: lُۨ, reason: contains not printable characters */
    public int f733l;

    /* JADX INFO: renamed from: lِِٞ, reason: contains not printable characters */
    public int f734l;

    /* JADX INFO: renamed from: lِٟ, reason: contains not printable characters */
    public ColorDrawable f735l;

    /* JADX INFO: renamed from: lًّۥ, reason: contains not printable characters */
    public final LinkedHashSet f736l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public boolean f737l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public ColorStateList f738l;

    /* JADX INFO: renamed from: lٌْؔ, reason: contains not printable characters */
    public ColorStateList f739l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public C5022l f740l;

    /* JADX INFO: renamed from: lٓؔۧ, reason: contains not printable characters */
    public ColorStateList f741l;

    /* JADX INFO: renamed from: lؙٓۦ, reason: contains not printable characters */
    public boolean f742l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f743l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public C5022l f744l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f745l;

    /* JADX INFO: renamed from: lٜٔٚ, reason: contains not printable characters */
    public boolean f746l;

    /* JADX INFO: renamed from: lٕؑٞ, reason: contains not printable characters */
    public int f747l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f748l;

    /* JADX INFO: renamed from: lٕٖٙ, reason: contains not printable characters */
    public ColorStateList f749l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public boolean f750l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public StateListDrawable f751l;

    /* JADX INFO: renamed from: lٖ٘ؕ, reason: contains not printable characters */
    public boolean f752l;

    /* JADX INFO: renamed from: lٖ٘ۘ, reason: contains not printable characters */
    public int f753l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public InterfaceC18070l f754l;

    /* JADX INFO: renamed from: lٟٗٛ, reason: contains not printable characters */
    public boolean f755l;

    /* JADX INFO: renamed from: lٌؚ٘, reason: contains not printable characters */
    public ColorDrawable f756l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public CharSequence f757l;

    /* JADX INFO: renamed from: l٘ٚؒ, reason: contains not printable characters */
    public final Rect f758l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public CharSequence f759l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public C5671l f760l;

    /* JADX INFO: renamed from: lُ٘ۙ, reason: contains not printable characters */
    public final C5844l f761l;

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(AbstractC12953l.adcel(context, attributeSet, i, ua.itaysonlab.vkx.R.style.Widget_Design_TextInputLayout), attributeSet, i);
        this.f748l = -1;
        this.f695l = -1;
        this.f700l = -1;
        this.f745l = -1;
        this.f726l = new C17156l(this);
        this.f754l = new C1759l(6);
        this.f758l = new Rect();
        this.f703l = new Rect();
        this.f701l = new RectF();
        this.f736l = new LinkedHashSet();
        C5844l c5844l = new C5844l(this);
        this.f761l = c5844l;
        this.f746l = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f713l = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0926l.yandex;
        c5844l.f12311else = linearInterpolator;
        c5844l.admob(false);
        c5844l.f12307catch = linearInterpolator;
        c5844l.admob(false);
        if (c5844l.mopub != 8388659) {
            c5844l.mopub = 8388659;
            c5844l.admob(false);
        }
        AbstractC8960l.amazon(context2, attributeSet, i, ua.itaysonlab.vkx.R.style.Widget_Design_TextInputLayout);
        int[] iArr = AbstractC4548l.premium;
        AbstractC8960l.purchase(context2, attributeSet, iArr, i, ua.itaysonlab.vkx.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, ua.itaysonlab.vkx.R.style.Widget_Design_TextInputLayout);
        C12418l c12418l = new C12418l(context2, typedArrayObtainStyledAttributes);
        C7867l c7867l = new C7867l(this, c12418l);
        this.f712l = c7867l;
        this.f737l = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f724l = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.f742l = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f706l = C12564l.loadAd(context2, attributeSet, i, ua.itaysonlab.vkx.R.style.Widget_Design_TextInputLayout).yandex();
        this.f704l = context2.getResources().getDimensionPixelOffset(ua.itaysonlab.vkx.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f692l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f734l = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(ua.itaysonlab.vkx.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f719l = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(ua.itaysonlab.vkx.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f711l = this.f734l;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        C4968l c4968lPurchase = this.f706l.purchase();
        if (dimension >= 0.0f) {
            c4968lPurchase.purchase = new C16304l(dimension);
        }
        if (dimension2 >= 0.0f) {
            c4968lPurchase.billing = new C16304l(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c4968lPurchase.mopub = new C16304l(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c4968lPurchase.admob = new C16304l(dimension4);
        }
        this.f706l = c4968lPurchase.yandex();
        ColorStateList colorStateListAdmob = AbstractC4927l.admob(context2, c12418l, 7);
        if (colorStateListAdmob != null) {
            int defaultColor = colorStateListAdmob.getDefaultColor();
            this.f728l = defaultColor;
            this.f753l = defaultColor;
            if (colorStateListAdmob.isStateful()) {
                this.f733l = colorStateListAdmob.getColorForState(new int[]{-16842910}, -1);
                this.f747l = colorStateListAdmob.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f705l = colorStateListAdmob.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f747l = this.f728l;
                ColorStateList colorStateListCrashlytics = AbstractC7720l.crashlytics(context2, ua.itaysonlab.vkx.R.color.mtrl_filled_background_color);
                this.f733l = colorStateListCrashlytics.getColorForState(new int[]{-16842910}, -1);
                this.f705l = colorStateListCrashlytics.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f753l = 0;
            this.f728l = 0;
            this.f733l = 0;
            this.f747l = 0;
            this.f705l = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListAdcel = c12418l.adcel(1);
            this.f739l = colorStateListAdcel;
            this.f749l = colorStateListAdcel;
        }
        ColorStateList colorStateListAdmob2 = AbstractC4927l.admob(context2, c12418l, 14);
        this.f687l = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f702l = context2.getColor(ua.itaysonlab.vkx.R.color.mtrl_textinput_default_box_stroke_color);
        this.f721l = context2.getColor(ua.itaysonlab.vkx.R.color.mtrl_textinput_disabled_color);
        this.f698l = context2.getColor(ua.itaysonlab.vkx.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListAdmob2 != null) {
            setBoxStrokeColorStateList(colorStateListAdmob2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC4927l.admob(context2, c12418l, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(49, 0));
        }
        this.f688l = c12418l.adcel(24);
        this.f720l = c12418l.adcel(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i2 = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(56);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f717l = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f707l = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i2);
        setCounterOverflowTextAppearance(this.f707l);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f717l);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c12418l.adcel(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c12418l.adcel(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c12418l.adcel(50));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c12418l.adcel(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c12418l.adcel(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c12418l.adcel(58));
        }
        C12124l c12124l = new C12124l(this, c12418l);
        this.f694l = c12124l;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        c12418l.advert();
        setImportantForAccessibility(2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && i3 >= 26) {
            AbstractC12848l.loadAd(this, 1);
        }
        frameLayout.addView(c7867l);
        frameLayout.addView(c12124l);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    public static void firebase(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                firebase((ViewGroup) childAt, z);
            }
        }
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f731l;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f744l;
        }
        int iMetrica = AbstractC6689l.metrica(this.f731l, ua.itaysonlab.vkx.R.attr.colorControlHighlight);
        int i = this.f708l;
        int[][] iArr = f684l;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            C5022l c5022l = this.f744l;
            int i2 = this.f753l;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC6689l.startapp(iMetrica, 0.1f, i2), i2}), c5022l, c5022l);
        }
        Context context = getContext();
        C5022l c5022l2 = this.f744l;
        TypedValue typedValueMopub = AbstractC17463l.mopub(context, ua.itaysonlab.vkx.R.attr.colorSurface);
        if (typedValueMopub == null) {
            C18073l.adcel("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{"TextInputLayout", context.getResources().getResourceName(ua.itaysonlab.vkx.R.attr.colorSurface)});
            return null;
        }
        int i3 = typedValueMopub.resourceId;
        int color = i3 != 0 ? context.getColor(i3) : typedValueMopub.data;
        C5022l c5022l3 = new C5022l(c5022l2.f10262l.yandex);
        int iStartapp = AbstractC6689l.startapp(iMetrica, 0.1f, color);
        c5022l3.isPro(new ColorStateList(iArr, new int[]{iStartapp, 0}));
        c5022l3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iStartapp, color});
        C5022l c5022l4 = new C5022l(c5022l2.f10262l.yandex);
        c5022l4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c5022l3, c5022l4), c5022l2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f751l == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f751l = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f751l.addState(new int[0], billing(false));
        }
        return this.f751l;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f685l == null) {
            this.f685l = billing(true);
        }
        return this.f685l;
    }

    private void setEditText(EditText editText) {
        if (this.f731l != null) {
            C8339l.metrica("We already have an EditText, can only have one");
            return;
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f731l = editText;
        int i = this.f748l;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f700l);
        }
        int i2 = this.f695l;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f745l);
        }
        this.f709l = false;
        subs();
        setTextInputAccessibilityDelegate(new C7183l(this));
        Typeface typeface = this.f731l.getTypeface();
        C5844l c5844l = this.f761l;
        c5844l.remoteconfig(typeface);
        float textSize = this.f731l.getTextSize();
        if (c5844l.admob != textSize) {
            c5844l.admob = textSize;
            c5844l.admob(false);
        }
        float letterSpacing = this.f731l.getLetterSpacing();
        if (c5844l.f12324static != letterSpacing) {
            c5844l.f12324static = letterSpacing;
            c5844l.admob(false);
        }
        int gravity = this.f731l.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (c5844l.mopub != i3) {
            c5844l.mopub = i3;
            c5844l.admob(false);
        }
        if (c5844l.billing != gravity) {
            c5844l.billing = gravity;
            c5844l.admob(false);
        }
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        this.f693l = editText.getMinimumHeight();
        this.f731l.addTextChangedListener(new C14925l(this, editText));
        if (this.f749l == null) {
            this.f749l = this.f731l.getHintTextColors();
        }
        if (this.f737l) {
            if (TextUtils.isEmpty(this.f757l)) {
                CharSequence hint = this.f731l.getHint();
                this.f730l = hint;
                setHint(hint);
                this.f731l.setHint((CharSequence) null);
            }
            this.f718l = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            startapp();
        }
        if (this.f729l != null) {
            vip(this.f731l.getText());
        }
        ads();
        this.f726l.loadAd();
        this.f712l.bringToFront();
        C12124l c12124l = this.f694l;
        c12124l.bringToFront();
        Iterator it = this.f736l.iterator();
        while (it.hasNext()) {
            ((C7550l) it.next()).yandex(this);
        }
        c12124l.smaato();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        Signature(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f757l)) {
            return;
        }
        this.f757l = charSequence;
        C5844l c5844l = this.f761l;
        if (charSequence == null || !TextUtils.equals(c5844l.signatures, charSequence)) {
            c5844l.signatures = charSequence;
            c5844l.premium = null;
            Bitmap bitmap = c5844l.inmobi;
            if (bitmap != null) {
                bitmap.recycle();
                c5844l.inmobi = null;
            }
            c5844l.admob(false);
        }
        if (this.f755l) {
            return;
        }
        isPro();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f716l == z) {
            return;
        }
        C9189l c9189l = this.f699l;
        if (!z) {
            if (c9189l != null) {
                c9189l.setVisibility(8);
            }
            this.f699l = null;
        } else if (c9189l != null) {
            this.f713l.addView(c9189l);
            this.f699l.setVisibility(0);
        }
        this.f716l = z;
    }

    public final void Signature(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C9189l c9189l;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f731l;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f731l;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f749l;
        C5844l c5844l = this.f761l;
        if (colorStateList2 != null) {
            c5844l.subs(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f749l;
            int colorForState = this.f721l;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, colorForState);
            }
            c5844l.subs(ColorStateList.valueOf(colorForState));
        } else if (remoteconfig()) {
            C9189l c9189l2 = this.f726l.ads;
            c5844l.subs(c9189l2 != null ? c9189l2.getTextColors() : null);
        } else if (this.f691l && (c9189l = this.f729l) != null) {
            c5844l.subs(c9189l.getTextColors());
        } else if (z4 && (colorStateList = this.f739l) != null && c5844l.firebase != colorStateList) {
            c5844l.firebase = colorStateList;
            c5844l.admob(false);
        }
        C12124l c12124l = this.f694l;
        C7867l c7867l = this.f712l;
        if (z3 || !this.f742l || (isEnabled() && z4)) {
            if (z2 || this.f755l) {
                ValueAnimator valueAnimator = this.f714l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f714l.cancel();
                }
                if (z && this.f724l) {
                    yandex(1.0f);
                } else {
                    c5844l.firebase(1.0f);
                }
                this.f755l = false;
                if (purchase()) {
                    isPro();
                }
                EditText editText3 = this.f731l;
                license(editText3 != null ? editText3.getText() : null);
                c7867l.f16408l = false;
                c7867l.purchase();
                c12124l.f24144l = false;
                c12124l.remoteconfig();
                return;
            }
            return;
        }
        if (z2 || !this.f755l) {
            ValueAnimator valueAnimator2 = this.f714l;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f714l.cancel();
            }
            if (z && this.f724l) {
                yandex(0.0f);
            } else {
                c5844l.firebase(0.0f);
            }
            if (purchase() && !((AbstractC5294l) this.f744l).f11408l.adcel.isEmpty() && purchase()) {
                ((AbstractC5294l) this.f744l).startapp(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f755l = true;
            C9189l c9189l3 = this.f699l;
            if (c9189l3 != null && this.f716l) {
                c9189l3.setText((CharSequence) null);
                AbstractC17057l.yandex(this.f713l, this.f710l);
                this.f699l.setVisibility(4);
            }
            c7867l.f16408l = true;
            c7867l.purchase();
            c12124l.f24144l = true;
            c12124l.remoteconfig();
        }
    }

    public final void ad() {
        C9189l c9189l;
        EditText editText;
        EditText editText2;
        if (this.f744l == null || this.f708l == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f731l) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f731l) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.f696l = this.f721l;
        } else if (remoteconfig()) {
            if (this.f741l != null) {
                pro(z2, z);
            } else {
                this.f696l = getErrorCurrentTextColors();
            }
        } else if (!this.f691l || (c9189l = this.f729l) == null) {
            if (z2) {
                this.f696l = this.f687l;
            } else if (z) {
                this.f696l = this.f698l;
            } else {
                this.f696l = this.f702l;
            }
        } else if (this.f741l != null) {
            pro(z2, z);
        } else {
            this.f696l = c9189l.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            startapp();
        }
        C12124l c12124l = this.f694l;
        TextInputLayout textInputLayout = c12124l.f24132l;
        CheckableImageButton checkableImageButton = c12124l.f24126l;
        TextInputLayout textInputLayout2 = c12124l.f24132l;
        c12124l.firebase();
        AbstractC11064l.billing(textInputLayout2, c12124l.f24125l, c12124l.f24138l);
        AbstractC11064l.billing(textInputLayout2, checkableImageButton, c12124l.f24142l);
        if (c12124l.yandex() instanceof C0602l) {
            if (!textInputLayout.remoteconfig() || checkableImageButton.getDrawable() == null) {
                AbstractC11064l.yandex(textInputLayout, checkableImageButton, c12124l.f24142l, c12124l.f24139l);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        C7867l c7867l = this.f712l;
        AbstractC11064l.billing(c7867l.f16407l, c7867l.f16410l, c7867l.f16409l);
        if (this.f708l == 2) {
            int i = this.f711l;
            if (z2 && isEnabled()) {
                this.f711l = this.f719l;
            } else {
                this.f711l = this.f734l;
            }
            if (this.f711l != i && purchase() && !this.f755l) {
                if (purchase()) {
                    ((AbstractC5294l) this.f744l).startapp(0.0f, 0.0f, 0.0f, 0.0f);
                }
                isPro();
            }
        }
        if (this.f708l == 1) {
            if (!isEnabled()) {
                this.f753l = this.f733l;
            } else if (z && !z2) {
                this.f753l = this.f705l;
            } else if (z2) {
                this.f753l = this.f747l;
            } else {
                this.f753l = this.f728l;
            }
        }
        loadAd();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final boolean adcel() {
        boolean z;
        if (this.f731l == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            C7867l c7867l = this.f712l;
            if (c7867l.getMeasuredWidth() > 0) {
                int measuredWidth = c7867l.getMeasuredWidth() - this.f731l.getPaddingLeft();
                if (this.f735l == null || this.f715l != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f735l = colorDrawable;
                    this.f715l = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f731l.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f735l;
                if (drawable != colorDrawable2) {
                    this.f731l.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.f735l != null) {
                Drawable[] compoundDrawablesRelative2 = this.f731l.getCompoundDrawablesRelative();
                this.f731l.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f735l = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.f735l != null) {
            Drawable[] compoundDrawablesRelative3 = this.f731l.getCompoundDrawablesRelative();
            this.f731l.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.f735l = null;
            z = true;
        } else {
            z = false;
        }
        C12124l c12124l = this.f694l;
        if ((c12124l.amazon() || ((c12124l.f24140l != 0 && c12124l.crashlytics()) || c12124l.f24130l != null)) && c12124l.getMeasuredWidth() > 0) {
            int measuredWidth2 = c12124l.f24134l.getMeasuredWidth() - this.f731l.getPaddingRight();
            if (c12124l.amazon()) {
                checkableImageButton = c12124l.f24125l;
            } else if (c12124l.f24140l != 0 && c12124l.crashlytics()) {
                checkableImageButton = c12124l.f24126l;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.f731l.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f756l;
            if (colorDrawable3 != null && this.f686l != measuredWidth2) {
                this.f686l = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f731l.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f756l, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.f756l = colorDrawable4;
                this.f686l = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.f756l;
            if (drawable2 != colorDrawable5) {
                this.f732l = drawable2;
                this.f731l.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.f756l != null) {
            Drawable[] compoundDrawablesRelative5 = this.f731l.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.f756l) {
                this.f731l.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.f732l, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this.f756l = null;
            return z2;
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f713l;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        tapsense();
        setEditText((EditText) view);
    }

    public final int admob(int i, boolean z) {
        int compoundPaddingRight;
        if (z || getSuffixText() == null) {
            compoundPaddingRight = (!z || getPrefixText() == null) ? this.f731l.getCompoundPaddingRight() : this.f712l.yandex();
        } else {
            compoundPaddingRight = this.f694l.loadAd();
        }
        return i - compoundPaddingRight;
    }

    public final void ads() {
        Drawable background;
        C9189l c9189l;
        EditText editText = this.f731l;
        if (editText == null || this.f708l != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC2341l.yandex;
        Drawable drawableMutate = background.mutate();
        if (remoteconfig()) {
            drawableMutate.setColorFilter(C7862l.crashlytics(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f691l && (c9189l = this.f729l) != null) {
            drawableMutate.setColorFilter(C7862l.crashlytics(c9189l.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f731l.refreshDrawableState();
        }
    }

    public final C5671l amazon() {
        C5671l c5671l = new C5671l();
        c5671l.f3356l = AbstractC15422l.mopub(getContext(), ua.itaysonlab.vkx.R.attr.motionDurationShort2, 87);
        c5671l.f3370l = AbstractC15422l.admob(getContext(), ua.itaysonlab.vkx.R.attr.motionEasingLinearInterpolator, AbstractC0926l.yandex);
        return c5671l;
    }

    public final C5022l billing(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(ua.itaysonlab.vkx.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f731l;
        float popupElevation = editText instanceof C15664l ? ((C15664l) editText).getPopupElevation() : getResources().getDimensionPixelOffset(ua.itaysonlab.vkx.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(ua.itaysonlab.vkx.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C10978l c10978l = new C10978l();
        C10978l c10978l2 = new C10978l();
        C10978l c10978l3 = new C10978l();
        C10978l c10978l4 = new C10978l();
        int i = 0;
        C11140l c11140l = new C11140l(i);
        C11140l c11140l2 = new C11140l(i);
        C11140l c11140l3 = new C11140l(i);
        C11140l c11140l4 = new C11140l(i);
        C16304l c16304l = new C16304l(f);
        C16304l c16304l2 = new C16304l(f);
        C16304l c16304l3 = new C16304l(dimensionPixelOffset);
        C16304l c16304l4 = new C16304l(dimensionPixelOffset);
        C12564l c12564l = new C12564l();
        c12564l.yandex = c10978l;
        c12564l.loadAd = c10978l2;
        c12564l.crashlytics = c10978l3;
        c12564l.amazon = c10978l4;
        c12564l.purchase = c16304l;
        c12564l.billing = c16304l2;
        c12564l.mopub = c16304l4;
        c12564l.admob = c16304l3;
        c12564l.subs = c11140l;
        c12564l.isPro = c11140l2;
        c12564l.firebase = c11140l3;
        c12564l.smaato = c11140l4;
        EditText editText2 = this.f731l;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof C15664l ? ((C15664l) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C5022l.f10252l;
            String simpleName = C5022l.class.getSimpleName();
            TypedValue typedValueMopub = AbstractC17463l.mopub(context, ua.itaysonlab.vkx.R.attr.colorSurface);
            if (typedValueMopub == null) {
                C18073l.adcel("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{simpleName, context.getResources().getResourceName(ua.itaysonlab.vkx.R.attr.colorSurface)});
                return null;
            }
            int i2 = typedValueMopub.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? context.getColor(i2) : typedValueMopub.data);
        }
        C5022l c5022l = new C5022l();
        c5022l.mopub(context);
        c5022l.isPro(dropDownBackgroundTintList);
        c5022l.subs(popupElevation);
        c5022l.setShapeAppearanceModel(c12564l);
        C18309l c18309l = c5022l.f10262l;
        if (c18309l.mopub == null) {
            c18309l.mopub = new Rect();
        }
        c5022l.f10262l.mopub.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c5022l.invalidateSelf();
        return c5022l;
    }

    public final int crashlytics() {
        float fAmazon;
        if (!this.f737l) {
            return 0;
        }
        int i = this.f708l;
        C5844l c5844l = this.f761l;
        if (i == 0) {
            fAmazon = c5844l.amazon();
        } else {
            if (i != 2) {
                return 0;
            }
            fAmazon = c5844l.amazon() / 2.0f;
        }
        return (int) fAmazon;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f731l;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f730l != null) {
            boolean z = this.f718l;
            this.f718l = false;
            CharSequence hint = editText.getHint();
            this.f731l.setHint(this.f730l);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f731l.setHint(hint);
                this.f718l = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f713l;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f731l) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f752l = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f752l = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C5022l c5022l;
        super.draw(canvas);
        boolean z = this.f737l;
        C5844l c5844l = this.f761l;
        if (z) {
            TextPaint textPaint = c5844l.f12314for;
            RectF rectF = c5844l.purchase;
            int iSave = canvas.save();
            if (c5844l.premium != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(c5844l.f12321package);
                float f = c5844l.startapp;
                float f2 = c5844l.adcel;
                float f3 = c5844l.f12330throws;
                if (f3 != 1.0f) {
                    canvas.scale(f3, f3, f, f2);
                }
                if (c5844l.f12305abstract <= 1 || c5844l.applovin) {
                    canvas.translate(f, f2);
                    c5844l.f12313final.draw(canvas);
                } else {
                    float lineStart = c5844l.startapp - c5844l.f12313final.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (c5844l.f12326super * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        textPaint.setShadowLayer(c5844l.f12328synchronized, c5844l.f12325strictfp, c5844l.f12331volatile, AbstractC6689l.amazon(c5844l.f12319native, textPaint.getAlpha()));
                    }
                    c5844l.f12313final.draw(canvas);
                    textPaint.setAlpha((int) (c5844l.f12315goto * f4));
                    if (i >= 31) {
                        textPaint.setShadowLayer(c5844l.f12328synchronized, c5844l.f12325strictfp, c5844l.f12331volatile, AbstractC6689l.amazon(c5844l.f12319native, textPaint.getAlpha()));
                    }
                    int lineBaseline = c5844l.f12313final.getLineBaseline(0);
                    CharSequence charSequence = c5844l.f12316import;
                    float f5 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(c5844l.f12328synchronized, c5844l.f12325strictfp, c5844l.f12331volatile, c5844l.f12319native);
                    }
                    String strTrim = c5844l.f12316import.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = AbstractC1757l.m1035native(1, 0, strTrim);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(c5844l.f12313final.getLineEnd(0), str.length()), 0.0f, f5, (Paint) textPaint);
                    canvas = canvas;
                }
                canvas.restoreToCount(iSave);
            }
        }
        if (this.f740l == null || (c5022l = this.f727l) == null) {
            return;
        }
        c5022l.draw(canvas);
        if (this.f731l.isFocused()) {
            Rect bounds = this.f740l.getBounds();
            Rect bounds2 = this.f727l.getBounds();
            float f6 = c5844l.loadAd;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC0926l.crashlytics(iCenterX, f6, bounds2.left);
            bounds.right = AbstractC0926l.crashlytics(iCenterX, f6, bounds2.right);
            this.f740l.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.f722l) {
            return;
        }
        this.f722l = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C5844l c5844l = this.f761l;
        if (c5844l != null) {
            c5844l.f12322private = drawableState;
            ColorStateList colorStateList2 = c5844l.firebase;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = c5844l.isPro) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                c5844l.admob(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this.f731l != null) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            Signature(isLaidOut() && isEnabled(), false);
        }
        ads();
        ad();
        if (z) {
            invalidate();
        }
        this.f722l = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f731l;
        if (editText == null) {
            return super.getBaseline();
        }
        return crashlytics() + getPaddingTop() + editText.getBaseline();
    }

    public C5022l getBoxBackground() {
        int i = this.f708l;
        if (i == 1 || i == 2) {
            return this.f744l;
        }
        C18073l.admob();
        return null;
    }

    public int getBoxBackgroundColor() {
        return this.f753l;
    }

    public int getBoxBackgroundMode() {
        return this.f708l;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f692l;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zCrashlytics = AbstractC0545l.crashlytics(this);
        C12564l c12564l = this.f706l;
        RectF rectF = this.f701l;
        return zCrashlytics ? c12564l.admob.yandex(rectF) : c12564l.mopub.yandex(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zCrashlytics = AbstractC0545l.crashlytics(this);
        C12564l c12564l = this.f706l;
        RectF rectF = this.f701l;
        return zCrashlytics ? c12564l.mopub.yandex(rectF) : c12564l.admob.yandex(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zCrashlytics = AbstractC0545l.crashlytics(this);
        C12564l c12564l = this.f706l;
        RectF rectF = this.f701l;
        return zCrashlytics ? c12564l.purchase.yandex(rectF) : c12564l.billing.yandex(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zCrashlytics = AbstractC0545l.crashlytics(this);
        C12564l c12564l = this.f706l;
        RectF rectF = this.f701l;
        return zCrashlytics ? c12564l.billing.yandex(rectF) : c12564l.purchase.yandex(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f687l;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f741l;
    }

    public int getBoxStrokeWidth() {
        return this.f734l;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f719l;
    }

    public int getCounterMaxLength() {
        return this.f743l;
    }

    public CharSequence getCounterOverflowDescription() {
        C9189l c9189l;
        if (this.f750l && this.f691l && (c9189l = this.f729l) != null) {
            return c9189l.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f738l;
    }

    public ColorStateList getCounterTextColor() {
        return this.f725l;
    }

    public ColorStateList getCursorColor() {
        return this.f688l;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f720l;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f749l;
    }

    public EditText getEditText() {
        return this.f731l;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f694l.f24126l.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f694l.f24126l.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f694l.f24124l;
    }

    public int getEndIconMode() {
        return this.f694l.f24140l;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f694l.f24143l;
    }

    public CheckableImageButton getEndIconView() {
        return this.f694l.f24126l;
    }

    public CharSequence getError() {
        C17156l c17156l = this.f726l;
        if (c17156l.adcel) {
            return c17156l.startapp;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f726l.tapsense;
    }

    public CharSequence getErrorContentDescription() {
        return this.f726l.subscription;
    }

    public int getErrorCurrentTextColors() {
        C9189l c9189l = this.f726l.ads;
        if (c9189l != null) {
            return c9189l.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f694l.f24125l.getDrawable();
    }

    public CharSequence getHelperText() {
        C17156l c17156l = this.f726l;
        if (c17156l.ad) {
            return c17156l.pro;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C9189l c9189l = this.f726l.advert;
        if (c9189l != null) {
            return c9189l.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f737l) {
            return this.f757l;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f761l.amazon();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C5844l c5844l = this.f761l;
        return c5844l.purchase(c5844l.firebase);
    }

    public ColorStateList getHintTextColor() {
        return this.f739l;
    }

    public InterfaceC18070l getLengthCounter() {
        return this.f754l;
    }

    public int getMaxEms() {
        return this.f695l;
    }

    public int getMaxWidth() {
        return this.f745l;
    }

    public int getMinEms() {
        return this.f748l;
    }

    public int getMinWidth() {
        return this.f700l;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f694l.f24126l.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f694l.f24126l.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f716l) {
            return this.f759l;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f690l;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f697l;
    }

    public CharSequence getPrefixText() {
        return this.f712l.f16403l;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f712l.f16406l.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f712l.f16406l;
    }

    public C12564l getShapeAppearanceModel() {
        return this.f706l;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f712l.f16410l.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f712l.f16410l.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f712l.f16404l;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f712l.f16405l;
    }

    public CharSequence getSuffixText() {
        return this.f694l.f24130l;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f694l.f24134l.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f694l.f24134l;
    }

    public Typeface getTypeface() {
        return this.f723l;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    public final void isPro() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        float f5;
        int i2;
        if (purchase()) {
            int width = this.f731l.getWidth();
            int gravity = this.f731l.getGravity();
            C5844l c5844l = this.f761l;
            boolean zLoadAd = c5844l.loadAd(c5844l.signatures);
            c5844l.applovin = zLoadAd;
            Rect rect = c5844l.amazon;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zLoadAd) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = c5844l.f12320new;
                    }
                } else if (zLoadAd) {
                    f = rect.right;
                    f2 = c5844l.f12320new;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.f701l;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (c5844l.f12320new / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c5844l.applovin) {
                        f5 = c5844l.f12320new;
                        f4 = f5 + fMax;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (c5844l.applovin) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = c5844l.f12320new;
                    f4 = f5 + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = c5844l.amazon() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f704l;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f711l);
                AbstractC5294l abstractC5294l = (AbstractC5294l) this.f744l;
                abstractC5294l.getClass();
                abstractC5294l.startapp(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = c5844l.f12320new / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.f701l;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (c5844l.f12320new / 2.0f);
            } else {
                f4 = (width / 2.0f) + (c5844l.f12320new / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = c5844l.amazon() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void license(Editable editable) {
        ((C1759l) this.f754l).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f713l;
        if (length != 0 || this.f755l) {
            C9189l c9189l = this.f699l;
            if (c9189l == null || !this.f716l) {
                return;
            }
            c9189l.setText((CharSequence) null);
            AbstractC17057l.yandex(frameLayout, this.f710l);
            this.f699l.setVisibility(4);
            return;
        }
        if (this.f699l == null || !this.f716l || TextUtils.isEmpty(this.f759l)) {
            return;
        }
        this.f699l.setText(this.f759l);
        AbstractC17057l.yandex(frameLayout, this.f760l);
        this.f699l.setVisibility(0);
        this.f699l.bringToFront();
        announceForAccessibility(this.f759l);
    }

    public final void loadAd() {
        int i;
        int i2;
        C5022l c5022l = this.f744l;
        if (c5022l == null) {
            return;
        }
        C12564l c12564l = c5022l.f10262l.yandex;
        C12564l c12564l2 = this.f706l;
        if (c12564l != c12564l2) {
            c5022l.setShapeAppearanceModel(c12564l2);
        }
        if (this.f708l == 2 && (i = this.f711l) > -1 && (i2 = this.f696l) != 0) {
            C5022l c5022l2 = this.f744l;
            c5022l2.f10262l.isPro = i;
            c5022l2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            C18309l c18309l = c5022l2.f10262l;
            if (c18309l.amazon != colorStateListValueOf) {
                c18309l.amazon = colorStateListValueOf;
                c5022l2.onStateChange(c5022l2.getState());
            }
        }
        int iMopub = this.f753l;
        if (this.f708l == 1) {
            iMopub = AbstractC14093l.mopub(this.f753l, AbstractC6689l.vip(getContext(), ua.itaysonlab.vkx.R.attr.colorSurface, 0));
        }
        this.f753l = iMopub;
        this.f744l.isPro(ColorStateList.valueOf(iMopub));
        C5022l c5022l3 = this.f727l;
        if (c5022l3 != null && this.f740l != null) {
            if (this.f711l > -1 && this.f696l != 0) {
                c5022l3.isPro(this.f731l.isFocused() ? ColorStateList.valueOf(this.f702l) : ColorStateList.valueOf(this.f696l));
                this.f740l.isPro(ColorStateList.valueOf(this.f696l));
            }
            invalidate();
        }
        subscription();
    }

    public final void metrica() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C9189l c9189l = this.f729l;
        if (c9189l != null) {
            smaato(c9189l, this.f691l ? this.f707l : this.f717l);
            if (!this.f691l && (colorStateList2 = this.f725l) != null) {
                this.f729l.setTextColor(colorStateList2);
            }
            if (!this.f691l || (colorStateList = this.f738l) == null) {
                return;
            }
            this.f729l.setTextColor(colorStateList);
        }
    }

    public final int mopub(int i, boolean z) {
        int compoundPaddingLeft;
        if (z || getPrefixText() == null) {
            compoundPaddingLeft = (!z || getSuffixText() == null) ? this.f731l.getCompoundPaddingLeft() : this.f694l.loadAd();
        } else {
            compoundPaddingLeft = this.f712l.yandex();
        }
        return compoundPaddingLeft + i;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f761l.mopub(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C12124l c12124l = this.f694l;
        c12124l.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.f746l = false;
        if (this.f731l != null && this.f731l.getMeasuredHeight() < (iMax = Math.max(c12124l.getMeasuredHeight(), this.f712l.getMeasuredHeight()))) {
            this.f731l.setMinimumHeight(iMax);
            z = true;
        }
        boolean zAdcel = adcel();
        if (z || zAdcel) {
            this.f731l.post(new RunnableC6665l(9, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f731l;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC1758l.yandex;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f758l;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = AbstractC1758l.yandex;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            AbstractC1758l.yandex(this, editText, matrix);
            ThreadLocal threadLocal3 = AbstractC1758l.loadAd;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            C5022l c5022l = this.f727l;
            if (c5022l != null) {
                int i5 = rect.bottom;
                c5022l.setBounds(rect.left, i5 - this.f734l, rect.right, i5);
            }
            C5022l c5022l2 = this.f740l;
            if (c5022l2 != null) {
                int i6 = rect.bottom;
                c5022l2.setBounds(rect.left, i6 - this.f719l, rect.right, i6);
            }
            if (this.f737l) {
                float textSize = this.f731l.getTextSize();
                C5844l c5844l = this.f761l;
                if (c5844l.admob != textSize) {
                    c5844l.admob = textSize;
                    c5844l.admob(false);
                }
                int gravity = this.f731l.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (c5844l.mopub != i7) {
                    c5844l.mopub = i7;
                    c5844l.admob(false);
                }
                if (c5844l.billing != gravity) {
                    c5844l.billing = gravity;
                    c5844l.admob(false);
                }
                if (this.f731l == null) {
                    C18073l.admob();
                    return;
                }
                boolean zCrashlytics = AbstractC0545l.crashlytics(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f703l;
                rect2.bottom = i8;
                int i9 = this.f708l;
                int i10 = rect.left;
                if (i9 == 1) {
                    rect2.left = mopub(i10, zCrashlytics);
                    rect2.top = rect.top + this.f692l;
                    rect2.right = admob(rect.right, zCrashlytics);
                } else if (i9 != 2) {
                    rect2.left = mopub(i10, zCrashlytics);
                    rect2.top = getPaddingTop();
                    rect2.right = admob(rect.right, zCrashlytics);
                } else {
                    rect2.left = this.f731l.getPaddingLeft() + i10;
                    rect2.top = rect.top - crashlytics();
                    rect2.right = rect.right - this.f731l.getPaddingRight();
                }
                int i11 = rect2.left;
                int i12 = rect2.top;
                int i13 = rect2.right;
                int i14 = rect2.bottom;
                Rect rect3 = c5844l.amazon;
                if (rect3.left != i11 || rect3.top != i12 || rect3.right != i13 || rect3.bottom != i14) {
                    rect3.set(i11, i12, i13, i14);
                    c5844l.f12312extends = true;
                }
                if (this.f731l == null) {
                    C18073l.admob();
                    return;
                }
                TextPaint textPaint = c5844l.f12329throw;
                textPaint.setTextSize(c5844l.admob);
                textPaint.setTypeface(c5844l.Signature);
                textPaint.setLetterSpacing(c5844l.f12324static);
                float f = -textPaint.ascent();
                rect2.left = this.f731l.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f708l != 1 || this.f731l.getMinLines() > 1) ? rect.top + this.f731l.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.f731l.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f708l != 1 || this.f731l.getMinLines() > 1) ? rect.bottom - this.f731l.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i15 = rect2.left;
                int i16 = rect2.top;
                int i17 = rect2.right;
                Rect rect4 = c5844l.crashlytics;
                if (rect4.left != i15 || rect4.top != i16 || rect4.right != i17 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i15, i16, i17, compoundPaddingBottom);
                    c5844l.f12312extends = true;
                }
                c5844l.admob(false);
                if (!purchase() || this.f755l) {
                    return;
                }
                isPro();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.f746l;
        C12124l c12124l = this.f694l;
        if (!z) {
            c12124l.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f746l = true;
        }
        if (this.f699l != null && (editText = this.f731l) != null) {
            this.f699l.setGravity(editText.getGravity());
            this.f699l.setPadding(this.f731l.getCompoundPaddingLeft(), this.f731l.getCompoundPaddingTop(), this.f731l.getCompoundPaddingRight(), this.f731l.getCompoundPaddingBottom());
        }
        c12124l.smaato();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C8105l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C8105l c8105l = (C8105l) parcelable;
        super.onRestoreInstanceState(c8105l.f5855l);
        setError(c8105l.f16889l);
        if (c8105l.f16890l) {
            post(new RunnableC5360l(25, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.f689l) {
            InterfaceC13600l interfaceC13600l = this.f706l.purchase;
            RectF rectF = this.f701l;
            float fYandex = interfaceC13600l.yandex(rectF);
            float fYandex2 = this.f706l.billing.yandex(rectF);
            float fYandex3 = this.f706l.admob.yandex(rectF);
            float fYandex4 = this.f706l.mopub.yandex(rectF);
            C12564l c12564l = this.f706l;
            AbstractC16431l abstractC16431l = c12564l.yandex;
            AbstractC16431l abstractC16431l2 = c12564l.loadAd;
            AbstractC16431l abstractC16431l3 = c12564l.amazon;
            AbstractC16431l abstractC16431l4 = c12564l.crashlytics;
            C11140l c11140l = new C11140l(0);
            C11140l c11140l2 = new C11140l(0);
            C11140l c11140l3 = new C11140l(0);
            C11140l c11140l4 = new C11140l(0);
            C16304l c16304l = new C16304l(fYandex2);
            C16304l c16304l2 = new C16304l(fYandex);
            C16304l c16304l3 = new C16304l(fYandex4);
            C16304l c16304l4 = new C16304l(fYandex3);
            C12564l c12564l2 = new C12564l();
            c12564l2.yandex = abstractC16431l2;
            c12564l2.loadAd = abstractC16431l;
            c12564l2.crashlytics = abstractC16431l3;
            c12564l2.amazon = abstractC16431l4;
            c12564l2.purchase = c16304l;
            c12564l2.billing = c16304l2;
            c12564l2.mopub = c16304l4;
            c12564l2.admob = c16304l3;
            c12564l2.subs = c11140l;
            c12564l2.isPro = c11140l2;
            c12564l2.firebase = c11140l3;
            c12564l2.smaato = c11140l4;
            this.f689l = z;
            setShapeAppearanceModel(c12564l2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C8105l c8105l = new C8105l(super.onSaveInstanceState());
        if (remoteconfig()) {
            c8105l.f16889l = getError();
        }
        C12124l c12124l = this.f694l;
        c8105l.f16890l = c12124l.f24140l != 0 && c12124l.f24126l.f680l;
        return c8105l;
    }

    public final void pro(boolean z, boolean z2) {
        int defaultColor = this.f741l.getDefaultColor();
        int colorForState = this.f741l.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f741l.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f696l = colorForState2;
        } else if (z2) {
            this.f696l = colorForState;
        } else {
            this.f696l = defaultColor;
        }
    }

    public final boolean purchase() {
        return this.f737l && !TextUtils.isEmpty(this.f757l) && (this.f744l instanceof AbstractC5294l);
    }

    public final boolean remoteconfig() {
        C17156l c17156l = this.f726l;
        return (c17156l.metrica != 1 || c17156l.ads == null || TextUtils.isEmpty(c17156l.startapp)) ? false : true;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f753l != i) {
            this.f753l = i;
            this.f728l = i;
            this.f747l = i;
            this.f705l = i;
            loadAd();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f728l = defaultColor;
        this.f753l = defaultColor;
        this.f733l = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f747l = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f705l = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        loadAd();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f708l) {
            return;
        }
        this.f708l = i;
        if (this.f731l != null) {
            subs();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f692l = i;
    }

    public void setBoxCornerFamily(int i) {
        C4968l c4968lPurchase = this.f706l.purchase();
        InterfaceC13600l interfaceC13600l = this.f706l.purchase;
        c4968lPurchase.yandex = AbstractC11621l.amazon(i);
        c4968lPurchase.purchase = interfaceC13600l;
        InterfaceC13600l interfaceC13600l2 = this.f706l.billing;
        c4968lPurchase.loadAd = AbstractC11621l.amazon(i);
        c4968lPurchase.billing = interfaceC13600l2;
        InterfaceC13600l interfaceC13600l3 = this.f706l.admob;
        c4968lPurchase.amazon = AbstractC11621l.amazon(i);
        c4968lPurchase.admob = interfaceC13600l3;
        InterfaceC13600l interfaceC13600l4 = this.f706l.mopub;
        c4968lPurchase.crashlytics = AbstractC11621l.amazon(i);
        c4968lPurchase.mopub = interfaceC13600l4;
        this.f706l = c4968lPurchase.yandex();
        loadAd();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f687l != i) {
            this.f687l = i;
            ad();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f702l = colorStateList.getDefaultColor();
            this.f721l = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f698l = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f687l = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f687l != colorStateList.getDefaultColor()) {
            this.f687l = colorStateList.getDefaultColor();
        }
        ad();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f741l != colorStateList) {
            this.f741l = colorStateList;
            ad();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f734l = i;
        ad();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f719l = i;
        ad();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f750l != z) {
            C17156l c17156l = this.f726l;
            if (z) {
                C9189l c9189l = new C9189l(getContext(), null);
                this.f729l = c9189l;
                c9189l.setId(ua.itaysonlab.vkx.R.id.textinput_counter);
                Typeface typeface = this.f723l;
                if (typeface != null) {
                    this.f729l.setTypeface(typeface);
                }
                this.f729l.setMaxLines(1);
                c17156l.yandex(this.f729l, 2);
                ((ViewGroup.MarginLayoutParams) this.f729l.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(ua.itaysonlab.vkx.R.dimen.mtrl_textinput_counter_margin_start));
                metrica();
                if (this.f729l != null) {
                    EditText editText = this.f731l;
                    vip(editText != null ? editText.getText() : null);
                }
            } else {
                c17156l.mopub(this.f729l, 2);
                this.f729l = null;
            }
            this.f750l = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f743l != i) {
            if (i > 0) {
                this.f743l = i;
            } else {
                this.f743l = -1;
            }
            if (!this.f750l || this.f729l == null) {
                return;
            }
            EditText editText = this.f731l;
            vip(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f707l != i) {
            this.f707l = i;
            metrica();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f738l != colorStateList) {
            this.f738l = colorStateList;
            metrica();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f717l != i) {
            this.f717l = i;
            metrica();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f725l != colorStateList) {
            this.f725l = colorStateList;
            metrica();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f688l != colorStateList) {
            this.f688l = colorStateList;
            startapp();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f720l != colorStateList) {
            this.f720l = colorStateList;
            if (remoteconfig() || (this.f729l != null && this.f691l)) {
                startapp();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f749l = colorStateList;
        this.f739l = colorStateList;
        if (this.f731l != null) {
            Signature(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        firebase(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f694l.f24126l.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f694l.f24126l.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        C12124l c12124l = this.f694l;
        CharSequence text = i != 0 ? c12124l.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = c12124l.f24126l;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        C12124l c12124l = this.f694l;
        Drawable drawableLoadAd = i != 0 ? AbstractC13273l.loadAd(c12124l.getContext(), i) : null;
        TextInputLayout textInputLayout = c12124l.f24132l;
        CheckableImageButton checkableImageButton = c12124l.f24126l;
        checkableImageButton.setImageDrawable(drawableLoadAd);
        if (drawableLoadAd != null) {
            AbstractC11064l.yandex(textInputLayout, checkableImageButton, c12124l.f24142l, c12124l.f24139l);
            AbstractC11064l.billing(textInputLayout, checkableImageButton, c12124l.f24142l);
        }
    }

    public void setEndIconMinSize(int i) {
        C12124l c12124l = this.f694l;
        if (i < 0) {
            c12124l.getClass();
            C8339l.metrica("endIconSize cannot be less than 0");
        } else if (i != c12124l.f24124l) {
            c12124l.f24124l = i;
            CheckableImageButton checkableImageButton = c12124l.f24126l;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = c12124l.f24125l;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f694l.billing(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C12124l c12124l = this.f694l;
        CheckableImageButton checkableImageButton = c12124l.f24126l;
        View.OnLongClickListener onLongClickListener = c12124l.f24136l;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC11064l.mopub(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C12124l c12124l = this.f694l;
        c12124l.f24136l = onLongClickListener;
        CheckableImageButton checkableImageButton = c12124l.f24126l;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC11064l.mopub(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C12124l c12124l = this.f694l;
        c12124l.f24143l = scaleType;
        c12124l.f24126l.setScaleType(scaleType);
        c12124l.f24125l.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C12124l c12124l = this.f694l;
        if (c12124l.f24142l != colorStateList) {
            c12124l.f24142l = colorStateList;
            AbstractC11064l.yandex(c12124l.f24132l, c12124l.f24126l, colorStateList, c12124l.f24139l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C12124l c12124l = this.f694l;
        if (c12124l.f24139l != mode) {
            c12124l.f24139l = mode;
            AbstractC11064l.yandex(c12124l.f24132l, c12124l.f24126l, c12124l.f24142l, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f694l.mopub(z);
    }

    public void setError(CharSequence charSequence) {
        C17156l c17156l = this.f726l;
        if (!c17156l.adcel) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c17156l.billing();
            return;
        }
        c17156l.crashlytics();
        c17156l.startapp = charSequence;
        c17156l.ads.setText(charSequence);
        int i = c17156l.vip;
        if (i != 1) {
            c17156l.metrica = 1;
        }
        c17156l.subs(i, c17156l.metrica, c17156l.admob(c17156l.ads, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C17156l c17156l = this.f726l;
        c17156l.tapsense = i;
        C9189l c9189l = c17156l.ads;
        if (c9189l != null) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            c9189l.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C17156l c17156l = this.f726l;
        c17156l.subscription = charSequence;
        C9189l c9189l = c17156l.ads;
        if (c9189l != null) {
            c9189l.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C17156l c17156l = this.f726l;
        TextInputLayout textInputLayout = c17156l.admob;
        if (c17156l.adcel == z) {
            return;
        }
        c17156l.crashlytics();
        if (z) {
            C9189l c9189l = new C9189l(c17156l.mopub, null);
            c17156l.ads = c9189l;
            c9189l.setId(ua.itaysonlab.vkx.R.id.textinput_error);
            c17156l.ads.setTextAlignment(5);
            Typeface typeface = c17156l.premium;
            if (typeface != null) {
                c17156l.ads.setTypeface(typeface);
            }
            int i = c17156l.Signature;
            c17156l.Signature = i;
            C9189l c9189l2 = c17156l.ads;
            if (c9189l2 != null) {
                c17156l.admob.smaato(c9189l2, i);
            }
            ColorStateList colorStateList = c17156l.license;
            c17156l.license = colorStateList;
            C9189l c9189l3 = c17156l.ads;
            if (c9189l3 != null && colorStateList != null) {
                c9189l3.setTextColor(colorStateList);
            }
            CharSequence charSequence = c17156l.subscription;
            c17156l.subscription = charSequence;
            C9189l c9189l4 = c17156l.ads;
            if (c9189l4 != null) {
                c9189l4.setContentDescription(charSequence);
            }
            int i2 = c17156l.tapsense;
            c17156l.tapsense = i2;
            C9189l c9189l5 = c17156l.ads;
            if (c9189l5 != null) {
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                c9189l5.setAccessibilityLiveRegion(i2);
            }
            c17156l.ads.setVisibility(4);
            c17156l.yandex(c17156l.ads, 0);
        } else {
            c17156l.billing();
            c17156l.mopub(c17156l.ads, 0);
            c17156l.ads = null;
            textInputLayout.ads();
            textInputLayout.ad();
        }
        c17156l.adcel = z;
    }

    public void setErrorIconDrawable(int i) {
        C12124l c12124l = this.f694l;
        c12124l.admob(i != 0 ? AbstractC13273l.loadAd(c12124l.getContext(), i) : null);
        AbstractC11064l.billing(c12124l.f24132l, c12124l.f24125l, c12124l.f24138l);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C12124l c12124l = this.f694l;
        CheckableImageButton checkableImageButton = c12124l.f24125l;
        View.OnLongClickListener onLongClickListener = c12124l.f24141l;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC11064l.mopub(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C12124l c12124l = this.f694l;
        c12124l.f24141l = onLongClickListener;
        CheckableImageButton checkableImageButton = c12124l.f24125l;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC11064l.mopub(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C12124l c12124l = this.f694l;
        if (c12124l.f24138l != colorStateList) {
            c12124l.f24138l = colorStateList;
            AbstractC11064l.yandex(c12124l.f24132l, c12124l.f24125l, colorStateList, c12124l.f24137l);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C12124l c12124l = this.f694l;
        if (c12124l.f24137l != mode) {
            c12124l.f24137l = mode;
            AbstractC11064l.yandex(c12124l.f24132l, c12124l.f24125l, c12124l.f24138l, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C17156l c17156l = this.f726l;
        c17156l.Signature = i;
        C9189l c9189l = c17156l.ads;
        if (c9189l != null) {
            c17156l.admob.smaato(c9189l, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C17156l c17156l = this.f726l;
        c17156l.license = colorStateList;
        C9189l c9189l = c17156l.ads;
        if (c9189l == null || colorStateList == null) {
            return;
        }
        c9189l.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f742l != z) {
            this.f742l = z;
            Signature(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C17156l c17156l = this.f726l;
        if (zIsEmpty) {
            if (c17156l.ad) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c17156l.ad) {
            setHelperTextEnabled(true);
        }
        c17156l.crashlytics();
        c17156l.pro = charSequence;
        c17156l.advert.setText(charSequence);
        int i = c17156l.vip;
        if (i != 2) {
            c17156l.metrica = 2;
        }
        c17156l.subs(i, c17156l.metrica, c17156l.admob(c17156l.advert, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C17156l c17156l = this.f726l;
        c17156l.signatures = colorStateList;
        C9189l c9189l = c17156l.advert;
        if (c9189l == null || colorStateList == null) {
            return;
        }
        c9189l.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        C17156l c17156l = this.f726l;
        TextInputLayout textInputLayout = c17156l.admob;
        if (c17156l.ad == z) {
            return;
        }
        c17156l.crashlytics();
        if (z) {
            C9189l c9189l = new C9189l(c17156l.mopub, null);
            c17156l.advert = c9189l;
            c9189l.setId(ua.itaysonlab.vkx.R.id.textinput_helper_text);
            c17156l.advert.setTextAlignment(5);
            Typeface typeface = c17156l.premium;
            if (typeface != null) {
                c17156l.advert.setTypeface(typeface);
            }
            c17156l.advert.setVisibility(4);
            c17156l.advert.setAccessibilityLiveRegion(1);
            int i = c17156l.isVip;
            c17156l.isVip = i;
            C9189l c9189l2 = c17156l.advert;
            if (c9189l2 != null) {
                c9189l2.setTextAppearance(i);
            }
            ColorStateList colorStateList = c17156l.signatures;
            c17156l.signatures = colorStateList;
            C9189l c9189l3 = c17156l.advert;
            if (c9189l3 != null && colorStateList != null) {
                c9189l3.setTextColor(colorStateList);
            }
            c17156l.yandex(c17156l.advert, 1);
            c17156l.advert.setAccessibilityDelegate(new C14245l(c17156l));
        } else {
            c17156l.crashlytics();
            int i2 = c17156l.vip;
            if (i2 == 2) {
                c17156l.metrica = 0;
            }
            c17156l.subs(i2, c17156l.metrica, c17156l.admob(c17156l.advert, ""));
            c17156l.mopub(c17156l.advert, 1);
            c17156l.advert = null;
            textInputLayout.ads();
            textInputLayout.ad();
        }
        c17156l.ad = z;
    }

    public void setHelperTextTextAppearance(int i) {
        C17156l c17156l = this.f726l;
        c17156l.isVip = i;
        C9189l c9189l = c17156l.advert;
        if (c9189l != null) {
            c9189l.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f724l = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f737l) {
            this.f737l = z;
            if (z) {
                CharSequence hint = this.f731l.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f757l)) {
                        setHint(hint);
                    }
                    this.f731l.setHint((CharSequence) null);
                }
                this.f718l = true;
            } else {
                this.f718l = false;
                if (!TextUtils.isEmpty(this.f757l) && TextUtils.isEmpty(this.f731l.getHint())) {
                    this.f731l.setHint(this.f757l);
                }
                setHintInternal(null);
            }
            if (this.f731l != null) {
                tapsense();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C5844l c5844l = this.f761l;
        TextInputLayout textInputLayout = c5844l.yandex;
        C1085l c1085l = new C1085l(textInputLayout.getContext(), i);
        ColorStateList colorStateList = c1085l.isPro;
        if (colorStateList != null) {
            c5844l.firebase = colorStateList;
        }
        float f = c1085l.firebase;
        if (f != 0.0f) {
            c5844l.subs = f;
        }
        ColorStateList colorStateList2 = c1085l.yandex;
        if (colorStateList2 != null) {
            c5844l.f12308class = colorStateList2;
        }
        c5844l.f12327switch = c1085l.purchase;
        c5844l.f12309continue = c1085l.billing;
        c5844l.f12306case = c1085l.mopub;
        c5844l.f12318interface = c1085l.subs;
        C17357l c17357l = c5844l.advert;
        if (c17357l != null) {
            c17357l.amazon = true;
        }
        C10975l c10975l = new C10975l(6, c5844l);
        c1085l.yandex();
        c5844l.advert = new C17357l(c10975l, c1085l.vip);
        c1085l.crashlytics(textInputLayout.getContext(), c5844l.advert);
        c5844l.admob(false);
        this.f739l = c5844l.firebase;
        if (this.f731l != null) {
            Signature(false, false);
            tapsense();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f739l != colorStateList) {
            if (this.f749l == null) {
                C5844l c5844l = this.f761l;
                if (c5844l.firebase != colorStateList) {
                    c5844l.firebase = colorStateList;
                    c5844l.admob(false);
                }
            }
            this.f739l = colorStateList;
            if (this.f731l != null) {
                Signature(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC18070l interfaceC18070l) {
        this.f754l = interfaceC18070l;
    }

    public void setMaxEms(int i) {
        this.f695l = i;
        EditText editText = this.f731l;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f745l = i;
        EditText editText = this.f731l;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f748l = i;
        EditText editText = this.f731l;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f700l = i;
        EditText editText = this.f731l;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        C12124l c12124l = this.f694l;
        c12124l.f24126l.setContentDescription(i != 0 ? c12124l.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C12124l c12124l = this.f694l;
        c12124l.f24126l.setImageDrawable(i != 0 ? AbstractC13273l.loadAd(c12124l.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        C12124l c12124l = this.f694l;
        if (z && c12124l.f24140l != 1) {
            c12124l.billing(1);
        } else if (z) {
            c12124l.getClass();
        } else {
            c12124l.billing(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C12124l c12124l = this.f694l;
        c12124l.f24142l = colorStateList;
        AbstractC11064l.yandex(c12124l.f24132l, c12124l.f24126l, colorStateList, c12124l.f24139l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C12124l c12124l = this.f694l;
        c12124l.f24139l = mode;
        AbstractC11064l.yandex(c12124l.f24132l, c12124l.f24126l, c12124l.f24142l, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f699l == null) {
            C9189l c9189l = new C9189l(getContext(), null);
            this.f699l = c9189l;
            c9189l.setId(ua.itaysonlab.vkx.R.id.textinput_placeholder);
            this.f699l.setImportantForAccessibility(2);
            C5671l c5671lAmazon = amazon();
            this.f760l = c5671lAmazon;
            c5671lAmazon.f3363l = 67L;
            this.f710l = amazon();
            setPlaceholderTextAppearance(this.f690l);
            setPlaceholderTextColor(this.f697l);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f716l) {
                setPlaceholderTextEnabled(true);
            }
            this.f759l = charSequence;
        }
        EditText editText = this.f731l;
        license(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f690l = i;
        C9189l c9189l = this.f699l;
        if (c9189l != null) {
            c9189l.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f697l != colorStateList) {
            this.f697l = colorStateList;
            C9189l c9189l = this.f699l;
            if (c9189l == null || colorStateList == null) {
                return;
            }
            c9189l.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C7867l c7867l = this.f712l;
        c7867l.getClass();
        c7867l.f16403l = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c7867l.f16406l.setText(charSequence);
        c7867l.purchase();
    }

    public void setPrefixTextAppearance(int i) {
        this.f712l.f16406l.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f712l.f16406l.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C12564l c12564l) {
        C5022l c5022l = this.f744l;
        if (c5022l == null || c5022l.f10262l.yandex == c12564l) {
            return;
        }
        this.f706l = c12564l;
        loadAd();
    }

    public void setStartIconCheckable(boolean z) {
        this.f712l.f16410l.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC13273l.loadAd(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        C7867l c7867l = this.f712l;
        if (i < 0) {
            c7867l.getClass();
            C8339l.metrica("startIconSize cannot be less than 0");
        } else if (i != c7867l.f16404l) {
            c7867l.f16404l = i;
            CheckableImageButton checkableImageButton = c7867l.f16410l;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C7867l c7867l = this.f712l;
        CheckableImageButton checkableImageButton = c7867l.f16410l;
        View.OnLongClickListener onLongClickListener = c7867l.f16411l;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC11064l.mopub(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C7867l c7867l = this.f712l;
        c7867l.f16411l = onLongClickListener;
        CheckableImageButton checkableImageButton = c7867l.f16410l;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC11064l.mopub(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C7867l c7867l = this.f712l;
        c7867l.f16405l = scaleType;
        c7867l.f16410l.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C7867l c7867l = this.f712l;
        if (c7867l.f16409l != colorStateList) {
            c7867l.f16409l = colorStateList;
            AbstractC11064l.yandex(c7867l.f16407l, c7867l.f16410l, colorStateList, c7867l.f16412l);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C7867l c7867l = this.f712l;
        if (c7867l.f16412l != mode) {
            c7867l.f16412l = mode;
            AbstractC11064l.yandex(c7867l.f16407l, c7867l.f16410l, c7867l.f16409l, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f712l.crashlytics(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        C12124l c12124l = this.f694l;
        c12124l.getClass();
        c12124l.f24130l = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c12124l.f24134l.setText(charSequence);
        c12124l.remoteconfig();
    }

    public void setSuffixTextAppearance(int i) {
        this.f694l.f24134l.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f694l.f24134l.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C7183l c7183l) {
        EditText editText = this.f731l;
        if (editText != null) {
            AbstractC15872l.vip(editText, c7183l);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f723l) {
            this.f723l = typeface;
            this.f761l.remoteconfig(typeface);
            C17156l c17156l = this.f726l;
            if (typeface != c17156l.premium) {
                c17156l.premium = typeface;
                C9189l c9189l = c17156l.ads;
                if (c9189l != null) {
                    c9189l.setTypeface(typeface);
                }
                C9189l c9189l2 = c17156l.advert;
                if (c9189l2 != null) {
                    c9189l2.setTypeface(typeface);
                }
            }
            C9189l c9189l3 = this.f729l;
            if (c9189l3 != null) {
                c9189l3.setTypeface(typeface);
            }
        }
    }

    public final void smaato(C9189l c9189l, int i) {
        try {
            c9189l.setTextAppearance(i);
            if (c9189l.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c9189l.setTextAppearance(ua.itaysonlab.vkx.R.style.TextAppearance_AppCompat_Caption);
        c9189l.setTextColor(getContext().getColor(ua.itaysonlab.vkx.R.color.design_error));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void startapp() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.f688l;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueMopub = AbstractC17463l.mopub(context, ua.itaysonlab.vkx.R.attr.colorControlActivated);
            if (typedValueMopub != null) {
                int i = typedValueMopub.resourceId;
                if (i != 0) {
                    colorStateListValueOf = AbstractC7720l.crashlytics(context, i);
                } else {
                    int i2 = typedValueMopub.data;
                    if (i2 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i2);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.f731l;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f731l.getTextCursorDrawable().mutate();
        if ((remoteconfig() || (this.f729l != null && this.f691l)) && (colorStateList = this.f720l) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    public final void subs() {
        int i = this.f708l;
        if (i == 0) {
            this.f744l = null;
            this.f727l = null;
            this.f740l = null;
        } else if (i == 1) {
            this.f744l = new C5022l(this.f706l);
            this.f727l = new C5022l();
            this.f740l = new C5022l();
        } else {
            if (i != 2) {
                C8339l.metrica(AbstractC14814l.remoteconfig(this.f708l, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
                return;
            }
            if (!this.f737l || (this.f744l instanceof AbstractC5294l)) {
                this.f744l = new C5022l(this.f706l);
            } else {
                C12564l c12564l = this.f706l;
                int i2 = AbstractC5294l.f11407l;
                if (c12564l == null) {
                    c12564l = new C12564l();
                }
                C9107l c9107l = new C9107l(c12564l, new RectF());
                C11354l c11354l = new C11354l(c9107l);
                c11354l.f11408l = c9107l;
                this.f744l = c11354l;
            }
            this.f727l = null;
            this.f740l = null;
        }
        subscription();
        ad();
        if (this.f708l == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f692l = getResources().getDimensionPixelSize(ua.itaysonlab.vkx.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC4927l.smaato(getContext())) {
                this.f692l = getResources().getDimensionPixelSize(ua.itaysonlab.vkx.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f731l != null && this.f708l == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f731l;
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(ua.itaysonlab.vkx.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f731l.getPaddingEnd(), getResources().getDimensionPixelSize(ua.itaysonlab.vkx.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC4927l.smaato(getContext())) {
                EditText editText2 = this.f731l;
                WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(ua.itaysonlab.vkx.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f731l.getPaddingEnd(), getResources().getDimensionPixelSize(ua.itaysonlab.vkx.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f708l != 0) {
            tapsense();
        }
        EditText editText3 = this.f731l;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f708l;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void subscription() {
        EditText editText = this.f731l;
        if (editText == null || this.f744l == null) {
            return;
        }
        if ((this.f709l || editText.getBackground() == null) && this.f708l != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f731l;
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            editText2.setBackground(editTextBoxBackground);
            this.f709l = true;
        }
    }

    public final void tapsense() {
        if (this.f708l != 1) {
            FrameLayout frameLayout = this.f713l;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iCrashlytics = crashlytics();
            if (iCrashlytics != layoutParams.topMargin) {
                layoutParams.topMargin = iCrashlytics;
                frameLayout.requestLayout();
            }
        }
    }

    public final void vip(Editable editable) {
        String str;
        ((C1759l) this.f754l).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.f691l;
        int i = this.f743l;
        String string = null;
        if (i == -1) {
            this.f729l.setText(String.valueOf(length));
            this.f729l.setContentDescription(null);
            this.f691l = false;
        } else {
            this.f691l = length > i;
            Context context = getContext();
            this.f729l.setContentDescription(context.getString(this.f691l ? ua.itaysonlab.vkx.R.string.character_counter_overflowed_content_description : ua.itaysonlab.vkx.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f743l)));
            if (z != this.f691l) {
                metrica();
            }
            String str2 = C17125l.loadAd;
            C17125l c17125l = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C17125l.purchase : C17125l.amazon;
            C9189l c9189l = this.f729l;
            String string2 = getContext().getString(ua.itaysonlab.vkx.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f743l));
            c17125l.getClass();
            C6921l c6921l = AbstractC11407l.crashlytics;
            if (string2 != null) {
                String str3 = C17125l.crashlytics;
                String str4 = C17125l.loadAd;
                boolean z2 = c17125l.yandex;
                boolean zRemoteconfig = c6921l.remoteconfig(string2, string2.length());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                boolean zRemoteconfig2 = (zRemoteconfig ? AbstractC11407l.loadAd : AbstractC11407l.yandex).remoteconfig(string2, string2.length());
                if (z2 || !(zRemoteconfig2 || C17125l.yandex(string2) == 1)) {
                    str = (!z2 || (zRemoteconfig2 && C17125l.yandex(string2) != -1)) ? "" : str3;
                } else {
                    str = str4;
                }
                spannableStringBuilder.append((CharSequence) str);
                if (zRemoteconfig != z2) {
                    spannableStringBuilder.append(zRemoteconfig ? (char) 8235 : (char) 8234);
                    spannableStringBuilder.append((CharSequence) string2);
                    spannableStringBuilder.append((char) 8236);
                } else {
                    spannableStringBuilder.append((CharSequence) string2);
                }
                boolean zRemoteconfig3 = (zRemoteconfig ? AbstractC11407l.loadAd : AbstractC11407l.yandex).remoteconfig(string2, string2.length());
                if (!z2 && (zRemoteconfig3 || C17125l.loadAd(string2) == 1)) {
                    str3 = str4;
                } else if (!z2 || (zRemoteconfig3 && C17125l.loadAd(string2) != -1)) {
                    str3 = "";
                }
                spannableStringBuilder.append((CharSequence) str3);
                string = spannableStringBuilder.toString();
            }
            c9189l.setText(string);
        }
        if (this.f731l == null || z == this.f691l) {
            return;
        }
        Signature(false, false);
        ad();
        ads();
    }

    public final void yandex(float f) {
        C5844l c5844l = this.f761l;
        if (c5844l.loadAd == f) {
            return;
        }
        if (this.f714l == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f714l = valueAnimator;
            valueAnimator.setInterpolator(AbstractC15422l.admob(getContext(), ua.itaysonlab.vkx.R.attr.motionEasingEmphasizedInterpolator, AbstractC0926l.loadAd));
            this.f714l.setDuration(AbstractC15422l.mopub(getContext(), ua.itaysonlab.vkx.R.attr.motionDurationMedium4, 167));
            this.f714l.addUpdateListener(new C5551l(4, this));
        }
        this.f714l.setFloatValues(c5844l.loadAd, f);
        this.f714l.start();
    }

    public void setHint(CharSequence charSequence) {
        if (this.f737l) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f712l.f16410l;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f712l.loadAd(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f694l.f24126l.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f694l.f24126l.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f694l.f24126l;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f694l.admob(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        C12124l c12124l = this.f694l;
        TextInputLayout textInputLayout = c12124l.f24132l;
        CheckableImageButton checkableImageButton = c12124l.f24126l;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC11064l.yandex(textInputLayout, checkableImageButton, c12124l.f24142l, c12124l.f24139l);
            AbstractC11064l.billing(textInputLayout, checkableImageButton, c12124l.f24142l);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ua.itaysonlab.vkx.R.attr.textInputStyle);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }
}
