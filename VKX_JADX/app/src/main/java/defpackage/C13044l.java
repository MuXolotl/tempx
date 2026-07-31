package defpackage;

/* JADX INFO: renamed from: lْؐۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13044l {
    public final Object[] crashlytics;
    public final long[] loadAd;
    public final int yandex;

    public C13044l(int i, long[] jArr, Object[] objArr) {
        this.yandex = i;
        this.loadAd = jArr;
        this.crashlytics = objArr;
    }

    public final C13044l loadAd(long j, Object obj) {
        long[] jArr;
        int i;
        Object[] objArr = this.crashlytics;
        int i2 = 0;
        int i3 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i3++;
            }
        }
        int i4 = i3 + 1;
        long[] jArr2 = new long[i4];
        Object[] objArr2 = new Object[i4];
        if (i4 > 1) {
            int i5 = 0;
            while (true) {
                jArr = this.loadAd;
                i = this.yandex;
                if (i2 >= i4 || i5 >= i) {
                    break;
                }
                long j2 = jArr[i5];
                Object obj3 = objArr[i5];
                if (j2 > j) {
                    jArr2[i2] = j;
                    objArr2[i2] = obj;
                    i2++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i2] = j2;
                    objArr2[i2] = obj3;
                    i2++;
                }
                i5++;
            }
            if (i5 == i) {
                jArr2[i3] = j;
                objArr2[i3] = obj;
            } else {
                while (i2 < i4) {
                    long j3 = jArr[i5];
                    Object obj4 = objArr[i5];
                    if (obj4 != null) {
                        jArr2[i2] = j3;
                        objArr2[i2] = obj4;
                        i2++;
                    }
                    i5++;
                }
            }
        } else {
            jArr2[0] = j;
            objArr2[0] = obj;
        }
        return new C13044l(i4, jArr2, objArr2);
    }

    public final int yandex(long j) {
        int i = this.yandex - 1;
        if (i != -1) {
            long[] jArr = this.loadAd;
            int i2 = 0;
            if (i != 0) {
                while (i2 <= i) {
                    int i3 = (i2 + i) >>> 1;
                    long j2 = jArr[i3] - j;
                    if (j2 < 0) {
                        i2 = i3 + 1;
                    } else {
                        if (j2 <= 0) {
                            return i3;
                        }
                        i = i3 - 1;
                    }
                }
                return -(i2 + 1);
            }
            long j3 = jArr[0];
            if (j3 == j) {
                return 0;
            }
            if (j3 > j) {
                return -2;
            }
        }
        return -1;
    }
}
