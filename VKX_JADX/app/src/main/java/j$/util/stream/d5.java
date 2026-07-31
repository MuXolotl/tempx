package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d5 extends a implements Stream {
    @Override // j$.util.stream.a
    public final g2 F(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return v3.B(aVar, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.a
    public final boolean H(Spliterator spliterator, l5 l5Var) {
        boolean zM;
        do {
            zM = l5Var.m();
            if (zM) {
                break;
            }
        } while (spliterator.tryAdvance(l5Var));
        return zM;
    }

    @Override // j$.util.stream.a
    public final z6 I() {
        return z6.REFERENCE;
    }

    @Override // j$.util.stream.a
    public final y1 J(long j, IntFunction intFunction) {
        return v3.z(j, intFunction);
    }

    @Override // j$.util.stream.a
    public final Spliterator Q(a aVar, Supplier supplier, boolean z) {
        return new c8(aVar, supplier, z);
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) D(v3.W(t1.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) D(v3.W(t1.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return D(new a4(z6.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) D(new c4(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream d(j$.time.s sVar) {
        Objects.requireNonNull(sVar);
        return new p(this, y6.p | y6.n | y6.t, sVar, 6);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new m(this, y6.m | y6.t);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i = y8.a;
        Objects.requireNonNull(predicate);
        return new h8(this, y8.b, predicate, 1);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new p(this, y6.t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.z findAny() {
        return (j$.util.z) D(i0.d);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.z findFirst() {
        return (j$.util.z) D(i0.c);
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        D(new p0(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        D(new p0(consumer, true));
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0154  */
    @Override // j$.util.stream.Stream
    public final Object g(i iVar) {
        i iVar2;
        Object objD;
        h hVar;
        Collector.Characteristics characteristics;
        h hVar2;
        Collector.Characteristics characteristics2;
        h hVar3;
        Collector.Characteristics characteristics3;
        if (this.a.k) {
            Set<Collector.Characteristics> setCharacteristics = iVar.a.characteristics();
            if (setCharacteristics != null && !setCharacteristics.isEmpty()) {
                HashSet hashSet = new HashSet();
                Collector.Characteristics next = setCharacteristics.iterator().next();
                if (next instanceof h) {
                    Iterator<Collector.Characteristics> it = setCharacteristics.iterator();
                    while (it.hasNext()) {
                        try {
                            h hVar4 = (h) it.next();
                            if (hVar4 == null) {
                                characteristics3 = null;
                            } else if (hVar4 == h.CONCURRENT) {
                                characteristics3 = Collector.Characteristics.CONCURRENT;
                            } else {
                                characteristics3 = hVar4 == h.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH;
                            }
                            hashSet.add(characteristics3);
                        } catch (ClassCastException e) {
                            j$.util.f.a(e, "java.util.stream.Collector.Characteristics");
                            throw null;
                        }
                    }
                } else {
                    if (!(next instanceof Collector.Characteristics)) {
                        j$.util.f.a(next.getClass(), "java.util.stream.Collector.Characteristics");
                        throw null;
                    }
                    Iterator<Collector.Characteristics> it2 = setCharacteristics.iterator();
                    while (it2.hasNext()) {
                        try {
                            Collector.Characteristics next2 = it2.next();
                            if (next2 == null) {
                                hVar3 = null;
                            } else if (next2 == Collector.Characteristics.CONCURRENT) {
                                hVar3 = h.CONCURRENT;
                            } else {
                                hVar3 = next2 == Collector.Characteristics.UNORDERED ? h.UNORDERED : h.IDENTITY_FINISH;
                            }
                            hashSet.add(hVar3);
                        } catch (ClassCastException e2) {
                            j$.util.f.a(e2, "java.util.stream.Collector.Characteristics");
                            throw null;
                        }
                    }
                }
                setCharacteristics = hashSet;
            }
            if (setCharacteristics.contains(h.CONCURRENT)) {
                if (y6.ORDERED.o(this.f)) {
                    Set<Collector.Characteristics> setCharacteristics2 = iVar.a.characteristics();
                    if (setCharacteristics2 != null && !setCharacteristics2.isEmpty()) {
                        HashSet hashSet2 = new HashSet();
                        Collector.Characteristics next3 = setCharacteristics2.iterator().next();
                        if (next3 instanceof h) {
                            Iterator<Collector.Characteristics> it3 = setCharacteristics2.iterator();
                            while (it3.hasNext()) {
                                try {
                                    h hVar5 = (h) it3.next();
                                    if (hVar5 == null) {
                                        characteristics2 = null;
                                    } else if (hVar5 == h.CONCURRENT) {
                                        characteristics2 = Collector.Characteristics.CONCURRENT;
                                    } else {
                                        characteristics2 = hVar5 == h.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH;
                                    }
                                    hashSet2.add(characteristics2);
                                } catch (ClassCastException e3) {
                                    j$.util.f.a(e3, "java.util.stream.Collector.Characteristics");
                                    throw null;
                                }
                            }
                        } else {
                            if (!(next3 instanceof Collector.Characteristics)) {
                                j$.util.f.a(next3.getClass(), "java.util.stream.Collector.Characteristics");
                                throw null;
                            }
                            Iterator<Collector.Characteristics> it4 = setCharacteristics2.iterator();
                            while (it4.hasNext()) {
                                try {
                                    Collector.Characteristics next4 = it4.next();
                                    if (next4 == null) {
                                        hVar2 = null;
                                    } else if (next4 == Collector.Characteristics.CONCURRENT) {
                                        hVar2 = h.CONCURRENT;
                                    } else {
                                        hVar2 = next4 == Collector.Characteristics.UNORDERED ? h.UNORDERED : h.IDENTITY_FINISH;
                                    }
                                    hashSet2.add(hVar2);
                                } catch (ClassCastException e4) {
                                    j$.util.f.a(e4, "java.util.stream.Collector.Characteristics");
                                    throw null;
                                }
                            }
                        }
                        setCharacteristics2 = hashSet2;
                    }
                    if (!setCharacteristics2.contains(h.UNORDERED)) {
                        iVar2 = iVar;
                        objD = D(new h4(z6.REFERENCE, iVar.a.combiner(), iVar.a.accumulator(), ((i) Objects.requireNonNull(iVar)).a.supplier(), iVar2));
                    }
                }
                objD = iVar.a.supplier().get();
                forEach(new j$.util.concurrent.t(7, iVar.a.accumulator(), objD));
                iVar2 = iVar;
            } else {
                iVar2 = iVar;
                objD = D(new h4(z6.REFERENCE, iVar.a.combiner(), iVar.a.accumulator(), ((i) Objects.requireNonNull(iVar)).a.supplier(), iVar2));
            }
        } else {
            iVar2 = iVar;
            objD = D(new h4(z6.REFERENCE, iVar.a.combiner(), iVar.a.accumulator(), ((i) Objects.requireNonNull(iVar)).a.supplier(), iVar2));
        }
        Set<Collector.Characteristics> setCharacteristics3 = iVar2.a.characteristics();
        if (setCharacteristics3 != null && !setCharacteristics3.isEmpty()) {
            HashSet hashSet3 = new HashSet();
            Collector.Characteristics next5 = setCharacteristics3.iterator().next();
            if (next5 instanceof h) {
                Iterator<Collector.Characteristics> it5 = setCharacteristics3.iterator();
                while (it5.hasNext()) {
                    try {
                        h hVar6 = (h) it5.next();
                        if (hVar6 == null) {
                            characteristics = null;
                        } else if (hVar6 == h.CONCURRENT) {
                            characteristics = Collector.Characteristics.CONCURRENT;
                        } else {
                            characteristics = hVar6 == h.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH;
                        }
                        hashSet3.add(characteristics);
                    } catch (ClassCastException e5) {
                        j$.util.f.a(e5, "java.util.stream.Collector.Characteristics");
                        throw null;
                    }
                }
            } else {
                if (!(next5 instanceof Collector.Characteristics)) {
                    j$.util.f.a(next5.getClass(), "java.util.stream.Collector.Characteristics");
                    throw null;
                }
                Iterator<Collector.Characteristics> it6 = setCharacteristics3.iterator();
                while (it6.hasNext()) {
                    try {
                        Collector.Characteristics next6 = it6.next();
                        if (next6 == null) {
                            hVar = null;
                        } else if (next6 == Collector.Characteristics.CONCURRENT) {
                            hVar = h.CONCURRENT;
                        } else {
                            hVar = next6 == Collector.Characteristics.UNORDERED ? h.UNORDERED : h.IDENTITY_FINISH;
                        }
                        hashSet3.add(hVar);
                    } catch (ClassCastException e6) {
                        j$.util.f.a(e6, "java.util.stream.Collector.Characteristics");
                        throw null;
                    }
                }
            }
            setCharacteristics3 = hashSet3;
        }
        return setCharacteristics3.contains(h.IDENTITY_FINISH) ? objD : iVar2.a.finisher().apply(objD);
    }

    @Override // j$.util.stream.g
    public final Iterator iterator() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.e1(spliterator);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j >= 0) {
            return v3.X(this, 0L, j);
        }
        j$.time.d.c(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new p(this, y6.p | y6.n, function, 5);
    }

    @Override // j$.util.stream.Stream
    public final d0 mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new r(this, y6.p | y6.n, toDoubleFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new u0(this, y6.p | y6.n, toIntFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final m1 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new f1(this, y6.p | y6.n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.z max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 0));
    }

    @Override // j$.util.stream.Stream
    public final j$.util.z min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) D(v3.W(t1.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final m1 o(j$.time.s sVar) {
        Objects.requireNonNull(sVar);
        return new f1(this, y6.p | y6.n | y6.t, sVar, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new p(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return D(new a4(z6.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : v3.X(this, j, -1L);
        }
        j$.time.d.c(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new g6(this);
    }

    @Override // j$.util.stream.Stream
    public final IntStream t(j$.time.s sVar) {
        Objects.requireNonNull(sVar);
        return new u0(this, y6.p | y6.n | y6.t, sVar, 3);
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i = y8.a;
        Objects.requireNonNull(predicate);
        return new h8(this, y8.a, predicate, 0);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return v3.J(E(intFunction), intFunction).g(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }

    @Override // j$.util.stream.Stream
    public final d0 v(j$.time.s sVar) {
        Objects.requireNonNull(sVar);
        return new r(this, y6.p | y6.n | y6.t, sVar, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new g6(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new c1(14));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return D(new a4(z6.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final j$.util.z reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (j$.util.z) D(new y3(z6.REFERENCE, binaryOperator, 2));
    }
}
