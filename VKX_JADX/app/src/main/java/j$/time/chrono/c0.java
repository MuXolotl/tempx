package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    public byte a;
    public Object b;

    public c0(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objA0;
        byte b = objectInput.readByte();
        this.a = b;
        switch (b) {
            case 1:
                ConcurrentHashMap concurrentHashMap = a.a;
                objA0 = j$.com.android.tools.r8.a.a0(objectInput.readUTF());
                break;
            case 2:
                objA0 = ((ChronoLocalDate) objectInput.readObject()).D((LocalTime) objectInput.readObject());
                break;
            case 3:
                objA0 = ((ChronoLocalDateTime) objectInput.readObject()).z((ZoneOffset) objectInput.readObject()).w((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = v.d;
                int i = objectInput.readInt();
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                t.c.getClass();
                objA0 = new v(LocalDate.of(i, b2, b3));
                break;
            case 5:
                w wVar = w.d;
                objA0 = w.m(objectInput.readByte());
                break;
            case 6:
                m mVar = (m) objectInput.readObject();
                int i2 = objectInput.readInt();
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                mVar.getClass();
                objA0 = new o(mVar, i2, b4, b5);
                break;
            case 7:
                int i3 = objectInput.readInt();
                byte b6 = objectInput.readByte();
                byte b7 = objectInput.readByte();
                y.c.getClass();
                objA0 = new a0(LocalDate.of(i3 + 1911, b6, b7));
                break;
            case 8:
                int i4 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                e0.c.getClass();
                objA0 = new g0(LocalDate.of(i4 - 543, b8, b9));
                break;
            case 9:
                int i5 = f.e;
                objA0 = new f(j$.com.android.tools.r8.a.a0(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = objA0;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((a) obj).i());
                return;
            case 2:
                e eVar = (e) obj;
                objectOutput.writeObject(eVar.a);
                objectOutput.writeObject(eVar.b);
                return;
            case 3:
                i iVar = (i) obj;
                objectOutput.writeObject(iVar.a);
                objectOutput.writeObject(iVar.b);
                objectOutput.writeObject(iVar.c);
                return;
            case 4:
                v vVar = (v) obj;
                vVar.getClass();
                objectOutput.writeInt(j$.time.temporal.p.a(vVar, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(vVar, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(vVar, ChronoField.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((w) obj).a);
                return;
            case 6:
                o oVar = (o) obj;
                objectOutput.writeObject(oVar.a);
                objectOutput.writeInt(j$.time.temporal.p.a(oVar, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(oVar, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(oVar, ChronoField.DAY_OF_MONTH));
                return;
            case 7:
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.p.a(a0Var, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(a0Var, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(a0Var, ChronoField.DAY_OF_MONTH));
                return;
            case 8:
                g0 g0Var = (g0) obj;
                g0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.p.a(g0Var, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(g0Var, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(g0Var, ChronoField.DAY_OF_MONTH));
                return;
            case 9:
                f fVar = (f) obj;
                objectOutput.writeUTF(fVar.a.i());
                objectOutput.writeInt(fVar.b);
                objectOutput.writeInt(fVar.c);
                objectOutput.writeInt(fVar.d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public c0() {
    }
}
