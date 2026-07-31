package j$.time;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class LocalDate implements j$.time.temporal.l, j$.time.temporal.m, ChronoLocalDate, Serializable {
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;
    public static final LocalDate MIN = of(-999999999, 1, 1);
    public static final LocalDate MAX = of(999999999, 12, 31);

    static {
        of(1970, 1, 1);
    }

    public LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static LocalDate O(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (j$.time.chrono.q.c.L(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    d.e("Invalid date 'February 29' as '", i, "' is not a leap year");
                    return null;
                }
                throw new DateTimeException("Invalid date '" + Month.Q(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate P(TemporalAccessor temporalAccessor) {
        Objects.a(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.E(j$.time.temporal.p.f);
        if (localDate != null) {
            return localDate;
        }
        d.g("Unable to obtain LocalDate from TemporalAccessor: ", temporalAccessor, " of type ", temporalAccessor.getClass().getName());
        return null;
    }

    public static LocalDate V(a aVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Instant instant = Instant.c;
        Instant instantN = Instant.N(j$.com.android.tools.r8.a.W(jCurrentTimeMillis, 1000L), ((int) j$.com.android.tools.r8.a.V(jCurrentTimeMillis, 1000L)) * 1000000);
        ZoneId zoneId = aVar.a;
        Objects.a(zoneId, "zone");
        return ofEpochDay(j$.com.android.tools.r8.a.W(instantN.getEpochSecond() + ((long) zoneId.getRules().d(instantN).getTotalSeconds()), 86400L));
    }

    public static LocalDate W(int i, int i2) {
        long j = i;
        ChronoField.YEAR.E(j);
        ChronoField.DAY_OF_YEAR.E(i2);
        boolean zL = j$.time.chrono.q.c.L(j);
        if (i2 == 366 && !zL) {
            d.e("Invalid date 'DayOfYear 366' as '", i, "' is not a leap year");
            return null;
        }
        Month monthQ = Month.Q(((i2 - 1) / 31) + 1);
        if (i2 > (monthQ.O(zL) + monthQ.N(zL)) - 1) {
            monthQ = Month.a[(monthQ.ordinal() + 13) % 12];
        }
        return new LocalDate(i, monthQ.getValue(), (i2 - monthQ.N(zL)) + 1);
    }

    public static LocalDate c0(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, j$.time.chrono.q.c.L((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate of(int i, int i2, int i3) {
        ChronoField.YEAR.E(i);
        ChronoField.MONTH_OF_YEAR.E(i2);
        ChronoField.DAY_OF_MONTH.E(i3);
        return O(i, i2, i3);
    }

    public static LocalDate ofEpochDay(long j) {
        long j2;
        ChronoField.EPOCH_DAY.E(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + ((long) (i2 / 10));
        ChronoField chronoField = ChronoField.YEAR;
        return new LocalDate(chronoField.b.a(j7, chronoField), i3, i4);
    }

    public static LocalDate parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        Objects.a(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.parse(charSequence, new f(0));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 3, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.y(this);
        }
        if (temporalField == ChronoField.EPOCH_DAY) {
            return toEpochDay();
        }
        return temporalField == ChronoField.PROLEPTIC_MONTH ? ((((long) this.a) * 12) + ((long) this.b)) - 1 : Q(temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime D(LocalTime localTime) {
        return LocalDateTime.of(this, localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object E(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.p.f ? this : j$.com.android.tools.r8.a.v(this, temporalQuery);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.k F() {
        return getYear() >= 1 ? j$.time.chrono.r.CE : j$.time.chrono.r.BCE;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate H(j$.time.temporal.o oVar) {
        if (b.b(oVar)) {
            n nVar = (n) oVar;
            return Z((((long) nVar.a) * 12) + ((long) nVar.b)).Y(nVar.c);
        }
        Objects.a(oVar, "amountToAdd");
        return (LocalDate) ((n) oVar).j(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int K() {
        return q() ? 366 : 365;
    }

    public final int N(LocalDate localDate) {
        int i = this.a - localDate.a;
        return (i == 0 && (i = this.b - localDate.b) == 0) ? this.c - localDate.c : i;
    }

    public final int Q(TemporalField temporalField) {
        switch (e.a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.c;
            case 2:
                return R();
            case 3:
                return ((this.c - 1) / 7) + 1;
            case 4:
                int i = this.a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                return ((this.c - 1) % 7) + 1;
            case 7:
                return ((R() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.r("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((R() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.r("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.a;
            case 13:
                return this.a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.r(b.a("Unsupported field: ", temporalField));
        }
    }

    public final int R() {
        return (getMonth().N(q()) + this.c) - 1;
    }

    public final boolean S(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return N((LocalDate) chronoLocalDate) < 0;
        }
        return toEpochDay() < chronoLocalDate.toEpochDay();
    }

    public final int T() {
        short s = this.b;
        if (s != 2) {
            return (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31;
        }
        return q() ? 29 : 28;
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate y(long j, j$.time.temporal.q qVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = d(Long.MAX_VALUE, qVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.d(j2, qVar);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final LocalDate d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (LocalDate) qVar.j(this, j);
        }
        switch (e.b[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return Y(j);
            case 2:
                return a0(j);
            case 3:
                return Z(j);
            case 4:
                return b0(j);
            case 5:
                return b0(j$.com.android.tools.r8.a.X(j, 10L));
            case 6:
                return b0(j$.com.android.tools.r8.a.X(j, 100L));
            case 7:
                return b0(j$.com.android.tools.r8.a.X(j, 1000L));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return c(j$.com.android.tools.r8.a.R(C(chronoField), j), chronoField);
            default:
                d.b(qVar, "Unsupported unit: ");
                return null;
        }
    }

    public final LocalDate Y(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.c) + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new LocalDate(this.a, this.b, (int) j2);
            }
            if (j2 <= 59) {
                long jT = T();
                if (j2 <= jT) {
                    return new LocalDate(this.a, this.b, (int) j2);
                }
                short s = this.b;
                if (s < 12) {
                    return new LocalDate(this.a, s + 1, (int) (j2 - jT));
                }
                ChronoField.YEAR.E(this.a + 1);
                return new LocalDate(this.a + 1, 1, (int) (j2 - jT));
            }
        }
        return ofEpochDay(j$.com.android.tools.r8.a.R(toEpochDay(), j));
    }

    public final LocalDate Z(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        ChronoField chronoField = ChronoField.YEAR;
        return c0(chronoField.b.a(j$.com.android.tools.r8.a.W(j2, 12L), chronoField), ((int) j$.com.android.tools.r8.a.V(j2, 12L)) + 1, this.c);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.j a() {
        return j$.time.chrono.q.c;
    }

    public final LocalDate a0(long j) {
        return Y(j$.com.android.tools.r8.a.X(j, 7L));
    }

    public final LocalDate b0(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return c0(chronoField.b.a(((long) this.a) + j, chronoField), this.b, this.c);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? N((LocalDate) chronoLocalDate) : j$.com.android.tools.r8.a.f(this, chronoLocalDate);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final LocalDate c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalDate) temporalField.C(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.E(j);
        switch (e.a[chronoField.ordinal()]) {
            case 1:
                int i = (int) j;
                if (this.c != i) {
                    return of(this.a, this.b, i);
                }
                return this;
            case 2:
                int i2 = (int) j;
                if (R() != i2) {
                    return W(this.a, i2);
                }
                return this;
            case 3:
                return a0(j - C(ChronoField.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.a < 1) {
                    j = 1 - j;
                }
                return f0((int) j);
            case 5:
                return Y(j - ((long) getDayOfWeek().getValue()));
            case 6:
                return Y(j - C(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return Y(j - C(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return ofEpochDay(j);
            case 9:
                return a0(j - C(ChronoField.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i3 = (int) j;
                if (this.b != i3) {
                    ChronoField.MONTH_OF_YEAR.E(i3);
                    return c0(this.a, i3, this.c);
                }
                return this;
            case 11:
                return Z(j - (((((long) this.a) * 12) + ((long) this.b)) - 1));
            case 12:
                return f0((int) j);
            case 13:
                if (C(ChronoField.ERA) != j) {
                    return f0(1 - this.a);
                }
                return this;
            default:
                throw new j$.time.temporal.r(b.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.s(this, temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate x(j$.time.temporal.m mVar) {
        return mVar instanceof LocalDate ? (LocalDate) mVar : (LocalDate) mVar.o(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && N((LocalDate) obj) == 0;
    }

    public final LocalDate f0(int i) {
        if (this.a == i) {
            return this;
        }
        ChronoField.YEAR.E(i);
        return c0(i, this.b, this.c);
    }

    public int getDayOfMonth() {
        return this.c;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.N(((int) j$.com.android.tools.r8.a.V(toEpochDay() + 3, 7L)) + 1);
    }

    public Month getMonth() {
        return Month.Q(this.b);
    }

    public int getYear() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i = this.a;
        return (i & (-2048)) ^ (((i << 11) + (this.b << 6)) + this.c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? Q(temporalField) : j$.time.temporal.p.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.k(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (!chronoField.isDateBased()) {
            throw new j$.time.temporal.r(b.a("Unsupported field: ", temporalField));
        }
        int i = e.a[chronoField.ordinal()];
        if (i == 1) {
            return j$.time.temporal.s.f(1L, T());
        }
        if (i == 2) {
            return j$.time.temporal.s.f(1L, K());
        }
        if (i == 3) {
            return j$.time.temporal.s.f(1L, (getMonth() != Month.FEBRUARY || q()) ? 5L : 4L);
        }
        if (i != 4) {
            return chronoField.b;
        }
        return getYear() <= 0 ? j$.time.temporal.s.f(1L, 1000000000L) : j$.time.temporal.s.f(1L, 999999999L);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return j$.com.android.tools.r8.a.a(this, lVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean q() {
        return j$.time.chrono.q.c.L(this.a);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j;
        long j2 = this.a;
        long j3 = this.b;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.c - 1));
        if (j3 > 2) {
            j5 = !q() ? j5 - 2 : j5 - 1;
        }
        return j5 - 719528;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        int i = this.a;
        short s = this.b;
        short s2 = this.c;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + ModuleDescriptor.MODULE_VERSION);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }
}
