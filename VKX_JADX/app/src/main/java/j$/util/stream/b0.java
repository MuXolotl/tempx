package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b0 implements d0 {
    public final /* synthetic */ DoubleStream a;

    public /* synthetic */ b0(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ d0 h(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof c0 ? ((c0) doubleStream).a : new b0(doubleStream);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 a() {
        return h(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ j$.util.a0 average() {
        return j$.com.android.tools.r8.a.H(this.a.average());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 b() {
        return h(this.a.filter(null));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ Stream boxed() {
        return w6.h(this.a.boxed());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 c() {
        return h(this.a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.d0
    public final d0 d(j$.time.s sVar) {
        DoubleStream doubleStream = this.a;
        j$.time.s sVar2 = new j$.time.s(5);
        sVar2.b = sVar;
        return h(doubleStream.flatMap(sVar2));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 distinct() {
        return h(this.a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.a;
        if (obj instanceof b0) {
            obj = ((b0) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ j$.util.a0 findAny() {
        return j$.com.android.tools.r8.a.H(this.a.findAny());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ j$.util.a0 findFirst() {
        return j$.com.android.tools.r8.a.H(this.a.findFirst());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.d0, j$.util.stream.g
    public final /* synthetic */ j$.util.g0 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.f0 ? ((j$.util.f0) it).a : new j$.util.e0(it);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ boolean l() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 limit(long j) {
        return h(this.a.limit(j));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 map(DoubleUnaryOperator doubleUnaryOperator) {
        return h(this.a.map(doubleUnaryOperator));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return w6.h(this.a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ j$.util.a0 max() {
        return j$.com.android.tools.r8.a.H(this.a.max());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ j$.util.a0 min() {
        return j$.com.android.tools.r8.a.H(this.a.min());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g onClose(Runnable runnable) {
        return e.h(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g parallel() {
        return e.h(this.a.parallel());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 peek(DoubleConsumer doubleConsumer) {
        return h(this.a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ boolean r() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ j$.util.a0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return j$.com.android.tools.r8.a.H(this.a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ m1 s() {
        return k1.h(this.a.mapToLong(null));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g sequential() {
        return e.h(this.a.sequential());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 skip(long j) {
        return h(this.a.skip(j));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 sorted() {
        return h(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.d0, j$.util.stream.g
    public final /* synthetic */ j$.util.t0 spliterator() {
        return j$.util.r0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.d0
    public final j$.util.v summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g unordered() {
        return e.h(this.a.unordered());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ IntStream x() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ boolean z() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.d0, j$.util.stream.g
    public final /* synthetic */ d0 parallel() {
        return h(this.a.parallel());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.a.reduce(d, doubleBinaryOperator);
    }

    @Override // j$.util.stream.d0, j$.util.stream.g
    public final /* synthetic */ d0 sequential() {
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
