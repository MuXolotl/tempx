package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements j$.time.temporal.o, Serializable {
    public static final n d = new n(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    public final int a;
    public final int b;
    public final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.com.android.tools.r8.a.S(new Object[]{j$.time.temporal.a.YEARS, j$.time.temporal.a.MONTHS, j$.time.temporal.a.DAYS});
    }

    public n(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static n a(int i, int i2, int i3) {
        return ((i | i2) | i3) == 0 ? d : new n(i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 14, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.a == nVar.a && this.b == nVar.b && this.c == nVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.l j(j$.time.temporal.l lVar) {
        j$.time.chrono.j jVar = (j$.time.chrono.j) lVar.E(j$.time.temporal.p.b);
        if (jVar != null && !j$.time.chrono.q.c.equals(jVar)) {
            throw new DateTimeException("Chronology mismatch, expected: ISO, actual: " + jVar.i());
        }
        int i = this.b;
        int i2 = this.a;
        if (i != 0) {
            long j = (((long) i2) * 12) + ((long) i);
            if (j != 0) {
                lVar = lVar.d(j, j$.time.temporal.a.MONTHS);
            }
        } else if (i2 != 0) {
            lVar = lVar.d(i2, j$.time.temporal.a.YEARS);
        }
        int i3 = this.c;
        return i3 != 0 ? lVar.d(i3, j$.time.temporal.a.DAYS) : lVar;
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
