package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class g1 extends j1 {
    @Override // j$.util.stream.a
    public final boolean M() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.j1, j$.util.stream.m1
    public final void forEach(LongConsumer longConsumer) {
        if (this.a.k) {
            super.forEach(longConsumer);
        } else {
            j1.U(P()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.j1, j$.util.stream.m1
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (this.a.k) {
            super.forEachOrdered(longConsumer);
        } else {
            j1.U(P()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final m1 parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final m1 sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !y6.ORDERED.o(this.f) ? this : new u(this, y6.r, 4);
    }
}
