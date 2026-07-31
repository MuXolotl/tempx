package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؖٛۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4241l implements Function4 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7679l f8695l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8696l;

    public /* synthetic */ C4241l(C7679l c7679l, int i) {
        this.f8696l = i;
        this.f8695l = c7679l;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        C6956l c6956l;
        boolean z2;
        int i = this.f8696l;
        C7679l c7679l = this.f8695l;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                C6956l c6956l2 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                if (zBooleanValue) {
                    c6956l2.m2123default(971940187);
                    boolean z3 = c7679l.m2196instanceof() != null;
                    C17253l c17253l = C12719l.yandex;
                    C10707l c10707l = AbstractC16964l.yandex;
                    C13412l c13412lSubs = C12719l.subs(((C14370l) c6956l2.isPro(c10707l)).yandex.yandex, C9735l.loadAd(0.38f, ((C14370l) c6956l2.isPro(c10707l)).yandex.yandex), c6956l2, 5);
                    C6839l c6839lYandex = AbstractC7497l.yandex(8.0f);
                    boolean zAdmob = c6956l2.admob(c7679l);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new C10575l(c7679l, 3);
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native, null, z3, c6839lYandex, c13412lSubs, null, AbstractC17457l.purchase, c6956l2, 805306368, 482);
                    z = false;
                } else {
                    z = false;
                    c6956l2.m2123default(954548288);
                }
                c6956l2.startapp(z);
                break;
            default:
                C10086l c10086l = c7679l.f16102l;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                C6956l c6956l3 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                C4346l c4346l = C4346l.f8873l;
                if (zBooleanValue2) {
                    c6956l3.m2123default(-1088265162);
                    if (((Boolean) c7679l.f16103l.getValue()).booleanValue()) {
                        c6956l3.m2123default(-1088264325);
                        C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l3, 0);
                        long j = c6956l3.f14595continue;
                        int i2 = (int) (j ^ (j >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
                        InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, c4346l);
                        InterfaceC8801l.firebase.getClass();
                        C16395l c16395l = C3438l.loadAd;
                        c6956l3.m2140super();
                        if (c6956l3.f14603switch) {
                            c6956l3.firebase(c16395l);
                        } else {
                            c6956l3.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l3, c1853lYandex, C3438l.mopub);
                        AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato, C3438l.billing);
                        AbstractC8182l.billing(c6956l3, Integer.valueOf(i2), C3438l.isPro);
                        AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                        AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, C3438l.amazon);
                        String strPurchase = AbstractC11999l.purchase(c6956l3, R.string.plus_purchase_done);
                        InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                        C10707l c10707l2 = AbstractC16964l.yandex;
                        AbstractC13010l.loadAd(strPurchase, interfaceC17242lAmazon, ((C14370l) c6956l3.isPro(c10707l2)).yandex.license, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, null, c6956l3, 48, 0, 261112);
                        AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, R.string.plus_purchase_done_sub), AbstractC0080l.amazon(c4346l, 1.0f), C9735l.loadAd(0.75f, ((C14370l) c6956l3.isPro(c10707l2)).yandex.license), 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, null, c6956l3, 48, 0, 261112);
                        c6956l = c6956l3;
                        c6956l.startapp(true);
                        z2 = false;
                        c6956l.startapp(false);
                    } else {
                        c6956l3.m2123default(-1087087069);
                        if (((EnumC8514l) c7679l.f16105l.getValue()) == null) {
                            c6956l3.m2123default(-1087023302);
                            AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.plus_purchase_price, new Object[]{((C8195l) c10086l.getValue()).f17098l, "₽", ((C8195l) c10086l.getValue()).f17097l, "₴"}, c6956l3), AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l3.isPro(AbstractC16964l.yandex)).yandex.license, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, null, c6956l3, 48, 0, 261112);
                            c6956l = c6956l3;
                            z2 = false;
                            c6956l.startapp(false);
                        } else {
                            c6956l3.m2123default(-1086182985);
                            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, R.string.plus_purchase_unavailable), AbstractC0080l.amazon(c4346l, 1.0f), C9735l.loadAd(0.75f, ((C14370l) c6956l3.isPro(AbstractC16964l.yandex)).yandex.license), 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, null, c6956l3, 48, 0, 261112);
                            c6956l = c6956l3;
                            z2 = false;
                            c6956l.startapp(false);
                        }
                        c6956l.startapp(z2);
                    }
                    c6956l.startapp(z2);
                } else {
                    c6956l3.m2123default(-1085484028);
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
                    long j2 = c6956l3.f14595continue;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l3, interfaceC17242lAmazon2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l3.m2140super();
                    if (c6956l3.f14603switch) {
                        c6956l3.firebase(c16395l2);
                    } else {
                        c6956l3.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l3, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l3, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling2, C3438l.amazon);
                    AbstractC12491l.yandex(null, ((C9735l) c6956l3.isPro(AbstractC12502l.yandex)).yandex, 2.0f, 24.0f, c6956l3, 3456);
                    c6956l3.startapp(true);
                    c6956l3.startapp(false);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
