package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentMap$EL;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lؕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3180l {
    public static final C11911l amazon;
    public static final C18449l crashlytics;
    public static final C11911l loadAd;
    public static final InterfaceC6272l yandex = AbstractC1937l.loadAd("io.ktor.client.plugins.auth.Auth");

    static {
        InterfaceC13012l interfaceC13012lYandex;
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(Unit.class);
        InterfaceC13012l interfaceC13012lLoadAd = null;
        try {
            interfaceC13012lYandex = AbstractC18202l.yandex(Unit.class);
        } catch (Throwable unused) {
            interfaceC13012lYandex = null;
        }
        loadAd = new C11911l("auth-request", new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex));
        crashlytics = new C18449l("Auth", C3946l.f8125l, new C10351l(1));
        InterfaceC1388l interfaceC1388lLoadAd2 = AbstractC18202l.yandex.loadAd(List.class);
        try {
            C0861l c0861l = C0861l.crashlytics;
            interfaceC13012lLoadAd = AbstractC18202l.loadAd(List.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C5808l.class)));
        } catch (Throwable unused2) {
        }
        amazon = new C11911l("AuthProviders", new C11310l(interfaceC1388lLoadAd2, interfaceC13012lLoadAd));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object loadAd(C7171l c7171l, C11911l c11911l, C14249l c14249l, C5808l c5808l, C6806l c6806l, AbstractC0283l abstractC0283l) {
        C12308l c12308l;
        C2309l c2309l;
        Map map;
        if (abstractC0283l instanceof C12308l) {
            c12308l = (C12308l) abstractC0283l;
            int i = c12308l.f24389l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12308l.f24389l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12308l = new C12308l(abstractC0283l);
            }
        } else {
            c12308l = new C12308l(abstractC0283l);
        }
        Object objCrashlytics = c12308l.f24386l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i2 = c12308l.f24389l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objCrashlytics);
            C2309l c2309l2 = (C2309l) ConcurrentMap$EL.computeIfAbsent(c7171l.f15006l, c5808l, new C6654l(new C6199l(2, new C8631l(19))));
            Map map2 = (Map) c6806l.billing.yandex(c11911l, new C8631l(20));
            Integer num = (Integer) map2.get(c5808l);
            if (num != null && num.intValue() >= c2309l2.atomic) {
                InterfaceC6272l interfaceC6272l = yandex;
                if (interfaceC6272l.admob()) {
                    StringBuilder sb = new StringBuilder("Refreshing token for ");
                    InterfaceC1814l interfaceC1814l = c14249l.f27846l;
                    if (interfaceC1814l == null) {
                        interfaceC1814l = null;
                    }
                    sb.append(interfaceC1814l.getUrl());
                    interfaceC6272l.vip(sb.toString());
                }
                AbstractC10022l abstractC10022l = c14249l.f27845l;
                if (abstractC10022l == null) {
                    abstractC10022l = null;
                }
                c12308l.f24388l = c14249l;
                c12308l.f24387l = c5808l;
                c12308l.f24390l = c2309l2;
                c12308l.f24385l = map2;
                c12308l.f24389l = 1;
                objCrashlytics = c5808l.crashlytics(abstractC10022l, c12308l);
                if (objCrashlytics == enumC9342l) {
                    return enumC9342l;
                }
                c2309l = c2309l2;
                map = map2;
            }
            return Boolean.TRUE;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        map = c12308l.f24385l;
        c2309l = c12308l.f24390l;
        c5808l = c12308l.f24387l;
        c14249l = c12308l.f24388l;
        AbstractC2829l.crashlytics(objCrashlytics);
        if (((Boolean) objCrashlytics).booleanValue()) {
            map.put(c5808l, new Integer(C2309l.yandex.incrementAndGet(c2309l)));
            return Boolean.TRUE;
        }
        InterfaceC6272l interfaceC6272l2 = yandex;
        if (interfaceC6272l2.admob()) {
            StringBuilder sb2 = new StringBuilder("Refreshing token failed for ");
            InterfaceC1814l interfaceC1814l2 = c14249l.f27846l;
            sb2.append((interfaceC1814l2 != null ? interfaceC1814l2 : null).getUrl());
            interfaceC6272l2.vip(sb2.toString());
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object yandex(C3235l c3235l, C14249l c14249l, C5808l c5808l, C6806l c6806l, AbstractC11393l abstractC11393l, AbstractC0283l abstractC0283l) {
        C18095l c18095l;
        C3235l c3235l2;
        C6806l c6806l2;
        if (abstractC0283l instanceof C18095l) {
            c18095l = (C18095l) abstractC0283l;
            int i = c18095l.f35390l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c18095l.f35390l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c18095l = new C18095l(abstractC0283l);
            }
        } else {
            c18095l = new C18095l(abstractC0283l);
        }
        Object obj = c18095l.f35389l;
        int i2 = c18095l.f35390l;
        Object obj2 = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C6806l c6806l3 = new C6806l();
            c6806l3.purchase = c6806l.purchase;
            c6806l3.crashlytics(c6806l);
            c18095l.f35392l = c3235l;
            c18095l.f35391l = c14249l;
            c18095l.f35393l = c6806l3;
            c18095l.f35390l = 1;
            if (c5808l.yandex(c6806l3, c18095l) != obj2) {
                c3235l2 = c3235l;
                c6806l2 = c6806l3;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC2829l.crashlytics(obj);
                return obj;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c6806l2 = c18095l.f35393l;
        c14249l = c18095l.f35391l;
        c3235l2 = c18095l.f35392l;
        AbstractC2829l.crashlytics(obj);
        c6806l2.billing.mopub(loadAd, Unit.INSTANCE);
        InterfaceC6272l interfaceC6272l = yandex;
        if (interfaceC6272l.admob()) {
            StringBuilder sb = new StringBuilder("Sending new request to ");
            InterfaceC1814l interfaceC1814l = c14249l.f27846l;
            if (interfaceC1814l == null) {
                interfaceC1814l = null;
            }
            sb.append(interfaceC1814l.getUrl());
            interfaceC6272l.vip(sb.toString());
        }
        c18095l.f35392l = null;
        c18095l.f35391l = null;
        c18095l.f35393l = null;
        c18095l.f35390l = 2;
        Object objYandex = c3235l2.f6929l.yandex(c6806l2, c18095l);
        return objYandex == obj2 ? obj2 : objYandex;
    }
}
