package defpackage;

import android.app.Activity;
import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lَّْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13323l implements Function3 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ Object f26127l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ String f26128l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ String f26129l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f26130l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3102l f26131l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26132l = 1;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ int f26133l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ String f26134l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ long f26135l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ C1358l f26136l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C13849l f26137l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C2391l f26138l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ C1358l f26139l;

    public /* synthetic */ C13323l(C13849l c13849l, InterfaceC2262l interfaceC2262l, C2663l c2663l, String str, long j, String str2, C2391l c2391l, String str3, boolean z, int i, C1358l c1358l, C1358l c1358l2) {
        this.f26137l = c13849l;
        this.f26127l = interfaceC2262l;
        this.f26131l = c2663l;
        this.f26128l = str;
        this.f26135l = j;
        this.f26134l = str2;
        this.f26138l = c2391l;
        this.f26129l = str3;
        this.f26130l = z;
        this.f26133l = i;
        this.f26139l = c1358l;
        this.f26136l = c1358l2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f26132l;
        C13863l c13863l = C1867l.yandex;
        Object obj4 = this.f26127l;
        switch (i) {
            case 0:
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj4;
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    C13849l c13849l = this.f26137l;
                    boolean z = ((InterfaceC8289l) c13849l.f27087l.getValue()) instanceof C10921l;
                    boolean zAdmob = c6956l.admob(interfaceC2262l) | c6956l.admob(c13849l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C14835l(interfaceC2262l, c13849l, 1);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC9256l.loadAd(z, (Function0) objM2132native, null, null, null, null, false, 0.0f, AbstractC14566l.amazon(-2020057951, new C13323l(this.f26131l, this.f26128l, this.f26135l, interfaceC11780l, this.f26134l, this.f26138l, this.f26129l, this.f26130l, c13849l, this.f26133l, this.f26139l, this.f26136l), c6956l), c6956l, 100663296, 252);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                final InterfaceC11780l interfaceC11780l2 = (InterfaceC11780l) obj4;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    C17253l c17253lLoadAd = ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).loadAd(c6956l2);
                    InterfaceC17242l interfaceC17242lMopub = AbstractC16422l.mopub(AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), this.f26131l.loadAd(), null);
                    final String str = this.f26128l;
                    boolean zBilling = c6956l2.billing(str);
                    final long j = this.f26135l;
                    boolean zPurchase = zBilling | c6956l2.purchase(j) | c6956l2.billing(interfaceC11780l2);
                    final String str2 = this.f26134l;
                    boolean zBilling2 = zPurchase | c6956l2.billing(str2);
                    final C2391l c2391l = this.f26138l;
                    boolean zAdmob2 = zBilling2 | c6956l2.admob(c2391l);
                    final String str3 = this.f26129l;
                    boolean zBilling3 = zAdmob2 | c6956l2.billing(str3);
                    final boolean z2 = this.f26130l;
                    boolean zMopub = zBilling3 | c6956l2.mopub(z2);
                    final C13849l c13849l2 = this.f26137l;
                    boolean zAdmob3 = zMopub | c6956l2.admob(c13849l2);
                    final int i2 = this.f26133l;
                    boolean zAmazon = zAdmob3 | c6956l2.amazon(i2);
                    final C1358l c1358l = this.f26139l;
                    boolean zAdmob4 = zAmazon | c6956l2.admob(c1358l);
                    final C1358l c1358l2 = this.f26136l;
                    boolean zAdmob5 = c6956l2.admob(c1358l2) | zAdmob4;
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob5 || objM2132native2 == c13863l) {
                        Function1 function1 = new Function1() { // from class: lًٜۤ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                C1336l c1336l = (C1336l) obj5;
                                final String str4 = str;
                                final long j2 = j;
                                final InterfaceC11780l interfaceC11780l3 = interfaceC11780l2;
                                final String str5 = str2;
                                final C2391l c2391l2 = c2391l;
                                final String str6 = str3;
                                final int i3 = 1;
                                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1229448020, true, new Function3() { // from class: lٔۘۡ
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj6, Object obj7, Object obj8) throws IOException {
                                        int i4;
                                        C6956l c6956l3 = (C6956l) obj7;
                                        int iIntValue3 = ((Integer) obj8).intValue();
                                        if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                            C4346l c4346l = C4346l.f8873l;
                                            InterfaceC17242l interfaceC17242lPurchase = AbstractC10409l.purchase(AbstractC0080l.amazon(c4346l, 1.0f));
                                            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                                            long j3 = c6956l3.f14595continue;
                                            int i5 = (int) (j3 ^ (j3 >>> 32));
                                            InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
                                            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, interfaceC17242lPurchase);
                                            InterfaceC8801l.firebase.getClass();
                                            C16395l c16395l = C3438l.loadAd;
                                            c6956l3.m2140super();
                                            if (c6956l3.f14603switch) {
                                                c6956l3.firebase(c16395l);
                                            } else {
                                                c6956l3.m2136protected();
                                            }
                                            C6415l c6415l = C3438l.mopub;
                                            AbstractC8182l.billing(c6956l3, interfaceC10835lAmazon, c6415l);
                                            C6415l c6415l2 = C3438l.billing;
                                            AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato, c6415l2);
                                            Integer numValueOf = Integer.valueOf(i5);
                                            C6415l c6415l3 = C3438l.isPro;
                                            AbstractC8182l.billing(c6956l3, numValueOf, c6415l3);
                                            C11192l c11192l = C3438l.firebase;
                                            AbstractC8182l.purchase(c6956l3, c11192l);
                                            C6415l c6415l4 = C3438l.amazon;
                                            AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, c6415l4);
                                            C18627l c18627l = new C18627l(AbstractC13106l.purchase(c6956l3).signatures);
                                            C18627l c18627l2 = new C18627l(AbstractC13106l.purchase(c6956l3).signatures);
                                            C9477l c9477l = new C9477l((Context) c6956l3.isPro(AbstractC1242l.loadAd));
                                            c9477l.crashlytics = str4;
                                            AbstractC12872l.crashlytics(c9477l, new C5739l(AbstractC12098l.crashlytics(c6956l3)));
                                            C7819l c7819lYandex = c9477l.yandex();
                                            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(c4346l, 1.0f);
                                            long j4 = j2;
                                            boolean zPurchase2 = c6956l3.purchase(j4);
                                            Object objM2132native3 = c6956l3.m2132native();
                                            if (zPurchase2 || objM2132native3 == C1867l.yandex) {
                                                i4 = 2;
                                                objM2132native3 = new C4199l(j4, 2);
                                                c6956l3.m2147try(objM2132native3);
                                            } else {
                                                i4 = 2;
                                            }
                                            AbstractC7741l.purchase(c7819lYandex, null, AbstractC14289l.smaato(interfaceC17242lCrashlytics, (Function1) objM2132native3), c18627l, c18627l2, C4176l.yandex, c6956l3, 36912, 6, 31712);
                                            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(C16170l.yandex.yandex(AbstractC3605l.firebase(AbstractC0080l.amazon(c4346l, 1.0f), interfaceC11780l3), C18450l.f36021l), 16.0f, 0.0f, i4);
                                            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36046l, c6956l3, 6);
                                            long j5 = c6956l3.f14595continue;
                                            int i6 = (int) (j5 ^ (j5 >>> 32));
                                            InterfaceC18556l interfaceC18556lSmaato2 = c6956l3.smaato();
                                            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l3, interfaceC17242lVip);
                                            c6956l3.m2140super();
                                            if (c6956l3.f14603switch) {
                                                c6956l3.firebase(c16395l);
                                            } else {
                                                c6956l3.m2136protected();
                                            }
                                            AbstractC8182l.billing(c6956l3, c1853lYandex, c6415l);
                                            AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato2, c6415l2);
                                            AbstractC11043l.isPro(i6, c6956l3, c6415l3, c6956l3, c11192l);
                                            AbstractC8182l.billing(c6956l3, interfaceC17242lBilling2, c6415l4);
                                            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                                            C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36034l, c6956l3, 54);
                                            long j6 = c6956l3.f14595continue;
                                            int i7 = (int) (j6 ^ (j6 >>> 32));
                                            InterfaceC18556l interfaceC18556lSmaato3 = c6956l3.smaato();
                                            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l3, interfaceC17242lAmazon);
                                            c6956l3.m2140super();
                                            if (c6956l3.f14603switch) {
                                                c6956l3.firebase(c16395l);
                                            } else {
                                                c6956l3.m2136protected();
                                            }
                                            AbstractC8182l.billing(c6956l3, c1853lYandex2, c6415l);
                                            AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato3, c6415l2);
                                            AbstractC11043l.isPro(i7, c6956l3, c6415l3, c6956l3, c11192l);
                                            AbstractC8182l.billing(c6956l3, interfaceC17242lBilling3, c6415l4);
                                            AbstractC7741l.purchase(str5, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l, 160.0f), AbstractC13106l.billing(c6956l3).crashlytics), new C18627l(AbstractC13106l.purchase(c6956l3).signatures), new C18627l(AbstractC13106l.purchase(c6956l3).signatures), null, c6956l3, 36912, 0, 32736);
                                            C2391l c2391l3 = c2391l2;
                                            String str7 = c2391l3.tapsense;
                                            if (str7 == null) {
                                                str7 = "";
                                            }
                                            AbstractC13010l.loadAd(str7, AbstractC0080l.amazon(c4346l, 1.0f), AbstractC13106l.purchase(c6956l3).adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 2, false, 2, 0, AbstractC13106l.admob(c6956l3).purchase, c6956l3, 48, 24960, 109560);
                                            C0249l c0249l = c2391l3.vip;
                                            String str8 = c0249l != null ? c0249l.loadAd : null;
                                            AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.separator_strings, new Object[]{str8 != null ? str8 : "", str6}, c6956l3), AbstractC0080l.amazon(c4346l, 1.0f), AbstractC13106l.purchase(c6956l3).adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 1, 0, null, c6956l3, 48, 24576, 244728);
                                            AbstractC12900l.ads(c6956l3, true, true, true);
                                        } else {
                                            c6956l3.m2124else();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }), 3);
                                boolean z3 = z2;
                                if (!z3) {
                                    AbstractC1757l.appmetrica(c1336l, null, null, AbstractC15918l.amazon, 3);
                                }
                                final C13849l c13849l3 = c13849l2;
                                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1938274837, true, new C12106l(c2391l2, c13849l3, z3, i2)), 3);
                                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1624517004, true, new C1350l(3, c13849l3)), 3);
                                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-892341549, true, new C7369l(c2391l2, c13849l3)), 3);
                                final int i4 = 0;
                                final C1358l c1358l3 = c1358l;
                                if (c1358l3 != null) {
                                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1852886426, true, new Function3() { // from class: lَۣۘ
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                            int i5 = i4;
                                            C13863l c13863l2 = C1867l.yandex;
                                            C4346l c4346l = C4346l.f8873l;
                                            final C1358l c1358l4 = c1358l3;
                                            final C13849l c13849l4 = c13849l3;
                                            final C2391l c2391l3 = c2391l2;
                                            final int i6 = 1;
                                            final int i7 = 0;
                                            switch (i5) {
                                                case 0:
                                                    C6956l c6956l3 = (C6956l) obj7;
                                                    int iIntValue3 = ((Integer) obj8).intValue();
                                                    if (c6956l3.m2127for(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                                                        InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                                                        boolean zAdmob6 = c6956l3.admob(c2391l3) | c6956l3.admob(c13849l4) | c6956l3.admob(c1358l4);
                                                        Object objM2132native3 = c6956l3.m2132native();
                                                        if (zAdmob6 || objM2132native3 == c13863l2) {
                                                            objM2132native3 = new Function0() { // from class: lٌ٘ۢ
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    int i8 = i7;
                                                                    C1358l c1358l5 = c1358l4;
                                                                    final C13849l c13849l5 = c13849l4;
                                                                    C2391l c2391l4 = c2391l3;
                                                                    final int i9 = 1;
                                                                    switch (i8) {
                                                                        case 0:
                                                                            if (c2391l4.crashlytics.size() <= 1) {
                                                                                Activity activityIsVip = c13849l5.isVip();
                                                                                Integer num = c1358l5.loadAd;
                                                                                if (num != null) {
                                                                                    AbstractC1213l.billing(activityIsVip, new C10266l(new C6495l(num.intValue(), 1, null)));
                                                                                }
                                                                            } else {
                                                                                List<C1358l> list = c2391l4.crashlytics;
                                                                                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
                                                                                for (final C1358l c1358l6 : list) {
                                                                                    String str7 = c1358l6.amazon;
                                                                                    if (str7 == null) {
                                                                                        str7 = "";
                                                                                    }
                                                                                    final int i10 = 0;
                                                                                    arrayList.add(new C2900l(-1, str7, new Function1() { // from class: lٓۛۤ
                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public final Object invoke(Object obj9) {
                                                                                            int i11 = i10;
                                                                                            C1358l c1358l7 = c1358l6;
                                                                                            C13849l c13849l6 = c13849l5;
                                                                                            switch (i11) {
                                                                                                case 0:
                                                                                                    Activity activityIsVip2 = c13849l6.isVip();
                                                                                                    Integer num2 = c1358l7.loadAd;
                                                                                                    if (num2 != null) {
                                                                                                        AbstractC1213l.billing(activityIsVip2, new C10266l(new C6495l(num2.intValue(), 1, null)));
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    Activity activityIsVip3 = c13849l6.isVip();
                                                                                                    Integer num3 = c1358l7.loadAd;
                                                                                                    if (num3 != null) {
                                                                                                        AbstractC1213l.billing(activityIsVip3, new C10266l(new C6495l(num3.intValue(), 1, null)));
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            return Unit.INSTANCE;
                                                                                        }
                                                                                    }));
                                                                                }
                                                                                new C17731l(R.string.book_authors, arrayList).Signature(c13849l5.isVip());
                                                                            }
                                                                            break;
                                                                        default:
                                                                            if (c2391l4.startapp.size() <= 1) {
                                                                                Activity activityIsVip2 = c13849l5.isVip();
                                                                                Integer num2 = c1358l5.loadAd;
                                                                                if (num2 != null) {
                                                                                    AbstractC1213l.billing(activityIsVip2, new C10266l(new C6495l(num2.intValue(), 1, null)));
                                                                                }
                                                                            } else {
                                                                                List<C1358l> list2 = c2391l4.startapp;
                                                                                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list2, 10));
                                                                                for (final C1358l c1358l7 : list2) {
                                                                                    String str8 = c1358l7.amazon;
                                                                                    if (str8 == null) {
                                                                                        str8 = "";
                                                                                    }
                                                                                    arrayList2.add(new C2900l(-1, str8, new Function1() { // from class: lٓۛۤ
                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public final Object invoke(Object obj9) {
                                                                                            int i11 = i9;
                                                                                            C1358l c1358l8 = c1358l7;
                                                                                            C13849l c13849l6 = c13849l5;
                                                                                            switch (i11) {
                                                                                                case 0:
                                                                                                    Activity activityIsVip3 = c13849l6.isVip();
                                                                                                    Integer num3 = c1358l8.loadAd;
                                                                                                    if (num3 != null) {
                                                                                                        AbstractC1213l.billing(activityIsVip3, new C10266l(new C6495l(num3.intValue(), 1, null)));
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    Activity activityIsVip4 = c13849l6.isVip();
                                                                                                    Integer num4 = c1358l8.loadAd;
                                                                                                    if (num4 != null) {
                                                                                                        AbstractC1213l.billing(activityIsVip4, new C10266l(new C6495l(num4.intValue(), 1, null)));
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            return Unit.INSTANCE;
                                                                                        }
                                                                                    }));
                                                                                }
                                                                                new C17731l(R.string.book_narrators, arrayList2).Signature(c13849l5.isVip());
                                                                            }
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            c6956l3.m2147try(objM2132native3);
                                                        }
                                                        AbstractC13319l.yandex(AbstractC14566l.amazon(-2118939524, new Function2() { // from class: lٍٍۖ
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj9, Object obj10) {
                                                                int i8 = i7;
                                                                C1358l c1358l5 = c1358l4;
                                                                C2391l c2391l4 = c2391l3;
                                                                switch (i8) {
                                                                    case 0:
                                                                        C6956l c6956l4 = (C6956l) obj9;
                                                                        int iIntValue4 = ((Integer) obj10).intValue();
                                                                        if (!c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                                            c6956l4.m2124else();
                                                                        } else if (c2391l4.crashlytics.size() > 1) {
                                                                            c6956l4.m2123default(2102026349);
                                                                            String str7 = c1358l5.amazon;
                                                                            AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.book_and_other, new Object[]{str7 != null ? str7 : ""}, c6956l4), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                                                                            c6956l4.startapp(false);
                                                                        } else {
                                                                            c6956l4.m2123default(2102182806);
                                                                            String str8 = c1358l5.amazon;
                                                                            AbstractC13010l.loadAd(str8 == null ? "" : str8, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                                                                            c6956l4.startapp(false);
                                                                        }
                                                                        break;
                                                                    default:
                                                                        C6956l c6956l5 = (C6956l) obj9;
                                                                        int iIntValue5 = ((Integer) obj10).intValue();
                                                                        if (!c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                            c6956l5.m2124else();
                                                                        } else if (c2391l4.startapp.size() > 1) {
                                                                            c6956l5.m2123default(202111916);
                                                                            String str9 = c1358l5.amazon;
                                                                            AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.book_and_other, new Object[]{str9 != null ? str9 : ""}, c6956l5), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l5, 0, 0, 262142);
                                                                            c6956l5.startapp(false);
                                                                        } else {
                                                                            c6956l5.m2123default(202270357);
                                                                            String str10 = c1358l5.amazon;
                                                                            AbstractC13010l.loadAd(str10 == null ? "" : str10, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l5, 0, 0, 262142);
                                                                            c6956l5.startapp(false);
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }, c6956l3), AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native3, 15), null, AbstractC15918l.mopub, AbstractC14566l.amazon(2012206328, new Function2() { // from class: lؙؕؔ
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj9, Object obj10) {
                                                                int i8 = i7;
                                                                C4346l c4346l2 = C4346l.f8873l;
                                                                C1358l c1358l5 = c1358l4;
                                                                switch (i8) {
                                                                    case 0:
                                                                        C6956l c6956l4 = (C6956l) obj9;
                                                                        int iIntValue4 = ((Integer) obj10).intValue();
                                                                        if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                                            C10707l c10707l = AbstractC16964l.yandex;
                                                                            C18627l c18627l = new C18627l(((C14370l) c6956l4.isPro(c10707l)).yandex.signatures);
                                                                            C18627l c18627l2 = new C18627l(((C14370l) c6956l4.isPro(c10707l)).yandex.signatures);
                                                                            C3779l c3779l = (C3779l) AbstractC16901l.m4212class(c1358l5.purchase);
                                                                            AbstractC7741l.purchase(c3779l != null ? c3779l.yandex : null, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l2, 36.0f), AbstractC7497l.yandex), c18627l, c18627l2, C4176l.yandex, c6956l4, 36912, 6, 31712);
                                                                        } else {
                                                                            c6956l4.m2124else();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        C6956l c6956l5 = (C6956l) obj9;
                                                                        int iIntValue5 = ((Integer) obj10).intValue();
                                                                        if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                            C10707l c10707l2 = AbstractC16964l.yandex;
                                                                            C18627l c18627l3 = new C18627l(((C14370l) c6956l5.isPro(c10707l2)).yandex.signatures);
                                                                            C18627l c18627l4 = new C18627l(((C14370l) c6956l5.isPro(c10707l2)).yandex.signatures);
                                                                            C3779l c3779l2 = (C3779l) AbstractC16901l.m4212class(c1358l5.purchase);
                                                                            AbstractC7741l.purchase(c3779l2 != null ? c3779l2.yandex : null, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l2, 36.0f), AbstractC7497l.yandex), c18627l3, c18627l4, C4176l.yandex, c6956l5, 36912, 6, 31712);
                                                                        } else {
                                                                            c6956l5.m2124else();
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }, c6956l3), null, null, c6956l3, 27654, 484);
                                                    } else {
                                                        c6956l3.m2124else();
                                                    }
                                                    break;
                                                default:
                                                    C6956l c6956l4 = (C6956l) obj7;
                                                    int iIntValue4 = ((Integer) obj8).intValue();
                                                    if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                        InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                                                        boolean zAdmob7 = c6956l4.admob(c2391l3) | c6956l4.admob(c13849l4) | c6956l4.admob(c1358l4);
                                                        Object objM2132native4 = c6956l4.m2132native();
                                                        if (zAdmob7 || objM2132native4 == c13863l2) {
                                                            objM2132native4 = new Function0() { // from class: lٌ٘ۢ
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    int i8 = i6;
                                                                    C1358l c1358l5 = c1358l4;
                                                                    final C13849l c13849l5 = c13849l4;
                                                                    C2391l c2391l4 = c2391l3;
                                                                    final int i9 = 1;
                                                                    switch (i8) {
                                                                        case 0:
                                                                            if (c2391l4.crashlytics.size() <= 1) {
                                                                                Activity activityIsVip = c13849l5.isVip();
                                                                                Integer num = c1358l5.loadAd;
                                                                                if (num != null) {
                                                                                    AbstractC1213l.billing(activityIsVip, new C10266l(new C6495l(num.intValue(), 1, null)));
                                                                                }
                                                                            } else {
                                                                                List<C1358l> list = c2391l4.crashlytics;
                                                                                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
                                                                                for (final C1358l c1358l6 : list) {
                                                                                    String str7 = c1358l6.amazon;
                                                                                    if (str7 == null) {
                                                                                        str7 = "";
                                                                                    }
                                                                                    final int i10 = 0;
                                                                                    arrayList.add(new C2900l(-1, str7, new Function1() { // from class: lٓۛۤ
                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public final Object invoke(Object obj9) {
                                                                                            int i11 = i10;
                                                                                            C1358l c1358l8 = c1358l6;
                                                                                            C13849l c13849l6 = c13849l5;
                                                                                            switch (i11) {
                                                                                                case 0:
                                                                                                    Activity activityIsVip3 = c13849l6.isVip();
                                                                                                    Integer num3 = c1358l8.loadAd;
                                                                                                    if (num3 != null) {
                                                                                                        AbstractC1213l.billing(activityIsVip3, new C10266l(new C6495l(num3.intValue(), 1, null)));
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    Activity activityIsVip4 = c13849l6.isVip();
                                                                                                    Integer num4 = c1358l8.loadAd;
                                                                                                    if (num4 != null) {
                                                                                                        AbstractC1213l.billing(activityIsVip4, new C10266l(new C6495l(num4.intValue(), 1, null)));
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            return Unit.INSTANCE;
                                                                                        }
                                                                                    }));
                                                                                }
                                                                                new C17731l(R.string.book_authors, arrayList).Signature(c13849l5.isVip());
                                                                            }
                                                                            break;
                                                                        default:
                                                                            if (c2391l4.startapp.size() <= 1) {
                                                                                Activity activityIsVip2 = c13849l5.isVip();
                                                                                Integer num2 = c1358l5.loadAd;
                                                                                if (num2 != null) {
                                                                                    AbstractC1213l.billing(activityIsVip2, new C10266l(new C6495l(num2.intValue(), 1, null)));
                                                                                }
                                                                            } else {
                                                                                List<C1358l> list2 = c2391l4.startapp;
                                                                                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list2, 10));
                                                                                for (final C1358l c1358l7 : list2) {
                                                                                    String str8 = c1358l7.amazon;
                                                                                    if (str8 == null) {
                                                                                        str8 = "";
                                                                                    }
                                                                                    arrayList2.add(new C2900l(-1, str8, new Function1() { // from class: lٓۛۤ
                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public final Object invoke(Object obj9) {
                                                                                            int i11 = i9;
                                                                                            C1358l c1358l8 = c1358l7;
                                                                                            C13849l c13849l6 = c13849l5;
                                                                                            switch (i11) {
                                                                                                case 0:
                                                                                                    Activity activityIsVip3 = c13849l6.isVip();
                                                                                                    Integer num3 = c1358l8.loadAd;
                                                                                                    if (num3 != null) {
                                                                                                        AbstractC1213l.billing(activityIsVip3, new C10266l(new C6495l(num3.intValue(), 1, null)));
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    Activity activityIsVip4 = c13849l6.isVip();
                                                                                                    Integer num4 = c1358l8.loadAd;
                                                                                                    if (num4 != null) {
                                                                                                        AbstractC1213l.billing(activityIsVip4, new C10266l(new C6495l(num4.intValue(), 1, null)));
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            return Unit.INSTANCE;
                                                                                        }
                                                                                    }));
                                                                                }
                                                                                new C17731l(R.string.book_narrators, arrayList2).Signature(c13849l5.isVip());
                                                                            }
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            c6956l4.m2147try(objM2132native4);
                                                        }
                                                        AbstractC13319l.yandex(AbstractC14566l.amazon(-1386764069, new Function2() { // from class: lٍٍۖ
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj9, Object obj10) {
                                                                int i8 = i6;
                                                                C1358l c1358l5 = c1358l4;
                                                                C2391l c2391l4 = c2391l3;
                                                                switch (i8) {
                                                                    case 0:
                                                                        C6956l c6956l5 = (C6956l) obj9;
                                                                        int iIntValue5 = ((Integer) obj10).intValue();
                                                                        if (!c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                            c6956l5.m2124else();
                                                                        } else if (c2391l4.crashlytics.size() > 1) {
                                                                            c6956l5.m2123default(2102026349);
                                                                            String str7 = c1358l5.amazon;
                                                                            AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.book_and_other, new Object[]{str7 != null ? str7 : ""}, c6956l5), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l5, 0, 0, 262142);
                                                                            c6956l5.startapp(false);
                                                                        } else {
                                                                            c6956l5.m2123default(2102182806);
                                                                            String str8 = c1358l5.amazon;
                                                                            AbstractC13010l.loadAd(str8 == null ? "" : str8, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l5, 0, 0, 262142);
                                                                            c6956l5.startapp(false);
                                                                        }
                                                                        break;
                                                                    default:
                                                                        C6956l c6956l6 = (C6956l) obj9;
                                                                        int iIntValue6 = ((Integer) obj10).intValue();
                                                                        if (!c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                                                            c6956l6.m2124else();
                                                                        } else if (c2391l4.startapp.size() > 1) {
                                                                            c6956l6.m2123default(202111916);
                                                                            String str9 = c1358l5.amazon;
                                                                            AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.book_and_other, new Object[]{str9 != null ? str9 : ""}, c6956l6), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l6, 0, 0, 262142);
                                                                            c6956l6.startapp(false);
                                                                        } else {
                                                                            c6956l6.m2123default(202270357);
                                                                            String str10 = c1358l5.amazon;
                                                                            AbstractC13010l.loadAd(str10 == null ? "" : str10, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l6, 0, 0, 262142);
                                                                            c6956l6.startapp(false);
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }, c6956l4), AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native4, 15), null, AbstractC15918l.admob, AbstractC14566l.amazon(-1550585513, new Function2() { // from class: lؙؕؔ
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj9, Object obj10) {
                                                                int i8 = i6;
                                                                C4346l c4346l2 = C4346l.f8873l;
                                                                C1358l c1358l5 = c1358l4;
                                                                switch (i8) {
                                                                    case 0:
                                                                        C6956l c6956l5 = (C6956l) obj9;
                                                                        int iIntValue5 = ((Integer) obj10).intValue();
                                                                        if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                            C10707l c10707l = AbstractC16964l.yandex;
                                                                            C18627l c18627l = new C18627l(((C14370l) c6956l5.isPro(c10707l)).yandex.signatures);
                                                                            C18627l c18627l2 = new C18627l(((C14370l) c6956l5.isPro(c10707l)).yandex.signatures);
                                                                            C3779l c3779l = (C3779l) AbstractC16901l.m4212class(c1358l5.purchase);
                                                                            AbstractC7741l.purchase(c3779l != null ? c3779l.yandex : null, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l2, 36.0f), AbstractC7497l.yandex), c18627l, c18627l2, C4176l.yandex, c6956l5, 36912, 6, 31712);
                                                                        } else {
                                                                            c6956l5.m2124else();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        C6956l c6956l6 = (C6956l) obj9;
                                                                        int iIntValue6 = ((Integer) obj10).intValue();
                                                                        if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                                                            C10707l c10707l2 = AbstractC16964l.yandex;
                                                                            C18627l c18627l3 = new C18627l(((C14370l) c6956l6.isPro(c10707l2)).yandex.signatures);
                                                                            C18627l c18627l4 = new C18627l(((C14370l) c6956l6.isPro(c10707l2)).yandex.signatures);
                                                                            C3779l c3779l2 = (C3779l) AbstractC16901l.m4212class(c1358l5.purchase);
                                                                            AbstractC7741l.purchase(c3779l2 != null ? c3779l2.yandex : null, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l2, 36.0f), AbstractC7497l.yandex), c18627l3, c18627l4, C4176l.yandex, c6956l6, 36912, 6, 31712);
                                                                        } else {
                                                                            c6956l6.m2124else();
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }, c6956l4), null, null, c6956l4, 27654, 484);
                                                    } else {
                                                        c6956l4.m2124else();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), 3);
                                }
                                final C1358l c1358l4 = c1358l2;
                                if (c1358l4 != null) {
                                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1709905415, true, new Function3() { // from class: lَۣۘ
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                            int i5 = i3;
                                            C13863l c13863l2 = C1867l.yandex;
                                            C4346l c4346l = C4346l.f8873l;
                                            final C1358l c1358l5 = c1358l4;
                                            final C13849l c13849l4 = c13849l3;
                                            final C2391l c2391l3 = c2391l2;
                                            final int i6 = 1;
                                            final int i7 = 0;
                                            switch (i5) {
                                                case 0:
                                                    C6956l c6956l3 = (C6956l) obj7;
                                                    int iIntValue3 = ((Integer) obj8).intValue();
                                                    if (c6956l3.m2127for(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                                                        InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                                                        boolean zAdmob6 = c6956l3.admob(c2391l3) | c6956l3.admob(c13849l4) | c6956l3.admob(c1358l5);
                                                        Object objM2132native3 = c6956l3.m2132native();
                                                        if (zAdmob6 || objM2132native3 == c13863l2) {
                                                            objM2132native3 = new Function0() { // from class: lٌ٘ۢ
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    int i8 = i7;
                                                                    C1358l c1358l6 = c1358l5;
                                                                    final C13849l c13849l5 = c13849l4;
                                                                    C2391l c2391l4 = c2391l3;
                                                                    final int i9 = 1;
                                                                    switch (i8) {
                                                                        case 0:
                                                                            if (c2391l4.crashlytics.size() <= 1) {
                                                                                Activity activityIsVip = c13849l5.isVip();
                                                                                Integer num = c1358l6.loadAd;
                                                                                if (num != null) {
                                                                                    AbstractC1213l.billing(activityIsVip, new C10266l(new C6495l(num.intValue(), 1, null)));
                                                                                }
                                                                            } else {
                                                                                List<C1358l> list = c2391l4.crashlytics;
                                                                                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
                                                                                for (final C1358l c1358l7 : list) {
                                                                                    String str7 = c1358l7.amazon;
                                                                                    if (str7 == null) {
                                                                                        str7 = "";
                                                                                    }
                                                                                    final int i10 = 0;
                                                                                    arrayList.add(new C2900l(-1, str7, new Function1() { // from class: lٓۛۤ
                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public final Object invoke(Object obj9) {
                                                                                            int i11 = i10;
                                                                                            C1358l c1358l8 = c1358l7;
                                                                                            C13849l c13849l6 = c13849l5;
                                                                                            switch (i11) {
                                                                                                case 0:
                                                                                                    Activity activityIsVip3 = c13849l6.isVip();
                                                                                                    Integer num3 = c1358l8.loadAd;
                                                                                                    if (num3 != null) {
                                                                                                        AbstractC1213l.billing(activityIsVip3, new C10266l(new C6495l(num3.intValue(), 1, null)));
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    Activity activityIsVip4 = c13849l6.isVip();
                                                                                                    Integer num4 = c1358l8.loadAd;
                                                                                                    if (num4 != null) {
                                                                                                        AbstractC1213l.billing(activityIsVip4, new C10266l(new C6495l(num4.intValue(), 1, null)));
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            return Unit.INSTANCE;
                                                                                        }
                                                                                    }));
                                                                                }
                                                                                new C17731l(R.string.book_authors, arrayList).Signature(c13849l5.isVip());
                                                                            }
                                                                            break;
                                                                        default:
                                                                            if (c2391l4.startapp.size() <= 1) {
                                                                                Activity activityIsVip2 = c13849l5.isVip();
                                                                                Integer num2 = c1358l6.loadAd;
                                                                                if (num2 != null) {
                                                                                    AbstractC1213l.billing(activityIsVip2, new C10266l(new C6495l(num2.intValue(), 1, null)));
                                                                                }
                                                                            } else {
                                                                                List<C1358l> list2 = c2391l4.startapp;
                                                                                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list2, 10));
                                                                                for (final C1358l c1358l8 : list2) {
                                                                                    String str8 = c1358l8.amazon;
                                                                                    if (str8 == null) {
                                                                                        str8 = "";
                                                                                    }
                                                                                    arrayList2.add(new C2900l(-1, str8, new Function1() { // from class: lٓۛۤ
                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public final Object invoke(Object obj9) {
                                                                                            int i11 = i9;
                                                                                            C1358l c1358l9 = c1358l8;
                                                                                            C13849l c13849l6 = c13849l5;
                                                                                            switch (i11) {
                                                                                                case 0:
                                                                                                    Activity activityIsVip3 = c13849l6.isVip();
                                                                                                    Integer num3 = c1358l9.loadAd;
                                                                                                    if (num3 != null) {
                                                                                                        AbstractC1213l.billing(activityIsVip3, new C10266l(new C6495l(num3.intValue(), 1, null)));
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    Activity activityIsVip4 = c13849l6.isVip();
                                                                                                    Integer num4 = c1358l9.loadAd;
                                                                                                    if (num4 != null) {
                                                                                                        AbstractC1213l.billing(activityIsVip4, new C10266l(new C6495l(num4.intValue(), 1, null)));
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            return Unit.INSTANCE;
                                                                                        }
                                                                                    }));
                                                                                }
                                                                                new C17731l(R.string.book_narrators, arrayList2).Signature(c13849l5.isVip());
                                                                            }
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            c6956l3.m2147try(objM2132native3);
                                                        }
                                                        AbstractC13319l.yandex(AbstractC14566l.amazon(-2118939524, new Function2() { // from class: lٍٍۖ
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj9, Object obj10) {
                                                                int i8 = i7;
                                                                C1358l c1358l6 = c1358l5;
                                                                C2391l c2391l4 = c2391l3;
                                                                switch (i8) {
                                                                    case 0:
                                                                        C6956l c6956l5 = (C6956l) obj9;
                                                                        int iIntValue5 = ((Integer) obj10).intValue();
                                                                        if (!c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                            c6956l5.m2124else();
                                                                        } else if (c2391l4.crashlytics.size() > 1) {
                                                                            c6956l5.m2123default(2102026349);
                                                                            String str7 = c1358l6.amazon;
                                                                            AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.book_and_other, new Object[]{str7 != null ? str7 : ""}, c6956l5), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l5, 0, 0, 262142);
                                                                            c6956l5.startapp(false);
                                                                        } else {
                                                                            c6956l5.m2123default(2102182806);
                                                                            String str8 = c1358l6.amazon;
                                                                            AbstractC13010l.loadAd(str8 == null ? "" : str8, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l5, 0, 0, 262142);
                                                                            c6956l5.startapp(false);
                                                                        }
                                                                        break;
                                                                    default:
                                                                        C6956l c6956l6 = (C6956l) obj9;
                                                                        int iIntValue6 = ((Integer) obj10).intValue();
                                                                        if (!c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                                                            c6956l6.m2124else();
                                                                        } else if (c2391l4.startapp.size() > 1) {
                                                                            c6956l6.m2123default(202111916);
                                                                            String str9 = c1358l6.amazon;
                                                                            AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.book_and_other, new Object[]{str9 != null ? str9 : ""}, c6956l6), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l6, 0, 0, 262142);
                                                                            c6956l6.startapp(false);
                                                                        } else {
                                                                            c6956l6.m2123default(202270357);
                                                                            String str10 = c1358l6.amazon;
                                                                            AbstractC13010l.loadAd(str10 == null ? "" : str10, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l6, 0, 0, 262142);
                                                                            c6956l6.startapp(false);
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }, c6956l3), AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native3, 15), null, AbstractC15918l.mopub, AbstractC14566l.amazon(2012206328, new Function2() { // from class: lؙؕؔ
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj9, Object obj10) {
                                                                int i8 = i7;
                                                                C4346l c4346l2 = C4346l.f8873l;
                                                                C1358l c1358l6 = c1358l5;
                                                                switch (i8) {
                                                                    case 0:
                                                                        C6956l c6956l5 = (C6956l) obj9;
                                                                        int iIntValue5 = ((Integer) obj10).intValue();
                                                                        if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                            C10707l c10707l = AbstractC16964l.yandex;
                                                                            C18627l c18627l = new C18627l(((C14370l) c6956l5.isPro(c10707l)).yandex.signatures);
                                                                            C18627l c18627l2 = new C18627l(((C14370l) c6956l5.isPro(c10707l)).yandex.signatures);
                                                                            C3779l c3779l = (C3779l) AbstractC16901l.m4212class(c1358l6.purchase);
                                                                            AbstractC7741l.purchase(c3779l != null ? c3779l.yandex : null, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l2, 36.0f), AbstractC7497l.yandex), c18627l, c18627l2, C4176l.yandex, c6956l5, 36912, 6, 31712);
                                                                        } else {
                                                                            c6956l5.m2124else();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        C6956l c6956l6 = (C6956l) obj9;
                                                                        int iIntValue6 = ((Integer) obj10).intValue();
                                                                        if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                                                            C10707l c10707l2 = AbstractC16964l.yandex;
                                                                            C18627l c18627l3 = new C18627l(((C14370l) c6956l6.isPro(c10707l2)).yandex.signatures);
                                                                            C18627l c18627l4 = new C18627l(((C14370l) c6956l6.isPro(c10707l2)).yandex.signatures);
                                                                            C3779l c3779l2 = (C3779l) AbstractC16901l.m4212class(c1358l6.purchase);
                                                                            AbstractC7741l.purchase(c3779l2 != null ? c3779l2.yandex : null, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l2, 36.0f), AbstractC7497l.yandex), c18627l3, c18627l4, C4176l.yandex, c6956l6, 36912, 6, 31712);
                                                                        } else {
                                                                            c6956l6.m2124else();
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }, c6956l3), null, null, c6956l3, 27654, 484);
                                                    } else {
                                                        c6956l3.m2124else();
                                                    }
                                                    break;
                                                default:
                                                    C6956l c6956l4 = (C6956l) obj7;
                                                    int iIntValue4 = ((Integer) obj8).intValue();
                                                    if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                        InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                                                        boolean zAdmob7 = c6956l4.admob(c2391l3) | c6956l4.admob(c13849l4) | c6956l4.admob(c1358l5);
                                                        Object objM2132native4 = c6956l4.m2132native();
                                                        if (zAdmob7 || objM2132native4 == c13863l2) {
                                                            objM2132native4 = new Function0() { // from class: lٌ٘ۢ
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    int i8 = i6;
                                                                    C1358l c1358l6 = c1358l5;
                                                                    final C13849l c13849l5 = c13849l4;
                                                                    C2391l c2391l4 = c2391l3;
                                                                    final int i9 = 1;
                                                                    switch (i8) {
                                                                        case 0:
                                                                            if (c2391l4.crashlytics.size() <= 1) {
                                                                                Activity activityIsVip = c13849l5.isVip();
                                                                                Integer num = c1358l6.loadAd;
                                                                                if (num != null) {
                                                                                    AbstractC1213l.billing(activityIsVip, new C10266l(new C6495l(num.intValue(), 1, null)));
                                                                                }
                                                                            } else {
                                                                                List<C1358l> list = c2391l4.crashlytics;
                                                                                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
                                                                                for (final C1358l c1358l7 : list) {
                                                                                    String str7 = c1358l7.amazon;
                                                                                    if (str7 == null) {
                                                                                        str7 = "";
                                                                                    }
                                                                                    final int i10 = 0;
                                                                                    arrayList.add(new C2900l(-1, str7, new Function1() { // from class: lٓۛۤ
                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public final Object invoke(Object obj9) {
                                                                                            int i11 = i10;
                                                                                            C1358l c1358l9 = c1358l7;
                                                                                            C13849l c13849l6 = c13849l5;
                                                                                            switch (i11) {
                                                                                                case 0:
                                                                                                    Activity activityIsVip3 = c13849l6.isVip();
                                                                                                    Integer num3 = c1358l9.loadAd;
                                                                                                    if (num3 != null) {
                                                                                                        AbstractC1213l.billing(activityIsVip3, new C10266l(new C6495l(num3.intValue(), 1, null)));
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    Activity activityIsVip4 = c13849l6.isVip();
                                                                                                    Integer num4 = c1358l9.loadAd;
                                                                                                    if (num4 != null) {
                                                                                                        AbstractC1213l.billing(activityIsVip4, new C10266l(new C6495l(num4.intValue(), 1, null)));
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            return Unit.INSTANCE;
                                                                                        }
                                                                                    }));
                                                                                }
                                                                                new C17731l(R.string.book_authors, arrayList).Signature(c13849l5.isVip());
                                                                            }
                                                                            break;
                                                                        default:
                                                                            if (c2391l4.startapp.size() <= 1) {
                                                                                Activity activityIsVip2 = c13849l5.isVip();
                                                                                Integer num2 = c1358l6.loadAd;
                                                                                if (num2 != null) {
                                                                                    AbstractC1213l.billing(activityIsVip2, new C10266l(new C6495l(num2.intValue(), 1, null)));
                                                                                }
                                                                            } else {
                                                                                List<C1358l> list2 = c2391l4.startapp;
                                                                                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list2, 10));
                                                                                for (final C1358l c1358l8 : list2) {
                                                                                    String str8 = c1358l8.amazon;
                                                                                    if (str8 == null) {
                                                                                        str8 = "";
                                                                                    }
                                                                                    arrayList2.add(new C2900l(-1, str8, new Function1() { // from class: lٓۛۤ
                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public final Object invoke(Object obj9) {
                                                                                            int i11 = i9;
                                                                                            C1358l c1358l9 = c1358l8;
                                                                                            C13849l c13849l6 = c13849l5;
                                                                                            switch (i11) {
                                                                                                case 0:
                                                                                                    Activity activityIsVip3 = c13849l6.isVip();
                                                                                                    Integer num3 = c1358l9.loadAd;
                                                                                                    if (num3 != null) {
                                                                                                        AbstractC1213l.billing(activityIsVip3, new C10266l(new C6495l(num3.intValue(), 1, null)));
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    Activity activityIsVip4 = c13849l6.isVip();
                                                                                                    Integer num4 = c1358l9.loadAd;
                                                                                                    if (num4 != null) {
                                                                                                        AbstractC1213l.billing(activityIsVip4, new C10266l(new C6495l(num4.intValue(), 1, null)));
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            return Unit.INSTANCE;
                                                                                        }
                                                                                    }));
                                                                                }
                                                                                new C17731l(R.string.book_narrators, arrayList2).Signature(c13849l5.isVip());
                                                                            }
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            c6956l4.m2147try(objM2132native4);
                                                        }
                                                        AbstractC13319l.yandex(AbstractC14566l.amazon(-1386764069, new Function2() { // from class: lٍٍۖ
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj9, Object obj10) {
                                                                int i8 = i6;
                                                                C1358l c1358l6 = c1358l5;
                                                                C2391l c2391l4 = c2391l3;
                                                                switch (i8) {
                                                                    case 0:
                                                                        C6956l c6956l5 = (C6956l) obj9;
                                                                        int iIntValue5 = ((Integer) obj10).intValue();
                                                                        if (!c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                            c6956l5.m2124else();
                                                                        } else if (c2391l4.crashlytics.size() > 1) {
                                                                            c6956l5.m2123default(2102026349);
                                                                            String str7 = c1358l6.amazon;
                                                                            AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.book_and_other, new Object[]{str7 != null ? str7 : ""}, c6956l5), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l5, 0, 0, 262142);
                                                                            c6956l5.startapp(false);
                                                                        } else {
                                                                            c6956l5.m2123default(2102182806);
                                                                            String str8 = c1358l6.amazon;
                                                                            AbstractC13010l.loadAd(str8 == null ? "" : str8, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l5, 0, 0, 262142);
                                                                            c6956l5.startapp(false);
                                                                        }
                                                                        break;
                                                                    default:
                                                                        C6956l c6956l6 = (C6956l) obj9;
                                                                        int iIntValue6 = ((Integer) obj10).intValue();
                                                                        if (!c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                                                            c6956l6.m2124else();
                                                                        } else if (c2391l4.startapp.size() > 1) {
                                                                            c6956l6.m2123default(202111916);
                                                                            String str9 = c1358l6.amazon;
                                                                            AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.book_and_other, new Object[]{str9 != null ? str9 : ""}, c6956l6), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l6, 0, 0, 262142);
                                                                            c6956l6.startapp(false);
                                                                        } else {
                                                                            c6956l6.m2123default(202270357);
                                                                            String str10 = c1358l6.amazon;
                                                                            AbstractC13010l.loadAd(str10 == null ? "" : str10, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l6, 0, 0, 262142);
                                                                            c6956l6.startapp(false);
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }, c6956l4), AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native4, 15), null, AbstractC15918l.admob, AbstractC14566l.amazon(-1550585513, new Function2() { // from class: lؙؕؔ
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj9, Object obj10) {
                                                                int i8 = i6;
                                                                C4346l c4346l2 = C4346l.f8873l;
                                                                C1358l c1358l6 = c1358l5;
                                                                switch (i8) {
                                                                    case 0:
                                                                        C6956l c6956l5 = (C6956l) obj9;
                                                                        int iIntValue5 = ((Integer) obj10).intValue();
                                                                        if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                            C10707l c10707l = AbstractC16964l.yandex;
                                                                            C18627l c18627l = new C18627l(((C14370l) c6956l5.isPro(c10707l)).yandex.signatures);
                                                                            C18627l c18627l2 = new C18627l(((C14370l) c6956l5.isPro(c10707l)).yandex.signatures);
                                                                            C3779l c3779l = (C3779l) AbstractC16901l.m4212class(c1358l6.purchase);
                                                                            AbstractC7741l.purchase(c3779l != null ? c3779l.yandex : null, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l2, 36.0f), AbstractC7497l.yandex), c18627l, c18627l2, C4176l.yandex, c6956l5, 36912, 6, 31712);
                                                                        } else {
                                                                            c6956l5.m2124else();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        C6956l c6956l6 = (C6956l) obj9;
                                                                        int iIntValue6 = ((Integer) obj10).intValue();
                                                                        if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                                                            C10707l c10707l2 = AbstractC16964l.yandex;
                                                                            C18627l c18627l3 = new C18627l(((C14370l) c6956l6.isPro(c10707l2)).yandex.signatures);
                                                                            C18627l c18627l4 = new C18627l(((C14370l) c6956l6.isPro(c10707l2)).yandex.signatures);
                                                                            C3779l c3779l2 = (C3779l) AbstractC16901l.m4212class(c1358l6.purchase);
                                                                            AbstractC7741l.purchase(c3779l2 != null ? c3779l2.yandex : null, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l2, 36.0f), AbstractC7497l.yandex), c18627l3, c18627l4, C4176l.yandex, c6956l6, 36912, 6, 31712);
                                                                        } else {
                                                                            c6956l6.m2124else();
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }, c6956l4), null, null, c6956l4, 27654, 484);
                                                    } else {
                                                        c6956l4.m2124else();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), 3);
                                }
                                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC15918l.subs, 3);
                                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(572009361, true, new C7369l(c13849l3, c2391l2)), 3);
                                List list = c2391l2.amazon;
                                c1336l.firebase(list.size(), null, new Creturn(list, 8, false), new C15578l(802480018, true, new C8559l(list, z3, c13849l3, c2391l2)));
                                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC15918l.isPro, 3);
                                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(2036360271, true, new C7797l(i3, c2391l2)), 3);
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l2.m2147try(function1);
                        objM2132native2 = function1;
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub, null, c17253lLoadAd, null, null, null, false, null, (Function1) objM2132native2, c6956l2, 0, 506);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C13323l(InterfaceC3102l interfaceC3102l, String str, long j, InterfaceC11780l interfaceC11780l, String str2, C2391l c2391l, String str3, boolean z, C13849l c13849l, int i, C1358l c1358l, C1358l c1358l2) {
        this.f26131l = interfaceC3102l;
        this.f26128l = str;
        this.f26135l = j;
        this.f26127l = interfaceC11780l;
        this.f26134l = str2;
        this.f26138l = c2391l;
        this.f26129l = str3;
        this.f26130l = z;
        this.f26137l = c13849l;
        this.f26133l = i;
        this.f26139l = c1358l;
        this.f26136l = c1358l2;
    }
}
