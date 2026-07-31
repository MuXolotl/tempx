package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends a implements Serializable {
    public static final t c = new t();
    private static final long serialVersionUID = 459996390165777884L;

    private t() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate A(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof v ? (v) temporalAccessor : new v(LocalDate.P(temporalAccessor));
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate E(Map map, j$.time.format.d0 d0Var) {
        v vVarT;
        ChronoField chronoField = ChronoField.ERA;
        Long l = (Long) map.get(chronoField);
        w wVarM = l != null ? w.m(r(chronoField).a(l.longValue(), chronoField)) : null;
        ChronoField chronoField2 = ChronoField.YEAR_OF_ERA;
        Long l2 = (Long) map.get(chronoField2);
        int iA = l2 != null ? r(chronoField2).a(l2.longValue(), chronoField2) : 0;
        if (wVarM == null && l2 != null && !map.containsKey(ChronoField.YEAR) && d0Var != j$.time.format.d0.STRICT) {
            w[] wVarArr = w.e;
            wVarM = ((w[]) Arrays.copyOf(wVarArr, wVarArr.length))[((w[]) Arrays.copyOf(wVarArr, wVarArr.length)).length - 1];
        }
        if (l2 != null && wVarM != null) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                ChronoField chronoField4 = ChronoField.DAY_OF_MONTH;
                if (map.containsKey(chronoField4)) {
                    map.remove(chronoField);
                    map.remove(chronoField2);
                    if (d0Var == j$.time.format.d0.LENIENT) {
                        return new v(LocalDate.of((wVarM.b.getYear() + iA) - 1, 1, 1)).R(j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField3)).longValue(), 1L), j$.time.temporal.a.MONTHS).R(j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField4)).longValue(), 1L), j$.time.temporal.a.DAYS);
                    }
                    int iA2 = r(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    int iA3 = r(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4);
                    if (d0Var != j$.time.format.d0.SMART) {
                        LocalDate localDate = v.d;
                        LocalDate localDateOf = LocalDate.of((wVarM.b.getYear() + iA) - 1, iA2, iA3);
                        if (!localDateOf.S(wVarM.b) && wVarM == w.h(localDateOf)) {
                            return new v(wVarM, iA, localDateOf);
                        }
                        j$.time.d.k("year, month, and day not valid for Era");
                        return null;
                    }
                    if (iA < 1) {
                        j$.time.d.d("Invalid YearOfEra: ", iA);
                        return null;
                    }
                    int year = (wVarM.b.getYear() + iA) - 1;
                    try {
                        vVarT = new v(LocalDate.of(year, iA2, iA3));
                    } catch (DateTimeException unused) {
                        vVarT = new v(LocalDate.of(year, iA2, 1)).T(new j$.time.f(6));
                    }
                    if (vVarT.b == wVarM || j$.time.temporal.p.a(vVarT, ChronoField.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return vVarT;
                    }
                    throw new DateTimeException("Invalid YearOfEra for Era: " + wVarM + " " + iA);
                }
            }
            ChronoField chronoField5 = ChronoField.DAY_OF_YEAR;
            if (map.containsKey(chronoField5)) {
                map.remove(chronoField);
                map.remove(chronoField2);
                if (d0Var == j$.time.format.d0.LENIENT) {
                    return new v(LocalDate.W((wVarM.b.getYear() + iA) - 1, 1)).R(j$.com.android.tools.r8.a.Y(((Long) map.remove(chronoField5)).longValue(), 1L), j$.time.temporal.a.DAYS);
                }
                int iA4 = r(chronoField5).a(((Long) map.remove(chronoField5)).longValue(), chronoField5);
                LocalDate localDate2 = v.d;
                LocalDate localDate3 = wVarM.b;
                LocalDate localDateW = iA == 1 ? LocalDate.W(localDate3.getYear(), (wVarM.b.R() + iA4) - 1) : LocalDate.W((localDate3.getYear() + iA) - 1, iA4);
                if (!localDateW.S(wVarM.b) && wVarM == w.h(localDateW)) {
                    return new v(wVarM, iA, localDateW);
                }
                j$.time.d.k("Invalid parameters");
            }
        }
        return null;
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate G(int i, int i2, int i3) {
        return new v(LocalDate.of(i, i2, i3));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.j
    public final ChronoLocalDate I(Map map, j$.time.format.d0 d0Var) {
        return (v) super.I(map, d0Var);
    }

    @Override // j$.time.chrono.j
    public final ChronoZonedDateTime J(Instant instant, ZoneId zoneId) {
        return i.O(this, instant, zoneId);
    }

    @Override // j$.time.chrono.j
    public final boolean L(long j) {
        return q.c.L(j);
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate h(long j) {
        return new v(LocalDate.ofEpochDay(j));
    }

    @Override // j$.time.chrono.j
    public final String i() {
        return "Japanese";
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate k() {
        return new v(LocalDate.P(LocalDate.V(new j$.time.a(ZoneId.systemDefault()))));
    }

    @Override // j$.time.chrono.j
    public final String m() {
        return "japanese";
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate n(int i, int i2) {
        return new v(LocalDate.W(i, i2));
    }

    @Override // j$.time.chrono.j
    public final j$.time.temporal.s r(ChronoField chronoField) {
        switch (s.a[chronoField.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                j$.time.d.b(chronoField, "Unsupported field: ");
                return null;
            case 5:
                w[] wVarArr = w.e;
                int year = wVarArr[wVarArr.length - 1].b.getYear();
                int year2 = 1000000000 - wVarArr[wVarArr.length - 1].b.getYear();
                int year3 = wVarArr[0].b.getYear();
                int i = 1;
                while (true) {
                    w[] wVarArr2 = w.e;
                    if (i >= wVarArr2.length) {
                        return j$.time.temporal.s.g(1L, year2, 999999999 - year);
                    }
                    w wVar = wVarArr2[i];
                    year2 = Math.min(year2, (wVar.b.getYear() - year3) + 1);
                    year3 = wVar.b.getYear();
                    i++;
                }
                break;
            case 6:
                w wVar2 = w.d;
                long j = ChronoField.DAY_OF_YEAR.b.c;
                long jMin = j;
                for (w wVar3 : w.e) {
                    long jMin2 = Math.min(jMin, (wVar3.b.K() - wVar3.b.R()) + 1);
                    jMin = wVar3.i() != null ? Math.min(jMin2, wVar3.i().b.R() - 1) : jMin2;
                }
                return j$.time.temporal.s.g(1L, jMin, ChronoField.DAY_OF_YEAR.b.d);
            case 7:
                return j$.time.temporal.s.f(v.d.getYear(), 999999999L);
            case 8:
                long j2 = w.d.a;
                w[] wVarArr3 = w.e;
                return j$.time.temporal.s.f(j2, wVarArr3[wVarArr3.length - 1].a);
            default:
                return chronoField.b;
        }
    }

    @Override // j$.time.chrono.j
    public final List t() {
        w[] wVarArr = w.e;
        return j$.com.android.tools.r8.a.S((w[]) Arrays.copyOf(wVarArr, wVarArr.length));
    }

    @Override // j$.time.chrono.j
    public final k u(int i) {
        return w.m(i);
    }

    @Override // j$.time.chrono.j
    public final int v(k kVar, int i) {
        if (!(kVar instanceof w)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        w wVar = (w) kVar;
        int year = (wVar.b.getYear() + i) - 1;
        if (i == 1 || (year >= -999999999 && year <= 999999999 && year >= wVar.b.getYear() && kVar == w.h(LocalDate.of(year, 1, 1)))) {
            return year;
        }
        j$.time.d.k("Invalid yearOfEra value");
        return 0;
    }

    public Object writeReplace() {
        return new c0((byte) 1, this);
    }
}
