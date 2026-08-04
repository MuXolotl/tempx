package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٍِؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11720l extends AbstractC10794l {
    public final C2494l loadAd = new C2494l(new C9912l(8));
    public static final C9188l crashlytics = AbstractC1135l.purchase(2, false, null, 5).loadAd(3);
    public static final C9188l amazon = AbstractC1135l.purchase(2, false, null, 5).loadAd(2);

    public final AbstractC18041l admob(AbstractC18041l abstractC18041l, C9188l c9188l) {
        InterfaceC15234l interfaceC15234lPro = abstractC18041l.mo1339native().pro();
        if (interfaceC15234lPro instanceof InterfaceC16902l) {
            c9188l.getClass();
            return admob(this.loadAd.m1175l((InterfaceC16902l) interfaceC15234lPro, C9188l.yandex(c9188l, 0, true, null, null, 59)), c9188l);
        }
        if (!(interfaceC15234lPro instanceof InterfaceC17477l)) {
            C17132l.metrica(interfaceC15234lPro, "Unexpected declaration kind: ");
            return null;
        }
        InterfaceC15234l interfaceC15234lPro2 = AbstractC16570l.mopub(abstractC18041l).mo1339native().pro();
        if (!(interfaceC15234lPro2 instanceof InterfaceC17477l)) {
            C11467l.vip("For some reason declaration for upper bound is not a class but \"", interfaceC15234lPro2, "\" while for lower it's \"", interfaceC15234lPro, 34);
            return null;
        }
        C8195l c8195lMopub = mopub(AbstractC16570l.billing(abstractC18041l), (InterfaceC17477l) interfaceC15234lPro, crashlytics);
        AbstractC15211l abstractC15211l = (AbstractC15211l) c8195lMopub.f17098l;
        boolean zBooleanValue = ((Boolean) c8195lMopub.f17097l).booleanValue();
        C8195l c8195lMopub2 = mopub(AbstractC16570l.mopub(abstractC18041l), (InterfaceC17477l) interfaceC15234lPro2, amazon);
        AbstractC15211l abstractC15211l2 = (AbstractC15211l) c8195lMopub2.f17098l;
        return (zBooleanValue || ((Boolean) c8195lMopub2.f17097l).booleanValue()) ? new C6530l(abstractC15211l, abstractC15211l2, 0) : AbstractC3605l.subs(abstractC15211l, abstractC15211l2);
    }

    @Override // defpackage.AbstractC10794l
    public final AbstractC4946l amazon(AbstractC18041l abstractC18041l) {
        return new C10636l(admob(abstractC18041l, new C9188l(2, false, false, null, 62)));
    }

    public final C8195l mopub(AbstractC15211l abstractC15211l, InterfaceC17477l interfaceC17477l, C9188l c9188l) {
        if (abstractC15211l.mo1339native().getParameters().isEmpty()) {
            return new C8195l(abstractC15211l, Boolean.FALSE);
        }
        if (AbstractC16860l.advert(abstractC15211l)) {
            AbstractC4946l abstractC4946l = (AbstractC4946l) abstractC15211l.inmobi().get(0);
            return new C8195l(AbstractC3605l.ads(abstractC15211l.mo1340package(), abstractC15211l.mo1339native(), Collections.singletonList(new C10636l(abstractC4946l.yandex(), admob(abstractC4946l.loadAd(), c9188l))), abstractC15211l.mo1342throw()), Boolean.FALSE);
        }
        if (AbstractC11748l.subs(abstractC15211l)) {
            return new C8195l(C8741l.loadAd(EnumC5123l.f11148l, abstractC15211l.mo1339native().toString()), Boolean.FALSE);
        }
        InterfaceC7637l interfaceC7637lMo2889instanceof = interfaceC17477l.mo2889instanceof(this);
        C16017l c16017lMo1340package = abstractC15211l.mo1340package();
        InterfaceC1925l interfaceC1925lMetrica = interfaceC17477l.metrica();
        List<InterfaceC16902l> parameters = interfaceC17477l.metrica().getParameters();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(parameters, 10));
        for (InterfaceC16902l interfaceC16902l : parameters) {
            arrayList.add(C9912l.admob(interfaceC16902l, c9188l, this.loadAd.m1175l(interfaceC16902l, c9188l)));
        }
        return new C8195l(AbstractC3605l.tapsense(c16017lMo1340package, interfaceC1925lMetrica, arrayList, abstractC15211l.mo1342throw(), interfaceC7637lMo2889instanceof, new C15332l(interfaceC17477l, this, abstractC15211l, c9188l)), Boolean.TRUE);
    }
}
