package j$.util.stream;

import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n1 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;

    public /* synthetic */ n1(t1 t1Var, int i) {
        this.a = i;
        this.b = t1Var;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new q1(this.b);
            case 1:
                return new p1(this.b);
            default:
                return new r1(this.b);
        }
    }
}
