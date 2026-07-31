package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class b1 extends g5 {
    public final /* synthetic */ int b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(a aVar, l5 l5Var, int i) {
        super(l5Var);
        this.b = i;
        this.c = aVar;
    }

    @Override // j$.util.stream.k5, j$.util.stream.l5
    public final void accept(long j) {
        int i = this.b;
        l5 l5Var = this.a;
        a aVar = this.c;
        switch (i) {
            case 0:
                l5Var.accept(((LongFunction) ((p) aVar).m).apply(j));
                break;
            default:
                ((LongConsumer) ((f1) aVar).m).accept(j);
                l5Var.accept(j);
                break;
        }
    }
}
