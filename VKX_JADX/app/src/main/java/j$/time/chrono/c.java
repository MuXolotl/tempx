package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements ChronoLocalDate, j$.time.temporal.l, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static ChronoLocalDate N(j jVar, j$.time.temporal.l lVar) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) lVar;
        if (jVar.equals(chronoLocalDate.a())) {
            return chronoLocalDate;
        }
        j$.time.d.f("Chronology mismatch, expected: ", jVar.i(), chronoLocalDate.a().i());
        return null;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public ChronoLocalDateTime D(LocalTime localTime) {
        return new e(this, localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object E(TemporalQuery temporalQuery) {
        return j$.com.android.tools.r8.a.v(this, temporalQuery);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public k F() {
        return a().u(j$.time.temporal.p.a(this, ChronoField.ERA));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public ChronoLocalDate H(j$.time.temporal.o oVar) {
        return N(a(), oVar.j(this));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int K() {
        return q() ? 366 : 365;
    }

    public abstract ChronoLocalDate O(long j);

    public abstract ChronoLocalDate P(long j);

    public abstract ChronoLocalDate Q(long j);

    @Override // j$.time.temporal.l
    public ChronoLocalDate c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", temporalField));
        }
        return N(a(), temporalField.C(this, j));
    }

    @Override // j$.time.temporal.l
    public ChronoLocalDate d(long j, j$.time.temporal.q qVar) {
        boolean z = qVar instanceof j$.time.temporal.a;
        if (!z) {
            if (!z) {
                return N(a(), qVar.j(this, j));
            }
            j$.time.d.b(qVar, "Unsupported unit: ");
            return null;
        }
        switch (b.a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return O(j);
            case 2:
                return O(j$.com.android.tools.r8.a.X(j, 7L));
            case 3:
                return P(j);
            case 4:
                return Q(j);
            case 5:
                return Q(j$.com.android.tools.r8.a.X(j, 10L));
            case 6:
                return Q(j$.com.android.tools.r8.a.X(j, 100L));
            case 7:
                return Q(j$.com.android.tools.r8.a.X(j, 1000L));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return c(j$.com.android.tools.r8.a.R(C(chronoField), j), (TemporalField) chronoField);
            default:
                j$.time.d.b(qVar, "Unsupported unit: ");
                return null;
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean e(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.s(this, temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && j$.com.android.tools.r8.a.f(this, (ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long epochDay = toEpochDay();
        return a().hashCode() ^ ((int) (epochDay ^ (epochDay >>> 32)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int j(TemporalField temporalField) {
        return j$.time.temporal.p.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.s l(TemporalField temporalField) {
        return j$.time.temporal.p.d(this, temporalField);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return j$.com.android.tools.r8.a.a(this, lVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean q() {
        return a().L(C(ChronoField.YEAR));
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: s */
    public ChronoLocalDate y(long j, j$.time.temporal.q qVar) {
        return N(a(), j$.time.temporal.p.b(this, j, qVar));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        return C(ChronoField.EPOCH_DAY);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final String toString() {
        long jC = C(ChronoField.YEAR_OF_ERA);
        long jC2 = C(ChronoField.MONTH_OF_YEAR);
        long jC3 = C(ChronoField.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(a().toString());
        sb.append(" ");
        sb.append(F());
        sb.append(" ");
        sb.append(jC);
        sb.append(jC2 < 10 ? "-0" : "-");
        sb.append(jC2);
        sb.append(jC3 < 10 ? "-0" : "-");
        sb.append(jC3);
        return sb.toString();
    }

    @Override // j$.time.temporal.l
    public ChronoLocalDate x(j$.time.temporal.m mVar) {
        return N(a(), mVar.o(this));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoLocalDate chronoLocalDate) {
        return j$.com.android.tools.r8.a.f(this, chronoLocalDate);
    }
}
