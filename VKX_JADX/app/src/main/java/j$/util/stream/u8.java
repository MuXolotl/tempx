package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class u8 extends x8 implements IntConsumer, j$.util.w0 {
    public int e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u8(Spliterator spliterator, int i) {
        super(spliterator);
        this.f = i;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.d = (this.d + 1) & 63;
        this.e = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.x8
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f) {
            case 0:
                return new u8((j$.util.w0) spliterator, this, 0);
            default:
                return new u8((j$.util.w0) spliterator, this, 1);
        }
    }

    @Override // j$.util.c1
    public final void forEachRemaining(IntConsumer intConsumer) {
        while (tryAdvance(intConsumer)) {
        }
    }

    @Override // j$.util.w0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i = this.f;
        Spliterator spliterator = this.a;
        IntPredicate intPredicate = null;
        switch (i) {
            case 0:
                if (!this.c) {
                    return ((j$.util.w0) spliterator).tryAdvance(intConsumer);
                }
                this.c = false;
                boolean zTryAdvance = ((j$.util.w0) spliterator).tryAdvance((IntConsumer) this);
                if (zTryAdvance && a()) {
                    intPredicate.test(this.e);
                    throw null;
                }
                if (!zTryAdvance) {
                    return zTryAdvance;
                }
                intConsumer.accept(this.e);
                return zTryAdvance;
            default:
                if (this.c && a() && ((j$.util.w0) spliterator).tryAdvance((IntConsumer) this)) {
                    intPredicate.test(this.e);
                    throw null;
                }
                this.c = false;
                return false;
        }
    }

    @Override // j$.util.stream.x8, j$.util.Spliterator
    public j$.util.w0 trySplit() {
        switch (this.f) {
            case 1:
                if (this.b.get()) {
                    return null;
                }
                return (j$.util.w0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u8(Spliterator spliterator, x8 x8Var, int i) {
        super(spliterator, x8Var);
        this.f = i;
    }

    @Override // j$.util.stream.x8, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.l(this, consumer);
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
        return j$.com.android.tools.r8.a.C(this, consumer);
    }

    @Override // j$.util.c1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f) {
            case 1:
                tryAdvance((IntConsumer) obj);
                return false;
            default:
                return tryAdvance((IntConsumer) obj);
        }
    }
}
