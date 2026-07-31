package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends c {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient m a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    public o(m mVar, long j) {
        int i = (int) j;
        mVar.N();
        if (i < mVar.e || i >= mVar.f) {
            j$.time.d.k("Hijrah date out of range");
            throw null;
        }
        int iBinarySearch = Arrays.binarySearch(mVar.d, i);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int[] iArr = {mVar.P(iBinarySearch), ((mVar.g + iBinarySearch) % 12) + 1, (i - mVar.d[iBinarySearch]) + 1};
        this.a = mVar;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 6, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(TemporalField temporalField) {
        int iR;
        int iV;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.y(this);
        }
        switch (n.a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                iR = this.d;
                return iR;
            case 2:
                iR = R();
                return iR;
            case 3:
                iV = (this.d - 1) / 7;
                iR = iV + 1;
                return iR;
            case 4:
                iV = (int) j$.com.android.tools.r8.a.V(toEpochDay() + 3, 7L);
                iR = iV + 1;
                return iR;
            case 5:
                iV = (this.d - 1) % 7;
                iR = iV + 1;
                return iR;
            case 6:
                iV = (R() - 1) % 7;
                iR = iV + 1;
                return iR;
            case 7:
                return toEpochDay();
            case 8:
                iV = (R() - 1) / 7;
                iR = iV + 1;
                return iR;
            case 9:
                iR = this.c;
                return iR;
            case 10:
                return ((((long) this.b) * 12) + ((long) this.c)) - 1;
            case 11:
                iR = this.b;
                return iR;
            case 12:
                iR = this.b;
                return iR;
            case 13:
                return this.b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime D(LocalTime localTime) {
        return new e(this, localTime);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final k F() {
        return p.AH;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate H(j$.time.temporal.o oVar) {
        return (o) super.H(oVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int K() {
        return this.a.T(this.b, 12);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate Q(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.b) + ((long) ((int) j));
        int i = (int) j2;
        if (j2 == i) {
            return U(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    public final int R() {
        return this.a.T(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.c
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final o O(long j) {
        return new o(this.a, toEpochDay() + j);
    }

    @Override // j$.time.chrono.c
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final o P(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.b) * 12) + ((long) (this.c - 1)) + j;
        m mVar = this.a;
        long jW = j$.com.android.tools.r8.a.W(j2, 12L);
        if (jW >= mVar.P(0) && jW <= mVar.P(mVar.d.length - 1) - 1) {
            return U((int) jW, ((int) j$.com.android.tools.r8.a.V(j2, 12L)) + 1, this.d);
        }
        throw new DateTimeException("Invalid Hijrah year: " + jW);
    }

    public final o U(int i, int i2, int i3) {
        int iR = this.a.R(i, i2);
        if (i3 > iR) {
            i3 = iR;
        }
        return new o(this.a, i, i2, i3);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final o c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (o) super.c(j, temporalField);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        this.a.r(chronoField).b(j, chronoField);
        int i = (int) j;
        switch (n.a[chronoField.ordinal()]) {
            case 1:
                return U(this.b, this.c, i);
            case 2:
                return O(Math.min(i, K()) - R());
            case 3:
                return O((j - C(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return O(j - ((long) (((int) j$.com.android.tools.r8.a.V(toEpochDay() + 3, 7L)) + 1)));
            case 5:
                return O(j - C(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return O(j - C(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new o(this.a, j);
            case 8:
                return O((j - C(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return U(this.b, i, this.d);
            case 10:
                return P(j - (((((long) this.b) * 12) + ((long) this.c)) - 1));
            case 11:
                if (this.b < 1) {
                    i = 1 - i;
                }
                return U(i, this.c, this.d);
            case 12:
                return U(i, this.c, this.d);
            case 13:
                return U(1 - this.b, this.c, this.d);
            default:
                throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j a() {
        return this.a;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate d(long j, j$.time.temporal.q qVar) {
        return (o) super.d(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.b == oVar.b && this.c == oVar.c && this.d == oVar.d && this.a.equals(oVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        this.a.getClass();
        return ((i & (-2048)) ^ 2100100019) ^ (((i << 11) + (i2 << 6)) + i3);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l x(LocalDate localDate) {
        return (o) super.x(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.k(this);
        }
        if (!j$.com.android.tools.r8.a.s(this, temporalField)) {
            throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", temporalField));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = n.a[chronoField.ordinal()];
        if (i == 1) {
            return j$.time.temporal.s.f(1L, this.a.R(this.b, this.c));
        }
        if (i != 2) {
            return i != 3 ? this.a.r(chronoField) : j$.time.temporal.s.f(1L, 5L);
        }
        return j$.time.temporal.s.f(1L, K());
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean q() {
        return this.a.L(this.b);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: s */
    public final ChronoLocalDate y(long j, j$.time.temporal.q qVar) {
        return (o) super.y(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.a.Q(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate x(j$.time.temporal.m mVar) {
        return (o) super.x(mVar);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    public final j$.time.temporal.l y(long j, j$.time.temporal.a aVar) {
        return (o) super.y(j, aVar);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    public final j$.time.temporal.l d(long j, j$.time.temporal.q qVar) {
        return (o) super.d(j, qVar);
    }

    public o(m mVar, int i, int i2, int i3) {
        mVar.Q(i, i2, i3);
        this.a = mVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
