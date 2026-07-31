package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public interface g2 {
    g2 a(int i);

    long count();

    g2 e(long j, long j2, IntFunction intFunction);

    void f(Object[] objArr, int i);

    void forEach(Consumer consumer);

    Object[] g(IntFunction intFunction);

    int j();

    Spliterator spliterator();
}
