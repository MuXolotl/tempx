package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: lٕؗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4907l extends Animation {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12656l f10001l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f10002l;

    public /* synthetic */ C4907l(C12656l c12656l, int i) {
        this.f10002l = i;
        this.f10001l = c12656l;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.f10002l;
        C12656l c12656l = this.f10001l;
        switch (i) {
            case 0:
                c12656l.setAnimationProgress(f);
                break;
            case 1:
                c12656l.setAnimationProgress(1.0f - f);
                break;
            case 2:
                int iAbs = c12656l.f24898l - Math.abs(c12656l.f24922l);
                int i2 = c12656l.f24889l;
                c12656l.setTargetOffsetTopAndBottom((i2 + ((int) ((iAbs - i2) * f))) - c12656l.f24894l.getTop());
                C12709l c12709l = c12656l.f24912l;
                float f2 = 1.0f - f;
                C4651l c4651l = c12709l.f25047l;
                if (f2 != c4651l.startapp) {
                    c4651l.startapp = f2;
                }
                c12709l.invalidateSelf();
                break;
            default:
                c12656l.firebase(f);
                break;
        }
    }
}
