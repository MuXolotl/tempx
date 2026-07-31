package j$.util.stream;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements BaseStream {
    public final /* synthetic */ g a;

    public /* synthetic */ f(g gVar) {
        this.a = gVar;
    }

    public static /* synthetic */ BaseStream h(g gVar) {
        if (gVar == null) {
            return null;
        }
        if (gVar instanceof e) {
            return ((e) gVar).a;
        }
        if (gVar instanceof d0) {
            return c0.h((d0) gVar);
        }
        if (gVar instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) gVar);
        }
        if (gVar instanceof m1) {
            return l1.h((m1) gVar);
        }
        return gVar instanceof Stream ? Stream.Wrapper.convert((Stream) gVar) : new f(gVar);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws Exception {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        g gVar = this.a;
        if (obj instanceof f) {
            obj = ((f) obj).a;
        }
        return gVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return h(this.a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return h(this.a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return h(this.a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(this.a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return h(this.a.unordered());
    }
}
