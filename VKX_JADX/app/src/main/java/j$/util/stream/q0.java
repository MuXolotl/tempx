package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q0 implements e8, f8 {
    public final boolean a;

    public q0(boolean z) {
        this.a = z;
    }

    public /* synthetic */ void accept(double d) {
        v3.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.e8
    public final int c() {
        if (this.a) {
            return 0;
        }
        return y6.r;
    }

    public final void d(a aVar, Spliterator spliterator) {
        if (this.a) {
            new r0(aVar, spliterator, this).invoke();
        } else {
            new s0(aVar, spliterator, aVar.S(this)).invoke();
        }
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ boolean m() {
        return false;
    }

    public /* synthetic */ void accept(int i) {
        v3.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        v3.l();
        throw null;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void h(long j) {
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void end() {
    }
}
