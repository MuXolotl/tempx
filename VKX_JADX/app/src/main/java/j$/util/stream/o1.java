package j$.util.stream;

import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class o1 extends s1 {
    public final /* synthetic */ t1 c;
    public final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(t1 t1Var, Predicate predicate) {
        super(t1Var);
        this.c = t1Var;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(obj);
        t1 t1Var = this.c;
        if (zTest == t1Var.a) {
            this.a = true;
            this.b = t1Var.b;
        }
    }
}
