package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeFormatterBuilder {
    public static final j$.time.f h = new j$.time.f(5);
    public static final Map i;
    public DateTimeFormatterBuilder a;
    public final DateTimeFormatterBuilder b;
    public final List c;
    public final boolean d;
    public int e;
    public char f;
    public int g;

    static {
        HashMap map = new HashMap();
        i = map;
        map.put('G', ChronoField.ERA);
        map.put('y', ChronoField.YEAR_OF_ERA);
        map.put('u', ChronoField.YEAR);
        j$.time.temporal.g gVar = j$.time.temporal.i.a;
        map.put('Q', gVar);
        map.put('q', gVar);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        map.put('M', chronoField);
        map.put('L', chronoField);
        map.put('D', ChronoField.DAY_OF_YEAR);
        map.put('d', ChronoField.DAY_OF_MONTH);
        map.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        map.put('E', chronoField2);
        map.put('c', chronoField2);
        map.put('e', chronoField2);
        map.put('a', ChronoField.AMPM_OF_DAY);
        map.put('H', ChronoField.HOUR_OF_DAY);
        map.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        map.put('K', ChronoField.HOUR_OF_AMPM);
        map.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        map.put('m', ChronoField.MINUTE_OF_HOUR);
        map.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        map.put('S', chronoField3);
        map.put('A', ChronoField.MILLI_OF_DAY);
        map.put('n', chronoField3);
        map.put('N', ChronoField.NANO_OF_DAY);
        map.put('g', j$.time.temporal.k.a);
    }

    public DateTimeFormatterBuilder() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        c(dateTimeFormatter.b());
    }

    public DateTimeFormatterBuilder appendLiteral(char c) {
        c(new c(c));
        return this;
    }

    public DateTimeFormatterBuilder appendOffset(String str, String str2) {
        c(new k(str, str2));
        return this;
    }

    public DateTimeFormatterBuilder appendOffsetId() {
        c(k.e);
        return this;
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i2, int i3, SignStyle signStyle) {
        if (i2 == i3 && signStyle == SignStyle.NOT_NEGATIVE) {
            return appendValue(temporalField, i3);
        }
        Objects.a(temporalField, "field");
        Objects.a(signStyle, "signStyle");
        if (i2 < 1 || i2 > 19) {
            j$.time.d.m("The minimum width must be from 1 to 19 inclusive but was ", i2);
            return null;
        }
        if (i3 < 1 || i3 > 19) {
            j$.time.d.m("The maximum width must be from 1 to 19 inclusive but was ", i3);
            return null;
        }
        if (i3 >= i2) {
            h(new j(temporalField, i2, i3, signStyle));
            return this;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    public final void b(ChronoField chronoField, int i2, int i3, boolean z) {
        if (i2 != i3 || z) {
            c(new f(chronoField, i2, i3, z));
        } else {
            h(new f(chronoField, i2, i3, z));
        }
    }

    public final int c(e eVar) {
        Objects.a(eVar, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.e;
        if (i2 > 0) {
            l lVar = new l(eVar, i2, dateTimeFormatterBuilder.f);
            dateTimeFormatterBuilder.e = 0;
            dateTimeFormatterBuilder.f = (char) 0;
            eVar = lVar;
        }
        ((ArrayList) dateTimeFormatterBuilder.c).add(eVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
        dateTimeFormatterBuilder2.g = -1;
        return ((ArrayList) dateTimeFormatterBuilder2.c).size() - 1;
    }

    public final void d(String str) {
        Objects.a(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        int i2 = 1;
        if (str.length() == 1) {
            c(new c(str.charAt(0)));
        } else {
            c(new h(i2, str));
        }
    }

    public final void e(TextStyle textStyle) {
        Objects.a(textStyle, "style");
        if (textStyle == TextStyle.FULL || textStyle == TextStyle.SHORT) {
            c(new h(0, textStyle));
        } else {
            j$.time.d.c("Style must be either full or short");
        }
    }

    public final void f(ChronoField chronoField, Map map) {
        Objects.a(chronoField, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        c(new r(chronoField, textStyle, new a(new z(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    public final void g(TemporalField temporalField, TextStyle textStyle) {
        Objects.a(textStyle, "textStyle");
        c(new r(temporalField, textStyle, a0.c));
    }

    public final void h(j jVar) {
        j jVarD;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.g;
        if (i2 < 0) {
            dateTimeFormatterBuilder.g = c(jVar);
            return;
        }
        j jVar2 = (j) ((ArrayList) dateTimeFormatterBuilder.c).get(i2);
        int i3 = jVar.b;
        int i4 = jVar.c;
        if (i3 == i4 && jVar.d == SignStyle.NOT_NEGATIVE) {
            jVarD = jVar2.e(i4);
            c(jVar.d());
            this.a.g = i2;
        } else {
            jVarD = jVar2.d();
            this.a.g = c(jVar);
        }
        ((ArrayList) this.a.c).set(i2, jVarD);
    }

    public final void i(TemporalField temporalField) {
        h(new j(temporalField, 1, 19, SignStyle.NORMAL));
    }

    public final void j() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        if (dateTimeFormatterBuilder.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        int size = ((ArrayList) dateTimeFormatterBuilder.c).size();
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
        if (size <= 0) {
            this.a = dateTimeFormatterBuilder2.b;
            return;
        }
        d dVar = new d(dateTimeFormatterBuilder2.c, dateTimeFormatterBuilder2.d);
        this.a = this.a.b;
        c(dVar);
    }

    public final void k() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        dateTimeFormatterBuilder.g = -1;
        this.a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
    }

    public final DateTimeFormatter l(d0 d0Var, j$.time.chrono.j jVar) {
        return m(Locale.getDefault(), d0Var, jVar);
    }

    public final DateTimeFormatter m(Locale locale, d0 d0Var, j$.time.chrono.j jVar) {
        Objects.a(locale, "locale");
        while (this.a.b != null) {
            j();
        }
        d dVar = new d(this.c, false);
        b0 b0Var = b0.a;
        return new DateTimeFormatter(dVar, locale, d0Var, jVar);
    }

    public DateTimeFormatterBuilder parseCaseInsensitive() {
        c(q.INSENSITIVE);
        return this;
    }

    public DateTimeFormatter toFormatter() {
        return m(Locale.getDefault(), d0.SMART, null);
    }

    public DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = dateTimeFormatterBuilder;
        this.d = true;
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i2) {
        Objects.a(temporalField, "field");
        if (i2 >= 1 && i2 <= 19) {
            h(new j(temporalField, i2, i2, SignStyle.NOT_NEGATIVE));
            return this;
        }
        j$.time.d.m("The width must be from 1 to 19 inclusive but was ", i2);
        return null;
    }
}
