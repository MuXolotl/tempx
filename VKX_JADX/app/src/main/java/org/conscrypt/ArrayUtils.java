package org.conscrypt;

import defpackage.AbstractC14814l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
final class ArrayUtils {
    private ArrayUtils() {
    }

    public static void checkOffsetAndCount(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            StringBuilder sbSubscription = AbstractC14814l.subscription(i, i2, "length=", "; regionStart=", "; regionLength=");
            sbSubscription.append(i3);
            throw new ArrayIndexOutOfBoundsException(sbSubscription.toString());
        }
    }
}
