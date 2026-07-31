package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class y3 extends v3 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ y3(z6 z6Var, Object obj, int i) {
        this.h = i;
        this.i = obj;
    }

    @Override // j$.util.stream.v3
    public final q4 Y() {
        switch (this.h) {
            case 0:
                return new p4((LongBinaryOperator) this.i);
            case 1:
                return new b4((DoubleBinaryOperator) this.i);
            case 2:
                return new g4((BinaryOperator) this.i);
            default:
                return new m4((IntBinaryOperator) this.i);
        }
    }
}
