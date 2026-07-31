package j$.time.format;

import j$.time.DateTimeException;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter RFC_1123_DATE_TIME;
    public static final DateTimeFormatter f;
    public static final DateTimeFormatter g;
    public static final DateTimeFormatter h;
    public final d a;
    public final Locale b;
    public final b0 c;
    public final d0 d;
    public final j$.time.chrono.j e;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        ChronoField chronoField = ChronoField.YEAR;
        SignStyle signStyle = SignStyle.EXCEEDS_PAD;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral = dateTimeFormatterBuilder.appendValue(chronoField, 4, 10, signStyle).appendLiteral('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral2 = dateTimeFormatterBuilderAppendLiteral.appendValue(chronoField2, 2).appendLiteral('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue = dateTimeFormatterBuilderAppendLiteral2.appendValue(chronoField3, 2);
        d0 d0Var = d0.STRICT;
        j$.time.chrono.q qVar = j$.time.chrono.q.c;
        DateTimeFormatter dateTimeFormatterL = dateTimeFormatterBuilderAppendValue.l(d0Var, qVar);
        ISO_LOCAL_DATE = dateTimeFormatterL;
        DateTimeFormatterBuilder caseInsensitive = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive.a(dateTimeFormatterL);
        caseInsensitive.appendOffsetId().l(d0Var, qVar);
        DateTimeFormatterBuilder caseInsensitive2 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive2.a(dateTimeFormatterL);
        caseInsensitive2.k();
        caseInsensitive2.appendOffsetId().l(d0Var, qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral3 = dateTimeFormatterBuilder2.appendValue(chronoField4, 2).appendLiteral(':');
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue2 = dateTimeFormatterBuilderAppendLiteral3.appendValue(chronoField5, 2);
        dateTimeFormatterBuilderAppendValue2.k();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral4 = dateTimeFormatterBuilderAppendValue2.appendLiteral(':');
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue3 = dateTimeFormatterBuilderAppendLiteral4.appendValue(chronoField6, 2);
        dateTimeFormatterBuilderAppendValue3.k();
        dateTimeFormatterBuilderAppendValue3.b(ChronoField.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterL2 = dateTimeFormatterBuilderAppendValue3.l(d0Var, null);
        f = dateTimeFormatterL2;
        DateTimeFormatterBuilder caseInsensitive3 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive3.a(dateTimeFormatterL2);
        caseInsensitive3.appendOffsetId().l(d0Var, null);
        DateTimeFormatterBuilder caseInsensitive4 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive4.a(dateTimeFormatterL2);
        caseInsensitive4.k();
        caseInsensitive4.appendOffsetId().l(d0Var, null);
        DateTimeFormatterBuilder caseInsensitive5 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive5.a(dateTimeFormatterL);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral5 = caseInsensitive5.appendLiteral('T');
        dateTimeFormatterBuilderAppendLiteral5.a(dateTimeFormatterL2);
        DateTimeFormatter dateTimeFormatterL3 = dateTimeFormatterBuilderAppendLiteral5.l(d0Var, qVar);
        g = dateTimeFormatterL3;
        DateTimeFormatterBuilder caseInsensitive6 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive6.a(dateTimeFormatterL3);
        q qVar2 = q.LENIENT;
        caseInsensitive6.c(qVar2);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId = caseInsensitive6.appendOffsetId();
        q qVar3 = q.STRICT;
        dateTimeFormatterBuilderAppendOffsetId.c(qVar3);
        DateTimeFormatter dateTimeFormatterL4 = dateTimeFormatterBuilderAppendOffsetId.l(d0Var, qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.a(dateTimeFormatterL4);
        dateTimeFormatterBuilder3.k();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral6 = dateTimeFormatterBuilder3.appendLiteral('[');
        q qVar4 = q.SENSITIVE;
        dateTimeFormatterBuilderAppendLiteral6.c(qVar4);
        j$.time.f fVar = DateTimeFormatterBuilder.h;
        dateTimeFormatterBuilderAppendLiteral6.c(new t(fVar, "ZoneRegionId()"));
        dateTimeFormatterBuilderAppendLiteral6.appendLiteral(']').l(d0Var, qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder4.a(dateTimeFormatterL3);
        dateTimeFormatterBuilder4.k();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId2 = dateTimeFormatterBuilder4.appendOffsetId();
        dateTimeFormatterBuilderAppendOffsetId2.k();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral7 = dateTimeFormatterBuilderAppendOffsetId2.appendLiteral('[');
        dateTimeFormatterBuilderAppendLiteral7.c(qVar4);
        dateTimeFormatterBuilderAppendLiteral7.c(new t(fVar, "ZoneRegionId()"));
        dateTimeFormatterBuilderAppendLiteral7.appendLiteral(']').l(d0Var, qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue4 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(chronoField, 4, 10, signStyle).appendLiteral('-').appendValue(ChronoField.DAY_OF_YEAR, 3);
        dateTimeFormatterBuilderAppendValue4.k();
        dateTimeFormatterBuilderAppendValue4.appendOffsetId().l(d0Var, qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue5 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(j$.time.temporal.i.c, 4, 10, signStyle);
        dateTimeFormatterBuilderAppendValue5.d("-W");
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral8 = dateTimeFormatterBuilderAppendValue5.appendValue(j$.time.temporal.i.b, 2).appendLiteral('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue6 = dateTimeFormatterBuilderAppendLiteral8.appendValue(chronoField7, 1);
        dateTimeFormatterBuilderAppendValue6.k();
        dateTimeFormatterBuilderAppendValue6.appendOffsetId().l(d0Var, qVar);
        DateTimeFormatterBuilder caseInsensitive7 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive7.getClass();
        caseInsensitive7.c(new g());
        h = caseInsensitive7.l(d0Var, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue7 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(chronoField, 4).appendValue(chronoField2, 2).appendValue(chronoField3, 2);
        dateTimeFormatterBuilderAppendValue7.k();
        dateTimeFormatterBuilderAppendValue7.c(qVar2);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffset = dateTimeFormatterBuilderAppendValue7.appendOffset("+HHMMss", "Z");
        dateTimeFormatterBuilderAppendOffset.c(qVar3);
        dateTimeFormatterBuilderAppendOffset.l(d0Var, qVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        DateTimeFormatterBuilder caseInsensitive8 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive8.c(qVar2);
        caseInsensitive8.k();
        caseInsensitive8.f(chronoField7, map);
        caseInsensitive8.d(", ");
        caseInsensitive8.j();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral9 = caseInsensitive8.appendValue(chronoField3, 1, 2, SignStyle.NOT_NEGATIVE).appendLiteral(' ');
        dateTimeFormatterBuilderAppendLiteral9.f(chronoField2, map2);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue8 = dateTimeFormatterBuilderAppendLiteral9.appendLiteral(' ').appendValue(chronoField, 4).appendLiteral(' ').appendValue(chronoField4, 2).appendLiteral(':').appendValue(chronoField5, 2);
        dateTimeFormatterBuilderAppendValue8.k();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue9 = dateTimeFormatterBuilderAppendValue8.appendLiteral(':').appendValue(chronoField6, 2);
        dateTimeFormatterBuilderAppendValue9.j();
        RFC_1123_DATE_TIME = dateTimeFormatterBuilderAppendValue9.appendLiteral(' ').appendOffset("+HHMM", "GMT").l(d0.SMART, qVar);
    }

    public DateTimeFormatter(d dVar, Locale locale, d0 d0Var, j$.time.chrono.j jVar) {
        b0 b0Var = b0.a;
        this.a = dVar;
        Objects.a(locale, "locale");
        this.b = locale;
        this.c = b0Var;
        Objects.a(d0Var, "resolverStyle");
        this.d = d0Var;
        this.e = jVar;
    }

    public static DateTimeFormatter ofLocalizedDateTime(FormatStyle formatStyle, FormatStyle formatStyle2) {
        Objects.a(formatStyle, "dateStyle");
        Objects.a(formatStyle2, "timeStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.c(new i(formatStyle, formatStyle2));
        return dateTimeFormatterBuilder.l(d0.SMART, j$.time.chrono.q.c);
    }

    /* JADX WARN: Code duplicated, block: B:127:0x030c  */
    /* JADX WARN: Code duplicated, block: B:129:0x031a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0345  */
    /* JADX WARN: Code duplicated, block: B:163:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x026f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x026f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0251  */
    /* JADX WARN: Code duplicated, block: B:96:0x0275  */
    public final c0 a(CharSequence charSequence) {
        TemporalField temporalField;
        ChronoField chronoField;
        ChronoField chronoField2;
        boolean zContainsKey;
        Map map;
        TemporalField temporalField2;
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        v vVar = new v(this);
        int iK = this.a.k(vVar, charSequence, parsePosition.getIndex());
        if (iK < 0) {
            parsePosition.setErrorIndex(~iK);
            vVar = null;
        } else {
            parsePosition.setIndex(iK);
        }
        if (vVar == null || parsePosition.getErrorIndex() >= 0 || parsePosition.getIndex() < charSequence.length()) {
            String string = charSequence.length() > 64 ? charSequence.subSequence(0, 64).toString() + "..." : charSequence.toString();
            if (parsePosition.getErrorIndex() >= 0) {
                String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
                parsePosition.getErrorIndex();
                throw new DateTimeParseException(str, charSequence);
            }
            String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
            parsePosition.getIndex();
            throw new DateTimeParseException(str2, charSequence);
        }
        c0 c0VarC = vVar.c();
        c0VarC.c = vVar.d();
        ZoneId zoneId = c0VarC.b;
        if (zoneId == null) {
            vVar.a.getClass();
            zoneId = null;
        }
        c0VarC.b = zoneId;
        c0VarC.e = this.d;
        c0VarC.i();
        c0VarC.t(c0VarC.c.I(c0VarC.a, c0VarC.e));
        c0VarC.o();
        if (((HashMap) c0VarC.a).size() > 0) {
            loop0: while (i < 50) {
                Iterator it = ((HashMap) c0VarC.a).entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    temporalField2 = (TemporalField) ((Map.Entry) it.next()).getKey();
                    TemporalAccessor temporalAccessorL = temporalField2.l(c0VarC.a, c0VarC, c0VarC.e);
                    if (temporalAccessorL != null) {
                        if (temporalAccessorL instanceof ChronoZonedDateTime) {
                            ChronoZonedDateTime chronoZonedDateTime = (ChronoZonedDateTime) temporalAccessorL;
                            ZoneId zoneId2 = c0VarC.b;
                            if (zoneId2 == null) {
                                c0VarC.b = chronoZonedDateTime.getZone();
                            } else if (!zoneId2.equals(chronoZonedDateTime.getZone())) {
                                throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + c0VarC.b);
                            }
                            temporalAccessorL = chronoZonedDateTime.p();
                        }
                        if (temporalAccessorL instanceof ChronoLocalDateTime) {
                            ChronoLocalDateTime chronoLocalDateTime = (ChronoLocalDateTime) temporalAccessorL;
                            c0VarC.r(chronoLocalDateTime.b(), j$.time.n.d);
                            c0VarC.t(chronoLocalDateTime.f());
                            break;
                        }
                        if (temporalAccessorL instanceof ChronoLocalDate) {
                            c0VarC.t((ChronoLocalDate) temporalAccessorL);
                            break;
                        }
                        if (temporalAccessorL instanceof LocalTime) {
                            c0VarC.r((LocalTime) temporalAccessorL, j$.time.n.d);
                            break;
                        }
                        j$.time.d.k("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                        return null;
                    }
                } while (((HashMap) c0VarC.a).containsKey(temporalField2));
                i++;
            }
            if (i == 50) {
                j$.time.d.k("One of the parsed fields has an incorrectly implemented resolve method");
                return null;
            }
            if (i > 0) {
                c0VarC.i();
                c0VarC.t(c0VarC.c.I(c0VarC.a, c0VarC.e));
                c0VarC.o();
            }
        }
        long j = 1000000;
        if (c0VarC.g == null) {
            Map map2 = c0VarC.a;
            ChronoField chronoField3 = ChronoField.MILLI_OF_SECOND;
            boolean zContainsKey2 = ((HashMap) map2).containsKey(chronoField3);
            Map map3 = c0VarC.a;
            if (zContainsKey2) {
                long jLongValue = ((Long) ((HashMap) map3).remove(chronoField3)).longValue();
                Map map4 = c0VarC.a;
                ChronoField chronoField4 = ChronoField.MICRO_OF_SECOND;
                boolean zContainsKey3 = ((HashMap) map4).containsKey(chronoField4);
                Map map5 = c0VarC.a;
                if (zContainsKey3) {
                    long jLongValue2 = (((Long) ((HashMap) map5).get(chronoField4)).longValue() % 1000) + (jLongValue * 1000);
                    c0VarC.u(chronoField3, chronoField4, Long.valueOf(jLongValue2));
                    ((HashMap) c0VarC.a).remove(chronoField4);
                    ((HashMap) c0VarC.a).put(ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                } else {
                    ((HashMap) map5).put(ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                }
            } else {
                ChronoField chronoField5 = ChronoField.MICRO_OF_SECOND;
                if (((HashMap) map3).containsKey(chronoField5)) {
                    ((HashMap) c0VarC.a).put(ChronoField.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) c0VarC.a).remove(chronoField5)).longValue() * 1000));
                }
            }
            Map map6 = c0VarC.a;
            ChronoField chronoField6 = ChronoField.HOUR_OF_DAY;
            Long l = (Long) ((HashMap) map6).get(chronoField6);
            if (l != null) {
                Map map7 = c0VarC.a;
                ChronoField chronoField7 = ChronoField.MINUTE_OF_HOUR;
                Long l2 = (Long) ((HashMap) map7).get(chronoField7);
                Map map8 = c0VarC.a;
                ChronoField chronoField8 = ChronoField.SECOND_OF_MINUTE;
                Long l3 = (Long) ((HashMap) map8).get(chronoField8);
                Map map9 = c0VarC.a;
                ChronoField chronoField9 = ChronoField.NANO_OF_SECOND;
                Long l4 = (Long) ((HashMap) map9).get(chronoField9);
                if ((l2 != null || (l3 == null && l4 == null)) && (l2 == null || l3 != null || l4 == null)) {
                    c0VarC.n(l.longValue(), l2 != null ? l2.longValue() : 0L, l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L);
                    ((HashMap) c0VarC.a).remove(chronoField6);
                    ((HashMap) c0VarC.a).remove(chronoField7);
                    ((HashMap) c0VarC.a).remove(chronoField8);
                    ((HashMap) c0VarC.a).remove(chronoField9);
                } else {
                    j = 1000000;
                }
            }
            if (c0VarC.e != d0.LENIENT && ((HashMap) c0VarC.a).size() > 0) {
                for (Map.Entry entry : ((HashMap) c0VarC.a).entrySet()) {
                    temporalField = (TemporalField) entry.getKey();
                    if (temporalField instanceof ChronoField) {
                        chronoField = (ChronoField) temporalField;
                        if (chronoField.N()) {
                            chronoField.E(((Long) entry.getValue()).longValue());
                        }
                    }
                }
            }
        } else if (c0VarC.e != d0.LENIENT) {
            while (r0.hasNext()) {
                temporalField = (TemporalField) entry.getKey();
                if (temporalField instanceof ChronoField) {
                    chronoField = (ChronoField) temporalField;
                    if (chronoField.N()) {
                        chronoField.E(((Long) entry.getValue()).longValue());
                    }
                }
            }
        }
        ChronoLocalDate chronoLocalDate = c0VarC.f;
        if (chronoLocalDate != null) {
            c0VarC.h(chronoLocalDate);
        }
        LocalTime localTime = c0VarC.g;
        if (localTime != null) {
            c0VarC.h(localTime);
            if (c0VarC.f != null && ((HashMap) c0VarC.a).size() > 0) {
                c0VarC.h(c0VarC.f.D(c0VarC.g));
            }
        }
        if (c0VarC.f != null && c0VarC.g != null) {
            j$.time.n nVar = c0VarC.h;
            nVar.getClass();
            j$.time.n nVar2 = j$.time.n.d;
            if (nVar != nVar2) {
                c0VarC.f = c0VarC.f.H(c0VarC.h);
                c0VarC.h = nVar2;
            }
        }
        if (c0VarC.g == null) {
            if (((HashMap) c0VarC.a).containsKey(ChronoField.INSTANT_SECONDS)) {
                Map map10 = c0VarC.a;
                chronoField2 = ChronoField.NANO_OF_SECOND;
                zContainsKey = ((HashMap) map10).containsKey(chronoField2);
                map = c0VarC.a;
                if (zContainsKey) {
                    long jLongValue3 = ((Long) ((HashMap) map).get(chronoField2)).longValue();
                    ((HashMap) c0VarC.a).put(ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue3 / 1000));
                    ((HashMap) c0VarC.a).put(ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue3 / j));
                } else {
                    ((HashMap) map).put(chronoField2, 0L);
                    ((HashMap) c0VarC.a).put(ChronoField.MICRO_OF_SECOND, 0L);
                    ((HashMap) c0VarC.a).put(ChronoField.MILLI_OF_SECOND, 0L);
                }
            } else if (((HashMap) c0VarC.a).containsKey(ChronoField.SECOND_OF_DAY)) {
                Map map11 = c0VarC.a;
                chronoField2 = ChronoField.NANO_OF_SECOND;
                zContainsKey = ((HashMap) map11).containsKey(chronoField2);
                map = c0VarC.a;
                if (zContainsKey) {
                    long jLongValue4 = ((Long) ((HashMap) map).get(chronoField2)).longValue();
                    ((HashMap) c0VarC.a).put(ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue4 / 1000));
                    ((HashMap) c0VarC.a).put(ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue4 / j));
                } else {
                    ((HashMap) map).put(chronoField2, 0L);
                    ((HashMap) c0VarC.a).put(ChronoField.MICRO_OF_SECOND, 0L);
                    ((HashMap) c0VarC.a).put(ChronoField.MILLI_OF_SECOND, 0L);
                }
            } else if (((HashMap) c0VarC.a).containsKey(ChronoField.SECOND_OF_MINUTE)) {
                Map map12 = c0VarC.a;
                chronoField2 = ChronoField.NANO_OF_SECOND;
                zContainsKey = ((HashMap) map12).containsKey(chronoField2);
                map = c0VarC.a;
                if (zContainsKey) {
                    long jLongValue5 = ((Long) ((HashMap) map).get(chronoField2)).longValue();
                    ((HashMap) c0VarC.a).put(ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue5 / 1000));
                    ((HashMap) c0VarC.a).put(ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue5 / j));
                } else {
                    ((HashMap) map).put(chronoField2, 0L);
                    ((HashMap) c0VarC.a).put(ChronoField.MICRO_OF_SECOND, 0L);
                    ((HashMap) c0VarC.a).put(ChronoField.MILLI_OF_SECOND, 0L);
                }
            }
        }
        if (c0VarC.f != null && c0VarC.g != null) {
            Long l5 = (Long) ((HashMap) c0VarC.a).get(ChronoField.OFFSET_SECONDS);
            if (l5 != null) {
                ((HashMap) c0VarC.a).put(ChronoField.INSTANT_SECONDS, Long.valueOf(c0VarC.f.D(c0VarC.g).z(ZoneOffset.ofTotalSeconds(l5.intValue())).M()));
                return c0VarC;
            }
            if (c0VarC.b != null) {
                ((HashMap) c0VarC.a).put(ChronoField.INSTANT_SECONDS, Long.valueOf(c0VarC.f.D(c0VarC.g).z(c0VarC.b).M()));
            }
        }
        return c0VarC;
    }

    public final d b() {
        d dVar = this.a;
        return !dVar.b ? dVar : new d(dVar.a, false);
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        d dVar = this.a;
        Objects.a(temporalAccessor, "temporal");
        try {
            dVar.j(new x(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new DateTimeException(e.getMessage(), e);
        }
    }

    public <T> T parse(CharSequence charSequence, TemporalQuery<T> temporalQuery) {
        String string;
        Objects.a(charSequence, "text");
        Objects.a(temporalQuery, "query");
        try {
            return (T) a(charSequence).E(temporalQuery);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException("Text '" + string + "' could not be parsed: " + e2.getMessage(), e2);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    public final String toString() {
        String string = this.a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
