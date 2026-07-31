package defpackage;

/* JADX INFO: renamed from: lٖۗ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16579l implements InterfaceC16588l {
    public static final C16579l yandex = new C16579l();
    public static final C16413l loadAd = AbstractC16814l.purchase("kotlinx.serialization.json.JsonNull", C2374l.amazon, new InterfaceC18035l[0]);

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        AbstractC7470l.metrica(interfaceC17739l);
        interfaceC17739l.amazon();
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        AbstractC7470l.startapp(interfaceC10726l);
        if (interfaceC10726l.pro()) {
            throw new C5114l(AbstractC2238l.crashlytics(-1, "Expected 'null' literal", null, null, null));
        }
        interfaceC10726l.startapp();
        return C5544l.INSTANCE;
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}
