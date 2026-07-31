package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends b5 {
    public static k2 U(a aVar, Spliterator spliterator) {
        j$.time.f fVar = new j$.time.f(18);
        j$.time.f fVar2 = new j$.time.f(19);
        j$.time.f fVar3 = new j$.time.f(20);
        Objects.requireNonNull(fVar);
        Objects.requireNonNull(fVar2);
        Objects.requireNonNull(fVar3);
        return new k2((Collection) new a4(z6.REFERENCE, fVar3, fVar2, fVar, 3).b(aVar, spliterator));
    }

    @Override // j$.util.stream.a
    public final g2 K(a aVar, Spliterator spliterator, IntFunction intFunction) {
        if (y6.DISTINCT.o(aVar.f)) {
            return aVar.C(spliterator, false, intFunction);
        }
        if (y6.ORDERED.o(aVar.f)) {
            return U(aVar, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        j$.util.concurrent.t tVar = new j$.util.concurrent.t(4, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(tVar);
        new p0(tVar, false).d(aVar, spliterator);
        Collection collectionKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new k2(collectionKeySet);
    }

    @Override // j$.util.stream.a
    public final Spliterator L(a aVar, Spliterator spliterator) {
        if (y6.DISTINCT.o(aVar.f)) {
            return aVar.T(spliterator);
        }
        return y6.ORDERED.o(aVar.f) ? U(aVar, spliterator).spliterator() : new h7(aVar.T(spliterator), new ConcurrentHashMap());
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        Objects.requireNonNull(l5Var);
        if (y6.DISTINCT.o(i)) {
            return l5Var;
        }
        return y6.SORTED.o(i) ? new k(l5Var) : new l(l5Var);
    }
}
