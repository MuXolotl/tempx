package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًٍؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7883l extends AbstractC5097l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public static final /* synthetic */ int f16437l = 0;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f16438l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f16439l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f16440l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public C7504l f16441l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final Function3 f16442l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public C7504l f16443l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public boolean f16444l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final int f16445l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10086l f16446l;

    public C7883l(int i, Function3 function3) {
        super(false, 3);
        this.f16445l = i;
        this.f16442l = function3;
        this.f16440l = AbstractC8020l.smaato(EnumC3909l.f8051l);
        this.f16439l = AbstractC8020l.smaato(C12595l.yandex);
        this.f16438l = AbstractC8020l.smaato(C15166l.yandex);
        this.f16446l = AbstractC8020l.smaato(Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:55:0x0131  */
    /* JADX WARN: Code duplicated, block: B:58:0x013e A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:15:0x0035, B:56:0x0132, B:58:0x013e, B:60:0x014b, B:59:0x0144, B:22:0x004f, B:52:0x00fd, B:25:0x0064, B:48:0x00dc, B:44:0x00b3), top: B:71:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0144 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:15:0x0035, B:56:0x0132, B:58:0x013e, B:60:0x014b, B:59:0x0144, B:22:0x004f, B:52:0x00fd, B:25:0x0064, B:48:0x00dc, B:44:0x00b3), top: B:71:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
    
        if (r12.m2213throws(r13, r0) == r8) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object applovin(defpackage.C7883l r12, java.lang.String r13, defpackage.AbstractC0283l r14) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7883l.applovin(lًٍؒ, java.lang.String, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00da  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object appmetrica(C7883l c7883l, String str, AbstractC0283l abstractC0283l) {
        C8828l c8828l;
        Object c18435l;
        Throwable thYandex;
        String message;
        int i;
        C7644l c7644l;
        String str2;
        C7883l c7883l2;
        C1204l c1204lAd;
        String str3;
        c7883l.getClass();
        if (abstractC0283l instanceof C8828l) {
            c8828l = (C8828l) abstractC0283l;
            int i2 = c8828l.f18121l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8828l.f18121l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8828l = new C8828l(c7883l, abstractC0283l);
            }
        } else {
            c8828l = new C8828l(c7883l, abstractC0283l);
        }
        Object objSmaato = c8828l.f18120l;
        int i3 = c8828l.f18121l;
        InterfaceC14029l interfaceC14029l = null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i3 == 0) {
                AbstractC2829l.crashlytics(objSmaato);
                C0711l c0711lCrashlytics = AbstractC8725l.crashlytics.crashlytics(str);
                String str4 = (c0711lCrashlytics == null || (c1204lAd = c0711lCrashlytics.crashlytics.ad(2)) == null) ? null : c1204lAd.yandex;
                if (str4 == null) {
                    return Unit.INSTANCE;
                }
                C7644l c7644lLoadAd = AbstractC16584l.loadAd();
                C7644l c7644lLoadAd2 = AbstractC16584l.loadAd();
                c8828l.f18123l = str4;
                c8828l.f18122l = c7883l;
                c8828l.f18125l = c7644lLoadAd;
                i = 0;
                c8828l.f18119l = 0;
                c8828l.f18121l = 1;
                c7644lLoadAd2.getClass();
                objSmaato = c7644lLoadAd2.smaato(new C6208l(c7644lLoadAd2, interfaceC14029l, 12), c8828l);
                if (objSmaato != enumC9342l) {
                    c7644l = c7644lLoadAd;
                    str2 = str4;
                    c7883l2 = c7883l;
                }
                return enumC9342l;
            }
            if (i3 == 1) {
                int i4 = c8828l.f18119l;
                C7644l c7644l2 = c8828l.f18125l;
                C7883l c7883l3 = c8828l.f18122l;
                String str5 = c8828l.f18123l;
                AbstractC2829l.crashlytics(objSmaato);
                i = i4;
                c7883l2 = c7883l3;
                c7644l = c7644l2;
                str2 = str5;
            } else {
                if (i3 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c7883l2 = c8828l.f18122l;
                str3 = c8828l.f18123l;
                AbstractC2829l.crashlytics(objSmaato);
            }
            C14578l c14578l = (C14578l) AbstractC10802l.subs((AbstractC14237l) objSmaato);
            c7883l2.m2212synchronized(new C3416l(str3, c14578l.crashlytics, c14578l.purchase));
            c18435l = Unit.INSTANCE;
            thYandex = C1171l.yandex(c18435l);
            if (thYandex != null) {
                message = thYandex.getMessage();
                if (message == null) {
                    message = "";
                }
                c7883l.m2212synchronized(new C18578l(message));
            }
            return Unit.INSTANCE;
            c8828l.f18123l = str2;
            c8828l.f18122l = c7883l2;
            c8828l.f18125l = null;
            c8828l.f18119l = i;
            c8828l.f18121l = 2;
            C17464l c17464l = new C17464l("auth.setAuthCodeStatus", C13772l.f26877l);
            c17464l.yandex("auth_code", str2);
            c17464l.yandex("access_token", (String) objSmaato);
            objSmaato = c7644l.billing(c17464l, c8828l);
            if (objSmaato != enumC9342l) {
                str3 = str2;
                C14578l c14578l2 = (C14578l) AbstractC10802l.subs((AbstractC14237l) objSmaato);
                c7883l2.m2212synchronized(new C3416l(str3, c14578l2.crashlytics, c14578l2.purchase));
                c18435l = Unit.INSTANCE;
                thYandex = C1171l.yandex(c18435l);
                if (thYandex != null) {
                    message = thYandex.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    c7883l.m2212synchronized(new C18578l(message));
                }
                return Unit.INSTANCE;
            }
            return enumC9342l;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
    }

    public final void ad(C18578l c18578l, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1284375641);
        int i2 = i | (c6956l2.billing(c18578l) ? 4 : 2) | (c6956l2.admob(this) ? 32 : 16);
        if (c6956l2.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(c4346l, 32.0f);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36034l, c6956l2, 54);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lSmaato);
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
            AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.ic_error_outline_28, 0, c6956l2);
            InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(c4346l, 32.0f);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, interfaceC17242lIsPro, ((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, c6956l2, 440, 0);
            AbstractC13010l.loadAd(c18578l.yandex, null, ((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262138);
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C4624l(this, 6);
                c6956l.m2147try(objM2132native);
            }
            AbstractC17457l.loadAd((Function0) objM2132native, null, false, null, null, null, null, null, AbstractC6604l.metrica, c6956l, 805306368, 510);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10848l(this, c18578l, i, 15);
        }
    }

    public final void advert(C16464l c16464l, C6956l c6956l, int i) {
        C7883l c7883l;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-350584931);
        int i2 = i | (c6956l2.admob(c16464l) ? 4 : 2) | (c6956l2.admob(this) ? 32 : 16);
        if (c6956l2.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(AbstractC3605l.smaato(c4346l, 16.0f), 1.0f);
            int i3 = 12;
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36046l, c6956l2, 6);
            long j = c6956l2.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lAmazon);
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
            Integer numValueOf = Integer.valueOf(i4);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            String strPurchase = AbstractC11999l.purchase(c6956l2, R.string.auth2_qr_code_scanner_confirm);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.billing, c6956l, 0, 0, 131070);
            AbstractC3383l.yandex(null, null, null, null, null, AbstractC14566l.amazon(1496416645, new C16561l(13, c16464l), c6956l), c6956l, 196608, 31);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36044l, c6956l, 6);
            long j2 = c6956l.f14595continue;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, c4346l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i5, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            c7883l = this;
            boolean zAdmob = c6956l.admob(c7883l) | c6956l.admob(c16464l);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                objM2132native = new C8652l(c7883l, c16464l, i3);
                c6956l.m2147try(objM2132native);
            }
            AbstractC17457l.loadAd((Function0) objM2132native, null, false, ((C14370l) c6956l.isPro(c10707l)).crashlytics.crashlytics, null, null, null, null, AbstractC6604l.premium, c6956l, 805306368, 502);
            boolean zAdmob2 = c6956l.admob(c7883l);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob2 || objM2132native2 == c13863l) {
                objM2132native2 = new C4624l(c7883l, 5);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC17457l.crashlytics((Function0) objM2132native2, null, false, ((C14370l) c6956l.isPro(c10707l)).crashlytics.crashlytics, null, null, null, AbstractC6604l.applovin, c6956l, 805306368, 502);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            c7883l = this;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10848l(c7883l, c16464l, i, 14);
        }
    }

    public final EnumC3909l inmobi() {
        return (EnumC3909l) this.f16440l.getValue();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11641. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void isVip(defpackage.C6956l r37, int r38) {
        /*
            Method dump skipped, instruction units count: 1164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7883l.isVip(lؚِؑ, int):void");
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(-1969009949);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        int i3 = 0;
        int i4 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC10478l.yandex(AbstractC1242l.loadAd.yandex(this.f5081l), AbstractC14566l.amazon(553234339, new C4302l(this, i3), c6956l), c6956l, 56);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4302l(this, i, i4);
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m2211package(EnumC3909l enumC3909l) {
        this.f16440l.setValue(enumC3909l);
    }

    public final void premium(final C12282l c12282l, C6956l c6956l, int i) {
        final C7883l c7883l;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1721924555);
        int i2 = i | (c6956l2.admob(c12282l) ? 4 : 2) | (c6956l2.admob(this) ? 32 : 16);
        if (c6956l2.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(AbstractC3605l.smaato(c4346l, 16.0f), 1.0f);
            int i3 = 12;
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36046l, c6956l2, 6);
            long j = c6956l2.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lAmazon);
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
            Integer numValueOf = Integer.valueOf(i4);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            String strPurchase = AbstractC11999l.purchase(c6956l2, R.string.auth2_qr_code_scanner_confirm);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.billing, c6956l, 0, 0, 131070);
            AbstractC3383l.yandex(null, null, null, null, null, AbstractC14566l.amazon(1789477917, new C16561l(i3, c12282l), c6956l), c6956l, 196608, 31);
            final int i5 = 1;
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36044l, c6956l, 6);
            long j2 = c6956l.f14595continue;
            int i6 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, c4346l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i6, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            c7883l = this;
            boolean zAdmob = c6956l.admob(c7883l) | c6956l.admob(c12282l);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                final int i7 = 0;
                objM2132native = new Function0(c7883l) { // from class: lؘؙُ

                    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                    public final /* synthetic */ C7883l f11767l;

                    {
                        this.f11767l = c7883l;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i8 = i7;
                        C12282l c12282l2 = c12282l;
                        C7883l c7883l2 = this.f11767l;
                        switch (i8) {
                            case 0:
                                AbstractC10999l.mopub(AbstractC11990l.firebase(c7883l2), null, 0, new C12393l(c7883l2, c12282l2.loadAd, 1, (InterfaceC14029l) null), 3);
                                break;
                            default:
                                AbstractC10999l.mopub(AbstractC11990l.firebase(c7883l2), null, 0, new C12393l(c7883l2, c12282l2.loadAd, 2, (InterfaceC14029l) null), 3);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                c6956l.m2147try(objM2132native);
            }
            AbstractC17457l.loadAd((Function0) objM2132native, null, false, ((C14370l) c6956l.isPro(c10707l)).crashlytics.crashlytics, null, null, null, null, AbstractC6604l.license, c6956l, 805306368, 502);
            boolean zAdmob2 = c6956l.admob(c7883l) | c6956l.admob(c12282l);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob2 || objM2132native2 == c13863l) {
                objM2132native2 = new Function0(c7883l) { // from class: lؘؙُ

                    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                    public final /* synthetic */ C7883l f11767l;

                    {
                        this.f11767l = c7883l;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i8 = i5;
                        C12282l c12282l2 = c12282l;
                        C7883l c7883l2 = this.f11767l;
                        switch (i8) {
                            case 0:
                                AbstractC10999l.mopub(AbstractC11990l.firebase(c7883l2), null, 0, new C12393l(c7883l2, c12282l2.loadAd, 1, (InterfaceC14029l) null), 3);
                                break;
                            default:
                                AbstractC10999l.mopub(AbstractC11990l.firebase(c7883l2), null, 0, new C12393l(c7883l2, c12282l2.loadAd, 2, (InterfaceC14029l) null), 3);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                c6956l.m2147try(objM2132native2);
            }
            AbstractC17457l.crashlytics((Function0) objM2132native2, null, false, ((C14370l) c6956l.isPro(c10707l)).crashlytics.crashlytics, null, null, null, AbstractC6604l.pro, c6956l, 805306368, 502);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            c7883l = this;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10848l(c7883l, c12282l, i, 13);
        }
    }

    public final void pro(C3416l c3416l, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(302376637);
        int i2 = i | (c6956l2.billing(c3416l) ? 4 : 2) | (c6956l2.admob(this) ? 32 : 16);
        if (c6956l2.m2127for(i2 & 1, (i2 & 19) != 18)) {
            Unit unit = Unit.INSTANCE;
            boolean zAdmob = ((i2 & 14) == 4) | c6956l2.admob(this);
            Object objM2132native = c6956l2.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C10490l(c3416l, this, null);
                c6956l2.m2147try(objM2132native);
            }
            AbstractC12311l.amazon(c6956l2, unit, (Function2) objM2132native);
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(c4346l, 32.0f);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36034l, c6956l2, 54);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lSmaato);
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
            AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.ic_computer_outline_28, 0, c6956l2);
            InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(c4346l, 32.0f);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, interfaceC17242lIsPro, ((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, c6956l2, 440, 0);
            AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.auth2_qr_code_guest_awaiting, new Object[]{c3416l.crashlytics}, c6956l2), null, ((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262138);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10848l(this, c3416l, i, 11);
        }
    }

    public final void signatures(InterfaceC0038l interfaceC0038l, C6956l c6956l, int i) {
        c6956l.m2133new(-868260128);
        int i2 = (c6956l.billing(interfaceC0038l) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l);
            boolean zAmazon = c6956l.amazon(iAdmob);
            Object objM2132native = c6956l.m2132native();
            if (zAmazon || objM2132native == C1867l.yandex) {
                objM2132native = new C2221l(iAdmob, 22);
                c6956l.m2147try(objM2132native);
            }
            AbstractC7741l.loadAd(interfaceC0038l, null, (Function1) objM2132native, null, "", null, AbstractC14566l.amazon(-2006539678, new C4508l(11, this), c6956l), c6956l, (i2 & 14) | 1597440, 42);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10848l(this, interfaceC0038l, i, 12);
        }
    }

    @Override // defpackage.AbstractC2338l
    public final void smaato() {
        super.smaato();
        C7504l c7504l = this.f16441l;
        if (c7504l != null) {
            c7504l.ads(null);
        }
        C7504l c7504l2 = this.f16443l;
        if (c7504l2 != null) {
            c7504l2.ads(null);
        }
        this.f16441l = null;
        this.f16443l = null;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m2212synchronized(InterfaceC0038l interfaceC0038l) {
        this.f16439l.setValue(interfaceC0038l);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final Object m2213throws(String str, AbstractC0283l abstractC0283l) {
        C4646l c4646l;
        Object objVip;
        if (abstractC0283l instanceof C4646l) {
            c4646l = (C4646l) abstractC0283l;
            int i = c4646l.f9450l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4646l.f9450l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4646l = new C4646l(this, abstractC0283l);
            }
        } else {
            c4646l = new C4646l(this, abstractC0283l);
        }
        Object obj = c4646l.f9449l;
        int i2 = c4646l.f9450l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C2540l c2540lYandex = AbstractC10433l.yandex(str);
            C11140l c11140l = C11140l.f22371l;
            c4646l.f9450l = 1;
            objVip = c11140l.vip(c2540lYandex, c4646l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objVip == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
            objVip = ((C1171l) obj).f3160l;
        }
        Throwable thYandex = C1171l.yandex(objVip);
        if (thYandex != null) {
            AbstractC2991l.billing(AbstractC17265l.yandex(this), 6, "IAC QR Scan", thYandex);
            m2212synchronized(new C18578l("Ошибка при получении данных. Попробуйте другой код."));
            return Unit.INSTANCE;
        }
        C5327l c5327l = (C5327l) objVip;
        C13698l c13698l = c5327l.yandex;
        C13654l c13654l = c5327l.loadAd;
        if (c5327l.crashlytics != 1) {
            m2212synchronized(new C18578l("Протокол устарел. Обновите приложение."));
            return Unit.INSTANCE;
        }
        m2212synchronized(new C16464l(c13698l, c13654l));
        return Unit.INSTANCE;
    }

    public /* synthetic */ C7883l() {
        this(2, new C11813l(28));
    }
}
