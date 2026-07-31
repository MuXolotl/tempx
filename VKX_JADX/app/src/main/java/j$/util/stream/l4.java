package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class l4 extends v3 {
    public final /* synthetic */ IntBinaryOperator h;
    public final /* synthetic */ int i;

    public l4(z6 z6Var, IntBinaryOperator intBinaryOperator, int i) {
        this.h = intBinaryOperator;
        this.i = i;
    }

    @Override // j$.util.stream.v3
    public final q4 Y() {
        return new k4(this.i, this.h);
    }
}
