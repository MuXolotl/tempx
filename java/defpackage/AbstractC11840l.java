package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lِٔٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11840l {
    public static final InterfaceC17242l yandex = AbstractC0080l.mopub(AbstractC0080l.metrica(C4346l.f8873l, 144.0f, 0.0f, 2), 0.0f, 48.0f, 1);
    public static final C4776l loadAd = new C4776l(100, (InterfaceC8097l) null, 6);

    public static final void amazon(final float f, final C2403l c2403l, final C10164l c10164l, final boolean z, C6956l c6956l, final int i) {
        int i2;
        c6956l.m2133new(428907178);
        int i3 = i & 6;
        C16170l c16170l = C16170l.yandex;
        if (i3 == 0) {
            i2 = (c6956l.billing(c16170l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i & 48;
        C4346l c4346l = C4346l.f8873l;
        if (i4 == 0) {
            i2 |= c6956l.billing(c4346l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.crashlytics(f) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.billing(c2403l) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.billing(c10164l) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.mopub(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c6956l.crashlytics(20.0f) ? 1048576 : 524288;
        }
        if (c6956l.m2127for(i2 & 1, (599187 & i2) != 599186)) {
            InterfaceC17242l interfaceC17242lYandex = c16170l.yandex(AbstractC3605l.startapp(c4346l, f, 0.0f, 0.0f, 0.0f, 14), C18450l.f36035l);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            int iLoadAd = AbstractC8238l.loadAd(c6956l);
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lYandex);
            InterfaceC8801l.firebase.getClass();
            Function0 function0 = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(function0);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            Function2 function2 = C3438l.isPro;
            if (c6956l.f14603switch || !AbstractC8576l.yandex(c6956l.m2132native(), Integer.valueOf(iLoadAd))) {
                c6956l.m2147try(Integer.valueOf(iLoadAd));
                c6956l.loadAd(Integer.valueOf(iLoadAd), function2);
            }
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                objM2132native = new C11362l();
                c6956l.m2147try(objM2132native);
            }
            C11362l c11362l = (C11362l) objM2132native;
            boolean z2 = (i2 & 7168) == 2048;
            Object objM2132native2 = c6956l.m2132native();
            if (z2 || objM2132native2 == obj) {
                objM2132native2 = new C15352l(c2403l, c11362l, null, 5);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC12311l.amazon(c6956l, c2403l, (Function2) objM2132native2);
            float f2 = !c11362l.isEmpty() ? 6.0f : 1.0f;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC1135l.amazon(AbstractC14631l.yandex(AbstractC0080l.firebase(c4346l, 20.0f, 20.0f), c2403l, AbstractC13609l.yandex(4, 24.0f)), c2403l);
            if (!z) {
                f2 = 0.0f;
            }
            C6839l c6839l = AbstractC7497l.yandex;
            InterfaceC17242l interfaceC17242lSubs = AbstractC6660l.subs(interfaceC17242lAmazon, f2, c6839l, false, 24);
            c6956l.m2123default(-1733795637);
            InterfaceC8714l interfaceC8714lVip = AbstractC8020l.vip(new C9735l(z ? c10164l.yandex : c10164l.loadAd), c6956l);
            c6956l.startapp(false);
            AbstractC9334l.yandex(c6956l, AbstractC4927l.amazon(interfaceC17242lSubs, ((C9735l) interfaceC8714lVip.getValue()).yandex, c6839l));
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lۡۙ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    AbstractC11840l.amazon(f, c2403l, c10164l, z, (C6956l) obj2, AbstractC0545l.purchase(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void crashlytics(final boolean z, final float f, final List list, final C10164l c10164l, final float f2, final C2403l c2403l, final InterfaceC17242l interfaceC17242l, C6956l c6956l, final int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(1679682785);
        int i2 = i | (c6956l2.mopub(z) ? 4 : 2) | (c6956l2.crashlytics(f) ? 32 : 16) | (c6956l2.admob(list) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l2.billing(c10164l) ? 2048 : 1024) | (c6956l2.crashlytics(f2) ? 16384 : 8192) | (c6956l2.billing(c2403l) ? 131072 : 65536) | (c6956l2.billing(interfaceC17242l) ? 1048576 : 524288);
        if (c6956l2.m2127for(i2 & 1, (599187 & i2) != 599186)) {
            InterfaceC17242l interfaceC17242lPremium = interfaceC17242l.premium(yandex);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            int iLoadAd = AbstractC8238l.loadAd(c6956l2);
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lPremium);
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
            C6415l c6415l = C3438l.isPro;
            if (c6956l2.f14603switch || !AbstractC8576l.yandex(c6956l2.m2132native(), Integer.valueOf(iLoadAd))) {
                c6956l2.m2147try(Integer.valueOf(iLoadAd));
                c6956l2.loadAd(Integer.valueOf(iLoadAd), c6415l);
            }
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l2.isPro(AbstractC4751l.admob);
            float fMo868instanceof = interfaceC13490l.mo868instanceof(4.0f);
            float fMo868instanceof2 = interfaceC13490l.mo868instanceof(10.0f);
            float fMo867final = interfaceC13490l.mo867final(f2) * f;
            int i3 = i2 >> 6;
            int i4 = i2 << 9;
            purchase(AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), c10164l, z, f, list, fMo868instanceof2, fMo868instanceof, c6956l2, (i3 & 112) | 3078 | ((i2 << 6) & 896) | (i4 & 57344) | (i4 & 458752));
            amazon(fMo867final, c2403l, c10164l, z, c6956l, (i3 & 7168) | 1572918 | ((i2 << 3) & 57344) | ((i2 << 15) & 458752));
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(z, f, list, c10164l, f2, c2403l, interfaceC17242l, i) { // from class: lَؚٚ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ List f15241l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f15242l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ float f15243l;

                /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
                public final /* synthetic */ boolean f15244l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ float f15245l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ C10164l f15246l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ C2403l f15247l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(1);
                    AbstractC11840l.crashlytics(this.f15244l, this.f15243l, this.f15241l, this.f15246l, this.f15245l, this.f15247l, this.f15242l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:102:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:80:0x010e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0110  */
    /* JADX WARN: Code duplicated, block: B:84:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x011b  */
    /* JADX WARN: Code duplicated, block: B:87:0x011e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0128 A[LOOP:0: B:88:0x0126->B:89:0x0128, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x0182  */
    /* JADX WARN: Code duplicated, block: B:95:0x0184  */
    /* JADX WARN: Code duplicated, block: B:97:0x0187  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c1  */
    public static final void loadAd(final float f, final Function1 function1, final InterfaceC17242l interfaceC17242l, boolean z, final C12015l c12015l, int i, final Function0 function0, C2403l c2403l, final C10164l c10164l, C6956l c6956l, final int i2, final int i3) {
        final int i4;
        int i5;
        int i6;
        int i7;
        C2403l c2403l2;
        int i8;
        int i9;
        int i10;
        boolean z2;
        final boolean z3;
        final C2403l c2403l3;
        C4224l c4224lAds;
        C2403l c2403l4;
        final int i11;
        boolean z4;
        Object obj;
        C2403l c2403l5;
        final InterfaceC8714l interfaceC8714lVip;
        InterfaceC8714l interfaceC8714lVip2;
        boolean z5;
        Object objM2132native;
        int i12;
        ArrayList arrayList;
        int i13;
        final List list;
        final boolean z6;
        InterfaceC17242l interfaceC17242lLoadAd;
        boolean z7;
        Object objM2132native2;
        c6956l.m2133new(-1962335196);
        int i14 = (c6956l.crashlytics(f) ? 4 : 2) | i2 | (c6956l.admob(function1) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i14 |= c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i15 = i14 | 3072 | (c6956l.billing(c12015l) ? 16384 : 8192);
        int i16 = i3 & 32;
        if (i16 == 0) {
            if ((196608 & i2) == 0) {
                i4 = i;
                i15 |= c6956l.amazon(i4) ? 131072 : 65536;
            }
            if (c6956l.admob(function0)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i6 = i15 | i5;
            i7 = i3 & 128;
            if (i7 != 0) {
                if ((12582912 & i2) == 0) {
                    c2403l2 = c2403l;
                    if (c6956l.billing(c2403l2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i6 |= i8;
                }
                if (c6956l.billing(c10164l)) {
                    i9 = 67108864;
                } else {
                    i9 = 33554432;
                }
                i10 = i6 | i9;
                if ((38347923 & i10) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c6956l.m2127for(i10 & 1, z2)) {
                    c6956l.m2141switch();
                    if ((i2 & 1) != 0 || c6956l.ad()) {
                        if (i16 != 0) {
                            i4 = 0;
                        }
                        if (i7 != 0) {
                            c2403l2 = null;
                        }
                        c2403l4 = c2403l2;
                        i11 = i4;
                        z4 = true;
                    } else {
                        c6956l.m2124else();
                        c2403l4 = c2403l2;
                        i11 = i4;
                        z4 = z;
                    }
                    c6956l.adcel();
                    obj = C1867l.yandex;
                    if (c2403l4 == null) {
                        c6956l.m2123default(-1127489737);
                        objM2132native2 = c6956l.m2132native();
                        if (objM2132native2 == obj) {
                            objM2132native2 = AbstractC14814l.isPro(c6956l);
                        }
                        c2403l5 = (C2403l) objM2132native2;
                        c6956l.startapp(false);
                    } else {
                        c6956l.m2123default(-313465952);
                        c6956l.startapp(false);
                        c2403l5 = c2403l4;
                    }
                    if (i11 >= 0) {
                        C8339l.metrica("steps should be >= 0");
                        return;
                    }
                    interfaceC8714lVip = AbstractC8020l.vip(function1, c6956l);
                    interfaceC8714lVip2 = AbstractC8020l.vip(function0, c6956l);
                    if ((i10 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objM2132native = c6956l.m2132native();
                    if (z5 || objM2132native == obj) {
                        if (i11 == 0) {
                            objM2132native = C2580l.f5619l;
                        } else {
                            i12 = i11 + 2;
                            arrayList = new ArrayList(i12);
                            for (i13 = 0; i13 < i12; i13++) {
                                arrayList.add(Float.valueOf(i13 / (i11 + 1)));
                            }
                            objM2132native = arrayList;
                        }
                        c6956l.m2147try(objM2132native);
                    }
                    list = (List) objM2132native;
                    C10707l c10707l = AbstractC16206l.yandex;
                    InterfaceC17242l interfaceC17242lSubs = AbstractC0080l.subs(interfaceC17242l.premium(C17379l.f33846l), 20.0f, 20.0f, 0.0f, 0.0f, 12);
                    final float fAmazon = AbstractC8576l.amazon(f, c12015l.yandex, c12015l.loadAd);
                    z6 = z4;
                    interfaceC17242lLoadAd = AbstractC13702l.loadAd(AbstractC4962l.yandex(AbstractC4962l.yandex(interfaceC17242lSubs, false, new Function1() { // from class: lٍؒٙ
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            InterfaceC17593l interfaceC17593l = (InterfaceC17593l) obj2;
                            if (!z6) {
                                AbstractC3668l.yandex(interfaceC17593l);
                            }
                            final float f2 = fAmazon;
                            final int i17 = i11;
                            final C12015l c12015l2 = c12015l;
                            final Function0 function2 = function0;
                            final Function1 function3 = function1;
                            Function1 function4 = new Function1() { // from class: lْۘٓ
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    int i18;
                                    float fFloatValue = ((Float) obj3).floatValue();
                                    C12015l c12015l3 = c12015l2;
                                    float f3 = c12015l3.yandex;
                                    float f4 = c12015l3.loadAd;
                                    float fAmazon2 = AbstractC8576l.amazon(fFloatValue, f3, f4);
                                    int i19 = i17;
                                    boolean z8 = false;
                                    if (i19 > 0 && (i18 = i19 + 1) >= 0) {
                                        float fAbs = fAmazon2;
                                        float f5 = fAbs;
                                        int i20 = 0;
                                        while (true) {
                                            float fFirebase = AbstractC7572l.firebase(f3, f4, i20 / i18);
                                            float f6 = fFirebase - fAmazon2;
                                            if (Math.abs(f6) <= fAbs) {
                                                fAbs = Math.abs(f6);
                                                f5 = fFirebase;
                                            }
                                            if (i20 == i18) {
                                                break;
                                            }
                                            i20++;
                                        }
                                        fAmazon2 = f5;
                                    }
                                    if (fAmazon2 != f2) {
                                        function3.invoke(Float.valueOf(fAmazon2));
                                        Function0 function5 = function2;
                                        if (function5 != null) {
                                            function5.invoke();
                                        }
                                        z8 = true;
                                    }
                                    return Boolean.valueOf(z8);
                                }
                            };
                            InterfaceC13922l[] interfaceC13922lArr = AbstractC3668l.yandex;
                            interfaceC17593l.amazon(AbstractC16601l.subs, new C7629l(null, function4));
                            return Unit.INSTANCE;
                        }
                    }), true, new C13706l(f, c12015l, i11)), z6, c2403l5);
                    if (c6956l.isPro(AbstractC4751l.vip) == EnumC9931l.f20222l) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (i11 >= 0) {
                        C8339l.metrica("steps should be >= 0");
                        return;
                    }
                    final C2403l c2403l6 = c2403l5;
                    AbstractC11308l.yandex(AbstractC10802l.purchase(interfaceC17242lLoadAd, new C10271l(z6, c12015l, i11, interfaceC8714lVip, f, z7, interfaceC8714lVip2)), null, AbstractC14566l.amazon(2085116814, new Function3() { // from class: lٌِٜ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            C13765l c13765l;
                            C13250l c13250l;
                            C12015l c12015l2;
                            C13009l c13009l;
                            final C13765l c13765l2;
                            C13250l c13250l2;
                            C0923l c0923l = (C0923l) obj2;
                            C6956l c6956l2 = (C6956l) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= c6956l2.billing(c0923l) ? 4 : 2;
                            }
                            if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                                final boolean z8 = c6956l2.isPro(AbstractC4751l.vip) == EnumC9931l.f20222l;
                                final float fAdmob = C15519l.admob(c0923l.loadAd);
                                C13250l c13250l3 = new C13250l();
                                C13250l c13250l4 = new C13250l();
                                InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l2.isPro(AbstractC4751l.admob);
                                c13250l3.f26029l = Math.max(fAdmob - interfaceC13490l.mo868instanceof(10.0f), 0.0f);
                                c13250l4.f26029l = Math.min(interfaceC13490l.mo868instanceof(10.0f), c13250l3.f26029l);
                                Object objM2132native3 = c6956l2.m2132native();
                                C13863l c13863l = C1867l.yandex;
                                if (objM2132native3 == c13863l) {
                                    objM2132native3 = AbstractC12311l.isPro(c6956l2);
                                    c6956l2.m2147try(objM2132native3);
                                }
                                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native3;
                                Object objM2132native4 = c6956l2.m2132native();
                                C12015l c12015l3 = c12015l;
                                float f2 = f;
                                if (objM2132native4 == c13863l) {
                                    float f3 = c12015l3.yandex;
                                    float f4 = c12015l3.loadAd;
                                    float f5 = c13250l4.f26029l;
                                    float f6 = c13250l3.f26029l;
                                    float f7 = f4 - f3;
                                    float f8 = f7 == 0.0f ? 0.0f : (f2 - f3) / f7;
                                    if (f8 < 0.0f) {
                                        f8 = 0.0f;
                                    }
                                    if (f8 > 1.0f) {
                                        f8 = 1.0f;
                                    }
                                    C13765l c13765l3 = new C13765l(AbstractC7572l.firebase(f5, f6, f8));
                                    c6956l2.m2147try(c13765l3);
                                    objM2132native4 = c13765l3;
                                }
                                C13765l c13765l4 = (C13765l) objM2132native4;
                                Object objM2132native5 = c6956l2.m2132native();
                                if (objM2132native5 == c13863l) {
                                    objM2132native5 = new C13765l(0.0f);
                                    c6956l2.m2147try(objM2132native5);
                                }
                                C13765l c13765l5 = (C13765l) objM2132native5;
                                boolean zCrashlytics = c6956l2.crashlytics(c13250l4.f26029l) | c6956l2.crashlytics(c13250l3.f26029l) | c6956l2.billing(c12015l3);
                                Object objM2132native6 = c6956l2.m2132native();
                                if (zCrashlytics || objM2132native6 == c13863l) {
                                    C2623l c2623l = new C2623l(c13765l4, c13765l5, c13250l4, c13250l3, interfaceC8714lVip, c12015l3);
                                    c13765l = c13765l5;
                                    c13250l = c13250l4;
                                    c12015l2 = c12015l3;
                                    objM2132native6 = new C13009l(c2623l);
                                    c6956l2.m2147try(objM2132native6);
                                } else {
                                    c12015l2 = c12015l3;
                                    c13765l = c13765l5;
                                    c13250l = c13250l4;
                                }
                                C13009l c13009l2 = (C13009l) objM2132native6;
                                boolean zBilling = c6956l2.billing(c12015l2) | c6956l2.crashlytics(c13250l.f26029l) | c6956l2.crashlytics(c13250l3.f26029l);
                                Object objM2132native7 = c6956l2.m2132native();
                                if (zBilling || objM2132native7 == c13863l) {
                                    objM2132native7 = new C17647l(c12015l2, c13250l, c13250l3);
                                    c6956l2.m2147try(objM2132native7);
                                }
                                AbstractC11840l.yandex((Function1) ((InterfaceC5059l) objM2132native7), c12015l2, new C12015l(c13250l.f26029l, c13250l3.f26029l), c13765l4, f2, c6956l2, 3072);
                                List list2 = list;
                                boolean zAdmob = c6956l2.admob(list2) | c6956l2.crashlytics(c13250l.f26029l) | c6956l2.crashlytics(c13250l3.f26029l) | c6956l2.admob(interfaceC2262l) | c6956l2.admob(c13009l2);
                                Function0 function2 = function0;
                                boolean zBilling2 = zAdmob | c6956l2.billing(function2);
                                Object objM2132native8 = c6956l2.m2132native();
                                if (zBilling2 || objM2132native8 == c13863l) {
                                    C13250l c13250l5 = c13250l;
                                    c13009l = c13009l2;
                                    c13765l2 = c13765l4;
                                    C18015l c18015l = new C18015l(c13765l2, list2, c13250l5, c13250l3, interfaceC2262l, c13009l, function2);
                                    c13250l2 = c13250l5;
                                    c6956l2.m2147try(c18015l);
                                    objM2132native8 = c18015l;
                                } else {
                                    c13250l2 = c13250l;
                                    c13009l = c13009l2;
                                    c13765l2 = c13765l4;
                                }
                                final InterfaceC8714l interfaceC8714lVip3 = AbstractC8020l.vip((Function1) objM2132native8, c6956l2);
                                final boolean z9 = z6;
                                final C2403l c2403l7 = c2403l6;
                                final C13009l c13009l3 = c13009l;
                                final C13765l c13765l6 = c13765l;
                                C6085l c6085l = new C6085l(new Function3() { // from class: lْۥٗ
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                        InterfaceC17242l interfaceC17242lPremium = (InterfaceC17242l) obj5;
                                        C6956l c6956l3 = (C6956l) obj6;
                                        ((Integer) obj7).getClass();
                                        c6956l3.m2123default(1945228890);
                                        if (z9) {
                                            c6956l3.m2123default(-1679801122);
                                            Object objM2132native9 = c6956l3.m2132native();
                                            C13863l c13863l2 = C1867l.yandex;
                                            if (objM2132native9 == c13863l2) {
                                                objM2132native9 = AbstractC12311l.isPro(c6956l3);
                                                c6956l3.m2147try(objM2132native9);
                                            }
                                            InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) objM2132native9;
                                            float f9 = fAdmob;
                                            Float fValueOf = Float.valueOf(f9);
                                            boolean z10 = z8;
                                            Boolean boolValueOf = Boolean.valueOf(z10);
                                            InterfaceC6940l interfaceC6940l = c13009l3;
                                            Object[] objArr = {interfaceC6940l, c2403l7, fValueOf, boolValueOf};
                                            boolean zMopub = c6956l3.mopub(z10) | c6956l3.crashlytics(f9);
                                            InterfaceC8714l interfaceC8714l = c13765l6;
                                            boolean zBilling3 = zMopub | c6956l3.billing(interfaceC8714l);
                                            InterfaceC12244l interfaceC12244l = c13765l2;
                                            boolean zBilling4 = zBilling3 | c6956l3.billing(interfaceC12244l) | c6956l3.admob(interfaceC2262l2) | c6956l3.admob(interfaceC6940l);
                                            InterfaceC8714l interfaceC8714l2 = interfaceC8714lVip3;
                                            boolean zBilling5 = c6956l3.billing(interfaceC8714l2) | zBilling4;
                                            Object objM2132native10 = c6956l3.m2132native();
                                            if (zBilling5 || objM2132native10 == c13863l2) {
                                                C14757l c14757l = new C14757l(z10, f9, interfaceC8714l, interfaceC12244l, interfaceC2262l2, interfaceC6940l, interfaceC8714l2);
                                                c6956l3.m2147try(c14757l);
                                                objM2132native10 = c14757l;
                                            }
                                            C9185l c9185l = AbstractC1782l.yandex;
                                            interfaceC17242lPremium = interfaceC17242lPremium.premium(new C8110l(null, null, objArr, (PointerInputEventHandler) objM2132native10, 3));
                                            c6956l3.startapp(false);
                                        } else {
                                            c6956l3.m2123default(-1678708124);
                                            c6956l3.startapp(false);
                                        }
                                        c6956l3.startapp(false);
                                        return interfaceC17242lPremium;
                                    }
                                });
                                boolean zBooleanValue = ((Boolean) c13009l3.loadAd.getValue()).booleanValue();
                                boolean zBilling3 = c6956l2.billing(interfaceC8714lVip3);
                                Object objM2132native9 = c6956l2.m2132native();
                                if (zBilling3 || objM2132native9 == c13863l) {
                                    objM2132native9 = new C12996l(interfaceC8714lVip3, null);
                                    c6956l2.m2147try(objM2132native9);
                                }
                                InterfaceC17242l interfaceC17242lYandex = AbstractC16318l.yandex(c13009l3, z9, c2403l7, zBooleanValue, (Function3) objM2132native9, z8);
                                float f9 = c12015l2.yandex;
                                float f10 = c12015l2.loadAd;
                                float fAmazon2 = AbstractC8576l.amazon(f2, f9, f10);
                                float f11 = f10 - f9;
                                float f12 = f11 == 0.0f ? 0.0f : (fAmazon2 - f9) / f11;
                                if (f12 < 0.0f) {
                                    f12 = 0.0f;
                                }
                                if (f12 > 1.0f) {
                                    f12 = 1.0f;
                                }
                                AbstractC11840l.crashlytics(z9, f12, list2, c10164l, c13250l3.f26029l - c13250l2.f26029l, c2403l7, c6085l.premium(interfaceC17242lYandex), c6956l2, 0);
                            } else {
                                c6956l2.m2124else();
                            }
                            return Unit.INSTANCE;
                        }
                    }, c6956l), c6956l, 3072, 6);
                    z3 = z6;
                    i4 = i11;
                    c2403l3 = c2403l4;
                } else {
                    c6956l.m2124else();
                    z3 = z;
                    c2403l3 = c2403l2;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: l٘ٛ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            AbstractC11840l.loadAd(f, function1, interfaceC17242l, z3, c12015l, i4, function0, c2403l3, c10164l, (C6956l) obj2, AbstractC0545l.purchase(i2 | 1), i3);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i6 |= 12582912;
            c2403l2 = c2403l;
            if (c6956l.billing(c10164l)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i10 = i6 | i9;
            if ((38347923 & i10) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i10 & 1, z2)) {
                c6956l.m2141switch();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        i4 = 0;
                    }
                    if (i7 != 0) {
                        c2403l2 = null;
                    }
                    c2403l4 = c2403l2;
                    i11 = i4;
                    z4 = true;
                } else {
                    if (i16 != 0) {
                        i4 = 0;
                    }
                    if (i7 != 0) {
                        c2403l2 = null;
                    }
                    c2403l4 = c2403l2;
                    i11 = i4;
                    z4 = true;
                }
                c6956l.adcel();
                obj = C1867l.yandex;
                if (c2403l4 == null) {
                    c6956l.m2123default(-1127489737);
                    objM2132native2 = c6956l.m2132native();
                    if (objM2132native2 == obj) {
                        objM2132native2 = AbstractC14814l.isPro(c6956l);
                    }
                    c2403l5 = (C2403l) objM2132native2;
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(-313465952);
                    c6956l.startapp(false);
                    c2403l5 = c2403l4;
                }
                if (i11 >= 0) {
                    C8339l.metrica("steps should be >= 0");
                    return;
                }
                interfaceC8714lVip = AbstractC8020l.vip(function1, c6956l);
                interfaceC8714lVip2 = AbstractC8020l.vip(function0, c6956l);
                if ((i10 & 458752) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objM2132native = c6956l.m2132native();
                if (z5) {
                    if (i11 == 0) {
                        objM2132native = C2580l.f5619l;
                    } else {
                        i12 = i11 + 2;
                        arrayList = new ArrayList(i12);
                        while (i13 < i12) {
                            arrayList.add(Float.valueOf(i13 / (i11 + 1)));
                        }
                        objM2132native = arrayList;
                    }
                    c6956l.m2147try(objM2132native);
                } else {
                    if (i11 == 0) {
                        objM2132native = C2580l.f5619l;
                    } else {
                        i12 = i11 + 2;
                        arrayList = new ArrayList(i12);
                        while (i13 < i12) {
                            arrayList.add(Float.valueOf(i13 / (i11 + 1)));
                        }
                        objM2132native = arrayList;
                    }
                    c6956l.m2147try(objM2132native);
                }
                list = (List) objM2132native;
                C10707l c10707l2 = AbstractC16206l.yandex;
                InterfaceC17242l interfaceC17242lSubs2 = AbstractC0080l.subs(interfaceC17242l.premium(C17379l.f33846l), 20.0f, 20.0f, 0.0f, 0.0f, 12);
                final float fAmazon2 = AbstractC8576l.amazon(f, c12015l.yandex, c12015l.loadAd);
                z6 = z4;
                interfaceC17242lLoadAd = AbstractC13702l.loadAd(AbstractC4962l.yandex(AbstractC4962l.yandex(interfaceC17242lSubs2, false, new Function1() { // from class: lٍؒٙ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        InterfaceC17593l interfaceC17593l = (InterfaceC17593l) obj2;
                        if (!z6) {
                            AbstractC3668l.yandex(interfaceC17593l);
                        }
                        final float f2 = fAmazon2;
                        final int i17 = i11;
                        final C12015l c12015l2 = c12015l;
                        final Function0 function2 = function0;
                        final Function1 function3 = function1;
                        Function1 function4 = new Function1() { // from class: lْۘٓ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i18;
                                float fFloatValue = ((Float) obj3).floatValue();
                                C12015l c12015l3 = c12015l2;
                                float f3 = c12015l3.yandex;
                                float f4 = c12015l3.loadAd;
                                float fAmazon3 = AbstractC8576l.amazon(fFloatValue, f3, f4);
                                int i19 = i17;
                                boolean z8 = false;
                                if (i19 > 0 && (i18 = i19 + 1) >= 0) {
                                    float fAbs = fAmazon3;
                                    float f5 = fAbs;
                                    int i20 = 0;
                                    while (true) {
                                        float fFirebase = AbstractC7572l.firebase(f3, f4, i20 / i18);
                                        float f6 = fFirebase - fAmazon3;
                                        if (Math.abs(f6) <= fAbs) {
                                            fAbs = Math.abs(f6);
                                            f5 = fFirebase;
                                        }
                                        if (i20 == i18) {
                                            break;
                                        }
                                        i20++;
                                    }
                                    fAmazon3 = f5;
                                }
                                if (fAmazon3 != f2) {
                                    function3.invoke(Float.valueOf(fAmazon3));
                                    Function0 function5 = function2;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                    z8 = true;
                                }
                                return Boolean.valueOf(z8);
                            }
                        };
                        InterfaceC13922l[] interfaceC13922lArr = AbstractC3668l.yandex;
                        interfaceC17593l.amazon(AbstractC16601l.subs, new C7629l(null, function4));
                        return Unit.INSTANCE;
                    }
                }), true, new C13706l(f, c12015l, i11)), z6, c2403l5);
                if (c6956l.isPro(AbstractC4751l.vip) == EnumC9931l.f20222l) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (i11 >= 0) {
                    C8339l.metrica("steps should be >= 0");
                    return;
                }
                final C2403l c2403l7 = c2403l5;
                AbstractC11308l.yandex(AbstractC10802l.purchase(interfaceC17242lLoadAd, new C10271l(z6, c12015l, i11, interfaceC8714lVip, f, z7, interfaceC8714lVip2)), null, AbstractC14566l.amazon(2085116814, new Function3() { // from class: lٌِٜ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        C13765l c13765l;
                        C13250l c13250l;
                        C12015l c12015l2;
                        C13009l c13009l;
                        final C13765l c13765l2;
                        C13250l c13250l2;
                        C0923l c0923l = (C0923l) obj2;
                        C6956l c6956l2 = (C6956l) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= c6956l2.billing(c0923l) ? 4 : 2;
                        }
                        if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                            final boolean z8 = c6956l2.isPro(AbstractC4751l.vip) == EnumC9931l.f20222l;
                            final float fAdmob = C15519l.admob(c0923l.loadAd);
                            C13250l c13250l3 = new C13250l();
                            C13250l c13250l4 = new C13250l();
                            InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l2.isPro(AbstractC4751l.admob);
                            c13250l3.f26029l = Math.max(fAdmob - interfaceC13490l.mo868instanceof(10.0f), 0.0f);
                            c13250l4.f26029l = Math.min(interfaceC13490l.mo868instanceof(10.0f), c13250l3.f26029l);
                            Object objM2132native3 = c6956l2.m2132native();
                            C13863l c13863l = C1867l.yandex;
                            if (objM2132native3 == c13863l) {
                                objM2132native3 = AbstractC12311l.isPro(c6956l2);
                                c6956l2.m2147try(objM2132native3);
                            }
                            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native3;
                            Object objM2132native4 = c6956l2.m2132native();
                            C12015l c12015l3 = c12015l;
                            float f2 = f;
                            if (objM2132native4 == c13863l) {
                                float f3 = c12015l3.yandex;
                                float f4 = c12015l3.loadAd;
                                float f5 = c13250l4.f26029l;
                                float f6 = c13250l3.f26029l;
                                float f7 = f4 - f3;
                                float f8 = f7 == 0.0f ? 0.0f : (f2 - f3) / f7;
                                if (f8 < 0.0f) {
                                    f8 = 0.0f;
                                }
                                if (f8 > 1.0f) {
                                    f8 = 1.0f;
                                }
                                C13765l c13765l3 = new C13765l(AbstractC7572l.firebase(f5, f6, f8));
                                c6956l2.m2147try(c13765l3);
                                objM2132native4 = c13765l3;
                            }
                            C13765l c13765l4 = (C13765l) objM2132native4;
                            Object objM2132native5 = c6956l2.m2132native();
                            if (objM2132native5 == c13863l) {
                                objM2132native5 = new C13765l(0.0f);
                                c6956l2.m2147try(objM2132native5);
                            }
                            C13765l c13765l5 = (C13765l) objM2132native5;
                            boolean zCrashlytics = c6956l2.crashlytics(c13250l4.f26029l) | c6956l2.crashlytics(c13250l3.f26029l) | c6956l2.billing(c12015l3);
                            Object objM2132native6 = c6956l2.m2132native();
                            if (zCrashlytics || objM2132native6 == c13863l) {
                                C2623l c2623l = new C2623l(c13765l4, c13765l5, c13250l4, c13250l3, interfaceC8714lVip, c12015l3);
                                c13765l = c13765l5;
                                c13250l = c13250l4;
                                c12015l2 = c12015l3;
                                objM2132native6 = new C13009l(c2623l);
                                c6956l2.m2147try(objM2132native6);
                            } else {
                                c12015l2 = c12015l3;
                                c13765l = c13765l5;
                                c13250l = c13250l4;
                            }
                            C13009l c13009l2 = (C13009l) objM2132native6;
                            boolean zBilling = c6956l2.billing(c12015l2) | c6956l2.crashlytics(c13250l.f26029l) | c6956l2.crashlytics(c13250l3.f26029l);
                            Object objM2132native7 = c6956l2.m2132native();
                            if (zBilling || objM2132native7 == c13863l) {
                                objM2132native7 = new C17647l(c12015l2, c13250l, c13250l3);
                                c6956l2.m2147try(objM2132native7);
                            }
                            AbstractC11840l.yandex((Function1) ((InterfaceC5059l) objM2132native7), c12015l2, new C12015l(c13250l.f26029l, c13250l3.f26029l), c13765l4, f2, c6956l2, 3072);
                            List list2 = list;
                            boolean zAdmob = c6956l2.admob(list2) | c6956l2.crashlytics(c13250l.f26029l) | c6956l2.crashlytics(c13250l3.f26029l) | c6956l2.admob(interfaceC2262l) | c6956l2.admob(c13009l2);
                            Function0 function2 = function0;
                            boolean zBilling2 = zAdmob | c6956l2.billing(function2);
                            Object objM2132native8 = c6956l2.m2132native();
                            if (zBilling2 || objM2132native8 == c13863l) {
                                C13250l c13250l5 = c13250l;
                                c13009l = c13009l2;
                                c13765l2 = c13765l4;
                                C18015l c18015l = new C18015l(c13765l2, list2, c13250l5, c13250l3, interfaceC2262l, c13009l, function2);
                                c13250l2 = c13250l5;
                                c6956l2.m2147try(c18015l);
                                objM2132native8 = c18015l;
                            } else {
                                c13250l2 = c13250l;
                                c13009l = c13009l2;
                                c13765l2 = c13765l4;
                            }
                            final InterfaceC8714l interfaceC8714lVip3 = AbstractC8020l.vip((Function1) objM2132native8, c6956l2);
                            final boolean z9 = z6;
                            final C2403l c2403l8 = c2403l7;
                            final C13009l c13009l3 = c13009l;
                            final C13765l c13765l6 = c13765l;
                            C6085l c6085l = new C6085l(new Function3() { // from class: lْۥٗ
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                    InterfaceC17242l interfaceC17242lPremium = (InterfaceC17242l) obj5;
                                    C6956l c6956l3 = (C6956l) obj6;
                                    ((Integer) obj7).getClass();
                                    c6956l3.m2123default(1945228890);
                                    if (z9) {
                                        c6956l3.m2123default(-1679801122);
                                        Object objM2132native9 = c6956l3.m2132native();
                                        C13863l c13863l2 = C1867l.yandex;
                                        if (objM2132native9 == c13863l2) {
                                            objM2132native9 = AbstractC12311l.isPro(c6956l3);
                                            c6956l3.m2147try(objM2132native9);
                                        }
                                        InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) objM2132native9;
                                        float f9 = fAdmob;
                                        Float fValueOf = Float.valueOf(f9);
                                        boolean z10 = z8;
                                        Boolean boolValueOf = Boolean.valueOf(z10);
                                        InterfaceC6940l interfaceC6940l = c13009l3;
                                        Object[] objArr = {interfaceC6940l, c2403l8, fValueOf, boolValueOf};
                                        boolean zMopub = c6956l3.mopub(z10) | c6956l3.crashlytics(f9);
                                        InterfaceC8714l interfaceC8714l = c13765l6;
                                        boolean zBilling3 = zMopub | c6956l3.billing(interfaceC8714l);
                                        InterfaceC12244l interfaceC12244l = c13765l2;
                                        boolean zBilling4 = zBilling3 | c6956l3.billing(interfaceC12244l) | c6956l3.admob(interfaceC2262l2) | c6956l3.admob(interfaceC6940l);
                                        InterfaceC8714l interfaceC8714l2 = interfaceC8714lVip3;
                                        boolean zBilling5 = c6956l3.billing(interfaceC8714l2) | zBilling4;
                                        Object objM2132native10 = c6956l3.m2132native();
                                        if (zBilling5 || objM2132native10 == c13863l2) {
                                            C14757l c14757l = new C14757l(z10, f9, interfaceC8714l, interfaceC12244l, interfaceC2262l2, interfaceC6940l, interfaceC8714l2);
                                            c6956l3.m2147try(c14757l);
                                            objM2132native10 = c14757l;
                                        }
                                        C9185l c9185l = AbstractC1782l.yandex;
                                        interfaceC17242lPremium = interfaceC17242lPremium.premium(new C8110l(null, null, objArr, (PointerInputEventHandler) objM2132native10, 3));
                                        c6956l3.startapp(false);
                                    } else {
                                        c6956l3.m2123default(-1678708124);
                                        c6956l3.startapp(false);
                                    }
                                    c6956l3.startapp(false);
                                    return interfaceC17242lPremium;
                                }
                            });
                            boolean zBooleanValue = ((Boolean) c13009l3.loadAd.getValue()).booleanValue();
                            boolean zBilling3 = c6956l2.billing(interfaceC8714lVip3);
                            Object objM2132native9 = c6956l2.m2132native();
                            if (zBilling3 || objM2132native9 == c13863l) {
                                objM2132native9 = new C12996l(interfaceC8714lVip3, null);
                                c6956l2.m2147try(objM2132native9);
                            }
                            InterfaceC17242l interfaceC17242lYandex = AbstractC16318l.yandex(c13009l3, z9, c2403l8, zBooleanValue, (Function3) objM2132native9, z8);
                            float f9 = c12015l2.yandex;
                            float f10 = c12015l2.loadAd;
                            float fAmazon3 = AbstractC8576l.amazon(f2, f9, f10);
                            float f11 = f10 - f9;
                            float f12 = f11 == 0.0f ? 0.0f : (fAmazon3 - f9) / f11;
                            if (f12 < 0.0f) {
                                f12 = 0.0f;
                            }
                            if (f12 > 1.0f) {
                                f12 = 1.0f;
                            }
                            AbstractC11840l.crashlytics(z9, f12, list2, c10164l, c13250l3.f26029l - c13250l2.f26029l, c2403l8, c6085l.premium(interfaceC17242lYandex), c6956l2, 0);
                        } else {
                            c6956l2.m2124else();
                        }
                        return Unit.INSTANCE;
                    }
                }, c6956l), c6956l, 3072, 6);
                z3 = z6;
                i4 = i11;
                c2403l3 = c2403l4;
            } else {
                c6956l.m2124else();
                z3 = z;
                c2403l3 = c2403l2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: l٘ٛ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        AbstractC11840l.loadAd(f, function1, interfaceC17242l, z3, c12015l, i4, function0, c2403l3, c10164l, (C6956l) obj2, AbstractC0545l.purchase(i2 | 1), i3);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i15 |= 196608;
        i4 = i;
        if (c6956l.admob(function0)) {
            i5 = 1048576;
        } else {
            i5 = 524288;
        }
        i6 = i15 | i5;
        i7 = i3 & 128;
        if (i7 != 0) {
            if ((12582912 & i2) == 0) {
                c2403l2 = c2403l;
                if (c6956l.billing(c2403l2)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i6 |= i8;
            }
            if (c6956l.billing(c10164l)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i10 = i6 | i9;
            if ((38347923 & i10) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i10 & 1, z2)) {
                c6956l.m2141switch();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        i4 = 0;
                    }
                    if (i7 != 0) {
                        c2403l2 = null;
                    }
                    c2403l4 = c2403l2;
                    i11 = i4;
                    z4 = true;
                } else {
                    if (i16 != 0) {
                        i4 = 0;
                    }
                    if (i7 != 0) {
                        c2403l2 = null;
                    }
                    c2403l4 = c2403l2;
                    i11 = i4;
                    z4 = true;
                }
                c6956l.adcel();
                obj = C1867l.yandex;
                if (c2403l4 == null) {
                    c6956l.m2123default(-1127489737);
                    objM2132native2 = c6956l.m2132native();
                    if (objM2132native2 == obj) {
                        objM2132native2 = AbstractC14814l.isPro(c6956l);
                    }
                    c2403l5 = (C2403l) objM2132native2;
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(-313465952);
                    c6956l.startapp(false);
                    c2403l5 = c2403l4;
                }
                if (i11 >= 0) {
                    C8339l.metrica("steps should be >= 0");
                    return;
                }
                interfaceC8714lVip = AbstractC8020l.vip(function1, c6956l);
                interfaceC8714lVip2 = AbstractC8020l.vip(function0, c6956l);
                if ((i10 & 458752) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objM2132native = c6956l.m2132native();
                if (z5) {
                    if (i11 == 0) {
                        objM2132native = C2580l.f5619l;
                    } else {
                        i12 = i11 + 2;
                        arrayList = new ArrayList(i12);
                        while (i13 < i12) {
                            arrayList.add(Float.valueOf(i13 / (i11 + 1)));
                        }
                        objM2132native = arrayList;
                    }
                    c6956l.m2147try(objM2132native);
                } else {
                    if (i11 == 0) {
                        objM2132native = C2580l.f5619l;
                    } else {
                        i12 = i11 + 2;
                        arrayList = new ArrayList(i12);
                        while (i13 < i12) {
                            arrayList.add(Float.valueOf(i13 / (i11 + 1)));
                        }
                        objM2132native = arrayList;
                    }
                    c6956l.m2147try(objM2132native);
                }
                list = (List) objM2132native;
                C10707l c10707l3 = AbstractC16206l.yandex;
                InterfaceC17242l interfaceC17242lSubs3 = AbstractC0080l.subs(interfaceC17242l.premium(C17379l.f33846l), 20.0f, 20.0f, 0.0f, 0.0f, 12);
                final float fAmazon3 = AbstractC8576l.amazon(f, c12015l.yandex, c12015l.loadAd);
                z6 = z4;
                interfaceC17242lLoadAd = AbstractC13702l.loadAd(AbstractC4962l.yandex(AbstractC4962l.yandex(interfaceC17242lSubs3, false, new Function1() { // from class: lٍؒٙ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        InterfaceC17593l interfaceC17593l = (InterfaceC17593l) obj2;
                        if (!z6) {
                            AbstractC3668l.yandex(interfaceC17593l);
                        }
                        final float f2 = fAmazon3;
                        final int i17 = i11;
                        final C12015l c12015l2 = c12015l;
                        final Function0 function2 = function0;
                        final Function1 function3 = function1;
                        Function1 function4 = new Function1() { // from class: lْۘٓ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i18;
                                float fFloatValue = ((Float) obj3).floatValue();
                                C12015l c12015l3 = c12015l2;
                                float f3 = c12015l3.yandex;
                                float f4 = c12015l3.loadAd;
                                float fAmazon4 = AbstractC8576l.amazon(fFloatValue, f3, f4);
                                int i19 = i17;
                                boolean z8 = false;
                                if (i19 > 0 && (i18 = i19 + 1) >= 0) {
                                    float fAbs = fAmazon4;
                                    float f5 = fAbs;
                                    int i20 = 0;
                                    while (true) {
                                        float fFirebase = AbstractC7572l.firebase(f3, f4, i20 / i18);
                                        float f6 = fFirebase - fAmazon4;
                                        if (Math.abs(f6) <= fAbs) {
                                            fAbs = Math.abs(f6);
                                            f5 = fFirebase;
                                        }
                                        if (i20 == i18) {
                                            break;
                                        }
                                        i20++;
                                    }
                                    fAmazon4 = f5;
                                }
                                if (fAmazon4 != f2) {
                                    function3.invoke(Float.valueOf(fAmazon4));
                                    Function0 function5 = function2;
                                    if (function5 != null) {
                                        function5.invoke();
                                    }
                                    z8 = true;
                                }
                                return Boolean.valueOf(z8);
                            }
                        };
                        InterfaceC13922l[] interfaceC13922lArr = AbstractC3668l.yandex;
                        interfaceC17593l.amazon(AbstractC16601l.subs, new C7629l(null, function4));
                        return Unit.INSTANCE;
                    }
                }), true, new C13706l(f, c12015l, i11)), z6, c2403l5);
                if (c6956l.isPro(AbstractC4751l.vip) == EnumC9931l.f20222l) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (i11 >= 0) {
                    C8339l.metrica("steps should be >= 0");
                    return;
                }
                final C2403l c2403l8 = c2403l5;
                AbstractC11308l.yandex(AbstractC10802l.purchase(interfaceC17242lLoadAd, new C10271l(z6, c12015l, i11, interfaceC8714lVip, f, z7, interfaceC8714lVip2)), null, AbstractC14566l.amazon(2085116814, new Function3() { // from class: lٌِٜ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        C13765l c13765l;
                        C13250l c13250l;
                        C12015l c12015l2;
                        C13009l c13009l;
                        final C13765l c13765l2;
                        C13250l c13250l2;
                        C0923l c0923l = (C0923l) obj2;
                        C6956l c6956l2 = (C6956l) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= c6956l2.billing(c0923l) ? 4 : 2;
                        }
                        if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                            final boolean z8 = c6956l2.isPro(AbstractC4751l.vip) == EnumC9931l.f20222l;
                            final float fAdmob = C15519l.admob(c0923l.loadAd);
                            C13250l c13250l3 = new C13250l();
                            C13250l c13250l4 = new C13250l();
                            InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l2.isPro(AbstractC4751l.admob);
                            c13250l3.f26029l = Math.max(fAdmob - interfaceC13490l.mo868instanceof(10.0f), 0.0f);
                            c13250l4.f26029l = Math.min(interfaceC13490l.mo868instanceof(10.0f), c13250l3.f26029l);
                            Object objM2132native3 = c6956l2.m2132native();
                            C13863l c13863l = C1867l.yandex;
                            if (objM2132native3 == c13863l) {
                                objM2132native3 = AbstractC12311l.isPro(c6956l2);
                                c6956l2.m2147try(objM2132native3);
                            }
                            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native3;
                            Object objM2132native4 = c6956l2.m2132native();
                            C12015l c12015l3 = c12015l;
                            float f2 = f;
                            if (objM2132native4 == c13863l) {
                                float f3 = c12015l3.yandex;
                                float f4 = c12015l3.loadAd;
                                float f5 = c13250l4.f26029l;
                                float f6 = c13250l3.f26029l;
                                float f7 = f4 - f3;
                                float f8 = f7 == 0.0f ? 0.0f : (f2 - f3) / f7;
                                if (f8 < 0.0f) {
                                    f8 = 0.0f;
                                }
                                if (f8 > 1.0f) {
                                    f8 = 1.0f;
                                }
                                C13765l c13765l3 = new C13765l(AbstractC7572l.firebase(f5, f6, f8));
                                c6956l2.m2147try(c13765l3);
                                objM2132native4 = c13765l3;
                            }
                            C13765l c13765l4 = (C13765l) objM2132native4;
                            Object objM2132native5 = c6956l2.m2132native();
                            if (objM2132native5 == c13863l) {
                                objM2132native5 = new C13765l(0.0f);
                                c6956l2.m2147try(objM2132native5);
                            }
                            C13765l c13765l5 = (C13765l) objM2132native5;
                            boolean zCrashlytics = c6956l2.crashlytics(c13250l4.f26029l) | c6956l2.crashlytics(c13250l3.f26029l) | c6956l2.billing(c12015l3);
                            Object objM2132native6 = c6956l2.m2132native();
                            if (zCrashlytics || objM2132native6 == c13863l) {
                                C2623l c2623l = new C2623l(c13765l4, c13765l5, c13250l4, c13250l3, interfaceC8714lVip, c12015l3);
                                c13765l = c13765l5;
                                c13250l = c13250l4;
                                c12015l2 = c12015l3;
                                objM2132native6 = new C13009l(c2623l);
                                c6956l2.m2147try(objM2132native6);
                            } else {
                                c12015l2 = c12015l3;
                                c13765l = c13765l5;
                                c13250l = c13250l4;
                            }
                            C13009l c13009l2 = (C13009l) objM2132native6;
                            boolean zBilling = c6956l2.billing(c12015l2) | c6956l2.crashlytics(c13250l.f26029l) | c6956l2.crashlytics(c13250l3.f26029l);
                            Object objM2132native7 = c6956l2.m2132native();
                            if (zBilling || objM2132native7 == c13863l) {
                                objM2132native7 = new C17647l(c12015l2, c13250l, c13250l3);
                                c6956l2.m2147try(objM2132native7);
                            }
                            AbstractC11840l.yandex((Function1) ((InterfaceC5059l) objM2132native7), c12015l2, new C12015l(c13250l.f26029l, c13250l3.f26029l), c13765l4, f2, c6956l2, 3072);
                            List list2 = list;
                            boolean zAdmob = c6956l2.admob(list2) | c6956l2.crashlytics(c13250l.f26029l) | c6956l2.crashlytics(c13250l3.f26029l) | c6956l2.admob(interfaceC2262l) | c6956l2.admob(c13009l2);
                            Function0 function2 = function0;
                            boolean zBilling2 = zAdmob | c6956l2.billing(function2);
                            Object objM2132native8 = c6956l2.m2132native();
                            if (zBilling2 || objM2132native8 == c13863l) {
                                C13250l c13250l5 = c13250l;
                                c13009l = c13009l2;
                                c13765l2 = c13765l4;
                                C18015l c18015l = new C18015l(c13765l2, list2, c13250l5, c13250l3, interfaceC2262l, c13009l, function2);
                                c13250l2 = c13250l5;
                                c6956l2.m2147try(c18015l);
                                objM2132native8 = c18015l;
                            } else {
                                c13250l2 = c13250l;
                                c13009l = c13009l2;
                                c13765l2 = c13765l4;
                            }
                            final InterfaceC8714l interfaceC8714lVip3 = AbstractC8020l.vip((Function1) objM2132native8, c6956l2);
                            final boolean z9 = z6;
                            final C2403l c2403l9 = c2403l8;
                            final C13009l c13009l3 = c13009l;
                            final C13765l c13765l6 = c13765l;
                            C6085l c6085l = new C6085l(new Function3() { // from class: lْۥٗ
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                    InterfaceC17242l interfaceC17242lPremium = (InterfaceC17242l) obj5;
                                    C6956l c6956l3 = (C6956l) obj6;
                                    ((Integer) obj7).getClass();
                                    c6956l3.m2123default(1945228890);
                                    if (z9) {
                                        c6956l3.m2123default(-1679801122);
                                        Object objM2132native9 = c6956l3.m2132native();
                                        C13863l c13863l2 = C1867l.yandex;
                                        if (objM2132native9 == c13863l2) {
                                            objM2132native9 = AbstractC12311l.isPro(c6956l3);
                                            c6956l3.m2147try(objM2132native9);
                                        }
                                        InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) objM2132native9;
                                        float f9 = fAdmob;
                                        Float fValueOf = Float.valueOf(f9);
                                        boolean z10 = z8;
                                        Boolean boolValueOf = Boolean.valueOf(z10);
                                        InterfaceC6940l interfaceC6940l = c13009l3;
                                        Object[] objArr = {interfaceC6940l, c2403l9, fValueOf, boolValueOf};
                                        boolean zMopub = c6956l3.mopub(z10) | c6956l3.crashlytics(f9);
                                        InterfaceC8714l interfaceC8714l = c13765l6;
                                        boolean zBilling3 = zMopub | c6956l3.billing(interfaceC8714l);
                                        InterfaceC12244l interfaceC12244l = c13765l2;
                                        boolean zBilling4 = zBilling3 | c6956l3.billing(interfaceC12244l) | c6956l3.admob(interfaceC2262l2) | c6956l3.admob(interfaceC6940l);
                                        InterfaceC8714l interfaceC8714l2 = interfaceC8714lVip3;
                                        boolean zBilling5 = c6956l3.billing(interfaceC8714l2) | zBilling4;
                                        Object objM2132native10 = c6956l3.m2132native();
                                        if (zBilling5 || objM2132native10 == c13863l2) {
                                            C14757l c14757l = new C14757l(z10, f9, interfaceC8714l, interfaceC12244l, interfaceC2262l2, interfaceC6940l, interfaceC8714l2);
                                            c6956l3.m2147try(c14757l);
                                            objM2132native10 = c14757l;
                                        }
                                        C9185l c9185l = AbstractC1782l.yandex;
                                        interfaceC17242lPremium = interfaceC17242lPremium.premium(new C8110l(null, null, objArr, (PointerInputEventHandler) objM2132native10, 3));
                                        c6956l3.startapp(false);
                                    } else {
                                        c6956l3.m2123default(-1678708124);
                                        c6956l3.startapp(false);
                                    }
                                    c6956l3.startapp(false);
                                    return interfaceC17242lPremium;
                                }
                            });
                            boolean zBooleanValue = ((Boolean) c13009l3.loadAd.getValue()).booleanValue();
                            boolean zBilling3 = c6956l2.billing(interfaceC8714lVip3);
                            Object objM2132native9 = c6956l2.m2132native();
                            if (zBilling3 || objM2132native9 == c13863l) {
                                objM2132native9 = new C12996l(interfaceC8714lVip3, null);
                                c6956l2.m2147try(objM2132native9);
                            }
                            InterfaceC17242l interfaceC17242lYandex = AbstractC16318l.yandex(c13009l3, z9, c2403l9, zBooleanValue, (Function3) objM2132native9, z8);
                            float f9 = c12015l2.yandex;
                            float f10 = c12015l2.loadAd;
                            float fAmazon4 = AbstractC8576l.amazon(f2, f9, f10);
                            float f11 = f10 - f9;
                            float f12 = f11 == 0.0f ? 0.0f : (fAmazon4 - f9) / f11;
                            if (f12 < 0.0f) {
                                f12 = 0.0f;
                            }
                            if (f12 > 1.0f) {
                                f12 = 1.0f;
                            }
                            AbstractC11840l.crashlytics(z9, f12, list2, c10164l, c13250l3.f26029l - c13250l2.f26029l, c2403l9, c6085l.premium(interfaceC17242lYandex), c6956l2, 0);
                        } else {
                            c6956l2.m2124else();
                        }
                        return Unit.INSTANCE;
                    }
                }, c6956l), c6956l, 3072, 6);
                z3 = z6;
                i4 = i11;
                c2403l3 = c2403l4;
            } else {
                c6956l.m2124else();
                z3 = z;
                c2403l3 = c2403l2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: l٘ٛ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        AbstractC11840l.loadAd(f, function1, interfaceC17242l, z3, c12015l, i4, function0, c2403l3, c10164l, (C6956l) obj2, AbstractC0545l.purchase(i2 | 1), i3);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i6 |= 12582912;
        c2403l2 = c2403l;
        if (c6956l.billing(c10164l)) {
            i9 = 67108864;
        } else {
            i9 = 33554432;
        }
        i10 = i6 | i9;
        if ((38347923 & i10) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c6956l.m2127for(i10 & 1, z2)) {
            c6956l.m2141switch();
            if ((i2 & 1) != 0) {
                if (i16 != 0) {
                    i4 = 0;
                }
                if (i7 != 0) {
                    c2403l2 = null;
                }
                c2403l4 = c2403l2;
                i11 = i4;
                z4 = true;
            } else {
                if (i16 != 0) {
                    i4 = 0;
                }
                if (i7 != 0) {
                    c2403l2 = null;
                }
                c2403l4 = c2403l2;
                i11 = i4;
                z4 = true;
            }
            c6956l.adcel();
            obj = C1867l.yandex;
            if (c2403l4 == null) {
                c6956l.m2123default(-1127489737);
                objM2132native2 = c6956l.m2132native();
                if (objM2132native2 == obj) {
                    objM2132native2 = AbstractC14814l.isPro(c6956l);
                }
                c2403l5 = (C2403l) objM2132native2;
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-313465952);
                c6956l.startapp(false);
                c2403l5 = c2403l4;
            }
            if (i11 >= 0) {
                C8339l.metrica("steps should be >= 0");
                return;
            }
            interfaceC8714lVip = AbstractC8020l.vip(function1, c6956l);
            interfaceC8714lVip2 = AbstractC8020l.vip(function0, c6956l);
            if ((i10 & 458752) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            objM2132native = c6956l.m2132native();
            if (z5) {
                if (i11 == 0) {
                    objM2132native = C2580l.f5619l;
                } else {
                    i12 = i11 + 2;
                    arrayList = new ArrayList(i12);
                    while (i13 < i12) {
                        arrayList.add(Float.valueOf(i13 / (i11 + 1)));
                    }
                    objM2132native = arrayList;
                }
                c6956l.m2147try(objM2132native);
            } else {
                if (i11 == 0) {
                    objM2132native = C2580l.f5619l;
                } else {
                    i12 = i11 + 2;
                    arrayList = new ArrayList(i12);
                    while (i13 < i12) {
                        arrayList.add(Float.valueOf(i13 / (i11 + 1)));
                    }
                    objM2132native = arrayList;
                }
                c6956l.m2147try(objM2132native);
            }
            list = (List) objM2132native;
            C10707l c10707l4 = AbstractC16206l.yandex;
            InterfaceC17242l interfaceC17242lSubs4 = AbstractC0080l.subs(interfaceC17242l.premium(C17379l.f33846l), 20.0f, 20.0f, 0.0f, 0.0f, 12);
            final float fAmazon4 = AbstractC8576l.amazon(f, c12015l.yandex, c12015l.loadAd);
            z6 = z4;
            interfaceC17242lLoadAd = AbstractC13702l.loadAd(AbstractC4962l.yandex(AbstractC4962l.yandex(interfaceC17242lSubs4, false, new Function1() { // from class: lٍؒٙ
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    InterfaceC17593l interfaceC17593l = (InterfaceC17593l) obj2;
                    if (!z6) {
                        AbstractC3668l.yandex(interfaceC17593l);
                    }
                    final float f2 = fAmazon4;
                    final int i17 = i11;
                    final C12015l c12015l2 = c12015l;
                    final Function0 function2 = function0;
                    final Function1 function3 = function1;
                    Function1 function4 = new Function1() { // from class: lْۘٓ
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            int i18;
                            float fFloatValue = ((Float) obj3).floatValue();
                            C12015l c12015l3 = c12015l2;
                            float f3 = c12015l3.yandex;
                            float f4 = c12015l3.loadAd;
                            float fAmazon5 = AbstractC8576l.amazon(fFloatValue, f3, f4);
                            int i19 = i17;
                            boolean z8 = false;
                            if (i19 > 0 && (i18 = i19 + 1) >= 0) {
                                float fAbs = fAmazon5;
                                float f5 = fAbs;
                                int i20 = 0;
                                while (true) {
                                    float fFirebase = AbstractC7572l.firebase(f3, f4, i20 / i18);
                                    float f6 = fFirebase - fAmazon5;
                                    if (Math.abs(f6) <= fAbs) {
                                        fAbs = Math.abs(f6);
                                        f5 = fFirebase;
                                    }
                                    if (i20 == i18) {
                                        break;
                                    }
                                    i20++;
                                }
                                fAmazon5 = f5;
                            }
                            if (fAmazon5 != f2) {
                                function3.invoke(Float.valueOf(fAmazon5));
                                Function0 function5 = function2;
                                if (function5 != null) {
                                    function5.invoke();
                                }
                                z8 = true;
                            }
                            return Boolean.valueOf(z8);
                        }
                    };
                    InterfaceC13922l[] interfaceC13922lArr = AbstractC3668l.yandex;
                    interfaceC17593l.amazon(AbstractC16601l.subs, new C7629l(null, function4));
                    return Unit.INSTANCE;
                }
            }), true, new C13706l(f, c12015l, i11)), z6, c2403l5);
            if (c6956l.isPro(AbstractC4751l.vip) == EnumC9931l.f20222l) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (i11 >= 0) {
                C8339l.metrica("steps should be >= 0");
                return;
            }
            final C2403l c2403l9 = c2403l5;
            AbstractC11308l.yandex(AbstractC10802l.purchase(interfaceC17242lLoadAd, new C10271l(z6, c12015l, i11, interfaceC8714lVip, f, z7, interfaceC8714lVip2)), null, AbstractC14566l.amazon(2085116814, new Function3() { // from class: lٌِٜ
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    C13765l c13765l;
                    C13250l c13250l;
                    C12015l c12015l2;
                    C13009l c13009l;
                    final C13765l c13765l2;
                    C13250l c13250l2;
                    C0923l c0923l = (C0923l) obj2;
                    C6956l c6956l2 = (C6956l) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= c6956l2.billing(c0923l) ? 4 : 2;
                    }
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                        final boolean z8 = c6956l2.isPro(AbstractC4751l.vip) == EnumC9931l.f20222l;
                        final float fAdmob = C15519l.admob(c0923l.loadAd);
                        C13250l c13250l3 = new C13250l();
                        C13250l c13250l4 = new C13250l();
                        InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l2.isPro(AbstractC4751l.admob);
                        c13250l3.f26029l = Math.max(fAdmob - interfaceC13490l.mo868instanceof(10.0f), 0.0f);
                        c13250l4.f26029l = Math.min(interfaceC13490l.mo868instanceof(10.0f), c13250l3.f26029l);
                        Object objM2132native3 = c6956l2.m2132native();
                        C13863l c13863l = C1867l.yandex;
                        if (objM2132native3 == c13863l) {
                            objM2132native3 = AbstractC12311l.isPro(c6956l2);
                            c6956l2.m2147try(objM2132native3);
                        }
                        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native3;
                        Object objM2132native4 = c6956l2.m2132native();
                        C12015l c12015l3 = c12015l;
                        float f2 = f;
                        if (objM2132native4 == c13863l) {
                            float f3 = c12015l3.yandex;
                            float f4 = c12015l3.loadAd;
                            float f5 = c13250l4.f26029l;
                            float f6 = c13250l3.f26029l;
                            float f7 = f4 - f3;
                            float f8 = f7 == 0.0f ? 0.0f : (f2 - f3) / f7;
                            if (f8 < 0.0f) {
                                f8 = 0.0f;
                            }
                            if (f8 > 1.0f) {
                                f8 = 1.0f;
                            }
                            C13765l c13765l3 = new C13765l(AbstractC7572l.firebase(f5, f6, f8));
                            c6956l2.m2147try(c13765l3);
                            objM2132native4 = c13765l3;
                        }
                        C13765l c13765l4 = (C13765l) objM2132native4;
                        Object objM2132native5 = c6956l2.m2132native();
                        if (objM2132native5 == c13863l) {
                            objM2132native5 = new C13765l(0.0f);
                            c6956l2.m2147try(objM2132native5);
                        }
                        C13765l c13765l5 = (C13765l) objM2132native5;
                        boolean zCrashlytics = c6956l2.crashlytics(c13250l4.f26029l) | c6956l2.crashlytics(c13250l3.f26029l) | c6956l2.billing(c12015l3);
                        Object objM2132native6 = c6956l2.m2132native();
                        if (zCrashlytics || objM2132native6 == c13863l) {
                            C2623l c2623l = new C2623l(c13765l4, c13765l5, c13250l4, c13250l3, interfaceC8714lVip, c12015l3);
                            c13765l = c13765l5;
                            c13250l = c13250l4;
                            c12015l2 = c12015l3;
                            objM2132native6 = new C13009l(c2623l);
                            c6956l2.m2147try(objM2132native6);
                        } else {
                            c12015l2 = c12015l3;
                            c13765l = c13765l5;
                            c13250l = c13250l4;
                        }
                        C13009l c13009l2 = (C13009l) objM2132native6;
                        boolean zBilling = c6956l2.billing(c12015l2) | c6956l2.crashlytics(c13250l.f26029l) | c6956l2.crashlytics(c13250l3.f26029l);
                        Object objM2132native7 = c6956l2.m2132native();
                        if (zBilling || objM2132native7 == c13863l) {
                            objM2132native7 = new C17647l(c12015l2, c13250l, c13250l3);
                            c6956l2.m2147try(objM2132native7);
                        }
                        AbstractC11840l.yandex((Function1) ((InterfaceC5059l) objM2132native7), c12015l2, new C12015l(c13250l.f26029l, c13250l3.f26029l), c13765l4, f2, c6956l2, 3072);
                        List list2 = list;
                        boolean zAdmob = c6956l2.admob(list2) | c6956l2.crashlytics(c13250l.f26029l) | c6956l2.crashlytics(c13250l3.f26029l) | c6956l2.admob(interfaceC2262l) | c6956l2.admob(c13009l2);
                        Function0 function2 = function0;
                        boolean zBilling2 = zAdmob | c6956l2.billing(function2);
                        Object objM2132native8 = c6956l2.m2132native();
                        if (zBilling2 || objM2132native8 == c13863l) {
                            C13250l c13250l5 = c13250l;
                            c13009l = c13009l2;
                            c13765l2 = c13765l4;
                            C18015l c18015l = new C18015l(c13765l2, list2, c13250l5, c13250l3, interfaceC2262l, c13009l, function2);
                            c13250l2 = c13250l5;
                            c6956l2.m2147try(c18015l);
                            objM2132native8 = c18015l;
                        } else {
                            c13250l2 = c13250l;
                            c13009l = c13009l2;
                            c13765l2 = c13765l4;
                        }
                        final InterfaceC8714l interfaceC8714lVip3 = AbstractC8020l.vip((Function1) objM2132native8, c6956l2);
                        final boolean z9 = z6;
                        final C2403l c2403l10 = c2403l9;
                        final C13009l c13009l3 = c13009l;
                        final C13765l c13765l6 = c13765l;
                        C6085l c6085l = new C6085l(new Function3() { // from class: lْۥٗ
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                InterfaceC17242l interfaceC17242lPremium = (InterfaceC17242l) obj5;
                                C6956l c6956l3 = (C6956l) obj6;
                                ((Integer) obj7).getClass();
                                c6956l3.m2123default(1945228890);
                                if (z9) {
                                    c6956l3.m2123default(-1679801122);
                                    Object objM2132native9 = c6956l3.m2132native();
                                    C13863l c13863l2 = C1867l.yandex;
                                    if (objM2132native9 == c13863l2) {
                                        objM2132native9 = AbstractC12311l.isPro(c6956l3);
                                        c6956l3.m2147try(objM2132native9);
                                    }
                                    InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) objM2132native9;
                                    float f9 = fAdmob;
                                    Float fValueOf = Float.valueOf(f9);
                                    boolean z10 = z8;
                                    Boolean boolValueOf = Boolean.valueOf(z10);
                                    InterfaceC6940l interfaceC6940l = c13009l3;
                                    Object[] objArr = {interfaceC6940l, c2403l10, fValueOf, boolValueOf};
                                    boolean zMopub = c6956l3.mopub(z10) | c6956l3.crashlytics(f9);
                                    InterfaceC8714l interfaceC8714l = c13765l6;
                                    boolean zBilling3 = zMopub | c6956l3.billing(interfaceC8714l);
                                    InterfaceC12244l interfaceC12244l = c13765l2;
                                    boolean zBilling4 = zBilling3 | c6956l3.billing(interfaceC12244l) | c6956l3.admob(interfaceC2262l2) | c6956l3.admob(interfaceC6940l);
                                    InterfaceC8714l interfaceC8714l2 = interfaceC8714lVip3;
                                    boolean zBilling5 = c6956l3.billing(interfaceC8714l2) | zBilling4;
                                    Object objM2132native10 = c6956l3.m2132native();
                                    if (zBilling5 || objM2132native10 == c13863l2) {
                                        C14757l c14757l = new C14757l(z10, f9, interfaceC8714l, interfaceC12244l, interfaceC2262l2, interfaceC6940l, interfaceC8714l2);
                                        c6956l3.m2147try(c14757l);
                                        objM2132native10 = c14757l;
                                    }
                                    C9185l c9185l = AbstractC1782l.yandex;
                                    interfaceC17242lPremium = interfaceC17242lPremium.premium(new C8110l(null, null, objArr, (PointerInputEventHandler) objM2132native10, 3));
                                    c6956l3.startapp(false);
                                } else {
                                    c6956l3.m2123default(-1678708124);
                                    c6956l3.startapp(false);
                                }
                                c6956l3.startapp(false);
                                return interfaceC17242lPremium;
                            }
                        });
                        boolean zBooleanValue = ((Boolean) c13009l3.loadAd.getValue()).booleanValue();
                        boolean zBilling3 = c6956l2.billing(interfaceC8714lVip3);
                        Object objM2132native9 = c6956l2.m2132native();
                        if (zBilling3 || objM2132native9 == c13863l) {
                            objM2132native9 = new C12996l(interfaceC8714lVip3, null);
                            c6956l2.m2147try(objM2132native9);
                        }
                        InterfaceC17242l interfaceC17242lYandex = AbstractC16318l.yandex(c13009l3, z9, c2403l10, zBooleanValue, (Function3) objM2132native9, z8);
                        float f9 = c12015l2.yandex;
                        float f10 = c12015l2.loadAd;
                        float fAmazon5 = AbstractC8576l.amazon(f2, f9, f10);
                        float f11 = f10 - f9;
                        float f12 = f11 == 0.0f ? 0.0f : (fAmazon5 - f9) / f11;
                        if (f12 < 0.0f) {
                            f12 = 0.0f;
                        }
                        if (f12 > 1.0f) {
                            f12 = 1.0f;
                        }
                        AbstractC11840l.crashlytics(z9, f12, list2, c10164l, c13250l3.f26029l - c13250l2.f26029l, c2403l10, c6085l.premium(interfaceC17242lYandex), c6956l2, 0);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, 3072, 6);
            z3 = z6;
            i4 = i11;
            c2403l3 = c2403l4;
        } else {
            c6956l.m2124else();
            z3 = z;
            c2403l3 = c2403l2;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: l٘ٛ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    AbstractC11840l.loadAd(f, function1, interfaceC17242l, z3, c12015l, i4, function0, c2403l3, c10164l, (C6956l) obj2, AbstractC0545l.purchase(i2 | 1), i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void purchase(final InterfaceC17242l interfaceC17242l, final C10164l c10164l, final boolean z, final float f, final List list, final float f2, final float f3, C6956l c6956l, final int i) {
        int i2;
        float f4;
        c6956l.m2133new(1833126050);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(c10164l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.mopub(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.crashlytics(0.0f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.crashlytics(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.admob(list) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            f4 = f2;
            i2 |= c6956l.crashlytics(f4) ? 1048576 : 524288;
        } else {
            f4 = f2;
        }
        if ((12582912 & i) == 0) {
            i2 |= c6956l.crashlytics(f3) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (c6956l.m2127for(i3 & 1, (4793491 & i3) != 4793490)) {
            InterfaceC8714l interfaceC8714lLoadAd = c10164l.loadAd(z, false, c6956l);
            InterfaceC8714l interfaceC8714lLoadAd2 = c10164l.loadAd(z, true, c6956l);
            InterfaceC8714l interfaceC8714lYandex = c10164l.yandex(z, false, c6956l);
            InterfaceC8714l interfaceC8714lYandex2 = c10164l.yandex(z, true, c6956l);
            boolean zBilling = ((i3 & 3670016) == 1048576) | c6956l.billing(interfaceC8714lLoadAd) | ((29360128 & i3) == 8388608) | ((57344 & i3) == 16384) | ((i3 & 7168) == 2048) | c6956l.billing(interfaceC8714lLoadAd2) | c6956l.admob(list) | c6956l.billing(interfaceC8714lYandex) | c6956l.billing(interfaceC8714lYandex2);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                C15505l c15505l = new C15505l(f4, interfaceC8714lLoadAd, f3, f, interfaceC8714lLoadAd2, list, interfaceC8714lYandex, interfaceC8714lYandex2);
                c6956l.m2147try(c15505l);
                objM2132native = c15505l;
            }
            AbstractC12155l.yandex(interfaceC17242l, (Function1) objM2132native, c6956l, i3 & 14);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٍؙْ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC11840l.purchase(interfaceC17242l, c10164l, z, f, list, f2, f3, (C6956l) obj, AbstractC0545l.purchase(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void yandex(final Function1 function1, final C12015l c12015l, final C12015l c12015l2, final InterfaceC8714l interfaceC8714l, float f, C6956l c6956l, final int i) {
        final float f2;
        final InterfaceC8714l interfaceC8714l2;
        final C12015l c12015l3;
        final C12015l c12015l4;
        final Function1 function2;
        c6956l.m2133new(-743965752);
        int i2 = (c6956l.admob(function1) ? 4 : 2) | i | (c6956l.billing(c12015l) ? 32 : 16) | (c6956l.billing(c12015l2) ? 256 : 128) | (c6956l.crashlytics(f) ? 16384 : 8192);
        if (c6956l.m2127for(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((57344 & i2) == 16384) | ((i2 & 896) == 256);
            Object objM2132native = c6956l.m2132native();
            if (z || objM2132native == C1867l.yandex) {
                f2 = f;
                Function0 function0 = new Function0() { // from class: lٖٖٞ
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        C12015l c12015l5 = c12015l;
                        float f3 = (c12015l5.loadAd - c12015l5.yandex) / 1000.0f;
                        float fFloatValue = ((Number) function1.invoke(Float.valueOf(f2))).floatValue();
                        InterfaceC8714l interfaceC8714l3 = interfaceC8714l;
                        if (Math.abs(fFloatValue - ((Number) interfaceC8714l3.getValue()).floatValue()) > f3) {
                            float fFloatValue2 = ((Number) ((Comparable) interfaceC8714l3.getValue())).floatValue();
                            C12015l c12015l6 = c12015l2;
                            if (fFloatValue2 >= c12015l6.yandex && fFloatValue2 <= c12015l6.loadAd) {
                                interfaceC8714l3.setValue(Float.valueOf(fFloatValue));
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                c12015l4 = c12015l;
                function2 = function1;
                interfaceC8714l2 = interfaceC8714l;
                c12015l3 = c12015l2;
                c6956l.m2147try(function0);
                objM2132native = function0;
            } else {
                f2 = f;
                interfaceC8714l2 = interfaceC8714l;
                c12015l3 = c12015l2;
                c12015l4 = c12015l;
                function2 = function1;
            }
            AbstractC12311l.billing((Function0) objM2132native, c6956l);
        } else {
            f2 = f;
            interfaceC8714l2 = interfaceC8714l;
            c12015l3 = c12015l2;
            c12015l4 = c12015l;
            function2 = function1;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            final float f3 = f2;
            c4224lAds.amazon = new Function2(c12015l4, c12015l3, interfaceC8714l2, f3, i) { // from class: lًؗٓ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ C12015l f9916l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ C12015l f9917l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ float f9919l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC8714l f9920l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(3073);
                    AbstractC11840l.yandex(this.f9918l, this.f9917l, this.f9916l, this.f9920l, this.f9919l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
