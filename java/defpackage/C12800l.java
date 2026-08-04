package defpackage;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: renamed from: lّۘؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12800l {
    public final int[] crashlytics;
    public final int[] loadAd;
    public final Random yandex;

    public C12800l(int[] iArr, Random random) {
        this.loadAd = iArr;
        this.yandex = random;
        this.crashlytics = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.crashlytics[iArr[i]] = i;
        }
    }

    public final C12800l yandex(int i, int i2) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        int i3 = 0;
        while (true) {
            iArr = this.loadAd;
            random = this.yandex;
            if (i3 >= i2) {
                break;
            }
            iArr2[i3] = random.nextInt(iArr.length + 1);
            int i4 = i3 + 1;
            int iNextInt = random.nextInt(i4);
            iArr3[i3] = iArr3[iNextInt];
            iArr3[iNextInt] = i3 + i;
            i3 = i4;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i2];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr.length + i2; i7++) {
            if (i5 >= i2 || i6 != iArr2[i5]) {
                int i8 = i6 + 1;
                int i9 = iArr[i6];
                iArr4[i7] = i9;
                if (i9 >= i) {
                    iArr4[i7] = i9 + i2;
                }
                i6 = i8;
            } else {
                iArr4[i7] = iArr3[i5];
                i5++;
            }
        }
        return new C12800l(iArr4, new Random(random.nextLong()));
    }

    public C12800l() {
        this(new Random());
    }

    public C12800l(Random random) {
        this(new int[0], random);
    }
}
