package defpackage;

/* JADX INFO: renamed from: lّۥۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12976l implements InterfaceC16588l {
    public static final C12976l yandex = new C12976l();
    public static final C16413l loadAd = AbstractC16814l.amazon("kotlinx.serialization.json.JsonElement", C0196l.purchase, new InterfaceC18035l[0], new C2613l(12));

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        AbstractC9914l abstractC9914l = (AbstractC9914l) obj;
        AbstractC7470l.metrica(interfaceC17739l);
        if (abstractC9914l instanceof AbstractC18121l) {
            interfaceC17739l.purchase(C15314l.yandex, abstractC9914l);
            return;
        }
        if (abstractC9914l instanceof C18010l) {
            interfaceC17739l.purchase(C14283l.yandex, abstractC9914l);
        } else if (abstractC9914l instanceof C18427l) {
            interfaceC17739l.purchase(C14417l.yandex, abstractC9914l);
        } else {
            C18725l.billing();
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        return AbstractC7470l.startapp(interfaceC10726l).firebase();
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}
