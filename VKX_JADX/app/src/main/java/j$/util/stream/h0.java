package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends j0 implements k5 {
    public static final e0 c;
    public static final e0 d;

    static {
        z6 z6Var = z6.LONG_VALUE;
        q qVar = new q(8);
        q qVar2 = new q(9);
        j$.util.c0 c0Var = j$.util.c0.c;
        c = new e0(true, z6Var, c0Var, qVar, qVar2);
        d = new e0(false, z6Var, c0Var, new q(8), new q(9));
    }

    @Override // j$.util.stream.j0, j$.util.stream.l5
    public final void accept(long j) {
        t(Long.valueOf(j));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.c0(((Long) this.b).longValue());
        }
        return null;
    }
}
