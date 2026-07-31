package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a8 {
    public final Spliterator a;
    public final boolean b;
    public final int c;
    public final long d;
    public final AtomicLong e;

    public a8(Spliterator spliterator, long j, long j2) {
        this.a = spliterator;
        this.b = j2 < 0;
        this.d = j2 >= 0 ? j2 : 0L;
        this.c = 128;
        this.e = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    public final long a(long j) {
        long j2;
        boolean z;
        long jMin;
        do {
            j2 = this.e.get();
            z = this.b;
            if (j2 != 0) {
                jMin = Math.min(j2, j);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z) {
                    return j;
                }
                return 0L;
            }
        } while (!this.e.compareAndSet(j2, j2 - jMin));
        if (z) {
            return Math.max(j - jMin, 0L);
        }
        long j3 = this.d;
        return j2 > j3 ? Math.max(jMin - (j2 - j3), 0L) : jMin;
    }

    public abstract Spliterator b(Spliterator spliterator);

    public final z7 c() {
        if (this.e.get() > 0) {
            return z7.MAYBE_MORE;
        }
        return this.b ? z7.UNLIMITED : z7.NO_MORE;
    }

    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.a.estimateSize();
    }

    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit;
        if (this.e.get() == 0 || (spliteratorTrySplit = this.a.trySplit()) == null) {
            return null;
        }
        return b(spliteratorTrySplit);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.c1 m236trySplit() {
        return (j$.util.c1) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.w0 m238trySplit() {
        return (j$.util.w0) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.z0 m239trySplit() {
        return (j$.util.z0) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.t0 m237trySplit() {
        return (j$.util.t0) trySplit();
    }

    public a8(Spliterator spliterator, a8 a8Var) {
        this.a = spliterator;
        this.b = a8Var.b;
        this.e = a8Var.e;
        this.d = a8Var.d;
        this.c = a8Var.c;
    }
}
