package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class m3 extends s6 implements e2, x1 {
    @Override // j$.util.stream.f2, j$.util.stream.g2
    public final f2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(double d) {
        v3.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.u6, j$.util.stream.f2
    public final Object b() {
        return (long[]) super.b();
    }

    @Override // j$.util.stream.u6, j$.util.stream.f2
    public final void c(int i, Object obj) {
        super.c(i, (long[]) obj);
    }

    @Override // j$.util.stream.u6, j$.util.stream.f2
    public final void d(Object obj) {
        super.d((LongConsumer) obj);
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
    public final /* synthetic */ Object[] g(IntFunction intFunction) {
        return v3.m(this, intFunction);
    }

    @Override // j$.util.stream.l5
    public final void h(long j) {
        clear();
        q(j);
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ int j() {
        return 0;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void o(Long l) {
        v3.i(this, l);
    }

    @Override // j$.util.stream.s6, j$.util.stream.u6, java.lang.Iterable, j$.util.stream.g2
    public final j$.util.c1 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.y1
    public final g2 build() {
        return this;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(int i) {
        v3.k();
        throw null;
    }

    @Override // j$.util.stream.s6, j$.util.stream.u6, java.lang.Iterable, j$.util.stream.g2
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.g2
    public final /* bridge */ /* synthetic */ g2 a(int i) {
        a(i);
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        o((Long) obj);
    }

    @Override // j$.util.stream.x1, j$.util.stream.y1
    public final e2 build() {
        return this;
    }

    @Override // j$.util.stream.l5
    public final void end() {
    }
}
