package j$.time;

import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    public final int a;

    static {
        new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).toFormatter();
    }

    public q(int i) {
        this.a = i;
    }

    public static q N(int i) {
        ChronoField.YEAR.E(i);
        return new q(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 11, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.y(this);
        }
        int i = p.a[((ChronoField) temporalField).ordinal()];
        if (i == 1) {
            int i2 = this.a;
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return this.a;
        }
        if (i == 3) {
            return this.a < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.r(b.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object E(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.b) {
            return j$.time.chrono.q.c;
        }
        return temporalQuery == j$.time.temporal.p.c ? j$.time.temporal.a.YEARS : j$.time.temporal.p.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final q d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (q) qVar.j(this, j);
        }
        int i = p.b[((j$.time.temporal.a) qVar).ordinal()];
        if (i == 1) {
            return P(j);
        }
        if (i == 2) {
            return P(j$.com.android.tools.r8.a.X(j, 10L));
        }
        if (i == 3) {
            return P(j$.com.android.tools.r8.a.X(j, 100L));
        }
        if (i == 4) {
            return P(j$.com.android.tools.r8.a.X(j, 1000L));
        }
        if (i == 5) {
            ChronoField chronoField = ChronoField.ERA;
            return c(j$.com.android.tools.r8.a.R(C(chronoField), j), chronoField);
        }
        d.b(qVar, "Unsupported unit: ");
        return null;
    }

    public final q P(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return N(chronoField.b.a(((long) this.a) + j, chronoField));
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final q c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (q) temporalField.C(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.E(j);
        int i = p.a[chronoField.ordinal()];
        if (i == 1) {
            if (this.a < 1) {
                j = 1 - j;
            }
            return N((int) j);
        }
        if (i == 2) {
            return N((int) j);
        }
        if (i == 3) {
            return C(ChronoField.ERA) == j ? this : N(1 - this.a);
        }
        throw new j$.time.temporal.r(b.a("Unsupported field: ", temporalField));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((q) obj).a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.YEAR || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA;
        }
        return temporalField != null && temporalField.j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.a == ((q) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(TemporalField temporalField) {
        return l(temporalField).a(C(temporalField), temporalField);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l x(LocalDate localDate) {
        localDate.getClass();
        return (q) j$.com.android.tools.r8.a.a(localDate, this);
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
            return lVar.c(this.a, ChronoField.YEAR);
        }
        d.k("Adjustment only supported on ISO date-time");
        return null;
    }

    public final String toString() {
        return Integer.toString(this.a);
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
