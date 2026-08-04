package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: lِٟٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17073l {
    public static final C17073l crashlytics = new C17073l();
    public final ConcurrentHashMap loadAd = new ConcurrentHashMap();
    public final C10975l yandex = new C10975l(1);

    public final InterfaceC0060l yandex(Class cls) {
        C8705l c8705l;
        InterfaceC0060l interfaceC0060lIsVip;
        Class cls2;
        AbstractC6061l.yandex(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.loadAd;
        InterfaceC0060l interfaceC0060l = (InterfaceC0060l) concurrentHashMap.get(cls);
        if (interfaceC0060l != null) {
            return interfaceC0060l;
        }
        C10975l c10975l = this.yandex;
        c10975l.getClass();
        Class cls3 = AbstractC5067l.yandex;
        if (!AbstractC13399l.class.isAssignableFrom(cls) && (cls2 = AbstractC5067l.yandex) != null && !cls2.isAssignableFrom(cls)) {
            C8339l.metrica("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        C1861l c1861lYandex = ((C17757l) c10975l.f22121l).yandex(cls);
        if ((c1861lYandex.amazon & 2) == 2) {
            if (AbstractC13399l.class.isAssignableFrom(cls)) {
                interfaceC0060lIsVip = new C3936l(AbstractC5067l.crashlytics, AbstractC4231l.yandex, c1861lYandex.yandex);
            } else {
                C18155l c18155l = AbstractC5067l.loadAd;
                C8705l c8705l2 = AbstractC4231l.loadAd;
                if (c8705l2 == null) {
                    C8339l.smaato("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                interfaceC0060lIsVip = new C3936l(c18155l, c8705l2, c1861lYandex.yandex);
            }
        } else if (AbstractC13399l.class.isAssignableFrom(cls)) {
            C17664l c17664l = AbstractC18385l.loadAd;
            C4863l c4863l = AbstractC12770l.loadAd;
            C18155l c18155l2 = AbstractC5067l.crashlytics;
            C8705l c8705l3 = AbstractC5020l.inmobi(c1861lYandex.yandex()) != 1 ? AbstractC4231l.yandex : null;
            C0035l c0035l = AbstractC3035l.loadAd;
            if (!(c1861lYandex instanceof C1861l)) {
                int[] iArr = C0372l.vip;
                C18725l.loadAd();
                return null;
            }
            interfaceC0060lIsVip = C0372l.isVip(c1861lYandex, c17664l, c4863l, c18155l2, c8705l3, c0035l);
        } else {
            C17664l c17664l2 = AbstractC18385l.yandex;
            C4863l c4863l2 = AbstractC12770l.yandex;
            C18155l c18155l3 = AbstractC5067l.loadAd;
            if (AbstractC5020l.inmobi(c1861lYandex.yandex()) != 1) {
                C8705l c8705l4 = AbstractC4231l.loadAd;
                if (c8705l4 == null) {
                    C8339l.smaato("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                c8705l = c8705l4;
            } else {
                c8705l = null;
            }
            C0035l c0035l2 = AbstractC3035l.yandex;
            if (!(c1861lYandex instanceof C1861l)) {
                int[] iArr2 = C0372l.vip;
                C18725l.loadAd();
                return null;
            }
            interfaceC0060lIsVip = C0372l.isVip(c1861lYandex, c17664l2, c4863l2, c18155l3, c8705l, c0035l2);
        }
        InterfaceC0060l interfaceC0060l2 = (InterfaceC0060l) concurrentHashMap.putIfAbsent(cls, interfaceC0060lIsVip);
        return interfaceC0060l2 != null ? interfaceC0060l2 : interfaceC0060lIsVip;
    }
}
