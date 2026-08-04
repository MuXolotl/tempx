package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٍّٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9508l {
    public static final float[] yandex;

    static {
        long[] jArr = AbstractC12154l.yandex;
        int iAmazon = AbstractC12154l.amazon(0);
        int iMax = iAmazon > 0 ? Math.max(7, AbstractC12154l.crashlytics(iAmazon)) : 0;
        if (iMax != 0) {
            int i = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i];
            Arrays.fill(jArr2, 0, i, -9187201950435737472L);
            jArr = jArr2;
        }
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        float[] fArr = new float[iMax];
        yandex = new float[0];
    }
}
