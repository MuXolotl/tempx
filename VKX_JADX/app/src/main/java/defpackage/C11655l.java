package defpackage;

import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lِؗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11655l extends AbstractC10581l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f23368l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C10086l f23369l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final InterfaceC6942l f23370l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10086l f23371l;

    /* JADX WARN: Code duplicated, block: B:7:0x006c  */
    public C11655l() {
        InterfaceC6942l c14970l;
        Boolean bool = Boolean.FALSE;
        this.f23368l = AbstractC8020l.smaato(bool);
        C7206l c7206l = C7206l.yandex;
        this.f23371l = AbstractC8020l.smaato(Boolean.valueOf(!C7206l.crashlytics(EnumC10788l.f21803l)));
        this.f23369l = AbstractC8020l.smaato(bool);
        C5198l c5198lM3161l = C6336l.loadAd.m3161l();
        if (c5198lM3161l != null) {
            StringBuilder sb = new StringBuilder();
            C16287l.yandex.getClass();
            sb.append(C16287l.crashlytics());
            sb.append("_-1337");
            InterfaceC6942l interfaceC6942lAdcel = AbstractC4338l.adcel(c5198lM3161l.m1735l(AbstractC18202l.yandex.loadAd(CachedPlaylist.class), "uid == $0", Arrays.copyOf(new Object[]{sb.toString()}, 1)));
            if (interfaceC6942lAdcel != null) {
                c14970l = new C10424l(interfaceC6942lAdcel, 25);
            } else {
                c14970l = new C14970l(5, C11507l.f23131l);
            }
        } else {
            c14970l = new C14970l(5, C11507l.f23131l);
        }
        this.f23370l = c14970l;
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public static void m3179break(C11655l c11655l, CachedTrack cachedTrack, boolean z, int i) {
        InterfaceC14029l interfaceC14029l = null;
        CachedTrack cachedTrack2 = (i & 1) != 0 ? null : cachedTrack;
        boolean z2 = (i & 2) != 0 ? false : z;
        c11655l.getClass();
        AbstractC10999l.mopub(AbstractC11990l.firebase(c11655l), AbstractC11463l.yandex, 0, new C8122l(c11655l, cachedTrack2, z2, interfaceC14029l, 6), 2);
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m3180finally(C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(144263844);
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
            c4224lAds.amazon = new C1039l(this, i, 5);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        InterfaceC8714l interfaceC8714l;
        boolean z;
        C11655l c11655l = this;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1073213151);
        int i2 = i | (c6956l2.admob(c11655l) ? 4 : 2);
        int i3 = 0;
        int i4 = 1;
        if (c6956l2.m2127for(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC8714l interfaceC8714lCrashlytics = AbstractC3700l.crashlytics(c11655l.f23370l, C11507l.f23131l, c11655l.f34614l, c6956l2, 48, 12);
            if (((Boolean) c11655l.f23369l.getValue()).booleanValue()) {
                c6956l2.m2123default(-356128509);
                boolean zAdmob = c6956l2.admob(c11655l);
                Object objM2132native = c6956l2.m2132native();
                if (zAdmob || objM2132native == C1867l.yandex) {
                    objM2132native = new C5865l(c11655l, i4);
                    c6956l2.m2147try(objM2132native);
                }
                interfaceC8714l = interfaceC8714lCrashlytics;
                z = false;
                AbstractC16291l.yandex((Function0) objM2132native, AbstractC14566l.amazon(-1374750476, new C1039l(c11655l, i3), c6956l2), null, AbstractC14566l.amazon(-768975694, new C1039l(c11655l, i4), c6956l2), AbstractC7039l.crashlytics, AbstractC7039l.amazon, AbstractC7039l.purchase, null, 0L, 0L, 0L, 0L, null, c6956l, 1797168, 0, 16260);
                c6956l2 = c6956l;
            } else {
                interfaceC8714l = interfaceC8714lCrashlytics;
                z = false;
                c6956l2.m2123default(-361560639);
            }
            c6956l2.startapp(z);
            c11655l = this;
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(1731738853, new C1039l(this, 2), c6956l2), null, null, null, 0, 0L, 0L, ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).amazon(c6956l2), AbstractC14566l.amazon(-199024912, new C0541l(this, interfaceC8714l, 13), c6956l2), c6956l2, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1039l(c11655l, i, 3);
        }
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m3181public(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(805797713);
        int i2 = i | (c6956l.admob(this) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                C5735l c5735l = new C5735l(0, this, C11655l.class, "processAboutHint", "processAboutHint()V", 0, 0, 9);
                c6956l.m2147try(c5735l);
                objM2132native = c5735l;
            }
            Function0 function0 = (Function0) ((InterfaceC5059l) objM2132native);
            boolean zAdmob2 = c6956l.admob(this);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob2 || objM2132native2 == c13863l) {
                C5735l c5735l2 = new C5735l(0, this, C11655l.class, "dismissAboutHint", "dismissAboutHint()V", 0, 0, 10);
                c6956l.m2147try(c5735l2);
                objM2132native2 = c5735l2;
            }
            m3182this(24630 | ((i2 << 12) & 458752), c6956l, interfaceC17242l, function0, (Function0) ((InterfaceC5059l) objM2132native2));
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3158l(this, interfaceC17242l, i, 9);
        }
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void m3182this(int i, C6956l c6956l, InterfaceC17242l interfaceC17242l, Function0 function0, Function0 function1) {
        int i2;
        c6956l.m2133new(-1519013394);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(AbstractC7039l.remoteconfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(AbstractC7039l.vip) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.admob(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 16384 : 8192;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 9363) != 9362)) {
            AbstractC3383l.yandex(interfaceC17242l, null, null, null, null, AbstractC14566l.amazon(623735100, new C0541l(function0, function1, 11), c6956l), c6956l, ((i2 >> 12) & 14) | 196608, 30);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17983l(this, function0, function1, interfaceC17242l, i, 9);
        }
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final void m3183transient(boolean z) {
        this.f23368l.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final void m3184try(CachedTrack cachedTrack, C6956l c6956l, int i) {
        C6956l c6956l2;
        c6956l.m2133new(2026203592);
        int i2 = 4;
        int i3 = (c6956l.admob(cachedTrack) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            boolean zAdmob = c6956l.admob(cachedTrack) | c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                objM2132native = new C1991l(cachedTrack, this);
                c6956l.m2147try(objM2132native);
            }
            Function0 function0 = (Function0) objM2132native;
            boolean zAdmob2 = c6956l.admob(this) | c6956l.admob(cachedTrack);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob2 || objM2132native2 == c13863l) {
                objM2132native2 = new C1991l(this, cachedTrack);
                c6956l.m2147try(objM2132native2);
            }
            c6956l2 = c6956l;
            AbstractC0133l.amazon(AbstractC14566l.amazon(2122905430, new C0541l(this, cachedTrack, 12), c6956l), AbstractC14566l.amazon(-1022229579, new C11548l(cachedTrack, i2), c6956l), AbstractC3605l.remoteconfig(AbstractC0080l.amazon(AbstractC9151l.amazon(C4346l.f8873l, null, function0, null, (Function0) objM2132native2, 239), 1.0f), 16.0f, 6.0f), AbstractC14566l.amazon(1277434995, new C11548l(cachedTrack, 5), c6956l), c6956l2, 3126, 0);
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3158l(this, cachedTrack, i, 7);
        }
    }
}
