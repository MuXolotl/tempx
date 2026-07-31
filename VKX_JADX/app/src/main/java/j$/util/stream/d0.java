package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public interface d0 extends g {
    d0 a();

    j$.util.a0 average();

    d0 b();

    Stream boxed();

    d0 c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    d0 d(j$.time.s sVar);

    d0 distinct();

    j$.util.a0 findAny();

    j$.util.a0 findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    @Override // j$.util.stream.g
    j$.util.g0 iterator();

    boolean l();

    d0 limit(long j);

    d0 map(DoubleUnaryOperator doubleUnaryOperator);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.a0 max();

    j$.util.a0 min();

    @Override // j$.util.stream.g
    d0 parallel();

    d0 peek(DoubleConsumer doubleConsumer);

    boolean r();

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.a0 reduce(DoubleBinaryOperator doubleBinaryOperator);

    m1 s();

    @Override // j$.util.stream.g
    d0 sequential();

    d0 skip(long j);

    d0 sorted();

    @Override // j$.util.stream.g
    j$.util.t0 spliterator();

    double sum();

    j$.util.v summaryStatistics();

    double[] toArray();

    IntStream x();

    boolean z();
}
