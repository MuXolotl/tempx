package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: renamed from: lًؙ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC7830l implements Animation.AnimationListener {
    public final /* synthetic */ C17422l loadAd;
    public final /* synthetic */ ViewGroup yandex;

    public AnimationAnimationListenerC7830l(AbstractC18261l abstractC18261l, ViewGroup viewGroup, C17422l c17422l) {
        this.yandex = viewGroup;
        this.loadAd = c17422l;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ViewGroup viewGroup = this.yandex;
        viewGroup.post(new RunnableC0336l(viewGroup, this.loadAd, 2));
        if (C13734l.m3727volatile(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (C13734l.m3727volatile(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has reached onAnimationStart.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
