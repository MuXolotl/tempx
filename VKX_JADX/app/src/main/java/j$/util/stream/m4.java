package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class m4 implements q4, j5 {
    public boolean a;
    public int b;
    public final /* synthetic */ IntBinaryOperator c;

    public m4(IntBinaryOperator intBinaryOperator) {
        this.c = intBinaryOperator;
    }

    @Override // j$.util.stream.l5
    public final void accept(int i) {
        if (!this.a) {
            this.b = this.c.applyAsInt(this.b, i);
        } else {
            this.a = false;
            this.b = i;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? j$.util.b0.c : new j$.util.b0(this.b);
    }

    @Override // j$.util.stream.l5
    public final void h(long j) {
        this.a = true;
        this.b = 0;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void i(Integer num) {
        v3.g(this, num);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.q4
    public final void r(q4 q4Var) {
        m4 m4Var = (m4) q4Var;
        if (m4Var.a) {
            return;
        }
        accept(m4Var.b);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(long j) {
        v3.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        i((Integer) obj);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(double d) {
        v3.d();
        throw null;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void end() {
    }
}
