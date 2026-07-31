package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public class a0 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap(16, 0.75f, 2);
    public static final y b = new y();
    public static final a0 c = new a0();

    public static Object a(TemporalField temporalField, Locale locale) {
        Object zVar;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(temporalField, locale);
        ConcurrentHashMap concurrentHashMap = a;
        V v = concurrentHashMap.get(simpleImmutableEntry);
        if (v != 0) {
            return v;
        }
        HashMap map = new HashMap();
        if (temporalField == ChronoField.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            for (int i = 0; i < eras.length; i++) {
                if (!eras[i].isEmpty()) {
                    long j = i;
                    map2.put(Long.valueOf(j), eras[i]);
                    Long lValueOf = Long.valueOf(j);
                    String str = eras[i];
                    map3.put(lValueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                }
            }
            if (!map2.isEmpty()) {
                map.put(TextStyle.FULL, map2);
                map.put(TextStyle.SHORT, map2);
                map.put(TextStyle.NARROW, map3);
            }
            zVar = new z(map);
        } else {
            long j2 = 1;
            if (temporalField == ChronoField.MONTH_OF_YEAR) {
                int length = DateFormatSymbols.getInstance(locale).getMonths().length;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (long j3 = 1; j3 <= length; j3++) {
                    String strF = j$.com.android.tools.r8.a.F(j3, "LLLL", locale);
                    linkedHashMap.put(Long.valueOf(j3), strF);
                    linkedHashMap2.put(Long.valueOf(j3), strF.substring(0, Character.charCount(strF.codePointAt(0))));
                    linkedHashMap3.put(Long.valueOf(j3), j$.com.android.tools.r8.a.F(j3, "LLL", locale));
                }
                if (length > 0) {
                    map.put(TextStyle.FULL_STANDALONE, linkedHashMap);
                    map.put(TextStyle.NARROW_STANDALONE, linkedHashMap2);
                    map.put(TextStyle.SHORT_STANDALONE, linkedHashMap3);
                    map.put(TextStyle.FULL, linkedHashMap);
                    map.put(TextStyle.NARROW, linkedHashMap2);
                    map.put(TextStyle.SHORT, linkedHashMap3);
                }
                zVar = new z(map);
            } else if (temporalField == ChronoField.DAY_OF_WEEK) {
                int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                boolean z = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
                long j4 = 1;
                while (j4 <= length2) {
                    String strE = j$.com.android.tools.r8.a.E(j4, "cccc", locale);
                    linkedHashMap4.put(Long.valueOf(j4), strE);
                    linkedHashMap5.put(Long.valueOf(j4), z ? new StringBuilder().appendCodePoint(strE.codePointBefore(strE.length())).toString() : strE.substring(0, Character.charCount(strE.codePointAt(0))));
                    linkedHashMap6.put(Long.valueOf(j4), j$.com.android.tools.r8.a.E(j4, "ccc", locale));
                    j4 += j2;
                    j2 = j2;
                }
                if (length2 > 0) {
                    map.put(TextStyle.FULL_STANDALONE, linkedHashMap4);
                    map.put(TextStyle.NARROW_STANDALONE, linkedHashMap5);
                    map.put(TextStyle.SHORT_STANDALONE, linkedHashMap6);
                    map.put(TextStyle.FULL, linkedHashMap4);
                    map.put(TextStyle.NARROW, linkedHashMap5);
                    map.put(TextStyle.SHORT, linkedHashMap6);
                }
                zVar = new z(map);
            } else if (temporalField == ChronoField.AMPM_OF_DAY) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                HashMap map4 = new HashMap();
                HashMap map5 = new HashMap();
                String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
                for (int i2 = 0; i2 < amPmStrings.length; i2++) {
                    if (!amPmStrings[i2].isEmpty()) {
                        long j5 = i2;
                        map4.put(Long.valueOf(j5), amPmStrings[i2]);
                        Long lValueOf2 = Long.valueOf(j5);
                        String str2 = amPmStrings[i2];
                        map5.put(lValueOf2, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                    }
                }
                if (!map4.isEmpty()) {
                    map.put(TextStyle.FULL, map4);
                    map.put(TextStyle.SHORT, map4);
                    map.put(TextStyle.NARROW, map5);
                }
                zVar = new z(map);
            } else {
                zVar = "";
            }
        }
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, zVar);
        return concurrentHashMap.get(simpleImmutableEntry);
    }

    public String b(j$.time.chrono.j jVar, TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        if (jVar == j$.time.chrono.q.c || !(temporalField instanceof ChronoField)) {
            return c(temporalField, j, textStyle, locale);
        }
        return null;
    }

    public String c(TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        Object objA = a(temporalField, locale);
        if (objA instanceof z) {
            return ((z) objA).a(j, textStyle);
        }
        return null;
    }

    public Iterator d(j$.time.chrono.j jVar, TemporalField temporalField, TextStyle textStyle, Locale locale) {
        if (jVar == j$.time.chrono.q.c || !(temporalField instanceof ChronoField)) {
            return e(temporalField, textStyle, locale);
        }
        return null;
    }

    public Iterator e(TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list;
        Object objA = a(temporalField, locale);
        if (!(objA instanceof z) || (list = (List) ((HashMap) ((z) objA).b).get(textStyle)) == null) {
            return null;
        }
        return list.iterator();
    }
}
