package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s1 implements l5 {
    public boolean a;
    public boolean b;

    public s1(t1 t1Var) {
        this.b = !t1Var.b;
    }

    @Override // j$.util.stream.l5
    public /* synthetic */ void accept(double d) {
        v3.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.l5
    public final boolean m() {
        return this.a;
    }

    @Override // j$.util.stream.l5
    public /* synthetic */ void accept(int i) {
        v3.k();
        throw null;
    }

    @Override // j$.util.stream.l5
    public /* synthetic */ void accept(long j) {
        v3.l();
        throw null;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void h(long j) {
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void end() {
    }
}
