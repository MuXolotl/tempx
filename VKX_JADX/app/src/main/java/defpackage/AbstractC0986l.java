package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* JADX INFO: renamed from: lِؒؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0986l {
    public static void loadAd(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }

    public static long yandex(Animator animator) {
        return animator.getTotalDuration();
    }
}
