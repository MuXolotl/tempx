package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class q7 extends r7 implements j$.util.z0 {
    @Override // j$.util.stream.t7
    public final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new q7((j$.util.z0) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.r7
    public final Object b() {
        return new d2(1);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.m(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.D(this, consumer);
    }
}
