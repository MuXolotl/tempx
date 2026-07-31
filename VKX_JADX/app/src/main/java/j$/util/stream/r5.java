package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class r5 extends h1 {
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(j1 j1Var, int i, long j, long j2) {
        super(j1Var, i);
        this.l = j;
        this.m = j2;
    }

    @Override // j$.util.stream.a
    public final g2 K(a aVar, Spliterator spliterator, IntFunction intFunction) {
        long jMin;
        long j;
        long jG = aVar.G(spliterator);
        if (jG > 0 && spliterator.hasCharacteristics(16384)) {
            a aVar2 = aVar;
            while (aVar2.e > 0) {
                aVar2 = aVar2.b;
            }
            return v3.E(aVar, v3.y(aVar2.I(), spliterator, this.l, this.m), true);
        }
        if (y6.ORDERED.o(aVar.f)) {
            return (g2) new v5(this, aVar, spliterator, intFunction, this.l, this.m).invoke();
        }
        j$.util.z0 z0Var = (j$.util.z0) aVar.T(spliterator);
        long j2 = this.l;
        long j3 = this.m;
        if (j2 <= jG) {
            long j4 = jG - j2;
            jMin = j3 >= 0 ? Math.min(j3, j4) : j4;
            j = 0;
        } else {
            jMin = j3;
            j = j2;
        }
        return v3.E(this, new w7(z0Var, j, jMin), true);
    }

    @Override // j$.util.stream.a
    public final Spliterator L(a aVar, Spliterator spliterator) {
        long jG = aVar.G(spliterator);
        if (jG > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.z0 z0Var = (j$.util.z0) aVar.T(spliterator);
            long j = this.l;
            return new q7(z0Var, j, v3.A(j, this.m));
        }
        if (y6.ORDERED.o(aVar.f)) {
            return ((g2) new v5(this, aVar, spliterator, new c1(16), this.l, this.m).invoke()).spliterator();
        }
        j$.util.z0 z0Var2 = (j$.util.z0) aVar.T(spliterator);
        long j2 = this.l;
        long jMin = this.m;
        if (j2 <= jG) {
            long j3 = jG - j2;
            jMin = jMin >= 0 ? Math.min(jMin, j3) : j3;
            j2 = 0;
        }
        return new w7(z0Var2, j2, jMin);
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        return new q5(this, l5Var);
    }
}
