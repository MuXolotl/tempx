package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.temporal.l, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final LocalDateTime a;
    public final ZoneOffset b;
    public final ZoneId c;

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    public static ZonedDateTime N(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List listF = rules.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() == 0) {
            Object objE = rules.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.S(Duration.k(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds(), 0).getSeconds());
            zoneOffset = bVar.d;
        } else if (zoneOffset == null || !listF.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listF.get(0);
            Objects.a(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime o(long j, int i, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.getRules().d(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.Q(j, i, zoneOffsetD), zoneId, zoneOffsetD);
    }

    public static ZonedDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return (ZonedDateTime) dateTimeFormatter.parse(charSequence, new f(4));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 6, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.y(this);
        }
        int i = u.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.C(temporalField) : this.b.getTotalSeconds();
        }
        return j$.com.android.tools.r8.a.A(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object E(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.p.f ? this.a.a : j$.com.android.tools.r8.a.x(this, temporalQuery);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long M() {
        return j$.com.android.tools.r8.a.A(this);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (ZonedDateTime) qVar.j(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        if (aVar.compareTo(j$.time.temporal.a.DAYS) >= 0 && aVar != j$.time.temporal.a.FOREVER) {
            return N(this.a.d(j, qVar), this.c, this.b);
        }
        LocalDateTime localDateTimeD = this.a.d(j, qVar);
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        Objects.a(localDateTimeD, "localDateTime");
        Objects.a(zoneOffset, "offset");
        Objects.a(zoneId, "zone");
        return zoneId.getRules().f(localDateTimeD).contains(zoneOffset) ? new ZonedDateTime(localDateTimeD, zoneId, zoneOffset) : o(j$.com.android.tools.r8.a.z(localDateTimeD, zoneOffset), localDateTimeD.b.d, zoneId);
    }

    public final ZonedDateTime P(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.b) || !this.c.getRules().f(this.a).contains(zoneOffset)) ? this : new ZonedDateTime(this.a, this.c, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.j a() {
        return ((LocalDate) f()).a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final LocalTime b() {
        return this.a.b;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (ZonedDateTime) temporalField.C(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = u.a[chronoField.ordinal()];
        if (i != 1) {
            return i != 2 ? N(this.a.c(j, temporalField), this.c, this.b) : P(ZoneOffset.ofTotalSeconds(chronoField.b.a(j, chronoField)));
        }
        return o(j, this.a.b.d, this.c);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return j$.com.android.tools.r8.a.h(this, chronoZonedDateTime);
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
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDate f() {
        return this.a.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset g() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public ZoneId getZone() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c.hashCode(), 3) ^ (this.a.hashCode() ^ this.b.hashCode());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return j$.com.android.tools.r8.a.n(this, temporalField);
        }
        int i = u.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.j(temporalField) : this.b.getTotalSeconds();
        }
        throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l x(LocalDate localDate) {
        return b.b(localDate) ? N(LocalDateTime.of(localDate, this.a.b), this.c, this.b) : (ZonedDateTime) localDate.o(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) ? ((ChronoField) temporalField).b : this.a.l(temporalField);
        }
        return temporalField.k(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.ofEpochSecond(M(), b().d);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: toLocalDateTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime p() {
        return this.a;
    }

    public final String toString() {
        String str = this.a.toString() + this.b.toString();
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime w(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        return this.c.equals(zoneId) ? this : N(this.a, zoneId, this.b);
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
