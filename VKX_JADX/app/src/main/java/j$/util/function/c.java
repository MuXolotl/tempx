package j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements DoubleUnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ DoubleUnaryOperator b;
    public final /* synthetic */ DoubleUnaryOperator c;

    public /* synthetic */ c(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2, int i) {
        this.a = i;
        this.b = doubleUnaryOperator;
        this.c = doubleUnaryOperator2;
    }

    public final /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.a) {
            case 0:
                break;
        }
        return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator);
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final double applyAsDouble(double d) {
        switch (this.a) {
            case 0:
                return this.b.applyAsDouble(this.c.applyAsDouble(d));
            default:
                return this.c.applyAsDouble(this.b.applyAsDouble(d));
        }
    }

    public final /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.a) {
            case 0:
                break;
        }
        return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator);
    }
}
