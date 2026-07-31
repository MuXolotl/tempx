package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class w7 extends x7 implements j$.util.z0, LongConsumer {
    public long f;

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.a8
    public final Spliterator b(Spliterator spliterator) {
        return new w7((j$.util.z0) spliterator, this);
    }

    @Override // j$.util.stream.x7
    public final void d(Object obj) {
        ((LongConsumer) obj).accept(this.f);
    }

    @Override // j$.util.stream.x7
    public final e7 e(int i) {
        return new d7(i);
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
