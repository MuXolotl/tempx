package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class i8 extends h5 implements q8 {
    public long b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ h8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(h8 h8Var, l5 l5Var, boolean z) {
        super(l5Var);
        this.e = h8Var;
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        if (this.c) {
            z = true;
        } else {
            boolean zTest = this.e.m.test(obj);
            this.c = !zTest;
            if (zTest) {
                z = false;
            } else {
                z = true;
            }
        }
        boolean z2 = this.d;
        if (z2 && !z) {
            this.b++;
        }
        if (z2 || z) {
            this.a.accept(obj);
        }
    }

    @Override // j$.util.stream.q8
    public final long n() {
        return this.b;
    }
}
