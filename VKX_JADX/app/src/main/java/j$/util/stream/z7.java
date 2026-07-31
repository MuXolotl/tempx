package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class z7 {
    public static final z7 MAYBE_MORE;
    public static final z7 NO_MORE;
    public static final z7 UNLIMITED;
    public static final /* synthetic */ z7[] a;

    static {
        z7 z7Var = new z7("NO_MORE", 0);
        NO_MORE = z7Var;
        z7 z7Var2 = new z7("MAYBE_MORE", 1);
        MAYBE_MORE = z7Var2;
        z7 z7Var3 = new z7("UNLIMITED", 2);
        UNLIMITED = z7Var3;
        a = new z7[]{z7Var, z7Var2, z7Var3};
    }

    public static z7 valueOf(String str) {
        return (z7) Enum.valueOf(z7.class, str);
    }

    public static z7[] values() {
        return (z7[]) a.clone();
    }
}
