package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements TemporalAccessor {
    public final /* synthetic */ ChronoLocalDate a;
    public final /* synthetic */ TemporalAccessor b;
    public final /* synthetic */ j$.time.chrono.j c;
    public final /* synthetic */ ZoneId d;

    public w(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, j$.time.chrono.j jVar, ZoneId zoneId) {
        this.a = chronoLocalDate;
        this.b = temporalAccessor;
        this.c = jVar;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !temporalField.isDateBased()) ? this.b.C(temporalField) : chronoLocalDate.C(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object E(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.b) {
            return this.c;
        }
        if (temporalQuery == j$.time.temporal.p.a) {
            return this.d;
        }
        return temporalQuery == j$.time.temporal.p.c ? this.b.E(temporalQuery) : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !temporalField.isDateBased()) ? this.b.e(temporalField) : chronoLocalDate.e(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int j(TemporalField temporalField) {
        return j$.time.temporal.p.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !temporalField.isDateBased()) ? this.b.l(temporalField) : chronoLocalDate.l(temporalField);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.j jVar = this.c;
        if (jVar != null) {
            str = " with chronology " + jVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.b + str + str2;
    }
}
