package defpackage;

import android.content.res.Configuration;
import android.graphics.Color;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؖٓۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4111l {
    public static final void amazon(int i, int i2, C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        int i3;
        InterfaceC17242l interfaceC17242l2;
        c6956l.m2133new(-674566720);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            interfaceC17242l2 = i4 != 0 ? C4346l.f8873l : interfaceC17242l;
            C8540l c8540l = AbstractC1242l.yandex;
            boolean zBilling = c6956l.billing((Configuration) c6956l.isPro(c8540l));
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zBilling || objM2132native == c13863l) {
                VKXApplication vKXApplication = VKXApplication.f36631l;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                objM2132native = new C3020l(vKXApplication);
                c6956l.m2147try(objM2132native);
            }
            C3020l c3020l = (C3020l) objM2132native;
            boolean zBilling2 = c6956l.billing((Configuration) c6956l.isPro(c8540l));
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling2 || objM2132native2 == c13863l) {
                objM2132native2 = Boolean.valueOf(AbstractC8317l.startapp);
                c6956l.m2147try(objM2132native2);
            }
            boolean zBooleanValue = ((Boolean) objM2132native2).booleanValue();
            long jLoadAd = AbstractC12953l.loadAd(c3020l.yandex(7));
            long jLoadAd2 = AbstractC12953l.loadAd(c3020l.loadAd(0.11f));
            boolean zMopub = c6956l.mopub(zBooleanValue);
            Object objM2132native3 = c6956l.m2132native();
            if (zMopub || objM2132native3 == c13863l) {
                objM2132native3 = new C9735l(AbstractC12953l.loadAd(zBooleanValue ? 620756992 : 369098751));
                c6956l.m2147try(objM2132native3);
            }
            long j = ((C9735l) objM2132native3).yandex;
            boolean zMopub2 = c6956l.mopub(zBooleanValue);
            Object objM2132native4 = c6956l.m2132native();
            if (zMopub2 || objM2132native4 == c13863l) {
                objM2132native4 = new C9735l(AbstractC12953l.loadAd(zBooleanValue ? 1342177280 : 822083583));
                c6956l.m2147try(objM2132native4);
            }
            billing(jLoadAd, jLoadAd2, j, ((C9735l) objM2132native4).yandex, interfaceC17242l2, c6956l, (i3 << 12) & 57344);
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17292l(interfaceC17242l2, i, i2, 2);
        }
    }

    public static final void billing(final long j, final long j2, final long j3, long j4, final InterfaceC17242l interfaceC17242l, C6956l c6956l, final int i) {
        int i2;
        final long j5 = j4;
        c6956l.m2133new(-475752995);
        if ((i & 6) == 0) {
            i2 = (c6956l.purchase(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.purchase(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.purchase(j3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.purchase(j5) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 16384 : 8192;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 9363) != 9362)) {
            C6839l c6839lYandex = AbstractC7497l.yandex(8.0f);
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(AbstractC0019l.crashlytics(c4346l, c6839lYandex).premium(interfaceC17242l), 56.0f);
            C9946l c9946l = AbstractC16837l.yandex;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(interfaceC17242lIsPro, j2, c9946l);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l, 0);
            long j6 = c6956l.f14595continue;
            int i3 = (int) (j6 ^ (j6 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0080l.purchase(AbstractC0080l.amazon(AbstractC0019l.crashlytics(AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 8.0f, 0.0f, 2), 0.0f, 8.0f, 0.0f, 4.0f, 5), AbstractC7497l.yandex(4.0f)), 1.0f), 24.0f), j, c9946l), c6956l, 0);
            InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 8.0f, 0.0f, 2), 0.0f, 4.0f, 0.0f, 8.0f, 5);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(4.0f, true, new C8339l(12)), C18450l.f36044l, c6956l, 6);
            long j7 = c6956l.f14595continue;
            int i4 = (int) (j7 ^ (j7 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lStartapp);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0080l.purchase(AbstractC0019l.crashlytics(c4346l, AbstractC7497l.yandex(4.0f)).premium(new C9247l(1.0f, true)), 12.0f), j3, c9946l), c6956l, 0);
            j5 = j4;
            AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0080l.isPro(AbstractC0019l.crashlytics(c4346l, AbstractC7497l.yandex(4.0f)), 12.0f), j5, c9946l), c6956l, 0);
            c6956l.startapp(true);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؚٗۨ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC4111l.billing(j, j2, j3, j5, interfaceC17242l, (C6956l) obj, AbstractC0545l.purchase(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void crashlytics(int i, int i2, C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        int i3;
        c6956l.m2133new(688216165);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                interfaceC17242l = C4346l.f8873l;
            }
            boolean zBilling = c6956l.billing((Configuration) c6956l.isPro(AbstractC1242l.yandex));
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                VKXApplication vKXApplication = VKXApplication.f36631l;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                objM2132native = new C3020l(vKXApplication);
                c6956l.m2147try(objM2132native);
            }
            loadAd((i3 << 3) & 112, AbstractC12953l.loadAd(((C3020l) objM2132native).yandex(1)), c6956l, interfaceC17242l);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17292l(interfaceC17242l, i, i2, 3);
        }
    }

    public static final void loadAd(int i, long j, C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        int i2;
        c6956l.m2133new(-825969189);
        if ((i & 6) == 0) {
            i2 = i | (c6956l.purchase(j) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C6839l c6839lYandex = AbstractC7497l.yandex(8.0f);
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(AbstractC0019l.crashlytics(c4346l, c6839lYandex).premium(interfaceC17242l), 56.0f);
            C10707l c10707l = AbstractC16964l.yandex;
            long j2 = ((C14370l) c6956l.isPro(c10707l)).yandex.ads;
            C9946l c9946l = AbstractC16837l.yandex;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(interfaceC17242lIsPro, j2, c9946l);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l, 0);
            long j3 = c6956l.f14595continue;
            int i3 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            InterfaceC17242l interfaceC17242lPremium = AbstractC3605l.startapp(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 8.0f, 0.0f, 2), 0.0f, 8.0f, 0.0f, 4.0f, 5).premium(new C14020l(C18450l.f36034l));
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l, 0);
            long j4 = c6956l.f14595continue;
            int i4 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lPremium);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0080l.isPro(AbstractC0019l.crashlytics(c4346l, AbstractC7497l.yandex(4.0f)), 16.0f), j, c9946l), c6956l, 0);
            AbstractC9334l.yandex(c6956l, new C9247l(1.0f, true));
            C6839l c6839l = AbstractC7497l.yandex;
            AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0019l.crashlytics(AbstractC3605l.smaato(AbstractC4927l.amazon(AbstractC0019l.crashlytics(AbstractC3605l.smaato(AbstractC4927l.amazon(AbstractC0080l.isPro(AbstractC0019l.crashlytics(c4346l, c6839l), 16.0f), j, c9946l), 2.0f), c6839l), ((C14370l) c6956l.isPro(c10707l)).yandex.ads, c9946l), 2.0f), c6839l), j, c9946l), c6956l, 0);
            c6956l.startapp(true);
            InterfaceC17242l interfaceC17242lAmazon2 = AbstractC4927l.amazon(AbstractC0080l.amazon(AbstractC11043l.advert(AbstractC0019l.crashlytics(AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 8.0f, 0.0f, 2), 0.0f, 4.0f, 0.0f, 8.0f, 5), AbstractC7497l.yandex(4.0f))), 1.0f), ((C14370l) c6956l.isPro(c10707l)).yandex.signatures, c9946l);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j5 = c6956l.f14595continue;
            int i5 = (int) (j5 ^ (j5 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon2);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, c6415l2);
            AbstractC11043l.isPro(i5, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, c6415l4);
            AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0080l.purchase(AbstractC0080l.amazon(AbstractC0019l.crashlytics(AbstractC15788l.yandex(c4346l, 0.5f), AbstractC7497l.yandex(4.0f)), 0.75f), 24.0f), j, c9946l), c6956l, 0);
            AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0080l.purchase(AbstractC0080l.amazon(AbstractC0019l.crashlytics(c4346l, AbstractC7497l.yandex(4.0f)), 0.5f), 24.0f), j, c9946l), c6956l, 0);
            c6956l.startapp(true);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8173l(j, interfaceC17242l, i);
        }
    }

    public static final void purchase(C6417l c6417l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i, int i2) {
        InterfaceC17242l interfaceC17242l2;
        int i3;
        InterfaceC17242l interfaceC17242l3;
        boolean z = c6417l.amazon;
        Map map = c6417l.billing;
        int i4 = c6417l.yandex;
        c6956l.m2133new(-914505892);
        int i5 = i | (c6956l.admob(c6417l) ? 4 : 2);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
            interfaceC17242l2 = interfaceC17242l;
        } else {
            interfaceC17242l2 = interfaceC17242l;
            i3 = i5 | (c6956l.billing(interfaceC17242l2) ? 32 : 16);
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            InterfaceC17242l interfaceC17242l4 = i6 != 0 ? C4346l.f8873l : interfaceC17242l2;
            boolean zAmazon = c6956l.amazon(i4);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zAmazon || objM2132native == c13863l) {
                C9735l c9735l = new C9735l(AbstractC12953l.loadAd(Color.parseColor((String) map.get("@windowBackground"))));
                c6956l.m2147try(c9735l);
                objM2132native = c9735l;
            }
            long j = ((C9735l) objM2132native).yandex;
            boolean zAmazon2 = c6956l.amazon(i4);
            Object objM2132native2 = c6956l.m2132native();
            if (zAmazon2 || objM2132native2 == c13863l) {
                C9735l c9735l2 = new C9735l(AbstractC12953l.loadAd(Color.parseColor((String) map.get("bg_primary"))));
                c6956l.m2147try(c9735l2);
                objM2132native2 = c9735l2;
            }
            long j2 = ((C9735l) objM2132native2).yandex;
            boolean zAmazon3 = c6956l.amazon(i4);
            Object objM2132native3 = c6956l.m2132native();
            if (zAmazon3 || objM2132native3 == c13863l) {
                C9735l c9735l3 = new C9735l(AbstractC12953l.loadAd(z ? 620756992 : 369098751));
                c6956l.m2147try(c9735l3);
                objM2132native3 = c9735l3;
            }
            long j3 = ((C9735l) objM2132native3).yandex;
            boolean zAmazon4 = c6956l.amazon(i4);
            Object objM2132native4 = c6956l.m2132native();
            if (zAmazon4 || objM2132native4 == c13863l) {
                C9735l c9735l4 = new C9735l(AbstractC12953l.loadAd(z ? 1342177280 : 822083583));
                c6956l.m2147try(c9735l4);
                objM2132native4 = c9735l4;
            }
            billing(j, j2, j3, ((C9735l) objM2132native4).yandex, interfaceC17242l4, c6956l, (i3 << 9) & 57344);
            interfaceC17242l3 = interfaceC17242l4;
        } else {
            c6956l.m2124else();
            interfaceC17242l3 = interfaceC17242l2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(c6417l, interfaceC17242l3, i, i2, 17);
        }
    }

    public static final void yandex(C9894l c9894l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i, int i2) {
        int i3;
        c6956l.m2133new(-1490397100);
        int i4 = (c6956l.billing(c9894l) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (c6956l.billing(interfaceC17242l) ? 32 : 16);
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            if (i5 != 0) {
                interfaceC17242l = C4346l.f8873l;
            }
            boolean zAmazon = c6956l.amazon(c9894l.yandex);
            Object objM2132native = c6956l.m2132native();
            if (zAmazon || objM2132native == C1867l.yandex) {
                C9735l c9735l = new C9735l(AbstractC12953l.loadAd(Color.parseColor(c9894l.crashlytics)));
                c6956l.m2147try(c9735l);
                objM2132native = c9735l;
            }
            loadAd(i3 & 112, ((C9735l) objM2132native).yandex, c6956l, interfaceC17242l);
        } else {
            c6956l.m2124else();
        }
        InterfaceC17242l interfaceC17242l2 = interfaceC17242l;
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(c9894l, interfaceC17242l2, i, i2, 16);
        }
    }
}
