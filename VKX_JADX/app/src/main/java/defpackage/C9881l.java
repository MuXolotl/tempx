package defpackage;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٍۡۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9881l extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f20103l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public long f20104l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f20105l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f20106l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f20107l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public Drawable f20108l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f20109l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ArrayList f20110l = new ArrayList();

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f20111l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f20112l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final Drawable f20113l;

    public C9881l(Drawable drawable, Drawable drawable2, int i, int i2, boolean z) {
        this.f20107l = i;
        this.f20106l = i2;
        this.f20103l = z;
        this.f20109l = yandex(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.f20112l = yandex(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.f20105l = 255;
        this.f20108l = drawable != null ? drawable.mutate() : null;
        Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
        this.f20113l = drawableMutate;
        if (i2 <= 0) {
            C8339l.metrica("durationMillis must be > 0.");
            throw null;
        }
        Drawable drawable3 = this.f20108l;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        if (drawableMutate != null) {
            drawableMutate.setCallback(this);
        }
    }

    public final void crashlytics(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dAmazon = AbstractC3105l.amazon(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f20107l, C9192l.crashlytics);
        int iAdcel = AbstractC5573l.adcel((((double) iWidth) - (((double) intrinsicWidth) * dAmazon)) / 2.0d);
        int iAdcel2 = AbstractC5573l.adcel((((double) iHeight) - (dAmazon * ((double) intrinsicHeight))) / 2.0d);
        drawable.setBounds(rect.left + iAdcel, rect.top + iAdcel2, rect.right - iAdcel, rect.bottom - iAdcel2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        int i = this.f20111l;
        if (i == 0) {
            Drawable drawable2 = this.f20108l;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f20105l);
                int iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            return;
        }
        Drawable drawable3 = this.f20113l;
        if (i == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.f20105l);
                int iSave2 = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave2);
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.f20104l) / ((double) this.f20106l);
        double dCrashlytics = AbstractC8576l.crashlytics(dUptimeMillis, 0.0d, 1.0d);
        int i2 = this.f20105l;
        int i3 = (int) (dCrashlytics * ((double) i2));
        if (this.f20103l) {
            i2 -= i3;
        }
        boolean z = dUptimeMillis >= 1.0d;
        if (!z && (drawable = this.f20108l) != null) {
            drawable.setAlpha(i2);
            int iSave3 = canvas.save();
            try {
                drawable.draw(canvas);
                canvas.restoreToCount(iSave3);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave3);
                throw th;
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i3);
            int iSave4 = canvas.save();
            try {
                drawable3.draw(canvas);
                canvas.restoreToCount(iSave4);
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave4);
                throw th2;
            }
        }
        if (z) {
            loadAd();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f20105l;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i = this.f20111l;
        if (i == 0) {
            Drawable drawable = this.f20108l;
            if (drawable != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable2 = this.f20113l;
        if (i != 1) {
            if (i == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable3 = this.f20108l;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f20112l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f20109l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f20108l;
        int i = this.f20111l;
        if (i == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.f20113l;
        if (i == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f20111l == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f20108l;
        if (drawable != null ? drawable.isStateful() : false) {
            return true;
        }
        Drawable drawable2 = this.f20113l;
        return drawable2 != null ? drawable2.isStateful() : false;
    }

    public final void loadAd() {
        this.f20111l = 2;
        this.f20108l = null;
        ArrayList arrayList = this.f20110l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC5287l) arrayList.get(i)).yandex(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f20108l;
        if (drawable != null) {
            crashlytics(drawable, rect);
        }
        Drawable drawable2 = this.f20113l;
        if (drawable2 != null) {
            crashlytics(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f20108l;
        boolean level = drawable != null ? drawable.setLevel(i) : false;
        Drawable drawable2 = this.f20113l;
        return level || (drawable2 != null ? drawable2.setLevel(i) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f20108l;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f20113l;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            C10754l.metrica(AbstractC0653l.vip(i, "Invalid alpha: "));
        } else {
            this.f20105l = i;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f20108l;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f20113l;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f20108l;
        if (drawable != null) {
            drawable.setTint(i);
        }
        Drawable drawable2 = this.f20113l;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f20108l;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f20113l;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f20108l;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f20113l;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f20108l;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f20113l;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f20108l;
        boolean z3 = drawable != null && drawable.setVisible(z, z2);
        Drawable drawable2 = this.f20113l;
        return visible || z3 || (drawable2 != null && drawable2.setVisible(z, z2));
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f20108l;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f20113l;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f20111l != 0) {
            return;
        }
        this.f20111l = 1;
        this.f20104l = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f20110l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC5287l) arrayList.get(i)).loadAd(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f20108l;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f20113l;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f20111l != 2) {
            loadAd();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public final int yandex(Integer num, Integer num2) {
        if (num != null && num.intValue() == -1) {
            return -1;
        }
        if (num2 != null && num2.intValue() == -1) {
            return -1;
        }
        return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
    }
}
