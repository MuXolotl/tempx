package j$.time;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class YearMonth implements j$.time.temporal.l, j$.time.temporal.m, Comparable<YearMonth>, Serializable {
    public static final DateTimeFormatter c = new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    public YearMonth(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static YearMonth of(int i, int i2) {
        ChronoField.YEAR.E(i);
        ChronoField.MONTH_OF_YEAR.E(i2);
        return new YearMonth(i, i2);
    }

    public static YearMonth parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = c;
        Objects.a(dateTimeFormatter, "formatter");
        return (YearMonth) dateTimeFormatter.parse(charSequence, new f(3));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 12, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.y(this);
        }
        int i2 = r.a[((ChronoField) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 == 2) {
                return N();
            }
            if (i2 == 3) {
                int i3 = this.a;
                if (i3 < 1) {
                    i3 = 1 - i3;
                }
                return i3;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    return this.a < 1 ? 0 : 1;
                }
                throw new j$.time.temporal.r(b.a("Unsupported field: ", temporalField));
            }
            i = this.a;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object E(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.b) {
            return j$.time.chrono.q.c;
        }
        return temporalQuery == j$.time.temporal.p.c ? j$.time.temporal.a.MONTHS : j$.time.temporal.p.c(this, temporalQuery);
    }

    public final long N() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final YearMonth d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (YearMonth) qVar.j(this, j);
        }
        switch (r.b[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return P(j);
            case 2:
                return Q(j);
            case 3:
                return Q(j$.com.android.tools.r8.a.X(j, 10L));
            case 4:
                return Q(j$.com.android.tools.r8.a.X(j, 100L));
            case 5:
                return Q(j$.com.android.tools.r8.a.X(j, 1000L));
            case 6:
                ChronoField chronoField = ChronoField.ERA;
                return c(j$.com.android.tools.r8.a.R(C(chronoField), j), chronoField);
            default:
                d.b(qVar, "Unsupported unit: ");
                return null;
        }
    }

    public final YearMonth P(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        ChronoField chronoField = ChronoField.YEAR;
        return R(chronoField.b.a(j$.com.android.tools.r8.a.W(j2, 12L), chronoField), ((int) j$.com.android.tools.r8.a.V(j2, 12L)) + 1);
    }

    public final YearMonth Q(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return R(chronoField.b.a(((long) this.a) + j, chronoField), this.b);
    }

    public final YearMonth R(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new YearMonth(i, i2);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final YearMonth c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (YearMonth) temporalField.C(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.E(j);
        int i = r.a[chronoField.ordinal()];
        if (i == 1) {
            int i2 = (int) j;
            ChronoField.MONTH_OF_YEAR.E(i2);
            return R(this.a, i2);
        }
        if (i == 2) {
            return P(j - N());
        }
        if (i == 3) {
            if (this.a < 1) {
                j = 1 - j;
            }
            int i3 = (int) j;
            ChronoField.YEAR.E(i3);
            return R(i3, this.b);
        }
        if (i == 4) {
            int i4 = (int) j;
            ChronoField.YEAR.E(i4);
            return R(i4, this.b);
        }
        if (i != 5) {
            throw new j$.time.temporal.r(b.a("Unsupported field: ", temporalField));
        }
        if (C(ChronoField.ERA) == j) {
            return this;
        }
        int i5 = 1 - this.a;
        ChronoField.YEAR.E(i5);
        return R(i5, this.b);
    }

    @Override // java.lang.Comparable
    public int compareTo(YearMonth yearMonth) {
        int i = this.a - yearMonth.a;
        return i == 0 ? this.b - yearMonth.b : i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.YEAR || temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.PROLEPTIC_MONTH || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA;
        }
        return temporalField != null && temporalField.j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YearMonth) {
            YearMonth yearMonth = (YearMonth) obj;
            if (this.a == yearMonth.a && this.b == yearMonth.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.b << 27) ^ this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(TemporalField temporalField) {
        return l(temporalField).a(C(temporalField), temporalField);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l x(LocalDate localDate) {
        localDate.getClass();
        return (YearMonth) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return j$.time.temporal.s.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.p.d(this, temporalField);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        if (j$.com.android.tools.r8.a.P(lVar).equals(j$.time.chrono.q.c)) {
            return lVar.c(N(), ChronoField.PROLEPTIC_MONTH);
        }
        d.k("Adjustment only supported on ISO date-time");
        return null;
    }

    public final String toString() {
        int iAbs = Math.abs(this.a);
        StringBuilder sb = new StringBuilder(9);
        int i = this.a;
        if (iAbs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + ModuleDescriptor.MODULE_VERSION);
            sb.deleteCharAt(0);
        }
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l y(long j, j$.time.temporal.a aVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = d(Long.MAX_VALUE, aVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.d(j2, aVar);
    }
}
