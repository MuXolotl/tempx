package defpackage;

import android.graphics.drawable.Drawable;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lؓۚ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2104l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f4728l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f4729l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4730l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f4731l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f4732l;

    public /* synthetic */ C2104l(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f4730l = i;
        this.f4729l = obj;
        this.f4728l = obj2;
        this.f4732l = obj3;
        this.f4731l = obj4;
    }

    private final Object admob(Object obj, Object obj2) {
        C6523l c6523l = (C6523l) this.f4729l;
        C6523l c6523l2 = (C6523l) this.f4728l;
        C5866l c5866l = (C5866l) this.f4732l;
        InterfaceC12244l interfaceC12244l = (InterfaceC12244l) this.f4731l;
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i = 1;
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
            InterfaceC17242l interfaceC17242lPurchase = AbstractC6745l.purchase(AbstractC9966l.billing(AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), c6523l), c6523l2);
            boolean zBilling = c6956l.billing(interfaceC12244l) | c6956l.billing(c6523l2);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new C15575l((Object) interfaceC12244l, c6523l2, i);
                c6956l.m2147try(objM2132native);
            }
            AbstractC16336l.yandex(interfaceC17242lPurchase, c5866l, null, null, null, null, false, null, (Function1) objM2132native, c6956l, 0, 508);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object billing(Object obj, Object obj2) {
        InterfaceC8714l interfaceC8714l = (InterfaceC8714l) this.f4729l;
        AbstractC17824l abstractC17824l = (AbstractC17824l) this.f4728l;
        InterfaceC11780l interfaceC11780l = (InterfaceC11780l) this.f4732l;
        C15578l c15578l = (C15578l) this.f4731l;
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i = 1;
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
            InterfaceC17242l interfaceC17242lSmaato = AbstractC14289l.smaato(AbstractC14312l.isPro(C4346l.f8873l, "Container"), new C6411l(new C18200l(0, 3, InterfaceC8714l.class, interfaceC8714l, "value", "getValue()Ljava/lang/Object;"), interfaceC11780l, ((C15618l) abstractC17824l).startapp, i));
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, true);
            long j = c6956l.f14595continue;
            int i2 = (int) (j ^ (j >>> 32));
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
            AbstractC8182l.billing(c6956l, Integer.valueOf(i2), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            AbstractC2812l.pro(0, c15578l, c6956l, true);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object mopub(Object obj, Object obj2) {
        InterfaceC17242l interfaceC17242l = (InterfaceC17242l) this.f4729l;
        C15578l c15578l = (C15578l) this.f4728l;
        C15578l c15578l2 = (C15578l) this.f4732l;
        Function3 function3 = (Function3) this.f4731l;
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36040l, c6956l, 54);
            long j = c6956l.f14595continue;
            int i = (int) (j ^ (j >>> 32));
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
            AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            C18295l c18295l = C18295l.yandex;
            c15578l.invoke(c18295l, c6956l, 6);
            c15578l2.invoke(c18295l, c6956l, 6);
            function3.invoke(c18295l, c6956l, 6);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object yandex(Object obj, Object obj2) {
        Integer numValueOf;
        C15578l c15578l = (C15578l) this.f4729l;
        Function2 function2 = (Function2) this.f4728l;
        final Function4 function4 = (Function4) this.f4732l;
        final InterfaceC8714l interfaceC8714l = (InterfaceC8714l) this.f4731l;
        final InterfaceC15847l interfaceC15847l = (InterfaceC15847l) obj;
        C15519l c15519l = (C15519l) obj2;
        List listAds = interfaceC15847l.ads(EnumC2248l.f4935l, c15578l);
        final ArrayList arrayList = new ArrayList(listAds.size());
        int size = listAds.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((InterfaceC6357l) listAds.get(i)).adcel(C15519l.yandex(0, 0, 0, 0, 10, c15519l.yandex)));
        }
        int i2 = 1;
        int size2 = listAds.size() - 1;
        List listAds2 = interfaceC15847l.ads(EnumC2248l.f4933l, new C15578l(2005070237, true, new C1674l(size2, function2)));
        final ArrayList arrayList2 = new ArrayList(listAds2.size());
        int size3 = listAds2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            arrayList2.add(((InterfaceC6357l) listAds2.get(i3)).adcel(C15519l.yandex(0, 0, 0, 0, 10, c15519l.yandex)));
        }
        AbstractC10113l abstractC10113l = (AbstractC10113l) AbstractC16901l.m4217extends(arrayList2);
        final int i4 = abstractC10113l != null ? abstractC10113l.f20592l : 0;
        int size4 = arrayList.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size4; i6++) {
            i5 += ((AbstractC10113l) arrayList.get(i6)).f20592l;
        }
        final int i7 = i5 + (size2 * i4);
        if (!arrayList.isEmpty()) {
            numValueOf = Integer.valueOf(((AbstractC10113l) arrayList.get(0)).f20591l);
            int iSmaato = AbstractC14055l.smaato(arrayList);
            if (1 <= iSmaato) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((AbstractC10113l) arrayList.get(i2)).f20591l);
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iSmaato) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        return interfaceC15847l.isVip(i7, iIntValue, C14054l.f27396l, new Function1() { // from class: lّٜۙ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                InterfaceC15847l interfaceC15847l2;
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj3;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = arrayList;
                int size5 = arrayList4.size();
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    interfaceC15847l2 = interfaceC15847l;
                    if (i8 >= size5) {
                        break;
                    }
                    AbstractC10113l abstractC10113l2 = (AbstractC10113l) arrayList4.get(i8);
                    AbstractC9601l.smaato(abstractC9601l, abstractC10113l2, i9, 0);
                    arrayList3.add(new C7849l(interfaceC15847l2.mo872static(i9), interfaceC15847l2.mo872static(0), interfaceC15847l2.mo872static(abstractC10113l2.f20592l + i9), interfaceC15847l2.mo872static(abstractC10113l2.f20591l)));
                    int i10 = i9 + abstractC10113l2.f20592l;
                    if (AbstractC14055l.smaato(arrayList4) != i8) {
                        AbstractC9601l.smaato(abstractC9601l, (AbstractC10113l) arrayList2.get(i8), i10, 0);
                    }
                    i9 = i10 + i4;
                    i8++;
                }
                List listAds3 = interfaceC15847l2.ads(EnumC2248l.f4934l, new C15578l(900811855, true, new C3411l(function4, arrayList3, interfaceC8714l, 11)));
                int size6 = listAds3.size();
                for (int i11 = 0; i11 < size6; i11++) {
                    InterfaceC6357l interfaceC6357l = (InterfaceC6357l) listAds3.get(i11);
                    int i12 = i7;
                    boolean z = i12 >= 0;
                    int i13 = iIntValue;
                    if (!(z & (i13 >= 0))) {
                        AbstractC10280l.yandex("width and height must be >= 0");
                    }
                    AbstractC9601l.smaato(abstractC9601l, interfaceC6357l.adcel(AbstractC7563l.admob(i12, i12, i13, i13)), 0, 0);
                }
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:103:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:105:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:109:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:91:0x044b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0457  */
    /* JADX WARN: Code duplicated, block: B:96:0x045a  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        C6956l c6956l;
        C13863l c13863l;
        C0130l c0130l;
        float f;
        C6956l c6956l2;
        float f2;
        float f3;
        boolean zAdmob;
        Object objM2132native;
        int i = this.f4730l;
        C9946l c9946l = AbstractC16837l.yandex;
        int i2 = 29;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l2 = C1867l.yandex;
        int i3 = 2;
        Object obj3 = this.f4731l;
        Object obj4 = this.f4732l;
        Object obj5 = this.f4728l;
        Object obj6 = this.f4729l;
        switch (i) {
            case 0:
                C14267l c14267l = (C14267l) obj6;
                C0483l c0483l = (C0483l) obj5;
                C14632l c14632l = (C14632l) obj4;
                InterfaceC9085l interfaceC9085l = (InterfaceC9085l) obj3;
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i4 = 1;
                if (c6956l3.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC8007l.yandex(AbstractC14566l.amazon(255624952, new Cprotected(c0483l, c14632l, interfaceC9085l, i4), c6956l3), c14267l.yandex, AbstractC2697l.subscription(AbstractC3605l.remoteconfig(AbstractC0080l.amazon(c4346l, 1.0f), 24.0f, 16.0f), AbstractC2697l.amazon), c6956l3, 6);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC17242l interfaceC17242l = (InterfaceC17242l) obj6;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj5;
                C15578l c15578l = (C15578l) obj4;
                C2769l c2769l = (C2769l) obj3;
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objM2132native2 = c6956l4.m2132native();
                    if (objM2132native2 == c13863l2) {
                        objM2132native2 = new C9922l(interfaceC8714l, 9);
                        c6956l4.m2147try(objM2132native2);
                    }
                    InterfaceC17242l interfaceC17242lBilling = AbstractC8238l.billing(interfaceC17242l, (Function1) objM2132native2);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, true);
                    long j = c6956l4.f14595continue;
                    int i5 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l4.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l4, interfaceC17242lBilling);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l4.m2140super();
                    if (c6956l4.f14603switch) {
                        c6956l4.firebase(c16395l);
                    } else {
                        c6956l4.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l4, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l4, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l4, C3438l.firebase);
                    AbstractC8182l.billing(c6956l4, interfaceC17242lBilling2, C3438l.amazon);
                    c15578l.invoke(c6956l4, 0);
                    Object objM2132native3 = c6956l4.m2132native();
                    if (objM2132native3 == c13863l2) {
                        objM2132native3 = new C0289l(interfaceC8714l, 4);
                        c6956l4.m2147try(objM2132native3);
                    }
                    c2769l.loadAd((Function0) objM2132native3, c6956l4, 6);
                    c6956l4.startapp(true);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ((C9430l) obj6).m2651break((CachedTrack) obj5, (Function0) obj4, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 3:
                Function1 function1 = (Function1) obj6;
                InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) obj5;
                InterfaceC8714l interfaceC8714l3 = (InterfaceC8714l) obj4;
                String str = (String) obj3;
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C0639l c0639l = (C0639l) interfaceC8714l2.getValue();
                    C3790l c3790l = new C3790l(3, 7, 83);
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zBilling = c6956l5.billing(function1);
                    Object objM2132native4 = c6956l5.m2132native();
                    if (zBilling || objM2132native4 == c13863l2) {
                        objM2132native4 = new C11537l(function1, interfaceC8714l2, interfaceC8714l3, i3);
                        c6956l5.m2147try(objM2132native4);
                    }
                    C6973l c6973l = new C6973l((Function1) objM2132native4, null, 62);
                    Object objM2132native5 = c6956l5.m2132native();
                    if (objM2132native5 == c13863l2) {
                        objM2132native5 = new C9922l(interfaceC8714l2, 13);
                        c6956l5.m2147try(objM2132native5);
                    }
                    AbstractC2130l.crashlytics(c0639l, (Function1) objM2132native5, interfaceC17242lAmazon, false, null, null, AbstractC14566l.amazon(-2101410933, new C4210l(str, 8), c6956l5), null, c3790l, c6973l, false, 0, 0, null, null, c6956l5, 805306800, 196608, 8289784);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC8714l interfaceC8714l4 = (InterfaceC8714l) obj6;
                Function0 function0 = (Function0) obj5;
                Function1 function2 = (Function1) obj4;
                C11359l c11359l = (C11359l) obj3;
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    C0639l c0639l2 = (C0639l) interfaceC8714l4.getValue();
                    C3790l c3790l2 = new C3790l(0, 7, 119);
                    boolean zBilling2 = c6956l6.billing(interfaceC8714l4) | c6956l6.billing(function0) | c6956l6.billing(function2) | c6956l6.admob(c11359l);
                    Object objM2132native6 = c6956l6.m2132native();
                    if (zBilling2 || objM2132native6 == c13863l2) {
                        C17796l c17796l = new C17796l(function0, function2, c11359l, interfaceC8714l4, 5);
                        c6956l6.m2147try(c17796l);
                        objM2132native6 = c17796l;
                    }
                    C6973l c6973l2 = new C6973l((Function1) objM2132native6, null, 62);
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zBilling3 = c6956l6.billing(interfaceC8714l4);
                    Object objM2132native7 = c6956l6.m2132native();
                    if (zBilling3 || objM2132native7 == c13863l2) {
                        objM2132native7 = new C9922l(interfaceC8714l4, 15);
                        c6956l6.m2147try(objM2132native7);
                    }
                    AbstractC2130l.crashlytics(c0639l2, (Function1) objM2132native7, interfaceC17242lAmazon2, false, null, AbstractC5103l.isPro, null, null, c3790l2, c6973l2, false, 0, 0, null, null, c6956l6, 12583296, 196608, 8290168);
                } else {
                    c6956l6.m2124else();
                }
                return Unit.INSTANCE;
            case 5:
                C17984l c17984l = (C17984l) obj6;
                EnumC0442l enumC0442l = (EnumC0442l) obj5;
                List list = (List) obj4;
                InterfaceC8714l interfaceC8714l5 = (InterfaceC8714l) obj3;
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l7.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lSubscription = AbstractC2697l.subscription(AbstractC2697l.subscription(AbstractC3605l.smaato(AbstractC0080l.crashlytics(c4346l, 1.0f), 16.0f), AbstractC2697l.amazon), AbstractC2697l.billing);
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36043l, false);
                    long j2 = c6956l7.f14595continue;
                    int i6 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l7.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l7, interfaceC17242lSubscription);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l7.m2140super();
                    if (c6956l7.f14603switch) {
                        c6956l7.firebase(c16395l2);
                    } else {
                        c6956l7.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l7, interfaceC10835lAmazon2, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l7, interfaceC18556lSmaato2, c6415l2);
                    Integer numValueOf = Integer.valueOf(i6);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l7, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l7, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l7, interfaceC17242lBilling3, c6415l4);
                    C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36034l, c6956l7, 54);
                    long j3 = c6956l7.f14595continue;
                    int i7 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l7.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l7, c4346l);
                    c6956l7.m2140super();
                    if (c6956l7.f14603switch) {
                        c6956l7.firebase(c16395l2);
                    } else {
                        c6956l7.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l7, c1853lYandex, c6415l);
                    AbstractC8182l.billing(c6956l7, interfaceC18556lSmaato3, c6415l2);
                    AbstractC11043l.isPro(i7, c6956l7, c6415l3, c6956l7, c11192l);
                    AbstractC8182l.billing(c6956l7, interfaceC17242lBilling4, c6415l4);
                    Object objM2132native8 = c6956l7.m2132native();
                    if (objM2132native8 == c13863l2) {
                        objM2132native8 = AbstractC13273l.loadAd(c17984l.isVip(), enumC0442l.f1619l);
                        c6956l7.m2147try(objM2132native8);
                    }
                    C12371l.yandex(AbstractC7041l.yandex((Drawable) objM2132native8, c6956l7), AbstractC0080l.isPro(c4346l, 72.0f), null, null, 0.0f, c6956l7, 440, 120);
                    String strPurchase = AbstractC11999l.purchase(c6956l7, R.string.auth2_acc_manager_title);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l7.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l7.isPro(c10707l)).loadAd.vip, c6956l7, 48, 0, 131064);
                    AbstractC3383l.yandex(AbstractC0080l.mopub(c4346l, 0.0f, 320.0f, 1), null, null, null, null, AbstractC14566l.amazon(-675349795, new Cprotected(list, c17984l, interfaceC8714l5, 20), c6956l7), c6956l7, 196614, 30);
                    c6956l7.startapp(true);
                    c6956l7.startapp(true);
                } else {
                    c6956l7.m2124else();
                }
                return Unit.INSTANCE;
            case 6:
                C10178l c10178l = (C10178l) obj6;
                C10178l c10178l2 = (C10178l) obj5;
                Function0 function3 = (Function0) obj4;
                InterfaceC8714l interfaceC8714l6 = (InterfaceC8714l) obj3;
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l8.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    AbstractC18219l.subscription(function3, ((Boolean) interfaceC8714l6.getValue()).booleanValue(), null, null, c10178l.loadAd().f12057l.length() > 0 && c10178l2.loadAd().f12057l.length() > 0, c6956l8, 196608);
                } else {
                    c6956l8.m2124else();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC18377l.yandex((Function0) obj6, (InterfaceC17242l) obj5, (C14541l) obj4, (InterfaceC2948l) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ((C11249l) obj6).ad((InterfaceC17242l) obj5, (AbstractC14165l) obj4, (String) obj3, (C6956l) obj, AbstractC0545l.purchase(71));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                C5795l.loadAd((Function0) obj6, (C15578l) obj5, (C15578l) obj4, (InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(433));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                AbstractC10704l.yandex((String) obj6, (String) obj5, (String) obj4, (InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                AbstractC5473l.purchase((C5803l) obj6, (Function1) obj5, (Function1) obj4, (Function1) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC14412l.loadAd((C13242l) obj6, (Function1) obj5, (Function1) obj4, (Function1) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 13:
                C15578l c15578l2 = (C15578l) obj6;
                C13765l c13765l = (C13765l) obj5;
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj4;
                AbstractC13264l abstractC13264l = (AbstractC13264l) obj3;
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c6956l9.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36040l, c6956l9, 54);
                    long j4 = c6956l9.f14595continue;
                    int i8 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l9.smaato();
                    InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l9, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l9.m2140super();
                    if (c6956l9.f14603switch) {
                        c6956l9.firebase(c16395l3);
                    } else {
                        c6956l9.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l9, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l9, interfaceC18556lSmaato4, C3438l.billing);
                    AbstractC8182l.billing(c6956l9, Integer.valueOf(i8), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l9, C3438l.firebase);
                    AbstractC8182l.billing(c6956l9, interfaceC17242lBilling5, C3438l.amazon);
                    c15578l2.invoke(c6956l9, 0);
                    C18295l c18295l = C18295l.yandex;
                    AbstractC9334l.yandex(c6956l9, c18295l.yandex(c4346l, 1.0f, true));
                    boolean z2 = c13765l.admob() == 1.0f;
                    C3000l c3000lPurchase = AbstractC4523l.purchase(null, 3);
                    C8896l c8896l = AbstractC11922l.yandex;
                    AbstractC3308l.crashlytics(c18295l, !z2, null, c3000lPurchase.yandex(new C3000l(new C3313l((C4610l) null, new C5487l(new C4693l(1, C16274l.f31863l), AbstractC0532l.admob(0.0f, 400.0f, new C5177l(4294967297L), 1)), (C15457l) null, (C11700l) null, (LinkedHashMap) null, 125))), new C0274l(new C3313l((C4610l) null, new C5487l(new C4693l(3, C16274l.f31850l), AbstractC0532l.admob(0.0f, 400.0f, new C5177l(4294967297L), 1)), (C15457l) null, (C11700l) null, (LinkedHashMap) null, 125)).yandex(AbstractC4523l.billing(null, 3)), null, AbstractC14566l.amazon(-1837024428, new C0541l(interfaceC2262l, abstractC13264l, 27), c6956l9), c6956l9, 1600518, 18);
                    AbstractC13010l.loadAd("x" + c13765l.admob(), null, ((C14370l) c6956l9.isPro(AbstractC16964l.yandex)).yandex.yandex, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l9, 0, 0, 262138);
                    c6956l9.startapp(true);
                } else {
                    c6956l9.m2124else();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                AbstractC15960l.yandex((EnumC3909l) obj6, (C8896l) obj5, (InterfaceC17242l) obj4, (C15578l) obj3, (C6956l) obj, AbstractC0545l.purchase(3457));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                AbstractC14890l.yandex((Function1) obj6, (InterfaceC17242l) obj5, (InterfaceC6347l) obj4, (C16205l) obj3, (C6956l) obj, AbstractC0545l.purchase(100666807));
                return Unit.INSTANCE;
            case 16:
                C11446l c11446l = (C11446l) obj6;
                C6523l c6523l = (C6523l) obj5;
                C2403l c2403l = (C2403l) obj4;
                Function2 function4 = (Function2) obj3;
                C6956l c6956l10 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c6956l10.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean z3 = c11446l.admob;
                    C4346l c4346l2 = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l2, 8.0f, 0.0f, 16.0f, 0.0f, 10);
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(c4346l2, 16.0f);
                    if (!z3) {
                        interfaceC17242lStartapp = interfaceC17242lSmaato;
                    }
                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(interfaceC17242lStartapp, 1.0f);
                    C5062l c5062lYandex2 = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l10, 54);
                    long j5 = c6956l10.f14595continue;
                    int i9 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato5 = c6956l10.smaato();
                    InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l10, interfaceC17242lAmazon3);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l4 = C3438l.loadAd;
                    c6956l10.m2140super();
                    if (c6956l10.f14603switch) {
                        c6956l10.firebase(c16395l4);
                    } else {
                        c6956l10.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l10, c5062lYandex2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l10, interfaceC18556lSmaato5, C3438l.billing);
                    AbstractC8182l.billing(c6956l10, Integer.valueOf(i9), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l10, C3438l.firebase);
                    AbstractC8182l.billing(c6956l10, interfaceC17242lBilling6, C3438l.amazon);
                    if (c11446l.admob) {
                        c6956l10.m2123default(2076631731);
                        AbstractC7470l.billing(c11446l.subs, null, false, null, null, null, AbstractC2438l.loadAd, c6956l10, 1572864, 62);
                        z = false;
                    } else {
                        z = false;
                        c6956l10.m2123default(2069826487);
                    }
                    c6956l10.startapp(z);
                    String str2 = (String) c11446l.smaato.getValue();
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    C11090l c11090l = ((C14370l) c6956l10.isPro(c10707l2)).loadAd.firebase;
                    InterfaceC17242l interfaceC17242lAmazon4 = AbstractC4927l.amazon(AbstractC0019l.crashlytics(AbstractC9966l.billing(c4346l2, c6523l).premium(new C9247l(1.0f, true)), ((C14370l) c6956l10.isPro(c10707l2)).crashlytics.crashlytics), ((C14370l) c6956l10.isPro(c10707l2)).yandex.ads, c9946l);
                    C17253l c17253lAmazon = AbstractC3605l.amazon(8.0f, 0.0f, 0.0f, 0.0f, 14);
                    boolean zAdmob2 = c6956l10.admob(c11446l);
                    Object objM2132native9 = c6956l10.m2132native();
                    if (zAdmob2 || objM2132native9 == c13863l2) {
                        objM2132native9 = new C16931l(17, c11446l);
                        c6956l10.m2147try(objM2132native9);
                    }
                    Function1 function5 = (Function1) objM2132native9;
                    boolean zAdmob3 = c6956l10.admob(c11446l);
                    Object objM2132native10 = c6956l10.m2132native();
                    if (zAdmob3 || objM2132native10 == c13863l2) {
                        objM2132native10 = new C6865l(c11446l, 0);
                        c6956l10.m2147try(objM2132native10);
                    }
                    AbstractC10704l.purchase(str2, function5, (Function0) objM2132native10, interfaceC17242lAmazon4, c11090l, AbstractC2438l.crashlytics, AbstractC2438l.amazon, AbstractC14566l.amazon(-198740621, new C10525l(c11446l, i3), c6956l10), c17253lAmazon, c2403l, c6956l10, 920322048, 0);
                    function4.invoke(c6956l10, 0);
                    c6956l10.startapp(true);
                } else {
                    c6956l10.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C0130l c0130l2 = (C0130l) obj6;
                C9894l c9894l = (C9894l) obj5;
                C9894l c9894l2 = (C9894l) obj4;
                InterfaceC8714l interfaceC8714l7 = (InterfaceC8714l) obj3;
                C6956l c6956l11 = (C6956l) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c6956l11.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    float fYandex = ((C15700l) c6956l11.isPro(AbstractC18678l.yandex)).yandex(c6956l11) + 16.0f;
                    C4346l c4346l3 = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lStartapp2 = AbstractC3605l.startapp(c4346l3, 16.0f, 0.0f, 16.0f, fYandex, 2);
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36034l, c6956l11, 48);
                    long j6 = c6956l11.f14595continue;
                    int i10 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato6 = c6956l11.smaato();
                    InterfaceC17242l interfaceC17242lBilling7 = AbstractC17541l.billing(c6956l11, interfaceC17242lStartapp2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l5 = C3438l.loadAd;
                    c6956l11.m2140super();
                    if (c6956l11.f14603switch) {
                        c6956l11.firebase(c16395l5);
                    } else {
                        c6956l11.m2136protected();
                    }
                    C6415l c6415l5 = C3438l.mopub;
                    AbstractC8182l.billing(c6956l11, c1853lYandex2, c6415l5);
                    C6415l c6415l6 = C3438l.billing;
                    AbstractC8182l.billing(c6956l11, interfaceC18556lSmaato6, c6415l6);
                    Integer numValueOf2 = Integer.valueOf(i10);
                    C6415l c6415l7 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l11, numValueOf2, c6415l7);
                    C11192l c11192l2 = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l11, c11192l2);
                    C6415l c6415l8 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l11, interfaceC17242lBilling7, c6415l8);
                    C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l11, 196608, 31);
                    C1853l c1853lYandex3 = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36046l, c6956l11, 6);
                    long j7 = c6956l11.f14595continue;
                    int i11 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato7 = c6956l11.smaato();
                    InterfaceC17242l interfaceC17242lBilling8 = AbstractC17541l.billing(c6956l11, c4346l3);
                    c6956l11.m2140super();
                    if (c6956l11.f14603switch) {
                        c6956l11.firebase(c16395l5);
                    } else {
                        c6956l11.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l11, c1853lYandex3, c6415l5);
                    AbstractC8182l.billing(c6956l11, interfaceC18556lSmaato7, c6415l6);
                    AbstractC11043l.isPro(i11, c6956l11, c6415l7, c6956l11, c11192l2);
                    AbstractC8182l.billing(c6956l11, interfaceC17242lBilling8, c6415l8);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l11, R.string.themes_apply_changes), AbstractC0080l.amazon(c4346l3, 1.0f), AbstractC13106l.purchase(c6956l11).adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l11).purchase, c6956l11, 48, 0, 130040);
                    C6417l c6417l = c0130l2.f1031l;
                    boolean z4 = c0130l2.f1033l;
                    c0130l2.pro(null, c6417l, c9894l, z4, c0130l2.f1032l || (z4 && ((Boolean) interfaceC8714l7.getValue()).booleanValue()), c6956l11, 0);
                    if (c0130l2.f1033l || c9894l2 != null) {
                        c6956l11.m2123default(-1751310518);
                        AbstractC3383l.yandex(null, null, AbstractC13880l.yandex(AbstractC13106l.purchase(c6956l11).startapp, 0L, 0L, 0L, c6956l11, 0, 14), null, null, AbstractC14566l.amazon(-1840716794, new Cprotected(c0130l2, c9894l2, interfaceC8714l7, 29), c6956l11), c6956l11, 196608, 27);
                        c6956l = c6956l11;
                        c6956l.startapp(false);
                    } else {
                        c6956l11.m2123default(-1755914359);
                        c6956l11.startapp(false);
                        c6956l = c6956l11;
                    }
                    C5062l c5062lYandex3 = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36044l, c6956l, 6);
                    long j8 = c6956l.f14595continue;
                    int i12 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato8 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling9 = AbstractC17541l.billing(c6956l, c4346l3);
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l5);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c5062lYandex3, c6415l5);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato8, c6415l6);
                    AbstractC11043l.isPro(i12, c6956l, c6415l7, c6956l, c11192l2);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling9, c6415l8);
                    boolean zAdmob4 = c6956l.admob(c0130l2);
                    Object objM2132native11 = c6956l.m2132native();
                    if (zAdmob4) {
                        c13863l = c13863l2;
                    } else {
                        c13863l = c13863l2;
                        if (objM2132native11 != c13863l) {
                            f = 16.0f;
                            c0130l = c0130l2;
                        }
                        InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native11;
                        C17253l c17253l = new C17253l(f, f, f, f);
                        C17253l c17253l2 = C12719l.yandex;
                        c6956l2 = c6956l;
                        C13412l c13412lYandex = C12719l.yandex(AbstractC13106l.purchase(c6956l).startapp, AbstractC13106l.purchase(c6956l).adcel, 0L, 0L, c6956l2, 12);
                        if (1.0f <= 0.0d) {
                            AbstractC10440l.yandex("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f2 = Float.MAX_VALUE;
                        } else {
                            f2 = 1.0f;
                        }
                        AbstractC17457l.loadAd((Function0) interfaceC5059l, new C9247l(f2, true), false, AbstractC13106l.billing(c6956l2).crashlytics, c13412lYandex, null, null, c17253l, AbstractC2576l.loadAd, c6956l2, 817889280, 356);
                        C17253l c17253l3 = new C17253l(f, f, f, f);
                        C13412l c13412lYandex2 = C12719l.yandex(AbstractC13106l.purchase(c6956l2).Signature, AbstractC13106l.purchase(c6956l2).license, 0L, 0L, c6956l2, 12);
                        if (1.0f <= 0.0d) {
                            AbstractC10440l.yandex("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f3 = Float.MAX_VALUE;
                        } else {
                            f3 = 1.0f;
                        }
                        C9247l c9247l = new C9247l(f3, true);
                        C6839l c6839l = AbstractC13106l.billing(c6956l2).crashlytics;
                        zAdmob = c6956l2.admob(c0130l) | c6956l2.billing(c9894l);
                        objM2132native = c6956l2.m2132native();
                        if (zAdmob || objM2132native == c13863l) {
                            objM2132native = new Cfinally(c0130l, c9894l, interfaceC8714l7, 26);
                            c6956l2.m2147try(objM2132native);
                        }
                        AbstractC17457l.loadAd((Function0) objM2132native, c9247l, false, c6839l, c13412lYandex2, null, null, c17253l3, AbstractC2576l.crashlytics, c6956l2, 817889280, 356);
                        AbstractC12900l.ads(c6956l2, true, true, true);
                    }
                    c0130l = c0130l2;
                    f = 16.0f;
                    objM2132native11 = new C10832l(0, c0130l, C0130l.class, "dismiss", "dismiss()V", 0, 0, 5);
                    c6956l.m2147try(objM2132native11);
                    InterfaceC5059l interfaceC5059l2 = (InterfaceC5059l) objM2132native11;
                    C17253l c17253l4 = new C17253l(f, f, f, f);
                    C17253l c17253l5 = C12719l.yandex;
                    c6956l2 = c6956l;
                    C13412l c13412lYandex3 = C12719l.yandex(AbstractC13106l.purchase(c6956l).startapp, AbstractC13106l.purchase(c6956l).adcel, 0L, 0L, c6956l2, 12);
                    if (1.0f <= 0.0d) {
                        AbstractC10440l.yandex("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f2 = Float.MAX_VALUE;
                    } else {
                        f2 = 1.0f;
                    }
                    AbstractC17457l.loadAd((Function0) interfaceC5059l2, new C9247l(f2, true), false, AbstractC13106l.billing(c6956l2).crashlytics, c13412lYandex3, null, null, c17253l4, AbstractC2576l.loadAd, c6956l2, 817889280, 356);
                    C17253l c17253l6 = new C17253l(f, f, f, f);
                    C13412l c13412lYandex4 = C12719l.yandex(AbstractC13106l.purchase(c6956l2).Signature, AbstractC13106l.purchase(c6956l2).license, 0L, 0L, c6956l2, 12);
                    if (1.0f <= 0.0d) {
                        AbstractC10440l.yandex("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f3 = Float.MAX_VALUE;
                    } else {
                        f3 = 1.0f;
                    }
                    C9247l c9247l2 = new C9247l(f3, true);
                    C6839l c6839l2 = AbstractC13106l.billing(c6956l2).crashlytics;
                    zAdmob = c6956l2.admob(c0130l) | c6956l2.billing(c9894l);
                    objM2132native = c6956l2.m2132native();
                    if (zAdmob) {
                        objM2132native = new Cfinally(c0130l, c9894l, interfaceC8714l7, 26);
                        c6956l2.m2147try(objM2132native);
                    } else {
                        objM2132native = new Cfinally(c0130l, c9894l, interfaceC8714l7, 26);
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC17457l.loadAd((Function0) objM2132native, c9247l2, false, c6839l2, c13412lYandex4, null, null, c17253l6, AbstractC2576l.crashlytics, c6956l2, 817889280, 356);
                    AbstractC12900l.ads(c6956l2, true, true, true);
                } else {
                    c6956l11.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                InterfaceC8714l interfaceC8714l8 = (InterfaceC8714l) obj6;
                String[] strArr = (String[]) obj5;
                C17310l c17310l = (C17310l) obj4;
                String[] strArr2 = (String[]) obj3;
                C6956l c6956l12 = (C6956l) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c6956l12.m2127for(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) interfaceC8714l8.getValue()).booleanValue();
                    Object objM2132native12 = c6956l12.m2132native();
                    if (objM2132native12 == c13863l2) {
                        objM2132native12 = new C0289l(interfaceC8714l8, i2);
                        c6956l12.m2147try(objM2132native12);
                    }
                    AbstractC16727l.yandex(zBooleanValue, (Function0) objM2132native12, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l12.isPro(AbstractC16964l.yandex)).yandex.ads, c9946l), 0L, null, null, null, 0L, 0.0f, AbstractC14566l.amazon(1170724317, new C11223l(strArr, c17310l, strArr2, interfaceC8714l8, 22), c6956l12), c6956l12, 48, 2040);
                } else {
                    c6956l12.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((Integer) obj2).getClass();
                ((C6111l) obj6).m1945l((InterfaceC6942l) obj5, (InterfaceC6942l) obj4, (InterfaceC6942l) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ((C6111l) obj6).m1950public((InterfaceC17242l) obj5, (Function2) obj4, (Function2) obj3, (C6956l) obj, AbstractC0545l.purchase(433));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                ((C6111l) obj6).m1951return(AbstractC0545l.purchase(433), (C6956l) obj, (InterfaceC17242l) obj3, (Function0) obj5, (Function0) obj4);
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                ((C17003l) obj6).m4252import((CachedPlaylist) obj5, (C15578l) obj4, (InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(49));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                ((C8748l) obj6).m2423break((CachedTrack) obj5, (Function0) obj4, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return yandex(obj, obj2);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return billing(obj, obj2);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((Integer) obj2).getClass();
                ((C0072l) obj6).m270import((C12823l) obj5, (Function1) obj4, (Function1) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return mopub(obj, obj2);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return admob(obj, obj2);
            default:
                InterfaceC17242l interfaceC17242l2 = (InterfaceC17242l) obj6;
                C6523l c6523l2 = (C6523l) obj5;
                C6523l c6523l3 = (C6523l) obj4;
                C13406l c13406l = (C13406l) obj3;
                C6956l c6956l13 = (C6956l) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c6956l13.m2127for(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    AbstractC7039l.amazon(AbstractC6745l.purchase(AbstractC9966l.billing(AbstractC3605l.vip(AbstractC0080l.amazon(interfaceC17242l2, 1.0f), 16.0f, 0.0f, 2), c6523l2), c6523l3), new C7537l(4.0f, true, new C8339l(12)), null, null, 2, 0, AbstractC14566l.amazon(-946030823, new C3091l(c13406l, c6523l3, 18), c6956l13), c6956l13, 1597488, 44);
                } else {
                    c6956l13.m2124else();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C2104l(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f4730l = i2;
        this.f4729l = obj;
        this.f4728l = obj2;
        this.f4732l = obj3;
        this.f4731l = obj4;
    }
}
