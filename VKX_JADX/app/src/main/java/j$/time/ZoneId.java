package j$.time;

import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.TextStyle;
import j$.time.format.d0;
import j$.time.temporal.TemporalAccessor;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ZoneId implements Serializable {
    public static final Map a;
    private static final long serialVersionUID = 8352817235686L;

    static {
        Map.Entry[] entryArr = {j$.com.android.tools.r8.a.T("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.T("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.T("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.T("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.T("AST", "America/Anchorage"), j$.com.android.tools.r8.a.T("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.T("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.T("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.T("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.T("CST", "America/Chicago"), j$.com.android.tools.r8.a.T("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.T("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.T("ECT", "Europe/Paris"), j$.com.android.tools.r8.a.T("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.T("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.T("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.T("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.T("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.T("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.T("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.T("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.T("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.T("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.T("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.T("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.T("EST", "-05:00"), j$.com.android.tools.r8.a.T("MST", "-07:00"), j$.com.android.tools.r8.a.T("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object objRequireNonNull = Objects.requireNonNull(entry.getKey());
            if (map.put(objRequireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + objRequireNonNull);
            }
        }
        a = Collections.unmodifiableMap(map);
    }

    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != t.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static ZoneId N(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.E(j$.time.temporal.p.e);
        if (zoneId != null) {
            return zoneId;
        }
        d.g("Unable to obtain ZoneId from TemporalAccessor: ", temporalAccessor, " of type ", temporalAccessor.getClass().getName());
        return null;
    }

    public static ZoneId O(String str, boolean z) {
        Objects.a(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.S(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return Q(str, 3, z);
        }
        return str.startsWith("UT") ? Q(str, 2, z) : t.S(str, z);
    }

    public static ZoneId P(String str, ZoneOffset zoneOffset) {
        Objects.a(str, "prefix");
        Objects.a(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            d.c("prefix should be GMT, UTC or UT, is: ".concat(str));
            return null;
        }
        if (zoneOffset.getTotalSeconds() != 0) {
            str = str.concat(zoneOffset.c);
        }
        return new t(str, new ZoneRules(zoneOffset));
    }

    public static ZoneId Q(String str, int i, boolean z) {
        String strSubstring = str.substring(0, i);
        if (str.length() == i) {
            return P(strSubstring, ZoneOffset.UTC);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return t.S(str, z);
        }
        try {
            ZoneOffset zoneOffsetS = ZoneOffset.S(str.substring(i));
            return zoneOffsetS == ZoneOffset.UTC ? P(strSubstring, zoneOffsetS) : P(strSubstring, zoneOffsetS);
        } catch (DateTimeException e) {
            throw new DateTimeException("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    public static ZoneId of(String str) {
        return O(str, true);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static ZoneId systemDefault() {
        String id = TimeZone.getDefault().getID();
        Map map = a;
        Objects.a(id, "zoneId");
        Objects.a(map, "aliasMap");
        String str = (String) map.get(id);
        if (str != null) {
            id = str;
        }
        return of(id);
    }

    private Object writeReplace() {
        return new o((byte) 7, this);
    }

    public abstract void R(DataOutput dataOutput);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return i().equals(((ZoneId) obj).i());
        }
        return false;
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.c(new j$.time.format.u(textStyle, false));
        return dateTimeFormatterBuilder.m(locale, d0.SMART, null).format(new s(0, this));
    }

    public abstract ZoneRules getRules();

    public int hashCode() {
        return i().hashCode();
    }

    public abstract String i();

    public ZoneId normalized() {
        try {
            ZoneRules rules = getRules();
            return rules.isFixedOffset() ? rules.d(Instant.c) : this;
        } catch (j$.time.zone.f unused) {
            return this;
        }
    }

    public String toString() {
        return i();
    }
}
