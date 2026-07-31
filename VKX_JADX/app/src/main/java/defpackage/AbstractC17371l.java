package defpackage;

import java.util.Collections;
import kotlin.Unit;

/* JADX INFO: renamed from: lٕٗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17371l {
    public static final C18449l amazon;
    public static final C8688l crashlytics;
    public static final C11911l loadAd;
    public static final C11911l yandex;

    static {
        InterfaceC13012l interfaceC13012lYandex;
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(Unit.class);
        InterfaceC13012l interfaceC13012lYandex2 = null;
        try {
            interfaceC13012lYandex = AbstractC18202l.yandex(Unit.class);
        } catch (Throwable unused) {
            interfaceC13012lYandex = null;
        }
        yandex = new C11911l("SkipSaveBody", new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex));
        InterfaceC1388l interfaceC1388lLoadAd2 = AbstractC18202l.yandex.loadAd(Unit.class);
        try {
            interfaceC13012lYandex2 = AbstractC18202l.yandex(Unit.class);
        } catch (Throwable unused2) {
        }
        loadAd = new C11911l("ResponseBodySaved", new C11310l(interfaceC1388lLoadAd2, interfaceC13012lYandex2));
        crashlytics = new C8688l(new C3321l(15));
        amazon = new C18449l("SaveBody", new C3321l(0), new C4741l(11));
        int i = C11331l.f22834l;
        C2336l c2336l = AbstractC18202l.yandex;
        c2336l.loadAd(C10349l.class);
        try {
            C0861l c0861l = C0861l.crashlytics;
            AbstractC11726l abstractC11726lVip = c2336l.vip(c2336l.loadAd(C18449l.class));
            c2336l.smaato(abstractC11726lVip, Collections.singletonList(AbstractC18202l.yandex(Object.class)));
            AbstractC18202l.loadAd(C10349l.class, AbstractC12953l.smaato(c2336l.remoteconfig(abstractC11726lVip, Collections.EMPTY_LIST, false)));
        } catch (Throwable unused3) {
        }
        if (AbstractC12024l.m3315catch("DoubleReceivePlugin")) {
            C8339l.metrica("Name can't be blank");
        }
    }

    public static final InterfaceC6272l yandex() {
        return (InterfaceC6272l) crashlytics.getValue();
    }
}
