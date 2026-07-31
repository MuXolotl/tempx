package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.format.c0;
import j$.time.format.d0;
import java.util.Map;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g implements TemporalField {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ g[] b;

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.TemporalField
            public final l C(l lVar, long j) {
                long jY = y(lVar);
                o().b(j, this);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return lVar.c((j - jY) + lVar.C(chronoField), chronoField);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean j(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(ChronoField.DAY_OF_YEAR) || !temporalAccessor.e(ChronoField.MONTH_OF_YEAR) || !temporalAccessor.e(ChronoField.YEAR)) {
                    return false;
                }
                g gVar2 = i.a;
                return j$.com.android.tools.r8.a.P(temporalAccessor).equals(j$.time.chrono.q.c);
            }

            @Override // j$.time.temporal.TemporalField
            public final s k(TemporalAccessor temporalAccessor) {
                if (!j(temporalAccessor)) {
                    throw new r("Unsupported field: DayOfQuarter");
                }
                long jC = temporalAccessor.C(g.QUARTER_OF_YEAR);
                if (jC == 1) {
                    return j$.time.chrono.q.c.L(temporalAccessor.C(ChronoField.YEAR)) ? s.f(1L, 91L) : s.f(1L, 90L);
                }
                if (jC == 2) {
                    return s.f(1L, 91L);
                }
                return (jC == 3 || jC == 4) ? s.f(1L, 92L) : o();
            }

            @Override // j$.time.temporal.g, j$.time.temporal.TemporalField
            public final TemporalAccessor l(Map map, c0 c0Var, d0 d0Var) {
                LocalDate localDateOf;
                long jY;
                ChronoField chronoField = ChronoField.YEAR;
                Long l = (Long) map.get(chronoField);
                TemporalField temporalField = g.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(temporalField);
                if (l != null && l2 != null) {
                    int iA = chronoField.b.a(l.longValue(), chronoField);
                    long jLongValue = ((Long) map.get(g.DAY_OF_QUARTER)).longValue();
                    g gVar2 = i.a;
                    if (j$.com.android.tools.r8.a.P(c0Var).equals(j$.time.chrono.q.c)) {
                        if (d0Var == d0.LENIENT) {
                            localDateOf = LocalDate.of(iA, 1, 1).Z(j$.com.android.tools.r8.a.X(j$.com.android.tools.r8.a.Y(l2.longValue(), 1L), 3L));
                            jY = j$.com.android.tools.r8.a.Y(jLongValue, 1L);
                        } else {
                            localDateOf = LocalDate.of(iA, ((temporalField.o().a(l2.longValue(), temporalField) - 1) * 3) + 1, 1);
                            if (jLongValue < 1 || jLongValue > 90) {
                                if (d0Var == d0.STRICT) {
                                    k(localDateOf).b(jLongValue, this);
                                } else {
                                    o().b(jLongValue, this);
                                }
                            }
                            jY = jLongValue - 1;
                        }
                        map.remove(this);
                        map.remove(chronoField);
                        map.remove(temporalField);
                        return localDateOf.Y(jY);
                    }
                    j$.time.d.k("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // j$.time.temporal.TemporalField
            public final s o() {
                return s.g(1L, 90L, 92L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // j$.time.temporal.TemporalField
            public final long y(TemporalAccessor temporalAccessor) {
                if (!j(temporalAccessor)) {
                    throw new r("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.j(ChronoField.DAY_OF_YEAR) - g.a[((temporalAccessor.j(ChronoField.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.q.c.L(temporalAccessor.C(ChronoField.YEAR)) ? 4 : 0)];
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.TemporalField
            public final l C(l lVar, long j) {
                long jY = y(lVar);
                o().b(j, this);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return lVar.c(((j - jY) * 3) + lVar.C(chronoField), chronoField);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean j(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(ChronoField.MONTH_OF_YEAR)) {
                    return false;
                }
                g gVar3 = i.a;
                return j$.com.android.tools.r8.a.P(temporalAccessor).equals(j$.time.chrono.q.c);
            }

            @Override // j$.time.temporal.TemporalField
            public final s k(TemporalAccessor temporalAccessor) {
                if (j(temporalAccessor)) {
                    return o();
                }
                throw new r("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final s o() {
                return s.f(1L, 4L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final long y(TemporalAccessor temporalAccessor) {
                if (j(temporalAccessor)) {
                    return (temporalAccessor.C(ChronoField.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new r("Unsupported field: QuarterOfYear");
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.TemporalField
            public final l C(l lVar, long j) {
                o().b(j, this);
                return lVar.d(j$.com.android.tools.r8.a.Y(j, y(lVar)), a.WEEKS);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean j(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                g gVar4 = i.a;
                return j$.com.android.tools.r8.a.P(temporalAccessor).equals(j$.time.chrono.q.c);
            }

            @Override // j$.time.temporal.TemporalField
            public final s k(TemporalAccessor temporalAccessor) {
                if (j(temporalAccessor)) {
                    return g.P(LocalDate.P(temporalAccessor));
                }
                throw new r("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.g, j$.time.temporal.TemporalField
            public final TemporalAccessor l(Map map, c0 c0Var, d0 d0Var) {
                LocalDate localDateC;
                long j;
                TemporalField temporalField = g.WEEK_BASED_YEAR;
                Long l = (Long) map.get(temporalField);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l2 = (Long) map.get(chronoField);
                if (l != null && l2 != null) {
                    int iA = temporalField.o().a(l.longValue(), temporalField);
                    long jLongValue = ((Long) map.get(g.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                    g gVar4 = i.a;
                    if (j$.com.android.tools.r8.a.P(c0Var).equals(j$.time.chrono.q.c)) {
                        LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                        if (d0Var == d0.LENIENT) {
                            long jLongValue2 = l2.longValue();
                            if (jLongValue2 > 7) {
                                long j2 = jLongValue2 - 1;
                                localDateOf = localDateOf.a0(j2 / 7);
                                j = j2 % 7;
                            } else {
                                if (jLongValue2 < 1) {
                                    localDateOf = localDateOf.a0(j$.com.android.tools.r8.a.Y(jLongValue2, 7L) / 7);
                                    j = (jLongValue2 + 6) % 7;
                                }
                                localDateC = localDateOf.a0(j$.com.android.tools.r8.a.Y(jLongValue, 1L)).c(jLongValue2, chronoField);
                            }
                            jLongValue2 = j + 1;
                            localDateC = localDateOf.a0(j$.com.android.tools.r8.a.Y(jLongValue, 1L)).c(jLongValue2, chronoField);
                        } else {
                            int iA2 = chronoField.b.a(l2.longValue(), chronoField);
                            if (jLongValue < 1 || jLongValue > 52) {
                                if (d0Var == d0.STRICT) {
                                    g.P(localDateOf).b(jLongValue, this);
                                } else {
                                    o().b(jLongValue, this);
                                }
                            }
                            localDateC = localDateOf.a0(jLongValue - 1).c(iA2, chronoField);
                        }
                        map.remove(this);
                        map.remove(temporalField);
                        map.remove(chronoField);
                        return localDateC;
                    }
                    j$.time.d.k("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // j$.time.temporal.TemporalField
            public final s o() {
                return s.g(1L, 52L, 53L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final long y(TemporalAccessor temporalAccessor) {
                if (j(temporalAccessor)) {
                    return g.E(LocalDate.P(temporalAccessor));
                }
                throw new r("Unsupported field: WeekOfWeekBasedYear");
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.TemporalField
            public final l C(l lVar, long j) {
                if (!j(lVar)) {
                    throw new r("Unsupported field: WeekBasedYear");
                }
                int iA = ChronoField.YEAR.b.a(j, g.WEEK_BASED_YEAR);
                LocalDate localDateP = LocalDate.P(lVar);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                int iJ = localDateP.j(chronoField);
                int iE = g.E(localDateP);
                if (iE == 53 && g.O(iA) == 52) {
                    iE = 52;
                }
                LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                return lVar.x(localDateOf.Y(((iE - 1) * 7) + (iJ - localDateOf.j(chronoField))));
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean j(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                g gVar5 = i.a;
                return j$.com.android.tools.r8.a.P(temporalAccessor).equals(j$.time.chrono.q.c);
            }

            @Override // j$.time.temporal.TemporalField
            public final s k(TemporalAccessor temporalAccessor) {
                if (j(temporalAccessor)) {
                    return ChronoField.YEAR.b;
                }
                throw new r("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final s o() {
                return ChronoField.YEAR.b;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final long y(TemporalAccessor temporalAccessor) {
                if (j(temporalAccessor)) {
                    return g.N(LocalDate.P(temporalAccessor));
                }
                throw new r("Unsupported field: WeekBasedYear");
            }
        };
        WEEK_BASED_YEAR = gVar4;
        b = new g[]{gVar, gVar2, gVar3, gVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int E(LocalDate localDate) {
        int iOrdinal = localDate.getDayOfWeek().ordinal();
        int iR = localDate.R() - 1;
        int i = (3 - iOrdinal) + iR;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (iR < i3) {
            if (localDate.R() != 180) {
                localDate = LocalDate.W(localDate.a, 180);
            }
            return (int) P(localDate.b0(-1L)).d;
        }
        int i4 = ((iR - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.q())) {
            return i4;
        }
        return 1;
    }

    public static int N(LocalDate localDate) {
        int year = localDate.getYear();
        int iR = localDate.R();
        if (iR <= 3) {
            return iR - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (iR >= 363) {
            return ((iR - 363) - (localDate.q() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }

    public static int O(int i) {
        LocalDate localDateOf = LocalDate.of(i, 1, 1);
        if (localDateOf.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (localDateOf.getDayOfWeek() == DayOfWeek.WEDNESDAY && localDateOf.q()) ? 53 : 52;
        }
        return 53;
    }

    public static s P(LocalDate localDate) {
        return s.f(1L, O(N(localDate)));
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) b.clone();
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public /* synthetic */ TemporalAccessor l(Map map, c0 c0Var, d0 d0Var) {
        return null;
    }
}
