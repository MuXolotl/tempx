package j$.util.stream;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class h4 extends v3 {
    public final /* synthetic */ BinaryOperator h;
    public final /* synthetic */ BiConsumer i;
    public final /* synthetic */ Supplier j;
    public final /* synthetic */ i k;

    public h4(z6 z6Var, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, i iVar) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = iVar;
    }

    @Override // j$.util.stream.v3
    public final q4 Y() {
        return new i4(this.j, this.i, this.h);
    }

    @Override // j$.util.stream.v3, j$.util.stream.e8
    public final int c() {
        h hVar;
        Collector.Characteristics characteristics;
        Set<Collector.Characteristics> setCharacteristics = this.k.a.characteristics();
        if (setCharacteristics != null && !setCharacteristics.isEmpty()) {
            HashSet hashSet = new HashSet();
            Collector.Characteristics next = setCharacteristics.iterator().next();
            if (next instanceof h) {
                Iterator<Collector.Characteristics> it = setCharacteristics.iterator();
                while (it.hasNext()) {
                    try {
                        h hVar2 = (h) it.next();
                        if (hVar2 == null) {
                            characteristics = null;
                        } else if (hVar2 == h.CONCURRENT) {
                            characteristics = Collector.Characteristics.CONCURRENT;
                        } else {
                            characteristics = hVar2 == h.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH;
                        }
                        hashSet.add(characteristics);
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
                            hVar = null;
                        } else if (next2 == Collector.Characteristics.CONCURRENT) {
                            hVar = h.CONCURRENT;
                        } else {
                            hVar = next2 == Collector.Characteristics.UNORDERED ? h.UNORDERED : h.IDENTITY_FINISH;
                        }
                        hashSet.add(hVar);
                    } catch (ClassCastException e2) {
                        j$.util.f.a(e2, "java.util.stream.Collector.Characteristics");
                        throw null;
                    }
                }
            }
            setCharacteristics = hashSet;
        }
        if (setCharacteristics.contains(h.UNORDERED)) {
            return y6.r;
        }
        return 0;
    }
}
