package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: lَۨٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10738l {
    public static final C10738l crashlytics = new C10738l();
    public final ConcurrentHashMap loadAd = new ConcurrentHashMap();
    public final C7972l yandex = new C7972l(1);

    public final InterfaceC9608l yandex(Class cls) {
        C0264l c0264l;
        InterfaceC9608l interfaceC9608lIsVip;
        Class cls2;
        AbstractC6320l.yandex(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.loadAd;
        InterfaceC9608l interfaceC9608l = (InterfaceC9608l) concurrentHashMap.get(cls);
        if (interfaceC9608l != null) {
            return interfaceC9608l;
        }
        C7972l c7972l = this.yandex;
        c7972l.getClass();
        Class cls3 = AbstractC9883l.yandex;
        if (!AbstractC12946l.class.isAssignableFrom(cls) && (cls2 = AbstractC9883l.yandex) != null && !cls2.isAssignableFrom(cls)) {
            C8339l.metrica("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        C15293l c15293lYandex = ((C3200l) c7972l.f16631l).yandex(cls);
        if ((c15293lYandex.amazon & 2) == 2) {
            if (AbstractC12946l.class.isAssignableFrom(cls)) {
                interfaceC9608lIsVip = new C12108l(AbstractC9883l.crashlytics, AbstractC1217l.yandex, c15293lYandex.yandex);
            } else {
                C2195l c2195l = AbstractC9883l.loadAd;
                C0264l c0264l2 = AbstractC1217l.loadAd;
                if (c0264l2 == null) {
                    C8339l.smaato("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                interfaceC9608lIsVip = new C12108l(c2195l, c0264l2, c15293lYandex.yandex);
            }
        } else if (AbstractC12946l.class.isAssignableFrom(cls)) {
            C4736l c4736l = AbstractC1151l.loadAd;
            C5018l c5018l = AbstractC13656l.loadAd;
            C2195l c2195l2 = AbstractC9883l.crashlytics;
            C0264l c0264l3 = AbstractC5020l.inmobi(c15293lYandex.yandex()) != 1 ? AbstractC1217l.yandex : null;
            C18328l c18328l = AbstractC1913l.loadAd;
            if (!(c15293lYandex instanceof C15293l)) {
                int[] iArr = C4694l.vip;
                C18725l.loadAd();
                return null;
            }
            interfaceC9608lIsVip = C4694l.isVip(c15293lYandex, c4736l, c5018l, c2195l2, c0264l3, c18328l);
        } else {
            C4736l c4736l2 = AbstractC1151l.yandex;
            C5018l c5018l2 = AbstractC13656l.yandex;
            C2195l c2195l3 = AbstractC9883l.loadAd;
            if (AbstractC5020l.inmobi(c15293lYandex.yandex()) != 1) {
                C0264l c0264l4 = AbstractC1217l.loadAd;
                if (c0264l4 == null) {
                    C8339l.smaato("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                c0264l = c0264l4;
            } else {
                c0264l = null;
            }
            C18328l c18328l2 = AbstractC1913l.yandex;
            if (!(c15293lYandex instanceof C15293l)) {
                int[] iArr2 = C4694l.vip;
                C18725l.loadAd();
                return null;
            }
            interfaceC9608lIsVip = C4694l.isVip(c15293lYandex, c4736l2, c5018l2, c2195l3, c0264l, c18328l2);
        }
        InterfaceC9608l interfaceC9608l2 = (InterfaceC9608l) concurrentHashMap.putIfAbsent(cls, interfaceC9608lIsVip);
        return interfaceC9608l2 != null ? interfaceC9608l2 : interfaceC9608lIsVip;
    }
}
