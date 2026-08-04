package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌٖۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8821l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f18110l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18111l;

    public /* synthetic */ C8821l(int i, int i2) {
        this.f18111l = i2;
        this.f18110l = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f18111l;
        C9946l c9946l = AbstractC16837l.yandex;
        int i2 = 24;
        C4346l c4346l = C4346l.f8873l;
        int i3 = this.f18110l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                ((Integer) obj3).getClass();
                InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c4346l, 0.0f, 8.0f, 1);
                C9647l c9647l = (C9647l) ((List) obj).get(i3);
                C4776l c4776l = AbstractC3951l.yandex;
                InterfaceC17242l interfaceC17242lPremium = AbstractC17541l.loadAd(interfaceC17242lVip, new C1350l(i2, c9647l)).premium(AbstractC0080l.loadAd);
                C10707l c10707l = AbstractC16964l.yandex;
                AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0019l.crashlytics(interfaceC17242lPremium, ((C14370l) c6956l.isPro(c10707l)).crashlytics.crashlytics), C9735l.loadAd(0.25f, ((C14370l) c6956l.isPro(c10707l)).yandex.yandex), c9946l), c6956l, 0);
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj2;
                ((Integer) obj3).getClass();
                InterfaceC17242l interfaceC17242lVip2 = AbstractC3605l.vip(c4346l, 0.0f, 8.0f, 1);
                C9647l c9647l2 = (C9647l) ((List) obj).get(i3);
                C4776l c4776l2 = AbstractC3951l.yandex;
                InterfaceC17242l interfaceC17242lPremium2 = AbstractC17541l.loadAd(interfaceC17242lVip2, new C1350l(i2, c9647l2)).premium(AbstractC0080l.loadAd);
                C10707l c10707l2 = AbstractC16964l.yandex;
                AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0019l.crashlytics(interfaceC17242lPremium2, ((C14370l) c6956l2.isPro(c10707l2)).crashlytics.crashlytics), C9735l.loadAd(0.25f, ((C14370l) c6956l2.isPro(c10707l2)).yandex.yandex), c9946l), c6956l2, 0);
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC13010l.loadAd(String.valueOf(i3), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC13010l.loadAd(String.valueOf(i3), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 4:
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6956l5.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l5.m2127for(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lVip3 = AbstractC3605l.vip(AbstractC3605l.firebase(c4346l, interfaceC11780l), 16.0f, 0.0f, 2);
                    C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36046l, c6956l5, 6);
                    long j = c6956l5.f14595continue;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l5.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l5, interfaceC17242lVip3);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l5.m2140super();
                    if (c6956l5.f14603switch) {
                        c6956l5.firebase(c16395l);
                    } else {
                        c6956l5.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l5, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l5, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l5, C3438l.firebase);
                    AbstractC8182l.billing(c6956l5, interfaceC17242lBilling, C3438l.amazon);
                    String strPurchase = AbstractC11999l.purchase(c6956l5, R.string.cdcm_wizard_fail);
                    C10707l c10707l3 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, null, ((C14370l) c6956l5.isPro(c10707l3)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l5.isPro(c10707l3)).loadAd.purchase, c6956l5, 0, 0, 131066);
                    AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.cdcm_wizard_fail_text, new Object[]{String.valueOf(i3)}, c6956l5), null, ((C14370l) c6956l5.isPro(c10707l3)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l5.isPro(c10707l3)).loadAd.firebase, c6956l5, 0, 0, 131066);
                    c6956l5.startapp(true);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 5:
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l6.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.find_duplicates_action, new Object[]{Integer.valueOf(i3)}, c6956l6), null, 0L, 0L, null, C6886l.f14424l, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l6.isPro(AbstractC16964l.yandex)).loadAd.firebase, c6956l6, 1572864, 0, 131006);
                } else {
                    c6956l6.m2124else();
                }
                break;
            default:
                C6956l c6956l7 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (c6956l7.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.spark_payment_window_action, new Object[]{Integer.valueOf(i3), AbstractC11999l.purchase(c6956l7, R.string.spark_currency_rub)}, c6956l7), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l7, 0, 0, 262142);
                } else {
                    c6956l7.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
