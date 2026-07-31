package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.metrica;

/* JADX INFO: renamed from: lٍٗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9603l implements Animator.AnimatorListener {
    public boolean admob;
    public final float amazon;
    public final int billing;
    public final float crashlytics;
    public float isPro;
    public final float loadAd;
    public final /* synthetic */ metrica metrica;
    public final ValueAnimator mopub;
    public final metrica purchase;
    public float remoteconfig;
    public final /* synthetic */ C16678l startapp;
    public float subs;
    public final /* synthetic */ int vip;
    public final float yandex;
    public boolean firebase = false;
    public boolean smaato = false;

    public C9603l(C16678l c16678l, metrica metricaVar, int i, float f, float f2, float f3, float f4, int i2, metrica metricaVar2) {
        this.startapp = c16678l;
        this.vip = i2;
        this.metrica = metricaVar2;
        this.billing = i;
        this.purchase = metricaVar;
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.mopub = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new C5551l(3, this));
        valueAnimatorOfFloat.setTarget(metricaVar.yandex);
        valueAnimatorOfFloat.addListener(this);
        this.remoteconfig = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.remoteconfig = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        yandex(animator);
        if (this.firebase) {
            return;
        }
        int i = this.vip;
        metrica metricaVar = this.metrica;
        C16678l c16678l = this.startapp;
        if (i <= 0) {
            c16678l.remoteconfig.yandex(metricaVar);
        } else {
            c16678l.yandex.add(metricaVar.yandex);
            this.admob = true;
            if (i > 0) {
                c16678l.ads.post(new RunnableC9929l(c16678l, this, i));
            }
        }
        View view = c16678l.pro;
        View view2 = metricaVar.yandex;
        if (view == view2 && view2 == view) {
            c16678l.pro = null;
        }
    }

    public final void yandex(Animator animator) {
        if (!this.smaato) {
            this.purchase.startapp(true);
        }
        this.smaato = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
