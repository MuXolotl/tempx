package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements e {
    public final TemporalField a;
    public final TextStyle b;
    public final a0 c;
    public volatile j d;

    public r(TemporalField temporalField, TextStyle textStyle, a0 a0Var) {
        this.a = temporalField;
        this.b = textStyle;
        this.c = a0Var;
    }

    @Override // j$.time.format.e
    public final boolean j(x xVar, StringBuilder sb) {
        Long lA = xVar.a(this.a);
        DateTimeFormatter dateTimeFormatter = xVar.b;
        if (lA == null) {
            return false;
        }
        j$.time.chrono.j jVar = (j$.time.chrono.j) xVar.a.E(j$.time.temporal.p.b);
        String strC = (jVar == null || jVar == j$.time.chrono.q.c) ? this.c.c(this.a, lA.longValue(), this.b, dateTimeFormatter.b) : this.c.b(jVar, this.a, lA.longValue(), this.b, dateTimeFormatter.b);
        if (strC != null) {
            sb.append(strC);
            return true;
        }
        if (this.d == null) {
            this.d = new j(this.a, 1, 19, SignStyle.NORMAL);
        }
        return this.d.j(xVar, sb);
    }

    @Override // j$.time.format.e
    public final int k(v vVar, CharSequence charSequence, int i) {
        a0 a0Var = this.c;
        TemporalField temporalField = this.a;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        boolean z = vVar.c;
        DateTimeFormatter dateTimeFormatter = vVar.a;
        TextStyle textStyle = z ? this.b : null;
        j$.time.chrono.j jVarD = vVar.d();
        Iterator itE = (jVarD == null || jVarD == j$.time.chrono.q.c) ? a0Var.e(temporalField, textStyle, dateTimeFormatter.b) : a0Var.d(jVarD, temporalField, textStyle, dateTimeFormatter.b);
        if (itE != null) {
            while (itE.hasNext()) {
                Map.Entry entry = (Map.Entry) itE.next();
                String str = (String) entry.getKey();
                if (vVar.h(str, 0, charSequence, i, str.length())) {
                    return vVar.g(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                }
            }
            if (temporalField == ChronoField.ERA && !vVar.c) {
                for (j$.time.chrono.k kVar : jVarD.t()) {
                    String string = kVar.toString();
                    if (vVar.h(string, 0, charSequence, i, string.length())) {
                        return vVar.g(this.a, kVar.getValue(), i, string.length() + i);
                    }
                }
            }
            if (vVar.c) {
                return ~i;
            }
        }
        if (this.d == null) {
            this.d = new j(this.a, 1, 19, SignStyle.NORMAL);
        }
        return this.d.k(vVar, charSequence, i);
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        TextStyle textStyle2 = this.b;
        TemporalField temporalField = this.a;
        if (textStyle2 == textStyle) {
            return "Text(" + temporalField + ")";
        }
        return "Text(" + temporalField + "," + textStyle2 + ")";
    }
}
