package defpackage;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;

/* JADX INFO: renamed from: lٍؘؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC7080l extends AbstractC12109l implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public boolean f14832l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public float f14833l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public float f14834l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public float f14835l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f14836l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public float f14837l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public C10712l f14838l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f14839l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public long f14840l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public float f14841l;

    public final boolean admob() {
        return this.f14837l < 0.0f;
    }

    public final float amazon() {
        C10712l c10712l = this.f14838l;
        if (c10712l == null) {
            return 0.0f;
        }
        float f = this.f14834l;
        float f2 = c10712l.smaato;
        return (f - f2) / (c10712l.remoteconfig - f2);
    }

    public final float billing() {
        C10712l c10712l = this.f14838l;
        if (c10712l == null) {
            return 0.0f;
        }
        float f = this.f14835l;
        return f == -2.1474836E9f ? c10712l.smaato : f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f24072l.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        yandex(admob());
        subs(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f14832l) {
            subs(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        C10712l c10712l = this.f14838l;
        if (c10712l == null || !this.f14832l) {
            return;
        }
        long j2 = this.f14840l;
        float fAbs = (j2 != 0 ? j - j2 : 0L) / ((1.0E9f / c10712l.vip) / Math.abs(this.f14837l));
        float f = this.f14833l;
        if (admob()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        float fBilling = billing();
        float fPurchase = purchase();
        PointF pointF = AbstractC7484l.yandex;
        boolean z = f2 >= fBilling && f2 <= fPurchase;
        float fLoadAd = AbstractC7484l.loadAd(f2, billing(), purchase());
        this.f14833l = fLoadAd;
        this.f14834l = fLoadAd;
        this.f14840l = j;
        if (z) {
            crashlytics();
        } else if (getRepeatCount() == -1 || this.f14839l < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f14836l = !this.f14836l;
                this.f14837l = -this.f14837l;
            } else {
                float fPurchase2 = admob() ? purchase() : billing();
                this.f14833l = fPurchase2;
                this.f14834l = fPurchase2;
            }
            this.f14840l = j;
            crashlytics();
            Iterator it = this.f24072l.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.f14839l++;
        } else {
            float fBilling2 = this.f14837l < 0.0f ? billing() : purchase();
            this.f14833l = fBilling2;
            this.f14834l = fBilling2;
            subs(true);
            crashlytics();
            yandex(admob());
        }
        if (this.f14838l == null) {
            return;
        }
        float f3 = this.f14834l;
        float f4 = this.f14835l;
        if (f3 < f4 || f3 > this.f14841l) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f4), Float.valueOf(this.f14841l), Float.valueOf(this.f14834l)));
        }
    }

    public final void firebase(float f, float f2) {
        if (f > f2) {
            C11983l.vip("minFrame (", f, ") must be <= maxFrame (", f2, ")");
            return;
        }
        C10712l c10712l = this.f14838l;
        float f3 = c10712l == null ? -3.4028235E38f : c10712l.smaato;
        float f4 = c10712l == null ? Float.MAX_VALUE : c10712l.remoteconfig;
        float fLoadAd = AbstractC7484l.loadAd(f, f3, f4);
        float fLoadAd2 = AbstractC7484l.loadAd(f2, f3, f4);
        if (fLoadAd == this.f14835l && fLoadAd2 == this.f14841l) {
            return;
        }
        this.f14835l = fLoadAd;
        this.f14841l = fLoadAd2;
        isPro((int) AbstractC7484l.loadAd(this.f14834l, fLoadAd, fLoadAd2));
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fBilling;
        float fPurchase;
        float fBilling2;
        if (this.f14838l == null) {
            return 0.0f;
        }
        if (admob()) {
            fBilling = purchase() - this.f14834l;
            fPurchase = purchase();
            fBilling2 = billing();
        } else {
            fBilling = this.f14834l - billing();
            fPurchase = purchase();
            fBilling2 = billing();
        }
        return fBilling / (fPurchase - fBilling2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(amazon());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        C10712l c10712l = this.f14838l;
        if (c10712l == null) {
            return 0L;
        }
        return (long) c10712l.loadAd();
    }

    public final void isPro(float f) {
        if (this.f14833l == f) {
            return;
        }
        float fLoadAd = AbstractC7484l.loadAd(f, billing(), purchase());
        this.f14833l = fLoadAd;
        this.f14834l = fLoadAd;
        this.f14840l = 0L;
        crashlytics();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f14832l;
    }

    public final float purchase() {
        C10712l c10712l = this.f14838l;
        if (c10712l == null) {
            return 0.0f;
        }
        float f = this.f14841l;
        return f == 2.1474836E9f ? c10712l.remoteconfig : f;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f14836l) {
            return;
        }
        this.f14836l = false;
        this.f14837l = -this.f14837l;
    }

    public final void subs(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f14832l = false;
        }
    }
}
