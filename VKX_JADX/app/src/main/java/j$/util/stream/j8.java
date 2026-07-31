package j$.util.stream;

import java.util.function.IntPredicate;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class j8 extends f5 {
    public final boolean b;

    public j8(e6 e6Var, l5 l5Var) {
        super(l5Var);
        this.b = true;
    }

    @Override // j$.util.stream.j5, j$.util.stream.l5
    public final void accept(int i) {
        if (this.b) {
            IntPredicate intPredicate = null;
            intPredicate.test(i);
            throw null;
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public final void h(long j) {
        this.a.h(-1L);
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public final boolean m() {
        return !this.b || this.a.m();
    }
}
