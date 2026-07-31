package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class g6 extends b5 {
    public final boolean l;
    public final Comparator m;

    public g6(d5 d5Var, Comparator comparator) {
        super(d5Var, y6.q | y6.p);
        this.l = false;
        this.m = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.a
    public final g2 K(a aVar, Spliterator spliterator, IntFunction intFunction) {
        if (y6.SORTED.o(aVar.f) && this.l) {
            return aVar.C(spliterator, false, intFunction);
        }
        Object[] objArrG = aVar.C(spliterator, true, intFunction).g(intFunction);
        Arrays.sort(objArrG, this.m);
        return new j2(objArrG);
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        Objects.requireNonNull(l5Var);
        if (y6.SORTED.o(i) && this.l) {
            return l5Var;
        }
        boolean zO = y6.SIZED.o(i);
        Comparator comparator = this.m;
        return zO ? new l6(l5Var, comparator) : new h6(l5Var, comparator);
    }

    public g6(d5 d5Var) {
        super(d5Var, y6.q | y6.o);
        this.l = true;
        this.m = j$.util.e.INSTANCE;
    }
}
