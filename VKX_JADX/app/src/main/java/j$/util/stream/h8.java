package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class h8 extends b5 implements p8 {
    public final /* synthetic */ int l;
    public final /* synthetic */ Predicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8(d5 d5Var, int i, Predicate predicate, int i2) {
        super(d5Var, i);
        this.l = i2;
        this.m = predicate;
    }

    @Override // j$.util.stream.a
    public final g2 K(a aVar, Spliterator spliterator, IntFunction intFunction) {
        switch (this.l) {
            case 0:
                return (g2) new s8(this, aVar, spliterator, intFunction).invoke();
            default:
                return (g2) new r8(this, aVar, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public final Spliterator L(a aVar, Spliterator spliterator) {
        int i = 6;
        switch (this.l) {
            case 0:
                return y6.ORDERED.o(aVar.f) ? K(aVar, spliterator, new c1(i)).spliterator() : new w8(aVar.T(spliterator), this.m, 1);
            default:
                return y6.ORDERED.o(aVar.f) ? K(aVar, spliterator, new c1(i)).spliterator() : new w8(aVar.T(spliterator), this.m, 0);
        }
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        switch (this.l) {
            case 0:
                return new k(this, l5Var);
            default:
                return new i8(this, l5Var, false);
        }
    }

    @Override // j$.util.stream.p8
    public q8 h(y1 y1Var, boolean z) {
        return new i8(this, y1Var, z);
    }
}
