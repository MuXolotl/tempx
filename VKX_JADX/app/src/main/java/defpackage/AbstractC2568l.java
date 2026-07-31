package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: lّؔؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2568l extends FrameLayout {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Rect f5589l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f5590l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f5591l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C10023l f5592l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Rect f5593l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final int[] f5588l = {R.attr.colorBackground};

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C6928l f5587l = new C6928l(26);

    public AbstractC2568l(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.f5589l = rect;
        this.f5593l = new Rect();
        C10023l c10023l = new C10023l();
        c10023l.f20418l = this;
        this.f5592l = c10023l;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3536l.yandex, i, ua.itaysonlab.vkx.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f5588l);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(ua.itaysonlab.vkx.R.color.cardview_light_background) : getResources().getColor(ua.itaysonlab.vkx.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f5591l = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f5590l = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        C3708l c3708l = new C3708l(colorStateListValueOf, dimension);
        c10023l.f20419l = c3708l;
        setBackgroundDrawable(c3708l);
        setClipToOutline(true);
        setElevation(dimension2);
        f5587l.smaato(c10023l, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C3708l) this.f5592l.f20419l).admob;
    }

    public float getCardElevation() {
        return ((AbstractC2568l) this.f5592l.f20418l).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f5589l.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f5589l.left;
    }

    public int getContentPaddingRight() {
        return this.f5589l.right;
    }

    public int getContentPaddingTop() {
        return this.f5589l.top;
    }

    public float getMaxCardElevation() {
        return ((C3708l) this.f5592l.f20419l).purchase;
    }

    public boolean getPreventCornerOverlap() {
        return this.f5590l;
    }

    public float getRadius() {
        return ((C3708l) this.f5592l.f20419l).yandex;
    }

    public boolean getUseCompatPadding() {
        return this.f5591l;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        C3708l c3708l = (C3708l) this.f5592l.f20419l;
        if (colorStateListValueOf == null) {
            c3708l.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        c3708l.admob = colorStateListValueOf;
        c3708l.loadAd.setColor(colorStateListValueOf.getColorForState(c3708l.getState(), c3708l.admob.getDefaultColor()));
        c3708l.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((AbstractC2568l) this.f5592l.f20418l).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        f5587l.smaato(this.f5592l, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f5590l) {
            this.f5590l = z;
            C10023l c10023l = this.f5592l;
            f5587l.smaato(c10023l, ((C3708l) c10023l.f20419l).purchase);
        }
    }

    public void setRadius(float f) {
        C3708l c3708l = (C3708l) this.f5592l.f20419l;
        if (f == c3708l.yandex) {
            return;
        }
        c3708l.yandex = f;
        c3708l.loadAd(null);
        c3708l.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f5591l != z) {
            this.f5591l = z;
            C10023l c10023l = this.f5592l;
            f5587l.smaato(c10023l, ((C3708l) c10023l.f20419l).purchase);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C3708l c3708l = (C3708l) this.f5592l.f20419l;
        if (colorStateList == null) {
            c3708l.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c3708l.admob = colorStateList;
        c3708l.loadAd.setColor(colorStateList.getColorForState(c3708l.getState(), c3708l.admob.getDefaultColor()));
        c3708l.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
