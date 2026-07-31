package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* JADX INFO: renamed from: lٖۜؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16642l extends AbstractC0377l {
    public final ObjectAnimator admob;
    public final boolean subs;

    public C16642l(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        C8285l c8285l = new C8285l();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        c8285l.loadAd = numberOfFrames2;
        int[] iArr = c8285l.yandex;
        if (iArr == null || iArr.length < numberOfFrames2) {
            c8285l.yandex = new int[numberOfFrames2];
        }
        int[] iArr2 = c8285l.yandex;
        int i3 = 0;
        for (int i4 = 0; i4 < numberOfFrames2; i4++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames2 - i4) - 1 : i4);
            iArr2[i4] = duration;
            i3 += duration;
        }
        c8285l.crashlytics = i3;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(c8285l.crashlytics);
        objectAnimatorOfInt.setInterpolator(c8285l);
        this.subs = z2;
        this.admob = objectAnimatorOfInt;
    }

    @Override // defpackage.AbstractC0377l
    public final void billing() {
        this.admob.start();
    }

    @Override // defpackage.AbstractC0377l
    public final void mopub() {
        this.admob.cancel();
    }

    @Override // defpackage.AbstractC0377l
    public final void purchase() {
        this.admob.reverse();
    }

    @Override // defpackage.AbstractC0377l
    public final boolean yandex() {
        return this.subs;
    }
}
