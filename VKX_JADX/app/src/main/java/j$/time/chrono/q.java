package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends a implements Serializable {
    public static final q c = new q();
    private static final long serialVersionUID = -1440403870442975015L;

    private q() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate A(TemporalAccessor temporalAccessor) {
        return LocalDate.P(temporalAccessor);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.j
    public final ChronoLocalDateTime B(LocalDateTime localDateTime) {
        return LocalDateTime.O(localDateTime);
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate C(Map map, j$.time.format.d0 d0Var) {
        ChronoField chronoField = ChronoField.YEAR;
        int iA = chronoField.b.a(((Long) map.remove(chronoField)).longValue(), chronoField);
        boolean z = true;
        if (d0Var == j$.time.format.d0.LENIENT) {
            return LocalDate.of(iA, 1, 1).Z(j$.com.android.tools.r8.a.Y(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L)).Y(j$.com.android.tools.r8.a.Y(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iA2 = chronoField2.b.a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iA3 = chronoField3.b.a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (d0Var == j$.time.format.d0.SMART) {
            if (iA2 == 4 || iA2 == 6 || iA2 == 9 || iA2 == 11) {
                iA3 = Math.min(iA3, 30);
            } else if (iA2 == 2) {
                Month month = Month.FEBRUARY;
                long j = iA;
                int i = j$.time.q.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                iA3 = Math.min(iA3, month.O(z));
            }
        }
        return LocalDate.of(iA, iA2, iA3);
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate E(Map map, j$.time.format.d0 d0Var) {
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (d0Var != j$.time.format.d0.LENIENT) {
                chronoField.E(l.longValue());
            }
            Long l2 = (Long) map.remove(ChronoField.ERA);
            if (l2 == null) {
                ChronoField chronoField2 = ChronoField.YEAR;
                Long l3 = (Long) map.get(chronoField2);
                if (d0Var != j$.time.format.d0.STRICT) {
                    a.j(map, chronoField2, (l3 == null || l3.longValue() > 0) ? l.longValue() : j$.com.android.tools.r8.a.Y(1L, l.longValue()));
                } else if (l3 != null) {
                    long jLongValue = l3.longValue();
                    long jLongValue2 = l.longValue();
                    if (jLongValue <= 0) {
                        jLongValue2 = j$.com.android.tools.r8.a.Y(1L, jLongValue2);
                    }
                    a.j(map, chronoField2, jLongValue2);
                } else {
                    map.put(chronoField, l);
                }
            } else if (l2.longValue() == 1) {
                a.j(map, ChronoField.YEAR, l.longValue());
            } else {
                if (l2.longValue() != 0) {
                    j$.time.d.j(l2, "Invalid value for era: ");
                    return null;
                }
                a.j(map, ChronoField.YEAR, j$.com.android.tools.r8.a.Y(1L, l.longValue()));
            }
        } else {
            ChronoField chronoField3 = ChronoField.ERA;
            if (map.containsKey(chronoField3)) {
                chronoField3.E(((Long) map.get(chronoField3)).longValue());
            }
        }
        return null;
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate G(int i, int i2, int i3) {
        return LocalDate.of(i, i2, i3);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.j
    public final ChronoLocalDate I(Map map, j$.time.format.d0 d0Var) {
        return (LocalDate) super.I(map, d0Var);
    }

    @Override // j$.time.chrono.j
    public final ChronoZonedDateTime J(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        return ZonedDateTime.o(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    @Override // j$.time.chrono.j
    public final boolean L(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate h(long j) {
        return LocalDate.ofEpochDay(j);
    }

    @Override // j$.time.chrono.j
    public final String i() {
        return "ISO";
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate k() {
        return LocalDate.P(LocalDate.V(new j$.time.a(ZoneId.systemDefault())));
    }

    @Override // j$.time.chrono.j
    public final String m() {
        return "iso8601";
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate n(int i, int i2) {
        return LocalDate.W(i, i2);
    }

    @Override // j$.time.chrono.j
    public final j$.time.temporal.s r(ChronoField chronoField) {
        return chronoField.b;
    }

    @Override // j$.time.chrono.j
    public final List t() {
        return j$.com.android.tools.r8.a.S(r.values());
    }

    @Override // j$.time.chrono.j
    public final k u(int i) {
        if (i == 0) {
            return r.BCE;
        }
        if (i == 1) {
            return r.CE;
        }
        j$.time.d.d("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.j
    public final int v(k kVar, int i) {
        if (kVar instanceof r) {
            return kVar == r.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    public Object writeReplace() {
        return new c0((byte) 1, this);
    }

    @Override // j$.time.chrono.a
    public final void y(Map map, j$.time.format.d0 d0Var) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (d0Var != j$.time.format.d0.LENIENT) {
                chronoField.E(l.longValue());
            }
            a.j(map, ChronoField.MONTH_OF_YEAR, ((int) j$.com.android.tools.r8.a.V(l.longValue(), 12L)) + 1);
            a.j(map, ChronoField.YEAR, j$.com.android.tools.r8.a.W(l.longValue(), 12L));
        }
    }
}
