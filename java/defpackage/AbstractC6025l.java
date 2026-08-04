package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lًؘۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6025l {
    public static final C8084l loadAd;
    public static final C8490l yandex;

    static {
        C8490l c8490lLoadAd = AbstractC3861l.loadAd(32, 2, 1);
        yandex = c8490lLoadAd;
        loadAd = new C8084l(c8490lLoadAd, null);
    }

    public static Object yandex(InterfaceC7702l interfaceC7702l, InterfaceC14029l interfaceC14029l) {
        Object objIsPro = yandex.isPro(interfaceC7702l, interfaceC14029l);
        return objIsPro == EnumC9342l.f19165l ? objIsPro : Unit.INSTANCE;
    }
}
