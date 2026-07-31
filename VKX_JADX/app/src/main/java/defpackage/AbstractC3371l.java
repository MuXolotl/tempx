package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: renamed from: lْؕٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3371l extends Drawable implements Animatable {

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C10550l f7176l = new C10550l(7, Float.class, "growFraction");

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f7178l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public float f7179l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C6361l f7180l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Context f7181l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f7182l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public ObjectAnimator f7183l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public ObjectAnimator f7184l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public ArrayList f7186l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final Paint f7185l = new Paint();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C2442l f7177l = new C2442l();

    public AbstractC3371l(Context context, C6361l c6361l) {
        this.f7181l = context;
        this.f7180l = c6361l;
        setAlpha(255);
    }

    public boolean amazon(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.f7184l;
        int i = 0;
        C10550l c10550l = f7176l;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, c10550l, 0.0f, 1.0f);
            this.f7184l = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f7184l.setInterpolator(AbstractC0926l.loadAd);
            ObjectAnimator objectAnimator2 = this.f7184l;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                C8339l.metrica("Cannot set showAnimator while the current showAnimator is running.");
                return false;
            }
            this.f7184l = objectAnimator2;
            objectAnimator2.addListener(new C8293l(this, i));
        }
        int i2 = 1;
        if (this.f7183l == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, c10550l, 1.0f, 0.0f);
            this.f7183l = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f7183l.setInterpolator(AbstractC0926l.loadAd);
            ObjectAnimator objectAnimator3 = this.f7183l;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                C8339l.metrica("Cannot set hideAnimator while the current hideAnimator is running.");
                return false;
            }
            this.f7183l = objectAnimator3;
            objectAnimator3.addListener(new C8293l(this, i2));
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.f7184l : this.f7183l;
            ObjectAnimator objectAnimator5 = z ? this.f7183l : this.f7184l;
            if (!z3) {
                if (objectAnimator5.isRunning()) {
                    boolean z4 = this.f7178l;
                    this.f7178l = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.f7178l = z4;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z5 = this.f7178l;
                    this.f7178l = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f7178l = z5;
                }
                return super.setVisible(z, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z6 = !z || super.setVisible(z, false);
                C6361l c6361l = this.f7180l;
                if (!z ? c6361l.billing != 0 : c6361l.purchase != 0) {
                    boolean z7 = this.f7178l;
                    this.f7178l = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f7178l = z7;
                    return z6;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z6;
                }
                objectAnimator4.resume();
                return z6;
            }
        }
        return false;
    }

    public final boolean crashlytics(boolean z, boolean z2, boolean z3) {
        C2442l c2442l = this.f7177l;
        ContentResolver contentResolver = this.f7181l.getContentResolver();
        c2442l.getClass();
        return amazon(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f7182l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.f7184l;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.f7183l;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    public final float loadAd() {
        C6361l c6361l = this.f7180l;
        if (c6361l.purchase == 0 && c6361l.billing == 0) {
            return 1.0f;
        }
        return this.f7179l;
    }

    public final void purchase(C14228l c14228l) {
        ArrayList arrayList = this.f7186l;
        if (arrayList == null || !arrayList.contains(c14228l)) {
            return;
        }
        this.f7186l.remove(c14228l);
        if (this.f7186l.isEmpty()) {
            this.f7186l = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f7182l = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f7185l.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return crashlytics(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        amazon(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        amazon(false, true, false);
    }
}
