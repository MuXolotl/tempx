package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؒؑ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0776l implements InterfaceC17842l, InterfaceC5289l {
    public final boolean crashlytics = AbstractC16648l.isVip("https://vkx.app/license", "http", false);
    public final C10239l loadAd;
    public final /* synthetic */ InterfaceC17842l yandex;

    public C0776l(C10239l c10239l, InterfaceC17842l interfaceC17842l) {
        this.yandex = interfaceC17842l;
        this.loadAd = c10239l;
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
        boolean z;
        C0776l c0776l = this;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(2133775521);
        int i2 = i | (c6956l2.admob(c0776l) ? 32 : 16);
        int i3 = 5;
        if (c6956l2.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C18196l c18196l = (C18196l) c6956l2.isPro(AbstractC4751l.subscription);
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
                objM2132native2 = new C0915l(c6523l, null, i3);
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
            String strPurchase = AbstractC11999l.purchase(c6956l2, R.string.tv_qrview);
            C10707l c10707l = AbstractC3459l.yandex;
            AbstractC11282l.loadAd(strPurchase, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l2.isPro(c10707l)).billing, c6956l, 0, 0, 65534);
            InterfaceC17242l interfaceC17242lPurchase = AbstractC10409l.purchase(c4346l);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36016l, c6956l, 54);
            long j3 = c6956l.f14595continue;
            int i6 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, interfaceC17242lPurchase);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, c6415l2);
            AbstractC11043l.isPro(i6, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, c6415l4);
            InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(c4346l, 300.0f);
            C10707l c10707l2 = AbstractC14696l.yandex;
            int i7 = 28;
            InterfaceC17242l interfaceC17242lAmazon2 = AbstractC4927l.amazon(AbstractC0019l.crashlytics(AbstractC6660l.subs(interfaceC17242lIsPro, 2.0f, ((C0260l) c6956l.isPro(c10707l2)).amazon, false, 28), ((C0260l) c6956l.isPro(c10707l2)).amazon), C9735l.purchase, AbstractC16837l.yandex);
            InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j4 = c6956l.f14595continue;
            int i8 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato4 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon2);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon2, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato4, c6415l2);
            AbstractC11043l.isPro(i8, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling4, c6415l4);
            Object[] objArr = new Object[0];
            Object objM2132native3 = c6956l.m2132native();
            if (objM2132native3 == c13863l) {
                objM2132native3 = new C5562l(i7);
                c6956l.m2147try(objM2132native3);
            }
            C12371l.yandex(AbstractC13041l.subscription("https://vkx.app/license", objArr, (Function1) objM2132native3, c6956l), AbstractC3605l.smaato(AbstractC0080l.crashlytics(c4346l, 1.0f), 32.0f), null, null, 0.0f, c6956l, 432, 120);
            c6956l.startapp(true);
            C10707l c10707l3 = AbstractC10689l.yandex;
            AbstractC0555l.crashlytics(null, 0.0f, ((C10936l) c6956l.isPro(c10707l3)).loadAd(), c6956l, 0, 3);
            C0086l c0086l = C18450l.f36040l;
            C5062l c5062lYandex2 = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), c0086l, c6956l, 54);
            long j5 = c6956l.f14595continue;
            int i9 = (int) (j5 ^ (j5 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato5 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l, c4346l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex2, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato5, c6415l2);
            AbstractC11043l.isPro(i9, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling5, c6415l4);
            AbstractC11477l.yandex(AbstractC16759l.crashlytics(R.drawable.ic_globe_outline_28, 0, c6956l), AbstractC0080l.isPro(c4346l, 32.0f), 0L, c6956l, 440, 8);
            C1853l c1853lYandex2 = AbstractC1001l.yandex(AbstractC8313l.crashlytics, c15089l, c6956l, 0);
            long j6 = c6956l.f14595continue;
            int i10 = (int) (j6 ^ (j6 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato6 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l, c4346l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex2, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato6, c6415l2);
            AbstractC11043l.isPro(i10, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling6, c6415l4);
            AbstractC11282l.loadAd(AbstractC11999l.purchase(c6956l, R.string.tv_qrview_or), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l.isPro(c10707l)).firebase, c6956l, 0, 0, 65534);
            AbstractC11282l.loadAd("https://vkx.app/license", null, ((C10936l) c6956l.isPro(c10707l3)).purchase(), 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l.isPro(c10707l)).mopub, c6956l, 0, 0, 65530);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
            c6956l2.startapp(true);
            c6956l2.startapp(true);
            C7537l c7537l2 = new C7537l(16.0f, true, new C8339l(12));
            InterfaceC17242l interfaceC17242lYandex = AbstractC13702l.yandex(AbstractC6745l.purchase(c4346l, c6523l));
            C5062l c5062lYandex3 = AbstractC7001l.yandex(c7537l2, c0086l, c6956l2, 54);
            long j7 = c6956l2.f14595continue;
            int i11 = (int) (j7 ^ (j7 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato7 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling7 = AbstractC17541l.billing(c6956l2, interfaceC17242lYandex);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c5062lYandex3, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato7, c6415l2);
            AbstractC11043l.isPro(i11, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling7, c6415l4);
            c0776l = this;
            AbstractC6419l.yandex(c0776l.loadAd, AbstractC9966l.billing(c4346l, c6523l), null, null, AbstractC1051l.yandex, c6956l2, 0, 4092);
            if (c0776l.crashlytics) {
                c6956l2.m2123default(1025237727);
                boolean zAdmob = c6956l2.admob(c18196l) | c6956l2.admob(c0776l);
                Object objM2132native4 = c6956l2.m2132native();
                if (zAdmob || objM2132native4 == c13863l) {
                    objM2132native4 = new C17259l(c18196l, c0776l);
                    c6956l2.m2147try(objM2132native4);
                }
                AbstractC6419l.yandex((Function0) objM2132native4, null, null, AbstractC14927l.crashlytics, AbstractC1051l.loadAd, c6956l2, 0, 3070);
                z = false;
            } else {
                z = false;
                c6956l2.m2123default(1018901482);
            }
            c6956l2.startapp(z);
            AbstractC12900l.ads(c6956l2, true, true, true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3666l(c0776l, interfaceC17242l, i, 5);
        }
    }
}
