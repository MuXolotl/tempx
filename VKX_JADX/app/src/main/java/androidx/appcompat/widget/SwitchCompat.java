package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import defpackage.AbstractC1035l;
import defpackage.AbstractC11452l;
import defpackage.AbstractC13273l;
import defpackage.AbstractC14657l;
import defpackage.AbstractC15872l;
import defpackage.AbstractC15958l;
import defpackage.AbstractC2341l;
import defpackage.AbstractC6725l;
import defpackage.AbstractC7720l;
import defpackage.C10001l;
import defpackage.C10550l;
import defpackage.C10899l;
import defpackage.C12304l;
import defpackage.C12418l;
import defpackage.C16030l;
import defpackage.C4718l;
import defpackage.C4844l;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public int f185l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public int f186l;

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public final C10001l f187l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public float f188l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f189l;

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public C4844l f190l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public PorterDuff.Mode f191l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public ColorStateList f192l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final int f193l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public int f194l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public PorterDuff.Mode f195l;

    /* JADX INFO: renamed from: lؕۦؓ, reason: contains not printable characters */
    public ObjectAnimator f196l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public StaticLayout f197l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public CharSequence f198l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public C16030l f199l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public final TextPaint f200l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final VelocityTracker f201l;

    /* JADX INFO: renamed from: lؗ۟ۤ, reason: contains not printable characters */
    public final Rect f202l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public ColorStateList f203l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Drawable f204l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f205l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public CharSequence f206l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public int f207l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public int f208l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final int f209l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f210l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public final ColorStateList f211l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public CharSequence f212l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f213l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f214l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public int f215l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public float f216l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public StaticLayout f217l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f218l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public int f219l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f220l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Drawable f221l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f222l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public boolean f223l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public boolean f224l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public int f225l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public CharSequence f226l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public float f227l;

    /* JADX INFO: renamed from: lِِٞ, reason: contains not printable characters */
    public static final C10550l f184l = new C10550l(9, Float.class, "thumbPos");

    /* JADX INFO: renamed from: lُؚؓ, reason: contains not printable characters */
    public static final int[] f183l = {R.attr.state_checked};

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, i);
        this.f203l = null;
        this.f191l = null;
        this.f214l = false;
        this.f213l = false;
        this.f192l = null;
        this.f195l = null;
        this.f220l = false;
        this.f210l = false;
        this.f201l = VelocityTracker.obtain();
        this.f223l = true;
        this.f202l = new Rect();
        AbstractC1035l.yandex(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f200l = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC14657l.license;
        C12418l c12418lPro = C12418l.pro(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c12418lPro.f24518l;
        AbstractC15872l.remoteconfig(this, context, iArr, attributeSet, typedArray, i);
        Drawable drawableAds = c12418lPro.ads(2);
        this.f204l = drawableAds;
        if (drawableAds != null) {
            drawableAds.setCallback(this);
        }
        Drawable drawableAds2 = c12418lPro.ads(11);
        this.f221l = drawableAds2;
        if (drawableAds2 != null) {
            drawableAds2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f205l = typedArray.getBoolean(3, true);
        this.f222l = typedArray.getDimensionPixelSize(8, 0);
        this.f218l = typedArray.getDimensionPixelSize(5, 0);
        this.f189l = typedArray.getDimensionPixelSize(6, 0);
        this.f224l = typedArray.getBoolean(4, false);
        ColorStateList colorStateListAdcel = c12418lPro.adcel(9);
        if (colorStateListAdcel != null) {
            this.f203l = colorStateListAdcel;
            this.f214l = true;
        }
        PorterDuff.Mode modeCrashlytics = AbstractC2341l.crashlytics(typedArray.getInt(10, -1), null);
        if (this.f191l != modeCrashlytics) {
            this.f191l = modeCrashlytics;
            this.f213l = true;
        }
        if (this.f214l || this.f213l) {
            yandex();
        }
        ColorStateList colorStateListAdcel2 = c12418lPro.adcel(12);
        if (colorStateListAdcel2 != null) {
            this.f192l = colorStateListAdcel2;
            this.f220l = true;
        }
        PorterDuff.Mode modeCrashlytics2 = AbstractC2341l.crashlytics(typedArray.getInt(13, -1), null);
        if (this.f195l != modeCrashlytics2) {
            this.f195l = modeCrashlytics2;
            this.f210l = true;
        }
        if (this.f220l || this.f210l) {
            loadAd();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC14657l.pro);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = AbstractC7720l.crashlytics(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f211l = colorStateList;
            } else {
                this.f211l = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i2 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i3 = typedArrayObtainStyledAttributes.getInt(2, -1);
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i2 != 2) {
                typeface = i2 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i3 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i3) : Typeface.create(typeface, i3);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i4 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i3;
                textPaint.setFakeBoldText((i4 & 1) != 0);
                textPaint.setTextSkewX((2 & i4) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C10001l c10001l = new C10001l();
                c10001l.f20400l = context2.getResources().getConfiguration().locale;
                this.f187l = c10001l;
            } else {
                this.f187l = null;
            }
            setTextOnInternal(this.f212l);
            setTextOffInternal(this.f206l);
            typedArrayObtainStyledAttributes.recycle();
        }
        new C10899l(this).billing(attributeSet, i);
        c12418lPro.advert();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f193l = viewConfiguration.getScaledTouchSlop();
        this.f209l = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().loadAd(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C16030l getEmojiTextViewHelper() {
        if (this.f199l == null) {
            this.f199l = new C16030l(this);
        }
        return this.f199l;
    }

    private boolean getTargetCheckedState() {
        return this.f216l > 0.5f;
    }

    private int getThumbOffset() {
        boolean z = AbstractC15958l.yandex;
        int layoutDirection = getLayoutDirection();
        float f = this.f216l;
        if (layoutDirection == 1) {
            f = 1.0f - f;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f221l;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f202l;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f204l;
        Rect rectLoadAd = drawable2 != null ? AbstractC2341l.loadAd(drawable2) : AbstractC2341l.crashlytics;
        return ((((this.f186l - this.f215l) - rect.left) - rect.right) - rectLoadAd.left) - rectLoadAd.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f206l = charSequence;
        TransformationMethod transformationMethodIsPro = ((AbstractC6725l) getEmojiTextViewHelper().loadAd.f7072l).isPro(this.f187l);
        if (transformationMethodIsPro != null) {
            charSequence = transformationMethodIsPro.getTransformation(charSequence, this);
        }
        this.f226l = charSequence;
        this.f197l = null;
        if (this.f205l) {
            amazon();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f212l = charSequence;
        TransformationMethod transformationMethodIsPro = ((AbstractC6725l) getEmojiTextViewHelper().loadAd.f7072l).isPro(this.f187l);
        if (transformationMethodIsPro != null) {
            charSequence = transformationMethodIsPro.getTransformation(charSequence, this);
        }
        this.f198l = charSequence;
        this.f217l = null;
        if (this.f205l) {
            amazon();
        }
    }

    public final void amazon() {
        if (this.f190l == null && ((AbstractC6725l) this.f199l.loadAd.f7072l).amazon() && C12304l.amazon()) {
            C12304l c12304lYandex = C12304l.yandex();
            int iCrashlytics = c12304lYandex.crashlytics();
            if (iCrashlytics == 3 || iCrashlytics == 0) {
                C4844l c4844l = new C4844l(this);
                this.f190l = c4844l;
                c12304lYandex.admob(c4844l);
            }
        }
    }

    public final void crashlytics() {
        setTextOnInternal(this.f212l);
        setTextOffInternal(this.f206l);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.f225l;
        int i4 = this.f207l;
        int i5 = this.f219l;
        int i6 = this.f185l;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f204l;
        Rect rectLoadAd = drawable != null ? AbstractC2341l.loadAd(drawable) : AbstractC2341l.crashlytics;
        Drawable drawable2 = this.f221l;
        Rect rect = this.f202l;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectLoadAd != null) {
                int i8 = rectLoadAd.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectLoadAd.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectLoadAd.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectLoadAd.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.f221l.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f221l.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f204l;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f215l + rect.right;
            this.f204l.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f204l;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.f221l;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f204l;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f221l;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z = AbstractC15958l.yandex;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f186l;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f189l : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z = AbstractC15958l.yandex;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f186l;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f189l : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC11452l.isPro(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f205l;
    }

    public boolean getSplitTrack() {
        return this.f224l;
    }

    public int getSwitchMinWidth() {
        return this.f218l;
    }

    public int getSwitchPadding() {
        return this.f189l;
    }

    public CharSequence getTextOff() {
        return this.f206l;
    }

    public CharSequence getTextOn() {
        return this.f212l;
    }

    public Drawable getThumbDrawable() {
        return this.f204l;
    }

    public final float getThumbPosition() {
        return this.f216l;
    }

    public int getThumbTextPadding() {
        return this.f222l;
    }

    public ColorStateList getThumbTintList() {
        return this.f203l;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f191l;
    }

    public Drawable getTrackDrawable() {
        return this.f221l;
    }

    public ColorStateList getTrackTintList() {
        return this.f192l;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f195l;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f204l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f221l;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f196l;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f196l.end();
        this.f196l = null;
    }

    public final void loadAd() {
        Drawable drawable = this.f221l;
        if (drawable != null) {
            if (this.f220l || this.f210l) {
                Drawable drawableMutate = drawable.mutate();
                this.f221l = drawableMutate;
                if (this.f220l) {
                    drawableMutate.setTintList(this.f192l);
                }
                if (this.f210l) {
                    this.f221l.setTintMode(this.f195l);
                }
                if (this.f221l.isStateful()) {
                    this.f221l.setState(getDrawableState());
                }
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f183l);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f221l;
        Rect rect = this.f202l;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f207l;
        int i2 = this.f185l;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f204l;
        if (drawable != null) {
            if (!this.f224l || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectLoadAd = AbstractC2341l.loadAd(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectLoadAd.left;
                rect.right -= rectLoadAd.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f217l : this.f197l;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.f200l;
            ColorStateList colorStateList = this.f211l;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f212l : this.f206l;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.f204l != null) {
            Drawable drawable = this.f221l;
            Rect rect = this.f202l;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectLoadAd = AbstractC2341l.loadAd(this.f204l);
            iMax = Math.max(0, rectLoadAd.left - rect.left);
            iMax2 = Math.max(0, rectLoadAd.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z2 = AbstractC15958l.yandex;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f186l + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f186l) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.f208l;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f208l + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f208l;
        }
        this.f225l = paddingLeft;
        this.f207l = paddingTop;
        this.f185l = height;
        this.f219l = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.f205l) {
            StaticLayout staticLayout = this.f217l;
            TextPaint textPaint = this.f200l;
            if (staticLayout == null) {
                CharSequence charSequence = this.f198l;
                this.f217l = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f197l == null) {
                CharSequence charSequence2 = this.f226l;
                this.f197l = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f204l;
        Rect rect = this.f202l;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f204l.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f204l.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.f205l) {
            iMax = (this.f222l * 2) + Math.max(this.f217l.getWidth(), this.f197l.getWidth());
        } else {
            iMax = 0;
        }
        this.f215l = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f221l;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f221l.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f204l;
        if (drawable3 != null) {
            Rect rectLoadAd = AbstractC2341l.loadAd(drawable3);
            iMax2 = Math.max(iMax2, rectLoadAd.left);
            iMax3 = Math.max(iMax3, rectLoadAd.right);
        }
        boolean z = this.f223l;
        int iMax4 = this.f218l;
        if (z) {
            iMax4 = Math.max(iMax4, (this.f215l * 2) + iMax2 + iMax3);
        }
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f186l = iMax4;
        this.f208l = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f212l : this.f206l;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f;
        VelocityTracker velocityTracker = this.f201l;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f193l;
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked == 1) {
                if (this.f194l == 2) {
                    this.f194l = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.f209l) {
                            boolean z2 = AbstractC15958l.yandex;
                            targetCheckedState = getLayoutDirection() == 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f194l = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i2 = this.f194l;
                if (i2 == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float f3 = i;
                    if (Math.abs(x - this.f188l) > f3 || Math.abs(y - this.f227l) > f3) {
                        this.f194l = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f188l = x;
                        this.f227l = y;
                        return true;
                    }
                } else if (i2 == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f4 = x2 - this.f188l;
                    if (thumbScrollRange != 0) {
                        f = f4 / thumbScrollRange;
                    } else {
                        f = f4 > 0.0f ? 1.0f : -1.0f;
                    }
                    boolean z3 = AbstractC15958l.yandex;
                    if (getLayoutDirection() == 1) {
                        f = -f;
                    }
                    float f5 = this.f216l;
                    float f6 = f + f5;
                    if (f6 >= 0.0f) {
                        f2 = f6 > 1.0f ? 1.0f : f6;
                    }
                    if (f2 != f5) {
                        this.f188l = x2;
                        setThumbPosition(f2);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.f194l == 2) {
                    this.f194l = 0;
                    if (motionEvent.getAction() == 1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.f209l) {
                            boolean z4 = AbstractC15958l.yandex;
                            if (getLayoutDirection() == 1) {
                            }
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f194l = 0;
                velocityTracker.clear();
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.f204l != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f204l;
                Rect rect = this.f202l;
                drawable.getPadding(rect);
                int i3 = this.f207l - i;
                int i4 = (this.f225l + thumbOffset) - i;
                int i5 = this.f215l + i4 + rect.left + rect.right + i;
                int i6 = this.f185l + i;
                if (x3 > i4 && x3 < i5 && y2 > i3 && y2 < i6) {
                    this.f194l = 1;
                    this.f188l = x3;
                    this.f227l = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().crashlytics(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f212l;
                if (string == null) {
                    string = getResources().getString(ua.itaysonlab.vkx.R.string.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                new C4718l(ua.itaysonlab.vkx.R.id.tag_state_description, CharSequence.class, 64, 30, 2).mopub(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f206l;
            if (string2 == null) {
                string2 = getResources().getString(ua.itaysonlab.vkx.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
            new C4718l(ua.itaysonlab.vkx.R.id.tag_state_description, CharSequence.class, 64, 30, 2).mopub(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f196l;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f184l, zIsChecked ? 1.0f : 0.0f);
        this.f196l = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f196l.setAutoCancel(true);
        this.f196l.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC11452l.smaato(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().amazon(z);
        setTextOnInternal(this.f212l);
        setTextOffInternal(this.f206l);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f223l = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().yandex(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f205l != z) {
            this.f205l = z;
            requestLayout();
            if (z) {
                amazon();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f224l = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f218l = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f189l = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f200l;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f206l;
        if (string == null) {
            string = getResources().getString(ua.itaysonlab.vkx.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        new C4718l(ua.itaysonlab.vkx.R.id.tag_state_description, CharSequence.class, 64, 30, 2).mopub(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f212l;
        if (string == null) {
            string = getResources().getString(ua.itaysonlab.vkx.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        new C4718l(ua.itaysonlab.vkx.R.id.tag_state_description, CharSequence.class, 64, 30, 2).mopub(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f204l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f204l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f216l = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(AbstractC13273l.loadAd(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f222l = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f203l = colorStateList;
        this.f214l = true;
        yandex();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f191l = mode;
        this.f213l = true;
        yandex();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f221l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f221l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(AbstractC13273l.loadAd(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f192l = colorStateList;
        this.f220l = true;
        loadAd();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f195l = mode;
        this.f210l = true;
        loadAd();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f204l || drawable == this.f221l;
    }

    public final void yandex() {
        Drawable drawable = this.f204l;
        if (drawable != null) {
            if (this.f214l || this.f213l) {
                Drawable drawableMutate = drawable.mutate();
                this.f204l = drawableMutate;
                if (this.f214l) {
                    drawableMutate.setTintList(this.f203l);
                }
                if (this.f213l) {
                    this.f204l.setTintMode(this.f191l);
                }
                if (this.f204l.isStateful()) {
                    this.f204l.setState(getDrawableState());
                }
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ua.itaysonlab.vkx.R.attr.switchStyle);
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }
}
