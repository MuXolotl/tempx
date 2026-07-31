package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: lٓؖٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13940l {
    public static final C13940l crashlytics = new C13940l();
    public final ConcurrentHashMap loadAd = new ConcurrentHashMap();
    public final C4381l yandex = new C4381l();

    public final InterfaceC12353l yandex(Class cls) {
        InterfaceC12353l c8799l;
        Charset charset = AbstractC11565l.yandex;
        if (cls == null) {
            C6541l.subs("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.loadAd;
        InterfaceC12353l interfaceC12353l = (InterfaceC12353l) concurrentHashMap.get(cls);
        if (interfaceC12353l != null) {
            return interfaceC12353l;
        }
        C4381l c4381l = this.yandex;
        c4381l.getClass();
        C6162l c6162l = AbstractC17663l.yandex;
        AbstractC15603l.class.isAssignableFrom(cls);
        C9025l c9025lLoadAd = c4381l.yandex.loadAd(cls);
        if ((c9025lLoadAd.amazon & 2) == 2) {
            C6162l c6162l2 = AbstractC17663l.yandex;
            C6096l c6096l = AbstractC14987l.yandex;
            c8799l = new C8799l(c6162l2, c9025lLoadAd.yandex);
        } else {
            int i = AbstractC3467l.yandex;
            int i2 = AbstractC0319l.yandex;
            C6162l c6162l3 = AbstractC17663l.yandex;
            C6096l c6096l2 = c9025lLoadAd.yandex() + (-1) != 1 ? AbstractC14987l.yandex : null;
            int i3 = AbstractC5621l.yandex;
            c8799l = C17414l.license(c9025lLoadAd, c6162l3, c6096l2);
        }
        InterfaceC12353l interfaceC12353l2 = (InterfaceC12353l) concurrentHashMap.putIfAbsent(cls, c8799l);
        return interfaceC12353l2 == null ? c8799l : interfaceC12353l2;
    }
}
