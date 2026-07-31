package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class z6 {
    public static final z6 DOUBLE_VALUE;
    public static final z6 INT_VALUE;
    public static final z6 LONG_VALUE;
    public static final z6 REFERENCE;
    public static final /* synthetic */ z6[] a;

    static {
        z6 z6Var = new z6("REFERENCE", 0);
        REFERENCE = z6Var;
        z6 z6Var2 = new z6("INT_VALUE", 1);
        INT_VALUE = z6Var2;
        z6 z6Var3 = new z6("LONG_VALUE", 2);
        LONG_VALUE = z6Var3;
        z6 z6Var4 = new z6("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = z6Var4;
        a = new z6[]{z6Var, z6Var2, z6Var3, z6Var4};
    }

    public static z6 valueOf(String str) {
        return (z6) Enum.valueOf(z6.class, str);
    }

    public static z6[] values() {
        return (z6[]) a.clone();
    }
}
