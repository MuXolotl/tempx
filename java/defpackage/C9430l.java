package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lٌٍۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9430l extends AbstractC10581l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C1008l f19281l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final InterfaceC6942l f19282l;

    public C9430l() {
        C1008l c1008lYandex = AbstractC11190l.yandex("");
        this.f19281l = c1008lYandex;
        this.f19282l = AbstractC0622l.metrica(new C1954l(c1008lYandex, 0), AbstractC11463l.yandex);
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public static final void m2650protected(C9430l c9430l, CachedTrack cachedTrack, InterfaceC13238l interfaceC13238l) {
        AppActivity appActivity = (AppActivity) c9430l.isVip();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(interfaceC13238l, 10));
        Iterator<E> it = interfaceC13238l.iterator();
        while (it.hasNext()) {
            arrayList.add(((CachedTrack) it.next()).m4635implements());
        }
        C14247l c14247l = new C14247l(arrayList);
        String strPremium = cachedTrack.premium();
        InterfaceC11805l c11392l = strPremium != null ? new C11392l(strPremium) : C4618l.yandex;
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(interfaceC13238l, 10));
        Iterator<E> it2 = interfaceC13238l.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((CachedTrack) it2.next()).crashlytics());
        }
        AbstractC9092l.crashlytics(appActivity, c14247l, new C13305l(c11392l, 0L, arrayList2, false, false, false, 122));
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final void m2651break(CachedTrack cachedTrack, Function0 function0, Function0 function1, C6956l c6956l, int i) {
        c6956l.m2133new(891745488);
        int i2 = i | (c6956l.admob(cachedTrack) ? 4 : 2) | (c6956l.admob(function0) ? 32 : 16) | (c6956l.admob(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.admob(this) ? 2048 : 1024);
        int i3 = 0;
        int i4 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            AbstractC0133l.amazon(AbstractC14566l.amazon(-1224534946, new C7442l(this, cachedTrack, 13), c6956l), AbstractC14566l.amazon(-1658498627, new C11548l(cachedTrack, i3), c6956l), AbstractC3605l.remoteconfig(AbstractC0080l.amazon(AbstractC9151l.amazon(C4346l.f8873l, null, function1, null, function0, 239), 1.0f), 16.0f, 6.0f), AbstractC14566l.amazon(1768541307, new C11548l(cachedTrack, i4), c6956l), c6956l, 3126, 0);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2104l(this, cachedTrack, function0, function1, i, 2);
        }
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m2652finally(String str, String str2, C6956l c6956l, int i, int i2) {
        String str3;
        int i3;
        String str4;
        boolean z;
        c6956l.m2133new(-582959201);
        int i4 = i | (c6956l.billing(str) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            str3 = str2;
        } else {
            str3 = str2;
            i3 = i4 | (c6956l.billing(str3) ? 32 : 16);
        }
        int i6 = i3;
        if (c6956l.m2127for(i6 & 1, (i6 & 19) != 18)) {
            String str5 = i5 != 0 ? null : str3;
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 1.0f);
            C17253l c17253l = C12719l.yandex;
            InterfaceC17242l interfaceC17242lMopub = AbstractC0080l.mopub(interfaceC17242lAmazon, C12719l.billing(), 0.0f, 2);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l, 54);
            long j = c6956l.f14595continue;
            int i7 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lMopub);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i7), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(str, null, ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, 0L, null, C6886l.f14420l, AbstractC1193l.loadAd, 0L, null, 0L, 2, false, 1, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.isPro, c6956l, (i6 & 14) | 14155776, 24960, 110394);
            C6956l c6956l2 = c6956l;
            if (str5 != null) {
                c6956l2.m2123default(1822941488);
                String str6 = str5;
                AbstractC13010l.loadAd(str6, null, ((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, 0L, null, C6886l.f14425l, null, 0L, null, 0L, 2, false, 1, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.isPro, c6956l, ((i6 >> 3) & 14) | 1572864, 24960, 110522);
                str4 = str6;
                c6956l2 = c6956l;
                z = false;
            } else {
                str4 = str5;
                z = false;
                c6956l2.m2123default(1810119423);
            }
            c6956l2.startapp(z);
            c6956l2.startapp(true);
            AbstractC0555l.loadAd(AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7), 0.0f, 0L, c6956l2, 6, 6);
        } else {
            c6956l.m2124else();
            str4 = str3;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(i, i2, 5, this, str, str4);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-530603071);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C1008l c1008l = this.f19281l;
            C5268l c5268l = this.f34614l;
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(1673549189, new C17950l(this, AbstractC3700l.purchase(c1008l, c5268l, c6956l), i3), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(-222449648, new C18177l(this, AbstractC3700l.crashlytics(this.f19282l, new C16187l(), c5268l, c6956l, 0, 12), i3), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C16809l(this, i, 0);
        }
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m2653public(C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1141847612);
        int i2 = i & 1;
        if (c6956l2.m2127for(i2, i2 != 0)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(c4346l, 1.0f);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lCrashlytics);
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
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(C16170l.yandex.yandex(c4346l, C18450l.f36043l), 16.0f, 0.0f, 2);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36034l, c6956l2, 54);
            long j2 = c6956l2.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lVip);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.ic_download_outline_28, 0, c6956l2);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, AbstractC0080l.isPro(c4346l, 36.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, c6956l2, 440, 0);
            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.cache_library_empty), null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, AbstractC7039l.isPro(15), null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, null, c6956l, 24576, 0, 261098);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C16809l(this, i, 2);
        }
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void m2654this(CachedPlaylist cachedPlaylist, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(861725301);
        int i2 = i | (c6956l2.admob(cachedPlaylist) ? 4 : 2) | (c6956l2.admob(this) ? 32 : 16);
        if (c6956l2.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lVip = AbstractC0080l.vip(c4346l, 131.0f);
            boolean zAdmob = c6956l2.admob(this) | c6956l2.admob(cachedPlaylist);
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                objM2132native = new Ctry(this, cachedPlaylist, 25);
                c6956l2.m2147try(objM2132native);
            }
            InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(interfaceC17242lVip, false, null, (Function0) objM2132native, 15);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l2, 0);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lLoadAd);
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
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            boolean zBilling = c6956l2.billing(cachedPlaylist.m4618throws());
            Object objM2132native2 = c6956l2.m2132native();
            if (zBilling || objM2132native2 == c13863l) {
                objM2132native2 = AbstractC5309l.crashlytics(cachedPlaylist).f27331l.tapsense();
                c6956l2.m2147try(objM2132native2);
            }
            InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(c4346l, 131.0f);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC7741l.amazon((String) objM2132native2, null, AbstractC0019l.crashlytics(interfaceC17242lIsPro, ((C14370l) c6956l2.isPro(c10707l)).crashlytics.crashlytics), null, null, c6956l2, 48, 2040);
            AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 8.0f));
            AbstractC13010l.loadAd(cachedPlaylist.inmobi(), null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.isPro, c6956l, 0, 24960, 110586);
            AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 1.0f));
            String strIsVip = cachedPlaylist.isVip();
            if (strIsVip == null) {
                strIsVip = "";
            }
            AbstractC13010l.loadAd(strIsVip, null, ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.remoteconfig, c6956l, 0, 24960, 110586);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Cpublic(this, cachedPlaylist, i, 28);
        }
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final void m2655transient(String str, Function1 function1, Function1 function2, InterfaceC17242l interfaceC17242l, boolean z, Function2 function3, Function2 function4, C1351l c1351l, C2403l c2403l, C6956l c6956l, int i) {
        boolean z2;
        C2403l c2403l2;
        C2403l c2403l3;
        boolean z3;
        c6956l.m2133new(-1136071054);
        int i2 = i | (c6956l.billing(str) ? 4 : 2) | (c6956l.admob(function1) ? 32 : 16) | (c6956l.admob(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.billing(interfaceC17242l) ? 2048 : 1024) | 12607488 | (c6956l.billing(c1351l) ? 67108864 : 33554432) | 805306368;
        if (c6956l.m2127for(i2 & 1, (306783379 & i2) != 306783378)) {
            c6956l.m2141switch();
            int i3 = i & 1;
            Object obj = C1867l.yandex;
            if (i3 == 0 || c6956l.ad()) {
                Object objM2132native = c6956l.m2132native();
                if (objM2132native == obj) {
                    objM2132native = AbstractC14814l.isPro(c6956l);
                }
                c2403l3 = (C2403l) objM2132native;
                z3 = true;
            } else {
                c6956l.m2124else();
                z3 = z;
                c2403l3 = c2403l;
            }
            c6956l.adcel();
            InterfaceC6497l interfaceC6497l = (InterfaceC6497l) c6956l.isPro(AbstractC4751l.subs);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj) {
                objM2132native2 = new C6523l();
                c6956l.m2147try(objM2132native2);
            }
            C6523l c6523l = (C6523l) objM2132native2;
            C7038l c7038l = C7038l.yandex;
            InterfaceC17242l interfaceC17242lBilling = AbstractC9966l.billing(AbstractC0080l.amazon(AbstractC0080l.purchase(interfaceC17242l, 56.0f), 1.0f), c6523l);
            C11090l c11090lBilling = C11090l.billing(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).loadAd.isPro, c1351l.yandex, 0L, null, null, null, 0L, 0, 0L, 16777214);
            C8990l c8990l = new C8990l(c1351l.subs);
            C2403l c2403l4 = c2403l3;
            C3790l c3790l = new C3790l(0, 3, 119);
            int i4 = i2 & 14;
            boolean zAdmob = c6956l.admob(interfaceC6497l) | ((i2 & 896) == 256) | (i4 == 4);
            Object objM2132native3 = c6956l.m2132native();
            if (zAdmob || objM2132native3 == obj) {
                objM2132native3 = new C17313l(interfaceC6497l, function2, str, 0);
                c6956l.m2147try(objM2132native3);
            }
            boolean z4 = z3;
            AbstractC16363l.amazon(str, function1, interfaceC17242lBilling, z4, c11090lBilling, c3790l, new C6973l(null, (Function1) objM2132native3, 47), true, 0, 0, null, null, c2403l4, c8990l, AbstractC14566l.amazon(-2077937745, new C13479l(str, z4, c2403l4, function3, function4, c1351l, 0), c6956l), c6956l, 102236160 | i4 | (i2 & 112) | 3072, 199680, 7696);
            Unit unit = Unit.INSTANCE;
            Object objM2132native4 = c6956l.m2132native();
            if (objM2132native4 == obj) {
                objM2132native4 = new C1012l(c6523l, null, 0);
                c6956l.m2147try(objM2132native4);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native4);
            z2 = z4;
            c2403l2 = c2403l4;
        } else {
            c6956l.m2124else();
            z2 = z;
            c2403l2 = c2403l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C14674l(this, str, function1, function2, interfaceC17242l, z2, function3, function4, c1351l, c2403l2, i, 0);
        }
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final void m2656try(InterfaceC13238l interfaceC13238l, C6956l c6956l, int i) {
        c6956l.m2133new(1567578629);
        int i2 = (c6956l.admob(interfaceC13238l) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            C17253l c17253lLoadAd = AbstractC3605l.loadAd(16.0f, 0.0f, 2);
            C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
            boolean zAdmob = c6956l.admob(interfaceC13238l) | c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C0464l(interfaceC13238l, this, 24);
                c6956l.m2147try(objM2132native);
            }
            AbstractC16336l.loadAd(interfaceC17242lAmazon, null, c17253lLoadAd, c7537l, null, null, false, null, (Function1) objM2132native, c6956l, 24966, 490);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Cpublic(this, interfaceC13238l, i, 27);
        }
    }
}
