package defpackage;

import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lًٍٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7891l {
    public static final C11911l yandex;

    static {
        InterfaceC13012l interfaceC13012lYandex;
        InterfaceC13012l interfaceC13012lCrashlytics;
        InterfaceC13012l interfaceC13012lCrashlytics2;
        InterfaceC13012l interfaceC13012lCrashlytics3;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        AbstractC1937l.loadAd("io.ktor.client.plugins.HttpRequestRetry");
        int i = C3701l.f7775l;
        C2336l c2336l = AbstractC18202l.yandex;
        c2336l.loadAd(C10349l.class);
        try {
            C0861l c0861l = C0861l.crashlytics;
            AbstractC11726l abstractC11726lVip = c2336l.vip(c2336l.loadAd(C18449l.class));
            c2336l.smaato(abstractC11726lVip, Collections.singletonList(AbstractC18202l.yandex(Object.class)));
            AbstractC18202l.loadAd(C10349l.class, AbstractC12953l.smaato(c2336l.remoteconfig(abstractC11726lVip, Collections.EMPTY_LIST, false)));
        } catch (Throwable unused) {
        }
        if (AbstractC12024l.m3315catch("RetryFeature")) {
            C8339l.metrica("Name can't be blank");
            return;
        }
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(Integer.class);
        InterfaceC13012l interfaceC13012lCrashlytics4 = null;
        try {
            interfaceC13012lYandex = AbstractC18202l.yandex(cls2);
        } catch (Throwable unused2) {
            interfaceC13012lYandex = null;
        }
        yandex = new C11911l("MaxRetriesPerRequestAttributeKey", new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex));
        InterfaceC1388l interfaceC1388lLoadAd2 = AbstractC18202l.yandex.loadAd(Function3.class);
        try {
            C0861l c0861l2 = C0861l.crashlytics;
            interfaceC13012lCrashlytics = AbstractC18202l.crashlytics(Function3.class, AbstractC12953l.smaato(AbstractC18202l.yandex(AbstractC11945l.class)), AbstractC12953l.smaato(AbstractC18202l.yandex(InterfaceC1814l.class)), AbstractC12953l.smaato(AbstractC18202l.yandex(AbstractC10022l.class)), AbstractC12953l.smaato(AbstractC18202l.yandex(cls)));
        } catch (Throwable unused3) {
            interfaceC13012lCrashlytics = null;
        }
        new C11911l("ShouldRetryPerRequestAttributeKey", new C11310l(interfaceC1388lLoadAd2, interfaceC13012lCrashlytics));
        InterfaceC1388l interfaceC1388lLoadAd3 = AbstractC18202l.yandex.loadAd(Function3.class);
        try {
            C0861l c0861l3 = C0861l.crashlytics;
            interfaceC13012lCrashlytics2 = AbstractC18202l.crashlytics(Function3.class, AbstractC12953l.smaato(AbstractC18202l.yandex(AbstractC11945l.class)), AbstractC12953l.smaato(AbstractC18202l.yandex(C6806l.class)), AbstractC12953l.smaato(AbstractC18202l.yandex(Throwable.class)), AbstractC12953l.smaato(AbstractC18202l.yandex(cls)));
        } catch (Throwable unused4) {
            interfaceC13012lCrashlytics2 = null;
        }
        new C11911l("ShouldRetryOnExceptionPerRequestAttributeKey", new C11310l(interfaceC1388lLoadAd3, interfaceC13012lCrashlytics2));
        InterfaceC1388l interfaceC1388lLoadAd4 = AbstractC18202l.yandex.loadAd(Function2.class);
        try {
            C0861l c0861l4 = C0861l.crashlytics;
            interfaceC13012lCrashlytics3 = AbstractC18202l.crashlytics(Function2.class, AbstractC12953l.smaato(AbstractC18202l.yandex(AbstractC11715l.class)), AbstractC12953l.smaato(AbstractC18202l.yandex(C6806l.class)), AbstractC12953l.smaato(AbstractC18202l.yandex(Unit.class)));
        } catch (Throwable unused5) {
            interfaceC13012lCrashlytics3 = null;
        }
        new C11911l("ModifyRequestPerRequestAttributeKey", new C11310l(interfaceC1388lLoadAd4, interfaceC13012lCrashlytics3));
        InterfaceC1388l interfaceC1388lLoadAd5 = AbstractC18202l.yandex.loadAd(Function2.class);
        try {
            C0861l c0861l5 = C0861l.crashlytics;
            interfaceC13012lCrashlytics4 = AbstractC18202l.crashlytics(Function2.class, AbstractC12953l.smaato(AbstractC18202l.yandex(AbstractC14246l.class)), AbstractC12953l.smaato(AbstractC18202l.yandex(cls2)), AbstractC12953l.smaato(AbstractC18202l.yandex(Long.TYPE)));
        } catch (Throwable unused6) {
        }
        new C11911l("RetryDelayPerRequestAttributeKey", new C11310l(interfaceC1388lLoadAd5, interfaceC13012lCrashlytics4));
    }
}
