package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؗؗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4689l {
    public static final C11911l crashlytics;
    public static final InterfaceC6272l yandex = AbstractC1937l.loadAd("io.ktor.client.plugins.compression.ContentEncoding");
    public static final C18449l loadAd = new C18449l("HttpEncoding", C2107l.f4737l, new C4100l(22));

    static {
        InterfaceC13012l interfaceC13012lLoadAd;
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(List.class);
        InterfaceC13012l interfaceC13012lLoadAd2 = null;
        try {
            C0861l c0861l = C0861l.crashlytics;
            interfaceC13012lLoadAd = AbstractC18202l.loadAd(List.class, AbstractC12953l.smaato(AbstractC18202l.yandex(String.class)));
        } catch (Throwable unused) {
            interfaceC13012lLoadAd = null;
        }
        new C11911l("CompressionListAttribute", new C11310l(interfaceC1388lLoadAd, interfaceC13012lLoadAd));
        InterfaceC1388l interfaceC1388lLoadAd2 = AbstractC18202l.yandex.loadAd(List.class);
        try {
            C0861l c0861l2 = C0861l.crashlytics;
            interfaceC13012lLoadAd2 = AbstractC18202l.loadAd(List.class, AbstractC12953l.smaato(AbstractC18202l.yandex(String.class)));
        } catch (Throwable unused2) {
        }
        crashlytics = new C11911l("DecompressionListAttribute", new C11310l(interfaceC1388lLoadAd2, interfaceC13012lLoadAd2));
    }
}
