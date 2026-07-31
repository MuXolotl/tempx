package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٗؐۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16821l {
    public static final C11911l yandex;

    static {
        InterfaceC13012l interfaceC13012lLoadAd;
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(List.class);
        try {
            C0861l c0861l = C0861l.crashlytics;
            interfaceC13012lLoadAd = AbstractC18202l.loadAd(List.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C5254l.class)));
        } catch (Throwable unused) {
            interfaceC13012lLoadAd = null;
        }
        yandex = new C11911l("DefaultContentTypes", new C11310l(interfaceC1388lLoadAd, interfaceC13012lLoadAd));
    }
}
