package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k1 implements m1 {
    public final /* synthetic */ LongStream a;

    public /* synthetic */ k1(LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ m1 h(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof l1 ? ((l1) longStream).a : new k1(longStream);
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ m1 a() {
        return h(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ d0 asDoubleStream() {
        return b0.h(this.a.asDoubleStream());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ j$.util.a0 average() {
        return j$.com.android.tools.r8.a.H(this.a.average());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ m1 b() {
        return h(this.a.filter(null));
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ Stream boxed() {
        return w6.h(this.a.boxed());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ m1 c() {
        return h(this.a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.m1
    public final m1 d(j$.time.s sVar) {
        LongStream longStream = this.a;
        j$.time.s sVar2 = new j$.time.s(7);
        sVar2.b = sVar;
        return h(longStream.flatMap(sVar2));
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ m1 distinct() {
        return h(this.a.distinct());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ m1 e() {
        return h(this.a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.a;
        if (obj instanceof k1) {
            obj = ((k1) obj).a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ j$.util.c0 findAny() {
        return j$.com.android.tools.r8.a.J(this.a.findAny());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ j$.util.c0 findFirst() {
        return j$.com.android.tools.r8.a.J(this.a.findFirst());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.a.forEach(longConsumer);
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ d0 i() {
        return b0.h(this.a.mapToDouble(null));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.m1, j$.util.stream.g
    public final /* synthetic */ j$.util.o0 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.n0 ? ((j$.util.n0) it).a : new j$.util.m0(it);
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ boolean k() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ m1 limit(long j) {
        return h(this.a.limit(j));
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return w6.h(this.a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ j$.util.c0 max() {
        return j$.com.android.tools.r8.a.J(this.a.max());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ j$.util.c0 min() {
        return j$.com.android.tools.r8.a.J(this.a.min());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ boolean n() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g onClose(Runnable runnable) {
        return e.h(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g parallel() {
        return e.h(this.a.parallel());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ m1 peek(LongConsumer longConsumer) {
        return h(this.a.peek(longConsumer));
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ j$.util.c0 reduce(LongBinaryOperator longBinaryOperator) {
        return j$.com.android.tools.r8.a.J(this.a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g sequential() {
        return e.h(this.a.sequential());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ m1 skip(long j) {
        return h(this.a.skip(j));
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ m1 sorted() {
        return h(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.m1, j$.util.stream.g
    public final /* synthetic */ j$.util.z0 spliterator() {
        return j$.util.x0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ long sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.m1
    public final j$.util.y summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ boolean u() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g unordered() {
        return e.h(this.a.unordered());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ IntStream y() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.m1, j$.util.stream.g
    public final /* synthetic */ m1 parallel() {
        return h(this.a.parallel());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.a.reduce(j, longBinaryOperator);
    }

    @Override // j$.util.stream.m1, j$.util.stream.g
    public final /* synthetic */ m1 sequential() {
        return h(this.a.sequential());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.d1.a(this.a.spliterator());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }
}
