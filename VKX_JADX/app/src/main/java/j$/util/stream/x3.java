package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class x3 extends r4 implements q4, k5 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjLongConsumer c;
    public final /* synthetic */ o d;

    public x3(Supplier supplier, ObjLongConsumer objLongConsumer, o oVar) {
        this.b = supplier;
        this.c = objLongConsumer;
        this.d = oVar;
    }

    @Override // j$.util.stream.l5
    public final void accept(long j) {
        this.c.accept(this.a, j);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.l5
    public final void h(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void o(Long l) {
        v3.i(this, l);
    }

    @Override // j$.util.stream.q4
    public final void r(q4 q4Var) {
        this.a = this.d.apply(this.a, ((x3) q4Var).a);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(int i) {
        v3.k();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        o((Long) obj);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(double d) {
        v3.d();
        throw null;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void end() {
    }
}
