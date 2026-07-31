package defpackage;

import java.net.ProtocolException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؘٝؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5832l {
    public static final C15578l loadAd = new C15578l(-1183112518, false, new C1590l(22));
    public final /* synthetic */ int yandex;

    public /* synthetic */ AbstractC5832l(int i) {
        this.yandex = i;
    }

    public static final float amazon(float f, float f2, float f3, float[] fArr) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f4 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f4);
            } else {
                float fAbs = Math.abs(AbstractC7572l.firebase(f2, f3, f4) - f);
                if (1 <= length) {
                    while (true) {
                        float f5 = fArr[i];
                        float fAbs2 = Math.abs(AbstractC7572l.firebase(f2, f3, f5) - f);
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            f4 = f5;
                            fAbs = fAbs2;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                fValueOf = Float.valueOf(f4);
            }
        }
        return fValueOf != null ? AbstractC7572l.firebase(f2, f3, fValueOf.floatValue()) : f;
    }

    public static C13698l billing(String str) throws ProtocolException {
        int i;
        String strSubstring;
        boolean zIsVip = AbstractC16648l.isVip(str, "HTTP/1.", false);
        EnumC9199l enumC9199l = EnumC9199l.HTTP_1_0;
        EnumC9199l enumC9199l2 = EnumC9199l.HTTP_1_1;
        if (zIsVip) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                enumC9199l = enumC9199l2;
            }
        } else if (AbstractC16648l.isVip(str, "ICY ", false)) {
            i = 4;
        } else {
            if (!AbstractC16648l.isVip(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 12;
            enumC9199l = enumC9199l2;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer numSignatures = AbstractC16648l.signatures(str.substring(i, i2));
        if (numSignatures == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numSignatures.intValue();
        if (str.length() <= i2) {
            strSubstring = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
        }
        return new C13698l(enumC9199l, iIntValue, strSubstring, 25);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void crashlytics(final InterfaceC17242l interfaceC17242l, final C11625l c11625l, final boolean z, final C2403l c2403l, final float f, final C15578l c15578l, final C15578l c15578l2, final C1530l c1530l, C6956l c6956l, final int i) {
        int i2;
        C6956l c6956l2;
        C11625l c11625l2;
        boolean z2;
        InterfaceC17242l c8110l;
        int i3;
        C6956l c6956l3 = c6956l;
        c6956l3.m2133new(-81540261);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (c6956l3.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l3.billing(c11625l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l3.mopub(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l3.billing(c2403l) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l3.crashlytics(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l3.admob(c15578l) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c6956l3.admob(c15578l2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c6956l3.billing(c1530l) ? 8388608 : 4194304;
        }
        int i5 = i2;
        if (c6956l3.m2127for(i5 & 1, (i5 & 4793491) != 4793490)) {
            c11625l.admob = c6956l3.isPro(AbstractC4751l.vip) == EnumC9931l.f20222l;
            C4346l c4346l = C4346l.f8873l;
            if (z) {
                C7795l c7795l = new C7795l(i4, c11625l);
                C9185l c9185l = AbstractC1782l.yandex;
                c11625l2 = c11625l;
                z2 = true;
                c8110l = new C8110l(c11625l2, c2403l, null, c7795l, 4);
            } else {
                c11625l2 = c11625l;
                z2 = true;
                c8110l = c4346l;
            }
            boolean z3 = c11625l2.admob;
            boolean zBooleanValue = ((Boolean) c11625l2.isPro.getValue()).booleanValue();
            int i6 = i5 & 112;
            boolean z4 = i6 == 32 ? z2 : false;
            Object objM2132native = c6956l3.m2132native();
            Object obj = C1867l.yandex;
            if (z4 || objM2132native == obj) {
                objM2132native = new C17095l(c11625l2, (InterfaceC14029l) null, 3);
                c6956l3.m2147try(objM2132native);
            }
            C11625l c11625l3 = c11625l2;
            InterfaceC17242l interfaceC17242lYandex = AbstractC16318l.yandex(c11625l3, z, c2403l, zBooleanValue, (Function3) objM2132native, z3);
            C17857l c17857l = AbstractC16434l.yandex;
            InterfaceC17242l interfaceC17242lYandex2 = AbstractC4962l.yandex(AbstractC13702l.loadAd(interfaceC17242l.premium(C18158l.f35556l), z, c2403l), false, new C9012l(z, c11625l3, 2));
            float fAdmob = c11625l3.amazon.admob();
            C12015l c12015l = c11625l3.loadAd;
            InterfaceC17242l interfaceC17242lPremium = AbstractC4962l.yandex(interfaceC17242lYandex2, true, new C13706l(fAdmob, new C12015l(c12015l.yandex, c12015l.loadAd), c11625l3.yandex)).premium(c8110l).premium(interfaceC17242lYandex);
            boolean z5 = i6 == 32;
            Object objM2132native2 = c6956l3.m2132native();
            if (z5 || objM2132native2 == obj) {
                i3 = 1;
                objM2132native2 = new C17999l(i3, c11625l3);
                c6956l3.m2147try(objM2132native2);
            } else {
                i3 = 1;
            }
            InterfaceC10835l interfaceC10835l = (InterfaceC10835l) objM2132native2;
            long j = c6956l3.f14595continue;
            int i7 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, interfaceC17242lPremium);
            InterfaceC8801l.firebase.getClass();
            Function0 function0 = C3438l.loadAd;
            c6956l3.m2140super();
            if (c6956l3.f14603switch) {
                c6956l3.firebase(function0);
            } else {
                c6956l3.m2136protected();
            }
            AbstractC8182l.billing(c6956l3, interfaceC10835l, C3438l.mopub);
            AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l3, Integer.valueOf(i7), C3438l.isPro);
            AbstractC8182l.purchase(c6956l3, C3438l.firebase);
            AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, C3438l.amazon);
            AbstractC3383l.yandex(c4346l, null, AbstractC13880l.yandex(c1530l.loadAd, c1530l.purchase, 0L, 0L, c6956l, 0, 12), null, null, AbstractC14566l.amazon(1377504786, new Function3() { // from class: lؑۤۨ
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    C6956l c6956l4 = (C6956l) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    final int i8 = 0;
                    final int i9 = 1;
                    if (c6956l4.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                        final C11625l c11625l4 = c11625l;
                        boolean zBilling = c6956l4.billing(c11625l4);
                        C1530l c1530l2 = c1530l;
                        boolean zBilling2 = zBilling | c6956l4.billing(c1530l2);
                        float f2 = f;
                        boolean zCrashlytics = zBilling2 | c6956l4.crashlytics(f2);
                        Object objM2132native3 = c6956l4.m2132native();
                        int i10 = 2;
                        if (zCrashlytics || objM2132native3 == C1867l.yandex) {
                            objM2132native3 = new C12960l(c11625l4, c1530l2, f2, i10);
                            c6956l4.m2147try(objM2132native3);
                        }
                        InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(AbstractC0080l.amazon(AbstractC14289l.firebase(C4346l.f8873l, (Function1) objM2132native3), 1.0f), 16.0f);
                        C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l4, 48);
                        long j2 = c6956l4.f14595continue;
                        int i11 = (int) (j2 ^ (j2 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato2 = c6956l4.smaato();
                        InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l4, interfaceC17242lSmaato);
                        InterfaceC8801l.firebase.getClass();
                        C16395l c16395l = C3438l.loadAd;
                        c6956l4.m2140super();
                        if (c6956l4.f14603switch) {
                            c6956l4.firebase(c16395l);
                        } else {
                            c6956l4.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l4, c5062lYandex, C3438l.mopub);
                        AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato2, C3438l.billing);
                        AbstractC8182l.billing(c6956l4, Integer.valueOf(i11), C3438l.isPro);
                        AbstractC8182l.purchase(c6956l4, C3438l.firebase);
                        AbstractC8182l.billing(c6956l4, interfaceC17242lBilling2, C3438l.amazon);
                        C8540l c8540l = AbstractC12502l.yandex;
                        C10092l c10092lStartapp = AbstractC5020l.startapp(c1530l2.amazon, c8540l);
                        C8540l c8540l2 = AbstractC13010l.yandex;
                        C11090l c11090l = (C11090l) c6956l4.isPro(c8540l2);
                        C10707l c10707l = AbstractC16964l.yandex;
                        C10092l[] c10092lArr = {c10092lStartapp, c8540l2.yandex(c11090l.purchase(((C14370l) c6956l4.isPro(c10707l)).loadAd.admob))};
                        final C15578l c15578l3 = c15578l;
                        AbstractC10478l.loadAd(c10092lArr, AbstractC14566l.amazon(-1968840082, new Function2() { // from class: lٓٔۜ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                int i12 = i8;
                                C11625l c11625l5 = c11625l4;
                                C15578l c15578l4 = c15578l3;
                                C6956l c6956l5 = (C6956l) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                switch (i12) {
                                    case 0:
                                        if (c6956l5.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            c15578l4.invoke(c11625l5, c6956l5, 0);
                                        } else {
                                            c6956l5.m2124else();
                                        }
                                        break;
                                    default:
                                        if (c6956l5.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            c15578l4.invoke(c11625l5, c6956l5, 0);
                                        } else {
                                            c6956l5.m2124else();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, c6956l4), c6956l4, 56);
                        AbstractC9334l.yandex(c6956l4, new C9247l(1.0f, true));
                        C10092l[] c10092lArr2 = {AbstractC5020l.startapp(c1530l2.purchase, c8540l), c8540l2.yandex(((C11090l) c6956l4.isPro(c8540l2)).purchase(((C14370l) c6956l4.isPro(c10707l)).loadAd.firebase))};
                        final C15578l c15578l4 = c15578l2;
                        AbstractC10478l.loadAd(c10092lArr2, AbstractC14566l.amazon(-1865829993, new Function2() { // from class: lٓٔۜ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                int i12 = i9;
                                C11625l c11625l5 = c11625l4;
                                C15578l c15578l5 = c15578l4;
                                C6956l c6956l5 = (C6956l) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                switch (i12) {
                                    case 0:
                                        if (c6956l5.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            c15578l5.invoke(c11625l5, c6956l5, 0);
                                        } else {
                                            c6956l5.m2124else();
                                        }
                                        break;
                                    default:
                                        if (c6956l5.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            c15578l5.invoke(c11625l5, c6956l5, 0);
                                        } else {
                                            c6956l5.m2124else();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, c6956l4), c6956l4, 56);
                        c6956l4.startapp(true);
                    } else {
                        c6956l4.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, 196614, 26);
            C6956l c6956l4 = c6956l;
            c6956l4.startapp(i3);
            c6956l2 = c6956l4;
        } else {
            c6956l3.m2124else();
            c6956l2 = c6956l3;
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lَٓٓ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    AbstractC5832l.crashlytics(interfaceC17242l, c11625l, z, c2403l, f, c15578l, c15578l2, c1530l, (C6956l) obj2, AbstractC0545l.purchase(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void loadAd(float f, final Function1 function1, final InterfaceC17242l interfaceC17242l, final C2403l c2403l, final boolean z, final float f2, final int i, final C12015l c12015l, final Function0 function0, final C15578l c15578l, final C15578l c15578l2, final C1530l c1530l, C6956l c6956l, final int i2, final int i3) {
        int i4;
        C2403l c2403l2;
        boolean z2;
        float f3;
        int i5;
        C12015l c12015l2;
        int i6;
        Function1 function2;
        float f4 = f;
        c6956l.m2133new(963818248);
        if ((i2 & 6) == 0) {
            i4 = (c6956l.crashlytics(f4) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c6956l.admob(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            c2403l2 = c2403l;
            i4 |= c6956l.billing(c2403l2) ? 2048 : 1024;
        } else {
            c2403l2 = c2403l;
        }
        if ((i2 & 24576) == 0) {
            z2 = z;
            i4 |= c6956l.mopub(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if ((196608 & i2) == 0) {
            f3 = f2;
            i4 |= c6956l.crashlytics(f3) ? 131072 : 65536;
        } else {
            f3 = f2;
        }
        if ((1572864 & i2) == 0) {
            i5 = i;
            i4 |= c6956l.amazon(i5) ? 1048576 : 524288;
        } else {
            i5 = i;
        }
        if ((12582912 & i2) == 0) {
            c12015l2 = c12015l;
            i4 |= c6956l.billing(c12015l2) ? 8388608 : 4194304;
        } else {
            c12015l2 = c12015l;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= c6956l.admob(function0) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= c6956l.admob(c15578l) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (c6956l.admob(c15578l2) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= c6956l.billing(c1530l) ? 32 : 16;
        }
        int i7 = i6;
        int i8 = i4;
        if (c6956l.m2127for(i8 & 1, ((306783379 & i4) == 306783378 && (i7 & 19) == 18) ? false : true)) {
            c6956l.m2141switch();
            if ((i2 & 1) != 0 && !c6956l.ad()) {
                c6956l.m2124else();
            }
            c6956l.adcel();
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = new C11625l(f4, i5, c12015l2, function0, function1);
                function2 = function1;
                c6956l.m2147try(objM2132native);
            } else {
                function2 = function1;
            }
            C11625l c11625l = (C11625l) objM2132native;
            c11625l.amazon(f4);
            c11625l.purchase = function2;
            c11625l.crashlytics = function0;
            int i9 = i8 >> 6;
            int i10 = i7 << 18;
            crashlytics(interfaceC17242l, c11625l, z2, c2403l2, f3, c15578l, c15578l2, c1530l, c6956l, (i9 & 896) | (i9 & 14) | 48 | (i8 & 7168) | ((i8 >> 3) & 57344) | ((i8 >> 12) & 458752) | (3670016 & i10) | (i10 & 29360128));
        } else {
            f4 = f4;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            final float f5 = f4;
            c4224lAds.amazon = new Function2() { // from class: lؚٗؕ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(i2 | 1);
                    int iPurchase2 = AbstractC0545l.purchase(i3);
                    AbstractC5832l.loadAd(f5, function1, interfaceC17242l, c2403l, z, f2, i, c12015l, function0, c15578l, c15578l2, c1530l, (C6956l) obj, iPurchase, iPurchase2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x027f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0295  */
    /* JADX WARN: Code duplicated, block: B:111:0x0297  */
    /* JADX WARN: Code duplicated, block: B:115:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:118:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:124:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x0164  */
    /* JADX WARN: Code duplicated, block: B:60:0x0176  */
    /* JADX WARN: Code duplicated, block: B:62:0x017c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0181  */
    /* JADX WARN: Code duplicated, block: B:71:0x019b  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x0207  */
    /* JADX WARN: Code duplicated, block: B:91:0x0248  */
    /* JADX WARN: Code duplicated, block: B:96:0x025a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0260  */
    /* JADX WARN: Code duplicated, block: B:99:0x0265  */
    public static final void yandex(final float f, final Function1 function1, final InterfaceC17242l interfaceC17242l, C2403l c2403l, boolean z, final Function0 function0, final C15578l c15578l, final C15578l c15578l2, C1530l c1530l, float f2, final int i, final C12015l c12015l, C6956l c6956l, final int i2) {
        final C2403l c2403l2;
        final boolean z2;
        final C1530l c1530l2;
        final float f3;
        boolean z3;
        C1530l c1530l3;
        int i3;
        float f4;
        C2403l c2403l3;
        boolean z4;
        Object obj;
        boolean z5;
        Object objMopub;
        boolean zBooleanValue;
        long j;
        boolean zBilling;
        Object objM2132native;
        boolean zBooleanValue2;
        long j2;
        boolean zBilling2;
        Object objM2132native2;
        boolean z6;
        Object objMopub2;
        boolean zBooleanValue3;
        float f5;
        boolean zBilling3;
        Object objM2132native3;
        boolean zBooleanValue4;
        float f6;
        boolean zBilling4;
        Object objM2132native4;
        boolean zBilling5;
        AbstractC18620l abstractC18620lBilling;
        Function1 function1Purchase;
        AbstractC18620l abstractC18620lRemoteconfig;
        boolean zBilling6;
        AbstractC18620l abstractC18620lBilling2;
        Function1 function1Purchase2;
        AbstractC18620l abstractC18620lRemoteconfig2;
        c6956l.m2133new(-1827031971);
        int i4 = i2 | (c6956l.crashlytics(f) ? 4 : 2) | (c6956l.admob(function1) ? 32 : 16) | 27648 | (c6956l.admob(function0) ? 131072 : 65536) | 838860800;
        int i5 = 6 | (c6956l.billing(c12015l) ? 32 : 16);
        if (c6956l.m2127for(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            c6956l.m2141switch();
            int i6 = i2 & 1;
            C13863l c13863l = C1867l.yandex;
            if (i6 == 0 || c6956l.ad()) {
                Object objM2132native5 = c6956l.m2132native();
                if (objM2132native5 == c13863l) {
                    objM2132native5 = AbstractC14814l.isPro(c6956l);
                }
                AbstractC5189l abstractC5189l = AbstractC16964l.yandex;
                z3 = true;
                c1530l3 = new C1530l(((C14370l) c6956l.isPro(abstractC5189l)).yandex.startapp, ((C14370l) c6956l.isPro(abstractC5189l)).yandex.ads, C9735l.loadAd(0.25f, ((C14370l) c6956l.isPro(abstractC5189l)).yandex.yandex), ((C14370l) c6956l.isPro(abstractC5189l)).yandex.adcel, ((C14370l) c6956l.isPro(abstractC5189l)).yandex.subscription, ((C14370l) c6956l.isPro(abstractC5189l)).yandex.ads);
                i3 = i4 & (-234881025);
                f4 = 12.0f;
                c2403l3 = (C2403l) objM2132native5;
                z4 = true;
            } else {
                c6956l.m2124else();
                i3 = i4 & (-234881025);
                c2403l3 = c2403l;
                c1530l3 = c1530l;
                f4 = f2;
                z3 = true;
                z4 = z;
            }
            int i7 = i3;
            c6956l.adcel();
            C18656l c18656lIsPro = AbstractC2438l.isPro(Boolean.valueOf(!(f == 0.0f ? z3 : false)), "[MiuiSliderBorder] isActive (value != 0)", c6956l, 48, 0);
            boolean zBooleanValue5 = ((Boolean) c18656lIsPro.amazon.getValue()).booleanValue();
            c6956l.m2123default(-12729877);
            long j3 = zBooleanValue5 ? c1530l3.loadAd : c1530l3.yandex;
            c6956l.startapp(false);
            Object objBilling = C9735l.billing(j3);
            boolean zBilling7 = c6956l.billing(objBilling);
            Object objM2132native6 = c6956l.m2132native();
            if (zBilling7) {
                obj = c13863l;
            } else {
                obj = c13863l;
                if (objM2132native6 == obj) {
                }
                C0010l c0010l = (C0010l) objM2132native6;
                if (c18656lIsPro.mopub()) {
                    z5 = false;
                    objMopub = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lIsPro);
                } else {
                    c6956l.m2123default(1666573488);
                    zBilling6 = c6956l.billing(c18656lIsPro);
                    objMopub = c6956l.m2132native();
                    if (zBilling6 || objMopub == obj) {
                        abstractC18620lBilling2 = AbstractC7572l.billing();
                        if (abstractC18620lBilling2 != null) {
                            function1Purchase2 = abstractC18620lBilling2.purchase();
                        } else {
                            function1Purchase2 = null;
                        }
                        abstractC18620lRemoteconfig2 = AbstractC7572l.remoteconfig(abstractC18620lBilling2);
                        try {
                            Object objCrashlytics = c18656lIsPro.crashlytics();
                            AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                            c6956l.m2147try(objCrashlytics);
                            objMopub = objCrashlytics;
                        } catch (Throwable th) {
                            AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                            throw th;
                        }
                    }
                    z5 = false;
                    c6956l.startapp(false);
                }
                zBooleanValue = ((Boolean) objMopub).booleanValue();
                c6956l.m2123default(-12729877);
                if (zBooleanValue) {
                    j = c1530l3.loadAd;
                } else {
                    j = c1530l3.yandex;
                }
                c6956l.startapp(z5);
                C9735l c9735l = new C9735l(j);
                zBilling = c6956l.billing(c18656lIsPro);
                objM2132native = c6956l.m2132native();
                if (zBilling || objM2132native == obj) {
                    objM2132native = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 12));
                    c6956l.m2147try(objM2132native);
                }
                zBooleanValue2 = ((Boolean) ((InterfaceC12244l) objM2132native).getValue()).booleanValue();
                c6956l.m2123default(-12729877);
                if (zBooleanValue2) {
                    j2 = c1530l3.loadAd;
                } else {
                    j2 = c1530l3.yandex;
                }
                c6956l.startapp(false);
                C9735l c9735l2 = new C9735l(j2);
                zBilling2 = c6956l.billing(c18656lIsPro);
                objM2132native2 = c6956l.m2132native();
                if (zBilling2 || objM2132native2 == obj) {
                    objM2132native2 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 13));
                    c6956l.m2147try(objM2132native2);
                }
                c6956l.m2123default(-781456724);
                C2403l c2403l4 = c2403l3;
                C13315l c13315lAdmob = AbstractC0532l.admob(0.0f, 0.0f, null, 7);
                c6956l.startapp(false);
                Object obj2 = obj;
                C9459l c9459lBilling = AbstractC2438l.billing(c18656lIsPro, c9735l, c9735l2, c13315lAdmob, c0010l, c6956l, 196608);
                C0010l c0010l2 = AbstractC3483l.mopub;
                if (c18656lIsPro.mopub()) {
                    z6 = false;
                    objMopub2 = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lIsPro);
                } else {
                    c6956l.m2123default(1666573488);
                    zBilling5 = c6956l.billing(c18656lIsPro);
                    objMopub2 = c6956l.m2132native();
                    if (zBilling5 || objMopub2 == obj2) {
                        abstractC18620lBilling = AbstractC7572l.billing();
                        if (abstractC18620lBilling != null) {
                            function1Purchase = abstractC18620lBilling.purchase();
                        } else {
                            function1Purchase = null;
                        }
                        abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                        try {
                            Object objCrashlytics2 = c18656lIsPro.crashlytics();
                            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                            c6956l.m2147try(objCrashlytics2);
                            objMopub2 = objCrashlytics2;
                        } catch (Throwable th2) {
                            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                            throw th2;
                        }
                    }
                    z6 = false;
                    c6956l.startapp(false);
                }
                zBooleanValue3 = ((Boolean) objMopub2).booleanValue();
                c6956l.m2123default(-284937224);
                if (zBooleanValue3) {
                    f5 = 0.0f;
                } else {
                    f5 = 1.0f;
                }
                c6956l.startapp(z6);
                C14467l c14467l = new C14467l(f5);
                zBilling3 = c6956l.billing(c18656lIsPro);
                objM2132native3 = c6956l.m2132native();
                if (zBilling3 || objM2132native3 == obj2) {
                    objM2132native3 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 14));
                    c6956l.m2147try(objM2132native3);
                }
                zBooleanValue4 = ((Boolean) ((InterfaceC12244l) objM2132native3).getValue()).booleanValue();
                c6956l.m2123default(-284937224);
                if (zBooleanValue4) {
                    f6 = 0.0f;
                } else {
                    f6 = 1.0f;
                }
                c6956l.startapp(false);
                C14467l c14467l2 = new C14467l(f6);
                zBilling4 = c6956l.billing(c18656lIsPro);
                objM2132native4 = c6956l.m2132native();
                if (zBilling4 || objM2132native4 == obj2) {
                    objM2132native4 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 15));
                    c6956l.m2147try(objM2132native4);
                }
                c6956l.m2123default(-1953972046);
                C8896l c8896l = AbstractC11922l.yandex;
                C13315l c13315lAdmob2 = AbstractC0532l.admob(0.0f, 0.0f, new C14467l(0.4f), 3);
                c6956l.startapp(false);
                boolean z7 = z4;
                float f7 = f4;
                loadAd(f, function1, AbstractC17551l.loadAd(interfaceC17242l, ((C14467l) AbstractC2438l.billing(c18656lIsPro, c14467l, c14467l2, c13315lAdmob2, c0010l2, c6956l, 196608).f19321l.getValue()).f28331l, c1530l3.billing, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics), c2403l4, z7, f7, i, c12015l, function0, c15578l, c15578l2, new C1530l(c1530l3.yandex, ((C9735l) c9459lBilling.f19321l.getValue()).yandex, c1530l3.crashlytics, c1530l3.amazon, c1530l3.purchase, c1530l3.billing), c6956l, (64638 & i7) | 1769472 | ((i5 << 18) & 29360128) | ((i7 << 9) & 234881024) | 805306368, 6);
                f3 = f7;
                c1530l2 = c1530l3;
                z2 = z7;
                c2403l2 = c2403l4;
            }
            Object c0010l3 = new C0010l(C11192l.f22516l, new C3006l(10, objBilling));
            c6956l.m2147try(c0010l3);
            objM2132native6 = c0010l3;
            C0010l c0010l4 = (C0010l) objM2132native6;
            if (c18656lIsPro.mopub()) {
                c6956l.m2123default(1666573488);
                zBilling6 = c6956l.billing(c18656lIsPro);
                objMopub = c6956l.m2132native();
                if (zBilling6) {
                    abstractC18620lBilling2 = AbstractC7572l.billing();
                    if (abstractC18620lBilling2 != null) {
                        function1Purchase2 = abstractC18620lBilling2.purchase();
                    } else {
                        function1Purchase2 = null;
                    }
                    abstractC18620lRemoteconfig2 = AbstractC7572l.remoteconfig(abstractC18620lBilling2);
                    Object objCrashlytics3 = c18656lIsPro.crashlytics();
                    AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                    c6956l.m2147try(objCrashlytics3);
                    objMopub = objCrashlytics3;
                } else {
                    abstractC18620lBilling2 = AbstractC7572l.billing();
                    if (abstractC18620lBilling2 != null) {
                        function1Purchase2 = abstractC18620lBilling2.purchase();
                    } else {
                        function1Purchase2 = null;
                    }
                    abstractC18620lRemoteconfig2 = AbstractC7572l.remoteconfig(abstractC18620lBilling2);
                    Object objCrashlytics4 = c18656lIsPro.crashlytics();
                    AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                    c6956l.m2147try(objCrashlytics4);
                    objMopub = objCrashlytics4;
                }
                z5 = false;
                c6956l.startapp(false);
            } else {
                z5 = false;
                objMopub = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lIsPro);
            }
            zBooleanValue = ((Boolean) objMopub).booleanValue();
            c6956l.m2123default(-12729877);
            if (zBooleanValue) {
                j = c1530l3.loadAd;
            } else {
                j = c1530l3.yandex;
            }
            c6956l.startapp(z5);
            C9735l c9735l3 = new C9735l(j);
            zBilling = c6956l.billing(c18656lIsPro);
            objM2132native = c6956l.m2132native();
            if (zBilling) {
                objM2132native = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 12));
                c6956l.m2147try(objM2132native);
            } else {
                objM2132native = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 12));
                c6956l.m2147try(objM2132native);
            }
            zBooleanValue2 = ((Boolean) ((InterfaceC12244l) objM2132native).getValue()).booleanValue();
            c6956l.m2123default(-12729877);
            if (zBooleanValue2) {
                j2 = c1530l3.loadAd;
            } else {
                j2 = c1530l3.yandex;
            }
            c6956l.startapp(false);
            C9735l c9735l4 = new C9735l(j2);
            zBilling2 = c6956l.billing(c18656lIsPro);
            objM2132native2 = c6956l.m2132native();
            if (zBilling2) {
                objM2132native2 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 13));
                c6956l.m2147try(objM2132native2);
            } else {
                objM2132native2 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 13));
                c6956l.m2147try(objM2132native2);
            }
            c6956l.m2123default(-781456724);
            C2403l c2403l5 = c2403l3;
            C13315l c13315lAdmob3 = AbstractC0532l.admob(0.0f, 0.0f, null, 7);
            c6956l.startapp(false);
            Object obj3 = obj;
            C9459l c9459lBilling2 = AbstractC2438l.billing(c18656lIsPro, c9735l3, c9735l4, c13315lAdmob3, c0010l4, c6956l, 196608);
            C0010l c0010l5 = AbstractC3483l.mopub;
            if (c18656lIsPro.mopub()) {
                c6956l.m2123default(1666573488);
                zBilling5 = c6956l.billing(c18656lIsPro);
                objMopub2 = c6956l.m2132native();
                if (zBilling5) {
                    abstractC18620lBilling = AbstractC7572l.billing();
                    if (abstractC18620lBilling != null) {
                        function1Purchase = abstractC18620lBilling.purchase();
                    } else {
                        function1Purchase = null;
                    }
                    abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                    Object objCrashlytics5 = c18656lIsPro.crashlytics();
                    AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                    c6956l.m2147try(objCrashlytics5);
                    objMopub2 = objCrashlytics5;
                } else {
                    abstractC18620lBilling = AbstractC7572l.billing();
                    if (abstractC18620lBilling != null) {
                        function1Purchase = abstractC18620lBilling.purchase();
                    } else {
                        function1Purchase = null;
                    }
                    abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                    Object objCrashlytics6 = c18656lIsPro.crashlytics();
                    AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                    c6956l.m2147try(objCrashlytics6);
                    objMopub2 = objCrashlytics6;
                }
                z6 = false;
                c6956l.startapp(false);
            } else {
                z6 = false;
                objMopub2 = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lIsPro);
            }
            zBooleanValue3 = ((Boolean) objMopub2).booleanValue();
            c6956l.m2123default(-284937224);
            if (zBooleanValue3) {
                f5 = 0.0f;
            } else {
                f5 = 1.0f;
            }
            c6956l.startapp(z6);
            C14467l c14467l3 = new C14467l(f5);
            zBilling3 = c6956l.billing(c18656lIsPro);
            objM2132native3 = c6956l.m2132native();
            if (zBilling3) {
                objM2132native3 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 14));
                c6956l.m2147try(objM2132native3);
            } else {
                objM2132native3 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 14));
                c6956l.m2147try(objM2132native3);
            }
            zBooleanValue4 = ((Boolean) ((InterfaceC12244l) objM2132native3).getValue()).booleanValue();
            c6956l.m2123default(-284937224);
            if (zBooleanValue4) {
                f6 = 0.0f;
            } else {
                f6 = 1.0f;
            }
            c6956l.startapp(false);
            C14467l c14467l4 = new C14467l(f6);
            zBilling4 = c6956l.billing(c18656lIsPro);
            objM2132native4 = c6956l.m2132native();
            if (zBilling4) {
                objM2132native4 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 15));
                c6956l.m2147try(objM2132native4);
            } else {
                objM2132native4 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 15));
                c6956l.m2147try(objM2132native4);
            }
            c6956l.m2123default(-1953972046);
            C8896l c8896l2 = AbstractC11922l.yandex;
            C13315l c13315lAdmob4 = AbstractC0532l.admob(0.0f, 0.0f, new C14467l(0.4f), 3);
            c6956l.startapp(false);
            boolean z8 = z4;
            float f8 = f4;
            loadAd(f, function1, AbstractC17551l.loadAd(interfaceC17242l, ((C14467l) AbstractC2438l.billing(c18656lIsPro, c14467l3, c14467l4, c13315lAdmob4, c0010l5, c6956l, 196608).f19321l.getValue()).f28331l, c1530l3.billing, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics), c2403l5, z8, f8, i, c12015l, function0, c15578l, c15578l2, new C1530l(c1530l3.yandex, ((C9735l) c9459lBilling2.f19321l.getValue()).yandex, c1530l3.crashlytics, c1530l3.amazon, c1530l3.purchase, c1530l3.billing), c6956l, (64638 & i7) | 1769472 | ((i5 << 18) & 29360128) | ((i7 << 9) & 234881024) | 805306368, 6);
            f3 = f8;
            c1530l2 = c1530l3;
            z2 = z8;
            c2403l2 = c2403l5;
        } else {
            c6956l.m2124else();
            c2403l2 = c2403l;
            z2 = z;
            c1530l2 = c1530l;
            f3 = f2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(f, function1, interfaceC17242l, c2403l2, z2, function0, c15578l, c15578l2, c1530l2, f3, i, c12015l, i2) { // from class: lّْؖ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f8407l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ C15578l f8408l;

                /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
                public final /* synthetic */ C15578l f8409l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f8410l;

                /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
                public final /* synthetic */ float f8411l;

                /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
                public final /* synthetic */ float f8412l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ boolean f8413l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ C2403l f8414l;

                /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
                public final /* synthetic */ C12015l f8415l;

                /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
                public final /* synthetic */ C1530l f8416l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ Function0 f8417l;

                /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
                public final /* synthetic */ int f8418l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iPurchase = AbstractC0545l.purchase(14156161);
                    AbstractC5832l.yandex(this.f8411l, this.f8410l, this.f8407l, this.f8414l, this.f8413l, this.f8417l, this.f8408l, this.f8409l, this.f8416l, this.f8412l, this.f8418l, this.f8415l, (C6956l) obj4, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public abstract InterfaceC13789l mopub(InterfaceC13789l interfaceC13789l);

    public abstract String purchase();

    public String toString() {
        switch (this.yandex) {
            case 3:
                return purchase();
            default:
                return super.toString();
        }
    }
}
