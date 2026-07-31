package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class t4 extends w4 implements j5 {
    @Override // j$.util.stream.w4, j$.util.stream.l5
    public final void accept(int i) {
        this.b++;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.r4, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void i(Integer num) {
        v3.g(this, num);
    }

    @Override // j$.util.stream.q4
    public final void r(q4 q4Var) {
        this.b += ((w4) q4Var).b;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        i((Integer) obj);
    }
}
