package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x7 extends a8 implements j$.util.c1 {
    public abstract void d(Object obj);

    public abstract e7 e(int i);

    @Override // j$.util.c1
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        e7 e7VarE = null;
        while (true) {
            z7 z7VarC = c();
            if (z7VarC == z7.NO_MORE) {
                return;
            }
            z7 z7Var = z7.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (z7VarC != z7Var) {
                ((j$.util.c1) spliterator).forEachRemaining(obj);
                return;
            }
            int i = this.c;
            if (e7VarE == null) {
                e7VarE = e(i);
            } else {
                e7VarE.b = 0;
            }
            long j = 0;
            while (((j$.util.c1) spliterator).tryAdvance(e7VarE)) {
                j++;
                if (j >= i) {
                    break;
                }
            }
            if (j == 0) {
                return;
            } else {
                e7VarE.a(obj, a(j));
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

    @Override // j$.util.c1
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (c() != z7.NO_MORE && ((j$.util.c1) this.a).tryAdvance(this)) {
            if (a(1L) == 1) {
                d(obj);
                return true;
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }
}
