package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lْۗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13591l implements InterfaceC14206l {
    public final C10942l yandex;

    public C13591l(C10942l c10942l) {
        this.yandex = c10942l;
    }

    @Override // defpackage.InterfaceC1489l
    /* JADX INFO: renamed from: billing, reason: merged with bridge method [inline-methods] */
    public final C10628l yandex(C0010l c0010l) {
        int[] iArr;
        Object[] objArr;
        C10942l c10942l = this.yandex;
        C16977l c16977l = c10942l.loadAd;
        C16761l c16761l = new C16761l(c16977l.purchase + 2);
        C16977l c16977l2 = new C16977l(c16977l.purchase);
        int[] iArr2 = c16977l.loadAd;
        Object[] objArr2 = c16977l.crashlytics;
        long[] jArr = c16977l.yandex;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr2[i5];
                            C17137l c17137l = (C17137l) objArr2[i5];
                            c16761l.yandex(i6);
                            c16977l2.subs(i6, new C2469l((AbstractC2249l) c0010l.yandex.invoke(c17137l.yandex), c17137l.loadAd));
                        }
                        j >>= i2;
                        i4++;
                        i2 = i2;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i3 != i2) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i == length) {
                    break;
                }
                i++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!c16977l.yandex(0)) {
            int i7 = c16761l.loadAd;
            if (i7 < 0) {
                AbstractC13082l.amazon("Index must be between 0 and size");
                throw null;
            }
            c16761l.loadAd(i7 + 1);
            int[] iArr3 = c16761l.yandex;
            int i8 = c16761l.loadAd;
            if (i8 != 0) {
                AbstractC8669l.ad(1, 0, iArr3, iArr3, i8);
            }
            iArr3[0] = 0;
            c16761l.loadAd++;
        }
        if (!c16977l.yandex(c10942l.yandex)) {
            c16761l.yandex(c10942l.yandex);
        }
        int i9 = c16761l.loadAd;
        if (i9 != 0) {
            Arrays.sort(c16761l.yandex, 0, i9);
        }
        return new C10628l(c16761l, c16977l2, c10942l.yandex, AbstractC5341l.amazon);
    }
}
