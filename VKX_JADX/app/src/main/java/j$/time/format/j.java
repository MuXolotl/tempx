package j$.time.format;

import j$.time.DateTimeException;
import j$.time.temporal.TemporalField;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public class j implements e {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final TemporalField a;
    public final int b;
    public final int c;
    public final SignStyle d;
    public final int e;

    public j(TemporalField temporalField, int i, int i2, SignStyle signStyle) {
        this.a = temporalField;
        this.b = i;
        this.c = i2;
        this.d = signStyle;
        this.e = 0;
    }

    public boolean b(v vVar) {
        int i = this.e;
        if (i != -1) {
            return i > 0 && this.b == this.c && this.d == SignStyle.NOT_NEGATIVE;
        }
        return true;
    }

    public int c(v vVar, long j, int i, int i2) {
        return vVar.g(this.a, j, i, i2);
    }

    public j d() {
        if (this.e == -1) {
            return this;
        }
        return new j(this.a, this.b, this.c, this.d, -1);
    }

    public j e(int i) {
        return new j(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.e
    public boolean j(x xVar, StringBuilder sb) {
        TemporalField temporalField = this.a;
        Long lA = xVar.a(temporalField);
        if (lA == null) {
            return false;
        }
        long jA = a(xVar, lA.longValue());
        b0 b0Var = xVar.b.c;
        String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
        int length = string.length();
        int i = this.c;
        if (length > i) {
            throw new DateTimeException("Field " + temporalField + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i);
        }
        b0Var.getClass();
        int i2 = this.b;
        SignStyle signStyle = this.d;
        if (jA >= 0) {
            int i3 = b.a[signStyle.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jA >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = b.a[signStyle.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new DateTimeException("Field " + temporalField + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - string.length(); i5++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    @Override // j$.time.format.e
    public int k(v vVar, CharSequence charSequence, int i) {
        int i2;
        boolean z;
        boolean z2;
        BigInteger bigIntegerAdd;
        boolean z3;
        boolean z4;
        int i3;
        long j;
        int length = charSequence.length();
        if (i == length) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        DateTimeFormatter dateTimeFormatter = vVar.a;
        dateTimeFormatter.c.getClass();
        int i4 = this.c;
        SignStyle signStyle = this.d;
        int i5 = this.b;
        int i6 = 0;
        boolean z5 = true;
        if (cCharAt == '+') {
            boolean z6 = vVar.c;
            boolean z7 = i5 == i4;
            int iOrdinal = signStyle.ordinal();
            if (iOrdinal == 0 ? z6 : !(iOrdinal == 1 || iOrdinal == 4 || (!z6 && !z7))) {
                return ~i;
            }
            i2 = i + 1;
            z = false;
            z2 = true;
        } else {
            dateTimeFormatter.c.getClass();
            if (cCharAt == '-') {
                boolean z8 = vVar.c;
                boolean z9 = i5 == i4;
                int iOrdinal2 = signStyle.ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 4 && (z8 || z9)) {
                    return ~i;
                }
                i2 = i + 1;
                z2 = false;
                z = true;
            } else {
                if (signStyle == SignStyle.ALWAYS && vVar.c) {
                    return ~i;
                }
                i2 = i;
                z = false;
                z2 = false;
            }
        }
        int i7 = (vVar.c || b(vVar)) ? i5 : 1;
        int i8 = i2 + i7;
        if (i8 > length) {
            return ~i2;
        }
        if (!vVar.c && !b(vVar)) {
            i4 = 9;
        }
        int i9 = this.e;
        int iMax = Math.max(i9, 0) + i4;
        while (true) {
            bigIntegerAdd = null;
            if (i6 >= 2) {
                z3 = z;
                z4 = z2;
                i3 = i2;
                j = 0;
                break;
            }
            int iMin = Math.min(i2 + iMax, length);
            boolean z10 = z5;
            long j2 = 0;
            int i10 = i2;
            while (true) {
                if (i10 >= iMin) {
                    z3 = z;
                    break;
                }
                int i11 = i10 + 1;
                char cCharAt2 = charSequence.charAt(i10);
                dateTimeFormatter.c.getClass();
                int i12 = cCharAt2 - '0';
                z3 = z;
                if (i12 < 0 || i12 > 9) {
                    i12 = -1;
                }
                if (i12 < 0) {
                    if (i10 >= i8) {
                        break;
                    }
                    return ~i2;
                }
                if (i11 - i2 > 18) {
                    if (bigIntegerAdd == null) {
                        bigIntegerAdd = BigInteger.valueOf(j2);
                    }
                    bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(i12));
                } else {
                    j2 = (j2 * 10) + ((long) i12);
                }
                i10 = i11;
                z = z3;
                dateTimeFormatter = dateTimeFormatter;
                z2 = z2;
            }
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            z4 = z2;
            if (i9 <= 0 || i6 != 0) {
                i3 = i10;
                j = j2;
                break;
            }
            int iMax2 = Math.max(i7, (i10 - i2) - i9);
            i6++;
            z5 = z10;
            z = z3;
            dateTimeFormatter = dateTimeFormatter2;
            z2 = z4;
            iMax = iMax2;
        }
        BigInteger bigIntegerDivide = bigIntegerAdd;
        if (z3) {
            if (bigIntegerDivide != null) {
                if (bigIntegerDivide.equals(BigInteger.ZERO) && vVar.c) {
                    return ~(i2 - 1);
                }
                bigIntegerDivide = bigIntegerDivide.negate();
            } else {
                if (j == 0 && vVar.c) {
                    return ~(i2 - 1);
                }
                j = -j;
            }
        } else if (signStyle == SignStyle.EXCEEDS_PAD && vVar.c) {
            int i13 = i3 - i2;
            if (z4) {
                if (i13 <= i5) {
                    return ~(i2 - 1);
                }
            } else if (i13 > i5) {
                return ~i2;
            }
        }
        if (bigIntegerDivide == null) {
            return c(vVar, j, i2, i3);
        }
        if (bigIntegerDivide.bitLength() > 63) {
            bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
            i3--;
        }
        return c(vVar, bigIntegerDivide.longValue(), i2, i3);
    }

    public String toString() {
        int i = this.c;
        TemporalField temporalField = this.a;
        SignStyle signStyle = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && signStyle == SignStyle.NORMAL) {
            return "Value(" + temporalField + ")";
        }
        if (i2 == i && signStyle == SignStyle.NOT_NEGATIVE) {
            return "Value(" + temporalField + "," + i2 + ")";
        }
        return "Value(" + temporalField + "," + i2 + "," + i + "," + signStyle + ")";
    }

    public j(TemporalField temporalField, int i, int i2, SignStyle signStyle, int i3) {
        this.a = temporalField;
        this.b = i;
        this.c = i2;
        this.d = signStyle;
        this.e = i3;
    }

    public long a(x xVar, long j) {
        return j;
    }
}
