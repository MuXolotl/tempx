package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
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
public final class LocalDateTime implements j$.time.temporal.l, j$.time.temporal.m, ChronoLocalDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = 6207766400415563566L;
    public final LocalDate a;
    public final LocalTime b;
    public static final LocalDateTime MIN = of(LocalDate.MIN, LocalTime.MIN);
    public static final LocalDateTime MAX = of(LocalDate.MAX, LocalTime.MAX);

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.a = localDate;
        this.b = localTime;
    }

    public static LocalDateTime O(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).p();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.P(temporalAccessor), LocalTime.O(temporalAccessor));
        } catch (DateTimeException e) {
            d.h("Unable to obtain LocalDateTime from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e);
            return null;
        }
    }

    public static LocalDateTime Q(long j, int i, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        long j2 = i;
        ChronoField.NANO_OF_SECOND.E(j2);
        long totalSeconds = j + ((long) zoneOffset.getTotalSeconds());
        return new LocalDateTime(LocalDate.ofEpochDay(j$.com.android.tools.r8.a.W(totalSeconds, 86400L)), LocalTime.Q((((long) ((int) j$.com.android.tools.r8.a.V(totalSeconds, 86400L))) * 1000000000) + j2));
    }

    public static LocalDateTime of(LocalDate localDate, LocalTime localTime) {
        Objects.a(localDate, "date");
        Objects.a(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        return Q(instant.getEpochSecond(), instant.getNano(), zoneId.getRules().d(instant));
    }

    public static LocalDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.g;
        Objects.a(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.parse(charSequence, new f(1));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 5, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).N() ? this.b.C(temporalField) : this.a.C(temporalField);
        }
        return temporalField.y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object E(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.p.f ? this.a : j$.com.android.tools.r8.a.w(this, temporalQuery);
    }

    public final int N(LocalDateTime localDateTime) {
        int iN = this.a.N(localDateTime.a);
        return iN == 0 ? this.b.compareTo(localDateTime.b) : iN;
    }

    public final boolean P(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return N((LocalDateTime) chronoLocalDateTime) < 0;
        }
        long epochDay = this.a.toEpochDay();
        long epochDay2 = chronoLocalDateTime.f().toEpochDay();
        if (epochDay >= epochDay2) {
            return epochDay == epochDay2 && this.b.X() < chronoLocalDateTime.b().X();
        }
        return true;
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (LocalDateTime) qVar.j(this, j);
        }
        switch (g.a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return T(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime localDateTimeV = V(this.a.Y(j / 86400000000L), this.b);
                return localDateTimeV.T(localDateTimeV.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeV2 = V(this.a.Y(j / 86400000), this.b);
                return localDateTimeV2.T(localDateTimeV2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return S(j);
            case 5:
                return T(this.a, 0L, j, 0L, 0L);
            case 6:
                return T(this.a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeV3 = V(this.a.Y(j / 256), this.b);
                return localDateTimeV3.T(localDateTimeV3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return V(this.a.d(j, qVar), this.b);
        }
    }

    public final LocalDateTime S(long j) {
        return T(this.a, 0L, 0L, j, 0L);
    }

    public final LocalDateTime T(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTime = this.b;
        if (j5 == 0) {
            return V(localDate, localTime);
        }
        long j6 = j / 24;
        long jX = localTime.X();
        long j7 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L) + jX;
        long jW = j$.com.android.tools.r8.a.W(j7, 86400000000000L) + j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long jV = j$.com.android.tools.r8.a.V(j7, 86400000000000L);
        return V(localDate.Y(jW), jV == jX ? this.b : LocalTime.Q(jV));
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalDateTime) temporalField.C(this, j);
        }
        boolean zN = ((ChronoField) temporalField).N();
        LocalDate localDate = this.a;
        return zN ? V(localDate, this.b.c(j, temporalField)) : V(localDate.c(j, temporalField), this.b);
    }

    public final LocalDateTime V(LocalDate localDate, LocalTime localTime) {
        return (this.a == localDate && this.b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime x(j$.time.temporal.m mVar) {
        if (mVar instanceof LocalDate) {
            return V((LocalDate) mVar, this.b);
        }
        if (mVar instanceof LocalTime) {
            return V(this.a, (LocalTime) mVar);
        }
        return mVar instanceof LocalDateTime ? (LocalDateTime) mVar : (LocalDateTime) mVar.o(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.j a() {
        return ((LocalDate) f()).a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime b() {
        return this.b;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? N((LocalDateTime) chronoLocalDateTime) : j$.com.android.tools.r8.a.g(this, chronoLocalDateTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.j(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.isDateBased() || chronoField.N();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoLocalDate f() {
        return this.a;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public int getDayOfMonth() {
        return this.a.getDayOfMonth();
    }

    public Month getMonth() {
        return this.a.getMonth();
    }

    public int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).N() ? this.b.j(temporalField) : this.a.j(temporalField);
        }
        return j$.time.temporal.p.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.k(this);
        }
        if (!((ChronoField) temporalField).N()) {
            return this.a.l(temporalField);
        }
        LocalTime localTime = this.b;
        localTime.getClass();
        return j$.time.temporal.p.d(localTime, temporalField);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return lVar.c(f().toEpochDay(), ChronoField.EPOCH_DAY).c(b().X(), ChronoField.NANO_OF_DAY);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return j$.com.android.tools.r8.a.z(this, zoneOffset);
    }

    public String toString() {
        return this.a.toString() + "T" + this.b.toString();
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

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime z(ZoneId zoneId) {
        return ZonedDateTime.N(this, zoneId, null);
    }
}
