package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class x {
    public final TemporalAccessor a;
    public final DateTimeFormatter b;
    public int c;

    public x(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.j jVar = dateTimeFormatter.e;
        if (jVar != null) {
            j$.time.chrono.j jVar2 = (j$.time.chrono.j) temporalAccessor.E(j$.time.temporal.p.b);
            ZoneId zoneId = (ZoneId) temporalAccessor.E(j$.time.temporal.p.a);
            ChronoLocalDate chronoLocalDateA = null;
            jVar = Objects.equals(jVar, jVar2) ? null : jVar;
            Objects.equals(null, zoneId);
            if (jVar != null) {
                j$.time.chrono.j jVar3 = jVar != null ? jVar : jVar2;
                if (jVar != null) {
                    if (temporalAccessor.e(ChronoField.EPOCH_DAY)) {
                        chronoLocalDateA = jVar3.A(temporalAccessor);
                    } else if (jVar != j$.time.chrono.q.c || jVar2 != null) {
                        for (ChronoField chronoField : ChronoField.values()) {
                            if (chronoField.isDateBased() && temporalAccessor.e(chronoField)) {
                                throw new DateTimeException("Unable to apply override chronology '" + jVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new w(chronoLocalDateA, temporalAccessor, jVar3, zoneId);
            }
        }
        this.a = temporalAccessor;
        this.b = dateTimeFormatter;
    }

    public final Long a(TemporalField temporalField) {
        int i = this.c;
        TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.e(temporalField)) {
            return Long.valueOf(temporalAccessor.C(temporalField));
        }
        return null;
    }

    public final Object b(TemporalQuery temporalQuery) {
        TemporalAccessor temporalAccessor = this.a;
        Object objE = temporalAccessor.E(temporalQuery);
        if (objE != null || this.c != 0) {
            return objE;
        }
        throw new DateTimeException("Unable to extract " + temporalQuery + " from temporal " + temporalAccessor);
    }

    public final String toString() {
        return this.a.toString();
    }
}
