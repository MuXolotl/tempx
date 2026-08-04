package defpackage;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: lۙؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18540l extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public float f36192l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f36193l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Drawable f36194l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public float f36195l = 1.0f;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public float f36196l;

    public C18540l(Drawable drawable, int i) {
        this.f36194l = drawable;
        this.f36193l = i;
        drawable.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        try {
            canvas.translate(this.f36192l, this.f36196l);
            float f = this.f36195l;
            canvas.scale(f, f);
            this.f36194l.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f36194l.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f36194l.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f36194l.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f36194l.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f36194l.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object obj = this.f36194l;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f36194l.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f36194l;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            this.f36192l = 0.0f;
            this.f36196l = 0.0f;
            this.f36195l = 1.0f;
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dAmazon = AbstractC3105l.amazon(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f36193l, C9192l.crashlytics);
        int iAdcel = AbstractC5573l.adcel((((double) iWidth) - (((double) intrinsicWidth) * dAmazon)) / 2.0d);
        int iAdcel2 = AbstractC5573l.adcel((((double) iHeight) - (((double) intrinsicHeight) * dAmazon)) / 2.0d);
        drawable.setBounds(iAdcel, iAdcel2, intrinsicWidth + iAdcel, intrinsicHeight + iAdcel2);
        this.f36192l = rect.left;
        this.f36196l = rect.top;
        this.f36195l = (float) dAmazon;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.f36194l.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return this.f36194l.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f36194l.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f36194l.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.f36194l.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        this.f36194l.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f36194l.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f36194l.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f36194l;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f36194l;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
