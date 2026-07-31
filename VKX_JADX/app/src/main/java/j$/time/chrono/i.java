package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
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
public final class i implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient e a;
    public final transient ZoneOffset b;
    public final transient ZoneId c;

    public i(ZoneId zoneId, ZoneOffset zoneOffset, e eVar) {
        Objects.a(eVar, "dateTime");
        this.a = eVar;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
        Objects.a(zoneId, "zone");
        this.c = zoneId;
    }

    public static i N(ZoneId zoneId, ZoneOffset zoneOffset, e eVar) {
        Objects.a(eVar, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new i(zoneId, (ZoneOffset) zoneId, eVar);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime localDateTimeO = LocalDateTime.O(eVar);
        List listF = rules.f(localDateTimeO);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() == 0) {
            Object objE = rules.e(localDateTimeO);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            eVar = eVar.P(eVar.a, 0L, 0L, Duration.k(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds(), 0).getSeconds(), 0L);
            zoneOffset = bVar.d;
        } else {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            eVar = eVar;
        }
        Objects.a(zoneOffset, "offset");
        return new i(zoneId, zoneOffset, eVar);
    }

    public static i O(j jVar, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.getRules().d(instant);
        Objects.a(zoneOffsetD, "offset");
        return new i(zoneId, zoneOffsetD, (e) jVar.B(LocalDateTime.Q(instant.getEpochSecond(), instant.getNano(), zoneOffsetD)));
    }

    public static i o(j jVar, j$.time.temporal.l lVar) {
        i iVar = (i) lVar;
        if (jVar.equals(iVar.a())) {
            return iVar;
        }
        j$.time.d.f("Chronology mismatch, required: ", jVar.i(), iVar.a().i());
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 3, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.y(this);
        }
        int i = g.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? ((e) p()).C(temporalField) : g().getTotalSeconds();
        }
        return M();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object E(TemporalQuery temporalQuery) {
        return j$.com.android.tools.r8.a.x(this, temporalQuery);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long M() {
        return j$.com.android.tools.r8.a.A(this);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final i d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return o(a(), qVar.j(this, j));
        }
        return o(a(), this.a.d(j, qVar).o(this));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j a() {
        return f().a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final LocalTime b() {
        return ((e) p()).b();
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return o(a(), temporalField.C(this, j));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = h.a[chronoField.ordinal()];
        if (i == 1) {
            return d(j - j$.com.android.tools.r8.a.A(this), j$.time.temporal.a.SECONDS);
        }
        if (i != 2) {
            return N(this.c, this.b, this.a.c(j, temporalField));
        }
        ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(chronoField.b.a(j, chronoField));
        e eVar = this.a;
        eVar.getClass();
        return O(a(), Instant.ofEpochSecond(j$.com.android.tools.r8.a.z(eVar, zoneOffsetOfTotalSeconds), eVar.b.d), this.c);
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
        return (obj instanceof ChronoZonedDateTime) && j$.com.android.tools.r8.a.h(this, (ChronoZonedDateTime) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDate f() {
        return ((e) p()).f();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset g() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId getZone() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c.hashCode(), 3) ^ (this.a.hashCode() ^ this.b.hashCode());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int j(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.n(this, temporalField);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l x(LocalDate localDate) {
        return o(a(), localDate.o(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) ? ((ChronoField) temporalField).b : this.a.l(temporalField);
        }
        return temporalField.k(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime p() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.ofEpochSecond(M(), b().d);
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
        return N(zoneId, this.b, this.a);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l y(long j, j$.time.temporal.a aVar) {
        return o(a(), j$.time.temporal.p.b(this, j, aVar));
    }
}
