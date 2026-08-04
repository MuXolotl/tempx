package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌؚْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7229l {
    public static final C10707l yandex = new C10707l(new C6573l(3));

    public static final void loadAd(C14965l c14965l, InterfaceC17242l interfaceC17242l, C15578l c15578l, C6956l c6956l, int i) {
        c6956l.m2133new(-51213870);
        int i2 = (c6956l.billing(c14965l) ? 4 : 2) | i | (c6956l.billing(interfaceC17242l) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            C5866l c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            Function0 function0 = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(function0);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            AbstractC10478l.yandex(yandex.yandex(c14965l), c15578l, c6956l, 56);
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(C16170l.yandex.yandex(AbstractC0080l.vip(C4346l.f8873l, 400.0f), C18450l.f36036l), 16.0f, 0.0f, 2);
            C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
            boolean zBilling = c6956l.billing(c5866lYandex) | ((i2 & 14) == 4);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new C8854l(c14965l, c5866lYandex, 1);
                c6956l.m2147try(objM2132native);
            }
            AbstractC16336l.yandex(interfaceC17242lVip, c5866lYandex, null, c7537l, null, null, false, null, (Function1) objM2132native, c6956l, 12607488, 364);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12755l(c14965l, interfaceC17242l, c15578l, i);
        }
    }

    public static final void yandex(C5726l c5726l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(1168342952);
        int i2 = (c6956l.admob(c5726l) ? 4 : 2) | i | (c6956l.billing(interfaceC17242l) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C2209l c2209l = AbstractC8209l.yandex;
            C5643l c5643l = c5726l.crashlytics;
            c6956l.m2123default(-497967553);
            C10707l c10707l = AbstractC10689l.yandex;
            long j = ((C9735l) ((C10936l) c6956l.isPro(c10707l)).advert.getValue()).yandex;
            c6956l.startapp(false);
            c6956l.m2123default(-763410593);
            long j2 = ((C9735l) ((C10936l) c6956l.isPro(c10707l)).isVip.getValue()).yandex;
            c6956l.startapp(false);
            AbstractC16291l.crashlytics(interfaceC17242l, ((C0260l) c6956l.isPro(AbstractC14696l.yandex)).amazon, AbstractC8209l.yandex(j, j2, c6956l, 0, 0), AbstractC14566l.amazon(103323011, new C1350l(27, c5726l), c6956l), c6956l, 50);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C14601l(c5726l, interfaceC17242l, i, 26);
        }
    }
}
