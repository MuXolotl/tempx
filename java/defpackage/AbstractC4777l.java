package defpackage;

/* JADX INFO: renamed from: lٍؗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4777l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final AbstractC8502l f9804l;

    static {
        Integer num = AbstractC11868l.yandex;
        f9804l = (num == null || num.intValue() >= 34) ? new C1784l() : new C10668l();
    }

    public long admob() {
        return mopub(0L, 1000L);
    }

    public abstract int amazon();

    public long billing() {
        return (((long) amazon()) << 32) + ((long) amazon());
    }

    public byte[] crashlytics(byte[] bArr) {
        return loadAd(bArr.length, bArr);
    }

    public byte[] loadAd(int i, byte[] bArr) {
        if (bArr.length < 0 || i < 0 || i > bArr.length) {
            C10754l.metrica(AbstractC0653l.adcel(AbstractC2812l.Signature("fromIndex (0) or toIndex (", i, ") are out of range: 0.."), bArr.length, '.'));
            return null;
        }
        if (i < 0) {
            C10754l.metrica(AbstractC15560l.tapsense("fromIndex (0) must be not greater than toIndex (", i, ")."));
            return null;
        }
        int i2 = i / 4;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int iAmazon = amazon();
            bArr[i3] = (byte) iAmazon;
            bArr[i3 + 1] = (byte) (iAmazon >>> 8);
            bArr[i3 + 2] = (byte) (iAmazon >>> 16);
            bArr[i3 + 3] = (byte) (iAmazon >>> 24);
            i3 += 4;
        }
        int i5 = i - i3;
        int iYandex = yandex(i5 * 8);
        for (int i6 = 0; i6 < i5; i6++) {
            bArr[i3 + i6] = (byte) (iYandex >>> (i6 * 8));
        }
        return bArr;
    }

    public long mopub(long j, long j2) {
        long jBilling;
        long j3;
        long jYandex;
        int iAmazon;
        if (j2 <= j) {
            C11983l.startapp("Random range is empty: [", Long.valueOf(j), ", ", Long.valueOf(j2), ").");
            return 0L;
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iAmazon = yandex(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    iAmazon = amazon();
                } else {
                    jYandex = (((long) yandex(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (4294967295L & ((long) amazon()));
                }
                jYandex = ((long) iAmazon) & 4294967295L;
            } else {
                do {
                    jBilling = billing() >>> 1;
                    j3 = jBilling % j4;
                } while ((j4 - 1) + (jBilling - j3) < 0);
                jYandex = j3;
            }
            return j + jYandex;
        }
        while (true) {
            long jBilling2 = billing();
            if (j <= jBilling2 && jBilling2 < j2) {
                return jBilling2;
            }
        }
    }

    public int purchase(int i) {
        int iAmazon;
        int i2;
        if (i <= 0) {
            C11983l.startapp("Random range is empty: [", 0, ", ", Integer.valueOf(i), ").");
            return 0;
        }
        if (i > 0 || i == Integer.MIN_VALUE) {
            if (((-i) & i) == i) {
                return yandex(31 - Integer.numberOfLeadingZeros(i));
            }
            do {
                iAmazon = amazon() >>> 1;
                i2 = iAmazon % i;
            } while ((i - 1) + (iAmazon - i2) < 0);
            return i2;
        }
        while (true) {
            int iAmazon2 = amazon();
            if (iAmazon2 >= 0 && iAmazon2 < i) {
                return iAmazon2;
            }
        }
    }

    public abstract int yandex(int i);
}
