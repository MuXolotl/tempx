package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؘؑؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0133l {
    public static final C15578l yandex = new C15578l(359972046, false, new C7277l(12));
    public static final C15578l loadAd = new C15578l(1600855987, false, new C7277l(13));
    public static final C15578l crashlytics = new C15578l(-901648969, false, new C7277l(14));

    public static C16290l admob(AbstractC13264l abstractC13264l, C5947l c5947l, C6956l c6956l, int i, int i2) {
        boolean z = true;
        if ((i2 & 2) != 0) {
            c5947l = new C5947l(1);
        }
        C17308l c17308lYandex = AbstractC0310l.yandex(c6956l);
        C8896l c8896l = AbstractC11922l.yandex;
        C13315l c13315lAdmob = AbstractC0532l.admob(0.0f, 400.0f, Float.valueOf(1.0f), 1);
        Object obj = (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob);
        EnumC9931l enumC9931l = (EnumC9931l) c6956l.isPro(AbstractC4751l.vip);
        boolean zBilling = ((((i & 14) ^ 6) > 4 && c6956l.billing(abstractC13264l)) || (i & 6) == 4) | c6956l.billing(c17308lYandex) | c6956l.billing(c13315lAdmob);
        if ((((i & 112) ^ 48) <= 32 || !c6956l.billing(c5947l)) && (i & 48) != 32) {
            z = false;
        }
        boolean zBilling2 = zBilling | z | c6956l.billing(obj) | c6956l.amazon(enumC9931l.ordinal());
        Object objM2132native = c6956l.m2132native();
        if (zBilling2 || objM2132native == C1867l.yandex) {
            Object c16290l = new C16290l(new C10111l(abstractC13264l, new C0541l(abstractC13264l, enumC9931l, 25), c5947l, 28), c17308lYandex, c13315lAdmob);
            c6956l.m2147try(c16290l);
            objM2132native = c16290l;
        }
        return (C16290l) objM2132native;
    }

    public static final void amazon(C15578l c15578l, C15578l c15578l2, InterfaceC17242l interfaceC17242l, Function3 function3, C6956l c6956l, int i, int i2) {
        int i3;
        Function3 function4;
        c6956l.m2133new(655292407);
        if ((i & 6) == 0) {
            i3 = (c6956l.admob(c15578l) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c6956l.admob(c15578l2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= c6956l.admob(function3) ? 2048 : 1024;
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                function3 = AbstractC10433l.yandex;
            }
            Function3 function5 = function3;
            AbstractC10478l.yandex(AbstractC5020l.startapp(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel, AbstractC12502l.yandex), AbstractC14566l.amazon(1042344759, new C2104l(interfaceC17242l, c15578l, c15578l2, function5, 27), c6956l), c6956l, 56);
            function4 = function5;
        } else {
            c6956l.m2124else();
            function4 = function3;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10515l(c15578l, c15578l2, interfaceC17242l, function4, i, i2, 4);
        }
    }

    public static final void billing(C15178l c15178l, InterfaceC8714l interfaceC8714l, InterfaceC17242l interfaceC17242l, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(1873232064);
        int i3 = 1;
        if ((i & 6) == 0) {
            i2 = (c6956l.mopub(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? c6956l.billing(c15178l) : c6956l.admob(c15178l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.billing(interfaceC8714l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i4 = 0;
        if ((i & 3072) == 0) {
            i2 |= c6956l.mopub(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.admob(c15578l) ? 131072 : 65536;
        }
        if (c6956l.m2127for(i2 & 1, (74899 & i2) != 74898)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            String strPurchase = AbstractC11999l.purchase(c6956l, R.string.tooltip_label);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = AbstractC8020l.smaato(Boolean.FALSE);
                c6956l.m2147try(objM2132native2);
            }
            InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) objM2132native2;
            InterfaceC17242l interfaceC17242lBilling = AbstractC10802l.billing(AbstractC8576l.vip(AbstractC1782l.yandex(AbstractC1782l.yandex(interfaceC17242l, c15178l, new C1007l(c15178l, i4)), c15178l, new C1007l(c15178l, i3)).premium(new C0753l(new Ctransient(strPurchase, interfaceC2262l, c15178l, 6))), new Ctransient(interfaceC2262l, interfaceC8714l2, c15178l, 5)), new C18028l(c15178l, interfaceC8714l, interfaceC8714l2, 0));
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l.f14595continue;
            int i5 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lBilling);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i5), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, C3438l.amazon);
            AbstractC2812l.pro((i2 >> 15) & 14, c15578l, c6956l, true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17983l(c15178l, interfaceC8714l, interfaceC17242l, c15578l, i, 4);
        }
    }

    public static final void crashlytics(InterfaceC16711l interfaceC16711l, C15178l c15178l, Function0 function0, InterfaceC2262l interfaceC2262l, boolean z, InterfaceC8714l interfaceC8714l, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        Object obj;
        Object obj2;
        c6956l.m2133new(-1413720282);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC16711l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? c6956l.billing(c15178l) : c6956l.admob(c15178l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj = function0;
            i2 |= c6956l.admob(obj) ? 256 : 128;
        } else {
            obj = function0;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.admob(interfaceC2262l) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.mopub(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            obj2 = interfaceC8714l;
            i2 |= c6956l.billing(obj2) ? 131072 : 65536;
        } else {
            obj2 = interfaceC8714l;
        }
        if ((1572864 & i) == 0) {
            i2 |= c6956l.admob(c15578l) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (c6956l.m2127for(i3 & 1, (599187 & i3) != 599186)) {
            String strPurchase = AbstractC11999l.purchase(c6956l, R.string.tooltip_description);
            boolean zAdmob = ((i3 & 896) == 256) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && c6956l.admob(c15178l))) | c6956l.admob(interfaceC2262l) | ((458752 & i3) == 131072);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                C17026l c17026l = new C17026l(obj, c15178l, interfaceC2262l, obj2, 1);
                c6956l.m2147try(c17026l);
                objM2132native = c17026l;
            }
            AbstractC3017l.yandex(interfaceC16711l, (Function0) objM2132native, new C12288l(z, 22), AbstractC14566l.amazon(-1287705660, new Cpublic(strPurchase, c15578l, 21), c6956l), c6956l, (i3 & 14) | 3072, 0);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C14586l(interfaceC16711l, c15178l, function0, interfaceC2262l, z, interfaceC8714l, c15578l, i);
        }
    }

    public static final void loadAd(InterfaceC15451l interfaceC15451l, C15578l c15578l, C15578l c15578l2, C6956l c6956l, int i) {
        int i2;
        C15578l c15578l3;
        c6956l.m2133new(361955440);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC15451l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(c15578l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(c15578l2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lYandex = interfaceC15451l.yandex(c4346l, 1.0f, true);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l, 0);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lYandex);
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
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.yandex(((C14370l) c6956l.isPro(c10707l)).loadAd.isPro, c15578l, c6956l, i2 & 112);
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(4.0f, true, new C8339l(12)), C18450l.f36040l, c6956l, 54);
            long j2 = c6956l.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
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
            c15578l3 = c15578l2;
            AbstractC10478l.yandex(AbstractC5020l.startapp(((C14370l) c6956l.isPro(c10707l)).yandex.subscription, AbstractC12502l.yandex), AbstractC14566l.amazon(342370454, new C15701l(c15578l3, 13), c6956l), c6956l, 56);
            c6956l.startapp(true);
            c6956l.startapp(true);
        } else {
            c15578l3 = c15578l2;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(interfaceC15451l, c15578l, c15578l3, i);
        }
    }

    public static final C12317l mopub(C12317l c12317l) {
        if (!(c12317l instanceof C12317l)) {
            c12317l = null;
        }
        if (c12317l != null) {
            return c12317l;
        }
        AbstractC2032l.loadAd("Inconsistent composition");
        C17132l.firebase();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x020f  */
    /* JADX WARN: Code duplicated, block: B:111:0x021d  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f0  */
    public static final void purchase(final String str, String str2, long j, long j2, InterfaceC17242l interfaceC17242l, C6956l c6956l, final int i, final int i2) {
        int i3;
        long j3;
        long j4;
        int i4;
        int i5;
        int i6;
        InterfaceC17242l interfaceC17242l2;
        int i7;
        int i8;
        boolean z;
        final String str3;
        final long j5;
        final long j6;
        final InterfaceC17242l interfaceC17242l3;
        C4224l c4224lAds;
        String str4;
        int i9;
        String str5;
        String str6;
        long j7;
        InterfaceC17242l interfaceC17242l4;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(593711320);
        if ((i & 6) == 0) {
            i3 = i | (c6956l2.billing(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                i3 |= c6956l2.billing(str2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                j3 = j;
                int i11 = c6956l2.purchase(j3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                int i12 = i3 | i11;
                j4 = j2;
                if ((i2 & 8) == 0 || !c6956l2.purchase(j4)) {
                    i4 = 1024;
                } else {
                    i4 = 2048;
                }
                i5 = i12 | i4;
                i6 = i2 & 16;
                if (i6 != 0) {
                    i8 = i5 | 24576;
                    interfaceC17242l2 = interfaceC17242l;
                } else {
                    interfaceC17242l2 = interfaceC17242l;
                    if (c6956l2.billing(interfaceC17242l2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i8 = i5 | i7;
                }
                boolean z2 = true;
                if ((i8 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (c6956l2.m2127for(i8 & 1, z)) {
                    c6956l2.m2141switch();
                    if ((i & 1) != 0 || c6956l2.ad()) {
                        if (i10 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if ((i2 & 4) != 0) {
                            j3 = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            i8 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            j4 = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.subscription;
                            i8 &= -7169;
                        }
                        if (i6 != 0) {
                            String str7 = str4;
                            i9 = i8;
                            str5 = str7;
                            interfaceC17242l2 = C4346l.f8873l;
                        } else {
                            String str8 = str4;
                            i9 = i8;
                            str5 = str8;
                        }
                    } else {
                        c6956l2.m2124else();
                        if ((i2 & 4) != 0) {
                            i8 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i8 &= -7169;
                        }
                        i9 = i8;
                        str5 = str2;
                    }
                    c6956l2.adcel();
                    if (str5 != null || str5.length() == 0) {
                        str6 = str5;
                        j7 = j4;
                        InterfaceC17242l interfaceC17242l5 = interfaceC17242l2;
                        c6956l2.m2123default(578900532);
                        long j8 = j3;
                        AbstractC13010l.loadAd(str, interfaceC17242l5, j8, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l, (i9 & 14) | ((i9 >> 9) & 112) | (i9 & 896), 24960, 241656);
                        j5 = j8;
                        interfaceC17242l4 = interfaceC17242l5;
                        c6956l2 = c6956l;
                        c6956l2.startapp(false);
                    } else {
                        c6956l2.m2123default(579033274);
                        boolean z3 = ((i9 & 14) == 4) | ((i9 & 112) == 32);
                        if ((((i9 & 7168) ^ 3072) <= 2048 || !c6956l2.purchase(j4)) && (i9 & 3072) != 2048) {
                            z2 = false;
                        }
                        boolean z4 = z3 | z2;
                        Object objM2132native = c6956l2.m2132native();
                        if (z4 || objM2132native == C1867l.yandex) {
                            C18734l c18734l = new C18734l();
                            c18734l.crashlytics(str);
                            c18734l.crashlytics(" ");
                            long j9 = j4;
                            j7 = j9;
                            int iPurchase = c18734l.purchase(new C14264l(j9, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                            try {
                                c18734l.crashlytics(str5);
                                Unit unit = Unit.INSTANCE;
                                c18734l.amazon(iPurchase);
                                objM2132native = c18734l.billing();
                                c6956l2.m2147try(objM2132native);
                            } catch (Throwable th) {
                                c18734l.amazon(iPurchase);
                                throw th;
                            }
                        } else {
                            j7 = j4;
                        }
                        j5 = j3;
                        String str9 = str5;
                        interfaceC17242l4 = interfaceC17242l2;
                        str6 = str9;
                        AbstractC13010l.crashlytics((C3625l) objM2132native, interfaceC17242l4, j5, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, null, null, c6956l, ((i9 >> 9) & 112) | (i9 & 896), 24960, 503800);
                        c6956l2 = c6956l;
                        c6956l2.startapp(false);
                    }
                    interfaceC17242l3 = interfaceC17242l4;
                    j6 = j7;
                    str3 = str6;
                } else {
                    c6956l2.m2124else();
                    str3 = str2;
                    j5 = j3;
                    j6 = j4;
                    interfaceC17242l3 = interfaceC17242l2;
                }
                c4224lAds = c6956l2.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lؕۦۦ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC0133l.purchase(str, str3, j5, j6, interfaceC17242l3, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            j3 = j;
            int i13 = i3 | i11;
            j4 = j2;
            if ((i2 & 8) == 0) {
                i4 = 1024;
            } else {
                i4 = 1024;
            }
            i5 = i13 | i4;
            i6 = i2 & 16;
            if (i6 != 0) {
                i8 = i5 | 24576;
                interfaceC17242l2 = interfaceC17242l;
            } else {
                interfaceC17242l2 = interfaceC17242l;
                if (c6956l2.billing(interfaceC17242l2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i8 = i5 | i7;
            }
            boolean z5 = true;
            if ((i8 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (c6956l2.m2127for(i8 & 1, z)) {
                c6956l2.m2141switch();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if ((i2 & 4) != 0) {
                        j3 = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.adcel;
                        i8 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        j4 = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.subscription;
                        i8 &= -7169;
                    }
                    if (i6 != 0) {
                        String str10 = str4;
                        i9 = i8;
                        str5 = str10;
                        interfaceC17242l2 = C4346l.f8873l;
                    } else {
                        String str11 = str4;
                        i9 = i8;
                        str5 = str11;
                    }
                } else {
                    if (i10 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if ((i2 & 4) != 0) {
                        j3 = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.adcel;
                        i8 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        j4 = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.subscription;
                        i8 &= -7169;
                    }
                    if (i6 != 0) {
                        String str12 = str4;
                        i9 = i8;
                        str5 = str12;
                        interfaceC17242l2 = C4346l.f8873l;
                    } else {
                        String str13 = str4;
                        i9 = i8;
                        str5 = str13;
                    }
                }
                c6956l2.adcel();
                if (str5 != null) {
                    str6 = str5;
                    j7 = j4;
                    InterfaceC17242l interfaceC17242l6 = interfaceC17242l2;
                    c6956l2.m2123default(578900532);
                    long j10 = j3;
                    AbstractC13010l.loadAd(str, interfaceC17242l6, j10, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l, (i9 & 14) | ((i9 >> 9) & 112) | (i9 & 896), 24960, 241656);
                    j5 = j10;
                    interfaceC17242l4 = interfaceC17242l6;
                    c6956l2 = c6956l;
                    c6956l2.startapp(false);
                } else {
                    str6 = str5;
                    j7 = j4;
                    InterfaceC17242l interfaceC17242l7 = interfaceC17242l2;
                    c6956l2.m2123default(578900532);
                    long j11 = j3;
                    AbstractC13010l.loadAd(str, interfaceC17242l7, j11, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l, (i9 & 14) | ((i9 >> 9) & 112) | (i9 & 896), 24960, 241656);
                    j5 = j11;
                    interfaceC17242l4 = interfaceC17242l7;
                    c6956l2 = c6956l;
                    c6956l2.startapp(false);
                }
                interfaceC17242l3 = interfaceC17242l4;
                j6 = j7;
                str3 = str6;
            } else {
                c6956l2.m2124else();
                str3 = str2;
                j5 = j3;
                j6 = j4;
                interfaceC17242l3 = interfaceC17242l2;
            }
            c4224lAds = c6956l2.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lؕۦۦ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC0133l.purchase(str, str3, j5, j6, interfaceC17242l3, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i3 |= 48;
        if ((i2 & 4) == 0) {
            j3 = j;
            if (c6956l2.purchase(j3)) {
            }
            int i14 = i3 | i11;
            j4 = j2;
            if ((i2 & 8) == 0) {
                i4 = 1024;
            } else {
                i4 = 1024;
            }
            i5 = i14 | i4;
            i6 = i2 & 16;
            if (i6 != 0) {
                i8 = i5 | 24576;
                interfaceC17242l2 = interfaceC17242l;
            } else {
                interfaceC17242l2 = interfaceC17242l;
                if (c6956l2.billing(interfaceC17242l2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i8 = i5 | i7;
            }
            boolean z6 = true;
            if ((i8 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (c6956l2.m2127for(i8 & 1, z)) {
                c6956l2.m2141switch();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if ((i2 & 4) != 0) {
                        j3 = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.adcel;
                        i8 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        j4 = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.subscription;
                        i8 &= -7169;
                    }
                    if (i6 != 0) {
                        String str14 = str4;
                        i9 = i8;
                        str5 = str14;
                        interfaceC17242l2 = C4346l.f8873l;
                    } else {
                        String str15 = str4;
                        i9 = i8;
                        str5 = str15;
                    }
                } else {
                    if (i10 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if ((i2 & 4) != 0) {
                        j3 = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.adcel;
                        i8 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        j4 = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.subscription;
                        i8 &= -7169;
                    }
                    if (i6 != 0) {
                        String str16 = str4;
                        i9 = i8;
                        str5 = str16;
                        interfaceC17242l2 = C4346l.f8873l;
                    } else {
                        String str17 = str4;
                        i9 = i8;
                        str5 = str17;
                    }
                }
                c6956l2.adcel();
                if (str5 != null) {
                    str6 = str5;
                    j7 = j4;
                    InterfaceC17242l interfaceC17242l8 = interfaceC17242l2;
                    c6956l2.m2123default(578900532);
                    long j12 = j3;
                    AbstractC13010l.loadAd(str, interfaceC17242l8, j12, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l, (i9 & 14) | ((i9 >> 9) & 112) | (i9 & 896), 24960, 241656);
                    j5 = j12;
                    interfaceC17242l4 = interfaceC17242l8;
                    c6956l2 = c6956l;
                    c6956l2.startapp(false);
                } else {
                    str6 = str5;
                    j7 = j4;
                    InterfaceC17242l interfaceC17242l9 = interfaceC17242l2;
                    c6956l2.m2123default(578900532);
                    long j13 = j3;
                    AbstractC13010l.loadAd(str, interfaceC17242l9, j13, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l, (i9 & 14) | ((i9 >> 9) & 112) | (i9 & 896), 24960, 241656);
                    j5 = j13;
                    interfaceC17242l4 = interfaceC17242l9;
                    c6956l2 = c6956l;
                    c6956l2.startapp(false);
                }
                interfaceC17242l3 = interfaceC17242l4;
                j6 = j7;
                str3 = str6;
            } else {
                c6956l2.m2124else();
                str3 = str2;
                j5 = j3;
                j6 = j4;
                interfaceC17242l3 = interfaceC17242l2;
            }
            c4224lAds = c6956l2.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lؕۦۦ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC0133l.purchase(str, str3, j5, j6, interfaceC17242l3, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        j3 = j;
        int i15 = i3 | i11;
        j4 = j2;
        if ((i2 & 8) == 0) {
            i4 = 1024;
        } else {
            i4 = 1024;
        }
        i5 = i15 | i4;
        i6 = i2 & 16;
        if (i6 != 0) {
            i8 = i5 | 24576;
            interfaceC17242l2 = interfaceC17242l;
        } else {
            interfaceC17242l2 = interfaceC17242l;
            if (c6956l2.billing(interfaceC17242l2)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i8 = i5 | i7;
        }
        boolean z7 = true;
        if ((i8 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (c6956l2.m2127for(i8 & 1, z)) {
            c6956l2.m2141switch();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if ((i2 & 4) != 0) {
                    j3 = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.adcel;
                    i8 &= -897;
                }
                if ((i2 & 8) != 0) {
                    j4 = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.subscription;
                    i8 &= -7169;
                }
                if (i6 != 0) {
                    String str18 = str4;
                    i9 = i8;
                    str5 = str18;
                    interfaceC17242l2 = C4346l.f8873l;
                } else {
                    String str19 = str4;
                    i9 = i8;
                    str5 = str19;
                }
            } else {
                if (i10 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if ((i2 & 4) != 0) {
                    j3 = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.adcel;
                    i8 &= -897;
                }
                if ((i2 & 8) != 0) {
                    j4 = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.subscription;
                    i8 &= -7169;
                }
                if (i6 != 0) {
                    String str110 = str4;
                    i9 = i8;
                    str5 = str110;
                    interfaceC17242l2 = C4346l.f8873l;
                } else {
                    String str111 = str4;
                    i9 = i8;
                    str5 = str111;
                }
            }
            c6956l2.adcel();
            if (str5 != null) {
                str6 = str5;
                j7 = j4;
                InterfaceC17242l interfaceC17242l10 = interfaceC17242l2;
                c6956l2.m2123default(578900532);
                long j14 = j3;
                AbstractC13010l.loadAd(str, interfaceC17242l10, j14, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l, (i9 & 14) | ((i9 >> 9) & 112) | (i9 & 896), 24960, 241656);
                j5 = j14;
                interfaceC17242l4 = interfaceC17242l10;
                c6956l2 = c6956l;
                c6956l2.startapp(false);
            } else {
                str6 = str5;
                j7 = j4;
                InterfaceC17242l interfaceC17242l11 = interfaceC17242l2;
                c6956l2.m2123default(578900532);
                long j15 = j3;
                AbstractC13010l.loadAd(str, interfaceC17242l11, j15, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l, (i9 & 14) | ((i9 >> 9) & 112) | (i9 & 896), 24960, 241656);
                j5 = j15;
                interfaceC17242l4 = interfaceC17242l11;
                c6956l2 = c6956l;
                c6956l2.startapp(false);
            }
            interfaceC17242l3 = interfaceC17242l4;
            j6 = j7;
            str3 = str6;
        } else {
            c6956l2.m2124else();
            str3 = str2;
            j5 = j3;
            j6 = j4;
            interfaceC17242l3 = interfaceC17242l2;
        }
        c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؕۦۦ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC0133l.purchase(str, str3, j5, j6, interfaceC17242l3, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static C6287l subs(AbstractC13264l abstractC13264l, EnumC7283l enumC7283l, C6956l c6956l, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && c6956l.billing(abstractC13264l)) || (i & 6) == 4;
        Object objM2132native = c6956l.m2132native();
        if (z || objM2132native == C1867l.yandex) {
            objM2132native = new C6287l(abstractC13264l, enumC7283l);
            c6956l.m2147try(objM2132native);
        }
        return (C6287l) objM2132native;
    }

    public static final void yandex(InterfaceC16711l interfaceC16711l, C15578l c15578l, C15178l c15178l, InterfaceC17242l interfaceC17242l, Function0 function0, C15578l c15578l2, C6956l c6956l, int i) {
        InterfaceC16711l interfaceC16711l2;
        int i2;
        Function0 function1;
        boolean z;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1221877520);
        if ((i & 6) == 0) {
            interfaceC16711l2 = interfaceC16711l;
            i2 = (c6956l2.billing(interfaceC16711l2) ? 4 : 2) | i;
        } else {
            interfaceC16711l2 = interfaceC16711l;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l2.admob(c15578l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? c6956l2.billing(c15178l) : c6956l2.admob(c15178l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l2.billing(interfaceC17242l) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function1 = function0;
            i2 |= c6956l2.admob(function1) ? 16384 : 8192;
        } else {
            function1 = function0;
        }
        if ((i & 196608) == 0) {
            i2 |= c6956l2.mopub(false) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c6956l2.mopub(true) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c6956l2.mopub(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= c6956l2.admob(c15578l2) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (c6956l2.m2127for(i3 & 1, (38347923 & i3) != 38347922)) {
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC12311l.isPro(c6956l2);
                c6956l2.m2147try(objM2132native);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            Object objM2132native2 = c6956l2.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = AbstractC8020l.smaato(Boolean.FALSE);
                c6956l2.m2147try(objM2132native2);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native2;
            c6956l2.m2123default(-1104742522);
            c6956l2.startapp(false);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l2.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
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
            AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            if (c15178l.loadAd()) {
                c6956l2.m2123default(-1891243071);
                crashlytics(interfaceC16711l2, c15178l, function1, interfaceC2262l, false, interfaceC8714l, c15578l, c6956l, (i3 & 14) | 196608 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                c6956l2 = c6956l;
                z = false;
                c6956l2.startapp(false);
            } else {
                z = false;
                c6956l2.m2123default(-1890863476);
                c6956l2.startapp(false);
            }
            int i5 = 14;
            billing(c15178l, interfaceC8714l, interfaceC17242l, c15578l2, c6956l2, ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752));
            c6956l2.startapp(true);
            boolean z2 = ((i3 & 896) == 256 || ((i3 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 && c6956l2.admob(c15178l))) ? true : z;
            Object objM2132native3 = c6956l2.m2132native();
            if (z2 || objM2132native3 == c13863l) {
                objM2132native3 = new C1412l(i5, c15178l);
                c6956l2.m2147try(objM2132native3);
            }
            AbstractC12311l.loadAd(c15178l, (Function1) objM2132native3, c6956l2);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4227l(interfaceC16711l, c15578l, c15178l, interfaceC17242l, function0, c15578l2, i);
        }
    }
}
