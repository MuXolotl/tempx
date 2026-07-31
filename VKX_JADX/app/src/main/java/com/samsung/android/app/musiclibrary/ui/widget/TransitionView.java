package com.samsung.android.app.musiclibrary.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import defpackage.AbstractC16759l;
import defpackage.AbstractC8576l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class TransitionView extends View {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Matrix f771l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Drawable f772l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Drawable f773l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ImageView.ScaleType f774l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public ColorFilter f775l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public Drawable f776l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public float f777l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Matrix f778l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final boolean f779l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public float f780l;

    public TransitionView(Context context) {
        super(context, null, 0, 0);
        this.f774l = ImageView.ScaleType.CENTER_CROP;
        this.f771l = new Matrix();
        this.f778l = new Matrix();
        this.f777l = 1.0f;
        this.f779l = getContext().getApplicationInfo().targetSdkVersion < 24;
    }

    public final void crashlytics(boolean z, boolean z2) {
        Log.d("TransitionView", "updateDrawableVisibility visible: " + z + " restart: " + z2);
        Drawable drawable = this.f772l;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f773l;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
    }

    public final ColorFilter getColorFilter() {
        return this.f775l;
    }

    public final Drawable getCurrentImageDrawable() {
        return this.f772l;
    }

    public final Drawable getNextImageDrawable() {
        return this.f773l;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable.equals(this.f772l) || drawable.equals(this.f773l)) {
            invalidate();
        }
    }

    public final void loadAd(Drawable drawable, Drawable drawable2, Matrix matrix) {
        boolean z;
        Log.d("TransitionView", "updateDrawable old = " + drawable + " new = " + drawable2);
        boolean z2 = this.f779l;
        if (drawable != null) {
            z = drawable == drawable2;
            drawable.setCallback(null);
            unscheduleDrawable(drawable);
            if (!z2 && !z && isAttachedToWindow()) {
                Log.d("TransitionView", "hide old: " + drawable);
                drawable.setVisible(false, false);
            }
        } else {
            z = false;
        }
        if (drawable2 != null) {
            drawable2.setCallback(this);
            drawable2.setLayoutDirection(getLayoutDirection());
            if (drawable2.isStateful()) {
                drawable2.setState(getDrawableState());
            }
            if (!z || z2) {
                if (z2) {
                    Log.d("TransitionView", "show new: false");
                    drawable2.setVisible(false, true);
                    drawable2.setColorFilter(this.f775l);
                } else {
                    Log.d("TransitionView", "show new: false");
                    drawable2.setVisible(false, true);
                    drawable2.setColorFilter(this.f775l);
                }
                Log.d("TransitionView", "show new: true");
                drawable2.setVisible(true, true);
                drawable2.setColorFilter(this.f775l);
            }
            AbstractC16759l.loadAd(drawable2, matrix, getMeasuredWidth(), getMeasuredHeight(), this.f774l);
        }
        if (drawable == null || drawable2 == null) {
            Log.d("TransitionView", "requestLayout 1");
            requestLayout();
        } else {
            if (drawable.getIntrinsicWidth() == drawable2.getIntrinsicWidth() && drawable.getIntrinsicHeight() == drawable2.getIntrinsicHeight()) {
                return;
            }
            Log.d("TransitionView", "requestLayout 1");
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f779l) {
            crashlytics(true, false);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f779l) {
            crashlytics(false, false);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.f772l;
        if (drawable != null) {
            yandex(canvas, drawable, this.f771l, this.f777l);
        }
        Drawable drawable2 = this.f773l;
        if (drawable2 != null) {
            yandex(canvas, drawable2, this.f778l, this.f780l * this.f777l);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Drawable drawable = this.f772l;
        ImageView.ScaleType scaleType = this.f774l;
        if (drawable != null) {
            AbstractC16759l.loadAd(drawable, this.f771l, getMeasuredWidth(), getMeasuredHeight(), scaleType);
        }
        Drawable drawable2 = this.f773l;
        if (drawable2 != null) {
            AbstractC16759l.loadAd(drawable2, this.f778l, getMeasuredWidth(), getMeasuredHeight(), scaleType);
        }
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        if (this.f779l) {
            return;
        }
        crashlytics(z, false);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        this.f777l = f;
        Drawable drawable = this.f776l;
        if (drawable != null) {
            drawable.setAlpha((int) (f * 255.0f));
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        this.f776l = drawable;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f775l = colorFilter;
        Drawable drawable = this.f773l;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f772l;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
        invalidate();
    }

    public final void setCurrentImageDrawable(Drawable drawable) {
        Log.d("TransitionView", "setImageDrawable drawable: " + drawable);
        if (AbstractC8576l.yandex(this.f772l, drawable)) {
            return;
        }
        loadAd(this.f772l, drawable, this.f771l);
        this.f772l = drawable;
        invalidate();
    }

    @Keep
    public final void setFraction(float f) {
        this.f780l = f;
        invalidate();
    }

    public final void setNextImageDrawable(Drawable drawable) {
        Log.d("TransitionView", "setNextImageDrawable drawable: " + drawable);
        if (AbstractC8576l.yandex(this.f773l, drawable)) {
            return;
        }
        loadAd(this.f773l, drawable, this.f778l);
        this.f773l = drawable;
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Log.d("TransitionView", "setVisibility visibility: " + i + " it mean: " + z);
        if (this.f779l) {
            crashlytics(z, true);
        }
    }

    public final void yandex(Canvas canvas, Drawable drawable, Matrix matrix, float f) {
        int iSave = canvas.save();
        try {
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (!matrix.isIdentity()) {
                canvas.concat(matrix);
            }
            drawable.setAlpha((int) (f * 255.0f));
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final void setColorFilter(int i) {
        setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
    }
}
