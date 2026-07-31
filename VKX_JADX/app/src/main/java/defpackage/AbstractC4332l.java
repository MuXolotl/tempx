package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؙؖۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4332l {
    public static final C6763l yandex = AbstractC9528l.yandex;
    public static final C6763l loadAd = AbstractC9528l.amazon;

    public static final void amazon(InterfaceC17242l interfaceC17242l, long j, long j2, int i, float f, C6956l c6956l, final int i2, final int i3) {
        InterfaceC17242l interfaceC17242l2;
        int i4;
        final long j3;
        final long j4;
        final int i5;
        final float f2;
        final InterfaceC17242l interfaceC17242l3;
        InterfaceC17242l interfaceC17242l4;
        long jPurchase;
        long jPurchase2;
        int i6;
        float f3;
        final long j5;
        final int i7;
        final float f4;
        C6956l c6956l2 = c6956l;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        c6956l2.m2133new(567589233);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
            interfaceC17242l2 = interfaceC17242l;
        } else if ((i2 & 6) == 0) {
            interfaceC17242l2 = interfaceC17242l;
            i4 = i2 | (c6956l2.billing(interfaceC17242l2) ? 4 : 2);
        } else {
            interfaceC17242l2 = interfaceC17242l;
            i4 = i2;
        }
        int i9 = i4 | 27792;
        if (c6956l2.m2127for(i9 & 1, (i9 & 9363) != 9362)) {
            c6956l2.m2141switch();
            if ((i2 & 1) == 0 || c6956l2.ad()) {
                interfaceC17242l4 = i8 != 0 ? C4346l.f8873l : interfaceC17242l2;
                jPurchase = AbstractC15038l.purchase(c6956l2, 26);
                jPurchase2 = AbstractC15038l.purchase(c6956l2, 32);
                i6 = 1;
                f3 = 4.0f;
            } else {
                c6956l2.m2124else();
                jPurchase = j;
                jPurchase2 = j2;
                i6 = i;
                f3 = f;
                interfaceC17242l4 = interfaceC17242l2;
            }
            c6956l2.adcel();
            C13138l c13138lBilling = AbstractC3586l.billing(c6956l2, 1);
            C10942l c10942l = new C10942l();
            c10942l.yandex = 1750;
            C17137l c17137lYandex = c10942l.yandex(fValueOf2, 0);
            C6763l c6763l = yandex;
            c17137lYandex.loadAd = c6763l;
            c10942l.yandex(fValueOf, 1000);
            Unit unit = Unit.INSTANCE;
            InterfaceC17242l interfaceC17242l5 = interfaceC17242l4;
            final long j6 = jPurchase2;
            final C8456l c8456lYandex = AbstractC3586l.yandex(c13138lBilling, 0.0f, 1.0f, AbstractC0532l.purchase(new C13591l(c10942l), 0, 0L, 6), null, c6956l2, 4536, 8);
            C10942l c10942l2 = new C10942l();
            c10942l2.yandex = 1750;
            c10942l2.yandex(fValueOf2, 250).loadAd = c6763l;
            c10942l2.yandex(fValueOf, 1250);
            final C8456l c8456lYandex2 = AbstractC3586l.yandex(c13138lBilling, 0.0f, 1.0f, AbstractC0532l.purchase(new C13591l(c10942l2), 0, 0L, 6), null, c6956l, 4536, 8);
            C10942l c10942l3 = new C10942l();
            c10942l3.yandex = 1750;
            c10942l3.yandex(fValueOf2, 650).loadAd = c6763l;
            c10942l3.yandex(fValueOf, 1500);
            c6956l2 = c6956l;
            final C8456l c8456lYandex3 = AbstractC3586l.yandex(c13138lBilling, 0.0f, 1.0f, AbstractC0532l.purchase(new C13591l(c10942l3), 0, 0L, 6), null, c6956l2, 4536, 8);
            C10942l c10942l4 = new C10942l();
            c10942l4.yandex = 1750;
            c10942l4.yandex(fValueOf2, 900).loadAd = c6763l;
            c10942l4.yandex(fValueOf, 1750);
            final C8456l c8456lYandex4 = AbstractC3586l.yandex(c13138lBilling, 0.0f, 1.0f, AbstractC0532l.purchase(new C13591l(c10942l4), 0, 0L, 6), null, c6956l2, 4536, 8);
            InterfaceC17242l interfaceC17242lFirebase = AbstractC0080l.firebase(AbstractC15185l.loadAd(interfaceC17242l5.premium(AbstractC11767l.yandex)), 240.0f, 4.0f);
            boolean zBilling = c6956l2.billing(c8456lYandex) | c6956l2.purchase(j6) | c6956l2.billing(c8456lYandex2) | c6956l2.purchase(jPurchase) | c6956l2.billing(c8456lYandex3) | c6956l2.billing(c8456lYandex4);
            Object objM2132native = c6956l2.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                j5 = jPurchase;
                i7 = i6;
                f4 = f3;
                Function1 function1 = new Function1() { // from class: lٖٜؒ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        long j7;
                        InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L));
                        int i10 = i7;
                        float fMo867final = f4;
                        if (i10 != 0 && Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) <= Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32))) {
                            fMo867final += interfaceC13349l.mo867final(fIntBitsToFloat);
                        }
                        float fMo867final2 = fMo867final / interfaceC13349l.mo867final(Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)));
                        InterfaceC12244l interfaceC12244l = c8456lYandex;
                        float fFloatValue = ((Number) interfaceC12244l.getValue()).floatValue();
                        float f5 = 1.0f - fMo867final2;
                        long j8 = j6;
                        if (fFloatValue < f5) {
                            AbstractC4332l.billing(interfaceC13349l, ((Number) interfaceC12244l.getValue()).floatValue() > 0.0f ? ((Number) interfaceC12244l.getValue()).floatValue() + fMo867final2 : 0.0f, 1.0f, j8, fIntBitsToFloat, i10);
                        }
                        long j9 = j8;
                        float fFloatValue2 = ((Number) interfaceC12244l.getValue()).floatValue();
                        InterfaceC12244l interfaceC12244l2 = c8456lYandex2;
                        float fFloatValue3 = fFloatValue2 - ((Number) interfaceC12244l2.getValue()).floatValue();
                        long j10 = j5;
                        if (fFloatValue3 > 0.0f) {
                            AbstractC4332l.billing(interfaceC13349l, ((Number) interfaceC12244l.getValue()).floatValue(), ((Number) interfaceC12244l2.getValue()).floatValue(), j10, fIntBitsToFloat, i10);
                            j7 = j10;
                        } else {
                            j7 = j10;
                        }
                        float fFloatValue4 = ((Number) interfaceC12244l2.getValue()).floatValue();
                        InterfaceC12244l interfaceC12244l3 = c8456lYandex3;
                        if (fFloatValue4 > fMo867final2) {
                            AbstractC4332l.billing(interfaceC13349l, ((Number) interfaceC12244l3.getValue()).floatValue() > 0.0f ? ((Number) interfaceC12244l3.getValue()).floatValue() + fMo867final2 : 0.0f, ((Number) interfaceC12244l2.getValue()).floatValue() < 1.0f ? ((Number) interfaceC12244l2.getValue()).floatValue() - fMo867final2 : 1.0f, j9, fIntBitsToFloat, i10);
                            j9 = j9;
                        }
                        float fFloatValue5 = ((Number) interfaceC12244l3.getValue()).floatValue();
                        InterfaceC12244l interfaceC12244l4 = c8456lYandex4;
                        if (fFloatValue5 - ((Number) interfaceC12244l4.getValue()).floatValue() > 0.0f) {
                            AbstractC4332l.billing(interfaceC13349l, ((Number) interfaceC12244l3.getValue()).floatValue(), ((Number) interfaceC12244l4.getValue()).floatValue(), j7, fIntBitsToFloat, i10);
                            interfaceC13349l = interfaceC13349l;
                            fIntBitsToFloat = fIntBitsToFloat;
                        }
                        if (((Number) interfaceC12244l4.getValue()).floatValue() > fMo867final2) {
                            AbstractC4332l.billing(interfaceC13349l, 0.0f, ((Number) interfaceC12244l4.getValue()).floatValue() < 1.0f ? ((Number) interfaceC12244l4.getValue()).floatValue() - fMo867final2 : 1.0f, j9, fIntBitsToFloat, i10);
                        }
                        return Unit.INSTANCE;
                    }
                };
                c6956l2.m2147try(function1);
                objM2132native = function1;
            } else {
                j5 = jPurchase;
                i7 = i6;
                f4 = f3;
            }
            AbstractC12155l.yandex(interfaceC17242lFirebase, (Function1) objM2132native, c6956l2, 0);
            interfaceC17242l3 = interfaceC17242l5;
            j4 = j6;
            i5 = i7;
            f2 = f4;
            j3 = j5;
        } else {
            c6956l2.m2124else();
            j3 = j;
            j4 = j2;
            i5 = i;
            f2 = f;
            interfaceC17242l3 = interfaceC17242l2;
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٍَ٘
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC4332l.amazon(interfaceC17242l3, j3, j4, i5, f2, (C6956l) obj, AbstractC0545l.purchase(i2 | 1), i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void billing(InterfaceC13349l interfaceC13349l, float f, float f2, long j, float f3, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L));
        float f4 = fIntBitsToFloat2 / 2.0f;
        boolean z = interfaceC13349l.getLayoutDirection() == EnumC9931l.f20223l;
        float f5 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * fIntBitsToFloat;
        if (i == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            interfaceC13349l.mo2074volatile(j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, (496 & 16) != 0 ? 0 : 0);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = fIntBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f5 > f8) {
            f5 = f8;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (f6 <= f8) {
            f8 = f6;
        }
        if (Math.abs(f2 - f) > 0.0f) {
            interfaceC13349l.mo2074volatile(j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, (496 & 16) != 0 ? 0 : i);
        }
    }

    public static final void crashlytics(float f, int i, int i2, long j, long j2, C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        int i3;
        long j3;
        long j4;
        long jPurchase;
        int i4;
        long jPurchase2;
        int i5;
        c6956l.m2133new(905419617);
        int i6 = (c6956l.crashlytics(f) ? 4 : 2) | i2 | 25728;
        if (c6956l.m2127for(i6 & 1, (i6 & 9363) != 9362)) {
            c6956l.m2141switch();
            if ((i2 & 1) == 0 || c6956l.ad()) {
                jPurchase = AbstractC15038l.purchase(c6956l, 26);
                i4 = i6 & (-8065);
                jPurchase2 = AbstractC15038l.purchase(c6956l, 32);
                i5 = 1;
            } else {
                c6956l.m2124else();
                i4 = i6 & (-8065);
                i5 = i;
                jPurchase = j;
                jPurchase2 = j2;
            }
            c6956l.adcel();
            boolean z = (i4 & 14) == 4;
            Object objM2132native = c6956l.m2132native();
            if (z || objM2132native == C1867l.yandex) {
                objM2132native = new C11063l(1, f);
                c6956l.m2147try(objM2132native);
            }
            long j5 = jPurchase2;
            loadAd((Function0) objM2132native, interfaceC17242l, jPurchase, j5, i5, 0.0f, null, c6956l, 24624, 96);
            i3 = i5;
            j4 = j5;
            j3 = jPurchase;
        } else {
            c6956l.m2124else();
            i3 = i;
            j3 = j;
            j4 = j2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C13417l(f, interfaceC17242l, j3, j4, i3, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0121  */
    /* JADX WARN: Code duplicated, block: B:103:0x012a  */
    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0130  */
    /* JADX WARN: Code duplicated, block: B:108:0x0133  */
    /* JADX WARN: Code duplicated, block: B:111:0x0139  */
    /* JADX WARN: Code duplicated, block: B:113:0x0141  */
    /* JADX WARN: Code duplicated, block: B:115:0x0147  */
    /* JADX WARN: Code duplicated, block: B:121:0x0154  */
    /* JADX WARN: Code duplicated, block: B:122:0x0156  */
    /* JADX WARN: Code duplicated, block: B:125:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x0160  */
    /* JADX WARN: Code duplicated, block: B:128:0x0173  */
    /* JADX WARN: Code duplicated, block: B:131:0x017f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0181  */
    /* JADX WARN: Code duplicated, block: B:135:0x0188 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x018a  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:161:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:167:0x020e  */
    /* JADX WARN: Code duplicated, block: B:169:0x0214  */
    /* JADX WARN: Code duplicated, block: B:175:0x0225 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x022f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0253  */
    /* JADX WARN: Code duplicated, block: B:183:0x0263  */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0054  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:43:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x0076  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x010b  */
    /* JADX WARN: Code duplicated, block: B:95:0x010e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0113  */
    /* JADX WARN: Code duplicated, block: B:99:0x011c  */
    public static final void loadAd(final Function0 function0, InterfaceC17242l interfaceC17242l, long j, long j2, int i, float f, Function1 function1, C6956l c6956l, final int i2, final int i3) {
        int i4;
        InterfaceC17242l interfaceC17242l2;
        long j3;
        long j4;
        int i5;
        final int i6;
        int i7;
        int i8;
        int i9;
        Function1 function2;
        boolean z;
        final float f2;
        final InterfaceC17242l interfaceC17242l3;
        final int i10;
        final long j5;
        final long j6;
        final Function1 function3;
        C4224l c4224lAds;
        int i11;
        InterfaceC17242l interfaceC17242l4;
        final long jPurchase;
        long jPurchase2;
        float f3;
        final float f4;
        final int i12;
        boolean z2;
        boolean z3;
        Object objM2132native;
        boolean z4;
        Object objM2132native2;
        final Function0 function4;
        boolean zBilling;
        Object objM2132native3;
        boolean z5;
        boolean z6;
        boolean zBilling2;
        Object objM2132native4;
        final long j7;
        final long j8;
        final Function1 function5;
        int i13;
        int i14;
        int i15;
        c6956l.m2133new(-339970038);
        if ((i2 & 6) == 0) {
            i4 = (c6956l.admob(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i16 = i3 & 2;
        if (i16 == 0) {
            if ((i2 & 48) == 0) {
                interfaceC17242l2 = interfaceC17242l;
                i4 |= c6956l.billing(interfaceC17242l2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                j3 = j;
                if ((i3 & 4) == 0 || !c6956l.purchase(j3)) {
                    i15 = 128;
                } else {
                    i15 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                i4 |= i15;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) == 0) {
                j4 = j2;
                if ((i3 & 8) == 0 || !c6956l.purchase(j4)) {
                    i14 = 1024;
                } else {
                    i14 = 2048;
                }
                i4 |= i14;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    i6 = i;
                    if (c6956l.amazon(i6)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i4 |= i7;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (c6956l.crashlytics(f)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                if ((i2 & 1572864) == 0) {
                    function2 = function1;
                    if ((i3 & 64) == 0 || !c6956l.admob(function2)) {
                        i13 = 524288;
                    } else {
                        i13 = 1048576;
                    }
                    i4 |= i13;
                } else {
                    function2 = function1;
                }
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (c6956l.m2127for(i4 & 1, z)) {
                    c6956l.m2141switch();
                    i11 = i2 & 1;
                    Object obj = C1867l.yandex;
                    if (i11 != 0 || c6956l.ad()) {
                        if (i16 != 0) {
                            interfaceC17242l4 = C4346l.f8873l;
                        } else {
                            interfaceC17242l4 = interfaceC17242l2;
                        }
                        if ((i3 & 4) != 0) {
                            jPurchase = AbstractC15038l.purchase(c6956l, 26);
                            i4 &= -897;
                        } else {
                            jPurchase = j3;
                        }
                        if ((i3 & 8) != 0) {
                            jPurchase2 = AbstractC15038l.purchase(c6956l, 32);
                            i4 &= -7169;
                        } else {
                            jPurchase2 = j4;
                        }
                        if (i5 != 0) {
                            i6 = 1;
                        }
                        if (i8 != 0) {
                            f3 = 4.0f;
                        } else {
                            f3 = f;
                        }
                        if ((i3 & 64) != 0) {
                            boolean z7 = (((i4 & 896) ^ 384) <= 256 && c6956l.purchase(jPurchase)) || (i4 & 384) == 256;
                            if ((i4 & 57344) == 16384) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            z3 = z7 | z2;
                            objM2132native = c6956l.m2132native();
                            if (z3 || objM2132native == obj) {
                                objM2132native = new Function1() { // from class: lؘٕؕ
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj2;
                                        float fMin = Math.min(interfaceC13349l.mo868instanceof(4.0f), Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)));
                                        float fMo868instanceof = interfaceC13349l.mo868instanceof(6.0f);
                                        float fIntBitsToFloat = (Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) - fMin) / 2.0f;
                                        float f5 = fIntBitsToFloat > fMo868instanceof ? fMo868instanceof : fIntBitsToFloat;
                                        EnumC9931l layoutDirection = interfaceC13349l.getLayoutDirection();
                                        EnumC9931l enumC9931l = EnumC9931l.f20222l;
                                        long j9 = jPurchase;
                                        int i17 = i6;
                                        if (layoutDirection == enumC9931l) {
                                            long jMo2070l = interfaceC13349l.mo2070l();
                                            C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                                            long jM4551private = c18449lMo2065break.m4551private();
                                            c18449lMo2065break.m4555synchronized().mopub();
                                            try {
                                                ((C16543l) c18449lMo2065break.f36010l).isVip(-1.0f, 1.0f, jMo2070l);
                                                AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                            } finally {
                                                AbstractC0653l.license(c18449lMo2065break, jM4551private);
                                            }
                                        } else {
                                            AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                c6956l.m2147try(objM2132native);
                            }
                            i4 &= -3670017;
                            f4 = f3;
                            i12 = i6;
                            function2 = (Function1) objM2132native;
                        } else {
                            f4 = f3;
                            i12 = i6;
                        }
                    } else {
                        c6956l.m2124else();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                        }
                        f4 = f;
                        interfaceC17242l4 = interfaceC17242l2;
                        i12 = i6;
                        jPurchase = j3;
                        jPurchase2 = j4;
                    }
                    c6956l.adcel();
                    if ((i4 & 14) == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objM2132native2 = c6956l.m2132native();
                    if (z4 || objM2132native2 == obj) {
                        objM2132native2 = new C5583l(8, function0);
                        c6956l.m2147try(objM2132native2);
                    }
                    function4 = (Function0) objM2132native2;
                    InterfaceC17242l interfaceC17242lPremium = interfaceC17242l4.premium(AbstractC11767l.yandex);
                    zBilling = c6956l.billing(function4);
                    objM2132native3 = c6956l.m2132native();
                    if (zBilling || objM2132native3 == obj) {
                        objM2132native3 = new C6199l(11, function4);
                        c6956l.m2147try(objM2132native3);
                    }
                    InterfaceC17242l interfaceC17242lFirebase = AbstractC0080l.firebase(AbstractC4962l.yandex(interfaceC17242lPremium, true, (Function1) objM2132native3), 240.0f, 4.0f);
                    if ((i4 & 57344) == 16384) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if ((458752 & i4) == 131072) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zBilling2 = z6 | z5 | c6956l.billing(function4) | ((((i4 & 7168) ^ 3072) <= 2048 && c6956l.purchase(jPurchase2)) || (i4 & 3072) == 2048) | ((((i4 & 896) ^ 384) <= 256 && c6956l.purchase(jPurchase)) || (i4 & 384) == 256) | ((((3670016 & i4) ^ 1572864) <= 1048576 && c6956l.billing(function2)) || (i4 & 1572864) == 1048576);
                    objM2132native4 = c6956l.m2132native();
                    if (!zBilling2 || objM2132native4 == obj) {
                        j7 = jPurchase;
                        j8 = jPurchase2;
                        function5 = function2;
                        objM2132native4 = new Function1() { // from class: lٔۡؑ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj2;
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L));
                                int i17 = i12;
                                float fMo867final = f4;
                                if (i17 != 0 && Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) <= Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32))) {
                                    fMo867final += interfaceC13349l.mo867final(fIntBitsToFloat);
                                }
                                float fMo867final2 = fMo867final / interfaceC13349l.mo867final(Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)));
                                float fFloatValue = ((Number) function4.invoke()).floatValue();
                                float fMin = Math.min(fFloatValue, fMo867final2) + fFloatValue;
                                if (fMin <= 1.0f) {
                                    AbstractC4332l.billing(interfaceC13349l, fMin, 1.0f, j8, fIntBitsToFloat, i17);
                                }
                                AbstractC4332l.billing(interfaceC13349l, 0.0f, fFloatValue, j7, fIntBitsToFloat, i17);
                                function5.invoke(interfaceC13349l);
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l.m2147try(objM2132native4);
                    } else {
                        j7 = jPurchase;
                        j8 = jPurchase2;
                        function5 = function2;
                    }
                    AbstractC12155l.yandex(interfaceC17242lFirebase, (Function1) objM2132native4, c6956l, 0);
                    interfaceC17242l3 = interfaceC17242l4;
                    i10 = i12;
                    f2 = f4;
                    j6 = j8;
                    j5 = j7;
                    function3 = function5;
                } else {
                    c6956l.m2124else();
                    f2 = f;
                    interfaceC17242l3 = interfaceC17242l2;
                    i10 = i6;
                    j5 = j3;
                    j6 = j4;
                    function3 = function2;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lُٖۧ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            AbstractC4332l.loadAd(function0, interfaceC17242l3, j5, j6, i10, f2, function3, (C6956l) obj2, AbstractC0545l.purchase(i2 | 1), i3);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i4 |= 24576;
            i6 = i;
            i8 = i3 & 32;
            if (i8 != 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (c6956l.crashlytics(f)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            if ((i2 & 1572864) == 0) {
                function2 = function1;
                if ((i3 & 64) == 0) {
                    i13 = 524288;
                } else {
                    i13 = 524288;
                }
                i4 |= i13;
            } else {
                function2 = function1;
            }
            if ((i4 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (c6956l.m2127for(i4 & 1, z)) {
                c6956l.m2141switch();
                i11 = i2 & 1;
                Object obj2 = C1867l.yandex;
                if (i11 != 0) {
                    if (i16 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    if ((i3 & 4) != 0) {
                        jPurchase = AbstractC15038l.purchase(c6956l, 26);
                        i4 &= -897;
                    } else {
                        jPurchase = j3;
                    }
                    if ((i3 & 8) != 0) {
                        jPurchase2 = AbstractC15038l.purchase(c6956l, 32);
                        i4 &= -7169;
                    } else {
                        jPurchase2 = j4;
                    }
                    if (i5 != 0) {
                        i6 = 1;
                    }
                    if (i8 != 0) {
                        f3 = 4.0f;
                    } else {
                        f3 = f;
                    }
                    if ((i3 & 64) != 0) {
                        if (((i4 & 896) ^ 384) <= 256) {
                        }
                        if ((i4 & 57344) == 16384) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = z7 | z2;
                        objM2132native = c6956l.m2132native();
                        if (z3) {
                            objM2132native = new Function1() { // from class: lؘٕؕ
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj3;
                                    float fMin = Math.min(interfaceC13349l.mo868instanceof(4.0f), Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)));
                                    float fMo868instanceof = interfaceC13349l.mo868instanceof(6.0f);
                                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) - fMin) / 2.0f;
                                    float f5 = fIntBitsToFloat > fMo868instanceof ? fMo868instanceof : fIntBitsToFloat;
                                    EnumC9931l layoutDirection = interfaceC13349l.getLayoutDirection();
                                    EnumC9931l enumC9931l = EnumC9931l.f20222l;
                                    long j9 = jPurchase;
                                    int i17 = i6;
                                    if (layoutDirection == enumC9931l) {
                                        long jMo2070l = interfaceC13349l.mo2070l();
                                        C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                                        long jM4551private = c18449lMo2065break.m4551private();
                                        c18449lMo2065break.m4555synchronized().mopub();
                                        try {
                                            ((C16543l) c18449lMo2065break.f36010l).isVip(-1.0f, 1.0f, jMo2070l);
                                            AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                        } finally {
                                            AbstractC0653l.license(c18449lMo2065break, jM4551private);
                                        }
                                    } else {
                                        AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c6956l.m2147try(objM2132native);
                        } else {
                            objM2132native = new Function1() { // from class: lؘٕؕ
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj3;
                                    float fMin = Math.min(interfaceC13349l.mo868instanceof(4.0f), Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)));
                                    float fMo868instanceof = interfaceC13349l.mo868instanceof(6.0f);
                                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) - fMin) / 2.0f;
                                    float f5 = fIntBitsToFloat > fMo868instanceof ? fMo868instanceof : fIntBitsToFloat;
                                    EnumC9931l layoutDirection = interfaceC13349l.getLayoutDirection();
                                    EnumC9931l enumC9931l = EnumC9931l.f20222l;
                                    long j9 = jPurchase;
                                    int i17 = i6;
                                    if (layoutDirection == enumC9931l) {
                                        long jMo2070l = interfaceC13349l.mo2070l();
                                        C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                                        long jM4551private = c18449lMo2065break.m4551private();
                                        c18449lMo2065break.m4555synchronized().mopub();
                                        try {
                                            ((C16543l) c18449lMo2065break.f36010l).isVip(-1.0f, 1.0f, jMo2070l);
                                            AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                        } finally {
                                            AbstractC0653l.license(c18449lMo2065break, jM4551private);
                                        }
                                    } else {
                                        AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c6956l.m2147try(objM2132native);
                        }
                        i4 &= -3670017;
                        f4 = f3;
                        i12 = i6;
                        function2 = (Function1) objM2132native;
                    } else {
                        f4 = f3;
                        i12 = i6;
                    }
                } else {
                    if (i16 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    if ((i3 & 4) != 0) {
                        jPurchase = AbstractC15038l.purchase(c6956l, 26);
                        i4 &= -897;
                    } else {
                        jPurchase = j3;
                    }
                    if ((i3 & 8) != 0) {
                        jPurchase2 = AbstractC15038l.purchase(c6956l, 32);
                        i4 &= -7169;
                    } else {
                        jPurchase2 = j4;
                    }
                    if (i5 != 0) {
                        i6 = 1;
                    }
                    if (i8 != 0) {
                        f3 = 4.0f;
                    } else {
                        f3 = f;
                    }
                    if ((i3 & 64) != 0) {
                        if (((i4 & 896) ^ 384) <= 256) {
                        }
                        if ((i4 & 57344) == 16384) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = z7 | z2;
                        objM2132native = c6956l.m2132native();
                        if (z3) {
                            objM2132native = new Function1() { // from class: lؘٕؕ
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj3;
                                    float fMin = Math.min(interfaceC13349l.mo868instanceof(4.0f), Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)));
                                    float fMo868instanceof = interfaceC13349l.mo868instanceof(6.0f);
                                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) - fMin) / 2.0f;
                                    float f5 = fIntBitsToFloat > fMo868instanceof ? fMo868instanceof : fIntBitsToFloat;
                                    EnumC9931l layoutDirection = interfaceC13349l.getLayoutDirection();
                                    EnumC9931l enumC9931l = EnumC9931l.f20222l;
                                    long j9 = jPurchase;
                                    int i17 = i6;
                                    if (layoutDirection == enumC9931l) {
                                        long jMo2070l = interfaceC13349l.mo2070l();
                                        C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                                        long jM4551private = c18449lMo2065break.m4551private();
                                        c18449lMo2065break.m4555synchronized().mopub();
                                        try {
                                            ((C16543l) c18449lMo2065break.f36010l).isVip(-1.0f, 1.0f, jMo2070l);
                                            AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                        } finally {
                                            AbstractC0653l.license(c18449lMo2065break, jM4551private);
                                        }
                                    } else {
                                        AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c6956l.m2147try(objM2132native);
                        } else {
                            objM2132native = new Function1() { // from class: lؘٕؕ
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj3;
                                    float fMin = Math.min(interfaceC13349l.mo868instanceof(4.0f), Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)));
                                    float fMo868instanceof = interfaceC13349l.mo868instanceof(6.0f);
                                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) - fMin) / 2.0f;
                                    float f5 = fIntBitsToFloat > fMo868instanceof ? fMo868instanceof : fIntBitsToFloat;
                                    EnumC9931l layoutDirection = interfaceC13349l.getLayoutDirection();
                                    EnumC9931l enumC9931l = EnumC9931l.f20222l;
                                    long j9 = jPurchase;
                                    int i17 = i6;
                                    if (layoutDirection == enumC9931l) {
                                        long jMo2070l = interfaceC13349l.mo2070l();
                                        C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                                        long jM4551private = c18449lMo2065break.m4551private();
                                        c18449lMo2065break.m4555synchronized().mopub();
                                        try {
                                            ((C16543l) c18449lMo2065break.f36010l).isVip(-1.0f, 1.0f, jMo2070l);
                                            AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                        } finally {
                                            AbstractC0653l.license(c18449lMo2065break, jM4551private);
                                        }
                                    } else {
                                        AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c6956l.m2147try(objM2132native);
                        }
                        i4 &= -3670017;
                        f4 = f3;
                        i12 = i6;
                        function2 = (Function1) objM2132native;
                    } else {
                        f4 = f3;
                        i12 = i6;
                    }
                }
                c6956l.adcel();
                if ((i4 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objM2132native2 = c6956l.m2132native();
                if (z4) {
                    objM2132native2 = new C5583l(8, function0);
                    c6956l.m2147try(objM2132native2);
                } else {
                    objM2132native2 = new C5583l(8, function0);
                    c6956l.m2147try(objM2132native2);
                }
                function4 = (Function0) objM2132native2;
                InterfaceC17242l interfaceC17242lPremium2 = interfaceC17242l4.premium(AbstractC11767l.yandex);
                zBilling = c6956l.billing(function4);
                objM2132native3 = c6956l.m2132native();
                if (zBilling) {
                    objM2132native3 = new C6199l(11, function4);
                    c6956l.m2147try(objM2132native3);
                } else {
                    objM2132native3 = new C6199l(11, function4);
                    c6956l.m2147try(objM2132native3);
                }
                InterfaceC17242l interfaceC17242lFirebase2 = AbstractC0080l.firebase(AbstractC4962l.yandex(interfaceC17242lPremium2, true, (Function1) objM2132native3), 240.0f, 4.0f);
                if ((i4 & 57344) == 16384) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((458752 & i4) == 131072) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zBilling2 = z6 | z5 | c6956l.billing(function4) | ((((i4 & 7168) ^ 3072) <= 2048 && c6956l.purchase(jPurchase2)) || (i4 & 3072) == 2048) | ((((i4 & 896) ^ 384) <= 256 && c6956l.purchase(jPurchase)) || (i4 & 384) == 256) | ((((3670016 & i4) ^ 1572864) <= 1048576 && c6956l.billing(function2)) || (i4 & 1572864) == 1048576);
                objM2132native4 = c6956l.m2132native();
                if (zBilling2) {
                    j7 = jPurchase;
                    j8 = jPurchase2;
                    function5 = function2;
                    objM2132native4 = new Function1() { // from class: lٔۡؑ
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj3;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L));
                            int i17 = i12;
                            float fMo867final = f4;
                            if (i17 != 0 && Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) <= Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32))) {
                                fMo867final += interfaceC13349l.mo867final(fIntBitsToFloat);
                            }
                            float fMo867final2 = fMo867final / interfaceC13349l.mo867final(Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)));
                            float fFloatValue = ((Number) function4.invoke()).floatValue();
                            float fMin = Math.min(fFloatValue, fMo867final2) + fFloatValue;
                            if (fMin <= 1.0f) {
                                AbstractC4332l.billing(interfaceC13349l, fMin, 1.0f, j8, fIntBitsToFloat, i17);
                            }
                            AbstractC4332l.billing(interfaceC13349l, 0.0f, fFloatValue, j7, fIntBitsToFloat, i17);
                            function5.invoke(interfaceC13349l);
                            return Unit.INSTANCE;
                        }
                    };
                    c6956l.m2147try(objM2132native4);
                } else {
                    j7 = jPurchase;
                    j8 = jPurchase2;
                    function5 = function2;
                    objM2132native4 = new Function1() { // from class: lٔۡؑ
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj3;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L));
                            int i17 = i12;
                            float fMo867final = f4;
                            if (i17 != 0 && Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) <= Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32))) {
                                fMo867final += interfaceC13349l.mo867final(fIntBitsToFloat);
                            }
                            float fMo867final2 = fMo867final / interfaceC13349l.mo867final(Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)));
                            float fFloatValue = ((Number) function4.invoke()).floatValue();
                            float fMin = Math.min(fFloatValue, fMo867final2) + fFloatValue;
                            if (fMin <= 1.0f) {
                                AbstractC4332l.billing(interfaceC13349l, fMin, 1.0f, j8, fIntBitsToFloat, i17);
                            }
                            AbstractC4332l.billing(interfaceC13349l, 0.0f, fFloatValue, j7, fIntBitsToFloat, i17);
                            function5.invoke(interfaceC13349l);
                            return Unit.INSTANCE;
                        }
                    };
                    c6956l.m2147try(objM2132native4);
                }
                AbstractC12155l.yandex(interfaceC17242lFirebase2, (Function1) objM2132native4, c6956l, 0);
                interfaceC17242l3 = interfaceC17242l4;
                i10 = i12;
                f2 = f4;
                j6 = j8;
                j5 = j7;
                function3 = function5;
            } else {
                c6956l.m2124else();
                f2 = f;
                interfaceC17242l3 = interfaceC17242l2;
                i10 = i6;
                j5 = j3;
                j6 = j4;
                function3 = function2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lُٖۧ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        AbstractC4332l.loadAd(function0, interfaceC17242l3, j5, j6, i10, f2, function3, (C6956l) obj3, AbstractC0545l.purchase(i2 | 1), i3);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i4 |= 48;
        interfaceC17242l2 = interfaceC17242l;
        if ((i2 & 384) == 0) {
            j3 = j;
            if ((i3 & 4) == 0) {
                i15 = 128;
            } else {
                i15 = 128;
            }
            i4 |= i15;
        } else {
            j3 = j;
        }
        if ((i2 & 3072) == 0) {
            j4 = j2;
            if ((i3 & 8) == 0) {
                i14 = 1024;
            } else {
                i14 = 1024;
            }
            i4 |= i14;
        } else {
            j4 = j2;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                i6 = i;
                if (c6956l.amazon(i6)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i4 |= i7;
            }
            i8 = i3 & 32;
            if (i8 != 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (c6956l.crashlytics(f)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            if ((i2 & 1572864) == 0) {
                function2 = function1;
                if ((i3 & 64) == 0) {
                    i13 = 524288;
                } else {
                    i13 = 524288;
                }
                i4 |= i13;
            } else {
                function2 = function1;
            }
            if ((i4 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (c6956l.m2127for(i4 & 1, z)) {
                c6956l.m2141switch();
                i11 = i2 & 1;
                Object obj3 = C1867l.yandex;
                if (i11 != 0) {
                    if (i16 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    if ((i3 & 4) != 0) {
                        jPurchase = AbstractC15038l.purchase(c6956l, 26);
                        i4 &= -897;
                    } else {
                        jPurchase = j3;
                    }
                    if ((i3 & 8) != 0) {
                        jPurchase2 = AbstractC15038l.purchase(c6956l, 32);
                        i4 &= -7169;
                    } else {
                        jPurchase2 = j4;
                    }
                    if (i5 != 0) {
                        i6 = 1;
                    }
                    if (i8 != 0) {
                        f3 = 4.0f;
                    } else {
                        f3 = f;
                    }
                    if ((i3 & 64) != 0) {
                        if (((i4 & 896) ^ 384) <= 256) {
                        }
                        if ((i4 & 57344) == 16384) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = z7 | z2;
                        objM2132native = c6956l.m2132native();
                        if (z3) {
                            objM2132native = new Function1() { // from class: lؘٕؕ
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj4;
                                    float fMin = Math.min(interfaceC13349l.mo868instanceof(4.0f), Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)));
                                    float fMo868instanceof = interfaceC13349l.mo868instanceof(6.0f);
                                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) - fMin) / 2.0f;
                                    float f5 = fIntBitsToFloat > fMo868instanceof ? fMo868instanceof : fIntBitsToFloat;
                                    EnumC9931l layoutDirection = interfaceC13349l.getLayoutDirection();
                                    EnumC9931l enumC9931l = EnumC9931l.f20222l;
                                    long j9 = jPurchase;
                                    int i17 = i6;
                                    if (layoutDirection == enumC9931l) {
                                        long jMo2070l = interfaceC13349l.mo2070l();
                                        C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                                        long jM4551private = c18449lMo2065break.m4551private();
                                        c18449lMo2065break.m4555synchronized().mopub();
                                        try {
                                            ((C16543l) c18449lMo2065break.f36010l).isVip(-1.0f, 1.0f, jMo2070l);
                                            AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                        } finally {
                                            AbstractC0653l.license(c18449lMo2065break, jM4551private);
                                        }
                                    } else {
                                        AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c6956l.m2147try(objM2132native);
                        } else {
                            objM2132native = new Function1() { // from class: lؘٕؕ
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj4;
                                    float fMin = Math.min(interfaceC13349l.mo868instanceof(4.0f), Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)));
                                    float fMo868instanceof = interfaceC13349l.mo868instanceof(6.0f);
                                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) - fMin) / 2.0f;
                                    float f5 = fIntBitsToFloat > fMo868instanceof ? fMo868instanceof : fIntBitsToFloat;
                                    EnumC9931l layoutDirection = interfaceC13349l.getLayoutDirection();
                                    EnumC9931l enumC9931l = EnumC9931l.f20222l;
                                    long j9 = jPurchase;
                                    int i17 = i6;
                                    if (layoutDirection == enumC9931l) {
                                        long jMo2070l = interfaceC13349l.mo2070l();
                                        C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                                        long jM4551private = c18449lMo2065break.m4551private();
                                        c18449lMo2065break.m4555synchronized().mopub();
                                        try {
                                            ((C16543l) c18449lMo2065break.f36010l).isVip(-1.0f, 1.0f, jMo2070l);
                                            AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                        } finally {
                                            AbstractC0653l.license(c18449lMo2065break, jM4551private);
                                        }
                                    } else {
                                        AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c6956l.m2147try(objM2132native);
                        }
                        i4 &= -3670017;
                        f4 = f3;
                        i12 = i6;
                        function2 = (Function1) objM2132native;
                    } else {
                        f4 = f3;
                        i12 = i6;
                    }
                } else {
                    if (i16 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    if ((i3 & 4) != 0) {
                        jPurchase = AbstractC15038l.purchase(c6956l, 26);
                        i4 &= -897;
                    } else {
                        jPurchase = j3;
                    }
                    if ((i3 & 8) != 0) {
                        jPurchase2 = AbstractC15038l.purchase(c6956l, 32);
                        i4 &= -7169;
                    } else {
                        jPurchase2 = j4;
                    }
                    if (i5 != 0) {
                        i6 = 1;
                    }
                    if (i8 != 0) {
                        f3 = 4.0f;
                    } else {
                        f3 = f;
                    }
                    if ((i3 & 64) != 0) {
                        if (((i4 & 896) ^ 384) <= 256) {
                        }
                        if ((i4 & 57344) == 16384) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = z7 | z2;
                        objM2132native = c6956l.m2132native();
                        if (z3) {
                            objM2132native = new Function1() { // from class: lؘٕؕ
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj4;
                                    float fMin = Math.min(interfaceC13349l.mo868instanceof(4.0f), Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)));
                                    float fMo868instanceof = interfaceC13349l.mo868instanceof(6.0f);
                                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) - fMin) / 2.0f;
                                    float f5 = fIntBitsToFloat > fMo868instanceof ? fMo868instanceof : fIntBitsToFloat;
                                    EnumC9931l layoutDirection = interfaceC13349l.getLayoutDirection();
                                    EnumC9931l enumC9931l = EnumC9931l.f20222l;
                                    long j9 = jPurchase;
                                    int i17 = i6;
                                    if (layoutDirection == enumC9931l) {
                                        long jMo2070l = interfaceC13349l.mo2070l();
                                        C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                                        long jM4551private = c18449lMo2065break.m4551private();
                                        c18449lMo2065break.m4555synchronized().mopub();
                                        try {
                                            ((C16543l) c18449lMo2065break.f36010l).isVip(-1.0f, 1.0f, jMo2070l);
                                            AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                        } finally {
                                            AbstractC0653l.license(c18449lMo2065break, jM4551private);
                                        }
                                    } else {
                                        AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c6956l.m2147try(objM2132native);
                        } else {
                            objM2132native = new Function1() { // from class: lؘٕؕ
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj4;
                                    float fMin = Math.min(interfaceC13349l.mo868instanceof(4.0f), Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)));
                                    float fMo868instanceof = interfaceC13349l.mo868instanceof(6.0f);
                                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) - fMin) / 2.0f;
                                    float f5 = fIntBitsToFloat > fMo868instanceof ? fMo868instanceof : fIntBitsToFloat;
                                    EnumC9931l layoutDirection = interfaceC13349l.getLayoutDirection();
                                    EnumC9931l enumC9931l = EnumC9931l.f20222l;
                                    long j9 = jPurchase;
                                    int i17 = i6;
                                    if (layoutDirection == enumC9931l) {
                                        long jMo2070l = interfaceC13349l.mo2070l();
                                        C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                                        long jM4551private = c18449lMo2065break.m4551private();
                                        c18449lMo2065break.m4555synchronized().mopub();
                                        try {
                                            ((C16543l) c18449lMo2065break.f36010l).isVip(-1.0f, 1.0f, jMo2070l);
                                            AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                        } finally {
                                            AbstractC0653l.license(c18449lMo2065break, jM4551private);
                                        }
                                    } else {
                                        AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c6956l.m2147try(objM2132native);
                        }
                        i4 &= -3670017;
                        f4 = f3;
                        i12 = i6;
                        function2 = (Function1) objM2132native;
                    } else {
                        f4 = f3;
                        i12 = i6;
                    }
                }
                c6956l.adcel();
                if ((i4 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objM2132native2 = c6956l.m2132native();
                if (z4) {
                    objM2132native2 = new C5583l(8, function0);
                    c6956l.m2147try(objM2132native2);
                } else {
                    objM2132native2 = new C5583l(8, function0);
                    c6956l.m2147try(objM2132native2);
                }
                function4 = (Function0) objM2132native2;
                InterfaceC17242l interfaceC17242lPremium3 = interfaceC17242l4.premium(AbstractC11767l.yandex);
                zBilling = c6956l.billing(function4);
                objM2132native3 = c6956l.m2132native();
                if (zBilling) {
                    objM2132native3 = new C6199l(11, function4);
                    c6956l.m2147try(objM2132native3);
                } else {
                    objM2132native3 = new C6199l(11, function4);
                    c6956l.m2147try(objM2132native3);
                }
                InterfaceC17242l interfaceC17242lFirebase3 = AbstractC0080l.firebase(AbstractC4962l.yandex(interfaceC17242lPremium3, true, (Function1) objM2132native3), 240.0f, 4.0f);
                if ((i4 & 57344) == 16384) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((458752 & i4) == 131072) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zBilling2 = z6 | z5 | c6956l.billing(function4) | ((((i4 & 7168) ^ 3072) <= 2048 && c6956l.purchase(jPurchase2)) || (i4 & 3072) == 2048) | ((((i4 & 896) ^ 384) <= 256 && c6956l.purchase(jPurchase)) || (i4 & 384) == 256) | ((((3670016 & i4) ^ 1572864) <= 1048576 && c6956l.billing(function2)) || (i4 & 1572864) == 1048576);
                objM2132native4 = c6956l.m2132native();
                if (zBilling2) {
                    j7 = jPurchase;
                    j8 = jPurchase2;
                    function5 = function2;
                    objM2132native4 = new Function1() { // from class: lٔۡؑ
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj4;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L));
                            int i17 = i12;
                            float fMo867final = f4;
                            if (i17 != 0 && Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) <= Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32))) {
                                fMo867final += interfaceC13349l.mo867final(fIntBitsToFloat);
                            }
                            float fMo867final2 = fMo867final / interfaceC13349l.mo867final(Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)));
                            float fFloatValue = ((Number) function4.invoke()).floatValue();
                            float fMin = Math.min(fFloatValue, fMo867final2) + fFloatValue;
                            if (fMin <= 1.0f) {
                                AbstractC4332l.billing(interfaceC13349l, fMin, 1.0f, j8, fIntBitsToFloat, i17);
                            }
                            AbstractC4332l.billing(interfaceC13349l, 0.0f, fFloatValue, j7, fIntBitsToFloat, i17);
                            function5.invoke(interfaceC13349l);
                            return Unit.INSTANCE;
                        }
                    };
                    c6956l.m2147try(objM2132native4);
                } else {
                    j7 = jPurchase;
                    j8 = jPurchase2;
                    function5 = function2;
                    objM2132native4 = new Function1() { // from class: lٔۡؑ
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj4;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L));
                            int i17 = i12;
                            float fMo867final = f4;
                            if (i17 != 0 && Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) <= Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32))) {
                                fMo867final += interfaceC13349l.mo867final(fIntBitsToFloat);
                            }
                            float fMo867final2 = fMo867final / interfaceC13349l.mo867final(Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)));
                            float fFloatValue = ((Number) function4.invoke()).floatValue();
                            float fMin = Math.min(fFloatValue, fMo867final2) + fFloatValue;
                            if (fMin <= 1.0f) {
                                AbstractC4332l.billing(interfaceC13349l, fMin, 1.0f, j8, fIntBitsToFloat, i17);
                            }
                            AbstractC4332l.billing(interfaceC13349l, 0.0f, fFloatValue, j7, fIntBitsToFloat, i17);
                            function5.invoke(interfaceC13349l);
                            return Unit.INSTANCE;
                        }
                    };
                    c6956l.m2147try(objM2132native4);
                }
                AbstractC12155l.yandex(interfaceC17242lFirebase3, (Function1) objM2132native4, c6956l, 0);
                interfaceC17242l3 = interfaceC17242l4;
                i10 = i12;
                f2 = f4;
                j6 = j8;
                j5 = j7;
                function3 = function5;
            } else {
                c6956l.m2124else();
                f2 = f;
                interfaceC17242l3 = interfaceC17242l2;
                i10 = i6;
                j5 = j3;
                j6 = j4;
                function3 = function2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lُٖۧ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        ((Integer) obj5).getClass();
                        AbstractC4332l.loadAd(function0, interfaceC17242l3, j5, j6, i10, f2, function3, (C6956l) obj4, AbstractC0545l.purchase(i2 | 1), i3);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i4 |= 24576;
        i6 = i;
        i8 = i3 & 32;
        if (i8 != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            if (c6956l.crashlytics(f)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i4 |= i9;
        }
        if ((i2 & 1572864) == 0) {
            function2 = function1;
            if ((i3 & 64) == 0) {
                i13 = 524288;
            } else {
                i13 = 524288;
            }
            i4 |= i13;
        } else {
            function2 = function1;
        }
        if ((i4 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (c6956l.m2127for(i4 & 1, z)) {
            c6956l.m2141switch();
            i11 = i2 & 1;
            Object obj4 = C1867l.yandex;
            if (i11 != 0) {
                if (i16 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                if ((i3 & 4) != 0) {
                    jPurchase = AbstractC15038l.purchase(c6956l, 26);
                    i4 &= -897;
                } else {
                    jPurchase = j3;
                }
                if ((i3 & 8) != 0) {
                    jPurchase2 = AbstractC15038l.purchase(c6956l, 32);
                    i4 &= -7169;
                } else {
                    jPurchase2 = j4;
                }
                if (i5 != 0) {
                    i6 = 1;
                }
                if (i8 != 0) {
                    f3 = 4.0f;
                } else {
                    f3 = f;
                }
                if ((i3 & 64) != 0) {
                    if (((i4 & 896) ^ 384) <= 256) {
                    }
                    if ((i4 & 57344) == 16384) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z7 | z2;
                    objM2132native = c6956l.m2132native();
                    if (z3) {
                        objM2132native = new Function1() { // from class: lؘٕؕ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj5;
                                float fMin = Math.min(interfaceC13349l.mo868instanceof(4.0f), Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)));
                                float fMo868instanceof = interfaceC13349l.mo868instanceof(6.0f);
                                float fIntBitsToFloat = (Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) - fMin) / 2.0f;
                                float f5 = fIntBitsToFloat > fMo868instanceof ? fMo868instanceof : fIntBitsToFloat;
                                EnumC9931l layoutDirection = interfaceC13349l.getLayoutDirection();
                                EnumC9931l enumC9931l = EnumC9931l.f20222l;
                                long j9 = jPurchase;
                                int i17 = i6;
                                if (layoutDirection == enumC9931l) {
                                    long jMo2070l = interfaceC13349l.mo2070l();
                                    C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                                    long jM4551private = c18449lMo2065break.m4551private();
                                    c18449lMo2065break.m4555synchronized().mopub();
                                    try {
                                        ((C16543l) c18449lMo2065break.f36010l).isVip(-1.0f, 1.0f, jMo2070l);
                                        AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                    } finally {
                                        AbstractC0653l.license(c18449lMo2065break, jM4551private);
                                    }
                                } else {
                                    AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l.m2147try(objM2132native);
                    } else {
                        objM2132native = new Function1() { // from class: lؘٕؕ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj5;
                                float fMin = Math.min(interfaceC13349l.mo868instanceof(4.0f), Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)));
                                float fMo868instanceof = interfaceC13349l.mo868instanceof(6.0f);
                                float fIntBitsToFloat = (Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) - fMin) / 2.0f;
                                float f5 = fIntBitsToFloat > fMo868instanceof ? fMo868instanceof : fIntBitsToFloat;
                                EnumC9931l layoutDirection = interfaceC13349l.getLayoutDirection();
                                EnumC9931l enumC9931l = EnumC9931l.f20222l;
                                long j9 = jPurchase;
                                int i17 = i6;
                                if (layoutDirection == enumC9931l) {
                                    long jMo2070l = interfaceC13349l.mo2070l();
                                    C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                                    long jM4551private = c18449lMo2065break.m4551private();
                                    c18449lMo2065break.m4555synchronized().mopub();
                                    try {
                                        ((C16543l) c18449lMo2065break.f36010l).isVip(-1.0f, 1.0f, jMo2070l);
                                        AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                    } finally {
                                        AbstractC0653l.license(c18449lMo2065break, jM4551private);
                                    }
                                } else {
                                    AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l.m2147try(objM2132native);
                    }
                    i4 &= -3670017;
                    f4 = f3;
                    i12 = i6;
                    function2 = (Function1) objM2132native;
                } else {
                    f4 = f3;
                    i12 = i6;
                }
            } else {
                if (i16 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                if ((i3 & 4) != 0) {
                    jPurchase = AbstractC15038l.purchase(c6956l, 26);
                    i4 &= -897;
                } else {
                    jPurchase = j3;
                }
                if ((i3 & 8) != 0) {
                    jPurchase2 = AbstractC15038l.purchase(c6956l, 32);
                    i4 &= -7169;
                } else {
                    jPurchase2 = j4;
                }
                if (i5 != 0) {
                    i6 = 1;
                }
                if (i8 != 0) {
                    f3 = 4.0f;
                } else {
                    f3 = f;
                }
                if ((i3 & 64) != 0) {
                    if (((i4 & 896) ^ 384) <= 256) {
                    }
                    if ((i4 & 57344) == 16384) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z7 | z2;
                    objM2132native = c6956l.m2132native();
                    if (z3) {
                        objM2132native = new Function1() { // from class: lؘٕؕ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj5;
                                float fMin = Math.min(interfaceC13349l.mo868instanceof(4.0f), Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)));
                                float fMo868instanceof = interfaceC13349l.mo868instanceof(6.0f);
                                float fIntBitsToFloat = (Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) - fMin) / 2.0f;
                                float f5 = fIntBitsToFloat > fMo868instanceof ? fMo868instanceof : fIntBitsToFloat;
                                EnumC9931l layoutDirection = interfaceC13349l.getLayoutDirection();
                                EnumC9931l enumC9931l = EnumC9931l.f20222l;
                                long j9 = jPurchase;
                                int i17 = i6;
                                if (layoutDirection == enumC9931l) {
                                    long jMo2070l = interfaceC13349l.mo2070l();
                                    C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                                    long jM4551private = c18449lMo2065break.m4551private();
                                    c18449lMo2065break.m4555synchronized().mopub();
                                    try {
                                        ((C16543l) c18449lMo2065break.f36010l).isVip(-1.0f, 1.0f, jMo2070l);
                                        AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                    } finally {
                                        AbstractC0653l.license(c18449lMo2065break, jM4551private);
                                    }
                                } else {
                                    AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l.m2147try(objM2132native);
                    } else {
                        objM2132native = new Function1() { // from class: lؘٕؕ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj5;
                                float fMin = Math.min(interfaceC13349l.mo868instanceof(4.0f), Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)));
                                float fMo868instanceof = interfaceC13349l.mo868instanceof(6.0f);
                                float fIntBitsToFloat = (Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) - fMin) / 2.0f;
                                float f5 = fIntBitsToFloat > fMo868instanceof ? fMo868instanceof : fIntBitsToFloat;
                                EnumC9931l layoutDirection = interfaceC13349l.getLayoutDirection();
                                EnumC9931l enumC9931l = EnumC9931l.f20222l;
                                long j9 = jPurchase;
                                int i17 = i6;
                                if (layoutDirection == enumC9931l) {
                                    long jMo2070l = interfaceC13349l.mo2070l();
                                    C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                                    long jM4551private = c18449lMo2065break.m4551private();
                                    c18449lMo2065break.m4555synchronized().mopub();
                                    try {
                                        ((C16543l) c18449lMo2065break.f36010l).isVip(-1.0f, 1.0f, jMo2070l);
                                        AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                    } finally {
                                        AbstractC0653l.license(c18449lMo2065break, jM4551private);
                                    }
                                } else {
                                    AbstractC12272l.loadAd(interfaceC13349l, i17, j9, fMin, f5);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l.m2147try(objM2132native);
                    }
                    i4 &= -3670017;
                    f4 = f3;
                    i12 = i6;
                    function2 = (Function1) objM2132native;
                } else {
                    f4 = f3;
                    i12 = i6;
                }
            }
            c6956l.adcel();
            if ((i4 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            objM2132native2 = c6956l.m2132native();
            if (z4) {
                objM2132native2 = new C5583l(8, function0);
                c6956l.m2147try(objM2132native2);
            } else {
                objM2132native2 = new C5583l(8, function0);
                c6956l.m2147try(objM2132native2);
            }
            function4 = (Function0) objM2132native2;
            InterfaceC17242l interfaceC17242lPremium4 = interfaceC17242l4.premium(AbstractC11767l.yandex);
            zBilling = c6956l.billing(function4);
            objM2132native3 = c6956l.m2132native();
            if (zBilling) {
                objM2132native3 = new C6199l(11, function4);
                c6956l.m2147try(objM2132native3);
            } else {
                objM2132native3 = new C6199l(11, function4);
                c6956l.m2147try(objM2132native3);
            }
            InterfaceC17242l interfaceC17242lFirebase4 = AbstractC0080l.firebase(AbstractC4962l.yandex(interfaceC17242lPremium4, true, (Function1) objM2132native3), 240.0f, 4.0f);
            if ((i4 & 57344) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((458752 & i4) == 131072) {
                z6 = true;
            } else {
                z6 = false;
            }
            zBilling2 = z6 | z5 | c6956l.billing(function4) | ((((i4 & 7168) ^ 3072) <= 2048 && c6956l.purchase(jPurchase2)) || (i4 & 3072) == 2048) | ((((i4 & 896) ^ 384) <= 256 && c6956l.purchase(jPurchase)) || (i4 & 384) == 256) | ((((3670016 & i4) ^ 1572864) <= 1048576 && c6956l.billing(function2)) || (i4 & 1572864) == 1048576);
            objM2132native4 = c6956l.m2132native();
            if (zBilling2) {
                j7 = jPurchase;
                j8 = jPurchase2;
                function5 = function2;
                objM2132native4 = new Function1() { // from class: lٔۡؑ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj5;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L));
                        int i17 = i12;
                        float fMo867final = f4;
                        if (i17 != 0 && Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) <= Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32))) {
                            fMo867final += interfaceC13349l.mo867final(fIntBitsToFloat);
                        }
                        float fMo867final2 = fMo867final / interfaceC13349l.mo867final(Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)));
                        float fFloatValue = ((Number) function4.invoke()).floatValue();
                        float fMin = Math.min(fFloatValue, fMo867final2) + fFloatValue;
                        if (fMin <= 1.0f) {
                            AbstractC4332l.billing(interfaceC13349l, fMin, 1.0f, j8, fIntBitsToFloat, i17);
                        }
                        AbstractC4332l.billing(interfaceC13349l, 0.0f, fFloatValue, j7, fIntBitsToFloat, i17);
                        function5.invoke(interfaceC13349l);
                        return Unit.INSTANCE;
                    }
                };
                c6956l.m2147try(objM2132native4);
            } else {
                j7 = jPurchase;
                j8 = jPurchase2;
                function5 = function2;
                objM2132native4 = new Function1() { // from class: lٔۡؑ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj5;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L));
                        int i17 = i12;
                        float fMo867final = f4;
                        if (i17 != 0 && Float.intBitsToFloat((int) (4294967295L & interfaceC13349l.admob())) <= Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32))) {
                            fMo867final += interfaceC13349l.mo867final(fIntBitsToFloat);
                        }
                        float fMo867final2 = fMo867final / interfaceC13349l.mo867final(Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)));
                        float fFloatValue = ((Number) function4.invoke()).floatValue();
                        float fMin = Math.min(fFloatValue, fMo867final2) + fFloatValue;
                        if (fMin <= 1.0f) {
                            AbstractC4332l.billing(interfaceC13349l, fMin, 1.0f, j8, fIntBitsToFloat, i17);
                        }
                        AbstractC4332l.billing(interfaceC13349l, 0.0f, fFloatValue, j7, fIntBitsToFloat, i17);
                        function5.invoke(interfaceC13349l);
                        return Unit.INSTANCE;
                    }
                };
                c6956l.m2147try(objM2132native4);
            }
            AbstractC12155l.yandex(interfaceC17242lFirebase4, (Function1) objM2132native4, c6956l, 0);
            interfaceC17242l3 = interfaceC17242l4;
            i10 = i12;
            f2 = f4;
            j6 = j8;
            j5 = j7;
            function3 = function5;
        } else {
            c6956l.m2124else();
            f2 = f;
            interfaceC17242l3 = interfaceC17242l2;
            i10 = i6;
            j5 = j3;
            j6 = j4;
            function3 = function2;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lُٖۧ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    AbstractC4332l.loadAd(function0, interfaceC17242l3, j5, j6, i10, f2, function3, (C6956l) obj5, AbstractC0545l.purchase(i2 | 1), i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void purchase(InterfaceC13349l interfaceC13349l, float f, float f2, long j, C0404l c0404l) {
        float f3 = c0404l.yandex / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)) - (2.0f * f3);
        interfaceC13349l.applovin(j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (768 & 64) != 0 ? 1.0f : 0.0f, c0404l);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x019d  */
    /* JADX WARN: Code duplicated, block: B:58:0x019f  */
    /* JADX WARN: Code duplicated, block: B:73:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x0203  */
    /* JADX WARN: Code duplicated, block: B:78:0x0216  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void yandex(InterfaceC17242l interfaceC17242l, long j, float f, long j2, int i, float f2, C6956l c6956l, final int i2, final int i3) {
        InterfaceC17242l interfaceC17242l2;
        int i4;
        float f3;
        int i5;
        boolean z;
        final long j3;
        final InterfaceC17242l interfaceC17242l3;
        final long j4;
        final float f4;
        final int i6;
        final float f5;
        C4224l c4224lAds;
        long j5;
        int i7;
        final float f6;
        final int i8;
        final C0404l c0404l;
        final float f7;
        final C8456l c8456lYandex;
        final C8456l c8456lYandex2;
        final C8456l c8456lYandex3;
        boolean z2;
        boolean zBilling;
        Object objM2132native;
        final long j6;
        final long j7;
        c6956l.m2133new(333154241);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            interfaceC17242l2 = interfaceC17242l;
        } else if ((i2 & 6) == 0) {
            interfaceC17242l2 = interfaceC17242l;
            i4 = (c6956l.billing(interfaceC17242l2) ? 4 : 2) | i2;
        } else {
            interfaceC17242l2 = interfaceC17242l;
            i4 = i2;
        }
        long jPurchase = j;
        int i10 = i4 | (((i3 & 2) == 0 && c6956l.purchase(jPurchase)) ? 32 : 16);
        int i11 = i3 & 4;
        if (i11 == 0) {
            if ((i2 & 384) == 0) {
                f3 = f;
                i10 |= c6956l.crashlytics(f3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i5 = i10 | 222208;
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (c6956l.m2127for(i5 & 1, z)) {
                c6956l.m2141switch();
                if ((i2 & 1) != 0 || c6956l.ad()) {
                    if (i9 != 0) {
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        interfaceC17242l3 = interfaceC17242l2;
                    }
                    if ((i3 & 2) != 0) {
                        jPurchase = AbstractC15038l.purchase(c6956l, 26);
                        i5 &= -113;
                    }
                    if (i11 != 0) {
                        f3 = 4.0f;
                    }
                    j5 = C9735l.isPro;
                    i7 = i5 & (-7169);
                    f6 = 4.0f;
                    i8 = 1;
                } else {
                    c6956l.m2124else();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    j5 = j2;
                    i8 = i;
                    f6 = f2;
                    i7 = i5 & (-7169);
                    interfaceC17242l3 = interfaceC17242l2;
                }
                c6956l.adcel();
                c0404l = new C0404l(((InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob)).mo868instanceof(f3), 0.0f, i8, 0, null, 26);
                C13138l c13138lBilling = AbstractC3586l.billing(c6956l, 1);
                f7 = f3;
                c8456lYandex = AbstractC3586l.yandex(c13138lBilling, 0.0f, 1080.0f, AbstractC0532l.purchase(AbstractC0532l.subs(6000, 2, AbstractC5341l.amazon), 0, 0L, 6), null, c6956l, 4536, 8);
                c8456lYandex2 = AbstractC3586l.yandex(c13138lBilling, 0.0f, 360.0f, AbstractC0532l.purchase(AbstractC0532l.billing(new C9673l(9)), 0, 0L, 6), null, c6956l, 4536, 8);
                C10942l c10942l = new C10942l();
                c10942l.yandex = 6000;
                c10942l.yandex(Float.valueOf(0.87f), 3000).loadAd = loadAd;
                c10942l.yandex(Float.valueOf(0.1f), 6000);
                Unit unit = Unit.INSTANCE;
                c8456lYandex3 = AbstractC3586l.yandex(c13138lBilling, 0.1f, 0.87f, AbstractC0532l.purchase(new C13591l(c10942l), 0, 0L, 6), null, c6956l, 4536, 8);
                InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(AbstractC15185l.loadAd(interfaceC17242l3), 40.0f);
                boolean zBilling2 = c6956l.billing(c8456lYandex3);
                if ((i7 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zBilling = zBilling2 | z2 | c6956l.billing(c8456lYandex) | c6956l.billing(c8456lYandex2) | c6956l.purchase(j5) | c6956l.admob(c0404l) | ((((i7 & 112) ^ 48) <= 32 && c6956l.purchase(jPurchase)) || (i7 & 48) == 32);
                objM2132native = c6956l.m2132native();
                if (!zBilling || objM2132native == C1867l.yandex) {
                    j6 = jPurchase;
                    j7 = j5;
                    objM2132native = new Function1() { // from class: lَٕٜ
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            long j8 = j7;
                            C0404l c0404l2 = c0404l;
                            long j9 = j6;
                            InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                            float fFloatValue = ((Number) c8456lYandex3.getValue()).floatValue() * 360.0f;
                            int i12 = i8;
                            float f8 = f6;
                            if (i12 != 0 && Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32))) {
                                f8 += f7;
                            }
                            float fMo867final = (f8 / ((float) (((double) interfaceC13349l.mo867final(Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)))) * 3.141592653589793d))) * 360.0f;
                            float fFloatValue2 = ((Number) c8456lYandex2.getValue()).floatValue() + ((Number) c8456lYandex.getValue()).floatValue();
                            long jMo2070l = interfaceC13349l.mo2070l();
                            C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                            long jM4551private = c18449lMo2065break.m4551private();
                            c18449lMo2065break.m4555synchronized().mopub();
                            try {
                                ((C16543l) c18449lMo2065break.f36010l).advert(fFloatValue2, jMo2070l);
                                AbstractC4332l.purchase(interfaceC13349l, Math.min(fFloatValue, fMo867final) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo867final) * 2.0f), j8, c0404l2);
                                AbstractC4332l.purchase(interfaceC13349l, 0.0f, fFloatValue, j9, c0404l2);
                                return Unit.INSTANCE;
                            } finally {
                                AbstractC0653l.license(c18449lMo2065break, jM4551private);
                            }
                        }
                    };
                    c6956l.m2147try(objM2132native);
                } else {
                    j6 = jPurchase;
                    j7 = j5;
                }
                AbstractC12155l.yandex(interfaceC17242lIsPro, (Function1) objM2132native, c6956l, 0);
                i6 = i8;
                f5 = f6;
                f4 = f7;
                j3 = j7;
                j4 = j6;
            } else {
                c6956l.m2124else();
                j3 = j2;
                interfaceC17242l3 = interfaceC17242l2;
                j4 = jPurchase;
                f4 = f3;
                i6 = i;
                f5 = f2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lٖٖؓ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC4332l.yandex(interfaceC17242l3, j4, f4, j3, i6, f5, (C6956l) obj, AbstractC0545l.purchase(i2 | 1), i3);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i10 |= 384;
        f3 = f;
        i5 = i10 | 222208;
        if ((74899 & i5) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (c6956l.m2127for(i5 & 1, z)) {
            c6956l.m2141switch();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    interfaceC17242l3 = C4346l.f8873l;
                } else {
                    interfaceC17242l3 = interfaceC17242l2;
                }
                if ((i3 & 2) != 0) {
                    jPurchase = AbstractC15038l.purchase(c6956l, 26);
                    i5 &= -113;
                }
                if (i11 != 0) {
                    f3 = 4.0f;
                }
                j5 = C9735l.isPro;
                i7 = i5 & (-7169);
                f6 = 4.0f;
                i8 = 1;
            } else {
                if (i9 != 0) {
                    interfaceC17242l3 = C4346l.f8873l;
                } else {
                    interfaceC17242l3 = interfaceC17242l2;
                }
                if ((i3 & 2) != 0) {
                    jPurchase = AbstractC15038l.purchase(c6956l, 26);
                    i5 &= -113;
                }
                if (i11 != 0) {
                    f3 = 4.0f;
                }
                j5 = C9735l.isPro;
                i7 = i5 & (-7169);
                f6 = 4.0f;
                i8 = 1;
            }
            c6956l.adcel();
            c0404l = new C0404l(((InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob)).mo868instanceof(f3), 0.0f, i8, 0, null, 26);
            C13138l c13138lBilling2 = AbstractC3586l.billing(c6956l, 1);
            f7 = f3;
            c8456lYandex = AbstractC3586l.yandex(c13138lBilling2, 0.0f, 1080.0f, AbstractC0532l.purchase(AbstractC0532l.subs(6000, 2, AbstractC5341l.amazon), 0, 0L, 6), null, c6956l, 4536, 8);
            c8456lYandex2 = AbstractC3586l.yandex(c13138lBilling2, 0.0f, 360.0f, AbstractC0532l.purchase(AbstractC0532l.billing(new C9673l(9)), 0, 0L, 6), null, c6956l, 4536, 8);
            C10942l c10942l2 = new C10942l();
            c10942l2.yandex = 6000;
            c10942l2.yandex(Float.valueOf(0.87f), 3000).loadAd = loadAd;
            c10942l2.yandex(Float.valueOf(0.1f), 6000);
            Unit unit2 = Unit.INSTANCE;
            c8456lYandex3 = AbstractC3586l.yandex(c13138lBilling2, 0.1f, 0.87f, AbstractC0532l.purchase(new C13591l(c10942l2), 0, 0L, 6), null, c6956l, 4536, 8);
            InterfaceC17242l interfaceC17242lIsPro2 = AbstractC0080l.isPro(AbstractC15185l.loadAd(interfaceC17242l3), 40.0f);
            boolean zBilling3 = c6956l.billing(c8456lYandex3);
            if ((i7 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            zBilling = zBilling3 | z2 | c6956l.billing(c8456lYandex) | c6956l.billing(c8456lYandex2) | c6956l.purchase(j5) | c6956l.admob(c0404l) | ((((i7 & 112) ^ 48) <= 32 && c6956l.purchase(jPurchase)) || (i7 & 48) == 32);
            objM2132native = c6956l.m2132native();
            if (zBilling) {
                j6 = jPurchase;
                j7 = j5;
                objM2132native = new Function1() { // from class: lَٕٜ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        long j8 = j7;
                        C0404l c0404l2 = c0404l;
                        long j9 = j6;
                        InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                        float fFloatValue = ((Number) c8456lYandex3.getValue()).floatValue() * 360.0f;
                        int i12 = i8;
                        float f8 = f6;
                        if (i12 != 0 && Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32))) {
                            f8 += f7;
                        }
                        float fMo867final = (f8 / ((float) (((double) interfaceC13349l.mo867final(Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) c8456lYandex2.getValue()).floatValue() + ((Number) c8456lYandex.getValue()).floatValue();
                        long jMo2070l = interfaceC13349l.mo2070l();
                        C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                        long jM4551private = c18449lMo2065break.m4551private();
                        c18449lMo2065break.m4555synchronized().mopub();
                        try {
                            ((C16543l) c18449lMo2065break.f36010l).advert(fFloatValue2, jMo2070l);
                            AbstractC4332l.purchase(interfaceC13349l, Math.min(fFloatValue, fMo867final) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo867final) * 2.0f), j8, c0404l2);
                            AbstractC4332l.purchase(interfaceC13349l, 0.0f, fFloatValue, j9, c0404l2);
                            return Unit.INSTANCE;
                        } finally {
                            AbstractC0653l.license(c18449lMo2065break, jM4551private);
                        }
                    }
                };
                c6956l.m2147try(objM2132native);
            } else {
                j6 = jPurchase;
                j7 = j5;
                objM2132native = new Function1() { // from class: lَٕٜ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        long j8 = j7;
                        C0404l c0404l2 = c0404l;
                        long j9 = j6;
                        InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                        float fFloatValue = ((Number) c8456lYandex3.getValue()).floatValue() * 360.0f;
                        int i12 = i8;
                        float f8 = f6;
                        if (i12 != 0 && Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32))) {
                            f8 += f7;
                        }
                        float fMo867final = (f8 / ((float) (((double) interfaceC13349l.mo867final(Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) c8456lYandex2.getValue()).floatValue() + ((Number) c8456lYandex.getValue()).floatValue();
                        long jMo2070l = interfaceC13349l.mo2070l();
                        C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                        long jM4551private = c18449lMo2065break.m4551private();
                        c18449lMo2065break.m4555synchronized().mopub();
                        try {
                            ((C16543l) c18449lMo2065break.f36010l).advert(fFloatValue2, jMo2070l);
                            AbstractC4332l.purchase(interfaceC13349l, Math.min(fFloatValue, fMo867final) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo867final) * 2.0f), j8, c0404l2);
                            AbstractC4332l.purchase(interfaceC13349l, 0.0f, fFloatValue, j9, c0404l2);
                            return Unit.INSTANCE;
                        } finally {
                            AbstractC0653l.license(c18449lMo2065break, jM4551private);
                        }
                    }
                };
                c6956l.m2147try(objM2132native);
            }
            AbstractC12155l.yandex(interfaceC17242lIsPro2, (Function1) objM2132native, c6956l, 0);
            i6 = i8;
            f5 = f6;
            f4 = f7;
            j3 = j7;
            j4 = j6;
        } else {
            c6956l.m2124else();
            j3 = j2;
            interfaceC17242l3 = interfaceC17242l2;
            j4 = jPurchase;
            f4 = f3;
            i6 = i;
            f5 = f2;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٖٖؓ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC4332l.yandex(interfaceC17242l3, j4, f4, j3, i6, f5, (C6956l) obj, AbstractC0545l.purchase(i2 | 1), i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
