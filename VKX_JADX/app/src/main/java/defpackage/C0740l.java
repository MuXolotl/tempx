package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؑۨٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0740l implements InterfaceC5289l, InterfaceC17842l {
    public final /* synthetic */ InterfaceC17842l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C0740l(InterfaceC17842l interfaceC17842l, int i) {
        this.yandex = i;
        this.loadAd = interfaceC17842l;
    }

    @Override // defpackage.InterfaceC17842l
    public final C10023l amazon() {
        switch (this.yandex) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.loadAd.amazon();
    }

    @Override // defpackage.InterfaceC17842l
    public final C4917l billing() {
        switch (this.yandex) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.loadAd.billing();
    }

    @Override // defpackage.InterfaceC17842l
    public final C6921l crashlytics() {
        switch (this.yandex) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.loadAd.crashlytics();
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC12356l loadAd() {
        switch (this.yandex) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.loadAd.loadAd();
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC9573l purchase() {
        switch (this.yandex) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.loadAd.purchase();
    }

    @Override // defpackage.InterfaceC5289l
    public final void yandex(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        int i2 = this.yandex;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        int i3 = 2;
        switch (i2) {
            case 0:
                c6956l2.m2133new(-408279353);
                if (c6956l2.m2127for(i & 1, (i & 3) != 2)) {
                    C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36046l, c6956l2, 6);
                    long j = c6956l2.f14595continue;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242l);
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
                    Object objM2132native = c6956l2.m2132native();
                    if (objM2132native == c13863l) {
                        objM2132native = new C12176l(0);
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC14890l.yandex((Function1) objM2132native, AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), null, null, c6956l2, 100666806);
                    c6956l2 = c6956l;
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l2, 0, 7);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                C4224l c4224lAds = c6956l2.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C3666l(this, interfaceC17242l, i, 6);
                }
                break;
            case 1:
                c6956l2.m2133new(-195511454);
                if (c6956l2.m2127for(i & 1, (i & 3) != 2)) {
                    C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l2, 0);
                    long j2 = c6956l2.f14595continue;
                    int i5 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l2);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, C3438l.amazon);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                C4224l c4224lAds2 = c6956l2.ads();
                if (c4224lAds2 != null) {
                    c4224lAds2.amazon = new C3666l(this, interfaceC17242l, i, 7);
                }
                break;
            default:
                c6956l2.m2133new(42614849);
                if (c6956l2.m2127for(i & 1, (i & 3) != 2)) {
                    Object objM2132native2 = c6956l2.m2132native();
                    if (objM2132native2 == c13863l) {
                        objM2132native2 = AbstractC8020l.smaato(Boolean.FALSE);
                        c6956l2.m2147try(objM2132native2);
                    }
                    InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native2;
                    Unit unit = Unit.INSTANCE;
                    Object objM2132native3 = c6956l2.m2132native();
                    if (objM2132native3 == c13863l) {
                        objM2132native3 = new C16802l(interfaceC8714l, null, i3);
                        c6956l2.m2147try(objM2132native3);
                    }
                    AbstractC12311l.amazon(c6956l2, unit, (Function2) objM2132native3);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
                    long j3 = c6956l2.f14595continue;
                    int i6 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l2, interfaceC17242l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l3);
                    } else {
                        c6956l2.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato3, c6415l2);
                    Integer numValueOf = Integer.valueOf(i6);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l2, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling3, c6415l4);
                    C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
                    C15089l c15089l = C18450l.f36034l;
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(c7537l, c15089l, c6956l2, 54);
                    long j4 = c6956l2.f14595continue;
                    int i7 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l2, c4346l);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l3);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c1853lYandex2, c6415l);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato4, c6415l2);
                    AbstractC11043l.isPro(i7, c6956l2, c6415l3, c6956l2, c11192l);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling4, c6415l4);
                    C10707l c10707l = AbstractC10689l.yandex;
                    AbstractC4332l.yandex(null, ((C10936l) c6956l2.isPro(c10707l)).mopub(), 0.0f, 0L, 0, 0.0f, c6956l, 0, 61);
                    C1853l c1853lYandex3 = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), c15089l, c6956l, 54);
                    long j5 = c6956l.f14595continue;
                    int i8 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato5 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l, c4346l);
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l3);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c1853lYandex3, c6415l);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato5, c6415l2);
                    AbstractC11043l.isPro(i8, c6956l, c6415l3, c6956l, c11192l);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling5, c6415l4);
                    AbstractC11282l.loadAd(AbstractC11999l.purchase(c6956l, R.string.tv_splash), null, ((C10936l) c6956l.isPro(c10707l)).purchase(), 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l.isPro(AbstractC3459l.yandex)).isPro, c6956l, 0, 0, 65530);
                    AbstractC3308l.loadAd(C0397l.yandex, ((Boolean) interfaceC8714l.getValue()).booleanValue(), null, null, null, null, AbstractC11064l.yandex, c6956l, 1572870, 30);
                    c6956l2 = c6956l;
                    AbstractC12900l.ads(c6956l2, true, true, true);
                } else {
                    c6956l2.m2124else();
                }
                C4224l c4224lAds3 = c6956l2.ads();
                if (c4224lAds3 != null) {
                    c4224lAds3.amazon = new C3666l(this, interfaceC17242l, i, 8);
                }
                break;
        }
    }
}
