package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: renamed from: lٔۘٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15119l extends View {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Long f29660l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Boolean f29661l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C9246l f29662l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C9636l f29663l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public RunnableC11297l f29664l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final int[] f29659l = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final int[] f29658l = new int[0];

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f29664l;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f29660l;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? f29659l : f29658l;
            C9246l c9246l = this.f29662l;
            if (c9246l != null) {
                c9246l.setState(iArr);
            }
        } else {
            RunnableC11297l runnableC11297l = new RunnableC11297l(29, this);
            this.f29664l = runnableC11297l;
            postDelayed(runnableC11297l, 50L);
        }
        this.f29660l = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(C15119l c15119l) {
        C9246l c9246l = c15119l.f29662l;
        if (c9246l != null) {
            c9246l.setState(f29658l);
        }
        c15119l.f29664l = null;
    }

    public final void amazon() {
        setRippleState(false);
    }

    public final void crashlytics() {
        this.f29663l = null;
        RunnableC11297l runnableC11297l = this.f29664l;
        if (runnableC11297l != null) {
            removeCallbacks(runnableC11297l);
            this.f29664l.run();
        } else {
            C9246l c9246l = this.f29662l;
            if (c9246l != null) {
                c9246l.setState(f29658l);
            }
        }
        C9246l c9246l2 = this.f29662l;
        if (c9246l2 == null) {
            return;
        }
        c9246l2.setVisible(false, false);
        unscheduleDrawable(c9246l2);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            crashlytics();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C9636l c9636l = this.f29663l;
        if (c9636l != null) {
            c9636l.invoke();
        }
    }

    public final void loadAd(C12951l c12951l, boolean z, long j, int i, long j2, float f, C9636l c9636l) {
        if (this.f29662l == null || !Boolean.valueOf(z).equals(this.f29661l)) {
            C9246l c9246l = new C9246l(z, 0);
            setBackground(c9246l);
            this.f29662l = c9246l;
            this.f29661l = Boolean.valueOf(z);
        }
        C9246l c9246l2 = this.f29662l;
        this.f29663l = c9636l;
        purchase(j, i, j2, f);
        if (z) {
            c9246l2.setHotspot(Float.intBitsToFloat((int) (c12951l.yandex >> 32)), Float.intBitsToFloat((int) (c12951l.yandex & 4294967295L)));
        } else {
            c9246l2.setHotspot(c9246l2.getBounds().centerX(), c9246l2.getBounds().centerY());
        }
        setRippleState(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void purchase(long j, int i, long j2, float f) {
        C9246l c9246l = this.f29662l;
        if (c9246l == null) {
            return;
        }
        if (c9246l.getRadius() != i) {
            c9246l.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jLoadAd = C9735l.loadAd(f, j2);
        C9735l c9735l = c9246l.f19011l;
        if (!(c9735l == null ? false : C9735l.crashlytics(c9735l.yandex, jLoadAd))) {
            c9246l.f19011l = new C9735l(jLoadAd);
            c9246l.setColor(ColorStateList.valueOf(AbstractC12953l.startapp(jLoadAd)));
        }
        Rect rect = new Rect(0, 0, AbstractC5573l.ads(Float.intBitsToFloat((int) (j >> 32))), AbstractC5573l.ads(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        c9246l.setBounds(rect);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
