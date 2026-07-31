package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class LocalTime implements j$.time.temporal.l, j$.time.temporal.m, Comparable<LocalTime>, Serializable {
    public static final LocalTime MAX;
    public static final LocalTime MIN;
    public static final LocalTime e;
    public static final LocalTime[] f = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = f;
            if (i >= localTimeArr.length) {
                LocalTime localTime = localTimeArr[0];
                e = localTime;
                LocalTime localTime2 = localTimeArr[12];
                MIN = localTime;
                MAX = new LocalTime(23, 59, 59, 999999999);
                return;
            }
            localTimeArr[i] = new LocalTime(i, 0, 0, 0);
            i++;
        }
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    public static LocalTime N(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? f[i] : new LocalTime(i, i2, i3, i4);
    }

    public static LocalTime O(TemporalAccessor temporalAccessor) {
        Objects.a(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.E(j$.time.temporal.p.g);
        if (localTime != null) {
            return localTime;
        }
        d.g("Unable to obtain LocalTime from TemporalAccessor: ", temporalAccessor, " of type ", temporalAccessor.getClass().getName());
        return null;
    }

    public static LocalTime Q(long j) {
        ChronoField.NANO_OF_DAY.E(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return N(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    public static LocalTime W(DataInput dataInput) throws IOException {
        int i;
        int i2;
        int i3 = dataInput.readByte();
        int i4 = 0;
        if (i3 < 0) {
            i3 = ~i3;
            i2 = 0;
            i = 0;
        } else {
            byte b = dataInput.readByte();
            if (b < 0) {
                int i5 = ~b;
                i = 0;
                i4 = i5;
                i2 = 0;
            } else {
                byte b2 = dataInput.readByte();
                if (b2 < 0) {
                    i2 = ~b2;
                    i = 0;
                    i4 = b;
                } else {
                    i = dataInput.readInt();
                    i4 = b;
                    i2 = b2;
                }
            }
        }
        return of(i3, i4, i2, i);
    }

    public static LocalTime of(int i, int i2, int i3, int i4) {
        ChronoField.HOUR_OF_DAY.E(i);
        ChronoField.MINUTE_OF_HOUR.E(i2);
        ChronoField.SECOND_OF_MINUTE.E(i3);
        ChronoField.NANO_OF_SECOND.E(i4);
        return N(i, i2, i3, i4);
    }

    public static LocalTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f;
        Objects.a(dateTimeFormatter, "formatter");
        return (LocalTime) dateTimeFormatter.parse(charSequence, new f(2));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 4, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.y(this);
        }
        if (temporalField == ChronoField.NANO_OF_DAY) {
            return X();
        }
        return temporalField == ChronoField.MICRO_OF_DAY ? X() / 1000 : P(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object E(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.b || temporalQuery == j$.time.temporal.p.a || temporalQuery == j$.time.temporal.p.e || temporalQuery == j$.time.temporal.p.d) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.p.g) {
            return this;
        }
        if (temporalQuery == j$.time.temporal.p.f) {
            return null;
        }
        return temporalQuery == j$.time.temporal.p.c ? j$.time.temporal.a.NANOS : temporalQuery.queryFrom(this);
    }

    public final int P(TemporalField temporalField) {
        switch (h.a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                throw new j$.time.temporal.r("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.d / 1000;
            case 4:
                throw new j$.time.temporal.r("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.d / 1000000;
            case 6:
                return (int) (X() / 1000000);
            case 7:
                return this.c;
            case 8:
                return Y();
            case 9:
                return this.b;
            case 10:
                return (this.a * 60) + this.b;
            case 11:
                return this.a % 12;
            case 12:
                int i = this.a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.a;
            case 14:
                byte b = this.a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.a / 12;
            default:
                throw new j$.time.temporal.r(b.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final LocalTime d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (LocalTime) qVar.j(this, j);
        }
        switch (h.b[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return U(j);
            case 2:
                return U((j % 86400000000L) * 1000);
            case 3:
                return U((j % 86400000) * 1000000);
            case 4:
                return V(j);
            case 5:
                return T(j);
            case 6:
                return S(j);
            case 7:
                return S((j % 2) * 12);
            default:
                d.b(qVar, "Unsupported unit: ");
                return null;
        }
    }

    public final LocalTime S(long j) {
        return j == 0 ? this : N(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final LocalTime T(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return N(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final LocalTime U(long j) {
        if (j != 0) {
            long jX = X();
            long j2 = (((j % 86400000000000L) + jX) + 86400000000000L) % 86400000000000L;
            if (jX != j2) {
                return N((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    public final LocalTime V(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return N(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final long X() {
        return (((long) this.c) * 1000000000) + (((long) this.b) * 60000000000L) + (((long) this.a) * 3600000000000L) + ((long) this.d);
    }

    public final int Y() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final LocalTime c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalTime) temporalField.C(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.E(j);
        switch (h.a[chronoField.ordinal()]) {
            case 1:
                return a0((int) j);
            case 2:
                return Q(j);
            case 3:
                return a0(((int) j) * 1000);
            case 4:
                return Q(j * 1000);
            case 5:
                return a0(((int) j) * 1000000);
            case 6:
                return Q(j * 1000000);
            case 7:
                int i = (int) j;
                if (this.c != i) {
                    ChronoField.SECOND_OF_MINUTE.E(i);
                    return N(this.a, this.b, i, this.d);
                }
                return this;
            case 8:
                return V(j - ((long) Y()));
            case 9:
                int i2 = (int) j;
                if (this.b != i2) {
                    ChronoField.MINUTE_OF_HOUR.E(i2);
                    return N(this.a, i2, this.c, this.d);
                }
                return this;
            case 10:
                return T(j - ((long) ((this.a * 60) + this.b)));
            case 11:
                return S(j - ((long) (this.a % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return S(j - ((long) (this.a % 12)));
            case 13:
                int i3 = (int) j;
                if (this.a != i3) {
                    ChronoField.HOUR_OF_DAY.E(i3);
                    return N(i3, this.b, this.c, this.d);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i4 = (int) j;
                if (this.a != i4) {
                    ChronoField.HOUR_OF_DAY.E(i4);
                    return N(i4, this.b, this.c, this.d);
                }
                return this;
            case 15:
                return S((j - ((long) (this.a / 12))) * 12);
            default:
                throw new j$.time.temporal.r(b.a("Unsupported field: ", temporalField));
        }
    }

    public final LocalTime a0(int i) {
        if (this.d == i) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.E(i);
        return N(this.a, this.b, this.c, i);
    }

    public final void b0(DataOutput dataOutput) throws IOException {
        if (this.d != 0) {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(this.c);
            dataOutput.writeInt(this.d);
            return;
        }
        if (this.c != 0) {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(~this.c);
            return;
        }
        byte b = this.b;
        byte b2 = this.a;
        if (b == 0) {
            dataOutput.writeByte(~b2);
        } else {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(~this.b);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.a, localTime.a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.b, localTime.b)) == 0 && (iCompare = Integer.compare(this.c, localTime.c)) == 0) ? Integer.compare(this.d, localTime.d) : iCompare;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).N();
        }
        return temporalField != null && temporalField.j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.a == localTime.a && this.b == localTime.b && this.c == localTime.c && this.d == localTime.d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long jX = X();
        return (int) (jX ^ (jX >>> 32));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? P(temporalField) : j$.time.temporal.p.a(this, temporalField);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.l x(LocalDate localDate) {
        localDate.getClass();
        return (LocalTime) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        return j$.time.temporal.p.d(this, temporalField);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return lVar.c(X(), ChronoField.NANO_OF_DAY);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        byte b2 = this.b;
        byte b3 = this.c;
        int i = this.d;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l y(long j, j$.time.temporal.a aVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = d(Long.MAX_VALUE, aVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.d(j2, aVar);
    }
}
