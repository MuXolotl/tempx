package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.l, j$.time.temporal.m, Comparable<OffsetDateTime>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final LocalDateTime a;
    public final ZoneOffset b;

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "dateTime");
        this.a = localDateTime;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public static OffsetDateTime N(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.getRules().d(instant);
        return new OffsetDateTime(LocalDateTime.Q(instant.getEpochSecond(), instant.getNano(), zoneOffsetD), zoneOffsetD);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 10, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.y(this);
        }
        int i = l.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.C(temporalField) : this.b.getTotalSeconds();
        }
        LocalDateTime localDateTime = this.a;
        ZoneOffset zoneOffset = this.b;
        localDateTime.getClass();
        return j$.com.android.tools.r8.a.z(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object E(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.d || temporalQuery == j$.time.temporal.p.e) {
            return this.b;
        }
        if (temporalQuery == j$.time.temporal.p.a) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.p.f) {
            return this.a.a;
        }
        if (temporalQuery == j$.time.temporal.p.g) {
            return this.a.b;
        }
        if (temporalQuery == j$.time.temporal.p.b) {
            return j$.time.chrono.q.c;
        }
        return temporalQuery == j$.time.temporal.p.c ? j$.time.temporal.a.NANOS : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime d(long j, j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? P(this.a.d(j, qVar), this.b) : (OffsetDateTime) qVar.j(this, j);
    }

    public final OffsetDateTime P(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (OffsetDateTime) temporalField.C(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = l.a[chronoField.ordinal()];
        LocalDateTime localDateTime = this.a;
        if (i != 1) {
            return i != 2 ? P(localDateTime.c(j, temporalField), this.b) : P(localDateTime, ZoneOffset.ofTotalSeconds(chronoField.b.a(j, chronoField)));
        }
        return N(Instant.ofEpochSecond(j, localDateTime.b.d), this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.b.equals(offsetDateTime2.b)) {
            iCompare = toLocalDateTime().compareTo((ChronoLocalDateTime<?>) offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.a;
            ZoneOffset zoneOffset = this.b;
            localDateTime.getClass();
            long jZ = j$.com.android.tools.r8.a.z(localDateTime, zoneOffset);
            LocalDateTime localDateTime2 = offsetDateTime2.a;
            ZoneOffset zoneOffset2 = offsetDateTime2.b;
            localDateTime2.getClass();
            iCompare = Long.compare(jZ, j$.com.android.tools.r8.a.z(localDateTime2, zoneOffset2));
            if (iCompare == 0) {
                iCompare = this.a.b.d - offsetDateTime2.a.b.d;
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo((ChronoLocalDateTime<?>) offsetDateTime2.toLocalDateTime()) : iCompare;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return j$.time.temporal.p.a(this, temporalField);
        }
        int i = l.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.j(temporalField) : this.b.getTotalSeconds();
        }
        throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l x(LocalDate localDate) {
        if (b.b(localDate)) {
            return P(this.a.x(localDate), this.b);
        }
        localDate.getClass();
        return (OffsetDateTime) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) ? ((ChronoField) temporalField).b : this.a.l(temporalField);
        }
        return temporalField.k(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return lVar.c(this.a.a.toEpochDay(), ChronoField.EPOCH_DAY).c(this.a.b.X(), ChronoField.NANO_OF_DAY).c(this.b.getTotalSeconds(), ChronoField.OFFSET_SECONDS);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
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
