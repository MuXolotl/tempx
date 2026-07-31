package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends j0 {
    public static final e0 c;
    public static final e0 d;

    static {
        z6 z6Var = z6.REFERENCE;
        q qVar = new q(10);
        q qVar2 = new q(11);
        j$.util.z zVar = j$.util.z.b;
        c = new e0(true, z6Var, zVar, qVar, qVar2);
        d = new e0(false, z6Var, zVar, new q(10), new q(11));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.z(this.b);
        }
        return null;
    }
}
