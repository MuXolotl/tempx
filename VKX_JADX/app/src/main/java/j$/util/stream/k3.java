package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public class k3 implements e2 {
    public final long[] a;
    public int b;

    public k3(long j) {
        if (j >= 2147483639) {
            j$.time.d.c("Stream size exceeds max array size");
            throw null;
        }
        this.a = new long[(int) j];
        this.b = 0;
    }

    @Override // j$.util.stream.f2, j$.util.stream.g2
    public final f2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.f2
    public final Object b() {
        long[] jArr = this.a;
        int length = jArr.length;
        int i = this.b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override // j$.util.stream.f2
    public final void c(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (long[]) obj, i, i2);
    }

    @Override // j$.util.stream.g2
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.f2
    public final void d(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            longConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ g2 e(long j, long j2, IntFunction intFunction) {
        return v3.v(this, j, j2);
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void f(Object[] objArr, int i) {
        v3.p(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void forEach(Consumer consumer) {
        v3.s(this, consumer);
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ Object[] g(IntFunction intFunction) {
        return v3.m(this, intFunction);
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ int j() {
        return 0;
    }

    @Override // j$.util.stream.f2, j$.util.stream.g2
    public final j$.util.c1 spliterator() {
        int i = this.b;
        long[] jArr = this.a;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, 0, i);
        return new j$.util.q1(jArr, 0, i, 1040);
    }

    public String toString() {
        long[] jArr = this.a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.b), Arrays.toString(jArr));
    }

    @Override // j$.util.stream.g2
    public final /* bridge */ /* synthetic */ g2 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.g2
    public final Spliterator spliterator() {
        int i = this.b;
        long[] jArr = this.a;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, 0, i);
        return new j$.util.q1(jArr, 0, i, 1040);
    }

    public k3(long[] jArr) {
        this.a = jArr;
        this.b = jArr.length;
    }
}
