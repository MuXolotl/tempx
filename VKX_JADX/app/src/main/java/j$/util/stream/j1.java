package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j1 extends a implements m1 {
    public static j$.util.z0 U(Spliterator spliterator) {
        if (spliterator instanceof j$.util.z0) {
            return (j$.util.z0) spliterator;
        }
        if (!g8.a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        g8.a(a.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.a
    public final g2 F(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return v3.E(aVar, spliterator, z);
    }

    @Override // j$.util.stream.a
    public final boolean H(Spliterator spliterator, l5 l5Var) {
        LongConsumer l0Var;
        boolean zM;
        j$.util.z0 z0VarU = U(spliterator);
        if (l5Var instanceof LongConsumer) {
            l0Var = (LongConsumer) l5Var;
        } else {
            if (g8.a) {
                g8.a(a.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(l5Var);
            l0Var = new j$.util.l0(l5Var, 1);
        }
        do {
            zM = l5Var.m();
            if (zM) {
                break;
            }
        } while (z0VarU.tryAdvance(l0Var));
        return zM;
    }

    @Override // j$.util.stream.a
    public final z6 I() {
        return z6.LONG_VALUE;
    }

    @Override // j$.util.stream.a
    public final y1 J(long j, IntFunction intFunction) {
        return v3.P(j);
    }

    @Override // j$.util.stream.a
    public final Spliterator Q(a aVar, Supplier supplier, boolean z) {
        return new n7(aVar, supplier, z);
    }

    @Override // j$.util.stream.m1
    public final m1 a() {
        int i = y8.a;
        Objects.requireNonNull(null);
        return new f6(this, y8.a, 1);
    }

    @Override // j$.util.stream.m1
    public final d0 asDoubleStream() {
        return new w(this, y6.n, 4);
    }

    @Override // j$.util.stream.m1
    public final j$.util.a0 average() {
        long[] jArr = (long[]) collect(new q(28), new q(29), new c1(0));
        long j = jArr[0];
        return j > 0 ? new j$.util.a0(jArr[1] / j) : j$.util.a0.c;
    }

    @Override // j$.util.stream.m1
    public final m1 b() {
        Objects.requireNonNull(null);
        return new u(this, y6.t, 5);
    }

    @Override // j$.util.stream.m1
    public final Stream boxed() {
        return new p(this, 0, new q(27), 2);
    }

    @Override // j$.util.stream.m1
    public final m1 c() {
        int i = y8.a;
        Objects.requireNonNull(null);
        return new f6(this, y8.b, 2);
    }

    @Override // j$.util.stream.m1
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        o oVar = new o(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(oVar);
        return D(new a4(z6.LONG_VALUE, oVar, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.m1
    public final long count() {
        return ((Long) D(new c4(0))).longValue();
    }

    @Override // j$.util.stream.m1
    public final m1 d(j$.time.s sVar) {
        Objects.requireNonNull(sVar);
        return new f1(this, y6.p | y6.n | y6.t, sVar, 0);
    }

    @Override // j$.util.stream.m1
    public final m1 distinct() {
        return ((d5) boxed()).distinct().mapToLong(new c1(4));
    }

    @Override // j$.util.stream.m1
    public final m1 e() {
        Objects.requireNonNull(null);
        return new u(this, y6.p | y6.n, 3);
    }

    @Override // j$.util.stream.m1
    public final j$.util.c0 findAny() {
        return (j$.util.c0) D(h0.d);
    }

    @Override // j$.util.stream.m1
    public final j$.util.c0 findFirst() {
        return (j$.util.c0) D(h0.c);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        D(new o0(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        D(new o0(longConsumer, true));
    }

    @Override // j$.util.stream.m1
    public final d0 i() {
        Objects.requireNonNull(null);
        return new w(this, y6.p | y6.n, 5);
    }

    @Override // j$.util.stream.g
    public final j$.util.o0 iterator() {
        j$.util.z0 z0VarSpliterator = spliterator();
        Objects.requireNonNull(z0VarSpliterator);
        return new j$.util.g1(z0VarSpliterator);
    }

    @Override // j$.util.stream.m1
    public final boolean k() {
        return ((Boolean) D(v3.U(t1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.m1
    public final m1 limit(long j) {
        if (j >= 0) {
            return v3.V(this, 0L, j);
        }
        j$.time.d.c(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.m1
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new p(this, y6.p | y6.n, longFunction, 2);
    }

    @Override // j$.util.stream.m1
    public final j$.util.c0 max() {
        return reduce(new c1(1));
    }

    @Override // j$.util.stream.m1
    public final j$.util.c0 min() {
        return reduce(new c1(3));
    }

    @Override // j$.util.stream.m1
    public final boolean n() {
        return ((Boolean) D(v3.U(t1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.m1
    public final m1 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new f1(this, longConsumer);
    }

    @Override // j$.util.stream.m1
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) D(new w3(z6.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // j$.util.stream.m1
    public final m1 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : v3.V(this, j, -1L);
        }
        j$.time.d.c(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.m1
    public final m1 sorted() {
        return new f6(this, y6.q | y6.o, 0);
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final j$.util.z0 spliterator() {
        return U(super.spliterator());
    }

    @Override // j$.util.stream.m1
    public final long sum() {
        return reduce(0L, new c1(2));
    }

    @Override // j$.util.stream.m1
    public final j$.util.y summaryStatistics() {
        return (j$.util.y) collect(new j$.time.f(17), new q(24), new q(25));
    }

    @Override // j$.util.stream.m1
    public final long[] toArray() {
        return (long[]) v3.M((e2) E(new q(26))).b();
    }

    @Override // j$.util.stream.m1
    public final boolean u() {
        return ((Boolean) D(v3.U(t1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.m1
    public final IntStream y() {
        Objects.requireNonNull(null);
        return new t(this, y6.p | y6.n, 4);
    }

    @Override // j$.util.stream.m1
    public final j$.util.c0 reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.c0) D(new y3(z6.LONG_VALUE, longBinaryOperator, 0));
    }
}
