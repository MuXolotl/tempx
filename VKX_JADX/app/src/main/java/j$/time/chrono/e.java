package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements ChronoLocalDateTime, j$.time.temporal.l, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient ChronoLocalDate a;
    public final transient LocalTime b;

    public e(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.a(localTime, "time");
        this.a = chronoLocalDate;
        this.b = localTime;
    }

    public static e N(j jVar, j$.time.temporal.l lVar) {
        e eVar = (e) lVar;
        if (jVar.equals(eVar.a.a())) {
            return eVar;
        }
        j$.time.d.f("Chronology mismatch, required: ", jVar.i(), eVar.a.a().i());
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 2, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).N() ? this.b.C(temporalField) : this.a.C(temporalField);
        }
        return temporalField.y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object E(TemporalQuery temporalQuery) {
        return j$.com.android.tools.r8.a.w(this, temporalQuery);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final e d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return N(this.a.a(), qVar.j(this, j));
        }
        switch (d.a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return P(this.a, 0L, 0L, 0L, j);
            case 2:
                e eVarR = R(this.a.d(j / 86400000000L, (j$.time.temporal.q) j$.time.temporal.a.DAYS), this.b);
                return eVarR.P(eVarR.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                e eVarR2 = R(this.a.d(j / 86400000, (j$.time.temporal.q) j$.time.temporal.a.DAYS), this.b);
                return eVarR2.P(eVarR2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return P(this.a, 0L, 0L, j, 0L);
            case 5:
                return P(this.a, 0L, j, 0L, 0L);
            case 6:
                return P(this.a, j, 0L, 0L, 0L);
            case 7:
                e eVarR3 = R(this.a.d(j / 256, (j$.time.temporal.q) j$.time.temporal.a.DAYS), this.b);
                return eVarR3.P(eVarR3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return R(this.a.d(j, qVar), this.b);
        }
    }

    public final e P(ChronoLocalDate chronoLocalDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTime = this.b;
        if (j5 == 0) {
            return R(chronoLocalDate, localTime);
        }
        long j6 = j / 24;
        long jX = localTime.X();
        long j7 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L) + jX;
        long jW = j$.com.android.tools.r8.a.W(j7, 86400000000000L) + j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long jV = j$.com.android.tools.r8.a.V(j7, 86400000000000L);
        return R(chronoLocalDate.d(jW, (j$.time.temporal.q) j$.time.temporal.a.DAYS), jV == jX ? this.b : LocalTime.Q(jV));
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final e c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return N(this.a.a(), temporalField.C(this, j));
        }
        boolean zN = ((ChronoField) temporalField).N();
        ChronoLocalDate chronoLocalDate = this.a;
        return zN ? R(chronoLocalDate, this.b.c(j, temporalField)) : R(chronoLocalDate.c(j, temporalField), this.b);
    }

    public final e R(j$.time.temporal.l lVar, LocalTime localTime) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == lVar && this.b == localTime) ? this : new e(c.N(chronoLocalDate.a(), lVar), localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j a() {
        return this.a.a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime b() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        return compareTo((ChronoLocalDateTime) chronoLocalDateTime);
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
        return (obj instanceof ChronoLocalDateTime) && j$.com.android.tools.r8.a.g(this, (ChronoLocalDateTime) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoLocalDate f() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).N() ? this.b.j(temporalField) : this.a.j(temporalField);
        }
        return l(temporalField).a(C(temporalField), temporalField);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l x(LocalDate localDate) {
        if (j$.time.b.b(localDate)) {
            return R(localDate, this.b);
        }
        j jVarA = this.a.a();
        localDate.getClass();
        return N(jVarA, (e) j$.com.android.tools.r8.a.a(localDate, this));
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

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l y(long j, j$.time.temporal.a aVar) {
        return N(this.a.a(), j$.time.temporal.p.b(this, j, aVar));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime z(ZoneId zoneId) {
        return i.N(zoneId, null, this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return j$.com.android.tools.r8.a.g(this, chronoLocalDateTime);
    }
}
