package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.xmlpull.v1.XmlPullParserException;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؘ۟ٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5997l extends C13798l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public CompoundButton.OnCheckedChangeListener f12729l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public Drawable f12730l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public ColorStateList f12731l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public CharSequence f12732l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public boolean f12733l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f12734l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public ColorStateList f12735l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C14228l f12736l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public int[] f12737l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public PorterDuff.Mode f12738l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f12739l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public ColorStateList f12740l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final LinkedHashSet f12741l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public Drawable f12742l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f12743l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final LinkedHashSet f12744l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public CharSequence f12745l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public boolean f12746l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public int f12747l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C9437l f12748l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static final int[] f12727l = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public static final int[] f12728l = {R.attr.state_error};

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public static final int[][] f12725l = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public static final int f12726l = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public C5997l(Context context, AttributeSet attributeSet) throws Throwable {
        C9437l c9437l;
        int next;
        super(AbstractC12953l.adcel(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet);
        this.f12741l = new LinkedHashSet();
        this.f12744l = new LinkedHashSet();
        Context context2 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            c9437l = new C9437l(context2, 0);
            Resources resources = context2.getResources();
            Resources.Theme theme = context2.getTheme();
            ThreadLocal threadLocal = AbstractC7525l.yandex;
            Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
            drawable.setCallback(c9437l.f19302l);
            new C12751l(drawable.getConstantState());
            c9437l.f27961l = drawable;
        } else {
            int i = C9437l.f19297l;
            try {
                XmlResourceParser xml = context2.getResources().getXml(R.drawable.mtrl_checkbox_button_checked_unchecked);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                Resources resources2 = context2.getResources();
                Resources.Theme theme2 = context2.getTheme();
                C9437l c9437l2 = new C9437l(context2, 0);
                c9437l2.inflate(resources2, xml, attributeSetAsAttributeSet, theme2);
                c9437l = c9437l2;
            } catch (IOException e) {
                Log.e("AnimatedVDCompat", "parser error", e);
                c9437l = null;
            } catch (XmlPullParserException e2) {
                Log.e("AnimatedVDCompat", "parser error", e2);
                c9437l = null;
            }
        }
        this.f12748l = c9437l;
        this.f12736l = new C14228l(this, 2);
        Context context3 = getContext();
        this.f12742l = getButtonDrawable();
        this.f12740l = getSuperButtonTintList();
        setSupportButtonTintList(null);
        AbstractC8960l.amazon(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = AbstractC4548l.metrica;
        AbstractC8960l.purchase(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C12418l c12418l = new C12418l(context3, typedArrayObtainStyledAttributes);
        this.f12730l = c12418l.ads(2);
        if (this.f12742l != null && AbstractC17463l.admob(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f12726l && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f12742l = AbstractC13273l.loadAd(context3, R.drawable.mtrl_checkbox_button);
                this.f12746l = true;
                if (this.f12730l == null) {
                    this.f12730l = AbstractC13273l.loadAd(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f12735l = AbstractC4927l.admob(context3, c12418l, 3);
        this.f12738l = AbstractC0545l.amazon(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f12734l = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.f12743l = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f12739l = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f12745l = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        c12418l.advert();
        yandex();
    }

    private String getButtonStateDescription() {
        int i = this.f12747l;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f12731l == null) {
            int iMetrica = AbstractC6689l.metrica(this, R.attr.colorControlActivated);
            int iMetrica2 = AbstractC6689l.metrica(this, R.attr.colorError);
            int iMetrica3 = AbstractC6689l.metrica(this, R.attr.colorSurface);
            int iMetrica4 = AbstractC6689l.metrica(this, R.attr.colorOnSurface);
            this.f12731l = new ColorStateList(f12725l, new int[]{AbstractC6689l.startapp(iMetrica3, 1.0f, iMetrica2), AbstractC6689l.startapp(iMetrica3, 1.0f, iMetrica), AbstractC6689l.startapp(iMetrica3, 0.54f, iMetrica4), AbstractC6689l.startapp(iMetrica3, 0.38f, iMetrica4), AbstractC6689l.startapp(iMetrica3, 0.38f, iMetrica4)});
        }
        return this.f12731l;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f12740l;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f12742l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f12730l;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f12735l;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f12738l;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f12740l;
    }

    public int getCheckedState() {
        return this.f12747l;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f12745l;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f12747l == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12734l && this.f12740l == null && this.f12735l == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12727l);
        }
        if (this.f12739l) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12728l);
        }
        for (int i2 = 0; i2 < iArrOnCreateDrawableState.length; i2++) {
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
            }
            this.f12737l = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.f12737l = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f12743l || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (AbstractC0545l.crashlytics(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f12739l) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f12745l));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C6617l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C6617l c6617l = (C6617l) parcelable;
        super.onRestoreInstanceState(c6617l.getSuperState());
        setCheckedState(c6617l.f13854l);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C6617l c6617l = new C6617l(super.onSaveInstanceState());
        c6617l.f13854l = getCheckedState();
        return c6617l;
    }

    @Override // defpackage.C13798l, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC13273l.loadAd(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f12730l = drawable;
        yandex();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC13273l.loadAd(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f12735l == colorStateList) {
            return;
        }
        this.f12735l = colorStateList;
        yandex();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f12738l == mode) {
            return;
        }
        this.f12738l = mode;
        yandex();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f12740l == colorStateList) {
            return;
        }
        this.f12740l = colorStateList;
        yandex();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        yandex();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f12743l = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManagerAmazon;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f12747l != i) {
            this.f12747l = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.f12732l == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f12733l) {
                return;
            }
            this.f12733l = true;
            LinkedHashSet linkedHashSet = this.f12744l;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC15560l.adcel(it);
                }
            }
            if (this.f12747l != 2 && (onCheckedChangeListener = this.f12729l) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManagerAmazon = C18073l.amazon(getContext().getSystemService(C18073l.billing()))) != null) {
                autofillManagerAmazon.notifyValueChanged(this);
            }
            this.f12733l = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f12745l = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f12739l == z) {
            return;
        }
        this.f12739l = z;
        refreshDrawableState();
        Iterator it = this.f12741l.iterator();
        if (it.hasNext()) {
            throw AbstractC15560l.adcel(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f12729l = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f12732l = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f12734l = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    public final void yandex() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C7538l c7538l;
        Drawable drawableMutate = this.f12742l;
        ColorStateList colorStateList3 = this.f12740l;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.f12742l = drawableMutate;
        Drawable drawableMutate2 = this.f12730l;
        ColorStateList colorStateList4 = this.f12735l;
        PorterDuff.Mode mode = this.f12738l;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.f12730l = drawableMutate2;
        if (this.f12746l) {
            C9437l c9437l = this.f12748l;
            if (c9437l != null) {
                C5525l c5525l = c9437l.f19299l;
                C14228l c14228l = this.f12736l;
                if (c14228l != null) {
                    Drawable drawable = c9437l.f27961l;
                    if (drawable != null) {
                        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                        if (c14228l.yandex == null) {
                            c14228l.yandex = new C11006l(c14228l);
                        }
                        AbstractC9195l.crashlytics(animatedVectorDrawable, c14228l.yandex);
                    }
                    ArrayList arrayList = c9437l.f19300l;
                    if (arrayList != null) {
                        arrayList.remove(c14228l);
                        if (c9437l.f19300l.size() == 0 && (c7538l = c9437l.f19301l) != null) {
                            c5525l.loadAd.removeListener(c7538l);
                            c9437l.f19301l = null;
                        }
                    }
                }
                if (c14228l != null) {
                    Drawable drawable2 = c9437l.f27961l;
                    if (drawable2 != null) {
                        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                        if (c14228l.yandex == null) {
                            c14228l.yandex = new C11006l(c14228l);
                        }
                        AbstractC9195l.loadAd(animatedVectorDrawable2, c14228l.yandex);
                    } else {
                        if (c9437l.f19300l == null) {
                            c9437l.f19300l = new ArrayList();
                        }
                        if (!c9437l.f19300l.contains(c14228l)) {
                            c9437l.f19300l.add(c14228l);
                            if (c9437l.f19301l == null) {
                                c9437l.f19301l = new C7538l(1, c9437l);
                            }
                            c5525l.loadAd.addListener(c9437l.f19301l);
                        }
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.f12742l;
                if ((drawable3 instanceof AnimatedStateListDrawable) && c9437l != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, c9437l, false);
                    ((AnimatedStateListDrawable) this.f12742l).addTransition(R.id.indeterminate, R.id.unchecked, c9437l, false);
                }
            }
        }
        Drawable drawable4 = this.f12742l;
        if (drawable4 != null && (colorStateList2 = this.f12740l) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f12730l;
        if (drawable5 != null && (colorStateList = this.f12735l) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.f12742l;
        Drawable drawable7 = this.f12730l;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // defpackage.C13798l, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f12742l = drawable;
        this.f12746l = false;
        yandex();
    }
}
