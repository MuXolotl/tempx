package defpackage;

/* JADX INFO: renamed from: lٟ٘ۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18109l implements InterfaceC15805l {
    public InterfaceC15805l[] yandex;

    @Override // defpackage.InterfaceC15805l
    public final boolean loadAd(Class cls) {
        for (InterfaceC15805l interfaceC15805l : this.yandex) {
            if (interfaceC15805l.loadAd(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC15805l
    public final C13673l yandex(Class cls) {
        for (InterfaceC15805l interfaceC15805l : this.yandex) {
            if (interfaceC15805l.loadAd(cls)) {
                return interfaceC15805l.yandex(cls);
            }
        }
        C10754l.ads("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }
}
