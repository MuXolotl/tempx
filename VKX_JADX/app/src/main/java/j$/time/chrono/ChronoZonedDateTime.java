package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends j$.time.temporal.l, Comparable<ChronoZonedDateTime<?>> {
    long M();

    j a();

    LocalTime b();

    ChronoLocalDate f();

    ZoneOffset g();

    ZoneId getZone();

    ChronoLocalDateTime p();

    Instant toInstant();

    ChronoZonedDateTime w(ZoneId zoneId);
}
