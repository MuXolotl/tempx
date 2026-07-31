package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؙّۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6668l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f14018l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ String f14019l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14020l = 0;

    public /* synthetic */ C6668l(int i, String str) {
        this.f14018l = i;
        this.f14019l = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f14020l;
        C4346l c4346l = C4346l.f8873l;
        int i2 = this.f14018l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l, 54);
                    long j = c6956l.f14595continue;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(i2, 0, c6956l), null, AbstractC0080l.isPro(c4346l, 28.0f), 0L, c6956l, 440, 8);
                    AbstractC13010l.loadAd(this.f14019l, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l, 0, 24960, 241662);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    C10707l c10707l = AbstractC16964l.yandex;
                    C11090l c11090l = ((C14370l) c6956l2.isPro(c10707l)).loadAd.isPro;
                    C2122l c2122l = AbstractC1193l.loadAd;
                    C6886l c6886l = C6886l.f14420l;
                    AbstractC13010l.loadAd(this.f14019l, null, 0L, 0L, null, c6886l, c2122l, 0L, null, 0L, 0, false, 0, 0, c11090l, c6956l2, 14155776, 0, 130878);
                    if (i2 > 0) {
                        c6956l2.m2123default(1678202189);
                        AbstractC9334l.yandex(c6956l2, AbstractC0080l.vip(c4346l, 4.0f));
                        AbstractC13010l.loadAd(String.valueOf(i2), null, ((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, 0L, null, c6886l, c2122l, 0L, null, 0L, 2, false, 1, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.isPro, c6956l2, 14155776, 24960, 110394);
                    } else {
                        c6956l2.m2123default(1655214480);
                    }
                    c6956l2.startapp(false);
                    AbstractC11852l.amazon.invoke(c6956l2, 0);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C6668l(String str, int i) {
        this.f14019l = str;
        this.f14018l = i;
    }
}
