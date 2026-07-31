package j$.util.stream;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract class z5 extends h5 {
    public final Comparator b;
    public boolean c;

    public z5(l5 l5Var, Comparator comparator) {
        super(l5Var);
        this.b = comparator;
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final boolean m() {
        this.c = true;
        return false;
    }
}
