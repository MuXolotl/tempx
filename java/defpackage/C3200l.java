package defpackage;

/* JADX INFO: renamed from: lِؕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3200l implements InterfaceC3858l {
    public InterfaceC3858l[] yandex;

    @Override // defpackage.InterfaceC3858l
    public final boolean loadAd(Class cls) {
        for (InterfaceC3858l interfaceC3858l : this.yandex) {
            if (interfaceC3858l.loadAd(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC3858l
    public final C15293l yandex(Class cls) {
        for (InterfaceC3858l interfaceC3858l : this.yandex) {
            if (interfaceC3858l.loadAd(cls)) {
                return interfaceC3858l.yandex(cls);
            }
        }
        C10754l.ads("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }
}
