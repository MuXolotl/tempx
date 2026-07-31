package j$.util.stream;

import java.util.function.LongPredicate;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class l8 extends g5 {
    public final boolean b;

    public l8(f6 f6Var, l5 l5Var) {
        super(l5Var);
        this.b = true;
    }

    @Override // j$.util.stream.k5, j$.util.stream.l5
    public final void accept(long j) {
        if (this.b) {
            LongPredicate longPredicate = null;
            longPredicate.test(j);
            throw null;
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final void h(long j) {
        this.a.h(-1L);
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final boolean m() {
        return !this.b || this.a.m();
    }
}
