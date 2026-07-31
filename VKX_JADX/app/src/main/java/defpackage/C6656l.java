package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙٟۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6656l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C14476l f13992l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13993l = 0;

    public /* synthetic */ C6656l(C14476l c14476l) {
        this.f13992l = c14476l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f13993l;
        C14476l c14476l = this.f13992l;
        switch (i) {
            case 0:
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
                    AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l, 196608, 31);
                    String str = c14476l.f28344l.f17087l;
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(str, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.purchase, c6956l, 48, 0, 130040);
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
                    AbstractC3383l.yandex(null, null, null, null, null, AbstractC14566l.amazon(-2054817196, new C10680l(c14476l, 0), c6956l), c6956l, 196608, 31);
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
                    C17253l c17253l = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    C6839l c6839l = ((C14370l) c6956l.isPro(c10707l)).crashlytics.crashlytics;
                    boolean zAdmob = c6956l.admob(c14476l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new C7730l(11, c14476l);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC17457l.loadAd((Function0) objM2132native, interfaceC17242lAmazon, false, c6839l, null, null, null, c17253l, AbstractC14566l.amazon(-1916136682, new C10680l(c14476l, 1), c6956l), c6956l, 817889328, 372);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c14476l.license((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C6656l(C14476l c14476l, int i) {
        this.f13992l = c14476l;
    }
}
