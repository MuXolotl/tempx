package defpackage;

/* JADX INFO: renamed from: lٔۦٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15314l implements InterfaceC16588l {
    public static final C15314l yandex = new C15314l();
    public static final C16413l loadAd = AbstractC16814l.purchase("kotlinx.serialization.json.JsonPrimitive", C15358l.smaato, new InterfaceC18035l[0]);

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        AbstractC18121l abstractC18121l = (AbstractC18121l) obj;
        AbstractC7470l.metrica(interfaceC17739l);
        if (abstractC18121l instanceof C5544l) {
            interfaceC17739l.purchase(C16579l.yandex, C5544l.INSTANCE);
        } else {
            interfaceC17739l.purchase(C8465l.yandex, (C16192l) abstractC18121l);
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC17487l interfaceC17487lStartapp = AbstractC7470l.startapp(interfaceC10726l);
        AbstractC9914l abstractC9914lFirebase = interfaceC17487lStartapp.firebase();
        if (abstractC9914lFirebase instanceof AbstractC18121l) {
            return (AbstractC18121l) abstractC9914lFirebase;
        }
        throw new C5114l(AbstractC2238l.crashlytics(-1, AbstractC0653l.metrica(AbstractC18202l.yandex, abstractC9914lFirebase.getClass(), new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ")), null, null, interfaceC17487lStartapp.advert().yandex.smaato ? AbstractC2238l.mopub(abstractC9914lFirebase.toString(), -1).toString() : null));
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}
