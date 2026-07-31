package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lِٕ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12170l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1254l f24181l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24182l = 0;

    public /* synthetic */ C12170l(C1254l c1254l) {
        this.f24181l = c1254l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.f24182l;
        C1254l c1254l = this.f24181l;
        switch (i) {
            case 0:
                C15308l c15308l = c1254l.f3285l;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float fYandex = ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).yandex(c6956l) + 16.0f;
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l, 16.0f, 0.0f, 16.0f, fYandex, 2);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36034l, c6956l, 48);
                    long j = c6956l.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lStartapp);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
                    Integer numValueOf = Integer.valueOf(i2);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
                    C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l, 196608, 31);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.libtools_merge_playlist), AbstractC0080l.amazon(c4346l, 1.0f), AbstractC13106l.purchase(c6956l).adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).purchase, c6956l, 48, 0, 130040);
                    C6956l c6956l2 = c6956l;
                    AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 16.0f));
                    if (c15308l.admob() == 0) {
                        c6956l2.m2123default(1318672185);
                        AbstractC8960l.loadAd(null, 0L, null, c6956l2, 0, 7);
                        c6956l2.startapp(false);
                        z = true;
                    } else {
                        c6956l2.m2123default(1318768874);
                        boolean zAdmob = c6956l2.admob(c1254l);
                        Object objM2132native = c6956l2.m2132native();
                        if (zAdmob || objM2132native == C1867l.yandex) {
                            objM2132native = new C10740l(0, c1254l);
                            c6956l2.m2147try(objM2132native);
                        }
                        AbstractC15831l.yandex((Function0) objM2132native, AbstractC0080l.amazon(c4346l, 1.0f), 0L, 0L, null, null, 0.0f, 0.0f, null, 0.0f, 0.0f, c6956l2, 48);
                        AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 8.0f));
                        InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                        C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l2, 48);
                        long j2 = c6956l2.f14595continue;
                        int i3 = (int) (j2 ^ (j2 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                        InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lAmazon);
                        c6956l2.m2140super();
                        if (c6956l2.f14603switch) {
                            c6956l2.firebase(c16395l);
                        } else {
                            c6956l2.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l);
                        AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
                        AbstractC11043l.isPro(i3, c6956l2, c6415l3, c6956l2, c11192l);
                        AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
                        AbstractC13010l.loadAd(String.valueOf(c1254l.f3286l.admob()), null, AbstractC13106l.purchase(c6956l2).adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l2).vip, c6956l2, 0, 0, 130042);
                        AbstractC9334l.yandex(c6956l2, new C9247l(1.0f, true));
                        AbstractC13010l.loadAd(String.valueOf(c15308l.admob()), null, AbstractC13106l.purchase(c6956l2).adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l2).vip, c6956l2, 0, 0, 130042);
                        c6956l2 = c6956l2;
                        z = true;
                        c6956l2.startapp(true);
                        c6956l2.startapp(false);
                    }
                    c6956l2.startapp(z);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c1254l.license((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C12170l(C1254l c1254l, int i) {
        this.f24181l = c1254l;
    }
}
