package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.TemporalField;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public interface ChronoLocalDate extends j$.time.temporal.l, j$.time.temporal.m, Comparable<ChronoLocalDate> {
    ChronoLocalDateTime D(LocalTime localTime);

    k F();

    ChronoLocalDate H(j$.time.temporal.o oVar);

    int K();

    j a();

    @Override // j$.time.temporal.l
    ChronoLocalDate c(long j, TemporalField temporalField);

    int compareTo(ChronoLocalDate chronoLocalDate);

    @Override // j$.time.temporal.l
    ChronoLocalDate d(long j, j$.time.temporal.q qVar);

    @Override // j$.time.temporal.TemporalAccessor
    boolean e(TemporalField temporalField);

    boolean equals(Object obj);

    int hashCode();

    boolean q();

    /* JADX INFO: renamed from: s */
    ChronoLocalDate y(long j, j$.time.temporal.q qVar);

    long toEpochDay();

    String toString();

    ChronoLocalDate x(j$.time.temporal.m mVar);
}
