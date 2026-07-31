package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements m {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ n(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // j$.time.temporal.m
    public final l o(l lVar) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                int iJ = lVar.j(ChronoField.DAY_OF_WEEK);
                if (iJ == i2) {
                    return lVar;
                }
                int i3 = iJ - i2;
                return lVar.d(i3 >= 0 ? 7 - i3 : -i3, a.DAYS);
            default:
                int iJ2 = lVar.j(ChronoField.DAY_OF_WEEK);
                if (iJ2 == i2) {
                    return lVar;
                }
                int i4 = i2 - iJ2;
                return lVar.y(i4 >= 0 ? 7 - i4 : -i4, a.DAYS);
        }
    }
}
