package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, j$.time.temporal.m, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;
    public final int b;
    public final transient String c;
    public static final ConcurrentHashMap d = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ConcurrentHashMap e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = ofTotalSeconds(0);
    public static final ZoneOffset f = ofTotalSeconds(-64800);
    public static final ZoneOffset g = ofTotalSeconds(64800);

    public ZoneOffset(int i) {
        String string;
        this.b = i;
        if (i == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i);
            StringBuilder sb = new StringBuilder();
            int i2 = iAbs / 3600;
            int i3 = (iAbs / 60) % 60;
            sb.append(i < 0 ? "-" : "+");
            sb.append(i2 < 10 ? "0" : "");
            sb.append(i2);
            sb.append(i3 < 10 ? ":0" : ":");
            sb.append(i3);
            int i4 = iAbs % 60;
            if (i4 != 0) {
                sb.append(i4 < 10 ? ":0" : ":");
                sb.append(i4);
            }
            string = sb.toString();
        }
        this.c = string;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset S(String str) {
        int iT;
        int iT2;
        int iT3;
        char cCharAt;
        Objects.a(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) e.get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length != 2) {
            if (length != 3) {
                if (length == 5) {
                    iT = T(str, 1, false);
                    iT2 = T(str, 3, false);
                } else if (length == 6) {
                    iT = T(str, 1, false);
                    iT2 = T(str, 4, true);
                } else if (length == 7) {
                    iT = T(str, 1, false);
                    iT2 = T(str, 3, false);
                    iT3 = T(str, 5, false);
                } else {
                    if (length != 9) {
                        d.k("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                        return null;
                    }
                    iT = T(str, 1, false);
                    iT2 = T(str, 4, true);
                    iT3 = T(str, 7, true);
                }
                iT3 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt != '+' || cCharAt == '-') {
                return cCharAt == '-' ? ofHoursMinutesSeconds(-iT, -iT2, -iT3) : ofHoursMinutesSeconds(iT, iT2, iT3);
            }
            d.k("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
            return null;
        }
        str = str.charAt(0) + "0" + str.charAt(1);
        iT = T(str, 1, false);
        iT2 = 0;
        iT3 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt != '+') {
        }
        if (cCharAt == '-') {
        }
    }

    public static int T(CharSequence charSequence, int i, boolean z) {
        if (z) {
            String str = (String) charSequence;
            if (str.charAt(i - 1) != ':') {
                d.j(str, "Invalid ID for ZoneOffset, colon not found when expected: ");
                return 0;
            }
        }
        String str2 = (String) charSequence;
        char cCharAt = str2.charAt(i);
        char cCharAt2 = str2.charAt(i + 1);
        if (cCharAt < '0' || cCharAt > '9' || cCharAt2 < '0' || cCharAt2 > '9') {
            d.j(str2, "Invalid ID for ZoneOffset, non numeric characters found: ");
            return 0;
        }
        return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
    }

    public static ZoneOffset U(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? ofTotalSeconds(dataInput.readInt()) : ofTotalSeconds(b * 900);
    }

    public static ZoneOffset from(TemporalAccessor temporalAccessor) {
        Objects.a(temporalAccessor, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporalAccessor.E(j$.time.temporal.p.d);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        d.g("Unable to obtain ZoneOffset from TemporalAccessor: ", temporalAccessor, " of type ", temporalAccessor.getClass().getName());
        return null;
    }

    public static ZoneOffset ofHoursMinutesSeconds(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            d.e("Zone offset hours not in valid range: value ", i, " is not in the range -18 to 18");
            return null;
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                d.k("Zone offset minutes and seconds must be positive because hours is positive");
                return null;
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                d.k("Zone offset minutes and seconds must be negative because hours is negative");
                return null;
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            d.k("Zone offset minutes and seconds must have the same sign");
            return null;
        }
        if (i2 < -59 || i2 > 59) {
            d.e("Zone offset minutes not in valid range: value ", i2, " is not in the range -59 to 59");
            return null;
        }
        if (i3 < -59 || i3 > 59) {
            d.e("Zone offset seconds not in valid range: value ", i3, " is not in the range -59 to 59");
            return null;
        }
        if (Math.abs(i) != 18 || (i2 | i3) == 0) {
            return ofTotalSeconds((i2 * 60) + (i * 3600) + i3);
        }
        d.k("Zone offset not in valid range: -18:00 to +18:00");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset ofTotalSeconds(int i) {
        if (i < -64800 || i > 64800) {
            d.k("Zone offset not in valid range: -18:00 to +18:00");
            return null;
        }
        if (i % 900 != 0) {
            return new ZoneOffset(i);
        }
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = d;
        ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(numValueOf);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        concurrentHashMap.putIfAbsent(numValueOf, new ZoneOffset(i));
        ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(numValueOf);
        e.putIfAbsent(zoneOffset2.c, zoneOffset2);
        return zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 8, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(TemporalField temporalField) {
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return this.b;
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.r(b.a("Unsupported field: ", temporalField));
        }
        return temporalField.y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object E(TemporalQuery temporalQuery) {
        return (temporalQuery == j$.time.temporal.p.d || temporalQuery == j$.time.temporal.p.e) ? this : j$.time.temporal.p.c(this, temporalQuery);
    }

    @Override // j$.time.ZoneId
    public final void R(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        V(dataOutput);
    }

    public final void V(DataOutput dataOutput) throws IOException {
        int i = this.b;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.b - this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.OFFSET_SECONDS;
        }
        return temporalField != null && temporalField.j(this);
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.b == ((ZoneOffset) obj).b;
    }

    @Override // j$.time.ZoneId
    public final ZoneRules getRules() {
        return new ZoneRules(this);
    }

    public int getTotalSeconds() {
        return this.b;
    }

    @Override // j$.time.ZoneId
    public int hashCode() {
        return this.b;
    }

    @Override // j$.time.ZoneId
    public final String i() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(TemporalField temporalField) {
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return this.b;
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.r(b.a("Unsupported field: ", temporalField));
        }
        return j$.time.temporal.p.d(this, temporalField).a(C(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        return j$.time.temporal.p.d(this, temporalField);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return lVar.c(this.b, ChronoField.OFFSET_SECONDS);
    }

    @Override // j$.time.ZoneId
    public String toString() {
        return this.c;
    }
}
