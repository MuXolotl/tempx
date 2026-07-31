package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j3 implements Spliterator {
    public g2 a;
    public int b;
    public Spliterator c;
    public Spliterator d;
    public Deque e;

    public j3(g2 g2Var) {
        this.a = g2Var;
    }

    public static g2 a(Deque deque) {
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) deque;
            g2 g2Var = (g2) arrayDeque.pollFirst();
            if (g2Var == null) {
                return null;
            }
            if (g2Var.j() != 0) {
                for (int iJ = g2Var.j() - 1; iJ >= 0; iJ--) {
                    arrayDeque.addFirst(g2Var.a(iJ));
                }
            } else if (g2Var.count() > 0) {
                return g2Var;
            }
        }
    }

    public final Deque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iJ = this.a.j();
        while (true) {
            iJ--;
            if (iJ < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.a(iJ));
        }
    }

    public final boolean c() {
        if (this.a == null) {
            return false;
        }
        if (this.d != null) {
            return true;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            this.d = spliterator;
            return true;
        }
        Deque dequeB = b();
        this.e = dequeB;
        g2 g2VarA = a(dequeB);
        if (g2VarA != null) {
            this.d = g2VarA.spliterator();
            return true;
        }
        this.a = null;
        return false;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.a == null) {
            return 0L;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.b; i < this.a.j(); i++) {
            jCount += this.a.a(i).count();
        }
        return jCount;
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
    public final Spliterator trySplit() {
        g2 g2Var = this.a;
        if (g2Var == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        int i = this.b;
        int iJ = g2Var.j() - 1;
        g2 g2Var2 = this.a;
        int i2 = this.b;
        if (i < iJ) {
            this.b = i2 + 1;
            return g2Var2.a(i2).spliterator();
        }
        g2 g2VarA = g2Var2.a(i2);
        this.a = g2VarA;
        int iJ2 = g2VarA.j();
        g2 g2Var3 = this.a;
        if (iJ2 != 0) {
            this.b = 1;
            return g2Var3.a(0).spliterator();
        }
        Spliterator spliterator2 = g2Var3.spliterator();
        this.c = spliterator2;
        return spliterator2.trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c1 trySplit() {
        return (j$.util.c1) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.w0 trySplit() {
        return (j$.util.w0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.z0 trySplit() {
        return (j$.util.z0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.t0 trySplit() {
        return (j$.util.t0) trySplit();
    }
}
