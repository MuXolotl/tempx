package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends f5 {
    public boolean b;
    public final j$.util.h0 c;
    public final /* synthetic */ u0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(u0 u0Var, l5 l5Var) {
        super(l5Var);
        this.d = u0Var;
        l5 l5Var2 = this.a;
        Objects.requireNonNull(l5Var2);
        this.c = new j$.util.h0(l5Var2, 1);
    }

    @Override // j$.util.stream.j5, j$.util.stream.l5
    public final void accept(int i) throws Exception {
        IntStream intStream = (IntStream) ((l0) this.d.m).apply(i);
        if (intStream != null) {
            try {
                boolean z = this.b;
                j$.util.h0 h0Var = this.c;
                if (z) {
                    j$.util.w0 w0VarSpliterator = intStream.sequential().spliterator();
                    while (!this.a.m() && w0VarSpliterator.tryAdvance((IntConsumer) h0Var)) {
                    }
                } else {
                    intStream.sequential().forEach(h0Var);
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public final void h(long j) {
        this.a.h(-1L);
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public final boolean m() {
        this.b = true;
        return this.a.m();
    }
}
