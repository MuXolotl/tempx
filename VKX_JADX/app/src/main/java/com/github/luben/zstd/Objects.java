package com.github.luben.zstd;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
final class Objects {
    public static void checkFromIndexSize(int i, int i2, int i3) {
        if ((i3 | i | i2) < 0 || i2 > i3 - i) {
            throw new IndexOutOfBoundsException(String.format("Range [%s, %<s + %s) out of bounds for length %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }
}
