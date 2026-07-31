package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lۦُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18700l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7217l f36465l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36466l = 0;

    public /* synthetic */ C18700l(C7217l c7217l) {
        this.f36465l = c7217l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36466l) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float fYandex = ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).yandex(c6956l) + 16.0f;
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l, 16.0f, 0.0f, 16.0f, fYandex, 2);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36034l, c6956l, 48);
                    long j = c6956l.f14595continue;
                    int i = (int) (j ^ (j >>> 32));
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
                    Integer numValueOf = Integer.valueOf(i);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
                    C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l, 196608, 31);
                    AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.ic_notifications_28, 0, c6956l);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, AbstractC0080l.isPro(c4346l, 56.0f), ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, c6956l, 440, 0);
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 8.0f));
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.notification_permission_title), AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.purchase, c6956l, 48, 0, 130040);
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.notification_permission_text), null, ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.firebase, c6956l, 0, 0, 131066);
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
                    C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l, 0);
                    long j2 = c6956l.f14595continue;
                    int i2 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, c4346l);
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i2, c6956l, c6415l3, c6956l, c11192l);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
                    C7217l c7217l = this.f36465l;
                    boolean zAdmob = c6956l.admob(c7217l);
                    Object objM2132native = c6956l.m2132native();
                    C13863l c13863l = C1867l.yandex;
                    if (zAdmob || objM2132native == c13863l) {
                        C5735l c5735l = new C5735l(0, c7217l, C7217l.class, "dismiss", "dismiss()V", 0, 0, 17);
                        c6956l.m2147try(c5735l);
                        objM2132native = c5735l;
                    }
                    AbstractC17457l.mopub((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC11452l.yandex, c6956l, 805306368, 510);
                    AbstractC9334l.yandex(c6956l, new C9247l(1.0f, true));
                    boolean zAdmob2 = c6956l.admob(c7217l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        C5735l c5735l2 = new C5735l(0, c7217l, C7217l.class, "openSettings", "openSettings()V", 0, 0, 18);
                        c6956l.m2147try(c5735l2);
                        objM2132native2 = c5735l2;
                    }
                    AbstractC17457l.loadAd((Function0) ((InterfaceC5059l) objM2132native2), null, false, null, null, null, null, null, AbstractC11452l.loadAd, c6956l, 805306368, 510);
                    c6956l.startapp(true);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                this.f36465l.license((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C18700l(C7217l c7217l, int i) {
        this.f36465l = c7217l;
    }
}
