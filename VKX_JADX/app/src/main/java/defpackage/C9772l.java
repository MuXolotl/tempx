package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Collections;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍٕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9772l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f19911l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f19912l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19913l;

    public /* synthetic */ C9772l(Object obj, Object obj2, int i) {
        this.f19913l = i;
        this.f19912l = obj;
        this.f19911l = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C9879l c9879l;
        Object c6335l;
        int i = this.f19913l;
        C11485l c11485l = AbstractC8313l.crashlytics;
        C9946l c9946l = AbstractC16837l.yandex;
        Object obj3 = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        int i2 = 3;
        int i3 = 2;
        Object obj4 = this.f19911l;
        Object obj5 = this.f19912l;
        switch (i) {
            case 0:
                C15068l c15068l = (C15068l) obj5;
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) obj4;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c6956l.m2124else();
                } else if (((InterfaceC13238l) interfaceC12244l.getValue()).isEmpty()) {
                    c6956l.m2123default(-2066574236);
                    c15068l.m3922public(c6956l, 0);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(-2067295792);
                    C17253l c17253lLoadAd = AbstractC3605l.loadAd(0.0f, 12.0f, 1);
                    boolean zAdmob = c6956l.admob(c15068l) | c6956l.billing(interfaceC12244l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == obj3) {
                        objM2132native = new C0464l(c15068l, interfaceC12244l, 26);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC16336l.yandex(C4346l.f8873l, null, c17253lLoadAd, null, null, null, false, null, (Function1) objM2132native, c6956l, 390, 506);
                    c6956l.startapp(false);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC3230l.yandex((InterfaceC17242l) obj5, (Function1) obj4, (C6956l) obj, AbstractC0545l.purchase(7));
                break;
            case 2:
                final C4077l c4077l = (C4077l) obj5;
                C10086l c10086l = c4077l.f8383l;
                C6523l c6523l = (C6523l) obj4;
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    float fYandex = ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).yandex(c6956l2) + 16.0f;
                    C4346l c4346l2 = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lSubscription = AbstractC2697l.subscription(AbstractC3605l.startapp(c4346l2, 16.0f, 0.0f, 16.0f, fYandex, 2), AbstractC2697l.purchase);
                    C1853l c1853lYandex = AbstractC1001l.yandex(c11485l, C18450l.f36034l, c6956l2, 48);
                    long j = c6956l2.f14595continue;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lSubscription);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l2, 196608, 31);
                    AbstractC7741l.purchase((String) c4077l.f8378l.getValue(), "CAPTCHA Code", AbstractC0019l.crashlytics(AbstractC0080l.purchase(AbstractC0080l.amazon(c4346l2, 1.0f), 120.0f), AbstractC13106l.billing(c6956l2).crashlytics), new C18627l(AbstractC13106l.purchase(c6956l2).ads), new C18627l(AbstractC13106l.purchase(c6956l2).ads), C4176l.billing, c6956l2, 36912, 6, 31712);
                    AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l2, 16.0f));
                    String str = (String) c10086l.getValue();
                    C3790l c3790l = new C3790l(6, 7, 115);
                    boolean zAdmob2 = c6956l2.admob(c4077l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == obj3) {
                        final int i5 = 0;
                        objM2132native2 = new Function1() { // from class: lٖٗۖ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i6 = i5;
                                C4077l c4077l2 = c4077l;
                                switch (i6) {
                                    case 0:
                                        c4077l2.f8379l = true;
                                        c4077l2.f8380l.invoke(AbstractC8676l.metrica(c4077l2.f8382l, Collections.singletonMap("captcha_key", (String) c4077l2.f8383l.getValue())));
                                        c4077l2.purchase();
                                        break;
                                    default:
                                        c4077l2.f8383l.setValue((String) obj6);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l2.m2147try(objM2132native2);
                    }
                    C6973l c6973l = new C6973l((Function1) objM2132native2, null, 62);
                    C6839l c6839l = AbstractC13106l.billing(c6956l2).crashlytics;
                    C1351l c1351lSubs = C11140l.subs(AbstractC13106l.purchase(c6956l2).ads, AbstractC13106l.purchase(c6956l2).ads, AbstractC13106l.purchase(c6956l2).ads, 0L, c6956l2, 2147483535);
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC9966l.billing(AbstractC0080l.amazon(c4346l2, 1.0f).premium(C14786l.f28910l), c6523l);
                    boolean zAdmob3 = c6956l2.admob(c4077l);
                    Object objM2132native3 = c6956l2.m2132native();
                    if (zAdmob3 || objM2132native3 == obj3) {
                        final int i6 = 1;
                        objM2132native3 = new Function1() { // from class: lٖٗۖ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i7 = i6;
                                C4077l c4077l2 = c4077l;
                                switch (i7) {
                                    case 0:
                                        c4077l2.f8379l = true;
                                        c4077l2.f8380l.invoke(AbstractC8676l.metrica(c4077l2.f8382l, Collections.singletonMap("captcha_key", (String) c4077l2.f8383l.getValue())));
                                        c4077l2.purchase();
                                        break;
                                    default:
                                        c4077l2.f8383l.setValue((String) obj6);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l2.m2147try(objM2132native3);
                    }
                    AbstractC2130l.amazon(str, (Function1) objM2132native3, interfaceC17242lBilling2, false, null, AbstractC7016l.yandex, null, null, null, false, null, c3790l, c6973l, true, 0, 0, c6839l, c1351lSubs, c6956l2, 1572864, 12779520, 1867704);
                    AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l2, 16.0f));
                    boolean zAdmob4 = c6956l2.admob(c4077l);
                    Object objM2132native4 = c6956l2.m2132native();
                    if (zAdmob4 || objM2132native4 == obj3) {
                        Object c2944l = new C2944l(0, c4077l, C4077l.class, "submitCaptcha", "submitCaptcha()V", 0, 0, 13);
                        c6956l2.m2147try(c2944l);
                        objM2132native4 = c2944l;
                    }
                    AbstractC17457l.loadAd((Function0) ((InterfaceC5059l) objM2132native4), AbstractC0080l.amazon(c4346l2, 1.0f), ((String) c10086l.getValue()).length() > 0, AbstractC13106l.billing(c6956l2).crashlytics, null, null, null, new C17253l(16.0f, 16.0f, 16.0f, 16.0f), AbstractC7016l.loadAd, c6956l2, 817889328, 368);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((C17010l) obj5).yandex((InterfaceC17242l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((C12487l) obj5).yandex((InterfaceC17242l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((C10731l) obj5).yandex((InterfaceC17242l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((C13966l) obj5).yandex((InterfaceC17242l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 7:
                InterfaceC3102l interfaceC3102l = (InterfaceC3102l) obj5;
                C5891l c5891l = (C5891l) obj4;
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C17253l c17253l = AbstractC0831l.yandex;
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC1789l.yandex, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l3.isPro(c10707l)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(1588641446, new C6115l(c5891l), c6956l3), null, null, 0.0f, 0.0f, null, AbstractC0831l.amazon(((C14370l) c6956l3.isPro(c10707l)).yandex.startapp, ((C14370l) c6956l3.isPro(c10707l)).yandex.ads, 0L, c6956l3, 28), interfaceC3102l, c6956l3, 3078, 500);
                } else {
                    c6956l3.m2124else();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((C18014l) obj5).m4455abstract((Function0) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 9:
                Function0 function0 = (Function0) obj5;
                Function0 function1 = (Function0) obj4;
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    C0086l c0086l = C18450l.f36040l;
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2);
                    C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, c0086l, c6956l4, 48);
                    long j2 = c6956l4.f14595continue;
                    int i7 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l4.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l4, interfaceC17242lVip);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l4.m2140super();
                    if (c6956l4.f14603switch) {
                        c6956l4.firebase(c16395l2);
                    } else {
                        c6956l4.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l4, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l4, Integer.valueOf(i7), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l4, C3438l.firebase);
                    AbstractC8182l.billing(c6956l4, interfaceC17242lBilling3, C3438l.amazon);
                    AbstractC17457l.mopub(function0, null, false, null, null, null, AbstractC15422l.billing, c6956l4, 805306368, 510);
                    AbstractC9383l.yandex(new C9247l(1.0f, true), c6956l4, 0);
                    AbstractC17457l.loadAd(function1, null, false, null, null, null, null, null, AbstractC15422l.mopub, c6956l4, 805306368, 510);
                    c6956l4.startapp(true);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 10:
                C15578l c15578l = (C15578l) obj5;
                C11636l c11636l = (C11636l) obj4;
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    c15578l.invoke(c11636l, c6956l5, 6);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 11:
                InterfaceC3102l interfaceC3102l2 = (InterfaceC3102l) obj5;
                C12752l c12752l = (C12752l) obj4;
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    C17253l c17253l2 = AbstractC0831l.yandex;
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC7902l.yandex, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l6.isPro(c10707l2)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(1559129380, new C4629l(c12752l, i3, (byte) 0), c6956l6), null, null, 0.0f, 0.0f, ((C15700l) c6956l6.isPro(AbstractC18678l.yandex)).purchase(c6956l6), AbstractC0831l.amazon(((C14370l) c6956l6.isPro(c10707l2)).yandex.startapp, ((C14370l) c6956l6.isPro(c10707l2)).yandex.ads, 0L, c6956l6, 28), interfaceC3102l2, c6956l6, 3078, 244);
                } else {
                    c6956l6.m2124else();
                }
                break;
            case 12:
                InterfaceC3102l interfaceC3102l3 = (InterfaceC3102l) obj5;
                C12221l c12221l = (C12221l) obj4;
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    C17253l c17253l3 = AbstractC0831l.yandex;
                    C10707l c10707l3 = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC6725l.yandex, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l7.isPro(c10707l3)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(-148603516, new C1182l(c12221l, i3, (byte) 0), c6956l7), null, null, 0.0f, 0.0f, ((C15700l) c6956l7.isPro(AbstractC18678l.yandex)).purchase(c6956l7), AbstractC0831l.amazon(((C14370l) c6956l7.isPro(c10707l3)).yandex.startapp, ((C14370l) c6956l7.isPro(c10707l3)).yandex.ads, 0L, c6956l7, 28), interfaceC3102l3, c6956l7, 3078, 244);
                } else {
                    c6956l7.m2124else();
                }
                break;
            case 13:
                ((Integer) obj2).getClass();
                AbstractC5833l.admob((InterfaceC17865l) obj5, (HashSet) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                AbstractC7370l.yandex((InterfaceC12001l) obj5, (C15578l) obj4, (C6956l) obj, AbstractC0545l.purchase(3073));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ((C4456l) obj5).advert((InterfaceC13238l) obj4, (C6956l) obj, AbstractC0545l.purchase(49));
                break;
            case 16:
                C9879l c9879l2 = (C9879l) obj5;
                final C10235l c10235l = (C10235l) obj4;
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zAdmob5 = c6956l8.admob(c9879l2);
                    Object objM2132native5 = c6956l8.m2132native();
                    if (zAdmob5 || objM2132native5 == obj3) {
                        c9879l = c9879l2;
                        c6335l = new C6335l(0, c9879l, C9879l.class, "restoreQueue", "restoreQueue()V", 0, 0, 11);
                        c6956l8.m2147try(c6335l);
                    } else {
                        c9879l = c9879l2;
                        c6335l = objM2132native5;
                    }
                    final byte b = 0;
                    final int i8 = 1;
                    c9879l.yandex(AbstractC14566l.amazon(1271052234, new C9802l(c9879l, i3, b), c6956l8), AbstractC14566l.amazon(459768328, new Function2() { // from class: lؙّؖ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            int i9 = b;
                            C10235l c10235l2 = c10235l;
                            switch (i9) {
                                case 0:
                                    C6956l c6956l9 = (C6956l) obj6;
                                    int iIntValue9 = ((Integer) obj7).intValue();
                                    if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        AbstractC13010l.loadAd(c10235l2.yandex, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l9, 0, 24960, 241662);
                                    } else {
                                        c6956l9.m2124else();
                                    }
                                    break;
                                default:
                                    C6956l c6956l10 = (C6956l) obj6;
                                    int iIntValue10 = ((Integer) obj7).intValue();
                                    if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                                        AbstractC13010l.loadAd(c10235l2.loadAd, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l10, 0, 24960, 241662);
                                    } else {
                                        c6956l10.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, c6956l8), AbstractC14566l.amazon(-2093357273, new Function2() { // from class: lؙّؖ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            int i9 = i8;
                            C10235l c10235l2 = c10235l;
                            switch (i9) {
                                case 0:
                                    C6956l c6956l9 = (C6956l) obj6;
                                    int iIntValue9 = ((Integer) obj7).intValue();
                                    if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                                        AbstractC13010l.loadAd(c10235l2.yandex, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l9, 0, 24960, 241662);
                                    } else {
                                        c6956l9.m2124else();
                                    }
                                    break;
                                default:
                                    C6956l c6956l10 = (C6956l) obj6;
                                    int iIntValue10 = ((Integer) obj7).intValue();
                                    if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                                        AbstractC13010l.loadAd(c10235l2.loadAd, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l10, 0, 24960, 241662);
                                    } else {
                                        c6956l10.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, c6956l8), AbstractC14566l.amazon(-351515578, new C9802l(c9879l, i2, b), c6956l8), (Function0) ((InterfaceC5059l) c6335l), c6956l8, 224694);
                } else {
                    c6956l8.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((Integer) obj2).getClass();
                ((C18449l) obj5).adcel((C12606l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                InterfaceC3102l interfaceC3102l4 = (InterfaceC3102l) obj5;
                C4975l c4975l = (C4975l) obj4;
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c6956l9.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    C17253l c17253l4 = AbstractC0831l.yandex;
                    C10707l c10707l4 = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC15788l.yandex, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l9.isPro(c10707l4)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(-1990479226, new C6489l(c4975l), c6956l9), null, null, 0.0f, 0.0f, ((C15700l) c6956l9.isPro(AbstractC18678l.yandex)).purchase(c6956l9), AbstractC0831l.amazon(((C14370l) c6956l9.isPro(c10707l4)).yandex.startapp, ((C14370l) c6956l9.isPro(c10707l4)).yandex.startapp, 0L, c6956l9, 28), interfaceC3102l4, c6956l9, 3078, 244);
                } else {
                    c6956l9.m2124else();
                }
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((Integer) obj2).getClass();
                ((C7152l) obj5).yandex((C3541l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 20:
                InterfaceC3102l interfaceC3102l5 = (InterfaceC3102l) obj5;
                C13797l c13797l = (C13797l) obj4;
                C6956l c6956l10 = (C6956l) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c6956l10.m2127for(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    C17253l c17253l5 = AbstractC0831l.yandex;
                    C10707l c10707l5 = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(C16050l.loadAd, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l10.isPro(c10707l5)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(2083167693, new C11216l(c13797l), c6956l10), null, null, 0.0f, 0.0f, ((C15700l) c6956l10.isPro(AbstractC18678l.yandex)).purchase(c6956l10), AbstractC0831l.amazon(((C14370l) c6956l10.isPro(c10707l5)).yandex.startapp, ((C14370l) c6956l10.isPro(c10707l5)).yandex.ads, 0L, c6956l10, 28), interfaceC3102l5, c6956l10, 3078, 244);
                } else {
                    c6956l10.m2124else();
                }
                break;
            case 21:
                C8948l c8948l = (C8948l) obj5;
                C15308l c15308l = (C15308l) obj4;
                C6956l c6956l11 = (C6956l) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c6956l11.m2127for(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    float fYandex2 = ((C15700l) c6956l11.isPro(AbstractC18678l.yandex)).yandex(c6956l11) + 16.0f;
                    C4346l c4346l3 = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l3, 16.0f, 0.0f, 16.0f, fYandex2, 2);
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(c11485l, C18450l.f36034l, c6956l11, 48);
                    long j3 = c6956l11.f14595continue;
                    int i9 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l11.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l11, interfaceC17242lStartapp);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l11.m2140super();
                    if (c6956l11.f14603switch) {
                        c6956l11.firebase(c16395l3);
                    } else {
                        c6956l11.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l11, c1853lYandex2, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l11, interfaceC18556lSmaato3, c6415l2);
                    Integer numValueOf = Integer.valueOf(i9);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l11, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l11, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l11, interfaceC17242lBilling4, c6415l4);
                    C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l11, 196608, 31);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l11, R.string.vkx_hold_on), AbstractC0080l.amazon(c4346l3, 1.0f), AbstractC13106l.purchase(c6956l11).adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l11).purchase, c6956l11, 48, 0, 130040);
                    AbstractC9334l.yandex(c6956l11, AbstractC0080l.purchase(c4346l3, 16.0f));
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l11, R.string.exp_no_crypt_dialog_text), AbstractC0080l.amazon(c4346l3, 1.0f), AbstractC13106l.purchase(c6956l11).subscription, 0L, null, null, null, 0L, new C10258l(5), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l11).firebase, c6956l11, 48, 0, 130040);
                    AbstractC9334l.yandex(c6956l11, AbstractC0080l.purchase(c4346l3, 8.0f));
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l11, R.string.exp_no_crypt_label), null, AbstractC13106l.purchase(c6956l11).subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l11).smaato, c6956l11, 0, 0, 131066);
                    AbstractC9334l.yandex(c6956l11, AbstractC0080l.purchase(c4346l3, 16.0f));
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l3, 1.0f);
                    C5062l c5062lYandex2 = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36044l, c6956l11, 6);
                    long j4 = c6956l11.f14595continue;
                    int i10 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l11.smaato();
                    InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l11, interfaceC17242lAmazon);
                    c6956l11.m2140super();
                    if (c6956l11.f14603switch) {
                        c6956l11.firebase(c16395l3);
                    } else {
                        c6956l11.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l11, c5062lYandex2, c6415l);
                    AbstractC8182l.billing(c6956l11, interfaceC18556lSmaato4, c6415l2);
                    AbstractC11043l.isPro(i10, c6956l11, c6415l3, c6956l11, c11192l);
                    AbstractC8182l.billing(c6956l11, interfaceC17242lBilling5, c6415l4);
                    boolean zAdmob6 = c6956l11.admob(c8948l);
                    Object objM2132native6 = c6956l11.m2132native();
                    if (zAdmob6 || objM2132native6 == obj3) {
                        objM2132native6 = new C6335l(0, c8948l, C8948l.class, "dismiss", "dismiss()V", 0, 0, 18);
                        c6956l11.m2147try(objM2132native6);
                    }
                    InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native6;
                    C17253l c17253l6 = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    C17253l c17253l7 = C12719l.yandex;
                    C13412l c13412lYandex = C12719l.yandex(AbstractC13106l.purchase(c6956l11).ads, AbstractC13106l.purchase(c6956l11).adcel, 0L, 0L, c6956l11, 12);
                    if (1.0f <= 0.0d) {
                        AbstractC10440l.yandex("invalid weight; must be greater than zero");
                    }
                    AbstractC17457l.loadAd((Function0) interfaceC5059l, new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC13106l.billing(c6956l11).crashlytics, c13412lYandex, null, null, c17253l6, AbstractC0079l.yandex, c6956l11, 817889280, 356);
                    C17253l c17253l8 = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    if (1.0f <= 0.0d) {
                        AbstractC10440l.yandex("invalid weight; must be greater than zero");
                    }
                    int i11 = 1;
                    C9247l c9247l = new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    C6839l c6839l2 = AbstractC13106l.billing(c6956l11).crashlytics;
                    boolean z = c15308l.admob() == 0;
                    Object objM2132native7 = c6956l11.m2132native();
                    if (objM2132native7 == obj3) {
                        objM2132native7 = new C3321l(i11);
                        c6956l11.m2147try(objM2132native7);
                    }
                    AbstractC17457l.loadAd((Function0) objM2132native7, c9247l, z, c6839l2, null, null, null, c17253l8, AbstractC14566l.amazon(-1759475298, new C16769l(c15308l, 0), c6956l11), c6956l11, 817889286, 368);
                    c6956l11.startapp(true);
                    c6956l11.startapp(true);
                } else {
                    c6956l11.m2124else();
                }
                break;
            case 22:
                ((Integer) obj2).getClass();
                ((C1050l) obj5).m778import((String) obj4, (C6956l) obj, AbstractC0545l.purchase(71));
                break;
            case 23:
                InterfaceC3102l interfaceC3102l6 = (InterfaceC3102l) obj5;
                C1050l c1050l = (C1050l) obj4;
                C6956l c6956l12 = (C6956l) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (c6956l12.m2127for(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    C17253l c17253l9 = AbstractC0831l.yandex;
                    C10707l c10707l6 = AbstractC16964l.yandex;
                    AbstractC18079l.loadAd(AbstractC3292l.yandex, AbstractC4927l.amazon(c4346l, ((C14370l) c6956l12.isPro(c10707l6)).yandex.startapp, c9946l), null, AbstractC14566l.amazon(-409177459, new C10862l(c1050l), c6956l12), null, null, 0.0f, 0.0f, ((C15700l) c6956l12.isPro(AbstractC18678l.yandex)).purchase(c6956l12), AbstractC0831l.amazon(((C14370l) c6956l12.isPro(c10707l6)).yandex.startapp, ((C14370l) c6956l12.isPro(c10707l6)).yandex.ads, 0L, c6956l12, 28), interfaceC3102l6, c6956l12, 3078, 244);
                } else {
                    c6956l12.m2124else();
                }
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((Integer) obj2).getClass();
                ((C12285l) obj5).yandex((C10038l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((Integer) obj2).getClass();
                ((C6147l) obj5).yandex((C10809l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                InterfaceC15209l interfaceC15209l = (InterfaceC15209l) obj5;
                InterfaceC5912l interfaceC5912l = (InterfaceC5912l) obj4;
                C6956l c6956l13 = (C6956l) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (c6956l13.m2127for(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    boolean zBilling = c6956l13.billing(interfaceC15209l);
                    Object objM2132native8 = c6956l13.m2132native();
                    if (zBilling || objM2132native8 == obj3) {
                        objM2132native8 = AbstractC8020l.mopub(new C6335l(0, interfaceC15209l, InterfaceC15209l.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 0, 21));
                        c6956l13.m2147try(objM2132native8);
                    }
                    AbstractC10216l.yandex(interfaceC5912l, (C2863l) ((InterfaceC12244l) objM2132native8).getValue(), c6956l13, 0);
                } else {
                    c6956l13.m2124else();
                }
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((Integer) obj2).getClass();
                AbstractC10216l.yandex((InterfaceC5912l) obj5, (C2863l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((Integer) obj2).getClass();
                ((C5120l) obj5).yandex((C15351l) obj4, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                Function1 function2 = (Function1) obj5;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj4;
                C6956l c6956l14 = (C6956l) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (c6956l14.m2127for(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    boolean zBilling2 = c6956l14.billing(function2);
                    Object objM2132native9 = c6956l14.m2132native();
                    if (zBilling2 || objM2132native9 == obj3) {
                        objM2132native9 = new C13023l(function2, interfaceC8714l, 0);
                        c6956l14.m2147try(objM2132native9);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native9, null, ((C0639l) interfaceC8714l.getValue()).yandex.f7563l.length() > 0, null, null, null, AbstractC5103l.firebase, c6956l14, 805306368, 506);
                } else {
                    c6956l14.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C9772l(Object obj, Object obj2, int i, int i2) {
        this.f19913l = i2;
        this.f19912l = obj;
        this.f19911l = obj2;
    }
}
