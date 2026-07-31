package j$.time;

import androidx.car.app.navigation.model.Maneuver;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import j$.util.v;
import j$.util.w;
import j$.util.y;
import java.util.LinkedHashSet;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements TemporalQuery, j$.time.temporal.m, IntFunction, Supplier, BiConsumer, DoubleFunction, ToDoubleFunction, DoubleBinaryOperator, ObjDoubleConsumer {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 20:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            case 21:
                ((v) obj).a((v) obj2);
                break;
            default:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                j$.util.stream.j.a(dArr, dArr2[0]);
                j$.util.stream.j.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            case 20:
                break;
            case 21:
                break;
        }
        return j$.com.android.tools.r8.a.c(this, biConsumer);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 14:
                return new Object[i];
            default:
                return new Double[i];
        }
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d2) {
        switch (this.a) {
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return Math.max(d, d2);
            default:
                return Math.min(d, d2);
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 15:
                return new v();
            case 16:
                return new w();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new y();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new LinkedHashSet();
            default:
                return new double[3];
        }
    }

    @Override // j$.time.temporal.m
    public j$.time.temporal.l o(j$.time.temporal.l lVar) {
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return lVar.c(lVar.l(chronoField).d, chronoField);
    }

    @Override // j$.time.temporal.TemporalQuery
    public Object queryFrom(TemporalAccessor temporalAccessor) {
        int i = this.a;
        f fVar = j$.time.temporal.p.a;
        ZonedDateTime zonedDateTimeO = null;
        switch (i) {
            case 0:
                return LocalDate.P(temporalAccessor);
            case 1:
                return LocalDateTime.O(temporalAccessor);
            case 2:
                return LocalTime.O(temporalAccessor);
            case 3:
                DateTimeFormatter dateTimeFormatter = YearMonth.c;
                if (temporalAccessor instanceof YearMonth) {
                    return (YearMonth) temporalAccessor;
                }
                Objects.a(temporalAccessor, "temporal");
                try {
                    if (!j$.time.chrono.q.c.equals(j$.com.android.tools.r8.a.P(temporalAccessor))) {
                        temporalAccessor = LocalDate.P(temporalAccessor);
                    }
                    return YearMonth.of(temporalAccessor.j(ChronoField.YEAR), temporalAccessor.j(ChronoField.MONTH_OF_YEAR));
                } catch (DateTimeException e) {
                    d.h("Unable to obtain YearMonth from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e);
                    return null;
                }
            case 4:
                if (temporalAccessor instanceof ZonedDateTime) {
                    return (ZonedDateTime) temporalAccessor;
                }
                try {
                    ZoneId zoneIdN = ZoneId.N(temporalAccessor);
                    ChronoField chronoField = ChronoField.INSTANT_SECONDS;
                    zonedDateTimeO = temporalAccessor.e(chronoField) ? ZonedDateTime.o(temporalAccessor.C(chronoField), temporalAccessor.j(ChronoField.NANO_OF_SECOND), zoneIdN) : ZonedDateTime.N(LocalDateTime.of(LocalDate.P(temporalAccessor), LocalTime.O(temporalAccessor)), zoneIdN, null);
                    return zonedDateTimeO;
                } catch (DateTimeException e2) {
                    d.h("Unable to obtain ZonedDateTime from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e2);
                    return zonedDateTimeO;
                }
            case 5:
                f fVar2 = DateTimeFormatterBuilder.h;
                ZoneId zoneId = (ZoneId) temporalAccessor.E(fVar);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 6:
            default:
                ChronoField chronoField2 = ChronoField.NANO_OF_DAY;
                if (temporalAccessor.e(chronoField2)) {
                    return LocalTime.Q(temporalAccessor.C(chronoField2));
                }
                return null;
            case 7:
                return (ZoneId) temporalAccessor.E(fVar);
            case 8:
                return (j$.time.chrono.j) temporalAccessor.E(j$.time.temporal.p.b);
            case 9:
                return (j$.time.temporal.q) temporalAccessor.E(j$.time.temporal.p.c);
            case 10:
                ChronoField chronoField3 = ChronoField.OFFSET_SECONDS;
                if (temporalAccessor.e(chronoField3)) {
                    return ZoneOffset.ofTotalSeconds(temporalAccessor.j(chronoField3));
                }
                return null;
            case 11:
                ZoneId zoneId2 = (ZoneId) temporalAccessor.E(fVar);
                return zoneId2 != null ? zoneId2 : (ZoneId) temporalAccessor.E(j$.time.temporal.p.d);
            case 12:
                ChronoField chronoField4 = ChronoField.EPOCH_DAY;
                if (temporalAccessor.e(chronoField4)) {
                    return LocalDate.ofEpochDay(temporalAccessor.C(chronoField4));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return "ZoneId";
            case 8:
                return "Chronology";
            case 9:
                return "Precision";
            case 10:
                return "ZoneOffset";
            case 11:
                return "Zone";
            case 12:
                return "LocalDate";
            case 13:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        return Double.valueOf(d);
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        double[] dArr = (double[]) obj;
        j$.util.stream.j.a(dArr, d);
        dArr[2] = dArr[2] + d;
    }
}
