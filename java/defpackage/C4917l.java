package defpackage;

/* JADX INFO: renamed from: lْٖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4917l implements InterfaceC9234l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C4917l f10026l = new C4917l();

    public final boolean equals(Object obj) {
        if ((obj instanceof C4917l) && (obj instanceof InterfaceC9234l)) {
            return loadAd().equals(((InterfaceC9234l) obj).loadAd());
        }
        return false;
    }

    public final int hashCode() {
        return loadAd().hashCode();
    }

    @Override // defpackage.InterfaceC9234l
    public final InterfaceC14328l loadAd() {
        return new C1538l(4, C16793l.class, "<init>", "<init>(Lcom/arkivanov/essenty/lifecycle/Lifecycle;Lcom/arkivanov/essenty/statekeeper/StateKeeper;Lcom/arkivanov/essenty/instancekeeper/InstanceKeeper;Lcom/arkivanov/essenty/backhandler/BackHandler;)V", 0);
    }
}
