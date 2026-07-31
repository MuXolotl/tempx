package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class r2 extends i2 {
    @Override // j$.util.stream.g2
    public final g2 e(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == this.c) {
            return this;
        }
        long jCount = this.a.count();
        if (j >= jCount) {
            return this.b.e(j - jCount, j2 - jCount, intFunction);
        }
        g2 g2Var = this.a;
        if (j2 <= jCount) {
            return g2Var.e(j, j2, intFunction);
        }
        return v3.F(z6.REFERENCE, g2Var.e(j, jCount, intFunction), this.b.e(0L, j2 - jCount, intFunction));
    }

    @Override // j$.util.stream.g2
    public final void f(Object[] objArr, int i) {
        Objects.requireNonNull(objArr);
        g2 g2Var = this.a;
        g2Var.f(objArr, i);
        this.b.f(objArr, i + ((int) g2Var.count()));
    }

    @Override // j$.util.stream.g2
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.g2
    public final Object[] g(IntFunction intFunction) {
        long j = this.c;
        if (j >= 2147483639) {
            j$.time.d.c("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        f(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.g2
    public final Spliterator spliterator() {
        return new i3(this);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
