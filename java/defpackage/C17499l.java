package defpackage;

/* JADX INFO: renamed from: lُۣٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17499l implements InterfaceC16965l {
    @Override // defpackage.InterfaceC16965l
    public final int loadAd(InterfaceC11661l interfaceC11661l, InterfaceC11661l interfaceC11661l2, InterfaceC17477l interfaceC17477l) {
        if (!(interfaceC11661l2 instanceof InterfaceC10696l) || !(interfaceC11661l instanceof InterfaceC10696l)) {
            return 3;
        }
        InterfaceC10696l interfaceC10696l = (InterfaceC10696l) interfaceC11661l2;
        InterfaceC10696l interfaceC10696l2 = (InterfaceC10696l) interfaceC11661l;
        if (!AbstractC8576l.yandex(interfaceC10696l.getName(), interfaceC10696l2.getName())) {
            return 3;
        }
        if (AbstractC6710l.admob(interfaceC10696l) && AbstractC6710l.admob(interfaceC10696l2)) {
            return 1;
        }
        return (AbstractC6710l.admob(interfaceC10696l) || AbstractC6710l.admob(interfaceC10696l2)) ? 2 : 3;
    }

    @Override // defpackage.InterfaceC16965l
    public final int yandex() {
        return 3;
    }
}
