package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends j0 implements i5 {
    public static final e0 c;
    public static final e0 d;

    static {
        z6 z6Var = z6.DOUBLE_VALUE;
        q qVar = new q(4);
        q qVar2 = new q(5);
        j$.util.a0 a0Var = j$.util.a0.c;
        c = new e0(true, z6Var, a0Var, qVar, qVar2);
        d = new e0(false, z6Var, a0Var, new q(4), new q(5));
    }

    @Override // j$.util.stream.j0, j$.util.stream.l5
    public final void accept(double d2) {
        t(Double.valueOf(d2));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.a0(((Double) this.b).doubleValue());
        }
        return null;
    }
}
