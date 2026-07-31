package defpackage;

import android.animation.TimeInterpolator;

/* JADX INFO: renamed from: lًۜٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8285l implements TimeInterpolator {
    public int crashlytics;
    public int loadAd;
    public int[] yandex;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = (int) ((f * this.crashlytics) + 0.5f);
        int i2 = this.loadAd;
        int[] iArr = this.yandex;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = iArr[i3];
            if (i < i4) {
                break;
            }
            i -= i4;
            i3++;
        }
        return (i3 / i2) + (i3 < i2 ? i / this.crashlytics : 0.0f);
    }
}
