package j$.util;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends o implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new o(this.b);
    }

    @Override // j$.util.o, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new t(this.b.subList(i, i2));
    }
}
