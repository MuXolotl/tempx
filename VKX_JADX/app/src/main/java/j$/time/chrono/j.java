package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public interface j extends Comparable {
    ChronoLocalDate A(TemporalAccessor temporalAccessor);

    ChronoLocalDateTime B(LocalDateTime localDateTime);

    ChronoLocalDate G(int i, int i2, int i3);

    ChronoLocalDate I(Map map, j$.time.format.d0 d0Var);

    ChronoZonedDateTime J(Instant instant, ZoneId zoneId);

    boolean L(long j);

    boolean equals(Object obj);

    ChronoLocalDate h(long j);

    int hashCode();

    String i();

    String m();

    ChronoLocalDate n(int i, int i2);

    j$.time.temporal.s r(ChronoField chronoField);

    List t();

    String toString();

    k u(int i);

    int v(k kVar, int i);
}
