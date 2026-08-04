package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: lؘؓؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1653l {
    public static final C3624l yandex;

    static {
        C2312l c2312l = new C2312l("java.lang.Void");
        yandex = new C3624l(c2312l.loadAd(), c2312l.yandex.mopub());
    }

    public static AbstractC7439l crashlytics(InterfaceC4884l interfaceC4884l) {
        Method method;
        InterfaceC4884l interfaceC4884lMo864l = ((InterfaceC4884l) AbstractC11125l.ads(interfaceC4884l)).mo864l();
        if (interfaceC4884lMo864l instanceof InterfaceC11333l) {
            InterfaceC13847l interfaceC13847l = (InterfaceC13847l) interfaceC4884lMo864l;
            AbstractC14080l abstractC14080lMo682private = interfaceC13847l.mo682private();
            if (abstractC14080lMo682private instanceof C14036l) {
                C3429l c3429l = C11682l.yandex;
                C0166l c0166lCrashlytics = C11682l.crashlytics((C14036l) abstractC14080lMo682private, interfaceC13847l.mo683this(), interfaceC13847l.mo678goto());
                if (c0166lCrashlytics != null) {
                    return new C5061l(c0166lCrashlytics);
                }
            }
            if (abstractC14080lMo682private instanceof C13347l) {
                C3429l c3429l2 = C11682l.yandex;
                C0166l c0166lYandex = C11682l.yandex((C13347l) abstractC14080lMo682private, interfaceC13847l.mo683this(), interfaceC13847l.mo678goto());
                if (c0166lYandex != null) {
                    return AbstractC6245l.yandex(interfaceC4884l.Signature()) ? new C5061l(c0166lYandex) : new C18336l(c0166lYandex);
                }
            }
            return yandex(interfaceC4884lMo864l);
        }
        if (interfaceC4884lMo864l instanceof C12113l) {
            InterfaceC5706l interfaceC5706lBilling = ((C12113l) interfaceC4884lMo864l).billing();
            C11197l c11197l = interfaceC5706lBilling instanceof C11197l ? (C11197l) interfaceC5706lBilling : null;
            AbstractC1132l abstractC1132l = c11197l != null ? c11197l.f22549l : null;
            C1734l c1734l = abstractC1132l instanceof C1734l ? (C1734l) abstractC1132l : null;
            if (c1734l != null && (method = c1734l.yandex) != null) {
                return new C4890l(method);
            }
            C11467l.Signature(interfaceC4884lMo864l, "Incorrect resolution sequence for Java method ");
            return null;
        }
        if (!(interfaceC4884lMo864l instanceof C4142l)) {
            return yandex(interfaceC4884lMo864l);
        }
        InterfaceC5706l interfaceC5706lBilling2 = ((C4142l) interfaceC4884lMo864l).billing();
        C11197l c11197l2 = interfaceC5706lBilling2 instanceof C11197l ? (C11197l) interfaceC5706lBilling2 : null;
        AbstractC1132l abstractC1132l2 = c11197l2 != null ? c11197l2.f22549l : null;
        if (abstractC1132l2 instanceof C17140l) {
            return new C13796l(((C17140l) abstractC1132l2).yandex);
        }
        if (abstractC1132l2 instanceof C12875l) {
            Class cls = ((C12875l) abstractC1132l2).yandex;
            if (cls.isAnnotation()) {
                return new C10922l(cls);
            }
        }
        C8936l.vip("Incorrect resolution sequence for Java constructor ", interfaceC4884lMo864l, " (", abstractC1132l2);
        return null;
    }

    public static AbstractC2648l loadAd(InterfaceC10696l interfaceC10696l) {
        InterfaceC10696l interfaceC10696lMo864l = ((InterfaceC10696l) AbstractC11125l.ads(interfaceC10696l)).mo864l();
        if (interfaceC10696lMo864l instanceof C1689l) {
            C1689l c1689l = (C1689l) interfaceC10696lMo864l;
            C13146l c13146l = c1689l.f4064l;
            C10459l c10459l = (C10459l) AbstractC0714l.loadAd(c13146l, AbstractC8450l.amazon);
            if (c10459l != null) {
                return new C8632l(interfaceC10696lMo864l, c13146l, c10459l, c1689l.f4065l, c1689l.f4067l);
            }
        } else if (interfaceC10696lMo864l instanceof C4099l) {
            C4099l c4099l = (C4099l) interfaceC10696lMo864l;
            InterfaceC5706l interfaceC5706lBilling = c4099l.billing();
            C11197l c11197l = interfaceC5706lBilling instanceof C11197l ? (C11197l) interfaceC5706lBilling : null;
            AbstractC1132l abstractC1132l = c11197l != null ? c11197l.f22549l : null;
            if (abstractC1132l instanceof C0865l) {
                return new C1702l(((C0865l) abstractC1132l).yandex);
            }
            if (!(abstractC1132l instanceof C1734l)) {
                C8936l.vip("Incorrect resolution sequence for Java field ", interfaceC10696lMo864l, " (source = ", abstractC1132l);
                return null;
            }
            Method method = ((C1734l) abstractC1132l).yandex;
            C1710l c1710l = c4099l.f26365l;
            InterfaceC5706l interfaceC5706lBilling2 = c1710l != null ? c1710l.billing() : null;
            C11197l c11197l2 = interfaceC5706lBilling2 instanceof C11197l ? (C11197l) interfaceC5706lBilling2 : null;
            AbstractC1132l abstractC1132l2 = c11197l2 != null ? c11197l2.f22549l : null;
            C1734l c1734l = abstractC1132l2 instanceof C1734l ? (C1734l) abstractC1132l2 : null;
            return new C15753l(method, c1734l != null ? c1734l.yandex : null);
        }
        C5061l c5061lYandex = yandex(interfaceC10696lMo864l.crashlytics());
        C1710l c1710lAmazon = interfaceC10696lMo864l.amazon();
        return new C18515l(c5061lYandex, c1710lAmazon != null ? yandex(c1710lAmazon) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C5061l yandex(InterfaceC4884l interfaceC4884l) {
        String strLoadAd = AbstractC11784l.loadAd(interfaceC4884l);
        if (strLoadAd == null) {
            if (interfaceC4884l instanceof C11425l) {
                strLoadAd = AbstractC4792l.yandex(AbstractC3759l.subs(interfaceC4884l).getName().loadAd());
            } else if (interfaceC4884l instanceof C1710l) {
                String strLoadAd2 = AbstractC3759l.subs(interfaceC4884l).getName().loadAd();
                strLoadAd = "set".concat(AbstractC4792l.loadAd(strLoadAd2) ? strLoadAd2.substring(2) : AbstractC15901l.yandex(strLoadAd2));
            } else {
                strLoadAd = ((AbstractC2775l) interfaceC4884l).getName().loadAd();
            }
        }
        return new C5061l(new C0166l(strLoadAd, AbstractC17860l.loadAd(interfaceC4884l, 1)));
    }
}
