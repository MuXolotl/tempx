package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class u1 extends b {
    public final j$.util.concurrent.t j;

    public u1(u1 u1Var, Spliterator spliterator) {
        super(u1Var, spliterator);
        this.j = u1Var.j;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.a;
        s1 s1Var = (s1) ((Supplier) this.j.c).get();
        aVar.R(this.b, s1Var);
        boolean z = s1Var.b;
        if (z == ((t1) this.j.b).b) {
            Boolean boolValueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new u1(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return Boolean.valueOf(!((t1) this.j.b).b);
    }

    public u1(j$.util.concurrent.t tVar, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.j = tVar;
    }
}
