package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍؗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5173l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f11235l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f11236l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11237l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f11238l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f11239l;

    public /* synthetic */ C5173l(int i, InterfaceC8714l interfaceC8714l, C13640l c13640l, InterfaceC8714l interfaceC8714l2) {
        this.f11237l = 1;
        this.f11236l = i;
        this.f11235l = interfaceC8714l;
        this.f11239l = c13640l;
        this.f11238l = interfaceC8714l2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f11237l;
        final int i2 = 5;
        C16170l c16170l = C16170l.yandex;
        final int i3 = 6;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        Object obj4 = this.f11238l;
        Object obj5 = this.f11239l;
        int i4 = this.f11236l;
        Object obj6 = this.f11235l;
        byte b = 0;
        switch (i) {
            case 0:
                final C7117l c7117l = (C7117l) obj6;
                final Function1 function1 = (Function1) obj5;
                Function0 function0 = (Function0) obj4;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j = c6956l.f14595continue;
                    int i5 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
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
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC13010l.loadAd(AbstractC0653l.vip(i4, "Band #"), c16170l.yandex(c4346l, C18450l.f36035l), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262140);
                    AbstractC7470l.billing(function0, c16170l.yandex(c4346l, C18450l.f36018l), false, null, null, null, AbstractC15788l.subs, c6956l, 1572864, 60);
                    c6956l.startapp(true);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l, 0, 7);
                    String strPurchase = AbstractC11999l.purchase(c6956l, R.string.eq3_param_cutoff);
                    float f = c7117l.f14907l;
                    String strPurchase2 = AbstractC11999l.purchase(c6956l, R.string.eq3_units_hz);
                    boolean zBilling = c6956l.billing(function1) | c6956l.admob(c7117l);
                    Object objM2132native = c6956l.m2132native();
                    if (zBilling || objM2132native == c13863l) {
                        final int i6 = 0;
                        objM2132native = new Function1() { // from class: lٔ۠ٛ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                int i7 = i6;
                                Function1 function2 = function1;
                                Float f2 = (Float) obj7;
                                switch (i7) {
                                    case 0:
                                        function2.invoke(C7117l.loadAd(c7117l, f2.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 510));
                                        break;
                                    case 1:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, f2.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 509));
                                        break;
                                    case 2:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, f2.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 507));
                                        break;
                                    case 3:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, f2.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 503));
                                        break;
                                    case 4:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2.floatValue(), 0.0f, 447));
                                        break;
                                    case 5:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, f2.floatValue(), 0.0f, 0.0f, 0.0f, 495));
                                        break;
                                    case 6:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2.floatValue(), 0.0f, 0.0f, 479));
                                        break;
                                    default:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2.floatValue(), 383));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC11028l.mopub(strPurchase, strPurchase2, f, (Function1) objM2132native, null, c6956l, 0);
                    String strPurchase3 = AbstractC11999l.purchase(c6956l, R.string.eq3_param_attack);
                    float f2 = c7117l.f14906l;
                    String strPurchase4 = AbstractC11999l.purchase(c6956l, R.string.eq3_units_ms);
                    boolean zBilling2 = c6956l.billing(function1) | c6956l.admob(c7117l);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zBilling2 || objM2132native2 == c13863l) {
                        final int i7 = 1;
                        objM2132native2 = new Function1() { // from class: lٔ۠ٛ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                int i8 = i7;
                                Function1 function2 = function1;
                                Float f3 = (Float) obj7;
                                switch (i8) {
                                    case 0:
                                        function2.invoke(C7117l.loadAd(c7117l, f3.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 510));
                                        break;
                                    case 1:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, f3.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 509));
                                        break;
                                    case 2:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, f3.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 507));
                                        break;
                                    case 3:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, f3.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 503));
                                        break;
                                    case 4:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f3.floatValue(), 0.0f, 447));
                                        break;
                                    case 5:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, f3.floatValue(), 0.0f, 0.0f, 0.0f, 495));
                                        break;
                                    case 6:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f3.floatValue(), 0.0f, 0.0f, 479));
                                        break;
                                    default:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f3.floatValue(), 383));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l.m2147try(objM2132native2);
                    }
                    AbstractC11028l.mopub(strPurchase3, strPurchase4, f2, (Function1) objM2132native2, null, c6956l, 0);
                    String strPurchase5 = AbstractC11999l.purchase(c6956l, R.string.eq3_param_release);
                    float f3 = c7117l.f14909l;
                    String strPurchase6 = AbstractC11999l.purchase(c6956l, R.string.eq3_units_ms);
                    boolean zBilling3 = c6956l.billing(function1) | c6956l.admob(c7117l);
                    Object objM2132native3 = c6956l.m2132native();
                    if (zBilling3 || objM2132native3 == c13863l) {
                        final int i8 = 2;
                        objM2132native3 = new Function1() { // from class: lٔ۠ٛ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                int i9 = i8;
                                Function1 function2 = function1;
                                Float f4 = (Float) obj7;
                                switch (i9) {
                                    case 0:
                                        function2.invoke(C7117l.loadAd(c7117l, f4.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 510));
                                        break;
                                    case 1:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, f4.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 509));
                                        break;
                                    case 2:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, f4.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 507));
                                        break;
                                    case 3:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, f4.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 503));
                                        break;
                                    case 4:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f4.floatValue(), 0.0f, 447));
                                        break;
                                    case 5:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, f4.floatValue(), 0.0f, 0.0f, 0.0f, 495));
                                        break;
                                    case 6:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f4.floatValue(), 0.0f, 0.0f, 479));
                                        break;
                                    default:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f4.floatValue(), 383));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l.m2147try(objM2132native3);
                    }
                    AbstractC11028l.mopub(strPurchase5, strPurchase6, f3, (Function1) objM2132native3, null, c6956l, 0);
                    String strPurchase7 = AbstractC11999l.purchase(c6956l, R.string.eq3_param_ratio);
                    float f4 = c7117l.f14909l;
                    boolean zBilling4 = c6956l.billing(function1) | c6956l.admob(c7117l);
                    Object objM2132native4 = c6956l.m2132native();
                    if (zBilling4 || objM2132native4 == c13863l) {
                        final int i9 = 3;
                        objM2132native4 = new Function1() { // from class: lٔ۠ٛ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                int i10 = i9;
                                Function1 function2 = function1;
                                Float f5 = (Float) obj7;
                                switch (i10) {
                                    case 0:
                                        function2.invoke(C7117l.loadAd(c7117l, f5.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 510));
                                        break;
                                    case 1:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, f5.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 509));
                                        break;
                                    case 2:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, f5.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 507));
                                        break;
                                    case 3:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, f5.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 503));
                                        break;
                                    case 4:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f5.floatValue(), 0.0f, 447));
                                        break;
                                    case 5:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, f5.floatValue(), 0.0f, 0.0f, 0.0f, 495));
                                        break;
                                    case 6:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f5.floatValue(), 0.0f, 0.0f, 479));
                                        break;
                                    default:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f5.floatValue(), 383));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l.m2147try(objM2132native4);
                    }
                    AbstractC11028l.mopub(strPurchase7, "", f4, (Function1) objM2132native4, null, c6956l, 48);
                    String strPurchase8 = AbstractC11999l.purchase(c6956l, R.string.eq3_param_expander_ratio);
                    float f5 = c7117l.f14905l;
                    boolean zBilling5 = c6956l.billing(function1) | c6956l.admob(c7117l);
                    Object objM2132native5 = c6956l.m2132native();
                    if (zBilling5 || objM2132native5 == c13863l) {
                        final int i10 = 4;
                        objM2132native5 = new Function1() { // from class: lٔ۠ٛ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                int i11 = i10;
                                Function1 function2 = function1;
                                Float f6 = (Float) obj7;
                                switch (i11) {
                                    case 0:
                                        function2.invoke(C7117l.loadAd(c7117l, f6.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 510));
                                        break;
                                    case 1:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, f6.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 509));
                                        break;
                                    case 2:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, f6.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 507));
                                        break;
                                    case 3:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, f6.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 503));
                                        break;
                                    case 4:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f6.floatValue(), 0.0f, 447));
                                        break;
                                    case 5:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, f6.floatValue(), 0.0f, 0.0f, 0.0f, 495));
                                        break;
                                    case 6:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f6.floatValue(), 0.0f, 0.0f, 479));
                                        break;
                                    default:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f6.floatValue(), 383));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l.m2147try(objM2132native5);
                    }
                    AbstractC11028l.mopub(strPurchase8, "", f5, (Function1) objM2132native5, null, c6956l, 48);
                    String strPurchase9 = AbstractC11999l.purchase(c6956l, R.string.eq3_param_threshold);
                    float f6 = c7117l.f14904l;
                    String strPurchase10 = AbstractC11999l.purchase(c6956l, R.string.eq3_units_db);
                    boolean zBilling6 = c6956l.billing(function1) | c6956l.admob(c7117l);
                    Object objM2132native6 = c6956l.m2132native();
                    if (zBilling6 || objM2132native6 == c13863l) {
                        objM2132native6 = new Function1() { // from class: lٔ۠ٛ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                int i11 = i2;
                                Function1 function2 = function1;
                                Float f7 = (Float) obj7;
                                switch (i11) {
                                    case 0:
                                        function2.invoke(C7117l.loadAd(c7117l, f7.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 510));
                                        break;
                                    case 1:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, f7.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 509));
                                        break;
                                    case 2:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, f7.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 507));
                                        break;
                                    case 3:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, f7.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 503));
                                        break;
                                    case 4:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f7.floatValue(), 0.0f, 447));
                                        break;
                                    case 5:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, f7.floatValue(), 0.0f, 0.0f, 0.0f, 495));
                                        break;
                                    case 6:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f7.floatValue(), 0.0f, 0.0f, 479));
                                        break;
                                    default:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f7.floatValue(), 383));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l.m2147try(objM2132native6);
                    }
                    AbstractC11028l.mopub(strPurchase9, strPurchase10, f6, (Function1) objM2132native6, null, c6956l, 0);
                    String strPurchase11 = AbstractC11999l.purchase(c6956l, R.string.eq3_param_noise_gate_threshold);
                    float f7 = c7117l.f14908l;
                    String strPurchase12 = AbstractC11999l.purchase(c6956l, R.string.eq3_units_db);
                    boolean zBilling7 = c6956l.billing(function1) | c6956l.admob(c7117l);
                    Object objM2132native7 = c6956l.m2132native();
                    if (zBilling7 || objM2132native7 == c13863l) {
                        objM2132native7 = new Function1() { // from class: lٔ۠ٛ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                int i11 = i3;
                                Function1 function2 = function1;
                                Float f8 = (Float) obj7;
                                switch (i11) {
                                    case 0:
                                        function2.invoke(C7117l.loadAd(c7117l, f8.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 510));
                                        break;
                                    case 1:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, f8.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 509));
                                        break;
                                    case 2:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, f8.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 507));
                                        break;
                                    case 3:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, f8.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 503));
                                        break;
                                    case 4:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f8.floatValue(), 0.0f, 447));
                                        break;
                                    case 5:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, f8.floatValue(), 0.0f, 0.0f, 0.0f, 495));
                                        break;
                                    case 6:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f8.floatValue(), 0.0f, 0.0f, 479));
                                        break;
                                    default:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f8.floatValue(), 383));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l.m2147try(objM2132native7);
                    }
                    AbstractC11028l.mopub(strPurchase11, strPurchase12, f7, (Function1) objM2132native7, null, c6956l, 0);
                    String strPurchase13 = AbstractC11999l.purchase(c6956l, R.string.eq3_param_gain);
                    float f8 = c7117l.f14910l;
                    String strPurchase14 = AbstractC11999l.purchase(c6956l, R.string.eq3_units_db);
                    boolean zBilling8 = c6956l.billing(function1) | c6956l.admob(c7117l);
                    Object objM2132native8 = c6956l.m2132native();
                    if (zBilling8 || objM2132native8 == c13863l) {
                        final int i11 = 7;
                        objM2132native8 = new Function1() { // from class: lٔ۠ٛ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                int i12 = i11;
                                Function1 function2 = function1;
                                Float f9 = (Float) obj7;
                                switch (i12) {
                                    case 0:
                                        function2.invoke(C7117l.loadAd(c7117l, f9.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 510));
                                        break;
                                    case 1:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, f9.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 509));
                                        break;
                                    case 2:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, f9.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 507));
                                        break;
                                    case 3:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, f9.floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 503));
                                        break;
                                    case 4:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f9.floatValue(), 0.0f, 447));
                                        break;
                                    case 5:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, f9.floatValue(), 0.0f, 0.0f, 0.0f, 495));
                                        break;
                                    case 6:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f9.floatValue(), 0.0f, 0.0f, 479));
                                        break;
                                    default:
                                        function2.invoke(C7117l.loadAd(c7117l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f9.floatValue(), 383));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l.m2147try(objM2132native8);
                    }
                    AbstractC11028l.mopub(strPurchase13, strPurchase14, f8, (Function1) objM2132native8, null, c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) obj6;
                C13640l c13640l = (C13640l) obj5;
                InterfaceC12244l interfaceC12244l2 = (InterfaceC12244l) obj4;
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l2.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    InterfaceC3393l interfaceC3393l = (InterfaceC3393l) interfaceC12244l.getValue();
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(c4346l, 1.0f);
                    boolean zAmazon = c6956l2.amazon(i4);
                    Object objM2132native9 = c6956l2.m2132native();
                    if (zAmazon || objM2132native9 == c13863l) {
                        objM2132native9 = new C2221l(i4, 7);
                        c6956l2.m2147try(objM2132native9);
                    }
                    AbstractC7741l.loadAd(interfaceC3393l, interfaceC17242lCrashlytics, (Function1) objM2132native9, null, "", null, AbstractC14566l.amazon(-236359499, new C15881l(interfaceC11780l, c13640l, interfaceC12244l2, 2), c6956l2), c6956l2, 1597488, 40);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                InterfaceC12244l interfaceC12244l3 = (InterfaceC12244l) obj6;
                C1253l c1253l = (C1253l) obj5;
                final InterfaceC12244l interfaceC12244l4 = (InterfaceC12244l) obj4;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j2 = c6956l3.f14595continue;
                    int i12 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l3, interfaceC17242lAmazon);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l3.m2140super();
                    if (c6956l3.f14603switch) {
                        c6956l3.firebase(c16395l2);
                    } else {
                        c6956l3.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l3, interfaceC10835lAmazon2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l3, Integer.valueOf(i12), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling2, C3438l.amazon);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, R.string.configure_recommendations_done), AbstractC0080l.amazon(c4346l, 1.0f), ((C9735l) interfaceC12244l3.getValue()).yandex, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 48, 0, 262136);
                    EnumC5710l enumC5710l = ((Boolean) c1253l.f3278l.getValue()).booleanValue() ? EnumC5710l.f12088l : c1253l.f3281l.size() >= 5 ? EnumC5710l.f12089l : EnumC5710l.f12090l;
                    InterfaceC17242l interfaceC17242lYandex = c16170l.yandex(c4346l, C18450l.f36018l);
                    boolean zAmazon2 = c6956l3.amazon(i4);
                    Object objM2132native10 = c6956l3.m2132native();
                    if (zAmazon2 || objM2132native10 == c13863l) {
                        objM2132native10 = new C2221l(i4, 20);
                        c6956l3.m2147try(objM2132native10);
                    }
                    Function1 function2 = (Function1) objM2132native10;
                    final int i13 = 0;
                    AbstractC7741l.loadAd(enumC5710l, interfaceC17242lYandex, function2, null, null, null, AbstractC14566l.amazon(986050430, new Function4() { // from class: lؘؖۨ
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                            int i14 = i13;
                            C4346l c4346l2 = C4346l.f8873l;
                            InterfaceC12244l interfaceC12244l5 = interfaceC12244l4;
                            switch (i14) {
                                case 0:
                                    C6956l c6956l4 = (C6956l) obj9;
                                    ((Integer) obj10).getClass();
                                    int iOrdinal = ((EnumC5710l) obj8).ordinal();
                                    if (iOrdinal == 0) {
                                        c6956l4.m2123default(2147137302);
                                        AbstractC4597l.yandex(AbstractC3234l.billing(), null, AbstractC0080l.isPro(c4346l2, 20.0f), ((C9735l) interfaceC12244l5.getValue()).yandex, c6956l4, 432, 0);
                                        c6956l4.startapp(false);
                                    } else if (iOrdinal == 1) {
                                        c6956l4.m2123default(2147403406);
                                        AbstractC4597l.yandex(AbstractC7709l.loadAd(), null, AbstractC0080l.isPro(c4346l2, 20.0f), ((C9735l) interfaceC12244l5.getValue()).yandex, c6956l4, 432, 0);
                                        c6956l4.startapp(false);
                                    } else {
                                        if (iOrdinal != 2) {
                                            throw AbstractC12900l.billing(-1593307090, c6956l4, false);
                                        }
                                        c6956l4.m2123default(-2147282844);
                                        AbstractC12491l.yandex(null, ((C9735l) interfaceC12244l5.getValue()).yandex, 2.0f, 20.0f, c6956l4, 3456);
                                        c6956l4.startapp(false);
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C6956l c6956l5 = (C6956l) obj9;
                                    ((Integer) obj10).getClass();
                                    int iOrdinal2 = ((EnumC3830l) obj8).ordinal();
                                    if (iOrdinal2 == 0) {
                                        c6956l5.m2123default(68035874);
                                        AbstractC4597l.yandex(AbstractC3234l.billing(), null, AbstractC0080l.isPro(c4346l2, 20.0f), ((C9735l) interfaceC12244l5.getValue()).yandex, c6956l5, 432, 0);
                                        c6956l5.startapp(false);
                                    } else if (iOrdinal2 == 1) {
                                        c6956l5.m2123default(68256346);
                                        AbstractC4597l.yandex(AbstractC7709l.loadAd(), null, AbstractC0080l.isPro(c4346l2, 20.0f), ((C9735l) interfaceC12244l5.getValue()).yandex, c6956l5, 432, 0);
                                        c6956l5.startapp(false);
                                    } else {
                                        if (iOrdinal2 != 2) {
                                            throw AbstractC12900l.billing(-1660374681, c6956l5, false);
                                        }
                                        c6956l5.m2123default(68486800);
                                        AbstractC16888l.yandex(null, ((C9735l) interfaceC12244l5.getValue()).yandex, 2.0f, 20.0f, c6956l5, 3456, 1);
                                        c6956l5.startapp(false);
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, c6956l3), c6956l3, 1572864, 56);
                    c6956l3.startapp(true);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 3:
                String str = (String) obj6;
                EnumC3830l enumC3830l = (EnumC3830l) obj5;
                final InterfaceC12244l interfaceC12244l5 = (InterfaceC12244l) obj4;
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                    InterfaceC10835l interfaceC10835lAmazon3 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j3 = c6956l4.f14595continue;
                    int i14 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l4.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l4, interfaceC17242lAmazon2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l4.m2140super();
                    if (c6956l4.f14603switch) {
                        c6956l4.firebase(c16395l3);
                    } else {
                        c6956l4.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l4, interfaceC10835lAmazon3, C3438l.mopub);
                    AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato3, C3438l.billing);
                    AbstractC8182l.billing(c6956l4, Integer.valueOf(i14), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l4, C3438l.firebase);
                    AbstractC8182l.billing(c6956l4, interfaceC17242lBilling3, C3438l.amazon);
                    AbstractC13010l.loadAd(str, null, ((C9735l) interfaceC12244l5.getValue()).yandex, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262138);
                    InterfaceC17242l interfaceC17242lYandex2 = c16170l.yandex(c4346l, C18450l.f36018l);
                    boolean zAmazon3 = c6956l4.amazon(i4);
                    Object objM2132native11 = c6956l4.m2132native();
                    if (zAmazon3 || objM2132native11 == c13863l) {
                        objM2132native11 = new C4119l(i4, b == true ? 1 : 0);
                        c6956l4.m2147try(objM2132native11);
                    }
                    final int i15 = 1;
                    AbstractC7741l.loadAd(enumC3830l, interfaceC17242lYandex2, (Function1) objM2132native11, null, "", null, AbstractC14566l.amazon(-2030775784, new Function4() { // from class: lؘؖۨ
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                            int i16 = i15;
                            C4346l c4346l2 = C4346l.f8873l;
                            InterfaceC12244l interfaceC12244l6 = interfaceC12244l5;
                            switch (i16) {
                                case 0:
                                    C6956l c6956l5 = (C6956l) obj9;
                                    ((Integer) obj10).getClass();
                                    int iOrdinal = ((EnumC5710l) obj8).ordinal();
                                    if (iOrdinal == 0) {
                                        c6956l5.m2123default(2147137302);
                                        AbstractC4597l.yandex(AbstractC3234l.billing(), null, AbstractC0080l.isPro(c4346l2, 20.0f), ((C9735l) interfaceC12244l6.getValue()).yandex, c6956l5, 432, 0);
                                        c6956l5.startapp(false);
                                    } else if (iOrdinal == 1) {
                                        c6956l5.m2123default(2147403406);
                                        AbstractC4597l.yandex(AbstractC7709l.loadAd(), null, AbstractC0080l.isPro(c4346l2, 20.0f), ((C9735l) interfaceC12244l6.getValue()).yandex, c6956l5, 432, 0);
                                        c6956l5.startapp(false);
                                    } else {
                                        if (iOrdinal != 2) {
                                            throw AbstractC12900l.billing(-1593307090, c6956l5, false);
                                        }
                                        c6956l5.m2123default(-2147282844);
                                        AbstractC12491l.yandex(null, ((C9735l) interfaceC12244l6.getValue()).yandex, 2.0f, 20.0f, c6956l5, 3456);
                                        c6956l5.startapp(false);
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C6956l c6956l6 = (C6956l) obj9;
                                    ((Integer) obj10).getClass();
                                    int iOrdinal2 = ((EnumC3830l) obj8).ordinal();
                                    if (iOrdinal2 == 0) {
                                        c6956l6.m2123default(68035874);
                                        AbstractC4597l.yandex(AbstractC3234l.billing(), null, AbstractC0080l.isPro(c4346l2, 20.0f), ((C9735l) interfaceC12244l6.getValue()).yandex, c6956l6, 432, 0);
                                        c6956l6.startapp(false);
                                    } else if (iOrdinal2 == 1) {
                                        c6956l6.m2123default(68256346);
                                        AbstractC4597l.yandex(AbstractC7709l.loadAd(), null, AbstractC0080l.isPro(c4346l2, 20.0f), ((C9735l) interfaceC12244l6.getValue()).yandex, c6956l6, 432, 0);
                                        c6956l6.startapp(false);
                                    } else {
                                        if (iOrdinal2 != 2) {
                                            throw AbstractC12900l.billing(-1660374681, c6956l6, false);
                                        }
                                        c6956l6.m2123default(68486800);
                                        AbstractC16888l.yandex(null, ((C9735l) interfaceC12244l6.getValue()).yandex, 2.0f, 20.0f, c6956l6, 3456, 1);
                                        c6956l6.startapp(false);
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, c6956l4), c6956l4, 1597440, 40);
                    c6956l4.startapp(true);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC3102l interfaceC3102l = (InterfaceC3102l) obj6;
                C0675l c0675l = (C0675l) obj5;
                InterfaceC12244l interfaceC12244l6 = (InterfaceC12244l) obj4;
                InterfaceC11780l interfaceC11780l2 = (InterfaceC11780l) obj;
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= c6956l5.billing(interfaceC11780l2) ? 4 : 2;
                }
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lMopub = AbstractC16422l.mopub(AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l2), interfaceC3102l.loadAd(), null);
                    boolean zAdmob = c6956l5.admob(c0675l) | c6956l5.amazon(i4) | c6956l5.billing(interfaceC12244l6);
                    Object objM2132native12 = c6956l5.m2132native();
                    if (zAdmob || objM2132native12 == c13863l) {
                        objM2132native12 = new C8608l(c0675l, i4, interfaceC12244l6, i3);
                        c6956l5.m2147try(objM2132native12);
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub, null, null, null, null, null, false, null, (Function1) objM2132native12, c6956l5, 0, 510);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            default:
                Function1 function3 = (Function1) obj5;
                C6523l c6523l = (C6523l) obj4;
                C3809l c3809l = (C3809l) obj;
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i16 = 0;
                for (Object obj7 : ((C8585l) obj6).purchase) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        AbstractC14055l.subscription();
                        throw null;
                    }
                    InterfaceC4717l interfaceC4717l = (InterfaceC4717l) obj7;
                    boolean z = i16 == i4;
                    boolean zBilling9 = c6956l6.billing(function3) | c6956l6.amazon(i16);
                    Object objM2132native13 = c6956l6.m2132native();
                    if (zBilling9 || objM2132native13 == c13863l) {
                        objM2132native13 = new C8803l(function3, i16, 9);
                        c6956l6.m2147try(objM2132native13);
                    }
                    AbstractC0079l.yandex(c3809l, z, (Function0) objM2132native13, AbstractC9679l.billing(c4346l, i16 == i4, AbstractC9966l.billing(c4346l, c6523l)), null, false, null, AbstractC14566l.amazon(-2021387958, new C16561l(25, interfaceC4717l), c6956l6), c6956l6, (iIntValue6 & 14) | 100663296);
                    i16 = i17;
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C5173l(C8585l c8585l, int i, Function1 function1, C6523l c6523l) {
        this.f11237l = 5;
        this.f11235l = c8585l;
        this.f11236l = i;
        this.f11239l = function1;
        this.f11238l = c6523l;
    }

    public /* synthetic */ C5173l(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.f11237l = i2;
        this.f11235l = obj;
        this.f11239l = obj2;
        this.f11236l = i;
        this.f11238l = obj3;
    }
}
