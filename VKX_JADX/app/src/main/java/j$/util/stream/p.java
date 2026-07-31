package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends c5 {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(d5 d5Var, Consumer consumer) {
        super(d5Var, 0);
        this.l = 3;
        this.m = consumer;
    }

    @Override // j$.util.stream.a
    public final l5 N(int i, l5 l5Var) {
        switch (this.l) {
            case 0:
                return new n(this, l5Var, 0);
            case 1:
                return new t0(this, l5Var, 0);
            case 2:
                return new b1(this, l5Var, 0);
            case 3:
                return new l(this, l5Var, 1);
            case 4:
                return new l(this, l5Var, 2);
            case 5:
                return new l(this, l5Var, 3);
            default:
                return new k(this, l5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(a aVar, int i, Object obj, int i2) {
        super(aVar, i);
        this.l = i2;
        this.m = obj;
    }
}
