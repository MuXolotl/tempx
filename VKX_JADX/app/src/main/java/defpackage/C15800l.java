package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٕٜؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15800l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C8316l f31022l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2157l f31023l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31024l = 1;

    public /* synthetic */ C15800l(C2157l c2157l, C8316l c8316l, int i) {
        this.f31023l = c2157l;
        this.f31022l = c8316l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f31024l;
        C8316l c8316l = this.f31022l;
        C2157l c2157l = this.f31023l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float fYandex = ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).yandex(c6956l) + 16.0f;
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l, 0.0f, 0.0f, 0.0f, fYandex, 7);
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
                    String strPurchase = AbstractC11999l.purchase(c6956l, R.string.share);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.purchase, c6956l, 48, 0, 130040);
                    AbstractC3383l.yandex(AbstractC3605l.smaato(c4346l, 16.0f), null, null, null, null, AbstractC14566l.amazon(702500047, new C14051l(c2157l, 2), c6956l), c6956l, 196614, 30);
                    boolean zAdmob = c6956l.admob(c8316l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new C16931l(22, c8316l);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC16336l.yandex(null, null, null, null, null, null, false, null, (Function1) objM2132native, c6956l, 0, 511);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c2157l.ad(c8316l, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C15800l(C8316l c8316l, C2157l c2157l) {
        this.f31022l = c8316l;
        this.f31023l = c2157l;
    }
}
