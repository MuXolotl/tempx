package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class c8 extends a7 {
    @Override // j$.util.stream.a7
    public final void d() {
        v6 v6Var = new v6();
        this.h = v6Var;
        Objects.requireNonNull(v6Var);
        this.e = this.b.S(new b8(v6Var, 0));
        this.f = new j$.time.s(14, this);
    }

    @Override // j$.util.stream.a7
    public final a7 e(Spliterator spliterator) {
        return new c8(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        Objects.requireNonNull(consumer);
        c();
        Objects.requireNonNull(consumer);
        b8 b8Var = new b8(consumer, 1);
        this.b.R(this.d, b8Var);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean zA = a();
        if (!zA) {
            return zA;
        }
        v6 v6Var = (v6) this.h;
        long j = this.g;
        if (v6Var.c != 0) {
            if (j >= v6Var.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i = 0; i <= v6Var.c; i++) {
                long j2 = v6Var.d[i];
                Object[] objArr = v6Var.f[i];
                if (j < ((long) objArr.length) + j2) {
                    obj = objArr[(int) (j - j2)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= v6Var.b) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        obj = v6Var.e[(int) j];
        consumer.t(obj);
        return zA;
    }
}
