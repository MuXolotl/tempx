package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class w3 extends v3 {
    public final /* synthetic */ LongBinaryOperator h;
    public final /* synthetic */ long i;

    public w3(z6 z6Var, LongBinaryOperator longBinaryOperator, long j) {
        this.h = longBinaryOperator;
        this.i = j;
    }

    @Override // j$.util.stream.v3
    public final q4 Y() {
        return new o4(this.i, this.h);
    }
}
