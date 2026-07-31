package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lْٟؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1026l extends AbstractC5097l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public static final /* synthetic */ int f2848l = 0;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f2849l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final Function0 f2850l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C3005l f2851l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C10703l f2852l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final AbstractC18643l f2853l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C10086l f2854l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f2855l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10086l f2856l;

    public C1026l(AbstractC18643l abstractC18643l, C3005l c3005l, Function0 function0) {
        super(false, 3);
        this.f2855l = AbstractC11990l.loadAd();
        this.f2853l = abstractC18643l;
        this.f2851l = c3005l;
        this.f2850l = function0;
        Boolean bool = Boolean.FALSE;
        this.f2849l = AbstractC8020l.smaato(bool);
        this.f2856l = AbstractC8020l.smaato(bool);
        this.f2852l = new C10703l(-1L);
        this.f2854l = AbstractC8020l.smaato("");
    }

    public final void ad(Function0 function0, Function0 function1, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-332687188);
        int i2 = i | (c6956l2.admob(function0) ? 4 : 2) | (c6956l2.admob(function1) ? 32 : 16);
        if (c6956l2.m2127for(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(C4346l.f8873l, 16.0f, 0.0f, 2);
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l2, 0);
            long j = c6956l2.f14595continue;
            int i3 = (int) ((j >>> 32) ^ j);
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
            AbstractC8182l.billing(c6956l2, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            AbstractC17457l.mopub(function0, null, false, null, null, null, AbstractC0124l.crashlytics, c6956l2, (i2 & 14) | 805306368, 510);
            AbstractC9334l.yandex(c6956l2, new C9247l(1.0f, true));
            AbstractC17457l.loadAd(function1, null, false, null, null, null, null, null, AbstractC0124l.amazon, c6956l, ((i2 >> 3) & 14) | 805306368, 510);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5396l(this, function0, function1, i, 0);
        }
    }

    public final void advert(C6956l c6956l, int i) {
        C6956l c6956l2;
        c6956l.m2133new(321572164);
        int i2 = i & 1;
        if (c6956l.m2127for(i2, i2 != 0)) {
            InterfaceC17242l interfaceC17242lMetrica = AbstractC3605l.metrica(C4346l.f8873l, 16.0f, 32.0f, 16.0f, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).yandex(c6956l) + 16.0f);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36034l, c6956l, 48);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lMetrica);
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
            AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            c6956l2 = c6956l;
            AbstractC4332l.amazon(null, 0L, 0L, 0, 0.0f, c6956l2, 0, 31);
            c6956l2.startapp(true);
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17956l(this, i, 3);
        }
    }

    public final void isVip(C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(1524671974);
        int i3 = 4;
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            boolean z = this.f2852l.admob() > 0;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C13802l(27, this);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(AbstractC0124l.yandex, AbstractC9151l.loadAd(interfaceC17242lAmazon, z, null, (Function0) objM2132native, 14), null, AbstractC14566l.amazon(2059305287, new C17956l(this, i3), c6956l), AbstractC0124l.loadAd, AbstractC14566l.amazon(-1708267959, new C7371l(this, z, 6), c6956l), null, c6956l, 224262, 452);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3216l(this, i, i4);
        }
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(1155309140);
        int i2 = 2;
        int i3 = (c6956l.admob(this) ? 4 : 2) | i;
        int i4 = 0;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l);
            Unit unit = Unit.INSTANCE;
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C16411l(this, null, i4);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native);
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(-1938184103, new C3216l(this, iAdmob, i4), c6956l), c6956l, 12582912, 127);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17956l(this, i, i2);
        }
    }

    public final void pro(Function0 function0, Function0 function1, C6956l c6956l, int i) {
        Function0 function2 = function0;
        Function0 function3 = function1;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1361936037);
        int i2 = i | (c6956l2.admob(function2) ? 4 : 2) | (c6956l2.admob(function3) ? 32 : 16) | (c6956l2.admob(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
            float fYandex = ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).yandex(c6956l2) + 16.0f;
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l, 0.0f, 0.0f, 0.0f, fYandex, 7);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36034l, c6956l2, 48);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lStartapp);
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
            C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l2, 196608, 31);
            String strPurchase = AbstractC11999l.purchase(c6956l2, R.string.library_remove_title);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.purchase, c6956l, 48, 0, 130040);
            c6956l2 = c6956l;
            AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 16.0f));
            int i4 = (i2 >> 6) & 14;
            signatures(c6956l2, i4);
            AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 8.0f));
            isVip(c6956l2, i4);
            AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 16.0f));
            function2 = function0;
            function3 = function1;
            ad(function2, function3, c6956l2, i2 & 1022);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5396l(this, function2, function3, i, 1);
        }
    }

    public final void signatures(C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(894885559);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        int i4 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC3383l.yandex(AbstractC3605l.vip(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 16.0f, 0.0f, 2), null, null, null, null, AbstractC14566l.amazon(142818309, new C7201l(this, i3), c6956l), c6956l, 196614, 30);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3216l(this, i, i4);
        }
    }

    @Override // defpackage.AbstractC2338l
    public final void smaato() {
        super.smaato();
        AbstractC11990l.billing(this, null);
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f2855l.f36440l;
    }
}
