package j$.time.temporal;

import j$.time.format.c0;
import j$.time.format.d0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public interface TemporalField {
    l C(l lVar, long j);

    boolean isDateBased();

    boolean j(TemporalAccessor temporalAccessor);

    s k(TemporalAccessor temporalAccessor);

    TemporalAccessor l(Map map, c0 c0Var, d0 d0Var);

    s o();

    long y(TemporalAccessor temporalAccessor);
}
