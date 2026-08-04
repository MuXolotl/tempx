package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٖۥۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16771l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ float f32785l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f32786l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32787l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f32788l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f32789l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f32790l;

    public /* synthetic */ C16771l(int i, float f, C0483l c0483l, C2403l c2403l, C13765l c13765l) {
        this.f32786l = i;
        this.f32785l = f;
        this.f32789l = c0483l;
        this.f32788l = c2403l;
        this.f32790l = c13765l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f32787l;
        C13863l c13863l = C1867l.yandex;
        Object obj3 = this.f32790l;
        Object obj4 = this.f32788l;
        int i2 = this.f32786l;
        Object obj5 = this.f32789l;
        byte b = 0;
        int i3 = 1;
        switch (i) {
            case 0:
                C0483l c0483l = (C0483l) obj5;
                C2403l c2403l = (C2403l) obj4;
                C13765l c13765l = (C13765l) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (i2 < 1) {
                        i2 = 1;
                    }
                    C12015l c12015l = new C12015l(0.0f, i2);
                    C8540l c8540l = AbstractC12502l.yandex;
                    C10164l c10164lCrashlytics = AbstractC1068l.crashlytics(((C9735l) c6956l.isPro(c8540l)).yandex, ((C9735l) c6956l.isPro(c8540l)).yandex, C9735l.isPro, 0L, 0L, c6956l, 3072, 1010);
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
                    boolean zAdmob = c6956l.admob(c0483l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C0464l(c0483l, c13765l, b == true ? 1 : 0);
                        c6956l.m2147try(objM2132native);
                    }
                    Function1 function1 = (Function1) objM2132native;
                    boolean zAdmob2 = c6956l.admob(c0483l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new Ctry(c0483l, c13765l, i3);
                        c6956l.m2147try(objM2132native2);
                    }
                    AbstractC11840l.loadAd(this.f32785l, function1, interfaceC17242lAmazon, false, c12015l, 0, (Function0) objM2132native2, c2403l, c10164lCrashlytics, c6956l, 12583296, 40);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                final C17986l c17986l = (C17986l) obj5;
                final C6523l c6523l = (C6523l) obj4;
                final InterfaceC8533l interfaceC8533l = (InterfaceC8533l) obj3;
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    EnumC1649l enumC1649l = (EnumC1649l) c17986l.f35166l.getValue();
                    boolean zAmazon = c6956l2.amazon(i2);
                    Object objM2132native3 = c6956l2.m2132native();
                    if (zAmazon || objM2132native3 == c13863l) {
                        objM2132native3 = new C2221l(i2, 12);
                        c6956l2.m2147try(objM2132native3);
                    }
                    final float f = this.f32785l;
                    AbstractC7741l.loadAd(enumC1649l, null, (Function1) objM2132native3, null, "", null, AbstractC14566l.amazon(-730911885, new Function4() { // from class: lُؙۙ
                        /* JADX WARN: Code duplicated, block: B:76:0x0577  */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r5v12 */
                        /* JADX WARN: Type inference failed for: r5v13, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r5v24 */
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                            C6415l c6415l;
                            C16395l c16395l;
                            C6415l c6415l2;
                            final int i4;
                            boolean z;
                            C6956l c6956l3;
                            C17986l c17986l2;
                            C13863l c13863l2;
                            float f2;
                            ?? r5;
                            float f3;
                            C6956l c6956l4;
                            C13863l c13863l3;
                            boolean zAdmob3;
                            Object objM2132native4;
                            C16395l c16395l2;
                            boolean z2;
                            C6956l c6956l5 = (C6956l) obj8;
                            ((Integer) obj9).getClass();
                            C15089l c15089l = C18450l.f36034l;
                            int iOrdinal = ((EnumC1649l) obj7).ordinal();
                            final C17986l c17986l3 = c17986l;
                            C11485l c11485l = AbstractC8313l.crashlytics;
                            C4346l c4346l = C4346l.f8873l;
                            C13863l c13863l4 = C1867l.yandex;
                            final int i5 = 0;
                            if (iOrdinal == 0) {
                                c6956l5.m2123default(888540763);
                                InterfaceC17242l interfaceC17242lLoadAd = AbstractC8532l.loadAd(AbstractC3605l.startapp(c4346l, 0.0f, 0.0f, 0.0f, 16.0f + f, 7), null, 3);
                                C1853l c1853lYandex = AbstractC1001l.yandex(c11485l, c15089l, c6956l5, 48);
                                long j = c6956l5.f14595continue;
                                int i6 = (int) (j ^ (j >>> 32));
                                InterfaceC18556l interfaceC18556lSmaato = c6956l5.smaato();
                                InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l5, interfaceC17242lLoadAd);
                                InterfaceC8801l.firebase.getClass();
                                C16395l c16395l3 = C3438l.loadAd;
                                c6956l5.m2140super();
                                if (c6956l5.f14603switch) {
                                    c6956l5.firebase(c16395l3);
                                } else {
                                    c6956l5.m2136protected();
                                }
                                C6415l c6415l3 = C3438l.mopub;
                                AbstractC8182l.billing(c6956l5, c1853lYandex, c6415l3);
                                C6415l c6415l4 = C3438l.billing;
                                AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato, c6415l4);
                                Integer numValueOf = Integer.valueOf(i6);
                                C6415l c6415l5 = C3438l.isPro;
                                AbstractC8182l.billing(c6956l5, numValueOf, c6415l5);
                                C11192l c11192l = C3438l.firebase;
                                AbstractC8182l.purchase(c6956l5, c11192l);
                                C6415l c6415l6 = C3438l.amazon;
                                AbstractC8182l.billing(c6956l5, interfaceC17242lBilling, c6415l6);
                                C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l5, 196608, 31);
                                InterfaceC17069l interfaceC17069l = c17986l3.f35169l;
                                VKProfile vKProfile = c17986l3.f35167l;
                                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l5, interfaceC17069l.getTitle()), AbstractC0080l.amazon(c4346l, 1.0f), AbstractC13106l.purchase(c6956l5).adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l5).purchase, c6956l5, 48, 0, 130040);
                                C6956l c6956l6 = c6956l5;
                                if (vKProfile != null) {
                                    c6956l6.m2123default(-1035969089);
                                    AbstractC9334l.yandex(c6956l6, AbstractC0080l.purchase(c4346l, 16.0f));
                                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l6, 54);
                                    long j2 = c6956l6.f14595continue;
                                    int i7 = (int) (j2 ^ (j2 >>> 32));
                                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l6.smaato();
                                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l6, c4346l);
                                    c6956l6.m2140super();
                                    if (c6956l6.f14603switch) {
                                        c16395l2 = c16395l3;
                                        c6956l6.firebase(c16395l2);
                                    } else {
                                        c16395l2 = c16395l3;
                                        c6956l6.m2136protected();
                                    }
                                    AbstractC8182l.billing(c6956l6, c5062lYandex, c6415l3);
                                    AbstractC8182l.billing(c6956l6, interfaceC18556lSmaato2, c6415l4);
                                    AbstractC11043l.isPro(i7, c6956l6, c6415l5, c6956l6, c11192l);
                                    AbstractC8182l.billing(c6956l6, interfaceC17242lBilling2, c6415l6);
                                    c6415l = c6415l6;
                                    c6415l2 = c6415l3;
                                    AbstractC7741l.purchase(vKProfile.amazon, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l, 24.0f), AbstractC7497l.yandex), new C18627l(AbstractC13106l.purchase(c6956l6).signatures), new C18627l(AbstractC13106l.purchase(c6956l6).signatures), C4176l.yandex, c6956l6, 36912, 6, 31712);
                                    c16395l = c16395l2;
                                    i4 = 1;
                                    AbstractC13010l.loadAd(vKProfile.yandex(), null, AbstractC13106l.purchase(c6956l6).subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l6).firebase, c6956l6, 0, 0, 131066);
                                    C6956l c6956l7 = c6956l6;
                                    c6956l7.startapp(true);
                                    z = false;
                                    c6956l3 = c6956l7;
                                } else {
                                    c6415l = c6415l6;
                                    c16395l = c16395l3;
                                    c6415l2 = c6415l3;
                                    i4 = 1;
                                    z = false;
                                    c6956l6.m2123default(-1042112483);
                                    c6956l3 = c6956l6;
                                }
                                c6956l3.startapp(z);
                                AbstractC9334l.yandex(c6956l3, AbstractC0080l.purchase(c4346l, 16.0f));
                                InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                                boolean zAdmob4 = c6956l3.admob(c17986l3);
                                Object objM2132native5 = c6956l3.m2132native();
                                if (zAdmob4 || objM2132native5 == c13863l4) {
                                    objM2132native5 = new Function0() { // from class: lّؒؓ
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i8 = i4;
                                            C17986l c17986l4 = c17986l3;
                                            switch (i8) {
                                                case 0:
                                                    return Float.valueOf(c17986l4.f35170l.admob() / c17986l4.f35171l.admob());
                                                case 1:
                                                    c17986l4.f35165l.setValue(Boolean.valueOf(!c17986l4.signatures()));
                                                    return Unit.INSTANCE;
                                                default:
                                                    c17986l4.f35173l.setValue(Boolean.valueOf(!c17986l4.isVip()));
                                                    return Unit.INSTANCE;
                                            }
                                        }
                                    };
                                    c6956l3.m2147try(objM2132native5);
                                }
                                final int i8 = 2;
                                AbstractC13319l.yandex(AbstractC15439l.yandex, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native5, 15), null, AbstractC14566l.amazon(1561845444, new C0642l(c17986l3, 2), c6956l3), AbstractC15439l.loadAd, AbstractC14566l.amazon(-1683509630, new C0642l(c17986l3, 3), c6956l3), null, c6956l3, 224262, 452);
                                AbstractC0555l.loadAd(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0L, c6956l3, 6, 6);
                                InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                                boolean zAdmob5 = c6956l3.admob(c17986l3);
                                Object objM2132native6 = c6956l3.m2132native();
                                if (zAdmob5 || objM2132native6 == c13863l4) {
                                    objM2132native6 = new Function0() { // from class: lّؒؓ
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i9 = i8;
                                            C17986l c17986l4 = c17986l3;
                                            switch (i9) {
                                                case 0:
                                                    return Float.valueOf(c17986l4.f35170l.admob() / c17986l4.f35171l.admob());
                                                case 1:
                                                    c17986l4.f35165l.setValue(Boolean.valueOf(!c17986l4.signatures()));
                                                    return Unit.INSTANCE;
                                                default:
                                                    c17986l4.f35173l.setValue(Boolean.valueOf(!c17986l4.isVip()));
                                                    return Unit.INSTANCE;
                                            }
                                        }
                                    };
                                    c6956l3.m2147try(objM2132native6);
                                }
                                AbstractC13319l.yandex(AbstractC15439l.crashlytics, AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) objM2132native6, 15), null, null, AbstractC15439l.amazon, AbstractC14566l.amazon(1012484267, new C0642l(c17986l3, 4), c6956l3), null, c6956l3, 221190, 460);
                                if (c17986l3.isVip()) {
                                    c6956l3.m2123default(-1032224196);
                                    AbstractC9334l.yandex(c6956l3, AbstractC0080l.purchase(c4346l, 8.0f));
                                    C0639l c0639l = (C0639l) c17986l3.f35168l.getValue();
                                    C3790l c3790l = new C3790l(3, 0, 123);
                                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC9966l.billing(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), c6523l);
                                    InterfaceC8533l interfaceC8533l2 = interfaceC8533l;
                                    boolean zBilling = c6956l3.billing(interfaceC8533l2);
                                    Object objM2132native7 = c6956l3.m2132native();
                                    if (zBilling || objM2132native7 == c13863l4) {
                                        objM2132native7 = new C7730l(26, interfaceC8533l2);
                                        c6956l3.m2147try(objM2132native7);
                                    }
                                    InterfaceC17242l interfaceC17242lLoadAd2 = AbstractC9151l.loadAd(interfaceC17242lBilling3, false, null, (Function0) objM2132native7, 15);
                                    boolean zAdmob6 = c6956l3.admob(c17986l3);
                                    Object objM2132native8 = c6956l3.m2132native();
                                    if (zAdmob6 || objM2132native8 == c13863l4) {
                                        objM2132native8 = new C9773l(c17986l3, 1);
                                        c6956l3.m2147try(objM2132native8);
                                    }
                                    C6956l c6956l8 = c6956l3;
                                    c13863l2 = c13863l4;
                                    c17986l2 = c17986l3;
                                    AbstractC2130l.crashlytics(c0639l, (Function1) objM2132native8, interfaceC17242lLoadAd2, false, null, null, null, null, c3790l, null, true, 0, 0, null, null, c6956l8, 0, 12779520, 8224760);
                                    AbstractC9334l.yandex(c6956l8, AbstractC0080l.purchase(c4346l, 8.0f));
                                    f2 = 0.0f;
                                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l8, R.string.library_mass_action_limit_desc), AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), AbstractC13106l.purchase(c6956l8).subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l8).firebase, c6956l8, 48, 0, 131064);
                                    C6956l c6956l9 = c6956l8;
                                    f3 = 16.0f;
                                    AbstractC9334l.yandex(c6956l9, AbstractC0080l.purchase(c4346l, 16.0f));
                                    r5 = 0;
                                    c6956l4 = c6956l9;
                                } else {
                                    c17986l2 = c17986l3;
                                    c13863l2 = c13863l4;
                                    f2 = 0.0f;
                                    r5 = 0;
                                    f3 = 16.0f;
                                    c6956l3.m2123default(-1042112483);
                                    c6956l4 = c6956l3;
                                }
                                c6956l4.startapp(r5);
                                InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c4346l, f3, f2, 2);
                                C5062l c5062lYandex2 = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l4, r5);
                                long j3 = c6956l4.f14595continue;
                                int i9 = (int) (j3 ^ (j3 >>> 32));
                                InterfaceC18556l interfaceC18556lSmaato3 = c6956l4.smaato();
                                InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l4, interfaceC17242lVip);
                                c6956l4.m2140super();
                                if (c6956l4.f14603switch) {
                                    c6956l4.firebase(c16395l);
                                } else {
                                    c6956l4.m2136protected();
                                }
                                AbstractC8182l.billing(c6956l4, c5062lYandex2, c6415l2);
                                AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato3, c6415l4);
                                AbstractC11043l.isPro(i9, c6956l4, c6415l5, c6956l4, c11192l);
                                AbstractC8182l.billing(c6956l4, interfaceC17242lBilling4, c6415l);
                                C17986l c17986l4 = c17986l2;
                                boolean zAdmob7 = c6956l4.admob(c17986l4);
                                Object objM2132native9 = c6956l4.m2132native();
                                if (zAdmob7) {
                                    c13863l3 = c13863l2;
                                } else {
                                    c13863l3 = c13863l2;
                                    if (objM2132native9 == c13863l3) {
                                    }
                                    AbstractC17457l.mopub((Function0) ((InterfaceC5059l) objM2132native9), null, false, null, null, null, AbstractC15439l.purchase, c6956l4, 805306368, 510);
                                    AbstractC9334l.yandex(c6956l4, new C9247l(1.0f, true));
                                    zAdmob3 = c6956l4.admob(c17986l4);
                                    objM2132native4 = c6956l4.m2132native();
                                    if (zAdmob3 || objM2132native4 == c13863l3) {
                                        C10239l c10239l = new C10239l(0, c17986l4, C17986l.class, "initMassAction", "initMassAction()Lkotlinx/coroutines/Job;", 8, 2);
                                        c6956l4.m2147try(c10239l);
                                        objM2132native4 = c10239l;
                                    }
                                    C6956l c6956l10 = c6956l4;
                                    AbstractC17457l.loadAd((Function0) objM2132native4, null, false, null, null, null, null, null, AbstractC15439l.billing, c6956l10, 805306368, 510);
                                    AbstractC12900l.ads(c6956l10, true, true, false);
                                    Unit unit = Unit.INSTANCE;
                                }
                                C13246l c13246l = new C13246l(0, c17986l4, C17986l.class, "dismiss", "dismiss()V", 0, 0, 28);
                                c6956l4.m2147try(c13246l);
                                objM2132native9 = c13246l;
                                AbstractC17457l.mopub((Function0) ((InterfaceC5059l) objM2132native9), null, false, null, null, null, AbstractC15439l.purchase, c6956l4, 805306368, 510);
                                AbstractC9334l.yandex(c6956l4, new C9247l(1.0f, true));
                                zAdmob3 = c6956l4.admob(c17986l4);
                                objM2132native4 = c6956l4.m2132native();
                                if (zAdmob3) {
                                    C10239l c10239l2 = new C10239l(0, c17986l4, C17986l.class, "initMassAction", "initMassAction()Lkotlinx/coroutines/Job;", 8, 2);
                                    c6956l4.m2147try(c10239l2);
                                    objM2132native4 = c10239l2;
                                } else {
                                    C10239l c10239l3 = new C10239l(0, c17986l4, C17986l.class, "initMassAction", "initMassAction()Lkotlinx/coroutines/Job;", 8, 2);
                                    c6956l4.m2147try(c10239l3);
                                    objM2132native4 = c10239l3;
                                }
                                C6956l c6956l11 = c6956l4;
                                AbstractC17457l.loadAd((Function0) objM2132native4, null, false, null, null, null, null, null, AbstractC15439l.billing, c6956l11, 805306368, 510);
                                AbstractC12900l.ads(c6956l11, true, true, false);
                                Unit unit2 = Unit.INSTANCE;
                            } else if (iOrdinal == 1) {
                                c6956l5.m2123default(895185985);
                                InterfaceC17242l interfaceC17242lMetrica = AbstractC3605l.metrica(c4346l, 16.0f, 16.0f, 16.0f, ((C15700l) c6956l5.isPro(AbstractC18678l.yandex)).yandex(c6956l5) + 16.0f);
                                C1853l c1853lYandex2 = AbstractC1001l.yandex(c11485l, c15089l, c6956l5, 48);
                                long j4 = c6956l5.f14595continue;
                                int i10 = (int) (j4 ^ (j4 >>> 32));
                                InterfaceC18556l interfaceC18556lSmaato4 = c6956l5.smaato();
                                InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l5, interfaceC17242lMetrica);
                                InterfaceC8801l.firebase.getClass();
                                C16395l c16395l4 = C3438l.loadAd;
                                c6956l5.m2140super();
                                if (c6956l5.f14603switch) {
                                    c6956l5.firebase(c16395l4);
                                } else {
                                    c6956l5.m2136protected();
                                }
                                AbstractC8182l.billing(c6956l5, c1853lYandex2, C3438l.mopub);
                                AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato4, C3438l.billing);
                                AbstractC8182l.billing(c6956l5, Integer.valueOf(i10), C3438l.isPro);
                                AbstractC8182l.purchase(c6956l5, C3438l.firebase);
                                AbstractC8182l.billing(c6956l5, interfaceC17242lBilling5, C3438l.amazon);
                                if (c17986l3.f35171l.admob() == 0 || c17986l3.f35170l.admob() == 0) {
                                    z2 = false;
                                    c6956l5.m2123default(1642799021);
                                    AbstractC4332l.amazon(null, 0L, 0L, 0, 0.0f, c6956l5, 0, 31);
                                    c6956l5.startapp(false);
                                } else {
                                    c6956l5.m2123default(1642566397);
                                    boolean zAdmob8 = c6956l5.admob(c17986l3);
                                    Object objM2132native10 = c6956l5.m2132native();
                                    if (zAdmob8 || objM2132native10 == c13863l4) {
                                        objM2132native10 = new Function0() { // from class: lّؒؓ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i11 = i5;
                                                C17986l c17986l5 = c17986l3;
                                                switch (i11) {
                                                    case 0:
                                                        return Float.valueOf(c17986l5.f35170l.admob() / c17986l5.f35171l.admob());
                                                    case 1:
                                                        c17986l5.f35165l.setValue(Boolean.valueOf(!c17986l5.signatures()));
                                                        return Unit.INSTANCE;
                                                    default:
                                                        c17986l5.f35173l.setValue(Boolean.valueOf(!c17986l5.isVip()));
                                                        return Unit.INSTANCE;
                                                }
                                            }
                                        };
                                        c6956l5.m2147try(objM2132native10);
                                    }
                                    Function0 function0 = (Function0) objM2132native10;
                                    z2 = false;
                                    AbstractC4332l.loadAd(function0, null, 0L, 0L, 0, 0.0f, null, c6956l5, 0, 126);
                                    c6956l5 = c6956l5;
                                    c6956l5.startapp(false);
                                }
                                c6956l5.startapp(true);
                                c6956l5.startapp(z2);
                                Unit unit3 = Unit.INSTANCE;
                            } else if (iOrdinal == 2) {
                                c6956l5.m2123default(896107677);
                                c17986l3.pro(c6956l5, 0);
                                c6956l5.startapp(false);
                                Unit unit4 = Unit.INSTANCE;
                            } else {
                                if (iOrdinal != 3) {
                                    throw AbstractC12900l.billing(1968324265, c6956l5, false);
                                }
                                c6956l5.m2123default(896231150);
                                c17986l3.ad(c6956l5, 0);
                                c6956l5.startapp(false);
                                Unit unit5 = Unit.INSTANCE;
                            }
                            return Unit.INSTANCE;
                        }
                    }, c6956l2), c6956l2, 1597440, 42);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C16771l(C17986l c17986l, int i, float f, C6523l c6523l, InterfaceC8533l interfaceC8533l) {
        this.f32789l = c17986l;
        this.f32786l = i;
        this.f32785l = f;
        this.f32788l = c6523l;
        this.f32790l = interfaceC8533l;
    }
}
