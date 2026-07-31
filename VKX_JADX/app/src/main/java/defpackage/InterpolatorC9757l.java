package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: lٍِۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC9757l implements Interpolator {
    public final /* synthetic */ int yandex;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.yandex) {
            case 0:
                return f * f * f * f * f;
            case 1:
            case 2:
            case 3:
            default:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }
}
