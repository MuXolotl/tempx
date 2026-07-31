package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class y7 extends a8 implements Spliterator, Consumer {
    public Object f;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void t(Object obj) {
        this.f = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.a8
    public final Spliterator b(Spliterator spliterator) {
        return new y7(spliterator, this);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        f7 f7Var = null;
        while (true) {
            z7 z7VarC = c();
            if (z7VarC == z7.NO_MORE) {
                return;
            }
            z7 z7Var = z7.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (z7VarC != z7Var) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            int i = this.c;
            if (f7Var == null) {
                f7Var = new f7(i);
            } else {
                f7Var.a = 0;
            }
            long j = 0;
            while (spliterator.tryAdvance(f7Var)) {
                j++;
                if (j >= i) {
                    break;
                }
            }
            if (j == 0) {
                return;
            }
            long jA = a(j);
            for (int i2 = 0; i2 < jA; i2++) {
                consumer.t(f7Var.b[i2]);
            }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.p(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.com.android.tools.r8.a.r(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (c() != z7.NO_MORE && this.a.tryAdvance(this)) {
            if (a(1L) == 1) {
                consumer.t(this.f);
                this.f = null;
                return true;
            }
        }
        return false;
    }
}
