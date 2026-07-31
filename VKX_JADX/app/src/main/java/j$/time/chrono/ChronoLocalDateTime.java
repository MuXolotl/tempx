package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends j$.time.temporal.l, j$.time.temporal.m, Comparable<ChronoLocalDateTime<?>> {
    j a();

    LocalTime b();

    int compareTo(ChronoLocalDateTime chronoLocalDateTime);

    ChronoLocalDate f();

    long toEpochSecond(ZoneOffset zoneOffset);

    ChronoZonedDateTime z(ZoneId zoneId);
}
