package defpackage;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.SweepGradient;

/* JADX INFO: renamed from: lًۚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8249l {
    public static final C8249l yandex = new C8249l();

    public final SweepGradient crashlytics(long j, long[] jArr, float[] fArr) {
        return AbstractC10971l.purchase(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), jArr, fArr);
    }

    public final RadialGradient loadAd(long j, float f, long[] jArr, float[] fArr, int i) {
        return AbstractC10971l.crashlytics(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, jArr, fArr, AbstractC0509l.amazon(i));
    }

    public final LinearGradient yandex(long j, long j2, long[] jArr, float[] fArr, int i) {
        return AbstractC10971l.loadAd(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), jArr, fArr, AbstractC0509l.amazon(i));
    }
}
