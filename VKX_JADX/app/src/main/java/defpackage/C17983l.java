package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;

/* JADX INFO: renamed from: l٘ٗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17983l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f35158l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f35159l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35160l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f35161l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f35162l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f35163l;

    public /* synthetic */ C17983l(C6111l c6111l, String str, int i, Function0 function0, Function2 function2, int i2) {
        this.f35160l = 11;
        this.f35158l = c6111l;
        this.f35162l = str;
        this.f35159l = i;
        this.f35161l = function0;
        this.f35163l = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f35160l;
        Object obj3 = this.f35162l;
        int i2 = this.f35159l;
        Object obj4 = this.f35163l;
        Object obj5 = this.f35161l;
        Object obj6 = this.f35158l;
        switch (i) {
            case 0:
                final C0483l c0483l = (C0483l) obj6;
                C9879l c9879l = c0483l.yandex;
                final InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj3;
                final C14267l c14267l = (C14267l) obj5;
                final InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj4;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = 0;
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(c4346l, 1.0f);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j = c6956l.f14595continue;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lCrashlytics);
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
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    if (((C18554l) interfaceC8714l.getValue()).f36225l) {
                        c6956l.m2123default(1248127542);
                        AbstractC15042l.remoteconfig((C13450l) ((C10086l) c9879l.startapp.f23357l).getValue(), c6956l, 0);
                        if (AbstractC4115l.loadAd(c6956l)) {
                            c6956l.m2123default(1237358328);
                        } else {
                            c6956l.m2123default(1248270173);
                            AbstractC3308l.amazon(c0483l.vip() == EnumC6302l.f13255l, AbstractC0080l.crashlytics(c4346l, 1.0f), AbstractC6363l.billing(i2, false), AbstractC6363l.mopub(i2, true), null, AbstractC14566l.amazon(-2084959876, new C7442l(interfaceC8714l, c0483l, 2), c6956l), c6956l, 196656, 16);
                            c6956l = c6956l;
                        }
                        c6956l.startapp(i3);
                        c6956l.startapp(i3);
                    } else {
                        i3 = 0;
                        c6956l.m2123default(1250357434);
                        int iOrdinal = ((C18554l) interfaceC8714l.getValue()).f36227l.ordinal();
                        if (iOrdinal != 0) {
                            C9946l c9946l = AbstractC16837l.yandex;
                            if (iOrdinal != 1) {
                                InterfaceC14029l interfaceC14029l = null;
                                if (iOrdinal != 2) {
                                    int i5 = 3;
                                    C13863l c13863l = C1867l.yandex;
                                    if (iOrdinal == 3) {
                                        c6956l.m2123default(1252142910);
                                        Object objM2132native = c6956l.m2132native();
                                        if (objM2132native == c13863l) {
                                            objM2132native = AbstractC8020l.smaato(null);
                                            c6956l.m2147try(objM2132native);
                                        }
                                        InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) objM2132native;
                                        C18572l c18572l = (C18572l) interfaceC8714l2.getValue();
                                        C14267l c14267lFirebase = c9879l.firebase();
                                        boolean zAdmob = c6956l.admob(c0483l);
                                        Object objM2132native2 = c6956l.m2132native();
                                        if (zAdmob || objM2132native2 == c13863l) {
                                            objM2132native2 = new C1353l(c0483l, interfaceC8714l2, interfaceC14029l, i3);
                                            c6956l.m2147try(objM2132native2);
                                        }
                                        AbstractC12311l.purchase(c18572l, c14267lFirebase, (Function2) objM2132native2, c6956l);
                                        C18572l c18572l2 = (C18572l) interfaceC8714l2.getValue();
                                        C13450l c13450l = (C13450l) ((C10086l) c9879l.startapp.f23357l).getValue();
                                        boolean zAdmob2 = c6956l.admob(c0483l);
                                        Object objM2132native3 = c6956l.m2132native();
                                        if (zAdmob2 || objM2132native3 == c13863l) {
                                            objM2132native3 = new C1353l(c0483l, interfaceC8714l2, interfaceC14029l, 1);
                                            c6956l.m2147try(objM2132native3);
                                        }
                                        AbstractC12311l.purchase(c18572l2, c13450l, (Function2) objM2132native3, c6956l);
                                        InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(AbstractC0080l.crashlytics(c4346l, 1.0f), C9735l.loadAd(0.3f, C9735l.loadAd), c9946l);
                                        boolean zAdmob3 = c6956l.admob(c0483l);
                                        Object objM2132native4 = c6956l.m2132native();
                                        if (zAdmob3 || objM2132native4 == c13863l) {
                                            objM2132native4 = new C0464l(c0483l, interfaceC8714l2, 1);
                                            c6956l.m2147try(objM2132native4);
                                        }
                                        Function1 function1 = (Function1) objM2132native4;
                                        Object objM2132native5 = c6956l.m2132native();
                                        if (objM2132native5 == c13863l) {
                                            objM2132native5 = new C9922l(interfaceC8714l2, i3);
                                            c6956l.m2147try(objM2132native5);
                                        }
                                        Function1 function2 = (Function1) objM2132native5;
                                        Object objM2132native6 = c6956l.m2132native();
                                        if (objM2132native6 == c13863l) {
                                            objM2132native6 = new C13206l(2);
                                            c6956l.m2147try(objM2132native6);
                                        }
                                        AbstractC11397l.loadAd(function1, interfaceC17242lAmazon, function2, (Function1) objM2132native6, c6956l, 27696, 4);
                                        c6956l.startapp(false);
                                        Unit unit = Unit.INSTANCE;
                                    } else {
                                        if (iOrdinal != 4) {
                                            throw AbstractC12900l.billing(1425808096, c6956l, false);
                                        }
                                        c6956l.m2123default(1254015682);
                                        InterfaceC17242l interfaceC17242lCrashlytics2 = AbstractC0080l.crashlytics(c4346l, 1.0f);
                                        Object objM2132native7 = c6956l.m2132native();
                                        if (objM2132native7 == c13863l) {
                                            objM2132native7 = new C13206l(i5);
                                            c6956l.m2147try(objM2132native7);
                                        }
                                        Function1 function3 = (Function1) objM2132native7;
                                        boolean zAdmob4 = c6956l.admob(c0483l);
                                        Object objM2132native8 = c6956l.m2132native();
                                        if (zAdmob4 || objM2132native8 == c13863l) {
                                            objM2132native8 = new C0742l(c0483l, i3);
                                            c6956l.m2147try(objM2132native8);
                                        }
                                        AbstractC11397l.yandex(function3, interfaceC17242lCrashlytics2, (Function1) objM2132native8, c6956l, 54);
                                        c6956l.startapp(false);
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                } else {
                                    c6956l.m2123default(1250953688);
                                    AbstractC18037l.crashlytics(new C9735l(((C9735l) ((C10086l) c9879l.startapp.f23360l).getValue()).yandex), null, AbstractC0532l.subs(750, 6, null), "", AbstractC15290l.yandex, c6956l, 28032, 2);
                                    c6956l = c6956l;
                                    c6956l.startapp(false);
                                    Unit unit3 = Unit.INSTANCE;
                                }
                            } else {
                                c6956l.m2123default(1250574465);
                                AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0080l.crashlytics(c4346l, 1.0f), ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.vip, c9946l), c6956l, 0);
                                c6956l.startapp(false);
                                Unit unit4 = Unit.INSTANCE;
                            }
                        } else {
                            c6956l.m2123default(1250370330);
                            AbstractC15042l.remoteconfig((C13450l) ((C10086l) c9879l.startapp.f23357l).getValue(), c6956l, 0);
                            c6956l.startapp(false);
                            Unit unit5 = Unit.INSTANCE;
                        }
                        c6956l.startapp(false);
                    }
                    final boolean zLoadAd = AbstractC4115l.loadAd(c6956l);
                    C6956l c6956l2 = c6956l;
                    AbstractC9033l.yandex(c0483l.vip(), AbstractC14566l.amazon(-161109836, new C15881l(c14267l, c0483l, interfaceC8714l, i3), c6956l), AbstractC14566l.amazon(-82988747, new Function4() { // from class: lؚؚؔ
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                            C14632l c14632l = (C14632l) obj7;
                            InterfaceC9085l interfaceC9085l = (InterfaceC9085l) obj8;
                            C6956l c6956l3 = (C6956l) obj9;
                            ((Integer) obj10).getClass();
                            C14267l c14267l2 = c14267l;
                            String str = c14267l2.yandex.yandex;
                            C0483l c0483l2 = c0483l;
                            C9879l c9879l2 = c0483l2.yandex;
                            InterfaceC0582l interfaceC0582lYandex = c9879l2.ads.yandex();
                            C12362l c12362l = c9879l2.ads;
                            C0059l c0059l = new C0059l(0, 0, C12362l.class, c12362l, "currentPlayingLine", "getCurrentPlayingLine()I");
                            C0059l c0059l2 = new C0059l(0, 1, C12362l.class, c12362l, "currentInterludeProgress", "getCurrentInterludeProgress()I");
                            boolean zAdmob5 = c6956l3.admob(c12362l);
                            Object objM2132native9 = c6956l3.m2132native();
                            C13863l c13863l2 = C1867l.yandex;
                            if (zAdmob5 || objM2132native9 == c13863l2) {
                                objM2132native9 = new C2176l(1, c12362l, C12362l.class, "dispatchNavigatingToLine", "dispatchNavigatingToLine(I)V", 0, 0, 6);
                                c6956l3.m2147try(objM2132native9);
                            }
                            Function1 function4 = (Function1) ((InterfaceC5059l) objM2132native9);
                            boolean zAdmob6 = c6956l3.admob(c0483l2);
                            Object objM2132native10 = c6956l3.m2132native();
                            if (zAdmob6 || objM2132native10 == c13863l2) {
                                objM2132native10 = new C0742l(c0483l2, 1);
                                c6956l3.m2147try(objM2132native10);
                            }
                            AbstractC8007l.crashlytics(str, interfaceC0582lYandex, c0059l, c0059l2, function4, (Function1) objM2132native10, AbstractC14566l.amazon(1796601440, new C2104l(c14267l2, c0483l2, c14632l, interfaceC9085l, 0), c6956l3), AbstractC14566l.amazon(2028269951, new C8076l(0, c0483l2, interfaceC2262l, interfaceC8714l, c14267l2, zLoadAd), c6956l3), AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), c6956l3, 114819072);
                            return Unit.INSTANCE;
                        }
                    }, c6956l), AbstractC14566l.amazon(-4867658, new C11050l(c14267l, c0483l, i3), c6956l), AbstractC2697l.subscription(AbstractC2697l.subscription(AbstractC3605l.startapp(AbstractC0080l.crashlytics(c4346l, 1.0f), zLoadAd ? 80.0f : 0.0f, 0.0f, 0.0f, zLoadAd ? 0.0f : 80.0f, 6), AbstractC2697l.crashlytics), AbstractC2697l.billing), c6956l2, 3504);
                    boolean zBooleanValue = ((Boolean) c0483l.purchase.getValue()).booleanValue();
                    C15578l c15578lAmazon = AbstractC14566l.amazon(-2030598708, new C16270l(c14267l, c0483l, i3), c6956l2);
                    C15578l c15578lAmazon2 = AbstractC14566l.amazon(1697456555, new C16693l(c0483l, zLoadAd, c14267l), c6956l2);
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                    C14855l c14855l = zLoadAd ? C18450l.f36035l : C18450l.f36042l;
                    C16170l c16170l = C16170l.yandex;
                    c0483l.isPro(zBooleanValue, c15578lAmazon, c15578lAmazon2, AbstractC2697l.subscription(c16170l.yandex(interfaceC17242lAmazon2, c14855l), AbstractC2697l.loadAd), c6956l2, 432);
                    C5795l.yandex((InterfaceC3082l) ((C10086l) c9879l.adcel.f20589l).getValue(), AbstractC2697l.subscription(c16170l.yandex(c4346l, C18450l.f36017l), AbstractC2697l.amazon), c6956l2, i3);
                    c6956l2.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0850l.amazon((Function0) obj6, (InterfaceC17242l) obj3, (C9401l) obj5, (C15578l) obj4, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC0496l.yandex((Function0) obj6, (List) obj3, (List) obj5, (CatalogArtist) obj4, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ((C5766l) obj6).m1850finally((Function0) obj3, (C7968l) obj5, (Function1) obj4, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC0133l.billing((C15178l) obj6, (InterfaceC8714l) obj3, (InterfaceC17242l) obj5, (C15578l) obj4, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ((C15578l) obj6).admob(this.f35162l, this.f35161l, this.f35163l, (C6956l) obj, AbstractC0545l.purchase(i2) | 1);
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ((C17136l) obj6).m4268abstract((C11359l) obj3, (Function0) obj5, (Function0) obj4, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                ((C17136l) obj6).m4273this((C11359l) obj3, (Function0) obj5, (Function1) obj4, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC17122l.yandex((Boolean) obj6, this.f35162l, (InterfaceC3177l) obj5, (Function1) obj4, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                ((C11655l) obj6).m3182this(AbstractC0545l.purchase(i2 | 1), (C6956l) obj, (InterfaceC17242l) obj4, (Function0) obj3, (Function0) obj5);
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                ((C11749l) obj6).advert((C18023l) obj3, (EnumC2546l) obj5, (String) obj4, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ((C6111l) obj6).m1952this((String) obj3, this.f35159l, (Function0) obj5, (Function2) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ((C0675l) obj6).m665abstract((C8147l) obj3, (Function0) obj5, (Function0) obj4, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C17983l(C0483l c0483l, int i, InterfaceC8714l interfaceC8714l, C14267l c14267l, InterfaceC2262l interfaceC2262l) {
        this.f35160l = 0;
        this.f35158l = c0483l;
        this.f35159l = i;
        this.f35162l = interfaceC8714l;
        this.f35161l = c14267l;
        this.f35163l = interfaceC2262l;
    }

    public /* synthetic */ C17983l(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f35160l = i2;
        this.f35158l = obj;
        this.f35162l = obj2;
        this.f35161l = obj3;
        this.f35163l = obj4;
        this.f35159l = i;
    }
}
