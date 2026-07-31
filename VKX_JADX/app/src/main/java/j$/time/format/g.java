package j$.time.format;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements e {
    @Override // j$.time.format.e
    public final boolean j(x xVar, StringBuilder sb) {
        Long lA = xVar.a(ChronoField.INSTANT_SECONDS);
        TemporalAccessor temporalAccessor = xVar.a;
        ChronoField chronoField = ChronoField.NANO_OF_SECOND;
        Long lValueOf = temporalAccessor.e(chronoField) ? Long.valueOf(temporalAccessor.C(chronoField)) : null;
        int i = 0;
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        int iA = chronoField.b.a(lValueOf != null ? lValueOf.longValue() : 0L, chronoField);
        if (jLongValue >= -62167219200L) {
            long j = jLongValue - 253402300800L;
            long jW = j$.com.android.tools.r8.a.W(j, 315569520000L) + 1;
            LocalDateTime localDateTimeQ = LocalDateTime.Q(j$.com.android.tools.r8.a.V(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jW > 0) {
                sb.append('+');
                sb.append(jW);
            }
            sb.append(localDateTimeQ);
            if (localDateTimeQ.b.c == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = jLongValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime localDateTimeQ2 = LocalDateTime.Q(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(localDateTimeQ2);
            if (localDateTimeQ2.b.c == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (localDateTimeQ2.a.getYear() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (iA > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (iA <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = iA / i2;
                sb.append((char) (i3 + 48));
                iA -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // j$.time.format.e
    public final int k(v vVar, CharSequence charSequence, int i) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.a(DateTimeFormatter.ISO_LOCAL_DATE);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral = dateTimeFormatterBuilder.appendLiteral('T');
        ChronoField chronoField = ChronoField.HOUR_OF_DAY;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral2 = dateTimeFormatterBuilderAppendLiteral.appendValue(chronoField, 2).appendLiteral(':');
        ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral3 = dateTimeFormatterBuilderAppendLiteral2.appendValue(chronoField2, 2).appendLiteral(':');
        ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue = dateTimeFormatterBuilderAppendLiteral3.appendValue(chronoField3, 2);
        ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
        int i2 = 1;
        dateTimeFormatterBuilderAppendValue.b(chronoField4, 0, 9, true);
        d dVarB = dateTimeFormatterBuilderAppendValue.appendLiteral('Z').toFormatter().b();
        v vVar2 = new v(vVar.a);
        vVar2.b = vVar.b;
        vVar2.c = vVar.c;
        int iK = dVarB.k(vVar2, charSequence, i);
        if (iK < 0) {
            return iK;
        }
        long jLongValue = vVar2.e(ChronoField.YEAR).longValue();
        int iIntValue = vVar2.e(ChronoField.MONTH_OF_YEAR).intValue();
        int iIntValue2 = vVar2.e(ChronoField.DAY_OF_MONTH).intValue();
        int iIntValue3 = vVar2.e(chronoField).intValue();
        int iIntValue4 = vVar2.e(chronoField2).intValue();
        Long lE = vVar2.e(chronoField3);
        Long lE2 = vVar2.e(chronoField4);
        int iIntValue5 = lE != null ? lE.intValue() : 0;
        int iIntValue6 = lE2 != null ? lE2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            iIntValue3 = 0;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            vVar.c().d = true;
            i2 = 0;
            iIntValue5 = 59;
        } else {
            i2 = 0;
        }
        int i3 = ((int) jLongValue) % ModuleDescriptor.MODULE_VERSION;
        try {
            LocalDateTime localDateTime = LocalDateTime.MIN;
            LocalDate localDateOf = LocalDate.of(i3, iIntValue, iIntValue2);
            LocalTime localTimeOf = LocalTime.of(iIntValue3, iIntValue4, iIntValue5, 0);
            return vVar.g(chronoField4, iIntValue6, i, vVar.g(ChronoField.INSTANT_SECONDS, j$.com.android.tools.r8.a.z(new LocalDateTime(localDateOf, localTimeOf).V(localDateOf.Y(i2), localTimeOf), ZoneOffset.UTC) + j$.com.android.tools.r8.a.X(jLongValue / 10000, 315569520000L), i, iK));
        } catch (RuntimeException unused) {
            return ~i;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
