package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؑۜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0598l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f2025l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2026l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2027l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f2028l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f2029l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f2030l;

    public /* synthetic */ C0598l(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.f2027l = i;
        this.f2026l = z;
        this.f2025l = obj;
        this.f2029l = obj2;
        this.f2028l = obj3;
        this.f2030l = obj4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:67:0x0280. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r3v19 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        String strAmazon;
        String strAmazon2;
        String str;
        boolean z;
        int i2;
        int i3;
        ?? r3;
        C15578l c15578l;
        C15578l c15578l2;
        Object obj4;
        Object obj5;
        C7198l c7198l;
        EnumC3830l enumC3830l;
        boolean z2;
        boolean z3;
        String str2;
        int i4 = this.f2027l;
        C4346l c4346l = C4346l.f8873l;
        Object obj6 = this.f2030l;
        Object obj7 = this.f2028l;
        Object obj8 = this.f2029l;
        Object obj9 = this.f2025l;
        boolean z4 = this.f2026l;
        switch (i4) {
            case 0:
                C10178l c10178l = (C10178l) obj9;
                InterfaceC8533l interfaceC8533l = (InterfaceC8533l) obj8;
                C16854l c16854l = (C16854l) obj7;
                C10086l c10086l = c16854l.f32893l;
                C6523l c6523l = (C6523l) obj6;
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lPurchase = AbstractC13841l.purchase(AbstractC0080l.crashlytics(AbstractC3605l.vip(AbstractC3605l.firebase(c4346l, interfaceC11780l), 16.0f, 0.0f, 2), 1.0f), AbstractC13841l.crashlytics(c6956l), true);
                    C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
                    C15089l c15089l = C18450l.f36046l;
                    C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, c15089l, c6956l, 6);
                    long j = c6956l.f14595continue;
                    int i5 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lPurchase);
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
                    Integer numValueOf = Integer.valueOf(i5);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), c15089l, c6956l, 6);
                    long j2 = c6956l.f14595continue;
                    int i6 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, c4346l);
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c1853lYandex2, c6415l);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i6, c6956l, c6415l3, c6956l, c11192l);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
                    EnumC11781l enumC11781l = c16854l.m4200abstract().yandex;
                    switch (enumC11781l == null ? -1 : AbstractC5741l.yandex[enumC11781l.ordinal()]) {
                        case 1:
                            i = R.string.auth2_method_sms_title;
                            break;
                        case 2:
                            i = R.string.auth2_method_push_title;
                            break;
                        case 3:
                            i = R.string.auth2_method_email_title;
                            break;
                        case 4:
                            i = R.string.auth2_method_codegen_title;
                            break;
                        case 5:
                            i = R.string.auth2_method_callreset_title;
                            break;
                        case 6:
                            i = R.string.auth2_password_title;
                            break;
                        default:
                            i = R.string.auth2_method_reserve_title;
                            break;
                    }
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, i), AbstractC0080l.amazon(c4346l, 1.0f), 0L, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).purchase, c6956l, 48, 0, 130044);
                    EnumC11781l enumC11781l2 = c16854l.m4200abstract().yandex;
                    String str3 = c16854l.m4200abstract().crashlytics;
                    switch (enumC11781l2 != null ? AbstractC5741l.yandex[enumC11781l2.ordinal()] : -1) {
                        case 1:
                            c6956l.m2123default(-1745637538);
                            strAmazon = AbstractC11999l.amazon(R.string.auth2_method_sms_text, new Object[]{str3}, c6956l);
                            c6956l.startapp(false);
                            str = strAmazon;
                            break;
                        case 2:
                            c6956l.m2123default(-1745633953);
                            strAmazon2 = AbstractC11999l.amazon(R.string.auth2_method_push_text, new Object[]{str3}, c6956l);
                            c6956l.startapp(false);
                            str = strAmazon2;
                            break;
                        case 3:
                            c6956l.m2123default(-1745630304);
                            strAmazon2 = AbstractC11999l.amazon(R.string.auth2_method_email_text, new Object[]{str3}, c6956l);
                            c6956l.startapp(false);
                            str = strAmazon2;
                            break;
                        case 4:
                            z = false;
                            i2 = -1745626570;
                            i3 = R.string.auth2_method_codegen_text;
                            strAmazon = AbstractC12900l.mopub(c6956l, i2, i3, c6956l, z);
                            str = strAmazon;
                            break;
                        case 5:
                            c6956l.m2123default(-1745619804);
                            strAmazon = AbstractC11999l.amazon(R.string.auth2_method_callreset_text, new Object[]{str3}, c6956l);
                            c6956l.startapp(false);
                            str = strAmazon;
                            break;
                        case 6:
                            z = false;
                            i2 = -1745623120;
                            i3 = R.string.auth2_password_text;
                            strAmazon = AbstractC12900l.mopub(c6956l, i2, i3, c6956l, z);
                            str = strAmazon;
                            break;
                        default:
                            i2 = -1745617194;
                            i3 = R.string.auth2_method_reserve_text;
                            z = false;
                            strAmazon = AbstractC12900l.mopub(c6956l, i2, i3, c6956l, z);
                            str = strAmazon;
                            break;
                    }
                    AbstractC13010l.loadAd(str, AbstractC0080l.amazon(c4346l, 1.0f), AbstractC13106l.purchase(c6956l).subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).isPro, c6956l, 48, 0, 130040);
                    c6956l.startapp(true);
                    C3790l c3790l = new C3790l(z4 ? 7 : 3, 7, 115);
                    boolean zBilling = c6956l.billing(c10178l) | c6956l.billing(interfaceC8533l) | c6956l.admob(c16854l);
                    Object objM2132native = c6956l.m2132native();
                    C13863l c13863l = C1867l.yandex;
                    Object obj10 = objM2132native;
                    if (zBilling || objM2132native == c13863l) {
                        C5577l c5577l = new C5577l(c10178l, interfaceC8533l, c16854l, 0);
                        c6956l.m2147try(c5577l);
                        obj10 = c5577l;
                    }
                    InterfaceC11381l interfaceC11381l = (InterfaceC11381l) obj10;
                    C1351l c1351lSubs = C11140l.subs(AbstractC13106l.purchase(c6956l).ads, AbstractC13106l.purchase(c6956l).ads, AbstractC13106l.purchase(c6956l).ads, AbstractC13106l.purchase(c6956l).ads, c6956l, 2147483407);
                    boolean z5 = ((String) c10086l.getValue()).length() > 0;
                    if (((String) c10086l.getValue()).length() > 0) {
                        c6956l.m2123default(-355820820);
                        r3 = 0;
                        C15578l c15578lAmazon = AbstractC14566l.amazon(693425864, new C10321l(c16854l, 5, false ? 1 : 0), c6956l);
                        c6956l.startapp(false);
                        c15578l = c15578lAmazon;
                    } else {
                        r3 = 0;
                        c6956l.m2123default(-355704230);
                        c6956l.startapp(false);
                        c15578l = null;
                    }
                    if (z4) {
                        c6956l.m2123default(-355641423);
                        C15578l c15578lAmazon2 = AbstractC14566l.amazon(1356207004, new C10321l(c16854l, 6, r3), c6956l);
                        c6956l.startapp(r3);
                        c15578l2 = c15578lAmazon2;
                    } else {
                        c6956l.m2123default(-354822342);
                        c6956l.startapp(r3);
                        c15578l2 = null;
                    }
                    int i7 = (!z4 || ((Boolean) c16854l.f32886l.getValue()).booleanValue()) ? 0 : 1;
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC9966l.billing(AbstractC0080l.amazon(c4346l, 1.0f).premium(C14786l.f28910l), c6523l);
                    boolean zMopub = c6956l.mopub(z4);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zMopub || objM2132native2 == c13863l) {
                        C13816l c13816l = new C13816l(z4, 2);
                        c6956l.m2147try(c13816l);
                        obj4 = c13816l;
                    } else {
                        obj4 = objM2132native2;
                    }
                    InterfaceC17242l interfaceC17242lYandex = AbstractC4962l.yandex(interfaceC17242lBilling3, false, (Function1) obj4);
                    if (z4) {
                        c6956l.m2123default(-354066438);
                        c6956l.startapp(false);
                        c7198l = null;
                    } else {
                        c6956l.m2123default(1096958209);
                        C14823l c14823l = C14823l.f29012l;
                        boolean zAdmob = c6956l.admob(c16854l);
                        Object objM2132native3 = c6956l.m2132native();
                        if (zAdmob || objM2132native3 == c13863l) {
                            C12513l c12513l = new C12513l(6, c16854l);
                            c6956l.m2147try(c12513l);
                            obj5 = c12513l;
                        } else {
                            obj5 = objM2132native3;
                        }
                        C7198l c7198l2 = new C7198l(c14823l, new C14719l((Function2) obj5));
                        c6956l.startapp(false);
                        c7198l = c7198l2;
                    }
                    AbstractC8496l.yandex(c10178l, interfaceC17242lYandex, false, null, null, AbstractC14566l.amazon(2033000582, new C4584l(z4, 6), c6956l), c15578l2, c15578l, z5, c7198l, i7, (char) 0, c3790l, interfaceC11381l, null, c1351lSubs, null, c6956l, 1572864, 0, 7112380);
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    String strPurchase = AbstractC11999l.purchase(c6956l, R.string.auth2_password_action);
                    if (((Boolean) c16854l.f32888l.getValue()).booleanValue()) {
                        enumC3830l = EnumC3830l.f7941l;
                    } else {
                        enumC3830l = c10178l.loadAd().f12057l.length() > 0 ? EnumC3830l.f7942l : EnumC3830l.f7943l;
                    }
                    EnumC3830l enumC3830l2 = enumC3830l;
                    boolean zBilling2 = c6956l.billing(interfaceC8533l) | c6956l.admob(c16854l) | c6956l.billing(c10178l);
                    Object objM2132native4 = c6956l.m2132native();
                    Object obj11 = objM2132native4;
                    if (zBilling2 || objM2132native4 == c13863l) {
                        Cfinally cfinally = new Cfinally(interfaceC8533l, c16854l, c10178l, 10);
                        c6956l.m2147try(cfinally);
                        obj11 = cfinally;
                    }
                    AbstractC18219l.adcel(strPurchase, enumC3830l2, (Function0) obj11, interfaceC17242lAmazon, 0L, 0L, 0L, 0L, c6956l, 3072);
                    AbstractC9334l.yandex(c6956l, new C9247l(1.0f, true));
                    if (c16854l.f32890l) {
                        c6956l.m2123default(-353181542);
                        InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 0.0f, 8.0f, 1);
                        C1853l c1853lYandex3 = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), c15089l, c6956l, 6);
                        long j3 = c6956l.f14595continue;
                        int i8 = (int) (j3 ^ (j3 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
                        InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l, interfaceC17242lVip);
                        c6956l.m2140super();
                        if (c6956l.f14603switch) {
                            c6956l.firebase(c16395l);
                        } else {
                            c6956l.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l, c1853lYandex3, c6415l);
                        AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, c6415l2);
                        AbstractC11043l.isPro(i8, c6956l, c6415l3, c6956l, c11192l);
                        AbstractC8182l.billing(c6956l, interfaceC17242lBilling4, c6415l4);
                        AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l, 0, 7);
                        boolean zAdmob2 = c6956l.admob(c16854l);
                        Object objM2132native5 = c6956l.m2132native();
                        if (zAdmob2 || objM2132native5 == c13863l) {
                            objM2132native5 = new C6335l(0, c16854l, C16854l.class, "showEcosystemAlert", "showEcosystemAlert()V", 0, 0, 26);
                            c6956l.m2147try(objM2132native5);
                        }
                        z2 = true;
                        AbstractC17457l.mopub((Function0) ((InterfaceC5059l) objM2132native5), AbstractC0080l.amazon(c4346l, 1.0f), !((Boolean) c16854l.f32887l.getValue()).booleanValue(), null, null, null, AbstractC17742l.loadAd, c6956l, 805306416, 504);
                        c6956l.startapp(true);
                        z3 = false;
                    } else {
                        z2 = true;
                        z3 = false;
                        c6956l.m2123default(-364050049);
                    }
                    c6956l.startapp(z3);
                    c6956l.startapp(z2);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C18023l c18023l = (C18023l) obj9;
                String str4 = (String) obj8;
                C15578l c15578l3 = (C15578l) obj7;
                EnumC2546l enumC2546l = (EnumC2546l) obj6;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j4 = c6956l2.f14595continue;
                    int i9 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l2, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l2);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato4, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i9), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling5, C3438l.amazon);
                    if (z4) {
                        c6956l2.m2123default(-6310935);
                        if (AbstractC8576l.yandex(c18023l.amazon, "artist")) {
                            C0415l c0415l = c18023l.purchase;
                            str2 = c0415l != null ? c0415l.yandex : null;
                        } else {
                            str2 = str4;
                        }
                        AbstractC7741l.amazon(str2, null, AbstractC17463l.loadAd(AbstractC0080l.amazon(c4346l, 1.0f), false), C4176l.yandex, null, c6956l2, 1573296, 1976);
                    } else {
                        c6956l2.m2123default(-35476138);
                    }
                    c6956l2.startapp(false);
                    AbstractC3383l.yandex(C16170l.yandex.yandex(c4346l, C18450l.f36042l), ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).crashlytics.amazon, AbstractC13880l.yandex(C9735l.purchase, C9735l.loadAd, 0L, 0L, c6956l2, 54, 12), null, null, AbstractC14566l.amazon(1102100286, new C2346l(c18023l, z4, c15578l3, enumC2546l), c6956l2), c6956l2, 196608, 24);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
