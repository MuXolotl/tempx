package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends a0 {
    @Override // j$.util.stream.a
    public final boolean M() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a0, j$.util.stream.d0
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (this.a.k) {
            super.forEach(doubleConsumer);
        } else {
            a0.U(P()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.a0, j$.util.stream.d0
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (this.a.k) {
            super.forEachOrdered(doubleConsumer);
        } else {
            a0.U(P()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final d0 parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final d0 sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !y6.ORDERED.o(this.f) ? this : new w(this, y6.r, 0);
    }
}
