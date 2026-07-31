package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.util.Objects;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    public byte a;
    public Object b;

    public o(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    public static Object a(byte b, ObjectInput objectInput) throws IOException {
        switch (b) {
            case 1:
                Duration duration = Duration.c;
                return Duration.ofSeconds(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.c;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.MIN;
                return LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return LocalTime.W(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.MIN;
                LocalDate localDate2 = LocalDate.MIN;
                return LocalDateTime.of(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.W(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.MIN;
                LocalDate localDate3 = LocalDate.MIN;
                LocalDateTime localDateTimeOf = LocalDateTime.of(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.W(objectInput));
                ZoneOffset zoneOffsetU = ZoneOffset.U(objectInput);
                ZoneId zoneId = (ZoneId) a(objectInput.readByte(), objectInput);
                Objects.a(localDateTimeOf, "localDateTime");
                Objects.a(zoneOffsetU, "offset");
                Objects.a(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || zoneOffsetU.equals(zoneId)) {
                    return new ZonedDateTime(localDateTimeOf, zoneId, zoneOffsetU);
                }
                d.c("ZoneId must match ZoneOffset");
                return null;
            case 7:
                int i = t.d;
                return ZoneId.O(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.U(objectInput);
            case 9:
                int i2 = m.c;
                return new m(LocalTime.W(objectInput), ZoneOffset.U(objectInput));
            case 10:
                int i3 = OffsetDateTime.c;
                LocalDate localDate4 = LocalDate.MIN;
                return new OffsetDateTime(LocalDateTime.of(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.W(objectInput)), ZoneOffset.U(objectInput));
            case 11:
                int i4 = q.b;
                return q.N(objectInput.readInt());
            case 12:
                DateTimeFormatter dateTimeFormatter = YearMonth.c;
                return YearMonth.of(objectInput.readInt(), objectInput.readByte());
            case 13:
                int i5 = k.c;
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                Month monthQ = Month.Q(b2);
                Objects.a(monthQ, "month");
                ChronoField.DAY_OF_MONTH.E(b3);
                if (b3 <= monthQ.P()) {
                    return new k(monthQ.getValue(), b3);
                }
                throw new DateTimeException("Illegal value for DayOfMonth field, value " + ((int) b3) + " is not valid for month " + monthQ.name());
            case 14:
                n nVar = n.d;
                return n.a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte b = objectInput.readByte();
        this.a = b;
        this.b = a(b, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.a);
                objectOutput.writeInt(duration.b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.a);
                objectOutput.writeInt(instant.b);
                return;
            case 3:
                LocalDate localDate = (LocalDate) obj;
                objectOutput.writeInt(localDate.a);
                objectOutput.writeByte(localDate.b);
                objectOutput.writeByte(localDate.c);
                return;
            case 4:
                ((LocalTime) obj).b0(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                LocalDate localDate2 = localDateTime.a;
                objectOutput.writeInt(localDate2.a);
                objectOutput.writeByte(localDate2.b);
                objectOutput.writeByte(localDate2.c);
                localDateTime.b.b0(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.a;
                LocalDate localDate3 = localDateTime2.a;
                objectOutput.writeInt(localDate3.a);
                objectOutput.writeByte(localDate3.b);
                objectOutput.writeByte(localDate3.c);
                localDateTime2.b.b0(objectOutput);
                zonedDateTime.b.V(objectOutput);
                zonedDateTime.c.R(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((t) obj).b);
                return;
            case 8:
                ((ZoneOffset) obj).V(objectOutput);
                return;
            case 9:
                m mVar = (m) obj;
                mVar.a.b0(objectOutput);
                mVar.b.V(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.a;
                LocalDate localDate4 = localDateTime3.a;
                objectOutput.writeInt(localDate4.a);
                objectOutput.writeByte(localDate4.b);
                objectOutput.writeByte(localDate4.c);
                localDateTime3.b.b0(objectOutput);
                offsetDateTime.b.V(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((q) obj).a);
                return;
            case 12:
                YearMonth yearMonth = (YearMonth) obj;
                objectOutput.writeInt(yearMonth.a);
                objectOutput.writeByte(yearMonth.b);
                return;
            case 13:
                k kVar = (k) obj;
                objectOutput.writeByte(kVar.a);
                objectOutput.writeByte(kVar.b);
                return;
            case 14:
                n nVar = (n) obj;
                objectOutput.writeInt(nVar.a);
                objectOutput.writeInt(nVar.b);
                objectOutput.writeInt(nVar.c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public o() {
    }
}
