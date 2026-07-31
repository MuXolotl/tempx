package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r3 extends CountedCompleter implements l5 {
    public final Spliterator a;
    public final a b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public r3(r3 r3Var, Spliterator spliterator, long j, long j2, int i) {
        super(r3Var);
        this.a = spliterator;
        this.b = r3Var.b;
        this.c = r3Var.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    public abstract r3 a(Spliterator spliterator, long j, long j2);

    public /* synthetic */ void accept(double d) {
        v3.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        r3 r3VarA = this;
        while (spliterator.estimateSize() > r3VarA.c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            r3VarA.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            r3VarA.a(spliteratorTrySplit, r3VarA.d, jEstimateSize).fork();
            r3VarA = r3VarA.a(spliterator, r3VarA.d + jEstimateSize, r3VarA.e - jEstimateSize);
        }
        r3VarA.b.R(spliterator, r3VarA);
        r3VarA.propagateCompletion();
    }

    @Override // j$.util.stream.l5
    public final void h(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ boolean m() {
        return false;
    }

    public /* synthetic */ void accept(int i) {
        v3.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        v3.l();
        throw null;
    }

    public r3(Spliterator spliterator, a aVar, int i) {
        this.a = spliterator;
        this.b = aVar;
        this.c = d.e(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void end() {
    }
}
