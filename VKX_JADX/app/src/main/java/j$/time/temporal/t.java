package j$.time.temporal;

import j$.time.chrono.ChronoLocalDate;
import j$.time.format.c0;
import j$.time.format.d0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements TemporalField {
    public static final s f = s.f(1, 7);
    public static final s g = s.g(0, 4, 6);
    public static final s h = s.g(0, 52, 54);
    public static final s i = s.g(1, 52, 53);
    public final String a;
    public final u b;
    public final q c;
    public final q d;
    public final s e;

    public t(String str, u uVar, q qVar, q qVar2, s sVar) {
        this.a = str;
        this.b = uVar;
        this.c = qVar;
        this.d = qVar2;
        this.e = sVar;
    }

    public static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    @Override // j$.time.temporal.TemporalField
    public final l C(l lVar, long j) {
        int iA = this.e.a(j, this);
        int iJ = lVar.j(this);
        if (iA == iJ) {
            return lVar;
        }
        if (this.d != a.FOREVER) {
            return lVar.d(iA - iJ, this.c);
        }
        u uVar = this.b;
        return e(j$.com.android.tools.r8.a.P(lVar), (int) j, lVar.j(uVar.e), lVar.j(uVar.c));
    }

    public final int b(TemporalAccessor temporalAccessor) {
        return p.e(temporalAccessor.j(ChronoField.DAY_OF_WEEK) - this.b.a.getValue()) + 1;
    }

    public final int c(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        int iJ = temporalAccessor.j(ChronoField.YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int iJ2 = temporalAccessor.j(chronoField);
        int iH = h(iJ2, iB);
        int iA = a(iH, iJ2);
        if (iA == 0) {
            return iJ - 1;
        }
        return iA >= a(iH, ((int) temporalAccessor.l(chronoField).d) + this.b.b) ? iJ + 1 : iJ;
    }

    public final int d(TemporalAccessor temporalAccessor) {
        int iA;
        int iB = b(temporalAccessor);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int iJ = temporalAccessor.j(chronoField);
        int iH = h(iJ, iB);
        int iA2 = a(iH, iJ);
        if (iA2 == 0) {
            return d(j$.com.android.tools.r8.a.P(temporalAccessor).A(temporalAccessor).y(iJ, a.DAYS));
        }
        return (iA2 <= 50 || iA2 < (iA = a(iH, ((int) temporalAccessor.l(chronoField).d) + this.b.b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final ChronoLocalDate e(j$.time.chrono.j jVar, int i2, int i3, int i4) {
        ChronoLocalDate chronoLocalDateG = jVar.G(i2, 1, 1);
        int iH = h(1, b(chronoLocalDateG));
        return chronoLocalDateG.d(((Math.min(i3, a(iH, chronoLocalDateG.K() + this.b.b) - 1) - 1) * 7) + (i4 - 1) + (-iH), (q) a.DAYS);
    }

    public final s f(TemporalAccessor temporalAccessor, ChronoField chronoField) {
        int iH = h(temporalAccessor.j(chronoField), b(temporalAccessor));
        s sVarL = temporalAccessor.l(chronoField);
        return s.f(a(iH, (int) sVarL.a), a(iH, (int) sVarL.d));
    }

    public final s g(TemporalAccessor temporalAccessor) {
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        if (!temporalAccessor.e(chronoField)) {
            return h;
        }
        int iB = b(temporalAccessor);
        int iJ = temporalAccessor.j(chronoField);
        int iH = h(iJ, iB);
        int iA = a(iH, iJ);
        if (iA == 0) {
            return g(j$.com.android.tools.r8.a.P(temporalAccessor).A(temporalAccessor).y(iJ + 7, a.DAYS));
        }
        int i2 = (int) temporalAccessor.l(chronoField).d;
        int iA2 = a(iH, this.b.b + i2);
        return iA >= iA2 ? g(j$.com.android.tools.r8.a.P(temporalAccessor).A(temporalAccessor).d((i2 - iJ) + 8, (q) a.DAYS)) : s.f(1L, iA2 - 1);
    }

    public final int h(int i2, int i3) {
        int iE = p.e(i2 - i3);
        return iE + 1 > this.b.b ? 7 - iE : -iE;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean j(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.e(ChronoField.DAY_OF_WEEK)) {
            return false;
        }
        a aVar = a.WEEKS;
        q qVar = this.d;
        if (qVar == aVar) {
            return true;
        }
        if (qVar == a.MONTHS) {
            return temporalAccessor.e(ChronoField.DAY_OF_MONTH);
        }
        if (qVar == a.YEARS) {
            return temporalAccessor.e(ChronoField.DAY_OF_YEAR);
        }
        if (qVar == u.h) {
            return temporalAccessor.e(ChronoField.DAY_OF_YEAR);
        }
        if (qVar == a.FOREVER) {
            return temporalAccessor.e(ChronoField.YEAR);
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalField
    public final s k(TemporalAccessor temporalAccessor) {
        a aVar = a.WEEKS;
        q qVar = this.d;
        if (qVar == aVar) {
            return this.e;
        }
        if (qVar == a.MONTHS) {
            return f(temporalAccessor, ChronoField.DAY_OF_MONTH);
        }
        if (qVar == a.YEARS) {
            return f(temporalAccessor, ChronoField.DAY_OF_YEAR);
        }
        if (qVar == u.h) {
            return g(temporalAccessor);
        }
        if (qVar == a.FOREVER) {
            return ChronoField.YEAR.b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + qVar + ", this: " + this);
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor l(Map map, c0 c0Var, d0 d0Var) {
        ChronoLocalDate chronoLocalDateD;
        ChronoLocalDate chronoLocalDateD2;
        ChronoLocalDate chronoLocalDateD3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int iQ = j$.com.android.tools.r8.a.Q(jLongValue);
        a aVar = a.WEEKS;
        s sVar = this.e;
        u uVar = this.b;
        q qVar = this.d;
        if (qVar == aVar) {
            long jE = p.e((sVar.a(jLongValue, this) - 1) + (uVar.a.getValue() - 1)) + 1;
            map.remove(this);
            map.put(ChronoField.DAY_OF_WEEK, Long.valueOf(jE));
            return null;
        }
        ChronoField chronoField = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField)) {
            return null;
        }
        int iE = p.e(chronoField.b.a(((Long) map.get(chronoField)).longValue(), chronoField) - uVar.a.getValue()) + 1;
        j$.time.chrono.j jVarP = j$.com.android.tools.r8.a.P(c0Var);
        ChronoField chronoField2 = ChronoField.YEAR;
        if (!map.containsKey(chronoField2)) {
            if ((qVar != u.h && qVar != a.FOREVER) || !map.containsKey(uVar.f) || !map.containsKey(uVar.e)) {
                return null;
            }
            t tVar = uVar.f;
            int iA = tVar.e.a(((Long) map.get(tVar)).longValue(), uVar.f);
            if (d0Var == d0.LENIENT) {
                chronoLocalDateD = e(jVarP, iA, 1, iE).d(j$.com.android.tools.r8.a.Y(((Long) map.get(uVar.e)).longValue(), 1L), (q) aVar);
            } else {
                t tVar2 = uVar.e;
                ChronoLocalDate chronoLocalDateE = e(jVarP, iA, tVar2.e.a(((Long) map.get(tVar2)).longValue(), uVar.e), iE);
                if (d0Var == d0.STRICT && c(chronoLocalDateE) != iA) {
                    j$.time.d.k("Strict mode rejected resolved date as it is in a different week-based-year");
                    return null;
                }
                chronoLocalDateD = chronoLocalDateE;
            }
            map.remove(this);
            map.remove(uVar.f);
            map.remove(uVar.e);
            map.remove(chronoField);
            return chronoLocalDateD;
        }
        int iA2 = chronoField2.b.a(((Long) map.get(chronoField2)).longValue(), chronoField2);
        a aVar2 = a.MONTHS;
        if (qVar == aVar2) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                long jLongValue2 = ((Long) map.get(chronoField3)).longValue();
                long j = iQ;
                if (d0Var == d0.LENIENT) {
                    ChronoLocalDate chronoLocalDateD4 = jVarP.G(iA2, 1, 1).d(j$.com.android.tools.r8.a.Y(jLongValue2, 1L), (q) aVar2);
                    int iB = b(chronoLocalDateD4);
                    int iJ = chronoLocalDateD4.j(ChronoField.DAY_OF_MONTH);
                    chronoLocalDateD3 = chronoLocalDateD4.d(j$.com.android.tools.r8.a.R(j$.com.android.tools.r8.a.X(j$.com.android.tools.r8.a.Y(j, a(h(iJ, iB), iJ)), 7L), iE - b(chronoLocalDateD4)), (q) a.DAYS);
                } else {
                    ChronoLocalDate chronoLocalDateG = jVarP.G(iA2, chronoField3.b.a(jLongValue2, chronoField3), 1);
                    long jA = sVar.a(j, this);
                    int iB2 = b(chronoLocalDateG);
                    int iJ2 = chronoLocalDateG.j(ChronoField.DAY_OF_MONTH);
                    ChronoLocalDate chronoLocalDateD5 = chronoLocalDateG.d((((int) (jA - ((long) a(h(iJ2, iB2), iJ2)))) * 7) + (iE - b(chronoLocalDateG)), (q) a.DAYS);
                    if (d0Var == d0.STRICT && chronoLocalDateD5.C(chronoField3) != jLongValue2) {
                        j$.time.d.k("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                    chronoLocalDateD3 = chronoLocalDateD5;
                }
                map.remove(this);
                map.remove(chronoField2);
                map.remove(chronoField3);
                map.remove(chronoField);
                return chronoLocalDateD3;
            }
        }
        if (qVar != a.YEARS) {
            return null;
        }
        long j2 = iQ;
        ChronoLocalDate chronoLocalDateG2 = jVarP.G(iA2, 1, 1);
        if (d0Var == d0.LENIENT) {
            int iB3 = b(chronoLocalDateG2);
            int iJ3 = chronoLocalDateG2.j(ChronoField.DAY_OF_YEAR);
            chronoLocalDateD2 = chronoLocalDateG2.d(j$.com.android.tools.r8.a.R(j$.com.android.tools.r8.a.X(j$.com.android.tools.r8.a.Y(j2, a(h(iJ3, iB3), iJ3)), 7L), iE - b(chronoLocalDateG2)), (q) a.DAYS);
        } else {
            long jA2 = sVar.a(j2, this);
            int iB4 = b(chronoLocalDateG2);
            int iJ4 = chronoLocalDateG2.j(ChronoField.DAY_OF_YEAR);
            ChronoLocalDate chronoLocalDateD6 = chronoLocalDateG2.d((((int) (jA2 - ((long) a(h(iJ4, iB4), iJ4)))) * 7) + (iE - b(chronoLocalDateG2)), (q) a.DAYS);
            if (d0Var == d0.STRICT && chronoLocalDateD6.C(chronoField2) != iA2) {
                j$.time.d.k("Strict mode rejected resolved date as it is in a different year");
                return null;
            }
            chronoLocalDateD2 = chronoLocalDateD6;
        }
        map.remove(this);
        map.remove(chronoField2);
        map.remove(chronoField);
        return chronoLocalDateD2;
    }

    @Override // j$.time.temporal.TemporalField
    public final s o() {
        return this.e;
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }

    @Override // j$.time.temporal.TemporalField
    public final long y(TemporalAccessor temporalAccessor) {
        int iC;
        a aVar = a.WEEKS;
        q qVar = this.d;
        if (qVar == aVar) {
            iC = b(temporalAccessor);
        } else if (qVar == a.MONTHS) {
            int iB = b(temporalAccessor);
            int iJ = temporalAccessor.j(ChronoField.DAY_OF_MONTH);
            iC = a(h(iJ, iB), iJ);
        } else if (qVar == a.YEARS) {
            int iB2 = b(temporalAccessor);
            int iJ2 = temporalAccessor.j(ChronoField.DAY_OF_YEAR);
            iC = a(h(iJ2, iB2), iJ2);
        } else if (qVar == u.h) {
            iC = d(temporalAccessor);
        } else {
            if (qVar != a.FOREVER) {
                throw new IllegalStateException("unreachable, rangeUnit: " + qVar + ", this: " + this);
            }
            iC = c(temporalAccessor);
        }
        return iC;
    }
}
