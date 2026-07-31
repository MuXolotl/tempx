package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lْٟٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13550l implements InterfaceC17842l, InterfaceC5289l {
    public final C11919l amazon;
    public final C11919l billing;
    public final C18662l crashlytics;
    public final C7424l loadAd;
    public int purchase;
    public final /* synthetic */ InterfaceC17842l yandex;

    public C13550l(InterfaceC17842l interfaceC17842l, C11644l c11644l, C7424l c7424l) {
        this.yandex = interfaceC17842l;
        this.loadAd = c7424l;
        C18662l c18662lPurchase = AbstractC18263l.purchase(this);
        this.crashlytics = c18662lPurchase;
        this.amazon = new C11919l("");
        this.billing = new C11919l("");
        AbstractC0622l.startapp(new C2347l(AbstractC11452l.firebase((C7549l) c11644l.f23362l, interfaceC17842l.loadAd(), 4), new C15352l(this, null, 23), 2), c18662lPurchase);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object firebase(C13550l c13550l, C8195l c8195l, AbstractC0283l abstractC0283l) throws Throwable {
        C18151l c18151l;
        C11919l c11919l = c13550l.amazon;
        if (abstractC0283l instanceof C18151l) {
            c18151l = (C18151l) abstractC0283l;
            int i = c18151l.f35533l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c18151l.f35533l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c18151l = new C18151l(c13550l, abstractC0283l);
            }
        } else {
            c18151l = new C18151l(c13550l, abstractC0283l);
        }
        Object objFirebase = c18151l.f35534l;
        int i2 = c18151l.f35533l;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            if (((Number) c8195l.f17098l).intValue() == 0 && ((Number) c8195l.f17097l).intValue() == 0) {
                c11919l.subscription("");
                return Unit.INSTANCE;
            }
            C16552l c16552l = AbstractC11463l.yandex;
            ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
            C14019l c14019l = new C14019l(c8195l, interfaceC14029l, 24);
            c18151l.f35535l = c11919l;
            c18151l.f35533l = 1;
            objFirebase = AbstractC10999l.firebase(executorC6708l, c14019l, c18151l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c11919l = c18151l.f35535l;
            AbstractC2829l.crashlytics(objFirebase);
        }
        c11919l.subscription(objFirebase);
        return Unit.INSTANCE;
    }

    public final void admob(C6956l c6956l, int i) {
        int i2;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(1414933631);
        if ((i & 6) == 0) {
            i2 = i | (c6956l2.admob(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (c6956l2.m2127for(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC8714l interfaceC8714lPurchase = AbstractC9637l.purchase(this.billing, c6956l2, 0);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36034l, c6956l2, 54);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, C4346l.f8873l);
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
            String str = (String) interfaceC8714lPurchase.getValue();
            boolean zAdmob = c6956l2.admob(this);
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                objM2132native = new C0783l(14, this);
                c6956l2.m2147try(objM2132native);
            }
            AbstractC2130l.amazon(str, (Function1) objM2132native, null, false, null, null, AbstractC17265l.billing, null, null, false, null, null, null, true, 0, 0, null, C8565l.smaato(c6956l2), c6956l, 12582912, 12582912, 4063100);
            c6956l2 = c6956l;
            boolean zAdmob2 = c6956l2.admob(this);
            Object objM2132native2 = c6956l2.m2132native();
            if (zAdmob2 || objM2132native2 == c13863l) {
                objM2132native2 = new C13932l(0, this);
                c6956l2.m2147try(objM2132native2);
            }
            AbstractC6419l.yandex((Function0) objM2132native2, null, null, null, AbstractC17265l.mopub, c6956l2, 0, 4094);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C16908l(this, i, 2);
        }
    }

    @Override // defpackage.InterfaceC17842l
    public final C10023l amazon() {
        return this.yandex.amazon();
    }

    @Override // defpackage.InterfaceC17842l
    public final C4917l billing() {
        return this.yandex.billing();
    }

    @Override // defpackage.InterfaceC17842l
    public final C6921l crashlytics() {
        return this.yandex.crashlytics();
    }

    public final void isPro(C6956l c6956l, int i) {
        int i2;
        int i3;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1302254320);
        if ((i & 6) == 0) {
            i2 = i | (c6956l2.admob(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (c6956l2.m2127for(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC8714l interfaceC8714lPurchase = AbstractC9637l.purchase(this.amazon, c6956l2, 0);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36034l, c6956l2, 54);
            long j = c6956l2.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, c4346l);
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
            if (((String) interfaceC8714lPurchase.getValue()).length() > 0) {
                c6956l2.m2123default(516683994);
                InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(c4346l, 300.0f);
                C10707l c10707l = AbstractC14696l.yandex;
                InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(AbstractC0019l.crashlytics(AbstractC6660l.subs(interfaceC17242lIsPro, 2.0f, ((C0260l) c6956l2.isPro(c10707l)).amazon, false, 28), ((C0260l) c6956l2.isPro(c10707l)).amazon), C9735l.purchase, AbstractC16837l.yandex);
                InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                long j2 = c6956l2.f14595continue;
                int i5 = (int) (j2 ^ (j2 >>> 32));
                InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lAmazon);
                c6956l2.m2140super();
                if (c6956l2.f14603switch) {
                    c6956l2.firebase(c16395l);
                } else {
                    c6956l2.m2136protected();
                }
                AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
                AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
                AbstractC11043l.isPro(i5, c6956l2, c6415l3, c6956l2, c11192l);
                AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
                String str = (String) interfaceC8714lPurchase.getValue();
                Object[] objArr = new Object[0];
                Object objM2132native = c6956l2.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = new C5562l(25);
                    c6956l2.m2147try(objM2132native);
                }
                C12371l.yandex(AbstractC13041l.subscription(str, objArr, (Function1) objM2132native, c6956l2), AbstractC3605l.smaato(AbstractC0080l.crashlytics(c4346l, 1.0f), 32.0f), null, null, 0.0f, c6956l2, 432, 120);
                c6956l2.startapp(true);
                c6956l2.m2123default(-1645864803);
                C18734l c18734l = new C18734l();
                c18734l.crashlytics(AbstractC11999l.purchase(c6956l2, R.string.tv_auth_way_qr_hint));
                c18734l.crashlytics(" ");
                c6956l2.m2123default(-1645859834);
                int iPurchase = c18734l.purchase(new C14264l(0L, 0L, C6886l.f14424l, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                try {
                    c18734l.crashlytics(AbstractC11999l.purchase(c6956l2, R.string.tv_auth_way_qr_hint2));
                    Unit unit = Unit.INSTANCE;
                    c18734l.amazon(iPurchase);
                    c6956l2.startapp(false);
                    C3625l c3625lBilling = c18734l.billing();
                    c6956l2.startapp(false);
                    C10707l c10707l2 = AbstractC3459l.yandex;
                    AbstractC11282l.crashlytics(c3625lBilling, null, 0L, 0L, 0L, new C10258l(3), 0L, 0, false, 0, 0, null, null, ((C9472l) c6956l2.isPro(c10707l2)).isPro, c6956l, 0);
                    AbstractC11282l.loadAd(AbstractC11999l.purchase(c6956l, R.string.tv_auth_way_qr_hint3), null, 0L, 0L, 0L, new C10258l(3), 0L, 0, false, 0, 0, null, ((C9472l) c6956l.isPro(c10707l2)).firebase, c6956l, 0, 0, 65022);
                    c6956l2 = c6956l;
                    c6956l2.startapp(false);
                } catch (Throwable th) {
                    c18734l.amazon(iPurchase);
                    throw th;
                }
            } else {
                c6956l2.m2123default(518508065);
                AbstractC4332l.yandex(null, 0L, 0.0f, 0L, 0, 0.0f, c6956l, 0, 63);
                c6956l2 = c6956l;
                c6956l2.startapp(false);
            }
            i3 = 1;
            c6956l2.startapp(true);
        } else {
            i3 = 1;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C16908l(this, i, i3);
        }
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC12356l loadAd() {
        return this.yandex.loadAd();
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0248  */
    /* JADX WARN: Code duplicated, block: B:77:0x0283  */
    /* JADX WARN: Code duplicated, block: B:79:0x0287  */
    /* JADX WARN: Code duplicated, block: B:81:0x028c  */
    /* JADX WARN: Code duplicated, block: B:82:0x028e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0298  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:93:0x02be  */
    public final void mopub(int i, int i2, C6956l c6956l, InterfaceC17242l interfaceC17242l, Function1 function1) {
        int i3;
        C6956l c6956l2;
        Object obj;
        C13863l c13863l;
        Function1 function2;
        Object objM2132native;
        int i4;
        Function1 function3;
        boolean z;
        boolean z2;
        Object objM2132native2;
        boolean zAdmob;
        Object objM2132native3;
        c6956l.m2133new(-1387136473);
        int i5 = 2;
        if ((i2 & 6) == 0) {
            i3 = (c6956l.amazon(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c6956l.admob(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c6956l.admob(this) ? 2048 : 1024;
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 1171) != 1170)) {
            Object objM2132native4 = c6956l.m2132native();
            C13863l c13863l2 = C1867l.yandex;
            if (objM2132native4 == c13863l2) {
                objM2132native4 = new C6523l();
                c6956l.m2147try(objM2132native4);
            }
            C6523l c6523l = (C6523l) objM2132native4;
            Unit unit = Unit.INSTANCE;
            Object objM2132native5 = c6956l.m2132native();
            if (objM2132native5 == c13863l2) {
                objM2132native5 = new C0915l(c6523l, null, i5);
                c6956l.m2147try(objM2132native5);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native5);
            C15089l c15089l = C18450l.f36046l;
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, c15089l, c6956l, 0);
            long j = c6956l.f14595continue;
            int i6 = (int) (j ^ (j >>> 32));
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
            AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i6);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            AbstractC15300l.yandex(c6956l, 0);
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(c4346l, 0.0f, 24.0f, 1);
            int i7 = i3;
            C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), c15089l, c6956l, 6);
            long j2 = c6956l.f14595continue;
            int i8 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lVip);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex2, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i8, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            String strPurchase = AbstractC11999l.purchase(c6956l, R.string.tv_auth);
            C10707l c10707l = AbstractC3459l.yandex;
            AbstractC11282l.loadAd(strPurchase, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l.isPro(c10707l)).loadAd, c6956l, 0, 0, 65534);
            AbstractC11282l.loadAd(AbstractC11999l.purchase(c6956l, R.string.tv_auth_desc), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l.isPro(c10707l)).billing, c6956l, 0, 0, 65534);
            c6956l.startapp(true);
            AbstractC9334l.yandex(c6956l, new C9247l(1.0f, true));
            InterfaceC17242l interfaceC17242lYandex = AbstractC13702l.yandex(AbstractC6745l.purchase(AbstractC0080l.amazon(c4346l, 0.75f), c6523l));
            C1853l c1853lYandex3 = AbstractC1001l.yandex(new C7537l(4.0f, true, new C8339l(12)), c15089l, c6956l, 6);
            long j3 = c6956l.f14595continue;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, interfaceC17242lYandex);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex3, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, c6415l2);
            AbstractC11043l.isPro(i9, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, c6415l4);
            boolean z3 = i == 0;
            InterfaceC17242l interfaceC17242lBilling4 = AbstractC9966l.billing(c4346l, c6523l);
            int i10 = i7 & 112;
            boolean z4 = i10 == 32;
            Object objM2132native6 = c6956l.m2132native();
            if (z4) {
                c13863l = c13863l2;
            } else {
                c13863l = c13863l2;
                if (objM2132native6 != c13863l) {
                    function2 = function1;
                }
                InterfaceC17242l interfaceC17242lVip2 = AbstractC8576l.vip(interfaceC17242lBilling4, (Function1) objM2132native6);
                objM2132native = c6956l.m2132native();
                i4 = 15;
                if (objM2132native == c13863l) {
                    objM2132native = new C1712l(15);
                    c6956l.m2147try(objM2132native);
                }
                function3 = function2;
                AbstractC16814l.loadAd(z3, (Function0) objM2132native, AbstractC17265l.yandex, interfaceC17242lVip2, false, null, AbstractC17265l.loadAd, null, null, null, null, null, c6956l, 100663728, 130800);
                if (i == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (i10 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objM2132native2 = c6956l.m2132native();
                if (z2 || objM2132native2 == c13863l) {
                    objM2132native2 = new C0786l(i4, function3);
                    c6956l.m2147try(objM2132native2);
                }
                InterfaceC17242l interfaceC17242lVip3 = AbstractC8576l.vip(c4346l, (Function1) objM2132native2);
                obj = this;
                zAdmob = c6956l.admob(obj) | (i10 == 32);
                objM2132native3 = c6956l.m2132native();
                if (zAdmob || objM2132native3 == c13863l) {
                    objM2132native3 = new C5514l(obj, function3, 7);
                    c6956l.m2147try(objM2132native3);
                }
                AbstractC16814l.loadAd(z, (Function0) objM2132native3, AbstractC17265l.crashlytics, interfaceC17242lVip3, false, AbstractC17265l.amazon, AbstractC17265l.purchase, null, null, null, null, null, c6956l, 113246592, 130672);
                c6956l2 = c6956l;
                c6956l2.startapp(true);
                c6956l2.startapp(true);
            }
            function2 = function1;
            objM2132native6 = new C0786l(14, function2);
            c6956l.m2147try(objM2132native6);
            InterfaceC17242l interfaceC17242lVip4 = AbstractC8576l.vip(interfaceC17242lBilling4, (Function1) objM2132native6);
            objM2132native = c6956l.m2132native();
            i4 = 15;
            if (objM2132native == c13863l) {
                objM2132native = new C1712l(15);
                c6956l.m2147try(objM2132native);
            }
            function3 = function2;
            AbstractC16814l.loadAd(z3, (Function0) objM2132native, AbstractC17265l.yandex, interfaceC17242lVip4, false, null, AbstractC17265l.loadAd, null, null, null, null, null, c6956l, 100663728, 130800);
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            if (i10 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            objM2132native2 = c6956l.m2132native();
            if (z2) {
                objM2132native2 = new C0786l(i4, function3);
                c6956l.m2147try(objM2132native2);
            } else {
                objM2132native2 = new C0786l(i4, function3);
                c6956l.m2147try(objM2132native2);
            }
            InterfaceC17242l interfaceC17242lVip5 = AbstractC8576l.vip(c4346l, (Function1) objM2132native2);
            obj = this;
            zAdmob = c6956l.admob(obj) | (i10 == 32);
            objM2132native3 = c6956l.m2132native();
            if (zAdmob) {
                objM2132native3 = new C5514l(obj, function3, 7);
                c6956l.m2147try(objM2132native3);
            } else {
                objM2132native3 = new C5514l(obj, function3, 7);
                c6956l.m2147try(objM2132native3);
            }
            AbstractC16814l.loadAd(z, (Function0) objM2132native3, AbstractC17265l.crashlytics, interfaceC17242lVip5, false, AbstractC17265l.amazon, AbstractC17265l.purchase, null, null, null, null, null, c6956l, 113246592, 130672);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            c6956l2 = c6956l;
            obj = this;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12348l(i, i2, 4, obj, function1, interfaceC17242l);
        }
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC9573l purchase() {
        return this.yandex.purchase();
    }

    public final void subs(C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-118951360);
        int i2 = i & 1;
        if (c6956l2.m2127for(i2, i2 != 0)) {
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36034l, c6956l2, 54);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, C4346l.f8873l);
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
            String strPurchase = AbstractC11999l.purchase(c6956l2, R.string.tv_auth_way_pwd_eta);
            C10707l c10707l = AbstractC3459l.yandex;
            AbstractC11282l.loadAd(strPurchase, null, 0L, 0L, 0L, new C10258l(3), 0L, 0, false, 0, 0, null, ((C9472l) c6956l2.isPro(c10707l)).purchase, c6956l, 0, 0, 65022);
            AbstractC11282l.loadAd(AbstractC11999l.purchase(c6956l, R.string.tv_auth_way_pwd_eta_desc), null, 0L, 0L, 0L, new C10258l(3), 0L, 0, false, 0, 0, null, ((C9472l) c6956l.isPro(c10707l)).firebase, c6956l, 0, 0, 65022);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C16908l(this, i, 0);
        }
    }

    @Override // defpackage.InterfaceC5289l
    public final void yandex(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        boolean z;
        C13550l c13550l = this;
        c6956l.m2133new(-589611579);
        int i2 = i | (c6956l.admob(c13550l) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = new C15308l(0);
                c6956l.m2147try(objM2132native);
            }
            C15308l c15308l = (C15308l) objM2132native;
            InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(interfaceC17242l, 48.0f);
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l, 0);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            int iAdmob = c15308l.admob();
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C0393l(c15308l, 1);
                c6956l.m2147try(objM2132native2);
            }
            Function1 function1 = (Function1) objM2132native2;
            if (1.0f <= 0.0d) {
                AbstractC10440l.yandex("invalid weight; must be greater than zero");
            }
            C9247l c9247l = new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            C11205l c11205l = AbstractC0080l.loadAd;
            InterfaceC17242l interfaceC17242lPremium = c9247l.premium(c11205l);
            c13550l = this;
            c13550l.mopub(iAdmob, ((i2 << 6) & 7168) | 48, c6956l, interfaceC17242lPremium, function1);
            if (1.0f <= 0.0d) {
                AbstractC10440l.yandex("invalid weight; must be greater than zero");
            }
            InterfaceC17242l interfaceC17242lPremium2 = new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).premium(c11205l);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
            long j2 = c6956l.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lPremium2);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            int iAdmob2 = c15308l.admob();
            if (iAdmob2 == 0) {
                c6956l.m2123default(-815159726);
                c13550l.isPro(c6956l, (i2 >> 3) & 14);
                c6956l.startapp(false);
            } else if (iAdmob2 != 1) {
                if (iAdmob2 != 2) {
                    c6956l.m2123default(-820794317);
                    z = false;
                } else {
                    z = false;
                    c6956l.m2123default(-814976020);
                    c13550l.admob(c6956l, (i2 >> 3) & 14);
                }
                c6956l.startapp(z);
            } else {
                c6956l.m2123default(-815068431);
                c13550l.subs(c6956l, (i2 >> 3) & 14);
                c6956l.startapp(false);
            }
            c6956l.startapp(true);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2736l(c13550l, interfaceC17242l, i, 22);
        }
    }
}
