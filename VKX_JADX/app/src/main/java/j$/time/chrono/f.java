package j$.time.chrono;

import j$.time.temporal.ChronoField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements j$.time.temporal.o, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    public final j a;
    public final int b;
    public final int c;
    public final int d;

    static {
        j$.com.android.tools.r8.a.S(new Object[]{j$.time.temporal.a.YEARS, j$.time.temporal.a.MONTHS, j$.time.temporal.a.DAYS});
    }

    public f(j jVar, int i, int i2, int i3) {
        this.a = jVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.b == fVar.b && this.c == fVar.c && this.d == fVar.d && this.a.equals(fVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.l j(j$.time.temporal.l lVar) {
        j jVar = (j) lVar.E(j$.time.temporal.p.b);
        if (jVar != null && !this.a.equals(jVar)) {
            j$.time.d.g("Chronology mismatch, expected: ", this.a.i(), ", actual: ", jVar.i());
            return null;
        }
        if (this.c == 0) {
            int i = this.b;
            if (i != 0) {
                lVar = lVar.d(i, j$.time.temporal.a.YEARS);
            }
        } else {
            j$.time.temporal.s sVarR = this.a.r(ChronoField.MONTH_OF_YEAR);
            long j = (sVarR.a == sVarR.b && sVarR.c == sVarR.d && sVarR.d()) ? (sVarR.d - sVarR.a) + 1 : -1L;
            int i2 = this.b;
            if (j > 0) {
                lVar = lVar.d((((long) i2) * j) + ((long) this.c), j$.time.temporal.a.MONTHS);
            } else {
                if (i2 != 0) {
                    lVar = lVar.d(i2, j$.time.temporal.a.YEARS);
                }
                lVar = lVar.d(this.c, j$.time.temporal.a.MONTHS);
            }
        }
        int i3 = this.d;
        return i3 != 0 ? lVar.d(i3, j$.time.temporal.a.DAYS) : lVar;
    }

    public final String toString() {
        if (this.b == 0 && this.c == 0 && this.d == 0) {
            return this.a.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.toString());
        sb.append(" P");
        int i = this.b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    public Object writeReplace() {
        return new c0((byte) 9, this);
    }
}
