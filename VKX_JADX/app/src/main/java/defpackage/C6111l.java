package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedLibrary;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylistLibrary;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lؘۦ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6111l extends AbstractC10581l implements InterfaceC9909l, InterfaceC2262l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final C10086l f12896l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f12897l = AbstractC11990l.loadAd();

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C1008l f12898l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final C10086l f12899l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C1008l f12900l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final C10086l f12901l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10086l f12902l;

    public C6111l() {
        Boolean bool = Boolean.FALSE;
        this.f12902l = AbstractC8020l.smaato(bool);
        C7206l c7206l = C7206l.yandex;
        AbstractC8020l.smaato(Boolean.valueOf(!C7206l.crashlytics(EnumC10788l.f21804l)));
        C8994l.yandex.getClass();
        this.f12898l = AbstractC11190l.yandex(C8994l.firebase.yandex());
        this.f12900l = AbstractC11190l.yandex(C8994l.isPro.yandex());
        this.f12901l = AbstractC8020l.smaato(C3729l.mopub);
        this.f12896l = AbstractC8020l.smaato(bool);
        this.f12899l = AbstractC8020l.smaato(bool);
    }

    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public static void m1938l(C6111l c6111l, CachedTrack cachedTrack, int i) {
        if ((i & 1) != 0) {
            cachedTrack = null;
        }
        AbstractC10999l.mopub(AbstractC11990l.firebase(c6111l), AbstractC11463l.yandex, 0, new C17207l(c6111l, cachedTrack, (i & 2) == 0, null), 2);
    }

    @Override // defpackage.AbstractC11801l, defpackage.AbstractC2484l, defpackage.AbstractC17777l
    public final void appmetrica() {
        super.appmetrica();
        AbstractC11990l.billing(this, null);
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final void m1939break(C6956l c6956l, int i) {
        c6956l.m2133new(-12625588);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C0131l(this, i3);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(AbstractC11852l.firebase, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), null, null, AbstractC11852l.remoteconfig, null, null, c6956l, 24582, 492);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5383l(this, i, 5);
        }
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public final void m1940const(CachedTrack cachedTrack, C6956l c6956l, int i) {
        C6956l c6956l2;
        c6956l.m2133new(-1946318831);
        int i2 = (c6956l.billing(cachedTrack) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            boolean zAdmob = c6956l.admob(this) | ((i2 & 14) == 4);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C4053l(this, cachedTrack);
                c6956l.m2147try(objM2132native);
            }
            c6956l2 = c6956l;
            AbstractC0133l.amazon(AbstractC14566l.amazon(1339165855, new C3155l(this, cachedTrack), c6956l), AbstractC14566l.amazon(1582702718, new C11548l(cachedTrack, 6), c6956l), AbstractC3605l.remoteconfig(AbstractC0080l.amazon(AbstractC9151l.loadAd(C4346l.f8873l, false, null, (Function0) objM2132native, 15), 1.0f), 16.0f, 6.0f), AbstractC14566l.amazon(2069776444, new C3155l(cachedTrack, this), c6956l), c6956l2, 3126, 0);
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10848l(this, cachedTrack, i, 28);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m1941finally(C6956l c6956l, int i) {
        ?? r13;
        C6956l c6956l2;
        boolean z;
        boolean z2;
        C6956l c6956l3;
        C6111l c6111l = this;
        C6956l c6956l4 = c6956l;
        c6956l4.m2133new(2100768512);
        int i2 = i | (c6956l4.admob(c6111l) ? 4 : 2);
        if (c6956l4.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(c4346l, 1.0f);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l4.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l4.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l4, interfaceC17242lCrashlytics);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l4.m2140super();
            if (c6956l4.f14603switch) {
                c6956l4.firebase(c16395l);
            } else {
                c6956l4.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l4, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l4, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l4, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l4, interfaceC17242lBilling, c6415l4);
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(C16170l.yandex.yandex(c4346l, C18450l.f36043l), 16.0f, 0.0f, 2);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36034l, c6956l4, 54);
            long j2 = c6956l4.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l4.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l4, interfaceC17242lVip);
            c6956l4.m2140super();
            if (c6956l4.f14603switch) {
                c6956l4.firebase(c16395l);
            } else {
                c6956l4.m2136protected();
            }
            AbstractC8182l.billing(c6956l4, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l4, c6415l3, c6956l4, c11192l);
            AbstractC8182l.billing(c6956l4, interfaceC17242lBilling2, c6415l4);
            if (((Boolean) c6111l.f12896l.getValue()).booleanValue()) {
                c6956l4.m2123default(1501301358);
                AbstractC8960l.loadAd(null, 0L, null, c6956l4, 0, 7);
                String strPurchase = AbstractC11999l.purchase(c6956l4, R.string.cache_db_migration_started);
                C10707l c10707l = AbstractC16964l.yandex;
                AbstractC13010l.loadAd(strPurchase, null, ((C14370l) c6956l4.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l4.isPro(c10707l)).loadAd.remoteconfig, c6956l, 0, 0, 130042);
                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.cache_db_migration_started_desc), null, ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.firebase, c6956l, 0, 0, 130042);
                C6956l c6956l5 = c6956l;
                c6956l5.startapp(false);
                i = i;
                z2 = false;
                c6111l = c6111l;
                c6956l3 = c6956l5;
            } else {
                c6956l4.m2123default(1502044893);
                AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.ic_download_outline_28, 0, c6956l4);
                C10707l c10707l2 = AbstractC16964l.yandex;
                AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, AbstractC0080l.isPro(c4346l, 36.0f), ((C14370l) c6956l4.isPro(c10707l2)).yandex.adcel, c6956l, 440, 0);
                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.cache_empty_page_title), null, ((C14370l) c6956l.isPro(c10707l2)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l2)).loadAd.remoteconfig, c6956l, 0, 0, 130042);
                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.cache_empty_page_text), null, ((C14370l) c6956l.isPro(c10707l2)).yandex.subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l2)).loadAd.firebase, c6956l, 0, 0, 130042);
                boolean zAdmob = c6956l.admob(c6111l);
                Object objM2132native = c6956l.m2132native();
                if (zAdmob || objM2132native == C1867l.yandex) {
                    z = false;
                    C10832l c10832l = new C10832l(0, c6111l, C6111l.class, "callLibrarySyncDialog", "callLibrarySyncDialog()V", 0, 0, 15);
                    c6956l.m2147try(c10832l);
                    objM2132native = c10832l;
                } else {
                    z = false;
                }
                C6956l c6956l6 = c6956l;
                AbstractC17457l.mopub((Function0) ((InterfaceC5059l) objM2132native), null, false, null, null, null, AbstractC11852l.loadAd, c6956l6, 805306368, 510);
                c6956l6.startapp(z);
                c6956l3 = c6956l6;
                z2 = z;
            }
            c6956l3.startapp(true);
            c6956l3.startapp(true);
            c6956l2 = c6956l3;
            r13 = z2;
        } else {
            i = i;
            r13 = 0;
            c6111l = c6111l;
            c6956l4.m2124else();
            c6956l2 = c6956l4;
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5383l(c6111l, i, r13);
        }
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final void m1942implements(CachedPlaylist cachedPlaylist, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(664043907);
        int i2 = i | (c6956l2.billing(cachedPlaylist) ? 4 : 2) | (c6956l2.billing(interfaceC17242l) ? 32 : 16);
        if (c6956l2.m2127for(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objM2132native = c6956l2.m2132native();
            if (z || objM2132native == C1867l.yandex) {
                objM2132native = AbstractC9769l.loadAd(cachedPlaylist);
                c6956l2.m2147try(objM2132native);
            }
            String str = (String) objM2132native;
            InterfaceC17242l interfaceC17242lVip = AbstractC0080l.vip(interfaceC17242l, 131.0f);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l2, 0);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lVip);
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
            AbstractC7741l.amazon(cachedPlaylist, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l, 131.0f), AbstractC13106l.billing(c6956l2).crashlytics), null, null, c6956l, 48, 2040);
            AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 8.0f));
            InterfaceC17242l interfaceC17242lVip2 = AbstractC0080l.vip(c4346l, 131.0f);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(2.0f, true, new C8339l(12)), C18450l.f36040l, c6956l, 54);
            long j2 = c6956l.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lVip2);
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
            String strInmobi = cachedPlaylist.inmobi();
            C11090l c11090l = AbstractC13106l.admob(c6956l).remoteconfig;
            long j3 = AbstractC13106l.purchase(c6956l).adcel;
            C6886l c6886l = C6886l.f14425l;
            AbstractC13010l.loadAd(strInmobi, null, j3, 0L, null, c6886l, null, 0L, null, 0L, 2, false, 1, 0, c11090l, c6956l, 1572864, 24960, 110522);
            if (cachedPlaylist.m4621volatile()) {
                c6956l.m2123default(-951680122);
                AbstractC5889l.amazon(AbstractC0080l.isPro(c4346l, 16.0f), 0L, c6956l, 6, 2);
            } else {
                c6956l.m2123default(-991572379);
            }
            c6956l.startapp(false);
            c6956l.startapp(true);
            String strIsVip = cachedPlaylist.isVip();
            if (strIsVip == null) {
                strIsVip = "";
            }
            AbstractC13010l.loadAd(strIsVip, null, AbstractC13106l.purchase(c6956l).subscription, 0L, null, c6886l, null, 0L, null, 0L, 2, false, 1, 0, AbstractC13106l.admob(c6956l).remoteconfig, c6956l, 1572864, 24960, 110522);
            c6956l2 = c6956l;
            if (str.length() > 0) {
                c6956l2.m2123default(-296417542);
                AbstractC13010l.loadAd(str, null, AbstractC13106l.purchase(c6956l2).subscription, 0L, null, c6886l, null, 0L, null, 0L, 2, false, 1, 0, AbstractC13106l.admob(c6956l2).remoteconfig, c6956l, 1572864, 24960, 110522);
                c6956l2 = c6956l;
            } else {
                c6956l2.m2123default(-336870775);
            }
            c6956l2.startapp(false);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3411l(this, cachedPlaylist, interfaceC17242l, i, 3);
        }
    }

    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    public final C3729l m1943l() {
        return (C3729l) this.f12901l.getValue();
    }

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public final void m1944l(C6956l c6956l, int i) {
        c6956l.m2133new(-2132841510);
        int i2 = 2;
        int i3 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C0131l(this, i2);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(AbstractC11852l.admob, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), null, null, AbstractC11852l.isPro, null, null, c6956l, 24582, 492);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5383l(this, i, 6);
        }
    }

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public final void m1945l(InterfaceC6942l interfaceC6942l, InterfaceC6942l interfaceC6942l2, InterfaceC6942l interfaceC6942l3, C6956l c6956l, int i) {
        C6111l c6111l;
        c6956l.m2133new(1206931097);
        int i2 = i | (c6956l.admob(interfaceC6942l) ? 4 : 2) | (c6956l.admob(interfaceC6942l2) ? 32 : 16) | (c6956l.admob(interfaceC6942l3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.admob(this) ? 2048 : 1024);
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            int iOrdinal = ((EnumC7195l) AbstractC3700l.amazon(this.f12898l, c6956l, 0).getValue()).ordinal();
            Integer[] numArr = {Integer.valueOf(R.string.cache_track_selector_my_library), Integer.valueOf(R.string.cache_track_selector_manual_library), Integer.valueOf(R.string.cache_track_selector_all)};
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(AbstractC3605l.vip(c4346l, 0.0f, 8.0f, 1), 1.0f);
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l, 0);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
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
            AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            c6111l = this;
            AbstractC3951l.yandex(iOrdinal, AbstractC15042l.adcel(new C9247l(1.0f, true), AbstractC15042l.pro()), C9735l.isPro, 0L, 16.0f, 0.0f, 8.0f, AbstractC14566l.amazon(1961952532, new C8821l(iOrdinal, 0), c6956l), AbstractC14566l.amazon(-1278168749, new C5418l(numArr, iOrdinal, interfaceC6942l, interfaceC6942l2, interfaceC6942l3, this), c6956l), c6956l, 115040640);
            c6111l.m1947l(AbstractC3605l.startapp(c4346l, 0.0f, 0.0f, 8.0f, 0.0f, 11), c6956l, ((i2 >> 6) & 112) | 6);
            c6956l.startapp(true);
        } else {
            c6111l = this;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2104l(c6111l, interfaceC6942l, interfaceC6942l2, interfaceC6942l3, i, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: lَٖؕ, reason: contains not printable characters */
    public final Object m1946l(AbstractC0283l abstractC0283l) {
        C12401l c12401l;
        C5198l c5198l;
        if (abstractC0283l instanceof C12401l) {
            c12401l = (C12401l) abstractC0283l;
            int i = c12401l.f24493l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12401l.f24493l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12401l = new C12401l(this, abstractC0283l);
            }
        } else {
            c12401l = new C12401l(this, abstractC0283l);
        }
        Object objM3168l = c12401l.f24494l;
        int i2 = c12401l.f24493l;
        int i3 = 5;
        int i4 = 1;
        InterfaceC14029l interfaceC14029l = null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objM3168l);
            C6336l c6336l = C6336l.yandex;
            c12401l.f24493l = 1;
            objM3168l = C6336l.loadAd.m3168l(c12401l);
            if (objM3168l != enumC9342l) {
            }
            return enumC9342l;
        }
        if (i2 == 1) {
            AbstractC2829l.crashlytics(objM3168l);
        } else {
            if (i2 != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c5198l = c12401l.f24495l;
            AbstractC2829l.crashlytics(objM3168l);
        }
        C2336l c2336l = AbstractC18202l.yandex;
        C14194l c14194l = new C14194l(AbstractC4338l.startapp(c5198l.m1735l(c2336l.loadAd(CachedPlaylistLibrary.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).purchase()), 2);
        C14300l c14300l = new C14300l(c5198l.m1735l(c2336l.loadAd(CachedTrack.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).yandex().ads(), 6);
        StringBuilder sb = new StringBuilder();
        C16287l.yandex.getClass();
        sb.append(C16287l.crashlytics());
        sb.append("_-1337");
        C12867l c12867lStartapp = AbstractC4338l.startapp(c5198l.m1735l(c2336l.loadAd(CachedPlaylist.class), "uid == $0", Arrays.copyOf(new Object[]{sb.toString()}, 1)).purchase());
        C12867l c12867lStartapp2 = AbstractC4338l.startapp(c5198l.m1735l(c2336l.loadAd(CachedLibrary.class), "uid == $0", Arrays.copyOf(new Object[]{new Long(C16287l.crashlytics())}, 1)).purchase());
        C14194l c14194l2 = new C14194l(c12867lStartapp, 3);
        C14194l c14194l3 = new C14194l(c12867lStartapp2, 4);
        C14300l c14300l2 = new C14300l(AbstractC4338l.adcel(c5198l.m1735l(c2336l.loadAd(CachedTrack.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).loadAd("uid", new String[0])), 7);
        this.f12901l.setValue(new C3729l(c14194l, c14300l, new C8766l(new C2606l(new InterfaceC6942l[]{c14194l2, c14194l3, c14300l2, this.f12898l}, new C13262l(5, null), 3), this.f12900l, new C13749l(3, interfaceC14029l, 9), i4), new C14970l(9, c14194l2), new C14970l(10, c14194l3), new C14300l(c5198l.m1735l(c2336l.loadAd(CachedTrack.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).loadAd("uid", new String[0]).yandex().ads(), 8)));
        return Unit.INSTANCE;
        C5198l c5198l2 = (C5198l) objM3168l;
        c12401l.f24495l = c5198l2;
        c12401l.f24493l = 2;
        C6336l c6336l2 = C6336l.yandex;
        Object objMopub = C6336l.mopub(new C8578l(i3), c12401l);
        if (objMopub != enumC9342l) {
            objMopub = Unit.INSTANCE;
        }
        if (objMopub != enumC9342l) {
            c5198l = c5198l2;
            C2336l c2336l2 = AbstractC18202l.yandex;
            C14194l c14194l4 = new C14194l(AbstractC4338l.startapp(c5198l.m1735l(c2336l2.loadAd(CachedPlaylistLibrary.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).purchase()), 2);
            C14300l c14300l3 = new C14300l(c5198l.m1735l(c2336l2.loadAd(CachedTrack.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).yandex().ads(), 6);
            StringBuilder sb2 = new StringBuilder();
            C16287l.yandex.getClass();
            sb2.append(C16287l.crashlytics());
            sb2.append("_-1337");
            C12867l c12867lStartapp3 = AbstractC4338l.startapp(c5198l.m1735l(c2336l2.loadAd(CachedPlaylist.class), "uid == $0", Arrays.copyOf(new Object[]{sb2.toString()}, 1)).purchase());
            C12867l c12867lStartapp4 = AbstractC4338l.startapp(c5198l.m1735l(c2336l2.loadAd(CachedLibrary.class), "uid == $0", Arrays.copyOf(new Object[]{new Long(C16287l.crashlytics())}, 1)).purchase());
            C14194l c14194l5 = new C14194l(c12867lStartapp3, 3);
            C14194l c14194l6 = new C14194l(c12867lStartapp4, 4);
            C14300l c14300l4 = new C14300l(AbstractC4338l.adcel(c5198l.m1735l(c2336l2.loadAd(CachedTrack.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).loadAd("uid", new String[0])), 7);
            this.f12901l.setValue(new C3729l(c14194l4, c14300l3, new C8766l(new C2606l(new InterfaceC6942l[]{c14194l5, c14194l6, c14300l4, this.f12898l}, new C13262l(5, null), 3), this.f12900l, new C13749l(3, interfaceC14029l, 9), i4), new C14970l(9, c14194l5), new C14970l(10, c14194l6), new C14300l(c5198l.m1735l(c2336l2.loadAd(CachedTrack.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).loadAd("uid", new String[0]).yandex().ads(), 8)));
            return Unit.INSTANCE;
        }
        return enumC9342l;
    }

    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public final void m1947l(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(1901768353);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(this) ? 32 : 16;
        }
        int i4 = 18;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC8714l interfaceC8714lAmazon = AbstractC3700l.amazon(this.f12900l, c6956l, 0);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC8020l.smaato(Boolean.FALSE);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C1528l(interfaceC8714l, 1);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC7470l.billing((Function0) objM2132native2, interfaceC17242l, false, null, null, null, AbstractC14566l.amazon(-1591143613, new C3411l(interfaceC8714lAmazon, interfaceC8714l, this, i3), c6956l), c6956l, ((i2 << 3) & 112) | 1572870, 60);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(this, interfaceC17242l, i, i4);
        }
    }

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public final void m1948l(Function0 function0, C6956l c6956l, int i) {
        Function0 function1;
        C6956l c6956l2;
        c6956l.m2133new(1243752514);
        int i2 = (c6956l.admob(function0) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            function1 = function0;
            c6956l2 = c6956l;
            AbstractC17457l.mopub(function1, null, false, null, null, null, AbstractC11852l.purchase, c6956l2, (i2 & 14) | 805306368, 510);
        } else {
            function1 = function0;
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10848l(this, function1, i, 29);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        C6111l c6111l = this;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(1587438653);
        int i2 = (c6956l2.admob(c6111l) ? 4 : 2) | i;
        int i3 = 0;
        if (c6956l2.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            boolean zAdmob = c6956l2.admob(c6111l);
            Object objM2132native = c6956l2.m2132native();
            InterfaceC14029l interfaceC14029l = null;
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                objM2132native = new C1289l(c6111l, null, 0);
                c6956l2.m2147try(objM2132native);
            }
            AbstractC12311l.amazon(c6956l2, unit, (Function2) objM2132native);
            C3729l c3729lM1943l = c6111l.m1943l();
            C5866l c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l2);
            InterfaceC6942l interfaceC6942l = c3729lM1943l.yandex;
            C11507l c11507l = C11507l.f23131l;
            C5268l c5268l = c6111l.f34614l;
            InterfaceC8714l interfaceC8714lCrashlytics = AbstractC3700l.crashlytics(interfaceC6942l, c11507l, c5268l, c6956l2, 48, 12);
            InterfaceC8714l interfaceC8714lCrashlytics2 = AbstractC3700l.crashlytics(c3729lM1943l.crashlytics, c11507l, c5268l, c6956l, 48, 12);
            InterfaceC8714l interfaceC8714lCrashlytics3 = AbstractC3700l.crashlytics(c3729lM1943l.loadAd, EnumC5154l.f11200l, c5268l, c6956l, 48, 12);
            InterfaceC8714l interfaceC8714lPurchase = AbstractC3700l.purchase(c6111l.f12898l, c5268l, c6956l);
            Boolean bool = (Boolean) c6111l.f12899l.getValue();
            bool.booleanValue();
            boolean zAdmob2 = c6956l.admob(c6111l) | c6956l.billing(c5866lYandex);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob2 || objM2132native2 == c13863l) {
                objM2132native2 = new C15352l(c6111l, c5866lYandex, interfaceC14029l, i3);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC12311l.amazon(c6956l, bool, (Function2) objM2132native2);
            int i4 = 7;
            if (((Boolean) c6111l.f12896l.getValue()).booleanValue()) {
                c6956l.m2123default(-498714289);
                c6111l.m1941finally(c6956l, i2 & 14);
                c6956l.startapp(false);
                C4224l c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C5383l(c6111l, i, i4);
                    return;
                }
                return;
            }
            c6956l.m2123default(-511767707);
            c6956l.startapp(false);
            if (((EnumC5154l) interfaceC8714lCrashlytics3.getValue()) != EnumC5154l.f11199l) {
                c6956l.m2123default(-498456927);
                C17253l c17253lAmazon = AbstractC3605l.amazon(0.0f, 0.0f, 0.0f, 16.0f, 7);
                boolean zAdmob3 = c6956l.admob(c6111l) | c6956l.billing(interfaceC8714lCrashlytics) | c6956l.billing(interfaceC8714lPurchase) | c6956l.billing(interfaceC8714lCrashlytics2);
                Object objM2132native3 = c6956l.m2132native();
                if (zAdmob3 || objM2132native3 == c13863l) {
                    C17796l c17796l = new C17796l(c6111l, interfaceC8714lCrashlytics, interfaceC8714lPurchase, interfaceC8714lCrashlytics2, 16);
                    c6956l.m2147try(c17796l);
                    objM2132native3 = c17796l;
                }
                AbstractC16336l.yandex(null, c5866lYandex, c17253lAmazon, null, null, null, false, null, (Function1) objM2132native3, c6956l, 384, 505);
                c6956l2 = c6956l;
                c6956l2.startapp(false);
            } else {
                c6111l = c6111l;
                c6956l2 = c6956l;
                c6956l2.m2123default(-493987006);
                c6111l.m1941finally(c6956l2, i2 & 14);
                c6956l2.startapp(false);
            }
        } else {
            c6111l = c6111l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds2 = c6956l2.ads();
        if (c4224lAds2 != null) {
            c4224lAds2.amazon = new C5383l(c6111l, i, 8);
        }
    }

    @Override // defpackage.AbstractC10581l, defpackage.AbstractC17777l
    public final void premium() {
        super.premium();
        InterfaceC14029l interfaceC14029l = null;
        C14019l c14019l = new C14019l(this, interfaceC14029l, 17);
        C8490l c8490l = AbstractC6025l.yandex;
        C8084l c8084l = AbstractC6025l.loadAd;
        C2347l c2347l = new C2347l(new C14300l(c8084l, 9), new C15352l(c14019l, interfaceC14029l, 2), 2);
        C5268l c5268l = this.f34614l;
        EnumC8981l enumC8981l = EnumC8981l.f18524l;
        AbstractC0622l.startapp(AbstractC14024l.startapp(c2347l, c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
        AbstractC0622l.startapp(AbstractC14024l.startapp(new C2347l(new C14300l(c8084l, 10), new C15352l(new C1289l(this, null, 1), interfaceC14029l, 4), 2), c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
    }

    @Override // defpackage.InterfaceC9909l
    public final void pro() {
        this.f12899l.setValue(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final void m1949protected(C6956l c6956l, int i) {
        c6956l.m2133new(-606975154);
        int i2 = 4;
        int i3 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                C10832l c10832l = new C10832l(0, this, C6111l.class, "dispatchAssetMigrationConfirmation", "dispatchAssetMigrationConfirmation()V", 0, 0, 16);
                c6956l.m2147try(c10832l);
                objM2132native = c10832l;
            }
            AbstractC3383l.loadAd((Function0) ((InterfaceC5059l) objM2132native), AbstractC3605l.vip(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 16.0f, 0.0f, 2), false, null, null, null, null, AbstractC11852l.billing, c6956l, 100663344, 252);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5383l(this, i, i2);
        }
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m1950public(InterfaceC17242l interfaceC17242l, Function2 function2, Function2 function3, C6956l c6956l, int i) {
        Function2 function4;
        InterfaceC17242l interfaceC17242l2;
        c6956l.m2133new(1267461068);
        int i2 = i | 6;
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c4346l, 6.0f, 0.0f, 2);
            C17253l c17253l = C12719l.yandex;
            InterfaceC17242l interfaceC17242lMopub = AbstractC0080l.mopub(interfaceC17242lVip, C12719l.billing(), 0.0f, 2);
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l, 48);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
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
            AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            function2.invoke(c6956l, 6);
            AbstractC9334l.yandex(c6956l, new C9247l(1.0f, true));
            function4 = function3;
            function4.invoke(c6956l, 6);
            c6956l.startapp(true);
            interfaceC17242l2 = c4346l;
        } else {
            function4 = function3;
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2104l(this, interfaceC17242l2, function2, function4, i, 20);
        }
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public final void m1951return(int i, C6956l c6956l, InterfaceC17242l interfaceC17242l, Function0 function0, Function0 function1) {
        c6956l.m2133new(-272938085);
        int i2 = (c6956l.admob(function0) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 131) != 130)) {
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36040l, c6956l, 54);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
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
            AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            AbstractC3383l.loadAd(function0, new C9247l(1.0f, true), false, null, null, null, null, AbstractC11852l.crashlytics, c6956l, (i2 & 14) | 100663296, 252);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2104l(this, function0, function1, interfaceC17242l, i, 21);
        }
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void m1952this(String str, int i, Function0 function0, Function2 function2, C6956l c6956l, int i2) {
        Function0 function1;
        Function2 function3;
        c6956l.m2133new(-2090760203);
        int i3 = i2 | (c6956l.billing(str) ? 4 : 2) | (c6956l.amazon(i) ? 32 : 16) | 3456;
        if (c6956l.m2127for(i3 & 1, (i3 & 1171) != 1170)) {
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = new C5146l(21);
                c6956l.m2147try(objM2132native);
            }
            C17253l c17253l = C12719l.yandex;
            function1 = (Function0) objM2132native;
            AbstractC17457l.mopub(function1, null, false, null, C12719l.subs(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel, 0L, c6956l, 13), null, AbstractC14566l.amazon(548190514, new C6668l(str, i), c6956l), c6956l, 805306374, 494);
            function3 = AbstractC11852l.amazon;
        } else {
            c6956l.m2124else();
            function1 = function0;
            function3 = function2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17983l(this, str, i, function1, function3, i2);
        }
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final void m1953transient(C6956l c6956l, int i) {
        C6956l c6956l2;
        c6956l.m2133new(-521113134);
        int i2 = i & 1;
        int i3 = 2;
        if (c6956l.m2127for(i2, i2 != 0)) {
            c6956l2 = c6956l;
            AbstractC3383l.amazon(AbstractC3605l.vip(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 16.0f, 0.0f, 2), null, null, null, null, AbstractC11852l.metrica, c6956l2, 196614, 30);
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5383l(this, i, i3);
        }
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final void m1954try(C6956l c6956l, int i) {
        c6956l.m2133new(105336025);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC3383l.amazon(AbstractC3605l.vip(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 16.0f, 0.0f, 2), null, null, null, null, AbstractC14566l.amazon(-1025649179, new C12572l(this, 7), c6956l), c6956l, 196614, 30);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5383l(this, i, i3);
        }
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f12897l.f36440l;
    }
}
