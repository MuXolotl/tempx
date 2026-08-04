package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: lٌُِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10918l extends AbstractC12048l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f22041l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f22042l;

    public /* synthetic */ C10918l(int i, Object obj) {
        this.f22041l = i;
        this.f22042l = obj;
    }

    @Override // defpackage.AbstractC12048l
    public final Object firebase() {
        int i = this.f22041l;
        Object obj = this.f22042l;
        switch (i) {
            case 0:
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(6000L);
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.setRepeatMode(1);
                valueAnimatorOfFloat.setInterpolator(null);
                valueAnimatorOfFloat.addUpdateListener(new C14131l(1, this));
                valueAnimatorOfFloat.addUpdateListener(((C9478l) obj).mopub);
                valueAnimatorOfFloat.start();
                valueAnimatorOfFloat.pause();
                return valueAnimatorOfFloat;
            default:
                return new C13557l(((C13703l) obj).vip);
        }
    }
}
