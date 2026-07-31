package j$.util.stream;

import java.util.function.DoublePredicate;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class o8 extends e5 implements q8 {
    public o8(d6 d6Var, l5 l5Var, boolean z) {
        super(l5Var);
    }

    @Override // j$.util.stream.i5, j$.util.stream.l5
    public final void accept(double d) {
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d);
        throw null;
    }

    @Override // j$.util.stream.q8
    public final long n() {
        return 0L;
    }
}
