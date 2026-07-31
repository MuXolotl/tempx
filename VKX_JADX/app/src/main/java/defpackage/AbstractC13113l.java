package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lَْؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13113l extends SwitchCompat {

    /* JADX INFO: renamed from: lؚؕؒ, reason: contains not printable characters */
    public static final int[][] f25643l = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: lؔؕؖ, reason: contains not printable characters */
    public final C4079l f25644l;

    /* JADX INFO: renamed from: lؕۗؗ, reason: contains not printable characters */
    public boolean f25645l;

    /* JADX INFO: renamed from: lٖ٘ۘ, reason: contains not printable characters */
    public ColorStateList f25646l;

    /* JADX INFO: renamed from: l٘ٚؒ, reason: contains not printable characters */
    public ColorStateList f25647l;

    public AbstractC13113l(Context context, AttributeSet attributeSet, int i) {
        super(AbstractC12953l.adcel(context, attributeSet, ua.itaysonlab.vkx.R.attr.switchStyle, ua.itaysonlab.vkx.R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet, ua.itaysonlab.vkx.R.attr.switchStyle);
        Context context2 = getContext();
        this.f25644l = new C4079l(context2);
        AbstractC8960l.amazon(context2, attributeSet, ua.itaysonlab.vkx.R.attr.switchStyle, ua.itaysonlab.vkx.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        int[] iArr = AbstractC4548l.ad;
        AbstractC8960l.purchase(context2, attributeSet, iArr, ua.itaysonlab.vkx.R.attr.switchStyle, ua.itaysonlab.vkx.R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, ua.itaysonlab.vkx.R.attr.switchStyle, ua.itaysonlab.vkx.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        this.f25645l = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f25646l == null) {
            int iMetrica = AbstractC6689l.metrica(this, ua.itaysonlab.vkx.R.attr.colorSurface);
            int iMetrica2 = AbstractC6689l.metrica(this, ua.itaysonlab.vkx.R.attr.colorControlActivated);
            float dimension = getResources().getDimension(ua.itaysonlab.vkx.R.dimen.mtrl_switch_thumb_elevation);
            C4079l c4079l = this.f25644l;
            if (c4079l.yandex) {
                float elevation = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    WeakHashMap weakHashMap = AbstractC15872l.yandex;
                    elevation += ((View) parent).getElevation();
                }
                dimension += elevation;
            }
            int iYandex = c4079l.yandex(iMetrica, dimension);
            this.f25646l = new ColorStateList(f25643l, new int[]{AbstractC6689l.startapp(iMetrica, 1.0f, iMetrica2), iYandex, AbstractC6689l.startapp(iMetrica, 0.38f, iMetrica2), iYandex});
        }
        return this.f25646l;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f25647l == null) {
            int iMetrica = AbstractC6689l.metrica(this, ua.itaysonlab.vkx.R.attr.colorSurface);
            int iMetrica2 = AbstractC6689l.metrica(this, ua.itaysonlab.vkx.R.attr.colorControlActivated);
            int iMetrica3 = AbstractC6689l.metrica(this, ua.itaysonlab.vkx.R.attr.colorOnSurface);
            this.f25647l = new ColorStateList(f25643l, new int[]{AbstractC6689l.startapp(iMetrica, 0.54f, iMetrica2), AbstractC6689l.startapp(iMetrica, 0.32f, iMetrica3), AbstractC6689l.startapp(iMetrica, 0.12f, iMetrica2), AbstractC6689l.startapp(iMetrica, 0.12f, iMetrica3)});
        }
        return this.f25647l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f25645l && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f25645l && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f25645l = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }
}
