package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import androidx.car.app.navigation.model.Maneuver;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* JADX INFO: renamed from: lؔٚۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2736l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f5935l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f5936l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5937l;

    public /* synthetic */ C2736l(Function2 function2, C16065l c16065l) {
        this.f5937l = 19;
        C15578l c15578l = AbstractC15290l.yandex;
        this.f5936l = function2;
        this.f5935l = c16065l;
    }

    private final Object yandex(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ((C11047l) this.f5936l).yandex((InterfaceC17242l) this.f5935l, (C6956l) obj, AbstractC0545l.purchase(1));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C12814l c12814l;
        C6415l c6415l;
        int i = this.f5937l;
        C9946l c9946l = AbstractC16837l.yandex;
        C11485l c11485l = AbstractC8313l.crashlytics;
        C13863l c13863l = C1867l.yandex;
        int i2 = 7;
        C4346l c4346l = C4346l.f8873l;
        Object obj3 = this.f5935l;
        Object obj4 = this.f5936l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((C8748l) obj4).m2428try((InterfaceC13238l) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ((C8748l) obj4).m2426this((CachedPlaylist) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 2:
                C15578l c15578l = (C15578l) obj4;
                C15851l c15851l = (C15851l) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c15578l.invoke(c15851l, c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 3:
                C2729l c2729l = (C2729l) obj4;
                C14089l c14089l = (C14089l) obj3;
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2);
                    C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                    C15089l c15089l = C18450l.f36046l;
                    C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, c15089l, c6956l2, 6);
                    long j = c6956l2.f14595continue;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lVip);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    C6415l c6415l2 = C3438l.mopub;
                    AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l2);
                    C6415l c6415l3 = C3438l.billing;
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l3);
                    Integer numValueOf = Integer.valueOf(i3);
                    C6415l c6415l4 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l2, numValueOf, c6415l4);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l2, c11192l);
                    C6415l c6415l5 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l5);
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(c11485l, c15089l, c6956l2, 0);
                    long j2 = c6956l2.f14595continue;
                    int i4 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, c4346l);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c1853lYandex2, c6415l2);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l3);
                    AbstractC11043l.isPro(i4, c6956l2, c6415l4, c6956l2, c11192l);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l5);
                    boolean zPurchase = c6956l2.purchase(c2729l.f5923l);
                    Object objM2132native = c6956l2.m2132native();
                    if (zPurchase || objM2132native == c13863l) {
                        objM2132native = AbstractC7076l.amazon(c14089l.isVip(), c2729l.f5923l);
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC13010l.loadAd((String) objM2132native, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                    String strPurchase = AbstractC11999l.purchase(c6956l2, R.string.spark_rfield_date);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, null, ((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.vip, c6956l2, 0, 0, 131066);
                    c6956l2.startapp(true);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ((C14089l) obj4).m3835instanceof((EnumC11976l) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 5:
                List list = (List) obj4;
                C14107l c14107l = (C14107l) obj3;
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    float fYandex = ((C15700l) c6956l3.isPro(AbstractC18678l.yandex)).yandex(c6956l3) + 16.0f;
                    C4346l c4346l2 = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l2, 0.0f, 0.0f, 0.0f, fYandex, 7);
                    C1853l c1853lYandex3 = AbstractC1001l.yandex(c11485l, C18450l.f36034l, c6956l3, 48);
                    long j3 = c6956l3.f14595continue;
                    int i5 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l3, interfaceC17242lStartapp);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l3.m2140super();
                    if (c6956l3.f14603switch) {
                        c6956l3.firebase(c16395l2);
                    } else {
                        c6956l3.m2136protected();
                    }
                    C6415l c6415l6 = C3438l.mopub;
                    AbstractC8182l.billing(c6956l3, c1853lYandex3, c6415l6);
                    C6415l c6415l7 = C3438l.billing;
                    AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato3, c6415l7);
                    Integer numValueOf2 = Integer.valueOf(i5);
                    C6415l c6415l8 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l3, numValueOf2, c6415l8);
                    C11192l c11192l2 = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l3, c11192l2);
                    C6415l c6415l9 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling3, c6415l9);
                    C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l3, 196608, 31);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, R.string.plus_spark_window_title), AbstractC3605l.vip(AbstractC0080l.amazon(c4346l2, 1.0f), 16.0f, 0.0f, 2), AbstractC13106l.purchase(c6956l3).adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l3).purchase, c6956l3, 48, 0, 130040);
                    AbstractC9334l.yandex(c6956l3, AbstractC0080l.purchase(c4346l2, 16.0f));
                    AbstractC3274l.yandex(AbstractC0080l.purchase(AbstractC0080l.amazon(c4346l2, 1.0f), 100.0f), AbstractC13106l.billing(c6956l3).amazon, AbstractC13106l.purchase(c6956l3).ads, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(-2076321545, new C5493l(0, list), c6956l3), c6956l3, 12582918, 120);
                    AbstractC9334l.yandex(c6956l3, AbstractC0080l.purchase(c4346l2, 16.0f));
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, R.string.plus_spark_window_desc), AbstractC3605l.vip(AbstractC0080l.amazon(c4346l2, 1.0f), 16.0f, 0.0f, 2), AbstractC13106l.purchase(c6956l3).subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l3).firebase, c6956l3, 48, 0, 130040);
                    AbstractC9334l.yandex(c6956l3, AbstractC0080l.purchase(c4346l2, 16.0f));
                    InterfaceC17242l interfaceC17242lVip2 = AbstractC3605l.vip(AbstractC0080l.amazon(c4346l2, 1.0f), 16.0f, 0.0f, 2);
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36044l, c6956l3, 6);
                    long j4 = c6956l3.f14595continue;
                    int i6 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l3, interfaceC17242lVip2);
                    c6956l3.m2140super();
                    if (c6956l3.f14603switch) {
                        c6956l3.firebase(c16395l2);
                    } else {
                        c6956l3.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l3, c5062lYandex, c6415l6);
                    AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato4, c6415l7);
                    AbstractC11043l.isPro(i6, c6956l3, c6415l8, c6956l3, c11192l2);
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling4, c6415l9);
                    boolean zAdmob = c6956l3.admob(c14107l);
                    Object objM2132native2 = c6956l3.m2132native();
                    if (zAdmob || objM2132native2 == c13863l) {
                        objM2132native2 = new C10832l(0, c14107l, C14107l.class, "dismiss", "dismiss()V", 0, 0, 24);
                        c6956l3.m2147try(objM2132native2);
                    }
                    InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native2;
                    C17253l c17253l = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    C17253l c17253l2 = C12719l.yandex;
                    C13412l c13412lYandex = C12719l.yandex(AbstractC13106l.purchase(c6956l3).ads, AbstractC13106l.purchase(c6956l3).adcel, 0L, 0L, c6956l3, 12);
                    if (1.0f <= 0.0d) {
                        AbstractC10440l.yandex("invalid weight; must be greater than zero");
                    }
                    AbstractC17457l.loadAd((Function0) interfaceC5059l, new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC13106l.billing(c6956l3).crashlytics, c13412lYandex, null, null, c17253l, AbstractC6419l.yandex, c6956l3, 817889280, 356);
                    C17253l c17253l3 = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    if (1.0f <= 0.0d) {
                        AbstractC10440l.yandex("invalid weight; must be greater than zero");
                    }
                    C9247l c9247l = new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    C6839l c6839l = AbstractC13106l.billing(c6956l3).crashlytics;
                    boolean zAdmob2 = c6956l3.admob(c14107l);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zAdmob2 || objM2132native3 == c13863l) {
                        objM2132native3 = new C5767l(14, c14107l);
                        c6956l3.m2147try(objM2132native3);
                    }
                    AbstractC17457l.loadAd((Function0) objM2132native3, c9247l, false, c6839l, null, null, null, c17253l3, AbstractC6419l.loadAd, c6956l3, 817889280, 372);
                    c6956l3.startapp(true);
                    c6956l3.startapp(true);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 6:
                InterfaceC3102l interfaceC3102l = (InterfaceC3102l) obj4;
                C7679l c7679l = (C7679l) obj3;
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    C17253l c17253l4 = AbstractC0831l.yandex;
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    AbstractC18079l.amazon(AbstractC17457l.yandex, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l4.isPro(c10707l2)).yandex.startapp, c9946l), AbstractC14566l.amazon(2008270184, new C13909l(c7679l), c6956l4), AbstractC14566l.amazon(171726737, new C17738l(c7679l, 2), c6956l4), 0.0f, ((C15700l) c6956l4.isPro(AbstractC18678l.yandex)).purchase(c6956l4), AbstractC0831l.billing(((C14370l) c6956l4.isPro(c10707l2)).yandex.startapp, ((C14370l) c6956l4.isPro(c10707l2)).yandex.ads, 0L, 0L, 0L, c6956l4, 60), interfaceC3102l, null, c6956l4, 3462, 272);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC15918l.amazon((Function0) obj4, (C4964l) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC17860l.yandex((Function0) obj4, (EnumC8514l) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 9:
                AbstractC0085l abstractC0085l = (AbstractC0085l) obj4;
                AbstractC0085l abstractC0085l2 = (AbstractC0085l) obj3;
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.cache_migration_dialog_text, new Object[]{AbstractC11999l.purchase(c6956l5, abstractC0085l.amazon()), AbstractC11999l.purchase(c6956l5, abstractC0085l2.amazon())}, c6956l5), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l5, 0, 0, 262142);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            case 10:
                InterfaceC3102l interfaceC3102l2 = (InterfaceC3102l) obj4;
                C0675l c0675l = (C0675l) obj3;
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    C17253l c17253l5 = AbstractC0831l.yandex;
                    C10707l c10707l3 = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC1383l.ads, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l6.isPro(c10707l3)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(-1551626846, new C3081l(c0675l, i2, (byte) 0), c6956l6), null, null, 0.0f, 0.0f, ((C15700l) c6956l6.isPro(AbstractC18678l.yandex)).purchase(c6956l6), AbstractC0831l.amazon(((C14370l) c6956l6.isPro(c10707l3)).yandex.startapp, ((C14370l) c6956l6.isPro(c10707l3)).yandex.ads, 0L, c6956l6, 28), interfaceC3102l2, c6956l6, 3078, 244);
                } else {
                    c6956l6.m2124else();
                }
                return Unit.INSTANCE;
            case 11:
                C5866l c5866l = (C5866l) obj4;
                final C18534l c18534l = (C18534l) obj3;
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    float fYandex2 = ((C15700l) c6956l7.isPro(AbstractC18678l.yandex)).yandex(c6956l7);
                    C4346l c4346l3 = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lStartapp2 = AbstractC3605l.startapp(c4346l3, 0.0f, 0.0f, 0.0f, fYandex2, 7);
                    C1853l c1853lYandex4 = AbstractC1001l.yandex(c11485l, C18450l.f36034l, c6956l7, 48);
                    long j5 = c6956l7.f14595continue;
                    int i7 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato5 = c6956l7.smaato();
                    InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l7, interfaceC17242lStartapp2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l7.m2140super();
                    if (c6956l7.f14603switch) {
                        c6956l7.firebase(c16395l3);
                    } else {
                        c6956l7.m2136protected();
                    }
                    C6415l c6415l10 = C3438l.mopub;
                    AbstractC8182l.billing(c6956l7, c1853lYandex4, c6415l10);
                    C6415l c6415l11 = C3438l.billing;
                    AbstractC8182l.billing(c6956l7, interfaceC18556lSmaato5, c6415l11);
                    Integer numValueOf3 = Integer.valueOf(i7);
                    C6415l c6415l12 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l7, numValueOf3, c6415l12);
                    C11192l c11192l3 = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l7, c11192l3);
                    C6415l c6415l13 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l7, interfaceC17242lBilling5, c6415l13);
                    C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l7, 196608, 31);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l7, R.string.lyrics_share), AbstractC0080l.amazon(c4346l3, 1.0f), AbstractC13106l.purchase(c6956l7).adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l7).purchase, c6956l7, 48, 0, 130040);
                    AbstractC9334l.yandex(c6956l7, AbstractC0080l.purchase(c4346l3, 16.0f));
                    C9247l c9247l2 = new C9247l(1.0f, true);
                    boolean zAdmob3 = c6956l7.admob(c18534l);
                    Object objM2132native4 = c6956l7.m2132native();
                    if (zAdmob3 || objM2132native4 == c13863l) {
                        objM2132native4 = new C5495l(c18534l, 2);
                        c6956l7.m2147try(objM2132native4);
                    }
                    AbstractC16336l.yandex(c9247l2, c5866l, null, null, null, null, false, null, (Function1) objM2132native4, c6956l7, 0, 508);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l7, 0, 7);
                    C7537l c7537l2 = new C7537l(8.0f, true, new C8339l(12));
                    C0086l c0086l = C18450l.f36040l;
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l3, 1.0f), 16.0f);
                    C5062l c5062lYandex2 = AbstractC7001l.yandex(c7537l2, c0086l, c6956l7, 54);
                    long j6 = c6956l7.f14595continue;
                    int i8 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato6 = c6956l7.smaato();
                    InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l7, interfaceC17242lSmaato);
                    c6956l7.m2140super();
                    if (c6956l7.f14603switch) {
                        c6956l7.firebase(c16395l3);
                    } else {
                        c6956l7.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l7, c5062lYandex2, c6415l10);
                    AbstractC8182l.billing(c6956l7, interfaceC18556lSmaato6, c6415l11);
                    AbstractC11043l.isPro(i8, c6956l7, c6415l12, c6956l7, c11192l3);
                    AbstractC8182l.billing(c6956l7, interfaceC17242lBilling6, c6415l13);
                    C9247l c9247l3 = new C9247l(1.0f, true);
                    boolean z = !c18534l.f36168l.isEmpty();
                    C17253l c17253l6 = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    C6839l c6839l2 = AbstractC13106l.billing(c6956l7).crashlytics;
                    boolean zAdmob4 = c6956l7.admob(c18534l);
                    Object objM2132native5 = c6956l7.m2132native();
                    if (zAdmob4 || objM2132native5 == c13863l) {
                        final int i9 = 0;
                        objM2132native5 = new Function0() { // from class: lًؕۙ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i10 = i9;
                                C18534l c18534l2 = c18534l;
                                switch (i10) {
                                    case 0:
                                        Activity activity = c18534l2.f5081l;
                                        Intent intent = new Intent();
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", AbstractC16901l.m4210case(c18534l2.f36168l, "\n", null, null, new C5495l(c18534l2, 1), 30));
                                        activity.startActivity(Intent.createChooser(intent, c18534l2.f5081l.getResources().getText(R.string.lyrics_share)));
                                        c18534l2.purchase();
                                        break;
                                    default:
                                        if (c18534l2.f36168l.isEmpty()) {
                                            DecimalFormat decimalFormat = C15638l.yandex;
                                            C15638l.yandex(AbstractC16901l.m4210case(c18534l2.f36169l, "\n", null, null, new C1698l(27), 30));
                                        } else {
                                            DecimalFormat decimalFormat2 = C15638l.yandex;
                                            C15638l.yandex(AbstractC16901l.m4210case(c18534l2.f36168l, "\n", null, null, new C5495l(c18534l2, 0), 30));
                                        }
                                        c18534l2.purchase();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l7.m2147try(objM2132native5);
                    }
                    AbstractC17457l.loadAd((Function0) objM2132native5, c9247l3, z, c6839l2, null, null, null, c17253l6, AbstractC15639l.yandex, c6956l7, 817889280, 368);
                    C6839l c6839l3 = AbstractC13106l.billing(c6956l7).crashlytics;
                    C17253l c17253l7 = new C17253l(12.0f, 12.0f, 12.0f, 12.0f);
                    C17253l c17253l8 = C12719l.yandex;
                    C13412l c13412lYandex2 = C12719l.yandex(AbstractC13106l.purchase(c6956l7).adcel, AbstractC13106l.purchase(c6956l7).license, 0L, 0L, c6956l7, 12);
                    boolean zAdmob5 = c6956l7.admob(c18534l);
                    Object objM2132native6 = c6956l7.m2132native();
                    if (zAdmob5 || objM2132native6 == c13863l) {
                        final int i10 = 1;
                        objM2132native6 = new Function0() { // from class: lًؕۙ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i11 = i10;
                                C18534l c18534l2 = c18534l;
                                switch (i11) {
                                    case 0:
                                        Activity activity = c18534l2.f5081l;
                                        Intent intent = new Intent();
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", AbstractC16901l.m4210case(c18534l2.f36168l, "\n", null, null, new C5495l(c18534l2, 1), 30));
                                        activity.startActivity(Intent.createChooser(intent, c18534l2.f5081l.getResources().getText(R.string.lyrics_share)));
                                        c18534l2.purchase();
                                        break;
                                    default:
                                        if (c18534l2.f36168l.isEmpty()) {
                                            DecimalFormat decimalFormat = C15638l.yandex;
                                            C15638l.yandex(AbstractC16901l.m4210case(c18534l2.f36169l, "\n", null, null, new C1698l(27), 30));
                                        } else {
                                            DecimalFormat decimalFormat2 = C15638l.yandex;
                                            C15638l.yandex(AbstractC16901l.m4210case(c18534l2.f36168l, "\n", null, null, new C5495l(c18534l2, 0), 30));
                                        }
                                        c18534l2.purchase();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l7.m2147try(objM2132native6);
                    }
                    AbstractC17457l.loadAd((Function0) objM2132native6, null, false, c6839l3, c13412lYandex2, null, null, c17253l7, AbstractC15639l.loadAd, c6956l7, 817889280, 358);
                    c6956l7.startapp(true);
                    c6956l7.startapp(true);
                } else {
                    c6956l7.m2124else();
                }
                return Unit.INSTANCE;
            case 12:
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj4;
                C15578l c15578l2 = (C15578l) obj3;
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    c15578l2.invoke(new C3809l(((Boolean) interfaceC8714l.getValue()).booleanValue()), c6956l8, 0);
                } else {
                    c6956l8.m2124else();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ((C16278l) obj4).mopub((Drawable) obj3, (C6956l) obj, AbstractC0545l.purchase(49));
                return Unit.INSTANCE;
            case 14:
                Function3 function3 = (Function3) obj4;
                C5689l c5689l = (C5689l) obj3;
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    function3.invoke(c5689l, c6956l9, 6);
                } else {
                    c6956l9.m2124else();
                }
                return Unit.INSTANCE;
            case 15:
                C16173l c16173l = (C16173l) obj4;
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj3;
                C18624l c18624l = (C18624l) obj;
                Context context = (Context) obj2;
                boolean zIsPro = c16173l.isPro();
                C3625l c3625lRemoteconfig = c16173l.remoteconfig();
                String str = c3625lRemoteconfig != null ? c3625lRemoteconfig.f7563l : null;
                C12814l c12814l2 = c16173l.license;
                if (c12814l2 != null) {
                    long j7 = c12814l2.yandex;
                    InterfaceC4005l interfaceC4005l = c16173l.loadAd;
                    c12814l = new C12814l(AbstractC2296l.loadAd(interfaceC4005l.admob((int) (j7 >> 32)), interfaceC4005l.admob((int) (j7 & 4294967295L))));
                } else {
                    c12814l = null;
                }
                AbstractC16692l.yandex(c18624l, context, zIsPro, str, c12814l, c16173l.subs, new C6411l((Object) c16173l, interfaceC2262l, context, 13));
                return Unit.INSTANCE;
            case 16:
                C12217l c12217l = (C12217l) obj4;
                Context context2 = (Context) obj2;
                boolean zRemoteconfig = c12217l.remoteconfig();
                C16328l c16328l = c12217l.yandex;
                AbstractC16692l.yandex((C18624l) obj, context2, zRemoteconfig, c16328l.amazon().f12057l, new C12814l(c16328l.amazon().f12061l), c12217l.mopub, new C6411l((Object) c12217l, (InterfaceC2262l) obj3, context2, 16));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                InterfaceC3102l interfaceC3102l3 = (InterfaceC3102l) obj4;
                C0072l c0072l = (C0072l) obj3;
                C6956l c6956l10 = (C6956l) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    C17253l c17253l9 = AbstractC0831l.yandex;
                    C10707l c10707l4 = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC11036l.yandex, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l10.isPro(c10707l4)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(-1671823357, new C14222l(c0072l), c6956l10), null, null, 0.0f, 0.0f, ((C15700l) c6956l10.isPro(AbstractC18678l.yandex)).purchase(c6956l10), AbstractC0831l.amazon(((C14370l) c6956l10.isPro(c10707l4)).yandex.startapp, ((C14370l) c6956l10.isPro(c10707l4)).yandex.ads, 0L, c6956l10, 28), interfaceC3102l3, c6956l10, 3078, 244);
                } else {
                    c6956l10.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                InterfaceC3102l interfaceC3102l4 = (InterfaceC3102l) obj4;
                C16852l c16852l = (C16852l) obj3;
                C6956l c6956l11 = (C6956l) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    C17253l c17253l10 = AbstractC0831l.yandex;
                    C10707l c10707l5 = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC3670l.yandex, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l11.isPro(c10707l5)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(726271297, new C16213l(c16852l), c6956l11), null, null, 0.0f, 0.0f, ((C15700l) c6956l11.isPro(AbstractC18678l.yandex)).purchase(c6956l11), AbstractC0831l.amazon(((C14370l) c6956l11.isPro(c10707l5)).yandex.startapp, ((C14370l) c6956l11.isPro(c10707l5)).yandex.ads, 0L, c6956l11, 28), interfaceC3102l4, c6956l11, 3078, 244);
                } else {
                    c6956l11.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                Function2 function2 = (Function2) obj4;
                C16065l c16065l = (C16065l) obj3;
                C15578l c15578l3 = AbstractC15290l.purchase;
                C6956l c6956l12 = (C6956l) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                C14855l c14855l = C18450l.f36026l;
                if (c6956l12.m2127for(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    AbstractC8644l.yandex(c6956l12, 10);
                    C11090l c11090lYandex = AbstractC8644l.yandex(c6956l12, 15);
                    C11090l c11090lYandex2 = AbstractC8644l.yandex(c6956l12, 2);
                    InterfaceC17242l interfaceC17242lVip3 = AbstractC3605l.vip(c4346l, AbstractC15645l.loadAd, 0.0f, 2);
                    C1853l c1853lYandex5 = AbstractC1001l.yandex(c11485l, C18450l.f36046l, c6956l12, 0);
                    long j8 = c6956l12.f14595continue;
                    int i11 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato7 = c6956l12.smaato();
                    InterfaceC17242l interfaceC17242lBilling7 = AbstractC17541l.billing(c6956l12, interfaceC17242lVip3);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l4 = C3438l.loadAd;
                    c6956l12.m2140super();
                    if (c6956l12.f14603switch) {
                        c6956l12.firebase(c16395l4);
                    } else {
                        c6956l12.m2136protected();
                    }
                    C6415l c6415l14 = C3438l.mopub;
                    AbstractC8182l.billing(c6956l12, c1853lYandex5, c6415l14);
                    C6415l c6415l15 = C3438l.billing;
                    AbstractC8182l.billing(c6956l12, interfaceC18556lSmaato7, c6415l15);
                    Integer numValueOf4 = Integer.valueOf(i11);
                    C6415l c6415l16 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l12, numValueOf4, c6415l16);
                    C11192l c11192l4 = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l12, c11192l4);
                    C6415l c6415l17 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l12, interfaceC17242lBilling7, c6415l17);
                    if (function2 == null) {
                        c6956l12.m2123default(112051624);
                        c6956l12.startapp(false);
                        c6415l = c6415l17;
                    } else {
                        c6956l12.m2123default(112051625);
                        InterfaceC17242l interfaceC17242lAmazon = AbstractC17716l.amazon(AbstractC15645l.crashlytics, Float.NaN);
                        InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(c14855l, false);
                        long j9 = c6956l12.f14595continue;
                        int i12 = (int) (j9 ^ (j9 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato8 = c6956l12.smaato();
                        InterfaceC17242l interfaceC17242lBilling8 = AbstractC17541l.billing(c6956l12, interfaceC17242lAmazon);
                        c6956l12.m2140super();
                        if (c6956l12.f14603switch) {
                            c6956l12.firebase(c16395l4);
                        } else {
                            c6956l12.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l12, interfaceC10835lAmazon, c6415l14);
                        AbstractC8182l.billing(c6956l12, interfaceC18556lSmaato8, c6415l15);
                        AbstractC11043l.isPro(i12, c6956l12, c6415l16, c6956l12, c11192l4);
                        c6415l = c6415l17;
                        AbstractC8182l.billing(c6956l12, interfaceC17242lBilling8, c6415l);
                        AbstractC10478l.loadAd(new C10092l[]{AbstractC5020l.startapp(c16065l.crashlytics, AbstractC12502l.yandex), AbstractC13010l.yandex.yandex(c11090lYandex)}, function2, c6956l12, 8);
                        c6956l12.startapp(true);
                        Unit unit = Unit.INSTANCE;
                        c6956l12.startapp(false);
                    }
                    InterfaceC17242l interfaceC17242lStartapp3 = function2 != null ? AbstractC3605l.startapp(AbstractC17716l.amazon(AbstractC15645l.amazon, Float.NaN), 0.0f, 0.0f, 0.0f, AbstractC15645l.purchase, 7) : AbstractC3605l.vip(c4346l, 0.0f, 4.0f, 1);
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(c14855l, false);
                    long j10 = c6956l12.f14595continue;
                    int i13 = (int) (j10 ^ (j10 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato9 = c6956l12.smaato();
                    InterfaceC17242l interfaceC17242lBilling9 = AbstractC17541l.billing(c6956l12, interfaceC17242lStartapp3);
                    c6956l12.m2140super();
                    if (c6956l12.f14603switch) {
                        c6956l12.firebase(c16395l4);
                    } else {
                        c6956l12.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l12, interfaceC10835lAmazon2, c6415l14);
                    AbstractC8182l.billing(c6956l12, interfaceC18556lSmaato9, c6415l15);
                    AbstractC11043l.isPro(i13, c6956l12, c6415l16, c6956l12, c11192l4);
                    AbstractC8182l.billing(c6956l12, interfaceC17242lBilling9, c6415l);
                    AbstractC10478l.loadAd(new C10092l[]{AbstractC5020l.startapp(c16065l.loadAd, AbstractC12502l.yandex), AbstractC13010l.yandex.yandex(c11090lYandex2)}, c15578l3, c6956l12, 8);
                    c6956l12.startapp(true);
                    c6956l12.m2123default(112784836);
                    c6956l12.startapp(false);
                    c6956l12.startapp(true);
                } else {
                    c6956l12.m2124else();
                }
                return Unit.INSTANCE;
            case 20:
                InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) obj4;
                Function2 function4 = (Function2) obj3;
                C6956l c6956l13 = (C6956l) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (c6956l13.m2127for(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    Object objM2132native7 = c6956l13.m2132native();
                    if (objM2132native7 == c13863l) {
                        objM2132native7 = new C17660l(interfaceC8714l2, 7);
                        c6956l13.m2147try(objM2132native7);
                    }
                    InterfaceC17242l interfaceC17242lBilling10 = AbstractC8238l.billing(c4346l, (Function1) objM2132native7);
                    InterfaceC10835l interfaceC10835lAmazon3 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j11 = c6956l13.f14595continue;
                    int i14 = (int) (j11 ^ (j11 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato10 = c6956l13.smaato();
                    InterfaceC17242l interfaceC17242lBilling11 = AbstractC17541l.billing(c6956l13, interfaceC17242lBilling10);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l5 = C3438l.loadAd;
                    c6956l13.m2140super();
                    if (c6956l13.f14603switch) {
                        c6956l13.firebase(c16395l5);
                    } else {
                        c6956l13.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l13, interfaceC10835lAmazon3, C3438l.mopub);
                    AbstractC8182l.billing(c6956l13, interfaceC18556lSmaato10, C3438l.billing);
                    AbstractC8182l.billing(c6956l13, Integer.valueOf(i14), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l13, C3438l.firebase);
                    AbstractC8182l.billing(c6956l13, interfaceC17242lBilling11, C3438l.amazon);
                    function4.invoke(c6956l13, 0);
                    c6956l13.startapp(true);
                } else {
                    c6956l13.m2124else();
                }
                return Unit.INSTANCE;
            case 21:
                String str2 = (String) obj4;
                AbstractC14165l abstractC14165l = (AbstractC14165l) obj3;
                C6956l c6956l14 = (C6956l) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (c6956l14.m2127for(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    AbstractC7741l.purchase(str2, null, AbstractC0080l.crashlytics(c4346l, 1.0f), abstractC14165l, abstractC14165l, null, c6956l14, 37296, 0, 32736);
                } else {
                    c6956l14.m2124else();
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                ((C13550l) obj4).yandex((InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(7));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                ((C17723l) obj4).yandex((InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(7));
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((Integer) obj2).getClass();
                ((C1639l) obj4).yandex((InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((Integer) obj2).getClass();
                ((C12845l) obj4).yandex((InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((Integer) obj2).getClass();
                ((C13406l) obj4).yandex((InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((Integer) obj2).getClass();
                ((C9250l) obj4).yandex((InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return yandex(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                ((C17418l) obj4).yandex((InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C2736l(Object obj, Object obj2, int i, int i2) {
        this.f5937l = i2;
        this.f5936l = obj;
        this.f5935l = obj2;
    }

    public /* synthetic */ C2736l(Object obj, Object obj2, int i) {
        this.f5937l = i;
        this.f5936l = obj;
        this.f5935l = obj2;
    }
}
