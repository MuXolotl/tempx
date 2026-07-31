package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؖۥ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4508l implements Function4 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f9146l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9147l;

    public /* synthetic */ C4508l(int i, Object obj) {
        this.f9147l = i;
        this.f9146l = obj;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        long j;
        boolean z;
        C6956l c6956l;
        C0675l c0675l;
        int i3 = this.f9147l;
        C16170l c16170l = C16170l.yandex;
        C11485l c11485l = AbstractC8313l.crashlytics;
        C9946l c9946l = AbstractC16837l.yandex;
        Object obj5 = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        Object obj6 = this.f9146l;
        switch (i3) {
            case 0:
                C9231l c9231l = (C9231l) obj6;
                AbstractC9033l.crashlytics((AppActivity) c9231l.f5081l, new C8037l(((Integer) obj).intValue(), ((Long) obj2).longValue(), (String) obj3, c9231l, null));
                return Unit.INSTANCE;
            case 1:
                C14442l c14442l = (C14442l) obj6;
                InterfaceC16115l interfaceC16115lLoadAd = ((C7620l) c14442l.f28293l).loadAd((AbstractC17569l) obj, (C6886l) obj2, ((C11617l) obj3).yandex, ((C8689l) obj4).yandex);
                if (interfaceC16115lLoadAd instanceof C8902l) {
                    return (Typeface) ((C8902l) interfaceC16115lLoadAd).f18295l;
                }
                C4816l c4816l = new C4816l(interfaceC16115lLoadAd, c14442l.f28292l);
                c14442l.f28292l = c4816l;
                return (Typeface) c4816l.f9862l;
            case 2:
                int iIntValue = ((Integer) obj2).intValue();
                C6956l c6956l2 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                AbstractC18643l abstractC18643l = (AbstractC18643l) ((C3981l) obj6).loadAd.get(iIntValue);
                InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 0.0f, 0.0f, 14);
                C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(12.0f, true, new C8339l(12)), C18450l.f36040l, c6956l2, 54);
                long j2 = c6956l2.f14595continue;
                int i4 = (int) (j2 ^ (j2 >>> 32));
                InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lStartapp);
                InterfaceC8801l.firebase.getClass();
                C16395l c16395l = C3438l.loadAd;
                c6956l2.m2140super();
                if (c6956l2.f14603switch) {
                    c6956l2.firebase(c16395l);
                } else {
                    c6956l2.m2136protected();
                }
                C6415l c6415l = C3438l.mopub;
                AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l);
                C6415l c6415l2 = C3438l.billing;
                AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
                Integer numValueOf = Integer.valueOf(i4);
                C6415l c6415l3 = C3438l.isPro;
                AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
                C11192l c11192l = C3438l.firebase;
                AbstractC8182l.purchase(c6956l2, c11192l);
                C6415l c6415l4 = C3438l.amazon;
                AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
                AbstractC17307l.billing(abstractC18643l, 0, 0L, 0L, 0, 40.0f, true, null, null, null, c6956l2, 1769472, 926);
                C9247l c9247l = new C9247l(1.0f, true);
                C1853l c1853lYandex = AbstractC1001l.yandex(c11485l, C18450l.f36046l, c6956l2, 0);
                long j3 = c6956l2.f14595continue;
                int i5 = (int) (j3 ^ (j3 >>> 32));
                InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, c9247l);
                c6956l2.m2140super();
                if (c6956l2.f14603switch) {
                    c6956l2.firebase(c16395l);
                } else {
                    c6956l2.m2136protected();
                }
                AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
                AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
                AbstractC8182l.billing(c6956l2, Integer.valueOf(i5), c6415l3);
                AbstractC8182l.purchase(c6956l2, c11192l);
                AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
                C8540l c8540l = AbstractC13010l.yandex;
                C10707l c10707l = AbstractC16964l.yandex;
                C10092l c10092lYandex = c8540l.yandex(((C14370l) c6956l2.isPro(c10707l)).loadAd.isPro);
                C8540l c8540l2 = AbstractC12502l.yandex;
                AbstractC10478l.loadAd(new C10092l[]{c10092lYandex, AbstractC5020l.startapp(((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, c8540l2)}, AbstractC14566l.amazon(1441160827, new C8966l(abstractC18643l, 0), c6956l2), c6956l2, 56);
                AbstractC10478l.loadAd(new C10092l[]{c8540l.yandex(((C14370l) c6956l2.isPro(c10707l)).loadAd.firebase), AbstractC5020l.startapp(((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, c8540l2)}, AbstractC14566l.amazon(-147791068, new C8966l(abstractC18643l, 1), c6956l2), c6956l2, 56);
                c6956l2.startapp(true);
                c6956l2.startapp(true);
                return Unit.INSTANCE;
            case 3:
                C1026l c1026l = (C1026l) obj6;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                C6956l c6956l3 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                if (zBooleanValue) {
                    c6956l3.m2123default(-212130295);
                    c1026l.advert(c6956l3, 0);
                    c6956l3.startapp(false);
                } else {
                    c6956l3.m2123default(-212062188);
                    boolean zAdmob = c6956l3.admob(c1026l);
                    Object objM2132native = c6956l3.m2132native();
                    if (zAdmob || objM2132native == obj5) {
                        Object c6335l = new C6335l(0, c1026l, C1026l.class, "dismiss", "dismiss()V", 0, 0, 22);
                        c6956l3.m2147try(c6335l);
                        objM2132native = c6335l;
                    }
                    Function0 function0 = (Function0) ((InterfaceC5059l) objM2132native);
                    boolean zAdmob2 = c6956l3.admob(c1026l);
                    Object objM2132native2 = c6956l3.m2132native();
                    if (zAdmob2 || objM2132native2 == obj5) {
                        Object c6335l2 = new C6335l(0, c1026l, C1026l.class, "removeTrack", "removeTrack()V", 0, 0, 23);
                        c6956l3.m2147try(c6335l2);
                        objM2132native2 = c6335l2;
                    }
                    c1026l.pro(function0, (Function0) ((InterfaceC5059l) objM2132native2), c6956l3, 0);
                    c6956l3.startapp(false);
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj6;
                ((Integer) obj2).getClass();
                C6956l c6956l4 = (C6956l) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                if (c6956l4.m2127for(iIntValue2 & 1, (iIntValue2 & 129) != 128)) {
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(AbstractC0080l.purchase(AbstractC3605l.startapp(AbstractC4927l.amazon(c4346l, ((C14370l) c6956l4.isPro(AbstractC16964l.yandex)).yandex.vip, c9946l), 0.0f, 0.0f, 0.0f, 16.0f, 7), 150.0f), 1.0f);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j4 = c6956l4.f14595continue;
                    int i6 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l4.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l4, interfaceC17242lAmazon);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l4.m2140super();
                    if (c6956l4.f14603switch) {
                        c6956l4.firebase(c16395l2);
                    } else {
                        c6956l4.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l4, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato3, C3438l.billing);
                    AbstractC8182l.billing(c6956l4, Integer.valueOf(i6), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l4, C3438l.firebase);
                    AbstractC8182l.billing(c6956l4, interfaceC17242lBilling3, C3438l.amazon);
                    boolean zBilling = c6956l4.billing((C3554l) interfaceC8714l.getValue());
                    Object objM2132native3 = c6956l4.m2132native();
                    Object obj7 = objM2132native3;
                    if (zBilling || objM2132native3 == obj5) {
                        List list = ((C3554l) interfaceC8714l.getValue()).f7469l;
                        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Float.valueOf(((C2882l) it.next()).f6279l));
                        }
                        c6956l4.m2147try(arrayList);
                        obj7 = arrayList;
                    }
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    AbstractC11028l.crashlytics((List) obj7, ((C14370l) c6956l4.isPro(c10707l2)).yandex.yandex, ((C14370l) c6956l4.isPro(c10707l2)).yandex.premium, AbstractC0080l.crashlytics(AbstractC4927l.amazon(AbstractC0019l.crashlytics(c4346l, ((C14370l) c6956l4.isPro(c10707l2)).crashlytics.crashlytics), ((C14370l) c6956l4.isPro(c10707l2)).yandex.ads, c9946l), 1.0f), c6956l4, 0);
                    c6956l4.startapp(true);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 5:
                SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
                String str = (String) obj3;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                C0710l c0710l = new C0710l(sQLiteQuery);
                C5441l c5441l = (C5441l) ((C3316l) obj6).f7072l;
                int length = c5441l.f11667l.length;
                for (int i7 = 1; i7 < length; i7++) {
                    int i8 = c5441l.f11667l[i7];
                    if (i8 == 1) {
                        c0710l.firebase(i7, c5441l.f11666l[i7]);
                    } else if (i8 == 2) {
                        c0710l.mo669l(c5441l.f11669l[i7], i7);
                    } else if (i8 == 3) {
                        c0710l.applovin(i7, c5441l.f11664l[i7]);
                    } else if (i8 == 4) {
                        c0710l.smaato(i7, c5441l.f11665l[i7]);
                    } else if (i8 == 5) {
                        c0710l.metrica(i7);
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            case 6:
                AbstractC11383l abstractC11383l = (AbstractC11383l) obj6;
                ((Integer) obj2).getClass();
                C6956l c6956l5 = (C6956l) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                if (c6956l5.m2127for(iIntValue3 & 1, (iIntValue3 & 129) != 128)) {
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC4927l.amazon(c4346l, ((C14370l) c6956l5.isPro(AbstractC16964l.yandex)).yandex.vip, c9946l);
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j5 = c6956l5.f14595continue;
                    int i9 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l5.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l5, interfaceC17242lAmazon2);
                    InterfaceC8801l.firebase.getClass();
                    Function0 function1 = C3438l.loadAd;
                    c6956l5.m2140super();
                    if (c6956l5.f14603switch) {
                        c6956l5.firebase(function1);
                    } else {
                        c6956l5.m2136protected();
                    }
                    C6415l c6415l5 = C3438l.mopub;
                    AbstractC8182l.billing(c6956l5, interfaceC10835lAmazon2, c6415l5);
                    C6415l c6415l6 = C3438l.billing;
                    AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato4, c6415l6);
                    Integer numValueOf2 = Integer.valueOf(i9);
                    C6415l c6415l7 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l5, numValueOf2, c6415l7);
                    C11192l c11192l2 = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l5, c11192l2);
                    C6415l c6415l8 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l5, interfaceC17242lBilling4, c6415l8);
                    AbstractC0555l.loadAd(c16170l.yandex(c4346l, C18450l.f36021l), 0.0f, 0L, c6956l5, 0, 6);
                    C0086l c0086l = C18450l.f36040l;
                    C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                    InterfaceC17242l interfaceC17242lStartapp2 = AbstractC3605l.startapp(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    C5062l c5062lYandex2 = AbstractC7001l.yandex(c7537l, c0086l, c6956l5, 54);
                    long j6 = c6956l5.f14595continue;
                    int i10 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato5 = c6956l5.smaato();
                    InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l5, interfaceC17242lStartapp2);
                    c6956l5.m2140super();
                    if (c6956l5.f14603switch) {
                        c6956l5.firebase(function1);
                    } else {
                        c6956l5.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l5, c5062lYandex2, c6415l5);
                    AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato5, c6415l6);
                    AbstractC11043l.isPro(i10, c6956l5, c6415l7, c6956l5, c11192l2);
                    AbstractC8182l.billing(c6956l5, interfaceC17242lBilling5, c6415l8);
                    abstractC11383l.mo2666finally(((AbstractC7095l) ((InterfaceC13238l) abstractC11383l.f22963l.getValue())).pro(), 0, c6956l5);
                    AbstractC9334l.yandex(c6956l5, new C9247l(1.0f, true));
                    boolean zAdmob3 = c6956l5.admob(abstractC11383l);
                    Object objM2132native4 = c6956l5.m2132native();
                    if (zAdmob3 || objM2132native4 == obj5) {
                        i = 0;
                        objM2132native4 = new C14350l(abstractC11383l, i);
                        c6956l5.m2147try(objM2132native4);
                    } else {
                        i = 0;
                    }
                    abstractC11383l.mo2668public((Function0) objM2132native4, c6956l5, i);
                    c6956l5.startapp(true);
                    c6956l5.startapp(true);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            case 7:
                Function3 function3 = (Function3) obj6;
                C7091l c7091l = (C7091l) obj;
                ((Integer) obj2).intValue();
                C6956l c6956l6 = (C6956l) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= c6956l6.billing(c7091l) ? 4 : 2;
                }
                if (c6956l6.m2127for(iIntValue4 & 1, (iIntValue4 & 131) != 130)) {
                    function3.invoke(c7091l, c6956l6, Integer.valueOf(iIntValue4 & 14));
                } else {
                    c6956l6.m2124else();
                }
                return Unit.INSTANCE;
            case 8:
                C15578l c15578l = (C15578l) obj6;
                C14273l c14273l = (C14273l) obj;
                ((Integer) obj2).getClass();
                C6956l c6956l7 = (C6956l) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= c6956l7.billing(c14273l) ? 4 : 2;
                }
                if (c6956l7.m2127for(iIntValue5 & 1, (iIntValue5 & 131) != 130)) {
                    c15578l.invoke(c14273l, c6956l7, Integer.valueOf(iIntValue5 & 14));
                } else {
                    c6956l7.m2124else();
                }
                return Unit.INSTANCE;
            case 9:
                C18306l c18306l = (C18306l) obj6;
                ((Integer) obj2).getClass();
                C6956l c6956l8 = (C6956l) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                if (c6956l8.m2127for(iIntValue6 & 1, (iIntValue6 & 129) != 128)) {
                    c18306l.m4521try(c6956l8, 0);
                } else {
                    c6956l8.m2124else();
                }
                return Unit.INSTANCE;
            case 10:
                int iIntValue7 = ((Integer) obj2).intValue();
                C6956l c6956l9 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                boolean z2 = iIntValue7 == ((C15308l) ((AbstractC13264l) obj6).amazon.f32506l).admob();
                InterfaceC17242l interfaceC17242lPurchase = AbstractC0080l.purchase(AbstractC0080l.vip(c4346l, 2.0f), 32.0f);
                if (z2) {
                    c6956l9.m2123default(647778411);
                    j = ((C14370l) c6956l9.isPro(AbstractC16964l.yandex)).yandex.yandex;
                    i2 = 0;
                    c6956l9.startapp(false);
                } else {
                    i2 = 0;
                    c6956l9.m2123default(647896738);
                    j = ((C14370l) c6956l9.isPro(AbstractC16964l.yandex)).yandex.subscription;
                    c6956l9.startapp(false);
                }
                AbstractC9383l.yandex(AbstractC4927l.amazon(interfaceC17242lPurchase, j, c9946l), c6956l9, i2);
                return Unit.INSTANCE;
            case 11:
                C7883l c7883l = (C7883l) obj6;
                InterfaceC0038l interfaceC0038l = (InterfaceC0038l) obj2;
                C6956l c6956l10 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                C14855l c14855l = C18450l.f36043l;
                C14855l c14855l2 = C18450l.f36026l;
                if ((interfaceC0038l instanceof C7719l) || interfaceC0038l.equals(C12595l.yandex)) {
                    c6956l10.m2123default(531405687);
                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(AbstractC3605l.smaato(c4346l, 32.0f), 1.0f);
                    InterfaceC10835l interfaceC10835lAmazon3 = AbstractC9383l.amazon(c14855l2, false);
                    long j7 = c6956l10.f14595continue;
                    int i11 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato6 = c6956l10.smaato();
                    InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l10, interfaceC17242lAmazon3);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l10.m2140super();
                    if (c6956l10.f14603switch) {
                        c6956l10.firebase(c16395l3);
                    } else {
                        c6956l10.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l10, interfaceC10835lAmazon3, C3438l.mopub);
                    AbstractC8182l.billing(c6956l10, interfaceC18556lSmaato6, C3438l.billing);
                    AbstractC8182l.billing(c6956l10, Integer.valueOf(i11), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l10, C3438l.firebase);
                    AbstractC8182l.billing(c6956l10, interfaceC17242lBilling6, C3438l.amazon);
                    AbstractC8960l.loadAd(c16170l.yandex(c4346l, c14855l), 0L, null, c6956l10, 0, 6);
                    c6956l10.startapp(true);
                    c6956l10.startapp(false);
                } else if (interfaceC0038l.equals(C14475l.yandex)) {
                    c6956l10.m2123default(531762869);
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(c4346l, 32.0f);
                    InterfaceC10835l interfaceC10835lAmazon4 = AbstractC9383l.amazon(c14855l2, false);
                    long j8 = c6956l10.f14595continue;
                    int i12 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato7 = c6956l10.smaato();
                    InterfaceC17242l interfaceC17242lBilling7 = AbstractC17541l.billing(c6956l10, interfaceC17242lSmaato);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l4 = C3438l.loadAd;
                    c6956l10.m2140super();
                    if (c6956l10.f14603switch) {
                        c6956l10.firebase(c16395l4);
                    } else {
                        c6956l10.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l10, interfaceC10835lAmazon4, C3438l.mopub);
                    AbstractC8182l.billing(c6956l10, interfaceC18556lSmaato7, C3438l.billing);
                    AbstractC8182l.billing(c6956l10, Integer.valueOf(i12), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l10, C3438l.firebase);
                    AbstractC8182l.billing(c6956l10, interfaceC17242lBilling7, C3438l.amazon);
                    AbstractC4597l.yandex(AbstractC13702l.amazon(), null, AbstractC0080l.isPro(c16170l.yandex(c4346l, c14855l), 32.0f), 0L, c6956l10, 48, 8);
                    c6956l10.startapp(true);
                    c6956l10.startapp(false);
                } else if (interfaceC0038l instanceof C3416l) {
                    c6956l10.m2123default(532302424);
                    c7883l.pro((C3416l) interfaceC0038l, c6956l10, 0);
                    c6956l10.startapp(false);
                } else if (interfaceC0038l instanceof C18578l) {
                    c6956l10.m2123default(532426021);
                    c7883l.ad((C18578l) interfaceC0038l, c6956l10, 0);
                    c6956l10.startapp(false);
                } else if (interfaceC0038l instanceof C12282l) {
                    c6956l10.m2123default(532547355);
                    c7883l.premium((C12282l) interfaceC0038l, c6956l10, 0);
                    c6956l10.startapp(false);
                } else {
                    if (!(interfaceC0038l instanceof C16464l)) {
                        throw AbstractC12900l.billing(155687510, c6956l10, false);
                    }
                    c6956l10.m2123default(532673184);
                    c7883l.advert((C16464l) interfaceC0038l, c6956l10, 0);
                    c6956l10.startapp(false);
                }
                return Unit.INSTANCE;
            case 12:
                C0205l c0205l = (C0205l) obj6;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                InterfaceC18212l interfaceC18212l = (InterfaceC18212l) obj2;
                C1187l c1187l = (C1187l) obj3;
                C11379l c11379l = (C11379l) obj4;
                long jSmaato = interfaceC18212l.smaato();
                C8896l c8896l = new C8896l(0.0f, 0.0f, (int) (jSmaato >> 32), (int) (jSmaato & 4294967295L));
                boolean zLoadAd = AbstractC2044l.loadAd(c1187l.yandex, c8896l);
                long jYandex = c1187l.yandex;
                if (!zLoadAd) {
                    jYandex = AbstractC3700l.yandex(jYandex, c8896l);
                }
                long jAmazon = c0205l.amazon(interfaceC18212l, jYandex);
                if ((9223372034707292159L & jAmazon) != 9205357640488583168L) {
                    c0205l.vip(zBooleanValue2);
                    c0205l.f1175l = null;
                    c0205l.subscription(jAmazon, 9205357640488583168L, false, c11379l);
                    C6523l.loadAd(c0205l.f1160l);
                    c0205l.startapp(false);
                    c0205l.f1164l = true;
                }
                return Unit.INSTANCE;
            case 13:
                C17517l c17517l = (C17517l) obj6;
                InterfaceC13643l interfaceC13643l = (InterfaceC13643l) obj2;
                C6956l c6956l11 = (C6956l) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                C0086l c0086l2 = C18450l.f36044l;
                C15089l c15089l = C18450l.f36046l;
                if (!interfaceC13643l.equals(C12032l.yandex)) {
                    if (interfaceC13643l.equals(C11482l.yandex)) {
                        c6956l11.m2123default(557724243);
                        AbstractC4332l.amazon(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0L, 0L, 0, 0.0f, c6956l11, 6, 30);
                        c6956l11.startapp(false);
                    } else {
                        if (!(interfaceC13643l instanceof C4921l)) {
                            throw AbstractC12900l.billing(-1644632379, c6956l11, false);
                        }
                        c6956l11.m2123default(558177866);
                        C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), c15089l, c6956l11, 6);
                        long j9 = c6956l11.f14595continue;
                        int i13 = (int) (j9 ^ (j9 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato8 = c6956l11.smaato();
                        InterfaceC17242l interfaceC17242lBilling8 = AbstractC17541l.billing(c6956l11, c4346l);
                        InterfaceC8801l.firebase.getClass();
                        C16395l c16395l5 = C3438l.loadAd;
                        c6956l11.m2140super();
                        if (c6956l11.f14603switch) {
                            c6956l11.firebase(c16395l5);
                        } else {
                            c6956l11.m2136protected();
                        }
                        C6415l c6415l9 = C3438l.mopub;
                        AbstractC8182l.billing(c6956l11, c1853lYandex2, c6415l9);
                        C6415l c6415l10 = C3438l.billing;
                        AbstractC8182l.billing(c6956l11, interfaceC18556lSmaato8, c6415l10);
                        Integer numValueOf3 = Integer.valueOf(i13);
                        C6415l c6415l11 = C3438l.isPro;
                        AbstractC8182l.billing(c6956l11, numValueOf3, c6415l11);
                        C11192l c11192l3 = C3438l.firebase;
                        AbstractC8182l.purchase(c6956l11, c11192l3);
                        C6415l c6415l12 = C3438l.amazon;
                        AbstractC8182l.billing(c6956l11, interfaceC17242lBilling8, c6415l12);
                        C15407l c15407l = ((C4921l) interfaceC13643l).yandex.yandex;
                        AbstractC13010l.loadAd(c15407l.yandex, AbstractC0080l.amazon(c4346l, 1.0f), AbstractC13106l.purchase(c6956l11).adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l11).purchase, c6956l11, 48, 0, 130040);
                        C6956l c6956l12 = c6956l11;
                        if (c15407l.loadAd.length() > 0) {
                            c6956l12.m2123default(1107032329);
                            AbstractC13010l.loadAd(c15407l.loadAd, AbstractC0080l.amazon(c4346l, 1.0f), AbstractC13106l.purchase(c6956l12).subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l12).firebase, c6956l12, 48, 0, 130040);
                            c6956l12 = c6956l12;
                            z = false;
                        } else {
                            z = false;
                            c6956l12.m2123default(1098562633);
                        }
                        c6956l12.startapp(z);
                        C7537l c7537l2 = new C7537l(16.0f, true, new C8339l(12));
                        C9247l c9247l2 = new C9247l(1.0f, false);
                        boolean zAdmob4 = ((((iIntValue8 & 112) ^ 48) > 32 && c6956l12.admob(interfaceC13643l)) || (iIntValue8 & 48) == 32) | c6956l12.admob(c17517l);
                        Object objM2132native5 = c6956l12.m2132native();
                        int i14 = 8;
                        if (zAdmob4 || objM2132native5 == obj5) {
                            objM2132native5 = new C10207l(interfaceC13643l, c17517l, i14);
                            c6956l12.m2147try(objM2132native5);
                        }
                        AbstractC16336l.yandex(c9247l2, null, null, c7537l2, null, null, false, null, (Function1) objM2132native5, c6956l12, 24576, 494);
                        InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2);
                        C5062l c5062lYandex3 = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), c0086l2, c6956l12, 6);
                        long j10 = c6956l12.f14595continue;
                        int i15 = (int) (j10 ^ (j10 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato9 = c6956l12.smaato();
                        InterfaceC17242l interfaceC17242lBilling9 = AbstractC17541l.billing(c6956l12, interfaceC17242lVip);
                        c6956l12.m2140super();
                        if (c6956l12.f14603switch) {
                            c6956l12.firebase(c16395l5);
                        } else {
                            c6956l12.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l12, c5062lYandex3, c6415l9);
                        AbstractC8182l.billing(c6956l12, interfaceC18556lSmaato9, c6415l10);
                        AbstractC11043l.isPro(i15, c6956l12, c6415l11, c6956l12, c11192l3);
                        AbstractC8182l.billing(c6956l12, interfaceC17242lBilling9, c6415l12);
                        boolean zAdmob5 = c6956l12.admob(c17517l);
                        Object objM2132native6 = c6956l12.m2132native();
                        if (zAdmob5 || objM2132native6 == obj5) {
                            Object c10832l = new C10832l(0, c17517l, C17517l.class, "dismiss", "dismiss()V", 0, 0, 11);
                            c6956l12.m2147try(c10832l);
                            objM2132native6 = c10832l;
                        }
                        InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native6;
                        C17253l c17253l = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                        if (1.0f <= 0.0d) {
                            AbstractC10440l.yandex("invalid weight; must be greater than zero");
                        }
                        C9247l c9247l3 = new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        C6839l c6839l = AbstractC13106l.billing(c6956l12).crashlytics;
                        C17253l c17253l2 = C12719l.yandex;
                        C6956l c6956l13 = c6956l12;
                        AbstractC17457l.purchase((Function0) interfaceC5059l, c9247l3, false, c6839l, C12719l.subs(AbstractC13106l.purchase(c6956l12).adcel, 0L, c6956l13, 13), null, c17253l, AbstractC11308l.loadAd, c6956l13, 817889280, 356);
                        c6956l = c6956l13;
                        C17253l c17253l3 = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                        if (1.0f <= 0.0d) {
                            AbstractC10440l.yandex("invalid weight; must be greater than zero");
                        }
                        C9247l c9247l4 = new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        C6839l c6839l2 = AbstractC13106l.billing(c6956l).crashlytics;
                        boolean z3 = !c17517l.f34137l.isEmpty();
                        boolean zAdmob6 = c6956l.admob(c17517l);
                        Object objM2132native7 = c6956l.m2132native();
                        if (zAdmob6 || objM2132native7 == obj5) {
                            objM2132native7 = new C5767l(i14, c17517l);
                            c6956l.m2147try(objM2132native7);
                        }
                        AbstractC17457l.loadAd((Function0) objM2132native7, c9247l4, z3, c6839l2, null, null, null, c17253l3, AbstractC11308l.crashlytics, c6956l, 817889280, 368);
                    }
                    return Unit.INSTANCE;
                }
                c6956l11.m2123default(555763307);
                InterfaceC17242l interfaceC17242lVip2 = AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2);
                C1853l c1853lYandex3 = AbstractC1001l.yandex(c11485l, c15089l, c6956l11, 0);
                long j11 = c6956l11.f14595continue;
                int i16 = (int) (j11 ^ (j11 >>> 32));
                InterfaceC18556l interfaceC18556lSmaato10 = c6956l11.smaato();
                InterfaceC17242l interfaceC17242lBilling10 = AbstractC17541l.billing(c6956l11, interfaceC17242lVip2);
                InterfaceC8801l.firebase.getClass();
                C16395l c16395l6 = C3438l.loadAd;
                c6956l11.m2140super();
                if (c6956l11.f14603switch) {
                    c6956l11.firebase(c16395l6);
                } else {
                    c6956l11.m2136protected();
                }
                C6415l c6415l13 = C3438l.mopub;
                AbstractC8182l.billing(c6956l11, c1853lYandex3, c6415l13);
                C6415l c6415l14 = C3438l.billing;
                AbstractC8182l.billing(c6956l11, interfaceC18556lSmaato10, c6415l14);
                Integer numValueOf4 = Integer.valueOf(i16);
                C6415l c6415l15 = C3438l.isPro;
                AbstractC8182l.billing(c6956l11, numValueOf4, c6415l15);
                C11192l c11192l4 = C3438l.firebase;
                AbstractC8182l.purchase(c6956l11, c11192l4);
                C6415l c6415l16 = C3438l.amazon;
                AbstractC8182l.billing(c6956l11, interfaceC17242lBilling10, c6415l16);
                String strPurchase = AbstractC11999l.purchase(c6956l11, R.string.mixes_v2_empty);
                C10707l c10707l3 = AbstractC16964l.yandex;
                AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l11.isPro(c10707l3)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l11.isPro(c10707l3)).loadAd.purchase, c6956l11, 48, 0, 130040);
                c6956l = c6956l11;
                AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.mixes_v2_empty_text), AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l.isPro(c10707l3)).yandex.subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l3)).loadAd.firebase, c6956l11, 48, 0, 130040);
                AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
                InterfaceC17242l interfaceC17242lAmazon4 = AbstractC0080l.amazon(c4346l, 1.0f);
                C5062l c5062lYandex4 = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), c0086l2, c6956l, 6);
                long j12 = c6956l.f14595continue;
                int i17 = (int) (j12 ^ (j12 >>> 32));
                InterfaceC18556l interfaceC18556lSmaato11 = c6956l.smaato();
                InterfaceC17242l interfaceC17242lBilling11 = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon4);
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(c16395l6);
                } else {
                    c6956l.m2136protected();
                }
                AbstractC8182l.billing(c6956l, c5062lYandex4, c6415l13);
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato11, c6415l14);
                AbstractC11043l.isPro(i17, c6956l, c6415l15, c6956l, c11192l4);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling11, c6415l16);
                boolean zAdmob7 = c6956l.admob(c17517l);
                Object objM2132native8 = c6956l.m2132native();
                if (zAdmob7 || objM2132native8 == obj5) {
                    Object c10832l2 = new C10832l(0, c17517l, C17517l.class, "dismiss", "dismiss()V", 0, 0, 10);
                    c6956l.m2147try(c10832l2);
                    objM2132native8 = c10832l2;
                }
                AbstractC17457l.loadAd((Function0) ((InterfaceC5059l) objM2132native8), new C9247l(1.0f, true), false, ((C14370l) c6956l.isPro(c10707l3)).crashlytics.crashlytics, null, null, null, new C17253l(16.0f, 16.0f, 16.0f, 16.0f), AbstractC11308l.yandex, c6956l, 817889280, 372);
                AbstractC12900l.ads(c6956l, true, true, false);
                return Unit.INSTANCE;
            default:
                C0675l c0675l2 = (C0675l) obj6;
                C8147l c8147l = (C8147l) obj2;
                C6956l c6956l14 = (C6956l) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                if (c8147l != null) {
                    c6956l14.m2123default(148602644);
                    boolean zAdmob8 = c6956l14.admob(c0675l2);
                    Object objM2132native9 = c6956l14.m2132native();
                    if (zAdmob8 || objM2132native9 == obj5) {
                        objM2132native9 = new C10832l(0, c0675l2, C0675l.class, "openCacheDeletion", "openCacheDeletion()V", 0, 0, 29);
                        c6956l14.m2147try(objM2132native9);
                    }
                    Function0 function2 = (Function0) ((InterfaceC5059l) objM2132native9);
                    boolean zAdmob9 = c6956l14.admob(c0675l2);
                    Object objM2132native10 = c6956l14.m2132native();
                    if (zAdmob9 || objM2132native10 == obj5) {
                        c0675l = c0675l2;
                        objM2132native10 = new C6814l(0, c0675l, C0675l.class, "openCacheMigration", "openCacheMigration()V", 0, 0, 0);
                        c6956l14.m2147try(objM2132native10);
                    } else {
                        c0675l = c0675l2;
                    }
                    c0675l.m665abstract(c8147l, function2, (Function0) ((InterfaceC5059l) objM2132native10), c6956l14, (iIntValue9 >> 3) & 14);
                    c6956l14.startapp(false);
                } else {
                    c6956l14.m2123default(148948511);
                    AbstractC4332l.amazon(AbstractC0080l.amazon(c4346l, 1.0f), 0L, 0L, 0, 0.0f, c6956l14, 6, 30);
                    c6956l14.startapp(false);
                }
                return Unit.INSTANCE;
        }
    }
}
