package defpackage;

import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lُٟٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15068l extends AbstractC10581l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final C8195l f29595l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final InterfaceC11210l f29596l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C10086l f29597l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C10086l f29598l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final InterfaceC6942l f29599l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10086l f29600l;

    public C15068l(InterfaceC11210l interfaceC11210l) {
        this.f29596l = interfaceC11210l;
        Boolean bool = Boolean.FALSE;
        this.f29600l = AbstractC8020l.smaato(bool);
        this.f29597l = AbstractC8020l.smaato(bool);
        this.f29598l = AbstractC8020l.smaato("");
        this.f29599l = interfaceC11210l.subs();
        this.f29595l = interfaceC11210l.loadAd();
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public static void m3920this(C15068l c15068l, CachedTrack cachedTrack, boolean z, int i) {
        InterfaceC14029l interfaceC14029l = null;
        CachedTrack cachedTrack2 = (i & 1) != 0 ? null : cachedTrack;
        boolean z2 = (i & 2) != 0 ? false : z;
        c15068l.getClass();
        AbstractC10999l.mopub(AbstractC11990l.firebase(c15068l), AbstractC11463l.yandex, 0, new C8122l(c15068l, cachedTrack2, z2, interfaceC14029l, 1), 2);
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m3921finally(CachedTrack cachedTrack, C6956l c6956l, int i) {
        C6956l c6956l2;
        c6956l.m2133new(354686814);
        int i2 = 2;
        int i3 = (c6956l.admob(cachedTrack) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            boolean zAdmob = c6956l.admob(cachedTrack) | c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                objM2132native = new C14778l(cachedTrack, this);
                c6956l.m2147try(objM2132native);
            }
            Function0 function0 = (Function0) objM2132native;
            boolean zAdmob2 = c6956l.admob(this) | c6956l.admob(cachedTrack);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob2 || objM2132native2 == c13863l) {
                objM2132native2 = new C14778l(this, cachedTrack);
                c6956l.m2147try(objM2132native2);
            }
            c6956l2 = c6956l;
            AbstractC0133l.amazon(AbstractC14566l.amazon(681607404, new C7442l(this, cachedTrack, 14), c6956l), AbstractC14566l.amazon(917777227, new C11548l(cachedTrack, i2), c6956l), AbstractC3605l.remoteconfig(AbstractC0080l.amazon(AbstractC9151l.amazon(C4346l.f8873l, null, function0, null, (Function0) objM2132native2, 239), 1.0f), 16.0f, 6.0f), AbstractC14566l.amazon(1390116873, new C11548l(cachedTrack, 3), c6956l), c6956l2, 3126, 0);
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Cpublic(this, cachedTrack, i, 29);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        InterfaceC8714l interfaceC8714l;
        boolean z;
        C15068l c15068l = this;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(1399492791);
        int i2 = 2;
        int i3 = i | (c6956l2.admob(c15068l) ? 4 : 2);
        int i4 = 1;
        if (c6956l2.m2127for(i3 & 1, (i3 & 3) != 2)) {
            InterfaceC8714l interfaceC8714lCrashlytics = AbstractC3700l.crashlytics(c15068l.f29599l, C11507l.f23131l, c15068l.f34614l, c6956l2, 48, 12);
            if (((Boolean) c15068l.f29597l.getValue()).booleanValue()) {
                c6956l2.m2123default(1042490771);
                boolean zAdmob = c6956l2.admob(c15068l);
                Object objM2132native = c6956l2.m2132native();
                if (zAdmob || objM2132native == C1867l.yandex) {
                    objM2132native = new C13462l(c15068l, i4);
                    c6956l2.m2147try(objM2132native);
                }
                interfaceC8714l = interfaceC8714lCrashlytics;
                z = false;
                AbstractC16291l.yandex((Function0) objM2132native, AbstractC14566l.amazon(1055489674, new C5463l(c15068l, i2), c6956l2), null, AbstractC14566l.amazon(269491784, new C5463l(c15068l, 3), c6956l2), AbstractC2426l.f5204l, AbstractC2426l.f5203l, AbstractC2426l.f5207l, null, 0L, 0L, 0L, 0L, null, c6956l, 1797168, 0, 16260);
                c6956l2 = c6956l;
            } else {
                interfaceC8714l = interfaceC8714lCrashlytics;
                z = false;
                c6956l2.m2123default(1038105387);
            }
            c6956l2.startapp(z);
            c15068l = this;
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(827507835, new C5463l(this, 4), c6956l2), null, null, null, 0, 0L, 0L, ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).amazon(c6956l2), AbstractC14566l.amazon(1050745990, new C7442l((Object) this, (InterfaceC12244l) interfaceC8714l, 15), c6956l2), c6956l2, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5463l(c15068l, i, 5);
        }
    }

    @Override // defpackage.AbstractC10581l, defpackage.AbstractC17777l
    public final void premium() {
        super.premium();
        this.f29598l.setValue(this.f29596l.crashlytics(this.f34617l));
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m3922public(C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1741868998);
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
            c4224lAds.amazon = new C5463l(this, i, 0);
        }
    }
}
