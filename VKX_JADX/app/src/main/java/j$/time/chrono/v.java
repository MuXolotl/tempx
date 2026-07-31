package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends c {
    public static final LocalDate d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient LocalDate a;
    public final transient w b;
    public final transient int c;

    public v(LocalDate localDate) {
        if (localDate.S(d)) {
            j$.time.d.k("JapaneseDate before Meiji 6 is not supported");
            throw null;
        }
        w wVarH = w.h(localDate);
        this.b = wVarH;
        this.c = (localDate.getYear() - wVarH.b.getYear()) + 1;
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 4, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.y(this);
        }
        switch (u.a[((ChronoField) temporalField).ordinal()]) {
            case 2:
                int i = this.c;
                LocalDate localDate = this.a;
                return i == 1 ? (localDate.R() - this.b.b.R()) + 1 : localDate.R();
            case 3:
                return this.c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", temporalField));
            case 8:
                return this.b.a;
            default:
                return this.a.C(temporalField);
        }
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime D(LocalTime localTime) {
        return new e(this, localTime);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final k F() {
        return this.b;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate H(j$.time.temporal.o oVar) {
        return (v) super.H(oVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int K() {
        w wVarI = this.b.i();
        int iK = (wVarI == null || wVarI.b.getYear() != this.a.getYear()) ? this.a.K() : wVarI.b.R() - 1;
        return this.c == 1 ? iK - (this.b.b.R() - 1) : iK;
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate O(long j) {
        return U(this.a.Y(j));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate P(long j) {
        return U(this.a.Z(j));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate Q(long j) {
        return U(this.a.b0(j));
    }

    public final v R(long j, j$.time.temporal.a aVar) {
        return (v) super.d(j, (j$.time.temporal.q) aVar);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final v c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (v) super.c(j, temporalField);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (C(chronoField) == j) {
            return this;
        }
        int[] iArr = u.a;
        int i = iArr[chronoField.ordinal()];
        if (i == 3 || i == 8 || i == 9) {
            t tVar = t.c;
            int iA = tVar.r(chronoField).a(j, chronoField);
            int i2 = iArr[chronoField.ordinal()];
            if (i2 == 3) {
                return U(this.a.f0(tVar.v(this.b, iA)));
            }
            if (i2 == 8) {
                return U(this.a.f0(tVar.v(w.m(iA), this.c)));
            }
            if (i2 == 9) {
                return U(this.a.f0(iA));
            }
        }
        return U(this.a.c(j, temporalField));
    }

    public final v T(j$.time.f fVar) {
        return (v) super.x(fVar);
    }

    public final v U(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new v(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j a() {
        return t.c;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate d(long j, j$.time.temporal.q qVar) {
        return (v) super.d(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH || temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR || temporalField == ChronoField.ALIGNED_WEEK_OF_MONTH || temporalField == ChronoField.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).isDateBased();
        }
        return temporalField != null && temporalField.j(this);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.a.equals(((v) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        t.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l x(LocalDate localDate) {
        return (v) super.x(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.k(this);
        }
        if (!e(temporalField)) {
            throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", temporalField));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = u.a[chronoField.ordinal()];
        if (i == 1) {
            return j$.time.temporal.s.f(1L, this.a.T());
        }
        if (i == 2) {
            return j$.time.temporal.s.f(1L, K());
        }
        if (i != 3) {
            return t.c.r(chronoField);
        }
        int year = this.b.b.getYear();
        w wVarI = this.b.i();
        return wVarI != null ? j$.time.temporal.s.f(1L, (wVarI.b.getYear() - year) + 1) : j$.time.temporal.s.f(1L, 999999999 - year);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: s */
    public final ChronoLocalDate y(long j, j$.time.temporal.q qVar) {
        return (v) super.y(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate x(j$.time.temporal.m mVar) {
        return (v) super.x(mVar);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    public final j$.time.temporal.l y(long j, j$.time.temporal.a aVar) {
        return (v) super.y(j, aVar);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    public final j$.time.temporal.l d(long j, j$.time.temporal.q qVar) {
        return (v) super.d(j, qVar);
    }

    public v(w wVar, int i, LocalDate localDate) {
        if (!localDate.S(d)) {
            this.b = wVar;
            this.c = i;
            this.a = localDate;
            return;
        }
        j$.time.d.k("JapaneseDate before Meiji 6 is not supported");
        throw null;
    }
}
