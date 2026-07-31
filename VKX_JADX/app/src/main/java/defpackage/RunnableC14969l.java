package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: lٜٔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC14969l extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f29443l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f29444l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ViewGroup f29445l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f29446l;

    public RunnableC14969l(Animation animation, ViewGroup viewGroup) {
        super(false);
        this.f29446l = true;
        this.f29445l = viewGroup;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f29446l = true;
        if (this.f29444l) {
            return !this.f29443l;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f29444l = true;
            ViewTreeObserverOnPreDrawListenerC13134l.yandex(this.f29445l, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f29444l;
        ViewGroup viewGroup = this.f29445l;
        if (z || !this.f29446l) {
            viewGroup.endViewTransition(null);
            this.f29443l = true;
        } else {
            this.f29446l = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f29446l = true;
        if (this.f29444l) {
            return !this.f29443l;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f29444l = true;
            ViewTreeObserverOnPreDrawListenerC13134l.yandex(this.f29445l, this);
        }
        return true;
    }
}
