package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q2 extends i2 implements f2 {
    @Override // j$.util.stream.f2
    public final Object b() {
        long j = this.c;
        if (j >= 2147483639) {
            j$.time.d.c("Stream size exceeds max array size");
            return null;
        }
        Object objNewArray = newArray((int) j);
        c(0, objNewArray);
        return objNewArray;
    }

    @Override // j$.util.stream.f2
    public final void c(int i, Object obj) {
        g2 g2Var = this.a;
        ((f2) g2Var).c(i, obj);
        ((f2) this.b).c(i + ((int) ((f2) g2Var).count()), obj);
    }

    @Override // j$.util.stream.f2
    public final void d(Object obj) {
        ((f2) this.a).d(obj);
        ((f2) this.b).d(obj);
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ Object[] g(IntFunction intFunction) {
        return v3.m(this, intFunction);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j));
    }
}
