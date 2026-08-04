package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.music.catalog.loadAd;
import ua.itaysonlab.vkapi2.objects.music.catalog.yandex;

/* JADX INFO: renamed from: lّۤٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12959l {
    public static final void amazon(InterfaceC13238l interfaceC13238l, C6956l c6956l, int i) {
        InterfaceC13238l interfaceC13238l2;
        int i2;
        c6956l.m2133new(-741704683);
        int i3 = i | (c6956l.billing(interfaceC13238l) ? 32 : 16);
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            C18627l c18627l = new C18627l(AbstractC13106l.purchase(c6956l).premium);
            C14855l c14855l = C18450l.f36021l;
            C16170l c16170l = C16170l.yandex;
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lSubs = AbstractC6660l.subs(AbstractC0019l.crashlytics(AbstractC0080l.crashlytics(AbstractC4115l.billing(AbstractC14566l.billing(c16170l.yandex(c4346l, c14855l), -15.0f), -18.0f, 8.0f), 0.8f), AbstractC13106l.billing(c6956l).crashlytics), 8.0f, AbstractC13106l.billing(c6956l).crashlytics, false, 28);
            C14855l c14855l2 = C18450l.f36026l;
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(c14855l2, false);
            long j = c6956l.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lSubs);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i4);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            String str = (String) AbstractC16901l.m4220for(0, interfaceC13238l);
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(c4346l, 1.0f);
            C6928l c6928l = C4176l.billing;
            AbstractC7741l.purchase(str, null, interfaceC17242lCrashlytics, c18627l, c18627l, c6928l, c6956l, 37296, 6, 31712);
            c6956l.startapp(true);
            InterfaceC17242l interfaceC17242lSubs2 = AbstractC6660l.subs(AbstractC0019l.crashlytics(AbstractC0080l.crashlytics(AbstractC4115l.billing(AbstractC14566l.billing(c16170l.yandex(c4346l, C18450l.f36043l), 15.0f), 10.0f, 8.0f), 0.8f), AbstractC13106l.billing(c6956l).crashlytics), 8.0f, AbstractC13106l.billing(c6956l).crashlytics, false, 28);
            InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(c14855l2, false);
            long j2 = c6956l.f14595continue;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lSubs2);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon2, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i5, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            AbstractC7741l.purchase((String) AbstractC16901l.m4220for(1, interfaceC13238l), null, AbstractC0080l.crashlytics(c4346l, 1.0f), c18627l, c18627l, c6928l, c6956l, 37296, 6, 31712);
            c6956l.startapp(true);
            InterfaceC17242l interfaceC17242lSubs3 = AbstractC6660l.subs(AbstractC0019l.crashlytics(AbstractC0080l.crashlytics(AbstractC4115l.billing(AbstractC14566l.billing(c16170l.yandex(c4346l, C18450l.f36032l), 30.0f), 38.0f, 0.0f), 0.8f), AbstractC13106l.billing(c6956l).crashlytics), 8.0f, AbstractC13106l.billing(c6956l).crashlytics, false, 28);
            InterfaceC10835l interfaceC10835lAmazon3 = AbstractC9383l.amazon(c14855l2, false);
            long j3 = c6956l.f14595continue;
            int i6 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, interfaceC17242lSubs3);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon3, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, c6415l2);
            AbstractC11043l.isPro(i6, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, c6415l4);
            interfaceC13238l2 = interfaceC13238l;
            AbstractC7741l.purchase((String) AbstractC16901l.m4220for(2, interfaceC13238l2), null, AbstractC0080l.crashlytics(c4346l, 1.0f), c18627l, c18627l, c6928l, c6956l, 37296, 6, 31712);
            i2 = 1;
            c6956l.startapp(true);
        } else {
            interfaceC13238l2 = interfaceC13238l;
            i2 = 1;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3775l(interfaceC13238l2, i, i2);
        }
    }

    public static final void crashlytics(CustomCatalogBlockItem.Background background, C6956l c6956l, int i) {
        c6956l.m2133new(-1800646523);
        int i2 = (c6956l.admob(background) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            boolean zBilling = c6956l.billing(background);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                yandex yandexVar = background.mopub;
                List list = background.loadAd;
                int iOrdinal = yandexVar.ordinal();
                if (iOrdinal == 0) {
                    ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C9735l(purchase((CustomCatalogBlockItem.Background.BColor) it.next())));
                    }
                    objM2132native = new C6906l(arrayList, null, 0L, 9187343241974906880L);
                } else if (iOrdinal != 1) {
                    C18725l.billing();
                    return;
                } else {
                    CustomCatalogBlockItem.Background.BColor bColor = (CustomCatalogBlockItem.Background.BColor) AbstractC16901l.m4217extends(list);
                    objM2132native = new C8990l(bColor != null ? purchase(bColor) : C9735l.loadAd);
                }
                c6956l.m2147try(objM2132native);
            }
            AbstractC9383l.yandex(AbstractC4927l.crashlytics(AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), (AbstractC9544l) objM2132native), c6956l, 0);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15707l(background, i, 26);
        }
    }

    public static final void loadAd(InterfaceC13238l interfaceC13238l, C6956l c6956l, int i) {
        c6956l.m2133new(-981083410);
        int i2 = (c6956l.admob(interfaceC13238l) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 8.0f, 0.0f, 2);
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l, 0);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lVip);
            InterfaceC8801l.firebase.getClass();
            Function0 function0 = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(function0);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            c6956l.m2123default(-1768779268);
            Iterator it = interfaceC13238l.iterator();
            while (it.hasNext()) {
                CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) it.next();
                c6956l.m2121class(-1768778224, customCatalogBlockItem.admob);
                C9247l c9247l = new C9247l(1.0f, true);
                boolean zAdmob = c6956l.admob(customCatalogBlockItem);
                Object objM2132native = c6956l.m2132native();
                if (zAdmob || objM2132native == C1867l.yandex) {
                    objM2132native = new C15541l(customCatalogBlockItem, 0);
                    c6956l.m2147try(objM2132native);
                }
                yandex(customCatalogBlockItem, AbstractC9151l.loadAd(c9247l, false, null, (Function0) objM2132native, 15), c6956l, 0);
                c6956l.startapp(false);
            }
            c6956l.startapp(false);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3775l(interfaceC13238l, i, 0);
        }
    }

    public static final long purchase(CustomCatalogBlockItem.Background.BColor bColor) {
        try {
            return C9735l.loadAd(((Number) AbstractC8576l.admob(Float.valueOf(bColor.yandex), new C12015l(0.0f, 1.0f))).floatValue(), AbstractC12953l.loadAd(Color.parseColor("#".concat(AbstractC12024l.m3334new(bColor.loadAd, "#")))));
        } catch (IllegalArgumentException unused) {
            return C9735l.loadAd;
        }
    }

    public static final void yandex(CustomCatalogBlockItem customCatalogBlockItem, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        boolean z;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(1681282134);
        int i2 = i | (c6956l2.admob(customCatalogBlockItem) ? 4 : 2) | (c6956l2.billing(interfaceC17242l) ? 32 : 16);
        if (c6956l2.m2127for(i2 & 1, (i2 & 19) != 18)) {
            CustomCatalogBlockItem.Background background = customCatalogBlockItem.billing;
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36034l, c6956l2, 48);
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
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lLoadAd = AbstractC17551l.loadAd(AbstractC0019l.crashlytics(AbstractC17463l.loadAd(AbstractC0080l.amazon(AbstractC0080l.remoteconfig(AbstractC3605l.smaato(c4346l, 8.0f), 0.0f, 0.0f, 120.0f, 120.0f, 3), 1.0f), false), AbstractC13106l.billing(c6956l2).amazon), 1.0f, AbstractC13106l.purchase(c6956l2).signatures, AbstractC13106l.billing(c6956l2).amazon);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j2 = c6956l2.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lLoadAd);
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
            List arrayList = null;
            loadAd loadad = background != null ? background.billing : null;
            if ((loadad == null ? -1 : AbstractC5829l.yandex[loadad.ordinal()]) == 1) {
                c6956l2.m2123default(815397353);
                crashlytics(background, c6956l2, 0);
                c6956l2.startapp(false);
            } else {
                c6956l2.m2123default(815488958);
                AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0080l.crashlytics(c4346l, 1.0f), AbstractC13106l.purchase(c6956l2).ads, AbstractC16837l.yandex), c6956l2, 0);
                c6956l2.startapp(false);
            }
            EnumC2008l enumC2008l = customCatalogBlockItem.isPro;
            EnumC2008l enumC2008l2 = EnumC2008l.TripleRotatedRight;
            C13863l c13863l = C1867l.yandex;
            if (enumC2008l == enumC2008l2) {
                c6956l2.m2123default(815762378);
                boolean zBilling = c6956l2.billing(customCatalogBlockItem);
                Object objM2132native = c6956l2.m2132native();
                if (zBilling || objM2132native == c13863l) {
                    List list = customCatalogBlockItem.amazon;
                    if (list != null) {
                        arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            AbstractC3984l.license(arrayList, Collections.singletonList(AbstractC8320l.loadAd(200, (List) it.next())));
                        }
                    }
                    if (arrayList == null) {
                        arrayList = C2580l.f5619l;
                    }
                    objM2132native = AbstractC0509l.purchase(arrayList);
                    c6956l2.m2147try(objM2132native);
                }
                amazon((InterfaceC13238l) objM2132native, c6956l2, 6);
                z = false;
                c6956l2.startapp(false);
            } else {
                c6956l2.m2123default(816057839);
                boolean zBilling2 = c6956l2.billing(customCatalogBlockItem);
                Object objM2132native2 = c6956l2.m2132native();
                if (zBilling2 || objM2132native2 == c13863l) {
                    List list2 = customCatalogBlockItem.crashlytics;
                    String strLoadAd = list2 != null ? AbstractC8320l.loadAd(200, list2) : null;
                    c6956l2.m2147try(strLoadAd);
                    objM2132native2 = strLoadAd;
                }
                AbstractC7741l.purchase((String) objM2132native2, null, AbstractC0080l.crashlytics(c4346l, 1.0f), new C18627l(AbstractC13106l.purchase(c6956l2).premium), new C18627l(AbstractC13106l.purchase(c6956l2).premium), C4176l.billing, c6956l2, 37296, 6, 31712);
                z = false;
                c6956l2.startapp(false);
            }
            c6956l2.startapp(true);
            String str = customCatalogBlockItem.yandex;
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(str, null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.smaato, c6956l, 0, 0, 130042);
            AbstractC13010l.loadAd(customCatalogBlockItem.loadAd, null, ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.metrica, c6956l, 0, 0, 130042);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C13094l(customCatalogBlockItem, interfaceC17242l, i, 0);
        }
    }
}
