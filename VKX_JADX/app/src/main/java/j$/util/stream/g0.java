package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends j0 implements j5 {
    public static final e0 c;
    public static final e0 d;

    static {
        z6 z6Var = z6.INT_VALUE;
        q qVar = new q(6);
        q qVar2 = new q(7);
        j$.util.b0 b0Var = j$.util.b0.c;
        c = new e0(true, z6Var, b0Var, qVar, qVar2);
        d = new e0(false, z6Var, b0Var, new q(6), new q(7));
    }

    @Override // j$.util.stream.j0, j$.util.stream.l5
    public final void accept(int i) {
        t(Integer.valueOf(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.b0(((Integer) this.b).intValue());
        }
        return null;
    }
}
