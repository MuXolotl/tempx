package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class v {
    public final DateTimeFormatter a;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList d;
    public ArrayList e;

    public v(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = null;
        this.a = dateTimeFormatter;
        arrayList.add(new c0());
    }

    public static boolean b(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    public final boolean a(char c, char c2) {
        if (this.b) {
            return c == c2;
        }
        return b(c, c2);
    }

    public final c0 c() {
        ArrayList arrayList = this.d;
        return (c0) arrayList.get(arrayList.size() - 1);
    }

    public final j$.time.chrono.j d() {
        j$.time.chrono.j jVar = c().c;
        if (jVar != null) {
            return jVar;
        }
        j$.time.chrono.j jVar2 = this.a.e;
        return jVar2 == null ? j$.time.chrono.q.c : jVar2;
    }

    public final Long e(ChronoField chronoField) {
        return (Long) ((HashMap) c().a).get(chronoField);
    }

    public final void f(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        c().b = zoneId;
    }

    public final int g(TemporalField temporalField, long j, int i, int i2) {
        Objects.a(temporalField, "field");
        Long l = (Long) ((HashMap) c().a).put(temporalField, Long.valueOf(j));
        return (l == null || l.longValue() == j) ? i2 : ~i;
    }

    public final boolean h(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 <= charSequence.length() && i2 + i3 <= charSequence2.length()) {
            if (this.b) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (charSequence.charAt(i + i4) == charSequence2.charAt(i2 + i4)) {
                    }
                }
                return true;
            }
            for (int i5 = 0; i5 < i3; i5++) {
                char cCharAt = charSequence.charAt(i + i5);
                char cCharAt2 = charSequence2.charAt(i2 + i5);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        return c().toString();
    }
}
