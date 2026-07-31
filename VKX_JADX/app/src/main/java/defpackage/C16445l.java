package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٖ٘ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16445l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18023l f32161l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32162l;

    public /* synthetic */ C16445l(C18023l c18023l, int i) {
        this.f32162l = i;
        this.f32161l = c18023l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f32162l;
        C4346l c4346l = C4346l.f8873l;
        C18023l c18023l = this.f32161l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C0086l c0086l = C18450l.f36040l;
                    C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
                    InterfaceC17242l interfaceC17242lRemoteconfig = AbstractC3605l.remoteconfig(c4346l, 8.0f, 4.0f);
                    C5062l c5062lYandex = AbstractC7001l.yandex(c7537l, c0086l, c6956l, 54);
                    long j = c6956l.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lRemoteconfig);
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
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    C0415l c0415l = c18023l.purchase;
                    AbstractC7741l.amazon(c0415l != null ? c0415l.yandex : null, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l, 56.0f), AbstractC7497l.yandex), C4176l.yandex, null, c6956l, 1572912, 1976);
                    AbstractC13010l.loadAd(c18023l.yandex, null, C9735l.loadAd, 0L, null, C6886l.f14420l, AbstractC1193l.crashlytics, 0L, null, 0L, 0, false, 1, 0, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).loadAd.firebase, c6956l, 14156160, 24576, 114490);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    C0086l c0086l2 = C18450l.f36040l;
                    C7537l c7537l2 = new C7537l(16.0f, true, new C8339l(12));
                    InterfaceC17242l interfaceC17242lRemoteconfig2 = AbstractC3605l.remoteconfig(c4346l, 8.0f, 4.0f);
                    C5062l c5062lYandex2 = AbstractC7001l.yandex(c7537l2, c0086l2, c6956l2, 54);
                    long j2 = c6956l2.f14595continue;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lRemoteconfig2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l2);
                    } else {
                        c6956l2.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l2, c5062lYandex2, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
                    Integer numValueOf = Integer.valueOf(i3);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l2, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
                    C0415l c0415l2 = c18023l.purchase;
                    String str = c0415l2 != null ? c0415l2.yandex : null;
                    InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(c4346l, 48.0f);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC7741l.amazon(str, null, AbstractC0019l.crashlytics(interfaceC17242lIsPro, ((C14370l) c6956l2.isPro(c10707l)).crashlytics.amazon), C4176l.yandex, null, c6956l2, 1572912, 1976);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l2, 0);
                    long j3 = c6956l2.f14595continue;
                    int i4 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l2, c4346l);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l2);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato3, c6415l2);
                    AbstractC11043l.isPro(i4, c6956l2, c6415l3, c6956l2, c11192l);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling3, c6415l4);
                    String str2 = c18023l.yandex;
                    C11090l c11090l = ((C14370l) c6956l2.isPro(c10707l)).loadAd.firebase;
                    C6886l c6886l = C6886l.f14420l;
                    long j4 = C9735l.loadAd;
                    AbstractC13010l.loadAd(str2, null, j4, 0L, null, c6886l, null, 0L, null, 0L, 0, false, 1, 0, c11090l, c6956l2, 1573248, 24576, 114618);
                    String str3 = c18023l.loadAd;
                    C11090l c11090l2 = ((C14370l) c6956l2.isPro(c10707l)).loadAd.firebase;
                    C6886l c6886l2 = C6886l.f14425l;
                    AbstractC13010l.loadAd(str3, null, C9735l.loadAd(0.5f, j4), 0L, null, c6886l2, null, 0L, null, 0L, 0, false, 1, 0, c11090l2, c6956l2, 1573248, 24576, 114618);
                    if (c18023l.crashlytics.length() > 0) {
                        c6956l2.m2123default(-102375095);
                        AbstractC13010l.loadAd(c18023l.crashlytics, null, C9735l.loadAd(0.5f, j4), 0L, null, c6886l2, null, 0L, null, 0L, 0, false, 1, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.firebase, c6956l2, 1573248, 24576, 114618);
                    } else {
                        c6956l2.m2123default(-124351491);
                    }
                    c6956l2.startapp(false);
                    c6956l2.startapp(true);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
