package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٖؔؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2404l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9174l f5169l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5170l = 0;

    public /* synthetic */ C2404l(C9174l c9174l) {
        this.f5169l = c9174l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C13863l c13863l;
        C6956l c6956l;
        switch (this.f5170l) {
            case 0:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float fYandex = ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).yandex(c6956l2);
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC3605l.startapp(c4346l, 0.0f, 0.0f, 0.0f, fYandex, 7), 16.0f, 0.0f, 2);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36034l, c6956l2, 48);
                    long j = c6956l2.f14595continue;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lVip);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l2, 196608, 31);
                    C9174l c9174l = this.f5169l;
                    C0383l c0383l = c9174l.f18872l;
                    AbstractC7741l.purchase(c0383l.amazon, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l, 144.0f), AbstractC13106l.billing(c6956l2).crashlytics), new C18627l(AbstractC13106l.purchase(c6956l2).premium), null, C4176l.yandex, c6956l2, 4144, 6, 31728);
                    AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 16.0f));
                    AbstractC13010l.loadAd(c0383l.loadAd, null, AbstractC13106l.purchase(c6956l2).adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l2).purchase, c6956l2, 0, 0, 130042);
                    AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 8.0f));
                    AbstractC13010l.loadAd(c0383l.crashlytics, null, AbstractC13106l.purchase(c6956l2).subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l2).isPro, c6956l2, 0, 0, 130042);
                    AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 16.0f));
                    boolean zBooleanValue = ((Boolean) c9174l.f18868l.getValue()).booleanValue();
                    C13863l c13863l2 = C1867l.yandex;
                    if (zBooleanValue) {
                        c6956l2.m2123default(-38404571);
                        c13863l = c13863l2;
                        c6956l = c6956l2;
                        AbstractC15831l.loadAd(AbstractC0080l.amazon(c4346l, 1.0f), 0L, 0L, null, null, 0.0f, 0.0f, 0.0f, 0.0f, c6956l, 6);
                        c6956l.startapp(false);
                    } else {
                        c13863l = c13863l2;
                        c6956l2.m2123default(-38291297);
                        InterfaceC8714l interfaceC8714lLoadAd = AbstractC3700l.loadAd(c9174l.f18873l, Float.valueOf(0.0f), c6956l2, 48);
                        boolean zBilling = c6956l2.billing(interfaceC8714lLoadAd);
                        Object objM2132native = c6956l2.m2132native();
                        if (zBilling || objM2132native == c13863l) {
                            objM2132native = new C18355l(interfaceC8714lLoadAd, 1);
                            c6956l2.m2147try(objM2132native);
                        }
                        AbstractC15831l.yandex((Function0) objM2132native, AbstractC0080l.amazon(c4346l, 1.0f), 0L, 0L, null, null, 0.0f, 0.0f, null, 0.0f, 0.0f, c6956l2, 48);
                        c6956l = c6956l2;
                        c6956l.startapp(false);
                    }
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
                    boolean zAdmob = c6956l.admob(c9174l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zAdmob || objM2132native2 == c13863l) {
                        Cconst cconst = new Cconst(0, c9174l, C9174l.class, "dismiss", "dismiss()V", 0, 0, 28);
                        c6956l.m2147try(cconst);
                        objM2132native2 = cconst;
                    }
                    C17253l c17253l = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    C17253l c17253l2 = C12719l.yandex;
                    C6956l c6956l3 = c6956l;
                    AbstractC17457l.loadAd((Function0) ((InterfaceC5059l) objM2132native2), AbstractC0080l.amazon(c4346l, 1.0f), false, AbstractC13106l.billing(c6956l3).crashlytics, C12719l.yandex(AbstractC13106l.purchase(c6956l).Signature, AbstractC13106l.purchase(c6956l).license, 0L, 0L, c6956l3, 12), null, null, c17253l, AbstractC8265l.f17163l, c6956l3, 817889328, 356);
                    c6956l3.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                this.f5169l.license((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C2404l(C9174l c9174l, int i) {
        this.f5169l = c9174l;
    }
}
