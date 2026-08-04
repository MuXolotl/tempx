package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٜٗۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17408l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C10086l f33914l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f33915l;

    public C17408l() {
        super(0);
        Boolean bool = Boolean.FALSE;
        this.f33914l = AbstractC8020l.smaato(bool);
        this.f33915l = AbstractC8020l.smaato(bool);
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m4323abstract(int i, C6956l c6956l, boolean z) {
        c6956l.m2133new(166154558);
        int i2 = (c6956l.mopub(z) ? 4 : 2) | i;
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(AbstractC0080l.purchase(C4346l.f8873l, 200.0f), 1.0f);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC3383l.yandex(interfaceC17242lAmazon, ((C14370l) c6956l.isPro(c10707l)).crashlytics.purchase, AbstractC13880l.yandex(((C14370l) c6956l.isPro(c10707l)).yandex.ads, 0L, 0L, 0L, c6956l, 0, 14), null, null, AbstractC14566l.amazon(-1814257652, new C0849l(z, i3), c6956l), c6956l, 196614, 24);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C7371l(this, z, i, 8);
        }
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m4324finally(boolean z) {
        this.f33915l.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m4325import(final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, C6956l c6956l, final int i) {
        long j;
        long j2;
        long j3;
        c6956l.m2133new(943198480);
        int i2 = i | (c6956l.mopub(z) ? 4 : 2) | (c6956l.mopub(z2) ? 32 : 16) | (c6956l.mopub(z3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.mopub(z4) ? 2048 : 1024) | (c6956l.mopub(z5) ? 16384 : 8192);
        if (c6956l.m2127for(i2 & 1, (i2 & 9363) != 9362)) {
            final C6839l c6839lYandex = AbstractC7497l.yandex(((C14467l) AbstractC16245l.yandex(z2 ? 16.0f : 0.0f, AbstractC0532l.admob(0.0f, 200.0f, null, 5), null, c6956l, 48, 12).getValue()).f28331l);
            if (z) {
                c6956l.m2123default(175659262);
                j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
            } else {
                c6956l.m2123default(175660727);
                j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.startapp;
            }
            c6956l.startapp(false);
            final InterfaceC12244l interfaceC12244lYandex = AbstractC0703l.yandex(j, AbstractC0532l.admob(0.0f, 200.0f, null, 5), null, null, c6956l, 48, 12);
            if (z) {
                c6956l.m2123default(175668727);
                j2 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.startapp;
            } else {
                c6956l.m2123default(175667262);
                j2 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
            }
            c6956l.startapp(false);
            final InterfaceC12244l interfaceC12244lYandex2 = AbstractC0703l.yandex(j2, AbstractC0532l.admob(0.0f, 200.0f, null, 5), null, null, c6956l, 48, 12);
            final InterfaceC12244l interfaceC12244lLoadAd = AbstractC16245l.loadAd(z ? 0.0f : 1.0f, AbstractC0532l.admob(0.0f, 200.0f, null, 5), null, null, c6956l, 48, 28);
            if (z5) {
                c6956l.m2123default(175679739);
                c6956l.startapp(false);
                j3 = C9735l.isPro;
            } else {
                c6956l.m2123default(175681118);
                long j4 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.premium;
                c6956l.startapp(false);
                j3 = j4;
            }
            final InterfaceC12244l interfaceC12244lYandex3 = AbstractC0703l.yandex(j3, AbstractC0532l.admob(0.0f, 200.0f, null, 5), null, null, c6956l, 48, 12);
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(AbstractC0080l.purchase(C4346l.f8873l, 200.0f), 1.0f);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC3383l.yandex(interfaceC17242lAmazon, ((C14370l) c6956l.isPro(c10707l)).crashlytics.purchase, AbstractC13880l.yandex(((C14370l) c6956l.isPro(c10707l)).yandex.ads, 0L, 0L, 0L, c6956l, 0, 14), null, null, AbstractC14566l.amazon(-775672738, new Function3() { // from class: lَۤۤ
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    C16395l c16395l;
                    C6956l c6956l2 = (C6956l) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                        C4346l c4346l = C4346l.f8873l;
                        InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(c4346l, 1.0f);
                        C14855l c14855l = C18450l.f36043l;
                        InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(c14855l, false);
                        long j5 = c6956l2.f14595continue;
                        int i3 = (int) (j5 ^ (j5 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                        InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lCrashlytics);
                        InterfaceC8801l.firebase.getClass();
                        C16395l c16395l2 = C3438l.loadAd;
                        c6956l2.m2140super();
                        if (c6956l2.f14603switch) {
                            c6956l2.firebase(c16395l2);
                        } else {
                            c6956l2.m2136protected();
                        }
                        C6415l c6415l = C3438l.mopub;
                        AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
                        C6415l c6415l2 = C3438l.billing;
                        AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
                        Integer numValueOf = Integer.valueOf(i3);
                        C6415l c6415l3 = C3438l.isPro;
                        AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
                        C11192l c11192l = C3438l.firebase;
                        AbstractC8182l.purchase(c6956l2, c11192l);
                        C6415l c6415l4 = C3438l.amazon;
                        AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
                        InterfaceC17242l interfaceC17242lCrashlytics2 = AbstractC0019l.crashlytics(AbstractC15042l.adcel(AbstractC10409l.admob(AbstractC3605l.smaato(c4346l, 16.0f).premium(AbstractC0080l.loadAd), 1), C1083l.pro(new C8195l[]{new C8195l(Float.valueOf(0.1f), new C9735l(C9735l.isPro)), new C8195l(Float.valueOf(0.5f), new C9735l(C9735l.loadAd))})), AbstractC13106l.billing(c6956l2).amazon);
                        InterfaceC12244l interfaceC12244l = interfaceC12244lYandex2;
                        long j6 = ((C9735l) interfaceC12244l.getValue()).yandex;
                        C9946l c9946l = AbstractC16837l.yandex;
                        InterfaceC17242l interfaceC17242lLoadAd = AbstractC17551l.loadAd(AbstractC4927l.amazon(interfaceC17242lCrashlytics2, j6, c9946l), 1.0f, AbstractC13106l.purchase(c6956l2).premium, AbstractC13106l.billing(c6956l2).amazon);
                        C14855l c14855l2 = C18450l.f36026l;
                        InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(c14855l2, false);
                        long j7 = c6956l2.f14595continue;
                        int i4 = (int) (j7 ^ (j7 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                        InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lLoadAd);
                        c6956l2.m2140super();
                        if (c6956l2.f14603switch) {
                            c6956l2.firebase(c16395l2);
                        } else {
                            c6956l2.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon2, c6415l);
                        AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
                        AbstractC11043l.isPro(i4, c6956l2, c6415l3, c6956l2, c11192l);
                        AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
                        C14855l c14855l3 = C18450l.f36042l;
                        C16170l c16170l = C16170l.yandex;
                        InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(AbstractC3605l.vip(c16170l.yandex(c4346l, c14855l3), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7);
                        C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l2, 0);
                        long j8 = c6956l2.f14595continue;
                        int i5 = (int) (j8 ^ (j8 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato3 = c6956l2.smaato();
                        InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l2, interfaceC17242lStartapp);
                        c6956l2.m2140super();
                        if (c6956l2.f14603switch) {
                            c6956l2.firebase(c16395l2);
                        } else {
                            c6956l2.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
                        AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato3, c6415l2);
                        AbstractC11043l.isPro(i5, c6956l2, c6415l3, c6956l2, c11192l);
                        AbstractC8182l.billing(c6956l2, interfaceC17242lBilling3, c6415l4);
                        C6839l c6839l = c6839lYandex;
                        InterfaceC17242l interfaceC17242lCrashlytics3 = AbstractC0019l.crashlytics(c4346l, c6839l);
                        InterfaceC12244l interfaceC12244l2 = interfaceC12244lLoadAd;
                        boolean zBilling = c6956l2.billing(interfaceC12244l2);
                        Object objM2132native = c6956l2.m2132native();
                        if (zBilling || objM2132native == C1867l.yandex) {
                            objM2132native = new C2116l(interfaceC12244l2, 4);
                            c6956l2.m2147try(objM2132native);
                        }
                        AbstractC9383l.yandex(AbstractC17551l.loadAd(AbstractC4927l.amazon(AbstractC11043l.advert(AbstractC0080l.amazon(AbstractC7477l.loadAd(interfaceC17242lCrashlytics3, (Function1) objM2132native), 1.0f)), AbstractC13106l.purchase(c6956l2).startapp, c9946l), 1.0f, ((C9735l) interfaceC12244lYandex3.getValue()).yandex, c6839l), c6956l2, 0);
                        AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 8.0f));
                        C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l2, 48);
                        long j9 = c6956l2.f14595continue;
                        int i6 = (int) (j9 ^ (j9 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato4 = c6956l2.smaato();
                        InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l2, c4346l);
                        c6956l2.m2140super();
                        if (c6956l2.f14603switch) {
                            c6956l2.firebase(c16395l2);
                        } else {
                            c6956l2.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l);
                        AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato4, c6415l2);
                        AbstractC11043l.isPro(i6, c6956l2, c6415l3, c6956l2, c11192l);
                        AbstractC8182l.billing(c6956l2, interfaceC17242lBilling4, c6415l4);
                        C6839l c6839l2 = AbstractC7497l.yandex;
                        InterfaceC17242l interfaceC17242lCrashlytics4 = AbstractC0019l.crashlytics(c4346l, c6839l2);
                        C18295l c18295l = C18295l.yandex;
                        InterfaceC17242l interfaceC17242lPurchase = AbstractC0080l.purchase(c18295l.yandex(interfaceC17242lCrashlytics4, 1.0f, true), 16.0f);
                        InterfaceC12244l interfaceC12244l3 = interfaceC12244lYandex;
                        AbstractC9383l.yandex(AbstractC17551l.loadAd(AbstractC4927l.amazon(interfaceC17242lPurchase, ((C9735l) interfaceC12244l3.getValue()).yandex, c9946l), 1.0f, AbstractC13106l.purchase(c6956l2).premium, c6839l2), c6956l2, 0);
                        AbstractC3308l.crashlytics(c18295l, z3, null, AbstractC4523l.purchase(null, 3).yandex(AbstractC4523l.loadAd(null, null, 15)), AbstractC4523l.billing(null, 3).yandex(AbstractC4523l.mopub(null, null, 15)), null, AbstractC14566l.amazon(1905073120, new C10457l(interfaceC12244l3, 0), c6956l2), c6956l2, 1600518, 18);
                        AbstractC9334l.yandex(c6956l2, AbstractC0080l.vip(c4346l, 4.0f));
                        AbstractC9383l.yandex(AbstractC17551l.loadAd(AbstractC4927l.amazon(AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l, 16.0f), c6839l2), ((C9735l) interfaceC12244l3.getValue()).yandex, c9946l), 1.0f, AbstractC13106l.purchase(c6956l2).premium, c6839l2), c6956l2, 0);
                        c6956l2.startapp(true);
                        AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 8.0f));
                        AbstractC9383l.yandex(AbstractC17551l.loadAd(AbstractC4927l.amazon(AbstractC0080l.purchase(AbstractC0080l.vip(AbstractC0019l.crashlytics(c4346l, c6839l2), 92.0f), 16.0f), ((C9735l) interfaceC12244l3.getValue()).yandex, c9946l), 1.0f, AbstractC13106l.purchase(c6956l2).premium, c6839l2), c6956l2, 0);
                        AbstractC3308l.loadAd(C0397l.yandex, z4, null, AbstractC4523l.purchase(null, 3).yandex(AbstractC4523l.amazon(null, 15)), AbstractC4523l.billing(null, 3).yandex(AbstractC4523l.subs(null, 15)), null, AbstractC14566l.amazon(-903892028, new C7442l((Object) interfaceC12244l3, (Object) interfaceC12244l, 0), c6956l2), c6956l2, 1600518, 18);
                        AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 8.0f));
                        AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l2, 0, 7);
                        AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 8.0f));
                        InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                        InterfaceC10835l interfaceC10835lAmazon3 = AbstractC9383l.amazon(c14855l2, false);
                        long j10 = c6956l2.f14595continue;
                        int i7 = (int) (j10 ^ (j10 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato5 = c6956l2.smaato();
                        InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l2, interfaceC17242lAmazon2);
                        c6956l2.m2140super();
                        if (c6956l2.f14603switch) {
                            c16395l = c16395l2;
                            c6956l2.firebase(c16395l);
                        } else {
                            c16395l = c16395l2;
                            c6956l2.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon3, c6415l);
                        AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato5, c6415l2);
                        AbstractC11043l.isPro(i7, c6956l2, c6415l3, c6956l2, c11192l);
                        AbstractC8182l.billing(c6956l2, interfaceC17242lBilling5, c6415l4);
                        InterfaceC17242l interfaceC17242lYandex = c16170l.yandex(c4346l, c14855l);
                        C5062l c5062lYandex2 = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36044l, c6956l2, 6);
                        long j11 = c6956l2.f14595continue;
                        int i8 = (int) (j11 ^ (j11 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato6 = c6956l2.smaato();
                        InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l2, interfaceC17242lYandex);
                        c6956l2.m2140super();
                        if (c6956l2.f14603switch) {
                            c6956l2.firebase(c16395l);
                        } else {
                            c6956l2.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l2, c5062lYandex2, c6415l);
                        AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato6, c6415l2);
                        AbstractC11043l.isPro(i8, c6956l2, c6415l3, c6956l2, c11192l);
                        AbstractC8182l.billing(c6956l2, interfaceC17242lBilling6, c6415l4);
                        c6956l2.m2123default(-1590164192);
                        for (int i9 = 0; i9 < 3; i9++) {
                            InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(c4346l, 4.0f);
                            C6839l c6839l3 = AbstractC7497l.yandex;
                            AbstractC9383l.yandex(AbstractC17551l.loadAd(AbstractC4927l.amazon(AbstractC0019l.crashlytics(interfaceC17242lIsPro, c6839l3), ((C9735l) interfaceC12244l3.getValue()).yandex, c9946l), 1.0f, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.premium, c6839l3), c6956l2, 0);
                        }
                        c6956l2.startapp(false);
                        c6956l2.startapp(true);
                        c6956l2.startapp(true);
                        c6956l2.startapp(true);
                        c6956l2.startapp(true);
                        c6956l2.startapp(true);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, 196614, 24);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(z, z2, z3, z4, z5, i) { // from class: lؔۤٓ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ boolean f6529l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ boolean f6530l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ boolean f6532l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ boolean f6533l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ boolean f6534l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(1);
                    this.f6531l.m4325import(this.f6530l, this.f6529l, this.f6533l, this.f6532l, this.f6534l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m4326instanceof(C18554l c18554l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(2067099742);
        if ((i & 6) == 0) {
            i2 = i | (c6956l.admob(c18554l) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(this) ? 32 : 16;
        }
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            C10707l c10707l = AbstractC16964l.yandex;
            long j = ((C14370l) c6956l.isPro(c10707l)).yandex.startapp;
            long j2 = ((C14370l) c6956l.isPro(c10707l)).yandex.adcel;
            C8954l c8954lTapsense = AbstractC2426l.tapsense(c6956l);
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob || objM2132native2 == c13863l) {
                objM2132native2 = new C8224l(this, 1);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC2426l.crashlytics((Function0) objM2132native2, null, c8954lTapsense, 0.0f, false, null, j, j2, 0L, null, null, null, AbstractC14566l.amazon(1718117564, new C3572l(c18554l, interfaceC2262l, this, i3), c6956l), c6956l, 0, 7994);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(this, c18554l, i, 12);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        boolean z;
        InterfaceC8714l interfaceC8714l;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(272745671);
        int i2 = i | (c6956l2.admob(this) ? 4 : 2);
        int i3 = 0;
        if (c6956l2.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l2);
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC12311l.isPro(c6956l2);
                c6956l2.m2147try(objM2132native);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) AbstractC16584l.crashlytics().f3602l).yandex();
            Object obj = AbstractC16584l.crashlytics().f3602l;
            InterfaceC8714l interfaceC8714lLoadAd = AbstractC3700l.loadAd(interfaceC6942lYandex, (C18554l) ((AbstractC11904l) C8993l.f18539l.f33214l), c6956l2, 0);
            if (((Boolean) this.f33914l.getValue()).booleanValue()) {
                c6956l2.m2123default(-711324948);
                boolean zAdmob = c6956l2.admob(this);
                Object objM2132native2 = c6956l2.m2132native();
                if (zAdmob || objM2132native2 == c13863l) {
                    objM2132native2 = new C8224l(this, 0);
                    c6956l2.m2147try(objM2132native2);
                }
                C10707l c10707l = AbstractC16964l.yandex;
                interfaceC8714l = interfaceC8714lLoadAd;
                z = false;
                AbstractC2426l.crashlytics((Function0) objM2132native2, null, null, 0.0f, false, null, ((C14370l) c6956l2.isPro(c10707l)).yandex.startapp, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, AbstractC14566l.amazon(-1767744512, new C0447l(this, interfaceC2262l, interfaceC8714lLoadAd, i3), c6956l2), c6956l2, 0, 7998);
                c6956l2 = c6956l2;
            } else {
                z = false;
                interfaceC8714l = interfaceC8714lLoadAd;
                c6956l2.m2123default(-722311813);
            }
            c6956l2.startapp(z);
            if (((Boolean) this.f33915l.getValue()).booleanValue()) {
                c6956l2.m2123default(-707598717);
                m4326instanceof((C18554l) interfaceC8714l.getValue(), c6956l2, (i2 << 3) & 112);
            } else {
                c6956l2.m2123default(-722311813);
            }
            c6956l2.startapp(z);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-460256373, new C3158l(c13072lYandex, this, 11), c6956l2), null, null, null, 0, 0L, 0L, ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).amazon(c6956l2), AbstractC14566l.amazon(547167190, new C11223l(c13072lYandex, interfaceC8714l, this, interfaceC2262l, 12), c6956l2), c6956l2, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4961l(this, i);
        }
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m4327public(final int i, final boolean z, final Function1 function1, final InterfaceC17242l interfaceC17242l, Integer num, boolean z2, C6956l c6956l, final int i2, final int i3) {
        Integer num2;
        int i4;
        boolean z3;
        int i5;
        final Integer num3;
        final boolean z4;
        C15578l c15578lAmazon;
        c6956l.m2133new(1933485925);
        int i6 = i2 | (c6956l.amazon(i) ? 4 : 2) | (c6956l.mopub(z) ? 32 : 16) | (c6956l.admob(function1) ? 256 : 128) | (c6956l.billing(interfaceC17242l) ? 2048 : 1024);
        int i7 = i3 & 16;
        if (i7 != 0) {
            i4 = i6 | 24576;
            num2 = num;
        } else {
            num2 = num;
            i4 = i6 | (c6956l.billing(num2) ? 16384 : 8192);
        }
        int i8 = i3 & 32;
        if (i8 != 0) {
            i5 = i4 | 196608;
            z3 = z2;
        } else {
            z3 = z2;
            i5 = i4 | (c6956l.mopub(z3) ? 131072 : 65536);
        }
        byte b = 0;
        if (c6956l.m2127for(i5 & 1, (74899 & i5) != 74898)) {
            Integer num4 = i7 != 0 ? null : num2;
            boolean z5 = i8 != 0 ? true : z3;
            int i9 = 14;
            if (num4 == null) {
                c6956l.m2123default(673196328);
                c6956l.startapp(false);
                c15578lAmazon = null;
            } else {
                c6956l.m2123default(673196329);
                c15578lAmazon = AbstractC14566l.amazon(1828802513, new C4314l(num4.intValue(), i9, b), c6956l);
                c6956l.startapp(false);
            }
            boolean z6 = ((i5 & 896) == 256) | ((i5 & 112) == 32);
            Object objM2132native = c6956l.m2132native();
            if (z6 || objM2132native == C1867l.yandex) {
                objM2132native = new C1926l(5, function1, z);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(AbstractC14566l.amazon(1743803207, new C4314l(i, 15, b), c6956l), AbstractC15788l.yandex(AbstractC9151l.loadAd(interfaceC17242l, z5, null, (Function0) objM2132native, 14), z5 ? 1.0f : 0.5f), null, c15578lAmazon, null, AbstractC14566l.amazon(-374037150, new C14793l(z, function1, z5), c6956l), null, c6956l, 196614, 468);
            z4 = z5;
            num3 = num4;
        } else {
            c6956l.m2124else();
            num3 = num2;
            z4 = z3;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(i, z, function1, interfaceC17242l, num3, z4, i2, i3) { // from class: lؘؒۡ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ boolean f3561l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ boolean f3562l;

                /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
                public final /* synthetic */ int f3563l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ int f3564l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f3566l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f3567l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ Integer f3568l;

                {
                    this.f3563l = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(1);
                    this.f3565l.m4327public(this.f3564l, this.f3561l, this.f3567l, this.f3566l, this.f3568l, this.f3562l, (C6956l) obj, iPurchase, this.f3563l);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
