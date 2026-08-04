package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: lٌؙٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16946l {
    public static final C16946l crashlytics = new C16946l();
    public final ConcurrentHashMap loadAd = new ConcurrentHashMap();
    public final C3585l yandex = new C3585l(2);

    public final InterfaceC5100l yandex(Class cls) {
        C1558l c1558l;
        InterfaceC5100l interfaceC5100lPro;
        AbstractC4579l.yandex(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.loadAd;
        InterfaceC5100l interfaceC5100l = (InterfaceC5100l) concurrentHashMap.get(cls);
        if (interfaceC5100l != null) {
            return interfaceC5100l;
        }
        C3585l c3585l = this.yandex;
        c3585l.getClass();
        Class cls2 = AbstractC0183l.yandex;
        if (!AbstractC8760l.class.isAssignableFrom(cls)) {
            Class cls3 = AbstractC16910l.yandex;
            Class cls4 = AbstractC0183l.yandex;
            if (cls4 != null && !cls4.isAssignableFrom(cls)) {
                C8339l.metrica("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
        }
        C13673l c13673lYandex = ((C18109l) c3585l.f7511l).yandex(cls);
        if ((c13673lYandex.amazon & 2) == 2) {
            Class cls5 = AbstractC16910l.yandex;
            if (AbstractC8760l.class.isAssignableFrom(cls)) {
                interfaceC5100lPro = new C7453l(AbstractC0183l.crashlytics, AbstractC8738l.yandex, c13673lYandex.yandex);
            } else {
                C5382l c5382l = AbstractC0183l.loadAd;
                C1558l c1558l2 = AbstractC8738l.loadAd;
                if (c1558l2 == null) {
                    C8339l.smaato("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                interfaceC5100lPro = new C7453l(c5382l, c1558l2, c13673lYandex.yandex);
            }
        } else {
            Class cls6 = AbstractC16910l.yandex;
            if (AbstractC8760l.class.isAssignableFrom(cls)) {
                C2823l c2823l = AbstractC17365l.loadAd;
                C9899l c9899l = AbstractC11687l.loadAd;
                C5382l c5382l2 = AbstractC0183l.crashlytics;
                C1558l c1558l3 = AbstractC5020l.inmobi(c13673lYandex.yandex()) != 1 ? AbstractC8738l.yandex : null;
                C3682l c3682l = AbstractC10255l.loadAd;
                if (!(c13673lYandex instanceof C13673l)) {
                    int[] iArr = C10736l.vip;
                    C18725l.loadAd();
                    return null;
                }
                interfaceC5100lPro = C10736l.pro(c13673lYandex, c2823l, c9899l, c5382l2, c1558l3, c3682l);
            } else {
                C2823l c2823l2 = AbstractC17365l.yandex;
                C9899l c9899l2 = AbstractC11687l.yandex;
                C5382l c5382l3 = AbstractC0183l.loadAd;
                if (AbstractC5020l.inmobi(c13673lYandex.yandex()) != 1) {
                    C1558l c1558l4 = AbstractC8738l.loadAd;
                    if (c1558l4 == null) {
                        C8339l.smaato("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                    c1558l = c1558l4;
                } else {
                    c1558l = null;
                }
                C3682l c3682l2 = AbstractC10255l.yandex;
                if (!(c13673lYandex instanceof C13673l)) {
                    int[] iArr2 = C10736l.vip;
                    C18725l.loadAd();
                    return null;
                }
                interfaceC5100lPro = C10736l.pro(c13673lYandex, c2823l2, c9899l2, c5382l3, c1558l, c3682l2);
            }
        }
        InterfaceC5100l interfaceC5100l2 = (InterfaceC5100l) concurrentHashMap.putIfAbsent(cls, interfaceC5100lPro);
        return interfaceC5100l2 != null ? interfaceC5100l2 : interfaceC5100lPro;
    }
}
