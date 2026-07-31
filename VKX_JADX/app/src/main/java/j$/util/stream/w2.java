package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class w2 extends z2 implements c2 {
    @Override // j$.util.stream.z2, j$.util.stream.g2
    public final f2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.f2
    public final /* bridge */ /* synthetic */ Object b() {
        return v3.e;
    }

    @Override // j$.util.stream.z2, j$.util.stream.g2
    public final /* synthetic */ g2 e(long j, long j2, IntFunction intFunction) {
        return v3.u(this, j, j2);
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void f(Object[] objArr, int i) {
        v3.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void forEach(Consumer consumer) {
        v3.r(this, consumer);
    }

    @Override // j$.util.stream.g2
    public final /* bridge */ /* synthetic */ j$.util.c1 spliterator() {
        return Spliterators.b;
    }

    @Override // j$.util.stream.g2
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.b;
    }

    @Override // j$.util.stream.z2, j$.util.stream.g2
    public final /* bridge */ /* synthetic */ g2 a(int i) {
        a(i);
        throw null;
    }
}
