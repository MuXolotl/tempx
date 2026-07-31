package j$.util.stream;

import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class y6 {
    public static final y6 DISTINCT;
    public static final y6 ORDERED;
    public static final y6 SHORT_CIRCUIT;
    public static final y6 SIZED;
    public static final y6 SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final /* synthetic */ y6[] v;
    public final Map a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        x6 x6Var = x6.SPLITERATOR;
        j$.time.s sVarY = y(x6Var);
        x6 x6Var2 = x6.STREAM;
        sVarY.u(x6Var2);
        x6 x6Var3 = x6.OP;
        ((EnumMap) ((Map) sVarY.b)).put(x6Var3, 3);
        y6 y6Var = new y6("DISTINCT", 0, 0, sVarY);
        DISTINCT = y6Var;
        j$.time.s sVarY2 = y(x6Var);
        sVarY2.u(x6Var2);
        ((EnumMap) ((Map) sVarY2.b)).put(x6Var3, 3);
        y6 y6Var2 = new y6("SORTED", 1, 1, sVarY2);
        SORTED = y6Var2;
        j$.time.s sVarY3 = y(x6Var);
        sVarY3.u(x6Var2);
        ((EnumMap) ((Map) sVarY3.b)).put(x6Var3, 3);
        x6 x6Var4 = x6.TERMINAL_OP;
        ((EnumMap) ((Map) sVarY3.b)).put(x6Var4, 2);
        x6 x6Var5 = x6.UPSTREAM_TERMINAL_OP;
        ((EnumMap) ((Map) sVarY3.b)).put(x6Var5, 2);
        y6 y6Var3 = new y6("ORDERED", 2, 2, sVarY3);
        ORDERED = y6Var3;
        j$.time.s sVarY4 = y(x6Var);
        sVarY4.u(x6Var2);
        ((EnumMap) ((Map) sVarY4.b)).put(x6Var3, 2);
        y6 y6Var4 = new y6("SIZED", 3, 3, sVarY4);
        SIZED = y6Var4;
        j$.time.s sVarY5 = y(x6Var3);
        sVarY5.u(x6Var4);
        int i2 = 0;
        y6 y6Var5 = new y6("SHORT_CIRCUIT", 4, 12, sVarY5);
        SHORT_CIRCUIT = y6Var5;
        v = new y6[]{y6Var, y6Var2, y6Var3, y6Var4, y6Var5};
        f = k(x6Var);
        g = k(x6Var2);
        h = k(x6Var3);
        k(x6Var4);
        k(x6Var5);
        for (y6 y6Var6 : values()) {
            i2 |= y6Var6.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        y6 y6Var7 = DISTINCT;
        m = y6Var7.c;
        n = y6Var7.d;
        y6 y6Var8 = SORTED;
        o = y6Var8.c;
        p = y6Var8.d;
        y6 y6Var9 = ORDERED;
        q = y6Var9.c;
        r = y6Var9.d;
        y6 y6Var10 = SIZED;
        s = y6Var10.c;
        t = y6Var10.d;
        u = SHORT_CIRCUIT.c;
    }

    public y6(String str, int i2, int i3, j$.time.s sVar) {
        super(str, i2);
        for (x6 x6Var : x6.values()) {
            j$.util.Map.EL.b((Map) sVar.b, x6Var, 0);
        }
        this.a = (Map) sVar.b;
        int i4 = i3 * 2;
        this.b = i4;
        this.c = 1 << i4;
        this.d = 2 << i4;
        this.e = 3 << i4;
    }

    public static int j(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? i : ~(((j & i2) << 1) | i2 | ((k & i2) >> 1))));
    }

    public static int k(x6 x6Var) {
        int iIntValue = 0;
        for (y6 y6Var : values()) {
            iIntValue |= ((Integer) y6Var.a.get(x6Var)).intValue() << y6Var.b;
        }
        return iIntValue;
    }

    public static int l(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i2 = iCharacteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i3 : iCharacteristics & i3 & (-5);
    }

    public static y6 valueOf(String str) {
        return (y6) Enum.valueOf(y6.class, str);
    }

    public static y6[] values() {
        return (y6[]) v.clone();
    }

    public static j$.time.s y(x6 x6Var) {
        j$.time.s sVar = new j$.time.s(10, new EnumMap(x6.class));
        sVar.u(x6Var);
        return sVar;
    }

    public final boolean o(int i2) {
        return (i2 & this.e) == this.c;
    }
}
