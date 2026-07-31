package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: renamed from: lؘْۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5659l extends View {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Long f12018l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Boolean f12019l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C9246l f12020l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C9636l f12021l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public RunnableC6665l f12022l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final int[] f12017l = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final int[] f12016l = new int[0];

    private final void setRippleState(boolean z) throws InterruptedException {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f12022l;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f12018l;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? f12017l : f12016l;
            C9246l c9246l = this.f12020l;
            if (c9246l != null) {
                c9246l.setState(iArr);
            }
        } else {
            RunnableC6665l runnableC6665l = new RunnableC6665l(0, this);
            this.f12022l = runnableC6665l;
            postDelayed(runnableC6665l, 50L);
        }
        this.f12018l = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(C5659l c5659l) {
        C9246l c9246l = c5659l.f12020l;
        if (c9246l != null) {
            c9246l.setState(f12016l);
        }
        c5659l.f12022l = null;
    }

    public final void amazon() throws InterruptedException {
        setRippleState(false);
    }

    public final void crashlytics() throws InterruptedException {
        this.f12021l = null;
        RunnableC6665l runnableC6665l = this.f12022l;
        if (runnableC6665l != null) {
            removeCallbacks(runnableC6665l);
            this.f12022l.run();
        } else {
            C9246l c9246l = this.f12020l;
            if (c9246l != null) {
                c9246l.setState(f12016l);
            }
        }
        C9246l c9246l2 = this.f12020l;
        if (c9246l2 == null) {
            return;
        }
        c9246l2.setVisible(false, false);
        unscheduleDrawable(c9246l2);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) throws InterruptedException {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            crashlytics();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C9636l c9636l = this.f12021l;
        if (c9636l != null) {
            c9636l.invoke();
        }
    }

    public final void loadAd(C12951l c12951l, boolean z, long j, int i, long j2, float f, C9636l c9636l) throws InterruptedException {
        if (this.f12020l == null || !Boolean.valueOf(z).equals(this.f12019l)) {
            C9246l c9246l = new C9246l(z, 1);
            setBackground(c9246l);
            this.f12020l = c9246l;
            this.f12019l = Boolean.valueOf(z);
        }
        C9246l c9246l2 = this.f12020l;
        this.f12021l = c9636l;
        purchase(j, i, j2, f);
        if (z) {
            c9246l2.setHotspot(C1187l.purchase(c12951l.yandex), C1187l.billing(c12951l.yandex));
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
        C9246l c9246l = this.f12020l;
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
        Rect rect = new Rect(0, 0, AbstractC5573l.ads(C14174l.billing(j)), AbstractC5573l.ads(C14174l.crashlytics(j)));
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
