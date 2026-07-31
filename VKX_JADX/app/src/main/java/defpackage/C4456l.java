package defpackage;

import android.app.Activity;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؖۢؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4456l extends AbstractC5097l {

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public static final /* synthetic */ int f9065l = 0;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final C10703l f9066l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f9067l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f9068l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C17731l f9069l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C4587l f9070l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C2603l f9071l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final C10086l f9072l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final InterfaceC13238l f9073l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final C10086l f9074l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final InterfaceC13508l f9075l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final InterfaceC13238l f9076l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4456l(InterfaceC13508l interfaceC13508l) {
        C2603l c2603l;
        super(false, 3);
        int i = 3;
        this.f9075l = interfaceC13508l;
        InterfaceC6684l interfaceC6684lSmaato = interfaceC13508l.smaato();
        if (interfaceC6684lSmaato != null) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            c2603l = new C2603l(interfaceC6684lSmaato, new C6335l(i3, this, C4456l.class, "dismiss", "dismiss()V", i4, i2, 7), new C6335l(i3, this, C4456l.class, "onBackPressed", "onBackPressed()V", i4, i2, 8));
        } else {
            c2603l = null;
        }
        this.f9071l = c2603l;
        this.f9069l = new C17731l(R.string.menu_linked_content_list, interfaceC13508l.admob(), new C3871l(this, i), new C6335l(0, this, C4456l.class, "getActivity", "getActivity()Landroid/app/Activity;", 0, 0, 6));
        this.f9068l = AbstractC8020l.smaato(EnumC16462l.f32182l);
        Boolean bool = Boolean.FALSE;
        this.f9067l = AbstractC8020l.smaato(bool);
        this.f9076l = interfaceC13508l.billing();
        this.f9070l = interfaceC13508l.ads();
        this.f9073l = interfaceC13508l.isPro();
        this.f9074l = AbstractC8020l.smaato(bool);
        this.f9066l = new C10703l(-1L);
        this.f9072l = AbstractC8020l.smaato("");
    }

    public final void ad(InterfaceC13238l interfaceC13238l, boolean z, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        InterfaceC17242l interfaceC17242l2;
        C4456l c4456l = this;
        c6956l.m2133new(-1202174514);
        int i2 = 4;
        boolean z2 = z;
        int i3 = i | (c6956l.billing(interfaceC13238l) ? 4 : 2) | (c6956l.mopub(z2) ? 32 : 16) | (c6956l.billing(c4456l) ? 2048 : 1024);
        if (c6956l.m2127for(i3 & 1, (i3 & 1171) != 1170)) {
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l, 0);
            long j = c6956l.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            interfaceC17242l2 = interfaceC17242l;
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l2);
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
            AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            c6956l.m2123default(-190584926);
            Iterator<E> it = interfaceC13238l.iterator();
            while (it.hasNext()) {
                C14843l c14843l = (C14843l) it.next();
                C9247l c9247l = new C9247l(1.0f, true);
                boolean zBilling = c6956l.billing(c14843l) | ((i3 & 7168) == 2048);
                Object objM2132native = c6956l.m2132native();
                if (zBilling || objM2132native == C1867l.yandex) {
                    objM2132native = new C12242l(c14843l, c4456l, i2);
                    c6956l.m2147try(objM2132native);
                }
                c4456l.pro(c14843l, z2, AbstractC9151l.loadAd(c9247l, false, null, (Function0) objM2132native, 15), c6956l, i3 & 7280);
                c4456l = this;
                z2 = z;
            }
            c6956l.startapp(false);
            c6956l.startapp(true);
        } else {
            interfaceC17242l2 = interfaceC17242l;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C7159l(this, interfaceC13238l, z, interfaceC17242l2, i, 2);
        }
    }

    public final void advert(InterfaceC13238l interfaceC13238l, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(301788189);
        int i2 = (c6956l2.billing(interfaceC13238l) ? 4 : 2) | i | (c6956l2.billing(this) ? 256 : 128);
        if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
            InterfaceC8714l interfaceC8714lAmazon = AbstractC3700l.amazon((C7549l) AbstractC16584l.yandex().billing.admob, c6956l2, 0);
            InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(C4346l.f8873l, 0.0f, 0.0f, 0.0f, ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).yandex(c6956l2), 7);
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
            boolean zBilling = c6956l2.billing(interfaceC8714lAmazon) | ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objM2132native = c6956l2.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new Ctransient(interfaceC13238l, this, interfaceC8714lAmazon, 11);
                c6956l2.m2147try(objM2132native);
            }
            AbstractC16336l.yandex(null, null, null, null, null, null, false, null, (Function1) objM2132native, c6956l, 0, 511);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9772l(this, interfaceC13238l, i, 15);
        }
    }

    public final void applovin(Function0 function0, Function0 function1, C6956l c6956l, int i) {
        Function0 function2;
        Function0 function3;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1676093299);
        int i2 = i | (c6956l2.admob(function0) ? 4 : 2) | (c6956l2.admob(function1) ? 32 : 16) | (c6956l2.billing(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
            float fYandex = ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).yandex(c6956l2) + 16.0f;
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l, 0.0f, 0.0f, 0.0f, fYandex, 7);
            C15089l c15089l = C18450l.f36034l;
            C11485l c11485l = AbstractC8313l.crashlytics;
            C1853l c1853lYandex = AbstractC1001l.yandex(c11485l, c15089l, c6956l2, 48);
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
            C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l2, 196608, 31);
            InterfaceC17242l interfaceC17242lPurchase = AbstractC13841l.purchase(c4346l, AbstractC13841l.crashlytics(c6956l2), true);
            C1853l c1853lYandex2 = AbstractC1001l.yandex(c11485l, c15089l, c6956l2, 48);
            long j2 = c6956l2.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lPurchase);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex2, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            String strPurchase = AbstractC11999l.purchase(c6956l2, R.string.library_remove_title);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.purchase, c6956l, 48, 0, 130040);
            c6956l2 = c6956l;
            AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 16.0f));
            isVip(this.f9070l, false, AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), c6956l2, ((i2 << 3) & 7168) | 432);
            AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 8.0f));
            m1550throws(c6956l2, (i2 >> 6) & 14);
            AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 16.0f));
            function2 = function0;
            function3 = function1;
            inmobi(function2, function3, c6956l2, i2 & 1022);
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            function2 = function0;
            function3 = function1;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17396l(this, function2, function3, i, 1);
        }
    }

    public final void appmetrica(C6956l c6956l, int i) {
        C6956l c6956l2;
        c6956l.m2133new(-87253200);
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
            c4224lAds.amazon = new C4625l(this, i, 2);
        }
    }

    public final void inmobi(Function0 function0, Function0 function1, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(860462146);
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
            AbstractC17457l.mopub(function0, null, false, null, null, null, AbstractC18323l.purchase, c6956l2, (i2 & 14) | 805306368, 510);
            AbstractC9334l.yandex(c6956l2, new C9247l(1.0f, true));
            AbstractC17457l.loadAd(function1, null, false, null, null, null, null, null, AbstractC18323l.billing, c6956l, ((i2 >> 3) & 14) | 805306368, 510);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17396l(this, function0, function1, i, 2);
        }
    }

    public final void isVip(C4587l c4587l, boolean z, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        int i2;
        C4456l c4456l = this;
        c6956l.m2133new(1783073799);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(c4587l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.mopub(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? c6956l.billing(c4456l) : c6956l.admob(c4456l) ? 2048 : 1024;
        }
        int i3 = i2;
        boolean z2 = false;
        if (c6956l.m2127for(i3 & 1, (i3 & 1171) != 1170)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = Boolean.valueOf(c4456l.f9075l.vip());
                c6956l.m2147try(objM2132native);
            }
            boolean zBooleanValue = ((Boolean) objM2132native).booleanValue();
            if ((i3 & 7168) == 2048 || ((i3 & 4096) != 0 && c6956l.admob(c4456l))) {
                z2 = true;
            }
            Object objM2132native2 = c6956l.m2132native();
            if (z2 || objM2132native2 == c13863l) {
                objM2132native2 = new C6335l(0, this, C4456l.class, "navigateToLinked", "navigateToLinked()V", 0, 0, 5);
                c4456l = this;
                c6956l.m2147try(objM2132native2);
            }
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC3383l.loadAd((Function0) ((InterfaceC5059l) objM2132native2), interfaceC17242l, zBooleanValue, null, AbstractC13880l.yandex(0L, 0L, ((C14370l) c6956l.isPro(c10707l)).yandex.f2317synchronized, ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, c6956l, 0, 3), null, null, AbstractC14566l.amazon(-305233028, new C5742l(c4587l, c4456l, zBooleanValue, z), c6956l), c6956l, ((i3 >> 3) & 112) | 100663680, 232);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5485l(c4456l, c4587l, z, interfaceC17242l, i, 3);
        }
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(-1183202326);
        int i2 = (c6956l.billing(this) ? 4 : 2) | i;
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            Unit unit = Unit.INSTANCE;
            boolean z = (i2 & 14) == 4;
            Object objM2132native2 = c6956l.m2132native();
            if (z || objM2132native2 == c13863l) {
                objM2132native2 = new C13624l(this, null, 9);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native2);
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(505837103, new C0741l(this, iAdmob, interfaceC2262l, 3), c6956l), c6956l, 12582912, 127);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4625l(this, i, i3);
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m1548package() {
        Activity activity = this.f5081l;
        AppActivity appActivity = activity instanceof AppActivity ? (AppActivity) activity : null;
        if (appActivity != null) {
            appActivity.applovin();
        }
        purchase();
    }

    public final void premium(Function0 function0, Function0 function1, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-59216108);
        int i2 = i | (c6956l2.admob(function0) ? 4 : 2) | (c6956l2.admob(function1) ? 32 : 16) | (c6956l2.billing(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
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
            String strPurchase = AbstractC11999l.purchase(c6956l2, R.string.cache_remove_title);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.purchase, c6956l, 48, 0, 130040);
            AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
            isVip(this.f9070l, false, AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), c6956l, ((i2 << 3) & 7168) | 432);
            AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 8.0f));
            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.cache_remove_desc_generic), AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.firebase, c6956l, 48, 0, 131064);
            c6956l2 = c6956l;
            AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 16.0f));
            inmobi(function0, function1, c6956l2, i2 & 1022);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17396l(this, function0, function1, i, 0);
        }
    }

    public final void pro(C14843l c14843l, boolean z, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        int i2;
        C14843l c14843l2;
        long j;
        c6956l.m2133new(1769076753);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(c14843l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.mopub(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = !c14843l.amazon || z;
            if (c14843l.crashlytics) {
                c6956l.m2123default(-724279752);
                j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.yandex;
            } else {
                c6956l.m2123default(-724278502);
                j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
            }
            c6956l.startapp(false);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
            long j2 = c6956l.f14595continue;
            int i3 = (int) (j2 ^ (j2 >>> 32));
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
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            C7537l c7537l = new C7537l(4.0f, true, new C8339l(12));
            C15089l c15089l = C18450l.f36034l;
            InterfaceC17242l interfaceC17242lYandex = AbstractC15788l.yandex(AbstractC3605l.startapp(C4346l.f8873l, 0.0f, 16.0f, 0.0f, 16.0f, 5), z2 ? 1.0f : 0.5f);
            C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, c15089l, c6956l, 54);
            boolean z3 = z2;
            long j3 = c6956l.f14595continue;
            int i4 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lYandex);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            c14843l2 = c14843l;
            AbstractC10478l.yandex(AbstractC5020l.startapp(j, AbstractC12502l.yandex), AbstractC14566l.amazon(-955640115, new C7371l(c14843l2, z3, 2), c6956l), c6956l, 56);
            c6956l.startapp(true);
            c6956l.startapp(true);
        } else {
            c14843l2 = c14843l;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5485l(this, c14843l2, z, interfaceC17242l, i, 2);
        }
    }

    public final void signatures(final C15413l c15413l, boolean z, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        InterfaceC17242l interfaceC17242l2;
        c6956l.m2133new(711848886);
        int i2 = 2;
        int i3 = i | (c6956l.billing(c15413l) ? 4 : 2) | (c6956l.mopub(z) ? 32 : 16) | (c6956l.billing(this) ? 2048 : 1024);
        final int i4 = 0;
        final int i5 = 1;
        if (c6956l.m2127for(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z2 = !c15413l.crashlytics || z;
            C15578l c15578l = !z2 ? AbstractC18323l.loadAd : null;
            boolean zMopub = ((i3 & 7168) == 2048) | ((i3 & 14) == 4) | c6956l.mopub(z2);
            Object objM2132native = c6956l.m2132native();
            if (zMopub || objM2132native == C1867l.yandex) {
                objM2132native = new C1027l(z2, c15413l, this, i2);
                c6956l.m2147try(objM2132native);
            }
            interfaceC17242l2 = interfaceC17242l;
            AbstractC13319l.yandex(AbstractC14566l.amazon(-351592684, new Function2() { // from class: lُؒۚ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i4;
                    C15413l c15413l2 = c15413l;
                    switch (i6) {
                        case 0:
                            C6956l c6956l2 = (C6956l) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, c15413l2.loadAd), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                            } else {
                                c6956l2.m2124else();
                            }
                            break;
                        default:
                            C6956l c6956l3 = (C6956l) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                AbstractC4597l.loadAd(AbstractC16759l.crashlytics(c15413l2.yandex, 0, c6956l3), AbstractC11999l.purchase(c6956l3, c15413l2.loadAd), null, 0L, c6956l3, 8, 12);
                            } else {
                                c6956l3.m2124else();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), AbstractC9151l.loadAd(interfaceC17242l2, false, null, (Function0) objM2132native, 15), null, null, AbstractC14566l.amazon(1393527320, new Function2() { // from class: lُؒۚ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    C15413l c15413l2 = c15413l;
                    switch (i6) {
                        case 0:
                            C6956l c6956l2 = (C6956l) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, c15413l2.loadAd), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                            } else {
                                c6956l2.m2124else();
                            }
                            break;
                        default:
                            C6956l c6956l3 = (C6956l) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                AbstractC4597l.loadAd(AbstractC16759l.crashlytics(c15413l2.yandex, 0, c6956l3), AbstractC11999l.purchase(c6956l3, c15413l2.loadAd), null, 0L, c6956l3, 8, 12);
                            } else {
                                c6956l3.m2124else();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c15578l, null, c6956l, 24582, 460);
        } else {
            interfaceC17242l2 = interfaceC17242l;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C7159l(this, c15413l, z, interfaceC17242l2, i, 3);
        }
    }

    @Override // defpackage.AbstractC2338l
    public final void subs() {
        EnumC16462l enumC16462l = (EnumC16462l) this.f9068l.getValue();
        EnumC16462l enumC16462l2 = EnumC16462l.f32182l;
        if (enumC16462l == enumC16462l2) {
            super.subs();
        } else {
            m1549synchronized(enumC16462l2);
        }
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m1549synchronized(EnumC16462l enumC16462l) {
        this.f9068l.setValue(enumC16462l);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void m1550throws(C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-1284876804);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c6956l.billing(this) : c6956l.admob(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        int i4 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            boolean z2 = this.f9066l.admob() > 0;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && c6956l.admob(this))) {
                z = true;
            }
            Object objM2132native = c6956l.m2132native();
            if (z || objM2132native == C1867l.yandex) {
                objM2132native = new C3871l(this, i3);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(AbstractC18323l.crashlytics, AbstractC9151l.loadAd(interfaceC17242lAmazon, z2, null, (Function0) objM2132native, 14), null, AbstractC14566l.amazon(-1183554403, new C4625l(this, 3), c6956l), AbstractC18323l.amazon, AbstractC14566l.amazon(-1999601633, new C7371l(this, z2, i3), c6956l), null, c6956l, 224262, 452);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1674l(this, i, i4);
        }
    }
}
