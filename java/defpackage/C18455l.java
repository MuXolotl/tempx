package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: lؙٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18455l {
    public final boolean admob;
    public final int amazon;
    public final int billing;
    public final int crashlytics;
    public final char[] loadAd;
    public final byte[] mopub;
    public final int purchase;
    public final String yandex;

    /* JADX WARN: Code duplicated, block: B:25:0x007c A[LOOP:0: B:23:0x0078->B:25:0x007c, LOOP_END] */
    public C18455l(String str, char[] cArr, byte[] bArr, boolean z) {
        int iNumberOfLeadingZeros;
        boolean[] zArr;
        this.yandex = str;
        cArr.getClass();
        this.loadAd = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (AbstractC15373l.yandex[roundingMode2.ordinal()]) {
                    case 1:
                        AbstractC9464l.admob((length > 0) & (((length + (-1)) & length) == 0));
                    case 2:
                    case 3:
                        iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        break;
                    case 4:
                    case 5:
                        iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        iNumberOfLeadingZeros = (31 - iNumberOfLeadingZeros2) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros2) - length))) >>> 31);
                        break;
                    default:
                        C11586l.yandex();
                        break;
                }
                this.amazon = iNumberOfLeadingZeros;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                int i = 1 << (3 - iNumberOfTrailingZeros);
                this.purchase = i;
                this.billing = iNumberOfLeadingZeros >> iNumberOfTrailingZeros;
                this.crashlytics = cArr.length - 1;
                this.mopub = bArr;
                zArr = new boolean[i];
                for (int i2 = 0; i2 < this.billing; i2++) {
                    int i3 = this.amazon;
                    RoundingMode roundingMode3 = RoundingMode.CEILING;
                    zArr[AbstractC10464l.mopub(i2 * 8, i3)] = true;
                }
                this.admob = z;
            }
            C8339l.metrica(AbstractC15560l.tapsense("x (", length, ") must be > 0"));
            iNumberOfLeadingZeros = 0;
            this.amazon = iNumberOfLeadingZeros;
            int iNumberOfTrailingZeros2 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
            int i4 = 1 << (3 - iNumberOfTrailingZeros2);
            this.purchase = i4;
            this.billing = iNumberOfLeadingZeros >> iNumberOfTrailingZeros2;
            this.crashlytics = cArr.length - 1;
            this.mopub = bArr;
            zArr = new boolean[i4];
            while (i2 < this.billing) {
                int i5 = this.amazon;
                RoundingMode roundingMode4 = RoundingMode.CEILING;
                zArr[AbstractC10464l.mopub(i2 * 8, i5)] = true;
            }
            this.admob = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18455l)) {
            return false;
        }
        C18455l c18455l = (C18455l) obj;
        return this.admob == c18455l.admob && Arrays.equals(this.loadAd, c18455l.loadAd);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.loadAd) + (this.admob ? 1231 : 1237);
    }

    public final String toString() {
        return this.yandex;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C18455l(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (!(c < 128)) {
                C8339l.metrica(AbstractC11028l.smaato("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
            if (!(bArr[c] == -1)) {
                C8339l.metrica(AbstractC11028l.smaato("Duplicate character: %s", Character.valueOf(c)));
                throw null;
            }
            bArr[c] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }
}
