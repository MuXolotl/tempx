package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class r8 extends d {
    public final a h;
    public final IntFunction i;
    public final boolean j;
    public long k;
    public long l;

    public r8(a aVar, a aVar2, Spliterator spliterator, IntFunction intFunction) {
        super(aVar2, spliterator);
        this.h = aVar;
        this.i = intFunction;
        this.j = y6.ORDERED.o(aVar2.f);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // j$.util.stream.d
    public final Object a() {
        long jG;
        boolean zB = b();
        if (zB || !this.j) {
            jG = -1;
        } else {
            y6 y6Var = y6.SIZED;
            a aVar = this.h;
            int i = aVar.c;
            int i2 = y6Var.e;
            if ((i & i2) == i2) {
                jG = aVar.G(this.b);
            } else {
                jG = -1;
            }
        }
        y1 y1VarJ = this.a.J(jG, this.i);
        q8 q8VarH = ((p8) this.h).h(y1VarJ, this.j && !zB);
        this.a.R(this.b, q8VarH);
        g2 g2VarBuild = y1VarJ.build();
        this.k = g2VarBuild.count();
        this.l = q8VarH.n();
        return g2VarBuild;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new r8(this, spliterator);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        g2 g2VarF;
        d dVar = this.d;
        if (dVar != null) {
            if (this.j) {
                r8 r8Var = (r8) dVar;
                long j = r8Var.l;
                this.l = j;
                if (j == r8Var.k) {
                    this.l = j + ((r8) this.e).l;
                }
            }
            r8 r8Var2 = (r8) dVar;
            long j2 = r8Var2.k;
            r8 r8Var3 = (r8) this.e;
            this.k = j2 + r8Var3.k;
            if (r8Var2.k == 0) {
                g2VarF = (g2) r8Var3.f;
            } else {
                g2VarF = r8Var3.k == 0 ? (g2) r8Var2.f : v3.F(this.h.I(), (g2) ((r8) this.d).f, (g2) ((r8) this.e).f);
            }
            g2 g2VarE = g2VarF;
            if (b() && this.j) {
                g2VarE = g2VarE.e(this.l, g2VarE.count(), this.i);
            }
            this.f = g2VarE;
        }
        super.onCompletion(countedCompleter);
    }

    public r8(r8 r8Var, Spliterator spliterator) {
        super(r8Var, spliterator);
        this.h = r8Var.h;
        this.i = r8Var.i;
        this.j = r8Var.j;
    }
}
