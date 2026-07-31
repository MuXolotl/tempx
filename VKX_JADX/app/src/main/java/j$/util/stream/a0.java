package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a0 extends a implements d0 {
    public static j$.util.t0 U(Spliterator spliterator) {
        if (spliterator instanceof j$.util.t0) {
            return (j$.util.t0) spliterator;
        }
        if (!g8.a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        g8.a(a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    @Override // j$.util.stream.a
    public final g2 F(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return v3.C(aVar, spliterator, z);
    }

    @Override // j$.util.stream.a
    public final boolean H(Spliterator spliterator, l5 l5Var) {
        DoubleConsumer d0Var;
        boolean zM;
        j$.util.t0 t0VarU = U(spliterator);
        if (l5Var instanceof DoubleConsumer) {
            d0Var = (DoubleConsumer) l5Var;
        } else {
            if (g8.a) {
                g8.a(a.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(l5Var);
            d0Var = new j$.util.d0(l5Var, 1);
        }
        do {
            zM = l5Var.m();
            if (zM) {
                break;
            }
        } while (t0VarU.tryAdvance(d0Var));
        return zM;
    }

    @Override // j$.util.stream.a
    public final z6 I() {
        return z6.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.a
    public final y1 J(long j, IntFunction intFunction) {
        return v3.G(j);
    }

    @Override // j$.util.stream.a
    public final Spliterator Q(a aVar, Supplier supplier, boolean z) {
        return new j7(aVar, supplier, z);
    }

    @Override // j$.util.stream.d0
    public final d0 a() {
        int i = y8.a;
        Objects.requireNonNull(null);
        return new d6(this, y8.a, 1);
    }

    @Override // j$.util.stream.d0
    public final j$.util.a0 average() {
        double[] dArr = (double[]) collect(new q(0), new q(1), new q(2));
        if (dArr[2] <= 0.0d) {
            return j$.util.a0.c;
        }
        int i = j.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return new j$.util.a0(d / dArr[2]);
    }

    @Override // j$.util.stream.d0
    public final d0 b() {
        Objects.requireNonNull(null);
        return new w(this, y6.t, 1);
    }

    @Override // j$.util.stream.d0
    public final Stream boxed() {
        return new p(this, 0, new j$.time.f(22), 0);
    }

    @Override // j$.util.stream.d0
    public final d0 c() {
        int i = y8.a;
        Objects.requireNonNull(null);
        return new d6(this, y8.b, 2);
    }

    @Override // j$.util.stream.d0
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        o oVar = new o(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(oVar);
        return D(new a4(z6.DOUBLE_VALUE, oVar, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.d0
    public final long count() {
        return ((Long) D(new c4(1))).longValue();
    }

    @Override // j$.util.stream.d0
    public final d0 d(j$.time.s sVar) {
        Objects.requireNonNull(sVar);
        return new r(this, y6.p | y6.n | y6.t, sVar, 1);
    }

    @Override // j$.util.stream.d0
    public final d0 distinct() {
        return ((d5) boxed()).distinct().mapToDouble(new j$.time.f(23));
    }

    @Override // j$.util.stream.d0
    public final j$.util.a0 findAny() {
        return (j$.util.a0) D(f0.d);
    }

    @Override // j$.util.stream.d0
    public final j$.util.a0 findFirst() {
        return (j$.util.a0) D(f0.c);
    }

    @Override // j$.util.stream.d0
    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        D(new m0(doubleConsumer, false));
    }

    @Override // j$.util.stream.d0
    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        D(new m0(doubleConsumer, true));
    }

    @Override // j$.util.stream.g
    public final j$.util.g0 iterator() {
        j$.util.t0 t0VarSpliterator = spliterator();
        Objects.requireNonNull(t0VarSpliterator);
        return new j$.util.h1(t0VarSpliterator);
    }

    @Override // j$.util.stream.d0
    public final boolean l() {
        return ((Boolean) D(v3.Q(t1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.d0
    public final d0 limit(long j) {
        if (j >= 0) {
            return v3.R(this, 0L, j);
        }
        j$.time.d.c(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.d0
    public final d0 map(DoubleUnaryOperator doubleUnaryOperator) {
        Objects.requireNonNull(doubleUnaryOperator);
        return new r(this, y6.p | y6.n, doubleUnaryOperator, 0);
    }

    @Override // j$.util.stream.d0
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new p(this, y6.p | y6.n, doubleFunction, 0);
    }

    @Override // j$.util.stream.d0
    public final j$.util.a0 max() {
        return reduce(new j$.time.f(25));
    }

    @Override // j$.util.stream.d0
    public final j$.util.a0 min() {
        return reduce(new j$.time.f(29));
    }

    @Override // j$.util.stream.d0
    public final d0 peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new r(this, doubleConsumer);
    }

    @Override // j$.util.stream.d0
    public final boolean r() {
        return ((Boolean) D(v3.Q(t1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.d0
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) D(new e4(z6.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // j$.util.stream.d0
    public final m1 s() {
        Objects.requireNonNull(null);
        return new u(this, y6.p | y6.n, 0);
    }

    @Override // j$.util.stream.d0
    public final d0 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : v3.R(this, j, -1L);
        }
        j$.time.d.c(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.d0
    public final d0 sorted() {
        return new d6(this, y6.q | y6.o, 0);
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final j$.util.t0 spliterator() {
        return U(super.spliterator());
    }

    @Override // j$.util.stream.d0
    public final double sum() {
        double[] dArr = (double[]) collect(new j$.time.f(26), new j$.time.f(27), new j$.time.f(28));
        int i = j.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // j$.util.stream.d0
    public final j$.util.v summaryStatistics() {
        return (j$.util.v) collect(new j$.time.f(15), new q(3), new j$.time.f(21));
    }

    @Override // j$.util.stream.d0
    public final double[] toArray() {
        return (double[]) v3.K((a2) E(new j$.time.f(24))).b();
    }

    @Override // j$.util.stream.d0
    public final IntStream x() {
        Objects.requireNonNull(null);
        return new t(this, y6.p | y6.n, 0);
    }

    @Override // j$.util.stream.d0
    public final boolean z() {
        return ((Boolean) D(v3.Q(t1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.d0
    public final j$.util.a0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.a0) D(new y3(z6.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }
}
