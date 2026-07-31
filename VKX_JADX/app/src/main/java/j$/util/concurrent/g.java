package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends l {
    public final l[] e;

    public g(l[] lVarArr) {
        super(-1, null, null);
        this.e = lVarArr;
    }

    @Override // j$.util.concurrent.l
    public final l a(int i, Object obj) {
        l lVarK;
        Object obj2;
        l[] lVarArr = this.e;
        while (true) {
            int length = lVarArr.length;
            if (length == 0 || (lVarK = ConcurrentHashMap.k(lVarArr, (length - 1) & i)) == null) {
                return null;
            }
            do {
                int i2 = lVarK.a;
                if (i2 == i && ((obj2 = lVarK.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return lVarK;
                }
                if (i2 >= 0) {
                    lVarK = lVarK.d;
                } else {
                    if (!(lVarK instanceof g)) {
                        return lVarK.a(i, obj);
                    }
                    lVarArr = ((g) lVarK).e;
                }
            } while (lVarK != null);
            return null;
        }
    }
}
