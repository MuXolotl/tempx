package j$.util.stream;

import java.util.function.DoublePredicate;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class n8 extends e5 {
    public final boolean b;

    public n8(d6 d6Var, l5 l5Var) {
        super(l5Var);
        this.b = true;
    }

    @Override // j$.util.stream.i5, j$.util.stream.l5
    public final void accept(double d) {
        if (this.b) {
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d);
            throw null;
        }
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final void h(long j) {
        this.a.h(-1L);
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final boolean m() {
        return !this.b || this.a.m();
    }
}
