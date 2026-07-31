package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class e1 extends g5 {
    public boolean b;
    public final j$.util.l0 c;
    public final /* synthetic */ f1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, l5 l5Var) {
        super(l5Var);
        this.d = f1Var;
        l5 l5Var2 = this.a;
        Objects.requireNonNull(l5Var2);
        this.c = new j$.util.l0(l5Var2, 1);
    }

    @Override // j$.util.stream.k5, j$.util.stream.l5
    public final void accept(long j) throws Exception {
        m1 m1Var = (m1) ((j$.time.s) this.d.m).apply(j);
        if (m1Var != null) {
            try {
                boolean z = this.b;
                j$.util.l0 l0Var = this.c;
                if (z) {
                    j$.util.z0 z0VarSpliterator = m1Var.sequential().spliterator();
                    while (!this.a.m() && z0VarSpliterator.tryAdvance((LongConsumer) l0Var)) {
                    }
                } else {
                    m1Var.sequential().forEach(l0Var);
                }
            } catch (Throwable th) {
                try {
                    m1Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (m1Var != null) {
            m1Var.close();
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final void h(long j) {
        this.a.h(-1L);
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final boolean m() {
        this.b = true;
        return this.a.m();
    }
}
