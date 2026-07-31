package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements j {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        new Locale("ja", "JP", "JP");
    }

    public static void j(Map map, ChronoField chronoField, long j) {
        Long l = (Long) map.get(chronoField);
        if (l == null || l.longValue() == j) {
            map.put(chronoField, Long.valueOf(j));
            return;
        }
        throw new DateTimeException("Conflict found: " + chronoField + " " + l + " differs from " + chronoField + " " + j);
    }

    public static j l(j jVar, String str) {
        String strM;
        j jVar2 = (j) a.putIfAbsent(str, jVar);
        if (jVar2 == null && (strM = jVar.m()) != null) {
            b.putIfAbsent(strM, jVar);
        }
        return jVar2;
    }

    public static ChronoLocalDate o(ChronoLocalDate chronoLocalDate, long j, long j2, long j3) {
        long j4;
        ChronoLocalDate chronoLocalDateD = chronoLocalDate.d(j, (j$.time.temporal.q) j$.time.temporal.a.MONTHS);
        j$.time.temporal.a aVar = j$.time.temporal.a.WEEKS;
        ChronoLocalDate chronoLocalDateD2 = chronoLocalDateD.d(j2, (j$.time.temporal.q) aVar);
        if (j3 <= 7) {
            if (j3 < 1) {
                chronoLocalDateD2 = chronoLocalDateD2.d(j$.com.android.tools.r8.a.Y(j3, 7L) / 7, (j$.time.temporal.q) aVar);
                j4 = (j3 + 6) % 7;
            }
            return chronoLocalDateD2.x(new j$.time.temporal.n(DayOfWeek.N((int) j3).getValue(), 0));
        }
        long j5 = j3 - 1;
        chronoLocalDateD2 = chronoLocalDateD2.d(j5 / 7, (j$.time.temporal.q) aVar);
        j4 = j5 % 7;
        j3 = j4 + 1;
        return chronoLocalDateD2.x(new j$.time.temporal.n(DayOfWeek.N((int) j3).getValue(), 0));
    }

    @Override // j$.time.chrono.j
    public ChronoLocalDateTime B(LocalDateTime localDateTime) {
        try {
            return A(localDateTime).D(LocalTime.O(localDateTime));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e);
        }
    }

    public ChronoLocalDate C(Map map, j$.time.format.d0 d0Var) {
        ChronoField chronoField = ChronoField.YEAR;
        int iA = r(chronoField).a(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (d0Var == j$.time.format.d0.LENIENT) {
            long jY = j$.com.android.tools.r8.a.Y(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L);
            return G(iA, 1, 1).d(jY, (j$.time.temporal.q) j$.time.temporal.a.MONTHS).d(j$.com.android.tools.r8.a.Y(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iA2 = r(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iA3 = r(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (d0Var != j$.time.format.d0.SMART) {
            return G(iA, iA2, iA3);
        }
        try {
            return G(iA, iA2, iA3);
        } catch (DateTimeException unused) {
            return G(iA, iA2, 1).x(new j$.time.f(6));
        }
    }

    public ChronoLocalDate E(Map map, j$.time.format.d0 d0Var) {
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l == null) {
            ChronoField chronoField2 = ChronoField.ERA;
            if (!map.containsKey(chronoField2)) {
                return null;
            }
            r(chronoField2).b(((Long) map.get(chronoField2)).longValue(), chronoField2);
            return null;
        }
        ChronoField chronoField3 = ChronoField.ERA;
        Long l2 = (Long) map.remove(chronoField3);
        int iA = d0Var != j$.time.format.d0.LENIENT ? r(chronoField).a(l.longValue(), chronoField) : j$.com.android.tools.r8.a.Q(l.longValue());
        if (l2 != null) {
            j(map, ChronoField.YEAR, v(u(r(chronoField3).a(l2.longValue(), chronoField3)), iA));
            return null;
        }
        ChronoField chronoField4 = ChronoField.YEAR;
        if (map.containsKey(chronoField4)) {
            j(map, chronoField4, v(n(r(chronoField4).a(((Long) map.get(chronoField4)).longValue(), chronoField4), 1).F(), iA));
            return null;
        }
        if (d0Var == j$.time.format.d0.STRICT) {
            map.put(chronoField, l);
            return null;
        }
        List listT = t();
        if (listT.isEmpty()) {
            j(map, chronoField4, iA);
            return null;
        }
        j(map, chronoField4, v((k) listT.get(listT.size() - 1), iA));
        return null;
    }

    @Override // j$.time.chrono.j
    public ChronoLocalDate I(Map map, j$.time.format.d0 d0Var) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            return h(((Long) map.remove(chronoField)).longValue());
        }
        y(map, d0Var);
        ChronoLocalDate chronoLocalDateE = E(map, d0Var);
        if (chronoLocalDateE != null) {
            return chronoLocalDateE;
        }
        ChronoField chronoField2 = ChronoField.YEAR;
        if (map.containsKey(chronoField2)) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                if (map.containsKey(ChronoField.DAY_OF_MONTH)) {
                    return C(map, d0Var);
                }
                ChronoField chronoField4 = ChronoField.ALIGNED_WEEK_OF_MONTH;
                if (map.containsKey(chronoField4)) {
                    ChronoField chronoField5 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                    if (map.containsKey(chronoField5)) {
                        int iA = r(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                        if (d0Var == j$.time.format.d0.LENIENT) {
                            long jY = j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField3)).longValue(), 1L);
                            return G(iA, 1, 1).d(jY, (j$.time.temporal.q) j$.time.temporal.a.MONTHS).d(j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField4)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.WEEKS).d(j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField5)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
                        }
                        int iA2 = r(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                        ChronoLocalDate chronoLocalDateD = G(iA, iA2, 1).d((r(chronoField5).a(((Long) map.remove(chronoField5)).longValue(), chronoField5) - 1) + ((r(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4) - 1) * 7), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
                        if (d0Var != j$.time.format.d0.STRICT || chronoLocalDateD.j(chronoField3) == iA2) {
                            return chronoLocalDateD;
                        }
                        j$.time.d.k("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                    ChronoField chronoField6 = ChronoField.DAY_OF_WEEK;
                    if (map.containsKey(chronoField6)) {
                        int iA3 = r(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                        if (d0Var == j$.time.format.d0.LENIENT) {
                            return o(G(iA3, 1, 1), j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField3)).longValue(), 1L), j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField4)).longValue(), 1L), j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField6)).longValue(), 1L));
                        }
                        int iA4 = r(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                        ChronoLocalDate chronoLocalDateX = G(iA3, iA4, 1).d((r(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4) - 1) * 7, (j$.time.temporal.q) j$.time.temporal.a.DAYS).x(new j$.time.temporal.n(DayOfWeek.N(r(chronoField6).a(((Long) map.remove(chronoField6)).longValue(), chronoField6)).getValue(), 0));
                        if (d0Var != j$.time.format.d0.STRICT || chronoLocalDateX.j(chronoField3) == iA4) {
                            return chronoLocalDateX;
                        }
                        j$.time.d.k("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                }
            }
            ChronoField chronoField7 = ChronoField.DAY_OF_YEAR;
            if (map.containsKey(chronoField7)) {
                int iA5 = r(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                if (d0Var != j$.time.format.d0.LENIENT) {
                    return n(iA5, r(chronoField7).a(((Long) map.remove(chronoField7)).longValue(), chronoField7));
                }
                return n(iA5, 1).d(j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField7)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
            }
            ChronoField chronoField8 = ChronoField.ALIGNED_WEEK_OF_YEAR;
            if (map.containsKey(chronoField8)) {
                ChronoField chronoField9 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                if (map.containsKey(chronoField9)) {
                    int iA6 = r(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (d0Var == j$.time.format.d0.LENIENT) {
                        return n(iA6, 1).d(j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField8)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.WEEKS).d(j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField9)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
                    }
                    ChronoLocalDate chronoLocalDateD2 = n(iA6, 1).d((r(chronoField9).a(((Long) map.remove(chronoField9)).longValue(), chronoField9) - 1) + ((r(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8) - 1) * 7), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
                    if (d0Var != j$.time.format.d0.STRICT || chronoLocalDateD2.j(chronoField2) == iA6) {
                        return chronoLocalDateD2;
                    }
                    j$.time.d.k("Strict mode rejected resolved date as it is in a different year");
                    return null;
                }
                ChronoField chronoField10 = ChronoField.DAY_OF_WEEK;
                if (map.containsKey(chronoField10)) {
                    int iA7 = r(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (d0Var == j$.time.format.d0.LENIENT) {
                        return o(n(iA7, 1), 0L, j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField8)).longValue(), 1L), j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField10)).longValue(), 1L));
                    }
                    ChronoLocalDate chronoLocalDateX2 = n(iA7, 1).d((r(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8) - 1) * 7, (j$.time.temporal.q) j$.time.temporal.a.DAYS).x(new j$.time.temporal.n(DayOfWeek.N(r(chronoField10).a(((Long) map.remove(chronoField10)).longValue(), chronoField10)).getValue(), 0));
                    if (d0Var != j$.time.format.d0.STRICT || chronoLocalDateX2.j(chronoField2) == iA7) {
                        return chronoLocalDateX2;
                    }
                    j$.time.d.k("Strict mode rejected resolved date as it is in a different year");
                    return null;
                }
            }
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return i().compareTo(((j) obj).i());
    }

    @Override // j$.time.chrono.j
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && i().compareTo(((a) obj).i()) == 0;
    }

    @Override // j$.time.chrono.j
    public final int hashCode() {
        return i().hashCode() ^ getClass().hashCode();
    }

    public abstract /* synthetic */ ChronoLocalDate k();

    @Override // j$.time.chrono.j
    public final String toString() {
        return i();
    }

    public void y(Map map, j$.time.format.d0 d0Var) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (d0Var != j$.time.format.d0.LENIENT) {
                chronoField.E(l.longValue());
            }
            ChronoLocalDate chronoLocalDateC = k().c(1L, (TemporalField) ChronoField.DAY_OF_MONTH).c(l.longValue(), (TemporalField) chronoField);
            ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
            j(map, chronoField2, chronoLocalDateC.j(chronoField2));
            ChronoField chronoField3 = ChronoField.YEAR;
            j(map, chronoField3, chronoLocalDateC.j(chronoField3));
        }
    }
}
