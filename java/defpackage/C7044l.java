package defpackage;

import android.util.Log;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚْؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7044l extends AbstractC11801l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final C1817l f14757l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C15308l f14758l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f14759l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f14760l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C12647l f14761l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C11362l f14762l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C8688l f14763l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C17178l f14764l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public C7504l f14765l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f14766l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C15308l f14767l;

    public C7044l() {
        super(0);
        this.f14763l = new C8688l(new C1225l(this, 2));
        this.f14766l = AbstractC8020l.smaato(C14359l.yandex);
        this.f14762l = new C11362l();
        this.f14760l = AbstractC8020l.smaato(null);
        this.f14759l = AbstractC8020l.smaato(null);
        this.f14758l = new C15308l(0);
        this.f14767l = new C15308l(0);
        this.f14761l = new C12647l(this, 1);
        this.f14764l = new C17178l(this, 1);
        this.f14757l = new C1817l(this);
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m2159abstract(Function0 function0, C6956l c6956l, int i) {
        c6956l.m2133new(-1335050571);
        int i2 = i | (c6956l.admob(function0) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC15497l.loadAd(null, null, AbstractC14566l.amazon(-1107606214, new C0454l(3, function0), c6956l), null, null, 0, 0L, 0L, AbstractC10439l.yandex, C17423l.admob, c6956l, 805306752, 251);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3378l(this, function0, i, 1);
        }
    }

    @Override // defpackage.AbstractC11801l, defpackage.AbstractC2484l, defpackage.AbstractC17777l
    public final void appmetrica() {
        super.appmetrica();
        C1062l c1062lM2163public = m2163public();
        c1062lM2163public.firebase.crashlytics(c1062lM2163public, "discovery").purchase(new C9912l(18, c1062lM2163public));
        m2163public().subs();
        C7504l c7504l = this.f14765l;
        if (c7504l != null) {
            c7504l.ads(null);
        }
    }

    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: default */
    public final void mo1143default() {
        if (AbstractC8576l.yandex((InterfaceC6844l) this.f14766l.getValue(), C15228l.yandex)) {
            return;
        }
        super.mo1143default();
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m2160finally(InterfaceC6844l interfaceC6844l) {
        this.f14766l.setValue(interfaceC6844l);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m2161import(C6956l c6956l, int i) {
        C7044l c7044l;
        int i2;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(199917350);
        int i3 = i | (c6956l2.admob(this) ? 4 : 2);
        if (c6956l2.m2127for(i3 & 1, (i3 & 3) != 2)) {
            C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2);
            C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, C18450l.f36046l, c6956l2, 6);
            long j = c6956l2.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
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
            AbstractC8182l.billing(c6956l2, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            String strPurchase = AbstractC11999l.purchase(c6956l2, R.string.cdcm_sender_info_devices);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.vip, c6956l, 48, 0, 131064);
            c6956l2 = c6956l;
            i2 = 1;
            c7044l = this;
            AbstractC3383l.yandex(AbstractC0080l.mopub(c4346l, 0.0f, 320.0f, 1), null, null, null, null, AbstractC14566l.amazon(312732734, new C1350l(13, c7044l), c6956l2), c6956l2, 196614, 30);
            c6956l2.startapp(true);
        } else {
            c7044l = this;
            i2 = 1;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C16099l(c7044l, i, i2);
        }
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m2162instanceof(Function0 function0, C6956l c6956l, int i) {
        c6956l.m2133new(-1941641567);
        int i2 = 2;
        int i3 = i | (c6956l.admob(function0) ? 4 : 2);
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            AbstractC15497l.loadAd(null, null, AbstractC14566l.amazon(-1657209988, new C0454l(i2, function0), c6956l), null, null, 0, 0L, 0L, AbstractC10439l.yandex, C17423l.isPro, c6956l, 805306752, 251);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3378l(this, function0, i, 0);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        int i2;
        C13863l c13863l;
        int i3;
        C7044l c7044l = this;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-519168432);
        int i4 = i | (c6956l2.admob(c7044l) ? 4 : 2);
        if (c6956l2.m2127for(i4 & 1, (i4 & 3) != 2)) {
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l2);
            AbstractC11028l.billing(c6956l2, 0);
            C8195l c8195l = (C8195l) c7044l.f14760l.getValue();
            C13863l c13863l2 = C1867l.yandex;
            if (c8195l == null) {
                c6956l2.m2123default(-369311535);
                c6956l2.startapp(false);
                i2 = iAdmob;
                c13863l = c13863l2;
            } else {
                c6956l2.m2123default(-369311534);
                String str = (String) c8195l.f17098l;
                C3713l c3713l = (C3713l) c8195l.f17097l;
                boolean zAdmob = c6956l2.admob(c7044l) | c6956l2.billing(str);
                Object objM2132native = c6956l2.m2132native();
                if (zAdmob || objM2132native == c13863l2) {
                    objM2132native = new C17592l(c7044l, str, 0);
                    c6956l2.m2147try(objM2132native);
                }
                i2 = iAdmob;
                c13863l = c13863l2;
                AbstractC2426l.crashlytics((Function0) objM2132native, null, null, 0.0f, false, null, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.startapp, 0L, 0L, null, null, null, AbstractC14566l.amazon(-575530365, new Cprotected(c3713l, c7044l, str, 14), c6956l2), c6956l, 0, 8126);
                c6956l2 = c6956l;
                c6956l2.startapp(false);
                c7044l = this;
            }
            boolean zYandex = AbstractC8576l.yandex((InterfaceC6844l) c7044l.f14766l.getValue(), C15228l.yandex);
            Object objM2132native2 = c6956l2.m2132native();
            if (objM2132native2 == c13863l) {
                i3 = 2;
                objM2132native2 = new C11200l(2);
                c6956l2.m2147try(objM2132native2);
            } else {
                i3 = 2;
            }
            AbstractC10851l.loadAd(zYandex, (Function0) objM2132native2, c6956l2, 48);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-953261556, new C16099l(c7044l, i3), c6956l2), null, null, null, 0, 0L, 0L, ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).amazon(c6956l2), AbstractC14566l.amazon(1409244321, new C1866l(c7044l, i2, 3), c6956l2), c6956l2, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C16099l(c7044l, i, 3);
        }
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final C1062l m2163public() {
        return (C1062l) this.f14763l.getValue();
    }

    @Override // defpackage.AbstractC17777l
    /* JADX INFO: renamed from: throws */
    public final void mo2005throws() {
        super.mo2005throws();
        m2160finally(C14359l.yandex);
        C1062l c1062lM2163public = m2163public();
        C1041l c1041l = new C1041l();
        c1041l.f2891l = false;
        int i = 1;
        c1041l.f2887l = true;
        c1041l.f2898l = true;
        c1041l.f2897l = false;
        c1041l.f2888l = true;
        c1041l.f2889l = true;
        c1041l.f2900l = true;
        c1041l.f2895l = false;
        c1041l.f2902l = 0;
        c1041l.f2899l = 0;
        c1041l.f2903l = 0L;
        c1041l.f2890l = true;
        c1041l.f2894l = false;
        c1041l.f2904l = true;
        c1041l.f2893l = true;
        c1041l.f2892l = C9701l.f19785l;
        int[] iArr = c1041l.f2896l;
        if (iArr != null && iArr.length > 0) {
            c1041l.f2898l = false;
            c1041l.f2887l = false;
            c1041l.f2889l = false;
            c1041l.f2900l = false;
            c1041l.f2888l = false;
            for (int i2 : iArr) {
                if (i2 == 2) {
                    c1041l.f2887l = true;
                } else if (i2 != 11) {
                    if (i2 == 4) {
                        c1041l.f2898l = true;
                    } else if (i2 == 5) {
                        c1041l.f2888l = true;
                    } else if (i2 == 6) {
                        c1041l.f2900l = true;
                    } else if (i2 != 7) {
                        Log.d("NearbyConnections", "Illegal discovery medium " + i2);
                    } else {
                        c1041l.f2889l = true;
                    }
                }
            }
        }
        C18096l c18096lYandex = c1062lM2163public.firebase.yandex(c1062lM2163public, this.f14757l, "discovery");
        C3224l c3224l = c1062lM2163public.firebase;
        C13904l c13904lCrashlytics = C13568l.crashlytics();
        c13904lCrashlytics.f27205l = c18096lYandex;
        c13904lCrashlytics.f27204l = new C5633l(c1062lM2163public, c18096lYandex, c1041l);
        c13904lCrashlytics.f27203l = C13772l.f26885l;
        c13904lCrashlytics.f27201l = 1267;
        C3823l c3823lLoadAd = c3224l.loadAd(c1062lM2163public, c13904lCrashlytics.loadAd());
        C5008l c5008l = new C5008l(c1062lM2163public, c1041l);
        ExecutorC17086l executorC17086l = AbstractC8333l.yandex;
        c3823lLoadAd.billing(executorC17086l, c5008l);
        c3823lLoadAd.amazon(executorC17086l, C11140l.f22378l);
        c3823lLoadAd.billing(executorC17086l, new C2683l(12, new C17387l(this, i)));
        c3823lLoadAd.crashlytics(new C2683l(13, this));
    }
}
