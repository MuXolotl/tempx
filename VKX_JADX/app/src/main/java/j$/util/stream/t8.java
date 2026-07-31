package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class t8 extends x8 implements DoubleConsumer, j$.util.t0 {
    public double e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t8(Spliterator spliterator, int i) {
        super(spliterator);
        this.f = i;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.d = (this.d + 1) & 63;
        this.e = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.x8
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f) {
            case 0:
                return new t8((j$.util.t0) spliterator, this, 0);
            default:
                return new t8((j$.util.t0) spliterator, this, 1);
        }
    }

    @Override // j$.util.c1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // j$.util.t0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        int i = this.f;
        Spliterator spliterator = this.a;
        DoublePredicate doublePredicate = null;
        switch (i) {
            case 0:
                if (!this.c) {
                    return ((j$.util.t0) spliterator).tryAdvance(doubleConsumer);
                }
                this.c = false;
                boolean zTryAdvance = ((j$.util.t0) spliterator).tryAdvance((DoubleConsumer) this);
                if (zTryAdvance && a()) {
                    doublePredicate.test(this.e);
                    throw null;
                }
                if (!zTryAdvance) {
                    return zTryAdvance;
                }
                doubleConsumer.accept(this.e);
                return zTryAdvance;
            default:
                if (this.c && a() && ((j$.util.t0) spliterator).tryAdvance((DoubleConsumer) this)) {
                    doublePredicate.test(this.e);
                    throw null;
                }
                this.c = false;
                return false;
        }
    }

    @Override // j$.util.stream.x8, j$.util.Spliterator
    public j$.util.t0 trySplit() {
        switch (this.f) {
            case 1:
                if (this.b.get()) {
                    return null;
                }
                return (j$.util.t0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t8(Spliterator spliterator, x8 x8Var, int i) {
        super(spliterator, x8Var);
        this.f = i;
    }

    @Override // j$.util.stream.x8, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.stream.x8, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.x8, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c1 trySplit() {
        switch (this.f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.B(this, consumer);
    }

    @Override // j$.util.c1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((DoubleConsumer) obj);
        }
    }
}
