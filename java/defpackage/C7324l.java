package defpackage;

import ealvatag.tag.datatype.DataTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚ٘ۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7324l implements InterfaceC17842l, InterfaceC5289l {
    public final Object crashlytics;
    public final /* synthetic */ InterfaceC17842l loadAd;
    public final /* synthetic */ int yandex = 2;

    public C7324l(InterfaceC17842l interfaceC17842l) {
        this.loadAd = interfaceC17842l;
        C18662l c18662lPurchase = AbstractC18263l.purchase(this);
        C11644l c11644l = new C11644l(10);
        InterfaceC12356l interfaceC12356lLoadAd = interfaceC17842l.loadAd();
        C8490l c8490l = AbstractC6025l.yandex;
        InterfaceC14029l interfaceC14029l = null;
        C13025l c13025l = new C13025l(c11644l, interfaceC14029l, 0);
        C8084l c8084l = AbstractC6025l.loadAd;
        int i = 3;
        AbstractC0622l.startapp(AbstractC11452l.firebase(new C2347l(new C10424l(c8084l, i), new C6637l(c13025l, interfaceC14029l, 23), 2), interfaceC12356lLoadAd, 6), c18662lPurchase);
        int i2 = 4;
        AbstractC0622l.startapp(AbstractC11452l.firebase(new C2347l(new C10424l(c8084l, i2), new C6637l(new C13025l(c11644l, interfaceC14029l, 1), interfaceC14029l, 25), 2), interfaceC12356lLoadAd, 6), c18662lPurchase);
        AbstractC0622l.startapp(AbstractC11452l.firebase(new C2347l(new C10424l(c8084l, 5), new C6637l(new C13025l(c11644l, interfaceC14029l, 2), interfaceC14029l, 27), 2), interfaceC12356lLoadAd, 6), c18662lPurchase);
        AbstractC0622l.startapp(AbstractC11452l.firebase(new C2347l(new C10424l(c8084l, 6), new C6637l(new C13025l(c11644l, interfaceC14029l, i), interfaceC14029l, 29), 2), interfaceC12356lLoadAd, 6), c18662lPurchase);
        AbstractC0622l.startapp(AbstractC11452l.firebase(new C2347l(new C10424l(c8084l, 7), new C6637l(new C13025l(c11644l, interfaceC14029l, i2), interfaceC14029l, 21), 2), interfaceC12356lLoadAd, 6), c18662lPurchase);
        this.crashlytics = c11644l;
    }

    public void admob(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(-1773718884);
        int i2 = 2;
        int i3 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l, 0);
            long j = c6956l.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
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
            AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            C17253l c17253lLoadAd = AbstractC3605l.loadAd(0.0f, 48.0f, 1);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = new C5562l(27);
                c6956l.m2147try(objM2132native);
            }
            AbstractC16336l.yandex(null, null, c17253lLoadAd, null, null, null, false, null, (Function1) objM2132native, c6956l, 805306752, 507);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15569l(this, interfaceC17242l, i, i2);
        }
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

    public void mopub(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        C10086l c10086l = (C10086l) this.crashlytics;
        c6956l2.m2133new(1394326691);
        int i2 = i | (c6956l2.billing(interfaceC17242l) ? 4 : 2) | (c6956l2.admob(this) ? 32 : 16);
        if (c6956l2.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C7537l c7537l = new C7537l(24.0f, true, new C8339l(12));
            C15089l c15089l = C18450l.f36046l;
            C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, c15089l, c6956l2, 6);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
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
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(new C9247l(1.0f, true), 1.0f);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j2 = c6956l2.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lAmazon);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            String str = ((C4531l) c10086l.getValue()).yandex;
            C10707l c10707l = AbstractC10689l.yandex;
            C18627l c18627l = new C18627l(((C10936l) c6956l2.isPro(c10707l)).loadAd());
            C18627l c18627l2 = new C18627l(((C10936l) c6956l2.isPro(c10707l)).loadAd());
            C4346l c4346l = C4346l.f8873l;
            AbstractC7741l.purchase(str, null, AbstractC17463l.loadAd(c4346l, true), c18627l, c18627l2, C4176l.billing, c6956l2, 37296, 6, 31712);
            c6956l2.startapp(true);
            C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), c15089l, c6956l2, 6);
            long j3 = c6956l2.f14595continue;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato3 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l2, c4346l);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex2, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato3, c6415l2);
            AbstractC11043l.isPro(i5, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling3, c6415l4);
            String str2 = ((C4531l) c10086l.getValue()).loadAd;
            C10707l c10707l2 = AbstractC3459l.yandex;
            AbstractC11282l.loadAd(str2, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l2.isPro(c10707l2)).amazon, c6956l, 0, 0, 65534);
            AbstractC11282l.loadAd(DataTypes.OBJ_DESCRIPTION, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l.isPro(c10707l2)).isPro, c6956l, 6, 0, 65534);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15569l(this, interfaceC17242l, i, 3);
        }
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
        C16395l c16395l;
        C6956l c6956l2 = c6956l;
        int i2 = this.yandex;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        Object obj = this.crashlytics;
        int i3 = 1;
        switch (i2) {
            case 0:
                int i4 = 4;
                c6956l2.m2133new(-322941059);
                int i5 = i | (c6956l2.admob(this) ? 32 : 16);
                if (c6956l2.m2127for(i5 & 1, (i5 & 19) != 18)) {
                    Object objM2132native = c6956l2.m2132native();
                    if (objM2132native == c13863l) {
                        objM2132native = new C6523l();
                        c6956l2.m2147try(objM2132native);
                    }
                    C6523l c6523l = (C6523l) objM2132native;
                    Unit unit = Unit.INSTANCE;
                    Object objM2132native2 = c6956l2.m2132native();
                    if (objM2132native2 == c13863l) {
                        objM2132native2 = new C0915l(c6523l, null, i4);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC12311l.amazon(c6956l2, unit, (Function2) objM2132native2);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
                    long j = c6956l2.f14595continue;
                    int i6 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242l);
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
                    Integer numValueOf = Integer.valueOf(i6);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l2, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
                    C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36034l, c6956l2, 54);
                    long j2 = c6956l2.f14595continue;
                    int i7 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, c4346l);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l2);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i7, c6956l2, c6415l3, c6956l2, c11192l);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
                    String strPurchase = AbstractC11999l.purchase(c6956l2, R.string.tv_nag);
                    C10707l c10707l = AbstractC3459l.yandex;
                    AbstractC11282l.loadAd(strPurchase, null, 0L, 0L, 0L, new C10258l(3), 0L, 0, false, 0, 0, null, ((C9472l) c6956l2.isPro(c10707l)).purchase, c6956l, 0, 0, 65022);
                    AbstractC11282l.loadAd(AbstractC11999l.purchase(c6956l, R.string.tv_nag_desc), null, 0L, 0L, 0L, new C10258l(3), 0L, 0, false, 0, 0, null, ((C9472l) c6956l.isPro(c10707l)).firebase, c6956l, 0, 0, 65022);
                    c6956l2 = c6956l;
                    AbstractC6419l.yandex((C7424l) obj, AbstractC9966l.billing(c4346l, c6523l), null, null, AbstractC1762l.yandex, c6956l2, 0, 4092);
                    c6956l2.startapp(true);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                C4224l c4224lAds = c6956l2.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C3666l(this, interfaceC17242l, i, 3);
                }
                break;
            case 1:
                C11644l c11644l = (C11644l) obj;
                c6956l2.m2133new(1448863730);
                int i8 = (c6956l2.admob(this) ? 32 : 16) | i;
                if (c6956l2.m2127for(i8 & 1, (i8 & 17) != 16)) {
                    C15089l c15089l = C18450l.f36046l;
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(AbstractC8313l.crashlytics, c15089l, c6956l2, 0);
                    long j3 = c6956l2.f14595continue;
                    int i9 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l2, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l3);
                    } else {
                        c6956l2.m2136protected();
                    }
                    C6415l c6415l5 = C3438l.mopub;
                    AbstractC8182l.billing(c6956l2, c1853lYandex2, c6415l5);
                    C6415l c6415l6 = C3438l.billing;
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato3, c6415l6);
                    Integer numValueOf2 = Integer.valueOf(i9);
                    C6415l c6415l7 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l2, numValueOf2, c6415l7);
                    C11192l c11192l2 = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l2, c11192l2);
                    C6415l c6415l8 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling3, c6415l8);
                    InterfaceC17242l interfaceC17242lPremium = AbstractC0080l.amazon(c4346l, 1.0f).premium(new C9247l(1.0f, true));
                    C10707l c10707l2 = AbstractC10689l.yandex;
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC17551l.loadAd(interfaceC17242lPremium, 1.0f, ((C10936l) c6956l2.isPro(c10707l2)).yandex(), AbstractC16837l.yandex);
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j4 = c6956l2.f14595continue;
                    int i10 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l2, interfaceC17242lLoadAd);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l3);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon2, c6415l5);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato4, c6415l6);
                    AbstractC11043l.isPro(i10, c6956l2, c6415l7, c6956l2, c11192l2);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling4, c6415l8);
                    AbstractC11282l.loadAd("Lyrics container", C16170l.yandex.yandex(c4346l, C18450l.f36043l), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, c6956l, 6, 0, 131068);
                    c6956l.startapp(true);
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(c4346l, 16.0f);
                    C1853l c1853lYandex3 = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), c15089l, c6956l, 6);
                    long j5 = c6956l.f14595continue;
                    int i11 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato5 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c16395l = c16395l3;
                        c6956l.firebase(c16395l);
                    } else {
                        c16395l = c16395l3;
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c1853lYandex3, c6415l5);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato5, c6415l6);
                    AbstractC11043l.isPro(i11, c6956l, c6415l7, c6956l, c11192l2);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling5, c6415l8);
                    C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
                    C0086l c0086l = C18450l.f36044l;
                    C5062l c5062lYandex = AbstractC7001l.yandex(c7537l, c0086l, c6956l, 6);
                    long j6 = c6956l.f14595continue;
                    int i12 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato6 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l, c4346l);
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c5062lYandex, c6415l5);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato6, c6415l6);
                    AbstractC11043l.isPro(i12, c6956l, c6415l7, c6956l, c11192l2);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling6, c6415l8);
                    C18627l c18627l = new C18627l(((C10936l) c6956l.isPro(c10707l2)).loadAd());
                    C18627l c18627l2 = new C18627l(((C10936l) c6956l.isPro(c10707l2)).loadAd());
                    C10086l c10086l = (C10086l) c11644l.f23361l;
                    C10086l c10086l2 = (C10086l) c11644l.f23361l;
                    AbstractC18643l abstractC18643l = (AbstractC18643l) c10086l.getValue();
                    AbstractC7741l.purchase(abstractC18643l != null ? abstractC18643l.getAmazon() : null, null, AbstractC0080l.isPro(c4346l, 140.0f), c18627l, c18627l2, C4176l.billing, c6956l, 37296, 6, 31712);
                    C7537l c7537l2 = new C7537l(4.0f, true, new C8339l(12));
                    C13820l c13820l = new C13820l(C18450l.f36016l);
                    C1853l c1853lYandex4 = AbstractC1001l.yandex(c7537l2, c15089l, c6956l, 6);
                    long j7 = c6956l.f14595continue;
                    int i13 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato7 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling7 = AbstractC17541l.billing(c6956l, c13820l);
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c1853lYandex4, c6415l5);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato7, c6415l6);
                    AbstractC11043l.isPro(i13, c6956l, c6415l7, c6956l, c11192l2);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling7, c6415l8);
                    AbstractC18643l abstractC18643l2 = (AbstractC18643l) c10086l2.getValue();
                    String loadAd = abstractC18643l2 != null ? abstractC18643l2.getLoadAd() : null;
                    if (loadAd == null) {
                        loadAd = AbstractC12900l.mopub(c6956l, -758820515, R.string.settings_nothing_playing, c6956l, false);
                    } else {
                        c6956l.m2123default(-758823088);
                        c6956l.startapp(false);
                    }
                    C10707l c10707l3 = AbstractC3459l.yandex;
                    C16395l c16395l4 = c16395l;
                    AbstractC11282l.loadAd(loadAd, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l.isPro(c10707l3)).purchase, c6956l, 0, 0, 65534);
                    AbstractC18643l abstractC18643l3 = (AbstractC18643l) c10086l2.getValue();
                    String yandex = abstractC18643l3 != null ? abstractC18643l3.getCrashlytics() : null;
                    if (yandex == null) {
                        yandex = AbstractC12900l.mopub(c6956l, -758810691, R.string.settings_nothing_playing, c6956l, false);
                    } else {
                        c6956l.m2123default(-758813419);
                        c6956l.startapp(false);
                    }
                    AbstractC11282l.loadAd(yandex, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l.isPro(c10707l3)).isPro, c6956l, 0, 0, 65534);
                    c6956l2 = c6956l;
                    c6956l2.startapp(true);
                    c6956l2.startapp(true);
                    C5062l c5062lYandex2 = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), c0086l, c6956l2, 6);
                    long j8 = c6956l2.f14595continue;
                    int i14 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato8 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling8 = AbstractC17541l.billing(c6956l2, c4346l);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l4);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c5062lYandex2, c6415l5);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato8, c6415l6);
                    AbstractC11043l.isPro(i14, c6956l2, c6415l7, c6956l2, c11192l2);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling8, c6415l8);
                    Object objM2132native3 = c6956l2.m2132native();
                    if (objM2132native3 == c13863l) {
                        objM2132native3 = new C1712l(19);
                        c6956l2.m2147try(objM2132native3);
                    }
                    AbstractC6419l.yandex((Function0) objM2132native3, null, null, null, AbstractC9307l.yandex, c6956l2, 6, 4094);
                    Object objM2132native4 = c6956l2.m2132native();
                    if (objM2132native4 == c13863l) {
                        objM2132native4 = new C1712l(20);
                        c6956l2.m2147try(objM2132native4);
                    }
                    AbstractC6419l.yandex((Function0) objM2132native4, null, null, null, AbstractC9307l.loadAd, c6956l2, 6, 4094);
                    Object objM2132native5 = c6956l2.m2132native();
                    if (objM2132native5 == c13863l) {
                        objM2132native5 = new C1712l(21);
                        c6956l2.m2147try(objM2132native5);
                    }
                    AbstractC6419l.yandex((Function0) objM2132native5, null, null, null, AbstractC9307l.crashlytics, c6956l2, 6, 4094);
                    Object objM2132native6 = c6956l2.m2132native();
                    if (objM2132native6 == c13863l) {
                        objM2132native6 = new C1712l(22);
                        c6956l2.m2147try(objM2132native6);
                    }
                    AbstractC6419l.yandex((Function0) objM2132native6, null, null, null, AbstractC9307l.amazon, c6956l2, 6, 4094);
                    AbstractC12900l.ads(c6956l2, true, true, true);
                } else {
                    c6956l2.m2124else();
                }
                C4224l c4224lAds2 = c6956l2.ads();
                if (c4224lAds2 != null) {
                    c4224lAds2.amazon = new C3666l(this, interfaceC17242l, i, 4);
                }
                break;
            default:
                C10086l c10086l3 = (C10086l) obj;
                c6956l2.m2133new(-399224335);
                int i15 = i | (c6956l2.admob(this) ? 32 : 16);
                if (c6956l2.m2127for(i15 & 1, (i15 & 19) != 18)) {
                    boolean zPurchase = c6956l2.purchase(((C4531l) c10086l3.getValue()).crashlytics);
                    Object objM2132native7 = c6956l2.m2132native();
                    if (zPurchase || objM2132native7 == c13863l) {
                        objM2132native7 = AbstractC16104l.yandex(((C4531l) c10086l3.getValue()).crashlytics);
                        c6956l2.m2147try(objM2132native7);
                    }
                    AbstractC12811l.yandex((C10936l) objM2132native7, null, null, AbstractC14566l.amazon(1527611845, new C15569l(interfaceC17242l, this), c6956l2), c6956l, 3072, 6);
                    c6956l2 = c6956l;
                } else {
                    c6956l2.m2124else();
                }
                C4224l c4224lAds3 = c6956l2.ads();
                if (c4224lAds3 != null) {
                    c4224lAds3.amazon = new C15569l(this, interfaceC17242l, i, i3);
                }
                break;
        }
    }

    public C7324l(C7424l c7424l, InterfaceC17842l interfaceC17842l) {
        this.loadAd = interfaceC17842l;
        this.crashlytics = c7424l;
    }

    public C7324l(C0523l c0523l, InterfaceC17842l interfaceC17842l) {
        this.loadAd = interfaceC17842l;
        this.crashlytics = AbstractC8020l.smaato(new C4531l(AbstractC12953l.loadAd(c0523l.billing), c0523l.amazon, c0523l.purchase));
    }
}
