package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends c {
    private static final long serialVersionUID = -8722293800195731463L;
    public final transient LocalDate a;

    public g0(LocalDate localDate) {
        Objects.a(localDate, "isoDate");
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 8, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.y(this);
        }
        int i = f0.a[((ChronoField) temporalField).ordinal()];
        if (i == 4) {
            int iR = R();
            if (iR < 1) {
                iR = 1 - iR;
            }
            return iR;
        }
        if (i == 5) {
            return ((((long) R()) * 12) + ((long) this.a.b)) - 1;
        }
        if (i == 6) {
            return R();
        }
        if (i != 7) {
            return this.a.C(temporalField);
        }
        return R() < 1 ? 0 : 1;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime D(LocalTime localTime) {
        return new e(this, localTime);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final k F() {
        return R() >= 1 ? h0.BE : h0.BEFORE_BE;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate H(j$.time.temporal.o oVar) {
        return (g0) super.H(oVar);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate O(long j) {
        return T(this.a.Y(j));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate P(long j) {
        return T(this.a.Z(j));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate Q(long j) {
        return T(this.a.b0(j));
    }

    public final int R() {
        return this.a.getYear() + 543;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    @Override // j$.time.chrono.c, j$.time.temporal.l
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final g0 c(long j, TemporalField temporalField) {
        int iA;
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return (g0) super.c(j, temporalField);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (C(chronoField) == j) {
            return this;
        }
        int[] iArr = f0.a;
        int i2 = iArr[chronoField.ordinal()];
        if (i2 == 4) {
            iA = e0.c.r(chronoField).a(j, chronoField);
            i = iArr[chronoField.ordinal()];
            if (i != 4) {
                LocalDate localDate = this.a;
                if (R() < 1) {
                    iA = 1 - iA;
                }
                return T(localDate.f0(iA - 543));
            }
            if (i != 6) {
                return T(this.a.f0(iA - 543));
            }
            if (i == 7) {
                return T(this.a.f0((-542) - R()));
            }
        } else {
            if (i2 == 5) {
                e0.c.r(chronoField).b(j, chronoField);
                long jR = ((long) R()) * 12;
                LocalDate localDate2 = this.a;
                return T(localDate2.Z(j - ((jR + ((long) localDate2.b)) - 1)));
            }
            if (i2 == 6 || i2 == 7) {
                iA = e0.c.r(chronoField).a(j, chronoField);
                i = iArr[chronoField.ordinal()];
                if (i != 4) {
                    LocalDate localDate3 = this.a;
                    if (R() < 1) {
                        iA = 1 - iA;
                    }
                    return T(localDate3.f0(iA - 543));
                }
                if (i != 6) {
                    return T(this.a.f0(iA - 543));
                }
                if (i == 7) {
                    return T(this.a.f0((-542) - R()));
                }
            }
        }
        return T(this.a.c(j, temporalField));
    }

    public final g0 T(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new g0(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j a() {
        return e0.c;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate d(long j, j$.time.temporal.q qVar) {
        return (g0) super.d(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            return this.a.equals(((g0) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        e0.c.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l x(LocalDate localDate) {
        return (g0) super.x(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.k(this);
        }
        if (!j$.com.android.tools.r8.a.s(this, temporalField)) {
            throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", temporalField));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = f0.a[chronoField.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.l(temporalField);
        }
        if (i != 4) {
            return e0.c.r(chronoField);
        }
        j$.time.temporal.s sVar = ChronoField.YEAR.b;
        return j$.time.temporal.s.f(1L, R() <= 0 ? (-(sVar.a + 543)) + 1 : sVar.d + 543);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: s */
    public final ChronoLocalDate y(long j, j$.time.temporal.q qVar) {
        return (g0) super.y(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate x(j$.time.temporal.m mVar) {
        return (g0) super.x(mVar);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    public final j$.time.temporal.l y(long j, j$.time.temporal.a aVar) {
        return (g0) super.y(j, aVar);
    }

    @Override // j$.time.chrono.c, j$.time.temporal.l
    public final j$.time.temporal.l d(long j, j$.time.temporal.q qVar) {
        return (g0) super.d(j, qVar);
    }
}
