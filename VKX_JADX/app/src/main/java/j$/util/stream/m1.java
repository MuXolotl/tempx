package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public interface m1 extends g {
    m1 a();

    d0 asDoubleStream();

    j$.util.a0 average();

    m1 b();

    Stream boxed();

    m1 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    m1 d(j$.time.s sVar);

    m1 distinct();

    m1 e();

    j$.util.c0 findAny();

    j$.util.c0 findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    d0 i();

    @Override // j$.util.stream.g
    j$.util.o0 iterator();

    boolean k();

    m1 limit(long j);

    Stream mapToObj(LongFunction longFunction);

    j$.util.c0 max();

    j$.util.c0 min();

    boolean n();

    @Override // j$.util.stream.g
    m1 parallel();

    m1 peek(LongConsumer longConsumer);

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    j$.util.c0 reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.g
    m1 sequential();

    m1 skip(long j);

    m1 sorted();

    @Override // j$.util.stream.g
    j$.util.z0 spliterator();

    long sum();

    j$.util.y summaryStatistics();

    long[] toArray();

    boolean u();

    IntStream y();
}
