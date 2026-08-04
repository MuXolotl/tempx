package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؘ۟ۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6003l implements InterfaceC17842l, InterfaceC5289l {
    public final C7424l crashlytics;
    public final C7424l loadAd;
    public final /* synthetic */ InterfaceC17842l yandex;

    public C6003l(C7424l c7424l, C7424l c7424l2, InterfaceC17842l interfaceC17842l) {
        this.yandex = interfaceC17842l;
        this.loadAd = c7424l;
        this.crashlytics = c7424l2;
    }

    @Override // defpackage.InterfaceC17842l
    public final C10023l amazon() {
        return this.yandex.amazon();
    }

    @Override // defpackage.InterfaceC17842l
    public final C4917l billing() {
        return this.yandex.billing();
    }

    @Override // defpackage.InterfaceC17842l
    public final C6921l crashlytics() {
        return this.yandex.crashlytics();
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC12356l loadAd() {
        return this.yandex.loadAd();
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC9573l purchase() {
        return this.yandex.purchase();
    }

    @Override // defpackage.InterfaceC5289l
    public final void yandex(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        int i2;
        C6003l c6003l = this;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(1489047397);
        int i3 = i | (c6956l2.admob(c6003l) ? 32 : 16);
        if (c6956l2.m2127for(i3 & 1, (i3 & 19) != 18)) {
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = new C6523l();
                c6956l2.m2147try(objM2132native);
            }
            C6523l c6523l = (C6523l) objM2132native;
            Unit unit = Unit.INSTANCE;
            Object objM2132native2 = c6956l2.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C0915l(c6523l, null, 3);
                c6956l2.m2147try(objM2132native2);
            }
            AbstractC12311l.amazon(c6956l2, unit, (Function2) objM2132native2);
            InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(interfaceC17242l, 48.0f);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
            long j = c6956l2.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lSmaato);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i4);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            C15089l c15089l = C18450l.f36046l;
            C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
            C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, c15089l, c6956l2, 54);
            long j2 = c6956l2.f14595continue;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lAmazon);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i5, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            AbstractC15300l.yandex(c6956l2, 0);
            C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), c15089l, c6956l2, 6);
            long j3 = c6956l2.f14595continue;
            int i6 = (int) (j3 ^ (j3 >>> 32));
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
            AbstractC11043l.isPro(i6, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling3, c6415l4);
            String strPurchase = AbstractC11999l.purchase(c6956l2, R.string.tv_intro);
            C10707l c10707l = AbstractC3459l.yandex;
            i2 = 1;
            AbstractC11282l.loadAd(strPurchase, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l2.isPro(c10707l)).loadAd, c6956l, 0, 0, 65534);
            AbstractC11282l.loadAd(AbstractC11999l.purchase(c6956l, R.string.tv_intro_desc), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l.isPro(c10707l)).billing, c6956l, 0, 0, 65534);
            c6956l.startapp(true);
            C6839l c6839l = ((C0260l) c6956l.isPro(AbstractC14696l.yandex)).amazon;
            C2209l c2209l = AbstractC8209l.yandex;
            C10707l c10707l2 = AbstractC10689l.yandex;
            AbstractC16291l.crashlytics(null, c6839l, AbstractC8209l.yandex(((C10936l) c6956l.isPro(c10707l2)).isPro(), ((C10936l) c6956l.isPro(c10707l2)).purchase(), c6956l, 0, 0), AbstractC11342l.yandex, c6956l, 51);
            C0086l c0086l = C18450l.f36040l;
            C7537l c7537l2 = new C7537l(16.0f, true, new C8339l(12));
            InterfaceC17242l interfaceC17242lYandex = AbstractC13702l.yandex(AbstractC6745l.purchase(c4346l, c6523l));
            C5062l c5062lYandex = AbstractC7001l.yandex(c7537l2, c0086l, c6956l, 54);
            long j4 = c6956l.f14595continue;
            int i7 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato4 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l, interfaceC17242lYandex);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato4, c6415l2);
            AbstractC11043l.isPro(i7, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling4, c6415l4);
            c6003l = this;
            AbstractC6419l.yandex(c6003l.loadAd, AbstractC9966l.billing(c4346l, c6523l), null, AbstractC14927l.crashlytics, AbstractC11342l.loadAd, c6956l, 0, 3068);
            AbstractC6419l.yandex(c6003l.crashlytics, null, null, null, AbstractC11342l.crashlytics, c6956l, 0, 4094);
            c6956l2 = c6956l;
            AbstractC12900l.ads(c6956l2, true, true, true);
        } else {
            i2 = 1;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3666l(c6003l, interfaceC17242l, i, i2);
        }
    }
}
