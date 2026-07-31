package defpackage;

import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;

/* JADX INFO: renamed from: l٘ٛٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18037l {
    public static final Class[] yandex = new Class[0];
    public static final Object[] loadAd = new Object[0];

    public static final void amazon(CustomCatalogBlockItem customCatalogBlockItem, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        int i2;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(966115368);
        int i3 = i | (c6956l2.admob(customCatalogBlockItem) ? 4 : 2) | (c6956l2.billing(interfaceC17242l) ? 32 : 16);
        if (c6956l2.m2127for(i3 & 1, (i3 & 19) != 18)) {
            C0086l c0086l = C18450l.f36040l;
            InterfaceC17242l interfaceC17242lPurchase = AbstractC0080l.purchase(interfaceC17242l, 56.0f);
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, c0086l, c6956l2, 48);
            long j = c6956l2.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lPurchase);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i4);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lPremium = AbstractC3605l.remoteconfig(c4346l, 12.0f, 8.0f).premium(new C9247l(1.0f, true));
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l2, 0);
            long j2 = c6956l2.f14595continue;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lPremium);
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
            String str = customCatalogBlockItem.yandex;
            String str2 = customCatalogBlockItem.loadAd;
            AbstractC13010l.loadAd(str, null, AbstractC13106l.purchase(c6956l2).adcel, 0L, null, null, null, 0L, null, 0L, 2, false, str2.length() > 0 ? 1 : 2, 0, AbstractC13106l.admob(c6956l2).firebase, c6956l, 0, 384, 110586);
            c6956l2 = c6956l;
            if (str2.length() > 0) {
                c6956l2.m2123default(1606149087);
                AbstractC13010l.loadAd(customCatalogBlockItem.loadAd, null, AbstractC13106l.purchase(c6956l2).subscription, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, AbstractC13106l.admob(c6956l2).firebase, c6956l, 0, 24960, 110586);
                c6956l2 = c6956l;
            } else {
                c6956l2.m2123default(1603035168);
            }
            c6956l2.startapp(false);
            c6956l2.startapp(true);
            InterfaceC17242l interfaceC17242lSubs = AbstractC6660l.subs(AbstractC4927l.amazon(AbstractC0019l.crashlytics(AbstractC4115l.billing(AbstractC14566l.billing(AbstractC0080l.isPro(c4346l, 48.0f).premium(new C13820l(c0086l)), -15.0f), 10.0f, 10.0f), AbstractC13106l.billing(c6956l2).loadAd), AbstractC13106l.purchase(c6956l2).signatures, AbstractC16837l.yandex), 1.0f, AbstractC13106l.billing(c6956l2).loadAd, false, 28);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j3 = c6956l2.f14595continue;
            int i6 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato3 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l2, interfaceC17242lSubs);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato3, c6415l2);
            AbstractC11043l.isPro(i6, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling3, c6415l4);
            List list = customCatalogBlockItem.crashlytics;
            AbstractC7741l.amazon(list != null ? AbstractC8320l.loadAd(100, list) : null, customCatalogBlockItem.yandex, AbstractC0080l.crashlytics(c4346l, 1.0f), C4176l.loadAd, null, c6956l2, 1573248, 1976);
            i2 = 1;
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            i2 = 1;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C13094l(customCatalogBlockItem, interfaceC17242l, i, i2);
        }
    }

    public static boolean billing(byte b) {
        return b > -65;
    }

    public static final void crashlytics(Object obj, InterfaceC17242l interfaceC17242l, InterfaceC17807l interfaceC17807l, String str, C15578l c15578l, C6956l c6956l, int i, int i2) {
        int i3;
        InterfaceC17242l interfaceC17242l2;
        c6956l.m2133new(-513216493);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? c6956l.billing(obj) : c6956l.admob(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i3 | 48;
        if ((i & 384) == 0) {
            i4 |= c6956l.admob(interfaceC17807l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= c6956l.billing(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= c6956l.admob(c15578l) ? 16384 : 8192;
        }
        if (c6956l.m2127for(i4 & 1, (i4 & 9363) != 9362)) {
            if (i5 != 0) {
                str = "Crossfade";
            }
            C4346l c4346l = C4346l.f8873l;
            loadAd(AbstractC2438l.isPro(obj, str, c6956l, (i4 & 14) | ((i4 >> 6) & 112), 0), c4346l, interfaceC17807l, null, c15578l, c6956l, i4 & 58352);
            interfaceC17242l2 = c4346l;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
        }
        String str2 = str;
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C18227l(obj, interfaceC17242l2, interfaceC17807l, str2, c15578l, i, i2);
        }
    }

    public static final void loadAd(C18656l c18656l, InterfaceC17242l interfaceC17242l, InterfaceC17807l interfaceC17807l, Function1 function1, C15578l c15578l, C6956l c6956l, int i) {
        Function1 function2;
        c6956l.m2133new(-1877370462);
        int i2 = (i & 6) == 0 ? (c6956l.billing(c18656l) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(interfaceC17807l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= c6956l.admob(c15578l) ? 16384 : 8192;
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 9363) != 9362)) {
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                objM2132native = C11192l.f22535l;
                c6956l.m2147try(objM2132native);
            }
            Function1 function3 = (Function1) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            Object obj2 = objM2132native2;
            if (objM2132native2 == obj) {
                C11362l c11362l = new C11362l();
                c11362l.add(c18656l.crashlytics());
                c6956l.m2147try(c11362l);
                obj2 = c11362l;
            }
            C11362l c11362l2 = (C11362l) obj2;
            Object objM2132native3 = c6956l.m2132native();
            if (objM2132native3 == obj) {
                long[] jArr = AbstractC12154l.yandex;
                objM2132native3 = new C13660l();
                c6956l.m2147try(objM2132native3);
            }
            C13660l c13660l = (C13660l) objM2132native3;
            Object objCrashlytics = c18656l.crashlytics();
            C10086l c10086l = c18656l.amazon;
            if (AbstractC8576l.yandex(objCrashlytics, c10086l.getValue())) {
                c6956l.m2123default(321145192);
                if (c11362l2.size() == 1 && AbstractC8576l.yandex(c11362l2.get(0), c10086l.getValue())) {
                    c6956l.m2123default(321469824);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(321279546);
                    boolean z = (i3 & 14) == 4;
                    Object objM2132native4 = c6956l.m2132native();
                    if (z || objM2132native4 == obj) {
                        objM2132native4 = new C3006l(13, c18656l);
                        c6956l.m2147try(objM2132native4);
                    }
                    AbstractC3984l.ad(c11362l2, (Function1) objM2132native4);
                    c13660l.yandex();
                    c6956l.startapp(false);
                }
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(321475776);
                c6956l.startapp(false);
            }
            if (c13660l.loadAd(c10086l.getValue())) {
                c6956l.m2123default(322279296);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(321536443);
                ListIterator listIterator = c11362l2.listIterator();
                int i4 = 0;
                while (true) {
                    C13376l c13376l = (C13376l) listIterator;
                    if (!c13376l.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (AbstractC8576l.yandex(function3.invoke(c13376l.next()), function3.invoke(c10086l.getValue()))) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 == -1) {
                    c11362l2.add(c10086l.getValue());
                } else {
                    c11362l2.set(i4, c10086l.getValue());
                }
                c13660l.yandex();
                int size = c11362l2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Object obj3 = c11362l2.get(i5);
                    c13660l.vip(obj3, AbstractC14566l.amazon(-934471669, new C10508l(c18656l, interfaceC17807l, obj3, c15578l), c6956l));
                }
                c6956l.startapp(false);
            }
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l.f14595continue;
            int i6 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            Function0 function0 = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(function0);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.crashlytics(c6956l, Integer.valueOf(i6), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            c6956l.m2123default(-1312707512);
            int size2 = c11362l2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                Object obj4 = c11362l2.get(i7);
                c6956l.m2121class(1171574969, function3.invoke(obj4));
                Function2 function4 = (Function2) c13660l.mopub(obj4);
                if (function4 == null) {
                    c6956l.m2123default(1959122128);
                } else {
                    c6956l.m2123default(1171576145);
                    function4.invoke(c6956l, 0);
                }
                c6956l.startapp(false);
                c6956l.startapp(false);
            }
            c6956l.startapp(false);
            c6956l.startapp(true);
            function2 = function3;
        } else {
            c6956l.m2124else();
            function2 = function1;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C16237l(c18656l, interfaceC17242l, interfaceC17807l, function2, c15578l, i);
        }
    }

    public static final void purchase(InterfaceC3703l interfaceC3703l) {
        AbstractC5573l.metrica(interfaceC3703l).m1393strictfp();
    }

    public static final void yandex(AbstractC18082l abstractC18082l, boolean z, Function1 function1, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(998761431);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(abstractC18082l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.mopub(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            AbstractC7039l.amazon(AbstractC3605l.startapp(AbstractC3605l.vip(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 8.0f, 0.0f, 2), 0.0f, z ? 0.0f : 8.0f, 0.0f, 0.0f, 13), new C7537l(4.0f, true, new C8339l(12)), null, null, 2, 0, AbstractC14566l.amazon(-1281451908, new C0541l(abstractC18082l, function1, 7), c6956l), c6956l, 1597488, 44);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9607l(abstractC18082l, z, function1, i);
        }
    }
}
