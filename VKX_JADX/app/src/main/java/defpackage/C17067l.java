package defpackage;

/* JADX INFO: renamed from: lِّٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17067l implements InterfaceC9876l {
    public final C2350l yandex;

    public C17067l(C2350l c2350l) {
        this.yandex = c2350l;
    }

    @Override // defpackage.InterfaceC9876l
    public final boolean loadAd(C16745l c16745l) {
        int i = c16745l.loadAd;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.yandex.amazon(c16745l.yandex);
        return true;
    }

    @Override // defpackage.InterfaceC9876l
    public final boolean yandex(Exception exc) {
        return false;
    }
}
