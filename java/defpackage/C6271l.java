package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؙؗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6271l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C0483l f13229l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C14267l f13230l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13231l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f13232l;

    public /* synthetic */ C6271l(C14267l c14267l, InterfaceC8714l interfaceC8714l, C0483l c0483l) {
        this.f13231l = 2;
        this.f13230l = c14267l;
        this.f13232l = interfaceC8714l;
        this.f13229l = c0483l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        C9879l c9879l;
        int i2 = this.f13231l;
        C4346l c4346l = C4346l.f8873l;
        C0483l c0483l = this.f13229l;
        C13863l c13863l = C1867l.yandex;
        InterfaceC8714l interfaceC8714l = this.f13232l;
        C14267l c14267l = this.f13230l;
        switch (i2) {
            case 0:
                C9879l c9879l2 = c0483l.yandex;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (c14267l.admob) {
                        c6956l.m2123default(1202143730);
                    } else {
                        c6956l.m2123default(-2038757087);
                        Boolean bool = c14267l.yandex.billing;
                        if (bool == null) {
                            c6956l.m2123default(1223101155);
                        } else {
                            c6956l.m2123default(1223101156);
                            boolean zBooleanValue = bool.booleanValue();
                            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0019l.crashlytics(c4346l, AbstractC7497l.yandex);
                            C2403l c2403lPurchase = AbstractC0676l.purchase(c6956l);
                            boolean zAdmob = c6956l.admob(c9879l2);
                            Object objM2132native = c6956l.m2132native();
                            if (zAdmob || objM2132native == c13863l) {
                                Cconst cconst = new Cconst(0, c9879l2, C9879l.class, "onTrackLikedTapped", "onTrackLikedTapped()V", 0, 0, 16);
                                c6956l.m2147try(cconst);
                                objM2132native = cconst;
                            }
                            InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native;
                            boolean zAdmob2 = c6956l.admob(c9879l2);
                            Object objM2132native2 = c6956l.m2132native();
                            if (zAdmob2 || objM2132native2 == c13863l) {
                                objM2132native2 = new Cconst(0, c9879l2, C9879l.class, "onTrackLikedLongTapped", "onTrackLikedLongTapped()V", 0, 0, 17);
                                c6956l.m2147try(objM2132native2);
                            }
                            InterfaceC17242l interfaceC17242lAmazon = AbstractC9151l.amazon(interfaceC17242lCrashlytics, AbstractC11999l.purchase(c6956l, R.string.action_audio_addtoplaylist), (Function0) ((InterfaceC5059l) objM2132native2), c2403lPurchase, (Function0) interfaceC5059l, 103);
                            long jYandex = AbstractC9027l.yandex(40.0f, 40.0f);
                            C11205l c11205l = AbstractC0080l.yandex;
                            InterfaceC17242l interfaceC17242lFirebase = AbstractC0080l.firebase(interfaceC17242lAmazon, C2261l.loadAd(jYandex), C2261l.yandex(jYandex));
                            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
                            long j = c6956l.f14595continue;
                            int i3 = (int) (j ^ (j >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lFirebase);
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
                            AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
                            AbstractC8182l.purchase(c6956l, C3438l.firebase);
                            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                            boolean z = ((C18554l) interfaceC8714l.getValue()).f36218l;
                            if (zBooleanValue) {
                                i = z ? R.drawable.ic_like_36 : R.drawable.ic_check;
                            } else {
                                i = z ? R.drawable.ic_like_outline_36 : R.drawable.ic_add;
                            }
                            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(i, 0, c6956l), AbstractC11999l.purchase(c6956l, zBooleanValue ? R.string.now_playing_toolbox_like_remove_track : R.string.now_playing_toolbox_like_track), AbstractC0080l.isPro(c4346l, 28.0f), 0L, c6956l, 392, 8);
                            c6956l.startapp(true);
                        }
                        c6956l.startapp(false);
                    }
                    c6956l.startapp(false);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C0483l c0483l2 = this.f13229l;
                C9879l c9879l3 = c0483l2.yandex;
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36046l, c6956l2, 6);
                    long j2 = c6956l2.f14595continue;
                    int i4 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l2);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, C3438l.amazon);
                    EnumC12501l enumC12501l = c14267l.purchase;
                    boolean z2 = c14267l.billing;
                    boolean z3 = c14267l.mopub;
                    boolean z4 = c14267l.crashlytics == EnumC11447l.f23032l;
                    boolean z5 = c14267l.admob;
                    boolean z6 = c14267l.subs;
                    c0483l2.crashlytics(AbstractC0080l.amazon(c4346l, 1.0f), enumC12501l, z2, z3, z4, z5, z6, (z6 || z5 || c14267l.isPro) ? false : true, c14267l.remoteconfig, c6956l2, 6);
                    if (((C18554l) interfaceC8714l.getValue()).f36221l) {
                        c6956l2.m2123default(-1399195154);
                        int i5 = c14267l.vip;
                        int i6 = c14267l.metrica;
                        boolean zAdmob3 = c6956l2.admob(c9879l3);
                        Object objM2132native3 = c6956l2.m2132native();
                        if (zAdmob3 || objM2132native3 == c13863l) {
                            c9879l = c9879l3;
                            C2176l c2176l = new C2176l(1, c9879l, C9879l.class, "setVolume", "setVolume(I)V", 0, 0, 11);
                            c6956l2.m2147try(c2176l);
                            objM2132native3 = c2176l;
                        } else {
                            c9879l = c9879l3;
                        }
                        InterfaceC5059l interfaceC5059l2 = (InterfaceC5059l) objM2132native3;
                        boolean zAdmob4 = c6956l2.admob(c9879l);
                        Object objM2132native4 = c6956l2.m2132native();
                        if (zAdmob4 || objM2132native4 == c13863l) {
                            Cconst cconst2 = new Cconst(0, c9879l, C9879l.class, "volumeDown", "volumeDown()V", 0, 0, 14);
                            c6956l2.m2147try(cconst2);
                            objM2132native4 = cconst2;
                        }
                        InterfaceC5059l interfaceC5059l3 = (InterfaceC5059l) objM2132native4;
                        boolean zAdmob5 = c6956l2.admob(c9879l);
                        Object objM2132native5 = c6956l2.m2132native();
                        if (zAdmob5 || objM2132native5 == c13863l) {
                            Cconst cconst3 = new Cconst(0, c9879l, C9879l.class, "volumeUp", "volumeUp()V", 0, 0, 15);
                            c6956l2.m2147try(cconst3);
                            objM2132native5 = cconst3;
                        }
                        AbstractC11173l.yandex(i5, i6, (Function0) interfaceC5059l3, (Function1) interfaceC5059l2, (Function0) ((InterfaceC5059l) objM2132native5), AbstractC0080l.amazon(c4346l, 1.0f), c6956l2, 196608);
                    } else {
                        c6956l2.m2123default(-1417979201);
                    }
                    c6956l2.startapp(false);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (((C18554l) interfaceC8714l.getValue()).f36223l || c14267l.admob) {
                        c6956l3.m2123default(-1860926799);
                    } else {
                        c6956l3.m2123default(1880378014);
                        Boolean bool2 = c14267l.yandex.mopub;
                        if (bool2 == null) {
                            c6956l3.m2123default(-1837759415);
                        } else {
                            c6956l3.m2123default(-1837759414);
                            boolean zBooleanValue2 = bool2.booleanValue();
                            C9879l c9879l4 = c0483l.yandex;
                            boolean zAdmob6 = c6956l3.admob(c9879l4);
                            Object objM2132native6 = c6956l3.m2132native();
                            if (zAdmob6 || objM2132native6 == c13863l) {
                                Cconst cconst4 = new Cconst(0, c9879l4, C9879l.class, "onTrackDislikedTapped", "onTrackDislikedTapped()V", 0, 0, 18);
                                c6956l3.m2147try(cconst4);
                                objM2132native6 = cconst4;
                            }
                            AbstractC7470l.billing((Function0) ((InterfaceC5059l) objM2132native6), null, false, null, AbstractC0676l.purchase(c6956l3), null, AbstractC14566l.amazon(-765072147, new C4584l(zBooleanValue2, 0), c6956l3), c6956l3, 1572864, 46);
                        }
                        c6956l3.startapp(false);
                    }
                    c6956l3.startapp(false);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C6271l(C14267l c14267l, C0483l c0483l, InterfaceC8714l interfaceC8714l, int i) {
        this.f13231l = i;
        this.f13230l = c14267l;
        this.f13229l = c0483l;
        this.f13232l = interfaceC8714l;
    }
}
