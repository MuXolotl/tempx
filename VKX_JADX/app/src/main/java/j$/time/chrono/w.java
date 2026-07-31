package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements k, Serializable {
    public static final w d;
    public static final w[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient LocalDate b;
    public final transient String c;

    static {
        w wVar = new w(-1, LocalDate.of(1868, 1, 1), "Meiji");
        d = wVar;
        e = new w[]{wVar, new w(0, LocalDate.of(1912, 7, 30), "Taisho"), new w(1, LocalDate.of(1926, 12, 25), "Showa"), new w(2, LocalDate.of(1989, 1, 8), "Heisei"), new w(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    public w(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    public static w h(LocalDate localDate) {
        if (localDate.S(v.d)) {
            j$.time.d.k("JapaneseDate before Meiji 6 are not supported");
            return null;
        }
        for (int length = e.length - 1; length >= 0; length--) {
            w wVar = e[length];
            if (localDate.compareTo((ChronoLocalDate) wVar.b) >= 0) {
                return wVar;
            }
        }
        return null;
    }

    public static w m(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            w[] wVarArr = e;
            if (i2 < wVarArr.length) {
                return wVarArr[i2];
            }
        }
        j$.time.d.d("Invalid era: ", i);
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 5, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long C(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.q(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object E(TemporalQuery temporalQuery) {
        return j$.com.android.tools.r8.a.y(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean e(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.t(this, temporalField);
    }

    @Override // j$.time.chrono.k
    public final int getValue() {
        return this.a;
    }

    public final w i() {
        w[] wVarArr = e;
        if (this == wVarArr[wVarArr.length - 1]) {
            return null;
        }
        return m(this.a + 1);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int j(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.o(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        ChronoField chronoField = ChronoField.ERA;
        return temporalField == chronoField ? t.c.r(chronoField) : j$.time.temporal.p.d(this, temporalField);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return lVar.c(getValue(), ChronoField.ERA);
    }

    public final String toString() {
        return this.c;
    }
}
