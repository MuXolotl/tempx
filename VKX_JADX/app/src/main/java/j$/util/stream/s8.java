package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class s8 extends b {
    public final a j;
    public final IntFunction k;
    public final boolean l;
    public long m;
    public boolean n;
    public volatile boolean o;

    public s8(a aVar, a aVar2, Spliterator spliterator, IntFunction intFunction) {
        super(aVar2, spliterator);
        this.j = aVar;
        this.k = intFunction;
        this.l = y6.ORDERED.o(aVar2.f);
    }

    @Override // j$.util.stream.d
    public final Object a() {
        y1 y1VarJ = this.a.J(-1L, this.k);
        l5 l5VarN = this.j.N(this.a.f, y1VarJ);
        a aVar = this.a;
        boolean zB = aVar.B(this.b, aVar.S(l5VarN));
        this.n = zB;
        if (zB) {
            g();
        }
        g2 g2VarBuild = y1VarJ.build();
        this.m = g2VarBuild.count();
        return g2VarBuild;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new s8(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final void f() {
        this.i = true;
        if (this.l && this.o) {
            d(v3.H(this.j.I()));
        }
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return v3.H(this.j.I());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        s8 s8Var;
        s8 s8Var2;
        Object objF;
        d dVar = this.d;
        if (dVar != null) {
            this.n = ((s8) dVar).n | ((s8) this.e).n;
            if (this.l && this.i) {
                this.m = 0L;
                objF = v3.H(this.j.I());
            } else if (this.l) {
                s8 s8Var3 = (s8) this.d;
                if (s8Var3.n) {
                    this.m = s8Var3.m;
                    objF = (g2) s8Var3.i();
                } else {
                    s8Var = (s8) this.d;
                    long j = s8Var.m;
                    s8Var2 = (s8) this.e;
                    this.m = j + s8Var2.m;
                    if (s8Var.m == 0) {
                        objF = (g2) s8Var2.i();
                    } else if (s8Var2.m == 0) {
                        objF = (g2) s8Var.i();
                    } else {
                        objF = v3.F(this.j.I(), (g2) ((s8) this.d).i(), (g2) ((s8) this.e).i());
                    }
                }
            } else {
                s8Var = (s8) this.d;
                long j2 = s8Var.m;
                s8Var2 = (s8) this.e;
                this.m = j2 + s8Var2.m;
                if (s8Var.m == 0) {
                    objF = (g2) s8Var2.i();
                } else if (s8Var2.m == 0) {
                    objF = (g2) s8Var.i();
                } else {
                    objF = v3.F(this.j.I(), (g2) ((s8) this.d).i(), (g2) ((s8) this.e).i());
                }
            }
            d(objF);
        }
        this.o = true;
        super.onCompletion(countedCompleter);
    }

    public s8(s8 s8Var, Spliterator spliterator) {
        super(s8Var, spliterator);
        this.j = s8Var.j;
        this.k = s8Var.k;
        this.l = s8Var.l;
    }
}
