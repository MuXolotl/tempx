package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class p2 extends q2 implements e2 {
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

    @Override // j$.util.stream.f2
    public final Object newArray(int i) {
        return new long[i];
    }

    @Override // j$.util.stream.g2
    public final j$.util.c1 spliterator() {
        return new g3(this);
    }

    @Override // j$.util.stream.g2
    public final Spliterator spliterator() {
        return new g3(this);
    }
}
