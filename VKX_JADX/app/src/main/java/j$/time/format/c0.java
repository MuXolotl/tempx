package j$.time.format;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements TemporalAccessor {
    public ZoneId b;
    public j$.time.chrono.j c;
    public boolean d;
    public d0 e;
    public ChronoLocalDate f;
    public LocalTime g;
    public final Map a = new HashMap();
    public j$.time.n h = j$.time.n.d;

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(TemporalField temporalField) {
        Objects.a(temporalField, "field");
        Long l = (Long) ((HashMap) this.a).get(temporalField);
        if (l != null) {
            return l.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.f;
        if (chronoLocalDate != null && chronoLocalDate.e(temporalField)) {
            return this.f.C(temporalField);
        }
        LocalTime localTime = this.g;
        if (localTime != null && localTime.e(temporalField)) {
            return this.g.C(temporalField);
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", temporalField));
        }
        return temporalField.y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object E(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.a) {
            return this.b;
        }
        if (temporalQuery == j$.time.temporal.p.b) {
            return this.c;
        }
        if (temporalQuery == j$.time.temporal.p.f) {
            ChronoLocalDate chronoLocalDate = this.f;
            if (chronoLocalDate != null) {
                return LocalDate.P(chronoLocalDate);
            }
            return null;
        }
        if (temporalQuery == j$.time.temporal.p.g) {
            return this.g;
        }
        if (temporalQuery == j$.time.temporal.p.d) {
            Long l = (Long) ((HashMap) this.a).get(ChronoField.OFFSET_SECONDS);
            if (l != null) {
                return ZoneOffset.ofTotalSeconds(l.intValue());
            }
            ZoneId zoneId = this.b;
            return zoneId instanceof ZoneOffset ? zoneId : temporalQuery.queryFrom(this);
        }
        if (temporalQuery == j$.time.temporal.p.e) {
            return temporalQuery.queryFrom(this);
        }
        if (temporalQuery == j$.time.temporal.p.c) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (((HashMap) this.a).containsKey(temporalField)) {
            return true;
        }
        ChronoLocalDate chronoLocalDate = this.f;
        if (chronoLocalDate != null && chronoLocalDate.e(temporalField)) {
            return true;
        }
        LocalTime localTime = this.g;
        if (localTime == null || !localTime.e(temporalField)) {
            return (temporalField == null || (temporalField instanceof ChronoField) || !temporalField.j(this)) ? false : true;
        }
        return true;
    }

    public final void h(TemporalAccessor temporalAccessor) {
        Iterator it = ((HashMap) this.a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            TemporalField temporalField = (TemporalField) entry.getKey();
            if (temporalAccessor.e(temporalField)) {
                try {
                    long jC = temporalAccessor.C(temporalField);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jC != jLongValue) {
                        throw new DateTimeException("Conflict found: Field " + temporalField + " " + jC + " differs from " + temporalField + " " + jLongValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final void i() {
        if (((HashMap) this.a).containsKey(ChronoField.INSTANT_SECONDS)) {
            ZoneId zoneId = this.b;
            if (zoneId != null) {
                m(zoneId);
                return;
            }
            Long l = (Long) ((HashMap) this.a).get(ChronoField.OFFSET_SECONDS);
            if (l != null) {
                m(ZoneOffset.ofTotalSeconds(l.intValue()));
            }
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int j(TemporalField temporalField) {
        return j$.time.temporal.p.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ j$.time.temporal.s l(TemporalField temporalField) {
        return j$.time.temporal.p.d(this, temporalField);
    }

    public final void m(ZoneId zoneId) {
        Map map = this.a;
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        ChronoZonedDateTime chronoZonedDateTimeJ = this.c.J(Instant.N(((Long) ((HashMap) map).remove(chronoField)).longValue(), 0), zoneId);
        t(chronoZonedDateTimeJ.f());
        u(chronoField, ChronoField.SECOND_OF_DAY, Long.valueOf(chronoZonedDateTimeJ.b().Y()));
    }

    public final void n(long j, long j2, long j3, long j4) {
        if (this.e == d0.LENIENT) {
            long jR = j$.com.android.tools.r8.a.R(j$.com.android.tools.r8.a.R(j$.com.android.tools.r8.a.R(j$.com.android.tools.r8.a.X(j, 3600000000000L), j$.com.android.tools.r8.a.X(j2, 60000000000L)), j$.com.android.tools.r8.a.X(j3, 1000000000L)), j4);
            r(LocalTime.Q(j$.com.android.tools.r8.a.V(jR, 86400000000000L)), j$.time.n.a(0, 0, (int) j$.com.android.tools.r8.a.W(jR, 86400000000000L)));
            return;
        }
        ChronoField chronoField = ChronoField.MINUTE_OF_HOUR;
        int iA = chronoField.b.a(j2, chronoField);
        ChronoField chronoField2 = ChronoField.NANO_OF_SECOND;
        int iA2 = chronoField2.b.a(j4, chronoField2);
        if (this.e == d0.SMART && j == 24 && iA == 0 && j3 == 0 && iA2 == 0) {
            r(LocalTime.e, j$.time.n.a(0, 0, 1));
            return;
        }
        ChronoField chronoField3 = ChronoField.HOUR_OF_DAY;
        int iA3 = chronoField3.b.a(j, chronoField3);
        ChronoField chronoField4 = ChronoField.SECOND_OF_MINUTE;
        r(LocalTime.of(iA3, iA, chronoField4.b.a(j3, chronoField4), iA2), j$.time.n.d);
    }

    public final void o() {
        Map map = this.a;
        ChronoField chronoField = ChronoField.CLOCK_HOUR_OF_DAY;
        if (((HashMap) map).containsKey(chronoField)) {
            long jLongValue = ((Long) ((HashMap) this.a).remove(chronoField)).longValue();
            d0 d0Var = this.e;
            if (d0Var == d0.STRICT || (d0Var == d0.SMART && jLongValue != 0)) {
                chronoField.E(jLongValue);
            }
            ChronoField chronoField2 = ChronoField.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            u(chronoField, chronoField2, Long.valueOf(jLongValue));
        }
        Map map2 = this.a;
        ChronoField chronoField3 = ChronoField.CLOCK_HOUR_OF_AMPM;
        if (((HashMap) map2).containsKey(chronoField3)) {
            long jLongValue2 = ((Long) ((HashMap) this.a).remove(chronoField3)).longValue();
            d0 d0Var2 = this.e;
            if (d0Var2 == d0.STRICT || (d0Var2 == d0.SMART && jLongValue2 != 0)) {
                chronoField3.E(jLongValue2);
            }
            u(chronoField3, ChronoField.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        Map map3 = this.a;
        ChronoField chronoField4 = ChronoField.AMPM_OF_DAY;
        if (((HashMap) map3).containsKey(chronoField4)) {
            Map map4 = this.a;
            ChronoField chronoField5 = ChronoField.HOUR_OF_AMPM;
            if (((HashMap) map4).containsKey(chronoField5)) {
                long jLongValue3 = ((Long) ((HashMap) this.a).remove(chronoField4)).longValue();
                long jLongValue4 = ((Long) ((HashMap) this.a).remove(chronoField5)).longValue();
                if (this.e == d0.LENIENT) {
                    u(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf(j$.com.android.tools.r8.a.R(j$.com.android.tools.r8.a.X(jLongValue3, 12L), jLongValue4)));
                } else {
                    chronoField4.E(jLongValue3);
                    chronoField5.E(jLongValue3);
                    u(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        Map map5 = this.a;
        ChronoField chronoField6 = ChronoField.NANO_OF_DAY;
        if (((HashMap) map5).containsKey(chronoField6)) {
            long jLongValue5 = ((Long) ((HashMap) this.a).remove(chronoField6)).longValue();
            if (this.e != d0.LENIENT) {
                chronoField6.E(jLongValue5);
            }
            u(chronoField6, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            u(chronoField6, ChronoField.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            u(chronoField6, ChronoField.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            u(chronoField6, ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        Map map6 = this.a;
        ChronoField chronoField7 = ChronoField.MICRO_OF_DAY;
        if (((HashMap) map6).containsKey(chronoField7)) {
            long jLongValue6 = ((Long) ((HashMap) this.a).remove(chronoField7)).longValue();
            if (this.e != d0.LENIENT) {
                chronoField7.E(jLongValue6);
            }
            u(chronoField7, ChronoField.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            u(chronoField7, ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        Map map7 = this.a;
        ChronoField chronoField8 = ChronoField.MILLI_OF_DAY;
        if (((HashMap) map7).containsKey(chronoField8)) {
            long jLongValue7 = ((Long) ((HashMap) this.a).remove(chronoField8)).longValue();
            if (this.e != d0.LENIENT) {
                chronoField8.E(jLongValue7);
            }
            u(chronoField8, ChronoField.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            u(chronoField8, ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        Map map8 = this.a;
        ChronoField chronoField9 = ChronoField.SECOND_OF_DAY;
        if (((HashMap) map8).containsKey(chronoField9)) {
            long jLongValue8 = ((Long) ((HashMap) this.a).remove(chronoField9)).longValue();
            if (this.e != d0.LENIENT) {
                chronoField9.E(jLongValue8);
            }
            u(chronoField9, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            u(chronoField9, ChronoField.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            u(chronoField9, ChronoField.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        Map map9 = this.a;
        ChronoField chronoField10 = ChronoField.MINUTE_OF_DAY;
        if (((HashMap) map9).containsKey(chronoField10)) {
            long jLongValue9 = ((Long) ((HashMap) this.a).remove(chronoField10)).longValue();
            if (this.e != d0.LENIENT) {
                chronoField10.E(jLongValue9);
            }
            u(chronoField10, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            u(chronoField10, ChronoField.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        Map map10 = this.a;
        ChronoField chronoField11 = ChronoField.NANO_OF_SECOND;
        if (((HashMap) map10).containsKey(chronoField11)) {
            long jLongValue10 = ((Long) ((HashMap) this.a).get(chronoField11)).longValue();
            d0 d0Var3 = this.e;
            d0 d0Var4 = d0.LENIENT;
            if (d0Var3 != d0Var4) {
                chronoField11.E(jLongValue10);
            }
            Map map11 = this.a;
            ChronoField chronoField12 = ChronoField.MICRO_OF_SECOND;
            if (((HashMap) map11).containsKey(chronoField12)) {
                long jLongValue11 = ((Long) ((HashMap) this.a).remove(chronoField12)).longValue();
                if (this.e != d0Var4) {
                    chronoField12.E(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                u(chronoField12, chronoField11, Long.valueOf(jLongValue10));
            }
            Map map12 = this.a;
            ChronoField chronoField13 = ChronoField.MILLI_OF_SECOND;
            if (((HashMap) map12).containsKey(chronoField13)) {
                long jLongValue12 = ((Long) ((HashMap) this.a).remove(chronoField13)).longValue();
                if (this.e != d0Var4) {
                    chronoField13.E(jLongValue12);
                }
                u(chronoField13, chronoField11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        Map map13 = this.a;
        ChronoField chronoField14 = ChronoField.HOUR_OF_DAY;
        if (((HashMap) map13).containsKey(chronoField14)) {
            Map map14 = this.a;
            ChronoField chronoField15 = ChronoField.MINUTE_OF_HOUR;
            if (((HashMap) map14).containsKey(chronoField15)) {
                Map map15 = this.a;
                ChronoField chronoField16 = ChronoField.SECOND_OF_MINUTE;
                if (((HashMap) map15).containsKey(chronoField16) && ((HashMap) this.a).containsKey(chronoField11)) {
                    n(((Long) ((HashMap) this.a).remove(chronoField14)).longValue(), ((Long) ((HashMap) this.a).remove(chronoField15)).longValue(), ((Long) ((HashMap) this.a).remove(chronoField16)).longValue(), ((Long) ((HashMap) this.a).remove(chronoField11)).longValue());
                }
            }
        }
    }

    public final void r(LocalTime localTime, j$.time.n nVar) {
        LocalTime localTime2 = this.g;
        if (localTime2 == null) {
            this.g = localTime;
            this.h = nVar;
            return;
        }
        if (!localTime2.equals(localTime)) {
            j$.time.d.g("Conflict found: Fields resolved to different times: ", this.g, " ", localTime);
            return;
        }
        j$.time.n nVar2 = this.h;
        nVar2.getClass();
        j$.time.n nVar3 = j$.time.n.d;
        if (nVar2 == nVar3 || nVar == nVar3 || this.h.equals(nVar)) {
            this.h = nVar;
        } else {
            j$.time.d.g("Conflict found: Fields resolved to different excess periods: ", this.h, " ", nVar);
        }
    }

    public final void t(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate == null || chronoLocalDate2.equals(chronoLocalDate)) {
                return;
            }
            j$.time.d.g("Conflict found: Fields resolved to two different dates: ", this.f, " ", chronoLocalDate);
            return;
        }
        if (chronoLocalDate != null) {
            if (this.c.equals(chronoLocalDate.a())) {
                this.f = chronoLocalDate;
                return;
            }
            throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + this.c);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a);
        sb.append(',');
        sb.append(this.c);
        if (this.b != null) {
            sb.append(',');
            sb.append(this.b);
        }
        if (this.f != null || this.g != null) {
            sb.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f;
            if (chronoLocalDate != null) {
                sb.append(chronoLocalDate);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }

    public final void u(TemporalField temporalField, ChronoField chronoField, Long l) {
        Long l2 = (Long) ((HashMap) this.a).put(chronoField, l);
        if (l2 == null || l2.longValue() == l.longValue()) {
            return;
        }
        throw new DateTimeException("Conflict found: " + chronoField + " " + l2 + " differs from " + chronoField + " " + l + " while resolving  " + temporalField);
    }
}
