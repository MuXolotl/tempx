package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lْٗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17130l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C14974l f33312l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0483l f33313l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33314l = 1;

    public /* synthetic */ C17130l(C0483l c0483l, C14974l c14974l) {
        this.f33313l = c0483l;
        this.f33312l = c14974l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f33314l;
        C13863l c13863l = C1867l.yandex;
        C14974l c14974l = this.f33312l;
        C0483l c0483l = this.f33313l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str = c14974l.loadAd;
                    String str2 = c14974l.crashlytics;
                    boolean z = c14974l.purchase;
                    C9879l c9879l = c0483l.yandex;
                    boolean zAdmob = c6956l.admob(c9879l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new Cconst(0, c9879l, C9879l.class, "onTrackTitleTapped", "onTrackTitleTapped()V", 0, 0, 8);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC15576l.amazon(str, str2, z, (Function0) ((InterfaceC5059l) objM2132native), c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C9879l c9879l2 = c0483l.yandex;
                    boolean zAdmob2 = c6956l2.admob(c9879l2);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        Cconst cconst = new Cconst(0, c9879l2, C9879l.class, "onTrackArtistTapped", "onTrackArtistTapped()V", 0, 0, 9);
                        c6956l2.m2147try(cconst);
                        objM2132native2 = cconst;
                    }
                    InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native2;
                    Object objM2132native3 = c6956l2.m2132native();
                    if (objM2132native3 == c13863l) {
                        objM2132native3 = AbstractC14814l.isPro(c6956l2);
                    }
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lYandex = AbstractC9151l.yandex(c4346l, (C2403l) objM2132native3, null, false, null, (Function0) interfaceC5059l, 28);
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(4.0f, true, new C8339l(12)), C18450l.f36040l, c6956l2, 54);
                    long j = c6956l2.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lYandex);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i2), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    if (c14974l.purchase) {
                        c6956l2.m2123default(1106337351);
                        AbstractC5889l.amazon(AbstractC0080l.isPro(c4346l, 20.0f), ((C18718l) c6956l2.isPro(AbstractC5992l.yandex)).loadAd, c6956l2, 6, 0);
                    } else {
                        c6956l2.m2123default(1062294194);
                    }
                    c6956l2.startapp(false);
                    AbstractC13010l.loadAd(c14974l.amazon, AbstractC14460l.smaato(c4346l), ((C18718l) c6956l2.isPro(AbstractC5992l.yandex)).loadAd, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).loadAd.isPro, c6956l2, 48, 24960, 110584);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C17130l(C14974l c14974l, C0483l c0483l) {
        this.f33312l = c14974l;
        this.f33313l = c0483l;
    }
}
