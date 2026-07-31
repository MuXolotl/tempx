package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class f6 extends h1 implements p8 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6(a aVar, int i, int i2) {
        super(aVar, i);
        this.l = i2;
    }

    @Override // j$.util.stream.a
    public final g2 K(a aVar, Spliterator spliterator, IntFunction intFunction) {
        switch (this.l) {
            case 0:
                if (y6.SORTED.o(aVar.f)) {
                    return aVar.C(spliterator, false, intFunction);
                }
                long[] jArr = (long[]) ((e2) aVar.C(spliterator, true, intFunction)).b();
                Arrays.sort(jArr);
                return new k3(jArr);
            case 1:
                return (g2) new s8(this, aVar, spliterator, intFunction).invoke();
            default:
                return (g2) new r8(this, aVar, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public Spliterator L(a aVar, Spliterator spliterator) {
        switch (this.l) {
            case 1:
                return y6.ORDERED.o(aVar.f) ? K(aVar, spliterator, new c1(22)).spliterator() : new v8((j$.util.z0) aVar.T(spliterator), 1);
            case 2:
                return y6.ORDERED.o(aVar.f) ? K(aVar, spliterator, new c1(23)).spliterator() : new v8((j$.util.z0) aVar.T(spliterator), 0);
            default:
                return super.L(aVar, spliterator);
        }
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        switch (this.l) {
            case 0:
                Objects.requireNonNull(l5Var);
                if (y6.SORTED.o(i)) {
                    return l5Var;
                }
                return y6.SIZED.o(i) ? new k6(l5Var) : new c6(l5Var);
            case 1:
                return new l8(this, l5Var);
            default:
                return new m8(this, l5Var, false);
        }
    }

    @Override // j$.util.stream.p8
    public q8 h(y1 y1Var, boolean z) {
        return new m8(this, y1Var, z);
    }
}
