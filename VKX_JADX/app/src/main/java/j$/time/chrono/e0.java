package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends a implements Serializable {
    public static final e0 c = new e0();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private e0() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate A(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof g0 ? (g0) temporalAccessor : new g0(LocalDate.P(temporalAccessor));
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate G(int i, int i2, int i3) {
        return new g0(LocalDate.of(i - 543, i2, i3));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.j
    public final ChronoLocalDate I(Map map, j$.time.format.d0 d0Var) {
        return (g0) super.I(map, d0Var);
    }

    @Override // j$.time.chrono.j
    public final ChronoZonedDateTime J(Instant instant, ZoneId zoneId) {
        return i.O(this, instant, zoneId);
    }

    @Override // j$.time.chrono.j
    public final boolean L(long j) {
        return q.c.L(j - 543);
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate h(long j) {
        return new g0(LocalDate.ofEpochDay(j));
    }

    @Override // j$.time.chrono.j
    public final String i() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate k() {
        return new g0(LocalDate.P(LocalDate.V(new j$.time.a(ZoneId.systemDefault()))));
    }

    @Override // j$.time.chrono.j
    public final String m() {
        return "buddhist";
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate n(int i, int i2) {
        return new g0(LocalDate.W(i - 543, i2));
    }

    @Override // j$.time.chrono.j
    public final j$.time.temporal.s r(ChronoField chronoField) {
        int i = d0.a[chronoField.ordinal()];
        if (i == 1) {
            j$.time.temporal.s sVar = ChronoField.PROLEPTIC_MONTH.b;
            return j$.time.temporal.s.f(sVar.a + 6516, sVar.d + 6516);
        }
        if (i == 2) {
            j$.time.temporal.s sVar2 = ChronoField.YEAR.b;
            return j$.time.temporal.s.g(1L, (-(sVar2.a + 543)) + 1, sVar2.d + 543);
        }
        if (i != 3) {
            return chronoField.b;
        }
        j$.time.temporal.s sVar3 = ChronoField.YEAR.b;
        return j$.time.temporal.s.f(sVar3.a + 543, sVar3.d + 543);
    }

    @Override // j$.time.chrono.j
    public final List t() {
        return j$.com.android.tools.r8.a.S(h0.values());
    }

    @Override // j$.time.chrono.j
    public final k u(int i) {
        if (i == 0) {
            return h0.BEFORE_BE;
        }
        if (i == 1) {
            return h0.BE;
        }
        j$.time.d.d("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.j
    public final int v(k kVar, int i) {
        if (kVar instanceof h0) {
            return kVar == h0.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    public Object writeReplace() {
        return new c0((byte) 1, this);
    }
}
