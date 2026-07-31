package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends CountedCompleter {
    public Spliterator a;
    public final l5 b;
    public final a c;
    public long d;

    public s0(s0 s0Var, Spliterator spliterator) {
        super(s0Var);
        this.a = spliterator;
        this.b = s0Var.b;
        this.d = s0Var.d;
        this.c = s0Var.c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.d;
        if (jE == 0) {
            jE = d.e(jEstimateSize);
            this.d = jE;
        }
        boolean zO = y6.SHORT_CIRCUIT.o(this.c.f);
        l5 l5Var = this.b;
        boolean z = false;
        while (true) {
            if (zO && l5Var.m()) {
                break;
            }
            if (jEstimateSize <= jE || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                this.c.A(spliterator, l5Var);
                break;
            }
            s0 s0Var = new s0(this, spliteratorTrySplit);
            this.addToPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
            } else {
                s0Var = this;
                this = s0Var;
            }
            z = !z;
            this.fork();
            this = s0Var;
            jEstimateSize = spliterator.estimateSize();
        }
        this.a = null;
        this.propagateCompletion();
    }

    public s0(a aVar, Spliterator spliterator, l5 l5Var) {
        super(null);
        this.b = l5Var;
        this.c = aVar;
        this.a = spliterator;
        this.d = 0L;
    }
}
