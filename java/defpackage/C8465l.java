package defpackage;

/* JADX INFO: renamed from: lٌؐٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8465l implements InterfaceC16588l {
    public static final C8465l yandex = new C8465l();
    public static final C17606l loadAd = AbstractC16814l.crashlytics("kotlinx.serialization.json.JsonLiteral");

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        Boolean bool;
        C16192l c16192l = (C16192l) obj;
        String str = c16192l.f31680l;
        AbstractC7470l.metrica(interfaceC17739l);
        if (c16192l.f31681l) {
            interfaceC17739l.subscription(str);
            return;
        }
        Long lPremium = AbstractC16648l.premium(str);
        if (lPremium != null) {
            interfaceC17739l.adcel(lPremium.longValue());
            return;
        }
        C10882l c10882lFirebase = AbstractC3474l.firebase(str);
        if (c10882lFirebase != null) {
            interfaceC17739l.isPro(C15256l.loadAd).adcel(c10882lFirebase.f21996l);
            return;
        }
        Double dVip = AbstractC12673l.vip(str);
        if (dVip != null) {
            interfaceC17739l.billing(dVip.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else {
            bool = str.equals("false") ? Boolean.FALSE : null;
        }
        if (bool != null) {
            interfaceC17739l.subs(bool.booleanValue());
        } else {
            interfaceC17739l.subscription(str);
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC17487l interfaceC17487lStartapp = AbstractC7470l.startapp(interfaceC10726l);
        AbstractC9914l abstractC9914lFirebase = interfaceC17487lStartapp.firebase();
        if (abstractC9914lFirebase instanceof C16192l) {
            return (C16192l) abstractC9914lFirebase;
        }
        throw new C5114l(AbstractC2238l.crashlytics(-1, AbstractC0653l.metrica(AbstractC18202l.yandex, abstractC9914lFirebase.getClass(), new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ")), null, null, interfaceC17487lStartapp.advert().yandex.smaato ? AbstractC2238l.mopub(abstractC9914lFirebase.toString(), -1).toString() : null));
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}
