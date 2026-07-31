package defpackage;

/* JADX INFO: renamed from: lًؙۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6917l implements InterfaceC9234l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C11183l f14489l;

    public C6917l(C11183l c11183l) {
        this.f14489l = c11183l;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C6917l) && (obj instanceof InterfaceC9234l)) {
            return loadAd().equals(((InterfaceC9234l) obj).loadAd());
        }
        return false;
    }

    public final int hashCode() {
        return loadAd().hashCode();
    }

    @Override // defpackage.InterfaceC9234l
    public final InterfaceC14328l loadAd() {
        return new C1538l(0, this.f14489l, AbstractC2697l.class, "invalidateDraw", "invalidateDraw(Landroidx/compose/ui/node/DrawModifierNode;)V", 1, 0);
    }
}
