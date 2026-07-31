package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class x4 extends d {
    public final v3 h;

    public x4(x4 x4Var, Spliterator spliterator) {
        super(x4Var, spliterator);
        this.h = x4Var.h;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.a;
        q4 q4VarY = this.h.Y();
        aVar.R(this.b, q4VarY);
        return q4VarY;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new x4(this, spliterator);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            q4 q4Var = (q4) ((x4) dVar).f;
            q4Var.r((q4) ((x4) this.e).f);
            this.f = q4Var;
        }
        super.onCompletion(countedCompleter);
    }

    public x4(v3 v3Var, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.h = v3Var;
    }
}
