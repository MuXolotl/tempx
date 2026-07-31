package j$.time;

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
public final class Instant implements j$.time.temporal.l, j$.time.temporal.m, Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;

    static {
        ofEpochSecond(-31557014167219200L, 0L);
        ofEpochSecond(31556889864403199L, 999999999L);
    }

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Instant N(long j, int i) {
        if ((((long) i) | j) == 0) {
            return c;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        d.k("Instant exceeds minimum or maximum instant");
        return null;
    }

    public static Instant O(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.a(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.C(ChronoField.INSTANT_SECONDS), temporalAccessor.j(ChronoField.NANO_OF_SECOND));
        } catch (DateTimeException e) {
            d.h("Unable to obtain Instant from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e);
            return null;
        }
    }

    public static Instant now() {
        a.b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        return N(j$.com.android.tools.r8.a.W(jCurrentTimeMillis, 1000L), ((int) j$.com.android.tools.r8.a.V(jCurrentTimeMillis, 1000L)) * 1000000);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return N(j$.com.android.tools.r8.a.R(j, j$.com.android.tools.r8.a.W(j2, 1000000000L)), (int) j$.com.android.tools.r8.a.V(j2, 1000000000L));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 2, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.y(this);
        }
        int i2 = c.a[((ChronoField) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else if (i2 == 2) {
            i = this.b / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.r(b.a("Unsupported field: ", temporalField));
            }
            i = this.b / 1000000;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object E(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.c) {
            return j$.time.temporal.a.NANOS;
        }
        if (temporalQuery == j$.time.temporal.p.b || temporalQuery == j$.time.temporal.p.a || temporalQuery == j$.time.temporal.p.e || temporalQuery == j$.time.temporal.p.d || temporalQuery == j$.time.temporal.p.f || temporalQuery == j$.time.temporal.p.g) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    public final Instant P(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(j$.com.android.tools.r8.a.R(j$.com.android.tools.r8.a.R(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final Instant d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (Instant) qVar.j(this, j);
        }
        switch (c.b[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return P(0L, j);
            case 2:
                return P(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return P(j / 1000, (j % 1000) * 1000000);
            case 4:
                return P(j, 0L);
            case 5:
                return P(j$.com.android.tools.r8.a.X(j, 60L), 0L);
            case 6:
                return P(j$.com.android.tools.r8.a.X(j, 3600L), 0L);
            case 7:
                return P(j$.com.android.tools.r8.a.X(j, 43200L), 0L);
            case 8:
                return P(j$.com.android.tools.r8.a.X(j, 86400L), 0L);
            default:
                d.b(qVar, "Unsupported unit: ");
                return null;
        }
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.N(this, zoneOffset);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (Instant) temporalField.C(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.E(j);
        int i = c.a[chronoField.ordinal()];
        if (i == 1) {
            return j != ((long) this.b) ? N(this.a, (int) j) : this;
        }
        if (i == 2) {
            int i2 = ((int) j) * 1000;
            return i2 != this.b ? N(this.a, i2) : this;
        }
        if (i == 3) {
            int i3 = ((int) j) * 1000000;
            return i3 != this.b ? N(this.a, i3) : this;
        }
        if (i == 4) {
            return j != this.a ? N(j, this.b) : this;
        }
        throw new j$.time.temporal.r(b.a("Unsupported field: ", temporalField));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.a, instant2.a);
        return iCompare != 0 ? iCompare : this.b - instant2.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.NANO_OF_SECOND || temporalField == ChronoField.MICRO_OF_SECOND || temporalField == ChronoField.MILLI_OF_SECOND;
        }
        return temporalField != null && temporalField.j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return j$.time.temporal.p.d(this, temporalField).a(temporalField.y(this), temporalField);
        }
        int i = c.a[((ChronoField) temporalField).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.b / 1000;
        }
        if (i == 3) {
            return this.b / 1000000;
        }
        if (i == 4) {
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            chronoField.b.a(this.a, chronoField);
        }
        throw new j$.time.temporal.r(b.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l x(LocalDate localDate) {
        localDate.getClass();
        return (Instant) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        return j$.time.temporal.p.d(this, temporalField);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return lVar.c(this.a, ChronoField.INSTANT_SECONDS).c(this.b, ChronoField.NANO_OF_SECOND);
    }

    public long toEpochMilli() {
        long j = this.a;
        return (j >= 0 || this.b <= 0) ? j$.com.android.tools.r8.a.R(j$.com.android.tools.r8.a.X(j, 1000L), this.b / 1000000) : j$.com.android.tools.r8.a.R(j$.com.android.tools.r8.a.X(j + 1, 1000L), (this.b / 1000000) - 1000);
    }

    public final String toString() {
        return DateTimeFormatter.h.format(this);
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
