package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements e8 {
    public final int a;
    public final Object b;
    public final Predicate c;
    public final Supplier d;

    public e0(boolean z, z6 z6Var, Object obj, Predicate predicate, Supplier supplier) {
        this.a = (z ? 0 : y6.r) | y6.u;
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.e8
    public final Object a(a aVar, Spliterator spliterator) {
        f8 f8Var = (f8) this.d.get();
        aVar.R(spliterator, f8Var);
        Object obj = f8Var.get();
        return obj != null ? obj : this.b;
    }

    @Override // j$.util.stream.e8
    public final Object b(a aVar, Spliterator spliterator) {
        return new k0(this, y6.ORDERED.o(aVar.f), aVar, spliterator).invoke();
    }

    @Override // j$.util.stream.e8
    public final int c() {
        return this.a;
    }
}
