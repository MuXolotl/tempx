package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class j7 extends a7 implements j$.util.t0 {
    @Override // j$.util.stream.a7
    public final void d() {
        o6 o6Var = new o6();
        this.h = o6Var;
        Objects.requireNonNull(o6Var);
        this.e = this.b.S(new i7(o6Var, 1));
        this.f = new j$.time.s(11, this);
    }

    @Override // j$.util.stream.a7
    public final a7 e(Spliterator spliterator) {
        return new j7(this.b, spliterator, this.a);
    }

    @Override // j$.util.c1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(doubleConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(doubleConsumer);
        c();
        Objects.requireNonNull(doubleConsumer);
        i7 i7Var = new i7(doubleConsumer, 0);
        this.b.R(this.d, i7Var);
        this.i = true;
    }

    @Override // j$.util.c1
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        boolean zA = a();
        if (zA) {
            o6 o6Var = (o6) this.h;
            long j = this.g;
            int iP = o6Var.p(j);
            doubleConsumer.accept((o6Var.c == 0 && iP == 0) ? ((double[]) o6Var.e)[(int) j] : ((double[][]) o6Var.f)[iP][(int) (j - o6Var.d[iP])]);
        }
        return zA;
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final j$.util.t0 trySplit() {
        return (j$.util.t0) super.trySplit();
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final j$.util.c1 trySplit() {
        return (j$.util.t0) super.trySplit();
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.t0) super.trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.B(this, consumer);
    }
}
