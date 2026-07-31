package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x8 implements Spliterator {
    public final Spliterator a;
    public final AtomicBoolean b;
    public boolean c;
    public int d;

    public x8(Spliterator spliterator) {
        this.c = true;
        this.a = spliterator;
        this.b = new AtomicBoolean();
    }

    public final boolean a() {
        return (this.d == 0 && this.b.get()) ? false : true;
    }

    public abstract Spliterator b(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        while (tryAdvance(consumer)) {
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.com.android.tools.r8.a.r(this, i);
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.a.trySplit();
        if (spliteratorTrySplit != null) {
            return b(spliteratorTrySplit);
        }
        return null;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.w0 trySplit() {
        return (j$.util.w0) trySplit();
    }

    public x8(Spliterator spliterator, x8 x8Var) {
        this.c = true;
        this.a = spliterator;
        x8Var.getClass();
        this.b = x8Var.b;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.z0 trySplit() {
        return (j$.util.z0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.t0 trySplit() {
        return (j$.util.t0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c1 trySplit() {
        return (j$.util.c1) trySplit();
    }
}
