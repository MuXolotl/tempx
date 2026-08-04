package defpackage;

/* JADX INFO: renamed from: lؚ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17757l implements InterfaceC4282l {
    public InterfaceC4282l[] yandex;

    @Override // defpackage.InterfaceC4282l
    public final boolean loadAd(Class cls) {
        for (InterfaceC4282l interfaceC4282l : this.yandex) {
            if (interfaceC4282l.loadAd(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC4282l
    public final C1861l yandex(Class cls) {
        for (InterfaceC4282l interfaceC4282l : this.yandex) {
            if (interfaceC4282l.loadAd(cls)) {
                return interfaceC4282l.yandex(cls);
            }
        }
        C10754l.ads("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }
}
