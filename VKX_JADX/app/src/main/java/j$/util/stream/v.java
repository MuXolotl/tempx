package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends e5 {
    public boolean b;
    public final j$.util.d0 c;
    public final /* synthetic */ r d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r rVar, l5 l5Var) {
        super(l5Var);
        this.d = rVar;
        l5 l5Var2 = this.a;
        Objects.requireNonNull(l5Var2);
        this.c = new j$.util.d0(l5Var2, 1);
    }

    @Override // j$.util.stream.i5, j$.util.stream.l5
    public final void accept(double d) throws Exception {
        d0 d0Var = (d0) ((j$.time.s) this.d.m).apply(d);
        if (d0Var != null) {
            try {
                boolean z = this.b;
                j$.util.d0 d0Var2 = this.c;
                if (z) {
                    j$.util.t0 t0VarSpliterator = d0Var.sequential().spliterator();
                    while (!this.a.m() && t0VarSpliterator.tryAdvance((DoubleConsumer) d0Var2)) {
                    }
                } else {
                    d0Var.sequential().forEach(d0Var2);
                }
            } catch (Throwable th) {
                try {
                    d0Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (d0Var != null) {
            d0Var.close();
        }
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final void h(long j) {
        this.a.h(-1L);
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final boolean m() {
        this.b = true;
        return this.a.m();
    }
}
