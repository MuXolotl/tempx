package j$.util.stream;

import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends e5 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(a aVar, l5 l5Var, int i) {
        super(l5Var);
        this.b = i;
    }

    @Override // j$.util.stream.i5, j$.util.stream.l5
    public final void accept(double d) {
        switch (this.b) {
            case 0:
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d);
                throw null;
            case 1:
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d);
                throw null;
            default:
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d);
                throw null;
        }
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public void h(long j) {
        switch (this.b) {
            case 2:
                this.a.h(-1L);
                break;
            default:
                super.h(j);
                break;
        }
    }
}
