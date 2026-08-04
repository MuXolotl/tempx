package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُٝٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11191l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f22507l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f22508l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f22509l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f22510l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22511l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f22512l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f22513l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f22514l;

    public /* synthetic */ C11191l(C15578l c15578l, C15578l c15578l2, InterfaceC17242l interfaceC17242l, C15578l c15578l3, Function2 function2, C8127l c8127l, C2403l c2403l, int i) {
        this.f22507l = c15578l;
        this.f22513l = c15578l2;
        this.f22510l = interfaceC17242l;
        this.f22512l = c15578l3;
        this.f22514l = function2;
        this.f22508l = c8127l;
        this.f22509l = c2403l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f22511l;
        Object obj3 = this.f22509l;
        Object obj4 = this.f22508l;
        Object obj5 = this.f22514l;
        Object obj6 = this.f22512l;
        Object obj7 = this.f22513l;
        Object obj8 = this.f22507l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC10547l.loadAd((C15578l) obj8, (C15578l) obj7, this.f22510l, (C15578l) obj6, (Function2) obj5, (C8127l) obj4, (C2403l) obj3, (C6956l) obj, AbstractC0545l.purchase(3511));
                return Unit.INSTANCE;
            default:
                C17723l c17723l = (C17723l) obj8;
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) obj7;
                C6523l c6523l = (C6523l) obj6;
                C6523l c6523l2 = (C6523l) obj5;
                C5866l c5866l = (C5866l) obj4;
                InterfaceC12244l interfaceC12244l2 = (InterfaceC12244l) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int iOrdinal = ((EnumC12413l) interfaceC12244l.getValue()).ordinal();
                    InterfaceC17242l interfaceC17242l = this.f22510l;
                    if (iOrdinal == 0) {
                        c6956l.m2123default(-1917026758);
                        InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
                        long j = c6956l.f14595continue;
                        int i2 = (int) (j ^ (j >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                        InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l);
                        InterfaceC8801l.firebase.getClass();
                        C16395l c16395l = C3438l.loadAd;
                        c6956l.m2140super();
                        if (c6956l.f14603switch) {
                            c6956l.firebase(c16395l);
                        } else {
                            c6956l.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
                        AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                        AbstractC8182l.billing(c6956l, Integer.valueOf(i2), C3438l.isPro);
                        AbstractC8182l.purchase(c6956l, C3438l.firebase);
                        AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                        AbstractC4332l.yandex(null, ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).mopub(), 0.0f, 0L, 0, 0.0f, c6956l, 0, 61);
                        c6956l.startapp(true);
                        c6956l.startapp(false);
                    } else if (iOrdinal == 1) {
                        c6956l.m2123default(-1916728042);
                        c6956l.startapp(false);
                    } else {
                        if (iOrdinal != 2) {
                            throw AbstractC12900l.billing(907991328, c6956l, false);
                        }
                        c6956l.m2123default(-1916648248);
                        AbstractC7229l.loadAd(c17723l.mopub, interfaceC17242l, AbstractC14566l.amazon(-548641699, new C2104l(c6523l, c6523l2, c5866l, interfaceC12244l2, 28), c6956l), c6956l, 384);
                        c6956l.startapp(false);
                    }
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C11191l(InterfaceC17242l interfaceC17242l, C17723l c17723l, InterfaceC8714l interfaceC8714l, C6523l c6523l, C6523l c6523l2, C5866l c5866l, InterfaceC8714l interfaceC8714l2) {
        this.f22510l = interfaceC17242l;
        this.f22507l = c17723l;
        this.f22513l = interfaceC8714l;
        this.f22512l = c6523l;
        this.f22514l = c6523l2;
        this.f22508l = c5866l;
        this.f22509l = interfaceC8714l2;
    }
}
