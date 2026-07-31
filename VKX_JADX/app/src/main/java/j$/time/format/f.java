package j$.time.format;

import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends j {
    public final boolean g;

    public f(TemporalField temporalField, int i, int i2, boolean z) {
        this(temporalField, i, i2, z, 0);
        Objects.a(temporalField, "field");
        j$.time.temporal.s sVarO = temporalField.o();
        if (sVarO.a != sVarO.b || sVarO.c != sVarO.d) {
            j$.time.d.c(j$.time.b.a("Field must have a fixed set of values: ", temporalField));
            throw null;
        }
        if (i < 0 || i > 9) {
            j$.time.d.m("Minimum width must be from 0 to 9 inclusive but was ", i);
            throw null;
        }
        if (i2 < 1 || i2 > 9) {
            j$.time.d.m("Maximum width must be from 1 to 9 inclusive but was ", i2);
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    @Override // j$.time.format.j
    public final boolean b(v vVar) {
        return vVar.c && this.b == this.c && !this.g;
    }

    @Override // j$.time.format.j
    public final j d() {
        if (this.e == -1) {
            return this;
        }
        return new f(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.j
    public final j e(int i) {
        return new f(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.j, j$.time.format.e
    public final boolean j(x xVar, StringBuilder sb) {
        TemporalField temporalField = this.a;
        Long lA = xVar.a(temporalField);
        if (lA == null) {
            return false;
        }
        b0 b0Var = xVar.b.c;
        long jLongValue = lA.longValue();
        j$.time.temporal.s sVarO = temporalField.o();
        sVarO.b(jLongValue, temporalField);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(sVarO.a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(sVarO.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2);
            b0Var.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i > 0) {
            if (z) {
                b0Var.getClass();
                sb.append('.');
            }
            for (int i2 = 0; i2 < i; i2++) {
                b0Var.getClass();
                sb.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.j, j$.time.format.e
    public final int k(v vVar, CharSequence charSequence, int i) {
        boolean z = vVar.c;
        DateTimeFormatter dateTimeFormatter = vVar.a;
        int i2 = (z || b(vVar)) ? this.b : 0;
        int i3 = (vVar.c || b(vVar)) ? this.c : 9;
        int length = charSequence.length();
        if (i != length) {
            if (this.g) {
                char cCharAt = charSequence.charAt(i);
                dateTimeFormatter.c.getClass();
                if (cCharAt == '.') {
                    i++;
                } else if (i2 > 0) {
                    return ~i;
                }
            }
            int i4 = i;
            int i5 = i2 + i4;
            if (i5 > length) {
                return ~i4;
            }
            int iMin = Math.min(i3 + i4, length);
            int i6 = 0;
            int i7 = i4;
            while (i7 < iMin) {
                int i8 = i7 + 1;
                char cCharAt2 = charSequence.charAt(i7);
                dateTimeFormatter.c.getClass();
                int i9 = cCharAt2 - '0';
                if (i9 < 0 || i9 > 9) {
                    i9 = -1;
                }
                if (i9 < 0) {
                    if (i8 >= i5) {
                        break;
                    }
                    return ~i4;
                }
                i6 = (i6 * 10) + i9;
                i7 = i8;
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i6).movePointLeft(i7 - i4);
            j$.time.temporal.s sVarO = this.a.o();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(sVarO.a);
            return vVar.g(this.a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(sVarO.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i4, i7);
        }
        if (i2 > 0) {
            return ~i;
        }
        return i;
    }

    @Override // j$.time.format.j
    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.g ? ",DecimalPoint" : "") + ")";
    }

    public f(TemporalField temporalField, int i, int i2, boolean z, int i3) {
        super(temporalField, i, i2, SignStyle.NOT_NEGATIVE, i3);
        this.g = z;
    }
}
