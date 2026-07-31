package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends a implements Serializable {
    public static final y c = new y();
    private static final long serialVersionUID = 1039765215346859963L;

    private y() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate A(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof a0 ? (a0) temporalAccessor : new a0(LocalDate.P(temporalAccessor));
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate G(int i, int i2, int i3) {
        return new a0(LocalDate.of(i + 1911, i2, i3));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.j
    public final ChronoLocalDate I(Map map, j$.time.format.d0 d0Var) {
        return (a0) super.I(map, d0Var);
    }

    @Override // j$.time.chrono.j
    public final ChronoZonedDateTime J(Instant instant, ZoneId zoneId) {
        return i.O(this, instant, zoneId);
    }

    @Override // j$.time.chrono.j
    public final boolean L(long j) {
        return q.c.L(j + 1911);
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate h(long j) {
        return new a0(LocalDate.ofEpochDay(j));
    }

    @Override // j$.time.chrono.j
    public final String i() {
        return "Minguo";
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate k() {
        return new a0(LocalDate.P(LocalDate.V(new j$.time.a(ZoneId.systemDefault()))));
    }

    @Override // j$.time.chrono.j
    public final String m() {
        return "roc";
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate n(int i, int i2) {
        return new a0(LocalDate.W(i + 1911, i2));
    }

    @Override // j$.time.chrono.j
    public final j$.time.temporal.s r(ChronoField chronoField) {
        int i = x.a[chronoField.ordinal()];
        if (i == 1) {
            j$.time.temporal.s sVar = ChronoField.PROLEPTIC_MONTH.b;
            return j$.time.temporal.s.f(sVar.a - 22932, sVar.d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.s sVar2 = ChronoField.YEAR.b;
            return j$.time.temporal.s.g(1L, sVar2.d - 1911, (-sVar2.a) + 1912);
        }
        if (i != 3) {
            return chronoField.b;
        }
        j$.time.temporal.s sVar3 = ChronoField.YEAR.b;
        return j$.time.temporal.s.f(sVar3.a - 1911, sVar3.d - 1911);
    }

    @Override // j$.time.chrono.j
    public final List t() {
        return j$.com.android.tools.r8.a.S(b0.values());
    }

    @Override // j$.time.chrono.j
    public final k u(int i) {
        if (i == 0) {
            return b0.BEFORE_ROC;
        }
        if (i == 1) {
            return b0.ROC;
        }
        j$.time.d.d("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.j
    public final int v(k kVar, int i) {
        if (kVar instanceof b0) {
            return kVar == b0.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    public Object writeReplace() {
        return new c0((byte) 1, this);
    }
}
