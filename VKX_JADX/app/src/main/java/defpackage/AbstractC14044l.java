package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: lٍٜٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14044l {
    public static final C11911l yandex;

    static {
        InterfaceC13012l interfaceC13012lAmazon;
        C2336l c2336l = AbstractC18202l.yandex;
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(Map.class);
        try {
            interfaceC13012lAmazon = c2336l.amazon(c2336l.remoteconfig(c2336l.loadAd(Map.class), Arrays.asList(AbstractC12953l.smaato(AbstractC18202l.loadAd(InterfaceC17183l.class, C0861l.crashlytics)), AbstractC12953l.smaato(AbstractC18202l.yandex(Object.class))), false));
        } catch (Throwable unused) {
            interfaceC13012lAmazon = null;
        }
        yandex = new C11911l("EngineCapabilities", new C11310l(interfaceC1388lLoadAd, interfaceC13012lAmazon));
        Collections.singleton(C10837l.yandex);
    }
}
