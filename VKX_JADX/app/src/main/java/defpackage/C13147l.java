package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.AudioContentCard;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍْؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13147l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f25742l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f25743l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25744l;

    public /* synthetic */ C13147l(Object obj, Object obj2, int i) {
        this.f25744l = i;
        this.f25743l = obj;
        this.f25742l = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        boolean z;
        int i = this.f25744l;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        Object obj4 = this.f25742l;
        Object obj5 = this.f25743l;
        switch (i) {
            case 0:
                C18625l c18625l = (C18625l) obj;
                C6956l c6956l = (C6956l) obj2;
                ((Number) obj3).intValue();
                ((InterfaceC17865l) obj5).yandex(c18625l.crashlytics, AbstractC14566l.amazon(-433908510, new C6640l((C15578l) obj4, c18625l, 2), c6956l), c6956l, 48);
                break;
            case 1:
                AudioContentCard audioContentCard = (AudioContentCard) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC9694l abstractC9694l = (AbstractC9694l) obj4;
                C9554l c9554l = (C9554l) obj5;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? c6956l2.billing(audioContentCard) : c6956l2.admob(audioContentCard) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zAdmob = c6956l2.admob(c9554l);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C13668l(c9554l, 2);
                        c6956l2.m2147try(objM2132native);
                    }
                    Function0 function0 = (Function0) objM2132native;
                    boolean zAdmob2 = c6956l2.admob(abstractC9694l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C11998l(abstractC9694l, 2);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC12225l.yandex(audioContentCard, function0, (Function0) objM2132native2, true, c6956l2, (iIntValue & 14) | 3080);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                boolean z2 = false;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                C0228l c0228l = (C0228l) obj4;
                AudioTrack audioTrack = (AudioTrack) obj5;
                if ((iIntValue2 & 17) != 16) {
                    z2 = true;
                }
                if (c6956l3.m2127for(iIntValue2 & 1, z2)) {
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0019l.crashlytics(c4346l, ((C14370l) c6956l3.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics);
                    InterfaceC2186l interfaceC2186l = (InterfaceC2186l) c6956l3.isPro(AbstractC14631l.yandex);
                    boolean zBilling = c6956l3.billing(audioTrack) | c6956l3.admob(c0228l);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zBilling || objM2132native3 == c13863l) {
                        objM2132native3 = new C11239l(audioTrack, c0228l, 8);
                        c6956l3.m2147try(objM2132native3);
                    }
                    Function0 function1 = (Function0) objM2132native3;
                    Object objM2132native4 = c6956l3.m2132native();
                    if (objM2132native4 == c13863l) {
                        objM2132native4 = C15152l.f29736l;
                        c6956l3.m2147try(objM2132native4);
                    }
                    AbstractC17307l.billing(audioTrack, 0, 0L, 0L, 0, 0.0f, false, AbstractC16837l.yandex, null, AbstractC9151l.crashlytics(interfaceC17242lCrashlytics, null, interfaceC2186l, false, function1, (Function0) objM2132native4, 444), c6956l3, 12582912, 382);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 3:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                C8188l c8188l = (C8188l) obj5;
                if (c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    int i2 = AbstractC15548l.yandex;
                    AbstractC13319l.yandex(AbstractC14566l.amazon(1065109200, new C17431l(c8188l, 0), c6956l4), interfaceC17242lAmazon, null, AbstractC14566l.amazon(-1348136595, new C17431l(c8188l, 1), c6956l4), AbstractC14566l.amazon(2142415436, new C17431l(c8188l, 2), c6956l4), AbstractC14566l.amazon(1338000171, new C6640l(c8188l, (C13888l) obj4, 17), c6956l4), AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l4, 510), c6956l4, 224310, 388);
                } else {
                    c6956l4.m2124else();
                }
                break;
            default:
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if (c6956l5.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(c4346l, 16.0f);
                    C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                    C7679l c7679l = (C7679l) obj5;
                    C14564l c14564l = (C14564l) obj4;
                    C15089l c15089l = C18450l.f36046l;
                    C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, c15089l, c6956l5, 6);
                    long j2 = c6956l5.f14595continue;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l5.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l5, interfaceC17242lSmaato);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l5.m2140super();
                    if (c6956l5.f14603switch) {
                        c6956l5.firebase(c16395l);
                    } else {
                        c6956l5.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l5, c1853lYandex, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato, c6415l2);
                    Integer numValueOf = Integer.valueOf(i3);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l5, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l5, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l5, interfaceC17242lBilling, c6415l4);
                    C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l5, 48);
                    long j3 = c6956l5.f14595continue;
                    int i4 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l5.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l5, c4346l);
                    c6956l5.m2140super();
                    if (c6956l5.f14603switch) {
                        c6956l5.firebase(c16395l);
                    } else {
                        c6956l5.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l5, c5062lYandex, c6415l);
                    AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i4, c6956l5, c6415l3, c6956l5, c11192l);
                    AbstractC8182l.billing(c6956l5, interfaceC17242lBilling2, c6415l4);
                    int i5 = c14564l.yandex;
                    int i6 = c14564l.amazon;
                    if (i6 == 2 || i6 == 3) {
                        c6956l5.m2123default(538424921);
                        j = ((C14370l) c6956l5.isPro(AbstractC16964l.yandex)).yandex.adcel;
                        c6956l5.startapp(false);
                    } else {
                        c6956l5.m2123default(538544891);
                        j = ((C14370l) c6956l5.isPro(AbstractC16964l.yandex)).yandex.yandex;
                        c6956l5.startapp(false);
                    }
                    boolean z3 = c14564l.yandex != R.drawable.vknext_logo;
                    AbstractC18082l abstractC18082l = C7679l.f16101l;
                    c7679l.m2195import(i5, null, j, z3, 0.0f, 0.0f, c6956l5, 0, 50);
                    C6956l c6956l6 = c6956l5;
                    AbstractC9334l.yandex(c6956l6, new C9247l(1.0f, true));
                    if (i6 == 2) {
                        c6956l6.m2123default(538890851);
                        AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l6, R.string.bc_v2_m_title_soon), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l6.isPro(AbstractC16964l.yandex)).loadAd.vip, c6956l6, 0, 0, 131070);
                        c6956l6 = c6956l6;
                        z = false;
                    } else {
                        z = false;
                        c6956l6.m2123default(516699532);
                    }
                    c6956l6.startapp(z);
                    c6956l6.startapp(true);
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(4.0f, true, new C8339l(12)), c15089l, c6956l6, 6);
                    long j4 = c6956l6.f14595continue;
                    int i7 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l6.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l6, c4346l);
                    c6956l6.m2140super();
                    if (c6956l6.f14603switch) {
                        c6956l6.firebase(c16395l);
                    } else {
                        c6956l6.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l6, c1853lYandex2, c6415l);
                    AbstractC8182l.billing(c6956l6, interfaceC18556lSmaato3, c6415l2);
                    AbstractC11043l.isPro(i7, c6956l6, c6415l3, c6956l6, c11192l);
                    AbstractC8182l.billing(c6956l6, interfaceC17242lBilling3, c6415l4);
                    String strPurchase = AbstractC11999l.purchase(c6956l6, c14564l.loadAd);
                    C10707l c10707l = AbstractC16964l.yandex;
                    C6956l c6956l7 = c6956l6;
                    AbstractC13010l.loadAd(strPurchase, null, ((C14370l) c6956l6.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l6.isPro(c10707l)).loadAd.mopub, c6956l7, 0, 0, 131066);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l7, c14564l.crashlytics), null, ((C14370l) c6956l7.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l7.isPro(c10707l)).loadAd.firebase, c6956l7, 0, 0, 131066);
                    c6956l7.startapp(true);
                    c6956l7.startapp(true);
                } else {
                    c6956l5.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
