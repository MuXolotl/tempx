package j$.time;

import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements TemporalAccessor, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.d("--");
        dateTimeFormatterBuilder.appendValue(ChronoField.MONTH_OF_YEAR, 2).appendLiteral('-').appendValue(ChronoField.DAY_OF_MONTH, 2).toFormatter();
    }

    public k(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 13, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.y(this);
        }
        int i2 = j.a[((ChronoField) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new j$.time.temporal.r(b.a("Unsupported field: ", temporalField));
            }
            i = this.a;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object E(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.p.b ? j$.time.chrono.q.c : j$.time.temporal.p.c(this, temporalQuery);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k kVar = (k) obj;
        int i = this.a - kVar.a;
        return i == 0 ? this.b - kVar.b : i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.DAY_OF_MONTH;
        }
        return temporalField != null && temporalField.j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.a == kVar.a && this.b == kVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(TemporalField temporalField) {
        return l(temporalField).a(C(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        int i;
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.o();
        }
        if (temporalField != ChronoField.DAY_OF_MONTH) {
            return j$.time.temporal.p.d(this, temporalField);
        }
        Month monthQ = Month.Q(this.a);
        monthQ.getClass();
        int i2 = i.a[monthQ.ordinal()];
        if (i2 != 1) {
            i = (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31;
        } else {
            i = 28;
        }
        return j$.time.temporal.s.g(1L, i, Month.Q(this.a).P());
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        if (!j$.com.android.tools.r8.a.P(lVar).equals(j$.time.chrono.q.c)) {
            d.k("Adjustment only supported on ISO date-time");
            return null;
        }
        j$.time.temporal.l lVarC = lVar.c(this.a, ChronoField.MONTH_OF_YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return lVarC.c(Math.min(lVarC.l(chronoField).d, this.b), chronoField);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.a < 10 ? "0" : "");
        sb.append(this.a);
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }
}
