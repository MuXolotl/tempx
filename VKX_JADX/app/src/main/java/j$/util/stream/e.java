package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements g {
    public final /* synthetic */ BaseStream a;

    public /* synthetic */ e(BaseStream baseStream) {
        this.a = baseStream;
    }

    public static /* synthetic */ g h(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        if (baseStream instanceof f) {
            return ((f) baseStream).a;
        }
        if (baseStream instanceof DoubleStream) {
            return b0.h((DoubleStream) baseStream);
        }
        if (baseStream instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream);
        }
        if (baseStream instanceof LongStream) {
            return k1.h((LongStream) baseStream);
        }
        return baseStream instanceof java.util.stream.Stream ? w6.h((java.util.stream.Stream) baseStream) : new e(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.a;
        if (obj instanceof e) {
            obj = ((e) obj).a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g onClose(Runnable runnable) {
        return h(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g parallel() {
        return h(this.a.parallel());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g sequential() {
        return h(this.a.sequential());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.d1.a(this.a.spliterator());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g unordered() {
        return h(this.a.unordered());
    }
}
