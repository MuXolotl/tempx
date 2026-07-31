package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: lؕۡ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3708l extends Drawable {
    public ColorStateList admob;
    public final Rect amazon;
    public final RectF crashlytics;
    public ColorStateList isPro;
    public final Paint loadAd;
    public float purchase;
    public PorterDuffColorFilter subs;
    public float yandex;
    public boolean billing = false;
    public boolean mopub = true;
    public PorterDuff.Mode firebase = PorterDuff.Mode.SRC_IN;

    public C3708l(ColorStateList colorStateList, float f) {
        this.yandex = f;
        Paint paint = new Paint(5);
        this.loadAd = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.admob = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.admob.getDefaultColor()));
        this.crashlytics = new RectF();
        this.amazon = new Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.subs;
        Paint paint = this.loadAd;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.subs);
            z = true;
        }
        RectF rectF = this.crashlytics;
        float f = this.yandex;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.amazon, this.yandex);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.isPro;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.admob;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    public final void loadAd(Rect rect) {
        float f;
        if (rect == null) {
            rect = getBounds();
        }
        float f2 = rect.left;
        float f3 = rect.top;
        float f4 = rect.right;
        float f5 = rect.bottom;
        RectF rectF = this.crashlytics;
        rectF.set(f2, f3, f4, f5);
        Rect rect2 = this.amazon;
        rect2.set(rect);
        if (this.billing) {
            float f6 = this.purchase;
            float f7 = this.yandex;
            boolean z = this.mopub;
            if (z) {
                f = (float) (((1.0d - AbstractC0618l.yandex) * ((double) f7)) + ((double) (1.5f * f6)));
            } else {
                int i = AbstractC0618l.loadAd;
                f = 1.5f * f6;
            }
            if (z) {
                f6 = (float) (((1.0d - AbstractC0618l.yandex) * ((double) f7)) + ((double) f6));
            }
            rect2.inset((int) Math.ceil(f6), (int) Math.ceil(f));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        loadAd(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.admob;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.loadAd;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.isPro;
        if (colorStateList2 == null || (mode = this.firebase) == null) {
            return z;
        }
        this.subs = yandex(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.loadAd.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.loadAd.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.isPro = colorStateList;
        this.subs = yandex(colorStateList, this.firebase);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.firebase = mode;
        this.subs = yandex(this.isPro, mode);
        invalidateSelf();
    }

    public final PorterDuffColorFilter yandex(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
